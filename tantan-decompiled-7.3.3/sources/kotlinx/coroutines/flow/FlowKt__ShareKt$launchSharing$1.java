package kotlinx.coroutines.flow;

import com.p051p1.mobile.putong.data.Careers;
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
import p153l.aui;
import p153l.drb;
import p153l.fui;
import p153l.goh0;
import p153l.l3f0;
import p153l.p3g0;
import p153l.p7f;
import p153l.t120;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m88263f = "Share.kt", m88264l = {210, 214, 215, 221}, m88265m = "invokeSuspend")
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ t120<Object> $shared;
    final /* synthetic */ InterfaceC15576b $started;
    final /* synthetic */ aui<Object> $upstream;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    @Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, Careers.f39580it, ""}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m88263f = "Share.kt", m88264l = {}, m88265m = "invokeSuspend")
    public static final class C155561 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        int label;

        public C155561(Continuation<? super C155561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C155561 c155561 = new C155561(continuation);
            c155561.I$0 = ((Number) obj).intValue();
            return c155561;
        }

        @Nullable
        public final Object invoke(int i, @Nullable Continuation<? super Boolean> continuation) {
            return ((C155561) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            uyp.m198688e();
            if (this.label == 0) {
                ResultKt.m88128b(obj);
                return Boxing.m88259a(this.I$0 > 0);
            }
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    @Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, Careers.f39580it, "Lkotlinx/coroutines/flow/SharingCommand;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m88263f = "Share.kt", m88264l = {223}, m88265m = "invokeSuspend")
    public static final class C155572 extends SuspendLambda implements Function2<SharingCommand, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ t120<Object> $shared;
        final /* synthetic */ aui<Object> $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f67521a;

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
                f67521a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C155572(aui<Object> auiVar, t120<Object> t120Var, Object obj, Continuation<? super C155572> continuation) {
            super(2, continuation);
            this.$upstream = auiVar;
            this.$shared = t120Var;
            this.$initialValue = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C155572 c155572 = new C155572(this.$upstream, this.$shared, this.$initialValue, continuation);
            c155572.L$0 = obj;
            return c155572;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SharingCommand sharingCommand, @Nullable Continuation<? super Unit> continuation) {
            return ((C155572) create(sharingCommand, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                int i2 = a.f67521a[((SharingCommand) this.L$0).ordinal()];
                if (i2 == 1) {
                    aui<Object> auiVar = this.$upstream;
                    t120<Object> t120Var = this.$shared;
                    this.label = 1;
                    if (auiVar.collect(t120Var, this) == objM198688e) {
                        return objM198688e;
                    }
                } else if (i2 == 3) {
                    Object obj2 = this.$initialValue;
                    goh0 goh0Var = l3f0.f129874a;
                    t120<Object> t120Var2 = this.$shared;
                    if (obj2 == goh0Var) {
                        t120Var2.mo95040b();
                    } else {
                        t120Var2.mo95041c(obj2);
                    }
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(InterfaceC15576b interfaceC15576b, aui<Object> auiVar, t120<Object> t120Var, Object obj, Continuation<? super FlowKt__ShareKt$launchSharing$1> continuation) {
        super(2, continuation);
        this.$started = interfaceC15576b;
        this.$upstream = auiVar;
        this.$shared = t120Var;
        this.$initialValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__ShareKt$launchSharing$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (p153l.fui.m127485i(r8, r1, r7) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.m88128b(obj);
                    aui<Object> auiVar = this.$upstream;
                    t120<Object> t120Var = this.$shared;
                    this.label = 3;
                } else if (i != 3 && i != 4) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            ResultKt.m88128b(obj);
            return Unit.INSTANCE;
        }
        ResultKt.m88128b(obj);
        InterfaceC15576b interfaceC15576b = this.$started;
        InterfaceC15576b.Companion companion = InterfaceC15576b.INSTANCE;
        if (interfaceC15576b != companion.m95054a()) {
            if (this.$started == companion.m95055b()) {
                p3g0<Integer> p3g0VarM188833g = this.$shared.m188833g();
                C155561 c155561 = new C155561(null);
                this.label = 2;
                if (fui.m127495s(p3g0VarM188833g, c155561, this) != objM198688e) {
                    aui<Object> auiVar2 = this.$upstream;
                    t120<Object> t120Var2 = this.$shared;
                    this.label = 3;
                }
            } else {
                aui auiVarM127489m = fui.m127489m(this.$started.mo95047a(this.$shared.m188833g()));
                C155572 c155572 = new C155572(this.$upstream, this.$shared, this.$initialValue, null);
                this.label = 4;
            }
            return objM198688e;
        }
        aui<Object> auiVar3 = this.$upstream;
        t120<Object> t120Var3 = this.$shared;
        this.label = 1;
    }
}
