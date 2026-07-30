package p006l;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hd2 {

    /* JADX INFO: renamed from: a */
    public WeakReference<View> f13817a;

    /* JADX INFO: renamed from: b */
    public int f13818b;

    /* JADX INFO: renamed from: c */
    public WeakReference<View> f13819c;

    /* JADX INFO: renamed from: f */
    public int f13822f;

    /* JADX INFO: renamed from: g */
    public String f13823g;

    /* JADX INFO: renamed from: h */
    public int f13824h;

    /* JADX INFO: renamed from: j */
    public WeakReference<ViewGroup> f13826j;

    /* JADX INFO: renamed from: k */
    public WeakReference<Activity> f13827k;

    /* JADX INFO: renamed from: o */
    public float f13831o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0796c f13832p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0795b f13833q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0794a f13834r;

    /* JADX INFO: renamed from: s */
    public Object f13835s;

    /* JADX INFO: renamed from: d */
    public long f13820d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f13821e = false;

    /* JADX INFO: renamed from: i */
    public long f13825i = 500;

    /* JADX INFO: renamed from: l */
    public long f13828l = 300;

    /* JADX INFO: renamed from: m */
    public long f13829m = 300;

    /* JADX INFO: renamed from: n */
    public int[] f13830n = new int[4];

    /* JADX INFO: renamed from: l.hd2$a */
    public interface InterfaceC0794a {
        /* JADX INFO: renamed from: a */
        Animator m16193a(View view);

        /* JADX INFO: renamed from: b */
        Animator m16194b(View view);
    }

    /* JADX INFO: renamed from: l.hd2$b */
    public interface InterfaceC0795b<T> {
        /* JADX INFO: renamed from: a */
        void m16195a(View view, T t);
    }

    /* JADX INFO: renamed from: l.hd2$c */
    public interface InterfaceC0796c {
        /* JADX INFO: renamed from: a */
        void m16196a(String str, View view, View view2);
    }

    public hd2(Activity activity) {
        this.f13827k = new WeakReference<>(activity);
        int iF0 = xdl0.F0() + t100.d(16.0f);
        int iD = t100.d(15.0f);
        int iD2 = t100.d(15.0f);
        int iD3 = t100.d(10.0f);
        this.f13831o = t100.d(5.0f);
        int[] iArr = this.f13830n;
        iArr[0] = iF0;
        iArr[1] = iD;
        iArr[2] = iD2;
        iArr[3] = iD3;
    }

    /* JADX INFO: renamed from: A */
    public hd2 m16166A(InterfaceC0796c interfaceC0796c) {
        this.f13832p = interfaceC0796c;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public View m16167a() {
        WeakReference<View> weakReference = this.f13819c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public long m16168b() {
        return this.f13820d;
    }

    /* JADX INFO: renamed from: c */
    public int m16169c() {
        return this.f13822f;
    }

    /* JADX INFO: renamed from: d */
    public String m16170d() {
        return this.f13823g;
    }

    /* JADX INFO: renamed from: e */
    public int m16171e() {
        return this.f13818b;
    }

    /* JADX INFO: renamed from: f */
    public int m16172f() {
        return this.f13824h;
    }

    /* JADX INFO: renamed from: g */
    public Context m16173g() {
        return this.f13827k.get();
    }

    /* JADX INFO: renamed from: h */
    public long m16174h() {
        return this.f13828l;
    }

    /* JADX INFO: renamed from: i */
    public long m16175i() {
        return this.f13829m;
    }

    /* JADX INFO: renamed from: j */
    public long m16176j() {
        return this.f13825i;
    }

    /* JADX INFO: renamed from: k */
    public int[] m16177k() {
        return this.f13830n;
    }

    /* JADX INFO: renamed from: l */
    public ViewGroup m16178l() {
        WeakReference<ViewGroup> weakReference = this.f13826j;
        if (weakReference != null && weakReference.get() != null) {
            return this.f13826j.get();
        }
        WeakReference<Activity> weakReference2 = this.f13827k;
        if (weakReference2 == null || weakReference2.get() == null) {
            return null;
        }
        View decorView = this.f13827k.get().getWindow().getDecorView();
        if (decorView instanceof ViewGroup) {
            return (ViewGroup) decorView;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m16179m() {
        return !this.f13821e;
    }

    /* JADX INFO: renamed from: n */
    public void m16180n(View view) {
        InterfaceC0795b interfaceC0795b = this.f13833q;
        if (interfaceC0795b != null) {
            interfaceC0795b.m16195a(view, this.f13835s);
        }
    }

    /* JADX INFO: renamed from: o */
    public hd2 m16181o(View view) {
        this.f13819c = new WeakReference<>(view);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public hd2 m16182p(InterfaceC0794a interfaceC0794a) {
        this.f13834r = interfaceC0794a;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public hd2 m16183q(long j) {
        if (j >= 0) {
            this.f13820d = j;
        }
        return this;
    }

    /* JADX INFO: renamed from: r */
    public hd2 m16184r(int i, String str) {
        this.f13822f = i;
        this.f13823g = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public hd2 m16185s(int i, boolean z) {
        this.f13818b = i;
        this.f13821e = z;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public hd2 m16186t(View view) {
        this.f13817a = new WeakReference<>(view);
        return this;
    }

    /* JADX INFO: renamed from: u */
    public hd2 m16187u(long j) {
        if (j > 0 && j < 2000) {
            this.f13828l = j;
        }
        return this;
    }

    /* JADX INFO: renamed from: v */
    public hd2 m16188v(int i) {
        this.f13830n[1] = i;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public hd2 m16189w(int i) {
        this.f13830n[2] = i;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public hd2 m16190x(int i) {
        this.f13830n[0] = i;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public <T> void m16191y(T t, InterfaceC0795b<T> interfaceC0795b) {
        this.f13833q = interfaceC0795b;
        this.f13835s = t;
    }

    /* JADX INFO: renamed from: z */
    public hd2 m16192z(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f13826j = new WeakReference<>(viewGroup);
        }
        return this;
    }
}
