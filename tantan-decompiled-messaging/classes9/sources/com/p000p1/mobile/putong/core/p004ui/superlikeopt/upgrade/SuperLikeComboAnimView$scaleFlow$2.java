package com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import l.fri;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll/fri;", "", "<anonymous>", "(Ll/fri;)V"}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0})
@DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$scaleFlow$2", f = "SuperLikeComboAnimView.kt", l = {359, 360}, m = "invokeSuspend", v = 1)
public final class SuperLikeComboAnimView$scaleFlow$2 extends SuspendLambda implements Function2<fri<? super Unit>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$scaleFlow$2(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$scaleFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuperLikeComboAnimView$scaleFlow$2 superLikeComboAnimView$scaleFlow$2 = new SuperLikeComboAnimView$scaleFlow$2(this.this$0, continuation);
        superLikeComboAnimView$scaleFlow$2.L$0 = obj;
        return superLikeComboAnimView$scaleFlow$2;
    }

    public final Object invoke(fri<? super Unit> friVar, Continuation<? super Unit> continuation) {
        return create(friVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0040 -> B:11:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            l.fri r0 = (l.fri) r0
            java.lang.Object r1 = l.uwp.e()
            int r2 = r7.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1e
            if (r2 == r4) goto L1a
            if (r2 != r3) goto L13
            goto L1e
        L13:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            l.qkq0.a(r7)
            r7 = 0
            return r7
        L1a:
            kotlin.ResultKt.b(r8)
            goto L36
        L1e:
            kotlin.ResultKt.b(r8)
        L21:
            com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView r8 = r7.this$0
            boolean r8 = r8.getBlock()
            if (r8 != 0) goto L43
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r7.L$0 = r0
            r7.label = r4
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L36
            goto L42
        L36:
            r7.L$0 = r0
            r7.label = r3
            r5 = 300(0x12c, double:1.48E-321)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r5, r7)
            if (r8 != r1) goto L21
        L42:
            return r1
        L43:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade.SuperLikeComboAnimView$scaleFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
