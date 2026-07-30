package p149l;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class hd2 {

    /* JADX INFO: renamed from: a */
    public WeakReference<View> f107191a;

    /* JADX INFO: renamed from: b */
    public int f107192b;

    /* JADX INFO: renamed from: c */
    public WeakReference<View> f107193c;

    /* JADX INFO: renamed from: f */
    public int f107196f;

    /* JADX INFO: renamed from: g */
    public String f107197g;

    /* JADX INFO: renamed from: h */
    public int f107198h;

    /* JADX INFO: renamed from: j */
    public WeakReference<ViewGroup> f107200j;

    /* JADX INFO: renamed from: k */
    public WeakReference<Activity> f107201k;

    /* JADX INFO: renamed from: o */
    public float f107205o;

    /* JADX INFO: renamed from: p */
    public InterfaceC17285c f107206p;

    /* JADX INFO: renamed from: q */
    public InterfaceC17284b f107207q;

    /* JADX INFO: renamed from: r */
    public InterfaceC17283a f107208r;

    /* JADX INFO: renamed from: s */
    public Object f107209s;

    /* JADX INFO: renamed from: d */
    public long f107194d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f107195e = false;

    /* JADX INFO: renamed from: i */
    public long f107199i = 500;

    /* JADX INFO: renamed from: l */
    public long f107202l = 300;

    /* JADX INFO: renamed from: m */
    public long f107203m = 300;

    /* JADX INFO: renamed from: n */
    public int[] f107204n = new int[4];

    /* JADX INFO: renamed from: l.hd2$a */
    public interface InterfaceC17283a {
        /* JADX INFO: renamed from: a */
        Animator mo40466a(View view);

        /* JADX INFO: renamed from: b */
        Animator mo40467b(View view);
    }

    /* JADX INFO: renamed from: l.hd2$b */
    public interface InterfaceC17284b<T> {
        /* JADX INFO: renamed from: a */
        void mo97843a(View view, T t);
    }

    /* JADX INFO: renamed from: l.hd2$c */
    public interface InterfaceC17285c {
        /* JADX INFO: renamed from: a */
        void mo130565a(String str, View view, View view2);
    }

    public hd2(Activity activity) {
        this.f107201k = new WeakReference<>(activity);
        int iM208331F0 = xdl0.m208331F0() + t100.m186890d(16.0f);
        int iM186890d = t100.m186890d(15.0f);
        int iM186890d2 = t100.m186890d(15.0f);
        int iM186890d3 = t100.m186890d(10.0f);
        this.f107205o = t100.m186890d(5.0f);
        int[] iArr = this.f107204n;
        iArr[0] = iM208331F0;
        iArr[1] = iM186890d;
        iArr[2] = iM186890d2;
        iArr[3] = iM186890d3;
    }

    /* JADX INFO: renamed from: A */
    public hd2 m130538A(InterfaceC17285c interfaceC17285c) {
        this.f107206p = interfaceC17285c;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public View m130539a() {
        WeakReference<View> weakReference = this.f107193c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public long m130540b() {
        return this.f107194d;
    }

    /* JADX INFO: renamed from: c */
    public int m130541c() {
        return this.f107196f;
    }

    /* JADX INFO: renamed from: d */
    public String m130542d() {
        return this.f107197g;
    }

    /* JADX INFO: renamed from: e */
    public int m130543e() {
        return this.f107192b;
    }

    /* JADX INFO: renamed from: f */
    public int m130544f() {
        return this.f107198h;
    }

    /* JADX INFO: renamed from: g */
    public Context m130545g() {
        return this.f107201k.get();
    }

    /* JADX INFO: renamed from: h */
    public long m130546h() {
        return this.f107202l;
    }

    /* JADX INFO: renamed from: i */
    public long m130547i() {
        return this.f107203m;
    }

    /* JADX INFO: renamed from: j */
    public long m130548j() {
        return this.f107199i;
    }

    /* JADX INFO: renamed from: k */
    public int[] m130549k() {
        return this.f107204n;
    }

    /* JADX INFO: renamed from: l */
    public ViewGroup m130550l() {
        WeakReference<ViewGroup> weakReference = this.f107200j;
        if (weakReference != null && weakReference.get() != null) {
            return this.f107200j.get();
        }
        WeakReference<Activity> weakReference2 = this.f107201k;
        if (weakReference2 == null || weakReference2.get() == null) {
            return null;
        }
        View decorView = this.f107201k.get().getWindow().getDecorView();
        if (decorView instanceof ViewGroup) {
            return (ViewGroup) decorView;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m130551m() {
        return !this.f107195e;
    }

    /* JADX INFO: renamed from: n */
    public void m130552n(View view) {
        InterfaceC17284b interfaceC17284b = this.f107207q;
        if (interfaceC17284b != null) {
            interfaceC17284b.mo97843a(view, this.f107209s);
        }
    }

    /* JADX INFO: renamed from: o */
    public hd2 m130553o(View view) {
        this.f107193c = new WeakReference<>(view);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public hd2 m130554p(InterfaceC17283a interfaceC17283a) {
        this.f107208r = interfaceC17283a;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public hd2 m130555q(long j) {
        if (j >= 0) {
            this.f107194d = j;
        }
        return this;
    }

    /* JADX INFO: renamed from: r */
    public hd2 m130556r(int i, String str) {
        this.f107196f = i;
        this.f107197g = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public hd2 m130557s(int i, boolean z) {
        this.f107192b = i;
        this.f107195e = z;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public hd2 m130558t(View view) {
        this.f107191a = new WeakReference<>(view);
        return this;
    }

    /* JADX INFO: renamed from: u */
    public hd2 m130559u(long j) {
        if (j > 0 && j < 2000) {
            this.f107202l = j;
        }
        return this;
    }

    /* JADX INFO: renamed from: v */
    public hd2 m130560v(int i) {
        this.f107204n[1] = i;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public hd2 m130561w(int i) {
        this.f107204n[2] = i;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public hd2 m130562x(int i) {
        this.f107204n[0] = i;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public <T> void m130563y(T t, InterfaceC17284b<T> interfaceC17284b) {
        this.f107207q = interfaceC17284b;
        this.f107209s = t;
    }

    /* JADX INFO: renamed from: z */
    public hd2 m130564z(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f107200j = new WeakReference<>(viewGroup);
        }
        return this;
    }
}
