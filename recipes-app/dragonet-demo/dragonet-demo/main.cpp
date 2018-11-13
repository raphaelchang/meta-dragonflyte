#include <iostream>

#include <dragonet.h>

dragonet::Dragonet dragonet_;

void callback(const int *data)
{
    std::cout << "New data: " << *data << std::endl;
    int send = *data * 2;
    dragonet_.Publish("rpmsg-openamp-demo-channel", &send);
}

int main() {
    std::cout << "Initializing Dragonet..." << std::endl;
    dragonet_.Init();
    dragonet_.Subscribe("inter-test", callback);
    dragonet_.Spin();
}
