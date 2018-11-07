FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://defconfig"

IMAGE_INSTALL_append += " kernel-headers kernel-dev"
TOOLCHAIN_TARGET_TASK_append = " kernel-devsrc"
