package com.p000p1.mobile.putong.core.p001ui.constellationmatch;

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
import com.p000p1.mobile.putong.core.data.AwardStatus;
import com.p000p1.mobile.putong.core.data.ConstellationData;
import com.p000p1.mobile.putong.core.data.CoreGiftPanelName;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.constellationmatch.ConstellationInfoView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundConstraintLayout;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipExtensions;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
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
import l.c4g0;
import l.d30;
import l.e30;
import l.f6c0;
import l.ic50;
import l.lsi0;
import l.mgh0;
import l.mkd0;
import l.mx0;
import l.nt30;
import l.o7r;
import l.ogl0;
import l.qib0;
import l.u4c0;
import l.u59;
import l.upa;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.abi;
import p003l.gy5;
import p003l.j9j0;
import p003l.qx5;
import p003l.syj;
import p003l.x95;
import rx.c;
import v.VButton;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0014¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\r2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010b\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u00105\u001a\u0004\b`\u00107\"\u0004\ba\u00109R\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010u\u001a\u0005\b\u0084\u0001\u0010w\"\u0005\b\u0085\u0001\u0010yR&\u0010\u008a\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010M\u001a\u0005\b\u0088\u0001\u0010O\"\u0005\b\u0089\u0001\u0010QR*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R&\u0010\u0096\u0001\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010M\u001a\u0005\b\u0094\u0001\u0010O\"\u0005\b\u0095\u0001\u0010QR*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¢\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010\u0099\u0001\u001a\u0006\b \u0001\u0010\u009b\u0001\"\u0006\b¡\u0001\u0010\u009d\u0001R*\u0010ª\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R)\u0010±\u0001\u001a\u00030«\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b&\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001¨\u0006´\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationInfoView;", "Lv/VLinear;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "", "c0", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "e0", "(Lcom/p1/mobile/putong/data/User;)V", "d0", "g0", "", "like", "p0", "(Z)V", "o0", "liked", "f0", "(ZLcom/p1/mobile/putong/data/User;)V", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "h0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "v", "Landroid/view/MotionEvent;", "event", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "c", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "get_constrain_layout", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_constrain_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_constrain_layout", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Lv/VButton;", "e", "Lv/VButton;", "get_close", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;", "f", "Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;", "get_order_layout", "()Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;", "set_order_layout", "(Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;)V", "_order_layout", "Lv/VText;", "g", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "h", "get_age", "set_age", "_age", "Landroid/widget/Space;", "i", "Landroid/widget/Space;", "get_space", "()Landroid/widget/Space;", "set_space", "(Landroid/widget/Space;)V", "_space", "j", "get_constellation_image", "set_constellation_image", "_constellation_image", "Landroidx/constraintlayout/widget/ConstraintLayout;", "k", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_info_layout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_info_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_info_layout", "Landroid/widget/RelativeLayout;", "l", "Landroid/widget/RelativeLayout;", "get_card_layout", "()Landroid/widget/RelativeLayout;", "set_card_layout", "(Landroid/widget/RelativeLayout;)V", "_card_layout", "Landroid/widget/TextView;", "m", "Landroid/widget/TextView;", "get_type", "()Landroid/widget/TextView;", "set_type", "(Landroid/widget/TextView;)V", "_type", "Lorg/apmem/tools/layouts/FlowLayout;", "n", "Lorg/apmem/tools/layouts/FlowLayout;", "get_tags", "()Lorg/apmem/tools/layouts/FlowLayout;", "set_tags", "(Lorg/apmem/tools/layouts/FlowLayout;)V", "_tags", "o", "get_desc", "set_desc", "_desc", "p", "get_branding", "set_branding", "_branding", "Landroid/widget/LinearLayout;", "q", "Landroid/widget/LinearLayout;", "get_save_pic", "()Landroid/widget/LinearLayout;", "set_save_pic", "(Landroid/widget/LinearLayout;)V", "_save_pic", "r", "get_save_pic_text", "set_save_pic_text", "_save_pic_text", "Landroid/view/ViewStub;", "s", "Landroid/view/ViewStub;", "get_normal_operation", "()Landroid/view/ViewStub;", "set_normal_operation", "(Landroid/view/ViewStub;)V", "_normal_operation", "t", "get_usa_operation", "set_usa_operation", "_usa_operation", "Ll/x95;", "u", "Ll/x95;", "getListener", "()Ll/x95;", "setListener", "(Ll/x95;)V", "listener", "Ll/j9j0;", "Ll/j9j0;", "getTranslationListener", "()Ll/j9j0;", "setTranslationListener", "(Ll/j9j0;)V", "translationListener", "w", "Lcom/p1/mobile/android/app/Act;", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
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
    public x95 listener;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public j9j0 translationListener;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.ConstellationInfoView$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/core/ui/constellationmatch/ConstellationInfoView$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class C3081a extends AnimatorListenerAdapter {
        public C3081a() {
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
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/core/ui/constellationmatch/ConstellationInfoView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class C3082b extends AnimatorListenerAdapter {
        public C3082b() {
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
    public static void m2072T(ConstellationInfoView constellationInfoView, User user, View view) {
        constellationInfoView.m2092o0(true);
        constellationInfoView.m2089f0(true, user);
    }

    /* JADX INFO: renamed from: X */
    public static void m2075X(ConstellationInfoView constellationInfoView, User user, View view) {
        constellationInfoView.m2093p0(true);
        constellationInfoView.m2089f0(true, user);
    }

    /* JADX INFO: renamed from: Y */
    public static void m2076Y(ConstellationInfoView constellationInfoView, User user, View view) {
        constellationInfoView.m2093p0(false);
        constellationInfoView.m2089f0(false, user);
    }

    /* JADX INFO: renamed from: Z */
    public static void m2077Z(ConstellationInfoView constellationInfoView, User user, View view) {
        constellationInfoView.m2092o0(false);
        constellationInfoView.m2089f0(false, user);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX INFO: renamed from: a0 */
    public static void m2078a0(User user, ConstellationInfoView constellationInfoView, Relationship relationship) {
        int i;
        relationship.getClass();
        if (!TEnum.equals(relationship.state, "matched") || relationship.status.contains(MatchFrom.get("xmasActivity"))) {
            return;
        }
        if (relationship.status.size() == 0 || !TEnum.equals((TEnum) relationship.status.get(0), "letter")) {
            if (relationship.status.size() != 0 && TEnum.equals((TEnum) relationship.status.get(0), "superLikedEach")) {
                i = 13;
            } else if (relationship.status.size() == 0 || !TEnum.equals((TEnum) relationship.status.get(0), "superLiked")) {
                i = (relationship.status.size() == 0 || !TEnum.equals((TEnum) relationship.status.get(0), "secretcrush")) ? 0 : 1;
            } else {
                i = 11;
            }
        } else if (NullChecker.a(user.localRelationship)) {
            Relationship relationship2 = user.localRelationship;
            relationship2.getClass();
            if (NullChecker.a(relationship2.relationshipExtensions)) {
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
        if (u59.f0()) {
            CoreModule.c.f0.Fo();
        }
        Act act = null;
        if (!CoreModule.c.e0.p9().isFemale()) {
            Act act2 = constellationInfoView.act;
            if (act2 == null) {
                Intrinsics.r("act");
                act2 = null;
            }
            ArrayList arrayListF0 = vwb.f0(new String[]{((DbObject) user).id});
            List list = relationship.scenarios;
            list.getClass();
            Intent intentG2 = MatchAct.g2(act2, arrayListF0, i, (ArrayList) list, upa.S1() ? "tmp_from_home_swipe" : null);
            Act act3 = constellationInfoView.act;
            if (act3 == null) {
                Intrinsics.r("act");
            } else {
                act = act3;
            }
            act.startActivityWithCustomTransition(intentG2, new MatchAct.b());
            return;
        }
        Act act4 = constellationInfoView.act;
        if (act4 == null) {
            Intrinsics.r("act");
            act4 = null;
        }
        abi.m5323J(act4, user);
        if (!IntlCountryCodeController.v()) {
            mgh0.s();
        }
        if (i == 13 && mx0.o().B()) {
            if (ogl0.F()) {
                ic50.j().f().b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            Act act5 = constellationInfoView.act;
            if (act5 == null) {
                Intrinsics.r("act");
            } else {
                act = act5;
            }
            mx0.I(act, false, 5.0f, AwardStatus.superlike);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m2079b0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m2080i0(final ConstellationInfoView constellationInfoView, final Act act, View view) {
        xdl0.M(constellationInfoView.get_close(), false);
        zvf0.r("e_intl_horoscope_match_save_to_album", "p_intl_horoscope_match_self_card");
        final Bitmap bitmapM9510f = syj.m9510f(constellationInfoView.get_constrain_layout());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        syj.m9508d(act, new d30() { // from class: l.zx5
            public final void call() {
                ConstellationInfoView.m2081j0(objectRef, act, bitmapM9510f, constellationInfoView);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m2081j0(final Ref.ObjectRef objectRef, Act act, Bitmap bitmap, final ConstellationInfoView constellationInfoView) {
        bitmap.getClass();
        c cVarDuringCreated = act.duringCreated(qx5.m9060e(bitmap).compose(mkd0.C()));
        final Function1 function1 = new Function1() { // from class: l.ey5
            public final Object invoke(Object obj) {
                return ConstellationInfoView.m2082k0(this.f4368a, objectRef, (Boolean) obj);
            }
        };
        objectRef.element = cVarDuringCreated.subscribe(new e30() { // from class: l.fy5
            public final void call(Object obj) {
                ConstellationInfoView.m2083l0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m2082k0(ConstellationInfoView constellationInfoView, Ref.ObjectRef objectRef, Boolean bool) {
        xdl0.M(constellationInfoView.get_close(), true);
        if (bool.booleanValue()) {
            lsi0.w(R.string.ai);
        }
        mkd0.z((c4g0) objectRef.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m2083l0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m2084m0(ConstellationInfoView constellationInfoView, View view) {
        if (constellationInfoView.listener != null) {
            constellationInfoView.getListener().close();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m2085n0(View view) {
    }

    /* JADX INFO: renamed from: c0 */
    public final void m2086c0(View view) {
        gy5.m6898a(this, view);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m2087d0(final User user) {
        View viewInflate = get_usa_operation().inflate();
        CardOperationButton cardOperationButtonFindViewById = viewInflate.findViewById(u4c0.r2);
        CardOperationButton cardOperationButtonFindViewById2 = viewInflate.findViewById(u4c0.W6);
        xdl0.E0(cardOperationButtonFindViewById, new View.OnClickListener() { // from class: l.cy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConstellationInfoView.m2076Y(this.f4091a, user, view);
            }
        });
        xdl0.E0(cardOperationButtonFindViewById2, new View.OnClickListener() { // from class: l.dy5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConstellationInfoView.m2075X(this.f4238a, user, view);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m2088e0(final User user) {
        View viewInflate = get_normal_operation().inflate();
        CardOperationButton cardOperationButtonFindViewById = viewInflate.findViewById(u4c0.q2);
        CardOperationButton cardOperationButtonFindViewById2 = viewInflate.findViewById(u4c0.U6);
        xdl0.E0(cardOperationButtonFindViewById, new View.OnClickListener() { // from class: l.ay5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConstellationInfoView.m2077Z(this.f2901a, user, view);
            }
        });
        xdl0.E0(cardOperationButtonFindViewById2, new View.OnClickListener() { // from class: l.by5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConstellationInfoView.m2072T(this.f3489a, user, view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m2089f0(boolean liked, final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.SUGGEST.getFrom()).isLike(liked).isFromButton(true).isSuperLiked(false).user(user).pageId("p_intl_horoscope_match_others_card").build();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sourcepage", nt30.S0);
        linkedHashMap.put("actiontype", nt30.T0);
        if (liked) {
            zvf0.r("e_intl_horoscope_match_like_button", "p_intl_horoscope_match_others_card");
        } else {
            zvf0.r("e_intl_horoscope_match_dislike_button", "p_intl_horoscope_match_others_card");
        }
        CoreModule.c.m0.Y7(liked, false, linkedHashMap, user, (String) null, LikeFrom.get(CoreGiftPanelName.home), true, likeExtraDataNew_, 0, (String) null).subscribe(mkd0.H(new e30() { // from class: l.vx5
            public final void call(Object obj) {
                ConstellationInfoView.m2078a0(user, this, (Relationship) obj);
            }
        }, new e30() { // from class: l.wx5
            public final void call(Object obj) {
                ConstellationInfoView.m2079b0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m2090g0(User user) {
        if (user.pictures.size() > 0) {
            qib0.G.L0(get_image(), ((Media) user.pictures.get(0)).url);
        }
    }

    @NotNull
    public final x95 getListener() {
        x95 x95Var = this.listener;
        if (x95Var != null) {
            return x95Var;
        }
        Intrinsics.r("listener");
        return null;
    }

    @NotNull
    public final j9j0 getTranslationListener() {
        j9j0 j9j0Var = this.translationListener;
        if (j9j0Var != null) {
            return j9j0Var;
        }
        Intrinsics.r("translationListener");
        return null;
    }

    @NotNull
    public final VText get_age() {
        VText vText = this._age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_age");
        return null;
    }

    @NotNull
    public final VText get_branding() {
        VText vText = this._branding;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_branding");
        return null;
    }

    @NotNull
    public final RelativeLayout get_card_layout() {
        RelativeLayout relativeLayout = this._card_layout;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.r("_card_layout");
        return null;
    }

    @NotNull
    public final VButton get_close() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    public final VDraweeView get_constellation_image() {
        VDraweeView vDraweeView = this._constellation_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_constellation_image");
        return null;
    }

    @NotNull
    public final RoundConstraintLayout get_constrain_layout() {
        RoundConstraintLayout roundConstraintLayout = this._constrain_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.r("_constrain_layout");
        return null;
    }

    @NotNull
    public final TextView get_desc() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_desc");
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
    public final ConstraintLayout get_info_layout() {
        ConstraintLayout constraintLayout = this._info_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_info_layout");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_name");
        return null;
    }

    @NotNull
    public final ViewStub get_normal_operation() {
        ViewStub viewStub = this._normal_operation;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.r("_normal_operation");
        return null;
    }

    @NotNull
    public final LinearMeasureOrderLayout get_order_layout() {
        LinearMeasureOrderLayout linearMeasureOrderLayout = this._order_layout;
        if (linearMeasureOrderLayout != null) {
            return linearMeasureOrderLayout;
        }
        Intrinsics.r("_order_layout");
        return null;
    }

    @NotNull
    public final LinearLayout get_save_pic() {
        LinearLayout linearLayout = this._save_pic;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_save_pic");
        return null;
    }

    @NotNull
    public final VText get_save_pic_text() {
        VText vText = this._save_pic_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_save_pic_text");
        return null;
    }

    @NotNull
    public final Space get_space() {
        Space space = this._space;
        if (space != null) {
            return space;
        }
        Intrinsics.r("_space");
        return null;
    }

    @NotNull
    public final FlowLayout get_tags() {
        FlowLayout flowLayout = this._tags;
        if (flowLayout != null) {
            return flowLayout;
        }
        Intrinsics.r("_tags");
        return null;
    }

    @NotNull
    public final TextView get_type() {
        TextView textView = this._type;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_type");
        return null;
    }

    @NotNull
    public final ViewStub get_usa_operation() {
        ViewStub viewStub = this._usa_operation;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.r("_usa_operation");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public final void m2091h0(@NotNull final Act act, @NotNull User user) {
        act.getClass();
        user.getClass();
        this.act = act;
        get_name().setText(user.name);
        get_age().setText(String.valueOf(user.age.intValue()));
        Context context = getContext();
        context.getClass();
        ConstellationData constellationDataM9059c = qx5.m9059c(context, user.profile.zodiac);
        if (constellationDataM9059c != null) {
            qib0.G.L0(get_constellation_image(), constellationDataM9059c.image);
            get_type().setTextColor(constellationDataM9059c.nameColor);
            get_type().setText(constellationDataM9059c.name);
            get_desc().setText(constellationDataM9059c.meaning);
            get_desc().setMovementMethod(ScrollingMovementMethod.getInstance());
            String str = constellationDataM9059c.keywords;
            str.getClass();
            for (String str2 : StringsKt.split$default(str, new String[]{",", "，"}, false, 0, 6, (Object) null)) {
                View viewInflate = o7r.a(getContext()).inflate(f6c0.y4, (ViewGroup) null);
                ((TextView) viewInflate.findViewById(u4c0.E6)).setText(str2);
                get_tags().addView(viewInflate);
            }
            if (TextUtils.equals(((DbObject) user).id, CoreModule.H().userId())) {
                xdl0.M(get_save_pic(), true);
                xdl0.M(get_branding(), true);
                User userP9 = CoreModule.c.e0.p9();
                userP9.getClass();
                m2090g0(userP9);
                xdl0.E0(get_save_pic(), new View.OnClickListener() { // from class: l.ux5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConstellationInfoView.m2080i0(this.f7832a, act, view);
                    }
                });
                xdl0.E0(get_close(), new View.OnClickListener() { // from class: l.xx5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConstellationInfoView.m2084m0(this.f8584a, view);
                    }
                });
                return;
            }
            m2090g0(user);
            xdl0.M(get_branding(), false);
            xdl0.M(get_close(), false);
            get_constrain_layout().setOnClickListener(new View.OnClickListener() { // from class: l.yx5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConstellationInfoView.m2085n0(view);
                }
            });
            if (IntlCountryCodeController.v()) {
                m2087d0(user);
            } else {
                m2088e0(user);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m2092o0(boolean like) {
        get_constrain_layout().setRotation(like ? 5.0f : -5.0f);
        get_constrain_layout().setPivotX(like ? 0.0f : get_info_layout().getWidth());
        get_constrain_layout().setPivotY(get_info_layout().getHeight());
        if (this.translationListener != null) {
            getTranslationListener().onStart();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", 0.0f, (like ? 1 : -1) * get_constrain_layout().getWidth() * 2.0f);
        objectAnimatorOfFloat.getClass();
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C3081a());
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2086c0(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View v, @NotNull MotionEvent event) {
        v.getClass();
        event.getClass();
        if (v.getId() != u4c0.q2 && v.getId() != u4c0.U6 && v.getId() != u4c0.m6) {
            return false;
        }
        v.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m2093p0(boolean like) {
        if (this.translationListener != null) {
            getTranslationListener().onStart();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, (like ? -1 : 1) * get_constrain_layout().getHeight() * 2.0f);
        objectAnimatorOfFloat.getClass();
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C3082b());
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
    }

    public final void setListener(@NotNull x95 x95Var) {
        x95Var.getClass();
        this.listener = x95Var;
    }

    public final void setTranslationListener(@NotNull j9j0 j9j0Var) {
        j9j0Var.getClass();
        this.translationListener = j9j0Var;
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
