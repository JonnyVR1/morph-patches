package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.C1058b;
import com.bumptech.glide.C1059c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1081h;
import com.bumptech.glide.load.engine.GlideException;
import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p153l.cli0;
import p153l.d4k;
import p153l.hrf0;
import p153l.izv;
import p153l.l2d0;
import p153l.lr2;
import p153l.pce;
import p153l.sof;
import p153l.u3d0;
import p153l.w3d0;
import p153l.wtq0;
import p153l.x3g0;
import p153l.xhj0;
import p153l.y1d0;
import p153l.ylk0;

/* JADX INFO: loaded from: classes.dex */
public final class SingleRequest<R> implements y1d0, hrf0, w3d0 {

    /* JADX INFO: renamed from: E */
    private static final boolean f4696E = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: A */
    @GuardedBy("requestLock")
    private int f4697A;

    /* JADX INFO: renamed from: B */
    @GuardedBy("requestLock")
    private int f4698B;

    /* JADX INFO: renamed from: C */
    @GuardedBy("requestLock")
    private boolean f4699C;

    /* JADX INFO: renamed from: D */
    @Nullable
    private RuntimeException f4700D;

    /* JADX INFO: renamed from: a */
    private int f4701a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private final String f4702b;

    /* JADX INFO: renamed from: c */
    private final x3g0 f4703c;

    /* JADX INFO: renamed from: d */
    private final Object f4704d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private final l2d0<R> f4705e;

    /* JADX INFO: renamed from: f */
    private final RequestCoordinator f4706f;

    /* JADX INFO: renamed from: g */
    private final Context f4707g;

    /* JADX INFO: renamed from: h */
    private final C1059c f4708h;

    /* JADX INFO: renamed from: i */
    @Nullable
    private final Object f4709i;

    /* JADX INFO: renamed from: j */
    private final Class<R> f4710j;

    /* JADX INFO: renamed from: k */
    private final lr2<?> f4711k;

    /* JADX INFO: renamed from: l */
    private final int f4712l;

    /* JADX INFO: renamed from: m */
    private final int f4713m;

    /* JADX INFO: renamed from: n */
    private final Priority f4714n;

    /* JADX INFO: renamed from: o */
    private final cli0<R> f4715o;

    /* JADX INFO: renamed from: p */
    @Nullable
    private final List<l2d0<R>> f4716p;

    /* JADX INFO: renamed from: q */
    private final xhj0<? super R> f4717q;

    /* JADX INFO: renamed from: r */
    private final Executor f4718r;

    /* JADX INFO: renamed from: s */
    @GuardedBy("requestLock")
    private u3d0<R> f4719s;

    /* JADX INFO: renamed from: t */
    @GuardedBy("requestLock")
    private C1081h.d f4720t;

    /* JADX INFO: renamed from: u */
    @GuardedBy("requestLock")
    private long f4721u;

    /* JADX INFO: renamed from: v */
    private volatile C1081h f4722v;

    /* JADX INFO: renamed from: w */
    @GuardedBy("requestLock")
    private Status f4723w;

    /* JADX INFO: renamed from: x */
    @Nullable
    @GuardedBy("requestLock")
    private Drawable f4724x;

    /* JADX INFO: renamed from: y */
    @Nullable
    @GuardedBy("requestLock")
    private Drawable f4725y;

    /* JADX INFO: renamed from: z */
    @Nullable
    @GuardedBy("requestLock")
    private Drawable f4726z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private SingleRequest(Context context, C1059c c1059c, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, lr2<?> lr2Var, int i, int i2, Priority priority, cli0<R> cli0Var, @Nullable l2d0<R> l2d0Var, @Nullable List<l2d0<R>> list, RequestCoordinator requestCoordinator, C1081h c1081h, xhj0<? super R> xhj0Var, Executor executor) {
        this.f4702b = f4696E ? String.valueOf(super.hashCode()) : null;
        this.f4703c = x3g0.m209209a();
        this.f4704d = obj;
        this.f4707g = context;
        this.f4708h = c1059c;
        this.f4709i = obj2;
        this.f4710j = cls;
        this.f4711k = lr2Var;
        this.f4712l = i;
        this.f4713m = i2;
        this.f4714n = priority;
        this.f4715o = cli0Var;
        this.f4705e = l2d0Var;
        this.f4716p = list;
        this.f4706f = requestCoordinator;
        this.f4722v = c1081h;
        this.f4717q = xhj0Var;
        this.f4718r = executor;
        this.f4723w = Status.PENDING;
        if (this.f4700D == null && c1059c.m5348g().m5351a(C1058b.d.class)) {
            this.f4700D = new RuntimeException("Glide request origin trace");
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: A */
    private void m5674A() {
        if (m5677k()) {
            Drawable drawableM5682p = this.f4709i == null ? m5682p() : null;
            if (drawableM5682p == null) {
                drawableM5682p = m5681o();
            }
            if (drawableM5682p == null) {
                drawableM5682p = m5683q();
            }
            this.f4715o.mo95331l(drawableM5682p);
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: h */
    private void m5675h() {
        if (this.f4699C) {
            wtq0.m207906a("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: i */
    private boolean m5676i() {
        RequestCoordinator requestCoordinator = this.f4706f;
        return requestCoordinator == null || requestCoordinator.mo5669c(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: k */
    private boolean m5677k() {
        RequestCoordinator requestCoordinator = this.f4706f;
        return requestCoordinator == null || requestCoordinator.mo5673i(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: l */
    private boolean m5678l() {
        RequestCoordinator requestCoordinator = this.f4706f;
        return requestCoordinator == null || requestCoordinator.mo5672h(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: m */
    private void m5679m() {
        m5675h();
        this.f4703c.mo209211c();
        this.f4715o.mo95326a(this);
        C1081h.d dVar = this.f4720t;
        if (dVar != null) {
            dVar.m5479a();
            this.f4720t = null;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m5680n(Object obj) {
        List<l2d0<R>> list = this.f4716p;
        if (list == null) {
            return;
        }
        for (l2d0<R> l2d0Var : list) {
            if (l2d0Var instanceof sof) {
                ((sof) l2d0Var).m187219a(obj);
            }
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: o */
    private Drawable m5681o() {
        if (this.f4724x == null) {
            Drawable drawableM155563m = this.f4711k.m155563m();
            this.f4724x = drawableM155563m;
            if (drawableM155563m == null && this.f4711k.m155561l() > 0) {
                this.f4724x = m5685s(this.f4711k.m155561l());
            }
        }
        return this.f4724x;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: p */
    private Drawable m5682p() {
        if (this.f4726z == null) {
            Drawable drawableM155564n = this.f4711k.m155564n();
            this.f4726z = drawableM155564n;
            if (drawableM155564n == null && this.f4711k.m155565o() > 0) {
                this.f4726z = m5685s(this.f4711k.m155565o());
            }
        }
        return this.f4726z;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: q */
    private Drawable m5683q() {
        if (this.f4725y == null) {
            Drawable drawableM155570t = this.f4711k.m155570t();
            this.f4725y = drawableM155570t;
            if (drawableM155570t == null && this.f4711k.m155571u() > 0) {
                this.f4725y = m5685s(this.f4711k.m155571u());
            }
        }
        return this.f4725y;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: r */
    private boolean m5684r() {
        RequestCoordinator requestCoordinator = this.f4706f;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo5668b();
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: s */
    private Drawable m5685s(@DrawableRes int i) {
        return pce.m171643a(this.f4708h, i, this.f4711k.m155576z() != null ? this.f4711k.m155576z() : this.f4707g.getTheme());
    }

    /* JADX INFO: renamed from: t */
    private void m5686t(String str) {
    }

    /* JADX INFO: renamed from: u */
    private static int m5687u(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: v */
    private void m5688v() {
        RequestCoordinator requestCoordinator = this.f4706f;
        if (requestCoordinator != null) {
            requestCoordinator.mo5670d(this);
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: w */
    private void m5689w() {
        RequestCoordinator requestCoordinator = this.f4706f;
        if (requestCoordinator != null) {
            requestCoordinator.mo5671f(this);
        }
    }

    /* JADX INFO: renamed from: x */
    public static <R> SingleRequest<R> m5690x(Context context, C1059c c1059c, Object obj, Object obj2, Class<R> cls, lr2<?> lr2Var, int i, int i2, Priority priority, cli0<R> cli0Var, l2d0<R> l2d0Var, @Nullable List<l2d0<R>> list, RequestCoordinator requestCoordinator, C1081h c1081h, xhj0<? super R> xhj0Var, Executor executor) {
        return new SingleRequest<>(context, c1059c, obj, obj2, cls, lr2Var, i, i2, priority, cli0Var, l2d0Var, list, requestCoordinator, c1081h, xhj0Var, executor);
    }

    /* JADX INFO: renamed from: y */
    private void m5691y(GlideException glideException, int i) {
        boolean zMo119081b;
        this.f4703c.mo209211c();
        synchronized (this.f4704d) {
            try {
                glideException.setOrigin(this.f4700D);
                int iM5349h = this.f4708h.m5349h();
                if (iM5349h <= i) {
                    Objects.toString(this.f4709i);
                    if (iM5349h <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f4720t = null;
                this.f4723w = Status.FAILED;
                boolean z = true;
                this.f4699C = true;
                try {
                    List<l2d0<R>> list = this.f4716p;
                    if (list != null) {
                        Iterator<l2d0<R>> it = list.iterator();
                        zMo119081b = false;
                        while (it.hasNext()) {
                            zMo119081b |= it.next().mo119081b(glideException, this.f4709i, this.f4715o, m5684r());
                        }
                    } else {
                        zMo119081b = false;
                    }
                    l2d0<R> l2d0Var = this.f4705e;
                    if (l2d0Var == null || !l2d0Var.mo119081b(glideException, this.f4709i, this.f4715o, m5684r())) {
                        z = false;
                    }
                    if (!(zMo119081b | z)) {
                        m5674A();
                    }
                    this.f4699C = false;
                    m5688v();
                    d4k.m114205f("GlideRequest", this.f4701a);
                } catch (Throwable th) {
                    this.f4699C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: z */
    private void m5692z(u3d0<R> u3d0Var, R r, DataSource dataSource, boolean z) {
        boolean zMo119082f;
        boolean zM5684r = m5684r();
        this.f4723w = Status.COMPLETE;
        this.f4719s = u3d0Var;
        if (this.f4708h.m5349h() <= 3) {
            r.getClass();
            Objects.toString(dataSource);
            Objects.toString(this.f4709i);
            izv.m142878a(this.f4721u);
        }
        boolean z2 = true;
        this.f4699C = true;
        try {
            List<l2d0<R>> list = this.f4716p;
            if (list != null) {
                Iterator<l2d0<R>> it = list.iterator();
                zMo119082f = false;
                while (it.hasNext()) {
                    R r2 = r;
                    DataSource dataSource2 = dataSource;
                    zMo119082f |= it.next().mo119082f(r2, this.f4709i, this.f4715o, dataSource2, zM5684r);
                    r = r2;
                    dataSource = dataSource2;
                }
            } else {
                zMo119082f = false;
            }
            R r3 = r;
            DataSource dataSource3 = dataSource;
            l2d0<R> l2d0Var = this.f4705e;
            if (l2d0Var == null || !l2d0Var.mo119082f(r3, this.f4709i, this.f4715o, dataSource3, zM5684r)) {
                z2 = false;
            }
            if (!(z2 | zMo119082f)) {
                this.f4715o.mo104924i(r3, this.f4717q.mo183057a(dataSource3, zM5684r));
            }
            this.f4699C = false;
            m5689w();
            d4k.m114205f("GlideRequest", this.f4701a);
        } catch (Throwable th) {
            this.f4699C = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.w3d0
    /* JADX INFO: renamed from: a */
    public void mo5693a(u3d0<?> u3d0Var, DataSource dataSource, boolean z) {
        this.f4703c.mo209211c();
        u3d0<?> u3d0Var2 = null;
        try {
            synchronized (this.f4704d) {
                try {
                    this.f4720t = null;
                    if (u3d0Var == null) {
                        mo5694c(new GlideException("Expected to receive a Resource<R> with an object of " + this.f4710j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = u3d0Var.get();
                    try {
                        if (obj == null || !this.f4710j.isAssignableFrom(obj.getClass())) {
                            this.f4719s = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f4710j);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(u3d0Var);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            mo5694c(new GlideException(sb.toString()));
                        } else if (m5678l()) {
                            m5692z(u3d0Var, obj, dataSource, z);
                            return;
                        } else {
                            this.f4719s = null;
                            this.f4723w = Status.COMPLETE;
                            d4k.m114205f("GlideRequest", this.f4701a);
                        }
                        this.f4722v.m5474k(u3d0Var);
                    } catch (Throwable th) {
                        u3d0Var2 = u3d0Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (u3d0Var2 != null) {
                this.f4722v.m5474k(u3d0Var2);
            }
            throw th3;
        }
    }

    @Override // p153l.y1d0
    /* JADX INFO: renamed from: b */
    public boolean mo5668b() {
        boolean z;
        synchronized (this.f4704d) {
            z = this.f4723w == Status.COMPLETE;
        }
        return z;
    }

    @Override // p153l.w3d0
    /* JADX INFO: renamed from: c */
    public void mo5694c(GlideException glideException) {
        m5691y(glideException, 5);
    }

    @Override // p153l.y1d0
    public void clear() {
        synchronized (this.f4704d) {
            try {
                m5675h();
                this.f4703c.mo209211c();
                Status status = this.f4723w;
                Status status2 = Status.CLEARED;
                if (status == status2) {
                    return;
                }
                m5679m();
                u3d0<R> u3d0Var = this.f4719s;
                if (u3d0Var != null) {
                    this.f4719s = null;
                } else {
                    u3d0Var = null;
                }
                if (m5676i()) {
                    this.f4715o.mo104923e(m5683q());
                }
                d4k.m114205f("GlideRequest", this.f4701a);
                this.f4723w = status2;
                if (u3d0Var != null) {
                    this.f4722v.m5474k(u3d0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.hrf0
    /* JADX INFO: renamed from: d */
    public void mo5695d(int i, int i2) throws Throwable {
        Object obj;
        this.f4703c.mo209211c();
        Object obj2 = this.f4704d;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f4696E;
                    if (z) {
                        m5686t("Got onSizeReady in " + izv.m142878a(this.f4721u));
                    }
                    if (this.f4723w != Status.WAITING_FOR_SIZE) {
                        return;
                    }
                    Status status = Status.RUNNING;
                    this.f4723w = status;
                    float fM155575y = this.f4711k.m155575y();
                    this.f4697A = m5687u(i, fM155575y);
                    this.f4698B = m5687u(i2, fM155575y);
                    if (z) {
                        m5686t("finished setup for calling load in " + izv.m142878a(this.f4721u));
                    }
                    try {
                        try {
                            try {
                                this.f4720t = this.f4722v.m5473f(this.f4708h, this.f4709i, this.f4711k.m155574x(), this.f4697A, this.f4698B, this.f4711k.m155573w(), this.f4710j, this.f4714n, this.f4711k.m155559k(), this.f4711k.m155527A(), this.f4711k.m155535O(), this.f4711k.m155533K(), this.f4711k.m155567q(), this.f4711k.m155531E(), this.f4711k.m155529C(), this.f4711k.m155528B(), this.f4711k.m155566p(), this, this.f4718r);
                                if (this.f4723w != status) {
                                    this.f4720t = null;
                                }
                                if (z) {
                                    m5686t("finished onSizeReady in " + izv.m142878a(this.f4721u));
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

    @Override // p153l.y1d0
    /* JADX INFO: renamed from: e */
    public boolean mo5696e() {
        boolean z;
        synchronized (this.f4704d) {
            z = this.f4723w == Status.CLEARED;
        }
        return z;
    }

    @Override // p153l.w3d0
    /* JADX INFO: renamed from: f */
    public Object mo5697f() {
        this.f4703c.mo209211c();
        return this.f4704d;
    }

    @Override // p153l.y1d0
    /* JADX INFO: renamed from: g */
    public boolean mo5698g(y1d0 y1d0Var) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        lr2<?> lr2Var;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        lr2<?> lr2Var2;
        Priority priority2;
        int size2;
        if (!(y1d0Var instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f4704d) {
            try {
                i = this.f4712l;
                i2 = this.f4713m;
                obj = this.f4709i;
                cls = this.f4710j;
                lr2Var = this.f4711k;
                priority = this.f4714n;
                List<l2d0<R>> list = this.f4716p;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        SingleRequest singleRequest = (SingleRequest) y1d0Var;
        synchronized (singleRequest.f4704d) {
            try {
                i3 = singleRequest.f4712l;
                i4 = singleRequest.f4713m;
                obj2 = singleRequest.f4709i;
                cls2 = singleRequest.f4710j;
                lr2Var2 = singleRequest.f4711k;
                priority2 = singleRequest.f4714n;
                List<l2d0<R>> list2 = singleRequest.f4716p;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i == i3 && i2 == i4 && ylk0.m216579c(obj, obj2) && cls.equals(cls2) && lr2Var.equals(lr2Var2) && priority == priority2 && size == size2;
    }

    @Override // p153l.y1d0
    public boolean isComplete() {
        boolean z;
        synchronized (this.f4704d) {
            z = this.f4723w == Status.COMPLETE;
        }
        return z;
    }

    @Override // p153l.y1d0
    public boolean isRunning() {
        boolean z;
        synchronized (this.f4704d) {
            try {
                Status status = this.f4723w;
                z = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p153l.y1d0
    /* JADX INFO: renamed from: j */
    public void mo5699j() {
        synchronized (this.f4704d) {
            try {
                m5675h();
                this.f4703c.mo209211c();
                this.f4721u = izv.m142879b();
                Object obj = this.f4709i;
                if (obj == null) {
                    if (ylk0.m216597u(this.f4712l, this.f4713m)) {
                        this.f4697A = this.f4712l;
                        this.f4698B = this.f4713m;
                    }
                    m5691y(new GlideException("Received null model"), m5682p() == null ? 5 : 3);
                    return;
                }
                Status status = this.f4723w;
                Status status2 = Status.RUNNING;
                if (status == status2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.COMPLETE) {
                    mo5693a(this.f4719s, DataSource.MEMORY_CACHE, false);
                    return;
                }
                m5680n(obj);
                this.f4701a = d4k.m114201b("GlideRequest");
                Status status3 = Status.WAITING_FOR_SIZE;
                this.f4723w = status3;
                if (ylk0.m216597u(this.f4712l, this.f4713m)) {
                    mo5695d(this.f4712l, this.f4713m);
                } else {
                    this.f4715o.mo95330k(this);
                }
                Status status4 = this.f4723w;
                if ((status4 == status2 || status4 == status3) && m5677k()) {
                    this.f4715o.mo95329j(m5683q());
                }
                if (f4696E) {
                    m5686t("finished run method in " + izv.m142878a(this.f4721u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.y1d0
    public void pause() {
        synchronized (this.f4704d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f4704d) {
            obj = this.f4709i;
            cls = this.f4710j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + Constants.AES_SUFFIX;
    }
}
