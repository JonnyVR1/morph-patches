package com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.tantan.library.svga.SVGALoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import l.bt0;
import l.ppb;
import l.qkq0;
import l.uwp;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0})
@DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doRibbonSvga$1", f = "SuperLikeComboAnimView.kt", l = {396}, m = "invokeSuspend", v = 1)
public final class SuperLikeComboAnimView$doRibbonSvga$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$doRibbonSvga$1(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$doRibbonSvga$1> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuperLikeComboAnimView$doRibbonSvga$1(this.this$0, continuation);
    }

    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return create(ppbVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objE = uwp.e();
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.label = 1;
            if (DelayKt.b(420L, this) == objE) {
                return objE;
            }
        } else {
            if (i != 1) {
                qkq0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.b(obj);
        }
        xdl0.M(this.this$0.get_ribbon_svga(), true);
        bt0.l(this.this$0.get_ribbon_svga(), FrameLayout.ALPHA, 0L, 680L, (Interpolator) null, new float[]{0.0f, 1.0f});
        Context context = this.this$0.getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/d23810ba-ea6c-41a1-9a9f-c6a889e1a15713.pdf").autoPlay(true).repeatCount(-1).into(this.this$0.get_ribbon_svga());
        return Unit.INSTANCE;
    }
}
