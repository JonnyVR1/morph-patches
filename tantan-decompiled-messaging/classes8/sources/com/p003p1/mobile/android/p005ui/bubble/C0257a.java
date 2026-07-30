package com.p003p1.mobile.android.p005ui.bubble;

import android.content.Context;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import com.p003p1.mobile.android.app.App;
import java.lang.ref.WeakReference;
import l.t100;
import p007l.f0m;
import p007l.j0m;
import p007l.l0m;
import p007l.t0c0;
import p007l.uc80;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0257a implements l0m, j0m {

    /* JADX INFO: renamed from: N */
    public static int f1379N = 1;

    /* JADX INFO: renamed from: O */
    public static int f1380O = 16;

    /* JADX INFO: renamed from: P */
    public static int f1381P = 256;

    /* JADX INFO: renamed from: Q */
    public static int f1382Q = 4096;

    /* JADX INFO: renamed from: R */
    public static int f1383R = 1048576;

    /* JADX INFO: renamed from: A */
    public boolean f1384A;

    /* JADX INFO: renamed from: B */
    @ColorInt
    public int f1385B;

    /* JADX INFO: renamed from: C */
    public int f1386C;

    /* JADX INFO: renamed from: E */
    public boolean f1388E;

    /* JADX INFO: renamed from: F */
    public Integer f1389F;

    /* JADX INFO: renamed from: G */
    public a f1390G;

    /* JADX INFO: renamed from: H */
    public int f1391H;

    /* JADX INFO: renamed from: I */
    public int f1392I;

    /* JADX INFO: renamed from: J */
    public boolean f1393J;

    /* JADX INFO: renamed from: K */
    public f0m f1394K;

    /* JADX INFO: renamed from: M */
    public WeakReference<View> f1396M;

    /* JADX INFO: renamed from: a */
    public int[] f1397a;

    /* JADX INFO: renamed from: c */
    public int f1399c;

    /* JADX INFO: renamed from: d */
    public int f1400d;

    /* JADX INFO: renamed from: k */
    public b f1407k;

    /* JADX INFO: renamed from: l */
    public c f1408l;

    /* JADX INFO: renamed from: m */
    public d f1409m;

    /* JADX INFO: renamed from: q */
    public String f1413q;

    /* JADX INFO: renamed from: r */
    public CharSequence f1414r;

    /* JADX INFO: renamed from: t */
    public int f1416t;

    /* JADX INFO: renamed from: u */
    public Integer f1417u;

    /* JADX INFO: renamed from: w */
    public View f1419w;

    /* JADX INFO: renamed from: y */
    public View f1421y;

    /* JADX INFO: renamed from: z */
    public boolean f1422z;

    /* JADX INFO: renamed from: v */
    public int f1418v = -1;

    /* JADX INFO: renamed from: D */
    public boolean f1387D = false;

    /* JADX INFO: renamed from: L */
    public String f1395L = null;

    /* JADX INFO: renamed from: b */
    public int f1398b = f1379N | f1383R;

    /* JADX INFO: renamed from: g */
    public int f1403g = t100.d(7.0f);

    /* JADX INFO: renamed from: i */
    public int f1405i = t100.i;

    /* JADX INFO: renamed from: e */
    public int f1401e = 0;

    /* JADX INFO: renamed from: f */
    public int f1402f = 0;

    /* JADX INFO: renamed from: h */
    public int f1404h = 75;

    /* JADX INFO: renamed from: j */
    public long f1406j = -1;

    /* JADX INFO: renamed from: n */
    public boolean f1410n = false;

    /* JADX INFO: renamed from: s */
    public float f1415s = 16.0f;

    /* JADX INFO: renamed from: o */
    public boolean f1411o = false;

    /* JADX INFO: renamed from: p */
    @ColorInt
    public int f1412p = -1;

    /* JADX INFO: renamed from: x */
    public boolean f1420x = true;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public int f1423a;

        /* JADX INFO: renamed from: b */
        public int f1424b;

        /* JADX INFO: renamed from: c */
        public int f1425c;

        /* JADX INFO: renamed from: d */
        public int f1426d;

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m1156a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void m1157a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void m1158a(View view);
    }

    public C0257a(Context context) {
        this.f1397a = new int[]{context.getResources().getColor(t0c0.f4236t)};
        this.f1385B = context.getResources().getColor(t0c0.f4227k);
    }

    /* JADX INFO: renamed from: A */
    public C0257a m1117A(View view) {
        this.f1421y = view;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public C0257a m1118B(int i) {
        this.f1401e = i;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public C0257a m1119C(int i) {
        this.f1386C = i;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public C0257a m1120D(CharSequence charSequence) {
        this.f1414r = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public C0257a m1121E(boolean z) {
        this.f1411o = z;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public C0257a m1122F(boolean z) {
        this.f1393J = z;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public C0257a m1123G(@ColorRes int i) {
        this.f1412p = App.f1068e.getResources().getColor(i);
        return this;
    }

    /* JADX INFO: renamed from: H */
    public C0257a m1124H(int i, int i2, int i3, int i4) {
        a aVar = new a();
        this.f1390G = aVar;
        aVar.f1423a = i;
        aVar.f1424b = i2;
        aVar.f1425c = i3;
        aVar.f1426d = i4;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public C0257a m1125I(int i) {
        this.f1416t = i;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public C0257a m1126J(float f) {
        this.f1415s = f;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public C0257a m1127K(int i) {
        this.f1389F = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: L */
    public C0257a m1128L(@ColorRes int i) {
        this.f1385B = App.f1068e.getResources().getColor(i);
        return this;
    }

    /* JADX INFO: renamed from: M */
    public C0257a m1129M(boolean z) {
        this.f1422z = z;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public C0257a m1130N(d dVar) {
        this.f1409m = dVar;
        return this;
    }

    @Override // p007l.j0m
    /* JADX INFO: renamed from: a */
    public boolean mo1131a() {
        WeakReference<View> weakReference = this.f1396M;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        C0260d.m1167l().m1178s(this, this.f1396M.get(), this.f1395L);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public C0257a m1132b(long j) {
        if (j <= 0) {
            return this;
        }
        this.f1406j = j;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m1133c(String str, View view) {
        this.f1395L = str;
        this.f1396M = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: d */
    public C0257a m1134d(b bVar) {
        this.f1407k = bVar;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C0257a m1135e(boolean z) {
        this.f1410n = z;
        return this;
    }

    @Override // p007l.j0m
    /* JADX INFO: renamed from: f */
    public void mo1136f(boolean z) {
        if (z) {
            return;
        }
        C0260d.m1167l().m1171k(this.f1395L);
    }

    @Override // p007l.l0m
    /* JADX INFO: renamed from: g */
    public void mo1137g(uc80 uc80Var) {
        C0260d.m1167l().m1171k(uc80Var.m11205f());
    }

    @Override // p007l.l0m
    /* JADX INFO: renamed from: h */
    public boolean mo1138h(uc80 uc80Var) {
        if (!(uc80Var.m11206g() instanceof C0257a) || uc80Var.m11208i() == null) {
            return false;
        }
        C0260d.m1167l().m1178s((C0257a) uc80Var.m11206g(), uc80Var.m11208i().get(), uc80Var.m11205f());
        return true;
    }

    @Override // p007l.g0m
    /* JADX INFO: renamed from: i */
    public void mo1139i(f0m f0mVar) {
        this.f1394K = f0mVar;
    }

    /* JADX INFO: renamed from: j */
    public C0257a m1140j(c cVar) {
        this.f1408l = cVar;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C0257a m1141k(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            this.f1397a = iArr;
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C0257a m1142l(int i) {
        this.f1403g = i;
        return this;
    }

    @Override // p007l.j0m
    /* JADX INFO: renamed from: n */
    public void mo1143n(boolean z) {
        C0260d.m1167l().m1171k(this.f1395L);
    }

    /* JADX INFO: renamed from: o */
    public C0257a m1144o(int i, int i2) {
        if ((i != f1380O && i != f1381P) || i2 <= 0) {
            return this;
        }
        this.f1398b = i | this.f1398b;
        this.f1418v = i2;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C0257a m1145p(int i) {
        this.f1404h = i;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C0257a m1146q(int i) {
        this.f1398b = i;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public C0257a m1147r(String str) {
        this.f1413q = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public C0257a m1148s(View view) {
        this.f1419w = view;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public C0257a m1149t(boolean z) {
        this.f1420x = z;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public C0257a m1150u(int i) {
        this.f1399c = i;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public C0257a m1151v(int i) {
        this.f1391H = i;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public C0257a m1152w(int i) {
        this.f1392I = i;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public C0257a m1153x(int i) {
        this.f1400d = i;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public C0257a m1154y(boolean z) {
        this.f1384A = z;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public C0257a m1155z(int i) {
        this.f1405i = i;
        return this;
    }
}
