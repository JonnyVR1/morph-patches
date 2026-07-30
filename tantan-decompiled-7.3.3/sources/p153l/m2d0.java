package p153l;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.manager.InterfaceC1118c;
import com.bumptech.glide.manager.InterfaceC1119d;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class m2d0 implements ComponentCallbacks2, ier {

    /* JADX INFO: renamed from: l */
    private static final p2d0 f134549l = p2d0.m170343m0(Bitmap.class).m155538R();

    /* JADX INFO: renamed from: m */
    private static final p2d0 f134550m = p2d0.m170343m0(bnj.class).m155538R();

    /* JADX INFO: renamed from: n */
    private static final p2d0 f134551n = p2d0.m170344n0(d4e.f85035c).m155545Z(Priority.LOW).m155554g0(true);

    /* JADX INFO: renamed from: a */
    protected final ComponentCallbacks2C1057a f134552a;

    /* JADX INFO: renamed from: b */
    protected final Context f134553b;

    /* JADX INFO: renamed from: c */
    final fer f134554c;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    private final e3d0 f134555d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    private final o2d0 f134556e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("this")
    private final fli0 f134557f;

    /* JADX INFO: renamed from: g */
    private final Runnable f134558g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC1118c f134559h;

    /* JADX INFO: renamed from: i */
    private final CopyOnWriteArrayList<l2d0<Object>> f134560i;

    /* JADX INFO: renamed from: j */
    @GuardedBy("this")
    private p2d0 f134561j;

    /* JADX INFO: renamed from: k */
    private boolean f134562k;

    /* JADX INFO: renamed from: l.m2d0$a */
    public class RunnableC18529a implements Runnable {
        public RunnableC18529a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m2d0 m2d0Var = m2d0.this;
            m2d0Var.f134554c.mo5625b(m2d0Var);
        }
    }

    /* JADX INFO: renamed from: l.m2d0$b */
    public class C18530b implements InterfaceC1118c.a {

        /* JADX INFO: renamed from: a */
        @GuardedBy("RequestManager.this")
        private final e3d0 f134564a;

        public C18530b(e3d0 e3d0Var) {
            this.f134564a = e3d0Var;
        }

        @Override // com.bumptech.glide.manager.InterfaceC1118c.a
        /* JADX INFO: renamed from: a */
        public void mo5629a(boolean z) {
            if (z) {
                synchronized (m2d0.this) {
                    this.f134564a.m119273e();
                }
            }
        }
    }

    public m2d0(ComponentCallbacks2C1057a componentCallbacks2C1057a, fer ferVar, o2d0 o2d0Var, e3d0 e3d0Var, InterfaceC1119d interfaceC1119d, Context context) {
        this.f134557f = new fli0();
        RunnableC18529a runnableC18529a = new RunnableC18529a();
        this.f134558g = runnableC18529a;
        this.f134552a = componentCallbacks2C1057a;
        this.f134554c = ferVar;
        this.f134556e = o2d0Var;
        this.f134555d = e3d0Var;
        this.f134553b = context;
        InterfaceC1118c interfaceC1118cMo5630a = interfaceC1119d.mo5630a(context.getApplicationContext(), new C18530b(e3d0Var));
        this.f134559h = interfaceC1118cMo5630a;
        if (ylk0.m216594r()) {
            ylk0.m216598v(runnableC18529a);
        } else {
            ferVar.mo5625b(this);
        }
        ferVar.mo5625b(interfaceC1118cMo5630a);
        this.f134560i = new CopyOnWriteArrayList<>(componentCallbacks2C1057a.m5333i().m5344c());
        m156826y(componentCallbacks2C1057a.m5333i().m5345d());
        componentCallbacks2C1057a.m5336o(this);
    }

    /* JADX INFO: renamed from: B */
    private void m156809B(@NonNull cli0<?> cli0Var) {
        boolean zM156810A = m156810A(cli0Var);
        y1d0 y1d0VarMo95327c = cli0Var.mo95327c();
        if (zM156810A || this.f134552a.m5337p(cli0Var) || y1d0VarMo95327c == null) {
            return;
        }
        cli0Var.mo95328g(null);
        y1d0VarMo95327c.clear();
    }

    /* JADX INFO: renamed from: A */
    public synchronized boolean m156810A(@NonNull cli0<?> cli0Var) {
        y1d0 y1d0VarMo95327c = cli0Var.mo95327c();
        if (y1d0VarMo95327c == null) {
            return true;
        }
        if (!this.f134555d.m119269a(y1d0VarMo95327c)) {
            return false;
        }
        this.f134557f.m126143m(cli0Var);
        cli0Var.mo95328g(null);
        return true;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: b */
    public <ResourceType> a2d0<ResourceType> m156811b(@NonNull Class<ResourceType> cls) {
        return new a2d0<>(this.f134552a, this, cls, this.f134553b);
    }

    @Override // p153l.ier
    /* JADX INFO: renamed from: d */
    public synchronized void mo5633d() {
        m156824w();
        this.f134557f.mo5633d();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: f */
    public a2d0<Bitmap> m156812f() {
        return m156811b(Bitmap.class).mo95645a(f134549l);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: h */
    public a2d0<Drawable> m156813h() {
        return m156811b(Drawable.class);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: m */
    public a2d0<bnj> m156814m() {
        return m156811b(bnj.class).mo95645a(f134550m);
    }

    /* JADX INFO: renamed from: n */
    public void m156815n(@Nullable cli0<?> cli0Var) {
        if (cli0Var == null) {
            return;
        }
        m156809B(cli0Var);
    }

    /* JADX INFO: renamed from: o */
    public List<l2d0<Object>> m156816o() {
        return this.f134560i;
    }

    @Override // p153l.ier
    public synchronized void onDestroy() {
        try {
            this.f134557f.onDestroy();
            Iterator<cli0<?>> it = this.f134557f.m126141f().iterator();
            while (it.hasNext()) {
                m156815n(it.next());
            }
            this.f134557f.m126140b();
            this.f134555d.m119270b();
            this.f134554c.mo5624a(this);
            this.f134554c.mo5624a(this.f134559h);
            ylk0.m216599w(this.f134558g);
            this.f134552a.m5339s(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ier
    public synchronized void onStart() {
        m156825x();
        this.f134557f.onStart();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.f134562k) {
            m156823v();
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized p2d0 m156817p() {
        return this.f134561j;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public <T> aij0<?, T> m156818q(Class<T> cls) {
        return this.f134552a.m5333i().m5346e(cls);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: r */
    public a2d0<Drawable> m156819r(@Nullable File file) {
        return m156813h().m95639A0(file);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: s */
    public a2d0<Drawable> m156820s(@Nullable @DrawableRes @RawRes Integer num) {
        return m156813h().m95640B0(num);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: t */
    public a2d0<Drawable> m156821t(@Nullable String str) {
        return m156813h().m95642D0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f134555d + ", treeNode=" + this.f134556e + "}";
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m156822u() {
        this.f134555d.m119271c();
    }

    /* JADX INFO: renamed from: v */
    public synchronized void m156823v() {
        m156822u();
        Iterator<m2d0> it = this.f134556e.mo5610a().iterator();
        while (it.hasNext()) {
            it.next().m156822u();
        }
    }

    /* JADX INFO: renamed from: w */
    public synchronized void m156824w() {
        this.f134555d.m119272d();
    }

    /* JADX INFO: renamed from: x */
    public synchronized void m156825x() {
        this.f134555d.m119274f();
    }

    /* JADX INFO: renamed from: y */
    public synchronized void m156826y(@NonNull p2d0 p2d0Var) {
        this.f134561j = p2d0Var.clone().m155546b();
    }

    /* JADX INFO: renamed from: z */
    public synchronized void m156827z(@NonNull cli0<?> cli0Var, @NonNull y1d0 y1d0Var) {
        this.f134557f.m126142h(cli0Var);
        this.f134555d.m119275g(y1d0Var);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    public m2d0(@NonNull ComponentCallbacks2C1057a componentCallbacks2C1057a, @NonNull fer ferVar, @NonNull o2d0 o2d0Var, @NonNull Context context) {
        this(componentCallbacks2C1057a, ferVar, o2d0Var, new e3d0(), componentCallbacks2C1057a.m5331g(), context);
    }
}
