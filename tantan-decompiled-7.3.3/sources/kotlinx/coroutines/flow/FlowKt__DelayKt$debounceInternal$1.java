package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.SelectImplementation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.goh0;
import p153l.h350;
import p153l.p7f;
import p153l.uyp;
import p153l.wg3;
import p153l.wtq0;
import p153l.xo50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "Ll/bui;", "downstream", "", "<anonymous>", "(Ll/drb;Ll/bui;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m88263f = "Delay.kt", m88264l = {215, 418}, m88265m = "invokeSuspend")
@SourceDebugExtension
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements Function3<drb, bui<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ aui<Object> $this_debounceInternal;
    final /* synthetic */ Function1<Object, Long> $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(Function1<Object, Long> function1, aui<Object> auiVar, Continuation<? super FlowKt__DelayKt$debounceInternal$1> continuation) {
        super(3, continuation);
        this.$timeoutMillisSelector = function1;
        this.$this_debounceInternal = auiVar;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @NotNull bui<Object> buiVar, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, continuation);
        flowKt__DelayKt$debounceInternal$1.L$0 = drbVar;
        flowKt__DelayKt$debounceInternal$1.L$1 = buiVar;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0086  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2 A[PHI: r1 r5 r6 r7
      0x00a2: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:29:0x00a0, B:15:0x006b, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r5v3 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:29:0x00a0, B:15:0x006b, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r6v2 kotlinx.coroutines.channels.ReceiveChannel) = 
      (r6v4 kotlinx.coroutines.channels.ReceiveChannel)
      (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
      (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
     binds: [B:29:0x00a0, B:15:0x006b, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r7v2 l.bui) = (r7v4 l.bui), (r7v5 l.bui), (r7v5 l.bui) binds: [B:29:0x00a0, B:15:0x006b, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r7.emit(r15, r14) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        if (r7.mo95209p(r14) == r0) goto L38;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00de -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        bui buiVar;
        ReceiveChannel receiveChannel;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef2;
        ReceiveChannel receiveChannel2;
        bui buiVar2;
        SelectImplementation selectImplementation;
        Object obj2;
        goh0 goh0Var;
        long jLongValue;
        Object obj3;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = (drb) this.L$0;
            bui buiVar3 = (bui) this.L$1;
            ReceiveChannel receiveChannelM94874d = ProduceKt.m94874d(drbVar, null, 0, new FlowKt__DelayKt$debounceInternal$1$values$1(this.$this_debounceInternal, null), 3, null);
            objectRef = new Ref.ObjectRef();
            buiVar = buiVar3;
            receiveChannel = receiveChannelM94874d;
            if (objectRef.element != h350.f107616c) {
                return Unit.INSTANCE;
            }
            longRef = new Ref.LongRef();
            obj2 = objectRef.element;
            if (obj2 != null) {
                Function1<Object, Long> function1 = this.$timeoutMillisSelector;
                goh0Var = h350.f107614a;
                if (obj2 == goh0Var) {
                    obj2 = null;
                }
                jLongValue = function1.invoke(obj2).longValue();
                longRef.element = jLongValue;
                if (jLongValue < 0) {
                    wg3.m206174a("Debounce timeout should not be negative");
                    return null;
                }
                if (jLongValue != 0) {
                    longRef2 = longRef;
                    objectRef2 = objectRef;
                    receiveChannel2 = receiveChannel;
                    buiVar2 = buiVar;
                    selectImplementation = new SelectImplementation(getContext());
                    if (objectRef2.element != 0) {
                        xo50.m212461a(selectImplementation, longRef2.element, new FlowKt__DelayKt$debounceInternal$1$3$1(buiVar2, objectRef2, null));
                    }
                    selectImplementation.mo95204e(receiveChannel2.mo94785o(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, buiVar2, null));
                    this.L$0 = buiVar2;
                    this.L$1 = receiveChannel2;
                    this.L$2 = objectRef2;
                    this.L$3 = null;
                    this.label = 2;
                } else {
                    obj3 = objectRef.element;
                    if (obj3 == goh0Var) {
                        obj3 = null;
                    }
                    this.L$0 = buiVar;
                    this.L$1 = receiveChannel;
                    this.L$2 = objectRef;
                    this.L$3 = longRef;
                    this.label = 1;
                }
            } else {
                longRef2 = longRef;
                objectRef2 = objectRef;
                receiveChannel2 = receiveChannel;
                buiVar2 = buiVar;
                selectImplementation = new SelectImplementation(getContext());
                if (objectRef2.element != 0) {
                    xo50.m212461a(selectImplementation, longRef2.element, new FlowKt__DelayKt$debounceInternal$1$3$1(buiVar2, objectRef2, null));
                }
                selectImplementation.mo95204e(receiveChannel2.mo94785o(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, buiVar2, null));
                this.L$0 = buiVar2;
                this.L$1 = receiveChannel2;
                this.L$2 = objectRef2;
                this.L$3 = null;
                this.label = 2;
            }
            return objM198688e;
        }
        if (i == 1) {
            longRef = (Ref.LongRef) this.L$3;
            objectRef = (Ref.ObjectRef) this.L$2;
            receiveChannel = (ReceiveChannel) this.L$1;
            buiVar = (bui) this.L$0;
            ResultKt.m88128b(obj);
            objectRef.element = null;
            longRef2 = longRef;
            objectRef2 = objectRef;
            receiveChannel2 = receiveChannel;
            buiVar2 = buiVar;
            selectImplementation = new SelectImplementation(getContext());
            if (objectRef2.element != 0) {
                xo50.m212461a(selectImplementation, longRef2.element, new FlowKt__DelayKt$debounceInternal$1$3$1(buiVar2, objectRef2, null));
            }
            selectImplementation.mo95204e(receiveChannel2.mo94785o(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, buiVar2, null));
            this.L$0 = buiVar2;
            this.L$1 = receiveChannel2;
            this.L$2 = objectRef2;
            this.L$3 = null;
            this.label = 2;
        } else {
            if (i != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef2 = (Ref.ObjectRef) this.L$2;
            receiveChannel2 = (ReceiveChannel) this.L$1;
            buiVar2 = (bui) this.L$0;
            ResultKt.m88128b(obj);
        }
        buiVar = buiVar2;
        receiveChannel = receiveChannel2;
        objectRef = objectRef2;
        if (objectRef.element != h350.f107616c) {
            return Unit.INSTANCE;
        }
        longRef = new Ref.LongRef();
        obj2 = objectRef.element;
        if (obj2 != null) {
            Function1<Object, Long> function2 = this.$timeoutMillisSelector;
            goh0Var = h350.f107614a;
            if (obj2 == goh0Var) {
                obj2 = null;
            }
            jLongValue = function2.invoke(obj2).longValue();
            longRef.element = jLongValue;
            if (jLongValue < 0) {
                wg3.m206174a("Debounce timeout should not be negative");
                return null;
            }
            if (jLongValue != 0) {
                longRef2 = longRef;
                objectRef2 = objectRef;
                receiveChannel2 = receiveChannel;
                buiVar2 = buiVar;
                selectImplementation = new SelectImplementation(getContext());
                if (objectRef2.element != 0) {
                    xo50.m212461a(selectImplementation, longRef2.element, new FlowKt__DelayKt$debounceInternal$1$3$1(buiVar2, objectRef2, null));
                }
                selectImplementation.mo95204e(receiveChannel2.mo94785o(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, buiVar2, null));
                this.L$0 = buiVar2;
                this.L$1 = receiveChannel2;
                this.L$2 = objectRef2;
                this.L$3 = null;
                this.label = 2;
            } else {
                obj3 = objectRef.element;
                if (obj3 == goh0Var) {
                    obj3 = null;
                }
                this.L$0 = buiVar;
                this.L$1 = receiveChannel;
                this.L$2 = objectRef;
                this.L$3 = longRef;
                this.label = 1;
            }
        } else {
            longRef2 = longRef;
            objectRef2 = objectRef;
            receiveChannel2 = receiveChannel;
            buiVar2 = buiVar;
            selectImplementation = new SelectImplementation(getContext());
            if (objectRef2.element != 0) {
                xo50.m212461a(selectImplementation, longRef2.element, new FlowKt__DelayKt$debounceInternal$1$3$1(buiVar2, objectRef2, null));
            }
            selectImplementation.mo95204e(receiveChannel2.mo94785o(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, buiVar2, null));
            this.L$0 = buiVar2;
            this.L$1 = receiveChannel2;
            this.L$2 = objectRef2;
            this.L$3 = null;
            this.label = 2;
        }
        return objM198688e;
    }
}
