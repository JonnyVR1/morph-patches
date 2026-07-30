package p153l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.p051p1.mobile.putong.core.data.Ref;
import com.p051p1.mobile.putong.live.base.data.BLiveRole;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p074ss.bytertc.engine.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010'\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b(\u0010$J\u0017\u0010)\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b)\u0010$J\u0017\u0010*\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010$J\u0017\u0010+\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b+\u0010$J\u0017\u0010,\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010$J\u0017\u0010-\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010$J\u0017\u0010.\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010$J\u0017\u0010/\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u0010$J\u0017\u00100\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b0\u0010$J\u0017\u00101\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b1\u0010$J\u0017\u00102\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b2\u0010$J\u0017\u00103\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u0010$J\u0017\u00104\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b4\u0010$J\u0019\u00105\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010>R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010?R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010@R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010A¨\u0006B"}, m88121d2 = {"Ll/hxb0;", "", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/bu9;", "coreMetaData", "Ll/w36;", "controllerManager", "Ll/uzd;", "deviceInfo", "Ll/a01;", "arpRepo", "Ll/uvl;", "ijRepo", "Ll/bj2;", "databaseManager", "Ll/u0l0;", "validationResultStack", "Lkotlin/Function0;", "", "firstRequestTs", "lastRequestTs", "Ll/axl;", "logger", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/bu9;Ll/w36;Ll/uzd;Ll/a01;Ll/uvl;Ll/bj2;Ll/u0l0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ll/axl;)V", "Lorg/json/JSONObject;", "header", "", BLiveRole.caller, "", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Ljava/lang/String;)V", "g", "(Lorg/json/JSONObject;)V", "q", "b", "k", "e", BLiveStormDanmakuGiftResourceType.f45292l, "h", "c", "p", "n", RXScreenCaptureService.KEY_INDEX, "j", "f", "a", "o", "r", "m", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;)Lorg/json/JSONObject;", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ll/bu9;", "Ll/w36;", "Ll/uzd;", "Ll/a01;", "Ll/uvl;", "Ll/bj2;", "Ll/u0l0;", "Lkotlin/jvm/functions/Function0;", "Ll/axl;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class hxb0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final bu9 coreMetaData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final w36 controllerManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final uzd deviceInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final a01 arpRepo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final uvl ijRepo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final bj2 databaseManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final u0l0 validationResultStack;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Function0<Integer> firstRequestTs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Function0<Integer> lastRequestTs;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    public hxb0(@NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull bu9 bu9Var, @NotNull w36 w36Var, @NotNull uzd uzdVar, @NotNull a01 a01Var, @NotNull uvl uvlVar, @NotNull bj2 bj2Var, @NotNull u0l0 u0l0Var, @NotNull Function0<Integer> function0, @NotNull Function0<Integer> function1, @NotNull axl axlVar) {
        context.getClass();
        cleverTapInstanceConfig.getClass();
        bu9Var.getClass();
        w36Var.getClass();
        uzdVar.getClass();
        a01Var.getClass();
        uvlVar.getClass();
        bj2Var.getClass();
        u0l0Var.getClass();
        function0.getClass();
        function1.getClass();
        axlVar.getClass();
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.coreMetaData = bu9Var;
        this.controllerManager = w36Var;
        this.deviceInfo = uzdVar;
        this.arpRepo = a01Var;
        this.ijRepo = uvlVar;
        this.databaseManager = bj2Var;
        this.validationResultStack = u0l0Var;
        this.firstRequestTs = function0;
        this.lastRequestTs = function1;
        this.logger = axlVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m137561a(JSONObject header) {
        try {
            JSONObject jSONObjectM95291a = this.arpRepo.m95291a(this.context);
            if (jSONObjectM95291a == null || jSONObjectM95291a.length() <= 0) {
                return;
            }
            header.put("arp", jSONObjectM95291a);
        } catch (JSONException e) {
            this.logger.verbose(this.config.getAccountId(), "Failed to attach ARP", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m137562b(JSONObject header) throws JSONException {
        JSONObject jSONObjectM198792u = this.deviceInfo.m198792u();
        if (this.coreMetaData.m106450J()) {
            jSONObjectM198792u.put("wv_init", true);
        }
        header.put("af", jSONObjectM198792u);
    }

    /* JADX INFO: renamed from: c */
    private final void m137563c(JSONObject header) throws JSONException {
        if (this.coreMetaData.m106493z()) {
            header.put("bk", 1);
            this.coreMetaData.m106454P(false);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m137564d(JSONObject header, String caller) throws JSONException {
        if (caller != null) {
            header.put(Constants.D_SRC, caller);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m137565e(JSONObject header) throws JSONException {
        String accountId = this.config.getAccountId();
        String accountToken = this.config.getAccountToken();
        header.put("id", accountId);
        header.put("tk", accountToken);
        header.put("l_ts", this.lastRequestTs.invoke().intValue());
        header.put("f_ts", this.firstRequestTs.invoke().intValue());
    }

    /* JADX INFO: renamed from: f */
    private final void m137566f(JSONObject header) throws JSONException {
        if (CleverTapAPI.m5805I() == 3) {
            header.put(BuildConfig.BUILD_TYPE, true);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m137567g(JSONObject header) throws JSONException {
        String strM198762E = this.deviceInfo.m198762E();
        if (strM198762E == null || strM198762E.length() == 0) {
            this.logger.verbose(this.config.getAccountId(), "CRITICAL: Couldn't finalise on a device ID! Using error device ID instead!");
        } else {
            header.put("g", strM198762E);
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m137568h(JSONObject header) throws JSONException {
        header.put("ddnd", (kx3.m151783d(this.context) && (this.controllerManager.m204747j() == null || this.controllerManager.m204747j().m111619F())) ? false : true);
    }

    /* JADX INFO: renamed from: i */
    private final void m137569i(JSONObject header) throws JSONException {
        header.put("frs", this.coreMetaData.m106442B());
        this.coreMetaData.m106460W(false);
    }

    /* JADX INFO: renamed from: j */
    private final void m137570j(JSONObject header) throws JSONException {
        header.put(Constants.META_FRESH_APP_LAUNCH, this.coreMetaData.m106444D());
    }

    /* JADX INFO: renamed from: k */
    private final void m137571k(JSONObject header) throws JSONException {
        long jM198298b = this.ijRepo.m198298b(this.context);
        if (jM198298b > 0) {
            header.put("_i", jM198298b);
        }
        long jM198299c = this.ijRepo.m198299c(this.context);
        if (jM198299c > 0) {
            header.put("_j", jM198299c);
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m137572l(JSONObject header) throws JSONException {
        header.put("ct_pi", nfm.m162931a(this.context, this.config, this.validationResultStack).mo157932a().toString());
    }

    /* JADX INFO: renamed from: m */
    private final void m137573m(JSONObject header) throws JSONException {
        vqm vqmVarM204746i = this.controllerManager.m204746i();
        if (vqmVarM204746i != null) {
            Logger.m5927v("Attaching InAppFC to Header");
            header.put(Constants.INAPP_MAX_PER_DAY_KEY, vqmVarM204746i.m202406n());
            if (header.put(Constants.KEY_TLC, vqmVarM204746i.m202405k(this.context)) != null) {
                return;
            }
        }
        this.logger.verbose(this.config.getAccountId(), "controllerManager.getInAppFCManager() is NULL, not Attaching InAppFC to Header");
        Unit unit = Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    private final void m137574n(JSONObject header) throws JSONException {
        if (this.coreMetaData.m106445E()) {
            return;
        }
        header.put("rct", this.coreMetaData.m106487r());
        header.put("ait", this.coreMetaData.m106474g());
    }

    /* JADX INFO: renamed from: o */
    private final void m137575o(JSONObject header) {
        try {
            JSONObject jSONObject = new JSONObject();
            String strM106489t = this.coreMetaData.m106489t();
            if (strM106489t != null) {
                jSONObject.put("us", strM106489t);
            }
            String strM106486q = this.coreMetaData.m106486q();
            if (strM106486q != null) {
                jSONObject.put("um", strM106486q);
            }
            String strM106476h = this.coreMetaData.m106476h();
            if (strM106476h != null) {
                jSONObject.put("uc", strM106476h);
            }
            if (jSONObject.length() > 0) {
                header.put(Ref.TYPE, jSONObject);
            }
        } catch (JSONException e) {
            this.logger.verbose(this.config.getAccountId(), "Failed to attach ref", e);
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m137576p(JSONObject header) throws JSONException {
        header.put("rtl", lw3.m156025f(this.databaseManager.mo104583c(this.context).m133312q()));
    }

    /* JADX INFO: renamed from: q */
    private final void m137577q(JSONObject header) throws JSONException {
        header.put("type", "meta");
    }

    /* JADX INFO: renamed from: r */
    private final void m137578r(JSONObject header) throws JSONException {
        JSONObject jSONObjectM106490u = this.coreMetaData.m106490u();
        if (jSONObjectM106490u == null || jSONObjectM106490u.length() <= 0) {
            return;
        }
        header.put("wzrk_ref", jSONObjectM106490u);
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final JSONObject m137579s(@Nullable String caller) {
        String accountId = this.config.getAccountId();
        String accountToken = this.config.getAccountToken();
        if (accountId == null || accountToken == null) {
            this.logger.debug(this.config.getAccountId(), "Account ID/token not found, unable to configure queue request");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            m137564d(jSONObject, caller);
            m137567g(jSONObject);
            m137577q(jSONObject);
            m137562b(jSONObject);
            m137571k(jSONObject);
            m137565e(jSONObject);
            m137572l(jSONObject);
            m137568h(jSONObject);
            m137563c(jSONObject);
            m137576p(jSONObject);
            m137574n(jSONObject);
            m137569i(jSONObject);
            m137570j(jSONObject);
            m137566f(jSONObject);
            m137561a(jSONObject);
            m137575o(jSONObject);
            m137578r(jSONObject);
            m137573m(jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            this.logger.verbose(this.config.getAccountId(), "CommsManager: Failed to attach header", e);
            return null;
        }
    }
}
