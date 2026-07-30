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
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.bt0;
import l.e30;
import l.mqv;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.cgl;
import p002l.dfl;
import p002l.g5c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 g2\u00020\u0001:\u0001hB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001f\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u0010J\u0019\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0014¢\u0006\u0004\b)\u0010\u0010J-\u0010,\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J;\u00102\u001a\u00020\f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120.2\u0006\u0010\u0015\u001a\u00020\u00142\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00101\u001a\u00020\u0016¢\u0006\u0004\b2\u00103J1\u00104\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b4\u0010 J\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u0010J\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u0010R\"\u0010=\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010H\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010^\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010[R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u00101\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010d¨\u0006i"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "", "h0", "(Landroid/view/View;)V", "k0", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", "list", "Ll/dfl;", "listener", "", "isListOptimization", "p0", "(Ljava/util/List;Ll/dfl;Z)V", "Lcom/p1/mobile/putong/live/base/bean/LivingUsers;", "Lcom/p1/mobile/putong/live/base/data/BLiveLeaderBoards;", "Ll/e30;", "", "week", "o0", "(Lcom/p1/mobile/putong/live/base/bean/LivingUsers;Ll/e30;Ljava/lang/String;)V", "u0", "l0", "m0", "n0", "Landroid/animation/Animator;", "anim", "j0", "(Landroid/animation/Animator;)V", "onFinishInflate", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;", "leaderBoard", "r0", "(Ljava/util/List;Ll/dfl;Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveCurrentHourNotices;", "noticesList", "isCur", "s0", "(Ljava/util/List;Ll/dfl;Ljava/util/List;Z)V", "q0", "G", "t0", "d", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardHeaderView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardHeaderView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardHeaderView;)V", "_root", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardTopNoticeView;", "e", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardTopNoticeView;", "get_notice", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardTopNoticeView;", "set_notice", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardTopNoticeView;)V", "_notice", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardSecondOrThirdView;", "f", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardSecondOrThirdView;", "get_second_user", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardSecondOrThirdView;", "set_second_user", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardSecondOrThirdView;)V", "_second_user", "g", "get_third_user", "set_third_user", "_third_user", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardFirstView;", "h", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardFirstView;", "get_first_user", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardFirstView;", "set_first_user", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardFirstView;)V", "_first_user", "i", "Landroid/animation/Animator;", "firstShowAnim", "j", "secondShowAnim", "k", "thirdShowAnim", "l", "Ll/dfl;", "m", "Z", "canPlaySvga", "n", "Companion", "a", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class HourBoardHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public HourBoardHeaderView _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public HourBoardTopNoticeView _notice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public HourBoardSecondOrThirdView _second_user;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public HourBoardSecondOrThirdView _third_user;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public HourBoardFirstView _first_user;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Animator firstShowAnim;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public Animator secondShowAnim;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public Animator thirdShowAnim;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public dfl listener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean canPlaySvga;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean isCur;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardHeaderView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0445b extends AnimatorListenerAdapter {
        public C0445b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            HourBoardHeaderView.this.get_first_user().setAlpha(0.0f);
            xdl0.M0(HourBoardHeaderView.this.get_first_user(), true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardHeaderView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0446c extends AnimatorListenerAdapter {
        public C0446c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            if (HourBoardHeaderView.this.canPlaySvga) {
                HourBoardHeaderView.this.get_second_user().m8480n0(1);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            HourBoardHeaderView.this.get_second_user().setAlpha(0.0f);
            xdl0.M0(HourBoardHeaderView.this.get_second_user(), true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardHeaderView$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0447d extends AnimatorListenerAdapter {
        public C0447d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            if (HourBoardHeaderView.this.canPlaySvga) {
                HourBoardHeaderView.this.get_third_user().m8480n0(2);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            HourBoardHeaderView.this.get_third_user().setAlpha(0.0f);
            xdl0.M0(HourBoardHeaderView.this.get_third_user(), true);
        }
    }

    public /* synthetic */ HourBoardHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m8435j0(Animator anim) {
        if (anim != null) {
            anim.end();
        }
        if (anim != null) {
            anim.cancel();
        }
    }

    /* JADX INFO: renamed from: k0 */
    private final void m8436k0() {
        m8440l0();
        m8441m0();
        m8442n0();
        get_first_user().setAlpha(0.0f);
        get_second_user().setAlpha(0.0f);
        get_third_user().setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m8437u0() {
        this.canPlaySvga = true;
        Animator animator = this.firstShowAnim;
        if (animator != null) {
            animator.start();
        }
        Animator animator2 = this.secondShowAnim;
        if (animator2 != null) {
            animator2.start();
        }
        Animator animator3 = this.thirdShowAnim;
        if (animator3 != null) {
            animator3.start();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m8438G() {
        this.canPlaySvga = false;
        m8435j0(this.firstShowAnim);
        m8435j0(this.secondShowAnim);
        m8435j0(this.thirdShowAnim);
        xdl0.M0(get_first_user(), false);
        xdl0.M0(get_second_user(), false);
        xdl0.M0(get_third_user(), false);
        get_first_user().m8427l0();
        get_second_user().m8478l0();
        get_third_user().m8478l0();
    }

    @NotNull
    public final HourBoardFirstView get_first_user() {
        HourBoardFirstView hourBoardFirstView = this._first_user;
        if (hourBoardFirstView != null) {
            return hourBoardFirstView;
        }
        Intrinsics.r("_first_user");
        return null;
    }

    @NotNull
    public final HourBoardTopNoticeView get_notice() {
        HourBoardTopNoticeView hourBoardTopNoticeView = this._notice;
        if (hourBoardTopNoticeView != null) {
            return hourBoardTopNoticeView;
        }
        Intrinsics.r("_notice");
        return null;
    }

    @NotNull
    public final HourBoardHeaderView get_root() {
        HourBoardHeaderView hourBoardHeaderView = this._root;
        if (hourBoardHeaderView != null) {
            return hourBoardHeaderView;
        }
        Intrinsics.r("_root");
        return null;
    }

    @NotNull
    public final HourBoardSecondOrThirdView get_second_user() {
        HourBoardSecondOrThirdView hourBoardSecondOrThirdView = this._second_user;
        if (hourBoardSecondOrThirdView != null) {
            return hourBoardSecondOrThirdView;
        }
        Intrinsics.r("_second_user");
        return null;
    }

    @NotNull
    public final HourBoardSecondOrThirdView get_third_user() {
        HourBoardSecondOrThirdView hourBoardSecondOrThirdView = this._third_user;
        if (hourBoardSecondOrThirdView != null) {
            return hourBoardSecondOrThirdView;
        }
        Intrinsics.r("_third_user");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8439h0(View view) {
        cgl.m11036a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8440l0() {
        if (this.firstShowAnim == null) {
            Animator animatorJ = bt0.j(200);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_first_user(), (Property<HourBoardFirstView, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.play(objectAnimatorOfFloat).after(animatorJ);
            animatorSet.addListener(new C0445b());
            this.firstShowAnim = animatorSet;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m8441m0() {
        if (this.secondShowAnim == null) {
            Animator animatorJ = bt0.j(500);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_second_user(), (Property<HourBoardSecondOrThirdView, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(get_second_user(), (Property<HourBoardSecondOrThirdView, Float>) View.TRANSLATION_X, t100.i, 0.0f);
            objectAnimatorOfFloat2.setDuration(1000L);
            objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).after(animatorJ);
            animatorSet.addListener(new C0446c());
            this.secondShowAnim = animatorSet;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m8442n0() {
        if (this.thirdShowAnim == null) {
            Animator animatorJ = bt0.j(500);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_third_user(), (Property<HourBoardSecondOrThirdView, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(get_third_user(), (Property<HourBoardSecondOrThirdView, Float>) View.TRANSLATION_X, -t100.i, 0.0f);
            objectAnimatorOfFloat2.setDuration(1000L);
            objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).after(animatorJ);
            animatorSet.addListener(new C0447d());
            this.thirdShowAnim = animatorSet;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m8443o0(LivingUsers<BLiveLeaderBoards> list, e30<String> listener, String week) {
        if (list.isEmpty()) {
            get_first_user().m8433r0();
            get_second_user().m8484t0(1);
            get_third_user().m8484t0(2);
            return;
        }
        if (list.size() < 3) {
            get_third_user().m8484t0(2);
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            mqv<BLiveLeaderBoards> mqvVar = (mqv) obj;
            if (i == 0) {
                HourBoardFirstView hourBoardFirstView = get_first_user();
                mqvVar.getClass();
                hourBoardFirstView.m8432q0(mqvVar, listener, week);
            } else if (i == 1) {
                HourBoardSecondOrThirdView hourBoardSecondOrThirdView = get_second_user();
                mqvVar.getClass();
                hourBoardSecondOrThirdView.m8483s0(mqvVar, listener, i, week);
            } else if (i == 2) {
                HourBoardSecondOrThirdView hourBoardSecondOrThirdView2 = get_third_user();
                mqvVar.getClass();
                hourBoardSecondOrThirdView2.m8483s0(mqvVar, listener, i, week);
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8439h0(this);
        m8436k0();
        setTag(Integer.valueOf(g5c0.f10801B3));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m8444p0(List<? extends BLiveHourLeaderBoardItem> list, dfl listener, boolean isListOptimization) {
        if (list.isEmpty()) {
            get_first_user().m8433r0();
            get_second_user().m8484t0(1);
            get_third_user().m8484t0(2);
            return;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem = (BLiveHourLeaderBoardItem) obj;
            if (i == 0) {
                get_first_user().m8431p0(bLiveHourLeaderBoardItem, listener);
                if (isListOptimization) {
                    get_first_user().setHeartColorAndText(this.isCur);
                }
            } else if (i == 1) {
                get_second_user().m8482r0(bLiveHourLeaderBoardItem, listener, i);
                if (isListOptimization) {
                    get_second_user().setHeartColorAndText(bLiveHourLeaderBoardItem);
                }
            } else if (i == 2) {
                get_third_user().m8482r0(bLiveHourLeaderBoardItem, listener, i);
                if (isListOptimization) {
                    get_third_user().setHeartColorAndText(bLiveHourLeaderBoardItem);
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m8445q0(@NotNull LivingUsers<BLiveLeaderBoards> list, @NotNull e30<String> listener, @NotNull String week) {
        list.getClass();
        listener.getClass();
        week.getClass();
        xdl0.M(get_notice(), false);
        xdl0.X(get_first_user(), t100.d(30.0f));
        m8443o0(list, listener, week);
        m8437u0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m8446r0(@NotNull List<? extends BLiveHourLeaderBoardItem> list, @NotNull dfl listener, @Nullable BLiveHourLeaderBoard leaderBoard) {
        list.getClass();
        listener.getClass();
        this.listener = listener;
        xdl0.X(get_first_user(), get_notice().m8488i0(leaderBoard) ? 0 : t100.d(30.0f));
        m8444p0(list, listener, false);
        if (leaderBoard == null || leaderBoard.isFinishHeaderAnim) {
            return;
        }
        m8437u0();
        leaderBoard.isFinishHeaderAnim = true;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m8447s0(@NotNull List<? extends BLiveHourLeaderBoardItem> list, @NotNull dfl listener, @NotNull List<BLiveCurrentHourNotices> noticesList, boolean isCur) {
        list.getClass();
        listener.getClass();
        noticesList.getClass();
        this.listener = listener;
        this.isCur = isCur;
        xdl0.X(get_first_user(), get_notice().m8489j0(noticesList) ? 0 : t100.d(30.0f));
        m8444p0(list, listener, true);
        m8437u0();
    }

    public final void set_first_user(@NotNull HourBoardFirstView hourBoardFirstView) {
        hourBoardFirstView.getClass();
        this._first_user = hourBoardFirstView;
    }

    public final void set_notice(@NotNull HourBoardTopNoticeView hourBoardTopNoticeView) {
        hourBoardTopNoticeView.getClass();
        this._notice = hourBoardTopNoticeView;
    }

    public final void set_root(@NotNull HourBoardHeaderView hourBoardHeaderView) {
        hourBoardHeaderView.getClass();
        this._root = hourBoardHeaderView;
    }

    public final void set_second_user(@NotNull HourBoardSecondOrThirdView hourBoardSecondOrThirdView) {
        hourBoardSecondOrThirdView.getClass();
        this._second_user = hourBoardSecondOrThirdView;
    }

    public final void set_third_user(@NotNull HourBoardSecondOrThirdView hourBoardSecondOrThirdView) {
        hourBoardSecondOrThirdView.getClass();
        this._third_user = hourBoardSecondOrThirdView;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m8448t0() {
        get_first_user().m8427l0();
        get_second_user().m8478l0();
        get_third_user().m8478l0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.isCur = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardHeaderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
