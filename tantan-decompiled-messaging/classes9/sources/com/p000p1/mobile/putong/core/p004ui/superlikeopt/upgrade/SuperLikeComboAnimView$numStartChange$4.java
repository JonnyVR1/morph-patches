package com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import l.qkq0;
import l.uwp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$numStartChange$4", f = "SuperLikeComboAnimView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class SuperLikeComboAnimView$numStartChange$4 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needShadow;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$numStartChange$4(SuperLikeComboAnimView superLikeComboAnimView, boolean z, Continuation<? super SuperLikeComboAnimView$numStartChange$4> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
        this.$needShadow = z;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuperLikeComboAnimView$numStartChange$4(this.this$0, this.$needShadow, continuation);
    }

    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return create(Integer.valueOf(i), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        uwp.e();
        if (this.label != 0) {
            qkq0.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.b(obj);
        this.this$0.m9180l();
        this.this$0.m9183o(this.$needShadow);
        this.this$0.m9181m();
        this.this$0.m9184p();
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
    }
}
