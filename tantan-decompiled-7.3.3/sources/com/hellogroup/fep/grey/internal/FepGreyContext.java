package com.hellogroup.fep.grey.internal;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
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
import p153l.igi;
import p153l.jgi;
import p153l.kgi;
import p153l.mgi;
import p153l.pgi;
import p153l.tl5;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001f\u0010 R!\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u0019\u0010$R\u001b\u0010(\u001a\u00020&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u0012\u0010'¨\u0006)"}, m88121d2 = {"Lcom/hellogroup/fep/grey/internal/FepGreyContext;", "", "<init>", "()V", "", "a", "Z", "()Z", "h", "(Z)V", "debugMode", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isSetup", "Ll/jgi;", "c", "Ll/jgi;", "()Ll/jgi;", RXScreenCaptureService.KEY_INDEX, "(Ll/jgi;)V", "greyProvider", "Ll/mgi;", Constants.INAPP_DATA_TAG, "Lkotlin/Lazy;", "e", "()Ll/mgi;", "ruleModule", "Ll/kgi;", "f", "()Ll/kgi;", "urlModule", "Ll/tl5;", "Ll/igi;", "()Ll/tl5;", "observerManager", "Ll/pgi;", "()Ll/pgi;", "logModule", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepGreyContext {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean debugMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static jgi greyProvider;
    public static final FepGreyContext INSTANCE = new FepGreyContext();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final AtomicBoolean isSetup = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy ruleModule = LazyKt__LazyJVMKt.m88118b(new Function0<mgi>() { // from class: com.hellogroup.fep.grey.internal.FepGreyContext$ruleModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final mgi invoke() {
            return new mgi();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy urlModule = LazyKt__LazyJVMKt.m88118b(new Function0<kgi>() { // from class: com.hellogroup.fep.grey.internal.FepGreyContext$urlModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final kgi invoke() {
            return new kgi();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy observerManager = LazyKt__LazyJVMKt.m88118b(new Function0<tl5<igi>>() { // from class: com.hellogroup.fep.grey.internal.FepGreyContext$observerManager$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final tl5<igi> invoke() {
            return new tl5<>();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final Lazy logModule = LazyKt__LazyJVMKt.m88118b(new Function0<pgi>() { // from class: com.hellogroup.fep.grey.internal.FepGreyContext$logModule$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final pgi invoke() {
            return new pgi(FepLogModuleType.grey, new Function6<FepLogModuleType, FepLogLevel, String, Map<String, ? extends Object>, Integer, Throwable, Unit>() { // from class: com.hellogroup.fep.grey.internal.FepGreyContext$logModule$2.1
                public final void invoke(@NotNull final FepLogModuleType fepLogModuleType, @NotNull final FepLogLevel fepLogLevel, @NotNull final String str, @Nullable final Map<String, ? extends Object> map, final int i, @Nullable final Throwable th) {
                    fepLogModuleType.getClass();
                    fepLogLevel.getClass();
                    str.getClass();
                    FepGreyContext.INSTANCE.m17747d().m191606b(new Function1<igi, Unit>() { // from class: com.hellogroup.fep.grey.internal.FepGreyContext.logModule.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull igi igiVar) {
                            igiVar.getClass();
                            igiVar.mo17606g(fepLogModuleType, fepLogLevel, str, map, i, th);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(igi igiVar) {
                            invoke2(igiVar);
                            return Unit.INSTANCE;
                        }
                    }, new Function1<Exception, Unit>() { // from class: com.hellogroup.fep.grey.internal.FepGreyContext.logModule.2.1.2
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

    private FepGreyContext() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17744a() {
        return debugMode;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final jgi m17745b() {
        jgi jgiVar = greyProvider;
        if (jgiVar == null) {
            Intrinsics.m88391r("greyProvider");
        }
        return jgiVar;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final pgi m17746c() {
        return (pgi) logModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final tl5<igi> m17747d() {
        return (tl5) observerManager.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final mgi m17748e() {
        return (mgi) ruleModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final kgi m17749f() {
        return (kgi) urlModule.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final AtomicBoolean m17750g() {
        return isSetup;
    }

    /* JADX INFO: renamed from: h */
    public final void m17751h(boolean z) {
        debugMode = z;
    }

    /* JADX INFO: renamed from: i */
    public final void m17752i(@NotNull jgi jgiVar) {
        jgiVar.getClass();
        greyProvider = jgiVar;
    }
}
