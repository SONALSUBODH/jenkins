// Declarative Pipeline
     Pipeline {
          agent any
          stages  {
            stage ('code-pull') {
              steps {
                echo "this is code pull stage"
              }
            }
             stage ('code-build') {
              steps {
                echo "this is code build stage"
                 }
             }
             stage ('code-deploy') {
              steps {
                echo "this is code deploy stage"
                }
             }
