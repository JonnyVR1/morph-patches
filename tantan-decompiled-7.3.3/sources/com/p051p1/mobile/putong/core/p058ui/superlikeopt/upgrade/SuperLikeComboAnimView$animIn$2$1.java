package com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
@DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$2$1", m88263f = "SuperLikeComboAnimView.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
public final class SuperLikeComboAnimView$animIn$2$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needShadow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$2$1$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
    @DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$2$1$1", m88263f = "SuperLikeComboAnimView.kt", m88264l = {319}, m88265m = "invokeSuspend", m88266v = 1)
    public static final class C90651 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $needShadow;
        int label;
        final /* synthetic */ SuperLikeComboAnimView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C90651(SuperLikeComboAnimView superLikeComboAnimView, boolean z, Continuation<? super C90651> continuation) {
            super(2, continuation);
            this.this$0 = superLikeComboAnimView;
            this.$needShadow = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C90651(this.this$0, this.$needShadow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C90651) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                SuperLikeComboAnimView superLikeComboAnimView = this.this$0;
                boolean z = this.$needShadow;
                this.label = 1;
                if (superLikeComboAnimView.m56970q(z, this) == objM198688e) {
                    return objM198688e;
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$2$1$2 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
    @DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$2$1$2", m88263f = "SuperLikeComboAnimView.kt", m88264l = {320}, m88265m = "invokeSuspend", m88266v = 1)
    public static final class C90662 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SuperLikeComboAnimView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C90662(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super C90662> continuation) {
            super(2, continuation);
            this.this$0 = superLikeComboAnimView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C90662(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C90662) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                SuperLikeComboAnimView superLikeComboAnimView = this.this$0;
                this.label = 1;
                if (superLikeComboAnimView.m56973t(this) == objM198688e) {
                    return objM198688e;
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
    public SuperLikeComboAnimView$animIn$2$1(SuperLikeComboAnimView superLikeComboAnimView, boolean z, Continuation<? super SuperLikeComboAnimView$animIn$2$1> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
        this.$needShadow = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuperLikeComboAnimView$animIn$2$1 superLikeComboAnimView$animIn$2$1 = new SuperLikeComboAnimView$animIn$2$1(this.this$0, this.$needShadow, continuation);
        superLikeComboAnimView$animIn$2$1.L$0 = obj;
        return superLikeComboAnimView$animIn$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((SuperLikeComboAnimView$animIn$2$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        drb drbVar = (drb) this.L$0;
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        xh3.m210980d(drbVar, null, null, new C90651(this.this$0, this.$needShadow, null), 3, null);
        xh3.m210980d(drbVar, null, null, new C90662(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
