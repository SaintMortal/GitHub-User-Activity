# GitHub User Activity

<p align="center">
  <img src="https://img.shields.io/badge/Status-Finished-success?style=for-the-badge&logo=none" alt="Status">
  <img src="https://img.shields.io/badge/Language-Python-blue?style=for-the-badge&logo=python" alt="Language">
  <img src="https://img.shields.io/badge/License-MIT-green?style=for-the-badge&logo=none" alt="License">
</p>

<p align="center">
  <b>A command-line tool to fetch and display recent public activity of any GitHub user using the GitHub REST API.</b>
</p>

---

## 📖 About

**GitHub User Activity** is a simple yet powerful CLI utility that allows you to inspect what a specific GitHub user has been up to recently. It connects directly to the public GitHub API to fetch real-time event data and presents it in a clean, readable format directly in your terminal.

This project is a great exercise in working with REST APIs, handling JSON data, and building practical command-line tools.

---

## ✨ Features

* **Real-time Data:** Fetches the latest public events for any valid GitHub username.
* **Event Support:** Displays various types of GitHub activities, such as:
  * Pushes to repositories (`PushEvent`)
  * Creating new repositories or branches (`CreateEvent`)
  * Opening issues and pull requests (`IssuesEvent`, `PullRequestEvent`)
  * Adding comments and stars (`WatchEvent`, `IssueCommentEvent`)
* **Clean CLI Output:** Formats raw JSON responses into a human-readable activity feed.

---

## 🚀 Getting Started

### Prerequisites

Make sure you have Python installed on your system.

### Installation

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/SaintMortal/GitHub-User-Activity.git](https://github.com/SaintMortal/GitHub-User-Activity.git)
   cd GitHub-User-Activity
This CLI programm using GitHub API for showing users activity in terminal
https://roadmap.sh/projects/github-user-activity
