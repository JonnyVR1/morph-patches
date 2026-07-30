package p153l;

import android.text.Layout;

/* JADX INFO: loaded from: classes6.dex */
public final class grr0 {

    /* JADX INFO: renamed from: c */
    public CharSequence f106135c;

    /* JADX INFO: renamed from: a */
    public long f106133a = 0;

    /* JADX INFO: renamed from: b */
    public long f106134b = 0;

    /* JADX INFO: renamed from: d */
    public int f106136d = 2;

    /* JADX INFO: renamed from: e */
    public float f106137e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    public int f106138f = 1;

    /* JADX INFO: renamed from: g */
    public int f106139g = 0;

    /* JADX INFO: renamed from: h */
    public float f106140h = -3.4028235E38f;

    /* JADX INFO: renamed from: i */
    public int f106141i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public float f106142j = 1.0f;

    /* JADX INFO: renamed from: k */
    public int f106143k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX INFO: renamed from: a */
    public final j2v0 m131868a() {
        Layout.Alignment alignment;
        float f = this.f106140h;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.f106136d;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.f106141i;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.f106136d;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        j2v0 j2v0Var = new j2v0();
        int i4 = this.f106136d;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            y4w0.m214278f("WebvttCueParser", "Unknown textAlignment: " + i4);
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        j2v0Var.m143278m(alignment);
        float f3 = this.f106137e;
        int i5 = this.f106138f;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        j2v0Var.m143270e(f2, i5);
        j2v0Var.m143271f(this.f106139g);
        j2v0Var.m143273h(f);
        j2v0Var.m143274i(i2);
        float f4 = this.f106142j;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 != 1) {
            if (i2 != 2) {
                wtq0.m207906a(String.valueOf(i2));
                return null;
            }
        } else if (f <= 0.5f) {
            f += f;
        } else {
            float f5 = 1.0f - f;
            f = f5 + f5;
        }
        j2v0Var.m143276k(Math.min(f4, f));
        j2v0Var.m143280o(this.f106143k);
        CharSequence charSequence = this.f106135c;
        if (charSequence != null) {
            j2v0Var.m143277l(charSequence);
        }
        return j2v0Var;
    }
}
