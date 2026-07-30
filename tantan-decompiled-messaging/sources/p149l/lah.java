package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class lah {

    /* JADX INFO: renamed from: g */
    public static boolean f127195g = false;

    /* JADX INFO: renamed from: h */
    public static volatile lah f127196h;

    /* JADX INFO: renamed from: a */
    public c4g0 f127197a;

    /* JADX INFO: renamed from: b */
    public aah f127198b;

    /* JADX INFO: renamed from: c */
    public Runnable f127199c = new RunnableC18180a();

    /* JADX INFO: renamed from: d */
    public boolean f127200d = false;

    /* JADX INFO: renamed from: e */
    public zpd0 f127201e = new zpd0("show_like_red_dot_last_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public tpd0 f127202f = new tpd0("show_like_red_dot_last_count_" + FeedModule.m60221F().userId(), 0);

    /* JADX INFO: renamed from: l.lah$a */
    public class RunnableC18180a implements Runnable {
        public RunnableC18180a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FeedModule.f38855d != null) {
                lah.this.f127198b.m192037j();
                e51.m114743H(FeedModule.f38852a, lah.this.f127199c, Constants.ONE_MIN_IN_MILLIS);
            }
        }
    }

    public lah() {
        aah aahVar = new aah();
        this.f127198b = aahVar;
        aahVar.m192036i(new p0m() { // from class: l.kah
            @Override // p149l.p0m
            /* JADX INFO: renamed from: a */
            public final void mo145143a(Object obj) {
                this.f122113a.m149157i((j760) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m149152d(j760 j760Var) {
        return (Boolean) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: g */
    public static lah m149154g() {
        if (f127196h == null) {
            synchronized (lah.class) {
                try {
                    if (f127196h == null) {
                        f127196h = new lah();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f127196h;
    }

    /* JADX INFO: renamed from: f */
    public boolean m149155f() {
        return m149156h() || this.f127202f.get().intValue() < 5;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m149156h() {
        return this.f127201e.get().longValue() == 0 || !a5i.m95036l(this.f127201e.get().longValue(), mqi0.m155944o());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m149157i(j760 j760Var) {
        List list = (List) j760Var.f116565b;
        if (!NullChecker.m81303a(list) || list.size() <= 0) {
            return;
        }
        if (TextUtils.equals(FeedModule.f38855d.f193031a0.get(), ((Moment) list.get(0)).f56011id)) {
            m149160l(true);
        } else {
            FeedModule.f38855d.f192977B0.m132487l(((Moment) list.get(0)).f56011id);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m149158j(boolean z) {
        if (!z) {
            this.f127200d = false;
            e51.m114745J(this.f127199c);
        } else {
            this.f127200d = true;
            e51.m114745J(this.f127199c);
            e51.m114742G(this.f127199c);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m149159k() {
        if (m149156h()) {
            this.f127201e.put(Long.valueOf(mqi0.m155944o()));
            this.f127202f.put(1);
        } else {
            this.f127202f.put(Integer.valueOf(this.f127202f.get().intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m149160l(boolean z) {
        if (f127195g || this.f127200d) {
            return;
        }
        if (!z) {
            this.f127198b.m192037j();
            return;
        }
        c4g0 c4g0Var = this.f127197a;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f127197a.unsubscribe();
        }
        this.f127200d = true;
        this.f127197a = mkd0.m154984r(FeedModule.m60221F().signedIn(), Act.foreground(), new lqb()).filter(new w9j() { // from class: l.hah
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lah.m149152d((j760) obj);
            }
        }).map(new w9j() { // from class: l.iah
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj).f116565b != 0);
            }
        }).distinctUntilChanged().subscribe(new e30() { // from class: l.jah
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117086a.m149158j(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m149161m() {
        c4g0 c4g0Var = this.f127197a;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f127197a.unsubscribe();
        }
        e51.m114745J(this.f127199c);
        this.f127200d = false;
    }
}
