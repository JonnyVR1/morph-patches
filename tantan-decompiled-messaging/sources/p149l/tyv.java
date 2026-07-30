package p149l;

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
public class tyv {

    /* JADX INFO: renamed from: a */
    private String f172636a = null;

    /* JADX INFO: renamed from: b */
    private final wk0 f172637b;

    /* JADX INFO: renamed from: c */
    private final ak2 f172638c;

    /* JADX INFO: renamed from: d */
    private final ov3 f172639d;

    /* JADX INFO: renamed from: e */
    private final vg2 f172640e;

    /* JADX INFO: renamed from: f */
    private final CleverTapInstanceConfig f172641f;

    /* JADX INFO: renamed from: g */
    private final Context f172642g;

    /* JADX INFO: renamed from: h */
    private final r26 f172643h;

    /* JADX INFO: renamed from: i */
    private final qs9 f172644i;

    /* JADX INFO: renamed from: j */
    private final ui2 f172645j;

    /* JADX INFO: renamed from: k */
    private final hyd f172646k;

    /* JADX INFO: renamed from: l */
    private final csv f172647l;

    /* JADX INFO: renamed from: m */
    private final yfb0 f172648m;

    /* JADX INFO: renamed from: n */
    private final ske0 f172649n;

    /* JADX INFO: renamed from: o */
    private final ork0 f172650o;

    /* JADX INFO: renamed from: p */
    private final wyv f172651p;

    /* JADX INFO: renamed from: q */
    private final ContentFetchManager f172652q;

    /* JADX INFO: renamed from: r */
    private final InboxV2Bridge f172653r;

    /* JADX INFO: renamed from: l.tyv$a */
    public class CallableC20313a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f172654a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f172655b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f172656c;

        public CallableC20313a(Map map, String str, String str2) {
            this.f172654a = map;
            this.f172655b = str;
            this.f172656c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            String str;
            try {
                Logger logger = tyv.this.f172641f.getLogger();
                String accountId = tyv.this.f172641f.getAccountId();
                StringBuilder sb = new StringBuilder("asyncProfileSwitchUser:[profile ");
                sb.append(this.f172654a);
                sb.append(" with Cached GUID ");
                if (this.f172655b != null) {
                    str = tyv.this.f172636a;
                } else {
                    str = "NULL and cleverTapID " + this.f172656c;
                }
                sb.append(str);
                logger.verbose(accountId, sb.toString());
                tyv.this.f172644i.m176190T(false);
                tyv.this.f172648m.m214541w(false);
                tyv.this.f172638c.mo97097d(tyv.this.f172642g, EventGroup.REGULAR, null, true);
                tyv.this.f172638c.mo97097d(tyv.this.f172642g, EventGroup.PUSH_NOTIFICATION_VIEWED, null, true);
                tyv.this.f172652q.m6778d();
                tyv.this.m191101z();
                tyv.this.f172645j.mo94409b(tyv.this.f172642g);
                qs9.m176164K(1);
                tyv.this.f172649n.m184589c();
                String str2 = this.f172655b;
                tyv tyvVar = tyv.this;
                if (str2 != null) {
                    tyvVar.f172646k.m133567o(this.f172655b);
                    tyv.this.f172640e.mo100747u(this.f172655b);
                } else {
                    boolean enableCustomCleverTapId = tyvVar.f172641f.getEnableCustomCleverTapId();
                    tyv tyvVar2 = tyv.this;
                    if (enableCustomCleverTapId) {
                        tyvVar2.f172646k.m133566n(this.f172656c);
                    } else {
                        tyvVar2.f172646k.m133564m();
                    }
                }
                tyv.this.f172647l.m108596k();
                tyv.this.f172640e.mo100747u(tyv.this.f172646k.m133539E());
                tyv.this.f172646k.m133562k0();
                tyv.this.f172646k.m133565m0();
                tyv.this.m191075H();
                tyv.this.f172637b.m203640w();
                if (this.f172654a != null) {
                    tyv.this.f172637b.m203629N(this.f172654a);
                }
                tyv.this.f172648m.m214541w(true);
                tyv.this.m191073F();
                tyv.this.m191076I();
                tyv.this.m191072E();
                tyv.this.m191074G();
                tyv.this.m191104C();
                tyv.this.m191071D();
                tyv.this.m191102A();
                tyv.this.f172643h.m177574i().m189910e(tyv.this.f172646k.m133539E());
            } catch (Throwable th) {
                tyv.this.f172641f.getLogger().verbose(tyv.this.f172641f.getAccountId(), "Reset Profile error", th);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.tyv$b */
    public class CallableC20314b implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f172658a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f172659b;

        public CallableC20314b(Map map, String str) {
            this.f172658a = map;
            this.f172659b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            tyv.this.m191078b(this.f172658a, this.f172659b);
            return null;
        }
    }

    public tyv(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, hyd hydVar, ork0 ork0Var, ak2 ak2Var, wk0 wk0Var, qs9 qs9Var, r26 r26Var, ske0 ske0Var, csv csvVar, vg2 vg2Var, a0c a0cVar, ov3 ov3Var, wyv wyvVar, ContentFetchManager contentFetchManager, InboxV2Bridge inboxV2Bridge) {
        this.f172641f = cleverTapInstanceConfig;
        this.f172642g = context;
        this.f172646k = hydVar;
        this.f172650o = ork0Var;
        this.f172638c = ak2Var;
        this.f172637b = wk0Var;
        this.f172644i = qs9Var;
        this.f172648m = r26Var.m177575j();
        this.f172649n = ske0Var;
        this.f172647l = csvVar;
        this.f172640e = vg2Var;
        this.f172645j = a0cVar;
        this.f172643h = r26Var;
        this.f172639d = ov3Var;
        this.f172651p = wyvVar;
        this.f172652q = contentFetchManager;
        this.f172653r = inboxV2Bridge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m191071D() {
        if (this.f172643h.m177568c() != null) {
            this.f172643h.m177568c().m171278a();
        } else {
            this.f172641f.getLogger().verbose(this.f172641f.getAccountId(), "DisplayUnit : Can't reset Display Units, DisplayUnitcontroller is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public void m191072E() {
        ut3 ut3VarM177569d = this.f172643h.m177569d();
        if (ut3VarM177569d == null || !ut3VarM177569d.m195291m()) {
            this.f172641f.getLogger().verbose(this.f172641f.getAccountId(), "DisplayUnit : Can't reset Display Units, CTFeatureFlagsController is null");
        } else {
            ut3VarM177569d.m195292o(this.f172646k.m133539E());
            ut3VarM177569d.m195285e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m191073F() {
        synchronized (this.f172639d.m166152b()) {
            this.f172643h.m177582q(null);
        }
        this.f172643h.m177576k();
        this.f172653r.m6728c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m191074G() {
        if (this.f172641f.isAnalyticsOnly()) {
            this.f172641f.getLogger().debug(this.f172641f.getAccountId(), "Product Config is not enabled for this instance");
            return;
        }
        if (this.f172643h.m177571f() != null) {
            this.f172643h.m177571f().m6888t();
        }
        this.f172643h.m177583r(uv3.m196054a(this.f172642g, this.f172646k, this.f172641f, this.f172637b, this.f172644i, this.f172640e));
        this.f172641f.getLogger().verbose(this.f172641f.getAccountId(), "Product Config reset");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public void m191075H() {
        if (this.f172643h.m177572g() != null) {
            this.f172643h.m177572g().m123503e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public void m191076I() {
        st3.m185849c(this.f172641f).m190592d().m6946g("postSwitchInboxFetch", new Callable() { // from class: l.syv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tyv.m191077a(this.f166996a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m191077a(tyv tyvVar) {
        tyvVar.f172638c.mo97095b(tyvVar.f172642g, EventGroup.REGULAR);
        tyvVar.f172653r.m6729d(FetchTrigger.SYSTEM, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m191078b(Map<String, Object> map, String str) {
        if (map == null) {
            return;
        }
        try {
            String strM133539E = this.f172646k.m133539E();
            if (strM133539E == null) {
                return;
            }
            wcm wcmVarM208126a = xcm.m208126a(this.f172642g, this.f172641f, this.f172650o);
            boolean z = false;
            for (String str2 : map.keySet()) {
                Object obj = map.get(str2);
                if (wcmVarM208126a.mo145178b(str2)) {
                    if (!(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                        this.f172641f.getLogger().debug(this.f172641f.getAccountId(), "onUserLogin: Aborting the operation. Non-primitive value for the identifier key = " + str2);
                        return;
                    }
                    String string = obj.toString();
                    if (!string.isEmpty()) {
                        z = true;
                        String strM206222g = this.f172651p.m206222g(str2, string);
                        this.f172636a = strM206222g;
                        if (strM206222g != null) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (!this.f172646k.m133557d0() && (!z || this.f172651p.m206223h())) {
                this.f172641f.getLogger().debug(this.f172641f.getAccountId(), "onUserLogin: no identifier provided or device is anonymous, pushing on current user profile");
                this.f172637b.m203629N(map);
                return;
            }
            String str3 = this.f172636a;
            if (str3 != null && str3.equals(strM133539E)) {
                this.f172641f.getLogger().debug(this.f172641f.getAccountId(), "onUserLogin: " + map + " maps to current device id " + strM133539E + " pushing on current profile");
                this.f172637b.m203629N(map);
                return;
            }
            Logger logger = this.f172641f.getLogger();
            String accountId = this.f172641f.getAccountId();
            StringBuilder sb = new StringBuilder();
            sb.append("onUserLogin: queuing reset profile for ");
            sb.append(map);
            sb.append(" with Cached GUID ");
            String str4 = this.f172636a;
            if (str4 == null) {
                str4 = "NULL";
            }
            sb.append(str4);
            logger.verbose(accountId, sb.toString());
            m191105y(map, this.f172636a, str);
        } catch (Throwable th) {
            this.f172641f.getLogger().verbose(this.f172641f.getAccountId(), "onUserLogin failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: z */
    public void m191101z() {
        if (this.f172643h.m177573h() != null) {
            this.f172643h.m177573h().m6272x();
            this.f172641f.getLogger().verbose(this.f172641f.getAccountId(), "Cancelled all scheduled in-apps for user change");
        }
    }

    /* JADX INFO: renamed from: A */
    public void m191102A() {
        List<fr4> listMo100732f = this.f172640e.mo100732f();
        synchronized (listMo100732f) {
            try {
                for (fr4 fr4Var : listMo100732f) {
                    if (fr4Var != null) {
                        fr4Var.mo122801a(this.f172646k.m133539E(), this.f172641f.getAccountId());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m191103B(Map<String, Object> map, String str) {
        if (this.f172641f.getEnableCustomCleverTapId()) {
            if (str == null) {
                Logger.m5869i("CLEVERTAP_USE_CUSTOM_ID has been specified in the AndroidManifest.xml Please call onUserlogin() and pass a custom CleverTap ID");
            }
        } else if (str != null) {
            Logger.m5869i("CLEVERTAP_USE_CUSTOM_ID has not been specified in the AndroidManifest.xml Please call CleverTapAPI.defaultInstance() without a custom CleverTap ID");
        }
        st3.m185849c(this.f172641f).m190592d().m6946g("_onUserLogin", new CallableC20314b(map, str));
    }

    /* JADX INFO: renamed from: C */
    public void m191104C() {
        Iterator<mrk0> it = this.f172646k.m133552W().iterator();
        while (it.hasNext()) {
            this.f172650o.m165676c(it.next());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m191105y(Map<String, Object> map, String str, String str2) {
        st3.m185849c(this.f172641f).m190592d().m6946g("resetProfile", new CallableC20313a(map, str, str2));
    }
}
