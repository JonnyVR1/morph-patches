package com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.eri;
import p149l.fri;
import p149l.jri;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
@DebugMetadata(m87373c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1", m87374f = "SuperLikeComboAnimView.kt", m87375l = {313}, m87376m = "invokeSuspend", m87377v = 1)
public final class SuperLikeComboAnimView$animIn$1$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFemale;
    int I$0;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$1 */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/fri;", "", "", "<anonymous>", "(Ll/fri;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
    @DebugMetadata(m87373c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$1", m87374f = "SuperLikeComboAnimView.kt", m87375l = {308, 309}, m87376m = "invokeSuspend", m87377v = 1)
    public static final class C88991 extends SuspendLambda implements Function2<fri<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $frameDuration;
        final /* synthetic */ boolean $isFemale;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C88991(boolean z, int i, Continuation<? super C88991> continuation) {
            super(2, continuation);
            this.$isFemale = z;
            this.$frameDuration = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88991 c88991 = new C88991(this.$isFemale, this.$frameDuration, continuation);
            c88991.L$0 = obj;
            return c88991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fri<? super Integer> friVar, Continuation<? super Unit> continuation) {
            return ((C88991) create(friVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0051  */
        /* JADX WARN: Code duplicated, block: B:19:0x006a A[PHI: r2 r5 r6 r10
          0x006a: PHI (r2v2 int) = (r2v3 int), (r2v6 int) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x006a: PHI (r5v1 int) = (r5v2 int), (r5v6 int) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x006a: PHI (r6v0 int) = (r6v2 int), (r6v4 int) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x006a: PHI (r10v7 int[]) = (r10v8 int[]), (r10v11 int[]) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x0082  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        
            if (kotlinx.coroutines.DelayKt.m93611b(r7, r9) == r1) goto L21;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007d -> B:22:0x0080). Please report as a decompilation issue!!! */
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
                if (r2 == 0) goto L39
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1f
                int r2 = r9.I$1
                int r5 = r9.I$0
                java.lang.Object r6 = r9.L$1
                int[] r6 = (int[]) r6
                kotlin.ResultKt.m87239b(r10)
                r10 = r6
                goto L80
            L1f:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                p149l.qkq0.m175383a(r9)
                r9 = 0
                return r9
            L26:
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
                goto L6a
            L39:
                kotlin.ResultKt.m87239b(r10)
                boolean r10 = r9.$isFemale
                if (r10 == 0) goto L47
                com.p1.mobile.putong.core.ui.superlikeopt.upgrade.a$a r10 = com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.C8910a.INSTANCE
                int[] r10 = r10.m55822j()
                goto L4d
            L47:
                com.p1.mobile.putong.core.ui.superlikeopt.upgrade.a$a r10 = com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.C8910a.INSTANCE
                int[] r10 = r10.m55823k()
            L4d:
                int r2 = r10.length
                r5 = 0
            L4f:
                if (r5 >= r2) goto L82
                r6 = r10[r5]
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.m87371b(r6)
                r9.L$0 = r0
                r9.L$1 = r10
                r9.I$0 = r5
                r9.I$1 = r2
                r9.I$2 = r6
                r9.label = r4
                java.lang.Object r7 = r0.emit(r7, r9)
                if (r7 != r1) goto L6a
                goto L7f
            L6a:
                int r7 = r9.$frameDuration
                long r7 = (long) r7
                r9.L$0 = r0
                r9.L$1 = r10
                r9.I$0 = r5
                r9.I$1 = r2
                r9.I$2 = r6
                r9.label = r3
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.m93611b(r7, r9)
                if (r6 != r1) goto L80
            L7f:
                return r1
            L80:
                int r5 = r5 + r4
                goto L4f
            L82:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1.C88991.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$2 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m87232d2 = {"<anonymous>", "", Careers.f38732it, ""}, m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$2", m87374f = "SuperLikeComboAnimView.kt", m87375l = {}, m87376m = "invokeSuspend", m87377v = 1)
    public static final class C89002 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ SuperLikeComboAnimView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C89002(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super C89002> continuation) {
            super(2, continuation);
            this.this$0 = superLikeComboAnimView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89002 c89002 = new C89002(this.this$0, continuation);
            c89002.I$0 = ((Number) obj).intValue();
            return c89002;
        }

        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((C89002) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.this$0.get_superlike_foreground().setImageResource(i);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8901a<T> implements fri {
        public static final C8901a<T> INSTANCE = new C8901a<>();

        /* JADX INFO: renamed from: a */
        public final Object m55793a(int i, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        @Override // p149l.fri
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m55793a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$animIn$1$1(boolean z, SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$animIn$1$1> continuation) {
        super(2, continuation);
        this.$isFemale = z;
        this.this$0 = superLikeComboAnimView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuperLikeComboAnimView$animIn$1$1(this.$isFemale, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((SuperLikeComboAnimView$animIn$1$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            eri eriVarM142933E = jri.m142933E(jri.m142964w(new C88991(this.$isFemale, 17, null)), new C89002(this.this$0, null));
            fri friVar = C8901a.INSTANCE;
            this.I$0 = 17;
            this.label = 1;
            if (eriVarM142933E.collect(friVar, this) == objM196133e) {
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
