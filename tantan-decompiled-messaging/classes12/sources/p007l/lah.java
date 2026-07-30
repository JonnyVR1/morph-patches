package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c4g0;
import l.e30;
import l.e51;
import l.j760;
import l.lqb;
import l.mkd0;
import l.mqi0;
import l.tpd0;
import l.w9j;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class lah {

    /* JADX INFO: renamed from: g */
    public static boolean f9976g = false;

    /* JADX INFO: renamed from: h */
    public static volatile lah f9977h;

    /* JADX INFO: renamed from: a */
    public c4g0 f9978a;

    /* JADX INFO: renamed from: b */
    public aah f9979b;

    /* JADX INFO: renamed from: c */
    public Runnable f9980c = new RunnableC2418a();

    /* JADX INFO: renamed from: d */
    public boolean f9981d = false;

    /* JADX INFO: renamed from: e */
    public zpd0 f9982e = new zpd0("show_like_red_dot_last_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public tpd0 f9983f = new tpd0("show_like_red_dot_last_count_" + FeedModule.m1139F().userId(), 0);

    /* JADX INFO: renamed from: l.lah$a */
    public class RunnableC2418a implements Runnable {
        public RunnableC2418a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FeedModule.f316d != null) {
                lah.this.f9979b.m14781j();
                e51.H(FeedModule.f313a, lah.this.f9980c, 60000L);
            }
        }
    }

    public lah() {
        aah aahVar = new aah();
        this.f9979b = aahVar;
        aahVar.m14780i(new p0m() { // from class: l.kah
            @Override // p007l.p0m
            /* JADX INFO: renamed from: a */
            public final void mo11399a(Object obj) {
                this.f9659a.m11630i((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m11625d(j760 j760Var) {
        return (Boolean) j760Var.a;
    }

    /* JADX INFO: renamed from: g */
    public static lah m11627g() {
        if (f9977h == null) {
            synchronized (lah.class) {
                try {
                    if (f9977h == null) {
                        f9977h = new lah();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9977h;
    }

    /* JADX INFO: renamed from: f */
    public boolean m11628f() {
        return m11629h() || ((Integer) this.f9983f.get()).intValue() < 5;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11629h() {
        return ((Long) this.f9982e.get()).longValue() == 0 || !a5i.m8412l(((Long) this.f9982e.get()).longValue(), mqi0.o());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m11630i(j760 j760Var) {
        List list = (List) j760Var.b;
        if (!NullChecker.a(list) || list.size() <= 0) {
            return;
        }
        if (TextUtils.equals((String) FeedModule.f316d.f14966a0.get(), ((DbObject) ((Moment) list.get(0))).id)) {
            m11633l(true);
        } else {
            FeedModule.f316d.f14912B0.onNext(((DbObject) ((Moment) list.get(0))).id);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m11631j(boolean z) {
        if (!z) {
            this.f9981d = false;
            e51.J(this.f9980c);
        } else {
            this.f9981d = true;
            e51.J(this.f9980c);
            e51.G(this.f9980c);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m11632k() {
        if (m11629h()) {
            this.f9982e.put(Long.valueOf(mqi0.o()));
            this.f9983f.put(1);
        } else {
            this.f9983f.put(Integer.valueOf(((Integer) this.f9983f.get()).intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m11633l(boolean z) {
        if (f9976g || this.f9981d) {
            return;
        }
        if (!z) {
            this.f9979b.m14781j();
            return;
        }
        c4g0 c4g0Var = this.f9978a;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f9978a.unsubscribe();
        }
        this.f9981d = true;
        this.f9978a = mkd0.r(FeedModule.m1139F().signedIn(), Act.foreground(), new lqb()).filter(new w9j() { // from class: l.hah
            public final Object call(Object obj) {
                return lah.m11625d((j760) obj);
            }
        }).map(new w9j() { // from class: l.iah
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj).b != null);
            }
        }).distinctUntilChanged().subscribe(new e30() { // from class: l.jah
            public final void call(Object obj) {
                this.f9295a.m11631j(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m11634m() {
        c4g0 c4g0Var = this.f9978a;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f9978a.unsubscribe();
        }
        e51.J(this.f9980c);
        this.f9981d = false;
    }
}
