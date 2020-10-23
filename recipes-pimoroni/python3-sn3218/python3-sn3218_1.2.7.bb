SUMMARY = "A module to drive the sn3218 i2c LED controller"
HOMEPAGE = "https://github.com/pimoroni/sn3218"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=be85037b505b21b386e82d53cd928b5e"

SRC_URI = "git://github.com/pimoroni/sn3218;protocol=https"

PV = "1.2.7+git${SRCPV}"
SRCREV = "d497c6e9762c6d31bd9a7f9da9ccef0318b8e31c"

S = "${WORKDIR}/git/library"

inherit setuptools3

RDEPENDS_${PN} += "python3-smbus python3-core"
