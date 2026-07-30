package com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.undolike;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.undolike.UndoCoverAnimView;
import com.p000p1.mobile.putong.data.OMSTemplateModeType;
import com.p000p1.mobile.putong.data.User;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p1.mobile.putong.core.data.DislikedUsers;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.b3c0;
import l.bne0;
import l.e30;
import l.eqh0;
import l.mqi0;
import l.qib0;
import l.qqi0;
import l.t100;
import l.unj0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 g2\u00020\u0001:\u0001(B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\n2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\nH\u0014¢\u0006\u0004\b$\u0010\u0015J\u001f\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'R\"\u0010-\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\fR\"\u00104\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010N\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR\"\u0010U\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010X\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010F\u001a\u0004\bV\u0010H\"\u0004\bW\u0010JR\"\u0010[\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010)\u001a\u0004\bY\u0010+\"\u0004\bZ\u0010\fR\"\u0010b\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010dR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010f¨\u0006h"}, d2 = {"Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoCoverAnimView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "b", "(Landroid/view/View;)V", "Landroid/animation/Animator;", "f", "()Landroid/animation/Animator;", RXScreenCaptureService.KEY_INDEX, "g", "h", "m", "e", "()V", "Lcom/p1/mobile/putong/core/data/DislikedUsers;", "item", "k", "(Lcom/p1/mobile/putong/core/data/DislikedUsers;)V", "Lcom/p1/mobile/putong/data/User;", "user", "l", "(Lcom/p1/mobile/putong/data/User;)V", "Ll/e30;", "", "animCallback", "setAnimCallback", "(Ll/e30;)V", "onFinishInflate", "onDetachedFromWindow", "itemView", "j", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/DislikedUsers;)V", "a", "Landroid/view/View;", "get_background", "()Landroid/view/View;", "set_background", "_background", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoFlipFrameLayout;", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoFlipFrameLayout;", "get_undo_flip_layout", "()Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoFlipFrameLayout;", "set_undo_flip_layout", "(Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoFlipFrameLayout;)V", "_undo_flip_layout", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Landroidx/constraintlayout/widget/ConstraintLayout;", "d", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_personal_info", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_personal_info", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_personal_info", "Lv/VText;", "Lv/VText;", "get_online_status", "()Lv/VText;", "set_online_status", "(Lv/VText;)V", "_online_status", "get_user_info", "set_user_info", "_user_info", "Lv/VImage;", "Lv/VImage;", "get_action_btn", "()Lv/VImage;", "set_action_btn", "(Lv/VImage;)V", "_action_btn", "get_new_user", "set_new_user", "_new_user", "get_mask", "set_mask", "_mask", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_heart", "()Landroid/widget/ImageView;", "set_heart", "(Landroid/widget/ImageView;)V", "_heart", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "animatorSet", "Ll/e30;", "Companion", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UndoCoverAnimView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m */
    public static final float f136m = t100.o * (-1.0f);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View _background;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public UndoFlipFrameLayout _undo_flip_layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _personal_info;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _online_status;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _user_info;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _action_btn;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _new_user;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View _mask;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public ImageView _heart;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public AnimatorSet animatorSet;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> animCallback;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.likedusers.tablayout.undolike.UndoCoverAnimView$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoCoverAnimView$a;", "", "<init>", "()V", "", "HEART_APPEAR_TRANS_X", "F", "a", "()F", "", "BG_ALPHA_DURATION", "J", "HEART_APPEAR_ALPHA_DURATION", "HEART_APPEAR_TRANS_X_DURATION", "BG_ALPHA_DISAPPEAR_DELAY_DURATION", "", "CALLBACK_DISMISS", "I", "CALLBACK_REQUEST", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final float m537a() {
            return UndoCoverAnimView.f136m;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.likedusers.tablayout.undolike.UndoCoverAnimView$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoCoverAnimView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0016b extends AnimatorListenerAdapter {
        public C0016b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            UndoCoverAnimView.this.get_background().setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            super.onAnimationStart(animation);
            UndoCoverAnimView.this.get_background().setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.likedusers.tablayout.undolike.UndoCoverAnimView$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoCoverAnimView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0017c extends AnimatorListenerAdapter {
        public C0017c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            super.onAnimationStart(animation);
            UndoCoverAnimView.this.get_heart().setTranslationX(UndoCoverAnimView.INSTANCE.m537a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.likedusers.tablayout.undolike.UndoCoverAnimView$d */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"com/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoCoverAnimView$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "", "a", "Z", "animCallbackEnable", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0018d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean animCallbackEnable = true;

        public C0018d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            animation.getClass();
            super.onAnimationCancel(animation);
            this.animCallbackEnable = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            e30 e30Var;
            animation.getClass();
            super.onAnimationEnd(animation);
            if (!this.animCallbackEnable || (e30Var = UndoCoverAnimView.this.animCallback) == null) {
                return;
            }
            e30Var.call(1);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            super.onAnimationStart(animation);
            UndoCoverAnimView.this.get_heart().setTranslationX(UndoCoverAnimView.INSTANCE.m537a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.likedusers.tablayout.undolike.UndoCoverAnimView$e */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoCoverAnimView$e", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0019e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f153a;

        public C0019e(View view) {
            this.f153a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            super.onAnimationStart(animation);
            this.f153a.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.likedusers.tablayout.undolike.UndoCoverAnimView$f */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoCoverAnimView$f", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0020f extends AnimatorListenerAdapter {
        public C0020f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            e30 e30Var = UndoCoverAnimView.this.animCallback;
            if (e30Var != null) {
                e30Var.call(0);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public UndoCoverAnimView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static void m524a(UndoCoverAnimView undoCoverAnimView, View view) {
        undoCoverAnimView.m528e();
        undoCoverAnimView.get_undo_flip_layout().setAnimatorListener(new C0019e(view));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        undoCoverAnimView.get_undo_flip_layout().m554q(iArr[0], iArr[1]);
        Animator animatorM529f = undoCoverAnimView.m529f();
        Animator animatorM532i = undoCoverAnimView.m532i();
        AnimatorSet animatorSet = new AnimatorSet();
        undoCoverAnimView.animatorSet = animatorSet;
        animatorSet.playSequentially(animatorM529f, animatorM532i);
        AnimatorSet animatorSet2 = undoCoverAnimView.animatorSet;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m527b(View view) {
        unj0.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m528e() {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.animatorSet = null;
    }

    /* JADX INFO: renamed from: f */
    public final Animator m529f() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_background(), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.addListener(new C0016b());
            objectAnimatorOfFloat.setDuration(183L);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, get_undo_flip_layout().m551l());
        return animatorSet;
    }

    /* JADX INFO: renamed from: g */
    public final Animator m530g() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_heart(), (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new C0017c());
        objectAnimatorOfFloat.setDuration(217L);
        return objectAnimatorOfFloat;
    }

    @NotNull
    public final VImage get_action_btn() {
        VImage vImage = this._action_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_action_btn");
        return null;
    }

    @NotNull
    public final View get_background() {
        View view = this._background;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_background");
        return null;
    }

    @NotNull
    public final ImageView get_heart() {
        ImageView imageView = this._heart;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_heart");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_image");
        return null;
    }

    @NotNull
    public final View get_mask() {
        View view = this._mask;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_mask");
        return null;
    }

    @NotNull
    public final VText get_new_user() {
        VText vText = this._new_user;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_new_user");
        return null;
    }

    @NotNull
    public final VText get_online_status() {
        VText vText = this._online_status;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_online_status");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_personal_info() {
        ConstraintLayout constraintLayout = this._personal_info;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_personal_info");
        return null;
    }

    @NotNull
    public final UndoFlipFrameLayout get_undo_flip_layout() {
        UndoFlipFrameLayout undoFlipFrameLayout = this._undo_flip_layout;
        if (undoFlipFrameLayout != null) {
            return undoFlipFrameLayout;
        }
        Intrinsics.r("_undo_flip_layout");
        return null;
    }

    @NotNull
    public final VText get_user_info() {
        VText vText = this._user_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_user_info");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Animator m531h() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_heart(), (Property<ImageView, Float>) View.TRANSLATION_X, f136m, 0.0f);
        objectAnimatorOfFloat.addListener(new C0018d());
        objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.64f, 0.6f, 0.83f, 1.0f));
        objectAnimatorOfFloat.setDuration(467L);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: i */
    public final Animator m532i() {
        Animator animatorM530g = m530g();
        Animator animatorM531h = m531h();
        Animator animatorM550k = get_undo_flip_layout().m550k();
        Animator animatorM536m = m536m();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorM530g, animatorM531h, animatorM550k, animatorM536m);
        return animatorSet;
    }

    /* JADX INFO: renamed from: j */
    public final void m533j(@Nullable final View itemView, @NotNull DislikedUsers item) {
        item.getClass();
        if (itemView == null) {
            return;
        }
        m534k(item);
        get_undo_flip_layout().post(new Runnable() { // from class: l.tnj0
            @Override // java.lang.Runnable
            public final void run() {
                UndoCoverAnimView.m524a(this.f13348a, itemView);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m534k(DislikedUsers item) {
        User user = item.userInfo;
        user.getClass();
        qib0.G.N0(get_image(), user.m1042fp().profileMiddle().formatted(), false);
        StringBuilder sb = new StringBuilder(String.valueOf(user.age.intValue()));
        if (bne0.e()) {
            sb.append("岁");
        }
        if (!user.isHideLocationFromSVip() && user.location.distance < 10000) {
            sb.append(", ");
            sb.append(UnDoLikedUserItemView.m517e(user.location.distance));
        }
        if (user.isHideActiveFromSVip() || mqi0.o() - Math.round(user.location.updatedTime) > 180000) {
            xdl0.M0(get_online_status(), false);
        } else {
            xdl0.M0(get_online_status(), true);
        }
        get_user_info().setText(sb);
        get_action_btn().setImageResource(b3c0.p0);
        get_personal_info().setBackground(getResources().getDrawable(b3c0.q0));
        m535l(user);
    }

    /* JADX INFO: renamed from: l */
    public final void m535l(User user) {
        get_new_user().setTypeface(eqh0.c(2), 1);
        if (qqi0.h(mqi0.o(), Math.round(user.createdTime), 7)) {
            xdl0.M(get_new_user(), false);
        } else {
            xdl0.M(get_new_user(), true);
        }
    }

    /* JADX INFO: renamed from: m */
    public final Animator m536m() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_background(), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new C0020f());
        objectAnimatorOfFloat.setDuration(183L);
        objectAnimatorOfFloat.setStartDelay(700L);
        return objectAnimatorOfFloat;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m528e();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m527b(this);
        ViewGroup.LayoutParams layoutParams = get_personal_info().getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int iY0 = (xdl0.y0() / 2) - t100.j;
        int i = (int) (iY0 * 1.33f);
        ViewGroup.LayoutParams layoutParams3 = get_undo_flip_layout().getLayoutParams();
        layoutParams3.getClass();
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.width = iY0;
        layoutParams4.height = i;
        int i2 = (int) (i * 0.38f);
        if (layoutParams2.height != i2) {
            layoutParams2.height = i2;
            get_personal_info().setLayoutParams(layoutParams2);
        }
    }

    public final void setAnimCallback(@Nullable e30<Integer> animCallback) {
        this.animCallback = animCallback;
    }

    public final void set_action_btn(@NotNull VImage vImage) {
        vImage.getClass();
        this._action_btn = vImage;
    }

    public final void set_background(@NotNull View view) {
        view.getClass();
        this._background = view;
    }

    public final void set_heart(@NotNull ImageView imageView) {
        imageView.getClass();
        this._heart = imageView;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_mask(@NotNull View view) {
        view.getClass();
        this._mask = view;
    }

    public final void set_new_user(@NotNull VText vText) {
        vText.getClass();
        this._new_user = vText;
    }

    public final void set_online_status(@NotNull VText vText) {
        vText.getClass();
        this._online_status = vText;
    }

    public final void set_personal_info(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._personal_info = constraintLayout;
    }

    public final void set_undo_flip_layout(@NotNull UndoFlipFrameLayout undoFlipFrameLayout) {
        undoFlipFrameLayout.getClass();
        this._undo_flip_layout = undoFlipFrameLayout;
    }

    public final void set_user_info(@NotNull VText vText) {
        vText.getClass();
        this._user_info = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UndoCoverAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ UndoCoverAnimView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
