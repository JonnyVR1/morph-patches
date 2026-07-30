package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class lfr0 implements pfr0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.pfr0
    /* JADX INFO: renamed from: a */
    public final int mo149740a(mhr0 mhr0Var) {
        String str = mhr0Var.f133892l;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return 2;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return 2;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return 2;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return 1;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return 2;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return 1;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return 1;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return 1;
                    }
                    break;
            }
        }
        ig3.m135964a("Unsupported MIME type: ".concat(String.valueOf(str)));
        return 0;
    }

    @Override // p149l.pfr0
    /* JADX INFO: renamed from: b */
    public final boolean mo149741b(mhr0 mhr0Var) {
        String str = mhr0Var.f133892l;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.pfr0
    /* JADX INFO: renamed from: c */
    public final rfr0 mo149742c(mhr0 mhr0Var) {
        String str = mhr0Var.f133892l;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return new ngr0(mhr0Var.f133894n);
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return new pgr0();
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return new hhr0();
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return new cir0();
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return new ghr0(mhr0Var.f133894n);
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return new rgr0(mhr0Var.f133894n);
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return new vgr0();
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return new bhr0();
                    }
                    break;
            }
        }
        ig3.m135964a("Unsupported MIME type: ".concat(String.valueOf(str)));
        return null;
    }
}
