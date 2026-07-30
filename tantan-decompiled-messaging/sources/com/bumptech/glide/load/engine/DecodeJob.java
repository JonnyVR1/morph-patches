package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.C1055c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.bitmap.C1093a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p149l.byv;
import p149l.dsm;
import p149l.hb80;
import p149l.j850;
import p149l.kx50;
import p149l.kxq;
import p149l.kxv;
import p149l.l2e;
import p149l.l4c;
import p149l.m1k;
import p149l.ovf0;
import p149l.p2e;
import p149l.p7j0;
import p149l.px50;
import p149l.qhg0;
import p149l.rvc0;
import p149l.x4c;
import p149l.yvf;
import p149l.zvc0;

/* JADX INFO: loaded from: classes.dex */
class DecodeJob<R> implements InterfaceC1068e.a, Runnable, Comparable<DecodeJob<?>>, yvf.InterfaceC21545f {

    /* JADX INFO: renamed from: A */
    private DataSource f4376A;

    /* JADX INFO: renamed from: B */
    private l4c<?> f4377B;

    /* JADX INFO: renamed from: C */
    private volatile InterfaceC1068e f4378C;

    /* JADX INFO: renamed from: D */
    private volatile boolean f4379D;

    /* JADX INFO: renamed from: E */
    private volatile boolean f4380E;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1061e f4384d;

    /* JADX INFO: renamed from: e */
    private final hb80<DecodeJob<?>> f4385e;

    /* JADX INFO: renamed from: h */
    private C1055c f4388h;

    /* JADX INFO: renamed from: i */
    private kxq f4389i;

    /* JADX INFO: renamed from: j */
    private Priority f4390j;

    /* JADX INFO: renamed from: k */
    private C1074k f4391k;

    /* JADX INFO: renamed from: l */
    private int f4392l;

    /* JADX INFO: renamed from: m */
    private int f4393m;

    /* JADX INFO: renamed from: n */
    private p2e f4394n;

    /* JADX INFO: renamed from: o */
    private px50 f4395o;

    /* JADX INFO: renamed from: p */
    private InterfaceC1058b<R> f4396p;

    /* JADX INFO: renamed from: q */
    private int f4397q;

    /* JADX INFO: renamed from: r */
    private Stage f4398r;

    /* JADX INFO: renamed from: s */
    private RunReason f4399s;

    /* JADX INFO: renamed from: t */
    private long f4400t;

    /* JADX INFO: renamed from: u */
    private boolean f4401u;

    /* JADX INFO: renamed from: v */
    private Object f4402v;

    /* JADX INFO: renamed from: w */
    private Thread f4403w;

    /* JADX INFO: renamed from: x */
    private kxq f4404x;

    /* JADX INFO: renamed from: y */
    private kxq f4405y;

    /* JADX INFO: renamed from: z */
    private Object f4406z;

    /* JADX INFO: renamed from: a */
    private final C1069f<R> f4381a = new C1069f<>();

    /* JADX INFO: renamed from: b */
    private final List<Throwable> f4382b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final ovf0 f4383c = ovf0.m166181a();

    /* JADX INFO: renamed from: f */
    private final C1060d<?> f4386f = new C1060d<>();

    /* JADX INFO: renamed from: g */
    private final C1062f f4387g = new C1062f();

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
    public static /* synthetic */ class C1057a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4407a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f4408b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f4409c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f4409c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4409c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f4408b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4408b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4408b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4408b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4408b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f4407a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4407a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4407a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface InterfaceC1058b<R> {
        /* JADX INFO: renamed from: b */
        void mo5383b(GlideException glideException);

        /* JADX INFO: renamed from: c */
        void mo5384c(rvc0<R> rvc0Var, DataSource dataSource);

        /* JADX INFO: renamed from: d */
        void mo5385d(DecodeJob<?> decodeJob);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C1059c<Z> implements C1070g.a<Z> {

        /* JADX INFO: renamed from: a */
        private final DataSource f4410a;

        public C1059c(DataSource dataSource) {
            this.f4410a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.C1070g.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public rvc0<Z> mo5386a(@NonNull rvc0<Z> rvc0Var) {
            return DecodeJob.this.m5373A(this.f4410a, rvc0Var);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C1060d<Z> {

        /* JADX INFO: renamed from: a */
        private kxq f4412a;

        /* JADX INFO: renamed from: b */
        private zvc0<Z> f4413b;

        /* JADX INFO: renamed from: c */
        private C1079p<Z> f4414c;

        /* JADX INFO: renamed from: a */
        public void m5387a() {
            this.f4412a = null;
            this.f4413b = null;
            this.f4414c = null;
        }

        /* JADX INFO: renamed from: b */
        public void m5388b(InterfaceC1061e interfaceC1061e, px50 px50Var) {
            m1k.m152595a("DecodeJob.encode");
            try {
                interfaceC1061e.mo5391a().mo148281b(this.f4412a, new C1067d(this.f4413b, this.f4414c, px50Var));
            } finally {
                this.f4414c.m5489e();
                m1k.m152598d();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m5389c() {
            return this.f4414c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public <X> void m5390d(kxq kxqVar, zvc0<X> zvc0Var, C1079p<X> c1079p) {
            this.f4412a = kxqVar;
            this.f4413b = zvc0Var;
            this.f4414c = c1079p;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface InterfaceC1061e {
        /* JADX INFO: renamed from: a */
        l2e mo5391a();
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C1062f {

        /* JADX INFO: renamed from: a */
        private boolean f4415a;

        /* JADX INFO: renamed from: b */
        private boolean f4416b;

        /* JADX INFO: renamed from: c */
        private boolean f4417c;

        /* JADX INFO: renamed from: a */
        private boolean m5392a(boolean z) {
            return (this.f4417c || z || this.f4416b) && this.f4415a;
        }

        /* JADX INFO: renamed from: b */
        public synchronized boolean m5393b() {
            this.f4416b = true;
            return m5392a(false);
        }

        /* JADX INFO: renamed from: c */
        public synchronized boolean m5394c() {
            this.f4417c = true;
            return m5392a(false);
        }

        /* JADX INFO: renamed from: d */
        public synchronized boolean m5395d(boolean z) {
            this.f4415a = true;
            return m5392a(z);
        }

        /* JADX INFO: renamed from: e */
        public synchronized void m5396e() {
            this.f4416b = false;
            this.f4415a = false;
            this.f4417c = false;
        }
    }

    public DecodeJob(InterfaceC1061e interfaceC1061e, hb80<DecodeJob<?>> hb80Var) {
        this.f4384d = interfaceC1061e;
        this.f4385e = hb80Var;
    }

    /* JADX INFO: renamed from: C */
    private void m5354C() {
        this.f4387g.m5396e();
        this.f4386f.m5387a();
        this.f4381a.m5410a();
        this.f4379D = false;
        this.f4388h = null;
        this.f4389i = null;
        this.f4395o = null;
        this.f4390j = null;
        this.f4391k = null;
        this.f4396p = null;
        this.f4398r = null;
        this.f4378C = null;
        this.f4403w = null;
        this.f4404x = null;
        this.f4406z = null;
        this.f4376A = null;
        this.f4377B = null;
        this.f4400t = 0L;
        this.f4380E = false;
        this.f4402v = null;
        this.f4382b.clear();
        this.f4385e.release(this);
    }

    /* JADX INFO: renamed from: F */
    private void m5355F() {
        this.f4403w = Thread.currentThread();
        this.f4400t = kxv.m147808b();
        boolean zMo5406a = false;
        while (!this.f4380E && this.f4378C != null && !(zMo5406a = this.f4378C.mo5406a())) {
            this.f4398r = m5363p(this.f4398r);
            this.f4378C = m5362o();
            if (this.f4398r == Stage.SOURCE) {
                mo5378f();
                return;
            }
        }
        if ((this.f4398r == Stage.FINISHED || this.f4380E) && !zMo5406a) {
            m5370x();
        }
    }

    /* JADX INFO: renamed from: H */
    private <Data, ResourceType> rvc0<R> m5356H(Data data, DataSource dataSource, C1078o<Data, ResourceType, R> c1078o) throws GlideException {
        px50 px50VarM5364q = m5364q(dataSource);
        x4c<Data> x4cVarM5301l = this.f4388h.m5340h().m5301l(data);
        try {
            return c1078o.m5485a(x4cVarM5301l, px50VarM5364q, this.f4392l, this.f4393m, new C1059c(dataSource));
        } finally {
            x4cVarM5301l.cleanup();
        }
    }

    /* JADX INFO: renamed from: I */
    private void m5357I() {
        int i = C1057a.f4407a[this.f4399s.ordinal()];
        if (i == 1) {
            this.f4398r = m5363p(Stage.INITIALIZE);
            this.f4378C = m5362o();
            m5355F();
        } else if (i == 2) {
            m5355F();
        } else if (i == 3) {
            m5361n();
        } else {
            j850.m140190a("Unrecognized run reason: ", this.f4399s);
        }
    }

    /* JADX INFO: renamed from: J */
    private void m5358J() {
        Throwable th;
        this.f4383c.mo166183c();
        if (!this.f4379D) {
            this.f4379D = true;
            return;
        }
        if (this.f4382b.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f4382b;
            th = list.get(list.size() - 1);
        }
        byv.m104511a("Already notified", th);
    }

    /* JADX INFO: renamed from: j */
    private <Data> rvc0<R> m5359j(l4c<?> l4cVar, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            l4cVar.cleanup();
            return null;
        }
        try {
            long jM147808b = kxv.m147808b();
            rvc0<R> rvc0VarM5360m = m5360m(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m5366t("Decoded result " + rvc0VarM5360m, jM147808b);
            }
            return rvc0VarM5360m;
        } finally {
            l4cVar.cleanup();
        }
    }

    /* JADX INFO: renamed from: m */
    private <Data> rvc0<R> m5360m(Data data, DataSource dataSource) throws GlideException {
        return m5356H(data, dataSource, this.f4381a.m5417h(data.getClass()));
    }

    /* JADX INFO: renamed from: n */
    private void m5361n() {
        rvc0<R> rvc0VarM5359j;
        if (Log.isLoggable("DecodeJob", 2)) {
            m5367u("Retrieved data", this.f4400t, "data: " + this.f4406z + ", cache key: " + this.f4404x + ", fetcher: " + this.f4377B);
        }
        try {
            rvc0VarM5359j = m5359j(this.f4377B, this.f4406z, this.f4376A);
        } catch (GlideException e) {
            e.setLoggingDetails(this.f4405y, this.f4376A);
            this.f4382b.add(e);
            rvc0VarM5359j = null;
        }
        if (rvc0VarM5359j != null) {
            m5369w(rvc0VarM5359j, this.f4376A);
        } else {
            m5355F();
        }
    }

    /* JADX INFO: renamed from: o */
    private InterfaceC1068e m5362o() {
        int i = C1057a.f4408b[this.f4398r.ordinal()];
        if (i == 1) {
            return new C1080q(this.f4381a, this);
        }
        if (i == 2) {
            return new C1065b(this.f4381a, this);
        }
        if (i == 3) {
            return new C1083t(this.f4381a, this);
        }
        if (i == 4) {
            return null;
        }
        j850.m140190a("Unrecognized stage: ", this.f4398r);
        return null;
    }

    /* JADX INFO: renamed from: p */
    private Stage m5363p(Stage stage) {
        int i = C1057a.f4408b[stage.ordinal()];
        if (i == 1) {
            return this.f4394n.mo167158a() ? Stage.DATA_CACHE : m5363p(Stage.DATA_CACHE);
        }
        if (i == 2) {
            return this.f4401u ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i == 3 || i == 4) {
            return Stage.FINISHED;
        }
        if (i == 5) {
            return this.f4394n.mo167159b() ? Stage.RESOURCE_CACHE : m5363p(Stage.RESOURCE_CACHE);
        }
        qhg0.m174539a("Unrecognized stage: ", stage);
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    private px50 m5364q(DataSource dataSource) {
        px50 px50Var = this.f4395o;
        if (Build.VERSION.SDK_INT < 26) {
            return px50Var;
        }
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f4381a.m5432w();
        kx50<Boolean> kx50Var = C1093a.f4608j;
        Boolean bool = (Boolean) px50Var.m171822c(kx50Var);
        if (bool != null && (!bool.booleanValue() || z)) {
            return px50Var;
        }
        px50 px50Var2 = new px50();
        px50Var2.m171823d(this.f4395o);
        px50Var2.m171824e(kx50Var, Boolean.valueOf(z));
        return px50Var2;
    }

    /* JADX INFO: renamed from: r */
    private int m5365r() {
        return this.f4390j.ordinal();
    }

    /* JADX INFO: renamed from: t */
    private void m5366t(String str, long j) {
        m5367u(str, j, null);
    }

    /* JADX INFO: renamed from: u */
    private void m5367u(String str, long j, String str2) {
        kxv.m147807a(j);
        Objects.toString(this.f4391k);
        if (str2 != null) {
            ", ".concat(str2);
        }
        Thread.currentThread().getName();
    }

    /* JADX INFO: renamed from: v */
    private void m5368v(rvc0<R> rvc0Var, DataSource dataSource) {
        m5358J();
        this.f4396p.mo5384c(rvc0Var, dataSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    private void m5369w(rvc0<R> rvc0Var, DataSource dataSource) {
        C1079p c1079p;
        if (rvc0Var instanceof dsm) {
            ((dsm) rvc0Var).initialize();
        }
        if (this.f4386f.m5389c()) {
            rvc0Var = C1079p.m5487c(rvc0Var);
            c1079p = rvc0Var;
        } else {
            c1079p = 0;
        }
        m5368v(rvc0Var, dataSource);
        this.f4398r = Stage.ENCODE;
        try {
            if (this.f4386f.m5389c()) {
                this.f4386f.m5388b(this.f4384d, this.f4395o);
            }
            if (c1079p != 0) {
                c1079p.m5489e();
            }
            m5371y();
        } catch (Throwable th) {
            if (c1079p != 0) {
                c1079p.m5489e();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    private void m5370x() {
        m5358J();
        this.f4396p.mo5383b(new GlideException("Failed to load resource", new ArrayList(this.f4382b)));
        m5372z();
    }

    /* JADX INFO: renamed from: y */
    private void m5371y() {
        if (this.f4387g.m5393b()) {
            m5354C();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m5372z() {
        if (this.f4387g.m5394c()) {
            m5354C();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: A */
    public <Z> rvc0<Z> m5373A(DataSource dataSource, @NonNull rvc0<Z> rvc0Var) {
        rvc0<Z> rvc0VarMo167760b;
        p7j0<Z> p7j0Var;
        EncodeStrategy encodeStrategyMo144138b;
        zvc0 zvc0VarM5423n;
        kxq c1066c;
        Class<?> cls = rvc0Var.get().getClass();
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            p7j0<Z> p7j0VarM5427r = this.f4381a.m5427r(cls);
            p7j0Var = p7j0VarM5427r;
            rvc0VarMo167760b = p7j0VarM5427r.mo167760b(this.f4388h, rvc0Var, this.f4392l, this.f4393m);
        } else {
            rvc0VarMo167760b = rvc0Var;
            p7j0Var = null;
        }
        if (!rvc0Var.equals(rvc0VarMo167760b)) {
            rvc0Var.recycle();
        }
        if (this.f4381a.m5431v(rvc0VarMo167760b)) {
            zvc0VarM5423n = this.f4381a.m5423n(rvc0VarMo167760b);
            encodeStrategyMo144138b = zvc0VarM5423n.mo144138b(this.f4395o);
        } else {
            encodeStrategyMo144138b = EncodeStrategy.NONE;
            zvc0VarM5423n = null;
        }
        if (!this.f4394n.mo167161d(!this.f4381a.m5433x(this.f4404x), dataSource, encodeStrategyMo144138b)) {
            return rvc0VarMo167760b;
        }
        if (zvc0VarM5423n == null) {
            throw new Registry.NoResultEncoderAvailableException(rvc0VarMo167760b.get().getClass());
        }
        int i = C1057a.f4409c[encodeStrategyMo144138b.ordinal()];
        if (i == 1) {
            c1066c = new C1066c(this.f4404x, this.f4389i);
        } else {
            if (i != 2) {
                qhg0.m174539a("Unknown strategy: ", encodeStrategyMo144138b);
                return null;
            }
            c1066c = new C1081r(this.f4381a.m5411b(), this.f4404x, this.f4389i, this.f4392l, this.f4393m, p7j0Var, cls, this.f4395o);
        }
        C1079p c1079pM5487c = C1079p.m5487c(rvc0VarMo167760b);
        this.f4386f.m5390d(c1066c, zvc0VarM5423n, c1079pM5487c);
        return c1079pM5487c;
    }

    /* JADX INFO: renamed from: B */
    public void m5374B(boolean z) {
        if (this.f4387g.m5395d(z)) {
            m5354C();
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean m5375K() {
        Stage stageM5363p = m5363p(Stage.INITIALIZE);
        return stageM5363p == Stage.RESOURCE_CACHE || stageM5363p == Stage.DATA_CACHE;
    }

    @Override // p149l.yvf.InterfaceC21545f
    @NonNull
    /* JADX INFO: renamed from: a */
    public ovf0 mo5376a() {
        return this.f4383c;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e.a
    /* JADX INFO: renamed from: b */
    public void mo5377b(kxq kxqVar, Exception exc, l4c<?> l4cVar, DataSource dataSource) {
        l4cVar.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(kxqVar, dataSource, l4cVar.mo103356a());
        this.f4382b.add(glideException);
        if (Thread.currentThread() == this.f4403w) {
            m5355F();
        } else {
            this.f4399s = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.f4396p.mo5385d(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e.a
    /* JADX INFO: renamed from: f */
    public void mo5378f() {
        this.f4399s = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.f4396p.mo5385d(this);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e.a
    /* JADX INFO: renamed from: g */
    public void mo5379g(kxq kxqVar, Object obj, l4c<?> l4cVar, DataSource dataSource, kxq kxqVar2) {
        this.f4404x = kxqVar;
        this.f4406z = obj;
        this.f4377B = l4cVar;
        this.f4376A = dataSource;
        this.f4405y = kxqVar2;
        if (Thread.currentThread() != this.f4403w) {
            this.f4399s = RunReason.DECODE_DATA;
            this.f4396p.mo5385d(this);
        } else {
            m1k.m152595a("DecodeJob.decodeFromRetrievedData");
            try {
                m5361n();
            } finally {
                m1k.m152598d();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m5380h() {
        this.f4380E = true;
        InterfaceC1068e interfaceC1068e = this.f4378C;
        if (interfaceC1068e != null) {
            interfaceC1068e.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull DecodeJob<?> decodeJob) {
        int iM5365r = m5365r() - decodeJob.m5365r();
        return iM5365r == 0 ? this.f4397q - decodeJob.f4397q : iM5365r;
    }

    @Override // java.lang.Runnable
    public void run() {
        m1k.m152596b("DecodeJob#run(model=%s)", this.f4402v);
        l4c<?> l4cVar = this.f4377B;
        try {
            try {
                try {
                    if (this.f4380E) {
                        m5370x();
                        if (l4cVar != null) {
                            l4cVar.cleanup();
                        }
                        m1k.m152598d();
                        return;
                    }
                    m5357I();
                    if (l4cVar != null) {
                        l4cVar.cleanup();
                    }
                    m1k.m152598d();
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Objects.toString(this.f4398r);
                    }
                    if (this.f4398r != Stage.ENCODE) {
                        this.f4382b.add(th);
                        m5370x();
                    }
                    if (!this.f4380E) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (l4cVar != null) {
                l4cVar.cleanup();
            }
            m1k.m152598d();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: s */
    public DecodeJob<R> m5382s(C1055c c1055c, Object obj, C1074k c1074k, kxq kxqVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, p2e p2eVar, Map<Class<?>, p7j0<?>> map, boolean z, boolean z2, boolean z3, px50 px50Var, InterfaceC1058b<R> interfaceC1058b, int i3) {
        this.f4381a.m5430u(c1055c, obj, kxqVar, i, i2, p2eVar, cls, cls2, priority, px50Var, map, z, z2, this.f4384d);
        this.f4388h = c1055c;
        this.f4389i = kxqVar;
        this.f4390j = priority;
        this.f4391k = c1074k;
        this.f4392l = i;
        this.f4393m = i2;
        this.f4394n = p2eVar;
        this.f4401u = z3;
        this.f4395o = px50Var;
        this.f4396p = interfaceC1058b;
        this.f4397q = i3;
        this.f4399s = RunReason.INITIALIZE;
        this.f4402v = obj;
        return this;
    }
}
