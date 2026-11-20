package edu.depi;

def DockerBulid(IMAGE_NAME , IMAGE_TAG){
    sh "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
}

def DockerPush(IMAGE_NAME , IMAGE_TAG){
    sh "docker push ${IMAGE_NAME}:${IMAGE_TAG}"
}

def DockerLogin(DOCKER_NAME , DOCKER_PASSWORD){
    sh "docker login -u ${DOCKER_NAME} -p ${DOCKER_PASSWORD}"
}