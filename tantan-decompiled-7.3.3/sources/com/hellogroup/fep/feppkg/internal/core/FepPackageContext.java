package com.hellogroup.fep.feppkg.internal.core;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.FepContext;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.fep.feppkg.core.FepPackageConfiguration;
import com.hellogroup.fep.feppkg.internal.module.install.FepPackageUnzipModule;
import com.hellogroup.fep.feppkg.internal.module.record.FepPackageRecordModule;
import com.hellogroup.fep.feppkg.internal.module.update.FepPackageCheckUpdateModule;
import com.hellogroup.fep.feppkg.internal.module.update.FepPackageUpdateModule;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ahi;
import p153l.bhi;
import p153l.chi;
import p153l.ehi;
import p153l.fhi;
import p153l.ghi;
import p153l.hhi;
import p153l.ihi;
import p153l.nc60;
import p153l.nhi;
import p153l.pgi;
import p153l.tc60;
import p153l.tl5;
import p153l.vgi;
import p153l.wgi;
import p153l.xh3;
import p153l.ygi;
import p153l.zgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001f\u0010\u001c\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R!\u00101\u001a\b\u0012\u0004\u0012\u00020-0,8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u0010?R\u0017\u0010E\u001a\u00020A8\u0006¢\u0006\f\n\u0004\b9\u0010B\u001a\u0004\bC\u0010DR\u001b\u0010I\u001a\u00020F8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010.\u001a\u0004\b\u0018\u0010HR\u001b\u0010M\u001a\u00020J8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\bK\u0010LR\u001b\u0010Q\u001a\u00020N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\bO\u0010PR\u001b\u0010T\u001a\u00020R8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b3\u0010SR\u001b\u0010X\u001a\u00020U8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010.\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010.\u001a\u0004\b[\u0010\\R\u001b\u0010a\u001a\u00020^8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010.\u001a\u0004\b_\u0010`R\u001b\u0010d\u001a\u00020b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\bG\u0010cR\u001b\u0010h\u001a\u00020e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bf\u0010.\u001a\u0004\bZ\u0010gR\u001b\u0010k\u001a\u00020i8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b[\u0010.\u001a\u0004\b8\u0010jR\u001b\u0010n\u001a\u00020l8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010.\u001a\u0004\b\u001e\u0010mR\u001b\u0010q\u001a\u00020o8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b_\u0010.\u001a\u0004\bf\u0010pR\u001b\u0010t\u001a\u00020r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b=\u0010s¨\u0006u"}, m88121d2 = {"Lcom/hellogroup/fep/feppkg/internal/core/FepPackageContext;", "", "<init>", "()V", "Ll/zgi;", BaseSei.INFO, "", ResourceDirection.f39656v, "(Ll/zgi;)V", "", "localPath", "bid", "baseVersion", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Z", "e", "()Z", BaseSei.f14624X, "(Z)V", "debugMode", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "b", "Ljava/util/regex/Pattern;", "getPATTERN_V_X", "()Ljava/util/regex/Pattern;", "PATTERN_V_X", "Lcom/hellogroup/fep/feppkg/core/FepPackageConfiguration;", "c", "Lcom/hellogroup/fep/feppkg/core/FepPackageConfiguration;", Constants.INAPP_DATA_TAG, "()Lcom/hellogroup/fep/feppkg/core/FepPackageConfiguration;", "w", "(Lcom/hellogroup/fep/feppkg/core/FepPackageConfiguration;)V", "configuration", "Ll/tc60;", "Ll/tc60;", "q", "()Ll/tc60;", BaseSei.f14625Y, "(Ll/tc60;)V", "provider", "Ll/tl5;", "Ll/ehi;", "Lkotlin/Lazy;", "m", "()Ll/tl5;", "observerManager", "Ll/pgi;", "f", BLiveStormDanmakuGiftResourceType.f45292l, "()Ll/pgi;", "logModule", "Ll/ahi;", "g", RXScreenCaptureService.KEY_INDEX, "()Ll/ahi;", "infoStore", "Ll/chi;", "h", "k", "()Ll/chi;", "localModule", "Ll/fhi;", "Ll/fhi;", "getParser", "()Ll/fhi;", "parser", "Lcom/hellogroup/fep/feppkg/internal/module/update/FepPackageCheckUpdateModule;", "j", "()Lcom/hellogroup/fep/feppkg/internal/module/update/FepPackageCheckUpdateModule;", "checkUpdateModule", "Lcom/hellogroup/fep/feppkg/internal/module/update/FepPackageUpdateModule;", Constants.KEY_T, "()Lcom/hellogroup/fep/feppkg/internal/module/update/FepPackageUpdateModule;", "updateModule", "Ll/ihi;", "p", "()Ll/ihi;", "preloadModule", "Ll/nc60;", "()Ll/nc60;", "downloadModule", "Ll/ghi;", "n", "()Ll/ghi;", "patchModule", "Lcom/hellogroup/fep/feppkg/internal/module/install/FepPackageUnzipModule;", "o", BLiveStormDanmakuGiftResourceType.f45294s, "()Lcom/hellogroup/fep/feppkg/internal/module/install/FepPackageUnzipModule;", "unzipModule", "Ll/nhi;", "u", "()Ll/nhi;", "verifyModule", "Ll/bhi;", "()Ll/bhi;", "installModule", "Ll/hhi;", "r", "()Ll/hhi;", "preEmbedModule", "Ll/ygi;", "()Ll/ygi;", "evictModule", "Ll/vgi;", "()Ll/vgi;", "cleanerModule", "Lcom/hellogroup/fep/feppkg/internal/module/record/FepPackageRecordModule;", "()Lcom/hellogroup/fep/feppkg/internal/module/record/FepPackageRecordModule;", "recordModule", "Ll/wgi;", "()Ll/wgi;", "fepPackageConfigModule", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepPackageContext {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean debugMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static FepPackageConfiguration configuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static tc60 provider;
    public static final FepPackageContext INSTANCE = new FepPackageContext();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Pattern PATTERN_V_X = Pattern.compile("^[1-9]+[0-9]*.x$");

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy observerManager = LazyKt__LazyJVMKt.m88118b(new Function0<tl5<ehi>>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$observerManager$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final tl5<ehi> invoke() {
            return new tl5<>();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy logModule = LazyKt__LazyJVMKt.m88118b(new Function0<pgi>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$logModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final pgi invoke() {
            return new pgi(FepLogModuleType.offlinepkg, new Function6<FepLogModuleType, FepLogLevel, String, Map<String, ? extends Object>, Integer, Throwable, Unit>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$logModule$2.1
                public final void invoke(@NotNull final FepLogModuleType fepLogModuleType, @NotNull final FepLogLevel fepLogLevel, @NotNull final String str, @Nullable final Map<String, ? extends Object> map, final int i, @Nullable final Throwable th) {
                    fepLogModuleType.getClass();
                    fepLogLevel.getClass();
                    str.getClass();
                    FepPackageContext.INSTANCE.m17686m().m191606b(new Function1<ehi, Unit>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext.logModule.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ehi ehiVar) {
                            ehiVar.getClass();
                            ehiVar.mo17609f(fepLogModuleType, fepLogLevel, str, map, i, th);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ehi ehiVar) {
                            invoke2(ehiVar);
                            return Unit.INSTANCE;
                        }
                    }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext.logModule.2.1.2
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

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final Lazy infoStore = LazyKt__LazyJVMKt.m88118b(new Function0<ahi>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$infoStore$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ahi invoke() {
            return new ahi();
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final Lazy localModule = LazyKt__LazyJVMKt.m88118b(new Function0<chi>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$localModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final chi invoke() {
            return new chi();
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final fhi parser = fhi.INSTANCE;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final Lazy checkUpdateModule = LazyKt__LazyJVMKt.m88118b(new Function0<FepPackageCheckUpdateModule>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$checkUpdateModule$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FepPackageCheckUpdateModule invoke() {
            return new FepPackageCheckUpdateModule();
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final Lazy updateModule = LazyKt__LazyJVMKt.m88118b(new Function0<FepPackageUpdateModule>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$updateModule$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FepPackageUpdateModule invoke() {
            return new FepPackageUpdateModule();
        }
    });

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final Lazy preloadModule = LazyKt__LazyJVMKt.m88118b(new Function0<ihi>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$preloadModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ihi invoke() {
            return new ihi();
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private static final Lazy downloadModule = LazyKt__LazyJVMKt.m88118b(new Function0<nc60>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$downloadModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final nc60 invoke() {
            return new nc60();
        }
    });

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private static final Lazy patchModule = LazyKt__LazyJVMKt.m88118b(new Function0<ghi>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$patchModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ghi invoke() {
            return new ghi();
        }
    });

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private static final Lazy unzipModule = LazyKt__LazyJVMKt.m88118b(new Function0<FepPackageUnzipModule>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$unzipModule$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FepPackageUnzipModule invoke() {
            return new FepPackageUnzipModule();
        }
    });

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private static final Lazy verifyModule = LazyKt__LazyJVMKt.m88118b(new Function0<nhi>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$verifyModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final nhi invoke() {
            return new nhi();
        }
    });

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private static final Lazy installModule = LazyKt__LazyJVMKt.m88118b(new Function0<bhi>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$installModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final bhi invoke() {
            return new bhi();
        }
    });

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private static final Lazy preEmbedModule = LazyKt__LazyJVMKt.m88118b(new Function0<hhi>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$preEmbedModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final hhi invoke() {
            return new hhi();
        }
    });

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private static final Lazy evictModule = LazyKt__LazyJVMKt.m88118b(new Function0<ygi>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$evictModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ygi invoke() {
            return new ygi();
        }
    });

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private static final Lazy cleanerModule = LazyKt__LazyJVMKt.m88118b(new Function0<vgi>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$cleanerModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final vgi invoke() {
            return new vgi();
        }
    });

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private static final Lazy recordModule = LazyKt__LazyJVMKt.m88118b(new Function0<FepPackageRecordModule>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$recordModule$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FepPackageRecordModule invoke() {
            return new FepPackageRecordModule();
        }
    });

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private static final Lazy fepPackageConfigModule = LazyKt__LazyJVMKt.m88118b(new Function0<wgi>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$fepPackageConfigModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final wgi invoke() {
            return new wgi();
        }
    });

    private FepPackageContext() {
    }

    /* JADX INFO: renamed from: a */
    public final void m17674a(@Nullable String localPath, @NotNull String bid, @NotNull String baseVersion) {
        bid.getClass();
        baseVersion.getClass();
        xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new FepPackageContext$deleteInvalidFiles$1(localPath, bid, baseVersion, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final FepPackageCheckUpdateModule m17675b() {
        return (FepPackageCheckUpdateModule) checkUpdateModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final vgi m17676c() {
        return (vgi) cleanerModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final FepPackageConfiguration m17677d() {
        FepPackageConfiguration fepPackageConfiguration = configuration;
        if (fepPackageConfiguration == null) {
            Intrinsics.m88391r("configuration");
        }
        return fepPackageConfiguration;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17678e() {
        return debugMode;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final nc60 m17679f() {
        return (nc60) downloadModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final ygi m17680g() {
        return (ygi) evictModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final wgi m17681h() {
        return (wgi) fepPackageConfigModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ahi m17682i() {
        return (ahi) infoStore.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final bhi m17683j() {
        return (bhi) installModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final chi m17684k() {
        return (chi) localModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final pgi m17685l() {
        return (pgi) logModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final tl5<ehi> m17686m() {
        return (tl5) observerManager.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final ghi m17687n() {
        return (ghi) patchModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final hhi m17688o() {
        return (hhi) preEmbedModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final ihi m17689p() {
        return (ihi) preloadModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final tc60 m17690q() {
        tc60 tc60Var = provider;
        if (tc60Var == null) {
            Intrinsics.m88391r("provider");
        }
        return tc60Var;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final FepPackageRecordModule m17691r() {
        return (FepPackageRecordModule) recordModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final FepPackageUnzipModule m17692s() {
        return (FepPackageUnzipModule) unzipModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final FepPackageUpdateModule m17693t() {
        return (FepPackageUpdateModule) updateModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final nhi m17694u() {
        return (nhi) verifyModule.getValue();
    }

    /* JADX INFO: renamed from: v */
    public final void m17695v(@NotNull final zgi info) {
        info.getClass();
        m17686m().m191606b(new Function1<ehi, Unit>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$notifyStatusChange$1
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ehi ehiVar) {
                ehiVar.getClass();
                ehiVar.mo17607d(zgi.m219618c(info, null, null, null, 0L, null, null, null, null, null, UnixStat.DEFAULT_LINK_PERM, null), info.m219630m());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ehi ehiVar) {
                invoke2(ehiVar);
                return Unit.INSTANCE;
            }
        }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.feppkg.internal.core.FepPackageContext$notifyStatusChange$2
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

    /* JADX INFO: renamed from: w */
    public final void m17696w(@NotNull FepPackageConfiguration fepPackageConfiguration) {
        fepPackageConfiguration.getClass();
        configuration = fepPackageConfiguration;
    }

    /* JADX INFO: renamed from: x */
    public final void m17697x(boolean z) {
        debugMode = z;
    }

    /* JADX INFO: renamed from: y */
    public final void m17698y(@NotNull tc60 tc60Var) {
        tc60Var.getClass();
        provider = tc60Var;
    }
}
