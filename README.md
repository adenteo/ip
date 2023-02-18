# Duke project template

This is a project template for a greenfield Java project. It's named after the Java mascot _Duke_. Given below are instructions on how to use it.

## Setting up in Intellij

Prerequisites: JDK 11, update Intellij to the most recent version.

1. Open Intellij (if you are not in the welcome screen, click `File` > `Close Project` to close the existing project first)
1. Open the project into Intellij as follows:
   1. Click `Open`.
   1. Select the project directory, and click `OK`.
   1. If there are any further prompts, accept the defaults.
1. Configure the project to use **JDK 11** (not other versions) as explained in [here](https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk).<br>
   In the same dialog, set the **Project language level** field to the `SDK default` option.
1. After that, locate the `src/main/java/Duke.java` file, right-click it, and choose `Run Duke.main()` (if the code editor is showing compile errors, try restarting the IDE). If the setup is correct, you should see something like the below as the output:

   ```
    --------------------------------------------
    Hello from
    ____        _
    |  _ \ _   _| | _____
    | | | | | | | |/ / _ \
    | |_| | |_| |   <  __/
    |____/ \__,_|_|\_\___|

    How can I help you?

    Here are some possibly useful commands:
    --------------------------------------------
    /todo {description} - Add a todo task to ur task list.
    /deadline {description} - Add a deadline task to ur task list.
    /event {description} - Add an event task to ur task list.
    /list - List out all the tasks in ur task list.
    /mark {numerical index} - Mark a specific task done.
    /unmark {numerical index} - Mark a specific task undone.
    /bye - Terminate the program.
    --------------------------------------------

   ```

## User Guide

Now that you have set up the Duke program. Here are some ways that you can start creating your own tasks!

In Duke, you may choose from _3_ different types of tasks that you would like to create. These are the following currently supported task types:

### Todo

### Event

### Deadline
