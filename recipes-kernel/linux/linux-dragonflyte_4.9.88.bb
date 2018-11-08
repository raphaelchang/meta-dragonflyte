# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel for Dragonflyte"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-imx-src.inc

SRC_URI += " file://defconfig \
    file://0001-rpmsg-virtio-rpmsg-Add-RPMsg-char-driver-support.patch \
    file://0001-rpmsg_fixes.patch"

DEPENDS += "lzop-native bc-native"

addtask copy_defconfig after do_unpack before do_preconfigure
do_copy_defconfig () {
    install -d ${B}
    mkdir -p ${B}
    cp ${THISDIR}/linux-dragonflyte/defconfig ${B}/.config
}

EXTRA_OEMAKE_append = " ARCH=arm"

COMPATIBLE_MACHINE = "(dragonflyte)"
