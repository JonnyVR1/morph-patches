package p153l;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.hellogroup.fep.base.core.FepManager;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ)\u0010\u0012\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\bJ!\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010!JF\u0010)\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\t\u001a\u0004\u0018\u00010\u00042#\u0010(\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u001c\u0018\u00010$¢\u0006\u0004\b)\u0010*R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00140+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,¨\u0006."}, m88121d2 = {"Ll/hjw;", "", "<init>", "()V", "", "value", "", "h", "(Ljava/lang/String;)Z", "startUrl", "e", "(Ljava/lang/String;)Ljava/lang/String;", "boostJsUrl", "c", "bid", "", "boostOfflineVersion", "projectOfflineVersion", "b", "(Ljava/lang/String;JJ)Z", "Lorg/json/JSONObject;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Lorg/json/JSONObject;", "f", "url", RXScreenCaptureService.KEY_INDEX, "Ll/tgi;", LovePlanetStage.result, "", "j", "(Ljava/lang/String;Ll/tgi;)V", "offlineBoostVersion", "a", "(J)Z", "Ll/hul;", "cacheWeb", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "error", "onValueCallback", "g", "(Ll/hul;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Z", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "cacheMap", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class hjw {
    public static final hjw INSTANCE = new hjw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final ConcurrentHashMap<String, JSONObject> cacheMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l.hjw$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"", "kotlin.jvm.PlatformType", "resultValue", "", "a", "(Ljava/lang/String;)V"}, m88122k = 3, m88123mv = {1, 4, 0})
    public static final class C17478a<T> implements ValueCallback<String> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f110334a;

        public C17478a(Function1 function1) {
            this.f110334a = function1;
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(String str) {
            jzv.m147728a("MKBoostUtils", "lehua:boost:evaluateJavascript: result=" + str);
            try {
                Function1 function1 = this.f110334a;
                if (function1 != null) {
                }
            } catch (Exception e) {
                jzv.m147730c("MKBoostUtils", "", e);
            }
        }
    }

    private hjw() {
    }

    /* JADX INFO: renamed from: b */
    private final boolean m135527b(String bid, long boostOfflineVersion, long projectOfflineVersion) {
        JSONObject jSONObjectM135529d;
        if (bid != null && !StringsKt.m94329e0(bid) && (jSONObjectM135529d = m135529d(bid)) != null) {
            long jOptLong = jSONObjectM135529d.optLong("minBidVersion", 0L);
            long jOptLong2 = jSONObjectM135529d.optLong("maxBidVersion", 0L);
            long jOptLong3 = jSONObjectM135529d.optLong("boostVersion", 0L);
            jzv.m147728a("MKBoostUtils", "lehua:boost:checkProjectVersion {\n            boostOfflineVersion: " + boostOfflineVersion + ", projectOfflineVersion: " + projectOfflineVersion + ",\n            minBidVersion: " + jOptLong + ",\n            maxBidVersion: " + jOptLong2 + ",\n            boostVersion: " + jOptLong3 + "\n          }");
            if (jOptLong > 0 && jOptLong2 > 0 && jOptLong3 > 0 && boostOfflineVersion == jOptLong3 && projectOfflineVersion >= jOptLong && projectOfflineVersion <= jOptLong2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m135528c(String boostJsUrl) {
        String strM219626i;
        jzv.m147728a("MKBoostUtils", "lehua:boost:js: {" + boostJsUrl + '}');
        if (i8g0.m139001c(boostJsUrl) || i8g0.m139000b(a6k0.m96329a(d8g0.m114836a(boostJsUrl)))) {
            return false;
        }
        try {
            zgi zgiVarM17580m = FepManager.m17580m(FepManager.INSTANCE.m17610a(), d8g0.m114836a(boostJsUrl), null, 2, null);
            if (zgiVarM17580m == null || (strM219626i = zgiVarM17580m.m219626i()) == null) {
                return false;
            }
            File file = new File(strM219626i);
            if (file.exists() && file.isDirectory()) {
                File file2 = new File(file, a6k0.m96332f(boostJsUrl));
                if (file2.exists() && file2.isFile() && file2.length() > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            jzv.m147730c("MKBoostUtils", "", e);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private final JSONObject m135529d(String bid) {
        String strM140423d;
        if (bid == null || StringsKt.m94329e0(bid)) {
            return null;
        }
        ConcurrentHashMap<String, JSONObject> concurrentHashMap = cacheMap;
        JSONObject jSONObject = concurrentHashMap.get(bid);
        if (jSONObject == null) {
            String strM135531f = m135531f(bid);
            if (strM135531f == null || (strM140423d = ikw.m140420b().m140423d(strM135531f, "")) == null || StringsKt.m94329e0(strM140423d)) {
                return null;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(strM140423d);
                concurrentHashMap.put(bid, jSONObject2);
                return jSONObject2;
            } catch (Exception e) {
                jzv.m147730c("MKBoostUtils", "", e);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:5:0x0009, B:8:0x001a, B:11:0x002f, B:14:0x0036, B:15:0x0042, B:17:0x0048, B:19:0x0050, B:22:0x0056, B:24:0x0060, B:25:0x0064, B:27:0x006c, B:29:0x0072, B:31:0x007f, B:32:0x0083, B:35:0x008e, B:36:0x009b, B:38:0x00a1, B:40:0x00af, B:41:0x00b7, B:34:0x008b), top: B:45:0x0009 }] */
    /* JADX INFO: renamed from: e */
    private final String m135530e(String startUrl) {
        if (i8g0.m139000b(startUrl)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(startUrl);
            if (!m135532h(uri.getQueryParameter("_boost"))) {
                return "";
            }
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.fragment("");
            builderBuildUpon.clearQuery();
            List<String> pathSegments = uri.getPathSegments();
            List<String> list = pathSegments;
            if (list == null || list.isEmpty()) {
                builderBuildUpon.appendPath("boost.js");
            } else {
                builderBuildUpon.path("");
                int i = 0;
                for (Object obj : pathSegments) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str = (String) obj;
                    if (i < pathSegments.size() - 1) {
                        builderBuildUpon.appendPath(str);
                    } else if (i == pathSegments.size() - 1 && i8g0.m139003e(str)) {
                        str.getClass();
                        if (C15493d.m94380w(str, ".html", false, 2, null)) {
                            builderBuildUpon.appendPath("boost.js");
                        } else {
                            builderBuildUpon.appendPath(str);
                            builderBuildUpon.appendPath("boost.js");
                        }
                    } else {
                        builderBuildUpon.appendPath(str);
                        builderBuildUpon.appendPath("boost.js");
                    }
                    i = i2;
                }
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            queryParameterNames.getClass();
            for (String str2 : queryParameterNames) {
                if (Intrinsics.m88377d(str2, "_bid")) {
                    builderBuildUpon.appendQueryParameter(str2, uri.getQueryParameter(str2));
                }
            }
            return builderBuildUpon.build().toString();
        } catch (Exception e) {
            jzv.m147730c("MKBoostUtils", "", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    private final String m135531f(String bid) {
        if (bid == null || StringsKt.m94329e0(bid)) {
            return null;
        }
        return "checkupdate_mk_config_boost_" + bid;
    }

    /* JADX INFO: renamed from: h */
    private final boolean m135532h(String value) {
        return Intrinsics.m88377d("1", value);
    }

    /* JADX INFO: renamed from: i */
    private final boolean m135533i(String url) {
        if (url != null) {
            return C15493d.m94374J(url, "https://", false, 2, null) || C15493d.m94374J(url, "http://", false, 2, null);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m135534a(long offlineBoostVersion) {
        return offlineBoostVersion > 0 && offlineBoostVersion == yfi.m215595k();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m135535g(@Nullable hul cacheWeb, @Nullable String startUrl, @Nullable Function1<? super Boolean, Unit> onValueCallback) {
        Long lM151325m;
        if (cacheWeb != null && startUrl != null && !i8g0.m139001c(startUrl) && m135533i(startUrl)) {
            jzv.m147728a("MKBoostUtils", "lehua:boost boost=" + cacheWeb.getBoost() + " === startUrl=" + startUrl);
            if (!cacheWeb.getBoost().getBoost() || cacheWeb.getBoost().getState() != 0) {
                return false;
            }
            Uri uri = Uri.parse(startUrl);
            String queryParameter = uri.getQueryParameter("_bid");
            boolean zM135532h = m135532h(uri.getQueryParameter("_boost"));
            if (!i8g0.m139000b(queryParameter) && zM135532h) {
                Uri uri2 = Uri.parse(cacheWeb.getWebViewUrl());
                uri2.getClass();
                if (i8g0.m138999a(uri2.getScheme(), uri.getScheme()) && i8g0.m138999a(uri2.getHost(), uri.getHost()) && uri2.getPort() == uri.getPort()) {
                    zgi zgiVarM17580m = FepManager.m17580m(FepManager.INSTANCE.m17610a(), startUrl, null, 2, null);
                    long jLongValue = (zgiVarM17580m == null || (lM151325m = kt0.m151325m(Long.valueOf(zgiVarM17580m.m219624g()))) == null) ? 0L : lM151325m.longValue();
                    long j = cacheWeb.getBoost().getCom.sina.weibo.sdk.constant.WBConstants.AUTH_PARAMS_VERSION java.lang.String();
                    if (!m135527b(queryParameter, j, jLongValue)) {
                        jzv.m147728a("MKBoostUtils", "lehua:boost 加速器获取失败: 离线包版本不符合接口下发配置");
                        return false;
                    }
                    String strM135530e = m135530e(startUrl);
                    if (!m135528c(strM135530e)) {
                        jzv.m147728a("MKBoostUtils", "lehua:boost 加速器获取失败: 离线包版本中不存在 " + strM135530e + " 文件");
                        return false;
                    }
                    String str = "window.mkBoostLaunchEvent&&window.mkBoostLaunchEvent('" + queryParameter + "','" + strM135530e + "','" + glw.m130718o(startUrl) + "','" + j + "','" + jLongValue + "')";
                    jzv.m147728a("MKBoostUtils", "lehua:boost:evaluateJavascript: ".concat(str));
                    cacheWeb.mo17926i(str, new C17478a(onValueCallback));
                    return true;
                }
                jzv.m147728a("MKBoostUtils", "lehua:boost 加速器获取失败: 不符合同源策略");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m135536j(@Nullable String bid, @Nullable tgi result) {
        String strM135531f;
        Map<String, Object> mapM191030e;
        if (bid == null || (strM135531f = m135531f(bid)) == null || StringsKt.m94329e0(strM135531f) || result == null || (mapM191030e = result.m191030e()) == null) {
            return;
        }
        Object obj = mapM191030e.get("boost");
        if (obj == null || Intrinsics.m88377d(obj, "")) {
            try {
                if (ikw.m140420b().m140421a(strM135531f)) {
                    ikw.m140420b().m140425f(strM135531f);
                }
                ConcurrentHashMap<String, JSONObject> concurrentHashMap = cacheMap;
                if (concurrentHashMap.containsKey(bid)) {
                    concurrentHashMap.remove(bid);
                    return;
                }
                return;
            } catch (Exception e) {
                jzv.m147730c("MKBoostUtils", "", e);
                return;
            }
        }
        try {
            String string = obj.toString();
            cacheMap.put(bid, new JSONObject(string));
            ikw.m140420b().m140426g(strM135531f, string);
        } catch (Exception e2) {
            if (ikw.m140420b().m140421a(strM135531f)) {
                ikw.m140420b().m140425f(strM135531f);
            }
            ConcurrentHashMap<String, JSONObject> concurrentHashMap2 = cacheMap;
            if (concurrentHashMap2.containsKey(bid)) {
                concurrentHashMap2.remove(bid);
            }
            jzv.m147730c("MKBoostUtils", "", e2);
        }
    }
}
