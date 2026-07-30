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
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.fs4;
import p153l.p7f;
import p153l.sme0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"R", p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m88263f = "Combine.kt", m88264l = {51, EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE, 76}, m88265m = "invokeSuspend")
public final class CombineKt$combineInternal$2 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<T[]> $arrayFactory;
    final /* synthetic */ aui<T>[] $flows;
    final /* synthetic */ bui<R> $this_combineInternal;
    final /* synthetic */ Function3<bui<? super R>, T[], Continuation<? super Unit>, Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"R", p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m88263f = "Combine.kt", m88264l = {28}, m88265m = "invokeSuspend")
    public static final class C155791 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ aui<T>[] $flows;

        /* JADX INFO: renamed from: $i */
        final /* synthetic */ int f67558$i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ fs4<IndexedValue<Object>> $resultChannel;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name */
        @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"<anonymous>", "", "R", p7f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
        public static final class AnonymousClass1<T> implements bui {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ fs4<IndexedValue<Object>> f67559a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f67560b;

            public AnonymousClass1(fs4<IndexedValue<Object>> fs4Var, int i) {
                this.f67559a = fs4Var;
                this.f67560b = i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
            
                if (p153l.vmq0.m201769a(r0) == r1) goto L21;
             */
            @Override // p153l.bui
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
                CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                if (continuation instanceof CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) continuation;
                    int i = combineKt$combineInternal$2$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
                    }
                } else {
                    combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
                }
                Object obj = combineKt$combineInternal$2$1$1$emit$1.result;
                Object objM198688e = uyp.m198688e();
                int i2 = combineKt$combineInternal$2$1$1$emit$1.label;
                if (i2 == 0) {
                    ResultKt.m88128b(obj);
                    fs4<IndexedValue<Object>> fs4Var = this.f67559a;
                    IndexedValue<Object> indexedValue = new IndexedValue<>(this.f67560b, t);
                    combineKt$combineInternal$2$1$1$emit$1.label = 1;
                    if (fs4Var.mo94679E(indexedValue, combineKt$combineInternal$2$1$1$emit$1) != objM198688e) {
                    }
                    return objM198688e;
                }
                if (i2 == 1) {
                    ResultKt.m88128b(obj);
                } else {
                    if (i2 != 2) {
                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.m88128b(obj);
                }
                return Unit.INSTANCE;
                combineKt$combineInternal$2$1$1$emit$1.label = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C155791(aui<? extends T>[] auiVarArr, int i, AtomicInteger atomicInteger, fs4<IndexedValue<Object>> fs4Var, Continuation<? super C155791> continuation) {
            super(2, continuation);
            this.$flows = auiVarArr;
            this.f67558$i = i;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = fs4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C155791(this.$flows, this.f67558$i, this.$nonClosed, this.$resultChannel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C155791) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.m88128b(obj);
                    aui[] auiVarArr = this.$flows;
                    int i2 = this.f67558$i;
                    aui auiVar = auiVarArr[i2];
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resultChannel, i2);
                    this.label = 1;
                    if (auiVar.collect(anonymousClass1, this) == objM198688e) {
                        return objM198688e;
                    }
                } else {
                    if (i != 1) {
                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.m88128b(obj);
                }
                if (this.$nonClosed.decrementAndGet() == 0) {
                    sme0.C20105a.m186808a(this.$resultChannel, null, 1, null);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    sme0.C20105a.m186808a(this.$resultChannel, null, 1, null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(aui<? extends T>[] auiVarArr, Function0<T[]> function0, Function3<? super bui<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, bui<? super R> buiVar, Continuation<? super CombineKt$combineInternal$2> continuation) {
        super(2, continuation);
        this.$flows = auiVarArr;
        this.$arrayFactory = function0;
        this.$transform = function3;
        this.$this_combineInternal = buiVar;
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
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((CombineKt$combineInternal$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
