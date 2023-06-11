def call(Map config) {


pipeline {
    agent any
    stages {
        stage('Code quality') {
            steps {
                script{
                    echo 'Test 6'
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
			    echo "pushing helm chart for the microservice to harbor repo. ${currentPomVersion}"
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
