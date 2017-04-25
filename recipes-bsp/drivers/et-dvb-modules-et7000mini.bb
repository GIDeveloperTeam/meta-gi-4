KV = "4.1.21"
SRCDATE = "20170424"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://gi-et.info/et7000mini/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "2372d7befaceb2b1908530b641c9a2dc"
SRC_URI[sha256sum] = "57e34458f415bfedd9d91cc6860fa0f3712834f300a37e9fd8b1d0accc8eacd3"

COMPATIBLE_MACHINE = "et7000mini"
