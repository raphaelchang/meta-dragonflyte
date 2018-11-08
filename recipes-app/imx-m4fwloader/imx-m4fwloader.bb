LICENSE = "GPLv2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

SRCBRANCH = "github.com/master"
SRC_URI = "git://source.codeaurora.org/external/imx/cafatgithub/imx-m4fwloader;protocol=https;branch=${SRCBRANCH}"
SRCREV = "276ad6afdc4c26b3842d41f2fa5f05c71a9e8456"

SRC_URI[md5sum] = "98b49c87b4242a6c2cc3b7be6b5b46d9"
SRC_URI[sha256sum] = "b3d5cf9a81e5ced9586d7d7b093f3d4e7166892c05383be14b21515c3d266ba9"

S = "${WORKDIR}/git"

do_compile() {
	${CC} m4fwloader.c ${LDFLAGS} -o m4fwloader
}

do_install() {
	install -m 0755 -D ${S}/m4fwloader ${D}/${bindir}/m4fwloader
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(mx6sx|mx7d)"
