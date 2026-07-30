package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.C1055c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1071h;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p149l.cci0;
import p149l.iuc0;
import p149l.kxv;
import p149l.lbe;
import p149l.ovf0;
import p149l.qkq0;
import p149l.rvc0;
import p149l.sck0;
import p149l.t8j0;
import p149l.ttc0;
import p149l.tvc0;
import p149l.vq2;
import p149l.yif0;

/* JADX INFO: loaded from: classes.dex */
public final class SingleRequest<R> implements ttc0, yif0, tvc0 {

    /* JADX INFO: renamed from: D */
    private static final boolean f4660D = Log.isLoggable("Request", 2);

    /* JADX INFO: renamed from: A */
    @GuardedBy("requestLock")
    private int f4661A;

    /* JADX INFO: renamed from: B */
    @GuardedBy("requestLock")
    private boolean f4662B;

    /* JADX INFO: renamed from: C */
    @Nullable
    private RuntimeException f4663C;

    /* JADX INFO: renamed from: a */
    @Nullable
    private final String f4664a;

    /* JADX INFO: renamed from: b */
    private final ovf0 f4665b;

    /* JADX INFO: renamed from: c */
    private final Object f4666c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final iuc0<R> f4667d;

    /* JADX INFO: renamed from: e */
    private final RequestCoordinator f4668e;

    /* JADX INFO: renamed from: f */
    private final Context f4669f;

    /* JADX INFO: renamed from: g */
    private final C1055c f4670g;

    /* JADX INFO: renamed from: h */
    @Nullable
    private final Object f4671h;

    /* JADX INFO: renamed from: i */
    private final Class<R> f4672i;

    /* JADX INFO: renamed from: j */
    private final vq2<?> f4673j;

    /* JADX INFO: renamed from: k */
    private final int f4674k;

    /* JADX INFO: renamed from: l */
    private final int f4675l;

    /* JADX INFO: renamed from: m */
    private final Priority f4676m;

    /* JADX INFO: renamed from: n */
    private final cci0<R> f4677n;

    /* JADX INFO: renamed from: o */
    @Nullable
    private final List<iuc0<R>> f4678o;

    /* JADX INFO: renamed from: p */
    private final t8j0<? super R> f4679p;

    /* JADX INFO: renamed from: q */
    private final Executor f4680q;

    /* JADX INFO: renamed from: r */
    @GuardedBy("requestLock")
    private rvc0<R> f4681r;

    /* JADX INFO: renamed from: s */
    @GuardedBy("requestLock")
    private C1071h.d f4682s;

    /* JADX INFO: renamed from: t */
    @GuardedBy("requestLock")
    private long f4683t;

    /* JADX INFO: renamed from: u */
    private volatile C1071h f4684u;

    /* JADX INFO: renamed from: v */
    @GuardedBy("requestLock")
    private Status f4685v;

    /* JADX INFO: renamed from: w */
    @Nullable
    @GuardedBy("requestLock")
    private Drawable f4686w;

    /* JADX INFO: renamed from: x */
    @Nullable
    @GuardedBy("requestLock")
    private Drawable f4687x;

    /* JADX INFO: renamed from: y */
    @Nullable
    @GuardedBy("requestLock")
    private Drawable f4688y;

    /* JADX INFO: renamed from: z */
    @GuardedBy("requestLock")
    private int f4689z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private SingleRequest(Context context, C1055c c1055c, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, vq2<?> vq2Var, int i, int i2, Priority priority, cci0<R> cci0Var, @Nullable iuc0<R> iuc0Var, @Nullable List<iuc0<R>> list, RequestCoordinator requestCoordinator, C1071h c1071h, t8j0<? super R> t8j0Var, Executor executor) {
        this.f4664a = f4660D ? String.valueOf(super.hashCode()) : null;
        this.f4665b = ovf0.m166181a();
        this.f4666c = obj;
        this.f4669f = context;
        this.f4670g = c1055c;
        this.f4671h = obj2;
        this.f4672i = cls;
        this.f4673j = vq2Var;
        this.f4674k = i;
        this.f4675l = i2;
        this.f4676m = priority;
        this.f4677n = cci0Var;
        this.f4667d = iuc0Var;
        this.f4678o = list;
        this.f4668e = requestCoordinator;
        this.f4684u = c1071h;
        this.f4679p = t8j0Var;
        this.f4680q = executor;
        this.f4685v = Status.PENDING;
        if (this.f4663C == null && c1055c.m5341i()) {
            this.f4663C = new RuntimeException("Glide request origin trace");
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: h */
    private void m5621h() {
        if (this.f4662B) {
            qkq0.m175383a("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: j */
    private boolean m5622j() {
        RequestCoordinator requestCoordinator = this.f4668e;
        return requestCoordinator == null || requestCoordinator.mo5616b(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: k */
    private boolean m5623k() {
        RequestCoordinator requestCoordinator = this.f4668e;
        return requestCoordinator == null || requestCoordinator.mo5620h(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: l */
    private boolean m5624l() {
        RequestCoordinator requestCoordinator = this.f4668e;
        return requestCoordinator == null || requestCoordinator.mo5619f(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: m */
    private void m5625m() {
        m5621h();
        this.f4665b.mo166183c();
        this.f4677n.mo103907a(this);
        C1071h.d dVar = this.f4682s;
        if (dVar != null) {
            dVar.m5453a();
            this.f4682s = null;
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: n */
    private Drawable m5626n() {
        if (this.f4686w == null) {
            Drawable drawableM199435m = this.f4673j.m199435m();
            this.f4686w = drawableM199435m;
            if (drawableM199435m == null && this.f4673j.m199434l() > 0) {
                this.f4686w = m5630r(this.f4673j.m199434l());
            }
        }
        return this.f4686w;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: o */
    private Drawable m5627o() {
        if (this.f4688y == null) {
            Drawable drawableM199436n = this.f4673j.m199436n();
            this.f4688y = drawableM199436n;
            if (drawableM199436n == null && this.f4673j.m199437o() > 0) {
                this.f4688y = m5630r(this.f4673j.m199437o());
            }
        }
        return this.f4688y;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: p */
    private Drawable m5628p() {
        if (this.f4687x == null) {
            Drawable drawableM199442t = this.f4673j.m199442t();
            this.f4687x = drawableM199442t;
            if (drawableM199442t == null && this.f4673j.m199443u() > 0) {
                this.f4687x = m5630r(this.f4673j.m199443u());
            }
        }
        return this.f4687x;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: q */
    private boolean m5629q() {
        RequestCoordinator requestCoordinator = this.f4668e;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo5615a();
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: r */
    private Drawable m5630r(@DrawableRes int i) {
        return lbe.m149218a(this.f4670g, i, this.f4673j.m199448z() != null ? this.f4673j.m199448z() : this.f4669f.getTheme());
    }

    /* JADX INFO: renamed from: s */
    private void m5631s(String str) {
    }

    /* JADX INFO: renamed from: t */
    private static int m5632t(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: u */
    private void m5633u() {
        RequestCoordinator requestCoordinator = this.f4668e;
        if (requestCoordinator != null) {
            requestCoordinator.mo5617c(this);
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: v */
    private void m5634v() {
        RequestCoordinator requestCoordinator = this.f4668e;
        if (requestCoordinator != null) {
            requestCoordinator.mo5618d(this);
        }
    }

    /* JADX INFO: renamed from: w */
    public static <R> SingleRequest<R> m5635w(Context context, C1055c c1055c, Object obj, Object obj2, Class<R> cls, vq2<?> vq2Var, int i, int i2, Priority priority, cci0<R> cci0Var, iuc0<R> iuc0Var, @Nullable List<iuc0<R>> list, RequestCoordinator requestCoordinator, C1071h c1071h, t8j0<? super R> t8j0Var, Executor executor) {
        return new SingleRequest<>(context, c1055c, obj, obj2, cls, vq2Var, i, i2, priority, cci0Var, iuc0Var, list, requestCoordinator, c1071h, t8j0Var, executor);
    }

    /* JADX INFO: renamed from: x */
    private void m5636x(GlideException glideException, int i) {
        boolean zMo103908b;
        this.f4665b.mo166183c();
        synchronized (this.f4666c) {
            try {
                glideException.setOrigin(this.f4663C);
                int iM5339g = this.f4670g.m5339g();
                if (iM5339g <= i) {
                    Objects.toString(this.f4671h);
                    if (iM5339g <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f4682s = null;
                this.f4685v = Status.FAILED;
                boolean z = true;
                this.f4662B = true;
                try {
                    List<iuc0<R>> list = this.f4678o;
                    if (list != null) {
                        Iterator<iuc0<R>> it = list.iterator();
                        zMo103908b = false;
                        while (it.hasNext()) {
                            zMo103908b |= it.next().mo103908b(glideException, this.f4671h, this.f4677n, m5629q());
                        }
                    } else {
                        zMo103908b = false;
                    }
                    iuc0<R> iuc0Var = this.f4667d;
                    if (iuc0Var == null || !iuc0Var.mo103908b(glideException, this.f4671h, this.f4677n, m5629q())) {
                        z = false;
                    }
                    if (!(zMo103908b | z)) {
                        m5638z();
                    }
                    this.f4662B = false;
                    m5633u();
                } catch (Throwable th) {
                    this.f4662B = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: y */
    private void m5637y(rvc0<R> rvc0Var, R r, DataSource dataSource) {
        boolean zMo103911f;
        boolean zM5629q = m5629q();
        this.f4685v = Status.COMPLETE;
        this.f4681r = rvc0Var;
        if (this.f4670g.m5339g() <= 3) {
            r.getClass();
            Objects.toString(dataSource);
            Objects.toString(this.f4671h);
            kxv.m147807a(this.f4683t);
        }
        boolean z = true;
        this.f4662B = true;
        try {
            List<iuc0<R>> list = this.f4678o;
            if (list != null) {
                Iterator<iuc0<R>> it = list.iterator();
                zMo103911f = false;
                while (it.hasNext()) {
                    R r2 = r;
                    DataSource dataSource2 = dataSource;
                    zMo103911f |= it.next().mo103911f(r2, this.f4671h, this.f4677n, dataSource2, zM5629q);
                    r = r2;
                    dataSource = dataSource2;
                }
            } else {
                zMo103911f = false;
            }
            R r3 = r;
            DataSource dataSource3 = dataSource;
            iuc0<R> iuc0Var = this.f4667d;
            if (iuc0Var == null || !iuc0Var.mo103911f(r3, this.f4671h, this.f4677n, dataSource3, zM5629q)) {
                z = false;
            }
            if (!(z | zMo103911f)) {
                this.f4677n.mo103913i(r3, this.f4679p.mo112329a(dataSource3, zM5629q));
            }
            this.f4662B = false;
            m5634v();
        } catch (Throwable th) {
            this.f4662B = false;
            throw th;
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: z */
    private void m5638z() {
        if (m5623k()) {
            Drawable drawableM5627o = this.f4671h == null ? m5627o() : null;
            if (drawableM5627o == null) {
                drawableM5627o = m5626n();
            }
            if (drawableM5627o == null) {
                drawableM5627o = m5628p();
            }
            this.f4677n.mo103916l(drawableM5627o);
        }
    }

    @Override // p149l.ttc0
    /* JADX INFO: renamed from: a */
    public boolean mo5615a() {
        boolean z;
        synchronized (this.f4666c) {
            z = this.f4685v == Status.COMPLETE;
        }
        return z;
    }

    @Override // p149l.tvc0
    /* JADX INFO: renamed from: b */
    public void mo5639b(GlideException glideException) {
        m5636x(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.tvc0
    /* JADX INFO: renamed from: c */
    public void mo5640c(rvc0<?> rvc0Var, DataSource dataSource) {
        this.f4665b.mo166183c();
        rvc0<?> rvc0Var2 = null;
        try {
            synchronized (this.f4666c) {
                try {
                    this.f4682s = null;
                    if (rvc0Var == null) {
                        mo5639b(new GlideException("Expected to receive a Resource<R> with an object of " + this.f4672i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = rvc0Var.get();
                    try {
                        if (obj == null || !this.f4672i.isAssignableFrom(obj.getClass())) {
                            this.f4681r = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f4672i);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(rvc0Var);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            mo5639b(new GlideException(sb.toString()));
                        } else if (m5624l()) {
                            m5637y(rvc0Var, obj, dataSource);
                            return;
                        } else {
                            this.f4681r = null;
                            this.f4685v = Status.COMPLETE;
                        }
                        this.f4684u.m5448k(rvc0Var);
                    } catch (Throwable th) {
                        rvc0Var2 = rvc0Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (rvc0Var2 != null) {
                this.f4684u.m5448k(rvc0Var2);
            }
            throw th3;
        }
    }

    @Override // p149l.ttc0
    public void clear() {
        synchronized (this.f4666c) {
            try {
                m5621h();
                this.f4665b.mo166183c();
                Status status = this.f4685v;
                Status status2 = Status.CLEARED;
                if (status == status2) {
                    return;
                }
                m5625m();
                rvc0<R> rvc0Var = this.f4681r;
                if (rvc0Var != null) {
                    this.f4681r = null;
                } else {
                    rvc0Var = null;
                }
                if (m5622j()) {
                    this.f4677n.mo103910e(m5628p());
                }
                this.f4685v = status2;
                if (rvc0Var != null) {
                    this.f4684u.m5448k(rvc0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.yif0
    /* JADX INFO: renamed from: d */
    public void mo5641d(int i, int i2) throws Throwable {
        Object obj;
        this.f4665b.mo166183c();
        Object obj2 = this.f4666c;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f4660D;
                    if (z) {
                        m5631s("Got onSizeReady in " + kxv.m147807a(this.f4683t));
                    }
                    if (this.f4685v != Status.WAITING_FOR_SIZE) {
                        return;
                    }
                    Status status = Status.RUNNING;
                    this.f4685v = status;
                    float fM199447y = this.f4673j.m199447y();
                    this.f4689z = m5632t(i, fM199447y);
                    this.f4661A = m5632t(i2, fM199447y);
                    if (z) {
                        m5631s("finished setup for calling load in " + kxv.m147807a(this.f4683t));
                    }
                    try {
                        try {
                            try {
                                this.f4682s = this.f4684u.m5447f(this.f4670g, this.f4671h, this.f4673j.m199446x(), this.f4689z, this.f4661A, this.f4673j.m199445w(), this.f4672i, this.f4676m, this.f4673j.m199432k(), this.f4673j.m199399A(), this.f4673j.m199406N(), this.f4673j.m199404G(), this.f4673j.m199439q(), this.f4673j.m199402D(), this.f4673j.m199401C(), this.f4673j.m199400B(), this.f4673j.m199438p(), this, this.f4680q);
                                if (this.f4685v != status) {
                                    this.f4682s = null;
                                }
                                if (z) {
                                    m5631s("finished onSizeReady in " + kxv.m147807a(this.f4683t));
                                }
                            } catch (Throwable th) {
                                th = th;
                                obj = obj2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    @Override // p149l.ttc0
    /* JADX INFO: renamed from: e */
    public boolean mo5642e() {
        boolean z;
        synchronized (this.f4666c) {
            z = this.f4685v == Status.CLEARED;
        }
        return z;
    }

    @Override // p149l.tvc0
    /* JADX INFO: renamed from: f */
    public Object mo5643f() {
        this.f4665b.mo166183c();
        return this.f4666c;
    }

    @Override // p149l.ttc0
    /* JADX INFO: renamed from: g */
    public boolean mo5644g(ttc0 ttc0Var) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        vq2<?> vq2Var;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        vq2<?> vq2Var2;
        Priority priority2;
        int size2;
        if (!(ttc0Var instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f4666c) {
            try {
                i = this.f4674k;
                i2 = this.f4675l;
                obj = this.f4671h;
                cls = this.f4672i;
                vq2Var = this.f4673j;
                priority = this.f4676m;
                List<iuc0<R>> list = this.f4678o;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        SingleRequest singleRequest = (SingleRequest) ttc0Var;
        synchronized (singleRequest.f4666c) {
            try {
                i3 = singleRequest.f4674k;
                i4 = singleRequest.f4675l;
                obj2 = singleRequest.f4671h;
                cls2 = singleRequest.f4672i;
                vq2Var2 = singleRequest.f4673j;
                priority2 = singleRequest.f4676m;
                List<iuc0<R>> list2 = singleRequest.f4678o;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i == i3 && i2 == i4 && sck0.m183403c(obj, obj2) && cls.equals(cls2) && vq2Var.equals(vq2Var2) && priority == priority2 && size == size2;
    }

    @Override // p149l.ttc0
    /* JADX INFO: renamed from: i */
    public void mo5645i() {
        synchronized (this.f4666c) {
            try {
                m5621h();
                this.f4665b.mo166183c();
                this.f4683t = kxv.m147808b();
                if (this.f4671h == null) {
                    if (sck0.m183419s(this.f4674k, this.f4675l)) {
                        this.f4689z = this.f4674k;
                        this.f4661A = this.f4675l;
                    }
                    m5636x(new GlideException("Received null model"), m5627o() == null ? 5 : 3);
                    return;
                }
                Status status = this.f4685v;
                Status status2 = Status.RUNNING;
                if (status == status2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.COMPLETE) {
                    mo5640c(this.f4681r, DataSource.MEMORY_CACHE);
                    return;
                }
                Status status3 = Status.WAITING_FOR_SIZE;
                this.f4685v = status3;
                if (sck0.m183419s(this.f4674k, this.f4675l)) {
                    mo5641d(this.f4674k, this.f4675l);
                } else {
                    this.f4677n.mo103915k(this);
                }
                Status status4 = this.f4685v;
                if ((status4 == status2 || status4 == status3) && m5623k()) {
                    this.f4677n.mo103914j(m5628p());
                }
                if (f4660D) {
                    m5631s("finished run method in " + kxv.m147807a(this.f4683t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ttc0
    public boolean isComplete() {
        boolean z;
        synchronized (this.f4666c) {
            z = this.f4685v == Status.COMPLETE;
        }
        return z;
    }

    @Override // p149l.ttc0
    public boolean isRunning() {
        boolean z;
        synchronized (this.f4666c) {
            try {
                Status status = this.f4685v;
                z = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p149l.ttc0
    public void pause() {
        synchronized (this.f4666c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
