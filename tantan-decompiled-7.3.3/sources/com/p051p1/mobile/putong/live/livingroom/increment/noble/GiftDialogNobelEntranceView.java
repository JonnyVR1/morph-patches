package com.p051p1.mobile.putong.live.livingroom.increment.noble;

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
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.p051p1.mobile.putong.live.livingroom.increment.noble.GiftDialogNobelEntranceView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bjs;
import p153l.bnl0;
import p153l.gt0;
import p153l.htd0;
import p153l.ifv;
import p153l.izs;
import p153l.jrj;
import p153l.jyb;
import p153l.n0k;
import p153l.n3d0;
import p153l.p7f;
import p153l.qa00;
import p153l.xt40;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\bK\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJK\u0010\u001b\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\fH\u0014¢\u0006\u0004\b,\u0010#J-\u0010/\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0012\b\u0002\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010-¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\fH\u0014¢\u0006\u0004\b1\u0010#R\"\u00108\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\"\u0010J\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010P\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\u000eR\"\u0010T\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u00103\u001a\u0004\bR\u00105\"\u0004\bS\u00107R\"\u0010X\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010:\u001a\u0004\bV\u0010<\"\u0004\bW\u0010>R\"\u0010\\\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010:\u001a\u0004\bZ\u0010<\"\u0004\b[\u0010>R\"\u0010`\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010E\u001a\u0004\b^\u0010G\"\u0004\b_\u0010IR\"\u0010d\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010L\u001a\u0004\bb\u0010N\"\u0004\bc\u0010\u000eR\"\u0010h\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u00103\u001a\u0004\bf\u00105\"\u0004\bg\u00107R\"\u0010l\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010:\u001a\u0004\bj\u0010<\"\u0004\bk\u0010>R\"\u0010p\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010:\u001a\u0004\bn\u0010<\"\u0004\bo\u0010>R\"\u0010t\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010E\u001a\u0004\br\u0010G\"\u0004\bs\u0010IR\"\u0010x\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010L\u001a\u0004\bv\u0010N\"\u0004\bw\u0010\u000eR\u0018\u0010|\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010\u007f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~¨\u0006\u0080\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/noble/GiftDialogNobelEntranceView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "N", "(Landroid/view/View;)V", "Ll/bjs;", "presenter", "Lcom/p1/mobile/putong/live/base/data/BLiveWealthButton;", "btInfo", "Landroidx/constraintlayout/widget/ConstraintLayout;", "btGroup", "Lv/VDraweeView;", "btBgImg", "btIcon", "Landroid/widget/TextView;", "btText", "btDot", p7f.LATITUDE_SOUTH, "(Ll/bjs;Lcom/p1/mobile/putong/live/base/data/BLiveWealthButton;Landroidx/constraintlayout/widget/ConstraintLayout;Lv/VDraweeView;Lv/VDraweeView;Landroid/widget/TextView;Landroid/view/View;)V", "", "delay", "Q", "(J)V", "R", BloodType.f39576O, "()V", "Landroid/graphics/drawable/GradientDrawable;", "P", "(Lcom/p1/mobile/putong/live/base/data/BLiveWealthButton;)Landroid/graphics/drawable/GradientDrawable;", "bt", "", "isShow", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Landroidx/constraintlayout/widget/ConstraintLayout;Z)V", "onFinishInflate", "", Constants.KEY_BUTTONS, p7f.GPS_DIRECTION_TRUE, "(Ll/bjs;Ljava/util/List;)V", "onDetachedFromWindow", "a", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_first_bt", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_first_bt", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_first_bt", "b", "Lv/VDraweeView;", "get_first_bt_bg_img", "()Lv/VDraweeView;", "set_first_bt_bg_img", "(Lv/VDraweeView;)V", "_first_bt_bg_img", "c", "get_first_bt_icon", "set_first_bt_icon", "_first_bt_icon", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "get_first_bt_content", "()Landroid/widget/TextView;", "set_first_bt_content", "(Landroid/widget/TextView;)V", "_first_bt_content", "e", "Landroid/view/View;", "get_first_bt_dot", "()Landroid/view/View;", "set_first_bt_dot", "_first_bt_dot", "f", "get_second_bt", "set_second_bt", "_second_bt", "g", "get_second_bt_bg_img", "set_second_bt_bg_img", "_second_bt_bg_img", "h", "get_second_bt_icon", "set_second_bt_icon", "_second_bt_icon", RXScreenCaptureService.KEY_INDEX, "get_second_bt_content", "set_second_bt_content", "_second_bt_content", "j", "get_second_bt_dot", "set_second_bt_dot", "_second_bt_dot", "k", "get_third_bt", "set_third_bt", "_third_bt", BLiveStormDanmakuGiftResourceType.f45292l, "get_third_bt_bg_img", "set_third_bt_bg_img", "_third_bt_bg_img", "m", "get_third_bt_icon", "set_third_bt_icon", "_third_bt_icon", "n", "get_third_bt_content", "set_third_bt_content", "_third_bt_content", "o", "get_third_bt_dot", "set_third_bt_dot", "_third_bt_dot", "Landroid/animation/AnimatorSet;", "p", "Landroid/animation/AnimatorSet;", "enterRotationAnimation", "q", "Ljava/lang/Integer;", "buttonAnimSize", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public static void m76140B(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        bnl0.m105524M(giftDialogNobelEntranceView.get_second_bt(), true);
        bnl0.m105524M(giftDialogNobelEntranceView.get_third_bt(), true);
    }

    /* JADX INFO: renamed from: C */
    public static void m76141C(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        bnl0.m105524M(giftDialogNobelEntranceView.get_first_bt(), false);
    }

    /* JADX INFO: renamed from: E */
    public static void m76142E(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        bnl0.m105524M(giftDialogNobelEntranceView.get_second_bt(), false);
    }

    /* JADX INFO: renamed from: F */
    public static void m76143F(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        bnl0.m105524M(giftDialogNobelEntranceView.get_third_bt(), false);
    }

    /* JADX INFO: renamed from: G */
    public static void m76144G(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        bnl0.m105524M(giftDialogNobelEntranceView.get_first_bt(), true);
    }

    /* JADX INFO: renamed from: K */
    public static void m76145K(bjs bjsVar, BLiveWealthButton bLiveWealthButton, View view, View view2) {
        bjsVar.mo138869p3(700, bLiveWealthButton.schema);
        String str = bLiveWealthButton.type;
        int iHashCode = str.hashCode();
        if (iHashCode == -1237459442) {
            if (str.equals("growUp")) {
                bnl0.m105524M(view, false);
                ((ifv) zrv.m221194l(htd0.f111523e)).f114708q.put(Boolean.TRUE);
                return;
            }
            return;
        }
        if (iHashCode == 3075986) {
            if (str.equals("dash")) {
                bnl0.m105524M(view, false);
                ((ifv) zrv.m221194l(htd0.f111523e)).f114709r.put(Boolean.TRUE);
                return;
            }
            return;
        }
        if (iHashCode == 104991738 && str.equals("noble")) {
            String strMo78457R2 = bjsVar.mo78457R2();
            strMo78457R2.getClass();
            xt40.m213042a(strMo78457R2);
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m76146L(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        bnl0.m105524M(giftDialogNobelEntranceView.get_third_bt(), true);
        bnl0.m105524M(giftDialogNobelEntranceView.get_first_bt(), true);
    }

    /* JADX INFO: renamed from: M */
    public static void m76147M(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        bnl0.m105524M(giftDialogNobelEntranceView.get_second_bt(), true);
        bnl0.m105524M(giftDialogNobelEntranceView.get_first_bt(), true);
    }

    /* JADX INFO: renamed from: p */
    public static void m76148p(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        bnl0.m105524M(giftDialogNobelEntranceView.get_first_bt(), false);
    }

    /* JADX INFO: renamed from: s */
    public static void m76149s(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        AnimatorSet animatorSet = giftDialogNobelEntranceView.enterRotationAnimation;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m76150u(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        AnimatorSet animatorSet = giftDialogNobelEntranceView.enterRotationAnimation;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m76151v(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        bnl0.m105524M(giftDialogNobelEntranceView.get_second_bt(), false);
    }

    /* JADX INFO: renamed from: w */
    public static void m76152w(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        bnl0.m105524M(giftDialogNobelEntranceView.get_second_bt(), true);
        bnl0.m105524M(giftDialogNobelEntranceView.get_first_bt(), true);
    }

    /* JADX INFO: renamed from: z */
    public static void m76153z(GiftDialogNobelEntranceView giftDialogNobelEntranceView) {
        bnl0.m105524M(giftDialogNobelEntranceView.get_second_bt(), true);
        bnl0.m105524M(giftDialogNobelEntranceView.get_first_bt(), true);
    }

    /* JADX INFO: renamed from: N */
    public final void m76154N(View view) {
        jrj.m146751a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public final void m76155O() {
        m76161V(get_first_bt(), true);
        m76161V(get_second_bt(), false);
        m76161V(get_third_bt(), false);
        get_first_bt_dot().setAlpha(1.0f);
        AnimatorSet animatorSet = this.enterRotationAnimation;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: P */
    public final GradientDrawable m76156P(BLiveWealthButton btInfo) {
        if (TextUtils.isEmpty(btInfo.startColor) || TextUtils.isEmpty(btInfo.endColor)) {
            return null;
        }
        try {
            float fM175859d = qa00.m175859d(8.5f);
            return n0k.m161005b(btInfo.startColor, btInfo.endColor, new float[]{fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d});
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m76157Q(long delay) {
        Integer num;
        m76155O();
        if (this.enterRotationAnimation == null || (num = this.buttonAnimSize) == null || num.intValue() != 3) {
            this.buttonAnimSize = 3;
            int i = (int) delay;
            Animator animatorM132164j = gt0.m132164j(i);
            Property property = FrameLayout.TRANSLATION_Y;
            Animator animatorM132166l = gt0.m132166l(get_first_bt(), property, 0L, 500L, null, 0.0f, -12.0f);
            animatorM132166l.getClass();
            Property property2 = FrameLayout.ALPHA;
            Animator animatorM132166l2 = gt0.m132166l(get_first_bt(), property2, 0L, 500L, null, 1.0f, 0.0f);
            animatorM132166l2.getClass();
            ObjectAnimator objectAnimator = (ObjectAnimator) animatorM132166l2;
            Animator animatorM132166l3 = gt0.m132166l(get_first_bt_dot(), property2, 0L, 200L, null, 1.0f, 0.0f);
            animatorM132166l3.getClass();
            Animator animatorM132166l4 = gt0.m132166l(get_second_bt(), property, 200L, 500L, null, 12.0f, 0.0f);
            animatorM132166l4.getClass();
            Animator animatorM132166l5 = gt0.m132166l(get_second_bt(), property2, 200L, 500L, null, 0.0f, 1.0f);
            animatorM132166l5.getClass();
            Animator animatorM132166l6 = gt0.m132166l(get_second_bt_dot(), property2, 200L, 200L, null, 0.0f, 1.0f);
            animatorM132166l6.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            gt0.m132177w(objectAnimator, new Runnable() { // from class: l.arj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m76153z(this.f72950a);
                }
            }, new Runnable() { // from class: l.brj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m76141C(this.f78028a);
                }
            });
            animatorSet.playTogether((ObjectAnimator) animatorM132166l, objectAnimator, (ObjectAnimator) animatorM132166l3, (ObjectAnimator) animatorM132166l4, (ObjectAnimator) animatorM132166l5, (ObjectAnimator) animatorM132166l6);
            Animator animatorM132164j2 = gt0.m132164j(i);
            Animator animatorM132166l7 = gt0.m132166l(get_second_bt(), property, 0L, 500L, null, 0.0f, -12.0f);
            animatorM132166l7.getClass();
            ObjectAnimator objectAnimator2 = (ObjectAnimator) animatorM132166l7;
            Animator animatorM132166l8 = gt0.m132166l(get_second_bt(), property2, 0L, 500L, null, 1.0f, 0.0f);
            animatorM132166l8.getClass();
            Animator animatorM132166l9 = gt0.m132166l(get_second_bt_dot(), property2, 0L, 200L, null, 1.0f, 0.0f);
            animatorM132166l9.getClass();
            Animator animatorM132166l10 = gt0.m132166l(get_third_bt(), property, 200L, 500L, null, 12.0f, 0.0f);
            animatorM132166l10.getClass();
            Animator animatorM132166l11 = gt0.m132166l(get_third_bt(), property2, 200L, 500L, null, 0.0f, 1.0f);
            animatorM132166l11.getClass();
            Animator animatorM132166l12 = gt0.m132166l(get_third_bt_dot(), property2, 200L, 200L, null, 0.0f, 1.0f);
            animatorM132166l12.getClass();
            AnimatorSet animatorSet2 = new AnimatorSet();
            gt0.m132177w(objectAnimator2, new Runnable() { // from class: l.crj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m76140B(this.f83333a);
                }
            }, new Runnable() { // from class: l.drj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m76142E(this.f90393a);
                }
            });
            animatorSet2.playTogether(objectAnimator2, (ObjectAnimator) animatorM132166l8, (ObjectAnimator) animatorM132166l9, (ObjectAnimator) animatorM132166l10, (ObjectAnimator) animatorM132166l11, (ObjectAnimator) animatorM132166l12);
            Animator animatorM132164j3 = gt0.m132164j(i);
            Animator animatorM132166l13 = gt0.m132166l(get_third_bt(), property, 0L, 500L, null, 0.0f, -12.0f);
            animatorM132166l13.getClass();
            ObjectAnimator objectAnimator3 = (ObjectAnimator) animatorM132166l13;
            Animator animatorM132166l14 = gt0.m132166l(get_third_bt(), property2, 0L, 500L, null, 1.0f, 0.0f);
            animatorM132166l14.getClass();
            Animator animatorM132166l15 = gt0.m132166l(get_third_bt_dot(), property2, 0L, 200L, null, 1.0f, 0.0f);
            animatorM132166l15.getClass();
            Animator animatorM132166l16 = gt0.m132166l(get_first_bt(), property, 200L, 500L, null, 12.0f, 0.0f);
            animatorM132166l16.getClass();
            Animator animatorM132166l17 = gt0.m132166l(get_first_bt(), property2, 200L, 500L, null, 0.0f, 1.0f);
            animatorM132166l17.getClass();
            Animator animatorM132166l18 = gt0.m132166l(get_first_bt_dot(), property2, 200L, 200L, null, 0.0f, 1.0f);
            animatorM132166l18.getClass();
            AnimatorSet animatorSet3 = new AnimatorSet();
            gt0.m132177w(objectAnimator3, new Runnable() { // from class: l.erj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m76146L(this.f95478a);
                }
            }, new Runnable() { // from class: l.frj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m76143F(this.f100430a);
                }
            });
            animatorSet3.playTogether(objectAnimator3, (ObjectAnimator) animatorM132166l14, (ObjectAnimator) animatorM132166l15, (ObjectAnimator) animatorM132166l16, (ObjectAnimator) animatorM132166l17, (ObjectAnimator) animatorM132166l18);
            AnimatorSet animatorSet4 = new AnimatorSet();
            this.enterRotationAnimation = animatorSet4;
            animatorSet4.playSequentially(animatorM132164j, animatorSet, animatorM132164j2, animatorSet2, animatorM132164j3, animatorSet3);
        }
        gt0.m132160f(this.enterRotationAnimation, new Runnable() { // from class: l.grj
            @Override // java.lang.Runnable
            public final void run() {
                GiftDialogNobelEntranceView.m76149s(this.f106057a);
            }
        });
        AnimatorSet animatorSet5 = this.enterRotationAnimation;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m76158R(long delay) {
        Integer num;
        m76155O();
        if (this.enterRotationAnimation == null || (num = this.buttonAnimSize) == null || num.intValue() != 2) {
            this.buttonAnimSize = 2;
            int i = (int) delay;
            Animator animatorM132164j = gt0.m132164j(i);
            gt0.m132176v(animatorM132164j, new Runnable() { // from class: l.hrj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m76144G(this.f111345a);
                }
            });
            Property property = FrameLayout.TRANSLATION_Y;
            Animator animatorM132166l = gt0.m132166l(get_first_bt(), property, 0L, 500L, null, 0.0f, -12.0f);
            animatorM132166l.getClass();
            Property property2 = FrameLayout.ALPHA;
            Animator animatorM132166l2 = gt0.m132166l(get_first_bt(), property2, 0L, 500L, null, 1.0f, 0.0f);
            animatorM132166l2.getClass();
            ObjectAnimator objectAnimator = (ObjectAnimator) animatorM132166l2;
            Animator animatorM132166l3 = gt0.m132166l(get_first_bt_dot(), property2, 0L, 200L, null, 1.0f, 0.0f);
            animatorM132166l3.getClass();
            ObjectAnimator objectAnimator2 = (ObjectAnimator) animatorM132166l3;
            Animator animatorM132166l4 = gt0.m132166l(get_second_bt(), property, 200L, 500L, null, 12.0f, 0.0f);
            animatorM132166l4.getClass();
            ObjectAnimator objectAnimator3 = (ObjectAnimator) animatorM132166l4;
            Animator animatorM132166l5 = gt0.m132166l(get_second_bt(), property2, 200L, 500L, null, 0.0f, 1.0f);
            animatorM132166l5.getClass();
            ObjectAnimator objectAnimator4 = (ObjectAnimator) animatorM132166l5;
            Animator animatorM132166l6 = gt0.m132166l(get_second_bt_dot(), property2, 200L, 200L, null, 0.0f, 1.0f);
            animatorM132166l6.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            gt0.m132177w(objectAnimator, new Runnable() { // from class: l.irj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m76152w(this.f116573a);
                }
            }, new Runnable() { // from class: l.wqj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m76148p(this.f190412a);
                }
            });
            animatorSet.playTogether((ObjectAnimator) animatorM132166l, objectAnimator, objectAnimator2, objectAnimator3, objectAnimator4, (ObjectAnimator) animatorM132166l6);
            Animator animatorM132164j2 = gt0.m132164j(i);
            Animator animatorM132166l7 = gt0.m132166l(get_second_bt(), property, 0L, 500L, null, 0.0f, -12.0f);
            animatorM132166l7.getClass();
            ObjectAnimator objectAnimator5 = (ObjectAnimator) animatorM132166l7;
            Animator animatorM132166l8 = gt0.m132166l(get_second_bt(), property2, 0L, 500L, null, 1.0f, 0.0f);
            animatorM132166l8.getClass();
            ObjectAnimator objectAnimator6 = (ObjectAnimator) animatorM132166l8;
            Animator animatorM132166l9 = gt0.m132166l(get_second_bt_dot(), property2, 0L, 200L, null, 1.0f, 0.0f);
            animatorM132166l9.getClass();
            ObjectAnimator objectAnimator7 = (ObjectAnimator) animatorM132166l9;
            Animator animatorM132166l10 = gt0.m132166l(get_first_bt(), property, 200L, 500L, null, 12.0f, 0.0f);
            animatorM132166l10.getClass();
            ObjectAnimator objectAnimator8 = (ObjectAnimator) animatorM132166l10;
            Animator animatorM132166l11 = gt0.m132166l(get_first_bt(), property2, 200L, 500L, null, 0.0f, 1.0f);
            animatorM132166l11.getClass();
            ObjectAnimator objectAnimator9 = (ObjectAnimator) animatorM132166l11;
            Animator animatorM132166l12 = gt0.m132166l(get_first_bt_dot(), property2, 200L, 200L, null, 0.0f, 1.0f);
            animatorM132166l12.getClass();
            AnimatorSet animatorSet2 = new AnimatorSet();
            gt0.m132177w(objectAnimator5, new Runnable() { // from class: l.xqj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m76147M(this.f195808a);
                }
            }, new Runnable() { // from class: l.yqj
                @Override // java.lang.Runnable
                public final void run() {
                    GiftDialogNobelEntranceView.m76151v(this.f201219a);
                }
            });
            animatorSet2.playTogether(objectAnimator5, objectAnimator6, objectAnimator7, objectAnimator8, objectAnimator9, (ObjectAnimator) animatorM132166l12);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.enterRotationAnimation = animatorSet3;
            animatorSet3.playSequentially(animatorM132164j, animatorSet, animatorM132164j2, animatorSet2);
        }
        gt0.m132160f(this.enterRotationAnimation, new Runnable() { // from class: l.zqj
            @Override // java.lang.Runnable
            public final void run() {
                GiftDialogNobelEntranceView.m76150u(this.f205618a);
            }
        });
        AnimatorSet animatorSet4 = this.enterRotationAnimation;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m76159S(final bjs<?> presenter, final BLiveWealthButton btInfo, ConstraintLayout btGroup, VDraweeView btBgImg, VDraweeView btIcon, TextView btText, final View btDot) {
        btText.setText(btInfo.text);
        btText.setTextColor(n3d0.m161283g(btInfo.textColor));
        if (TextUtils.isEmpty(btInfo.bgUrl)) {
            btBgImg.setBackground(m76156P(btInfo));
        } else {
            btBgImg.setBackground(null);
            bnl0.m105524M(btBgImg, true);
            izs.m142870u("context_livingAct", btBgImg, btInfo.bgUrl, qa00.m175859d(77.0f), qa00.m175859d(20.0f));
        }
        String str = btInfo.icon;
        int i = qa00.f156323j;
        izs.m142870u("context_livingAct", btIcon, str, i, i);
        bnl0.m105509E0(btGroup, new View.OnClickListener() { // from class: l.vqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftDialogNobelEntranceView.m76145K(presenter, btInfo, btDot, view);
            }
        });
        String str2 = btInfo.type;
        int iHashCode = str2.hashCode();
        if (iHashCode == -1237459442) {
            if (str2.equals("growUp") && !((ifv) zrv.m221194l(htd0.f111523e)).f114708q.get().booleanValue()) {
                bnl0.m105524M(btDot, true);
                return;
            }
            return;
        }
        if (iHashCode != 3075986) {
            if (iHashCode == 104991738 && str2.equals("noble")) {
                bnl0.m105524M(btDot, false);
                return;
            }
            return;
        }
        if (str2.equals("dash") && !((ifv) zrv.m221194l(htd0.f111523e)).f114709r.get().booleanValue()) {
            bnl0.m105524M(btDot, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX INFO: renamed from: T */
    public final void m76160T(@NotNull bjs<?> presenter, @Nullable List<? extends BLiveWealthButton> buttons) {
        presenter.getClass();
        BLiveWealthButton bLiveWealthButton = buttons != null ? buttons.get(0) : null;
        if (bLiveWealthButton != null) {
            bnl0.m105524M(get_first_bt(), true);
            m76161V(get_first_bt(), true);
            get_first_bt_dot().setAlpha(1.0f);
            m76159S(presenter, bLiveWealthButton, get_first_bt(), get_first_bt_bg_img(), get_first_bt_icon(), get_first_bt_content(), get_first_bt_dot());
        }
        List<? extends BLiveWealthButton> list = buttons;
        if (jyb.m147479J(list)) {
            bnl0.m105524M(get_second_bt(), false);
        } else {
            Integer numValueOf = buttons != null ? Integer.valueOf(buttons.size()) : null;
            numValueOf.getClass();
            if (numValueOf.intValue() > 1) {
                BLiveWealthButton bLiveWealthButton2 = buttons.get(1);
                if (bLiveWealthButton2 != null) {
                    m76159S(presenter, bLiveWealthButton2, get_second_bt(), get_second_bt_bg_img(), get_second_bt_icon(), get_second_bt_content(), get_second_bt_dot());
                }
            } else {
                bnl0.m105524M(get_second_bt(), false);
            }
        }
        if (jyb.m147479J(list)) {
            bnl0.m105524M(get_third_bt(), false);
        } else {
            Integer numValueOf2 = buttons != null ? Integer.valueOf(buttons.size()) : null;
            numValueOf2.getClass();
            if (numValueOf2.intValue() > 2) {
                BLiveWealthButton bLiveWealthButton3 = buttons.get(2);
                if (bLiveWealthButton3 != null) {
                    m76159S(presenter, bLiveWealthButton3, get_third_bt(), get_third_bt_bg_img(), get_third_bt_icon(), get_third_bt_content(), get_third_bt_dot());
                }
            } else {
                bnl0.m105524M(get_third_bt(), false);
            }
        }
        Integer numValueOf3 = buttons != null ? Integer.valueOf(buttons.size()) : null;
        numValueOf3.getClass();
        if (numValueOf3.intValue() == 3) {
            m76157Q(3000L);
        } else if (buttons.size() == 2) {
            m76158R(3000L);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m76161V(ConstraintLayout bt, boolean isShow) {
        float fM175859d = qa00.m175859d(20.0f);
        bt.setAlpha(isShow ? 1.0f : 0.0f);
        if (isShow) {
            fM175859d = 0.0f;
        }
        bt.setTranslationY(fM175859d);
    }

    @NotNull
    public final ConstraintLayout get_first_bt() {
        ConstraintLayout constraintLayout = this._first_bt;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_first_bt");
        return null;
    }

    @NotNull
    public final VDraweeView get_first_bt_bg_img() {
        VDraweeView vDraweeView = this._first_bt_bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_first_bt_bg_img");
        return null;
    }

    @NotNull
    public final TextView get_first_bt_content() {
        TextView textView = this._first_bt_content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_first_bt_content");
        return null;
    }

    @NotNull
    public final View get_first_bt_dot() {
        View view = this._first_bt_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_first_bt_dot");
        return null;
    }

    @NotNull
    public final VDraweeView get_first_bt_icon() {
        VDraweeView vDraweeView = this._first_bt_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_first_bt_icon");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_second_bt() {
        ConstraintLayout constraintLayout = this._second_bt;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_second_bt");
        return null;
    }

    @NotNull
    public final VDraweeView get_second_bt_bg_img() {
        VDraweeView vDraweeView = this._second_bt_bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_second_bt_bg_img");
        return null;
    }

    @NotNull
    public final TextView get_second_bt_content() {
        TextView textView = this._second_bt_content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_second_bt_content");
        return null;
    }

    @NotNull
    public final View get_second_bt_dot() {
        View view = this._second_bt_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_second_bt_dot");
        return null;
    }

    @NotNull
    public final VDraweeView get_second_bt_icon() {
        VDraweeView vDraweeView = this._second_bt_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_second_bt_icon");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_third_bt() {
        ConstraintLayout constraintLayout = this._third_bt;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_third_bt");
        return null;
    }

    @NotNull
    public final VDraweeView get_third_bt_bg_img() {
        VDraweeView vDraweeView = this._third_bt_bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_third_bt_bg_img");
        return null;
    }

    @NotNull
    public final TextView get_third_bt_content() {
        TextView textView = this._third_bt_content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_third_bt_content");
        return null;
    }

    @NotNull
    public final View get_third_bt_dot() {
        View view = this._third_bt_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_third_bt_dot");
        return null;
    }

    @NotNull
    public final VDraweeView get_third_bt_icon() {
        VDraweeView vDraweeView = this._third_bt_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_third_bt_icon");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76155O();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76154N(this);
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
