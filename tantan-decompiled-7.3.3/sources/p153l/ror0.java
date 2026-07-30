package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class ror0 implements vor0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.vor0
    /* JADX INFO: renamed from: a */
    public final int mo182441a(sqr0 sqr0Var) {
        String str = sqr0Var.f170251l;
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
        wg3.m206174a("Unsupported MIME type: ".concat(String.valueOf(str)));
        return 0;
    }

    @Override // p153l.vor0
    /* JADX INFO: renamed from: b */
    public final boolean mo182442b(sqr0 sqr0Var) {
        String str = sqr0Var.f170251l;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.vor0
    /* JADX INFO: renamed from: c */
    public final xor0 mo182443c(sqr0 sqr0Var) {
        String str = sqr0Var.f170251l;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return new tpr0(sqr0Var.f170253n);
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return new vpr0();
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return new nqr0();
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return new irr0();
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return new mqr0(sqr0Var.f170253n);
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return new xpr0(sqr0Var.f170253n);
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return new bqr0();
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return new hqr0();
                    }
                    break;
            }
        }
        wg3.m206174a("Unsupported MIME type: ".concat(String.valueOf(str)));
        return null;
    }
}
