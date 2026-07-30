package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jtk {

    /* JADX INFO: renamed from: A */
    public static int f15293A = 1;

    /* JADX INFO: renamed from: B */
    public static int f15294B = 16;

    /* JADX INFO: renamed from: C */
    public static int f15295C = 256;

    /* JADX INFO: renamed from: D */
    public static int f15296D = 4096;

    /* JADX INFO: renamed from: E */
    public static int f15297E = 1048576;

    /* JADX INFO: renamed from: b */
    public int[] f15299b;

    /* JADX INFO: renamed from: c */
    public int f15300c;

    /* JADX INFO: renamed from: d */
    public int f15301d;

    /* JADX INFO: renamed from: e */
    public int f15302e;

    /* JADX INFO: renamed from: f */
    public int f15303f;

    /* JADX INFO: renamed from: g */
    public int f15304g;

    /* JADX INFO: renamed from: h */
    public int f15305h;

    /* JADX INFO: renamed from: i */
    public int f15306i;

    /* JADX INFO: renamed from: j */
    public int f15307j;

    /* JADX INFO: renamed from: k */
    public int f15308k;

    /* JADX INFO: renamed from: l */
    public int f15309l;

    /* JADX INFO: renamed from: m */
    public int f15310m;

    /* JADX INFO: renamed from: n */
    public int f15311n;

    /* JADX INFO: renamed from: o */
    public long f15312o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0979a f15313p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0980b f15314q;

    /* JADX INFO: renamed from: r */
    public boolean f15315r;

    /* JADX INFO: renamed from: s */
    public boolean f15316s;

    /* JADX INFO: renamed from: t */
    public int f15317t;

    /* JADX INFO: renamed from: v */
    public View f15319v;

    /* JADX INFO: renamed from: w */
    public boolean f15320w;

    /* JADX INFO: renamed from: x */
    public boolean f15321x;

    /* JADX INFO: renamed from: y */
    public int f15322y;

    /* JADX INFO: renamed from: z */
    public int f15323z;

    /* JADX INFO: renamed from: a */
    public String f15298a = "";

    /* JADX INFO: renamed from: u */
    public int f15318u = -1;

    /* JADX INFO: renamed from: l.jtk$a */
    public interface InterfaceC0979a {
        /* JADX INFO: renamed from: a */
        void mo17215a(String str);
    }

    /* JADX INFO: renamed from: l.jtk$b */
    public interface InterfaceC0980b {
        /* JADX INFO: renamed from: a */
        void mo17216a(String str);
    }

    public jtk(Context context) {
        int i = ((int) context.getResources().getDisplayMetrics().density) * 10;
        this.f15305h = i;
        this.f15307j = i;
        this.f15306i = i;
        this.f15304g = i;
        this.f15301d = f15293A | f15297E;
        this.f15309l = ((int) context.getResources().getDisplayMetrics().density) * 9;
        this.f15311n = ((int) context.getResources().getDisplayMetrics().density) * 5;
        this.f15308k = ((int) context.getResources().getDisplayMetrics().density) * 5;
        this.f15300c = 14;
        this.f15310m = 83;
        this.f15312o = -1L;
        this.f15315r = false;
        this.f15299b = new int[]{-551629, -539853};
        this.f15316s = true;
        this.f15317t = -1;
        this.f15321x = true;
    }

    /* JADX INFO: renamed from: a */
    public jtk m17193a(long j) {
        if (j <= 0) {
            return this;
        }
        this.f15312o = j;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public jtk m17194b(InterfaceC0979a interfaceC0979a) {
        this.f15313p = interfaceC0979a;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public jtk m17195c(boolean z) {
        this.f15315r = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public jtk m17196d(InterfaceC0980b interfaceC0980b) {
        this.f15314q = interfaceC0980b;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public jtk m17197e(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            this.f15299b = iArr;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public jtk m17198f(int i) {
        this.f15309l = i;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public jtk m17199g(int i, int i2) {
        if ((i != f15294B && i != f15295C) || i2 <= 0) {
            return this;
        }
        this.f15301d = i | this.f15301d;
        this.f15318u = i2;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public jtk m17200h(int i) {
        this.f15310m = i;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public jtk m17201i(int i) {
        this.f15301d = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public jtk m17202j(View view) {
        this.f15319v = view;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public jtk m17203k(boolean z) {
        this.f15321x = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public jtk m17204l(int i) {
        this.f15323z = i;
        this.f15322y = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public jtk m17205m(int i) {
        this.f15322y = i;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public jtk m17206n(int i) {
        this.f15323z = i;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public jtk m17207o(int i) {
        this.f15303f = i;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public jtk m17208p(int i) {
        this.f15311n = i;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public jtk m17209q(int i) {
        this.f15317t = i;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public jtk m17210r(boolean z) {
        this.f15320w = z;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public jtk m17211s(int i, int i2, int i3, int i4) {
        this.f15304g = i;
        this.f15305h = i2;
        this.f15306i = i3;
        this.f15307j = i4;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public jtk m17212t(int i) {
        this.f15300c = i;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public jtk m17213u(String str) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        this.f15298a = str;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public jtk m17214v(boolean z) {
        this.f15316s = z;
        return this;
    }
}
