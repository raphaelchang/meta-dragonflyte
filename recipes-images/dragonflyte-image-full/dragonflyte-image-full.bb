DESCRIPTION = "Full image for Dragonflyte board"

inherit core-image

IMAGE_FEATURES += " ssh-server-openssh"

IMAGE_INSTALL_append += " lcm dragonet imx-m4fwloader dragonet-demo"
