#RestService Examples

#Two Examples
#1) MRExecutiveApp
#2) liveexam - simple example takes exam as input and display same exam as output

below are the steps for configuration of tomcat and maven for autodeploy

Tools needed 
1) Maven
2) Tomcat (or any other web server)
3) Eclipse
4) firefox with restclient plugin for testing service


Steps 

1) Change xml files(settings.xml, tomcat-users.xml) in maven and tomcat for 
     automatic deployment of service war using maven
    a) change in  apache-maven-3.2.3\conf\settings.xml 
          add following in server tag  <servers>

            <server>
              <id>TomcatServer</id>
              <username>admin</username>
              <password>admin</password>
          </server>
   
      
    b) change in apache-tomcat-7.0.55\conf\tomcat-users.xml
        add following in <tomcat-users>

          <role rolename="manager-script"/>
        <user username="admin" password="admin" roles="manager-script"/> 


2)  go  to project root folder  HelloRestService
    run following commands

         $mvn tomcat7:redeploy  for deploying web application

         $mvn tomcat7:undeploy  to undeploy app

         $mvn clear to clear target folder along with generated jar 

     before you deploy make sure tomcat is on.

3) you test rest service 
    https://192.168.43.62:8090/liveexam/getExam 
