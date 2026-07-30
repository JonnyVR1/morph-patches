package p153l;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\bJ\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001e\u0010\u001aJ#\u0010\"\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b(\u0010&J\u0019\u0010)\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b)\u0010&J!\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b-\u0010&R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\t0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\t0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\t0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00100R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\t0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00100R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\t078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00100R\u001b\u0010;\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b5\u0010\u0011R\u001b\u0010<\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b8\u0010\u0011¨\u0006="}, m88121d2 = {"Ll/lhl;", "", "<init>", "()V", "", "enable", "", "r", "(Z)V", "", "apiEnableConfig", "q", "(Ljava/lang/String;)V", "webEnableConfig", BLiveStormDanmakuGiftResourceType.f45294s, Constants.KEY_T, "f", "()Z", "u", "g", "Ll/x1d0;", SocialConstants.TYPE_REQUEST, "n", "(Ll/x1d0;)Ll/x1d0;", "source", "m", "(Ljava/lang/String;)Ljava/lang/String;", "host", "o", "url", "p", "Landroid/net/Uri;", "uri", "originHost", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;", "h5Url", "h", "(Ljava/lang/String;)Z", Constants.KEY_CONFIG, "j", "k", "bid", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;)Z", "c", "", "a", "Ljava/util/Set;", "HOST_WHITELIST", "b", "HOST_WHITELIST_WEB", "BID_WHITELIST_WEB", Constants.INAPP_DATA_TAG, "HOST_NOT_MK_LIST", "", "e", "rewrittenBidSet", "Lkotlin/Lazy;", "changeHostEnable", "changeWebHostEnable", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class lhl {

    @NotNull
    public static final lhl INSTANCE = new lhl();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static Set<String> HOST_WHITELIST = SetsKt.setOf((Object[]) new String[]{"accounts.tantanapp.com", "active.tantanapp.com", "core.tantanapp.com", "growth.tantanapp.com", "intl-web-api.tantanapp.com", "live-web-api.tantanapp.com", "m.tantanapp.com", "mcn-live.tantanapp.com", "miheappintl.tantanapp.com", "oms.tantanapp.com", "order.tantanapp.com", "passport.tantanapp.com", "web-api.tantanapp.com", "wechat.tantanapp.com", "client-monitor.tantanapp.com", "httpdns.tantanapp.com", "connperf.tantanapp.com", "devices.tantanapp.com", "audio.tantanapp.com", "image.tantanapp.com", "affiliate.tantanapp.com", "seiya.tantanapp.com", "cloud.tantanapp.com", "cloud-direct.tantanapp.com", "intl-fep-api.tantanapp.com", "default.tantanapp.com", "deviceid.tantanapp.com", "report.tantanapp.com", "sc-report.tantanapp.com", "io-sm-log.tantanapp.com", "intlaffiliate.tantanapp.com", "live-web.tantanapp.com", "live-activity.tantanapp.com", "h5-static-overseas.tantanapp.com", "live-realtime.tantanapp.com", "l.tantanapp.com", "asset.tantanapp.com", "abtest.tantanapp.com", "counter.tantanapp.com", "autoupdate.tantanapp.com", "i.tantanapp.com", "intlweb.tantanapp.com", "int.tantanapp.com", "www.int.tantanapp.com", "lp.tantanapp.com", "pco-sm-log.tantanapp.com", "my-tantan.tantanapp.com", "openapi.tantanapp.com", "intl-live-activity.tantanapp.com", "i.tancdn.com", "auto.tancdn.com", "live-static.tancdn.com", "static.tancdn.com", "short-video.tancdn.com", "fe-static.tancdn.com", "h5-static-overseas.tancdn.com", "apk-ssl.tanapk.com"});

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Set<String> HOST_WHITELIST_WEB = SetsKt.setOf((Object[]) new String[]{"m.tantanapp.com", "h5-static-overseas.tantanapp.com", "intlweb.tantanapp.com"});

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static Set<String> BID_WHITELIST_WEB = SetsKt.setOf((Object[]) new String[]{"1005128", "1002576"});

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static Set<String> HOST_NOT_MK_LIST = SetsKt.emptySet();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> rewrittenBidSet;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Lazy changeHostEnable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Lazy changeWebHostEnable;

    static {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet.getClass();
        rewrittenBidSet = keySetViewNewKeySet;
        changeHostEnable = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.jhl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(lhl.m154208a());
            }
        });
        changeWebHostEnable = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.khl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(lhl.m154209b());
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static boolean m154208a() {
        return INSTANCE.m154217j(rr2.m182682b().m182684c("inner_api_domain_enable_config", ""));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m154209b() {
        lhl lhlVar = INSTANCE;
        return lhlVar.m154211d() && lhlVar.m154218k(rr2.m182682b().m182684c("inner_web_domain_enable_config", ""));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m154210c(String bid) {
        if (bid == null || bid.length() <= 0 || !BID_WHITELIST_WEB.contains(bid)) {
            return false;
        }
        rewrittenBidSet.add(bid);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m154211d() {
        return ((Boolean) changeHostEnable.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m154212e() {
        return ((Boolean) changeWebHostEnable.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m154213f() {
        return m154211d() && rr2.m182682b().m182683a("inner_web_domain_enable_stage", false);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m154214g() {
        return m154211d() && rr2.m182682b().m182683a("inner_web_domain_enable_stage_use_firebase", false);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m154215h(@Nullable String h5Url) {
        String host;
        if (m154212e()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Unit unit = null;
                if (h5Url != null) {
                    Uri uri = Uri.parse(h5Url);
                    uri.getClass();
                    if (uri != null && (host = uri.getHost()) != null) {
                        if (HOST_WHITELIST_WEB.contains(host) && StringsKt.m94303P(host, "tantanapp.com", false, 2, null)) {
                            String strM206867c = wkw.m206867c(h5Url);
                            if (CollectionsKt.contains(rewrittenBidSet, strM206867c)) {
                                return true;
                            }
                            if (INSTANCE.m154216i(strM206867c, h5Url)) {
                                return true;
                            }
                        }
                        unit = Unit.INSTANCE;
                    }
                }
                Result.m225066constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m154216i(String bid, String url) {
        Object obj;
        if (bid != null && bid.length() != 0) {
            return false;
        }
        Iterator<T> it = HOST_NOT_MK_LIST.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.m94303P(url, (String) next, false, 2, null)) {
                obj = next;
                break;
            }
        }
        String str = (String) obj;
        return str != null && str.length() > 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m154217j(String config) {
        boolean zBooleanValue = false;
        try {
            if (!TextUtils.isEmpty(config)) {
                JSONObject object = JSON.parseObject(config);
                Boolean bool = object.getBoolean("enable");
                bool.getClass();
                zBooleanValue = bool.booleanValue();
                if (zBooleanValue) {
                    JSONArray jSONArray = object.getJSONArray("whiteList");
                    jSONArray.getClass();
                    Set<String> set = CollectionsKt.toSet(jSONArray);
                    set.getClass();
                    HOST_WHITELIST = set;
                }
            }
        } catch (Throwable unused) {
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m154218k(String config) {
        try {
            if (TextUtils.isEmpty(config)) {
                return false;
            }
            JSONObject object = JSON.parseObject(config);
            JSONArray jSONArray = object.getJSONArray("openHostList");
            jSONArray.getClass();
            Set<String> set = CollectionsKt.toSet(jSONArray);
            set.getClass();
            HOST_WHITELIST_WEB = set;
            JSONArray jSONArray2 = object.getJSONArray("openBidList");
            jSONArray2.getClass();
            Set<String> set2 = CollectionsKt.toSet(jSONArray2);
            set2.getClass();
            BID_WHITELIST_WEB = set2;
            JSONArray jSONArray3 = object.getJSONArray("openNotMkHostList");
            jSONArray3.getClass();
            Set<String> set3 = CollectionsKt.toSet(jSONArray3);
            set3.getClass();
            HOST_NOT_MK_LIST = set3;
            Boolean bool = object.getBoolean("enable");
            bool.getClass();
            return bool.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final String m154219l(@Nullable Uri uri, @Nullable String originHost) {
        if (m154212e()) {
            String strM206867c = wkw.m206867c(uri != null ? uri.toString() : null);
            if (!TextUtils.isEmpty(strM206867c) && CollectionsKt.contains(rewrittenBidSet, strM206867c)) {
                if (originHost != null) {
                    return C15493d.m94372H(originHost, "tantantribe.com", "tantanapp.com", false, 4, null);
                }
                return null;
            }
        }
        return originHost;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m154220m(@NotNull String source) {
        source.getClass();
        if (!m154211d()) {
            return source;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Uri uri = Uri.parse(source);
            uri.getClass();
            String host = uri.getHost();
            try {
                if (host != null) {
                    return C15493d.m94372H(source, host, INSTANCE.m154222o(host), false, 4, null);
                }
                Result.m225066constructorimpl(null);
                return source;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable th3 = th;
        Result.Companion companion2 = Result.INSTANCE;
        Result.m225066constructorimpl(ResultKt.m88127a(th3));
        return source;
    }

    @SuppressLint({"LogUseError"})
    @NotNull
    /* JADX INFO: renamed from: n */
    public final x1d0 m154221n(@NotNull x1d0 request) {
        request.getClass();
        try {
            if (m154211d()) {
                String strM182286m = request.m209026k().m182286m();
                strM182286m.getClass();
                String strM154222o = m154222o(strM182286m);
                if (!TextUtils.equals(strM182286m, strM154222o)) {
                    x1d0 x1d0VarM209028b = request.m209023h().m209045s(request.m209026k().m182288p().m182304h(strM154222o).m182301d()).m209028b();
                    x1d0VarM209028b.getClass();
                    return x1d0VarM209028b;
                }
            }
        } catch (Exception unused) {
        }
        return request;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final String m154222o(@NotNull String host) {
        host.getClass();
        if (!m154211d() || !HOST_WHITELIST.contains(host)) {
            return host;
        }
        if (StringsKt.m94303P(host, "tantanapp.com", false, 2, null)) {
            return C15493d.m94372H(host, "tantanapp.com", "tantantribe.com", false, 4, null);
        }
        if (StringsKt.m94303P(host, "tancdn.com", false, 2, null)) {
            return C15493d.m94372H(host, "tancdn.com", "tantantribecdn.com", false, 4, null);
        }
        return StringsKt.m94303P(host, "tanapk.com", false, 2, null) ? C15493d.m94372H(host, "tanapk.com", "tantantribeapk.com", false, 4, null) : host;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r0.m154216i(r7, r8) != false) goto L22;
     */
    @Nullable
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m154223p(@Nullable String url) {
        Throwable th;
        String host;
        if (!m154212e()) {
            return url;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Unit unit = null;
            try {
                if (url != null) {
                    Uri uri = Uri.parse(url);
                    uri.getClass();
                    if (uri != null && (host = uri.getHost()) != null) {
                        if (HOST_WHITELIST_WEB.contains(host) && StringsKt.m94303P(host, "tantanapp.com", false, 2, null)) {
                            String strM206867c = wkw.m206867c(url);
                            lhl lhlVar = INSTANCE;
                            if (!lhlVar.m154210c(strM206867c)) {
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    Result.m225066constructorimpl(ResultKt.m88127a(th));
                                    return url;
                                }
                            }
                            return C15493d.m94372H(url, "tantanapp.com", "tantantribe.com", false, 4, null);
                        }
                        unit = Unit.INSTANCE;
                    }
                }
                Result.m225066constructorimpl(unit);
                return url;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                Result.Companion companion3 = Result.INSTANCE;
                Result.m225066constructorimpl(ResultKt.m88127a(th));
                return url;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m154224q(@NotNull String apiEnableConfig) {
        apiEnableConfig.getClass();
        try {
            rr2.m182682b().m182686e("inner_api_domain_enable_config", apiEnableConfig);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m154225r(boolean enable) {
        try {
            rr2.m182682b().m182686e("inner_domain_enable_stage", Boolean.valueOf(enable));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m154226s(@NotNull String webEnableConfig) {
        webEnableConfig.getClass();
        try {
            rr2.m182682b().m182686e("inner_web_domain_enable_config", webEnableConfig);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m154227t(boolean enable) {
        try {
            rr2.m182682b().m182686e("inner_web_domain_enable_stage", Boolean.valueOf(enable));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m154228u(boolean enable) {
        try {
            rr2.m182682b().m182686e("inner_web_domain_enable_stage_use_firebase", Boolean.valueOf(enable));
        } catch (Throwable unused) {
        }
    }
}
