KV = "4.1.21"
SRCDATE = "20161114"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://gi-et.info/et7000mini/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "4b756271fdac5692fd6c6ecdce99dd3d"
SRC_URI[sha256sum] = "bb6b6c004bfc89e2fd74aff7eb12a0a6c5f825567df08f31de6faa2faf858f7c"

COMPATIBLE_MACHINE = "et7000mini"
