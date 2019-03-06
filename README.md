# The NJO app for trash talking

This is the full project.

The server folder contains the Spring Boot application and the client folder contains the Angular application.

## General git flow

If you are new to git I would recommend downloading the Github Desktop for Windows. Once that is downloaded, you can clone this repository (choose the "open with Desktop" option). If you want to make pull requests, then you will have to Fork it instead.

It should open up your Github Desktop client and it will begin cloning the repo. Once it is finished, then ta-da that is your local repository (which you just cloned from the "remote" repository). Any changes you make while in that local repository will be tracked by git. **Before you start making any changes however you should create a new branch**.

In the upper middle of the client you will see the current branch you are on (master). Never commit directly to master. Click this option and create new branch; name it in relation to what type of changes you are making. For example, say you want to add a "Customer" class in the Spring Boot application to add it as a table in the database. You could name your branch: add-customer-class.

Once you have checked out this branch, you can start making your changes. You will see all of your changes will be stashed in the client. **This does not mean your changes are permanently saved**. In order to save your progress, you have to hit the "Commit" option in the lower left. Provide an apt summary title (the description is optional). It is recommended you commit often so you don't lose your progress.

Now let's say you are done with your changes. Commit any leftover changes you have. Then publish your branch (the client should give you this option in the upper right). Once the branch is published, it will be visible in the remote repo; anyone can check out your branch and work off from it.

Now you can make a pull request (PR). In the client menu at the top, go to Branch, then select Create Pull Request (or hit ctrl + r). This will open up a tab in your browser to the steps in creating the PR. Then it just has to be approved and merged by the reviewer.
