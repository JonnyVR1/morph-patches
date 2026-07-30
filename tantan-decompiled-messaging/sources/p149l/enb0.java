package p149l;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* JADX INFO: loaded from: classes7.dex */
public final class enb0 {

    /* JADX INFO: renamed from: a */
    public Mode f92292a;

    /* JADX INFO: renamed from: b */
    public ErrorCorrectionLevel f92293b;

    /* JADX INFO: renamed from: c */
    public j0l0 f92294c;

    /* JADX INFO: renamed from: d */
    public int f92295d = -1;

    /* JADX INFO: renamed from: e */
    public hq3 f92296e;

    /* JADX INFO: renamed from: b */
    public static boolean m117250b(int i) {
        return i >= 0 && i < 8;
    }

    /* JADX INFO: renamed from: a */
    public hq3 m117251a() {
        return this.f92296e;
    }

    /* JADX INFO: renamed from: c */
    public void m117252c(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f92293b = errorCorrectionLevel;
    }

    /* JADX INFO: renamed from: d */
    public void m117253d(int i) {
        this.f92295d = i;
    }

    /* JADX INFO: renamed from: e */
    public void m117254e(hq3 hq3Var) {
        this.f92296e = hq3Var;
    }

    /* JADX INFO: renamed from: f */
    public void m117255f(Mode mode) {
        this.f92292a = mode;
    }

    /* JADX INFO: renamed from: g */
    public void m117256g(j0l0 j0l0Var) {
        this.f92294c = j0l0Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.f92292a);
        sb.append("\n ecLevel: ");
        sb.append(this.f92293b);
        sb.append("\n version: ");
        sb.append(this.f92294c);
        sb.append("\n maskPattern: ");
        sb.append(this.f92295d);
        if (this.f92296e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f92296e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
