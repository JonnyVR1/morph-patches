package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.p6n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/IntlConversationOnlyBoostView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "i0", "Landroid/view/View;", "view", "h0", "(Landroid/view/View;)V", "Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;", "d", "Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;", "get_iv_boost", "()Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;", "set_iv_boost", "(Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;)V", "_iv_boost", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlConversationOnlyBoostView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public AnimEffectPlayer _iv_boost;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlConversationOnlyBoostView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    @NotNull
    public final AnimEffectPlayer get_iv_boost() {
        AnimEffectPlayer animEffectPlayer = this._iv_boost;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_iv_boost");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m5784h0(View view) {
        p6n.a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m5785i0() {
        CoreModule.c.K0.w3(get_iv_boost());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5784h0(this);
    }

    public final void set_iv_boost(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._iv_boost = animEffectPlayer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlConversationOnlyBoostView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlConversationOnlyBoostView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
