#### Week 9 (Files and String Processing) Assignment
This week we will drive your die classes from a file instead of the keyboard.

##### You will need to include your files from Assignment 8 to complete this assignment

I have provided an example FileReader Class and a data file at `dice.txt`. You will have to interpret the datafile and tokenize it so it can be turned into something meaningful for your program.
Once the data is organized run each line of dice definitions through your dice tower and record the outputs in a text file that you commit with your project to github.

##### Setup for Github
- Fork the repo to your personal account
- Clone your fork to your local computer
  - From Github Desktop
    - click the + on the top left
    - select clone then search for `CPT-163-27-F2015-Assignment-9-Files-Strings` use the one under the section with your github name
  - From Command Line
    - Copy the `https` link from your fork on github.com (its below the settings button on the right hand side of the page)
    - run `git clone <copied url>` (this will create a folder the same name as the repo in the directory you ran this command)
- Create a branch on your fork of the Assignment-9 Repo using the format <github-name>/<feature_description>
  - From Github Desktop
    - Click the `Add a Branch` button (It should be the button next to the dropdown that says `master`)
    - Make sure you create your branch from master
  - From Command Line
    - run `git checkout -b <branch_name>`
- In Netbeans create a new project and set the __Project Directory__ to the folder that was created when you cloned your fork.
- Write Code!
- Create a commit
  - From Github Desktop
    - Select your fork and fill-in the commit summary
    - Click `Sync`
  - From Command Line
    - run `git add .`
    - run `git commit -m "<your commit message>"`
    - run `git push origin <your_branch_name>`
- Go to Github.com and open your PR by clicking on `Compare and Open Pull Request`