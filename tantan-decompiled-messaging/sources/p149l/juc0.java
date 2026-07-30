package p149l;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.manager.InterfaceC1101c;
import com.bumptech.glide.manager.InterfaceC1102d;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class juc0 implements ComponentCallbacks2, hcr {

    /* JADX INFO: renamed from: m */
    private static final muc0 f119755m = muc0.m156387l0(Bitmap.class).m199409Q();

    /* JADX INFO: renamed from: n */
    private static final muc0 f119756n = muc0.m156387l0(lkj.class).m199409Q();

    /* JADX INFO: renamed from: o */
    private static final muc0 f119757o = muc0.m156388m0(p2e.f146847c).m199416Y(Priority.LOW).m199426f0(true);

    /* JADX INFO: renamed from: a */
    protected final ComponentCallbacks2C1053a f119758a;

    /* JADX INFO: renamed from: b */
    protected final Context f119759b;

    /* JADX INFO: renamed from: c */
    final ecr f119760c;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    private final bvc0 f119761d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    private final luc0 f119762e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("this")
    private final fci0 f119763f;

    /* JADX INFO: renamed from: g */
    private final Runnable f119764g;

    /* JADX INFO: renamed from: h */
    private final Handler f119765h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1101c f119766i;

    /* JADX INFO: renamed from: j */
    private final CopyOnWriteArrayList<iuc0<Object>> f119767j;

    /* JADX INFO: renamed from: k */
    @GuardedBy("this")
    private muc0 f119768k;

    /* JADX INFO: renamed from: l */
    private boolean f119769l;

    /* JADX INFO: renamed from: l.juc0$a */
    public class RunnableC17863a implements Runnable {
        public RunnableC17863a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            juc0 juc0Var = juc0.this;
            juc0Var.f119760c.mo5587b(juc0Var);
        }
    }

    /* JADX INFO: renamed from: l.juc0$b */
    public class C17864b implements InterfaceC1101c.a {

        /* JADX INFO: renamed from: a */
        @GuardedBy("RequestManager.this")
        private final bvc0 f119771a;

        public C17864b(bvc0 bvc0Var) {
            this.f119771a = bvc0Var;
        }

        @Override // com.bumptech.glide.manager.InterfaceC1101c.a
        /* JADX INFO: renamed from: a */
        public void mo5591a(boolean z) {
            if (z) {
                synchronized (juc0.this) {
                    this.f119771a.m104018e();
                }
            }
        }
    }

    public juc0(ComponentCallbacks2C1053a componentCallbacks2C1053a, ecr ecrVar, luc0 luc0Var, bvc0 bvc0Var, InterfaceC1102d interfaceC1102d, Context context) {
        this.f119763f = new fci0();
        RunnableC17863a runnableC17863a = new RunnableC17863a();
        this.f119764g = runnableC17863a;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f119765h = handler;
        this.f119758a = componentCallbacks2C1053a;
        this.f119760c = ecrVar;
        this.f119762e = luc0Var;
        this.f119761d = bvc0Var;
        this.f119759b = context;
        InterfaceC1101c interfaceC1101cMo5592a = interfaceC1102d.mo5592a(context.getApplicationContext(), new C17864b(bvc0Var));
        this.f119766i = interfaceC1101cMo5592a;
        if (sck0.m183416p()) {
            handler.post(runnableC17863a);
        } else {
            ecrVar.mo5587b(this);
        }
        ecrVar.mo5587b(interfaceC1101cMo5592a);
        this.f119767j = new CopyOnWriteArrayList<>(componentCallbacks2C1053a.m5324i().m5335c());
        m143281y(componentCallbacks2C1053a.m5324i().m5336d());
        componentCallbacks2C1053a.m5327p(this);
    }

    /* JADX INFO: renamed from: B */
    private void m143264B(@NonNull cci0<?> cci0Var) {
        boolean zM143265A = m143265A(cci0Var);
        ttc0 ttc0VarMo103909c = cci0Var.mo103909c();
        if (zM143265A || this.f119758a.m5328q(cci0Var) || ttc0VarMo103909c == null) {
            return;
        }
        cci0Var.mo103912g(null);
        ttc0VarMo103909c.clear();
    }

    /* JADX INFO: renamed from: A */
    public synchronized boolean m143265A(@NonNull cci0<?> cci0Var) {
        ttc0 ttc0VarMo103909c = cci0Var.mo103909c();
        if (ttc0VarMo103909c == null) {
            return true;
        }
        if (!this.f119761d.m104014a(ttc0VarMo103909c)) {
            return false;
        }
        this.f119763f.m120430m(cci0Var);
        cci0Var.mo103912g(null);
        return true;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: b */
    public <ResourceType> vtc0<ResourceType> m143266b(@NonNull Class<ResourceType> cls) {
        return new vtc0<>(this.f119758a, this, cls, this.f119759b);
    }

    @Override // p149l.hcr
    /* JADX INFO: renamed from: d */
    public synchronized void mo5559d() {
        m143279w();
        this.f119763f.mo5559d();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: f */
    public vtc0<Bitmap> m143267f() {
        return m143266b(Bitmap.class).mo199417a(f119755m);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: h */
    public vtc0<Drawable> m143268h() {
        return m143266b(Drawable.class);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: m */
    public vtc0<lkj> m143269m() {
        return m143266b(lkj.class).mo199417a(f119756n);
    }

    /* JADX INFO: renamed from: n */
    public void m143270n(@Nullable cci0<?> cci0Var) {
        if (cci0Var == null) {
            return;
        }
        m143264B(cci0Var);
    }

    /* JADX INFO: renamed from: o */
    public List<iuc0<Object>> m143271o() {
        return this.f119767j;
    }

    @Override // p149l.hcr
    public synchronized void onDestroy() {
        try {
            this.f119763f.onDestroy();
            Iterator<cci0<?>> it = this.f119763f.m120428f().iterator();
            while (it.hasNext()) {
                m143270n(it.next());
            }
            this.f119763f.m120427b();
            this.f119761d.m104015b();
            this.f119760c.mo5586a(this);
            this.f119760c.mo5586a(this.f119766i);
            this.f119765h.removeCallbacks(this.f119764g);
            this.f119758a.m5330t(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.hcr
    public synchronized void onStart() {
        m143280x();
        this.f119763f.onStart();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.f119769l) {
            m143278v();
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized muc0 m143272p() {
        return this.f119768k;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public <T> w8j0<?, T> m143273q(Class<T> cls) {
        return this.f119758a.m5324i().m5337e(cls);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: r */
    public vtc0<Drawable> m143274r(@Nullable File file) {
        return m143268h().m199994y0(file);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: s */
    public vtc0<Drawable> m143275s(@Nullable @DrawableRes @RawRes Integer num) {
        return m143268h().m199995z0(num);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: t */
    public vtc0<Drawable> m143276t(@Nullable String str) {
        return m143268h().m199985B0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f119761d + ", treeNode=" + this.f119762e + "}";
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m143277u() {
        this.f119761d.m104016c();
    }

    /* JADX INFO: renamed from: v */
    public synchronized void m143278v() {
        m143277u();
        Iterator<juc0> it = this.f119762e.mo5572a().iterator();
        while (it.hasNext()) {
            it.next().m143277u();
        }
    }

    /* JADX INFO: renamed from: w */
    public synchronized void m143279w() {
        this.f119761d.m104017d();
    }

    /* JADX INFO: renamed from: x */
    public synchronized void m143280x() {
        this.f119761d.m104019f();
    }

    /* JADX INFO: renamed from: y */
    public synchronized void m143281y(@NonNull muc0 muc0Var) {
        this.f119768k = muc0Var.clone().m199418b();
    }

    /* JADX INFO: renamed from: z */
    public synchronized void m143282z(@NonNull cci0<?> cci0Var, @NonNull ttc0 ttc0Var) {
        this.f119763f.m120429h(cci0Var);
        this.f119761d.m104020g(ttc0Var);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    public juc0(@NonNull ComponentCallbacks2C1053a componentCallbacks2C1053a, @NonNull ecr ecrVar, @NonNull luc0 luc0Var, @NonNull Context context) {
        this(componentCallbacks2C1053a, ecrVar, luc0Var, new bvc0(), componentCallbacks2C1053a.m5322g(), context);
    }
}
