package p149l;

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
public class y6q0 {

    /* JADX INFO: renamed from: b */
    @NonNull
    public static final y6q0 f196604b;

    /* JADX INFO: renamed from: a */
    public final C21325k f196605a;

    /* JADX INFO: renamed from: l.y6q0$l */
    public static final class C21326l {
        /* JADX INFO: renamed from: a */
        public static int m213231a() {
            return 128;
        }

        /* JADX INFO: renamed from: b */
        public static int m213232b() {
            return 8;
        }

        /* JADX INFO: renamed from: c */
        public static int m213233c(int i) {
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
            k250.m144273a("type needs to be >= FIRST and <= LAST, type=", i);
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public static int m213234d() {
            return 2;
        }

        /* JADX INFO: renamed from: e */
        public static int m213235e() {
            return 1;
        }

        /* JADX INFO: renamed from: f */
        public static int m213236f() {
            return 7;
        }
    }

    /* JADX INFO: renamed from: l.y6q0$m */
    @RequiresApi(30)
    public static final class C21327m {
        /* JADX INFO: renamed from: a */
        public static int m213237a(int i) {
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
            f196604b = C21324j.f196630q;
        } else {
            f196604b = C21325k.f196631b;
        }
    }

    public y6q0(@Nullable y6q0 y6q0Var) {
        if (y6q0Var == null) {
            this.f196605a = new C21325k(this);
            return;
        }
        C21325k c21325k = y6q0Var.f196605a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && (c21325k instanceof C21324j)) {
            this.f196605a = new C21324j(this, (C21324j) c21325k);
        } else if (i >= 29 && (c21325k instanceof C21323i)) {
            this.f196605a = new C21323i(this, (C21323i) c21325k);
        } else if (i >= 28 && (c21325k instanceof C21322h)) {
            this.f196605a = new C21322h(this, (C21322h) c21325k);
        } else if (c21325k instanceof C21321g) {
            this.f196605a = new C21321g(this, (C21321g) c21325k);
        } else if (c21325k instanceof C21320f) {
            this.f196605a = new C21320f(this, (C21320f) c21325k);
        } else {
            this.f196605a = new C21325k(this);
        }
        c21325k.mo213211e(this);
    }

    /* JADX INFO: renamed from: n */
    public static rtm m213171n(@NonNull rtm rtmVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, rtmVar.f160972a - i);
        int iMax2 = Math.max(0, rtmVar.f160973b - i2);
        int iMax3 = Math.max(0, rtmVar.f160974c - i3);
        int iMax4 = Math.max(0, rtmVar.f160975d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? rtmVar : rtm.m180814b(iMax, iMax2, iMax3, iMax4);
    }

    @NonNull
    @RequiresApi(20)
    /* JADX INFO: renamed from: w */
    public static y6q0 m213172w(@NonNull WindowInsets windowInsets) {
        return m213173x(windowInsets, null);
    }

    @NonNull
    @RequiresApi(20)
    /* JADX INFO: renamed from: x */
    public static y6q0 m213173x(@NonNull WindowInsets windowInsets, @Nullable View view) {
        y6q0 y6q0Var = new y6q0((WindowInsets) tf80.m188658e(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            y6q0Var.m213192t(gbl0.m125153D(view));
            y6q0Var.m213177d(view.getRootView());
        }
        return y6q0Var;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: a */
    public y6q0 m213174a() {
        return this.f196605a.mo213226a();
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: b */
    public y6q0 m213175b() {
        return this.f196605a.mo213221b();
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: c */
    public y6q0 m213176c() {
        return this.f196605a.mo213222c();
    }

    /* JADX INFO: renamed from: d */
    public void m213177d(@NonNull View view) {
        this.f196605a.mo213210d(view);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public f4e m213178e() {
        return this.f196605a.mo213227f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y6q0) {
            return w050.m200828a(this.f196605a, ((y6q0) obj).f196605a);
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public rtm m213179f(int i) {
        return this.f196605a.mo213212g(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public int m213180g() {
        return this.f196605a.mo213223i().f160973b;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: h */
    public rtm m213181h() {
        return this.f196605a.mo213223i();
    }

    public int hashCode() {
        C21325k c21325k = this.f196605a;
        if (c21325k == null) {
            return 0;
        }
        return c21325k.hashCode();
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public int m213182i() {
        return this.f196605a.mo213213k().f160975d;
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public int m213183j() {
        return this.f196605a.mo213213k().f160972a;
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public int m213184k() {
        return this.f196605a.mo213213k().f160974c;
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public int m213185l() {
        return this.f196605a.mo213213k().f160973b;
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public boolean m213186m() {
        return !this.f196605a.mo213213k().equals(rtm.f160971e);
    }

    /* JADX INFO: renamed from: o */
    public boolean m213187o() {
        return this.f196605a.mo213224m();
    }

    /* JADX INFO: renamed from: p */
    public boolean m213188p(int i) {
        return this.f196605a.mo213215o(i);
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: q */
    public y6q0 m213189q(int i, int i2, int i3, int i4) {
        return new C21315a(this).m213197c(rtm.m180814b(i, i2, i3, i4)).m213195a();
    }

    /* JADX INFO: renamed from: r */
    public void m213190r(rtm[] rtmVarArr) {
        this.f196605a.mo213216p(rtmVarArr);
    }

    /* JADX INFO: renamed from: s */
    public void m213191s(@NonNull rtm rtmVar) {
        this.f196605a.mo213217q(rtmVar);
    }

    /* JADX INFO: renamed from: t */
    public void m213192t(@Nullable y6q0 y6q0Var) {
        this.f196605a.mo213218r(y6q0Var);
    }

    /* JADX INFO: renamed from: u */
    public void m213193u(@Nullable rtm rtmVar) {
        this.f196605a.mo213225s(rtmVar);
    }

    @Nullable
    @RequiresApi(20)
    /* JADX INFO: renamed from: v */
    public WindowInsets m213194v() {
        C21325k c21325k = this.f196605a;
        if (c21325k instanceof C21320f) {
            return ((C21320f) c21325k).f196621c;
        }
        return null;
    }

    /* JADX INFO: renamed from: l.y6q0$d */
    @RequiresApi(30)
    public static class C21318d extends C21317c {
        public C21318d() {
        }

        @Override // p149l.y6q0.C21319e
        /* JADX INFO: renamed from: c */
        public void mo213204c(int i, @NonNull rtm rtmVar) {
            this.f196613c.setInsets(C21327m.m213237a(i), rtmVar.m180817e());
        }

        public C21318d(@NonNull y6q0 y6q0Var) {
            super(y6q0Var);
        }
    }

    /* JADX INFO: renamed from: l.y6q0$h */
    @RequiresApi(28)
    public static class C21322h extends C21321g {
        public C21322h(@NonNull y6q0 y6q0Var, @NonNull WindowInsets windowInsets) {
            super(y6q0Var, windowInsets);
        }

        @Override // p149l.y6q0.C21325k
        @NonNull
        /* JADX INFO: renamed from: a */
        public y6q0 mo213226a() {
            return y6q0.m213172w(this.f196621c.consumeDisplayCutout());
        }

        @Override // p149l.y6q0.C21320f, p149l.y6q0.C21325k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21322h)) {
                return false;
            }
            C21322h c21322h = (C21322h) obj;
            return Objects.equals(this.f196621c, c21322h.f196621c) && Objects.equals(this.f196625g, c21322h.f196625g);
        }

        @Override // p149l.y6q0.C21325k
        @Nullable
        /* JADX INFO: renamed from: f */
        public f4e mo213227f() {
            return f4e.m119299e(this.f196621c.getDisplayCutout());
        }

        @Override // p149l.y6q0.C21325k
        public int hashCode() {
            return this.f196621c.hashCode();
        }

        public C21322h(@NonNull y6q0 y6q0Var, @NonNull C21322h c21322h) {
            super(y6q0Var, c21322h);
        }
    }

    /* JADX INFO: renamed from: l.y6q0$j */
    @RequiresApi(30)
    public static class C21324j extends C21323i {

        /* JADX INFO: renamed from: q */
        @NonNull
        public static final y6q0 f196630q = y6q0.m213172w(WindowInsets.CONSUMED);

        public C21324j(@NonNull y6q0 y6q0Var, @NonNull WindowInsets windowInsets) {
            super(y6q0Var, windowInsets);
        }

        @Override // p149l.y6q0.C21320f, p149l.y6q0.C21325k
        @NonNull
        /* JADX INFO: renamed from: g */
        public rtm mo213212g(int i) {
            return rtm.m180816d(this.f196621c.getInsets(C21327m.m213237a(i)));
        }

        @Override // p149l.y6q0.C21320f, p149l.y6q0.C21325k
        /* JADX INFO: renamed from: o */
        public boolean mo213215o(int i) {
            return this.f196621c.isVisible(C21327m.m213237a(i));
        }

        public C21324j(@NonNull y6q0 y6q0Var, @NonNull C21324j c21324j) {
            super(y6q0Var, c21324j);
        }

        @Override // p149l.y6q0.C21320f, p149l.y6q0.C21325k
        /* JADX INFO: renamed from: d */
        public final void mo213210d(@NonNull View view) {
        }
    }

    /* JADX INFO: renamed from: l.y6q0$b */
    @RequiresApi(api = 20)
    public static class C21316b extends C21319e {

        /* JADX INFO: renamed from: e */
        public static Field f196607e = null;

        /* JADX INFO: renamed from: f */
        public static boolean f196608f = false;

        /* JADX INFO: renamed from: g */
        public static Constructor<WindowInsets> f196609g = null;

        /* JADX INFO: renamed from: h */
        public static boolean f196610h = false;

        /* JADX INFO: renamed from: c */
        public WindowInsets f196611c;

        /* JADX INFO: renamed from: d */
        public rtm f196612d;

        public C21316b() {
            this.f196611c = m213198h();
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        private static WindowInsets m213198h() {
            if (!f196608f) {
                try {
                    f196607e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f196608f = true;
            }
            Field field = f196607e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f196610h) {
                try {
                    f196609g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f196610h = true;
            }
            Constructor<WindowInsets> constructor = f196609g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // p149l.y6q0.C21319e
        @NonNull
        /* JADX INFO: renamed from: b */
        public y6q0 mo213199b() {
            m213205a();
            y6q0 y6q0VarM213172w = y6q0.m213172w(this.f196611c);
            y6q0VarM213172w.m213190r(this.f196615b);
            y6q0VarM213172w.m213193u(this.f196612d);
            return y6q0VarM213172w;
        }

        @Override // p149l.y6q0.C21319e
        /* JADX INFO: renamed from: f */
        public void mo213200f(@NonNull rtm rtmVar) {
            WindowInsets windowInsets = this.f196611c;
            if (windowInsets != null) {
                this.f196611c = windowInsets.replaceSystemWindowInsets(rtmVar.f160972a, rtmVar.f160973b, rtmVar.f160974c, rtmVar.f160975d);
            }
        }

        public C21316b(@NonNull y6q0 y6q0Var) {
            super(y6q0Var);
            this.f196611c = y6q0Var.m213194v();
        }
    }

    /* JADX INFO: renamed from: l.y6q0$e */
    public static class C21319e {

        /* JADX INFO: renamed from: a */
        public final y6q0 f196614a;

        /* JADX INFO: renamed from: b */
        public rtm[] f196615b;

        public C21319e() {
            this(new y6q0((y6q0) null));
        }

        /* JADX INFO: renamed from: a */
        public final void m213205a() {
            rtm[] rtmVarArr = this.f196615b;
            if (rtmVarArr != null) {
                rtm rtmVarM213179f = rtmVarArr[C21326l.m213233c(1)];
                rtm rtmVarM213179f2 = this.f196615b[C21326l.m213233c(2)];
                if (rtmVarM213179f2 == null) {
                    rtmVarM213179f2 = this.f196614a.m213179f(2);
                }
                if (rtmVarM213179f == null) {
                    rtmVarM213179f = this.f196614a.m213179f(1);
                }
                mo213200f(rtm.m180813a(rtmVarM213179f, rtmVarM213179f2));
                rtm rtmVar = this.f196615b[C21326l.m213233c(16)];
                if (rtmVar != null) {
                    mo213202e(rtmVar);
                }
                rtm rtmVar2 = this.f196615b[C21326l.m213233c(32)];
                if (rtmVar2 != null) {
                    mo213201d(rtmVar2);
                }
                rtm rtmVar3 = this.f196615b[C21326l.m213233c(64)];
                if (rtmVar3 != null) {
                    mo213203g(rtmVar3);
                }
            }
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public y6q0 mo213199b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo213204c(int i, @NonNull rtm rtmVar) {
            if (this.f196615b == null) {
                this.f196615b = new rtm[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f196615b[C21326l.m213233c(i2)] = rtmVar;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void mo213200f(@NonNull rtm rtmVar) {
            throw null;
        }

        public C21319e(@NonNull y6q0 y6q0Var) {
            this.f196614a = y6q0Var;
        }

        /* JADX INFO: renamed from: d */
        public void mo213201d(@NonNull rtm rtmVar) {
        }

        /* JADX INFO: renamed from: e */
        public void mo213202e(@NonNull rtm rtmVar) {
        }

        /* JADX INFO: renamed from: g */
        public void mo213203g(@NonNull rtm rtmVar) {
        }
    }

    /* JADX INFO: renamed from: l.y6q0$f */
    @RequiresApi(20)
    public static class C21320f extends C21325k {

        /* JADX INFO: renamed from: h */
        public static boolean f196616h = false;

        /* JADX INFO: renamed from: i */
        public static Method f196617i;

        /* JADX INFO: renamed from: j */
        public static Class<?> f196618j;

        /* JADX INFO: renamed from: k */
        public static Field f196619k;

        /* JADX INFO: renamed from: l */
        public static Field f196620l;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final WindowInsets f196621c;

        /* JADX INFO: renamed from: d */
        public rtm[] f196622d;

        /* JADX INFO: renamed from: e */
        public rtm f196623e;

        /* JADX INFO: renamed from: f */
        public y6q0 f196624f;

        /* JADX INFO: renamed from: g */
        public rtm f196625g;

        public C21320f(@NonNull y6q0 y6q0Var, @NonNull C21320f c21320f) {
            this(y6q0Var, new WindowInsets(c21320f.f196621c));
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: t */
        private rtm m213206t(int i, boolean z) {
            rtm rtmVarM180813a = rtm.f160971e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    rtmVarM180813a = rtm.m180813a(rtmVarM180813a, m213219u(i2, z));
                }
            }
            return rtmVarM180813a;
        }

        /* JADX INFO: renamed from: v */
        private rtm m213207v() {
            y6q0 y6q0Var = this.f196624f;
            return y6q0Var != null ? y6q0Var.m213181h() : rtm.f160971e;
        }

        @Nullable
        /* JADX INFO: renamed from: w */
        private rtm m213208w(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                qq3.m175877a("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
                return null;
            }
            if (!f196616h) {
                m213209y();
            }
            Method method = f196617i;
            if (method != null && f196618j != null && f196619k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f196619k.get(f196620l.get(objInvoke));
                    if (rect != null) {
                        return rtm.m180815c(rect);
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
        private static void m213209y() {
            try {
                f196617i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f196618j = cls;
                f196619k = cls.getDeclaredField("mVisibleInsets");
                f196620l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f196619k.setAccessible(true);
                f196620l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f196616h = true;
        }

        @Override // p149l.y6q0.C21325k
        /* JADX INFO: renamed from: d */
        public void mo213210d(@NonNull View view) {
            rtm rtmVarM213208w = m213208w(view);
            if (rtmVarM213208w == null) {
                rtmVarM213208w = rtm.f160971e;
            }
            mo213217q(rtmVarM213208w);
        }

        @Override // p149l.y6q0.C21325k
        /* JADX INFO: renamed from: e */
        public void mo213211e(@NonNull y6q0 y6q0Var) {
            y6q0Var.m213192t(this.f196624f);
            y6q0Var.m213191s(this.f196625g);
        }

        @Override // p149l.y6q0.C21325k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f196625g, ((C21320f) obj).f196625g);
            }
            return false;
        }

        @Override // p149l.y6q0.C21325k
        @NonNull
        /* JADX INFO: renamed from: g */
        public rtm mo213212g(int i) {
            return m213206t(i, false);
        }

        @Override // p149l.y6q0.C21325k
        @NonNull
        /* JADX INFO: renamed from: k */
        public final rtm mo213213k() {
            if (this.f196623e == null) {
                this.f196623e = rtm.m180814b(this.f196621c.getSystemWindowInsetLeft(), this.f196621c.getSystemWindowInsetTop(), this.f196621c.getSystemWindowInsetRight(), this.f196621c.getSystemWindowInsetBottom());
            }
            return this.f196623e;
        }

        @Override // p149l.y6q0.C21325k
        /* JADX INFO: renamed from: n */
        public boolean mo213214n() {
            return this.f196621c.isRound();
        }

        @Override // p149l.y6q0.C21325k
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: o */
        public boolean mo213215o(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !m213220x(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p149l.y6q0.C21325k
        /* JADX INFO: renamed from: p */
        public void mo213216p(rtm[] rtmVarArr) {
            this.f196622d = rtmVarArr;
        }

        @Override // p149l.y6q0.C21325k
        /* JADX INFO: renamed from: q */
        public void mo213217q(@NonNull rtm rtmVar) {
            this.f196625g = rtmVar;
        }

        @Override // p149l.y6q0.C21325k
        /* JADX INFO: renamed from: r */
        public void mo213218r(@Nullable y6q0 y6q0Var) {
            this.f196624f = y6q0Var;
        }

        @NonNull
        /* JADX INFO: renamed from: u */
        public rtm m213219u(int i, boolean z) {
            rtm rtmVarM213181h;
            int i2;
            if (i == 1) {
                return z ? rtm.m180814b(0, Math.max(m213207v().f160973b, mo213213k().f160973b), 0, 0) : rtm.m180814b(0, mo213213k().f160973b, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    rtm rtmVarM213207v = m213207v();
                    rtm rtmVarMo213223i = mo213223i();
                    return rtm.m180814b(Math.max(rtmVarM213207v.f160972a, rtmVarMo213223i.f160972a), 0, Math.max(rtmVarM213207v.f160974c, rtmVarMo213223i.f160974c), Math.max(rtmVarM213207v.f160975d, rtmVarMo213223i.f160975d));
                }
                rtm rtmVarMo213213k = mo213213k();
                y6q0 y6q0Var = this.f196624f;
                rtmVarM213181h = y6q0Var != null ? y6q0Var.m213181h() : null;
                int iMin = rtmVarMo213213k.f160975d;
                if (rtmVarM213181h != null) {
                    iMin = Math.min(iMin, rtmVarM213181h.f160975d);
                }
                return rtm.m180814b(rtmVarMo213213k.f160972a, 0, rtmVarMo213213k.f160974c, iMin);
            }
            if (i != 8) {
                if (i == 16) {
                    return mo213229j();
                }
                if (i == 32) {
                    return mo213228h();
                }
                if (i == 64) {
                    return mo213230l();
                }
                if (i != 128) {
                    return rtm.f160971e;
                }
                y6q0 y6q0Var2 = this.f196624f;
                f4e f4eVarM213178e = y6q0Var2 != null ? y6q0Var2.m213178e() : mo213227f();
                return f4eVarM213178e != null ? rtm.m180814b(f4eVarM213178e.m119301b(), f4eVarM213178e.m119303d(), f4eVarM213178e.m119302c(), f4eVarM213178e.m119300a()) : rtm.f160971e;
            }
            rtm[] rtmVarArr = this.f196622d;
            rtmVarM213181h = rtmVarArr != null ? rtmVarArr[C21326l.m213233c(8)] : null;
            if (rtmVarM213181h != null) {
                return rtmVarM213181h;
            }
            rtm rtmVarMo213213k2 = mo213213k();
            rtm rtmVarM213207v2 = m213207v();
            int i3 = rtmVarMo213213k2.f160975d;
            if (i3 > rtmVarM213207v2.f160975d) {
                return rtm.m180814b(0, 0, 0, i3);
            }
            rtm rtmVar = this.f196625g;
            return (rtmVar == null || rtmVar.equals(rtm.f160971e) || (i2 = this.f196625g.f160975d) <= rtmVarM213207v2.f160975d) ? rtm.f160971e : rtm.m180814b(0, 0, 0, i2);
        }

        /* JADX INFO: renamed from: x */
        public boolean m213220x(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !m213219u(i, false).equals(rtm.f160971e);
        }

        public C21320f(@NonNull y6q0 y6q0Var, @NonNull WindowInsets windowInsets) {
            super(y6q0Var);
            this.f196623e = null;
            this.f196621c = windowInsets;
        }
    }

    /* JADX INFO: renamed from: l.y6q0$g */
    @RequiresApi(21)
    public static class C21321g extends C21320f {

        /* JADX INFO: renamed from: m */
        public rtm f196626m;

        public C21321g(@NonNull y6q0 y6q0Var, @NonNull C21321g c21321g) {
            super(y6q0Var, c21321g);
            this.f196626m = null;
            this.f196626m = c21321g.f196626m;
        }

        @Override // p149l.y6q0.C21325k
        @NonNull
        /* JADX INFO: renamed from: b */
        public y6q0 mo213221b() {
            return y6q0.m213172w(this.f196621c.consumeStableInsets());
        }

        @Override // p149l.y6q0.C21325k
        @NonNull
        /* JADX INFO: renamed from: c */
        public y6q0 mo213222c() {
            return y6q0.m213172w(this.f196621c.consumeSystemWindowInsets());
        }

        @Override // p149l.y6q0.C21325k
        @NonNull
        /* JADX INFO: renamed from: i */
        public final rtm mo213223i() {
            if (this.f196626m == null) {
                this.f196626m = rtm.m180814b(this.f196621c.getStableInsetLeft(), this.f196621c.getStableInsetTop(), this.f196621c.getStableInsetRight(), this.f196621c.getStableInsetBottom());
            }
            return this.f196626m;
        }

        @Override // p149l.y6q0.C21325k
        /* JADX INFO: renamed from: m */
        public boolean mo213224m() {
            return this.f196621c.isConsumed();
        }

        @Override // p149l.y6q0.C21325k
        /* JADX INFO: renamed from: s */
        public void mo213225s(@Nullable rtm rtmVar) {
            this.f196626m = rtmVar;
        }

        public C21321g(@NonNull y6q0 y6q0Var, @NonNull WindowInsets windowInsets) {
            super(y6q0Var, windowInsets);
            this.f196626m = null;
        }
    }

    /* JADX INFO: renamed from: l.y6q0$i */
    @RequiresApi(29)
    public static class C21323i extends C21322h {

        /* JADX INFO: renamed from: n */
        public rtm f196627n;

        /* JADX INFO: renamed from: o */
        public rtm f196628o;

        /* JADX INFO: renamed from: p */
        public rtm f196629p;

        public C21323i(@NonNull y6q0 y6q0Var, @NonNull WindowInsets windowInsets) {
            super(y6q0Var, windowInsets);
            this.f196627n = null;
            this.f196628o = null;
            this.f196629p = null;
        }

        @Override // p149l.y6q0.C21325k
        @NonNull
        /* JADX INFO: renamed from: h */
        public rtm mo213228h() {
            if (this.f196628o == null) {
                this.f196628o = rtm.m180816d(this.f196621c.getMandatorySystemGestureInsets());
            }
            return this.f196628o;
        }

        @Override // p149l.y6q0.C21325k
        @NonNull
        /* JADX INFO: renamed from: j */
        public rtm mo213229j() {
            if (this.f196627n == null) {
                this.f196627n = rtm.m180816d(this.f196621c.getSystemGestureInsets());
            }
            return this.f196627n;
        }

        @Override // p149l.y6q0.C21325k
        @NonNull
        /* JADX INFO: renamed from: l */
        public rtm mo213230l() {
            if (this.f196629p == null) {
                this.f196629p = rtm.m180816d(this.f196621c.getTappableElementInsets());
            }
            return this.f196629p;
        }

        public C21323i(@NonNull y6q0 y6q0Var, @NonNull C21323i c21323i) {
            super(y6q0Var, c21323i);
            this.f196627n = null;
            this.f196628o = null;
            this.f196629p = null;
        }

        @Override // p149l.y6q0.C21321g, p149l.y6q0.C21325k
        /* JADX INFO: renamed from: s */
        public void mo213225s(@Nullable rtm rtmVar) {
        }
    }

    /* JADX INFO: renamed from: l.y6q0$c */
    @RequiresApi(api = 29)
    public static class C21317c extends C21319e {

        /* JADX INFO: renamed from: c */
        public final WindowInsets.Builder f196613c;

        public C21317c(@NonNull y6q0 y6q0Var) {
            super(y6q0Var);
            WindowInsets windowInsetsM213194v = y6q0Var.m213194v();
            this.f196613c = windowInsetsM213194v != null ? e7q0.m115204a(windowInsetsM213194v) : f7q0.m119816a();
        }

        @Override // p149l.y6q0.C21319e
        @NonNull
        /* JADX INFO: renamed from: b */
        public y6q0 mo213199b() {
            m213205a();
            y6q0 y6q0VarM213172w = y6q0.m213172w(this.f196613c.build());
            y6q0VarM213172w.m213190r(this.f196615b);
            return y6q0VarM213172w;
        }

        @Override // p149l.y6q0.C21319e
        /* JADX INFO: renamed from: d */
        public void mo213201d(@NonNull rtm rtmVar) {
            this.f196613c.setMandatorySystemGestureInsets(rtmVar.m180817e());
        }

        @Override // p149l.y6q0.C21319e
        /* JADX INFO: renamed from: e */
        public void mo213202e(@NonNull rtm rtmVar) {
            this.f196613c.setSystemGestureInsets(rtmVar.m180817e());
        }

        @Override // p149l.y6q0.C21319e
        /* JADX INFO: renamed from: f */
        public void mo213200f(@NonNull rtm rtmVar) {
            this.f196613c.setSystemWindowInsets(rtmVar.m180817e());
        }

        @Override // p149l.y6q0.C21319e
        /* JADX INFO: renamed from: g */
        public void mo213203g(@NonNull rtm rtmVar) {
            this.f196613c.setTappableElementInsets(rtmVar.m180817e());
        }

        public C21317c() {
            this.f196613c = f7q0.m119816a();
        }
    }

    /* JADX INFO: renamed from: l.y6q0$k */
    public static class C21325k {

        /* JADX INFO: renamed from: b */
        @NonNull
        public static final y6q0 f196631b = new C21315a().m213195a().m213174a().m213175b().m213176c();

        /* JADX INFO: renamed from: a */
        public final y6q0 f196632a;

        public C21325k(@NonNull y6q0 y6q0Var) {
            this.f196632a = y6q0Var;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public y6q0 mo213226a() {
            return this.f196632a;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public y6q0 mo213221b() {
            return this.f196632a;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public y6q0 mo213222c() {
            return this.f196632a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21325k)) {
                return false;
            }
            C21325k c21325k = (C21325k) obj;
            return mo213214n() == c21325k.mo213214n() && mo213224m() == c21325k.mo213224m() && w050.m200828a(mo213213k(), c21325k.mo213213k()) && w050.m200828a(mo213223i(), c21325k.mo213223i()) && w050.m200828a(mo213227f(), c21325k.mo213227f());
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public f4e mo213227f() {
            return null;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public rtm mo213212g(int i) {
            return rtm.f160971e;
        }

        @NonNull
        /* JADX INFO: renamed from: h */
        public rtm mo213228h() {
            return mo213213k();
        }

        public int hashCode() {
            return w050.m200829b(Boolean.valueOf(mo213214n()), Boolean.valueOf(mo213224m()), mo213213k(), mo213223i(), mo213227f());
        }

        @NonNull
        /* JADX INFO: renamed from: i */
        public rtm mo213223i() {
            return rtm.f160971e;
        }

        @NonNull
        /* JADX INFO: renamed from: j */
        public rtm mo213229j() {
            return mo213213k();
        }

        @NonNull
        /* JADX INFO: renamed from: k */
        public rtm mo213213k() {
            return rtm.f160971e;
        }

        @NonNull
        /* JADX INFO: renamed from: l */
        public rtm mo213230l() {
            return mo213213k();
        }

        /* JADX INFO: renamed from: m */
        public boolean mo213224m() {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public boolean mo213214n() {
            return false;
        }

        /* JADX INFO: renamed from: o */
        public boolean mo213215o(int i) {
            return true;
        }

        /* JADX INFO: renamed from: d */
        public void mo213210d(@NonNull View view) {
        }

        /* JADX INFO: renamed from: e */
        public void mo213211e(@NonNull y6q0 y6q0Var) {
        }

        /* JADX INFO: renamed from: p */
        public void mo213216p(rtm[] rtmVarArr) {
        }

        /* JADX INFO: renamed from: q */
        public void mo213217q(@NonNull rtm rtmVar) {
        }

        /* JADX INFO: renamed from: r */
        public void mo213218r(@Nullable y6q0 y6q0Var) {
        }

        /* JADX INFO: renamed from: s */
        public void mo213225s(rtm rtmVar) {
        }
    }

    /* JADX INFO: renamed from: l.y6q0$a */
    public static final class C21315a {

        /* JADX INFO: renamed from: a */
        public final C21319e f196606a;

        public C21315a() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f196606a = new C21318d();
            } else if (i >= 29) {
                this.f196606a = new C21317c();
            } else {
                this.f196606a = new C21316b();
            }
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public y6q0 m213195a() {
            return this.f196606a.mo213199b();
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C21315a m213196b(int i, @NonNull rtm rtmVar) {
            this.f196606a.mo213204c(i, rtmVar);
            return this;
        }

        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: c */
        public C21315a m213197c(@NonNull rtm rtmVar) {
            this.f196606a.mo213200f(rtmVar);
            return this;
        }

        public C21315a(@NonNull y6q0 y6q0Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f196606a = new C21318d(y6q0Var);
            } else if (i >= 29) {
                this.f196606a = new C21317c(y6q0Var);
            } else {
                this.f196606a = new C21316b(y6q0Var);
            }
        }
    }

    @RequiresApi(20)
    public y6q0(@NonNull WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f196605a = new C21324j(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f196605a = new C21323i(this, windowInsets);
        } else if (i >= 28) {
            this.f196605a = new C21322h(this, windowInsets);
        } else {
            this.f196605a = new C21321g(this, windowInsets);
        }
    }
}
