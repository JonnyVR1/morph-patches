package com.p051p1.mobile.putong.core.p058ui.tarot;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.TarotData;
import com.p051p1.mobile.putong.core.p058ui.tarot.C9080a;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.adc0;
import p153l.agc0;
import p153l.ami0;
import p153l.ani0;
import p153l.bnl0;
import p153l.c4s;
import p153l.dbc0;
import p153l.i4g0;
import p153l.kec0;
import p153l.l4g0;
import p153l.mij0;
import p153l.p7f;
import p153l.p9r;
import p153l.pej0;
import p153l.qa00;
import p153l.uqb0;
import p153l.ur2;
import p153l.w1e;
import p153l.xa5;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.a */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u001f\"\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u001dH\u0002¢\u0006\u0004\b.\u0010%J\u0017\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u0010,J\u000f\u00101\u001a\u00020\u001dH\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\u0010J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u001dH\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u001dH\u0002¢\u0006\u0004\b?\u0010>J\u0017\u0010@\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020C2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\nH\u0002¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\f¢\u0006\u0004\bF\u0010\u0010J\u0017\u0010G\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010\u000eJ\u000f\u0010H\u001a\u00020\fH\u0016¢\u0006\u0004\bH\u0010\u0010J\u000f\u0010I\u001a\u00020\fH\u0016¢\u0006\u0004\bI\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010t\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010c\u001a\u0004\br\u0010e\"\u0004\bs\u0010gR\"\u0010x\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010c\u001a\u0004\bv\u0010e\"\u0004\bw\u0010gR\"\u0010\u007f\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010z\u001a\u0005\b\u0081\u0001\u0010|\"\u0005\b\u0082\u0001\u0010~R*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R)\u0010\u0092\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\r\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R&\u0010\u0096\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010c\u001a\u0005\b\u0094\u0001\u0010e\"\u0005\b\u0095\u0001\u0010gR\u0016\u0010\u0098\u0001\u001a\u00020:8\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010dR\u0017\u0010\u0099\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010dR\u0017\u0010\u009a\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010dR\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010vR\u0016\u0010\u009d\u0001\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010\u0094\u0001R\u0017\u0010\u009e\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010dR\u0018\u0010\u009f\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u0094\u0001R\u0018\u0010 \u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010\u0094\u0001R\u0018\u0010¡\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u0094\u0001R\u0019\u0010¤\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010£\u0001R\u0018\u0010¦\u0001\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b=\u0010¥\u0001R\u001f\u0010ª\u0001\u001a\u00030§\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bl\u0010¨\u0001\u001a\u0005\b'\u0010©\u0001¨\u0006«\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/tarot/a;", "Lcom/p1/mobile/putong/core/ui/tarot/TarotCard$a;", "Ll/xa5;", "Ll/mij0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/TarotData;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/view/View;)V", "K", "()V", "o", "Landroid/animation/AnimatorSet;", "animatorSet", "U", "(Landroid/animation/AnimatorSet;)V", "N", "p", "()Landroid/view/View;", "bigCardView", "smallCard", p7f.LATITUDE_SOUTH, "(Landroid/view/View;Landroid/view/View;Landroid/animation/AnimatorSet;)V", "", "alpha", "", "views", "Q", "(F[Landroid/view/View;)V", "distance", "P", "(F)V", "Lcom/p1/mobile/putong/core/ui/tarot/TarotCard;", ResourceDirection.f39656v, BloodType.f39576O, "(Lcom/p1/mobile/putong/core/ui/tarot/TarotCard;)V", "currentRotation", "q", "(F)F", "xVelocity", "J", "startAngle", BLiveStormDanmakuGiftResourceType.f45294s, "u", "()F", "M", "Landroid/animation/ValueAnimator;", "L", "()Landroid/animation/ValueAnimator;", "Landroid/animation/ObjectAnimator;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Landroid/animation/ObjectAnimator;", "", RXScreenCaptureService.KEY_INDEX, "currentValue", BaseSei.f14624X, "(IF)F", "w", Constants.KEY_T, "(I)F", "rootView", "Ll/pej0;", "r", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/pej0;", "R", "a", "close", "onStart", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/TarotData;", "getTarotInfo", "()Lcom/p1/mobile/putong/core/data/TarotData;", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "E", "()Landroid/widget/FrameLayout;", "set_root_layout", "(Landroid/widget/FrameLayout;)V", "_root_layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", Constants.INAPP_DATA_TAG, "Landroidx/constraintlayout/widget/ConstraintLayout;", "G", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_tarot_body", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_tarot_body", "Lv/VText;", "e", "Lv/VText;", "I", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VButton;", "f", "Lv/VButton;", BaseSei.f14625Y, "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "g", c4s.C_ZONE, "set_reading", "_reading", "h", "D", "set_reading_instruction", "_reading_instruction", "Lv/VImage;", "Lv/VImage;", "A", "()Lv/VImage;", "set_image", "(Lv/VImage;)V", "_image", "j", BaseSei.f14626Z, "set_hide_card", "_hide_card", "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", "k", "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", "H", "()Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", "set_tarot_layout", "(Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;)V", "_tarot_layout", "Lcom/p1/mobile/putong/core/ui/tarot/LineView;", "Lcom/p1/mobile/putong/core/ui/tarot/LineView;", "B", "()Lcom/p1/mobile/putong/core/ui/tarot/LineView;", "set_lineView", "(Lcom/p1/mobile/putong/core/ui/tarot/LineView;)V", "_lineView", "m", "F", "set_slide_text", "_slide_text", "n", "cardCount", "cardWidth", "cardHeight", "", "bigRadius", "maxDegree", "currentCardIndex", "mPreDistance", "maxAngle", "minAngle", "", "Z", "isCreated", "Ll/pej0;", OMSTemplateType.dialog, "Ll/l4g0;", "Lkotlin/Lazy;", "()Ll/l4g0;", "pageHelp", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C9080a implements TarotCard.InterfaceC9075a, xa5, mij0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TarotData tarotInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout _root_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _tarot_body;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VButton _close;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _reading;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _reading_instruction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _image;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VImage _hide_card;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public TarotListView _tarot_layout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public LineView _lineView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _slide_text;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final int cardCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int cardWidth;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int cardHeight;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public double bigRadius;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final float maxDegree;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int currentCardIndex;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float mPreDistance;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float maxAngle;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public float minAngle;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean isCreated;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public pej0 dialog;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.a$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m88121d2 = {"com/p1/mobile/putong/core/ui/tarot/a$a", "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView$a;", "", "xVelocity", "", "b", "(F)V", "newDistance", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class a implements TarotListView.InterfaceC9079a {
        public a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.tarot.TarotListView.InterfaceC9079a
        /* JADX INFO: renamed from: a */
        public void mo46017a(float newDistance) {
            C9080a.this.m57089P(newDistance);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.tarot.TarotListView.InterfaceC9079a
        /* JADX INFO: renamed from: b */
        public void mo46018b(float xVelocity) {
            C9080a.this.m57083J(xVelocity);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.a$b */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/p1/mobile/putong/core/ui/tarot/a$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pej0 f37444a;

        public b(pej0 pej0Var) {
            this.f37444a = pej0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 1 || p1 == 2 || p1 == 3) {
                this.f37444a.getBehavior().setState(3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.a$c */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/p1/mobile/putong/core/ui/tarot/a$c", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class c extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_tarot_card_others_popup";
        }
    }

    public C9080a(@NotNull Act act, @NotNull TarotData tarotData) {
        act.getClass();
        tarotData.getClass();
        this.act = act;
        this.tarotInfo = tarotData;
        this.cardCount = 22;
        this.maxDegree = 6.25f;
        this.pageHelp = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.qmi0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C9080a.m57068h();
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public static final void m57061T(C9080a c9080a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        if (((Float) animatedValue).floatValue() <= -272.0f) {
            c9080a.m57080G().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m57062b(C9080a c9080a, View view) {
        c9080a.close();
    }

    /* JADX INFO: renamed from: c */
    public static void m57063c(C9080a c9080a, float f, float f2, float f3, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i = c9080a.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = c9080a.m57081H().getChildAt(i2);
            if (childAt instanceof TarotCard) {
                TarotCard tarotCard = (TarotCard) childAt;
                float latestRotation = ((f - f2) * fFloatValue) + tarotCard.getLatestRotation();
                tarotCard.setRotation(latestRotation);
                double d = f3;
                double d2 = (((double) latestRotation) * 3.141592653589793d) / 180.0d;
                tarotCard.setTranslationX((float) (Math.sin(d2) * d));
                tarotCard.setTranslationY((float) (d - (Math.cos(d2) * d)));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m57064d(C9080a c9080a, float f, float f2, float f3, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i = c9080a.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = c9080a.m57081H().getChildAt(i2);
            if (childAt instanceof TarotCard) {
                TarotCard tarotCard = (TarotCard) childAt;
                float latestRotation = tarotCard.getLatestRotation() + ((f - f2) * fFloatValue);
                tarotCard.setRotation(latestRotation);
                double dM57098q = c9080a.m57098q(latestRotation);
                double d = (((double) latestRotation) * 3.141592653589793d) / 180.0d;
                tarotCard.setTranslationX((float) (Math.sin(d) * dM57098q));
                tarotCard.setTranslationY((float) (((double) f3) - (dM57098q * Math.cos(d))));
            }
        }
        if (fFloatValue == 1.0f) {
            c9080a.mPreDistance = ((float) ((((double) f3) * 6.283185307179586d) * ((double) f))) / 360.0f;
            int i3 = c9080a.cardCount;
            for (int i4 = 0; i4 < i3; i4++) {
                View childAt2 = c9080a.m57081H().getChildAt(i4);
                if (childAt2 instanceof TarotCard) {
                    c9080a.m57088O((TarotCard) childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m57065e(View view, final C9080a c9080a, View view2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        if (((Float) animatedValue).floatValue() == -90.0f) {
            view.setRotationY(-270.0f);
            view.setAlpha(1.0f);
            float width = (c9080a.m57078E().getWidth() - (qa00.m175859d(24.0f) * 2)) * 1.0f;
            view.setScaleX(view2.getWidth() / width);
            view.setScaleY(view2.getHeight() / (c9080a.m57078E().getHeight() * 1.0f));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotationY", -270.0f, -360.0f);
            objectAnimatorOfFloat.getClass();
            objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ymi0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    C9080a.m57061T(this.f200671a, valueAnimator2);
                }
            });
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", view2.getWidth() / width, 1.0f);
            objectAnimatorOfFloat2.getClass();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", view2.getHeight() / (c9080a.m57078E().getHeight() * 1.0f), 1.0f);
            objectAnimatorOfFloat3.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet.setDuration(300L);
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m57066f(C9080a c9080a, ValueAnimator valueAnimator) {
        int i;
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i2 = c9080a.cardCount;
        for (int i3 = 0; i3 < i2; i3++) {
            View childAt = c9080a.m57081H().getChildAt(i3);
            if ((childAt instanceof TarotCard) && i3 != (i = c9080a.currentCardIndex)) {
                TarotCard tarotCard = (TarotCard) childAt;
                tarotCard.setRotation(c9080a.maxDegree * (i3 - i) * fFloatValue);
                tarotCard.setTranslationX(c9080a.m57104w(i3 - c9080a.currentCardIndex, fFloatValue));
                tarotCard.setTranslationY(c9080a.m57105x(Math.abs(i3 - c9080a.currentCardIndex), fFloatValue));
                c9080a.m57088O(tarotCard);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static l4g0 m57068h() {
        return new l4g0(new c());
    }

    /* JADX INFO: renamed from: i */
    public static void m57069i(C9080a c9080a, View view) {
        c9080a.close();
    }

    /* JADX INFO: renamed from: j */
    public static void m57070j(C9080a c9080a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        c9080a.m57107z().setTranslationY((-qa00.m175859d(150.0f)) * fFloatValue);
        c9080a.m57090Q(1.0f - fFloatValue, c9080a.m57079F(), c9080a.m57075B(), c9080a.m57081H(), c9080a.m57077D(), c9080a.m57076C(), c9080a.m57106y(), c9080a.m57082I(), c9080a.m57074A());
    }

    /* JADX INFO: renamed from: k */
    public static void m57071k(C9080a c9080a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        View childAt = c9080a.m57081H().getChildAt(c9080a.currentCardIndex);
        childAt.getClass();
        if (childAt instanceof TarotCard) {
            TarotCard tarotCard = (TarotCard) childAt;
            tarotCard.setTranslationY(((-c9080a.cardHeight) / 3.0f) * fFloatValue);
            c9080a.m57088O(tarotCard);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VImage m57074A() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LineView m57075B() {
        LineView lineView = this._lineView;
        if (lineView != null) {
            return lineView;
        }
        Intrinsics.m88391r("_lineView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m57076C() {
        VText vText = this._reading;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_reading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final VText m57077D() {
        VText vText = this._reading_instruction;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_reading_instruction");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final FrameLayout m57078E() {
        FrameLayout frameLayout = this._root_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VText m57079F() {
        VText vText = this._slide_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_slide_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final ConstraintLayout m57080G() {
        ConstraintLayout constraintLayout = this._tarot_body;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_tarot_body");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final TarotListView m57081H() {
        TarotListView tarotListView = this._tarot_layout;
        if (tarotListView != null) {
            return tarotListView;
        }
        Intrinsics.m88391r("_tarot_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VText m57082I() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m57083J(float xVelocity) {
        final float fM57102u = m57102u();
        this.mPreDistance += xVelocity / 8.0f;
        final float fM57100s = m57100s(m57102u());
        final float f = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        if (fM57102u == fM57100s) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xmi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9080a.m57064d(this.f195085a, fM57100s, fM57102u, f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: K */
    public final void m57084K() {
        m57082I().setTypeface(ami0.m98827i(this.act));
        bnl0.m105509E0(m57106y(), new View.OnClickListener() { // from class: l.smi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9080a.m57062b(this.f169584a, view);
            }
        });
        int i = this.cardCount;
        this.currentCardIndex = i / 2;
        float f = this.maxDegree;
        this.maxAngle = (i / 2) * f;
        this.minAngle = (-((i - (i / 2)) - 1)) * f;
        m57096o();
        this.bigRadius = ((double) this.cardHeight) * 2.5d;
        m57086M();
        uqb0.f180374G.m127098D(m57080G(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkUyRUNRVldFWlkzNFNTR0pBS1c1SEtMQ05NRUlCUTE0IiwidyI6MTEyNSwiaCI6MTgyMSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE0NzE4OTczNjMxNzI5ODY2Nzc3fQ.webp");
    }

    /* JADX INFO: renamed from: L */
    public final ValueAnimator m57085L() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zmi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9080a.m57071k(this.f205079a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: M */
    public final void m57086M() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wmi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9080a.m57066f(this.f189797a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(500L);
        animatorSet.playSequentially(valueAnimatorOfFloat, m57085L(), m57075B().getAnim(), m57094V());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: N */
    public final void m57087N(AnimatorSet animatorSet) {
        final float fM57102u = m57102u();
        final float f = (this.maxAngle * 2.0f) + ((fM57102u > 0.0f ? 1 : -1) * fM57102u);
        final float f2 = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        if (fM57102u == f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rmi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9080a.m57063c(this.f163883a, f, fM57102u, f2, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: O */
    public final void m57088O(TarotCard v2) {
        v2.setLatestRotation(v2.getRotation());
    }

    /* JADX INFO: renamed from: P */
    public final void m57089P(float distance) {
        this.mPreDistance += distance;
        float fM57102u = m57102u();
        float f = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        int i = this.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = m57081H().getChildAt(i2);
            childAt.setRotation(m57101t(i2) + fM57102u);
            float fM57101t = m57101t(i2) + fM57102u;
            double dM57098q = m57098q(fM57101t);
            double d = (((double) fM57101t) * 3.141592653589793d) / 180.0d;
            childAt.setTranslationX((float) (Math.sin(d) * dM57098q));
            childAt.setTranslationY((float) (((double) f) - (dM57098q * Math.cos(d))));
            m57088O((TarotCard) childAt);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m57090Q(float alpha, View... views) {
        for (View view : views) {
            view.setAlpha(alpha);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m57091R() {
        pej0 pej0Var = null;
        View viewInflate = p9r.m171370a(this.act).inflate(kec0.f125614S5, (ViewGroup) null);
        viewInflate.getClass();
        m57095l(viewInflate);
        this.dialog = m57099r(this.act, viewInflate);
        m57084K();
        pej0 pej0Var2 = this.dialog;
        if (pej0Var2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            pej0Var = pej0Var2;
        }
        pej0Var.show();
    }

    /* JADX INFO: renamed from: S */
    public final void m57092S(final View bigCardView, final View smallCard, AnimatorSet animatorSet) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(smallCard, "rotationY", 0.0f, -90.0f);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tmi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9080a.m57065e(bigCardView, this, smallCard, valueAnimator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        animatorSet.playSequentially(objectAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: U */
    public final void m57093U(AnimatorSet animatorSet) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        m57107z().setVisibility(0);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vmi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9080a.m57070j(this.f184718a, valueAnimator);
            }
        });
        animatorSet.playSequentially(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: V */
    public final ObjectAnimator m57094V() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m57079F(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        return objectAnimatorOfFloat;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.tarot.TarotCard.InterfaceC9075a
    /* JADX INFO: renamed from: a */
    public void mo57036a(@NotNull View view) {
        view.getClass();
        if (m57079F().getAlpha() == 1.0f) {
            i4g0.m138520r("e_tarot_divination_popup_choose", "p_tarot_divination_popup");
            view.setVisibility(8);
            AnimatorSet animatorSet = new AnimatorSet();
            m57093U(animatorSet);
            m57087N(animatorSet);
            m57092S(m57097p(), m57107z(), animatorSet);
            animatorSet.start();
        }
    }

    @Override // p153l.xa5
    public void close() {
        if (this.isCreated) {
            w1e.m204401e(m57103v());
        }
        pej0 pej0Var = this.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: l */
    public final void m57095l(View view) {
        ani0.m98983a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final void m57096o() {
        int i = this.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            TarotCard tarotCard = new TarotCard(this.act);
            tarotCard.setListener(this);
            tarotCard.setImageResource(dbc0.f87018gc);
            if (this.cardWidth == 0) {
                tarotCard.measure(0, 0);
                this.cardWidth = tarotCard.getMeasuredWidth();
                this.cardHeight = tarotCard.getMeasuredHeight();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.cardWidth, this.cardHeight);
            layoutParams.gravity = 1;
            layoutParams.topMargin = (this.cardHeight / 2) - qa00.m175859d(10.0f);
            layoutParams.bottomMargin = this.cardHeight / 2;
            tarotCard.setLayoutParams(layoutParams);
            m57081H().addView(tarotCard);
        }
        m57081H().setOnScrollListener(new a());
    }

    @Override // p153l.mij0
    public void onStart() {
        pej0 pej0Var = this.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        Window window = pej0Var.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }

    /* JADX INFO: renamed from: p */
    public final View m57097p() throws JSONException {
        this.isCreated = true;
        View viewInflate = p9r.m171370a(this.act).inflate(kec0.f125550O5, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, bnl0.m105588w0());
        layoutParams.leftMargin = qa00.m175859d(24.0f);
        layoutParams.rightMargin = qa00.m175859d(24.0f);
        viewInflate.setVisibility(0);
        viewInflate.setAlpha(0.0f);
        viewInflate.setLayoutParams(layoutParams);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70031N5);
        ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.C0221a) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0221a) layoutParams2)).height = bnl0.m105592y0() - qa00.m175859d(24.0f);
            vDraweeView.setLayoutParams(layoutParams2);
        }
        m57078E().addView(viewInflate);
        m57078E().setOnClickListener(new View.OnClickListener() { // from class: l.umi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9080a.m57069i(this.f179648a, view);
            }
        });
        if (viewInflate instanceof TarotInfoView) {
            TarotInfoView tarotInfoView = (TarotInfoView) viewInflate;
            tarotInfoView.m57060i0(this.act, this.tarotInfo);
            tarotInfoView.setListener(this);
            tarotInfoView.setTranslationListener(this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("other_user_id", this.tarotInfo.card.f56859id);
        jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        m57103v().m152780o(jSONObject);
        w1e.m204402f(m57103v());
        return viewInflate;
    }

    /* JADX INFO: renamed from: q */
    public final float m57098q(float currentRotation) {
        double d = this.bigRadius;
        float f = (float) d;
        float f2 = (float) (d - ((double) (this.cardHeight / 2.0f)));
        if (Math.abs(currentRotation) > this.maxDegree) {
            return f2;
        }
        return f - (((f - f2) / this.maxDegree) * Math.abs(currentRotation));
    }

    /* JADX INFO: renamed from: r */
    public final pej0 m57099r(Act act, View rootView) {
        pej0 pej0Var = new pej0(act, agc0.f71118d);
        pej0Var.setContentView(rootView);
        pej0Var.setCancelable(true);
        pej0Var.getBehavior().setState(3);
        pej0Var.getBehavior().addBottomSheetCallback(new b(pej0Var));
        return pej0Var;
    }

    /* JADX INFO: renamed from: s */
    public final float m57100s(float startAngle) {
        float f = this.minAngle;
        if (startAngle <= f) {
            return f;
        }
        float f2 = this.maxAngle;
        if (startAngle >= f2) {
            return f2;
        }
        while (f < this.maxAngle) {
            if (startAngle >= f && startAngle < this.maxDegree + f) {
                return f;
            }
            f += this.maxDegree;
        }
        return startAngle;
    }

    /* JADX INFO: renamed from: t */
    public final float m57101t(int i) {
        return (i - (this.cardCount / 2)) * this.maxDegree;
    }

    /* JADX INFO: renamed from: u */
    public final float m57102u() {
        double d = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        float f = (float) (((double) (this.mPreDistance * 360.0f)) / (6.283185307179586d * d));
        float f2 = this.maxAngle;
        if (f > f2) {
            this.mPreDistance = (float) (((((double) (2.0f * f2)) * 3.141592653589793d) * d) / 360.0d);
            return f2;
        }
        float f3 = this.minAngle;
        if (f >= f3) {
            return f;
        }
        this.mPreDistance = (float) (((((double) (2.0f * f3)) * 3.141592653589793d) * d) / 360.0d);
        return f3;
    }

    /* JADX INFO: renamed from: v */
    public final l4g0 m57103v() {
        return (l4g0) this.pageHelp.getValue();
    }

    /* JADX INFO: renamed from: w */
    public final float m57104w(int i, float currentValue) {
        return (float) ((this.bigRadius - ((double) (this.cardHeight / 2))) * Math.sin(((((double) (i * this.maxDegree)) * 3.141592653589793d) / 180.0d) * ((double) currentValue)));
    }

    /* JADX INFO: renamed from: x */
    public final float m57105x(int i, float currentValue) {
        double d = this.bigRadius;
        int i2 = this.cardHeight;
        return (float) ((d - ((double) (i2 / 2))) - ((d - ((double) (i2 / 2))) * Math.cos(((((double) (i * this.maxDegree)) * 3.141592653589793d) / 180.0d) * ((double) currentValue))));
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VButton m57106y() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VImage m57107z() {
        VImage vImage = this._hide_card;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_hide_card");
        return null;
    }
}
