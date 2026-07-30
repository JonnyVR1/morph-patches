package com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade;

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
import p153l.bnl0;
import p153l.drb;
import p153l.gt0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
@DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doRibbonSvga$1", m88263f = "SuperLikeComboAnimView.kt", m88264l = {396}, m88265m = "invokeSuspend", m88266v = 1)
public final class SuperLikeComboAnimView$doRibbonSvga$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
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
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((SuperLikeComboAnimView$doRibbonSvga$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            this.label = 1;
            if (DelayKt.m94502b(420L, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        bnl0.m105524M(this.this$0.get_ribbon_svga(), true);
        gt0.m132166l(this.this$0.get_ribbon_svga(), FrameLayout.ALPHA, 0L, 680L, null, 0.0f, 1.0f);
        Context context = this.this$0.getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/d23810ba-ea6c-41a1-9a9f-c6a889e1a15713.pdf").autoPlay(true).repeatCount(-1).into(this.this$0.get_ribbon_svga());
        return Unit.INSTANCE;
    }
}
