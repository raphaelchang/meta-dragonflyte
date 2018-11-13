cmake_minimum_required(VERSION 2.6)

project(dragonet-demo)

add_executable(${PROJECT_NAME} main.cpp)
target_link_libraries(${PROJECT_NAME} dragonet)

install(TARGETS ${PROJECT_NAME} DESTINATION /usr/bin)

