package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import p149l.eri;
import p149l.fri;
import p149l.gr4;
import p149l.j6f;
import p149l.nee0;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"R", j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m87374f = "Combine.kt", m87375l = {51, EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE, 76}, m87376m = "invokeSuspend")
public final class CombineKt$combineInternal$2 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<T[]> $arrayFactory;
    final /* synthetic */ eri<T>[] $flows;
    final /* synthetic */ fri<R> $this_combineInternal;
    final /* synthetic */ Function3<fri<? super R>, T[], Continuation<? super Unit>, Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"R", j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m87374f = "Combine.kt", m87375l = {28}, m87376m = "invokeSuspend")
    public static final class C154721 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ eri<T>[] $flows;

        /* JADX INFO: renamed from: $i */
        final /* synthetic */ int f66884$i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ gr4<IndexedValue<Object>> $resultChannel;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"<anonymous>", "", "R", j6f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
        public static final class AnonymousClass1<T> implements fri {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gr4<IndexedValue<Object>> f66885a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f66886b;

            public AnonymousClass1(gr4<IndexedValue<Object>> gr4Var, int i) {
                this.f66885a = gr4Var;
                this.f66886b = i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
            
                if (p149l.qdq0.m174085a(r0) == r1) goto L21;
             */
            @Override // p149l.fri
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = p149l.uwp.m196133e()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L37
                    if (r2 == r4) goto L33
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.m87239b(r7)
                    goto L55
                L2c:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    p149l.qkq0.m175383a(r5)
                    r5 = 0
                    return r5
                L33:
                    kotlin.ResultKt.m87239b(r7)
                    goto L4c
                L37:
                    kotlin.ResultKt.m87239b(r7)
                    l.gr4<kotlin.collections.IndexedValue<java.lang.Object>> r7 = r5.f66885a
                    kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                    int r5 = r5.f66886b
                    r2.<init>(r5, r6)
                    r0.label = r4
                    java.lang.Object r5 = r7.mo93787E(r2, r0)
                    if (r5 != r1) goto L4c
                    goto L54
                L4c:
                    r0.label = r3
                    java.lang.Object r5 = p149l.qdq0.m174085a(r0)
                    if (r5 != r1) goto L55
                L54:
                    return r1
                L55:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.C154721.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C154721(eri<? extends T>[] eriVarArr, int i, AtomicInteger atomicInteger, gr4<IndexedValue<Object>> gr4Var, Continuation<? super C154721> continuation) {
            super(2, continuation);
            this.$flows = eriVarArr;
            this.f66884$i = i;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = gr4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C154721(this.$flows, this.f66884$i, this.$nonClosed, this.$resultChannel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C154721) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.m87239b(obj);
                    eri[] eriVarArr = this.$flows;
                    int i2 = this.f66884$i;
                    eri eriVar = eriVarArr[i2];
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resultChannel, i2);
                    this.label = 1;
                    if (eriVar.collect(anonymousClass1, this) == objM196133e) {
                        return objM196133e;
                    }
                } else {
                    if (i != 1) {
                        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.m87239b(obj);
                }
                if (this.$nonClosed.decrementAndGet() == 0) {
                    nee0.C18682a.m159110a(this.$resultChannel, null, 1, null);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    nee0.C18682a.m159110a(this.$resultChannel, null, 1, null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(eri<? extends T>[] eriVarArr, Function0<T[]> function0, Function3<? super fri<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, fri<? super R> friVar, Continuation<? super CombineKt$combineInternal$2> continuation) {
        super(2, continuation);
        this.$flows = eriVarArr;
        this.$arrayFactory = function0;
        this.$transform = function3;
        this.$this_combineInternal = friVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, continuation);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((CombineKt$combineInternal$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5 A[EDGE_INSN: B:35:0x00e5->B:44:0x0128 BREAK  A[LOOP:0: B:28:0x00c0->B:47:?]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:28:0x00c0->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0105 -> B:44:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0125 -> B:44:0x0128). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x0108
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
