LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

SRC_URI = "file://1.html;subdir=source"

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

SCA_SCORE_SECURITY_ERROR = "0"
SCA_SCORE_FUNCTIONAL_ERROR = "0"
SCA_SCORE_STYLE_ERROR = "0"
inherit sca