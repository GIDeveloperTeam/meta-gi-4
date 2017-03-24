KV = "4.1.21"
SRCDATE = "20170318"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://gi-et.info/et7000mini/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "fe9f174ec871e283195cb5d318a5bdee"
SRC_URI[sha256sum] = "6b6a566d3402034136517ef5baf4daee14c73f243a5d83d25cae8bffbaaa663d"

COMPATIBLE_MACHINE = "et7000mini"
