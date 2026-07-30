package com.p051p1.mobile.putong.core.p058ui.constellationmatch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ConstellationData;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p051p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.constellationmatch.ConstellationInfoView;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundConstraintLayout;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipExtensions;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.b240;
import p153l.bnl0;
import p153l.d79;
import p153l.gra;
import p153l.i1k;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.lz5;
import p153l.nij0;
import p153l.o1j0;
import p153l.p9r;
import p153l.pci;
import p153l.pk50;
import p153l.psd0;
import p153l.spl0;
import p153l.toh0;
import p153l.tx0;
import p153l.uqb0;
import p153l.vy5;
import p153l.x20;
import p153l.y20;
import p153l.ya5;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0014¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\r2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010b\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u00105\u001a\u0004\b`\u00107\"\u0004\ba\u00109R\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010u\u001a\u0005\b\u0084\u0001\u0010w\"\u0005\b\u0085\u0001\u0010yR&\u0010\u008a\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010M\u001a\u0005\b\u0088\u0001\u0010O\"\u0005\b\u0089\u0001\u0010QR*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R&\u0010\u0096\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010M\u001a\u0005\b\u0094\u0001\u0010O\"\u0005\b\u0095\u0001\u0010QR*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¢\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010\u0099\u0001\u001a\u0006\b \u0001\u0010\u009b\u0001\"\u0006\b¡\u0001\u0010\u009d\u0001R*\u0010ª\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R)\u0010±\u0001\u001a\u00030«\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b&\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001¨\u0006´\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationInfoView;", "Lv/VLinear;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "c0", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "e0", "(Lcom/p1/mobile/putong/data/User;)V", "d0", "g0", "", "like", "p0", "(Z)V", "o0", "liked", "f0", "(ZLcom/p1/mobile/putong/data/User;)V", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "h0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", ResourceDirection.f39656v, "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "c", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "get_constrain_layout", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_constrain_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_constrain_layout", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Lv/VButton;", "e", "Lv/VButton;", "get_close", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;", "f", "Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;", "get_order_layout", "()Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;", "set_order_layout", "(Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;)V", "_order_layout", "Lv/VText;", "g", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "h", "get_age", "set_age", "_age", "Landroid/widget/Space;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/Space;", "get_space", "()Landroid/widget/Space;", "set_space", "(Landroid/widget/Space;)V", "_space", "j", "get_constellation_image", "set_constellation_image", "_constellation_image", "Landroidx/constraintlayout/widget/ConstraintLayout;", "k", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_info_layout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_info_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_info_layout", "Landroid/widget/RelativeLayout;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/widget/RelativeLayout;", "get_card_layout", "()Landroid/widget/RelativeLayout;", "set_card_layout", "(Landroid/widget/RelativeLayout;)V", "_card_layout", "Landroid/widget/TextView;", "m", "Landroid/widget/TextView;", "get_type", "()Landroid/widget/TextView;", "set_type", "(Landroid/widget/TextView;)V", "_type", "Lorg/apmem/tools/layouts/FlowLayout;", "n", "Lorg/apmem/tools/layouts/FlowLayout;", "get_tags", "()Lorg/apmem/tools/layouts/FlowLayout;", "set_tags", "(Lorg/apmem/tools/layouts/FlowLayout;)V", "_tags", "o", "get_desc", "set_desc", "_desc", "p", "get_branding", "set_branding", "_branding", "Landroid/widget/LinearLayout;", "q", "Landroid/widget/LinearLayout;", "get_save_pic", "()Landroid/widget/LinearLayout;", "set_save_pic", "(Landroid/widget/LinearLayout;)V", "_save_pic", "r", "get_save_pic_text", "set_save_pic_text", "_save_pic_text", "Landroid/view/ViewStub;", BLiveStormDanmakuGiftResourceType.f45294s, "Landroid/view/ViewStub;", "get_normal_operation", "()Landroid/view/ViewStub;", "set_normal_operation", "(Landroid/view/ViewStub;)V", "_normal_operation", Constants.KEY_T, "get_usa_operation", "set_usa_operation", "_usa_operation", "Ll/ya5;", "u", "Ll/ya5;", "getListener", "()Ll/ya5;", "setListener", "(Ll/ya5;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ll/nij0;", "Ll/nij0;", "getTranslationListener", "()Ll/nij0;", "setTranslationListener", "(Ll/nij0;)V", "translationListener", "w", "Lcom/p1/mobile/android/app/Act;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ConstellationInfoView extends VLinear implements View.OnTouchListener {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RoundConstraintLayout _constrain_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VButton _close;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LinearMeasureOrderLayout _order_layout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _age;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Space _space;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VDraweeView _constellation_image;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ConstraintLayout _info_layout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public RelativeLayout _card_layout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public TextView _type;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public FlowLayout _tags;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VText _branding;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public LinearLayout _save_pic;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VText _save_pic_text;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public ViewStub _normal_operation;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public ViewStub _usa_operation;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public ya5 listener;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public nij0 translationListener;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.ConstellationInfoView$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/ui/constellationmatch/ConstellationInfoView$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8469a extends AnimatorListenerAdapter {
        public C8469a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            ConstellationInfoView constellationInfoView = ConstellationInfoView.this;
            if (constellationInfoView.listener != null) {
                constellationInfoView.getListener().close();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.ConstellationInfoView$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/ui/constellationmatch/ConstellationInfoView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8470b extends AnimatorListenerAdapter {
        public C8470b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            ConstellationInfoView constellationInfoView = ConstellationInfoView.this;
            if (constellationInfoView.listener != null) {
                constellationInfoView.getListener().close();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConstellationInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: T */
    public static void m45941T(ConstellationInfoView constellationInfoView, User user, View view) {
        constellationInfoView.m45961o0(true);
        constellationInfoView.m45958f0(true, user);
    }

    /* JADX INFO: renamed from: X */
    public static void m45944X(ConstellationInfoView constellationInfoView, User user, View view) {
        constellationInfoView.m45962p0(true);
        constellationInfoView.m45958f0(true, user);
    }

    /* JADX INFO: renamed from: Y */
    public static void m45945Y(ConstellationInfoView constellationInfoView, User user, View view) {
        constellationInfoView.m45962p0(false);
        constellationInfoView.m45958f0(false, user);
    }

    /* JADX INFO: renamed from: Z */
    public static void m45946Z(ConstellationInfoView constellationInfoView, User user, View view) {
        constellationInfoView.m45961o0(false);
        constellationInfoView.m45958f0(false, user);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX INFO: renamed from: a0 */
    public static void m45947a0(User user, ConstellationInfoView constellationInfoView, Relationship relationship) {
        int i;
        relationship.getClass();
        if (!TEnum.equals(relationship.state, "matched") || relationship.status.contains(MatchFrom.get(MatchFrom.xmasActivity))) {
            return;
        }
        if (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), "letter")) {
            if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
                i = (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), "secretcrush")) ? 0 : 1;
            } else {
                i = 11;
            }
        } else if (NullChecker.m82486a(user.localRelationship)) {
            Relationship relationship2 = user.localRelationship;
            relationship2.getClass();
            if (NullChecker.m82486a(relationship2.relationshipExtensions)) {
                Relationship relationship3 = user.localRelationship;
                relationship3.getClass();
                RelationshipExtensions relationshipExtensions = relationship3.relationshipExtensions;
                relationshipExtensions.getClass();
                if (TextUtils.isEmpty(relationshipExtensions.otherLetter)) {
                    i = 38;
                } else {
                    i = 37;
                }
            } else {
                i = 38;
            }
        } else {
            i = 38;
        }
        if (d79.m114685j0()) {
            CoreModule.f18264c.f20384f0.m33653Fo();
        }
        Act act = null;
        if (!CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            Act act2 = constellationInfoView.act;
            if (act2 == null) {
                Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                act2 = null;
            }
            ArrayList arrayListM147507f0 = jyb.m147507f0(user.f56859id);
            List<String> list = relationship.scenarios;
            list.getClass();
            Intent intentM48747h2 = MatchAct.m48747h2(act2, arrayListM147507f0, i, (ArrayList) list, gra.m131625S1() ? "tmp_from_home_swipe" : null);
            Act act3 = constellationInfoView.act;
            if (act3 == null) {
                Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            } else {
                act = act3;
            }
            act.startActivityWithCustomTransition(intentM48747h2, new MatchAct.C8617b());
            return;
        }
        Act act4 = constellationInfoView.act;
        if (act4 == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act4 = null;
        }
        pci.m171661J(act4, user);
        if (!IntlCountryCodeController.m29125v()) {
            toh0.m192059s();
        }
        if (i == 13 && tx0.m193439o().m193441B()) {
            if (spl0.m187354F()) {
                pk50.m172568j().m172574f().m181664b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            Act act5 = constellationInfoView.act;
            if (act5 == null) {
                Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            } else {
                act = act5;
            }
            tx0.m193419I(act, false, 5.0f, "superlike");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m45948b0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m45949i0(final ConstellationInfoView constellationInfoView, final Act act, View view) {
        bnl0.m105524M(constellationInfoView.get_close(), false);
        i4g0.m138520r("e_intl_horoscope_match_save_to_album", "p_intl_horoscope_match_self_card");
        final Bitmap bitmapM138109f = i1k.m138109f(constellationInfoView.get_constrain_layout());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        i1k.m138107d(act, new x20() { // from class: l.ez5
            @Override // p153l.x20
            public final void call() {
                ConstellationInfoView.m45950j0(objectRef, act, bitmapM138109f, constellationInfoView);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, l.kcg0] */
    /* JADX INFO: renamed from: j0 */
    public static final void m45950j0(final Ref.ObjectRef objectRef, Act act, Bitmap bitmap, final ConstellationInfoView constellationInfoView) {
        bitmap.getClass();
        C22421c c22421cDuringCreated = act.duringCreated((C22421c) vy5.m203952e(bitmap).compose(psd0.m173592C()));
        final Function1 function1 = new Function1() { // from class: l.jz5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConstellationInfoView.m45951k0(this.f123225a, objectRef, (Boolean) obj);
            }
        };
        objectRef.element = c22421cDuringCreated.subscribe(new y20() { // from class: l.kz5
            @Override // p153l.y20
            public final void call(Object obj) {
                ConstellationInfoView.m45952l0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m45951k0(ConstellationInfoView constellationInfoView, Ref.ObjectRef objectRef, Boolean bool) {
        bnl0.m105524M(constellationInfoView.get_close(), true);
        if (bool.booleanValue()) {
            o1j0.m165649w(R$string.f19743vi);
        }
        psd0.m173633z((kcg0) objectRef.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m45952l0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m45953m0(ConstellationInfoView constellationInfoView, View view) {
        if (constellationInfoView.listener != null) {
            constellationInfoView.getListener().close();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m45954n0(View view) {
    }

    /* JADX INFO: renamed from: c0 */
    public final void m45955c0(View view) {
        lz5.m156407a(this, view);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m45956d0(final User user) {
        View viewInflate = get_usa_operation().inflate();
        CardOperationButton cardOperationButton = (CardOperationButton) viewInflate.findViewById(adc0.f70567t2);
        CardOperationButton cardOperationButton2 = (CardOperationButton) viewInflate.findViewById(adc0.f70217Y6);
        bnl0.m105509E0(cardOperationButton, new View.OnClickListener() { // from class: l.hz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConstellationInfoView.m45945Y(this.f112194a, user, view);
            }
        });
        bnl0.m105509E0(cardOperationButton2, new View.OnClickListener() { // from class: l.iz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConstellationInfoView.m45944X(this.f117668a, user, view);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m45957e0(final User user) {
        View viewInflate = get_normal_operation().inflate();
        CardOperationButton cardOperationButton = (CardOperationButton) viewInflate.findViewById(adc0.f70550s2);
        CardOperationButton cardOperationButton2 = (CardOperationButton) viewInflate.findViewById(adc0.f70185W6);
        bnl0.m105509E0(cardOperationButton, new View.OnClickListener() { // from class: l.fz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConstellationInfoView.m45946Z(this.f101442a, user, view);
            }
        });
        bnl0.m105509E0(cardOperationButton2, new View.OnClickListener() { // from class: l.gz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConstellationInfoView.m45941T(this.f107165a, user, view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m45958f0(boolean liked, final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.SUGGEST.getFrom()).isLike(liked).isFromButton(true).isSuperLiked(false).user(user).pageId("p_intl_horoscope_match_others_card").build();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sourcepage", b240.f74485S0);
        linkedHashMap.put("actiontype", b240.f74486T0);
        if (liked) {
            i4g0.m138520r("e_intl_horoscope_match_like_button", "p_intl_horoscope_match_others_card");
        } else {
            i4g0.m138520r("e_intl_horoscope_match_dislike_button", "p_intl_horoscope_match_others_card");
        }
        CoreModule.f18264c.f20405m0.m32076Y7(liked, false, linkedHashMap, user, null, LikeFrom.get("home"), true, likeExtraDataNew_, 0, null).subscribe(psd0.m173597H(new y20() { // from class: l.az5
            @Override // p153l.y20
            public final void call(Object obj) {
                ConstellationInfoView.m45947a0(user, this, (Relationship) obj);
            }
        }, new y20() { // from class: l.bz5
            @Override // p153l.y20
            public final void call(Object obj) {
                ConstellationInfoView.m45948b0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m45959g0(User user) {
        if (user.pictures.size() > 0) {
            uqb0.f180374G.m127115L0(get_image(), user.pictures.get(0).url);
        }
    }

    @NotNull
    public final ya5 getListener() {
        ya5 ya5Var = this.listener;
        if (ya5Var != null) {
            return ya5Var;
        }
        Intrinsics.m88391r(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return null;
    }

    @NotNull
    public final nij0 getTranslationListener() {
        nij0 nij0Var = this.translationListener;
        if (nij0Var != null) {
            return nij0Var;
        }
        Intrinsics.m88391r("translationListener");
        return null;
    }

    @NotNull
    public final VText get_age() {
        VText vText = this._age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_age");
        return null;
    }

    @NotNull
    public final VText get_branding() {
        VText vText = this._branding;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_branding");
        return null;
    }

    @NotNull
    public final RelativeLayout get_card_layout() {
        RelativeLayout relativeLayout = this._card_layout;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_card_layout");
        return null;
    }

    @NotNull
    public final VButton get_close() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    public final VDraweeView get_constellation_image() {
        VDraweeView vDraweeView = this._constellation_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_constellation_image");
        return null;
    }

    @NotNull
    public final RoundConstraintLayout get_constrain_layout() {
        RoundConstraintLayout roundConstraintLayout = this._constrain_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.m88391r("_constrain_layout");
        return null;
    }

    @NotNull
    public final TextView get_desc() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_image");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_info_layout() {
        ConstraintLayout constraintLayout = this._info_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_info_layout");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_name");
        return null;
    }

    @NotNull
    public final ViewStub get_normal_operation() {
        ViewStub viewStub = this._normal_operation;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m88391r("_normal_operation");
        return null;
    }

    @NotNull
    public final LinearMeasureOrderLayout get_order_layout() {
        LinearMeasureOrderLayout linearMeasureOrderLayout = this._order_layout;
        if (linearMeasureOrderLayout != null) {
            return linearMeasureOrderLayout;
        }
        Intrinsics.m88391r("_order_layout");
        return null;
    }

    @NotNull
    public final LinearLayout get_save_pic() {
        LinearLayout linearLayout = this._save_pic;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_save_pic");
        return null;
    }

    @NotNull
    public final VText get_save_pic_text() {
        VText vText = this._save_pic_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_save_pic_text");
        return null;
    }

    @NotNull
    public final Space get_space() {
        Space space = this._space;
        if (space != null) {
            return space;
        }
        Intrinsics.m88391r("_space");
        return null;
    }

    @NotNull
    public final FlowLayout get_tags() {
        FlowLayout flowLayout = this._tags;
        if (flowLayout != null) {
            return flowLayout;
        }
        Intrinsics.m88391r("_tags");
        return null;
    }

    @NotNull
    public final TextView get_type() {
        TextView textView = this._type;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_type");
        return null;
    }

    @NotNull
    public final ViewStub get_usa_operation() {
        ViewStub viewStub = this._usa_operation;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m88391r("_usa_operation");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m45960h0(@NotNull final Act act, @NotNull User user) {
        act.getClass();
        user.getClass();
        this.act = act;
        get_name().setText(user.name);
        get_age().setText(String.valueOf(user.age.intValue()));
        Context context = getContext();
        context.getClass();
        ConstellationData constellationDataM203951c = vy5.m203951c(context, user.profile.zodiac);
        if (constellationDataM203951c != null) {
            uqb0.f180374G.m127115L0(get_constellation_image(), constellationDataM203951c.image);
            get_type().setTextColor(constellationDataM203951c.nameColor);
            get_type().setText(constellationDataM203951c.name);
            get_desc().setText(constellationDataM203951c.meaning);
            get_desc().setMovementMethod(ScrollingMovementMethod.getInstance());
            String str = constellationDataM203951c.keywords;
            str.getClass();
            for (String str2 : StringsKt.split$default(str, new String[]{Constants.SEPARATOR_COMMA, "，"}, false, 0, 6, null)) {
                View viewInflate = p9r.m171370a(getContext()).inflate(kec0.f126148y4, (ViewGroup) null);
                ((TextView) viewInflate.findViewById(adc0.f69913G6)).setText(str2);
                get_tags().addView(viewInflate);
            }
            if (TextUtils.equals(user.f56859id, CoreModule.m30929H().userId())) {
                bnl0.m105524M(get_save_pic(), true);
                bnl0.m105524M(get_branding(), true);
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                userM116600p9.getClass();
                m45959g0(userM116600p9);
                bnl0.m105509E0(get_save_pic(), new View.OnClickListener() { // from class: l.zy5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConstellationInfoView.m45949i0(this.f206552a, act, view);
                    }
                });
                bnl0.m105509E0(get_close(), new View.OnClickListener() { // from class: l.cz5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConstellationInfoView.m45953m0(this.f84424a, view);
                    }
                });
                return;
            }
            m45959g0(user);
            bnl0.m105524M(get_branding(), false);
            bnl0.m105524M(get_close(), false);
            get_constrain_layout().setOnClickListener(new View.OnClickListener() { // from class: l.dz5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConstellationInfoView.m45954n0(view);
                }
            });
            if (IntlCountryCodeController.m29125v()) {
                m45956d0(user);
            } else {
                m45957e0(user);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m45961o0(boolean like) {
        get_constrain_layout().setRotation(like ? 5.0f : -5.0f);
        get_constrain_layout().setPivotX(like ? 0.0f : get_info_layout().getWidth());
        get_constrain_layout().setPivotY(get_info_layout().getHeight());
        if (this.translationListener != null) {
            getTranslationListener().onStart();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", 0.0f, (like ? 1 : -1) * get_constrain_layout().getWidth() * 2.0f);
        objectAnimatorOfFloat.getClass();
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C8469a());
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45955c0(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View v2, @NotNull MotionEvent event) {
        v2.getClass();
        event.getClass();
        if (v2.getId() != adc0.f70550s2 && v2.getId() != adc0.f70185W6 && v2.getId() != adc0.f70486o6) {
            return false;
        }
        v2.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m45962p0(boolean like) {
        if (this.translationListener != null) {
            getTranslationListener().onStart();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, (like ? -1 : 1) * get_constrain_layout().getHeight() * 2.0f);
        objectAnimatorOfFloat.getClass();
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C8470b());
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
    }

    public final void setListener(@NotNull ya5 ya5Var) {
        ya5Var.getClass();
        this.listener = ya5Var;
    }

    public final void setTranslationListener(@NotNull nij0 nij0Var) {
        nij0Var.getClass();
        this.translationListener = nij0Var;
    }

    public final void set_age(@NotNull VText vText) {
        vText.getClass();
        this._age = vText;
    }

    public final void set_branding(@NotNull VText vText) {
        vText.getClass();
        this._branding = vText;
    }

    public final void set_card_layout(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._card_layout = relativeLayout;
    }

    public final void set_close(@NotNull VButton vButton) {
        vButton.getClass();
        this._close = vButton;
    }

    public final void set_constellation_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._constellation_image = vDraweeView;
    }

    public final void set_constrain_layout(@NotNull RoundConstraintLayout roundConstraintLayout) {
        roundConstraintLayout.getClass();
        this._constrain_layout = roundConstraintLayout;
    }

    public final void set_desc(@NotNull TextView textView) {
        textView.getClass();
        this._desc = textView;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_info_layout(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._info_layout = constraintLayout;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_normal_operation(@NotNull ViewStub viewStub) {
        viewStub.getClass();
        this._normal_operation = viewStub;
    }

    public final void set_order_layout(@NotNull LinearMeasureOrderLayout linearMeasureOrderLayout) {
        linearMeasureOrderLayout.getClass();
        this._order_layout = linearMeasureOrderLayout;
    }

    public final void set_save_pic(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._save_pic = linearLayout;
    }

    public final void set_save_pic_text(@NotNull VText vText) {
        vText.getClass();
        this._save_pic_text = vText;
    }

    public final void set_space(@NotNull Space space) {
        space.getClass();
        this._space = space;
    }

    public final void set_tags(@NotNull FlowLayout flowLayout) {
        flowLayout.getClass();
        this._tags = flowLayout;
    }

    public final void set_type(@NotNull TextView textView) {
        textView.getClass();
        this._type = textView;
    }

    public final void set_usa_operation(@NotNull ViewStub viewStub) {
        viewStub.getClass();
        this._usa_operation = viewStub;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstellationInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConstellationInfoView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
