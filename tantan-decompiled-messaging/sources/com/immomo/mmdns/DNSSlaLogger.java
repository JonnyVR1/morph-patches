package com.immomo.mmdns;

import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p069ss.bytertc.engine.utils.LogUtil;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15167a;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gr4;
import p149l.jh3;
import p149l.nee0;
import p149l.or4;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001AB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J#\u0010\u000b\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001c\u001a\u00020\u00042 \u0010\u001b\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J3\u0010&\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00102\b\u0010$\u001a\u0004\u0018\u00010\u00102\u0006\u0010%\u001a\u00020\u001e¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010-R\u001c\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010>R0\u0010?\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, m87232d2 = {"Lcom/immomo/mmdns/DNSSlaLogger;", "", "<init>", "()V", "", "startLogging", "stopLogging", "", "Lcom/immomo/mmdns/DnsSlaHeader;", "Lcom/immomo/mmdns/DnsSlaData;", LogUtil.DIR_TAIL, "flushAsync", "(Ljava/util/Map;)V", "", "flushInterval", "", "", "includes", "excludes", "", "", "excludeCodes", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "init", "(JLjava/util/List;Ljava/util/List;Ljava/util/Set;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFlushListener", "(Lkotlin/jvm/functions/Function1;)V", "", "enable", "setEnable", "(Z)V", "host", IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "code", "isHttpDns", "log", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "flush", "Ll/ppb;", "scope", "Ll/ppb;", "KEY_TOPIC", "Ljava/lang/String;", "KEY_HTTPDNS", "KEY_LOCALDNS", "Ll/gr4;", "Lcom/immomo/mmdns/DNSSlaLogger$LogEvent;", "dnsLogChannel", "Ll/gr4;", "Lkotlinx/coroutines/o;", "flushJob", "Lkotlinx/coroutines/o;", "isEnable", "Z", "J", "Lcom/immomo/mmdns/DomainMatcher;", "domainMatcher", "Lcom/immomo/mmdns/DomainMatcher;", "", "Ljava/util/Set;", "onFlushListener", "Lkotlin/jvm/functions/Function1;", "LogEvent", "mmdns_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class DNSSlaLogger {

    @NotNull
    public static final String KEY_HTTPDNS = "HttpDns";

    @NotNull
    public static final String KEY_LOCALDNS = "LocalDns";

    @NotNull
    public static final String KEY_TOPIC = "DNS_SLA";
    private static DomainMatcher domainMatcher;
    private static InterfaceC15486o flushJob;
    private static volatile boolean isEnable;
    private static Function1<? super Map<DnsSlaHeader, DnsSlaData>, Unit> onFlushListener;
    private static ppb scope;
    public static final DNSSlaLogger INSTANCE = new DNSSlaLogger();
    private static gr4<LogEvent> dnsLogChannel = or4.m165524c(-2, null, null, 6, null);
    private static long flushInterval = 120000;
    private static Set<Integer> excludeCodes = new LinkedHashSet();

    /* JADX INFO: renamed from: com.immomo.mmdns.DNSSlaLogger$flush$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
    @DebugMetadata(m87373c = "com.immomo.mmdns.DNSSlaLogger$flush$1", m87374f = "DNSSlaLogger.kt", m87375l = {218}, m87376m = "invokeSuspend")
    public static final class C37801 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: p$ */
        private ppb f12950p$;

        public C37801(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            continuation.getClass();
            C37801 c37801 = new C37801(continuation);
            c37801.f12950p$ = (ppb) obj;
            return c37801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C37801) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                ppb ppbVar = this.f12950p$;
                gr4 gr4VarAccess$getDnsLogChannel$p = DNSSlaLogger.access$getDnsLogChannel$p(DNSSlaLogger.INSTANCE);
                LogEvent.Flush flush = LogEvent.Flush.INSTANCE;
                this.L$0 = ppbVar;
                this.label = 1;
                if (gr4VarAccess$getDnsLogChannel$p.mo93787E(flush, this) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.immomo.mmdns.DNSSlaLogger$flushAsync$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
    @DebugMetadata(m87373c = "com.immomo.mmdns.DNSSlaLogger$flushAsync$1", m87374f = "DNSSlaLogger.kt", m87375l = {}, m87376m = "invokeSuspend")
    public static final class C37811 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map $logs;
        int label;

        /* JADX INFO: renamed from: p$ */
        private ppb f12951p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37811(Map map, Continuation continuation) {
            super(2, continuation);
            this.$logs = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            continuation.getClass();
            C37811 c37811 = new C37811(this.$logs, continuation);
            c37811.f12951p$ = (ppb) obj;
            return c37811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C37811) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            uwp.m196133e();
            if (this.label != 0) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
            Function1 function1Access$getOnFlushListener$p = DNSSlaLogger.access$getOnFlushListener$p(DNSSlaLogger.INSTANCE);
            if (function1Access$getOnFlushListener$p != null) {
                return (Unit) function1Access$getOnFlushListener$p.invoke(this.$logs);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.immomo.mmdns.DNSSlaLogger$log$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
    @DebugMetadata(m87373c = "com.immomo.mmdns.DNSSlaLogger$log$1", m87374f = "DNSSlaLogger.kt", m87375l = {208}, m87376m = "invokeSuspend")
    public static final class C37821 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $code;
        final /* synthetic */ String $host;
        final /* synthetic */ String $ip;
        final /* synthetic */ boolean $isHttpDns;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: p$ */
        private ppb f12952p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37821(String str, String str2, String str3, boolean z, Continuation continuation) {
            super(2, continuation);
            this.$host = str;
            this.$ip = str2;
            this.$code = str3;
            this.$isHttpDns = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            continuation.getClass();
            C37821 c37821 = new C37821(this.$host, this.$ip, this.$code, this.$isHttpDns, continuation);
            c37821.f12952p$ = (ppb) obj;
            return c37821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C37821) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                ppb ppbVar = this.f12952p$;
                gr4 gr4VarAccess$getDnsLogChannel$p = DNSSlaLogger.access$getDnsLogChannel$p(DNSSlaLogger.INSTANCE);
                String str = this.$host;
                String str2 = this.$ip;
                Integer intOrNull = StringsKt.toIntOrNull(this.$code);
                LogEvent.Log log = new LogEvent.Log(str, str2, intOrNull != null ? intOrNull.intValue() : -1, this.$isHttpDns);
                this.L$0 = ppbVar;
                this.label = 1;
                if (gr4VarAccess$getDnsLogChannel$p.mo93787E(log, this) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.immomo.mmdns.DNSSlaLogger$startLogging$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
    @DebugMetadata(m87373c = "com.immomo.mmdns.DNSSlaLogger$startLogging$1", m87374f = "DNSSlaLogger.kt", m87375l = {153}, m87376m = "invokeSuspend")
    public static final class C37831 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: p$ */
        private ppb f12953p$;

        /* JADX INFO: renamed from: com.immomo.mmdns.DNSSlaLogger$startLogging$1$1, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
        @DebugMetadata(m87373c = "com.immomo.mmdns.DNSSlaLogger$startLogging$1$1", m87374f = "DNSSlaLogger.kt", m87375l = {}, m87376m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
            final /* synthetic */ Map $localDnsLogs;
            int label;

            /* JADX INFO: renamed from: p$ */
            private ppb f12954p$;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Map map, Continuation continuation) {
                super(2, continuation);
                this.$localDnsLogs = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                continuation.getClass();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$localDnsLogs, continuation);
                anonymousClass1.f12954p$ = (ppb) obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                uwp.m196133e();
                if (this.label != 0) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
                DNSSlaLogger.INSTANCE.flushAsync(MapsKt.toMutableMap(this.$localDnsLogs));
                this.$localDnsLogs.clear();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.immomo.mmdns.DNSSlaLogger$startLogging$1$2, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
        @DebugMetadata(m87373c = "com.immomo.mmdns.DNSSlaLogger$startLogging$1$2", m87374f = "DNSSlaLogger.kt", m87375l = {178}, m87376m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
            final /* synthetic */ Map $localDnsLogs;
            Object L$0;
            int label;

            /* JADX INFO: renamed from: p$ */
            private ppb f12955p$;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Map map, Continuation continuation) {
                super(2, continuation);
                this.$localDnsLogs = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                continuation.getClass();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$localDnsLogs, continuation);
                anonymousClass2.f12955p$ = (ppb) obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objM196133e = uwp.m196133e();
                int i = this.label;
                if (i == 0) {
                    ResultKt.m87239b(obj);
                    ppb ppbVar = this.f12955p$;
                    long jAccess$getFlushInterval$p = DNSSlaLogger.access$getFlushInterval$p(DNSSlaLogger.INSTANCE);
                    this.L$0 = ppbVar;
                    this.label = 1;
                    if (DelayKt.m93611b(jAccess$getFlushInterval$p, this) == objM196133e) {
                        return objM196133e;
                    }
                } else {
                    if (i != 1) {
                        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.m87239b(obj);
                }
                DNSSlaLogger.INSTANCE.flushAsync(MapsKt.toMutableMap(this.$localDnsLogs));
                this.$localDnsLogs.clear();
                return Unit.INSTANCE;
            }
        }

        public C37831(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            continuation.getClass();
            C37831 c37831 = new C37831(continuation);
            c37831.f12953p$ = (ppb) obj;
            return c37831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C37831) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x004b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:15:0x0054  */
        /* JADX WARN: Code duplicated, block: B:18:0x005e A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x005a, B:18:0x005e, B:20:0x0066, B:23:0x006e, B:24:0x0080, B:26:0x0084, B:28:0x008c, B:31:0x009b, B:34:0x00b2, B:36:0x00d2, B:37:0x00da, B:39:0x0101, B:41:0x0107, B:43:0x0115, B:44:0x0118), top: B:50:0x005a }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0066 A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x005a, B:18:0x005e, B:20:0x0066, B:23:0x006e, B:24:0x0080, B:26:0x0084, B:28:0x008c, B:31:0x009b, B:34:0x00b2, B:36:0x00d2, B:37:0x00da, B:39:0x0101, B:41:0x0107, B:43:0x0115, B:44:0x0118), top: B:50:0x005a }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0080 A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x005a, B:18:0x005e, B:20:0x0066, B:23:0x006e, B:24:0x0080, B:26:0x0084, B:28:0x008c, B:31:0x009b, B:34:0x00b2, B:36:0x00d2, B:37:0x00da, B:39:0x0101, B:41:0x0107, B:43:0x0115, B:44:0x0118), top: B:50:0x005a }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0084 A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x005a, B:18:0x005e, B:20:0x0066, B:23:0x006e, B:24:0x0080, B:26:0x0084, B:28:0x008c, B:31:0x009b, B:34:0x00b2, B:36:0x00d2, B:37:0x00da, B:39:0x0101, B:41:0x0107, B:43:0x0115, B:44:0x0118), top: B:50:0x005a }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00d2 A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x005a, B:18:0x005e, B:20:0x0066, B:23:0x006e, B:24:0x0080, B:26:0x0084, B:28:0x008c, B:31:0x009b, B:34:0x00b2, B:36:0x00d2, B:37:0x00da, B:39:0x0101, B:41:0x0107, B:43:0x0115, B:44:0x0118), top: B:50:0x005a }] */
        /* JADX WARN: Code duplicated, block: B:39:0x0101 A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x005a, B:18:0x005e, B:20:0x0066, B:23:0x006e, B:24:0x0080, B:26:0x0084, B:28:0x008c, B:31:0x009b, B:34:0x00b2, B:36:0x00d2, B:37:0x00da, B:39:0x0101, B:41:0x0107, B:43:0x0115, B:44:0x0118), top: B:50:0x005a }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0106  */
        /* JADX WARN: Code duplicated, block: B:43:0x0115 A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:16:0x005a, B:18:0x005e, B:20:0x0066, B:23:0x006e, B:24:0x0080, B:26:0x0084, B:28:0x008c, B:31:0x009b, B:34:0x00b2, B:36:0x00d2, B:37:0x00da, B:39:0x0101, B:41:0x0107, B:43:0x0115, B:44:0x0118), top: B:50:0x005a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0049 -> B:6:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x005e
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.immomo.mmdns.DNSSlaLogger.C37831.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private DNSSlaLogger() {
    }

    public static final /* synthetic */ gr4 access$getDnsLogChannel$p(DNSSlaLogger dNSSlaLogger) {
        return dnsLogChannel;
    }

    public static final /* synthetic */ DomainMatcher access$getDomainMatcher$p(DNSSlaLogger dNSSlaLogger) {
        return domainMatcher;
    }

    public static final /* synthetic */ Set access$getExcludeCodes$p(DNSSlaLogger dNSSlaLogger) {
        return excludeCodes;
    }

    public static final /* synthetic */ long access$getFlushInterval$p(DNSSlaLogger dNSSlaLogger) {
        return flushInterval;
    }

    public static final /* synthetic */ InterfaceC15486o access$getFlushJob$p(DNSSlaLogger dNSSlaLogger) {
        return flushJob;
    }

    public static final /* synthetic */ Function1 access$getOnFlushListener$p(DNSSlaLogger dNSSlaLogger) {
        return onFlushListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushAsync(Map<DnsSlaHeader, DnsSlaData> logs) {
        ppb ppbVar = scope;
        if (ppbVar != null) {
            jh3.m141365b(ppbVar, null, null, new C37811(logs, null), 3, null);
        }
    }

    private final void startLogging() {
        ppb ppbVar = scope;
        if (ppbVar != null) {
            jh3.m141365b(ppbVar, null, null, new C37831(null), 3, null);
        }
    }

    private final void stopLogging() {
        nee0.C18682a.m159110a(dnsLogChannel, null, 1, null);
        InterfaceC15486o interfaceC15486o = flushJob;
        if (interfaceC15486o != null) {
            InterfaceC15486o.a.m94245a(interfaceC15486o, null, 1, null);
        }
        dnsLogChannel = or4.m165524c(-2, null, null, 6, null);
        flushJob = null;
    }

    public final void flush() {
        ppb ppbVar;
        if (isEnable && (ppbVar = scope) != null) {
            jh3.m141365b(ppbVar, null, null, new C37801(null), 3, null);
        }
    }

    public final void init(long flushInterval2, @NotNull List<String> includes, @NotNull List<String> excludes, @NotNull Set<Integer> excludeCodes2, @NotNull CoroutineDispatcher dispatcher) {
        includes.getClass();
        excludes.getClass();
        excludeCodes2.getClass();
        dispatcher.getClass();
        flushInterval = C15167a.m87597c(flushInterval2, Constants.ONE_MIN_IN_MILLIS);
        domainMatcher = new DomainMatcher(includes, excludes);
        excludeCodes.addAll(excludeCodes2);
        scope = C15424f.m94055a(dispatcher);
        MDLog.m7397v(LogTag.DNS, "DNS_SLA init: flushInterval=" + flushInterval + ", domainMatcher=" + domainMatcher + ", excludeCodes=" + excludeCodes);
    }

    public final void log(@Nullable String host, @Nullable String ip, @Nullable String code, boolean isHttpDns) {
        ppb ppbVar;
        if (!isEnable || host == null || StringsKt.m93438e0(host) || ip == null || StringsKt.m93438e0(ip) || code == null || StringsKt.m93438e0(code) || (ppbVar = scope) == null) {
            return;
        }
        jh3.m141365b(ppbVar, null, null, new C37821(host, ip, code, isHttpDns, null), 3, null);
    }

    public final void setEnable(boolean enable) {
        MDLog.m7397v(LogTag.DNS, "DNS_SLA setEnable: " + enable);
        isEnable = enable;
        if (enable) {
            startLogging();
        } else {
            stopLogging();
        }
    }

    public final void setOnFlushListener(@Nullable Function1<? super Map<DnsSlaHeader, DnsSlaData>, Unit> listener) {
        onFlushListener = listener;
    }

    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/immomo/mmdns/DNSSlaLogger$LogEvent;", "", "()V", "Flush", "Log", "Lcom/immomo/mmdns/DNSSlaLogger$LogEvent$Log;", "Lcom/immomo/mmdns/DNSSlaLogger$LogEvent$Flush;", "mmdns_release"}, m87233k = 1, m87234mv = {1, 1, 16})
    public static abstract class LogEvent {

        @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m87232d2 = {"Lcom/immomo/mmdns/DNSSlaLogger$LogEvent$Flush;", "Lcom/immomo/mmdns/DNSSlaLogger$LogEvent;", "()V", "mmdns_release"}, m87233k = 1, m87234mv = {1, 1, 16})
        public static final class Flush extends LogEvent {
            public static final Flush INSTANCE = new Flush();

            private Flush() {
                super(null);
            }
        }

        @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001a"}, m87232d2 = {"Lcom/immomo/mmdns/DNSSlaLogger$LogEvent$Log;", "Lcom/immomo/mmdns/DNSSlaLogger$LogEvent;", "host", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "code", "", "isHttpDns", "", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getCode", "()I", "getHost", "()Ljava/lang/String;", "getIp", "()Z", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "toString", "mmdns_release"}, m87233k = 1, m87234mv = {1, 1, 16})
        public static final /* data */ class Log extends LogEvent {
            private final int code;

            @NotNull
            private final String host;

            @NotNull
            private final String ip;
            private final boolean isHttpDns;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Log(@NotNull String str, @NotNull String str2, int i, boolean z) {
                super(null);
                str.getClass();
                str2.getClass();
                this.host = str;
                this.ip = str2;
                this.code = i;
                this.isHttpDns = z;
            }

            public static /* synthetic */ Log copy$default(Log log, String str, String str2, int i, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = log.host;
                }
                if ((i2 & 2) != 0) {
                    str2 = log.ip;
                }
                if ((i2 & 4) != 0) {
                    i = log.code;
                }
                if ((i2 & 8) != 0) {
                    z = log.isHttpDns;
                }
                return log.copy(str, str2, i, z);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getHost() {
                return this.host;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getIp() {
                return this.ip;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final int getCode() {
                return this.code;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final boolean getIsHttpDns() {
                return this.isHttpDns;
            }

            @NotNull
            public final Log copy(@NotNull String host, @NotNull String ip, int code, boolean isHttpDns) {
                host.getClass();
                ip.getClass();
                return new Log(host, ip, code, isHttpDns);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Log)) {
                    return false;
                }
                Log log = (Log) other;
                return Intrinsics.m87488d(this.host, log.host) && Intrinsics.m87488d(this.ip, log.ip) && this.code == log.code && this.isHttpDns == log.isHttpDns;
            }

            public final int getCode() {
                return this.code;
            }

            @NotNull
            public final String getHost() {
                return this.host;
            }

            @NotNull
            public final String getIp() {
                return this.ip;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v8, types: [int] */
            /* JADX WARN: Type inference failed for: r3v2, types: [int] */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v4 */
            public int hashCode() {
                String str = this.host;
                int iHashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.ip;
                int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.code) * 31;
                boolean z = this.isHttpDns;
                ?? r3 = z;
                if (z) {
                    r3 = 1;
                }
                return iHashCode2 + r3;
            }

            public final boolean isHttpDns() {
                return this.isHttpDns;
            }

            @NotNull
            public String toString() {
                return "Log(host=" + this.host + ", ip=" + this.ip + ", code=" + this.code + ", isHttpDns=" + this.isHttpDns + ")";
            }
        }

        private LogEvent() {
        }

        public /* synthetic */ LogEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
