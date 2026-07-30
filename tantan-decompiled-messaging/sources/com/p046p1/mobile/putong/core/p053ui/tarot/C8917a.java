package com.p046p1.mobile.putong.core.p053ui.tarot;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.TarotData;
import com.p046p1.mobile.putong.core.p053ui.tarot.C8917a;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.adi0;
import p149l.aei0;
import p149l.b2s;
import p149l.cwf0;
import p149l.er2;
import p149l.f6c0;
import p149l.i0e;
import p149l.i9j0;
import p149l.j6f;
import p149l.l5j0;
import p149l.o7r;
import p149l.qib0;
import p149l.t100;
import p149l.u4c0;
import p149l.v7c0;
import p149l.w95;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u001f\"\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u001dH\u0002¢\u0006\u0004\b.\u0010%J\u0017\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u0010,J\u000f\u00101\u001a\u00020\u001dH\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\u0010J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u001dH\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u001dH\u0002¢\u0006\u0004\b?\u0010>J\u0017\u0010@\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020C2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\nH\u0002¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\f¢\u0006\u0004\bF\u0010\u0010J\u0017\u0010G\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010\u000eJ\u000f\u0010H\u001a\u00020\fH\u0016¢\u0006\u0004\bH\u0010\u0010J\u000f\u0010I\u001a\u00020\fH\u0016¢\u0006\u0004\bI\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010t\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010c\u001a\u0004\br\u0010e\"\u0004\bs\u0010gR\"\u0010x\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010c\u001a\u0004\bv\u0010e\"\u0004\bw\u0010gR\"\u0010\u007f\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010z\u001a\u0005\b\u0081\u0001\u0010|\"\u0005\b\u0082\u0001\u0010~R*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R)\u0010\u0092\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\r\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R&\u0010\u0096\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010c\u001a\u0005\b\u0094\u0001\u0010e\"\u0005\b\u0095\u0001\u0010gR\u0016\u0010\u0098\u0001\u001a\u00020:8\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010dR\u0017\u0010\u0099\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010dR\u0017\u0010\u009a\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010dR\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010vR\u0016\u0010\u009d\u0001\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010\u0094\u0001R\u0017\u0010\u009e\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010dR\u0018\u0010\u009f\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u0094\u0001R\u0018\u0010 \u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010\u0094\u0001R\u0018\u0010¡\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u0094\u0001R\u0019\u0010¤\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010£\u0001R\u0018\u0010¦\u0001\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b=\u0010¥\u0001R\u001f\u0010ª\u0001\u001a\u00030§\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bl\u0010¨\u0001\u001a\u0005\b'\u0010©\u0001¨\u0006«\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/tarot/a;", "Lcom/p1/mobile/putong/core/ui/tarot/TarotCard$a;", "Ll/w95;", "Ll/i9j0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/TarotData;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/view/View;)V", "K", "()V", "o", "Landroid/animation/AnimatorSet;", "animatorSet", "U", "(Landroid/animation/AnimatorSet;)V", "N", "p", "()Landroid/view/View;", "bigCardView", "smallCard", j6f.LATITUDE_SOUTH, "(Landroid/view/View;Landroid/view/View;Landroid/animation/AnimatorSet;)V", "", "alpha", "", "views", "Q", "(F[Landroid/view/View;)V", "distance", "P", "(F)V", "Lcom/p1/mobile/putong/core/ui/tarot/TarotCard;", ResourceDirection.f38808v, BloodType.f38728O, "(Lcom/p1/mobile/putong/core/ui/tarot/TarotCard;)V", "currentRotation", "q", "(F)F", "xVelocity", "J", "startAngle", BLiveStormDanmakuGiftResourceType.f44446s, "u", "()F", "M", "Landroid/animation/ValueAnimator;", "L", "()Landroid/animation/ValueAnimator;", "Landroid/animation/ObjectAnimator;", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Landroid/animation/ObjectAnimator;", "", RXScreenCaptureService.KEY_INDEX, "currentValue", BaseSei.f13930X, "(IF)F", "w", Constants.KEY_T, "(I)F", "rootView", "Ll/l5j0;", "r", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "R", "a", "close", "onStart", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/TarotData;", "getTarotInfo", "()Lcom/p1/mobile/putong/core/data/TarotData;", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "E", "()Landroid/widget/FrameLayout;", "set_root_layout", "(Landroid/widget/FrameLayout;)V", "_root_layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", Constants.INAPP_DATA_TAG, "Landroidx/constraintlayout/widget/ConstraintLayout;", "G", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_tarot_body", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_tarot_body", "Lv/VText;", "e", "Lv/VText;", "I", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VButton;", "f", "Lv/VButton;", BaseSei.f13931Y, "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "g", b2s.C_ZONE, "set_reading", "_reading", "h", "D", "set_reading_instruction", "_reading_instruction", "Lv/VImage;", "Lv/VImage;", "A", "()Lv/VImage;", "set_image", "(Lv/VImage;)V", "_image", "j", BaseSei.f13932Z, "set_hide_card", "_hide_card", "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", "k", "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", "H", "()Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", "set_tarot_layout", "(Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;)V", "_tarot_layout", "Lcom/p1/mobile/putong/core/ui/tarot/LineView;", "Lcom/p1/mobile/putong/core/ui/tarot/LineView;", "B", "()Lcom/p1/mobile/putong/core/ui/tarot/LineView;", "set_lineView", "(Lcom/p1/mobile/putong/core/ui/tarot/LineView;)V", "_lineView", "m", "F", "set_slide_text", "_slide_text", "n", "cardCount", "cardWidth", "cardHeight", "", "bigRadius", "maxDegree", "currentCardIndex", "mPreDistance", "maxAngle", "minAngle", "", "Z", "isCreated", "Ll/l5j0;", OMSTemplateType.dialog, "Ll/cwf0;", "Lkotlin/Lazy;", "()Ll/cwf0;", "pageHelp", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8917a implements TarotCard.InterfaceC8912a, w95, i9j0 {

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
    public l5j0 dialog;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.a$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m87232d2 = {"com/p1/mobile/putong/core/ui/tarot/a$a", "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView$a;", "", "xVelocity", "", "b", "(F)V", "newDistance", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class a implements TarotListView.InterfaceC8916a {
        public a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.tarot.TarotListView.InterfaceC8916a
        /* JADX INFO: renamed from: a */
        public void mo44834a(float newDistance) {
            C8917a.this.m55906P(newDistance);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.tarot.TarotListView.InterfaceC8916a
        /* JADX INFO: renamed from: b */
        public void mo44835b(float xVelocity) {
            C8917a.this.m55900J(xVelocity);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.a$b */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/p1/mobile/putong/core/ui/tarot/a$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f36596a;

        public b(l5j0 l5j0Var) {
            this.f36596a = l5j0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 1 || p1 == 2 || p1 == 3) {
                this.f36596a.getBehavior().setState(3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.a$c */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/core/ui/tarot/a$c", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class c extends er2 {
        @Override // p149l.n3m
        public String pageId() {
            return "p_tarot_card_others_popup";
        }
    }

    public C8917a(@NotNull Act act, @NotNull TarotData tarotData) {
        act.getClass();
        tarotData.getClass();
        this.act = act;
        this.tarotInfo = tarotData;
        this.cardCount = 22;
        this.maxDegree = 6.25f;
        this.pageHelp = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.qdi0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8917a.m55885h();
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public static final void m55878T(C8917a c8917a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        if (((Float) animatedValue).floatValue() <= -272.0f) {
            c8917a.m55897G().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m55879b(C8917a c8917a, View view) {
        c8917a.close();
    }

    /* JADX INFO: renamed from: c */
    public static void m55880c(C8917a c8917a, float f, float f2, float f3, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i = c8917a.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = c8917a.m55898H().getChildAt(i2);
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
    public static void m55881d(C8917a c8917a, float f, float f2, float f3, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i = c8917a.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = c8917a.m55898H().getChildAt(i2);
            if (childAt instanceof TarotCard) {
                TarotCard tarotCard = (TarotCard) childAt;
                float latestRotation = tarotCard.getLatestRotation() + ((f - f2) * fFloatValue);
                tarotCard.setRotation(latestRotation);
                double dM55915q = c8917a.m55915q(latestRotation);
                double d = (((double) latestRotation) * 3.141592653589793d) / 180.0d;
                tarotCard.setTranslationX((float) (Math.sin(d) * dM55915q));
                tarotCard.setTranslationY((float) (((double) f3) - (dM55915q * Math.cos(d))));
            }
        }
        if (fFloatValue == 1.0f) {
            c8917a.mPreDistance = ((float) ((((double) f3) * 6.283185307179586d) * ((double) f))) / 360.0f;
            int i3 = c8917a.cardCount;
            for (int i4 = 0; i4 < i3; i4++) {
                View childAt2 = c8917a.m55898H().getChildAt(i4);
                if (childAt2 instanceof TarotCard) {
                    c8917a.m55905O((TarotCard) childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m55882e(View view, final C8917a c8917a, View view2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        if (((Float) animatedValue).floatValue() == -90.0f) {
            view.setRotationY(-270.0f);
            view.setAlpha(1.0f);
            float width = (c8917a.m55895E().getWidth() - (t100.m186890d(24.0f) * 2)) * 1.0f;
            view.setScaleX(view2.getWidth() / width);
            view.setScaleY(view2.getHeight() / (c8917a.m55895E().getHeight() * 1.0f));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotationY", -270.0f, -360.0f);
            objectAnimatorOfFloat.getClass();
            objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ydi0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    C8917a.m55878T(this.f197570a, valueAnimator2);
                }
            });
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", view2.getWidth() / width, 1.0f);
            objectAnimatorOfFloat2.getClass();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", view2.getHeight() / (c8917a.m55895E().getHeight() * 1.0f), 1.0f);
            objectAnimatorOfFloat3.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet.setDuration(300L);
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m55883f(C8917a c8917a, ValueAnimator valueAnimator) {
        int i;
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i2 = c8917a.cardCount;
        for (int i3 = 0; i3 < i2; i3++) {
            View childAt = c8917a.m55898H().getChildAt(i3);
            if ((childAt instanceof TarotCard) && i3 != (i = c8917a.currentCardIndex)) {
                TarotCard tarotCard = (TarotCard) childAt;
                tarotCard.setRotation(c8917a.maxDegree * (i3 - i) * fFloatValue);
                tarotCard.setTranslationX(c8917a.m55921w(i3 - c8917a.currentCardIndex, fFloatValue));
                tarotCard.setTranslationY(c8917a.m55922x(Math.abs(i3 - c8917a.currentCardIndex), fFloatValue));
                c8917a.m55905O(tarotCard);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static cwf0 m55885h() {
        return new cwf0(new c());
    }

    /* JADX INFO: renamed from: i */
    public static void m55886i(C8917a c8917a, View view) {
        c8917a.close();
    }

    /* JADX INFO: renamed from: j */
    public static void m55887j(C8917a c8917a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        c8917a.m55924z().setTranslationY((-t100.m186890d(150.0f)) * fFloatValue);
        c8917a.m55907Q(1.0f - fFloatValue, c8917a.m55896F(), c8917a.m55892B(), c8917a.m55898H(), c8917a.m55894D(), c8917a.m55893C(), c8917a.m55923y(), c8917a.m55899I(), c8917a.m55891A());
    }

    /* JADX INFO: renamed from: k */
    public static void m55888k(C8917a c8917a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        View childAt = c8917a.m55898H().getChildAt(c8917a.currentCardIndex);
        childAt.getClass();
        if (childAt instanceof TarotCard) {
            TarotCard tarotCard = (TarotCard) childAt;
            tarotCard.setTranslationY(((-c8917a.cardHeight) / 3.0f) * fFloatValue);
            c8917a.m55905O(tarotCard);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VImage m55891A() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LineView m55892B() {
        LineView lineView = this._lineView;
        if (lineView != null) {
            return lineView;
        }
        Intrinsics.m87502r("_lineView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m55893C() {
        VText vText = this._reading;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_reading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final VText m55894D() {
        VText vText = this._reading_instruction;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_reading_instruction");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final FrameLayout m55895E() {
        FrameLayout frameLayout = this._root_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VText m55896F() {
        VText vText = this._slide_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_slide_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final ConstraintLayout m55897G() {
        ConstraintLayout constraintLayout = this._tarot_body;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_tarot_body");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final TarotListView m55898H() {
        TarotListView tarotListView = this._tarot_layout;
        if (tarotListView != null) {
            return tarotListView;
        }
        Intrinsics.m87502r("_tarot_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VText m55899I() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m55900J(float xVelocity) {
        final float fM55919u = m55919u();
        this.mPreDistance += xVelocity / 8.0f;
        final float fM55917s = m55917s(m55919u());
        final float f = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        if (fM55919u == fM55917s) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8917a.m55881d(this.f192390a, fM55917s, fM55919u, f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: K */
    public final void m55901K() {
        m55899I().setTypeface(adi0.m95896i(this.act));
        xdl0.m208329E0(m55923y(), new View.OnClickListener() { // from class: l.sdi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8917a.m55879b(this.f163845a, view);
            }
        });
        int i = this.cardCount;
        this.currentCardIndex = i / 2;
        float f = this.maxDegree;
        this.maxAngle = (i / 2) * f;
        this.minAngle = (-((i - (i / 2)) - 1)) * f;
        m55913o();
        this.bigRadius = ((double) this.cardHeight) * 2.5d;
        m55903M();
        qib0.f154691G.m102314D(m55897G(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkUyRUNRVldFWlkzNFNTR0pBS1c1SEtMQ05NRUlCUTE0IiwidyI6MTEyNSwiaCI6MTgyMSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE0NzE4OTczNjMxNzI5ODY2Nzc3fQ.webp");
    }

    /* JADX INFO: renamed from: L */
    public final ValueAnimator m55902L() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8917a.m55888k(this.f202668a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: M */
    public final void m55903M() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8917a.m55883f(this.f185806a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(500L);
        animatorSet.playSequentially(valueAnimatorOfFloat, m55902L(), m55892B().getAnim(), m55911V());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: N */
    public final void m55904N(AnimatorSet animatorSet) {
        final float fM55919u = m55919u();
        final float f = (this.maxAngle * 2.0f) + ((fM55919u > 0.0f ? 1 : -1) * fM55919u);
        final float f2 = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        if (fM55919u == f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8917a.m55880c(this.f158937a, f, fM55919u, f2, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: O */
    public final void m55905O(TarotCard v2) {
        v2.setLatestRotation(v2.getRotation());
    }

    /* JADX INFO: renamed from: P */
    public final void m55906P(float distance) {
        this.mPreDistance += distance;
        float fM55919u = m55919u();
        float f = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        int i = this.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = m55898H().getChildAt(i2);
            childAt.setRotation(m55918t(i2) + fM55919u);
            float fM55918t = m55918t(i2) + fM55919u;
            double dM55915q = m55915q(fM55918t);
            double d = (((double) fM55918t) * 3.141592653589793d) / 180.0d;
            childAt.setTranslationX((float) (Math.sin(d) * dM55915q));
            childAt.setTranslationY((float) (((double) f) - (dM55915q * Math.cos(d))));
            m55905O((TarotCard) childAt);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m55907Q(float alpha, View... views) {
        for (View view : views) {
            view.setAlpha(alpha);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m55908R() {
        l5j0 l5j0Var = null;
        View viewInflate = o7r.m163037a(this.act).inflate(f6c0.f95544R5, (ViewGroup) null);
        viewInflate.getClass();
        m55912l(viewInflate);
        this.dialog = m55916r(this.act, viewInflate);
        m55901K();
        l5j0 l5j0Var2 = this.dialog;
        if (l5j0Var2 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            l5j0Var = l5j0Var2;
        }
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: S */
    public final void m55909S(final View bigCardView, final View smallCard, AnimatorSet animatorSet) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(smallCard, "rotationY", 0.0f, -90.0f);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8917a.m55882e(bigCardView, this, smallCard, valueAnimator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        animatorSet.playSequentially(objectAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: U */
    public final void m55910U(AnimatorSet animatorSet) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        m55924z().setVisibility(0);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8917a.m55887j(this.f181090a, valueAnimator);
            }
        });
        animatorSet.playSequentially(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: V */
    public final ObjectAnimator m55911V() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m55896F(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        return objectAnimatorOfFloat;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.tarot.TarotCard.InterfaceC8912a
    /* JADX INFO: renamed from: a */
    public void mo55853a(@NotNull View view) {
        view.getClass();
        if (m55896F().getAlpha() == 1.0f) {
            zvf0.m220396r("e_tarot_divination_popup_choose", "p_tarot_divination_popup");
            view.setVisibility(8);
            AnimatorSet animatorSet = new AnimatorSet();
            m55910U(animatorSet);
            m55904N(animatorSet);
            m55909S(m55914p(), m55924z(), animatorSet);
            animatorSet.start();
        }
    }

    @Override // p149l.w95
    public void close() {
        if (this.isCreated) {
            i0e.m133796e(m55920v());
        }
        l5j0 l5j0Var = this.dialog;
        if (l5j0Var == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: l */
    public final void m55912l(View view) {
        aei0.m96108a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final void m55913o() {
        int i = this.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            TarotCard tarotCard = new TarotCard(this.act);
            tarotCard.setListener(this);
            tarotCard.setImageResource(x2c0.f190137fc);
            if (this.cardWidth == 0) {
                tarotCard.measure(0, 0);
                this.cardWidth = tarotCard.getMeasuredWidth();
                this.cardHeight = tarotCard.getMeasuredHeight();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.cardWidth, this.cardHeight);
            layoutParams.gravity = 1;
            layoutParams.topMargin = (this.cardHeight / 2) - t100.m186890d(10.0f);
            layoutParams.bottomMargin = this.cardHeight / 2;
            tarotCard.setLayoutParams(layoutParams);
            m55898H().addView(tarotCard);
        }
        m55898H().setOnScrollListener(new a());
    }

    @Override // p149l.i9j0
    public void onStart() {
        l5j0 l5j0Var = this.dialog;
        if (l5j0Var == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            l5j0Var = null;
        }
        Window window = l5j0Var.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }

    /* JADX INFO: renamed from: p */
    public final View m55914p() throws JSONException {
        this.isCreated = true;
        View viewInflate = o7r.m163037a(this.act).inflate(f6c0.f95480N5, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, xdl0.m208408w0());
        layoutParams.leftMargin = t100.m186890d(24.0f);
        layoutParams.rightMargin = t100.m186890d(24.0f);
        viewInflate.setVisibility(0);
        viewInflate.setAlpha(0.0f);
        viewInflate.setLayoutParams(layoutParams);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173909L5);
        ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.C0220a) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0220a) layoutParams2)).height = xdl0.m208412y0() - t100.m186890d(24.0f);
            vDraweeView.setLayoutParams(layoutParams2);
        }
        m55895E().addView(viewInflate);
        m55895E().setOnClickListener(new View.OnClickListener() { // from class: l.udi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8917a.m55886i(this.f175927a, view);
            }
        });
        if (viewInflate instanceof TarotInfoView) {
            TarotInfoView tarotInfoView = (TarotInfoView) viewInflate;
            tarotInfoView.m55877i0(this.act, this.tarotInfo);
            tarotInfoView.setListener(this);
            tarotInfoView.setTranslationListener(this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("other_user_id", this.tarotInfo.card.f56011id);
        jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        m55920v().m109039o(jSONObject);
        i0e.m133797f(m55920v());
        return viewInflate;
    }

    /* JADX INFO: renamed from: q */
    public final float m55915q(float currentRotation) {
        double d = this.bigRadius;
        float f = (float) d;
        float f2 = (float) (d - ((double) (this.cardHeight / 2.0f)));
        if (Math.abs(currentRotation) > this.maxDegree) {
            return f2;
        }
        return f - (((f - f2) / this.maxDegree) * Math.abs(currentRotation));
    }

    /* JADX INFO: renamed from: r */
    public final l5j0 m55916r(Act act, View rootView) {
        l5j0 l5j0Var = new l5j0(act, v7c0.f180357d);
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().addBottomSheetCallback(new b(l5j0Var));
        return l5j0Var;
    }

    /* JADX INFO: renamed from: s */
    public final float m55917s(float startAngle) {
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
    public final float m55918t(int i) {
        return (i - (this.cardCount / 2)) * this.maxDegree;
    }

    /* JADX INFO: renamed from: u */
    public final float m55919u() {
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
    public final cwf0 m55920v() {
        return (cwf0) this.pageHelp.getValue();
    }

    /* JADX INFO: renamed from: w */
    public final float m55921w(int i, float currentValue) {
        return (float) ((this.bigRadius - ((double) (this.cardHeight / 2))) * Math.sin(((((double) (i * this.maxDegree)) * 3.141592653589793d) / 180.0d) * ((double) currentValue)));
    }

    /* JADX INFO: renamed from: x */
    public final float m55922x(int i, float currentValue) {
        double d = this.bigRadius;
        int i2 = this.cardHeight;
        return (float) ((d - ((double) (i2 / 2))) - ((d - ((double) (i2 / 2))) * Math.cos(((((double) (i * this.maxDegree)) * 3.141592653589793d) / 180.0d) * ((double) currentValue))));
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VButton m55923y() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VImage m55924z() {
        VImage vImage = this._hide_card;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_hide_card");
        return null;
    }
}
