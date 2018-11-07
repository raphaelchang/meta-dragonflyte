# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   lcm-java/jchart2d-code/3rdpartylicenses.txt
#   test/gtest/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "LGPLv2.1 & Apache-2.0 & Unknown & GPLv3 & LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=58f4394e20cf65bea09efdc8b430c0bd \
                    file://lcm-java/jchart2d-code/LICENSE-apache-xmlgraphics-commons;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://lcm-java/jchart2d-code/3rdpartylicenses.txt;md5=3eb725588904f4d610335bf1762e822b \
                    file://lcm-java/jchart2d-code/LICENSE-jide-oss.txt;md5=d32239bcb673463ab874e80d47fae504 \
                    file://test/gtest/LICENSE;md5=cbbd27594afd089daa160d3a16dd515a \
                    file://lcm-python/COPYING;md5=6a6a8e020838b23406c81b19c1d46df6"

SRC_URI = "https://github.com/lcm-proj/lcm/archive/v${PV}.tar.gz \
           file://0001-Disable-lcm-gen.patch \
           "
SRC_URI[md5sum] = "f26ac001d8b4fa321edcf87c3b5657cc"
SRC_URI[sha256sum] = "149d7076369d261e6adbb25d713dc9e30aeba415f4fc62bb41e748b2eb229b46"

DEPENDS = "glib-2.0"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

