#include <sys/ioctl.h>
#include <fcntl.h>
#include <unistd.h>
#include <string>
#include <linux/rpmsg.h>

#define RPMSG_ADDR_ANY 0xFFFFFFFF

int main() {
    struct rpmsg_endpoint_info ept_info = {"rpmsg-openamp-demo-channel__p", RPMSG_ADDR_ANY, RPMSG_ADDR_ANY};
    int fd = open("/dev/rpmsg_ctrl0", O_RDWR);

    /* create endpoint interface */
    ioctl(fd, RPMSG_CREATE_EPT_IOCTL, &ept_info);  // /dev/rpmsg0 is created 

    close(fd);
    fd = open("/dev/rpmsg0", O_WRONLY);
    while(1)
    {
        int e = 0;
        write(fd, &e, sizeof(int));
        sleep(1);
    }
}
