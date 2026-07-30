package p149l;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 ]2\u00020\u0001:\u0001\"B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020!*\u00020!H\u0002¢\u0006\u0004\b$\u0010#J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0017¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b.\u0010*J\u0015\u0010/\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b/\u0010*J\u0015\u00101\u001a\u00020&2\u0006\u00100\u001a\u00020\u0004¢\u0006\u0004\b1\u0010*J\u0015\u00103\u001a\u00020&2\u0006\u00102\u001a\u00020\u0017¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020&2\u0006\u0010\u0016\u001a\u000205¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0004\u0018\u00010\u00042\u0006\u00102\u001a\u00020\u0017¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0017¢\u0006\u0004\b:\u00109J\u0015\u0010;\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0017¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010=R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010>\u001a\u0004\b?\u0010@R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010>\u001a\u0004\bA\u0010@\"\u0004\bB\u0010CR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010CR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010>\u001a\u0004\bG\u0010@\"\u0004\bH\u0010CR$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010CR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010>\u001a\u0004\bK\u0010@\"\u0004\bL\u0010CR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010>\u001a\u0004\bN\u0010@\"\u0004\bO\u0010CR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010PR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010>R \u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010QR \u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010QR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010UR\u0014\u0010W\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010>R$\u0010\\\u001a\u00020X2\u0006\u0010Y\u001a\u00020X8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010Z\u001a\u0004\bM\u0010[¨\u0006^"}, m87232d2 = {"Ll/kwb;", "", "Ll/qwb;", "httpClient", "", "defaultDomain", "cachedDomain", "cachedSpikyDomain", "region", "proxyDomain", "spikyProxyDomain", "customHandshakeDomain", "accountId", "accountToken", "sdkVersion", "Lcom/clevertap/android/sdk/Logger;", "logger", "logTag", "<init>", "(Ll/qwb;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/clevertap/android/sdk/Logger;Ljava/lang/String;)V", "baseUrl", "relativeUrl", "body", "", "includeTs", "", "headers", "Ll/rtc0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)Ll/rtc0;", "Landroid/net/Uri;", "j", "(Ljava/lang/String;Ljava/lang/String;Z)Landroid/net/Uri;", "Landroid/net/Uri$Builder;", "a", "(Landroid/net/Uri$Builder;)Landroid/net/Uri$Builder;", "b", "isEncrypted", "Ll/fxc0;", "q", "(Ljava/lang/String;Z)Ll/fxc0;", "n", "(Ljava/lang/String;)Ll/fxc0;", "Ll/s06;", "m", "(Ll/s06;)Ll/fxc0;", "p", "o", "url", "f", "isViewedEvent", BLiveStormDanmakuGiftResourceType.f44444l, "(Z)Ll/fxc0;", "Ll/xge0;", "e", "(Ll/xge0;)Ll/fxc0;", "g", "(Z)Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "k", "(Z)Z", "Ll/qwb;", "Ljava/lang/String;", "getDefaultDomain", "()Ljava/lang/String;", "getCachedDomain", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "getCachedSpikyDomain", Constants.KEY_T, "getRegion", "setRegion", "getProxyDomain", "setProxyDomain", "getSpikyProxyDomain", "setSpikyProxyDomain", "h", "getCustomHandshakeDomain", "setCustomHandshakeDomain", "Lcom/clevertap/android/sdk/Logger;", "Ljava/util/Map;", "defaultHeaders", "defaultQueryParams", "Lkotlin/Pair;", "Lkotlin/Pair;", "encryptionHeader", "spikyRegionSuffix", "", "value", "I", "()I", "currentRequestTimestampSeconds", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class kwb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final qwb httpClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String defaultDomain;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String cachedDomain;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String cachedSpikyDomain;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String region;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String proxyDomain;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String spikyProxyDomain;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String customHandshakeDomain;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final String logTag;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Map<String, String> defaultHeaders;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Map<String, String> defaultQueryParams;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Pair<String, String> encryptionHeader;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final String spikyRegionSuffix;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int currentRequestTimestampSeconds;

    public kwb(@NotNull qwb qwbVar, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull Logger logger, @NotNull String str11) {
        qwbVar.getClass();
        str.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        logger.getClass();
        str11.getClass();
        this.httpClient = qwbVar;
        this.defaultDomain = str;
        this.cachedDomain = str2;
        this.cachedSpikyDomain = str3;
        this.region = str4;
        this.proxyDomain = str5;
        this.spikyProxyDomain = str6;
        this.customHandshakeDomain = str7;
        this.logger = logger;
        this.logTag = str11;
        this.defaultHeaders = MapsKt.mapOf(TuplesKt.m87240a("Content-Type", "application/json; charset=utf-8"), TuplesKt.m87240a("X-CleverTap-Account-ID", str8), TuplesKt.m87240a("X-CleverTap-Token", str9));
        this.defaultQueryParams = MapsKt.mapOf(TuplesKt.m87240a("os", "Android"), TuplesKt.m87240a(Constants.KEY_T, str10), TuplesKt.m87240a(BaseSei.f13932Z, str8));
        this.encryptionHeader = TuplesKt.m87240a("X-CleverTap-Encryption-Enabled", "true");
        this.spikyRegionSuffix = "-spiky";
    }

    /* JADX INFO: renamed from: a */
    private final Uri.Builder m147523a(Uri.Builder builder) {
        for (Map.Entry<String, String> entry : this.defaultQueryParams.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builder;
    }

    /* JADX INFO: renamed from: b */
    private final Uri.Builder m147524b(Uri.Builder builder) {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        this.currentRequestTimestampSeconds = iCurrentTimeMillis;
        Uri.Builder builderAppendQueryParameter = builder.appendQueryParameter(com.tencent.connect.common.Constants.f57189TS, String.valueOf(iCurrentTimeMillis));
        builderAppendQueryParameter.getClass();
        return builderAppendQueryParameter;
    }

    /* JADX INFO: renamed from: c */
    private final rtc0 m147525c(String baseUrl, String relativeUrl, String body, boolean includeTs, Map<String, String> headers) {
        return new rtc0(m147527j(baseUrl, relativeUrl, includeTs), headers, body);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ rtc0 m147526d(kwb kwbVar, String str, String str2, String str3, boolean z, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            map = kwbVar.defaultHeaders;
        }
        return kwbVar.m147525c(str, str2, str3, z2, map);
    }

    /* JADX INFO: renamed from: j */
    private final Uri m147527j(String baseUrl, String relativeUrl, boolean includeTs) {
        Uri.Builder builderAuthority = new Uri.Builder().scheme("https").authority(baseUrl);
        List listSplit$default = StringsKt.split$default(relativeUrl, new String[]{"/"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            builderAuthority.appendPath((String) it.next());
        }
        builderAuthority.getClass();
        m147523a(builderAuthority);
        if (includeTs) {
            m147524b(builderAuthority);
        }
        Uri uriBuild = builderAuthority.build();
        uriBuild.getClass();
        return uriBuild;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ fxc0 m147528r(kwb kwbVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kwbVar.m147540q(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final fxc0 m147529e(@NotNull xge0 body) {
        body.getClass();
        qwb qwbVar = this.httpClient;
        String strM147531g = m147531g(false);
        if (strM147531g == null) {
            strM147531g = this.defaultDomain;
        }
        return qwbVar.mo143521a(m147526d(this, strM147531g, "defineVars", body.toString(), false, null, 24, null));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final fxc0 m147530f(@NotNull String url) {
        url.getClass();
        rtc0 rtc0Var = new rtc0(Uri.parse(url), MapsKt.emptyMap(), null);
        this.logger.verbose(this.logTag, "Fetching content from URL");
        return this.httpClient.mo143521a(rtc0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m147531g(boolean isViewedEvent) {
        if (!lw3.m151946p(this.region)) {
            String str = isViewedEvent ? this.spikyProxyDomain : this.proxyDomain;
            if (lw3.m151946p(str)) {
                return str;
            }
            return isViewedEvent ? this.cachedSpikyDomain : this.cachedDomain;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.region);
        sb.append(isViewedEvent ? this.spikyRegionSuffix : "");
        sb.append(".");
        sb.append(this.defaultDomain);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getCurrentRequestTimestampSeconds() {
        return this.currentRequestTimestampSeconds;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m147533i(boolean isViewedEvent) {
        if (lw3.m151946p(this.region)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.region);
            sb.append(isViewedEvent ? this.spikyRegionSuffix : "");
            sb.append(".");
            sb.append(this.defaultDomain);
            return sb.toString();
        }
        String str = isViewedEvent ? this.spikyProxyDomain : this.proxyDomain;
        if (lw3.m151946p(str)) {
            return str;
        }
        if (!lw3.m151946p(this.customHandshakeDomain)) {
            String str2 = isViewedEvent ? this.cachedSpikyDomain : this.cachedDomain;
            return lw3.m151946p(str2) ? str2 : this.defaultDomain;
        }
        String str3 = this.customHandshakeDomain;
        str3.getClass();
        return str3;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m147534k(boolean isViewedEvent) {
        if (lw3.m151946p(this.region)) {
            return false;
        }
        if (lw3.m151946p(isViewedEvent ? this.spikyProxyDomain : this.proxyDomain)) {
            return false;
        }
        String str = isViewedEvent ? this.cachedSpikyDomain : this.cachedDomain;
        return str == null || StringsKt.m93438e0(str);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final fxc0 m147535l(boolean isViewedEvent) {
        Map<String, String> mapPlus;
        String strM147533i = m147533i(isViewedEvent);
        if (lw3.m151946p(this.customHandshakeDomain) && Intrinsics.m87488d(strM147533i, this.customHandshakeDomain)) {
            Map<String, String> map = this.defaultHeaders;
            String str = this.customHandshakeDomain;
            str.getClass();
            mapPlus = MapsKt.plus(map, TuplesKt.m87240a("X-CleverTap-Handshake-Domain", str));
        } else {
            mapPlus = this.defaultHeaders;
        }
        rtc0 rtc0VarM147525c = m147525c(strM147533i, "hello", null, false, mapPlus);
        this.logger.verbose(this.logTag, "Performing handshake with " + rtc0VarM147525c.getUrl());
        return this.httpClient.mo143521a(rtc0VarM147525c);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final fxc0 m147536m(@NotNull s06 body) {
        body.getClass();
        qwb qwbVar = this.httpClient;
        String strM147531g = m147531g(false);
        if (strM147531g == null) {
            strM147531g = this.defaultDomain;
        }
        return qwbVar.mo143521a(m147526d(this, strM147531g, "content", body.toString(), false, null, 24, null));
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final fxc0 m147537n(@NotNull String body) {
        body.getClass();
        qwb qwbVar = this.httpClient;
        String strM147531g = m147531g(true);
        if (strM147531g == null) {
            strM147531g = this.defaultDomain;
        }
        return qwbVar.mo143521a(m147526d(this, strM147531g, "a1", body, false, this.defaultHeaders, 8, null));
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final fxc0 m147538o(@NotNull String body) {
        body.getClass();
        qwb qwbVar = this.httpClient;
        String strM147531g = m147531g(false);
        if (strM147531g == null) {
            strM147531g = this.defaultDomain;
        }
        return qwbVar.mo143521a(m147526d(this, strM147531g, "inbox/v2/deleteMessages", body, false, this.defaultHeaders, 8, null));
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final fxc0 m147539p(@NotNull String body) {
        body.getClass();
        qwb qwbVar = this.httpClient;
        String strM147531g = m147531g(false);
        if (strM147531g == null) {
            strM147531g = this.defaultDomain;
        }
        return qwbVar.mo143521a(m147526d(this, strM147531g, "inbox/v2/getMessages", body, false, this.defaultHeaders, 8, null));
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final fxc0 m147540q(@NotNull String body, boolean isEncrypted) {
        body.getClass();
        qwb qwbVar = this.httpClient;
        String strM147531g = m147531g(false);
        if (strM147531g == null) {
            strM147531g = this.defaultDomain;
        }
        String str = strM147531g;
        Map<String, String> mapPlus = this.defaultHeaders;
        if (isEncrypted) {
            mapPlus = MapsKt.plus(mapPlus, this.encryptionHeader);
        }
        return qwbVar.mo143521a(m147526d(this, str, "a1", body, false, mapPlus, 8, null));
    }

    /* JADX INFO: renamed from: s */
    public final void m147541s(@Nullable String str) {
        this.cachedDomain = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m147542t(@Nullable String str) {
        this.cachedSpikyDomain = str;
    }
}
