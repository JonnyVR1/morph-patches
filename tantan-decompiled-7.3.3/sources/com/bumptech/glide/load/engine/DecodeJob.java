package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.C1059c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.InterfaceC1064a;
import com.bumptech.glide.load.resource.bitmap.C1110a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p153l.c4d0;
import p153l.d4e;
import p153l.d4k;
import p153l.fum;
import p153l.izv;
import p153l.kzq;
import p153l.mxf;
import p153l.nj80;
import p153l.q560;
import p153l.qg50;
import p153l.t5c;
import p153l.tgj0;
import p153l.u3d0;
import p153l.u560;
import p153l.x3g0;
import p153l.ypg0;
import p153l.yzv;
import p153l.z3e;

/* JADX INFO: loaded from: classes.dex */
class DecodeJob<R> implements InterfaceC1078e.a, Runnable, Comparable<DecodeJob<?>>, mxf.InterfaceC18738f {

    /* JADX INFO: renamed from: A */
    private DataSource f4386A;

    /* JADX INFO: renamed from: B */
    private t5c<?> f4387B;

    /* JADX INFO: renamed from: C */
    private volatile InterfaceC1078e f4388C;

    /* JADX INFO: renamed from: D */
    private volatile boolean f4389D;

    /* JADX INFO: renamed from: E */
    private volatile boolean f4390E;

    /* JADX INFO: renamed from: F */
    private boolean f4391F;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1071e f4395d;

    /* JADX INFO: renamed from: e */
    private final nj80<DecodeJob<?>> f4396e;

    /* JADX INFO: renamed from: h */
    private C1059c f4399h;

    /* JADX INFO: renamed from: i */
    private kzq f4400i;

    /* JADX INFO: renamed from: j */
    private Priority f4401j;

    /* JADX INFO: renamed from: k */
    private C1084k f4402k;

    /* JADX INFO: renamed from: l */
    private int f4403l;

    /* JADX INFO: renamed from: m */
    private int f4404m;

    /* JADX INFO: renamed from: n */
    private d4e f4405n;

    /* JADX INFO: renamed from: o */
    private u560 f4406o;

    /* JADX INFO: renamed from: p */
    private InterfaceC1068b<R> f4407p;

    /* JADX INFO: renamed from: q */
    private int f4408q;

    /* JADX INFO: renamed from: r */
    private Stage f4409r;

    /* JADX INFO: renamed from: s */
    private RunReason f4410s;

    /* JADX INFO: renamed from: t */
    private long f4411t;

    /* JADX INFO: renamed from: u */
    private boolean f4412u;

    /* JADX INFO: renamed from: v */
    private Object f4413v;

    /* JADX INFO: renamed from: w */
    private Thread f4414w;

    /* JADX INFO: renamed from: x */
    private kzq f4415x;

    /* JADX INFO: renamed from: y */
    private kzq f4416y;

    /* JADX INFO: renamed from: z */
    private Object f4417z;

    /* JADX INFO: renamed from: a */
    private final C1079f<R> f4392a = new C1079f<>();

    /* JADX INFO: renamed from: b */
    private final List<Throwable> f4393b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final x3g0 f4394c = x3g0.m209209a();

    /* JADX INFO: renamed from: f */
    private final C1070d<?> f4397f = new C1070d<>();

    /* JADX INFO: renamed from: g */
    private final C1072f f4398g = new C1072f();

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$a */
    public static /* synthetic */ class C1067a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4418a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f4419b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f4420c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f4420c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4420c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f4419b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4419b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4419b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4419b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4419b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f4418a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4418a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4418a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface InterfaceC1068b<R> {
        /* JADX INFO: renamed from: a */
        void mo5408a(u3d0<R> u3d0Var, DataSource dataSource, boolean z);

        /* JADX INFO: renamed from: c */
        void mo5409c(GlideException glideException);

        /* JADX INFO: renamed from: d */
        void mo5410d(DecodeJob<?> decodeJob);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C1069c<Z> implements C1080g.a<Z> {

        /* JADX INFO: renamed from: a */
        private final DataSource f4421a;

        public C1069c(DataSource dataSource) {
            this.f4421a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.C1080g.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public u3d0<Z> mo5411a(@NonNull u3d0<Z> u3d0Var) {
            return DecodeJob.this.m5398A(this.f4421a, u3d0Var);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C1070d<Z> {

        /* JADX INFO: renamed from: a */
        private kzq f4423a;

        /* JADX INFO: renamed from: b */
        private c4d0<Z> f4424b;

        /* JADX INFO: renamed from: c */
        private C1089p<Z> f4425c;

        /* JADX INFO: renamed from: a */
        public void m5412a() {
            this.f4423a = null;
            this.f4424b = null;
            this.f4425c = null;
        }

        /* JADX INFO: renamed from: b */
        public void m5413b(InterfaceC1071e interfaceC1071e, u560 u560Var) {
            d4k.m114200a("DecodeJob.encode");
            try {
                interfaceC1071e.mo5416a().mo95915b(this.f4423a, new C1077d(this.f4424b, this.f4425c, u560Var));
            } finally {
                this.f4425c.m5515e();
                d4k.m114204e();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m5414c() {
            return this.f4425c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public <X> void m5415d(kzq kzqVar, c4d0<X> c4d0Var, C1089p<X> c1089p) {
            this.f4423a = kzqVar;
            this.f4424b = c4d0Var;
            this.f4425c = c1089p;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface InterfaceC1071e {
        /* JADX INFO: renamed from: a */
        z3e mo5416a();
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C1072f {

        /* JADX INFO: renamed from: a */
        private boolean f4426a;

        /* JADX INFO: renamed from: b */
        private boolean f4427b;

        /* JADX INFO: renamed from: c */
        private boolean f4428c;

        /* JADX INFO: renamed from: a */
        private boolean m5417a(boolean z) {
            return (this.f4428c || z || this.f4427b) && this.f4426a;
        }

        /* JADX INFO: renamed from: b */
        public synchronized boolean m5418b() {
            this.f4427b = true;
            return m5417a(false);
        }

        /* JADX INFO: renamed from: c */
        public synchronized boolean m5419c() {
            this.f4428c = true;
            return m5417a(false);
        }

        /* JADX INFO: renamed from: d */
        public synchronized boolean m5420d(boolean z) {
            this.f4426a = true;
            return m5417a(z);
        }

        /* JADX INFO: renamed from: e */
        public synchronized void m5421e() {
            this.f4427b = false;
            this.f4426a = false;
            this.f4428c = false;
        }
    }

    public DecodeJob(InterfaceC1071e interfaceC1071e, nj80<DecodeJob<?>> nj80Var) {
        this.f4395d = interfaceC1071e;
        this.f4396e = nj80Var;
    }

    /* JADX INFO: renamed from: C */
    private void m5379C() {
        this.f4398g.m5421e();
        this.f4397f.m5412a();
        this.f4392a.m5435a();
        this.f4389D = false;
        this.f4399h = null;
        this.f4400i = null;
        this.f4406o = null;
        this.f4401j = null;
        this.f4402k = null;
        this.f4407p = null;
        this.f4409r = null;
        this.f4388C = null;
        this.f4414w = null;
        this.f4415x = null;
        this.f4417z = null;
        this.f4386A = null;
        this.f4387B = null;
        this.f4411t = 0L;
        this.f4390E = false;
        this.f4413v = null;
        this.f4393b.clear();
        this.f4396e.release(this);
    }

    /* JADX INFO: renamed from: F */
    private void m5380F() {
        this.f4414w = Thread.currentThread();
        this.f4411t = izv.m142879b();
        boolean zMo5431a = false;
        while (!this.f4390E && this.f4388C != null && !(zMo5431a = this.f4388C.mo5431a())) {
            this.f4409r = m5388p(this.f4409r);
            this.f4388C = m5387o();
            if (this.f4409r == Stage.SOURCE) {
                mo5404g();
                return;
            }
        }
        if ((this.f4409r == Stage.FINISHED || this.f4390E) && !zMo5431a) {
            m5395x();
        }
    }

    /* JADX INFO: renamed from: H */
    private <Data, ResourceType> u3d0<R> m5381H(Data data, DataSource dataSource, C1088o<Data, ResourceType, R> c1088o) throws GlideException {
        u560 u560VarM5389q = m5389q(dataSource);
        InterfaceC1064a<Data> interfaceC1064aM5311l = this.f4399h.m5350i().m5311l(data);
        try {
            return c1088o.m5511a(interfaceC1064aM5311l, u560VarM5389q, this.f4403l, this.f4404m, new C1069c(dataSource));
        } finally {
            interfaceC1064aM5311l.cleanup();
        }
    }

    /* JADX INFO: renamed from: I */
    private void m5382I() {
        int i = C1067a.f4418a[this.f4410s.ordinal()];
        if (i == 1) {
            this.f4409r = m5388p(Stage.INITIALIZE);
            this.f4388C = m5387o();
            m5380F();
        } else if (i == 2) {
            m5380F();
        } else if (i == 3) {
            m5386n();
        } else {
            qg50.m176437a("Unrecognized run reason: ", this.f4410s);
        }
    }

    /* JADX INFO: renamed from: J */
    private void m5383J() {
        Throwable th;
        this.f4394c.mo209211c();
        if (!this.f4389D) {
            this.f4389D = true;
            return;
        }
        if (this.f4393b.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f4393b;
            th = list.get(list.size() - 1);
        }
        yzv.m218057a("Already notified", th);
    }

    /* JADX INFO: renamed from: j */
    private <Data> u3d0<R> m5384j(t5c<?> t5cVar, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            t5cVar.cleanup();
            return null;
        }
        try {
            long jM142879b = izv.m142879b();
            u3d0<R> u3d0VarM5385m = m5385m(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m5391t("Decoded result " + u3d0VarM5385m, jM142879b);
            }
            return u3d0VarM5385m;
        } finally {
            t5cVar.cleanup();
        }
    }

    /* JADX INFO: renamed from: m */
    private <Data> u3d0<R> m5385m(Data data, DataSource dataSource) throws GlideException {
        return m5381H(data, dataSource, this.f4392a.m5442h(data.getClass()));
    }

    /* JADX INFO: renamed from: n */
    private void m5386n() {
        u3d0<R> u3d0VarM5384j;
        if (Log.isLoggable("DecodeJob", 2)) {
            m5392u("Retrieved data", this.f4411t, "data: " + this.f4417z + ", cache key: " + this.f4415x + ", fetcher: " + this.f4387B);
        }
        try {
            u3d0VarM5384j = m5384j(this.f4387B, this.f4417z, this.f4386A);
        } catch (GlideException e) {
            e.setLoggingDetails(this.f4416y, this.f4386A);
            this.f4393b.add(e);
            u3d0VarM5384j = null;
        }
        if (u3d0VarM5384j != null) {
            m5394w(u3d0VarM5384j, this.f4386A, this.f4391F);
        } else {
            m5380F();
        }
    }

    /* JADX INFO: renamed from: o */
    private InterfaceC1078e m5387o() {
        int i = C1067a.f4419b[this.f4409r.ordinal()];
        if (i == 1) {
            return new C1090q(this.f4392a, this);
        }
        if (i == 2) {
            return new C1075b(this.f4392a, this);
        }
        if (i == 3) {
            return new C1093t(this.f4392a, this);
        }
        if (i == 4) {
            return null;
        }
        qg50.m176437a("Unrecognized stage: ", this.f4409r);
        return null;
    }

    /* JADX INFO: renamed from: p */
    private Stage m5388p(Stage stage) {
        int i = C1067a.f4419b[stage.ordinal()];
        if (i == 1) {
            return this.f4405n.mo114180a() ? Stage.DATA_CACHE : m5388p(Stage.DATA_CACHE);
        }
        if (i == 2) {
            return this.f4412u ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i == 3 || i == 4) {
            return Stage.FINISHED;
        }
        if (i == 5) {
            return this.f4405n.mo114181b() ? Stage.RESOURCE_CACHE : m5388p(Stage.RESOURCE_CACHE);
        }
        ypg0.m217021a("Unrecognized stage: ", stage);
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    private u560 m5389q(DataSource dataSource) {
        u560 u560Var = this.f4406o;
        if (Build.VERSION.SDK_INT < 26) {
            return u560Var;
        }
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f4392a.m5458x();
        q560<Boolean> q560Var = C1110a.f4630j;
        Boolean bool = (Boolean) u560Var.m194542c(q560Var);
        if (bool != null && (!bool.booleanValue() || z)) {
            return u560Var;
        }
        u560 u560Var2 = new u560();
        u560Var2.m194543d(this.f4406o);
        u560Var2.m194544e(q560Var, Boolean.valueOf(z));
        return u560Var2;
    }

    /* JADX INFO: renamed from: r */
    private int m5390r() {
        return this.f4401j.ordinal();
    }

    /* JADX INFO: renamed from: t */
    private void m5391t(String str, long j) {
        m5392u(str, j, null);
    }

    /* JADX INFO: renamed from: u */
    private void m5392u(String str, long j, String str2) {
        izv.m142878a(j);
        Objects.toString(this.f4402k);
        if (str2 != null) {
            ", ".concat(str2);
        }
        Thread.currentThread().getName();
    }

    /* JADX INFO: renamed from: v */
    private void m5393v(u3d0<R> u3d0Var, DataSource dataSource, boolean z) {
        m5383J();
        this.f4407p.mo5408a(u3d0Var, dataSource, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    private void m5394w(u3d0<R> u3d0Var, DataSource dataSource, boolean z) {
        C1089p c1089p;
        d4k.m114200a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (u3d0Var instanceof fum) {
                ((fum) u3d0Var).initialize();
            }
            if (this.f4397f.m5414c()) {
                u3d0Var = C1089p.m5513c(u3d0Var);
                c1089p = u3d0Var;
            } else {
                c1089p = 0;
            }
            m5393v(u3d0Var, dataSource, z);
            this.f4409r = Stage.ENCODE;
            try {
                if (this.f4397f.m5414c()) {
                    this.f4397f.m5413b(this.f4395d, this.f4406o);
                }
                if (c1089p != 0) {
                    c1089p.m5515e();
                }
                m5396y();
                d4k.m114204e();
            } catch (Throwable th) {
                if (c1089p != 0) {
                    c1089p.m5515e();
                }
                throw th;
            }
        } catch (Throwable th2) {
            d4k.m114204e();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: x */
    private void m5395x() {
        m5383J();
        this.f4407p.mo5409c(new GlideException("Failed to load resource", new ArrayList(this.f4393b)));
        m5397z();
    }

    /* JADX INFO: renamed from: y */
    private void m5396y() {
        if (this.f4398g.m5418b()) {
            m5379C();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m5397z() {
        if (this.f4398g.m5419c()) {
            m5379C();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: A */
    public <Z> u3d0<Z> m5398A(DataSource dataSource, @NonNull u3d0<Z> u3d0Var) {
        u3d0<Z> u3d0VarMo100877b;
        tgj0<Z> tgj0Var;
        EncodeStrategy encodeStrategyMo101610b;
        c4d0 c4d0VarM5448n;
        kzq c1076c;
        Class<?> cls = u3d0Var.get().getClass();
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            tgj0<Z> tgj0VarM5453s = this.f4392a.m5453s(cls);
            tgj0Var = tgj0VarM5453s;
            u3d0VarMo100877b = tgj0VarM5453s.mo100877b(this.f4399h, u3d0Var, this.f4403l, this.f4404m);
        } else {
            u3d0VarMo100877b = u3d0Var;
            tgj0Var = null;
        }
        if (!u3d0Var.equals(u3d0VarMo100877b)) {
            u3d0Var.recycle();
        }
        if (this.f4392a.m5457w(u3d0VarMo100877b)) {
            c4d0VarM5448n = this.f4392a.m5448n(u3d0VarMo100877b);
            encodeStrategyMo101610b = c4d0VarM5448n.mo101610b(this.f4406o);
        } else {
            encodeStrategyMo101610b = EncodeStrategy.NONE;
            c4d0VarM5448n = null;
        }
        if (!this.f4405n.mo114183d(!this.f4392a.m5459y(this.f4415x), dataSource, encodeStrategyMo101610b)) {
            return u3d0VarMo100877b;
        }
        if (c4d0VarM5448n == null) {
            throw new Registry.NoResultEncoderAvailableException(u3d0VarMo100877b.get().getClass());
        }
        int i = C1067a.f4420c[encodeStrategyMo101610b.ordinal()];
        if (i == 1) {
            c1076c = new C1076c(this.f4415x, this.f4400i);
        } else {
            if (i != 2) {
                ypg0.m217021a("Unknown strategy: ", encodeStrategyMo101610b);
                return null;
            }
            c1076c = new C1091r(this.f4392a.m5436b(), this.f4415x, this.f4400i, this.f4403l, this.f4404m, tgj0Var, cls, this.f4406o);
        }
        C1089p c1089pM5513c = C1089p.m5513c(u3d0VarMo100877b);
        this.f4397f.m5415d(c1076c, c4d0VarM5448n, c1089pM5513c);
        return c1089pM5513c;
    }

    /* JADX INFO: renamed from: B */
    public void m5399B(boolean z) {
        if (this.f4398g.m5420d(z)) {
            m5379C();
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean m5400K() {
        Stage stageM5388p = m5388p(Stage.INITIALIZE);
        return stageM5388p == Stage.RESOURCE_CACHE || stageM5388p == Stage.DATA_CACHE;
    }

    /* JADX INFO: renamed from: a */
    public void m5401a() {
        this.f4390E = true;
        InterfaceC1078e interfaceC1078e = this.f4388C;
        if (interfaceC1078e != null) {
            interfaceC1078e.cancel();
        }
    }

    @Override // p153l.mxf.InterfaceC18738f
    @NonNull
    /* JADX INFO: renamed from: b */
    public x3g0 mo5402b() {
        return this.f4394c;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e.a
    /* JADX INFO: renamed from: f */
    public void mo5403f(kzq kzqVar, Exception exc, t5c<?> t5cVar, DataSource dataSource) {
        t5cVar.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(kzqVar, dataSource, t5cVar.mo106029a());
        this.f4393b.add(glideException);
        if (Thread.currentThread() == this.f4414w) {
            m5380F();
        } else {
            this.f4410s = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.f4407p.mo5410d(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e.a
    /* JADX INFO: renamed from: g */
    public void mo5404g() {
        this.f4410s = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.f4407p.mo5410d(this);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e.a
    /* JADX INFO: renamed from: h */
    public void mo5405h(kzq kzqVar, Object obj, t5c<?> t5cVar, DataSource dataSource, kzq kzqVar2) {
        this.f4415x = kzqVar;
        this.f4417z = obj;
        this.f4387B = t5cVar;
        this.f4386A = dataSource;
        this.f4416y = kzqVar2;
        this.f4391F = kzqVar != this.f4392a.m5437c().get(0);
        if (Thread.currentThread() != this.f4414w) {
            this.f4410s = RunReason.DECODE_DATA;
            this.f4407p.mo5410d(this);
        } else {
            d4k.m114200a("DecodeJob.decodeFromRetrievedData");
            try {
                m5386n();
            } finally {
                d4k.m114204e();
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull DecodeJob<?> decodeJob) {
        int iM5390r = m5390r() - decodeJob.m5390r();
        return iM5390r == 0 ? this.f4408q - decodeJob.f4408q : iM5390r;
    }

    @Override // java.lang.Runnable
    public void run() {
        d4k.m114202c("DecodeJob#run(reason=%s, model=%s)", this.f4410s, this.f4413v);
        t5c<?> t5cVar = this.f4387B;
        try {
            try {
                try {
                    if (this.f4390E) {
                        m5395x();
                        if (t5cVar != null) {
                            t5cVar.cleanup();
                        }
                        d4k.m114204e();
                        return;
                    }
                    m5382I();
                    if (t5cVar != null) {
                        t5cVar.cleanup();
                    }
                    d4k.m114204e();
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Objects.toString(this.f4409r);
                    }
                    if (this.f4409r != Stage.ENCODE) {
                        this.f4393b.add(th);
                        m5395x();
                    }
                    if (!this.f4390E) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (t5cVar != null) {
                t5cVar.cleanup();
            }
            d4k.m114204e();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: s */
    public DecodeJob<R> m5407s(C1059c c1059c, Object obj, C1084k c1084k, kzq kzqVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, d4e d4eVar, Map<Class<?>, tgj0<?>> map, boolean z, boolean z2, boolean z3, u560 u560Var, InterfaceC1068b<R> interfaceC1068b, int i3) {
        this.f4392a.m5456v(c1059c, obj, kzqVar, i, i2, d4eVar, cls, cls2, priority, u560Var, map, z, z2, this.f4395d);
        this.f4399h = c1059c;
        this.f4400i = kzqVar;
        this.f4401j = priority;
        this.f4402k = c1084k;
        this.f4403l = i;
        this.f4404m = i2;
        this.f4405n = d4eVar;
        this.f4412u = z3;
        this.f4406o = u560Var;
        this.f4407p = interfaceC1068b;
        this.f4408q = i3;
        this.f4410s = RunReason.INITIALIZE;
        this.f4413v = obj;
        return this;
    }
}
