package com.p046p1.mobile.putong.core.p053ui.tarot;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.TarotCardData;
import com.p046p1.mobile.putong.core.data.TarotData;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p046p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.tarot.TarotInfoView;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipExtensions;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.abi;
import p149l.adi0;
import p149l.b43;
import p149l.d30;
import p149l.e30;
import p149l.f6c0;
import p149l.i0g0;
import p149l.i9j0;
import p149l.ic50;
import p149l.lsi0;
import p149l.mgh0;
import p149l.mkd0;
import p149l.mx0;
import p149l.ngm;
import p149l.nt30;
import p149l.o7r;
import p149l.ogl0;
import p149l.pdi0;
import p149l.qib0;
import p149l.syj;
import p149l.u4c0;
import p149l.u59;
import p149l.upa;
import p149l.vwb;
import p149l.w95;
import p149l.xdl0;
import p149l.ym2;
import p149l.zub;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0014¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010/\u001a\u0004\bN\u00101\"\u0004\bO\u00103R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010d\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010[\u001a\u0004\bb\u0010]\"\u0004\bc\u0010_R\"\u0010h\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010[\u001a\u0004\bf\u0010]\"\u0004\bg\u0010_R\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR&\u0010\u0084\u0001\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010s\u001a\u0005\b\u0082\u0001\u0010u\"\u0005\b\u0083\u0001\u0010wR&\u0010\u0088\u0001\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010k\u001a\u0005\b\u0086\u0001\u0010m\"\u0005\b\u0087\u0001\u0010oR*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R&\u0010\u0094\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010[\u001a\u0005\b\u0092\u0001\u0010]\"\u0005\b\u0093\u0001\u0010_R&\u0010\u0098\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010[\u001a\u0005\b\u0096\u0001\u0010]\"\u0005\b\u0097\u0001\u0010_R&\u0010\u009c\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010[\u001a\u0005\b\u009a\u0001\u0010]\"\u0005\b\u009b\u0001\u0010_R*\u0010¤\u0001\u001a\u00030\u009d\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R%\u0010§\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b(\u0010[\u001a\u0005\b¥\u0001\u0010]\"\u0005\b¦\u0001\u0010_R*\u0010¯\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010³\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010ª\u0001\u001a\u0006\b±\u0001\u0010¬\u0001\"\u0006\b²\u0001\u0010®\u0001R*\u0010»\u0001\u001a\u00030´\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R*\u0010Ã\u0001\u001a\u00030¼\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R!\u0010Ë\u0001\u001a\u00030Æ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001¨\u0006Ì\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/tarot/TarotInfoView;", "Lv/VLinear;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "d0", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "f0", "(Lcom/p1/mobile/putong/data/User;)V", "e0", "h0", "", "like", "n0", "(Z)V", "m0", "liked", "g0", "(ZLcom/p1/mobile/putong/data/User;)V", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "i0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/TarotData;)V", ResourceDirection.f38808v, "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_constrain_layout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_constrain_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_constrain_layout", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Lv/VButton;", "e", "Lv/VButton;", "get_close", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "Landroid/widget/Space;", "f", "Landroid/widget/Space;", "get_space", "()Landroid/widget/Space;", "set_space", "(Landroid/widget/Space;)V", "_space", "g", "get_info_layout", "set_info_layout", "_info_layout", "Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;", "h", "Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;", "get_order_layout", "()Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;", "set_order_layout", "(Lcom/p1/mobile/putong/core/newui/view/LinearMeasureOrderLayout;)V", "_order_layout", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "j", "get_age", "set_age", "_age", "k", "get_zodiac", "set_zodiac", "_zodiac", "Landroid/widget/RelativeLayout;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/widget/RelativeLayout;", "get_card_layout", "()Landroid/widget/RelativeLayout;", "set_card_layout", "(Landroid/widget/RelativeLayout;)V", "_card_layout", "Landroid/widget/TextView;", "m", "Landroid/widget/TextView;", "get_type", "()Landroid/widget/TextView;", "set_type", "(Landroid/widget/TextView;)V", "_type", "Lorg/apmem/tools/layouts/FlowLayout;", "n", "Lorg/apmem/tools/layouts/FlowLayout;", "get_tags", "()Lorg/apmem/tools/layouts/FlowLayout;", "set_tags", "(Lorg/apmem/tools/layouts/FlowLayout;)V", "_tags", "o", "get_desc", "set_desc", "_desc", "p", "get_image_layout", "set_image_layout", "_image_layout", "Landroid/widget/ImageView;", "q", "Landroid/widget/ImageView;", "get_tarot_image", "()Landroid/widget/ImageView;", "set_tarot_image", "(Landroid/widget/ImageView;)V", "_tarot_image", "r", "get_reversed", "set_reversed", "_reversed", BLiveStormDanmakuGiftResourceType.f44446s, "get_upright", "set_upright", "_upright", Constants.KEY_T, "get_branding", "set_branding", "_branding", "Landroid/widget/LinearLayout;", "u", "Landroid/widget/LinearLayout;", "get_save_pic", "()Landroid/widget/LinearLayout;", "set_save_pic", "(Landroid/widget/LinearLayout;)V", "_save_pic", "get_save_pic_text", "set_save_pic_text", "_save_pic_text", "Landroid/view/ViewStub;", "w", "Landroid/view/ViewStub;", "get_normal_operation", "()Landroid/view/ViewStub;", "set_normal_operation", "(Landroid/view/ViewStub;)V", "_normal_operation", BaseSei.f13930X, "get_usa_operation", "set_usa_operation", "_usa_operation", "Ll/w95;", BaseSei.f13931Y, "Ll/w95;", "getListener", "()Ll/w95;", "setListener", "(Ll/w95;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ll/i9j0;", BaseSei.f13932Z, "Ll/i9j0;", "getTranslationListener", "()Ll/i9j0;", "setTranslationListener", "(Ll/i9j0;)V", "translationListener", "A", "Lcom/p1/mobile/android/app/Act;", "Landroid/graphics/Typeface;", "B", "Lkotlin/Lazy;", "getTypeface", "()Landroid/graphics/Typeface;", "typeface", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class TarotInfoView extends VLinear implements View.OnTouchListener {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Lazy typeface;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ConstraintLayout _constrain_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VButton _close;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Space _space;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ConstraintLayout _info_layout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public LinearMeasureOrderLayout _order_layout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _age;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _zodiac;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public RelativeLayout _card_layout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public TextView _type;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public FlowLayout _tags;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public RelativeLayout _image_layout;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public ImageView _tarot_image;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VText _reversed;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText _upright;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VText _branding;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public LinearLayout _save_pic;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText _save_pic_text;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public ViewStub _normal_operation;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public ViewStub _usa_operation;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public w95 listener;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public i9j0 translationListener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.TarotInfoView$a */
    @Metadata(m87231d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"com/p1/mobile/putong/core/ui/tarot/TarotInfoView$a", "Ll/ym2;", "", "id", "Ll/ngm;", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "", "h", "(Ljava/lang/String;Ll/ngm;Landroid/graphics/drawable/Animatable;)V", "", "throwable", "c", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8913a extends ym2 {
        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String id, Throwable throwable) {
            id.getClass();
            throwable.getClass();
            super.mo39107c(id, throwable);
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String id, ngm imageInfo, Animatable animatable) {
            id.getClass();
            imageInfo.getClass();
            animatable.getClass();
            super.mo39108h(id, imageInfo, animatable);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.TarotInfoView$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/core/ui/tarot/TarotInfoView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8914b extends AnimatorListenerAdapter {
        public C8914b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            TarotInfoView tarotInfoView = TarotInfoView.this;
            if (tarotInfoView.listener != null) {
                tarotInfoView.getListener().close();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.TarotInfoView$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/core/ui/tarot/TarotInfoView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8915c extends AnimatorListenerAdapter {
        public C8915c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            TarotInfoView tarotInfoView = TarotInfoView.this;
            if (tarotInfoView.listener != null) {
                tarotInfoView.getListener().close();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarotInfoView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.typeface = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.cdi0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TarotInfoView.m55854P(context);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static Typeface m55854P(Context context) {
        return adi0.m95896i(context);
    }

    /* JADX INFO: renamed from: R */
    public static void m55856R(TarotInfoView tarotInfoView, View view) {
        if (tarotInfoView.listener != null) {
            tarotInfoView.getListener().close();
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m55857S(TarotInfoView tarotInfoView, User user, View view) {
        tarotInfoView.m55874m0(false);
        tarotInfoView.m55869g0(false, user);
    }

    /* JADX INFO: renamed from: T */
    public static void m55858T(TarotInfoView tarotInfoView, final Act act, View view) {
        zvf0.m220396r("e_tarot_card_popup_confirm", "p_tarot_card_popup");
        final Bitmap bitmapM186677f = syj.m186677f(tarotInfoView.get_constrain_layout());
        syj.m186675d(act, new d30() { // from class: l.ndi0
            @Override // p149l.d30
            public final void call() {
                TarotInfoView.m55871j0(act, bitmapM186677f);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX INFO: renamed from: V */
    public static void m55859V(User user, TarotInfoView tarotInfoView, Relationship relationship) {
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
        } else if (NullChecker.m81303a(user.localRelationship)) {
            Relationship relationship2 = user.localRelationship;
            relationship2.getClass();
            if (NullChecker.m81303a(relationship2.relationshipExtensions)) {
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
        if (u59.m191827f0()) {
            CoreModule.f17545c.f19642f0.m32650Fo();
        }
        Act act = null;
        if (!CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            Act act2 = tarotInfoView.act;
            if (act2 == null) {
                Intrinsics.m87502r(SocialConstants.PARAM_ACT);
                act2 = null;
            }
            ArrayList arrayListM200324f0 = vwb.m200324f0(user.f56011id);
            List<String> list = relationship.scenarios;
            list.getClass();
            Intent intentM47564g2 = MatchAct.m47564g2(act2, arrayListM200324f0, i, (ArrayList) list, upa.m194694S1() ? "tmp_from_home_swipe" : null);
            Act act3 = tarotInfoView.act;
            if (act3 == null) {
                Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            } else {
                act = act3;
            }
            act.startActivityWithCustomTransition(intentM47564g2, new MatchAct.C8454b());
            return;
        }
        Act act4 = tarotInfoView.act;
        if (act4 == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act4 = null;
        }
        abi.m95622J(act4, user);
        if (!IntlCountryCodeController.m28126v()) {
            mgh0.m154563s();
        }
        if (i == 13 && mx0.m156802o().m156804B()) {
            if (ogl0.m164227F()) {
                ic50.m135327j().m135333f().m145241b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            Act act5 = tarotInfoView.act;
            if (act5 == null) {
                Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            } else {
                act = act5;
            }
            mx0.m156782I(act, false, 5.0f, "superlike");
        }
    }

    /* JADX INFO: renamed from: W */
    public static void m55860W(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    public static void m55861X(TarotInfoView tarotInfoView, User user, View view) {
        tarotInfoView.m55875n0(true);
        tarotInfoView.m55869g0(true, user);
    }

    /* JADX INFO: renamed from: Y */
    public static void m55862Y(TarotInfoView tarotInfoView, User user, View view) {
        tarotInfoView.m55875n0(false);
        tarotInfoView.m55869g0(false, user);
    }

    /* JADX INFO: renamed from: Z */
    public static void m55863Z(TarotInfoView tarotInfoView, User user, View view) {
        tarotInfoView.m55874m0(true);
        tarotInfoView.m55869g0(true, user);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m55866c0(View view) {
    }

    /* JADX INFO: renamed from: e0 */
    private final void m55867e0(final User user) {
        View viewInflate = get_usa_operation().inflate();
        GradientBgButton gradientBgButton = (GradientBgButton) viewInflate.findViewById(u4c0.f174442r2);
        GradientBgButton gradientBgButton2 = (GradientBgButton) viewInflate.findViewById(u4c0.f174094W6);
        xdl0.m208329E0(gradientBgButton, new View.OnClickListener() { // from class: l.jdi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TarotInfoView.m55862Y(this.f117387a, user, view);
            }
        });
        xdl0.m208329E0(gradientBgButton2, new View.OnClickListener() { // from class: l.kdi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TarotInfoView.m55861X(this.f122564a, user, view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    private final void m55868f0(final User user) {
        View viewInflate = get_normal_operation().inflate();
        CardOperationButton cardOperationButton = (CardOperationButton) viewInflate.findViewById(u4c0.f174425q2);
        CardOperationButton cardOperationButton2 = (CardOperationButton) viewInflate.findViewById(u4c0.f174062U6);
        xdl0.m208329E0(cardOperationButton, new View.OnClickListener() { // from class: l.ldi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TarotInfoView.m55857S(this.f127553a, user, view);
            }
        });
        xdl0.m208329E0(cardOperationButton2, new View.OnClickListener() { // from class: l.mdi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TarotInfoView.m55863Z(this.f133240a, user, view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    private final void m55869g0(boolean liked, final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.SUGGEST.getFrom()).isLike(liked).isFromButton(true).isSuperLiked(false).user(user).pageId("p_tarot_card_others_popup").build();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sourcepage", nt30.f140333S0);
        linkedHashMap.put("actiontype", nt30.f140334T0);
        if (liked) {
            zvf0.m220396r("e_tarot_card_others_popup_like", "p_tarot_card_others_popup");
        } else {
            zvf0.m220396r("e_tarot_card_others_popup_dislike", "p_tarot_card_others_popup");
        }
        CoreModule.f17545c.f19663m0.m31073Y7(liked, false, linkedHashMap, user, null, LikeFrom.get("home"), true, likeExtraDataNew_, 0, null).subscribe(mkd0.m154956H(new e30() { // from class: l.edi0
            @Override // p149l.e30
            public final void call(Object obj) {
                TarotInfoView.m55859V(user, this, (Relationship) obj);
            }
        }, new e30() { // from class: l.fdi0
            @Override // p149l.e30
            public final void call(Object obj) {
                TarotInfoView.m55860W((Throwable) obj);
            }
        }));
    }

    private final Typeface getTypeface() {
        return (Typeface) this.typeface.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m55870h0(User user) {
        if (user.pictures.size() > 0) {
            qib0.f154691G.m102319F0(get_image(), zub.m220207f(user.pictures.get(0)), "profile", new C8913a());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m55871j0(Act act, Bitmap bitmap) {
        bitmap.getClass();
        C22306c c22306cDuringCreated = act.duringCreated((C22306c) adi0.m95897j(bitmap).compose(mkd0.m154951C()));
        final Function1 function1 = new Function1() { // from class: l.odi0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TarotInfoView.m55872k0((Boolean) obj);
            }
        };
        c22306cDuringCreated.subscribe(new e30() { // from class: l.ddi0
            @Override // p149l.e30
            public final void call(Object obj) {
                TarotInfoView.m55873l0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m55872k0(Boolean bool) {
        if (bool.booleanValue()) {
            lsi0.m151593w(R$string.f18365ai);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m55873l0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    private final void m55874m0(boolean like) {
        get_constrain_layout().setRotation(like ? 5.0f : -5.0f);
        get_constrain_layout().setPivotX(like ? 0.0f : get_info_layout().getWidth());
        get_constrain_layout().setPivotY(get_info_layout().getHeight());
        if (this.translationListener != null) {
            getTranslationListener().onStart();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", 0.0f, (like ? 1 : -1) * get_constrain_layout().getWidth() * 2.0f);
        objectAnimatorOfFloat.getClass();
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C8914b());
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: n0 */
    private final void m55875n0(boolean like) {
        if (this.translationListener != null) {
            getTranslationListener().onStart();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, (like ? -1 : 1) * get_constrain_layout().getHeight() * 2.0f);
        objectAnimatorOfFloat.getClass();
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C8915c());
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m55876d0(View view) {
        pdi0.m168386a(this, view);
    }

    @NotNull
    public final w95 getListener() {
        w95 w95Var = this.listener;
        if (w95Var != null) {
            return w95Var;
        }
        Intrinsics.m87502r(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return null;
    }

    @NotNull
    public final i9j0 getTranslationListener() {
        i9j0 i9j0Var = this.translationListener;
        if (i9j0Var != null) {
            return i9j0Var;
        }
        Intrinsics.m87502r("translationListener");
        return null;
    }

    @NotNull
    public final VText get_age() {
        VText vText = this._age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_age");
        return null;
    }

    @NotNull
    public final VText get_branding() {
        VText vText = this._branding;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_branding");
        return null;
    }

    @NotNull
    public final RelativeLayout get_card_layout() {
        RelativeLayout relativeLayout = this._card_layout;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_card_layout");
        return null;
    }

    @NotNull
    public final VButton get_close() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_constrain_layout() {
        ConstraintLayout constraintLayout = this._constrain_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_constrain_layout");
        return null;
    }

    @NotNull
    public final TextView get_desc() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_desc");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @NotNull
    public final RelativeLayout get_image_layout() {
        RelativeLayout relativeLayout = this._image_layout;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_image_layout");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_info_layout() {
        ConstraintLayout constraintLayout = this._info_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_info_layout");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name");
        return null;
    }

    @NotNull
    public final ViewStub get_normal_operation() {
        ViewStub viewStub = this._normal_operation;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m87502r("_normal_operation");
        return null;
    }

    @NotNull
    public final LinearMeasureOrderLayout get_order_layout() {
        LinearMeasureOrderLayout linearMeasureOrderLayout = this._order_layout;
        if (linearMeasureOrderLayout != null) {
            return linearMeasureOrderLayout;
        }
        Intrinsics.m87502r("_order_layout");
        return null;
    }

    @NotNull
    public final VText get_reversed() {
        VText vText = this._reversed;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_reversed");
        return null;
    }

    @NotNull
    public final LinearLayout get_save_pic() {
        LinearLayout linearLayout = this._save_pic;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_save_pic");
        return null;
    }

    @NotNull
    public final VText get_save_pic_text() {
        VText vText = this._save_pic_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_save_pic_text");
        return null;
    }

    @NotNull
    public final Space get_space() {
        Space space = this._space;
        if (space != null) {
            return space;
        }
        Intrinsics.m87502r("_space");
        return null;
    }

    @NotNull
    public final FlowLayout get_tags() {
        FlowLayout flowLayout = this._tags;
        if (flowLayout != null) {
            return flowLayout;
        }
        Intrinsics.m87502r("_tags");
        return null;
    }

    @NotNull
    public final ImageView get_tarot_image() {
        ImageView imageView = this._tarot_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_tarot_image");
        return null;
    }

    @NotNull
    public final TextView get_type() {
        TextView textView = this._type;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_type");
        return null;
    }

    @NotNull
    public final VText get_upright() {
        VText vText = this._upright;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_upright");
        return null;
    }

    @NotNull
    public final ViewStub get_usa_operation() {
        ViewStub viewStub = this._usa_operation;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m87502r("_usa_operation");
        return null;
    }

    @NotNull
    public final VText get_zodiac() {
        VText vText = this._zodiac;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_zodiac");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m55877i0(@NotNull final Act act, @NotNull TarotData tarotInfo) {
        act.getClass();
        tarotInfo.getClass();
        this.act = act;
        get_name().setText(tarotInfo.card.name);
        get_age().setText(String.valueOf(tarotInfo.card.age.intValue()));
        if (!b43.m100168b()) {
            get_zodiac().setText(i0g0.m133869j0(tarotInfo.card.profile.zodiac));
        }
        Context context = getContext();
        context.getClass();
        TarotCardData tarotCardDataM95895g = adi0.m95895g(context, tarotInfo.cardType);
        get_tarot_image().setImageResource(tarotCardDataM95895g.image);
        get_tarot_image().setRotation(tarotCardDataM95895g.reversed ? 180.0f : 0.0f);
        xdl0.m208344M(get_upright(), !tarotCardDataM95895g.reversed);
        xdl0.m208344M(get_reversed(), tarotCardDataM95895g.reversed);
        get_type().setText(tarotCardDataM95895g.name);
        get_desc().setText(tarotCardDataM95895g.meaning);
        get_desc().setMovementMethod(ScrollingMovementMethod.getInstance());
        String str = tarotCardDataM95895g.keywords;
        str.getClass();
        for (String str2 : StringsKt.split$default(str, new String[]{Constants.SEPARATOR_COMMA, "，"}, false, 0, 6, null)) {
            View viewInflate = o7r.m163037a(getContext()).inflate(f6c0.f95528Q5, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(u4c0.f173791E6)).setText(str2);
            get_tags().addView(viewInflate);
        }
        if (TextUtils.equals(tarotInfo.card.f56011id, CoreModule.m29931H().userId())) {
            xdl0.m208344M(get_save_pic(), true);
            xdl0.m208344M(get_branding(), true);
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            userM169527p9.getClass();
            m55870h0(userM169527p9);
            xdl0.m208329E0(get_save_pic(), new View.OnClickListener() { // from class: l.gdi0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TarotInfoView.m55858T(this.f102118a, act, view);
                }
            });
            xdl0.m208329E0(get_close(), new View.OnClickListener() { // from class: l.hdi0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TarotInfoView.m55856R(this.f107249a, view);
                }
            });
            return;
        }
        User user = tarotInfo.card;
        user.getClass();
        m55870h0(user);
        xdl0.m208344M(get_branding(), false);
        xdl0.m208344M(get_close(), false);
        get_constrain_layout().setOnClickListener(new View.OnClickListener() { // from class: l.idi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TarotInfoView.m55866c0(view);
            }
        });
        boolean zM28126v = IntlCountryCodeController.m28126v();
        User user2 = tarotInfo.card;
        if (zM28126v) {
            user2.getClass();
            m55867e0(user2);
        } else {
            user2.getClass();
            m55868f0(user2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55876d0(this);
        get_type().setTypeface(getTypeface());
        get_upright().setTypeface(getTypeface());
        get_reversed().setTypeface(getTypeface());
        qib0.f154691G.m102314D(get_info_layout(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkRTR0NJS0FIU1lXWjczNU1GMkxURURMU0hVQVZUQTE0IiwidyI6OTYwLCJoIjoxMDM1LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTIzODc5MDE1NDY4MTkwOTI0OH0.webp");
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View v2, @NotNull MotionEvent event) {
        v2.getClass();
        event.getClass();
        if (v2.getId() != u4c0.f174425q2 && v2.getId() != u4c0.f174062U6 && v2.getId() != u4c0.f174361m6) {
            return false;
        }
        v2.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public final void setListener(@NotNull w95 w95Var) {
        w95Var.getClass();
        this.listener = w95Var;
    }

    public final void setTranslationListener(@NotNull i9j0 i9j0Var) {
        i9j0Var.getClass();
        this.translationListener = i9j0Var;
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

    public final void set_constrain_layout(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._constrain_layout = constraintLayout;
    }

    public final void set_desc(@NotNull TextView textView) {
        textView.getClass();
        this._desc = textView;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_image_layout(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._image_layout = relativeLayout;
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

    public final void set_reversed(@NotNull VText vText) {
        vText.getClass();
        this._reversed = vText;
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

    public final void set_tarot_image(@NotNull ImageView imageView) {
        imageView.getClass();
        this._tarot_image = imageView;
    }

    public final void set_type(@NotNull TextView textView) {
        textView.getClass();
        this._type = textView;
    }

    public final void set_upright(@NotNull VText vText) {
        vText.getClass();
        this._upright = vText;
    }

    public final void set_usa_operation(@NotNull ViewStub viewStub) {
        viewStub.getClass();
        this._usa_operation = viewStub;
    }

    public final void set_zodiac(@NotNull VText vText) {
        vText.getClass();
        this._zodiac = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TarotInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TarotInfoView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
