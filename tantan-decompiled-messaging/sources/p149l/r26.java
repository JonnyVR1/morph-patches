package p149l;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inbox.InboxDeleteCoordinator;
import com.clevertap.android.sdk.product_config.CTProductConfigController;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class r26 {

    /* JADX INFO: renamed from: a */
    private tom f157366a;

    /* JADX INFO: renamed from: b */
    private final ui2 f157367b;

    /* JADX INFO: renamed from: c */
    private pt3 f157368c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    private ut3 f157369d;

    /* JADX INFO: renamed from: e */
    private fv3 f157370e;

    /* JADX INFO: renamed from: f */
    private final ov3 f157371f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    private CTProductConfigController f157372g;

    /* JADX INFO: renamed from: h */
    private final vg2 f157373h;

    /* JADX INFO: renamed from: i */
    private final CleverTapInstanceConfig f157374i;

    /* JADX INFO: renamed from: j */
    private final Context f157375j;

    /* JADX INFO: renamed from: k */
    private final hyd f157376k;

    /* JADX INFO: renamed from: l */
    private InAppController f157377l;

    /* JADX INFO: renamed from: m */
    private yfb0 f157378m;

    /* JADX INFO: renamed from: n */
    private fw3 f157379n;

    /* JADX INFO: renamed from: o */
    private InboxDeleteCoordinator f157380o;

    /* JADX INFO: renamed from: l.r26$a */
    public class CallableC19626a implements Callable<Void> {
        public CallableC19626a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            r26.this.m177566a();
            return null;
        }
    }

    public r26(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, ov3 ov3Var, vg2 vg2Var, hyd hydVar, ui2 ui2Var) {
        this.f157374i = cleverTapInstanceConfig;
        this.f157371f = ov3Var;
        this.f157373h = vg2Var;
        this.f157376k = hydVar;
        this.f157375j = context;
        this.f157367b = ui2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void m177566a() {
        synchronized (this.f157371f.m166152b()) {
            try {
                if (m177570e() != null) {
                    this.f157373h.mo100727a();
                    return;
                }
                if (this.f157376k.m133539E() != null) {
                    m177582q(new fv3(this.f157374i, this.f157376k.m133539E(), this.f157367b.mo94410c(this.f157375j), this.f157371f, this.f157373h, t5l0.haveVideoPlayerSupport, this.f157380o));
                    this.f157373h.mo100727a();
                    InboxDeleteCoordinator inboxDeleteCoordinator = this.f157380o;
                    if (inboxDeleteCoordinator != null) {
                        inboxDeleteCoordinator.m6725e(this.f157376k.m133539E());
                    }
                } else {
                    this.f157374i.getLogger().info("CRITICAL : No device ID found!");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public pt3 m177568c() {
        return this.f157368c;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public ut3 m177569d() {
        return this.f157369d;
    }

    /* JADX INFO: renamed from: e */
    public fv3 m177570e() {
        return this.f157370e;
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public CTProductConfigController m177571f() {
        return this.f157372g;
    }

    /* JADX INFO: renamed from: g */
    public fw3 m177572g() {
        return this.f157379n;
    }

    /* JADX INFO: renamed from: h */
    public InAppController m177573h() {
        return this.f157377l;
    }

    /* JADX INFO: renamed from: i */
    public tom m177574i() {
        return this.f157366a;
    }

    /* JADX INFO: renamed from: j */
    public yfb0 m177575j() {
        return this.f157378m;
    }

    @AnyThread
    /* JADX INFO: renamed from: k */
    public void m177576k() {
        boolean zIsAnalyticsOnly = this.f157374i.isAnalyticsOnly();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f157374i;
        if (zIsAnalyticsOnly) {
            cleverTapInstanceConfig.getLogger().debug(this.f157374i.getAccountId(), "Instance is analytics only, not initializing Notification Inbox");
        } else {
            st3.m185849c(cleverTapInstanceConfig).m190592d().m6946g("initializeInbox", new CallableC19626a());
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: l */
    public void m177577l() {
        if (this.f157374i.isAnalyticsOnly()) {
            this.f157374i.getLogger().debug(this.f157374i.getAccountId(), "Instance is analytics only, not initializing Notification Inbox");
        } else {
            m177566a();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m177578m(JSONArray jSONArray, boolean z) {
        et2 et2VarMo100731e = this.f157373h.mo100731e();
        if (et2VarMo100731e != null) {
            et2VarMo100731e.mo117970a(jSONArray, z);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m177579n() {
        if (this.f157379n != null) {
            this.f157373h.mo100736j();
            this.f157373h.mo100750x(null);
            this.f157379n.m123507i(null);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m177580o(pt3 pt3Var) {
        this.f157368c = pt3Var;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public void m177581p(ut3 ut3Var) {
        this.f157369d = ut3Var;
    }

    /* JADX INFO: renamed from: q */
    public void m177582q(fv3 fv3Var) {
        this.f157370e = fv3Var;
    }

    @Deprecated
    /* JADX INFO: renamed from: r */
    public void m177583r(CTProductConfigController cTProductConfigController) {
        this.f157372g = cTProductConfigController;
    }

    /* JADX INFO: renamed from: s */
    public void m177584s(fw3 fw3Var) {
        this.f157379n = fw3Var;
    }

    /* JADX INFO: renamed from: t */
    public void m177585t(InAppController inAppController) {
        this.f157377l = inAppController;
    }

    /* JADX INFO: renamed from: u */
    public void m177586u(tom tomVar) {
        this.f157366a = tomVar;
    }

    /* JADX INFO: renamed from: v */
    public void m177587v(InboxDeleteCoordinator inboxDeleteCoordinator) {
        this.f157380o = inboxDeleteCoordinator;
    }

    /* JADX INFO: renamed from: w */
    public void m177588w(yfb0 yfb0Var) {
        this.f157378m = yfb0Var;
    }
}
