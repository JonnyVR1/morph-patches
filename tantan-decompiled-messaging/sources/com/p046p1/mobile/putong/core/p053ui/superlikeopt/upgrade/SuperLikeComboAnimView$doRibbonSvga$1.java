package com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade;

import android.content.Context;
import android.widget.FrameLayout;
import com.tantan.library.svga.SVGALoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import p149l.bt0;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
@DebugMetadata(m87373c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doRibbonSvga$1", m87374f = "SuperLikeComboAnimView.kt", m87375l = {396}, m87376m = "invokeSuspend", m87377v = 1)
public final class SuperLikeComboAnimView$doRibbonSvga$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$doRibbonSvga$1(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$doRibbonSvga$1> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuperLikeComboAnimView$doRibbonSvga$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((SuperLikeComboAnimView$doRibbonSvga$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            this.label = 1;
            if (DelayKt.m93611b(420L, this) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        xdl0.m208344M(this.this$0.get_ribbon_svga(), true);
        bt0.m103739l(this.this$0.get_ribbon_svga(), FrameLayout.ALPHA, 0L, 680L, null, 0.0f, 1.0f);
        Context context = this.this$0.getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/d23810ba-ea6c-41a1-9a9f-c6a889e1a15713.pdf").autoPlay(true).repeatCount(-1).into(this.this$0.get_ribbon_svga());
        return Unit.INSTANCE;
    }
}
