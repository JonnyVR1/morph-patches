package p153l;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.configcontrol.FepConfigControlHelper;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\tJ\u000f\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\fJ\u000f\u0010\u001c\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b)\u0010(J#\u0010,\u001a\u00020+2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010*\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0007H\u0007¢\u0006\u0004\b.\u0010\tJ\u000f\u0010/\u001a\u00020\u0007H\u0007¢\u0006\u0004\b/\u0010\tJ\u000f\u00100\u001a\u00020\u0007H\u0007¢\u0006\u0004\b0\u0010\tJ\u000f\u00101\u001a\u00020\u0007H\u0007¢\u0006\u0004\b1\u0010\tJ\u000f\u00102\u001a\u00020\nH\u0007¢\u0006\u0004\b2\u0010\fJ\u000f\u00103\u001a\u00020\nH\u0007¢\u0006\u0004\b3\u0010\f¨\u00064"}, m88121d2 = {"Ll/yfi;", "", "<init>", "()V", "Lcom/hellogroup/fep/base/core/FepManager;", "u", "()Lcom/hellogroup/fep/base/core/FepManager;", "", "r", "()I", "", "n", "()Z", "", "m", "()Ljava/lang/String;", "f", "j", "", "k", "()J", BaseSei.f14626Z, "A", "B", ResourceDirection.f39656v, BaseSei.f14624X, "w", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f45292l, "o", "p", "Ll/yfi$a;", BaseSei.f14625Y, "()Ll/yfi$a;", "bid", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;)Z", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", Constants.INAPP_DATA_TAG, "(Lcom/hellogroup/mk/business/base/ui/MKWebView;Ljava/lang/String;)Z", "c", "url", "", "e", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;Ljava/lang/String;)V", "h", RXScreenCaptureService.KEY_INDEX, "g", "q", "a", "b", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class yfi {
    public static final yfi INSTANCE = new yfi();

    /* JADX INFO: renamed from: l.yfi$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001a"}, m88121d2 = {"Ll/yfi$a;", "", "", "", "bidWhiteList", "mkPageLoadStartInject", "mkPageLoadFinishInject", "mkOpenThirdPartUrlInjection", "<init>", "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "c", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final /* data */ class C21569a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Set<String> bidWhiteList;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final String mkPageLoadStartInject;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final String mkPageLoadFinishInject;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final String mkOpenThirdPartUrlInjection;

        public C21569a(@NotNull Set<String> set, @Nullable String str, @Nullable String str2, @NotNull String str3) {
            set.getClass();
            str3.getClass();
            this.bidWhiteList = set;
            this.mkPageLoadStartInject = str;
            this.mkPageLoadFinishInject = str2;
            this.mkOpenThirdPartUrlInjection = str3;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<String> m215611a() {
            return this.bidWhiteList;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMkOpenThirdPartUrlInjection() {
            return this.mkOpenThirdPartUrlInjection;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMkPageLoadFinishInject() {
            return this.mkPageLoadFinishInject;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMkPageLoadStartInject() {
            return this.mkPageLoadStartInject;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C21569a)) {
                return false;
            }
            C21569a c21569a = (C21569a) other;
            return Intrinsics.m88377d(this.bidWhiteList, c21569a.bidWhiteList) && Intrinsics.m88377d(this.mkPageLoadStartInject, c21569a.mkPageLoadStartInject) && Intrinsics.m88377d(this.mkPageLoadFinishInject, c21569a.mkPageLoadFinishInject) && Intrinsics.m88377d(this.mkOpenThirdPartUrlInjection, c21569a.mkOpenThirdPartUrlInjection);
        }

        public int hashCode() {
            Set<String> set = this.bidWhiteList;
            int iHashCode = (set != null ? set.hashCode() : 0) * 31;
            String str = this.mkPageLoadStartInject;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.mkPageLoadFinishInject;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.mkOpenThirdPartUrlInjection;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "InjectedScriptConfig(bidWhiteList=" + this.bidWhiteList + ", mkPageLoadStartInject=" + this.mkPageLoadStartInject + ", mkPageLoadFinishInject=" + this.mkPageLoadFinishInject + ", mkOpenThirdPartUrlInjection=" + this.mkOpenThirdPartUrlInjection + ")";
        }
    }

    private yfi() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: A */
    public static final int m215583A() {
        return kt0.m151314b(INSTANCE.m215605u().m17589j("mkScreenShotCacheCount", 50), 50);
    }

    @JvmStatic
    /* JADX INFO: renamed from: B */
    public static final int m215584B() {
        return kt0.m151314b(INSTANCE.m215605u().m17589j("mkScreenShotCacheSize", 500), 500);
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m215585a() {
        if (m215586b()) {
            return kt0.m151313a(INSTANCE.m215605u().m17589j("mkAllowFileAccess", 0), false);
        }
        return true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m215586b() {
        return kt0.m151313a(INSTANCE.m215605u().m17589j("mkAllowSafeChecker", 1), true);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m215587c(@Nullable MKWebView mkWebView, @Nullable String bid) {
        String mkPageLoadFinishInject;
        if (mkWebView == null) {
            return false;
        }
        try {
            if (m215603s(bid) && (mkPageLoadFinishInject = INSTANCE.m215609y().getMkPageLoadFinishInject()) != null && !StringsKt.m94329e0(mkPageLoadFinishInject)) {
                mkWebView.loadUrl(mkPageLoadFinishInject);
                return true;
            }
            return false;
        } catch (Throwable th) {
            jzv.m147730c("FepPublishManager", "checkMkPageLoadFinishInject", th);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m215588d(@Nullable MKWebView mkWebView, @Nullable String bid) {
        String mkPageLoadStartInject;
        if (mkWebView == null) {
            return false;
        }
        try {
            if (m215603s(bid) && (mkPageLoadStartInject = INSTANCE.m215609y().getMkPageLoadStartInject()) != null && !StringsKt.m94329e0(mkPageLoadStartInject)) {
                mkWebView.loadUrl(mkPageLoadStartInject);
                return true;
            }
            return false;
        } catch (Throwable th) {
            jzv.m147730c("FepPublishManager", "checkMkPageLoadStartInject", th);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m215589e(@Nullable MKWebView mkWebView, @Nullable String url) {
        if (mkWebView == null || url == null) {
            return;
        }
        try {
            if (bfe0.m103888c(url)) {
                C21569a c21569aM215609y = INSTANCE.m215609y();
                if (StringsKt.m94329e0(c21569aM215609y.getMkOpenThirdPartUrlInjection())) {
                    return;
                }
                mkWebView.loadUrl("javascript:" + c21569aM215609y.getMkOpenThirdPartUrlInjection());
            }
        } catch (Throwable th) {
            jzv.m147730c("FepPublishManager", "checkThirdPartUrlWarningInject", th);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m215590f() {
        Object objM17589j = INSTANCE.m215605u().m17589j("boost", null);
        if (!(objM17589j instanceof Map)) {
            objM17589j = null;
        }
        Map map = (Map) objM17589j;
        return kt0.m151313a(map != null ? map.get("enable") : null, false);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final int m215591g() {
        return kt0.m151314b(INSTANCE.m215605u().m17589j("mkAndroidDisableCheckUrlOnNewCleanWebviewPercentage", 0), 0);
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final int m215592h() {
        return kt0.m151314b(INSTANCE.m215605u().m17589j("mkAndroidDisableJsLocationReplacePercentage", 0), 0);
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final int m215593i() {
        return kt0.m151314b(INSTANCE.m215605u().m17589j("mkAndroidUseNewCleanWebviewPercentage", 0), 0);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m215594j() {
        Object objM17589j = INSTANCE.m215605u().m17589j("boost", null);
        if (!(objM17589j instanceof Map)) {
            objM17589j = null;
        }
        Map map = (Map) objM17589j;
        return kt0.m151317e(map != null ? map.get("bid") : null, "0");
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final long m215595k() {
        Object objM17589j = INSTANCE.m215605u().m17589j("boost", null);
        if (!(objM17589j instanceof Map)) {
            objM17589j = null;
        }
        Map map = (Map) objM17589j;
        return kt0.m151316d(map != null ? map.get(WBConstants.AUTH_PARAMS_VERSION) : null, 0L);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m215596l() {
        return FepConfigControlHelper.m18024e(kt0.m151317e(INSTANCE.m215605u().m17589j("mkDnsDefaultWhiteHosts", null), ""), "\n[\n  \"+.momocdn.com\",\n  \"+.modd.vip\",\n  \"+.soulchil.live\",\n  \"+.soulchill.live\",\n  \"+.hellogroup.com\",\n  \"+.zhiqiuapp.com\",\n  \"+.soulchillcdn.com\",\n  \"+.ihani.tv\",\n  \"+.heybud.world\",\n  \"+.igamesofficial.com\",\n  \"+.meetlovapp.com\",\n  \"+.korvor.com\",\n  \"+.zao-ai-tech.com\",\n  \"+.zao-ai-deep.com\",\n  \"+.zao-ai-factory.com\",\n  \"+.zao-ai-lab.com\",\n  \"+.deepzao.com\",\n  \"+.zao-ai-industry.com\",\n  \"+.iwoniuapp.com\",\n  \"+.uchikare.com\",\n  \"+.mokatech.cn\",\n  \"+.doki.ren\",\n  \"+.theamarapp.com\",\n  \"+.bjwmpp.com\",\n  \"+.hellogroupcdn.com\",\n  \"+.hertownapp.com\",\n  \"+.yaahlan.fun\",\n  \"+.picwell.art\",\n  \"+.momopictures.cn\",\n  \"+.momoapk.com\",\n  \"+.spacecape.com\",\n  \"+.imkaka.com\",\n  \"+.wemomo.com\",\n  \"+.hellogroupjapan.com\",\n  \"+.immomo.com\",\n  \"+.hertownapp.cn\",\n  \"+.immomogame.com\",\n  \"+.outbase.cn\",\n  \"+.hellosrc.xyz\",\n  \"+.inspaze.cn\"\n]\n    ");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m215597m() {
        Object objM17589j = INSTANCE.m215605u().m17589j("boost", null);
        if (!(objM17589j instanceof Map)) {
            objM17589j = null;
        }
        Map map = (Map) objM17589j;
        return kt0.m151317e(map != null ? map.get("url") : null, "");
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final boolean m215598n() {
        return kt0.m151313a(INSTANCE.m215605u().m17589j("mkReusePoolPlaceholderEnable", 0), false);
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m215599o() {
        return kt0.m151313a(INSTANCE.m215605u().m17589j("MKUIEnhanceEnable", 0), false);
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final int m215600p() {
        return kt0.m151314b(INSTANCE.m215605u().m17589j("MKUIEnhanceWaitTime", 5), 5);
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final int m215601q() {
        return kt0.m151314b(INSTANCE.m215605u().m17589j("mkUseDnsDefaultWhiteHostsPercentage", 0), 0);
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final int m215602r() {
        return kt0.m151314b(INSTANCE.m215605u().m17589j("mkReusePoolMaxSize", 0), 0);
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final synchronized boolean m215603s(@Nullable String bid) {
        boolean z = false;
        if (i8g0.m139000b(bid)) {
            return false;
        }
        C21569a c21569aM215609y = INSTANCE.m215609y();
        if (!c21569aM215609y.m215611a().isEmpty() && CollectionsKt.contains(c21569aM215609y.m215611a(), bid)) {
            z = true;
        }
        return z;
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final boolean m215604t() {
        return kt0.m151313a(INSTANCE.m215605u().m17589j("mkNeedCheckLatestUrlSafeAndroidSwitch", 1), true);
    }

    /* JADX INFO: renamed from: u */
    private final FepManager m215605u() {
        return FepManager.INSTANCE.m17610a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final int m215606v() {
        return kt0.m151314b(INSTANCE.m215605u().m17589j("mkWebPoolCacheTimeout", 30), 30);
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final boolean m215607w() {
        return kt0.m151313a(INSTANCE.m215605u().m17589j("mkUrlComplement", 0), false);
    }

    @JvmStatic
    /* JADX INFO: renamed from: x */
    public static final boolean m215608x() {
        return kt0.m151313a(INSTANCE.m215605u().m17589j("mkWhiteLogTracker", 0), false);
    }

    /* JADX INFO: renamed from: y */
    private final C21569a m215609y() {
        Set setEmptySet;
        String strM151317e = kt0.m151317e(m215605u().m17589j("mkInjectedScript", null), "");
        String strM151317e2 = kt0.m151317e(m215605u().m17589j("mkOpenThirdPartUrlInjection", ""), "");
        if (StringsKt.m94329e0(strM151317e)) {
            return new C21569a(SetsKt.emptySet(), null, null, strM151317e2);
        }
        try {
            JSONObject jSONObject = new JSONObject(strM151317e);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("bidWhiteList");
            if (jSONArrayOptJSONArray != null) {
                IntRange intRangeM88496l = C15274a.m88496l(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeM88496l, 10));
                Iterator<Integer> it = intRangeM88496l.iterator();
                while (it.hasNext()) {
                    arrayList.add(jSONArrayOptJSONArray.optString(((IntIterator) it).nextInt(), ""));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    String str = (String) obj;
                    str.getClass();
                    if (!StringsKt.m94329e0(str)) {
                        arrayList2.add(obj);
                    }
                }
                setEmptySet = CollectionsKt.toSet(arrayList2);
            } else {
                setEmptySet = SetsKt.emptySet();
            }
            String strOptString = jSONObject.optString("mkPageLoadStartInject");
            strOptString.getClass();
            if (StringsKt.m94329e0(strOptString)) {
                strOptString = null;
            }
            String strOptString2 = jSONObject.optString("mkPageLoadFinishInject");
            strOptString2.getClass();
            if (StringsKt.m94329e0(strOptString2)) {
                strOptString2 = null;
            }
            return new C21569a(setEmptySet, strOptString, strOptString2, strM151317e2);
        } catch (Throwable th) {
            jzv.m147730c("FepPublishManager", "parseInjectedScriptConfig", th);
            return new C21569a(SetsKt.emptySet(), null, null, strM151317e2);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: z */
    public static final boolean m215610z() {
        return kt0.m151313a(INSTANCE.m215605u().m17589j("mkScreenShotEnable", 0), false);
    }
}
