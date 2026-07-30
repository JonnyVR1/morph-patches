package p153l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class dgq0 {

    /* JADX INFO: renamed from: b */
    @NonNull
    public static final dgq0 f88335b;

    /* JADX INFO: renamed from: a */
    public final C16530k f88336a;

    /* JADX INFO: renamed from: l.dgq0$l */
    public static final class C16531l {
        /* JADX INFO: renamed from: a */
        public static int m115732a() {
            return 128;
        }

        /* JADX INFO: renamed from: b */
        public static int m115733b() {
            return 8;
        }

        /* JADX INFO: renamed from: c */
        public static int m115734c(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            za50.m219101a("type needs to be >= FIRST and <= LAST, type=", i);
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public static int m115735d() {
            return 2;
        }

        /* JADX INFO: renamed from: e */
        public static int m115736e() {
            return 1;
        }

        /* JADX INFO: renamed from: f */
        public static int m115737f() {
            return 7;
        }
    }

    /* JADX INFO: renamed from: l.dgq0$m */
    @RequiresApi(30)
    public static final class C16532m {
        /* JADX INFO: renamed from: a */
        public static int m115738a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f88335b = C16529j.f88361q;
        } else {
            f88335b = C16530k.f88362b;
        }
    }

    public dgq0(@Nullable dgq0 dgq0Var) {
        if (dgq0Var == null) {
            this.f88336a = new C16530k(this);
            return;
        }
        C16530k c16530k = dgq0Var.f88336a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && (c16530k instanceof C16529j)) {
            this.f88336a = new C16529j(this, (C16529j) c16530k);
        } else if (i >= 29 && (c16530k instanceof C16528i)) {
            this.f88336a = new C16528i(this, (C16528i) c16530k);
        } else if (i >= 28 && (c16530k instanceof C16527h)) {
            this.f88336a = new C16527h(this, (C16527h) c16530k);
        } else if (c16530k instanceof C16526g) {
            this.f88336a = new C16526g(this, (C16526g) c16530k);
        } else if (c16530k instanceof C16525f) {
            this.f88336a = new C16525f(this, (C16525f) c16530k);
        } else {
            this.f88336a = new C16530k(this);
        }
        c16530k.mo115712e(this);
    }

    /* JADX INFO: renamed from: n */
    public static svm m115672n(@NonNull svm svmVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, svmVar.f170857a - i);
        int iMax2 = Math.max(0, svmVar.f170858b - i2);
        int iMax3 = Math.max(0, svmVar.f170859c - i3);
        int iMax4 = Math.max(0, svmVar.f170860d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? svmVar : svm.m188213b(iMax, iMax2, iMax3, iMax4);
    }

    @NonNull
    @RequiresApi(20)
    /* JADX INFO: renamed from: w */
    public static dgq0 m115673w(@NonNull WindowInsets windowInsets) {
        return m115674x(windowInsets, null);
    }

    @NonNull
    @RequiresApi(20)
    /* JADX INFO: renamed from: x */
    public static dgq0 m115674x(@NonNull WindowInsets windowInsets, @Nullable View view) {
        dgq0 dgq0Var = new dgq0((WindowInsets) yn80.m216775e(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            dgq0Var.m115693t(kkl0.m150116D(view));
            dgq0Var.m115678d(view.getRootView());
        }
        return dgq0Var;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: a */
    public dgq0 m115675a() {
        return this.f88336a.mo115727a();
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: b */
    public dgq0 m115676b() {
        return this.f88336a.mo115722b();
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: c */
    public dgq0 m115677c() {
        return this.f88336a.mo115723c();
    }

    /* JADX INFO: renamed from: d */
    public void m115678d(@NonNull View view) {
        this.f88336a.mo115711d(view);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public t5e m115679e() {
        return this.f88336a.mo115728f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dgq0) {
            return l950.m153327a(this.f88336a, ((dgq0) obj).f88336a);
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public svm m115680f(int i) {
        return this.f88336a.mo115713g(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public int m115681g() {
        return this.f88336a.mo115724i().f170858b;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: h */
    public svm m115682h() {
        return this.f88336a.mo115724i();
    }

    public int hashCode() {
        C16530k c16530k = this.f88336a;
        if (c16530k == null) {
            return 0;
        }
        return c16530k.hashCode();
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public int m115683i() {
        return this.f88336a.mo115714k().f170860d;
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public int m115684j() {
        return this.f88336a.mo115714k().f170857a;
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public int m115685k() {
        return this.f88336a.mo115714k().f170859c;
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public int m115686l() {
        return this.f88336a.mo115714k().f170858b;
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public boolean m115687m() {
        return !this.f88336a.mo115714k().equals(svm.f170856e);
    }

    /* JADX INFO: renamed from: o */
    public boolean m115688o() {
        return this.f88336a.mo115725m();
    }

    /* JADX INFO: renamed from: p */
    public boolean m115689p(int i) {
        return this.f88336a.mo115716o(i);
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: q */
    public dgq0 m115690q(int i, int i2, int i3, int i4) {
        return new C16520a(this).m115698c(svm.m188213b(i, i2, i3, i4)).m115696a();
    }

    /* JADX INFO: renamed from: r */
    public void m115691r(svm[] svmVarArr) {
        this.f88336a.mo115717p(svmVarArr);
    }

    /* JADX INFO: renamed from: s */
    public void m115692s(@NonNull svm svmVar) {
        this.f88336a.mo115718q(svmVar);
    }

    /* JADX INFO: renamed from: t */
    public void m115693t(@Nullable dgq0 dgq0Var) {
        this.f88336a.mo115719r(dgq0Var);
    }

    /* JADX INFO: renamed from: u */
    public void m115694u(@Nullable svm svmVar) {
        this.f88336a.mo115726s(svmVar);
    }

    @Nullable
    @RequiresApi(20)
    /* JADX INFO: renamed from: v */
    public WindowInsets m115695v() {
        C16530k c16530k = this.f88336a;
        if (c16530k instanceof C16525f) {
            return ((C16525f) c16530k).f88352c;
        }
        return null;
    }

    /* JADX INFO: renamed from: l.dgq0$d */
    @RequiresApi(30)
    public static class C16523d extends C16522c {
        public C16523d() {
        }

        @Override // p153l.dgq0.C16524e
        /* JADX INFO: renamed from: c */
        public void mo115705c(int i, @NonNull svm svmVar) {
            this.f88344c.setInsets(C16532m.m115738a(i), svmVar.m188216e());
        }

        public C16523d(@NonNull dgq0 dgq0Var) {
            super(dgq0Var);
        }
    }

    /* JADX INFO: renamed from: l.dgq0$h */
    @RequiresApi(28)
    public static class C16527h extends C16526g {
        public C16527h(@NonNull dgq0 dgq0Var, @NonNull WindowInsets windowInsets) {
            super(dgq0Var, windowInsets);
        }

        @Override // p153l.dgq0.C16530k
        @NonNull
        /* JADX INFO: renamed from: a */
        public dgq0 mo115727a() {
            return dgq0.m115673w(this.f88352c.consumeDisplayCutout());
        }

        @Override // p153l.dgq0.C16525f, p153l.dgq0.C16530k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16527h)) {
                return false;
            }
            C16527h c16527h = (C16527h) obj;
            return Objects.equals(this.f88352c, c16527h.f88352c) && Objects.equals(this.f88356g, c16527h.f88356g);
        }

        @Override // p153l.dgq0.C16530k
        @Nullable
        /* JADX INFO: renamed from: f */
        public t5e mo115728f() {
            return t5e.m189380e(this.f88352c.getDisplayCutout());
        }

        @Override // p153l.dgq0.C16530k
        public int hashCode() {
            return this.f88352c.hashCode();
        }

        public C16527h(@NonNull dgq0 dgq0Var, @NonNull C16527h c16527h) {
            super(dgq0Var, c16527h);
        }
    }

    /* JADX INFO: renamed from: l.dgq0$j */
    @RequiresApi(30)
    public static class C16529j extends C16528i {

        /* JADX INFO: renamed from: q */
        @NonNull
        public static final dgq0 f88361q = dgq0.m115673w(WindowInsets.CONSUMED);

        public C16529j(@NonNull dgq0 dgq0Var, @NonNull WindowInsets windowInsets) {
            super(dgq0Var, windowInsets);
        }

        @Override // p153l.dgq0.C16525f, p153l.dgq0.C16530k
        @NonNull
        /* JADX INFO: renamed from: g */
        public svm mo115713g(int i) {
            return svm.m188215d(this.f88352c.getInsets(C16532m.m115738a(i)));
        }

        @Override // p153l.dgq0.C16525f, p153l.dgq0.C16530k
        /* JADX INFO: renamed from: o */
        public boolean mo115716o(int i) {
            return this.f88352c.isVisible(C16532m.m115738a(i));
        }

        public C16529j(@NonNull dgq0 dgq0Var, @NonNull C16529j c16529j) {
            super(dgq0Var, c16529j);
        }

        @Override // p153l.dgq0.C16525f, p153l.dgq0.C16530k
        /* JADX INFO: renamed from: d */
        public final void mo115711d(@NonNull View view) {
        }
    }

    /* JADX INFO: renamed from: l.dgq0$b */
    @RequiresApi(api = 20)
    public static class C16521b extends C16524e {

        /* JADX INFO: renamed from: e */
        public static Field f88338e = null;

        /* JADX INFO: renamed from: f */
        public static boolean f88339f = false;

        /* JADX INFO: renamed from: g */
        public static Constructor<WindowInsets> f88340g = null;

        /* JADX INFO: renamed from: h */
        public static boolean f88341h = false;

        /* JADX INFO: renamed from: c */
        public WindowInsets f88342c;

        /* JADX INFO: renamed from: d */
        public svm f88343d;

        public C16521b() {
            this.f88342c = m115699h();
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        private static WindowInsets m115699h() {
            if (!f88339f) {
                try {
                    f88338e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f88339f = true;
            }
            Field field = f88338e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f88341h) {
                try {
                    f88340g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f88341h = true;
            }
            Constructor<WindowInsets> constructor = f88340g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // p153l.dgq0.C16524e
        @NonNull
        /* JADX INFO: renamed from: b */
        public dgq0 mo115700b() {
            m115706a();
            dgq0 dgq0VarM115673w = dgq0.m115673w(this.f88342c);
            dgq0VarM115673w.m115691r(this.f88346b);
            dgq0VarM115673w.m115694u(this.f88343d);
            return dgq0VarM115673w;
        }

        @Override // p153l.dgq0.C16524e
        /* JADX INFO: renamed from: f */
        public void mo115701f(@NonNull svm svmVar) {
            WindowInsets windowInsets = this.f88342c;
            if (windowInsets != null) {
                this.f88342c = windowInsets.replaceSystemWindowInsets(svmVar.f170857a, svmVar.f170858b, svmVar.f170859c, svmVar.f170860d);
            }
        }

        public C16521b(@NonNull dgq0 dgq0Var) {
            super(dgq0Var);
            this.f88342c = dgq0Var.m115695v();
        }
    }

    /* JADX INFO: renamed from: l.dgq0$e */
    public static class C16524e {

        /* JADX INFO: renamed from: a */
        public final dgq0 f88345a;

        /* JADX INFO: renamed from: b */
        public svm[] f88346b;

        public C16524e() {
            this(new dgq0((dgq0) null));
        }

        /* JADX INFO: renamed from: a */
        public final void m115706a() {
            svm[] svmVarArr = this.f88346b;
            if (svmVarArr != null) {
                svm svmVarM115680f = svmVarArr[C16531l.m115734c(1)];
                svm svmVarM115680f2 = this.f88346b[C16531l.m115734c(2)];
                if (svmVarM115680f2 == null) {
                    svmVarM115680f2 = this.f88345a.m115680f(2);
                }
                if (svmVarM115680f == null) {
                    svmVarM115680f = this.f88345a.m115680f(1);
                }
                mo115701f(svm.m188212a(svmVarM115680f, svmVarM115680f2));
                svm svmVar = this.f88346b[C16531l.m115734c(16)];
                if (svmVar != null) {
                    mo115703e(svmVar);
                }
                svm svmVar2 = this.f88346b[C16531l.m115734c(32)];
                if (svmVar2 != null) {
                    mo115702d(svmVar2);
                }
                svm svmVar3 = this.f88346b[C16531l.m115734c(64)];
                if (svmVar3 != null) {
                    mo115704g(svmVar3);
                }
            }
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public dgq0 mo115700b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo115705c(int i, @NonNull svm svmVar) {
            if (this.f88346b == null) {
                this.f88346b = new svm[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f88346b[C16531l.m115734c(i2)] = svmVar;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void mo115701f(@NonNull svm svmVar) {
            throw null;
        }

        public C16524e(@NonNull dgq0 dgq0Var) {
            this.f88345a = dgq0Var;
        }

        /* JADX INFO: renamed from: d */
        public void mo115702d(@NonNull svm svmVar) {
        }

        /* JADX INFO: renamed from: e */
        public void mo115703e(@NonNull svm svmVar) {
        }

        /* JADX INFO: renamed from: g */
        public void mo115704g(@NonNull svm svmVar) {
        }
    }

    /* JADX INFO: renamed from: l.dgq0$f */
    @RequiresApi(20)
    public static class C16525f extends C16530k {

        /* JADX INFO: renamed from: h */
        public static boolean f88347h = false;

        /* JADX INFO: renamed from: i */
        public static Method f88348i;

        /* JADX INFO: renamed from: j */
        public static Class<?> f88349j;

        /* JADX INFO: renamed from: k */
        public static Field f88350k;

        /* JADX INFO: renamed from: l */
        public static Field f88351l;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final WindowInsets f88352c;

        /* JADX INFO: renamed from: d */
        public svm[] f88353d;

        /* JADX INFO: renamed from: e */
        public svm f88354e;

        /* JADX INFO: renamed from: f */
        public dgq0 f88355f;

        /* JADX INFO: renamed from: g */
        public svm f88356g;

        public C16525f(@NonNull dgq0 dgq0Var, @NonNull C16525f c16525f) {
            this(dgq0Var, new WindowInsets(c16525f.f88352c));
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: t */
        private svm m115707t(int i, boolean z) {
            svm svmVarM188212a = svm.f170856e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    svmVarM188212a = svm.m188212a(svmVarM188212a, m115720u(i2, z));
                }
            }
            return svmVarM188212a;
        }

        /* JADX INFO: renamed from: v */
        private svm m115708v() {
            dgq0 dgq0Var = this.f88355f;
            return dgq0Var != null ? dgq0Var.m115682h() : svm.f170856e;
        }

        @Nullable
        /* JADX INFO: renamed from: w */
        private svm m115709w(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                pr3.m173429a("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
                return null;
            }
            if (!f88347h) {
                m115710y();
            }
            Method method = f88348i;
            if (method != null && f88349j != null && f88350k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f88350k.get(f88351l.get(objInvoke));
                    if (rect != null) {
                        return svm.m188214c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        /* JADX INFO: renamed from: y */
        private static void m115710y() {
            try {
                f88348i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f88349j = cls;
                f88350k = cls.getDeclaredField("mVisibleInsets");
                f88351l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f88350k.setAccessible(true);
                f88351l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f88347h = true;
        }

        @Override // p153l.dgq0.C16530k
        /* JADX INFO: renamed from: d */
        public void mo115711d(@NonNull View view) {
            svm svmVarM115709w = m115709w(view);
            if (svmVarM115709w == null) {
                svmVarM115709w = svm.f170856e;
            }
            mo115718q(svmVarM115709w);
        }

        @Override // p153l.dgq0.C16530k
        /* JADX INFO: renamed from: e */
        public void mo115712e(@NonNull dgq0 dgq0Var) {
            dgq0Var.m115693t(this.f88355f);
            dgq0Var.m115692s(this.f88356g);
        }

        @Override // p153l.dgq0.C16530k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f88356g, ((C16525f) obj).f88356g);
            }
            return false;
        }

        @Override // p153l.dgq0.C16530k
        @NonNull
        /* JADX INFO: renamed from: g */
        public svm mo115713g(int i) {
            return m115707t(i, false);
        }

        @Override // p153l.dgq0.C16530k
        @NonNull
        /* JADX INFO: renamed from: k */
        public final svm mo115714k() {
            if (this.f88354e == null) {
                this.f88354e = svm.m188213b(this.f88352c.getSystemWindowInsetLeft(), this.f88352c.getSystemWindowInsetTop(), this.f88352c.getSystemWindowInsetRight(), this.f88352c.getSystemWindowInsetBottom());
            }
            return this.f88354e;
        }

        @Override // p153l.dgq0.C16530k
        /* JADX INFO: renamed from: n */
        public boolean mo115715n() {
            return this.f88352c.isRound();
        }

        @Override // p153l.dgq0.C16530k
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: o */
        public boolean mo115716o(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !m115721x(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p153l.dgq0.C16530k
        /* JADX INFO: renamed from: p */
        public void mo115717p(svm[] svmVarArr) {
            this.f88353d = svmVarArr;
        }

        @Override // p153l.dgq0.C16530k
        /* JADX INFO: renamed from: q */
        public void mo115718q(@NonNull svm svmVar) {
            this.f88356g = svmVar;
        }

        @Override // p153l.dgq0.C16530k
        /* JADX INFO: renamed from: r */
        public void mo115719r(@Nullable dgq0 dgq0Var) {
            this.f88355f = dgq0Var;
        }

        @NonNull
        /* JADX INFO: renamed from: u */
        public svm m115720u(int i, boolean z) {
            svm svmVarM115682h;
            int i2;
            if (i == 1) {
                return z ? svm.m188213b(0, Math.max(m115708v().f170858b, mo115714k().f170858b), 0, 0) : svm.m188213b(0, mo115714k().f170858b, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    svm svmVarM115708v = m115708v();
                    svm svmVarMo115724i = mo115724i();
                    return svm.m188213b(Math.max(svmVarM115708v.f170857a, svmVarMo115724i.f170857a), 0, Math.max(svmVarM115708v.f170859c, svmVarMo115724i.f170859c), Math.max(svmVarM115708v.f170860d, svmVarMo115724i.f170860d));
                }
                svm svmVarMo115714k = mo115714k();
                dgq0 dgq0Var = this.f88355f;
                svmVarM115682h = dgq0Var != null ? dgq0Var.m115682h() : null;
                int iMin = svmVarMo115714k.f170860d;
                if (svmVarM115682h != null) {
                    iMin = Math.min(iMin, svmVarM115682h.f170860d);
                }
                return svm.m188213b(svmVarMo115714k.f170857a, 0, svmVarMo115714k.f170859c, iMin);
            }
            if (i != 8) {
                if (i == 16) {
                    return mo115730j();
                }
                if (i == 32) {
                    return mo115729h();
                }
                if (i == 64) {
                    return mo115731l();
                }
                if (i != 128) {
                    return svm.f170856e;
                }
                dgq0 dgq0Var2 = this.f88355f;
                t5e t5eVarM115679e = dgq0Var2 != null ? dgq0Var2.m115679e() : mo115728f();
                return t5eVarM115679e != null ? svm.m188213b(t5eVarM115679e.m189382b(), t5eVarM115679e.m189384d(), t5eVarM115679e.m189383c(), t5eVarM115679e.m189381a()) : svm.f170856e;
            }
            svm[] svmVarArr = this.f88353d;
            svmVarM115682h = svmVarArr != null ? svmVarArr[C16531l.m115734c(8)] : null;
            if (svmVarM115682h != null) {
                return svmVarM115682h;
            }
            svm svmVarMo115714k2 = mo115714k();
            svm svmVarM115708v2 = m115708v();
            int i3 = svmVarMo115714k2.f170860d;
            if (i3 > svmVarM115708v2.f170860d) {
                return svm.m188213b(0, 0, 0, i3);
            }
            svm svmVar = this.f88356g;
            return (svmVar == null || svmVar.equals(svm.f170856e) || (i2 = this.f88356g.f170860d) <= svmVarM115708v2.f170860d) ? svm.f170856e : svm.m188213b(0, 0, 0, i2);
        }

        /* JADX INFO: renamed from: x */
        public boolean m115721x(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !m115720u(i, false).equals(svm.f170856e);
        }

        public C16525f(@NonNull dgq0 dgq0Var, @NonNull WindowInsets windowInsets) {
            super(dgq0Var);
            this.f88354e = null;
            this.f88352c = windowInsets;
        }
    }

    /* JADX INFO: renamed from: l.dgq0$g */
    @RequiresApi(21)
    public static class C16526g extends C16525f {

        /* JADX INFO: renamed from: m */
        public svm f88357m;

        public C16526g(@NonNull dgq0 dgq0Var, @NonNull C16526g c16526g) {
            super(dgq0Var, c16526g);
            this.f88357m = null;
            this.f88357m = c16526g.f88357m;
        }

        @Override // p153l.dgq0.C16530k
        @NonNull
        /* JADX INFO: renamed from: b */
        public dgq0 mo115722b() {
            return dgq0.m115673w(this.f88352c.consumeStableInsets());
        }

        @Override // p153l.dgq0.C16530k
        @NonNull
        /* JADX INFO: renamed from: c */
        public dgq0 mo115723c() {
            return dgq0.m115673w(this.f88352c.consumeSystemWindowInsets());
        }

        @Override // p153l.dgq0.C16530k
        @NonNull
        /* JADX INFO: renamed from: i */
        public final svm mo115724i() {
            if (this.f88357m == null) {
                this.f88357m = svm.m188213b(this.f88352c.getStableInsetLeft(), this.f88352c.getStableInsetTop(), this.f88352c.getStableInsetRight(), this.f88352c.getStableInsetBottom());
            }
            return this.f88357m;
        }

        @Override // p153l.dgq0.C16530k
        /* JADX INFO: renamed from: m */
        public boolean mo115725m() {
            return this.f88352c.isConsumed();
        }

        @Override // p153l.dgq0.C16530k
        /* JADX INFO: renamed from: s */
        public void mo115726s(@Nullable svm svmVar) {
            this.f88357m = svmVar;
        }

        public C16526g(@NonNull dgq0 dgq0Var, @NonNull WindowInsets windowInsets) {
            super(dgq0Var, windowInsets);
            this.f88357m = null;
        }
    }

    /* JADX INFO: renamed from: l.dgq0$i */
    @RequiresApi(29)
    public static class C16528i extends C16527h {

        /* JADX INFO: renamed from: n */
        public svm f88358n;

        /* JADX INFO: renamed from: o */
        public svm f88359o;

        /* JADX INFO: renamed from: p */
        public svm f88360p;

        public C16528i(@NonNull dgq0 dgq0Var, @NonNull WindowInsets windowInsets) {
            super(dgq0Var, windowInsets);
            this.f88358n = null;
            this.f88359o = null;
            this.f88360p = null;
        }

        @Override // p153l.dgq0.C16530k
        @NonNull
        /* JADX INFO: renamed from: h */
        public svm mo115729h() {
            if (this.f88359o == null) {
                this.f88359o = svm.m188215d(this.f88352c.getMandatorySystemGestureInsets());
            }
            return this.f88359o;
        }

        @Override // p153l.dgq0.C16530k
        @NonNull
        /* JADX INFO: renamed from: j */
        public svm mo115730j() {
            if (this.f88358n == null) {
                this.f88358n = svm.m188215d(this.f88352c.getSystemGestureInsets());
            }
            return this.f88358n;
        }

        @Override // p153l.dgq0.C16530k
        @NonNull
        /* JADX INFO: renamed from: l */
        public svm mo115731l() {
            if (this.f88360p == null) {
                this.f88360p = svm.m188215d(this.f88352c.getTappableElementInsets());
            }
            return this.f88360p;
        }

        public C16528i(@NonNull dgq0 dgq0Var, @NonNull C16528i c16528i) {
            super(dgq0Var, c16528i);
            this.f88358n = null;
            this.f88359o = null;
            this.f88360p = null;
        }

        @Override // p153l.dgq0.C16526g, p153l.dgq0.C16530k
        /* JADX INFO: renamed from: s */
        public void mo115726s(@Nullable svm svmVar) {
        }
    }

    /* JADX INFO: renamed from: l.dgq0$c */
    @RequiresApi(api = 29)
    public static class C16522c extends C16524e {

        /* JADX INFO: renamed from: c */
        public final WindowInsets.Builder f88344c;

        public C16522c(@NonNull dgq0 dgq0Var) {
            super(dgq0Var);
            WindowInsets windowInsetsM115695v = dgq0Var.m115695v();
            this.f88344c = windowInsetsM115695v != null ? jgq0.m144791a(windowInsetsM115695v) : kgq0.m149756a();
        }

        @Override // p153l.dgq0.C16524e
        @NonNull
        /* JADX INFO: renamed from: b */
        public dgq0 mo115700b() {
            m115706a();
            dgq0 dgq0VarM115673w = dgq0.m115673w(this.f88344c.build());
            dgq0VarM115673w.m115691r(this.f88346b);
            return dgq0VarM115673w;
        }

        @Override // p153l.dgq0.C16524e
        /* JADX INFO: renamed from: d */
        public void mo115702d(@NonNull svm svmVar) {
            this.f88344c.setMandatorySystemGestureInsets(svmVar.m188216e());
        }

        @Override // p153l.dgq0.C16524e
        /* JADX INFO: renamed from: e */
        public void mo115703e(@NonNull svm svmVar) {
            this.f88344c.setSystemGestureInsets(svmVar.m188216e());
        }

        @Override // p153l.dgq0.C16524e
        /* JADX INFO: renamed from: f */
        public void mo115701f(@NonNull svm svmVar) {
            this.f88344c.setSystemWindowInsets(svmVar.m188216e());
        }

        @Override // p153l.dgq0.C16524e
        /* JADX INFO: renamed from: g */
        public void mo115704g(@NonNull svm svmVar) {
            this.f88344c.setTappableElementInsets(svmVar.m188216e());
        }

        public C16522c() {
            this.f88344c = kgq0.m149756a();
        }
    }

    /* JADX INFO: renamed from: l.dgq0$k */
    public static class C16530k {

        /* JADX INFO: renamed from: b */
        @NonNull
        public static final dgq0 f88362b = new C16520a().m115696a().m115675a().m115676b().m115677c();

        /* JADX INFO: renamed from: a */
        public final dgq0 f88363a;

        public C16530k(@NonNull dgq0 dgq0Var) {
            this.f88363a = dgq0Var;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public dgq0 mo115727a() {
            return this.f88363a;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public dgq0 mo115722b() {
            return this.f88363a;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public dgq0 mo115723c() {
            return this.f88363a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16530k)) {
                return false;
            }
            C16530k c16530k = (C16530k) obj;
            return mo115715n() == c16530k.mo115715n() && mo115725m() == c16530k.mo115725m() && l950.m153327a(mo115714k(), c16530k.mo115714k()) && l950.m153327a(mo115724i(), c16530k.mo115724i()) && l950.m153327a(mo115728f(), c16530k.mo115728f());
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public t5e mo115728f() {
            return null;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public svm mo115713g(int i) {
            return svm.f170856e;
        }

        @NonNull
        /* JADX INFO: renamed from: h */
        public svm mo115729h() {
            return mo115714k();
        }

        public int hashCode() {
            return l950.m153328b(Boolean.valueOf(mo115715n()), Boolean.valueOf(mo115725m()), mo115714k(), mo115724i(), mo115728f());
        }

        @NonNull
        /* JADX INFO: renamed from: i */
        public svm mo115724i() {
            return svm.f170856e;
        }

        @NonNull
        /* JADX INFO: renamed from: j */
        public svm mo115730j() {
            return mo115714k();
        }

        @NonNull
        /* JADX INFO: renamed from: k */
        public svm mo115714k() {
            return svm.f170856e;
        }

        @NonNull
        /* JADX INFO: renamed from: l */
        public svm mo115731l() {
            return mo115714k();
        }

        /* JADX INFO: renamed from: m */
        public boolean mo115725m() {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public boolean mo115715n() {
            return false;
        }

        /* JADX INFO: renamed from: o */
        public boolean mo115716o(int i) {
            return true;
        }

        /* JADX INFO: renamed from: d */
        public void mo115711d(@NonNull View view) {
        }

        /* JADX INFO: renamed from: e */
        public void mo115712e(@NonNull dgq0 dgq0Var) {
        }

        /* JADX INFO: renamed from: p */
        public void mo115717p(svm[] svmVarArr) {
        }

        /* JADX INFO: renamed from: q */
        public void mo115718q(@NonNull svm svmVar) {
        }

        /* JADX INFO: renamed from: r */
        public void mo115719r(@Nullable dgq0 dgq0Var) {
        }

        /* JADX INFO: renamed from: s */
        public void mo115726s(svm svmVar) {
        }
    }

    /* JADX INFO: renamed from: l.dgq0$a */
    public static final class C16520a {

        /* JADX INFO: renamed from: a */
        public final C16524e f88337a;

        public C16520a() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f88337a = new C16523d();
            } else if (i >= 29) {
                this.f88337a = new C16522c();
            } else {
                this.f88337a = new C16521b();
            }
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public dgq0 m115696a() {
            return this.f88337a.mo115700b();
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C16520a m115697b(int i, @NonNull svm svmVar) {
            this.f88337a.mo115705c(i, svmVar);
            return this;
        }

        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: c */
        public C16520a m115698c(@NonNull svm svmVar) {
            this.f88337a.mo115701f(svmVar);
            return this;
        }

        public C16520a(@NonNull dgq0 dgq0Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f88337a = new C16523d(dgq0Var);
            } else if (i >= 29) {
                this.f88337a = new C16522c(dgq0Var);
            } else {
                this.f88337a = new C16521b(dgq0Var);
            }
        }
    }

    @RequiresApi(20)
    public dgq0(@NonNull WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f88336a = new C16529j(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f88336a = new C16528i(this, windowInsets);
        } else if (i >= 28) {
            this.f88336a = new C16527h(this, windowInsets);
        } else {
            this.f88336a = new C16526g(this, windowInsets);
        }
    }
}
