package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class jtk {

    /* JADX INFO: renamed from: A */
    public static int f119614A = 1;

    /* JADX INFO: renamed from: B */
    public static int f119615B = 16;

    /* JADX INFO: renamed from: C */
    public static int f119616C = 256;

    /* JADX INFO: renamed from: D */
    public static int f119617D = 4096;

    /* JADX INFO: renamed from: E */
    public static int f119618E = 1048576;

    /* JADX INFO: renamed from: b */
    public int[] f119620b;

    /* JADX INFO: renamed from: c */
    public int f119621c;

    /* JADX INFO: renamed from: d */
    public int f119622d;

    /* JADX INFO: renamed from: e */
    public int f119623e;

    /* JADX INFO: renamed from: f */
    public int f119624f;

    /* JADX INFO: renamed from: g */
    public int f119625g;

    /* JADX INFO: renamed from: h */
    public int f119626h;

    /* JADX INFO: renamed from: i */
    public int f119627i;

    /* JADX INFO: renamed from: j */
    public int f119628j;

    /* JADX INFO: renamed from: k */
    public int f119629k;

    /* JADX INFO: renamed from: l */
    public int f119630l;

    /* JADX INFO: renamed from: m */
    public int f119631m;

    /* JADX INFO: renamed from: n */
    public int f119632n;

    /* JADX INFO: renamed from: o */
    public long f119633o;

    /* JADX INFO: renamed from: p */
    public InterfaceC17856a f119634p;

    /* JADX INFO: renamed from: q */
    public InterfaceC17857b f119635q;

    /* JADX INFO: renamed from: r */
    public boolean f119636r;

    /* JADX INFO: renamed from: s */
    public boolean f119637s;

    /* JADX INFO: renamed from: t */
    public int f119638t;

    /* JADX INFO: renamed from: v */
    public View f119640v;

    /* JADX INFO: renamed from: w */
    public boolean f119641w;

    /* JADX INFO: renamed from: x */
    public boolean f119642x;

    /* JADX INFO: renamed from: y */
    public int f119643y;

    /* JADX INFO: renamed from: z */
    public int f119644z;

    /* JADX INFO: renamed from: a */
    public String f119619a = "";

    /* JADX INFO: renamed from: u */
    public int f119639u = -1;

    /* JADX INFO: renamed from: l.jtk$a */
    public interface InterfaceC17856a {
        /* JADX INFO: renamed from: a */
        void mo125326a(String str);
    }

    /* JADX INFO: renamed from: l.jtk$b */
    public interface InterfaceC17857b {
        /* JADX INFO: renamed from: a */
        void mo135260a(String str);
    }

    public jtk(Context context) {
        int i = ((int) context.getResources().getDisplayMetrics().density) * 10;
        this.f119626h = i;
        this.f119628j = i;
        this.f119627i = i;
        this.f119625g = i;
        this.f119622d = f119614A | f119618E;
        this.f119630l = ((int) context.getResources().getDisplayMetrics().density) * 9;
        this.f119632n = ((int) context.getResources().getDisplayMetrics().density) * 5;
        this.f119629k = ((int) context.getResources().getDisplayMetrics().density) * 5;
        this.f119621c = 14;
        this.f119631m = 83;
        this.f119633o = -1L;
        this.f119636r = false;
        this.f119620b = new int[]{-551629, -539853};
        this.f119637s = true;
        this.f119638t = -1;
        this.f119642x = true;
    }

    /* JADX INFO: renamed from: a */
    public jtk m143109a(long j) {
        if (j <= 0) {
            return this;
        }
        this.f119633o = j;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public jtk m143110b(InterfaceC17856a interfaceC17856a) {
        this.f119634p = interfaceC17856a;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public jtk m143111c(boolean z) {
        this.f119636r = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public jtk m143112d(InterfaceC17857b interfaceC17857b) {
        this.f119635q = interfaceC17857b;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public jtk m143113e(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            this.f119620b = iArr;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public jtk m143114f(int i) {
        this.f119630l = i;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public jtk m143115g(int i, int i2) {
        if ((i != f119615B && i != f119616C) || i2 <= 0) {
            return this;
        }
        this.f119622d = i | this.f119622d;
        this.f119639u = i2;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public jtk m143116h(int i) {
        this.f119631m = i;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public jtk m143117i(int i) {
        this.f119622d = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public jtk m143118j(View view) {
        this.f119640v = view;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public jtk m143119k(boolean z) {
        this.f119642x = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public jtk m143120l(int i) {
        this.f119644z = i;
        this.f119643y = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public jtk m143121m(int i) {
        this.f119643y = i;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public jtk m143122n(int i) {
        this.f119644z = i;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public jtk m143123o(int i) {
        this.f119624f = i;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public jtk m143124p(int i) {
        this.f119632n = i;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public jtk m143125q(int i) {
        this.f119638t = i;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public jtk m143126r(boolean z) {
        this.f119641w = z;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public jtk m143127s(int i, int i2, int i3, int i4) {
        this.f119625g = i;
        this.f119626h = i2;
        this.f119627i = i3;
        this.f119628j = i4;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public jtk m143128t(int i) {
        this.f119621c = i;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public jtk m143129u(String str) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        this.f119619a = str;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public jtk m143130v(boolean z) {
        this.f119637s = z;
        return this;
    }
}
