pipeline {
  agent {
    docker {
      image 'maven:3.6.1-jdk-8'
    }

  }
  stages {
    stage('Start') {
      steps {
        echo 'Start Massage'
      }
    }
    stage('Clean') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }
  }
}