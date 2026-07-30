package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.ap0;
import l.hxs;
import l.mep0;
import l.t100;
import l.xdl0;
import l.ydt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.lfl;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardDialogTopAnimView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "isHourBoard", "l0", "(Z)V", "k0", "j0", "show", "F0", "Landroid/view/View;", "view", "h0", "(Landroid/view/View;)V", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "get_bottom_bg", "()Lv/VDraweeView;", "set_bottom_bg", "(Lv/VDraweeView;)V", "_bottom_bg", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "e", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_bg_svga", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_bg_svga", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_bg_svga", "Lv/VImage;", "f", "Lv/VImage;", "get_top_bg", "()Lv/VImage;", "set_top_bg", "(Lv/VImage;)V", "_top_bg", "Landroid/animation/Animator;", "g", "Landroid/animation/Animator;", "bgAnim", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HourBoardDialogTopAnimView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _bottom_bg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public AnimEffectPlayer _bg_svga;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _top_bg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Animator bgAnim;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardDialogTopAnimView$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0442a extends AnimatorListenerAdapter {
        public C0442a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            xdl0.M0(HourBoardDialogTopAnimView.this.get_bg_svga(), true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardDialogTopAnimView$b", "Ll/ap0;", "", "g", "()V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0443b extends ap0 {
        public C0443b() {
        }

        /* JADX INFO: renamed from: g */
        public void m8421g() {
            super.g();
            Animator animator = HourBoardDialogTopAnimView.this.bgAnim;
            if (animator != null) {
                animator.start();
            }
        }
    }

    public /* synthetic */ HourBoardDialogTopAnimView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m8416F0(boolean show) {
        xdl0.M(get_bottom_bg(), show);
        xdl0.M(get_bg_svga(), show);
        xdl0.M(get_top_bg(), show);
    }

    @NotNull
    public final AnimEffectPlayer get_bg_svga() {
        AnimEffectPlayer animEffectPlayer = this._bg_svga;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_bg_svga");
        return null;
    }

    @NotNull
    public final VDraweeView get_bottom_bg() {
        VDraweeView vDraweeView = this._bottom_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bottom_bg");
        return null;
    }

    @NotNull
    public final VImage get_top_bg() {
        VImage vImage = this._top_bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_top_bg");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8417h0(View view) {
        lfl.m17202a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8418j0() {
        Animator animator = this.bgAnim;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.bgAnim;
        if (animator2 != null) {
            animator2.end();
        }
        Animator animator3 = this.bgAnim;
        if (animator3 != null) {
            animator3.removeAllListeners();
        }
        get_bg_svga().o();
        xdl0.M0(get_bg_svga(), false);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8419k0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_bg_svga(), (Property<AnimEffectPlayer, Float>) View.TRANSLATION_X, -t100.d(100.0f), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(1500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(get_bg_svga(), (Property<AnimEffectPlayer, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat2.setDuration(1500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new C0442a());
        this.bgAnim = animatorSet;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8420l0(boolean isHourBoard) {
        if (isHourBoard) {
            hxs.s("context_livingAct", get_bottom_bg(), ydt.H);
        } else {
            hxs.s("context_livingAct", get_bottom_bg(), ydt.y);
        }
        get_bg_svga().o();
        get_bg_svga().l(isHourBoard ? "https://auto.tancdn.com/v1/raw/f9f9b9db-0e97-4823-8f39-547baf3e7f4f12.pdf" : "https://fe-static.tancdn.com/v1/raw/ed012a8a-8019-44d8-b2ae-201e6a2a2fe212.svga", -1, new C0443b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8417h0(this);
        int i = t100.q;
        mep0.c1(this, 0, 0, 0, -i, i);
    }

    public final void set_bg_svga(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._bg_svga = animEffectPlayer;
    }

    public final void set_bottom_bg(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._bottom_bg = vDraweeView;
    }

    public final void set_top_bg(@NotNull VImage vImage) {
        vImage.getClass();
        this._top_bg = vImage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardDialogTopAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardDialogTopAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardDialogTopAnimView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
