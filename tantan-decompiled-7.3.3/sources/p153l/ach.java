package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ach {

    /* JADX INFO: renamed from: g */
    public static boolean f69705g = false;

    /* JADX INFO: renamed from: h */
    public static volatile ach f69706h;

    /* JADX INFO: renamed from: a */
    public kcg0 f69707a;

    /* JADX INFO: renamed from: b */
    public pbh f69708b;

    /* JADX INFO: renamed from: c */
    public Runnable f69709c = new RunnableC15684a();

    /* JADX INFO: renamed from: d */
    public boolean f69710d = false;

    /* JADX INFO: renamed from: e */
    public byd0 f69711e = new byd0("show_like_red_dot_last_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public vxd0 f69712f = new vxd0("show_like_red_dot_last_count_" + FeedModule.m61405F().userId(), 0);

    /* JADX INFO: renamed from: l.ach$a */
    public class RunnableC15684a implements Runnable {
        public RunnableC15684a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FeedModule.f39703d != null) {
                ach.this.f69708b.m171092j();
                l51.m152888H(FeedModule.f39700a, ach.this.f69709c, Constants.ONE_MIN_IN_MILLIS);
            }
        }
    }

    public ach() {
        pbh pbhVar = new pbh();
        this.f69708b = pbhVar;
        pbhVar.m171091i(new j3m() { // from class: l.zbh
            @Override // p153l.j3m
            /* JADX INFO: renamed from: a */
            public final void mo143360a(Object obj) {
                this.f203669a.m96853i((pf60) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m96848d(pf60 pf60Var) {
        return (Boolean) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: g */
    public static ach m96850g() {
        if (f69706h == null) {
            synchronized (ach.class) {
                try {
                    if (f69706h == null) {
                        f69706h = new ach();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f69706h;
    }

    /* JADX INFO: renamed from: f */
    public boolean m96851f() {
        return m96852h() || this.f69712f.get().intValue() < 5;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m96852h() {
        return this.f69711e.get().longValue() == 0 || !p6i.m170903l(this.f69711e.get().longValue(), pzi0.m174454o());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m96853i(pf60 pf60Var) {
        List list = (List) pf60Var.f152157b;
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return;
        }
        if (TextUtils.equals(FeedModule.f39703d.f121341a0.get(), ((Moment) list.get(0)).f56859id)) {
            m96856l(true);
        } else {
            FeedModule.f39703d.f121287B0.m137019l(((Moment) list.get(0)).f56859id);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m96854j(boolean z) {
        if (!z) {
            this.f69710d = false;
            l51.m152890J(this.f69709c);
        } else {
            this.f69710d = true;
            l51.m152890J(this.f69709c);
            l51.m152887G(this.f69709c);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m96855k() {
        if (m96852h()) {
            this.f69711e.put(Long.valueOf(pzi0.m174454o()));
            this.f69712f.put(1);
        } else {
            this.f69712f.put(Integer.valueOf(this.f69712f.get().intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m96856l(boolean z) {
        if (f69705g || this.f69710d) {
            return;
        }
        if (!z) {
            this.f69708b.m171092j();
            return;
        }
        kcg0 kcg0Var = this.f69707a;
        if (kcg0Var != null && !kcg0Var.isUnsubscribed()) {
            this.f69707a.unsubscribe();
        }
        this.f69710d = true;
        this.f69707a = psd0.m173625r(FeedModule.m61405F().signedIn(), Act.foreground(), new zrb()).filter(new qcj() { // from class: l.wbh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ach.m96848d((pf60) obj);
            }
        }).map(new qcj() { // from class: l.xbh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pf60) obj).f152157b != 0);
            }
        }).distinctUntilChanged().subscribe(new y20() { // from class: l.ybh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198309a.m96854j(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m96857m() {
        kcg0 kcg0Var = this.f69707a;
        if (kcg0Var != null && !kcg0Var.isUnsubscribed()) {
            this.f69707a.unsubscribe();
        }
        l51.m152890J(this.f69709c);
        this.f69710d = false;
    }
}
