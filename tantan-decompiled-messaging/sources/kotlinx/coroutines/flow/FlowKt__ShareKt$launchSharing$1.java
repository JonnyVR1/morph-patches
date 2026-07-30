package kotlinx.coroutines.flow;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.eve0;
import p149l.j6f;
import p149l.lt10;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;
import p149l.yfh0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m87374f = "Share.kt", m87375l = {210, 214, 215, 221}, m87376m = "invokeSuspend")
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ lt10<Object> $shared;
    final /* synthetic */ InterfaceC15469b $started;
    final /* synthetic */ eri<Object> $upstream;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    @Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, Careers.f38732it, ""}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m87374f = "Share.kt", m87375l = {}, m87376m = "invokeSuspend")
    public static final class C154491 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        int label;

        public C154491(Continuation<? super C154491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C154491 c154491 = new C154491(continuation);
            c154491.I$0 = ((Number) obj).intValue();
            return c154491;
        }

        @Nullable
        public final Object invoke(int i, @Nullable Continuation<? super Boolean> continuation) {
            return ((C154491) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            uwp.m196133e();
            if (this.label == 0) {
                ResultKt.m87239b(obj);
                return Boxing.m87370a(this.I$0 > 0);
            }
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    @Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, Careers.f38732it, "Lkotlinx/coroutines/flow/SharingCommand;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m87374f = "Share.kt", m87375l = {223}, m87376m = "invokeSuspend")
    public static final class C154502 extends SuspendLambda implements Function2<SharingCommand, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ lt10<Object> $shared;
        final /* synthetic */ eri<Object> $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f66847a;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f66847a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154502(eri<Object> eriVar, lt10<Object> lt10Var, Object obj, Continuation<? super C154502> continuation) {
            super(2, continuation);
            this.$upstream = eriVar;
            this.$shared = lt10Var;
            this.$initialValue = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C154502 c154502 = new C154502(this.$upstream, this.$shared, this.$initialValue, continuation);
            c154502.L$0 = obj;
            return c154502;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SharingCommand sharingCommand, @Nullable Continuation<? super Unit> continuation) {
            return ((C154502) create(sharingCommand, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                int i2 = a.f66847a[((SharingCommand) this.L$0).ordinal()];
                if (i2 == 1) {
                    eri<Object> eriVar = this.$upstream;
                    lt10<Object> lt10Var = this.$shared;
                    this.label = 1;
                    if (eriVar.collect(lt10Var, this) == objM196133e) {
                        return objM196133e;
                    }
                } else if (i2 == 3) {
                    Object obj2 = this.$initialValue;
                    yfh0 yfh0Var = eve0.f93331a;
                    lt10<Object> lt10Var2 = this.$shared;
                    if (obj2 == yfh0Var) {
                        lt10Var2.mo94147b();
                    } else {
                        lt10Var2.mo94148c(obj2);
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(InterfaceC15469b interfaceC15469b, eri<Object> eriVar, lt10<Object> lt10Var, Object obj, Continuation<? super FlowKt__ShareKt$launchSharing$1> continuation) {
        super(2, continuation);
        this.$started = interfaceC15469b;
        this.$upstream = eriVar;
        this.$shared = lt10Var;
        this.$initialValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__ShareKt$launchSharing$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (p149l.jri.m142950i(r8, r1, r7) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r7.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 == r4) goto L1c
            if (r1 == r3) goto L20
            if (r1 != r2) goto L15
            goto L20
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r7)
            r7 = 0
            return r7
        L1c:
            kotlin.ResultKt.m87239b(r8)
            goto L5b
        L20:
            kotlin.ResultKt.m87239b(r8)
            goto L8c
        L24:
            kotlin.ResultKt.m87239b(r8)
            kotlinx.coroutines.flow.b r8 = r7.$started
            kotlinx.coroutines.flow.b$a r1 = kotlinx.coroutines.flow.InterfaceC15469b.INSTANCE
            kotlinx.coroutines.flow.b r6 = r1.m94161a()
            if (r8 != r6) goto L3e
            l.eri<java.lang.Object> r8 = r7.$upstream
            l.lt10<java.lang.Object> r1 = r7.$shared
            r7.label = r5
            java.lang.Object r7 = r8.collect(r1, r7)
            if (r7 != r0) goto L8c
            goto L8b
        L3e:
            kotlinx.coroutines.flow.b r8 = r7.$started
            kotlinx.coroutines.flow.b r1 = r1.m94162b()
            r5 = 0
            if (r8 != r1) goto L68
            l.lt10<java.lang.Object> r8 = r7.$shared
            l.gvf0 r8 = r8.m151661g()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r7.label = r4
            java.lang.Object r8 = p149l.jri.m142960s(r8, r1, r7)
            if (r8 != r0) goto L5b
            goto L8b
        L5b:
            l.eri<java.lang.Object> r8 = r7.$upstream
            l.lt10<java.lang.Object> r1 = r7.$shared
            r7.label = r3
            java.lang.Object r7 = r8.collect(r1, r7)
            if (r7 != r0) goto L8c
            goto L8b
        L68:
            kotlinx.coroutines.flow.b r8 = r7.$started
            l.lt10<java.lang.Object> r1 = r7.$shared
            l.gvf0 r1 = r1.m151661g()
            l.eri r8 = r8.mo94154a(r1)
            l.eri r8 = p149l.jri.m142954m(r8)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            l.eri<java.lang.Object> r3 = r7.$upstream
            l.lt10<java.lang.Object> r4 = r7.$shared
            java.lang.Object r6 = r7.$initialValue
            r1.<init>(r3, r4, r6, r5)
            r7.label = r2
            java.lang.Object r7 = p149l.jri.m142950i(r8, r1, r7)
            if (r7 != r0) goto L8c
        L8b:
            return r0
        L8c:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
