package com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import l.hh3;
import l.ppb;
import l.qkq0;
import l.uwp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0})
@DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$2$1", f = "SuperLikeComboAnimView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class SuperLikeComboAnimView$animIn$2$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needShadow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$2$1$1 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0})
    @DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$2$1$1", f = "SuperLikeComboAnimView.kt", l = {319}, m = "invokeSuspend", v = 1)
    public static final class C03381 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $needShadow;
        int label;
        final /* synthetic */ SuperLikeComboAnimView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03381(SuperLikeComboAnimView superLikeComboAnimView, boolean z, Continuation<? super C03381> continuation) {
            super(2, continuation);
            this.this$0 = superLikeComboAnimView;
            this.$needShadow = z;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C03381(this.this$0, this.$needShadow, continuation);
        }

        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return create(ppbVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objE = uwp.e();
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                SuperLikeComboAnimView superLikeComboAnimView = this.this$0;
                boolean z = this.$needShadow;
                this.label = 1;
                if (superLikeComboAnimView.m9185q(z, this) == objE) {
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$2$1$2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0})
    @DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$2$1$2", f = "SuperLikeComboAnimView.kt", l = {320}, m = "invokeSuspend", v = 1)
    public static final class C03392 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SuperLikeComboAnimView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03392(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super C03392> continuation) {
            super(2, continuation);
            this.this$0 = superLikeComboAnimView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C03392(this.this$0, continuation);
        }

        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return create(ppbVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objE = uwp.e();
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                SuperLikeComboAnimView superLikeComboAnimView = this.this$0;
                this.label = 1;
                if (superLikeComboAnimView.m9188t(this) == objE) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$animIn$2$1(SuperLikeComboAnimView superLikeComboAnimView, boolean z, Continuation<? super SuperLikeComboAnimView$animIn$2$1> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
        this.$needShadow = z;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuperLikeComboAnimView$animIn$2$1 superLikeComboAnimView$animIn$2$1 = new SuperLikeComboAnimView$animIn$2$1(this.this$0, this.$needShadow, continuation);
        superLikeComboAnimView$animIn$2$1.L$0 = obj;
        return superLikeComboAnimView$animIn$2$1;
    }

    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return create(ppbVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ppb ppbVar = (ppb) this.L$0;
        uwp.e();
        if (this.label != 0) {
            qkq0.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.b(obj);
        hh3.d(ppbVar, (CoroutineContext) null, (CoroutineStart) null, new C03381(this.this$0, this.$needShadow, null), 3, (Object) null);
        hh3.d(ppbVar, (CoroutineContext) null, (CoroutineStart) null, new C03392(this.this$0, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
