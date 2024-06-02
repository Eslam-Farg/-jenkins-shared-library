def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 