cmake_minimum_required(VERSION 2.6)

project(rpmsg-test)

add_executable(${PROJECT_NAME} main.cpp)

install(TARGETS ${PROJECT_NAME} DESTINATION /usr/bin)

