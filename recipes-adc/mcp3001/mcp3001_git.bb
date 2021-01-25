DESCRIPTION = "A small program to read/munge value from MCP3001 ADC"
WEBSITE = "https://github.com/twoerner/mcp3001"
LICENSE = "OSL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e85f5bf6be5ffcf1bfdd3fae1dbc0638"

SRC_URI = "git://github.com/twoerner/mcp3001;protocol=https"

PV = "1.0.0+git${SRCPV}"
SRCREV = "19a83c71a647e93f64e0f6bdc48f3312fa9e8d89"

S = "${WORKDIR}/git"

inherit autotools

EXTRA_OECONF = ""
