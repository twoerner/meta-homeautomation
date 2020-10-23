SUMMARY = "Automation-HAT Python Library"
DESCRIPTION = "Automation HAT is a home monitoring and automation controller \
featuring relays, analog channels, powered outputs, and buffered inputs (all \
24V tolerant)."
HOMEPAGE = "https://shop.pimoroni.com/products/automation-hat"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1be647ba1f2b40ff716e997a3e4a0d47"

SRC_URI = "git://github.com/pimoroni/automation-hat.git;protocol=https"

PV = "0.2.3+git${SRCPV}"
SRCREV = "a41084cb4db02b76fc536235321a613d1c88ba52"

S = "${WORKDIR}/git/library"

inherit setuptools3

RDEPENDS_${PN} += "rpi-gpio python3-smbus python3-sn3218 python3-core"
