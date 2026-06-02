def call(serviceName) {

    dir(serviceName) {

        sh """
        docker build -t ${serviceName}:${BUILD_NUMBER} .
        """

    }

}
