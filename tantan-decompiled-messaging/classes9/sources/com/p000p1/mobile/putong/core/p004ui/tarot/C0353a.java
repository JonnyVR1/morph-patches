package com.p000p1.mobile.putong.core.p004ui.tarot;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.p004ui.tarot.C0353a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.TarotData;
import com.tantanapp.common.data.DbObject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.aei0;
import l.cwf0;
import l.er2;
import l.i0e;
import l.l5j0;
import l.o7r;
import l.t100;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.adi0;
import p006l.f6c0;
import p006l.i9j0;
import p006l.qib0;
import p006l.u4c0;
import p006l.v7c0;
import p006l.w95;
import p006l.x2c0;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u001f\"\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u001dH\u0002¢\u0006\u0004\b.\u0010%J\u0017\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u0010,J\u000f\u00101\u001a\u00020\u001dH\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\u0010J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u001dH\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u001dH\u0002¢\u0006\u0004\b?\u0010>J\u0017\u0010@\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020C2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\nH\u0002¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\f¢\u0006\u0004\bF\u0010\u0010J\u0017\u0010G\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010\u000eJ\u000f\u0010H\u001a\u00020\fH\u0016¢\u0006\u0004\bH\u0010\u0010J\u000f\u0010I\u001a\u00020\fH\u0016¢\u0006\u0004\bI\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010t\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010c\u001a\u0004\br\u0010e\"\u0004\bs\u0010gR\"\u0010x\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010c\u001a\u0004\bv\u0010e\"\u0004\bw\u0010gR\"\u0010\u007f\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010z\u001a\u0005\b\u0081\u0001\u0010|\"\u0005\b\u0082\u0001\u0010~R*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R)\u0010\u0092\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\r\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R&\u0010\u0096\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010c\u001a\u0005\b\u0094\u0001\u0010e\"\u0005\b\u0095\u0001\u0010gR\u0016\u0010\u0098\u0001\u001a\u00020:8\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010dR\u0017\u0010\u0099\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010dR\u0017\u0010\u009a\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010dR\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010vR\u0016\u0010\u009d\u0001\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010\u0094\u0001R\u0017\u0010\u009e\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010dR\u0018\u0010\u009f\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u0094\u0001R\u0018\u0010 \u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010\u0094\u0001R\u0018\u0010¡\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u0094\u0001R\u0019\u0010¤\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010£\u0001R\u0018\u0010¦\u0001\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b=\u0010¥\u0001R\u001f\u0010ª\u0001\u001a\u00030§\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bl\u0010¨\u0001\u001a\u0005\b'\u0010©\u0001¨\u0006«\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/ui/tarot/a;", "Lcom/p1/mobile/putong/core/ui/tarot/TarotCard$a;", "Ll/w95;", "Ll/i9j0;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/TarotData;)V", "Landroid/view/View;", "view", "", "l", "(Landroid/view/View;)V", "K", "()V", "o", "Landroid/animation/AnimatorSet;", "animatorSet", "U", "(Landroid/animation/AnimatorSet;)V", "N", "p", "()Landroid/view/View;", "bigCardView", "smallCard", "S", "(Landroid/view/View;Landroid/view/View;Landroid/animation/AnimatorSet;)V", "", "alpha", "", "views", "Q", "(F[Landroid/view/View;)V", "distance", "P", "(F)V", "Lcom/p1/mobile/putong/core/ui/tarot/TarotCard;", "v", "O", "(Lcom/p1/mobile/putong/core/ui/tarot/TarotCard;)V", "currentRotation", "q", "(F)F", "xVelocity", "J", "startAngle", "s", "u", "()F", "M", "Landroid/animation/ValueAnimator;", "L", "()Landroid/animation/ValueAnimator;", "Landroid/animation/ObjectAnimator;", "V", "()Landroid/animation/ObjectAnimator;", "", "i", "currentValue", "x", "(IF)F", "w", "t", "(I)F", "rootView", "Ll/l5j0;", "r", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "R", "a", "close", "onStart", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/TarotData;", "getTarotInfo", "()Lcom/p1/mobile/putong/core/data/TarotData;", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "E", "()Landroid/widget/FrameLayout;", "set_root_layout", "(Landroid/widget/FrameLayout;)V", "_root_layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "d", "Landroidx/constraintlayout/widget/ConstraintLayout;", "G", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_tarot_body", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_tarot_body", "Lv/VText;", "e", "Lv/VText;", "I", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VButton;", "f", "Lv/VButton;", "y", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "g", "C", "set_reading", "_reading", "h", "D", "set_reading_instruction", "_reading_instruction", "Lv/VImage;", "Lv/VImage;", "A", "()Lv/VImage;", "set_image", "(Lv/VImage;)V", "_image", "j", "z", "set_hide_card", "_hide_card", "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", "k", "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", "H", "()Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", "set_tarot_layout", "(Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;)V", "_tarot_layout", "Lcom/p1/mobile/putong/core/ui/tarot/LineView;", "Lcom/p1/mobile/putong/core/ui/tarot/LineView;", "B", "()Lcom/p1/mobile/putong/core/ui/tarot/LineView;", "set_lineView", "(Lcom/p1/mobile/putong/core/ui/tarot/LineView;)V", "_lineView", "m", "F", "set_slide_text", "_slide_text", "n", "cardCount", "cardWidth", "cardHeight", "", "bigRadius", "maxDegree", "currentCardIndex", "mPreDistance", "maxAngle", "minAngle", "", "Z", "isCreated", "Ll/l5j0;", "dialog", "Ll/cwf0;", "Lkotlin/Lazy;", "()Ll/cwf0;", "pageHelp", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0353a implements TarotCard.InterfaceC0348a, w95, i9j0 {

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
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/p1/mobile/putong/core/ui/tarot/a$a", "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView$a;", "", "xVelocity", "", "b", "(F)V", "newDistance", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements TarotListView.InterfaceC0352a {
        public a() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.tarot.TarotListView.InterfaceC0352a
        /* JADX INFO: renamed from: a */
        public void mo9278a(float newDistance) {
            C0353a.this.m9308P(newDistance);
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.tarot.TarotListView.InterfaceC0352a
        /* JADX INFO: renamed from: b */
        public void mo9279b(float xVelocity) {
            C0353a.this.m9302J(xVelocity);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.a$b */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/p1/mobile/putong/core/ui/tarot/a$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f6377a;

        public b(l5j0 l5j0Var) {
            this.f6377a = l5j0Var;
        }

        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 1 || p1 == 2 || p1 == 3) {
                this.f6377a.getBehavior().setState(3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.a$c */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p1/mobile/putong/core/ui/tarot/a$c", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends er2 {
        public String pageId() {
            return "p_tarot_card_others_popup";
        }
    }

    public C0353a(@NotNull Act act, @NotNull TarotData tarotData) {
        act.getClass();
        tarotData.getClass();
        this.act = act;
        this.tarotInfo = tarotData;
        this.cardCount = 22;
        this.maxDegree = 6.25f;
        this.pageHelp = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.qdi0
            public final Object invoke() {
                return C0353a.m9287h();
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public static final void m9280T(C0353a c0353a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        if (((Float) animatedValue).floatValue() <= -272.0f) {
            c0353a.m9299G().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9281b(C0353a c0353a, View view) {
        c0353a.close();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, com.p1.mobile.putong.core.ui.tarot.TarotCard] */
    /* JADX INFO: renamed from: c */
    public static void m9282c(C0353a c0353a, float f, float f2, float f3, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i = c0353a.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            Object childAt = c0353a.m9300H().getChildAt(i2);
            if (childAt instanceof TarotCard) {
                ?? r2 = (TarotCard) childAt;
                float latestRotation = ((f - f2) * fFloatValue) + r2.getLatestRotation();
                r2.setRotation(latestRotation);
                double d = f3;
                double d2 = (((double) latestRotation) * 3.141592653589793d) / 180.0d;
                r2.setTranslationX((float) (Math.sin(d2) * d));
                r2.setTranslationY((float) (d - (Math.cos(d2) * d)));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.p1.mobile.putong.core.ui.tarot.TarotCard] */
    /* JADX INFO: renamed from: d */
    public static void m9283d(C0353a c0353a, float f, float f2, float f3, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i = c0353a.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            Object childAt = c0353a.m9300H().getChildAt(i2);
            if (childAt instanceof TarotCard) {
                ?? r3 = (TarotCard) childAt;
                float latestRotation = r3.getLatestRotation() + ((f - f2) * fFloatValue);
                r3.setRotation(latestRotation);
                double dM9317q = c0353a.m9317q(latestRotation);
                double d = (((double) latestRotation) * 3.141592653589793d) / 180.0d;
                r3.setTranslationX((float) (Math.sin(d) * dM9317q));
                r3.setTranslationY((float) (((double) f3) - (dM9317q * Math.cos(d))));
            }
        }
        if (fFloatValue == 1.0f) {
            c0353a.mPreDistance = ((float) ((((double) f3) * 6.283185307179586d) * ((double) f))) / 360.0f;
            int i3 = c0353a.cardCount;
            for (int i4 = 0; i4 < i3; i4++) {
                Object childAt2 = c0353a.m9300H().getChildAt(i4);
                if (childAt2 instanceof TarotCard) {
                    c0353a.m9307O((TarotCard) childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m9284e(View view, final C0353a c0353a, View view2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        if (((Float) animatedValue).floatValue() == -90.0f) {
            view.setRotationY(-270.0f);
            view.setAlpha(1.0f);
            float width = (c0353a.m9297E().getWidth() - (t100.d(24.0f) * 2)) * 1.0f;
            view.setScaleX(view2.getWidth() / width);
            view.setScaleY(view2.getHeight() / (c0353a.m9297E().getHeight() * 1.0f));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotationY", -270.0f, -360.0f);
            objectAnimatorOfFloat.getClass();
            objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ydi0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    C0353a.m9280T(this.f28165a, valueAnimator2);
                }
            });
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", view2.getWidth() / width, 1.0f);
            objectAnimatorOfFloat2.getClass();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", view2.getHeight() / (c0353a.m9297E().getHeight() * 1.0f), 1.0f);
            objectAnimatorOfFloat3.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet.setDuration(300L);
            animatorSet.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, com.p1.mobile.putong.core.ui.tarot.TarotCard] */
    /* JADX INFO: renamed from: f */
    public static void m9285f(C0353a c0353a, ValueAnimator valueAnimator) {
        int i;
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i2 = c0353a.cardCount;
        for (int i3 = 0; i3 < i2; i3++) {
            Object childAt = c0353a.m9300H().getChildAt(i3);
            if ((childAt instanceof TarotCard) && i3 != (i = c0353a.currentCardIndex)) {
                ?? r2 = (TarotCard) childAt;
                r2.setRotation(c0353a.maxDegree * (i3 - i) * fFloatValue);
                r2.setTranslationX(c0353a.m9323w(i3 - c0353a.currentCardIndex, fFloatValue));
                r2.setTranslationY(c0353a.m9324x(Math.abs(i3 - c0353a.currentCardIndex), fFloatValue));
                c0353a.m9307O(r2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static cwf0 m9287h() {
        return new cwf0(new c());
    }

    /* JADX INFO: renamed from: i */
    public static void m9288i(C0353a c0353a, View view) {
        c0353a.close();
    }

    /* JADX INFO: renamed from: j */
    public static void m9289j(C0353a c0353a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        c0353a.m9326z().setTranslationY((-t100.d(150.0f)) * fFloatValue);
        c0353a.m9309Q(1.0f - fFloatValue, c0353a.m9298F(), c0353a.m9294B(), c0353a.m9300H(), c0353a.m9296D(), c0353a.m9295C(), c0353a.m9325y(), c0353a.m9301I(), c0353a.m9293A());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.p1.mobile.putong.core.ui.tarot.TarotCard] */
    /* JADX INFO: renamed from: k */
    public static void m9290k(C0353a c0353a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        Object childAt = c0353a.m9300H().getChildAt(c0353a.currentCardIndex);
        childAt.getClass();
        if (childAt instanceof TarotCard) {
            ?? r0 = (TarotCard) childAt;
            r0.setTranslationY(((-c0353a.cardHeight) / 3.0f) * fFloatValue);
            c0353a.m9307O(r0);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VImage m9293A() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LineView m9294B() {
        LineView lineView = this._lineView;
        if (lineView != null) {
            return lineView;
        }
        Intrinsics.r("_lineView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m9295C() {
        VText vText = this._reading;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_reading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final VText m9296D() {
        VText vText = this._reading_instruction;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_reading_instruction");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final FrameLayout m9297E() {
        FrameLayout frameLayout = this._root_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VText m9298F() {
        VText vText = this._slide_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_slide_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final ConstraintLayout m9299G() {
        ConstraintLayout constraintLayout = this._tarot_body;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_tarot_body");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final TarotListView m9300H() {
        TarotListView tarotListView = this._tarot_layout;
        if (tarotListView != null) {
            return tarotListView;
        }
        Intrinsics.r("_tarot_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VText m9301I() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m9302J(float xVelocity) {
        final float fM9321u = m9321u();
        this.mPreDistance += xVelocity / 8.0f;
        final float fM9319s = m9319s(m9321u());
        final float f = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        if (fM9321u == fM9319s) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0353a.m9283d(this.f27460a, fM9319s, fM9321u, f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: K */
    public final void m9303K() {
        m9301I().setTypeface(adi0.m11817i(this.act));
        xdl0.E0(m9325y(), new View.OnClickListener() { // from class: l.sdi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0353a.m9281b(this.f21269a, view);
            }
        });
        int i = this.cardCount;
        this.currentCardIndex = i / 2;
        float f = this.maxDegree;
        this.maxAngle = (i / 2) * f;
        this.minAngle = (-((i - (i / 2)) - 1)) * f;
        m9315o();
        this.bigRadius = ((double) this.cardHeight) * 2.5d;
        m9305M();
        qib0.f19782G.m12727D(m9299G(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkUyRUNRVldFWlkzNFNTR0pBS1c1SEtMQ05NRUlCUTE0IiwidyI6MTEyNSwiaCI6MTgyMSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE0NzE4OTczNjMxNzI5ODY2Nzc3fQ.webp");
    }

    /* JADX INFO: renamed from: L */
    public final ValueAnimator m9304L() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0353a.m9290k(this.f28717a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: M */
    public final void m9305M() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0353a.m9285f(this.f25113a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(500L);
        animatorSet.playSequentially(valueAnimatorOfFloat, m9304L(), m9294B().getAnim(), m9313V());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: N */
    public final void m9306N(AnimatorSet animatorSet) {
        final float fM9321u = m9321u();
        final float f = (this.maxAngle * 2.0f) + ((fM9321u > 0.0f ? 1 : -1) * fM9321u);
        final float f2 = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        if (fM9321u == f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0353a.m9282c(this.f20527a, f, fM9321u, f2, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final void m9307O(TarotCard v) {
        v.setLatestRotation(v.getRotation());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final void m9308P(float distance) {
        this.mPreDistance += distance;
        float fM9321u = m9321u();
        float f = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        int i = this.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = m9300H().getChildAt(i2);
            childAt.setRotation(m9320t(i2) + fM9321u);
            float fM9320t = m9320t(i2) + fM9321u;
            double dM9317q = m9317q(fM9320t);
            double d = (((double) fM9320t) * 3.141592653589793d) / 180.0d;
            childAt.setTranslationX((float) (Math.sin(d) * dM9317q));
            childAt.setTranslationY((float) (((double) f) - (dM9317q * Math.cos(d))));
            m9307O((TarotCard) childAt);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m9309Q(float alpha, View... views) {
        for (View view : views) {
            view.setAlpha(alpha);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m9310R() {
        Dialog dialog = null;
        View viewInflate = o7r.a(this.act).inflate(f6c0.f11958R5, (ViewGroup) null);
        viewInflate.getClass();
        m9314l(viewInflate);
        this.dialog = m9318r(this.act, viewInflate);
        m9303K();
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog2;
        }
        dialog.show();
    }

    /* JADX INFO: renamed from: S */
    public final void m9311S(final View bigCardView, final View smallCard, AnimatorSet animatorSet) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(smallCard, "rotationY", 0.0f, -90.0f);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0353a.m9284e(bigCardView, this, smallCard, valueAnimator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        animatorSet.playSequentially(objectAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: U */
    public final void m9312U(AnimatorSet animatorSet) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        m9326z().setVisibility(0);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vdi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0353a.m9289j(this.f24282a, valueAnimator);
            }
        });
        animatorSet.playSequentially(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: V */
    public final ObjectAnimator m9313V() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m9298F(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        return objectAnimatorOfFloat;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.tarot.TarotCard.InterfaceC0348a
    /* JADX INFO: renamed from: a */
    public void mo9251a(@NotNull View view) {
        view.getClass();
        if (m9298F().getAlpha() == 1.0f) {
            zvf0.r("e_tarot_divination_popup_choose", "p_tarot_divination_popup");
            view.setVisibility(8);
            AnimatorSet animatorSet = new AnimatorSet();
            m9312U(animatorSet);
            m9306N(animatorSet);
            m9311S(m9316p(), m9326z(), animatorSet);
            animatorSet.start();
        }
    }

    @Override // p006l.w95
    public void close() {
        if (this.isCreated) {
            i0e.e(m9322v());
        }
        l5j0 l5j0Var = this.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: l */
    public final void m9314l(View view) {
        aei0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, androidx.appcompat.widget.AppCompatImageView, com.p1.mobile.putong.core.ui.tarot.TarotCard] */
    /* JADX INFO: renamed from: o */
    public final void m9315o() {
        int i = this.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            ?? tarotCard = new TarotCard(this.act);
            tarotCard.setListener(this);
            tarotCard.setImageResource(x2c0.f26673fc);
            if (this.cardWidth == 0) {
                tarotCard.measure(0, 0);
                this.cardWidth = tarotCard.getMeasuredWidth();
                this.cardHeight = tarotCard.getMeasuredHeight();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.cardWidth, this.cardHeight);
            layoutParams.gravity = 1;
            layoutParams.topMargin = (this.cardHeight / 2) - t100.d(10.0f);
            layoutParams.bottomMargin = this.cardHeight / 2;
            tarotCard.setLayoutParams(layoutParams);
            m9300H().addView(tarotCard);
        }
        m9300H().setOnScrollListener(new a());
    }

    @Override // p006l.i9j0
    public void onStart() {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            Intrinsics.r("dialog");
            dialog = null;
        }
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final View m9316p() throws JSONException {
        this.isCreated = true;
        View viewInflate = o7r.a(this.act).inflate(f6c0.f11894N5, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, xdl0.w0());
        layoutParams.leftMargin = t100.d(24.0f);
        layoutParams.rightMargin = t100.d(24.0f);
        viewInflate.setVisibility(0);
        viewInflate.setAlpha(0.0f);
        viewInflate.setLayoutParams(layoutParams);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.f22657L5);
        ConstraintLayout.a layoutParams2 = vDraweeViewFindViewById.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.a) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = xdl0.y0() - t100.d(24.0f);
            vDraweeViewFindViewById.setLayoutParams(layoutParams2);
        }
        m9297E().addView(viewInflate);
        m9297E().setOnClickListener(new View.OnClickListener() { // from class: l.udi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0353a.m9288i(this.f23498a, view);
            }
        });
        if (viewInflate instanceof TarotInfoView) {
            TarotInfoView tarotInfoView = (TarotInfoView) viewInflate;
            tarotInfoView.m9275i0(this.act, this.tarotInfo);
            tarotInfoView.setListener(this);
            tarotInfoView.setTranslationListener(this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("other_user_id", ((DbObject) this.tarotInfo.card).id);
        jSONObject.put("tooltips_trigger_mode", "active");
        m9322v().o(jSONObject);
        i0e.f(m9322v());
        return viewInflate;
    }

    /* JADX INFO: renamed from: q */
    public final float m9317q(float currentRotation) {
        double d = this.bigRadius;
        float f = (float) d;
        float f2 = (float) (d - ((double) (this.cardHeight / 2.0f)));
        if (Math.abs(currentRotation) > this.maxDegree) {
            return f2;
        }
        return f - (((f - f2) / this.maxDegree) * Math.abs(currentRotation));
    }

    /* JADX INFO: renamed from: r */
    public final l5j0 m9318r(Act act, View rootView) {
        l5j0 l5j0Var = new l5j0(act, v7c0.f24184d);
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().addBottomSheetCallback(new b(l5j0Var));
        return l5j0Var;
    }

    /* JADX INFO: renamed from: s */
    public final float m9319s(float startAngle) {
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
    public final float m9320t(int i) {
        return (i - (this.cardCount / 2)) * this.maxDegree;
    }

    /* JADX INFO: renamed from: u */
    public final float m9321u() {
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
    public final cwf0 m9322v() {
        return (cwf0) this.pageHelp.getValue();
    }

    /* JADX INFO: renamed from: w */
    public final float m9323w(int i, float currentValue) {
        return (float) ((this.bigRadius - ((double) (this.cardHeight / 2))) * Math.sin(((((double) (i * this.maxDegree)) * 3.141592653589793d) / 180.0d) * ((double) currentValue)));
    }

    /* JADX INFO: renamed from: x */
    public final float m9324x(int i, float currentValue) {
        double d = this.bigRadius;
        int i2 = this.cardHeight;
        return (float) ((d - ((double) (i2 / 2))) - ((d - ((double) (i2 / 2))) * Math.cos(((((double) (i * this.maxDegree)) * 3.141592653589793d) / 180.0d) * ((double) currentValue))));
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VButton m9325y() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VImage m9326z() {
        VImage vImage = this._hide_card;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_hide_card");
        return null;
    }
}
