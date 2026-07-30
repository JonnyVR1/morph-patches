package p153l;

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
public class w36 {

    /* JADX INFO: renamed from: a */
    private vqm f187086a;

    /* JADX INFO: renamed from: b */
    private final bj2 f187087b;

    /* JADX INFO: renamed from: c */
    private ou3 f187088c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    private tu3 f187089d;

    /* JADX INFO: renamed from: e */
    private ew3 f187090e;

    /* JADX INFO: renamed from: f */
    private final nw3 f187091f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    private CTProductConfigController f187092g;

    /* JADX INFO: renamed from: h */
    private final ch2 f187093h;

    /* JADX INFO: renamed from: i */
    private final CleverTapInstanceConfig f187094i;

    /* JADX INFO: renamed from: j */
    private final Context f187095j;

    /* JADX INFO: renamed from: k */
    private final uzd f187096k;

    /* JADX INFO: renamed from: l */
    private InAppController f187097l;

    /* JADX INFO: renamed from: m */
    private cob0 f187098m;

    /* JADX INFO: renamed from: n */
    private ex3 f187099n;

    /* JADX INFO: renamed from: o */
    private InboxDeleteCoordinator f187100o;

    /* JADX INFO: renamed from: l.w36$a */
    public class CallableC21005a implements Callable<Void> {
        public CallableC21005a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            w36.this.m204738a();
            return null;
        }
    }

    public w36(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, nw3 nw3Var, ch2 ch2Var, uzd uzdVar, bj2 bj2Var) {
        this.f187094i = cleverTapInstanceConfig;
        this.f187091f = nw3Var;
        this.f187093h = ch2Var;
        this.f187096k = uzdVar;
        this.f187095j = context;
        this.f187087b = bj2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void m204738a() {
        synchronized (this.f187091f.m164938b()) {
            try {
                if (m204742e() != null) {
                    this.f187093h.mo96507a();
                    return;
                }
                if (this.f187096k.m198762E() != null) {
                    m204754q(new ew3(this.f187094i, this.f187096k.m198762E(), this.f187087b.mo104583c(this.f187095j), this.f187091f, this.f187093h, xel0.haveVideoPlayerSupport, this.f187100o));
                    this.f187093h.mo96507a();
                    InboxDeleteCoordinator inboxDeleteCoordinator = this.f187100o;
                    if (inboxDeleteCoordinator != null) {
                        inboxDeleteCoordinator.m6779e(this.f187096k.m198762E());
                    }
                } else {
                    this.f187094i.getLogger().info("CRITICAL : No device ID found!");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public ou3 m204740c() {
        return this.f187088c;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public tu3 m204741d() {
        return this.f187089d;
    }

    /* JADX INFO: renamed from: e */
    public ew3 m204742e() {
        return this.f187090e;
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public CTProductConfigController m204743f() {
        return this.f187092g;
    }

    /* JADX INFO: renamed from: g */
    public ex3 m204744g() {
        return this.f187099n;
    }

    /* JADX INFO: renamed from: h */
    public InAppController m204745h() {
        return this.f187097l;
    }

    /* JADX INFO: renamed from: i */
    public vqm m204746i() {
        return this.f187086a;
    }

    /* JADX INFO: renamed from: j */
    public cob0 m204747j() {
        return this.f187098m;
    }

    @AnyThread
    /* JADX INFO: renamed from: k */
    public void m204748k() {
        boolean zIsAnalyticsOnly = this.f187094i.isAnalyticsOnly();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f187094i;
        if (zIsAnalyticsOnly) {
            cleverTapInstanceConfig.getLogger().debug(this.f187094i.getAccountId(), "Instance is analytics only, not initializing Notification Inbox");
        } else {
            ru3.m183186c(cleverTapInstanceConfig).m187990d().m7000g("initializeInbox", new CallableC21005a());
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: l */
    public void m204749l() {
        if (this.f187094i.isAnalyticsOnly()) {
            this.f187094i.getLogger().debug(this.f187094i.getAccountId(), "Instance is analytics only, not initializing Notification Inbox");
        } else {
            m204738a();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m204750m(JSONArray jSONArray, boolean z) {
        ut2 ut2VarMo96511e = this.f187093h.mo96511e();
        if (ut2VarMo96511e != null) {
            ut2VarMo96511e.mo100022a(jSONArray, z);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m204751n() {
        if (this.f187099n != null) {
            this.f187093h.mo96516j();
            this.f187093h.mo96530x(null);
            this.f187099n.m123008i(null);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m204752o(ou3 ou3Var) {
        this.f187088c = ou3Var;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public void m204753p(tu3 tu3Var) {
        this.f187089d = tu3Var;
    }

    /* JADX INFO: renamed from: q */
    public void m204754q(ew3 ew3Var) {
        this.f187090e = ew3Var;
    }

    @Deprecated
    /* JADX INFO: renamed from: r */
    public void m204755r(CTProductConfigController cTProductConfigController) {
        this.f187092g = cTProductConfigController;
    }

    /* JADX INFO: renamed from: s */
    public void m204756s(ex3 ex3Var) {
        this.f187099n = ex3Var;
    }

    /* JADX INFO: renamed from: t */
    public void m204757t(InAppController inAppController) {
        this.f187097l = inAppController;
    }

    /* JADX INFO: renamed from: u */
    public void m204758u(vqm vqmVar) {
        this.f187086a = vqmVar;
    }

    /* JADX INFO: renamed from: v */
    public void m204759v(InboxDeleteCoordinator inboxDeleteCoordinator) {
        this.f187100o = inboxDeleteCoordinator;
    }

    /* JADX INFO: renamed from: w */
    public void m204760w(cob0 cob0Var) {
        this.f187098m = cob0Var;
    }
}
