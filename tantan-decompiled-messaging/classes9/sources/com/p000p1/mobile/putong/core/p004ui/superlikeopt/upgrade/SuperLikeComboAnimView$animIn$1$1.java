package com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import l.eri;
import l.fri;
import l.jri;
import l.ppb;
import l.qkq0;
import l.uwp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0})
@DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1", f = "SuperLikeComboAnimView.kt", l = {313}, m = "invokeSuspend", v = 1)
public final class SuperLikeComboAnimView$animIn$1$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFemale;
    int I$0;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$1 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll/fri;", "", "", "<anonymous>", "(Ll/fri;)V"}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0})
    @DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$1", f = "SuperLikeComboAnimView.kt", l = {308, 309}, m = "invokeSuspend", v = 1)
    public static final class C03351 extends SuspendLambda implements Function2<fri<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $frameDuration;
        final /* synthetic */ boolean $isFemale;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03351(boolean z, int i, Continuation<? super C03351> continuation) {
            super(2, continuation);
            this.$isFemale = z;
            this.$frameDuration = i;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C03351 c03351 = new C03351(this.$isFemale, this.$frameDuration, continuation);
            c03351.L$0 = obj;
            return c03351;
        }

        public final Object invoke(fri<? super Integer> friVar, Continuation<? super Unit> continuation) {
            return create(friVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0051  */
        /* JADX WARN: Code duplicated, block: B:19:0x006a A[PHI: r2 r5 r6 r10
          0x006a: PHI (r2v2 int) = (r2v3 int), (r2v6 int) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x006a: PHI (r5v1 int) = (r5v2 int), (r5v6 int) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x006a: PHI (r6v0 int) = (r6v2 int), (r6v4 int) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x006a: PHI (r10v7 int[]) = (r10v8 int[]), (r10v11 int[]) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x0082  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        
            if (kotlinx.coroutines.DelayKt.b(r7, r9) == r1) goto L21;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007d -> B:22:0x0080). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.L$0
                l.fri r0 = (l.fri) r0
                java.lang.Object r1 = l.uwp.e()
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
                kotlin.ResultKt.b(r10)
                r10 = r6
                goto L80
            L1f:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                l.qkq0.a(r9)
                r9 = 0
                return r9
            L26:
                int r2 = r9.I$2
                int r5 = r9.I$1
                int r6 = r9.I$0
                java.lang.Object r7 = r9.L$1
                int[] r7 = (int[]) r7
                kotlin.ResultKt.b(r10)
                r10 = r6
                r6 = r2
                r2 = r5
                r5 = r10
                r10 = r7
                goto L6a
            L39:
                kotlin.ResultKt.b(r10)
                boolean r10 = r9.$isFemale
                if (r10 == 0) goto L47
                com.p1.mobile.putong.core.ui.superlikeopt.upgrade.a$a r10 = com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade.C0346a.INSTANCE
                int[] r10 = r10.m9220j()
                goto L4d
            L47:
                com.p1.mobile.putong.core.ui.superlikeopt.upgrade.a$a r10 = com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade.C0346a.INSTANCE
                int[] r10 = r10.m9221k()
            L4d:
                int r2 = r10.length
                r5 = 0
            L4f:
                if (r5 >= r2) goto L82
                r6 = r10[r5]
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.b(r6)
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
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.b(r7, r9)
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
            throw new UnsupportedOperationException("Method not decompiled: com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1.C03351.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$2 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$2", f = "SuperLikeComboAnimView.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class C03362 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ SuperLikeComboAnimView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03362(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super C03362> continuation) {
            super(2, continuation);
            this.this$0 = superLikeComboAnimView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C03362 c03362 = new C03362(this.this$0, continuation);
            c03362.I$0 = ((Number) obj).intValue();
            return c03362;
        }

        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            uwp.e();
            if (this.label != 0) {
                qkq0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.b(obj);
            this.this$0.get_superlike_foreground().setImageResource(i);
            return Unit.INSTANCE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$a */
    @Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
    public static final class C0337a<T> implements fri {
        public static final C0337a<T> INSTANCE = new C0337a<>();

        /* JADX INFO: renamed from: a */
        public final Object m9191a(int i, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m9191a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$animIn$1$1(boolean z, SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$animIn$1$1> continuation) {
        super(2, continuation);
        this.$isFemale = z;
        this.this$0 = superLikeComboAnimView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuperLikeComboAnimView$animIn$1$1(this.$isFemale, this.this$0, continuation);
    }

    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return create(ppbVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objE = uwp.e();
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            eri eriVarE = jri.E(jri.w(new C03351(this.$isFemale, 17, null)), new C03362(this.this$0, null));
            fri friVar = C0337a.INSTANCE;
            this.I$0 = 17;
            this.label = 1;
            if (eriVarE.collect(friVar, this) == objE) {
                return objE;
            }
        } else {
            if (i != 1) {
                qkq0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.b(obj);
        }
        return Unit.INSTANCE;
    }
}
