package com.p046p1.mobile.putong.live.livingroom.increment.noble;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.p046p1.mobile.putong.live.livingroom.increment.noble.GiftDialogNobelEntranceView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.ahs;
import p149l.bt0;
import p149l.fld0;
import p149l.hdv;
import p149l.hxs;
import p149l.j6f;
import p149l.jl40;
import p149l.kvc0;
import p149l.t100;
import p149l.toj;
import p149l.vwb;
import p149l.xdl0;
import p149l.xxj;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\bK\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJK\u0010\u001b\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\fH\u0014¢\u0006\u0004\b,\u0010#J-\u0010/\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0012\b\u0002\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010-¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\fH\u0014¢\u0006\u0004\b1\u0010#R\"\u00108\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\"\u0010J\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010P\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\u000eR\"\u0010T\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u00103\u001a\u0004\bR\u00105\"\u0004\bS\u00107R\"\u0010X\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010:\u001a\u0004\bV\u0010<\"\u0004\bW\u0010>R\"\u0010\\\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010:\u001a\u0004\bZ\u0010<\"\u0004\b[\u0010>R\"\u0010`\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010E\u001a\u0004\b^\u0010G\"\u0004\b_\u0010IR\"\u0010d\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010L\u001a\u0004\bb\u0010N\"\u0004\bc\u0010\u000eR\"\u0010h\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u00103\u001a\u0004\bf\u00105\"\u0004\bg\u00107R\"\u0010l\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010:\u001a\u0004\bj\u0010<\"\u0004\bk\u0010>R\"\u0010p\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010:\u001a\u0004\bn\u0010<\"\u0004\bo\u0010>R\"\u0010t\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010E\u001a\u0004\br\u0010G\"\u0004\bs\u0010IR\"\u0010x\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010L\u001a\u0004\bv\u0010N\"\u0004\bw\u0010\u000eR\u0018\u0010|\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010\u007f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~¨\u0006\u0080\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/noble/GiftDialogNobelEntranceView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "N", "(Landroid/view/View;)V", "Ll/ahs;", "presenter", "Lcom/p1/mobile/putong/live/base/data/BLiveWealthButton;", "btInfo", "Landroidx/constraintlayout/widget/ConstraintLayout;", "btGroup", "Lv/VDraweeView;", "btBgImg", "btIcon", "Landroid/widget/TextView;", "btText", "btDot", j6f.LATITUDE_SOUTH, "(Ll/ahs;Lcom/p1/mobile/putong/live/base/data/BLiveWealthButton;Landroidx/constraintlayout/widget/ConstraintLayout;Lv/VDraweeView;Lv/VDraweeView;Landroid/widget/TextView;Landroid/view/View;)V", "", "delay", "Q", "(J)V", "R", BloodType.f38728O, "()V", "Landroid/graphics/drawable/GradientDrawable;", "P", "(Lcom/p1/mobile/putong/live/base/data/BLiveWealthButton;)Landroid/graphics/drawable/GradientDrawable;", "bt", "", "isShow", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Landroidx/constraintlayout/widget/ConstraintLayout;Z)V", "onFinishInflate", "", Constants.KEY_BUTTONS, j6f.GPS_DIRECTION_TRUE, "(Ll/ahs;Ljava/util/List;)V", "onDetachedFromWindow", "a", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_first_bt", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_first_bt", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_first_bt", "b", "Lv/VDraweeView;", "get_first_bt_bg_img", "()Lv/VDraweeView;", "set_first_bt_bg_img", "(Lv/VDraweeView;)V", "_first_bt_bg_img", "c", "get_first_bt_icon", "set_first_bt_icon", "_first_bt_icon", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "get_first_bt_content", "()Landroid/widget/TextView;", "set_first_bt_content", "(Landroid/widget/TextView;)V", "_first_bt_content", "e", "Landroid/view/View;", "get_first_bt_dot", "()Landroid/view/View;", "set_first_bt_dot", "_first_bt_dot", "f", "get_second_bt", "set_second_bt", "_second_bt", "g", "get_second_bt_bg_img", "set_second_bt_bg_img", "_second_bt_bg_img", "h", "get_second_bt_icon", "set_second_bt_icon", "_second_bt_icon", RXScreenCaptureService.KEY_INDEX, "get_second_bt_content", "set_second_bt_content", "_second_bt_content", "j", "get_second_bt_dot", "set_second_bt_dot", "_second_bt_dot", "k", "get_third_bt", "set_third_bt", "_third_bt", BLiveStormDanmakuGiftResourceType.f44444l, "get_third_bt_bg_img", "set_third_bt_bg_img", "_third_bt_bg_img", "m", "get_third_bt_icon", "set_third_bt_icon", "_third_bt_icon", "n", "get_third_bt_content", "set_third_bt_content", "_third_bt_content", "o", "get_third_bt_dot", "set_third_bt_dot", "_third_bt_dot", "Landroid/animation/AnimatorSet;", "p", "Landroid/animation/AnimatorSet;", "enterRotationAnimation", "q", "Ljava/lang/Integer;", "buttonAnimSize", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class GiftDialogNobelEntranceView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ConstraintLayout _first_bt;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _first_bt_bg_img;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _first_bt_icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _first_bt_content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _first_bt_dot;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ConstraintLayout _second_bt;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VDraweeView _second_bt_bg_img;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _second_bt_icon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView _second_bt_content;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public View _second_bt_dot;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ConstraintLayout _third_bt;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VDraweeView _third_bt_bg_img;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VDraweeView _third_bt_icon;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public TextView _third_bt_content;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public View _third_bt_dot;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public AnimatorSet enterRotationAnimation;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public Integer buttonAnimSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftDialogNobelEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.buttonAnimSize = 0;
    }

    /* JADX INFO: renamed from: B */
    public static void m74957B(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        xdl0.m208344M(giftDialogNobelEntranceView.get_second_bt(), true);
        xdl0.m208344M(giftDialogNobelEntranceView.get_third_bt(), true);
    }

    /* JADX INFO: renamed from: C */
    public static void m74958C(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        xdl0.m208344M(giftDialogNobelEntranceView.get_first_bt(), false);
    }

    /* JADX INFO: renamed from: E */
    public static void m74959E(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        xdl0.m208344M(giftDialogNobelEntranceView.get_second_bt(), false);
    }

    /* JADX INFO: renamed from: F */
    public static void m74960F(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        xdl0.m208344M(giftDialogNobelEntranceView.get_third_bt(), false);
    }

    /* JADX INFO: renamed from: G */
    public static void m74961G(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        xdl0.m208344M(giftDialogNobelEntranceView.get_first_bt(), true);
    }

    /* JADX INFO: renamed from: K */
    public static void m74962K(ahs ahsVar, BLiveWealthButton bLiveWealthButton, View view, View view2) {
        ahsVar.mo129310p3(700, bLiveWealthButton.schema);
        String str = bLiveWealthButton.type;
        int iHashCode = str.hashCode();
        if (iHashCode == -1237459442) {
            if (str.equals("growUp")) {
                xdl0.m208344M(view, false);
                ((hdv) ypv.m215673l(fld0.f98150e)).f107311q.put(Boolean.TRUE);
                return;
            }
            return;
        }
        if (iHashCode == 3075986) {
            if (str.equals("dash")) {
                xdl0.m208344M(view, false);
                ((hdv) ypv.m215673l(fld0.f98150e)).f107312r.put(Boolean.TRUE);
                return;
            }
            return;
        }
        if (iHashCode == 104991738 && str.equals("noble")) {
            String strMo77274R2 = ahsVar.mo77274R2();
            strMo77274R2.getClass();
            jl40.m141925a(strMo77274R2);
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m74963L(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        xdl0.m208344M(giftDialogNobelEntranceView.get_third_bt(), true);
        xdl0.m208344M(giftDialogNobelEntranceView.get_first_bt(), true);
    }

    /* JADX INFO: renamed from: M */
    public static void m74964M(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        xdl0.m208344M(giftDialogNobelEntranceView.get_second_bt(), true);
        xdl0.m208344M(giftDialogNobelEntranceView.get_first_bt(), true);
    }

    /* JADX INFO: renamed from: p */
    public static void m74965p(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        xdl0.m208344M(giftDialogNobelEntranceView.get_first_bt(), false);
    }

    /* JADX INFO: renamed from: s */
    public static void m74966s(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        AnimatorSet animatorSet = giftDialogNobelEntranceView.enterRotationAnimation;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m74967u(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        AnimatorSet animatorSet = giftDialogNobelEntranceView.enterRotationAnimation;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m74968v(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        xdl0.m208344M(giftDialogNobelEntranceView.get_second_bt(), false);
    }

    /* JADX INFO: renamed from: w */
    public static void m74969w(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        xdl0.m208344M(giftDialogNobelEntranceView.get_second_bt(), true);
        xdl0.m208344M(giftDialogNobelEntranceView.get_first_bt(), true);
    }

    /* JADX INFO: renamed from: z */
    public static void m74970z(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        xdl0.m208344M(giftDialogNobelEntranceView.get_second_bt(), true);
        xdl0.m208344M(giftDialogNobelEntranceView.get_first_bt(), true);
    }

    /* JADX INFO: renamed from: N */
    public final void m74971N(View view) {
        toj.m189889a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public final void m74972O() {
        m74978V(get_first_bt(), true);
        m74978V(get_second_bt(), false);
        m74978V(get_third_bt(), false);
        get_first_bt_dot().setAlpha(1.0f);
        AnimatorSet animatorSet = this.enterRotationAnimation;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: P */
    public final GradientDrawable m74973P(BLiveWealthButton btInfo) {
        if (TextUtils.isEmpty(btInfo.startColor) || TextUtils.isEmpty(btInfo.endColor)) {
            return null;
        }
        try {
            float fM186890d = t100.m186890d(8.5f);
            return xxj.m211501b(btInfo.startColor, btInfo.endColor, new float[]{fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d});
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m74974Q(long delay) {
        Integer num;
        m74972O();
        if (this.enterRotationAnimation == null || (num = this.buttonAnimSize) == null || num.intValue() != 3) {
            this.buttonAnimSize = 3;
            int i = (int) delay;
            Animator animatorM103737j = bt0.m103737j(i);
            Property property = FrameLayout.TRANSLATION_Y;
            Animator animatorM103739l = bt0.m103739l(get_first_bt(), property, 0L, 500L, null, 0.0f, -12.0f);
            animatorM103739l.getClass();
            Property property2 = FrameLayout.ALPHA;
            Animator animatorM103739l2 = bt0.m103739l(get_first_bt(), property2, 0L, 500L, null, 1.0f, 0.0f);
            animatorM103739l2.getClass();
            ObjectAnimator objectAnimator = (ObjectAnimator) animatorM103739l2;
            Animator animatorM103739l3 = bt0.m103739l(get_first_bt_dot(), property2, 0L, 200L, null, 1.0f, 0.0f);
            animatorM103739l3.getClass();
            Animator animatorM103739l4 = bt0.m103739l(get_second_bt(), property, 200L, 500L, null, 12.0f, 0.0f);
            animatorM103739l4.getClass();
            Animator animatorM103739l5 = bt0.m103739l(get_second_bt(), property2, 200L, 500L, null, 0.0f, 1.0f);
            animatorM103739l5.getClass();
            Animator animatorM103739l6 = bt0.m103739l(get_second_bt_dot(), property2, 200L, 200L, null, 0.0f, 1.0f);
            animatorM103739l6.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            bt0.m103750w(objectAnimator, new Runnable() { // from class: l.koj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m74970z(this.f124026a);
                }
            }, new Runnable() { // from class: l.loj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m74958C(this.f129116a);
                }
            });
            animatorSet.playTogether((ObjectAnimator) animatorM103739l, objectAnimator, (ObjectAnimator) animatorM103739l3, (ObjectAnimator) animatorM103739l4, (ObjectAnimator) animatorM103739l5, (ObjectAnimator) animatorM103739l6);
            Animator animatorM103737j2 = bt0.m103737j(i);
            Animator animatorM103739l7 = bt0.m103739l(get_second_bt(), property, 0L, 500L, null, 0.0f, -12.0f);
            animatorM103739l7.getClass();
            ObjectAnimator objectAnimator2 = (ObjectAnimator) animatorM103739l7;
            Animator animatorM103739l8 = bt0.m103739l(get_second_bt(), property2, 0L, 500L, null, 1.0f, 0.0f);
            animatorM103739l8.getClass();
            Animator animatorM103739l9 = bt0.m103739l(get_second_bt_dot(), property2, 0L, 200L, null, 1.0f, 0.0f);
            animatorM103739l9.getClass();
            Animator animatorM103739l10 = bt0.m103739l(get_third_bt(), property, 200L, 500L, null, 12.0f, 0.0f);
            animatorM103739l10.getClass();
            Animator animatorM103739l11 = bt0.m103739l(get_third_bt(), property2, 200L, 500L, null, 0.0f, 1.0f);
            animatorM103739l11.getClass();
            Animator animatorM103739l12 = bt0.m103739l(get_third_bt_dot(), property2, 200L, 200L, null, 0.0f, 1.0f);
            animatorM103739l12.getClass();
            AnimatorSet animatorSet2 = new AnimatorSet();
            bt0.m103750w(objectAnimator2, new Runnable() { // from class: l.moj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m74957B(this.f134914a);
                }
            }, new Runnable() { // from class: l.noj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m74959E(this.f139852a);
                }
            });
            animatorSet2.playTogether(objectAnimator2, (ObjectAnimator) animatorM103739l8, (ObjectAnimator) animatorM103739l9, (ObjectAnimator) animatorM103739l10, (ObjectAnimator) animatorM103739l11, (ObjectAnimator) animatorM103739l12);
            Animator animatorM103737j3 = bt0.m103737j(i);
            Animator animatorM103739l13 = bt0.m103739l(get_third_bt(), property, 0L, 500L, null, 0.0f, -12.0f);
            animatorM103739l13.getClass();
            ObjectAnimator objectAnimator3 = (ObjectAnimator) animatorM103739l13;
            Animator animatorM103739l14 = bt0.m103739l(get_third_bt(), property2, 0L, 500L, null, 1.0f, 0.0f);
            animatorM103739l14.getClass();
            Animator animatorM103739l15 = bt0.m103739l(get_third_bt_dot(), property2, 0L, 200L, null, 1.0f, 0.0f);
            animatorM103739l15.getClass();
            Animator animatorM103739l16 = bt0.m103739l(get_first_bt(), property, 200L, 500L, null, 12.0f, 0.0f);
            animatorM103739l16.getClass();
            Animator animatorM103739l17 = bt0.m103739l(get_first_bt(), property2, 200L, 500L, null, 0.0f, 1.0f);
            animatorM103739l17.getClass();
            Animator animatorM103739l18 = bt0.m103739l(get_first_bt_dot(), property2, 200L, 200L, null, 0.0f, 1.0f);
            animatorM103739l18.getClass();
            AnimatorSet animatorSet3 = new AnimatorSet();
            bt0.m103750w(objectAnimator3, new Runnable() { // from class: l.ooj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m74963L(this.f144889a);
                }
            }, new Runnable() { // from class: l.poj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m74960F(this.f150522a);
                }
            });
            animatorSet3.playTogether(objectAnimator3, (ObjectAnimator) animatorM103739l14, (ObjectAnimator) animatorM103739l15, (ObjectAnimator) animatorM103739l16, (ObjectAnimator) animatorM103739l17, (ObjectAnimator) animatorM103739l18);
            AnimatorSet animatorSet4 = new AnimatorSet();
            this.enterRotationAnimation = animatorSet4;
            animatorSet4.playSequentially(animatorM103737j, animatorSet, animatorM103737j2, animatorSet2, animatorM103737j3, animatorSet3);
        }
        bt0.m103733f(this.enterRotationAnimation, new Runnable() { // from class: l.qoj
            @Override // java.lang.Runnable
            public final void run() {
                GiftDialogNobelEntranceView.m74966s(this.f155587a);
            }
        });
        AnimatorSet animatorSet5 = this.enterRotationAnimation;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m74975R(long delay) {
        Integer num;
        m74972O();
        if (this.enterRotationAnimation == null || (num = this.buttonAnimSize) == null || num.intValue() != 2) {
            this.buttonAnimSize = 2;
            int i = (int) delay;
            Animator animatorM103737j = bt0.m103737j(i);
            bt0.m103749v(animatorM103737j, new Runnable() { // from class: l.roj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m74961G(this.f160387a);
                }
            });
            Property property = FrameLayout.TRANSLATION_Y;
            Animator animatorM103739l = bt0.m103739l(get_first_bt(), property, 0L, 500L, null, 0.0f, -12.0f);
            animatorM103739l.getClass();
            Property property2 = FrameLayout.ALPHA;
            Animator animatorM103739l2 = bt0.m103739l(get_first_bt(), property2, 0L, 500L, null, 1.0f, 0.0f);
            animatorM103739l2.getClass();
            ObjectAnimator objectAnimator = (ObjectAnimator) animatorM103739l2;
            Animator animatorM103739l3 = bt0.m103739l(get_first_bt_dot(), property2, 0L, 200L, null, 1.0f, 0.0f);
            animatorM103739l3.getClass();
            ObjectAnimator objectAnimator2 = (ObjectAnimator) animatorM103739l3;
            Animator animatorM103739l4 = bt0.m103739l(get_second_bt(), property, 200L, 500L, null, 12.0f, 0.0f);
            animatorM103739l4.getClass();
            ObjectAnimator objectAnimator3 = (ObjectAnimator) animatorM103739l4;
            Animator animatorM103739l5 = bt0.m103739l(get_second_bt(), property2, 200L, 500L, null, 0.0f, 1.0f);
            animatorM103739l5.getClass();
            ObjectAnimator objectAnimator4 = (ObjectAnimator) animatorM103739l5;
            Animator animatorM103739l6 = bt0.m103739l(get_second_bt_dot(), property2, 200L, 200L, null, 0.0f, 1.0f);
            animatorM103739l6.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            bt0.m103750w(objectAnimator, new Runnable() { // from class: l.soj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m74969w(this.f165694a);
                }
            }, new Runnable() { // from class: l.goj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m74965p(this.f103677a);
                }
            });
            animatorSet.playTogether((ObjectAnimator) animatorM103739l, objectAnimator, objectAnimator2, objectAnimator3, objectAnimator4, (ObjectAnimator) animatorM103739l6);
            Animator animatorM103737j2 = bt0.m103737j(i);
            Animator animatorM103739l7 = bt0.m103739l(get_second_bt(), property, 0L, 500L, null, 0.0f, -12.0f);
            animatorM103739l7.getClass();
            ObjectAnimator objectAnimator5 = (ObjectAnimator) animatorM103739l7;
            Animator animatorM103739l8 = bt0.m103739l(get_second_bt(), property2, 0L, 500L, null, 1.0f, 0.0f);
            animatorM103739l8.getClass();
            ObjectAnimator objectAnimator6 = (ObjectAnimator) animatorM103739l8;
            Animator animatorM103739l9 = bt0.m103739l(get_second_bt_dot(), property2, 0L, 200L, null, 1.0f, 0.0f);
            animatorM103739l9.getClass();
            ObjectAnimator objectAnimator7 = (ObjectAnimator) animatorM103739l9;
            Animator animatorM103739l10 = bt0.m103739l(get_first_bt(), property, 200L, 500L, null, 12.0f, 0.0f);
            animatorM103739l10.getClass();
            ObjectAnimator objectAnimator8 = (ObjectAnimator) animatorM103739l10;
            Animator animatorM103739l11 = bt0.m103739l(get_first_bt(), property2, 200L, 500L, null, 0.0f, 1.0f);
            animatorM103739l11.getClass();
            ObjectAnimator objectAnimator9 = (ObjectAnimator) animatorM103739l11;
            Animator animatorM103739l12 = bt0.m103739l(get_first_bt_dot(), property2, 200L, 200L, null, 0.0f, 1.0f);
            animatorM103739l12.getClass();
            AnimatorSet animatorSet2 = new AnimatorSet();
            bt0.m103750w(objectAnimator5, new Runnable() { // from class: l.hoj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m74964M(this.f108829a);
                }
            }, new Runnable() { // from class: l.ioj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m74968v(this.f114170a);
                }
            });
            animatorSet2.playTogether(objectAnimator5, objectAnimator6, objectAnimator7, objectAnimator8, objectAnimator9, (ObjectAnimator) animatorM103739l12);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.enterRotationAnimation = animatorSet3;
            animatorSet3.playSequentially(animatorM103737j, animatorSet, animatorM103737j2, animatorSet2);
        }
        bt0.m103733f(this.enterRotationAnimation, new Runnable() { // from class: l.joj
            @Override // java.lang.Runnable
            public final void run() {
                GiftDialogNobelEntranceView.m74967u(this.f118989a);
            }
        });
        AnimatorSet animatorSet4 = this.enterRotationAnimation;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m74976S(final ahs<?> presenter, final BLiveWealthButton btInfo, ConstraintLayout btGroup, VDraweeView btBgImg, VDraweeView btIcon, TextView btText, final View btDot) {
        btText.setText(btInfo.text);
        btText.setTextColor(kvc0.m147358g(btInfo.textColor));
        if (TextUtils.isEmpty(btInfo.bgUrl)) {
            btBgImg.setBackground(m74973P(btInfo));
        } else {
            btBgImg.setBackground(null);
            xdl0.m208344M(btBgImg, true);
            hxs.m133408u("context_livingAct", btBgImg, btInfo.bgUrl, t100.m186890d(77.0f), t100.m186890d(20.0f));
        }
        String str = btInfo.icon;
        int i = t100.f167261j;
        hxs.m133408u("context_livingAct", btIcon, str, i, i);
        xdl0.m208329E0(btGroup, new View.OnClickListener() { // from class: l.foj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftDialogNobelEntranceView.m74962K(presenter, btInfo, btDot, view);
            }
        });
        String str2 = btInfo.type;
        int iHashCode = str2.hashCode();
        if (iHashCode == -1237459442) {
            if (str2.equals("growUp") && !((hdv) ypv.m215673l(fld0.f98150e)).f107311q.get().booleanValue()) {
                xdl0.m208344M(btDot, true);
                return;
            }
            return;
        }
        if (iHashCode != 3075986) {
            if (iHashCode == 104991738 && str2.equals("noble")) {
                xdl0.m208344M(btDot, false);
                return;
            }
            return;
        }
        if (str2.equals("dash") && !((hdv) ypv.m215673l(fld0.f98150e)).f107312r.get().booleanValue()) {
            xdl0.m208344M(btDot, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX INFO: renamed from: T */
    public final void m74977T(@NotNull ahs<?> presenter, @Nullable List<? extends BLiveWealthButton> buttons) {
        presenter.getClass();
        BLiveWealthButton bLiveWealthButton = buttons != null ? buttons.get(0) : null;
        if (bLiveWealthButton != null) {
            xdl0.m208344M(get_first_bt(), true);
            m74978V(get_first_bt(), true);
            get_first_bt_dot().setAlpha(1.0f);
            m74976S(presenter, bLiveWealthButton, get_first_bt(), get_first_bt_bg_img(), get_first_bt_icon(), get_first_bt_content(), get_first_bt_dot());
        }
        List<? extends BLiveWealthButton> list = buttons;
        if (vwb.m200296J(list)) {
            xdl0.m208344M(get_second_bt(), false);
        } else {
            Integer numValueOf = buttons != null ? Integer.valueOf(buttons.size()) : null;
            numValueOf.getClass();
            if (numValueOf.intValue() > 1) {
                BLiveWealthButton bLiveWealthButton2 = buttons.get(1);
                if (bLiveWealthButton2 != null) {
                    m74976S(presenter, bLiveWealthButton2, get_second_bt(), get_second_bt_bg_img(), get_second_bt_icon(), get_second_bt_content(), get_second_bt_dot());
                }
            } else {
                xdl0.m208344M(get_second_bt(), false);
            }
        }
        if (vwb.m200296J(list)) {
            xdl0.m208344M(get_third_bt(), false);
        } else {
            Integer numValueOf2 = buttons != null ? Integer.valueOf(buttons.size()) : null;
            numValueOf2.getClass();
            if (numValueOf2.intValue() > 2) {
                BLiveWealthButton bLiveWealthButton3 = buttons.get(2);
                if (bLiveWealthButton3 != null) {
                    m74976S(presenter, bLiveWealthButton3, get_third_bt(), get_third_bt_bg_img(), get_third_bt_icon(), get_third_bt_content(), get_third_bt_dot());
                }
            } else {
                xdl0.m208344M(get_third_bt(), false);
            }
        }
        Integer numValueOf3 = buttons != null ? Integer.valueOf(buttons.size()) : null;
        numValueOf3.getClass();
        if (numValueOf3.intValue() == 3) {
            m74974Q(3000L);
        } else if (buttons.size() == 2) {
            m74975R(3000L);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m74978V(ConstraintLayout bt, boolean isShow) {
        float fM186890d = t100.m186890d(20.0f);
        bt.setAlpha(isShow ? 1.0f : 0.0f);
        if (isShow) {
            fM186890d = 0.0f;
        }
        bt.setTranslationY(fM186890d);
    }

    @NotNull
    public final ConstraintLayout get_first_bt() {
        ConstraintLayout constraintLayout = this._first_bt;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_first_bt");
        return null;
    }

    @NotNull
    public final VDraweeView get_first_bt_bg_img() {
        VDraweeView vDraweeView = this._first_bt_bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_first_bt_bg_img");
        return null;
    }

    @NotNull
    public final TextView get_first_bt_content() {
        TextView textView = this._first_bt_content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_first_bt_content");
        return null;
    }

    @NotNull
    public final View get_first_bt_dot() {
        View view = this._first_bt_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_first_bt_dot");
        return null;
    }

    @NotNull
    public final VDraweeView get_first_bt_icon() {
        VDraweeView vDraweeView = this._first_bt_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_first_bt_icon");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_second_bt() {
        ConstraintLayout constraintLayout = this._second_bt;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_second_bt");
        return null;
    }

    @NotNull
    public final VDraweeView get_second_bt_bg_img() {
        VDraweeView vDraweeView = this._second_bt_bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_second_bt_bg_img");
        return null;
    }

    @NotNull
    public final TextView get_second_bt_content() {
        TextView textView = this._second_bt_content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_second_bt_content");
        return null;
    }

    @NotNull
    public final View get_second_bt_dot() {
        View view = this._second_bt_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_second_bt_dot");
        return null;
    }

    @NotNull
    public final VDraweeView get_second_bt_icon() {
        VDraweeView vDraweeView = this._second_bt_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_second_bt_icon");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_third_bt() {
        ConstraintLayout constraintLayout = this._third_bt;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_third_bt");
        return null;
    }

    @NotNull
    public final VDraweeView get_third_bt_bg_img() {
        VDraweeView vDraweeView = this._third_bt_bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_third_bt_bg_img");
        return null;
    }

    @NotNull
    public final TextView get_third_bt_content() {
        TextView textView = this._third_bt_content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_third_bt_content");
        return null;
    }

    @NotNull
    public final View get_third_bt_dot() {
        View view = this._third_bt_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_third_bt_dot");
        return null;
    }

    @NotNull
    public final VDraweeView get_third_bt_icon() {
        VDraweeView vDraweeView = this._third_bt_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_third_bt_icon");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m74972O();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74971N(this);
    }

    public final void set_first_bt(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._first_bt = constraintLayout;
    }

    public final void set_first_bt_bg_img(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._first_bt_bg_img = vDraweeView;
    }

    public final void set_first_bt_content(@NotNull TextView textView) {
        textView.getClass();
        this._first_bt_content = textView;
    }

    public final void set_first_bt_dot(@NotNull View view) {
        view.getClass();
        this._first_bt_dot = view;
    }

    public final void set_first_bt_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._first_bt_icon = vDraweeView;
    }

    public final void set_second_bt(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._second_bt = constraintLayout;
    }

    public final void set_second_bt_bg_img(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._second_bt_bg_img = vDraweeView;
    }

    public final void set_second_bt_content(@NotNull TextView textView) {
        textView.getClass();
        this._second_bt_content = textView;
    }

    public final void set_second_bt_dot(@NotNull View view) {
        view.getClass();
        this._second_bt_dot = view;
    }

    public final void set_second_bt_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._second_bt_icon = vDraweeView;
    }

    public final void set_third_bt(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._third_bt = constraintLayout;
    }

    public final void set_third_bt_bg_img(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._third_bt_bg_img = vDraweeView;
    }

    public final void set_third_bt_content(@NotNull TextView textView) {
        textView.getClass();
        this._third_bt_content = textView;
    }

    public final void set_third_bt_dot(@NotNull View view) {
        view.getClass();
        this._third_bt_dot = view;
    }

    public final void set_third_bt_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._third_bt_icon = vDraweeView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftDialogNobelEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftDialogNobelEntranceView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GiftDialogNobelEntranceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
