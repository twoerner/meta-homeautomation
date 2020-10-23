SUMMARY = "A C library to drive the sn3218"
DESCRIPTION = "The sn3218 is an 18 channel LED driver that uses \
an i2c interface."
LICENSE = "OSL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e85f5bf6be5ffcf1bfdd3fae1dbc0638"

SRC_URI = "git://github.com/twoerner/libsn3218;protocol=https"

PV = "0.1.0+git${SRCPV}"
SRCREV = "f0ac2929f96053026223900f854dc59a62029a57"

S = "${WORKDIR}/git"

DEPENDS = "i2c-tools libcheck"

inherit pkgconfig autotools ptest

EXTRA_OECONF = ""

do_compile_ptest() {
	oe_runmake buildtest-TESTS
}

do_install_ptest() {
	install -d ${D}${PTEST_PATH}
	cp -r ${B}/tests/.libs/check_sn3218_init ${D}${PTEST_PATH}
	cp -r ${B}/tests/.libs/check_sn3218_set1 ${D}${PTEST_PATH}
	cp -r ${B}/tests/.libs/check_sn3218_setm ${D}${PTEST_PATH}
	cp -r ${B}/tests/.libs/check_sn3218_unset ${D}${PTEST_PATH}
	cp -r ${B}/tests/.libs/check_sn3218_fails ${D}${PTEST_PATH}
}
