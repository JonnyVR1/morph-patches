package com.hellogroup.fep.config.core;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.FepContext;
import com.hellogroup.fep.config.internal.FepConfigContext;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.agi;
import p153l.bgi;
import p153l.kt0;
import p153l.lv0;
import p153l.pgi;
import p153l.r5e;
import p153l.uyp;
import p153l.wg3;
import p153l.wh3;
import p153l.wtq0;
import p153l.xfi;
import p153l.xh3;
import p153l.yi5;
import p153l.zfi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 :2\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J-\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b!\u0010 J\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010(R\u0014\u00105\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010(R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, m88121d2 = {"Lcom/hellogroup/fep/config/core/FepConfigManager;", "", "<init>", "()V", "", "isLocal", "Lcom/hellogroup/fep/config/model/FepConfigFetchType;", "type", "", "m", "(ZLcom/hellogroup/fep/config/model/FepConfigFetchType;)V", BLiveStormDanmakuGiftResourceType.f45294s, "q", "r", "g", "Landroid/content/Context;", "context", "debugMode", "Ll/xfi;", "configuration", "Ll/agi;", "networkProvider", "p", "(Landroid/content/Context;ZLl/xfi;Ll/agi;)V", Constants.KEY_T, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(Lcom/hellogroup/fep/config/model/FepConfigFetchType;)V", "", Constants.KEY_KEY, "defaultValue", "k", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", RXScreenCaptureService.KEY_INDEX, "Ll/bgi;", "observer", "o", "(Ll/bgi;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFetching", "Ljava/util/concurrent/atomic/AtomicLong;", "b", "Ljava/util/concurrent/atomic/AtomicLong;", "lastRequestTime", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastPullIntervalTime", Constants.INAPP_DATA_TAG, "lastPollEnable", "e", "isCacheDataLoaded", "Lkotlinx/coroutines/o;", "f", "Lkotlinx/coroutines/o;", "configCacheJob", "Companion", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepConfigManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    private static volatile FepConfigManager f11911g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicBoolean isFetching;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AtomicLong lastRequestTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AtomicInteger lastPullIntervalTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AtomicBoolean lastPollEnable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AtomicBoolean isCacheDataLoaded;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC15593o configCacheJob;

    private FepConfigManager() {
        this.isFetching = new AtomicBoolean(false);
        this.lastRequestTime = new AtomicLong(0L);
        this.lastPullIntervalTime = new AtomicInteger(0);
        this.lastPollEnable = new AtomicBoolean(false);
        this.isCacheDataLoaded = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: g */
    private final void m17619g() {
        FepConfigContext fepConfigContext = FepConfigContext.INSTANCE;
        if (fepConfigContext.m17642i().get()) {
            return;
        }
        pgi.m172234d(fepConfigContext.m17638e(), -1001, "Called before setup", null, null, 12, null);
        if (fepConfigContext.m17636c()) {
            wtq0.m207906a("FepConfigManager not setup, call setup() first");
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Object m17620j(FepConfigManager fepConfigManager, String str, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return fepConfigManager.m17628i(str, obj);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Object m17621l(FepConfigManager fepConfigManager, String str, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return fepConfigManager.m17629k(str, obj);
    }

    /* JADX INFO: renamed from: m */
    private final void m17622m(boolean isLocal, FepConfigFetchType type) {
        xh3.m210980d(FepContext.INSTANCE.m17573a(), r5e.m179862c(), null, new FepConfigManager$onFepConfigReady$1(this, isLocal, type, null), 2, null);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m17623n(FepConfigManager fepConfigManager, boolean z, FepConfigFetchType fepConfigFetchType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            fepConfigFetchType = FepConfigFetchType.MANUAL;
        }
        fepConfigManager.m17622m(z, fepConfigFetchType);
    }

    /* JADX INFO: renamed from: q */
    private final void m17624q() {
        m17625r();
        FepConfigContext fepConfigContext = FepConfigContext.INSTANCE;
        xfi xfiVarM17634a = fepConfigContext.m17634a();
        if (!xfiVarM17634a.getPollEnabled() || xfiVarM17634a.getPollInterval() <= 0) {
            return;
        }
        long jM210801d = ((long) (xfiVarM17634a.getPollInterval() * 60)) * 1000;
        FepContext.INSTANCE.m17575c().m17571b(jM210801d, jM210801d, new FepConfigManager$startPolling$1(this, null));
        pgi.m172235f(fepConfigContext.m17638e(), "Polling started, interval: " + xfiVarM17634a.getPollInterval() + 's', null, 0, 6, null);
    }

    /* JADX INFO: renamed from: r */
    private final void m17625r() {
        FepContext.INSTANCE.m17575c().m17570a();
        pgi.m172233b(FepConfigContext.INSTANCE.m17638e(), "Polling stopped", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m17626s() {
        FepConfigContext fepConfigContext = FepConfigContext.INSTANCE;
        xfi xfiVarM17634a = fepConfigContext.m17634a();
        zfi zfiVar = fepConfigContext.m17635b().get();
        Integer numM151323k = kt0.m151323k(zfiVar != null ? zfiVar.m219537b().get("fepWebConfigRequestInterval") : null);
        xfiVarM17634a.m210806i(numM151323k != null ? numM151323k.intValue() : xfiVarM17634a.getRequestInterval());
        xfiVarM17634a.m210804g(zfiVar != null ? Intrinsics.m88377d(zfiVar.m219537b().get("fepWebConfigEnable"), "1") : xfiVarM17634a.getPollEnabled());
        Integer numM151323k2 = kt0.m151323k(zfiVar != null ? zfiVar.m219537b().get("fepWebConfigPollTime") : null);
        xfiVarM17634a.m210805h(numM151323k2 != null ? numM151323k2.intValue() : xfiVarM17634a.getPollInterval());
        if (this.lastPollEnable.get() == xfiVarM17634a.getPollEnabled() && this.lastPullIntervalTime.get() == xfiVarM17634a.getPollInterval()) {
            return;
        }
        this.lastPollEnable.set(xfiVarM17634a.getPollEnabled());
        this.lastPullIntervalTime.set(xfiVarM17634a.getPollInterval());
        if (xfiVarM17634a.getPollEnabled()) {
            m17624q();
        } else {
            m17625r();
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: h */
    public final void m17627h(@NotNull FepConfigFetchType type) {
        type.getClass();
        m17619g();
        if (this.isFetching.get()) {
            pgi.m172239k(FepConfigContext.INSTANCE.m17638e(), "Already fetching config, skip", null, 0, null, 14, null);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (type != FepConfigFetchType.LAUNCH) {
            FepConfigContext fepConfigContext = FepConfigContext.INSTANCE;
            xfi xfiVarM17634a = fepConfigContext.m17634a();
            long j = jUptimeMillis - this.lastRequestTime.get();
            if (j < xfiVarM17634a.getRequestInterval() * HuiYanResultSender.TIMEOUT_MS) {
                pgi.m172233b(fepConfigContext.m17638e(), "Request throttled, elapsed: " + j + "ms, interval: " + xfiVarM17634a.getRequestInterval() + 's', null, 2, null);
                return;
            }
        }
        this.lastRequestTime.set(jUptimeMillis);
        this.isFetching.set(true);
        xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepConfigManager$fetchConfig$1(this, type, null), 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m17628i(@NotNull final String key, @Nullable final Object defaultValue) throws InterruptedException {
        Map<String, Object> mapM219540e;
        Object obj;
        key.getClass();
        m17619g();
        wh3.m206334b(null, new FepConfigManager$getGreyConfigData$1(this, null), 1, null);
        FepConfigContext fepConfigContext = FepConfigContext.INSTANCE;
        zfi zfiVar = fepConfigContext.m17635b().get();
        if (zfiVar != null && (mapM219540e = zfiVar.m219540e()) != null && (obj = mapM219540e.get(key)) != null) {
            defaultValue = obj;
        }
        fepConfigContext.m17640g().m191606b(new Function1<bgi, Unit>() { // from class: com.hellogroup.fep.config.core.FepConfigManager$getGreyConfigData$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull bgi bgiVar) {
                bgiVar.getClass();
                bgiVar.mo17603a("rules", key, defaultValue);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(bgi bgiVar) {
                invoke2(bgiVar);
                return Unit.INSTANCE;
            }
        }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.config.core.FepConfigManager$getGreyConfigData$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                invoke2(exc);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Exception exc) {
                exc.getClass();
            }
        });
        return defaultValue;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m17629k(@NotNull final String key, @Nullable final Object defaultValue) throws InterruptedException {
        key.getClass();
        m17619g();
        wh3.m206334b(null, new FepConfigManager$getMKConfigValue$1(this, null), 1, null);
        FepConfigContext fepConfigContext = FepConfigContext.INSTANCE;
        zfi zfiVar = fepConfigContext.m17635b().get();
        if (zfiVar != null) {
            Object obj = zfiVar.m219537b().get(key);
            if (obj != null) {
                defaultValue = obj;
            }
            fepConfigContext.m17640g().m191606b(new Function1<bgi, Unit>() { // from class: com.hellogroup.fep.config.core.FepConfigManager$getMKConfigValue$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull bgi bgiVar) {
                    bgiVar.getClass();
                    bgiVar.mo17603a("mk_config", key, defaultValue);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(bgi bgiVar) {
                    invoke2(bgiVar);
                    return Unit.INSTANCE;
                }
            }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.config.core.FepConfigManager$getMKConfigValue$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    invoke2(exc);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Exception exc) {
                    exc.getClass();
                }
            });
        }
        return defaultValue;
    }

    /* JADX INFO: renamed from: o */
    public final void m17630o(@NotNull bgi observer) {
        observer.getClass();
        FepConfigContext.INSTANCE.m17640g().m191605a(observer);
    }

    /* JADX INFO: renamed from: p */
    public final void m17631p(@NotNull Context context, boolean debugMode, @NotNull xfi configuration, @NotNull agi networkProvider) {
        context.getClass();
        configuration.getClass();
        networkProvider.getClass();
        lv0.m155975e(context.getApplicationContext());
        FepConfigContext fepConfigContext = FepConfigContext.INSTANCE;
        fepConfigContext.m17644k(debugMode);
        fepConfigContext.m17643j(configuration);
        fepConfigContext.m17645l(networkProvider);
        if (fepConfigContext.m17642i().get()) {
            pgi.m172239k(fepConfigContext.m17638e(), "Already setup, will ignore repeat setup", null, 0, null, 14, null);
            return;
        }
        yi5.Companion companion = yi5.INSTANCE;
        Context contextM155971a = lv0.m155971a();
        if (!(contextM155971a instanceof Application)) {
            contextM155971a = null;
        }
        companion.m216012b((Application) contextM155971a);
        if (!configuration.m210803f().getFirst().booleanValue()) {
            pgi.m172239k(fepConfigContext.m17638e(), "configuration is invalid, will ignore setup", null, 0, null, 14, null);
            if (fepConfigContext.m17636c()) {
                wg3.m206174a("configuration is invalid, will ignore setup");
                return;
            }
        }
        fepConfigContext.m17642i().set(true);
        this.configCacheJob = xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepConfigManager$setup$1(this, null), 3, null);
        pgi.m172235f(fepConfigContext.m17638e(), "FepConfigManager setup completed", null, 0, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object m17632t(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        FepConfigManager$waitForDataLoaded$1 fepConfigManager$waitForDataLoaded$1;
        if (continuation instanceof FepConfigManager$waitForDataLoaded$1) {
            fepConfigManager$waitForDataLoaded$1 = (FepConfigManager$waitForDataLoaded$1) continuation;
            int i = fepConfigManager$waitForDataLoaded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fepConfigManager$waitForDataLoaded$1.label = i - Integer.MIN_VALUE;
            } else {
                fepConfigManager$waitForDataLoaded$1 = new FepConfigManager$waitForDataLoaded$1(this, continuation);
            }
        } else {
            fepConfigManager$waitForDataLoaded$1 = new FepConfigManager$waitForDataLoaded$1(this, continuation);
        }
        Object obj = fepConfigManager$waitForDataLoaded$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = fepConfigManager$waitForDataLoaded$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                if (this.isCacheDataLoaded.get()) {
                    return Unit.INSTANCE;
                }
                FepConfigManager$waitForDataLoaded$2 fepConfigManager$waitForDataLoaded$2 = new FepConfigManager$waitForDataLoaded$2(this, null);
                fepConfigManager$waitForDataLoaded$1.L$0 = this;
                fepConfigManager$waitForDataLoaded$1.label = 1;
                if (TimeoutKt.m94621c(1000L, fepConfigManager$waitForDataLoaded$2, fepConfigManager$waitForDataLoaded$1) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
        } catch (TimeoutCancellationException unused) {
            pgi.m172239k(FepConfigContext.INSTANCE.m17638e(), "waitIfNeeded timed out, config may not be ready", null, 0, null, 14, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.hellogroup.fep.config.core.FepConfigManager$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lcom/hellogroup/fep/config/core/FepConfigManager$a;", "", "<init>", "()V", "Lcom/hellogroup/fep/config/core/FepConfigManager;", "a", "()Lcom/hellogroup/fep/config/core/FepConfigManager;", "", "CONFIG_DATA_WAITING", "J", "instance", "Lcom/hellogroup/fep/config/core/FepConfigManager;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final FepConfigManager m17633a() {
            FepConfigManager fepConfigManager;
            FepConfigManager fepConfigManager2 = FepConfigManager.f11911g;
            if (fepConfigManager2 != null) {
                return fepConfigManager2;
            }
            synchronized (this) {
                fepConfigManager = FepConfigManager.f11911g;
                if (fepConfigManager == null) {
                    fepConfigManager = new FepConfigManager(null);
                    FepConfigManager.f11911g = fepConfigManager;
                }
            }
            return fepConfigManager;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FepConfigManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
