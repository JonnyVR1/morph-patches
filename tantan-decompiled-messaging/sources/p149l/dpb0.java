package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.p046p1.mobile.putong.core.data.Ref;
import com.p046p1.mobile.putong.live.base.data.BLiveRole;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p069ss.bytertc.engine.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010'\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b(\u0010$J\u0017\u0010)\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b)\u0010$J\u0017\u0010*\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010$J\u0017\u0010+\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b+\u0010$J\u0017\u0010,\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010$J\u0017\u0010-\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010$J\u0017\u0010.\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010$J\u0017\u0010/\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u0010$J\u0017\u00100\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b0\u0010$J\u0017\u00101\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b1\u0010$J\u0017\u00102\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b2\u0010$J\u0017\u00103\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u0010$J\u0017\u00104\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b4\u0010$J\u0019\u00105\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010>R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010?R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010@R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010A¨\u0006B"}, m87232d2 = {"Ll/dpb0;", "", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/qs9;", "coreMetaData", "Ll/r26;", "controllerManager", "Ll/hyd;", "deviceInfo", "Ll/tz0;", "arpRepo", "Ll/gtl;", "ijRepo", "Ll/ui2;", "databaseManager", "Ll/ork0;", "validationResultStack", "Lkotlin/Function0;", "", "firstRequestTs", "lastRequestTs", "Ll/nul;", "logger", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/qs9;Ll/r26;Ll/hyd;Ll/tz0;Ll/gtl;Ll/ui2;Ll/ork0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ll/nul;)V", "Lorg/json/JSONObject;", "header", "", BLiveRole.caller, "", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Ljava/lang/String;)V", "g", "(Lorg/json/JSONObject;)V", "q", "b", "k", "e", BLiveStormDanmakuGiftResourceType.f44444l, "h", "c", "p", "n", RXScreenCaptureService.KEY_INDEX, "j", "f", "a", "o", "r", "m", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;)Lorg/json/JSONObject;", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ll/qs9;", "Ll/r26;", "Ll/hyd;", "Ll/tz0;", "Ll/gtl;", "Ll/ui2;", "Ll/ork0;", "Lkotlin/jvm/functions/Function0;", "Ll/nul;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class dpb0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final qs9 coreMetaData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final r26 controllerManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final hyd deviceInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final tz0 arpRepo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final gtl ijRepo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ui2 databaseManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ork0 validationResultStack;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Function0<Integer> firstRequestTs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Function0<Integer> lastRequestTs;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    public dpb0(@NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull qs9 qs9Var, @NotNull r26 r26Var, @NotNull hyd hydVar, @NotNull tz0 tz0Var, @NotNull gtl gtlVar, @NotNull ui2 ui2Var, @NotNull ork0 ork0Var, @NotNull Function0<Integer> function0, @NotNull Function0<Integer> function1, @NotNull nul nulVar) {
        context.getClass();
        cleverTapInstanceConfig.getClass();
        qs9Var.getClass();
        r26Var.getClass();
        hydVar.getClass();
        tz0Var.getClass();
        gtlVar.getClass();
        ui2Var.getClass();
        ork0Var.getClass();
        function0.getClass();
        function1.getClass();
        nulVar.getClass();
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.coreMetaData = qs9Var;
        this.controllerManager = r26Var;
        this.deviceInfo = hydVar;
        this.arpRepo = tz0Var;
        this.ijRepo = gtlVar;
        this.databaseManager = ui2Var;
        this.validationResultStack = ork0Var;
        this.firstRequestTs = function0;
        this.lastRequestTs = function1;
        this.logger = nulVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m112868a(JSONObject header) {
        try {
            JSONObject jSONObjectM191117a = this.arpRepo.m191117a(this.context);
            if (jSONObjectM191117a == null || jSONObjectM191117a.length() <= 0) {
                return;
            }
            header.put("arp", jSONObjectM191117a);
        } catch (JSONException e) {
            this.logger.verbose(this.config.getAccountId(), "Failed to attach ARP", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m112869b(JSONObject header) throws JSONException {
        JSONObject jSONObjectM133569u = this.deviceInfo.m133569u();
        if (this.coreMetaData.m176183J()) {
            jSONObjectM133569u.put("wv_init", true);
        }
        header.put("af", jSONObjectM133569u);
    }

    /* JADX INFO: renamed from: c */
    private final void m112870c(JSONObject header) throws JSONException {
        if (this.coreMetaData.m176226z()) {
            header.put("bk", 1);
            this.coreMetaData.m176187P(false);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m112871d(JSONObject header, String caller) throws JSONException {
        if (caller != null) {
            header.put(Constants.D_SRC, caller);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m112872e(JSONObject header) throws JSONException {
        String accountId = this.config.getAccountId();
        String accountToken = this.config.getAccountToken();
        header.put("id", accountId);
        header.put("tk", accountToken);
        header.put("l_ts", this.lastRequestTs.invoke().intValue());
        header.put("f_ts", this.firstRequestTs.invoke().intValue());
    }

    /* JADX INFO: renamed from: f */
    private final void m112873f(JSONObject header) throws JSONException {
        if (CleverTapAPI.m5751I() == 3) {
            header.put(BuildConfig.BUILD_TYPE, true);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m112874g(JSONObject header) throws JSONException {
        String strM133539E = this.deviceInfo.m133539E();
        if (strM133539E == null || strM133539E.length() == 0) {
            this.logger.verbose(this.config.getAccountId(), "CRITICAL: Couldn't finalise on a device ID! Using error device ID instead!");
        } else {
            header.put("g", strM133539E);
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m112875h(JSONObject header) throws JSONException {
        header.put("ddnd", (lw3.m151934d(this.context) && (this.controllerManager.m177575j() == null || this.controllerManager.m177575j().m214530F())) ? false : true);
    }

    /* JADX INFO: renamed from: i */
    private final void m112876i(JSONObject header) throws JSONException {
        header.put("frs", this.coreMetaData.m176175B());
        this.coreMetaData.m176193W(false);
    }

    /* JADX INFO: renamed from: j */
    private final void m112877j(JSONObject header) throws JSONException {
        header.put(Constants.META_FRESH_APP_LAUNCH, this.coreMetaData.m176177D());
    }

    /* JADX INFO: renamed from: k */
    private final void m112878k(JSONObject header) throws JSONException {
        long jM127989b = this.ijRepo.m127989b(this.context);
        if (jM127989b > 0) {
            header.put("_i", jM127989b);
        }
        long jM127990c = this.ijRepo.m127990c(this.context);
        if (jM127990c > 0) {
            header.put("_j", jM127990c);
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m112879l(JSONObject header) throws JSONException {
        header.put("ct_pi", xcm.m208126a(this.context, this.config, this.validationResultStack).mo145177a().toString());
    }

    /* JADX INFO: renamed from: m */
    private final void m112880m(JSONObject header) throws JSONException {
        tom tomVarM177574i = this.controllerManager.m177574i();
        if (tomVarM177574i != null) {
            Logger.m5873v("Attaching InAppFC to Header");
            header.put(Constants.INAPP_MAX_PER_DAY_KEY, tomVarM177574i.m189914n());
            if (header.put(Constants.KEY_TLC, tomVarM177574i.m189913k(this.context)) != null) {
                return;
            }
        }
        this.logger.verbose(this.config.getAccountId(), "controllerManager.getInAppFCManager() is NULL, not Attaching InAppFC to Header");
        Unit unit = Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    private final void m112881n(JSONObject header) throws JSONException {
        if (this.coreMetaData.m176178E()) {
            return;
        }
        header.put("rct", this.coreMetaData.m176220r());
        header.put("ait", this.coreMetaData.m176207g());
    }

    /* JADX INFO: renamed from: o */
    private final void m112882o(JSONObject header) {
        try {
            JSONObject jSONObject = new JSONObject();
            String strM176222t = this.coreMetaData.m176222t();
            if (strM176222t != null) {
                jSONObject.put("us", strM176222t);
            }
            String strM176219q = this.coreMetaData.m176219q();
            if (strM176219q != null) {
                jSONObject.put("um", strM176219q);
            }
            String strM176209h = this.coreMetaData.m176209h();
            if (strM176209h != null) {
                jSONObject.put("uc", strM176209h);
            }
            if (jSONObject.length() > 0) {
                header.put(Ref.TYPE, jSONObject);
            }
        } catch (JSONException e) {
            this.logger.verbose(this.config.getAccountId(), "Failed to attach ref", e);
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m112883p(JSONObject header) throws JSONException {
        header.put("rtl", mv3.m156467f(this.databaseManager.mo94410c(this.context).m191180q()));
    }

    /* JADX INFO: renamed from: q */
    private final void m112884q(JSONObject header) throws JSONException {
        header.put("type", "meta");
    }

    /* JADX INFO: renamed from: r */
    private final void m112885r(JSONObject header) throws JSONException {
        JSONObject jSONObjectM176223u = this.coreMetaData.m176223u();
        if (jSONObjectM176223u == null || jSONObjectM176223u.length() <= 0) {
            return;
        }
        header.put("wzrk_ref", jSONObjectM176223u);
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final JSONObject m112886s(@Nullable String caller) {
        String accountId = this.config.getAccountId();
        String accountToken = this.config.getAccountToken();
        if (accountId == null || accountToken == null) {
            this.logger.debug(this.config.getAccountId(), "Account ID/token not found, unable to configure queue request");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            m112871d(jSONObject, caller);
            m112874g(jSONObject);
            m112884q(jSONObject);
            m112869b(jSONObject);
            m112878k(jSONObject);
            m112872e(jSONObject);
            m112879l(jSONObject);
            m112875h(jSONObject);
            m112870c(jSONObject);
            m112883p(jSONObject);
            m112881n(jSONObject);
            m112876i(jSONObject);
            m112877j(jSONObject);
            m112873f(jSONObject);
            m112868a(jSONObject);
            m112882o(jSONObject);
            m112885r(jSONObject);
            m112880m(jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            this.logger.verbose(this.config.getAccountId(), "CommsManager: Failed to attach header", e);
            return null;
        }
    }
}
