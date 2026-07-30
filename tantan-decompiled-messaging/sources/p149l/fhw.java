package p149l;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.framework.storage.p039kv.C3750KV;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
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
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ)\u0010\u0012\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\bJ!\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010!JF\u0010)\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\t\u001a\u0004\u0018\u00010\u00042#\u0010(\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u001c\u0018\u00010$¢\u0006\u0004\b)\u0010*R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00140+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,¨\u0006."}, m87232d2 = {"Ll/fhw;", "", "<init>", "()V", "", "value", "", "h", "(Ljava/lang/String;)Z", "startUrl", "e", "(Ljava/lang/String;)Ljava/lang/String;", "boostJsUrl", "c", "bid", "", "boostOfflineVersion", "projectOfflineVersion", "b", "(Ljava/lang/String;JJ)Z", "Lorg/json/JSONObject;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Lorg/json/JSONObject;", "f", "url", RXScreenCaptureService.KEY_INDEX, "Ll/esj0;", LovePlanetStage.result, "", "j", "(Ljava/lang/String;Ll/esj0;)V", "offlineBoostVersion", "a", "(J)Z", "Limmomo/com/mklibrary/core/base/ui/MKWebView;", "cacheWeb", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "error", "onValueCallback", "g", "(Limmomo/com/mklibrary/core/base/ui/MKWebView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Z", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "cacheMap", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class fhw {
    public static final fhw INSTANCE = new fhw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final ConcurrentHashMap<String, JSONObject> cacheMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l.fhw$a */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"", "kotlin.jvm.PlatformType", "resultValue", "", "a", "(Ljava/lang/String;)V"}, m87233k = 3, m87234mv = {1, 4, 0})
    public static final class C16838a<T> implements ValueCallback<String> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f97582a;

        public C16838a(Function1 function1) {
            this.f97582a = function1;
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(String str) {
            MDLog.m7389d("MKBoostUtils", "lehua:boost:evaluateJavascript: result=" + str);
            try {
                Function1 function1 = this.f97582a;
                if (function1 != null) {
                }
            } catch (Exception e) {
                MDLog.printErrStackTrace("MKBoostUtils", e);
            }
        }
    }

    private fhw() {
    }

    /* JADX INFO: renamed from: b */
    private final boolean m121458b(String bid, long boostOfflineVersion, long projectOfflineVersion) {
        JSONObject jSONObjectM121460d;
        if (bid != null && !StringsKt.m93438e0(bid) && (jSONObjectM121460d = m121460d(bid)) != null) {
            long jOptLong = jSONObjectM121460d.optLong("minBidVersion", 0L);
            long jOptLong2 = jSONObjectM121460d.optLong("maxBidVersion", 0L);
            long jOptLong3 = jSONObjectM121460d.optLong("boostVersion", 0L);
            MDLog.m7389d("MKBoostUtils", "lehua:boost:checkProjectVersion {\n            boostOfflineVersion: " + boostOfflineVersion + ",\n            projectOfflineVersion: " + projectOfflineVersion + ",\n            minBidVersion: " + jOptLong + ",\n            maxBidVersion: " + jOptLong2 + ",\n            boostVersion: " + jOptLong3 + "\n          }");
            if (jOptLong > 0 && jOptLong2 > 0 && jOptLong3 > 0 && boostOfflineVersion == jOptLong3 && projectOfflineVersion >= jOptLong && projectOfflineVersion <= jOptLong2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m121459c(String boostJsUrl) {
        MDLog.m7389d("MKBoostUtils", "lehua:boost:js: {" + boostJsUrl + '}');
        if (b0g0.m99770c(boostJsUrl)) {
            return false;
        }
        String strM218869b = zhw.m218869b(boostJsUrl);
        if (b0g0.m99769b(strM218869b)) {
            return false;
        }
        try {
            File fileM217437h = z750.m217437h(strM218869b);
            fileM217437h.getClass();
            if (fileM217437h.exists() && fileM217437h.isDirectory()) {
                File file = new File(fileM217437h, zhw.m218874g(boostJsUrl));
                if (file.exists() && file.isFile() && file.length() > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            MDLog.printErrStackTrace("MKBoostUtils", e);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private final JSONObject m121460d(String bid) {
        String strM18339f;
        if (bid == null || StringsKt.m93438e0(bid)) {
            return null;
        }
        ConcurrentHashMap<String, JSONObject> concurrentHashMap = cacheMap;
        JSONObject jSONObject = concurrentHashMap.get(bid);
        if (jSONObject == null) {
            String strM121462f = m121462f(bid);
            if (strM121462f == null || (strM18339f = C3750KV.m18339f(strM121462f, "")) == null || StringsKt.m93438e0(strM18339f)) {
                return null;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(strM18339f);
                concurrentHashMap.put(bid, jSONObject2);
                return jSONObject2;
            } catch (Exception e) {
                MDLog.printErrStackTrace("MKBoostUtils", e);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:5:0x0009, B:8:0x001a, B:11:0x002f, B:14:0x0036, B:15:0x0042, B:17:0x0048, B:19:0x0050, B:22:0x0056, B:24:0x0060, B:25:0x0064, B:27:0x006c, B:29:0x0072, B:31:0x007f, B:32:0x0083, B:35:0x008e, B:36:0x009b, B:38:0x00a1, B:40:0x00af, B:41:0x00b7, B:34:0x008b), top: B:45:0x0009 }] */
    /* JADX INFO: renamed from: e */
    private final String m121461e(String startUrl) {
        if (b0g0.m99769b(startUrl)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(startUrl);
            if (!m121463h(uri.getQueryParameter("_boost"))) {
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
                    } else if (i == pathSegments.size() - 1 && b0g0.m99772e(str)) {
                        str.getClass();
                        if (C15386d.m93489w(str, ".html", false, 2, null)) {
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
                if (Intrinsics.m87488d(str2, "_bid")) {
                    builderBuildUpon.appendQueryParameter(str2, uri.getQueryParameter(str2));
                }
            }
            return builderBuildUpon.build().toString();
        } catch (Exception e) {
            MDLog.printErrStackTrace("MKBoostUtils", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    private final String m121462f(String bid) {
        if (bid == null || StringsKt.m93438e0(bid)) {
            return null;
        }
        return "checkupdate_mk_config_boost_" + bid;
    }

    /* JADX INFO: renamed from: h */
    private final boolean m121463h(String value) {
        return Intrinsics.m87488d("1", value);
    }

    /* JADX INFO: renamed from: i */
    private final boolean m121464i(String url) {
        if (url != null) {
            return C15386d.m93483J(url, "https://", false, 2, null) || C15386d.m93483J(url, "http://", false, 2, null);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m121465a(long offlineBoostVersion) {
        return offlineBoostVersion > 0 && offlineBoostVersion == mei.m154207m();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m121466g(@Nullable MKWebView cacheWeb, @Nullable String startUrl, @Nullable Function1<? super Boolean, Unit> onValueCallback) {
        if (cacheWeb != null && startUrl != null && !b0g0.m99770c(startUrl) && m121464i(startUrl)) {
            MDLog.m7389d("MKBoostUtils", "lehua:boost boost=" + cacheWeb.f63245c + " === startUrl=" + startUrl);
            if (!cacheWeb.f63245c.getBoost() || cacheWeb.f63245c.getState() != 0) {
                return false;
            }
            Uri uri = Uri.parse(startUrl);
            String queryParameter = uri.getQueryParameter("_bid");
            boolean zM121463h = m121463h(uri.getQueryParameter("_boost"));
            if (!b0g0.m99769b(queryParameter) && zM121463h) {
                Uri uri2 = Uri.parse(cacheWeb.getUrl());
                uri2.getClass();
                if (b0g0.m99768a(uri2.getScheme(), uri.getScheme()) && b0g0.m99768a(uri2.getHost(), uri.getHost()) && uri2.getPort() == uri.getPort()) {
                    long jM214873v = yhw.m214862s().m214873v(queryParameter);
                    long version = cacheWeb.f63245c.getCom.sina.weibo.sdk.constant.WBConstants.AUTH_PARAMS_VERSION java.lang.String();
                    if (!m121458b(queryParameter, version, jM214873v)) {
                        MDLog.m7389d("MKBoostUtils", "lehua:boost 加速器获取失败: 离线包版本不符合接口下发配置");
                        return false;
                    }
                    String strM121461e = m121461e(startUrl);
                    if (!m121459c(strM121461e)) {
                        MDLog.m7389d("MKBoostUtils", "lehua:boost 加速器获取失败: 离线包版本中不存在 " + strM121461e + " 文件");
                        return false;
                    }
                    String str = "window.mkBoostLaunchEvent&&window.mkBoostLaunchEvent('" + queryParameter + "','" + strM121461e + "','" + liw.m149950k(startUrl) + "','" + version + "','" + jM214873v + "')";
                    MDLog.m7389d("MKBoostUtils", "lehua:boost:evaluateJavascript: ".concat(str));
                    cacheWeb.evaluateJavascript(str, new C16838a(onValueCallback));
                    return true;
                }
                MDLog.m7389d("MKBoostUtils", "lehua:boost 加速器获取失败: 不符合同源策略");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m121467j(@Nullable String bid, @Nullable esj0 result) {
        String strM121462f;
        Map<String, Object> mapM117909b;
        if (bid == null || (strM121462f = m121462f(bid)) == null || StringsKt.m93438e0(strM121462f) || result == null || (mapM117909b = result.m117909b()) == null) {
            return;
        }
        Object obj = mapM117909b.get("boost");
        if (obj == null || Intrinsics.m87488d(obj, "")) {
            try {
                if (C3750KV.m18334a(strM121462f)) {
                    C3750KV.m18342i(strM121462f);
                }
                ConcurrentHashMap<String, JSONObject> concurrentHashMap = cacheMap;
                if (concurrentHashMap.containsKey(bid)) {
                    concurrentHashMap.remove(bid);
                    return;
                }
                return;
            } catch (Exception e) {
                MDLog.printErrStackTrace("MKBoostUtils", e);
                return;
            }
        }
        try {
            String string = obj.toString();
            cacheMap.put(bid, new JSONObject(string));
            C3750KV.m18343j(strM121462f, string);
        } catch (Exception e2) {
            if (C3750KV.m18334a(strM121462f)) {
                C3750KV.m18342i(strM121462f);
            }
            ConcurrentHashMap<String, JSONObject> concurrentHashMap2 = cacheMap;
            if (concurrentHashMap2.containsKey(bid)) {
                concurrentHashMap2.remove(bid);
            }
            MDLog.printErrStackTrace("MKBoostUtils", e2);
        }
    }
}
