package p153l;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* JADX INFO: loaded from: classes7.dex */
public final class ivb0 {

    /* JADX INFO: renamed from: a */
    public Mode f117034a;

    /* JADX INFO: renamed from: b */
    public ErrorCorrectionLevel f117035b;

    /* JADX INFO: renamed from: c */
    public o9l0 f117036c;

    /* JADX INFO: renamed from: d */
    public int f117037d = -1;

    /* JADX INFO: renamed from: e */
    public hr3 f117038e;

    /* JADX INFO: renamed from: b */
    public static boolean m142277b(int i) {
        return i >= 0 && i < 8;
    }

    /* JADX INFO: renamed from: a */
    public hr3 m142278a() {
        return this.f117038e;
    }

    /* JADX INFO: renamed from: c */
    public void m142279c(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f117035b = errorCorrectionLevel;
    }

    /* JADX INFO: renamed from: d */
    public void m142280d(int i) {
        this.f117037d = i;
    }

    /* JADX INFO: renamed from: e */
    public void m142281e(hr3 hr3Var) {
        this.f117038e = hr3Var;
    }

    /* JADX INFO: renamed from: f */
    public void m142282f(Mode mode) {
        this.f117034a = mode;
    }

    /* JADX INFO: renamed from: g */
    public void m142283g(o9l0 o9l0Var) {
        this.f117036c = o9l0Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.f117034a);
        sb.append("\n ecLevel: ");
        sb.append(this.f117035b);
        sb.append("\n version: ");
        sb.append(this.f117036c);
        sb.append("\n maskPattern: ");
        sb.append(this.f117037d);
        if (this.f117038e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f117038e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
