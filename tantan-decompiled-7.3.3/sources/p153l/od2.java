package p153l;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class od2 {

    /* JADX INFO: renamed from: a */
    public WeakReference<View> f146826a;

    /* JADX INFO: renamed from: b */
    public int f146827b;

    /* JADX INFO: renamed from: c */
    public WeakReference<View> f146828c;

    /* JADX INFO: renamed from: f */
    public int f146831f;

    /* JADX INFO: renamed from: g */
    public String f146832g;

    /* JADX INFO: renamed from: h */
    public int f146833h;

    /* JADX INFO: renamed from: j */
    public WeakReference<ViewGroup> f146835j;

    /* JADX INFO: renamed from: k */
    public WeakReference<Activity> f146836k;

    /* JADX INFO: renamed from: o */
    public float f146840o;

    /* JADX INFO: renamed from: p */
    public InterfaceC19108c f146841p;

    /* JADX INFO: renamed from: q */
    public InterfaceC19107b f146842q;

    /* JADX INFO: renamed from: r */
    public InterfaceC19106a f146843r;

    /* JADX INFO: renamed from: s */
    public Object f146844s;

    /* JADX INFO: renamed from: d */
    public long f146829d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f146830e = false;

    /* JADX INFO: renamed from: i */
    public long f146834i = 500;

    /* JADX INFO: renamed from: l */
    public long f146837l = 300;

    /* JADX INFO: renamed from: m */
    public long f146838m = 300;

    /* JADX INFO: renamed from: n */
    public int[] f146839n = new int[4];

    /* JADX INFO: renamed from: l.od2$a */
    public interface InterfaceC19106a {
        /* JADX INFO: renamed from: a */
        Animator mo41477a(View view);

        /* JADX INFO: renamed from: b */
        Animator mo41478b(View view);
    }

    /* JADX INFO: renamed from: l.od2$b */
    public interface InterfaceC19107b<T> {
        /* JADX INFO: renamed from: a */
        void mo99267a(View view, T t);
    }

    /* JADX INFO: renamed from: l.od2$c */
    public interface InterfaceC19108c {
        /* JADX INFO: renamed from: a */
        void mo167276a(String str, View view, View view2);
    }

    public od2(Activity activity) {
        this.f146836k = new WeakReference<>(activity);
        int iM105511F0 = bnl0.m105511F0() + qa00.m175859d(16.0f);
        int iM175859d = qa00.m175859d(15.0f);
        int iM175859d2 = qa00.m175859d(15.0f);
        int iM175859d3 = qa00.m175859d(10.0f);
        this.f146840o = qa00.m175859d(5.0f);
        int[] iArr = this.f146839n;
        iArr[0] = iM105511F0;
        iArr[1] = iM175859d;
        iArr[2] = iM175859d2;
        iArr[3] = iM175859d3;
    }

    /* JADX INFO: renamed from: A */
    public od2 m167249A(InterfaceC19108c interfaceC19108c) {
        this.f146841p = interfaceC19108c;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public View m167250a() {
        WeakReference<View> weakReference = this.f146828c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public long m167251b() {
        return this.f146829d;
    }

    /* JADX INFO: renamed from: c */
    public int m167252c() {
        return this.f146831f;
    }

    /* JADX INFO: renamed from: d */
    public String m167253d() {
        return this.f146832g;
    }

    /* JADX INFO: renamed from: e */
    public int m167254e() {
        return this.f146827b;
    }

    /* JADX INFO: renamed from: f */
    public int m167255f() {
        return this.f146833h;
    }

    /* JADX INFO: renamed from: g */
    public Context m167256g() {
        return this.f146836k.get();
    }

    /* JADX INFO: renamed from: h */
    public long m167257h() {
        return this.f146837l;
    }

    /* JADX INFO: renamed from: i */
    public long m167258i() {
        return this.f146838m;
    }

    /* JADX INFO: renamed from: j */
    public long m167259j() {
        return this.f146834i;
    }

    /* JADX INFO: renamed from: k */
    public int[] m167260k() {
        return this.f146839n;
    }

    /* JADX INFO: renamed from: l */
    public ViewGroup m167261l() {
        WeakReference<ViewGroup> weakReference = this.f146835j;
        if (weakReference != null && weakReference.get() != null) {
            return this.f146835j.get();
        }
        WeakReference<Activity> weakReference2 = this.f146836k;
        if (weakReference2 == null || weakReference2.get() == null) {
            return null;
        }
        View decorView = this.f146836k.get().getWindow().getDecorView();
        if (decorView instanceof ViewGroup) {
            return (ViewGroup) decorView;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m167262m() {
        return !this.f146830e;
    }

    /* JADX INFO: renamed from: n */
    public void m167263n(View view) {
        InterfaceC19107b interfaceC19107b = this.f146842q;
        if (interfaceC19107b != null) {
            interfaceC19107b.mo99267a(view, this.f146844s);
        }
    }

    /* JADX INFO: renamed from: o */
    public od2 m167264o(View view) {
        this.f146828c = new WeakReference<>(view);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public od2 m167265p(InterfaceC19106a interfaceC19106a) {
        this.f146843r = interfaceC19106a;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public od2 m167266q(long j) {
        if (j >= 0) {
            this.f146829d = j;
        }
        return this;
    }

    /* JADX INFO: renamed from: r */
    public od2 m167267r(int i, String str) {
        this.f146831f = i;
        this.f146832g = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public od2 m167268s(int i, boolean z) {
        this.f146827b = i;
        this.f146830e = z;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public od2 m167269t(View view) {
        this.f146826a = new WeakReference<>(view);
        return this;
    }

    /* JADX INFO: renamed from: u */
    public od2 m167270u(long j) {
        if (j > 0 && j < 2000) {
            this.f146837l = j;
        }
        return this;
    }

    /* JADX INFO: renamed from: v */
    public od2 m167271v(int i) {
        this.f146839n[1] = i;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public od2 m167272w(int i) {
        this.f146839n[2] = i;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public od2 m167273x(int i) {
        this.f146839n[0] = i;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public <T> void m167274y(T t, InterfaceC19107b<T> interfaceC19107b) {
        this.f146842q = interfaceC19107b;
        this.f146844s = t;
    }

    /* JADX INFO: renamed from: z */
    public od2 m167275z(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f146835j = new WeakReference<>(viewGroup);
        }
        return this;
    }
}
