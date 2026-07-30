package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public class zvk {

    /* JADX INFO: renamed from: A */
    public static int f206224A = 1;

    /* JADX INFO: renamed from: B */
    public static int f206225B = 16;

    /* JADX INFO: renamed from: C */
    public static int f206226C = 256;

    /* JADX INFO: renamed from: D */
    public static int f206227D = 4096;

    /* JADX INFO: renamed from: E */
    public static int f206228E = 1048576;

    /* JADX INFO: renamed from: b */
    public int[] f206230b;

    /* JADX INFO: renamed from: c */
    public int f206231c;

    /* JADX INFO: renamed from: d */
    public int f206232d;

    /* JADX INFO: renamed from: e */
    public int f206233e;

    /* JADX INFO: renamed from: f */
    public int f206234f;

    /* JADX INFO: renamed from: g */
    public int f206235g;

    /* JADX INFO: renamed from: h */
    public int f206236h;

    /* JADX INFO: renamed from: i */
    public int f206237i;

    /* JADX INFO: renamed from: j */
    public int f206238j;

    /* JADX INFO: renamed from: k */
    public int f206239k;

    /* JADX INFO: renamed from: l */
    public int f206240l;

    /* JADX INFO: renamed from: m */
    public int f206241m;

    /* JADX INFO: renamed from: n */
    public int f206242n;

    /* JADX INFO: renamed from: o */
    public long f206243o;

    /* JADX INFO: renamed from: p */
    public InterfaceC21905a f206244p;

    /* JADX INFO: renamed from: q */
    public InterfaceC21906b f206245q;

    /* JADX INFO: renamed from: r */
    public boolean f206246r;

    /* JADX INFO: renamed from: s */
    public boolean f206247s;

    /* JADX INFO: renamed from: t */
    public int f206248t;

    /* JADX INFO: renamed from: v */
    public View f206250v;

    /* JADX INFO: renamed from: w */
    public boolean f206251w;

    /* JADX INFO: renamed from: x */
    public boolean f206252x;

    /* JADX INFO: renamed from: y */
    public int f206253y;

    /* JADX INFO: renamed from: z */
    public int f206254z;

    /* JADX INFO: renamed from: a */
    public String f206229a = "";

    /* JADX INFO: renamed from: u */
    public int f206249u = -1;

    /* JADX INFO: renamed from: l.zvk$a */
    public interface InterfaceC21905a {
        /* JADX INFO: renamed from: a */
        void mo102709a(String str);
    }

    /* JADX INFO: renamed from: l.zvk$b */
    public interface InterfaceC21906b {
        /* JADX INFO: renamed from: a */
        void mo96261a(String str);
    }

    public zvk(Context context) {
        int i = ((int) context.getResources().getDisplayMetrics().density) * 10;
        this.f206236h = i;
        this.f206238j = i;
        this.f206237i = i;
        this.f206235g = i;
        this.f206232d = f206224A | f206228E;
        this.f206240l = ((int) context.getResources().getDisplayMetrics().density) * 9;
        this.f206242n = ((int) context.getResources().getDisplayMetrics().density) * 5;
        this.f206239k = ((int) context.getResources().getDisplayMetrics().density) * 5;
        this.f206231c = 14;
        this.f206241m = 83;
        this.f206243o = -1L;
        this.f206246r = false;
        this.f206230b = new int[]{-551629, -539853};
        this.f206247s = true;
        this.f206248t = -1;
        this.f206252x = true;
    }

    /* JADX INFO: renamed from: a */
    public zvk m221756a(long j) {
        if (j <= 0) {
            return this;
        }
        this.f206243o = j;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public zvk m221757b(InterfaceC21905a interfaceC21905a) {
        this.f206244p = interfaceC21905a;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public zvk m221758c(boolean z) {
        this.f206246r = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public zvk m221759d(InterfaceC21906b interfaceC21906b) {
        this.f206245q = interfaceC21906b;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public zvk m221760e(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            this.f206230b = iArr;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public zvk m221761f(int i) {
        this.f206240l = i;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public zvk m221762g(int i, int i2) {
        if ((i != f206225B && i != f206226C) || i2 <= 0) {
            return this;
        }
        this.f206232d = i | this.f206232d;
        this.f206249u = i2;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public zvk m221763h(int i) {
        this.f206241m = i;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public zvk m221764i(int i) {
        this.f206232d = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public zvk m221765j(View view) {
        this.f206250v = view;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public zvk m221766k(boolean z) {
        this.f206252x = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public zvk m221767l(int i) {
        this.f206254z = i;
        this.f206253y = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public zvk m221768m(int i) {
        this.f206253y = i;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public zvk m221769n(int i) {
        this.f206254z = i;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public zvk m221770o(int i) {
        this.f206234f = i;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public zvk m221771p(int i) {
        this.f206242n = i;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public zvk m221772q(int i) {
        this.f206248t = i;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public zvk m221773r(boolean z) {
        this.f206251w = z;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public zvk m221774s(int i, int i2, int i3, int i4) {
        this.f206235g = i;
        this.f206236h = i2;
        this.f206237i = i3;
        this.f206238j = i4;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public zvk m221775t(int i) {
        this.f206231c = i;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public zvk m221776u(String str) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        this.f206229a = str;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public zvk m221777v(boolean z) {
        this.f206247s = z;
        return this;
    }
}
