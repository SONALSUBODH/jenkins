// Declarative Pipeline
     pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

               // printenv pipeline
pipeline {
    agent any 
    stages {
        stage ('jayant'){
            steps {
                sh 'printenv'
            }
        }
    }
}

// Default variable pipeline
pipeline {
    agent any 
    stages {
        stage ('Buildid_Print'){
            steps {
                echo "Jenkins job Build id is $BUILD_ID"
            }
        }
        stage ('mayur'){
            steps {
                echo "Jenkins home directory is $HUDSON_HOME"
            }
        }
        
    }
}

// environment variables pipeline

pipeline {
    agent any 
    environment {
        Prod_Ip = "192.168.9.0"
        DEV_Ip = "192.168.8.0"
    }
    stages {
        stage ('env-variable'){
            steps {
                echo "Environment variable is $Prod_Ip"
            }
        }
        stage ('env-DEVIP'){
            steps {
                echo "Environment variable is $DEV_Ip"
            }
        }
    }
}
