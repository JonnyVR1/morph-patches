package com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import l.fri;
import l.qkq0;
import l.uwp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll/fri;", "", "", "cause", "<anonymous>", "(Ll/fri;Ljava/lang/Throwable;)V"}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0})
@DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$scaleFlow$4", f = "SuperLikeComboAnimView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class SuperLikeComboAnimView$scaleFlow$4 extends SuspendLambda implements Function3<fri<? super Unit>, Throwable, Continuation<? super Unit>, Object> {
    int label;

    public SuperLikeComboAnimView$scaleFlow$4(Continuation<? super SuperLikeComboAnimView$scaleFlow$4> continuation) {
        super(3, continuation);
    }

    public final Object invoke(fri<? super Unit> friVar, Throwable th, Continuation<? super Unit> continuation) {
        return new SuperLikeComboAnimView$scaleFlow$4(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        uwp.e();
        if (this.label == 0) {
            ResultKt.b(obj);
            return Unit.INSTANCE;
        }
        qkq0.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
