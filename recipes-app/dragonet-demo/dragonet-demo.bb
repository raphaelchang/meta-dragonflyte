LICENSE = "CLOSED"

SRC_URI = "file://CMakeLists.txt file://main.cpp"

PR = "r0"

S = "${WORKDIR}"

DEPENDS = "dragonet"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE += ""
