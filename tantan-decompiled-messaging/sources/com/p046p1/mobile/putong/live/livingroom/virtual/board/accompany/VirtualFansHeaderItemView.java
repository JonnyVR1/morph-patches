package com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany;

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
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bt0;
import p149l.g5c0;
import p149l.kjn0;
import p149l.t100;
import p149l.wpl0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 D2\u00020\u0001:\u0001EB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ#\u0010\u0017\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0018\u0010?\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010:R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansHeaderItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "j0", "()V", "o0", "k0", "l0", "m0", "onFinishInflate", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", "list", "Ll/kjn0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "n0", "(Ljava/util/List;Ll/kjn0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansHeaderItemView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansHeaderItemView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansHeaderItemView;)V", "_root", "Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardSecondOrThirdView;", "e", "Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardSecondOrThirdView;", "get_second_user", "()Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardSecondOrThirdView;", "set_second_user", "(Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardSecondOrThirdView;)V", "_second_user", "f", "get_third_user", "set_third_user", "_third_user", "Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardFirstView;", "g", "Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardFirstView;", "get_first_user", "()Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardFirstView;", "set_first_user", "(Lcom/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansBoardFirstView;)V", "_first_user", "Landroid/animation/Animator;", "h", "Landroid/animation/Animator;", "firstShowAnim", RXScreenCaptureService.KEY_INDEX, "secondShowAnim", "j", "thirdShowAnim", "", "k", "Z", "canPlaySvga", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class VirtualFansHeaderItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VirtualFansHeaderItemView _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VirtualFansBoardSecondOrThirdView _second_user;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VirtualFansBoardSecondOrThirdView _third_user;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VirtualFansBoardFirstView _first_user;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Animator firstShowAnim;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Animator secondShowAnim;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public Animator thirdShowAnim;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean canPlaySvga;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansHeaderItemView$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansHeaderItemView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12951b extends AnimatorListenerAdapter {
        public C12951b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            VirtualFansHeaderItemView.this.get_first_user().setAlpha(0.0f);
            xdl0.m208345M0(VirtualFansHeaderItemView.this.get_first_user(), true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansHeaderItemView$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansHeaderItemView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12952c extends AnimatorListenerAdapter {
        public C12952c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            if (VirtualFansHeaderItemView.this.canPlaySvga) {
                VirtualFansHeaderItemView.this.get_second_user().m76860k0(1);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            VirtualFansHeaderItemView.this.get_second_user().setAlpha(0.0f);
            xdl0.m208345M0(VirtualFansHeaderItemView.this.get_second_user(), true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansHeaderItemView$d */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/board/accompany/VirtualFansHeaderItemView$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12953d extends AnimatorListenerAdapter {
        public C12953d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            if (VirtualFansHeaderItemView.this.canPlaySvga) {
                VirtualFansHeaderItemView.this.get_third_user().m76860k0(2);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            VirtualFansHeaderItemView.this.get_third_user().setAlpha(0.0f);
            xdl0.m208345M0(VirtualFansHeaderItemView.this.get_third_user(), true);
        }
    }

    public /* synthetic */ VirtualFansHeaderItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m76864j0() {
        m76865k0();
        m76866l0();
        m76867m0();
        get_first_user().setAlpha(0.0f);
        get_second_user().setAlpha(0.0f);
        get_third_user().setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m76865k0() {
        if (this.firstShowAnim == null) {
            Animator animatorM103737j = bt0.m103737j(200);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_first_user(), (Property<VirtualFansBoardFirstView, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.play(objectAnimatorOfFloat).after(animatorM103737j);
            animatorSet.addListener(new C12951b());
            this.firstShowAnim = animatorSet;
        }
    }

    /* JADX INFO: renamed from: l0 */
    private final void m76866l0() {
        if (this.secondShowAnim == null) {
            Animator animatorM103737j = bt0.m103737j(500);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_second_user(), (Property<VirtualFansBoardSecondOrThirdView, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(get_second_user(), (Property<VirtualFansBoardSecondOrThirdView, Float>) View.TRANSLATION_X, t100.f167260i, 0.0f);
            objectAnimatorOfFloat2.setDuration(1000L);
            objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).after(animatorM103737j);
            animatorSet.addListener(new C12952c());
            this.secondShowAnim = animatorSet;
        }
    }

    /* JADX INFO: renamed from: m0 */
    private final void m76867m0() {
        if (this.thirdShowAnim == null) {
            Animator animatorM103737j = bt0.m103737j(500);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_third_user(), (Property<VirtualFansBoardSecondOrThirdView, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(get_third_user(), (Property<VirtualFansBoardSecondOrThirdView, Float>) View.TRANSLATION_X, -t100.f167260i, 0.0f);
            objectAnimatorOfFloat2.setDuration(1000L);
            objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).after(animatorM103737j);
            animatorSet.addListener(new C12953d());
            this.thirdShowAnim = animatorSet;
        }
    }

    /* JADX INFO: renamed from: o0 */
    private final void m76868o0() {
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

    @NotNull
    public final VirtualFansBoardFirstView get_first_user() {
        VirtualFansBoardFirstView virtualFansBoardFirstView = this._first_user;
        if (virtualFansBoardFirstView != null) {
            return virtualFansBoardFirstView;
        }
        Intrinsics.m87502r("_first_user");
        return null;
    }

    @NotNull
    public final VirtualFansHeaderItemView get_root() {
        VirtualFansHeaderItemView virtualFansHeaderItemView = this._root;
        if (virtualFansHeaderItemView != null) {
            return virtualFansHeaderItemView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final VirtualFansBoardSecondOrThirdView get_second_user() {
        VirtualFansBoardSecondOrThirdView virtualFansBoardSecondOrThirdView = this._second_user;
        if (virtualFansBoardSecondOrThirdView != null) {
            return virtualFansBoardSecondOrThirdView;
        }
        Intrinsics.m87502r("_second_user");
        return null;
    }

    @NotNull
    public final VirtualFansBoardSecondOrThirdView get_third_user() {
        VirtualFansBoardSecondOrThirdView virtualFansBoardSecondOrThirdView = this._third_user;
        if (virtualFansBoardSecondOrThirdView != null) {
            return virtualFansBoardSecondOrThirdView;
        }
        Intrinsics.m87502r("_third_user");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76869h0(View view) {
        wpl0.m204927a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m76870n0(@NotNull List<BLiveVoiceHourLeaderBoardItem> list, @NotNull kjn0 listener) {
        list.getClass();
        listener.getClass();
        xdl0.m208360X(get_first_user(), t100.m186890d(30.0f));
        get_first_user().m76853n0();
        get_second_user().m76862n0(1);
        get_third_user().m76862n0(2);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem = (BLiveVoiceHourLeaderBoardItem) obj;
            if (i == 0) {
                get_first_user().m76852m0(bLiveVoiceHourLeaderBoardItem, listener);
            } else if (i == 1) {
                get_second_user().m76861m0(bLiveVoiceHourLeaderBoardItem, listener, i);
            } else if (i == 2) {
                get_third_user().m76861m0(bLiveVoiceHourLeaderBoardItem, listener, i);
            }
            i = i2;
        }
        m76868o0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76869h0(this);
        m76864j0();
        setTag(Integer.valueOf(g5c0.f100651B3));
    }

    public final void set_first_user(@NotNull VirtualFansBoardFirstView virtualFansBoardFirstView) {
        virtualFansBoardFirstView.getClass();
        this._first_user = virtualFansBoardFirstView;
    }

    public final void set_root(@NotNull VirtualFansHeaderItemView virtualFansHeaderItemView) {
        virtualFansHeaderItemView.getClass();
        this._root = virtualFansHeaderItemView;
    }

    public final void set_second_user(@NotNull VirtualFansBoardSecondOrThirdView virtualFansBoardSecondOrThirdView) {
        virtualFansBoardSecondOrThirdView.getClass();
        this._second_user = virtualFansBoardSecondOrThirdView;
    }

    public final void set_third_user(@NotNull VirtualFansBoardSecondOrThirdView virtualFansBoardSecondOrThirdView) {
        virtualFansBoardSecondOrThirdView.getClass();
        this._third_user = virtualFansBoardSecondOrThirdView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VirtualFansHeaderItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VirtualFansHeaderItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VirtualFansHeaderItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
