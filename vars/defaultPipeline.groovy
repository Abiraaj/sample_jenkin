def call(Map config) {


pipeline {
    agent any
    stages {
        stage('Code quality') {
            steps {
                script{
                    def ret =  sh script: 'mvn help:evaluate -Dexpression=project.version -q -DforceStdout', returnStdout: true
                    echo "Test 6 ${ret}"
                    // Tag comment
                    def tagComment = 'This is a tag comment'

                    // Add the tag using Git command
                    sh "git tag -a ${ret} -m '${tagComment}'"
                    sh "git push origin ${ret}"
                }
            }
        }

        stage('Build') {
            steps {
                script{
                    echo 'Test 5'
                }
            }
        }

        stage('publish') {
           
            steps {
			    echo "repo."
                script{
                   echo 'Test 4'
                }

                script {
                    echo 'Test 3'
                }
                
                
            }            
        }
        
        stage('Deploy') {
            

            steps {
             script {
                 echo 'Test 1'
             }
           }

        }
        
        stage('FunctionalTest'){
             
        	steps {
        	    echo 'Test 1'
        	    echo 'Test2' 
            }
        }
    }
}
}
