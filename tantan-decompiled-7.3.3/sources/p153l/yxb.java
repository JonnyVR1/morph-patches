package p153l;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 ]2\u00020\u0001:\u0001\"B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020!*\u00020!H\u0002¢\u0006\u0004\b$\u0010#J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0017¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b.\u0010*J\u0015\u0010/\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b/\u0010*J\u0015\u00101\u001a\u00020&2\u0006\u00100\u001a\u00020\u0004¢\u0006\u0004\b1\u0010*J\u0015\u00103\u001a\u00020&2\u0006\u00102\u001a\u00020\u0017¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020&2\u0006\u0010\u0016\u001a\u000205¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0004\u0018\u00010\u00042\u0006\u00102\u001a\u00020\u0017¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0017¢\u0006\u0004\b:\u00109J\u0015\u0010;\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0017¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010=R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010>\u001a\u0004\b?\u0010@R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010>\u001a\u0004\bA\u0010@\"\u0004\bB\u0010CR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010CR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010>\u001a\u0004\bG\u0010@\"\u0004\bH\u0010CR$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010CR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010>\u001a\u0004\bK\u0010@\"\u0004\bL\u0010CR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010>\u001a\u0004\bN\u0010@\"\u0004\bO\u0010CR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010PR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010>R \u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010QR \u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010QR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010UR\u0014\u0010W\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010>R$\u0010\\\u001a\u00020X2\u0006\u0010Y\u001a\u00020X8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010Z\u001a\u0004\bM\u0010[¨\u0006^"}, m88121d2 = {"Ll/yxb;", "", "Ll/eyb;", "httpClient", "", "defaultDomain", "cachedDomain", "cachedSpikyDomain", "region", "proxyDomain", "spikyProxyDomain", "customHandshakeDomain", "accountId", "accountToken", "sdkVersion", "Lcom/clevertap/android/sdk/Logger;", "logger", "logTag", "<init>", "(Ll/eyb;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/clevertap/android/sdk/Logger;Ljava/lang/String;)V", "baseUrl", "relativeUrl", "body", "", "includeTs", "", "headers", "Ll/w1d0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)Ll/w1d0;", "Landroid/net/Uri;", "j", "(Ljava/lang/String;Ljava/lang/String;Z)Landroid/net/Uri;", "Landroid/net/Uri$Builder;", "a", "(Landroid/net/Uri$Builder;)Landroid/net/Uri$Builder;", "b", "isEncrypted", "Ll/j5d0;", "q", "(Ljava/lang/String;Z)Ll/j5d0;", "n", "(Ljava/lang/String;)Ll/j5d0;", "Ll/x16;", "m", "(Ll/x16;)Ll/j5d0;", "p", "o", "url", "f", "isViewedEvent", BLiveStormDanmakuGiftResourceType.f45292l, "(Z)Ll/j5d0;", "Ll/cpe0;", "e", "(Ll/cpe0;)Ll/j5d0;", "g", "(Z)Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "k", "(Z)Z", "Ll/eyb;", "Ljava/lang/String;", "getDefaultDomain", "()Ljava/lang/String;", "getCachedDomain", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "getCachedSpikyDomain", Constants.KEY_T, "getRegion", "setRegion", "getProxyDomain", "setProxyDomain", "getSpikyProxyDomain", "setSpikyProxyDomain", "h", "getCustomHandshakeDomain", "setCustomHandshakeDomain", "Lcom/clevertap/android/sdk/Logger;", "Ljava/util/Map;", "defaultHeaders", "defaultQueryParams", "Lkotlin/Pair;", "Lkotlin/Pair;", "encryptionHeader", "spikyRegionSuffix", "", "value", "I", "()I", "currentRequestTimestampSeconds", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class yxb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final eyb httpClient;

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

    public yxb(@NotNull eyb eybVar, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull Logger logger, @NotNull String str11) {
        eybVar.getClass();
        str.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        logger.getClass();
        str11.getClass();
        this.httpClient = eybVar;
        this.defaultDomain = str;
        this.cachedDomain = str2;
        this.cachedSpikyDomain = str3;
        this.region = str4;
        this.proxyDomain = str5;
        this.spikyProxyDomain = str6;
        this.customHandshakeDomain = str7;
        this.logger = logger;
        this.logTag = str11;
        this.defaultHeaders = MapsKt.mapOf(TuplesKt.m88129a("Content-Type", "application/json; charset=utf-8"), TuplesKt.m88129a("X-CleverTap-Account-ID", str8), TuplesKt.m88129a("X-CleverTap-Token", str9));
        this.defaultQueryParams = MapsKt.mapOf(TuplesKt.m88129a("os", "Android"), TuplesKt.m88129a(Constants.KEY_T, str10), TuplesKt.m88129a(BaseSei.f14626Z, str8));
        this.encryptionHeader = TuplesKt.m88129a("X-CleverTap-Encryption-Enabled", "true");
        this.spikyRegionSuffix = "-spiky";
    }

    /* JADX INFO: renamed from: a */
    private final Uri.Builder m217689a(Uri.Builder builder) {
        for (Map.Entry<String, String> entry : this.defaultQueryParams.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builder;
    }

    /* JADX INFO: renamed from: b */
    private final Uri.Builder m217690b(Uri.Builder builder) {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        this.currentRequestTimestampSeconds = iCurrentTimeMillis;
        Uri.Builder builderAppendQueryParameter = builder.appendQueryParameter(com.tencent.connect.common.Constants.f58037TS, String.valueOf(iCurrentTimeMillis));
        builderAppendQueryParameter.getClass();
        return builderAppendQueryParameter;
    }

    /* JADX INFO: renamed from: c */
    private final w1d0 m217691c(String baseUrl, String relativeUrl, String body, boolean includeTs, Map<String, String> headers) {
        return new w1d0(m217693j(baseUrl, relativeUrl, includeTs), headers, body);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ w1d0 m217692d(yxb yxbVar, String str, String str2, String str3, boolean z, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            map = yxbVar.defaultHeaders;
        }
        return yxbVar.m217691c(str, str2, str3, z2, map);
    }

    /* JADX INFO: renamed from: j */
    private final Uri m217693j(String baseUrl, String relativeUrl, boolean includeTs) {
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
        m217689a(builderAuthority);
        if (includeTs) {
            m217690b(builderAuthority);
        }
        Uri uriBuild = builderAuthority.build();
        uriBuild.getClass();
        return uriBuild;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ j5d0 m217694r(yxb yxbVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return yxbVar.m217706q(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final j5d0 m217695e(@NotNull cpe0 body) {
        body.getClass();
        eyb eybVar = this.httpClient;
        String strM217697g = m217697g(false);
        if (strM217697g == null) {
            strM217697g = this.defaultDomain;
        }
        return eybVar.mo123192a(m217692d(this, strM217697g, "defineVars", body.toString(), false, null, 24, null));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final j5d0 m217696f(@NotNull String url) {
        url.getClass();
        w1d0 w1d0Var = new w1d0(Uri.parse(url), MapsKt.emptyMap(), null);
        this.logger.verbose(this.logTag, "Fetching content from URL");
        return this.httpClient.mo123192a(w1d0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m217697g(boolean isViewedEvent) {
        if (!kx3.m151795p(this.region)) {
            String str = isViewedEvent ? this.spikyProxyDomain : this.proxyDomain;
            if (kx3.m151795p(str)) {
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
    public final String m217699i(boolean isViewedEvent) {
        if (kx3.m151795p(this.region)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.region);
            sb.append(isViewedEvent ? this.spikyRegionSuffix : "");
            sb.append(".");
            sb.append(this.defaultDomain);
            return sb.toString();
        }
        String str = isViewedEvent ? this.spikyProxyDomain : this.proxyDomain;
        if (kx3.m151795p(str)) {
            return str;
        }
        if (!kx3.m151795p(this.customHandshakeDomain)) {
            String str2 = isViewedEvent ? this.cachedSpikyDomain : this.cachedDomain;
            return kx3.m151795p(str2) ? str2 : this.defaultDomain;
        }
        String str3 = this.customHandshakeDomain;
        str3.getClass();
        return str3;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m217700k(boolean isViewedEvent) {
        if (kx3.m151795p(this.region)) {
            return false;
        }
        if (kx3.m151795p(isViewedEvent ? this.spikyProxyDomain : this.proxyDomain)) {
            return false;
        }
        String str = isViewedEvent ? this.cachedSpikyDomain : this.cachedDomain;
        return str == null || StringsKt.m94329e0(str);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final j5d0 m217701l(boolean isViewedEvent) {
        Map<String, String> mapPlus;
        String strM217699i = m217699i(isViewedEvent);
        if (kx3.m151795p(this.customHandshakeDomain) && Intrinsics.m88377d(strM217699i, this.customHandshakeDomain)) {
            Map<String, String> map = this.defaultHeaders;
            String str = this.customHandshakeDomain;
            str.getClass();
            mapPlus = MapsKt.plus(map, TuplesKt.m88129a("X-CleverTap-Handshake-Domain", str));
        } else {
            mapPlus = this.defaultHeaders;
        }
        w1d0 w1d0VarM217691c = m217691c(strM217699i, "hello", null, false, mapPlus);
        this.logger.verbose(this.logTag, "Performing handshake with " + w1d0VarM217691c.getUrl());
        return this.httpClient.mo123192a(w1d0VarM217691c);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final j5d0 m217702m(@NotNull x16 body) {
        body.getClass();
        eyb eybVar = this.httpClient;
        String strM217697g = m217697g(false);
        if (strM217697g == null) {
            strM217697g = this.defaultDomain;
        }
        return eybVar.mo123192a(m217692d(this, strM217697g, "content", body.toString(), false, null, 24, null));
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final j5d0 m217703n(@NotNull String body) {
        body.getClass();
        eyb eybVar = this.httpClient;
        String strM217697g = m217697g(true);
        if (strM217697g == null) {
            strM217697g = this.defaultDomain;
        }
        return eybVar.mo123192a(m217692d(this, strM217697g, "a1", body, false, this.defaultHeaders, 8, null));
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final j5d0 m217704o(@NotNull String body) {
        body.getClass();
        eyb eybVar = this.httpClient;
        String strM217697g = m217697g(false);
        if (strM217697g == null) {
            strM217697g = this.defaultDomain;
        }
        return eybVar.mo123192a(m217692d(this, strM217697g, "inbox/v2/deleteMessages", body, false, this.defaultHeaders, 8, null));
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final j5d0 m217705p(@NotNull String body) {
        body.getClass();
        eyb eybVar = this.httpClient;
        String strM217697g = m217697g(false);
        if (strM217697g == null) {
            strM217697g = this.defaultDomain;
        }
        return eybVar.mo123192a(m217692d(this, strM217697g, "inbox/v2/getMessages", body, false, this.defaultHeaders, 8, null));
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final j5d0 m217706q(@NotNull String body, boolean isEncrypted) {
        body.getClass();
        eyb eybVar = this.httpClient;
        String strM217697g = m217697g(false);
        if (strM217697g == null) {
            strM217697g = this.defaultDomain;
        }
        String str = strM217697g;
        Map<String, String> mapPlus = this.defaultHeaders;
        if (isEncrypted) {
            mapPlus = MapsKt.plus(mapPlus, this.encryptionHeader);
        }
        return eybVar.mo123192a(m217692d(this, str, "a1", body, false, mapPlus, 8, null));
    }

    /* JADX INFO: renamed from: s */
    public final void m217707s(@Nullable String str) {
        this.cachedDomain = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m217708t(@Nullable String str) {
        this.cachedSpikyDomain = str;
    }
}
