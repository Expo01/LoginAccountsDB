/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginaccountsdb;

/**
 *
 * @author chrisdailey
 */
public class LoginAccountsDB {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}




/*

GENERAL STEPS INVOLVED
- created a new DB in SQLite studio and created Users table for both user and Pass.
    Insertion of table contents using SQL commands in SQLite studio.
- download JAR file
- created new netbeans project. Inserted JAR and DB in root level of project folder.
    Added driver into drivers folder in project for SQLite and then connected the DB
    to the SQLite driver using full path of the DB in the project folder. 
- Add JAR to libraries 
- Create connection class, connect with driver name
- Use netbeans to create GUI with JFrame and drag/drop features into GUI frame
- added code into GUI class to give actions to buttons

JOURNAL RELFECTION ON PROJECT
- Apache Maven.
    - Build tool. is a software project management and comprehension tool. Based on concept 
      of a project object model (POM). THis term appears unique to Mavern 
      an is an XML file that has info regarding project and configuration details
      when executing a taskl, Mavern searches POM in current directory
    - a build tool: generates source dode, generates documentation from source code
        compiles source code, packes compiled codes into JAR files, installs packed code
        into local repository, server or central repository 
    - Maven can manage a project's build, reporting and documentation from a 
      central piece of information
    - Maven is useful with Java projects, helps to download dependencies with refers
        to libraries or JAR files. Getting JAR files can be difficult so Mavern gets right
        JAR files without conflicting versions and makes sure they are present in all
        repositories
    - Maven also takes care of dependencies such as not needing to visit official
        websites of all different software and instead mvnrepository.com which is a central
        repository of the JAR files
    - Also assists with righ project structure
    - ultiamtely simplifies building of a project, donwloading of JARs/dependencies
        provides easy access to all required info as well as building, documenting, releasing
        and distributing a project
    - Maven doesn't appear to be used by any FAANGs or anything but is used by JPMorgan and others
- SQLite studio format is really bad. Difficult layout to work with and not easy to re-open
    a previously made DB and view the table contents
- had some difficulty locating libraries folder. Just using the help/search feature pulls
    up libraries as well as other hard to find features 
- Netbeans not very user friendly. Does not give auto-complete options, must manually resolve
    class imports, does not have hover-able content for investigating purpose/class of methods

*/

