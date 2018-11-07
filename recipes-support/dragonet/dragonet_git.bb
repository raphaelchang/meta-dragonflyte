# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/raphaelchang/dragonet.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
do_configure[depends] += "virtual/kernel:do_shared_workdir"

DEPENDS = "lcm"
inherit cmake

do_configure_prepend() {
    cp ${STAGING_KERNEL_DIR}/include/uapi/linux/rpmsg.h ${STAGING_DIR_TARGET}/usr/include/linux
}

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE += ""
