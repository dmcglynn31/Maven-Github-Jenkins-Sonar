
//shared libraries

//project variables
def projectName = "Maven-Github-Jenkins-Sonar"
def credID = "32852131-bb99-4733-bd58-b2513a2e5850" //Dan's bitbucket cred IDs
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
node () {
    try {
        stage('Clean Environment'){
                try {
                    echo "Build server clean!"
                }
                catch (err) {
                   throw err
                )
        }
        stage('Clone from Remote')
                try {
                   echo "Cloned from " + $repoURL
                }
                catch (err) {
                    throw err
                }
        }
        stage('Checkout Code') {
            try {
              echo "Don't need this yet!"
            }
            catch (err) {
                    throw err
            }
        }
        stage('Build'){
           echo "Build success!"
        }
        stage('Test'){
            echo "Test here!"
        }
        stage('Deploy'){
            try {
                echo "Deploying to Environment..."
            }
            catch (err) {
                throw err
            }
        }

    } catch (err)(
        if (prepareFailure) {
            echo "Prepare Failure"
        } else if (cloneFailure) {
            echo "Clone Failure"
        } else if (checkOutFailure) {
            echo "Check Out Failure"
        } else if (buildFailure) {
            echo "Build Failure"
        } else if (testFailure) {
            echo "Test Failure"
        } else if (deployFailure) {
            echo "Deploy Failure"
        } else {
            echo "Generic Failure - Investigate!"
        }
    )
    }   
}
