package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.common.thread.C3486c;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.immomo.mwc.sdk.MWCEngine;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C15493d;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m88121d2 = {"Ll/pl3;", "Ll/b39;", "Ll/hul;", "pMkWebview", "<init>", "(Ll/hul;)V", "", "url", FirebaseAnalytics.Param.METHOD, "Lorg/json/JSONObject;", "headParams", "jsonParams", "callback", "", "encodeBase64", "requestType", "", BaseSei.f14624X, "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;ZLjava/lang/String;)V", "requestData", "w", "(Ljava/lang/String;Ljava/lang/String;Z)V", "u", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;", "namespace", CommandMessage.PARAMS, "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", "Companion", "a", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class pl3 extends b39 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.pl3$b */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC19394b implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f152985b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f152986c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ JSONObject f152987d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ JSONObject f152988e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f152989f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ String f152990g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ boolean f152991h;

        public RunnableC19394b(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, String str3, String str4, boolean z) {
            this.f152985b = str;
            this.f152986c = str2;
            this.f152987d = jSONObject;
            this.f152988e = jSONObject2;
            this.f152989f = str3;
            this.f152990g = str4;
            this.f152991h = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public final void run() {
            String webViewUrl;
            String bid;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM172789u = pl3.this.m172789u(this.f152985b, this.f152986c, this.f152987d);
            String str = qpl.f158878b;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            jzv.m147728a(str, String.format("check pre fetch cast: %d, data: %s", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), strM172789u}, 2)));
            boolean zIsEmpty = TextUtils.isEmpty(strM172789u);
            pl3 pl3Var = pl3.this;
            if (!zIsEmpty) {
                pl3Var.m172791w(strM172789u, this.f152990g, this.f152991h);
                return;
            }
            try {
                hul hulVar = pl3Var.f158879a;
                if (hulVar != null) {
                    bid = hulVar.getBid();
                    webViewUrl = null;
                } else {
                    webViewUrl = null;
                    bid = null;
                }
                Companion companion = pl3.INSTANCE;
                String str2 = this.f152985b;
                String str3 = this.f152986c;
                JSONObject jSONObject = this.f152987d;
                JSONObject jSONObject2 = this.f152988e;
                String str4 = this.f152989f;
                hul hulVar2 = pl3.this.f158879a;
                x4d0 resourceResponse = hulVar2 != null ? hulVar2.getResourceResponse() : webViewUrl;
                hul hulVar3 = pl3.this.f158879a;
                if (hulVar3 != null) {
                    webViewUrl = hulVar3.getWebViewUrl();
                }
                String strM172797b = companion.m172797b(bid, str2, str3, jSONObject, jSONObject2, str4, resourceResponse, webViewUrl);
                if (pl3.this.f158879a != null && !pl3.this.f158879a.mo17920e()) {
                    hul hulVar4 = pl3.this.f158879a;
                    hulVar4.getClass();
                    MWCEngine.m20341D("HttpBridge", hulVar4.getWebWorkerId(), "[MK页面接口请求成功]request:mk:post @url=%s, @ts=%d", this.f152985b, Long.valueOf(hrw.m136930a()));
                }
                pl3.this.m172791w(strM172797b, this.f152990g, this.f152991h);
            } catch (Exception e) {
                String str5 = qpl.f158878b;
                jzv.m147730c(str5, "", e);
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("ec", -1);
                    jSONObject3.put("em", "网络请求失败");
                    jSONObject3.put("data", "");
                    jSONObject3.put("exmsg", e.getMessage());
                    if (jzv.m147733f()) {
                        jzv.m147728a(str5, "tang-------执行request请求失败 " + jSONObject3.toString());
                    }
                    pl3 pl3Var2 = pl3.this;
                    String str6 = this.f152990g;
                    if (str6 == null) {
                        str6 = "";
                    }
                    pl3Var2.m177463g(str6, jSONObject3.toString());
                } catch (JSONException e2) {
                    jzv.m147730c(qpl.f158878b, "", e2);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl3(@NotNull hul hulVar) {
        super(hulVar);
        hulVar.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final String m172789u(String url, String method, JSONObject jsonParams) {
        String webWorkerId;
        hul hulVar = this.f158879a;
        if (hulVar == null) {
            return null;
        }
        if (hulVar != null && hulVar.mo17920e()) {
            return null;
        }
        hul hulVar2 = this.f158879a;
        if (hulVar2 == null || (webWorkerId = hulVar2.getWebWorkerId()) == null) {
            webWorkerId = "";
        }
        return MWCEngine.m20338A(webWorkerId, url, method, jsonParams);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: v */
    public static final String m172790v(@Nullable String str, @NotNull String str2, @NotNull String str3, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull String str4, @Nullable x4d0 x4d0Var, @Nullable String str5) {
        return INSTANCE.m172797b(str, str2, str3, jSONObject, jSONObject2, str4, x4d0Var, str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m172791w(String requestData, String callback, boolean encodeBase64) {
        byte[] bytes;
        if (TextUtils.isEmpty(requestData)) {
            return;
        }
        try {
            requestData = new JSONObject(requestData).toString();
        } catch (Exception unused) {
        }
        try {
            if (encodeBase64) {
                if (requestData != null) {
                    bytes = requestData.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                } else {
                    bytes = null;
                }
                requestData = Base64.encodeToString(bytes, 2);
            } else {
                String strM130706c = glw.m130706c(requestData != null ? requestData : "");
                requestData = glw.m130704a(Uri.encode(glw.m130716m(requestData != null ? requestData : "", strM130706c), "UTF-8"), strM130706c);
            }
        } catch (Exception e) {
            jzv.m147730c(qpl.f158878b, "", e);
        }
        if (callback == null) {
            callback = "";
        }
        m177463g(callback, requestData != null ? requestData : "");
    }

    /* JADX INFO: renamed from: x */
    private final void m172792x(String url, String method, JSONObject headParams, JSONObject jsonParams, String callback, boolean encodeBase64, String requestType) {
        gkw gkwVarM130601b = gkw.m130601b();
        gkwVarM130601b.getClass();
        if (gkwVarM130601b.m130602a() == null) {
            jzv.m147729b("MK", "mk-http-requester is NULL");
        } else {
            C3486c.m17566d(2, new RunnableC19394b(url, method, jsonParams, headParams, requestType, callback, encodeBase64));
        }
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) throws Exception {
        String strOptString;
        String strOptString2;
        String strOptString3;
        boolean z = false;
        if (method == null || method.hashCode() != 1095692943 || !method.equals(SocialConstants.TYPE_REQUEST)) {
            return false;
        }
        String str = (params == null || (strOptString3 = params.optString(FirebaseAnalytics.Param.METHOD, "get")) == null) ? "get" : strOptString3;
        if (params == null || (strOptString = params.optString("url")) == null) {
            strOptString = "";
        }
        String str2 = strOptString;
        JSONObject jSONObjectOptJSONObject = params != null ? params.optJSONObject("header") : null;
        JSONObject jSONObjectOptJSONObject2 = params != null ? params.optJSONObject("data") : null;
        String str3 = (params == null || (strOptString2 = params.optString("requestType", "form")) == null) ? "form" : strOptString2;
        if (params != null && params.has("encode") && params.getInt("encode") == 1) {
            z = true;
        }
        m172792x(str2, str, jSONObjectOptJSONObject, jSONObjectOptJSONObject2, params != null ? params.optString("callback") : null, z, str3);
        return true;
    }

    /* JADX INFO: renamed from: l.pl3$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J[\u0010\u001c\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\"\u001a\u00020!2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e2\u0006\u0010 \u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010)¨\u0006-"}, m88121d2 = {"Ll/pl3$a;", "", "<init>", "()V", "", "parent", Constants.KEY_KEY, "", FirebaseAnalytics.Param.INDEX, "e", "(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "text", "", "f", "(Ljava/lang/CharSequence;)Z", "webViewBid", "url", FirebaseAnalytics.Param.METHOD, "Lorg/json/JSONObject;", "jsonParams", "headParams", "requestType", "Ll/x4d0;", "resourceResponse", "h5Url", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ll/x4d0;Ljava/lang/String;)Ljava/lang/String;", "", "outMap", "jo", "", "c", "(Ljava/util/Map;Lorg/json/JSONObject;Ljava/lang/String;)V", "bid", CommandMessage.PARAMS, "a", "(Ljava/lang/String;Lorg/json/JSONObject;Ll/x4d0;)V", "JSON_FORMAT_STR", "Ljava/lang/String;", "LOG_TAG", "REQUEST_TYPE_FORM", "REQUEST_TYPE_JSON", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: d */
        private final String m172793d(String parent, String key) {
            if (m172795f(parent)) {
                return key;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            if (parent == null) {
                parent = "";
            }
            return String.format(parent, Arrays.copyOf(new Object[]{key}, 1));
        }

        /* JADX INFO: renamed from: e */
        private final String m172794e(String parent, String key, int index) {
            String str;
            if (index >= 0) {
                str = "[" + index + "][%s]";
            } else {
                str = "[%s]";
            }
            if (m172795f(parent)) {
                return key + str;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            if (parent == null) {
                parent = "";
            }
            return String.format(parent, Arrays.copyOf(new Object[]{key}, 1)).concat(str);
        }

        /* JADX INFO: renamed from: f */
        private final boolean m172795f(CharSequence text) {
            return text == null || text.length() == 0;
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m172796a(@Nullable String bid, @Nullable JSONObject params, @Nullable x4d0 resourceResponse) {
            zgi zgiVarM209307d;
            if (params == null || TextUtils.isEmpty(bid)) {
                return;
            }
            if (resourceResponse != null) {
                try {
                    zgiVarM209307d = resourceResponse.m209307d();
                } catch (JSONException e) {
                    jzv.m147730c(qpl.f158878b, "", e);
                    return;
                }
            } else {
                zgiVarM209307d = null;
            }
            FepPackageConfig fepPackageConfigM219623f = zgiVarM209307d != null ? zgiVarM209307d.m219623f() : null;
            if (fepPackageConfigM219623f != null) {
                String versionStr = fepPackageConfigM219623f.getVersionStr();
                if (versionStr == null) {
                    versionStr = "";
                }
                if (versionStr.length() > 0) {
                    params.put("mkVersion", versionStr);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:52:0x00db  */
        /* JADX WARN: Code duplicated, block: B:66:0x0105 A[PHI: r0
          0x0105: PHI (r0v21 java.lang.String) = (r0v14 java.lang.String), (r0v18 java.lang.String), (r0v23 java.lang.String) binds: [B:95:0x015c, B:78:0x012f, B:65:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m172797b(@Nullable String webViewBid, @NotNull String url, @NotNull String method, @Nullable JSONObject jsonParams, @Nullable JSONObject headParams, @NotNull String requestType, @Nullable x4d0 resourceResponse, @Nullable String h5Url) throws Exception {
            HashMap map;
            HashMap map2;
            String strMo167945d;
            String bodyString;
            String string;
            jvl jvlVarMo115352h;
            String strMo115353i;
            String strMo115348d;
            String strMo115353i2;
            String strMo115348d2;
            url.getClass();
            method.getClass();
            requestType.getClass();
            gkw gkwVarM130601b = gkw.m130601b();
            gkwVarM130601b.getClass();
            ivl ivlVarM130602a = gkwVarM130601b.m130602a();
            boolean zM88377d = Intrinsics.m88377d("json", requestType);
            String str = "";
            if (jsonParams != null) {
                map = new HashMap();
                if (jsonParams.optInt("needDeviceId", 0) == 1) {
                    if (ivlVarM130602a == null || (strMo115353i2 = ivlVarM130602a.mo115353i(0)) == null) {
                        strMo115353i2 = "";
                    }
                    if (ivlVarM130602a == null || (strMo115348d2 = ivlVarM130602a.mo115348d(0)) == null) {
                        strMo115348d2 = "";
                    }
                    map.put(strMo115353i2, strMo115348d2);
                }
                m172796a(webViewBid, jsonParams, resourceResponse);
                if (ivlVarM130602a == null || (strMo115353i = ivlVarM130602a.mo115353i(1)) == null) {
                    strMo115353i = "";
                }
                if (ivlVarM130602a == null || (strMo115348d = ivlVarM130602a.mo115348d(1)) == null) {
                    strMo115348d = "";
                }
                if (strMo115353i.length() > 0 && strMo115348d.length() > 0) {
                    if (zM88377d) {
                        jsonParams.put(strMo115353i, strMo115348d);
                    } else {
                        map.put(strMo115353i, strMo115348d);
                    }
                }
                m172798c(map, jsonParams, null);
            } else {
                map = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            jzv.m147728a(qpl.f158878b, "tang-------执行request请求，开始 " + url + "  " + method);
            if (headParams != null) {
                try {
                    if (headParams.length() > 0) {
                        map2 = new HashMap();
                        try {
                            Iterator<String> itKeys = headParams.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                next.getClass();
                                String strOptString = headParams.optString(next);
                                strOptString.getClass();
                                map2.put(next, strOptString);
                            }
                        } catch (Throwable th) {
                            th = th;
                            jzv.m147730c(qpl.f158878b, "", th);
                        }
                    } else {
                        map2 = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    map2 = null;
                }
            } else {
                map2 = null;
            }
            ojw ojwVarM17763b = MKConfigSetter.INSTANCE.m17763b();
            if (ojwVarM17763b == null || (strMo167945d = ojwVarM17763b.mo167945d(url, h5Url)) == null) {
                strMo167945d = url;
            }
            if (C15493d.m94381x("get", method, true)) {
                if (ivlVarM130602a != null && (jvlVarMo115352h = ivlVarM130602a.mo115352h(strMo167945d, map2, map, null)) != null && (bodyString = jvlVarMo115352h.getBodyString()) != null) {
                    str = bodyString;
                }
            } else if (!zM88377d) {
                String str2 = strMo167945d;
                pl80 pl80VarMo115351g = ivlVarM130602a != null ? ivlVarM130602a.mo115351g(map) : null;
                if (ivlVarM130602a != null) {
                    jvl jvlVarMo115354j = ivlVarM130602a.mo115354j(str2, pl80VarMo115351g != null ? pl80VarMo115351g.m172800b() : null, map2, null, pl80VarMo115351g != null ? pl80VarMo115351g.m172799a() : null);
                    if (jvlVarMo115354j != null && (bodyString = jvlVarMo115354j.getBodyString()) != null) {
                        str = bodyString;
                    }
                }
            } else if (ivlVarM130602a != null) {
                if (jsonParams == null || (string = jsonParams.toString()) == null) {
                    string = "";
                }
                byte[] bytes = string.getBytes(Charsets.UTF_8);
                bytes.getClass();
                jvl jvlVarMo115354j2 = ivlVarM130602a.mo115354j(strMo167945d, bytes, map2, null, "application/json;charset=utf-8");
                if (jvlVarMo115354j2 != null && (bodyString = jvlVarMo115354j2.getBodyString()) != null) {
                    str = bodyString;
                }
            }
            if (jzv.m147733f()) {
                jzv.m147728a(qpl.f158878b, "tang-------执行request请求，结束 " + url + "  " + method + "    耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis));
            }
            return str;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m172798c(@NotNull Map<String, String> outMap, @NotNull JSONObject jo, @Nullable String parent) {
            outMap.getClass();
            jo.getClass();
            Iterator<String> itKeys = jo.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jo.opt(next);
                if (objOpt != null) {
                    if (objOpt instanceof JSONObject) {
                        next.getClass();
                        m172798c(outMap, (JSONObject) objOpt, m172794e(parent, next, -1));
                    } else if (objOpt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            Object objOpt2 = jSONArray.opt(i);
                            if (objOpt2 != null) {
                                if (objOpt2 instanceof JSONObject) {
                                    next.getClass();
                                    m172798c(outMap, (JSONObject) objOpt2, m172794e(parent, next, i));
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    next.getClass();
                                    sb.append(m172793d(parent, next));
                                    sb.append('[');
                                    sb.append(i);
                                    sb.append(']');
                                    outMap.put(sb.toString(), objOpt2.toString());
                                }
                            }
                        }
                    } else {
                        next.getClass();
                        outMap.put(m172793d(parent, next), objOpt.toString());
                    }
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
