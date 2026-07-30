package p153l;

import Sudchar.Sudfor;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class jgg0 implements Runnable {

    /* JADX INFO: renamed from: q */
    public static final ThreadPoolExecutor f120712q = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), new vng0("OkDownload Cancel Block"));

    /* JADX INFO: renamed from: a */
    public final int f120713a;

    /* JADX INFO: renamed from: b */
    public final aug0 f120714b;

    /* JADX INFO: renamed from: c */
    public final bog0 f120715c;

    /* JADX INFO: renamed from: d */
    public final ixg0 f120716d;

    /* JADX INFO: renamed from: i */
    public long f120721i;

    /* JADX INFO: renamed from: j */
    public volatile rug0 f120722j;

    /* JADX INFO: renamed from: k */
    public long f120723k;

    /* JADX INFO: renamed from: l */
    public volatile Thread f120724l;

    /* JADX INFO: renamed from: n */
    public final ehg0 f120726n;

    /* JADX INFO: renamed from: e */
    public final ArrayList f120717e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f120718f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f120719g = 0;

    /* JADX INFO: renamed from: h */
    public int f120720h = 0;

    /* JADX INFO: renamed from: o */
    public final AtomicBoolean f120727o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: p */
    public final qfg0 f120728p = new qfg0(this);

    /* JADX INFO: renamed from: m */
    public final d0h0 f120725m = jwg0.m147162a().f122920b;

    public jgg0(int i, aug0 aug0Var, bog0 bog0Var, ixg0 ixg0Var, ehg0 ehg0Var) {
        this.f120713a = i;
        this.f120714b = aug0Var;
        this.f120716d = ixg0Var;
        this.f120715c = bog0Var;
        this.f120726n = ehg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized csg0 m144773a() {
        try {
            if (this.f120716d.m142520c()) {
                throw Sudfor.f211027Suddo;
            }
            if (this.f120722j == null) {
                String str = this.f120716d.f117399a;
                if (str == null) {
                    str = this.f120715c.f77675b;
                }
                this.f120722j = jwg0.m147162a().f122922d.m173106a(str);
                this.f120722j.m183192b(this.f120714b.f73515x);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f120722j;
    }

    /* JADX INFO: renamed from: b */
    public final long m144774b() throws Sudfor {
        if (this.f120716d.m142520c()) {
            throw Sudfor.f211027Suddo;
        }
        ArrayList arrayList = this.f120718f;
        int i = this.f120720h;
        this.f120720h = i + 1;
        return ((ztg0) arrayList.get(i)).mo126924a(this);
    }

    /* JADX INFO: renamed from: c */
    public final vkg0 m144775c() {
        if (this.f120716d.m142520c()) {
            throw Sudfor.f211027Suddo;
        }
        ArrayList arrayList = this.f120717e;
        int i = this.f120719g;
        this.f120719g = i + 1;
        return ((wng0) arrayList.get(i)).mo110337b(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m144776d() throws IOException {
        d0h0 d0h0Var = jwg0.m147162a().f122920b;
        iwg0 iwg0Var = new iwg0();
        ujg0 ujg0Var = new ujg0();
        this.f120717e.add(iwg0Var);
        this.f120717e.add(ujg0Var);
        this.f120717e.add(new nrg0());
        this.f120717e.add(new ckg0());
        this.f120719g = 0;
        vkg0 vkg0VarM144775c = m144775c();
        if (this.f120716d.m142520c()) {
            throw Sudfor.f211027Suddo;
        }
        oyg0 oyg0Var = d0h0Var.f84561a;
        aug0 aug0Var = this.f120714b;
        int i = this.f120713a;
        long j = this.f120721i;
        oyg0Var.getClass();
        int i2 = aug0Var.f73493b;
        if (aug0Var.f73505n) {
            oyg0Var.f149795a.post(new ppg0(aug0Var, i, j));
        } else {
            aug0Var.f73507p.getClass();
        }
        int i3 = this.f120713a;
        i5d0 i5d0Var = ((rug0) vkg0VarM144775c).f164921d;
        if (i5d0Var == null) {
            zpg0.m220844a("Please invoke execute first!");
            return;
        }
        k5d0 k5d0VarM138670k = i5d0Var.m138670k();
        if (k5d0VarM138670k == null) {
            zpg0.m220844a("no body found on response!");
            return;
        }
        frg0 frg0Var = new frg0(i3, k5d0VarM138670k.byteStream(), this.f120716d.m142518a(), this.f120714b);
        this.f120718f.add(iwg0Var);
        this.f120718f.add(ujg0Var);
        this.f120718f.add(frg0Var);
        this.f120720h = 0;
        long jM144774b = m144774b();
        oyg0 oyg0Var2 = d0h0Var.f84561a;
        aug0 aug0Var2 = this.f120714b;
        int i4 = this.f120713a;
        oyg0Var2.getClass();
        int i5 = aug0Var2.f73493b;
        if (aug0Var2.f73505n) {
            oyg0Var2.f149795a.post(new qqg0(aug0Var2, i4, jM144774b));
        } else {
            aug0Var2.f73507p.m181852e(aug0Var2, i4, jM144774b);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f120727o.get()) {
            throw new IllegalAccessError("The chain has been finished!");
        }
        this.f120724l = Thread.currentThread();
        try {
            m144776d();
        } catch (IOException unused) {
        } finally {
            this.f120727o.set(true);
            f120712q.execute(this.f120728p);
        }
    }
}
