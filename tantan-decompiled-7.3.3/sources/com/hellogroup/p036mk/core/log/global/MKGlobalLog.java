package com.hellogroup.p036mk.core.log.global;

import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.hellogroup.fep.base.FepContext;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.hellogroup.p036mk.core.log.core.MKLogSource;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.random.Random;
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.eclipse.jetty.util.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bfe0;
import p153l.d8g0;
import p153l.jvl;
import p153l.rs8;
import p153l.sjw;
import p153l.wo2;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0010\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\u0006\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00142\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001d¢\u0006\u0004\b\u0006\u0010 JC\u0010\"\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001d¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b$\u0010\u0011J+\u0010%\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b%\u0010\u0011J5\u0010(\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b(\u0010)JK\u0010.\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072(\b\u0002\u0010-\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010+j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u0001`,¢\u0006\u0004\b.\u0010/J+\u00103\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u00100\u001a\u0004\u0018\u00010\u00072\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J5\u00107\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u00105\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b7\u0010)J!\u00109\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u00108\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b9\u0010:JI\u0010@\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010;\u001a\u0004\u0018\u00010\u00072\b\u0010<\u001a\u0004\u0018\u00010\u001e2\b\u0010=\u001a\u0004\u0018\u00010\u001e2\b\u0010>\u001a\u0004\u0018\u00010\u001e2\b\u0010?\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b@\u0010AJ!\u0010C\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010B\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bC\u0010:J5\u0010G\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010F\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bG\u0010HJ+\u0010K\u001a\u00020\r2\b\u0010I\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010J\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bK\u0010\u0011J!\u0010N\u001a\u00020\r2\b\u0010L\u001a\u0004\u0018\u00010\u00072\b\u0010M\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bN\u0010OJ!\u0010P\u001a\u00020\r2\b\u0010L\u001a\u0004\u0018\u00010\u00072\b\u0010M\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bP\u0010OJI\u0010S\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010L\u001a\u0004\u0018\u00010\u00072\b\u0010M\u001a\u0004\u0018\u00010\u00072\b\u0010Q\u001a\u0004\u0018\u00010\u00072\b\u0010R\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bS\u0010TJ)\u0010U\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u00102\u001a\u000201¢\u0006\u0004\bU\u00104R\u001b\u0010Z\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001b\u0010]\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b\\\u0010YR\u001b\u0010`\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010W\u001a\u0004\b_\u0010Y¨\u0006a"}, m88121d2 = {"Lcom/hellogroup/mk/core/log/global/MKGlobalLog;", "Ll/wo2;", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "errorUrl", "Ljava/net/URI;", "uri", "url", "originUrl", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/Exception;Ljava/lang/String;Ljava/net/URI;Ljava/lang/String;Ljava/lang/String;)V", Constants.KEY_T, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "firstEnterUrl", "useDnsUrl", "", "isFromWebCache", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "errMsg", "B", "(Ljava/lang/String;)V", "bid", "isBatch", "", "", "extraInfo", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "repData", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "u", ResourceDirection.f39656v, "from", "msg", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "action", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "extraData", "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "finalLocation", "Ll/jvl;", "response", "q", "(Ljava/lang/String;Ljava/lang/String;Ll/jvl;)V", "originURL", BaseSei.INFO, RXScreenCaptureService.KEY_INDEX, "isForeground", BaseSei.f14626Z, "(Ljava/lang/String;Ljava/lang/Boolean;)V", "startUrl", "retryTime", "isTryRecycleWeb", "isTryDeleteWeb", "isReloadRightNow", BaseSei.f14625Y, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "fromAsset", "m", "", "priority", DownloadService.KEY_FOREGROUND, BaseSei.f14624X, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", RemoteConfigConstants.RequestFieldKey.APP_ID, "source", "h", "namespace", FirebaseAnalytics.Param.METHOD, "A", "(Ljava/lang/String;Ljava/lang/String;)V", "f", CommandMessage.PARAMS, LovePlanetStage.result, "w", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "n", "b", "Lkotlin/Lazy;", "k", "()Z", "isCleanWebviewLoadThirdUrlLogOpen", "c", BLiveStormDanmakuGiftResourceType.f45292l, "isLoadThirdUrlLogOpen", Constants.INAPP_DATA_TAG, "j", "isAndroid302LogOpen", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MKGlobalLog extends wo2 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy isCleanWebviewLoadThirdUrlLogOpen = LazyKt__LazyJVMKt.m88118b(new Function0<Boolean>() { // from class: com.hellogroup.mk.core.log.global.MKGlobalLog$isCleanWebviewLoadThirdUrlLogOpen$2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            int iM182918i = rs8.m182918i();
            return iM182918i > 0 && C15274a.m88495k(new IntRange(0, 100), Random.INSTANCE) <= iM182918i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy isLoadThirdUrlLogOpen = LazyKt__LazyJVMKt.m88118b(new Function0<Boolean>() { // from class: com.hellogroup.mk.core.log.global.MKGlobalLog$isLoadThirdUrlLogOpen$2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            int iM182920k = rs8.m182920k();
            return iM182920k > 0 && C15274a.m88495k(new IntRange(0, 100), Random.INSTANCE) <= iM182920k;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy isAndroid302LogOpen = LazyKt__LazyJVMKt.m88118b(new Function0<Boolean>() { // from class: com.hellogroup.mk.core.log.global.MKGlobalLog$isAndroid302LogOpen$2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            int iM182915f = rs8.m182915f();
            return iM182915f > 0 && C15274a.m88495k(new IntRange(0, 100), Random.INSTANCE) <= iM182915f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }
    });

    /* JADX INFO: renamed from: j */
    private final boolean m18440j() {
        return ((Boolean) this.isAndroid302LogOpen.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    private final boolean m18441k() {
        return ((Boolean) this.isCleanWebviewLoadThirdUrlLogOpen.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    private final boolean m18442l() {
        return ((Boolean) this.isLoadThirdUrlLogOpen.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: A */
    public final void m18443A(@Nullable String namespace, @Nullable String method) {
        wo2.m207246c(this, MKGlobalErrorType.REPORT_BRIDGE_LIST, MKLogSource.NATIVE, null, null, MapsKt.hashMapOf(TuplesKt.m88129a("namespace", namespace), TuplesKt.m88129a(FirebaseAnalytics.Param.METHOD, method)), "reportBridgeList", null, null, null, 448, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m18444B(@Nullable String errMsg) {
        if (rs8.m182921l()) {
            wo2.m207246c(this, MKGlobalErrorType.WEB_CONFIG_FAIL, MKLogSource.NATIVE, null, null, MapsKt.hashMapOf(TuplesKt.m88129a("category", sjw.m186315d()), TuplesKt.m88129a("errorMsg", d8g0.m114836a(errMsg))), "0", null, null, FepLogModuleType.config.name(), 192, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18445e(@Nullable String bid, @Nullable String errMsg, boolean isBatch, @Nullable Map<String, ? extends Object> extraInfo) {
        if (rs8.m182921l()) {
            HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m88129a("category", sjw.m186315d()), TuplesKt.m88129a("action", String.valueOf(isBatch)), TuplesKt.m88129a("errorMsg", errMsg != null ? d8g0.m114836a(errMsg) : null));
            wo2.m207246c(this, MKGlobalErrorType.CHECK_UPDATE_FAIL, MKLogSource.NATIVE, bid, null, mapHashMapOf, bid != null ? bid : "0", null, extraInfo != null ? extraInfo : MapsKt.emptyMap(), FepLogModuleType.offlinepkg.name(), 64, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18446f(@Nullable String namespace, @Nullable String method) {
        wo2.m207246c(this, MKGlobalErrorType.DISCARD_BRIDGE_LIST, MKLogSource.NATIVE, null, null, MapsKt.hashMapOf(TuplesKt.m88129a("namespace", namespace), TuplesKt.m88129a(FirebaseAnalytics.Param.METHOD, method)), "discardBridgeList", null, null, null, 448, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX INFO: renamed from: g */
    public final void m18447g(@Nullable String from, @Nullable String url, @Nullable String bid, @Nullable String msg) {
        String str;
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m88129a("from", from), TuplesKt.m88129a("url", url), TuplesKt.m88129a("id", bid), TuplesKt.m88129a("msg", msg));
        MKGlobalErrorType mKGlobalErrorType = MKGlobalErrorType.FEP_MONITOR;
        MKLogSource mKLogSource = MKLogSource.NATIVE;
        if (bid == null) {
            str = "0";
        } else {
            str = !StringsKt.m94329e0(bid) ? bid : null;
            if (str == null) {
                str = "0";
            }
        }
        wo2.m207246c(this, mKGlobalErrorType, mKLogSource, bid, url, mapHashMapOf, str, null, null, null, 448, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m18448h(@Nullable String appId, @Nullable String url, @Nullable String source) {
        wo2.m207246c(this, MKGlobalErrorType.HTTP_DNS, MKLogSource.NATIVE, null, url, MapsKt.hashMapOf(TuplesKt.m88129a("url", url), TuplesKt.m88129a(BaseSei.INFO, source)), "HttpDNS", appId, null, null, 384, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m18449i(@Nullable String bid, @Nullable String originURL, @Nullable String info, @Nullable String msg) {
        wo2.m207246c(this, MKGlobalErrorType.INTERCEPT_FILE_ERROR, MKLogSource.NATIVE, bid, originURL, MapsKt.hashMapOf(TuplesKt.m88129a("url", originURL), TuplesKt.m88129a(BaseSei.INFO, info), TuplesKt.m88129a("msg", msg)), bid, null, null, null, 448, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m18450m(@Nullable String url, @Nullable Boolean fromAsset) {
        wo2.m207246c(this, MKGlobalErrorType.LOAD_FILE, MKLogSource.NATIVE, null, url, MapsKt.hashMapOf(TuplesKt.m88129a("from_asset", fromAsset)), "loadFile", null, null, null, 448, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m18451n(@Nullable String originUrl, @Nullable String url, @NotNull jvl response) {
        response.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (StringsKt.m94303P(d8g0.m114836a(url), StringUtil.ALL_INTERFACES, false, 2, null)) {
                MKCoreLogManager.m18427e().m18454q(originUrl, url, response);
            }
            Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        try {
            if (m18440j()) {
                wo2.m207246c(this, MKGlobalErrorType.ERROR_3O2, MKLogSource.NATIVE, "0", url, MapsKt.hashMapOf(TuplesKt.m88129a("url", d8g0.m114836a(originUrl)), TuplesKt.m88129a("category", sjw.m186315d())), "0", null, MapsKt.hashMapOf(TuplesKt.m88129a("entry_absurl", d8g0.m114836a(originUrl != null ? StringsKt.m94316V0(originUrl, "?", null, 2, null) : null)), TuplesKt.m88129a("location_url", d8g0.m114836a(url)), TuplesKt.m88129a("location_absurl", d8g0.m114836a(url != null ? StringsKt.m94316V0(url, "?", null, 2, null) : null))), null, 320, null);
            }
            Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th2));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m18452o(@Nullable String action, @Nullable String url, @Nullable HashMap<String, Object> extraData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (action != null && !StringsKt.m94329e0(action)) {
            linkedHashMap.put("action", action);
        }
        if (url != null && !StringsKt.m94329e0(url)) {
            linkedHashMap.put("url", url);
        }
        if (extraData != null && !extraData.isEmpty()) {
            linkedHashMap.putAll(extraData);
        }
        wo2.m207246c(this, MKGlobalErrorType.DNS_LOG_FEP, MKLogSource.NATIVE, null, url, linkedHashMap, "dns_log_fep", url, null, null, 384, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m18453p(@Nullable String firstEnterUrl, @Nullable String url, @Nullable String useDnsUrl, @Nullable Boolean isFromWebCache) {
        xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new MKGlobalLog$logLoadRealUrl$1(this, useDnsUrl, url, firstEnterUrl, isFromWebCache, null), 3, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m18454q(@Nullable String url, @Nullable String finalLocation, @Nullable jvl response) {
        List<String> headerNames;
        String string = (response == null || (headerNames = response.getHeaderNames()) == null) ? null : headerNames.toString();
        Integer numValueOf = response != null ? Integer.valueOf(response.getSimpleCode()) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action", "WebDNSHandler");
        if (url != null && !StringsKt.m94329e0(url)) {
            linkedHashMap.put("category", url);
        }
        if (finalLocation != null && !StringsKt.m94329e0(finalLocation)) {
            linkedHashMap.put("content", finalLocation);
        }
        if (string != null && !StringsKt.m94329e0(string)) {
            linkedHashMap.put("msg", string);
        }
        if (numValueOf != null) {
            linkedHashMap.put("errorCode", numValueOf);
        }
        wo2.m207246c(this, MKGlobalErrorType.LOCATION_ERROR, MKLogSource.NATIVE, null, url, linkedHashMap, "dns_log_fep", "", null, null, 384, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m18455r(@Nullable String bid, @Nullable String repData, @Nullable String errMsg, @Nullable Map<String, ? extends Object> extraInfo) {
        if (rs8.m182921l()) {
            HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m88129a("category", sjw.m186315d()), TuplesKt.m88129a("action", repData), TuplesKt.m88129a("errorMsg", errMsg));
            wo2.m207246c(this, MKGlobalErrorType.OFFLINE_DOWNLOAD_FAIL, MKLogSource.NATIVE, bid, "", mapHashMapOf, bid, null, extraInfo != null ? extraInfo : MapsKt.emptyMap(), FepLogModuleType.offlinepkg.name(), 64, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m18456s(@Nullable Exception e, @Nullable String errorUrl, @Nullable URI uri, @Nullable String url, @Nullable String originUrl) {
        if (rs8.m182911b()) {
            return;
        }
        xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new MKGlobalLog$logSSLError$1(this, uri, errorUrl, e, originUrl, url, null), 3, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m18457t(@Nullable String errorUrl, @Nullable String url, @Nullable String originUrl) {
        if (rs8.m182911b()) {
            return;
        }
        wo2.m207246c(this, MKGlobalErrorType.SSL_ERROR_HANDLE_CANCEL, MKLogSource.NATIVE, null, url, MapsKt.hashMapOf(TuplesKt.m88129a("action", "successThenCancel"), TuplesKt.m88129a("errorMsg", errorUrl), TuplesKt.m88129a("url", originUrl)), "dns_log_fep", url, null, null, 384, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m18458u(@Nullable String originUrl, @Nullable String url, @Nullable String bid) {
        if (m18442l() && bfe0.m103888c(url)) {
            wo2.m207246c(this, MKGlobalErrorType.LOAD_THIRD_PAGE, MKLogSource.NATIVE, bid, url, MapsKt.hashMapOf(TuplesKt.m88129a("url", url), TuplesKt.m88129a("category", sjw.m186315d())), bid != null ? bid : "0", null, MapsKt.hashMapOf(TuplesKt.m88129a("entry_absurl", d8g0.m114836a(originUrl != null ? StringsKt.m94316V0(originUrl, "?", null, 2, null) : null)), TuplesKt.m88129a("location_url", d8g0.m114836a(url)), TuplesKt.m88129a("location_absurl", d8g0.m114836a(url != null ? StringsKt.m94316V0(url, "?", null, 2, null) : null))), null, 320, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m18459v(@Nullable String originUrl, @Nullable String url, @Nullable String bid) {
        if (m18441k() && bfe0.m103888c(url)) {
            wo2.m207246c(this, MKGlobalErrorType.THIRD_PARTY_LOAD_ON_NATIVE, MKLogSource.NATIVE, bid, url, MapsKt.hashMapOf(TuplesKt.m88129a("url", originUrl), TuplesKt.m88129a("category", sjw.m186315d())), bid != null ? bid : "0", null, MapsKt.hashMapOf(TuplesKt.m88129a("entry_absurl", d8g0.m114836a(originUrl != null ? StringsKt.m94316V0(originUrl, "?", null, 2, null) : null)), TuplesKt.m88129a("location_url", d8g0.m114836a(url)), TuplesKt.m88129a("location_absurl", d8g0.m114836a(url != null ? StringsKt.m94316V0(url, "?", null, 2, null) : null))), null, 320, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m18460w(@Nullable String bid, @Nullable String url, @Nullable String namespace, @Nullable String method, @Nullable String params, @Nullable String result) {
        wo2.m207246c(this, MKGlobalErrorType.MK_BRIDGE_INVOKE, MKLogSource.NATIVE, bid, url, MapsKt.hashMapOf(TuplesKt.m88129a("url", url), TuplesKt.m88129a("namespace", namespace), TuplesKt.m88129a(FirebaseAnalytics.Param.METHOD, method), TuplesKt.m88129a(CommandMessage.PARAMS, params), TuplesKt.m88129a(LovePlanetStage.result, result)), "mk_bridge_invoke", bid, null, null, 384, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m18461x(@Nullable String firstEnterUrl, @Nullable String bid, @Nullable Integer priority, @Nullable Boolean foreground) {
        wo2.m207246c(this, MKGlobalErrorType.MK_RENDER_CRASH, MKLogSource.NATIVE, bid, firstEnterUrl, MapsKt.hashMapOf(TuplesKt.m88129a("url", firstEnterUrl), TuplesKt.m88129a("id", bid), TuplesKt.m88129a("priority", priority), TuplesKt.m88129a(DownloadService.KEY_FOREGROUND, foreground)), "mkRenderCrash", null, null, null, 448, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m18462y(@Nullable String bid, @Nullable String startUrl, @Nullable Object retryTime, @Nullable Object isTryRecycleWeb, @Nullable Object isTryDeleteWeb, @Nullable Object isReloadRightNow) {
        wo2.m207246c(this, MKGlobalErrorType.RECYCLE_RELOAD, MKLogSource.NATIVE, bid, startUrl, MapsKt.hashMapOf(TuplesKt.m88129a("startUrl", startUrl), TuplesKt.m88129a("retryTime", retryTime), TuplesKt.m88129a("isTryRecycleWeb", isTryRecycleWeb), TuplesKt.m88129a("isTryDeleteWeb", isTryDeleteWeb), TuplesKt.m88129a("isReloadRightNow", isReloadRightNow)), bid, null, null, null, 448, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m18463z(@Nullable String bid, @Nullable Boolean isForeground) {
        wo2.m207246c(this, MKGlobalErrorType.RECYCLE_RELOAD_CACHE, MKLogSource.NATIVE, bid, null, MapsKt.hashMapOf(TuplesKt.m88129a("is_foreground", isForeground)), bid, null, null, null, 448, null);
    }
}
