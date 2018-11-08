LICENSE = "CLOSED"

SRC_URI = "file://CMakeLists.txt file://main.cpp"

PR = "r0"

S = "${WORKDIR}"

do_configure[depends] += "virtual/kernel:do_shared_workdir"

inherit cmake

do_configure_prepend() {
    cp ${STAGING_KERNEL_DIR}/include/uapi/linux/rpmsg.h ${STAGING_DIR_TARGET}/usr/include/linux
}

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE += ""
