package p149l;

import android.text.Layout;

/* JADX INFO: loaded from: classes6.dex */
public final class air0 {

    /* JADX INFO: renamed from: c */
    public CharSequence f70047c;

    /* JADX INFO: renamed from: a */
    public long f70045a = 0;

    /* JADX INFO: renamed from: b */
    public long f70046b = 0;

    /* JADX INFO: renamed from: d */
    public int f70048d = 2;

    /* JADX INFO: renamed from: e */
    public float f70049e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    public int f70050f = 1;

    /* JADX INFO: renamed from: g */
    public int f70051g = 0;

    /* JADX INFO: renamed from: h */
    public float f70052h = -3.4028235E38f;

    /* JADX INFO: renamed from: i */
    public int f70053i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public float f70054j = 1.0f;

    /* JADX INFO: renamed from: k */
    public int f70055k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX INFO: renamed from: a */
    public final dtu0 m96921a() {
        Layout.Alignment alignment;
        float f = this.f70052h;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.f70048d;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.f70053i;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.f70048d;
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
        dtu0 dtu0Var = new dtu0();
        int i4 = this.f70048d;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            svv0.m186111f("WebvttCueParser", "Unknown textAlignment: " + i4);
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        dtu0Var.m113595m(alignment);
        float f3 = this.f70049e;
        int i5 = this.f70050f;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        dtu0Var.m113587e(f2, i5);
        dtu0Var.m113588f(this.f70051g);
        dtu0Var.m113590h(f);
        dtu0Var.m113591i(i2);
        float f4 = this.f70054j;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 != 1) {
            if (i2 != 2) {
                qkq0.m175383a(String.valueOf(i2));
                return null;
            }
        } else if (f <= 0.5f) {
            f += f;
        } else {
            float f5 = 1.0f - f;
            f = f5 + f5;
        }
        dtu0Var.m113593k(Math.min(f4, f));
        dtu0Var.m113597o(this.f70055k);
        CharSequence charSequence = this.f70047c;
        if (charSequence != null) {
            dtu0Var.m113594l(charSequence);
        }
        return dtu0Var;
    }
}
