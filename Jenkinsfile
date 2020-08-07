
//shared libraries

//project variables
def projectName = "Maven-Github-Jenkins-Sonar"
def repoURL = "https://github.com/dmcglynn31/Maven-Github-Jenkins-Sonar.git" //a real URL would go here
def workspace = "${env.WORKSPACE}" //Global Variable within Jenkins
def buildNumber = "${env.BUILD_NUMBER}"  //Global Variable within Jenkins
def branchName = "${env.BRANCH_NAME}"  //Global Variable within Jenkins

//error variables
def prepareFailure = false
def cloneFailure = false
def checkOutFailure = false
def buildFailure = false
def testFailure = false
def deployFailure = false
def notifyFailure = false

//server variables


//local function definitions

//pipeline definition
        stage('Clean Environment'){
            echo "Build server clean!"
        }

        stage('Clone from Remote'){
            echo "Cloned from "
        }

        stage('Checkout Code') {
            echo "Don't need to check out code yet!"
        }

        stage('Build'){
           echo "Build success!"
        }

        stage('Test'){
            echo "Test here!"
        }

        stage('Deploy'){
            echo "Deploying to Environment..."
        }
