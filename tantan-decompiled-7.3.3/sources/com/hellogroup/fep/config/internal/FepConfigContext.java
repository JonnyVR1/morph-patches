package com.hellogroup.fep.config.internal;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.fep.config.core.FepConfigManager;
import com.hellogroup.fep.config.internal.fetch.FepConfigFetchModule;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.agi;
import p153l.bgi;
import p153l.egi;
import p153l.pgi;
import p153l.tl5;
import p153l.xfi;
import p153l.zfi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R!\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b(\u0010)R\u001b\u0010.\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b\u0019\u00100R\u001b\u00104\u001a\u0002028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b!\u00103R#\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u000106058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b\r\u00107¨\u00069"}, m88121d2 = {"Lcom/hellogroup/fep/config/internal/FepConfigContext;", "", "<init>", "()V", "", "a", "Z", "c", "()Z", "k", "(Z)V", "debugMode", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isSetup", "Ll/xfi;", "Ll/xfi;", "()Ll/xfi;", "j", "(Ll/xfi;)V", "configuration", "Ll/agi;", Constants.INAPP_DATA_TAG, "Ll/agi;", "f", "()Ll/agi;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/agi;)V", "networkProvider", "Lcom/hellogroup/fep/config/core/FepConfigManager;", "e", "Lkotlin/Lazy;", "getManager", "()Lcom/hellogroup/fep/config/core/FepConfigManager;", "manager", "Ll/tl5;", "Ll/bgi;", "g", "()Ll/tl5;", "observerManager", "Ll/egi;", "h", "()Ll/egi;", "storageModule", "Lcom/hellogroup/fep/config/internal/fetch/FepConfigFetchModule;", "()Lcom/hellogroup/fep/config/internal/fetch/FepConfigFetchModule;", "fetchModule", "Ll/pgi;", "()Ll/pgi;", "logModule", "Ljava/util/concurrent/atomic/AtomicReference;", "Ll/zfi;", "()Ljava/util/concurrent/atomic/AtomicReference;", "currentConfigData", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepConfigContext {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean debugMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static xfi configuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static agi networkProvider;
    public static final FepConfigContext INSTANCE = new FepConfigContext();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final AtomicBoolean isSetup = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy manager = LazyKt__LazyJVMKt.m88118b(new Function0<FepConfigManager>() { // from class: com.hellogroup.fep.config.internal.FepConfigContext$manager$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FepConfigManager invoke() {
            return FepConfigManager.INSTANCE.m17633a();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy observerManager = LazyKt__LazyJVMKt.m88118b(new Function0<tl5<bgi>>() { // from class: com.hellogroup.fep.config.internal.FepConfigContext$observerManager$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final tl5<bgi> invoke() {
            return new tl5<>();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final Lazy storageModule = LazyKt__LazyJVMKt.m88118b(new Function0<egi>() { // from class: com.hellogroup.fep.config.internal.FepConfigContext$storageModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final egi invoke() {
            return new egi();
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final Lazy fetchModule = LazyKt__LazyJVMKt.m88118b(new Function0<FepConfigFetchModule>() { // from class: com.hellogroup.fep.config.internal.FepConfigContext$fetchModule$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FepConfigFetchModule invoke() {
            return new FepConfigFetchModule();
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final Lazy logModule = LazyKt__LazyJVMKt.m88118b(new Function0<pgi>() { // from class: com.hellogroup.fep.config.internal.FepConfigContext$logModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final pgi invoke() {
            return new pgi(FepLogModuleType.config, new Function6<FepLogModuleType, FepLogLevel, String, Map<String, ? extends Object>, Integer, Throwable, Unit>() { // from class: com.hellogroup.fep.config.internal.FepConfigContext$logModule$2.1
                public final void invoke(@NotNull final FepLogModuleType fepLogModuleType, @NotNull final FepLogLevel fepLogLevel, @NotNull final String str, @Nullable final Map<String, ? extends Object> map, final int i, @Nullable final Throwable th) {
                    fepLogModuleType.getClass();
                    fepLogLevel.getClass();
                    str.getClass();
                    FepConfigContext.INSTANCE.m17640g().m191606b(new Function1<bgi, Unit>() { // from class: com.hellogroup.fep.config.internal.FepConfigContext.logModule.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull bgi bgiVar) {
                            bgiVar.getClass();
                            bgiVar.mo17605c(fepLogModuleType, fepLogLevel, str, map, i, th);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(bgi bgiVar) {
                            invoke2(bgiVar);
                            return Unit.INSTANCE;
                        }
                    }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.config.internal.FepConfigContext.logModule.2.1.2
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

                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ Unit invoke(FepLogModuleType fepLogModuleType, FepLogLevel fepLogLevel, String str, Map<String, ? extends Object> map, Integer num, Throwable th) {
                    invoke(fepLogModuleType, fepLogLevel, str, map, num.intValue(), th);
                    return Unit.INSTANCE;
                }
            });
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final Lazy currentConfigData = LazyKt__LazyJVMKt.m88118b(new Function0<AtomicReference<zfi>>() { // from class: com.hellogroup.fep.config.internal.FepConfigContext$currentConfigData$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final AtomicReference<zfi> invoke() {
            return new AtomicReference<>(null);
        }
    });

    private FepConfigContext() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final xfi m17634a() {
        xfi xfiVar = configuration;
        if (xfiVar == null) {
            Intrinsics.m88391r("configuration");
        }
        return xfiVar;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final AtomicReference<zfi> m17635b() {
        return (AtomicReference) currentConfigData.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17636c() {
        return debugMode;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final FepConfigFetchModule m17637d() {
        return (FepConfigFetchModule) fetchModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final pgi m17638e() {
        return (pgi) logModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final agi m17639f() {
        agi agiVar = networkProvider;
        if (agiVar == null) {
            Intrinsics.m88391r("networkProvider");
        }
        return agiVar;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final tl5<bgi> m17640g() {
        return (tl5) observerManager.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final egi m17641h() {
        return (egi) storageModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final AtomicBoolean m17642i() {
        return isSetup;
    }

    /* JADX INFO: renamed from: j */
    public final void m17643j(@NotNull xfi xfiVar) {
        xfiVar.getClass();
        configuration = xfiVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m17644k(boolean z) {
        debugMode = z;
    }

    /* JADX INFO: renamed from: l */
    public final void m17645l(@NotNull agi agiVar) {
        agiVar.getClass();
        networkProvider = agiVar;
    }
}
