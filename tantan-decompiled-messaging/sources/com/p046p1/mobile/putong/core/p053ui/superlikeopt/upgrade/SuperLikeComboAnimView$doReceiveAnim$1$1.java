package com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade;

import com.alibaba.fastjson.asm.Opcodes;
import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import p149l.eri;
import p149l.fri;
import p149l.jri;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
@DebugMetadata(m87373c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1", m87374f = "SuperLikeComboAnimView.kt", m87375l = {Opcodes.IFNULL}, m87376m = "invokeSuspend", m87377v = 1)
final class SuperLikeComboAnimView$doReceiveAnim$1$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFemale;
    final /* synthetic */ int $received;
    int I$0;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$1 */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/fri;", "", "", "<anonymous>", "(Ll/fri;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
    @DebugMetadata(m87373c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$1", m87374f = "SuperLikeComboAnimView.kt", m87375l = {192, 193}, m87376m = "invokeSuspend", m87377v = 1)
    public static final class C89051 extends SuspendLambda implements Function2<fri<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $frameDuration;
        final /* synthetic */ boolean $isFemale;
        final /* synthetic */ int $received;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C89051(int i, boolean z, int i2, Continuation<? super C89051> continuation) {
            super(2, continuation);
            this.$received = i;
            this.$isFemale = z;
            this.$frameDuration = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89051 c89051 = new C89051(this.$received, this.$isFemale, this.$frameDuration, continuation);
            c89051.L$0 = obj;
            return c89051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fri<? super Integer> friVar, Continuation<? super Unit> continuation) {
            return ((C89051) create(friVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x007c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0095 A[PHI: r2 r5 r6 r10
          0x0095: PHI (r2v4 int) = (r2v5 int), (r2v8 int) binds: [B:27:0x0092, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x0095: PHI (r5v2 int) = (r5v3 int), (r5v7 int) binds: [B:27:0x0092, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x0095: PHI (r6v0 int) = (r6v2 int), (r6v4 int) binds: [B:27:0x0092, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x0095: PHI (r10v16 int[]) = (r10v17 int[]), (r10v20 int[]) binds: [B:27:0x0092, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
        
            if (kotlinx.coroutines.DelayKt.m93611b(r7, r9) == r1) goto L31;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a8 -> B:32:0x00ab). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = r9.L$0
                l.fri r0 = (p149l.fri) r0
                java.lang.Object r1 = p149l.uwp.m196133e()
                int r2 = r9.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L27
                if (r2 != r3) goto L20
                int r2 = r9.I$1
                int r5 = r9.I$0
                java.lang.Object r6 = r9.L$1
                int[] r6 = (int[]) r6
                kotlin.ResultKt.m87239b(r10)
                r10 = r6
                goto Lab
            L20:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                p149l.qkq0.m175383a(r9)
                r9 = 0
                return r9
            L27:
                int r2 = r9.I$2
                int r5 = r9.I$1
                int r6 = r9.I$0
                java.lang.Object r7 = r9.L$1
                int[] r7 = (int[]) r7
                kotlin.ResultKt.m87239b(r10)
                r10 = r6
                r6 = r2
                r2 = r5
                r5 = r10
                r10 = r7
                goto L95
            L3a:
                kotlin.ResultKt.m87239b(r10)
                int r10 = r9.$received
                r2 = 3
                if (r10 > r2) goto L54
                boolean r10 = r9.$isFemale
                if (r10 == 0) goto L4d
                com.p1.mobile.putong.core.ui.superlikeopt.upgrade.a$a r10 = com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.C8910a.INSTANCE
                int[] r10 = r10.m55816d()
                goto L78
            L4d:
                com.p1.mobile.putong.core.ui.superlikeopt.upgrade.a$a r10 = com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.C8910a.INSTANCE
                int[] r10 = r10.m55817e()
                goto L78
            L54:
                boolean r2 = r9.$isFemale
                r5 = 6
                if (r10 > r5) goto L69
                if (r2 == 0) goto L62
                com.p1.mobile.putong.core.ui.superlikeopt.upgrade.a$a r10 = com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.C8910a.INSTANCE
                int[] r10 = r10.m55818f()
                goto L78
            L62:
                com.p1.mobile.putong.core.ui.superlikeopt.upgrade.a$a r10 = com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.C8910a.INSTANCE
                int[] r10 = r10.m55819g()
                goto L78
            L69:
                if (r2 == 0) goto L72
                com.p1.mobile.putong.core.ui.superlikeopt.upgrade.a$a r10 = com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.C8910a.INSTANCE
                int[] r10 = r10.m55820h()
                goto L78
            L72:
                com.p1.mobile.putong.core.ui.superlikeopt.upgrade.a$a r10 = com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.C8910a.INSTANCE
                int[] r10 = r10.m55821i()
            L78:
                int r2 = r10.length
                r5 = 0
            L7a:
                if (r5 >= r2) goto Lad
                r6 = r10[r5]
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.m87371b(r6)
                r9.L$0 = r0
                r9.L$1 = r10
                r9.I$0 = r5
                r9.I$1 = r2
                r9.I$2 = r6
                r9.label = r4
                java.lang.Object r7 = r0.emit(r7, r9)
                if (r7 != r1) goto L95
                goto Laa
            L95:
                int r7 = r9.$frameDuration
                long r7 = (long) r7
                r9.L$0 = r0
                r9.L$1 = r10
                r9.I$0 = r5
                r9.I$1 = r2
                r9.I$2 = r6
                r9.label = r3
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.m93611b(r7, r9)
                if (r6 != r1) goto Lab
            Laa:
                return r1
            Lab:
                int r5 = r5 + r4
                goto L7a
            Lad:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1.C89051.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$2 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m87232d2 = {"<anonymous>", "", Careers.f38732it, ""}, m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$2", m87374f = "SuperLikeComboAnimView.kt", m87375l = {}, m87376m = "invokeSuspend", m87377v = 1)
    public static final class C89062 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ SuperLikeComboAnimView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C89062(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super C89062> continuation) {
            super(2, continuation);
            this.this$0 = superLikeComboAnimView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89062 c89062 = new C89062(this.this$0, continuation);
            c89062.I$0 = ((Number) obj).intValue();
            return c89062;
        }

        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((C89062) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.I$0;
            uwp.m196133e();
            if (this.label != 0) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
            this.this$0.get_receive_superlike_img().setImageResource(i);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$3 */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"Ll/fri;", "", "", "cause", "", "<anonymous>", "(Ll/fri;Ljava/lang/Throwable;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
    @DebugMetadata(m87373c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$3", m87374f = "SuperLikeComboAnimView.kt", m87375l = {}, m87376m = "invokeSuspend", m87377v = 1)
    public static final class C89073 extends SuspendLambda implements Function3<fri<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
        int label;

        public C89073(Continuation<? super C89073> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(fri<? super Integer> friVar, Throwable th, Continuation<? super Unit> continuation) {
            return new C89073(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            uwp.m196133e();
            if (this.label == 0) {
                ResultKt.m87239b(obj);
                return Unit.INSTANCE;
            }
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8908a<T> implements fri {
        public static final C8908a<T> INSTANCE = new C8908a<>();

        /* JADX INFO: renamed from: a */
        public final Object m55795a(int i, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        @Override // p149l.fri
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m55795a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$doReceiveAnim$1$1(int i, boolean z, SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$doReceiveAnim$1$1> continuation) {
        super(2, continuation);
        this.$received = i;
        this.$isFemale = z;
        this.this$0 = superLikeComboAnimView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuperLikeComboAnimView$doReceiveAnim$1$1(this.$received, this.$isFemale, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((SuperLikeComboAnimView$doReceiveAnim$1$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            eri eriVarM142947f = jri.m142947f(jri.m142933E(jri.m142964w(new C89051(this.$received, this.$isFemale, 17, null)), new C89062(this.this$0, null)), new C89073(null));
            fri friVar = C8908a.INSTANCE;
            this.I$0 = 17;
            this.label = 1;
            if (eriVarM142947f.collect(friVar, this) == objM196133e) {
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
