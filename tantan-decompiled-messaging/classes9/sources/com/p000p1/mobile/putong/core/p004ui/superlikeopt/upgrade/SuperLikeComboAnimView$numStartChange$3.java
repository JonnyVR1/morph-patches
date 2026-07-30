package com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import l.qkq0;
import l.uwp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$numStartChange$3", f = "SuperLikeComboAnimView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class SuperLikeComboAnimView$numStartChange$3 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$numStartChange$3(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$numStartChange$3> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuperLikeComboAnimView$numStartChange$3 superLikeComboAnimView$numStartChange$3 = new SuperLikeComboAnimView$numStartChange$3(this.this$0, continuation);
        superLikeComboAnimView$numStartChange$3.I$0 = ((Number) obj).intValue();
        return superLikeComboAnimView$numStartChange$3;
    }

    public final Object invoke(int i, Continuation<? super Boolean> continuation) {
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
        boolean z = true;
        if (this.this$0.getGuideCard() && i > 3) {
            z = false;
        }
        return Boxing.a(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Boolean>) obj2);
    }
}
