package p153l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.inbox.InboxV2Bridge;
import com.clevertap.android.sdk.network.ContentFetchManager;
import com.clevertap.android.sdk.network.fetch.FetchTrigger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class q0w {

    /* JADX INFO: renamed from: a */
    private String f155093a = null;

    /* JADX INFO: renamed from: b */
    private final sk0 f155094b;

    /* JADX INFO: renamed from: c */
    private final ik2 f155095c;

    /* JADX INFO: renamed from: d */
    private final nw3 f155096d;

    /* JADX INFO: renamed from: e */
    private final ch2 f155097e;

    /* JADX INFO: renamed from: f */
    private final CleverTapInstanceConfig f155098f;

    /* JADX INFO: renamed from: g */
    private final Context f155099g;

    /* JADX INFO: renamed from: h */
    private final w36 f155100h;

    /* JADX INFO: renamed from: i */
    private final bu9 f155101i;

    /* JADX INFO: renamed from: j */
    private final bj2 f155102j;

    /* JADX INFO: renamed from: k */
    private final uzd f155103k;

    /* JADX INFO: renamed from: l */
    private final duv f155104l;

    /* JADX INFO: renamed from: m */
    private final cob0 f155105m;

    /* JADX INFO: renamed from: n */
    private final xse0 f155106n;

    /* JADX INFO: renamed from: o */
    private final u0l0 f155107o;

    /* JADX INFO: renamed from: p */
    private final u0w f155108p;

    /* JADX INFO: renamed from: q */
    private final ContentFetchManager f155109q;

    /* JADX INFO: renamed from: r */
    private final InboxV2Bridge f155110r;

    /* JADX INFO: renamed from: l.q0w$a */
    public class CallableC19483a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f155111a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f155112b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f155113c;

        public CallableC19483a(Map map, String str, String str2) {
            this.f155111a = map;
            this.f155112b = str;
            this.f155113c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            String str;
            try {
                Logger logger = q0w.this.f155098f.getLogger();
                String accountId = q0w.this.f155098f.getAccountId();
                StringBuilder sb = new StringBuilder("asyncProfileSwitchUser:[profile ");
                sb.append(this.f155111a);
                sb.append(" with Cached GUID ");
                if (this.f155112b != null) {
                    str = q0w.this.f155093a;
                } else {
                    str = "NULL and cleverTapID " + this.f155113c;
                }
                sb.append(str);
                logger.verbose(accountId, sb.toString());
                q0w.this.f155101i.m106457T(false);
                q0w.this.f155105m.m111630w(false);
                q0w.this.f155095c.mo140246d(q0w.this.f155099g, EventGroup.REGULAR, null, true);
                q0w.this.f155095c.mo140246d(q0w.this.f155099g, EventGroup.PUSH_NOTIFICATION_VIEWED, null, true);
                q0w.this.f155109q.m6832d();
                q0w.this.m174786z();
                q0w.this.f155102j.mo104582b(q0w.this.f155099g);
                bu9.m106431K(1);
                q0w.this.f155106n.m212968c();
                String str2 = this.f155112b;
                q0w q0wVar = q0w.this;
                if (str2 != null) {
                    q0wVar.f155103k.m198790o(this.f155112b);
                    q0w.this.f155097e.mo96527u(this.f155112b);
                } else {
                    boolean enableCustomCleverTapId = q0wVar.f155098f.getEnableCustomCleverTapId();
                    q0w q0wVar2 = q0w.this;
                    if (enableCustomCleverTapId) {
                        q0wVar2.f155103k.m198789n(this.f155113c);
                    } else {
                        q0wVar2.f155103k.m198787m();
                    }
                }
                q0w.this.f155104l.m118212k();
                q0w.this.f155097e.mo96527u(q0w.this.f155103k.m198762E());
                q0w.this.f155103k.m198785k0();
                q0w.this.f155103k.m198788m0();
                q0w.this.m174760H();
                q0w.this.f155094b.m186397w();
                if (this.f155111a != null) {
                    q0w.this.f155094b.m186385N(this.f155111a);
                }
                q0w.this.f155105m.m111630w(true);
                q0w.this.m174758F();
                q0w.this.m174761I();
                q0w.this.m174757E();
                q0w.this.m174759G();
                q0w.this.m174789C();
                q0w.this.m174756D();
                q0w.this.m174787A();
                q0w.this.f155100h.m204746i().m202402e(q0w.this.f155103k.m198762E());
            } catch (Throwable th) {
                q0w.this.f155098f.getLogger().verbose(q0w.this.f155098f.getAccountId(), "Reset Profile error", th);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.q0w$b */
    public class CallableC19484b implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f155115a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f155116b;

        public CallableC19484b(Map map, String str) {
            this.f155115a = map;
            this.f155116b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            q0w.this.m174763b(this.f155115a, this.f155116b);
            return null;
        }
    }

    public q0w(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, uzd uzdVar, u0l0 u0l0Var, ik2 ik2Var, sk0 sk0Var, bu9 bu9Var, w36 w36Var, xse0 xse0Var, duv duvVar, ch2 ch2Var, n1c n1cVar, nw3 nw3Var, u0w u0wVar, ContentFetchManager contentFetchManager, InboxV2Bridge inboxV2Bridge) {
        this.f155098f = cleverTapInstanceConfig;
        this.f155099g = context;
        this.f155103k = uzdVar;
        this.f155107o = u0l0Var;
        this.f155095c = ik2Var;
        this.f155094b = sk0Var;
        this.f155101i = bu9Var;
        this.f155105m = w36Var.m204747j();
        this.f155106n = xse0Var;
        this.f155104l = duvVar;
        this.f155097e = ch2Var;
        this.f155102j = n1cVar;
        this.f155100h = w36Var;
        this.f155096d = nw3Var;
        this.f155108p = u0wVar;
        this.f155109q = contentFetchManager;
        this.f155110r = inboxV2Bridge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m174756D() {
        if (this.f155100h.m204740c() != null) {
            this.f155100h.m204740c().m169218a();
        } else {
            this.f155098f.getLogger().verbose(this.f155098f.getAccountId(), "DisplayUnit : Can't reset Display Units, DisplayUnitcontroller is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public void m174757E() {
        tu3 tu3VarM204741d = this.f155100h.m204741d();
        if (tu3VarM204741d == null || !tu3VarM204741d.m192720m()) {
            this.f155098f.getLogger().verbose(this.f155098f.getAccountId(), "DisplayUnit : Can't reset Display Units, CTFeatureFlagsController is null");
        } else {
            tu3VarM204741d.m192721o(this.f155103k.m198762E());
            tu3VarM204741d.m192714e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m174758F() {
        synchronized (this.f155096d.m164938b()) {
            this.f155100h.m204754q(null);
        }
        this.f155100h.m204748k();
        this.f155110r.m6782c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m174759G() {
        if (this.f155098f.isAnalyticsOnly()) {
            this.f155098f.getLogger().debug(this.f155098f.getAccountId(), "Product Config is not enabled for this instance");
            return;
        }
        if (this.f155100h.m204743f() != null) {
            this.f155100h.m204743f().m6942t();
        }
        this.f155100h.m204755r(tw3.m193342a(this.f155099g, this.f155103k, this.f155098f, this.f155094b, this.f155101i, this.f155097e));
        this.f155098f.getLogger().verbose(this.f155098f.getAccountId(), "Product Config reset");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public void m174760H() {
        if (this.f155100h.m204744g() != null) {
            this.f155100h.m204744g().m123004e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public void m174761I() {
        ru3.m183186c(this.f155098f).m187990d().m7000g("postSwitchInboxFetch", new Callable() { // from class: l.p0w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q0w.m174762a(this.f150102a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m174762a(q0w q0wVar) {
        q0wVar.f155095c.mo140244b(q0wVar.f155099g, EventGroup.REGULAR);
        q0wVar.f155110r.m6783d(FetchTrigger.SYSTEM, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m174763b(Map<String, Object> map, String str) {
        if (map == null) {
            return;
        }
        try {
            String strM198762E = this.f155103k.m198762E();
            if (strM198762E == null) {
                return;
            }
            mfm mfmVarM162931a = nfm.m162931a(this.f155099g, this.f155098f, this.f155107o);
            boolean z = false;
            for (String str2 : map.keySet()) {
                Object obj = map.get(str2);
                if (mfmVarM162931a.mo157933b(str2)) {
                    if (!(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                        this.f155098f.getLogger().debug(this.f155098f.getAccountId(), "onUserLogin: Aborting the operation. Non-primitive value for the identifier key = " + str2);
                        return;
                    }
                    String string = obj.toString();
                    if (!string.isEmpty()) {
                        z = true;
                        String strM193878g = this.f155108p.m193878g(str2, string);
                        this.f155093a = strM193878g;
                        if (strM193878g != null) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (!this.f155103k.m198780d0() && (!z || this.f155108p.m193879h())) {
                this.f155098f.getLogger().debug(this.f155098f.getAccountId(), "onUserLogin: no identifier provided or device is anonymous, pushing on current user profile");
                this.f155094b.m186385N(map);
                return;
            }
            String str3 = this.f155093a;
            if (str3 != null && str3.equals(strM198762E)) {
                this.f155098f.getLogger().debug(this.f155098f.getAccountId(), "onUserLogin: " + map + " maps to current device id " + strM198762E + " pushing on current profile");
                this.f155094b.m186385N(map);
                return;
            }
            Logger logger = this.f155098f.getLogger();
            String accountId = this.f155098f.getAccountId();
            StringBuilder sb = new StringBuilder();
            sb.append("onUserLogin: queuing reset profile for ");
            sb.append(map);
            sb.append(" with Cached GUID ");
            String str4 = this.f155093a;
            if (str4 == null) {
                str4 = "NULL";
            }
            sb.append(str4);
            logger.verbose(accountId, sb.toString());
            m174790y(map, this.f155093a, str);
        } catch (Throwable th) {
            this.f155098f.getLogger().verbose(this.f155098f.getAccountId(), "onUserLogin failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: z */
    public void m174786z() {
        if (this.f155100h.m204745h() != null) {
            this.f155100h.m204745h().m6326x();
            this.f155098f.getLogger().verbose(this.f155098f.getAccountId(), "Cancelled all scheduled in-apps for user change");
        }
    }

    /* JADX INFO: renamed from: A */
    public void m174787A() {
        List<es4> listMo96512f = this.f155097e.mo96512f();
        synchronized (listMo96512f) {
            try {
                for (es4 es4Var : listMo96512f) {
                    if (es4Var != null) {
                        es4Var.mo122304a(this.f155103k.m198762E(), this.f155098f.getAccountId());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m174788B(Map<String, Object> map, String str) {
        if (this.f155098f.getEnableCustomCleverTapId()) {
            if (str == null) {
                Logger.m5923i("CLEVERTAP_USE_CUSTOM_ID has been specified in the AndroidManifest.xml Please call onUserlogin() and pass a custom CleverTap ID");
            }
        } else if (str != null) {
            Logger.m5923i("CLEVERTAP_USE_CUSTOM_ID has not been specified in the AndroidManifest.xml Please call CleverTapAPI.defaultInstance() without a custom CleverTap ID");
        }
        ru3.m183186c(this.f155098f).m187990d().m7000g("_onUserLogin", new CallableC19484b(map, str));
    }

    /* JADX INFO: renamed from: C */
    public void m174789C() {
        Iterator<s0l0> it = this.f155103k.m198775W().iterator();
        while (it.hasNext()) {
            this.f155107o.m193845c(it.next());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m174790y(Map<String, Object> map, String str, String str2) {
        ru3.m183186c(this.f155098f).m187990d().m7000g("resetProfile", new CallableC19483a(map, str, str2));
    }
}
