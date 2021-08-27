package com.proway.gitrepoapp.model

import com.google.gson.annotations.SerializedName

data class RepoPullRequestResponse (
        @SerializedName("url")
        val urlOfPr: String,
        @SerializedName("id")
        val idOfThePr: String,
        @SerializedName("html_url")
        val htmlUrl: String,
        @SerializedName("number")
        val numberOfThePr: Int,
        @SerializedName("state")
        val stateOfThePr: String,
        @SerializedName("title")
        val titleOfThePr: String,


        )
data class UserPfThePr(

)
{


    "user": {
    "login": "ghost",
    "id": 10137,
    "node_id": "MDQ6VXNlcjEwMTM3",
    "avatar_url": "https://avatars.githubusercontent.com/u/10137?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/ghost",
    "html_url": "https://github.com/ghost",
    "followers_url": "https://api.github.com/users/ghost/followers",
    "following_url": "https://api.github.com/users/ghost/following{/other_user}",
    "gists_url": "https://api.github.com/users/ghost/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/ghost/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/ghost/subscriptions",
    "organizations_url": "https://api.github.com/users/ghost/orgs",
    "repos_url": "https://api.github.com/users/ghost/repos",
    "events_url": "https://api.github.com/users/ghost/events{/privacy}",
    "received_events_url": "https://api.github.com/users/ghost/received_events",
    "type": "User",
    "site_admin": false
},
    "body": "",
    "created_at": "2020-10-01T03:55:31Z",
    "updated_at": "2020-10-01T03:55:31Z",
    "closed_at": null,
    "merged_at": null,
    "merge_commit_sha": "66b7fb4dc79476d9f638daa856dc93294fd4d439",
    "assignee": null,
    "assignees": [],
    "requested_reviewers": [],
    "requested_teams": [],
    "labels": [],
    "milestone": null,
    "draft": false,
    "commits_url": "https://api.github.com/repos/mojombo/grit/pulls/270/commits",
    "review_comments_url": "https://api.github.com/repos/mojombo/grit/pulls/270/comments",
    "review_comment_url": "https://api.github.com/repos/mojombo/grit/pulls/comments{/number}",
    "comments_url": "https://api.github.com/repos/mojombo/grit/issues/270/comments",
    "statuses_url": "https://api.github.com/repos/mojombo/grit/statuses/025e0942a1875377b2e61fc72784acff3999fe5d",
    "head": {
    "label": null,
    "ref": "master",
    "sha": "025e0942a1875377b2e61fc72784acff3999fe5d",
    "user": null,
    "repo": null
},
    "base": {
    "label": "mojombo:master",
    "ref": "master",
    "sha": "5608567286e64a1c55c5e7fcd415364e04f8986e",
    "user": {
        "login": "mojombo",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://avatars.githubusercontent.com/u/1?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/mojombo",
        "html_url": "https://github.com/mojombo",
        "followers_url": "https://api.github.com/users/mojombo/followers",
        "following_url": "https://api.github.com/users/mojombo/following{/other_user}",
        "gists_url": "https://api.github.com/users/mojombo/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/mojombo/subscriptions",
        "organizations_url": "https://api.github.com/users/mojombo/orgs",
        "repos_url": "https://api.github.com/users/mojombo/repos",
        "events_url": "https://api.github.com/users/mojombo/events{/privacy}",
        "received_events_url": "https://api.github.com/users/mojombo/received_events",
        "type": "User",
        "site_admin": false
    },
    "repo": {
        "id": 1,
        "node_id": "MDEwOlJlcG9zaXRvcnkx",
        "name": "grit",
        "full_name": "mojombo/grit",
        "private": false,
        "owner": {
        "login": "mojombo",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://avatars.githubusercontent.com/u/1?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/mojombo",
        "html_url": "https://github.com/mojombo",
        "followers_url": "https://api.github.com/users/mojombo/followers",
        "following_url": "https://api.github.com/users/mojombo/following{/other_user}",
        "gists_url": "https://api.github.com/users/mojombo/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/mojombo/subscriptions",
        "organizations_url": "https://api.github.com/users/mojombo/orgs",
        "repos_url": "https://api.github.com/users/mojombo/repos",
        "events_url": "https://api.github.com/users/mojombo/events{/privacy}",
        "received_events_url": "https://api.github.com/users/mojombo/received_events",
        "type": "User",
        "site_admin": false
    },
        "html_url": "https://github.com/mojombo/grit",
        "description": "**Grit is no longer maintained. Check out libgit2/rugged.** Grit gives you object oriented read/write access to Git repositories via Ruby.",
        "fork": false,
        "url": "https://api.github.com/repos/mojombo/grit",
        "forks_url": "https://api.github.com/repos/mojombo/grit/forks",
        "keys_url": "https://api.github.com/repos/mojombo/grit/keys{/key_id}",
        "collaborators_url": "https://api.github.com/repos/mojombo/grit/collaborators{/collaborator}",
        "teams_url": "https://api.github.com/repos/mojombo/grit/teams",
        "hooks_url": "https://api.github.com/repos/mojombo/grit/hooks",
        "issue_events_url": "https://api.github.com/repos/mojombo/grit/issues/events{/number}",
        "events_url": "https://api.github.com/repos/mojombo/grit/events",
        "assignees_url": "https://api.github.com/repos/mojombo/grit/assignees{/user}",
        "branches_url": "https://api.github.com/repos/mojombo/grit/branches{/branch}",
        "tags_url": "https://api.github.com/repos/mojombo/grit/tags",
        "blobs_url": "https://api.github.com/repos/mojombo/grit/git/blobs{/sha}",
        "git_tags_url": "https://api.github.com/repos/mojombo/grit/git/tags{/sha}",
        "git_refs_url": "https://api.github.com/repos/mojombo/grit/git/refs{/sha}",
        "trees_url": "https://api.github.com/repos/mojombo/grit/git/trees{/sha}",
        "statuses_url": "https://api.github.com/repos/mojombo/grit/statuses/{sha}",
        "languages_url": "https://api.github.com/repos/mojombo/grit/languages",
        "stargazers_url": "https://api.github.com/repos/mojombo/grit/stargazers",
        "contributors_url": "https://api.github.com/repos/mojombo/grit/contributors",
        "subscribers_url": "https://api.github.com/repos/mojombo/grit/subscribers",
        "subscription_url": "https://api.github.com/repos/mojombo/grit/subscription",
        "commits_url": "https://api.github.com/repos/mojombo/grit/commits{/sha}",
        "git_commits_url": "https://api.github.com/repos/mojombo/grit/git/commits{/sha}",
        "comments_url": "https://api.github.com/repos/mojombo/grit/comments{/number}",
        "issue_comment_url": "https://api.github.com/repos/mojombo/grit/issues/comments{/number}",
        "contents_url": "https://api.github.com/repos/mojombo/grit/contents/{+path}",
        "compare_url": "https://api.github.com/repos/mojombo/grit/compare/{base}...{head}",
        "merges_url": "https://api.github.com/repos/mojombo/grit/merges",
        "archive_url": "https://api.github.com/repos/mojombo/grit/{archive_format}{/ref}",
        "downloads_url": "https://api.github.com/repos/mojombo/grit/downloads",
        "issues_url": "https://api.github.com/repos/mojombo/grit/issues{/number}",
        "pulls_url": "https://api.github.com/repos/mojombo/grit/pulls{/number}",
        "milestones_url": "https://api.github.com/repos/mojombo/grit/milestones{/number}",
        "notifications_url": "https://api.github.com/repos/mojombo/grit/notifications{?since,all,participating}",
        "labels_url": "https://api.github.com/repos/mojombo/grit/labels{/name}",
        "releases_url": "https://api.github.com/repos/mojombo/grit/releases{/id}",
        "deployments_url": "https://api.github.com/repos/mojombo/grit/deployments",
        "created_at": "2007-10-29T14:37:16Z",
        "updated_at": "2021-08-26T21:39:12Z",
        "pushed_at": "2020-10-01T03:55:32Z",
        "git_url": "git://github.com/mojombo/grit.git",
        "ssh_url": "git@github.com:mojombo/grit.git",
        "clone_url": "https://github.com/mojombo/grit.git",
        "svn_url": "https://github.com/mojombo/grit",
        "homepage": "http://grit.rubyforge.org/",
        "size": 7954,
        "stargazers_count": 1929,
        "watchers_count": 1929,
        "language": "Ruby",
        "has_issues": true,
        "has_projects": true,
        "has_downloads": true,
        "has_wiki": true,
        "has_pages": false,
        "forks_count": 534,
        "mirror_url": null,
        "archived": false,
        "disabled": false,
        "open_issues_count": 27,
        "license": {
        "key": "mit",
        "name": "MIT License",
        "spdx_id": "MIT",
        "url": "https://api.github.com/licenses/mit",
        "node_id": "MDc6TGljZW5zZTEz"
    },
        "forks": 534,
        "open_issues": 27,
        "watchers": 1929,
        "default_branch": "master"
    }
},
    "_links": {
    "self": {
        "href": "https://api.github.com/repos/mojombo/grit/pulls/270"
    },
    "html": {
        "href": "https://github.com/mojombo/grit/pull/270"
    },
    "issue": {
        "href": "https://api.github.com/repos/mojombo/grit/issues/270"
    },
    "comments": {
        "href": "https://api.github.com/repos/mojombo/grit/issues/270/comments"
    },
    "review_comments": {
        "href": "https://api.github.com/repos/mojombo/grit/pulls/270/comments"
    },
    "review_comment": {
        "href": "https://api.github.com/repos/mojombo/grit/pulls/comments{/number}"
    },
    "commits": {
        "href": "https://api.github.com/repos/mojombo/grit/pulls/270/commits"
    },
    "statuses": {
        "href": "https://api.github.com/repos/mojombo/grit/statuses/025e0942a1875377b2e61fc72784acff3999fe5d"
    }
},
    "author_association": "NONE",
    "auto_merge": null,
    "active_lock_reason": null
},
