SUMMARY = "go.mod: github.com/ugorji/go/codec"
HOMEPAGE = "https://pkg.go.dev/github.com/ugorji/go/codec"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ugorji-go-codec-sources.inc

EXTRA_DEPENDS += "\
    github.com-ugorji-go-native \
"

GO_IMPORT = "github.com/ugorji/go/codec"

inherit gosrc
inherit native
