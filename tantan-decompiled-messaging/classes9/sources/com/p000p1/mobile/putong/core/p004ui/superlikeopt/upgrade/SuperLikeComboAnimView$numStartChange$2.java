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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll/fri;", "", "", "<anonymous>", "(Ll/fri;)V"}, k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0})
@DebugMetadata(c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$numStartChange$2", f = "SuperLikeComboAnimView.kt", l = {331, 332}, m = "invokeSuspend", v = 1)
public final class SuperLikeComboAnimView$numStartChange$2 extends SuspendLambda implements Function2<fri<? super Integer>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$numStartChange$2(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$numStartChange$2> continuation) {
        super(2, continuation);
        this.this$0 = superLikeComboAnimView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuperLikeComboAnimView$numStartChange$2 superLikeComboAnimView$numStartChange$2 = new SuperLikeComboAnimView$numStartChange$2(this.this$0, continuation);
        superLikeComboAnimView$numStartChange$2.L$0 = obj;
        return superLikeComboAnimView$numStartChange$2;
    }

    public final Object invoke(fri<? super Integer> friVar, Continuation<? super Unit> continuation) {
        return create(friVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:11:0x0021). Please report as a decompilation issue!!! */
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
            goto L48
        L1e:
            kotlin.ResultKt.b(r8)
        L21:
            com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView r8 = r7.this$0
            boolean r8 = r8.getBlock()
            if (r8 != 0) goto L60
            com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView r8 = r7.this$0
            int r2 = r8.getSuperLikeCount()
            int r2 = r2 + r4
            r8.setSuperLikeCount(r2)
            com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView r8 = r7.this$0
            int r8 = r8.getSuperLikeCount()
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.b(r8)
            r7.L$0 = r0
            r7.label = r4
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L48
            goto L5f
        L48:
            com.p1.mobile.putong.core.ui.superlikeopt.upgrade.a$a r8 = com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade.C0346a.INSTANCE
            com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView r2 = r7.this$0
            int r2 = r2.getSuperLikeCount()
            int r8 = r8.m9223m(r2)
            long r5 = (long) r8
            r7.L$0 = r0
            r7.label = r3
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r5, r7)
            if (r8 != r1) goto L21
        L5f:
            return r1
        L60:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade.SuperLikeComboAnimView$numStartChange$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
