import requests
import csv

def get_all_pages(url):
    all_data = []
    page = 1
    while True:
        response = requests.get(url + f"&page={page}")
        if response.status_code == 200:
            data = response.json()
            if not data['items']:
                break
            all_data.extend(data['items'])
            page += 1
        else:
            break
    return all_data

def save_to_csv(data, filename):
    with open(filename, 'w', newline='', encoding='utf-8') as csvfile:
        fieldnames = ["Name", "Owner", "URL", "Description"]
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
        
        writer.writeheader()
        for repo in data:
            writer.writerow({
                "Name": repo['name'],
                "Owner": repo['owner']['login'],
                "URL": repo['html_url'],
                "Description": repo['description']
            })

def main():
    url = "https://api.github.com/search/repositories?q=unifacisa"
    github_data = get_all_pages(url)
    
    if github_data:
        save_to_csv(github_data, 'github_repositories.csv')
        print(f"Data saved to github_repositories.csv. Total repositories: {len(github_data)}")
    else:
        print("Failed to retrieve data from GitHub API")

if __name__ == "__main__":
    main()