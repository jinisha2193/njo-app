# The NJO app for trash talking

This is the full project.

The server folder contains the Spring Boot application and the client folder contains the Angular application.

## Developing the Spring Boot application

If you are not familiar with Spring Boot, I would recommend starting with this free tutorial on youtube:

https://www.youtube.com/watch?v=msXL2oDexqw&list=PLmbC-xnvykcghOSOJ1ZF6ja3aOgZAgaMO

Start IntelliJ and open the "server" folder. IntelliJ should install all the needed dependencies automatically (you may have to click the "Import Changes" option in the pop-up window that shows up - you can configure the settings to auto-install for Maven dependencies). 

#### Edit the application.properties configuration

Currently, the configuration looks like this:

```
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://{endpoint}:3306/{dbname}
spring.datasource.username=user
spring.datasource.password=password
server.port=5000
```

This is where we would connect to the database. On production, I am using an AWS RDS instance, so the credentials have been scrubbed here. Since you will have your own local MySQL server for development, provide the appropriate credentials here. The endpoint should be localhost and the dbname is whatever database you want to use from your local server (you will probably have to create one). You can configure the port to whatever port you want to use, however if you plan to make a PR then it should stay at 5000 for the AWS EB instance to work.

If you do not have MySQL, download from here:

https://dev.mysql.com/downloads/windows/installer/8.0.html

Choose to install the web-community (smaller) one if you are connected to the internet. The next page will ask you to sign in with an Oracle account; scroll down to skip this and click the download link. Follow the installation wizard.

Login and connect to your database. Create new schema. This is your new database that you will use as the "dbname" in the datasource configuration I provided above.

#### Edit the Run configuration

The Spring Boot project should be ready to run. Click Run in the top menu and click Edit Configurations if that is the only option it gives you. Make sure in the left column, you see "Application" with a drop down arrow that shows the "NjoAppApplication". The settings are on the right. It should have Main Class as "njo.practice.app.njoApp.NjoAppApplication". The Working directory should be pointing to the server folder. Use classpath of Module should say "GreetingArt" (name of artifact ID). Your JRE should be 1.8 (or 11 if you're using 11). Hit apply and Run.

## Developing the Angular application

If you are not familiar with Angular, you can view their main tutorial here:

https://angular.io/tutorial

Below are some helpful tutorials:

https://www.youtube.com/watch?v=k5E2AVpwsko

https://www.youtube.com/watch?v=0eWrpsCLMJQ&list=PLC3y8-rFHvwhBRAgFinJR8KHIrCdTkZcZ

Start Visual Studio Code and open the "client" folder. Navigate to this file: "test.service.ts". Note the http get request here; it is pointing to the AWS EB instance that is hosting the Spring Boot app. Change this to point to your locally run Spring Boot app (eg. "//localhost:5000/users"). Make sure your Spring Boot app is running.

In the terminal, navigate to the "client" directory. Run the following commands:

```
ng build --prod
ng serve
```

Now follow this URL on your browser: localhost:4200. If you did not enter any data in the database or via REST API, then it will not show anything. Otherwise, you should see the application functioning properly.

## General git flow

If you are new to git I would recommend downloading the Github Desktop for Windows. Once that is downloaded, you can clone this repository (choose the "open with Desktop" option). If you want to make pull requests, then you will have to Fork it instead:

https://help.github.com/en/articles/creating-a-pull-request-from-a-fork

Follow the above instructions on how to create a pull request with your fork. Below are instructions on how to commit changes to a remote repository in general, whether it is your own fork or if you are a collaborator on private repo.

If you chose to clone the repo with the desktop option then it should open up your Github Desktop client and it will begin cloning the repo. Once it is finished, then ta-da that is your local repository (which you just cloned from the "remote" repository). Any changes you make while in that local repository will be tracked by git. **Before you start making any changes however you should create a new branch**.

In the upper middle of the client you will see the current branch you are on (master). Never commit directly to master. Click this option and create new branch; name it in relation to what type of changes you are making. For example, say you want to add a "Customer" class in the Spring Boot application to add it as a table in the database. You could name your branch: add-customer-class.

Once you have checked out this branch, you can start making your changes. You will see all of your changes will be stashed in the client. **This does not mean your changes are permanently saved**. In order to save your progress, you have to hit the "Commit" option in the lower left. Provide an apt summary title (the description is optional). It is recommended you commit often so you don't lose your progress.

Now let's say you are done with your changes. Commit any leftover changes you have. Then publish your branch (the client should give you this option in the upper right). Once the branch is published, it will be visible in the remote repo; anyone can check out your branch and work off from it.

Now you can make a pull request (PR). In the client menu at the top, go to Branch, then select Create Pull Request (or hit ctrl + r). This will open up a tab in your browser to the steps in creating the PR. Then it just has to be approved and merged by the reviewer.
