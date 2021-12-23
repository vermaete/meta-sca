SUMMARY = "NPM: lint-staged"
DESCRIPTION = "Lint files staged by git"
HOMEPAGE = "https://github.com/okonet/lint-staged#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b44479d65c486365b13a21124f3fe39"

DEPENDS = "npm-cli-truncate-native \
           npm-colorette-native \
           npm-commander-native \
           npm-debug-native \
           npm-execa-native \
           npm-lilconfig-native \
           npm-listr2-native \
           npm-micromatch-native \
           npm-normalize-path-native \
           npm-object-inspect-native \
           npm-string-argv-native \
           npm-supports-color-native \
           npm-yaml-native"

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-12.1.3.tgz"
SRC_URI[md5sum] = "c1aa1198c703c360bc7b816ce3d4bbbc"
SRC_URI[sha256sum] = "e2738f86812d36c6bc64dd8016b800ff553eb453736a4c6b7521e48e5b6b92b6"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native
