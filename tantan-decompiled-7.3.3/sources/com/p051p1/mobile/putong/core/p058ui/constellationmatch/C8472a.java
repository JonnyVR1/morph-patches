package com.p051p1.mobile.putong.core.p058ui.constellationmatch;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ConstellationData;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.core.p058ui.constellationmatch.C8472a;
import com.p051p1.mobile.putong.core.p058ui.tarot.TarotListView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;
import p153l.agc0;
import p153l.bnl0;
import p153l.c4s;
import p153l.i4g0;
import p153l.jyb;
import p153l.kec0;
import p153l.l4g0;
import p153l.lyh0;
import p153l.nij0;
import p153l.p7f;
import p153l.p9r;
import p153l.pej0;
import p153l.q8g0;
import p153l.qa00;
import p153l.uqb0;
import p153l.ur2;
import p153l.vy5;
import p153l.w1e;
import p153l.ya5;
import p153l.yz5;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u001f\"\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u001dH\u0002¢\u0006\u0004\b.\u0010%J\u0017\u0010'\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010,J\u000f\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u0010J\u000f\u00104\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010<\u001a\u00020\u001d2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u001dH\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u001d2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u001dH\u0002¢\u0006\u0004\b>\u0010=J\u0017\u0010?\u001a\u00020\u001d2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020B2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\nH\u0002¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\f¢\u0006\u0004\bE\u0010\u0010J\u0017\u0010F\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010\u000eJ\u000f\u0010G\u001a\u00020\fH\u0016¢\u0006\u0004\bG\u0010\u0010J\u000f\u0010H\u001a\u00020\fH\u0016¢\u0006\u0004\bH\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010{\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010r\u001a\u0004\by\u0010t\"\u0004\bz\u0010vR%\u0010\u0082\u0001\u001a\u00020|8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b:\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R(\u0010\u0090\u0001\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0005\b\u008f\u0001\u0010)R*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R%\u0010£\u0001\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\r\u0010r\u001a\u0005\b¡\u0001\u0010t\"\u0005\b¢\u0001\u0010vR\u0016\u0010¥\u0001\u001a\u0002098\u0002X\u0082D¢\u0006\u0007\n\u0005\b¤\u0001\u0010SR\u0018\u0010§\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010SR\u0017\u0010¨\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010SR\u0019\u0010ª\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0017\u0010\u008d\u0001R\u0017\u0010¬\u0001\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010\u009c\u0001R\u0017\u0010\u00ad\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010SR\u0018\u0010®\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010\u009c\u0001R\u0018\u0010¯\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u009c\u0001R\u0018\u0010°\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010\u009c\u0001R\u001b\u0010³\u0001\u001a\u0005\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010²\u0001R\u0019\u0010¶\u0001\u001a\u00030´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u00107R\u0018\u0010¸\u0001\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b>\u0010·\u0001R \u0010¼\u0001\u001a\u00030¹\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b<\u0010º\u0001\u001a\u0006\b«\u0001\u0010»\u0001R \u0010½\u0001\u001a\u00030¹\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b[\u0010º\u0001\u001a\u0006\bµ\u0001\u0010»\u0001¨\u0006¾\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/constellationmatch/a;", "Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationCard$a;", "Ll/ya5;", "Ll/nij0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "user", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "n", "(Landroid/view/View;)V", "N", "()V", "q", "Landroid/animation/AnimatorSet;", "animatorSet", "Y", "(Landroid/animation/AnimatorSet;)V", "R", "r", "()Landroid/view/View;", "bigCardView", "smallCard", "W", "(Landroid/view/View;Landroid/view/View;Landroid/animation/AnimatorSet;)V", "", "alpha", "", "views", "U", "(F[Landroid/view/View;)V", "distance", p7f.GPS_DIRECTION_TRUE, "(F)V", "Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationCard;", ResourceDirection.f39656v, p7f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationCard;)V", "currentRotation", Constants.KEY_T, "(F)F", "xVelocity", "M", "startAngle", BaseSei.f14624X, "()F", "Q", "Landroid/animation/ValueAnimator;", "P", "()Landroid/animation/ValueAnimator;", "Landroid/animation/ObjectAnimator;", "Z", "()Landroid/animation/ObjectAnimator;", "", RXScreenCaptureService.KEY_INDEX, "currentValue", "A", "(IF)F", BaseSei.f14626Z, "w", "(I)F", "rootView", "Ll/pej0;", "u", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/pej0;", p7f.GPS_MEASUREMENT_INTERRUPTED, "a", "close", "onStart", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "I", "()Landroid/widget/FrameLayout;", "set_root_layout", "(Landroid/widget/FrameLayout;)V", "_root_layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", Constants.INAPP_DATA_TAG, "Landroidx/constraintlayout/widget/ConstraintLayout;", "B", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_body", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_body", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "L", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VButton;", "f", "Lv/VButton;", c4s.C_ZONE, "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "Lv/VText;", "g", "Lv/VText;", "G", "()Lv/VText;", "set_reading", "(Lv/VText;)V", "_reading", "h", "H", "set_reading_instruction", "_reading_instruction", "Landroid/widget/Space;", "Landroid/widget/Space;", "get_space", "()Landroid/widget/Space;", "set_space", "(Landroid/widget/Space;)V", "_space", "Lv/VImage;", "j", "Lv/VImage;", "E", "()Lv/VImage;", "set_image", "(Lv/VImage;)V", "_image", "k", "Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationCard;", "D", "()Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationCard;", "set_hide_card", "_hide_card", "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", "K", "()Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;", "set_tarot_layout", "(Lcom/p1/mobile/putong/core/ui/tarot/TarotListView;)V", "_tarot_layout", "Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationView;", "m", "Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationView;", "F", "()Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationView;", "set_lineView", "(Lcom/p1/mobile/putong/core/ui/constellationmatch/ConstellationView;)V", "_lineView", "J", "set_slide_text", "_slide_text", "o", "cardCount", "p", "cardWidth", "cardHeight", "", "bigRadius", BLiveStormDanmakuGiftResourceType.f45294s, "maxDegree", "currentCardIndex", "mPreDistance", "maxAngle", "minAngle", "Lcom/p1/mobile/putong/core/data/ConstellationData;", "Lcom/p1/mobile/putong/core/data/ConstellationData;", ProfileLikeCategoryType.zodiac, "", BaseSei.f14625Y, "isCreated", "Ll/pej0;", OMSTemplateType.dialog, "Ll/l4g0;", "Lkotlin/Lazy;", "()Ll/l4g0;", "cardPageHelp", "pageHelp", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C8472a implements ConstellationCard.InterfaceC8468a, ya5, nij0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy cardPageHelp;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final User user;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout _root_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _body;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VButton _close;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _reading;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _reading_instruction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Space _space;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VImage _image;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ConstellationCard _hide_card;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public TarotListView _tarot_layout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public ConstellationView _lineView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _slide_text;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int cardCount;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int cardWidth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int cardHeight;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public double bigRadius;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final float maxDegree;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int currentCardIndex;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float mPreDistance;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public float maxAngle;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public float minAngle;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public ConstellationData zodiac;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean isCreated;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public pej0 dialog;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.a$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/p1/mobile/putong/core/ui/constellationmatch/a$a", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class a extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_intl_horoscope_match_others_card";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.a$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m88121d2 = {"com/p1/mobile/putong/core/ui/constellationmatch/a$b", "Lcom/p1/mobile/putong/core/ui/tarot/TarotListView$a;", "", "xVelocity", "", "b", "(F)V", "newDistance", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class b implements TarotListView.InterfaceC9079a {
        public b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.tarot.TarotListView.InterfaceC9079a
        /* JADX INFO: renamed from: a */
        public void mo46017a(float newDistance) {
            C8472a.this.m46000T(newDistance);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.tarot.TarotListView.InterfaceC9079a
        /* JADX INFO: renamed from: b */
        public void mo46018b(float xVelocity) {
            C8472a.this.m45994M(xVelocity);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.a$c */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/p1/mobile/putong/core/ui/constellationmatch/a$c", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class c extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pej0 f29713a;

        public c(pej0 pej0Var) {
            this.f29713a = pej0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 1 || p1 == 2 || p1 == 3) {
                this.f29713a.getBehavior().setState(3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.a$d */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/p1/mobile/putong/core/ui/constellationmatch/a$d", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class d extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_intl_horoscope_match_pick_cards";
        }
    }

    public C8472a(@NotNull Act act, @NotNull User user) {
        act.getClass();
        user.getClass();
        this.act = act;
        this.user = user;
        this.cardCount = 22;
        this.cardWidth = qa00.m175859d(103.0f);
        this.cardHeight = qa00.m175859d(163.0f);
        this.maxDegree = 6.25f;
        this.cardPageHelp = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.tz5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8472a.m45971e();
            }
        });
        this.pageHelp = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.uz5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8472a.m45979m();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static final void m45966O(C8472a c8472a, View view) {
        c8472a.close();
    }

    /* JADX INFO: renamed from: X */
    public static final void m45967X(C8472a c8472a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        if (((Float) animatedValue).floatValue() <= -272.0f) {
            c8472a.m45983B().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m45969c(C8472a c8472a, View view) {
        c8472a.close();
    }

    /* JADX INFO: renamed from: e */
    public static l4g0 m45971e() {
        return new l4g0(new a());
    }

    /* JADX INFO: renamed from: f */
    public static void m45972f(C8472a c8472a, float f, float f2, float f3, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i = c8472a.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = c8472a.m45992K().getChildAt(i2);
            if (childAt instanceof ConstellationCard) {
                ConstellationCard constellationCard = (ConstellationCard) childAt;
                float latestRotation = ((f - f2) * fFloatValue) + constellationCard.getLatestRotation();
                constellationCard.setRotation(latestRotation);
                double d2 = f3;
                double d3 = (((double) latestRotation) * 3.141592653589793d) / 180.0d;
                constellationCard.setTranslationX((float) (Math.sin(d3) * d2));
                constellationCard.setTranslationY((float) (d2 - (Math.cos(d3) * d2)));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m45973g(C8472a c8472a, float f, float f2, float f3, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i = c8472a.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = c8472a.m45992K().getChildAt(i2);
            if (childAt instanceof ConstellationCard) {
                ConstellationCard constellationCard = (ConstellationCard) childAt;
                float latestRotation = constellationCard.getLatestRotation() + ((f - f2) * fFloatValue);
                constellationCard.setRotation(latestRotation);
                double dM46010t = c8472a.m46010t(latestRotation);
                double d2 = (((double) latestRotation) * 3.141592653589793d) / 180.0d;
                constellationCard.setTranslationX((float) (Math.sin(d2) * dM46010t));
                constellationCard.setTranslationY((float) (((double) f3) - (dM46010t * Math.cos(d2))));
            }
        }
        if (fFloatValue == 1.0f) {
            c8472a.mPreDistance = ((float) ((((double) f3) * 6.283185307179586d) * ((double) f))) / 360.0f;
            int i3 = c8472a.cardCount;
            for (int i4 = 0; i4 < i3; i4++) {
                View childAt2 = c8472a.m45992K().getChildAt(i4);
                if (childAt2 instanceof ConstellationCard) {
                    c8472a.m45999S((ConstellationCard) childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m45974h(C8472a c8472a, DialogInterface dialogInterface) {
        w1e.m204401e(c8472a.m46015y());
    }

    /* JADX INFO: renamed from: i */
    public static void m45975i(C8472a c8472a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        c8472a.m45985D().setTranslationY((-qa00.m175859d(150.0f)) * fFloatValue);
        c8472a.m46001U(1.0f - fFloatValue, c8472a.m45991J(), c8472a.m45987F(), c8472a.m45992K(), c8472a.m45989H(), c8472a.m45988G(), c8472a.m45984C(), c8472a.m45993L(), c8472a.m45986E());
    }

    /* JADX INFO: renamed from: j */
    public static void m45976j(View view, View view2, final C8472a c8472a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        if (((Float) animatedValue).floatValue() == -90.0f) {
            view.setRotationY(-270.0f);
            view.setAlpha(1.0f);
            view.setScaleX(view2.getWidth() / (c8472a.m45990I().getWidth() * 1.0f));
            view.setScaleY(view2.getHeight() / (c8472a.m45990I().getHeight() * 1.0f));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotationY", -270.0f, -360.0f);
            objectAnimatorOfFloat.getClass();
            objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wz5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    C8472a.m45967X(this.f191728a, valueAnimator2);
                }
            });
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", view2.getWidth() / (c8472a.m45990I().getWidth() * 1.0f), 1.0f);
            objectAnimatorOfFloat2.getClass();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", view2.getHeight() / (c8472a.m45990I().getHeight() * 1.0f), 1.0f);
            objectAnimatorOfFloat3.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet.setDuration(300L);
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m45977k(C8472a c8472a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        View childAt = c8472a.m45992K().getChildAt(c8472a.currentCardIndex);
        childAt.getClass();
        if (childAt instanceof ConstellationCard) {
            ConstellationCard constellationCard = (ConstellationCard) childAt;
            constellationCard.setTranslationY(((-c8472a.cardHeight) / 2.0f) * fFloatValue);
            c8472a.m45999S(constellationCard);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m45978l(C8472a c8472a, ValueAnimator valueAnimator) {
        int i;
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i2 = c8472a.cardCount;
        for (int i3 = 0; i3 < i2; i3++) {
            View childAt = c8472a.m45992K().getChildAt(i3);
            if ((childAt instanceof ConstellationCard) && i3 != (i = c8472a.currentCardIndex)) {
                ConstellationCard constellationCard = (ConstellationCard) childAt;
                constellationCard.setRotation(c8472a.maxDegree * (i3 - i) * fFloatValue);
                constellationCard.setTranslationX(c8472a.m46016z(i3 - c8472a.currentCardIndex, fFloatValue));
                constellationCard.setTranslationY(c8472a.m45982A(Math.abs(i3 - c8472a.currentCardIndex), fFloatValue));
                c8472a.m45999S(constellationCard);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static l4g0 m45979m() {
        return new l4g0(new d());
    }

    /* JADX INFO: renamed from: A */
    public final float m45982A(int i, float currentValue) {
        double d2 = this.bigRadius;
        int i2 = this.cardHeight;
        return (float) ((d2 - ((double) (i2 / 2))) - ((d2 - ((double) (i2 / 2))) * Math.cos(((((double) (i * this.maxDegree)) * 3.141592653589793d) / 180.0d) * ((double) currentValue))));
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final ConstraintLayout m45983B() {
        ConstraintLayout constraintLayout = this._body;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_body");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VButton m45984C() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final ConstellationCard m45985D() {
        ConstellationCard constellationCard = this._hide_card;
        if (constellationCard != null) {
            return constellationCard;
        }
        Intrinsics.m88391r("_hide_card");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VImage m45986E() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final ConstellationView m45987F() {
        ConstellationView constellationView = this._lineView;
        if (constellationView != null) {
            return constellationView;
        }
        Intrinsics.m88391r("_lineView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VText m45988G() {
        VText vText = this._reading;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_reading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VText m45989H() {
        VText vText = this._reading_instruction;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_reading_instruction");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final FrameLayout m45990I() {
        FrameLayout frameLayout = this._root_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m45991J() {
        VText vText = this._slide_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_slide_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final TarotListView m45992K() {
        TarotListView tarotListView = this._tarot_layout;
        if (tarotListView != null) {
            return tarotListView;
        }
        Intrinsics.m88391r("_tarot_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final TextView m45993L() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final void m45994M(float xVelocity) {
        final float fM46014x = m46014x();
        this.mPreDistance += xVelocity / 8.0f;
        final float fM46012v = m46012v(m46014x());
        final float f = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        if (fM46014x == fM46012v) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xz5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8472a.m45973g(this.f196833a, fM46012v, fM46014x, f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: N */
    public final void m45995N() {
        ConstellationData constellationDataM203951c = vy5.m203951c(this.act, this.user.profile.zodiac);
        this.zodiac = constellationDataM203951c;
        if (!NullChecker.m82486a(constellationDataM203951c)) {
            pej0 pej0Var = this.dialog;
            if (pej0Var == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                pej0Var = null;
            }
            pej0Var.dismiss();
            return;
        }
        ConstellationData constellationData = this.zodiac;
        if (constellationData != null) {
            uqb0.f180374G.m127160x0(constellationData.cardBg);
            m45988G().setText(q8g0.m175796b0(this.act.getString(R$string.f19766wa, constellationData.name), jyb.m147507f0(constellationData.name), Color.parseColor("#8729FF"), lyh0.m156283c(2)));
            bnl0.m105509E0(m45984C(), new View.OnClickListener() { // from class: l.vz5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8472a.m45966O(this.f186443a, view);
                }
            });
            int i = this.cardCount;
            this.currentCardIndex = i / 2;
            float f = this.maxDegree;
            this.maxAngle = (i / 2) * f;
            this.minAngle = (-((i - (i / 2)) - 1)) * f;
            m46007q();
            this.bigRadius = ((double) this.cardHeight) * 2.5d;
            m45997Q();
        }
    }

    /* JADX INFO: renamed from: P */
    public final ValueAnimator m45996P() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oz5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8472a.m45977k(this.f149841a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: Q */
    public final void m45997Q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nz5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8472a.m45978l(this.f144406a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(500L);
        animatorSet.playSequentially(valueAnimatorOfFloat, m45996P(), m45987F().getAnim(), m46005Z());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: R */
    public final void m45998R(AnimatorSet animatorSet) {
        final float fM46014x = m46014x();
        final float f = (this.maxAngle * 2.0f) + ((fM46014x > 0.0f ? 1 : -1) * fM46014x);
        final float f2 = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        if (fM46014x == f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rz5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8472a.m45972f(this.f165488a, f, fM46014x, f2, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: S */
    public final void m45999S(ConstellationCard v2) {
        if (v2.getRotation() == 0.0f) {
            v2.setBgVisibility(true);
        } else {
            v2.setBgVisibility(false);
        }
        v2.setLatestRotation(v2.getRotation());
    }

    /* JADX INFO: renamed from: T */
    public final void m46000T(float distance) {
        this.mPreDistance += distance;
        float fM46014x = m46014x();
        float f = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        int i = this.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = m45992K().getChildAt(i2);
            childAt.setRotation(m46013w(i2) + fM46014x);
            float fM46013w = m46013w(i2) + fM46014x;
            double dM46010t = m46010t(fM46013w);
            double d2 = (((double) fM46013w) * 3.141592653589793d) / 180.0d;
            childAt.setTranslationX((float) (Math.sin(d2) * dM46010t));
            childAt.setTranslationY((float) (((double) f) - (dM46010t * Math.cos(d2))));
            m45999S((ConstellationCard) childAt);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m46001U(float alpha, View... views) {
        for (View view : views) {
            view.setAlpha(alpha);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m46002V() {
        pej0 pej0Var = null;
        View viewInflate = p9r.m171370a(this.act).inflate(kec0.f125320A4, (ViewGroup) null);
        viewInflate.getClass();
        m46006n(viewInflate);
        this.dialog = m46011u(this.act, viewInflate);
        m45995N();
        pej0 pej0Var2 = this.dialog;
        if (pej0Var2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var2 = null;
        }
        pej0Var2.show();
        pej0 pej0Var3 = this.dialog;
        if (pej0Var3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            pej0Var = pej0Var3;
        }
        pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pz5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C8472a.m45974h(this.f154720a, dialogInterface);
            }
        });
        w1e.m204402f(m46015y());
    }

    /* JADX INFO: renamed from: W */
    public final void m46003W(final View bigCardView, final View smallCard, AnimatorSet animatorSet) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(smallCard, "rotationY", 0.0f, -90.0f);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sz5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8472a.m45976j(bigCardView, smallCard, this, valueAnimator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        animatorSet.playSequentially(objectAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: Y */
    public final void m46004Y(AnimatorSet animatorSet) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        m45985D().setVisibility(0);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.qz5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8472a.m45975i(this.f160221a, valueAnimator);
            }
        });
        animatorSet.playSequentially(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: Z */
    public final ObjectAnimator m46005Z() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m45991J(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        return objectAnimatorOfFloat;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.constellationmatch.ConstellationCard.InterfaceC8468a
    /* JADX INFO: renamed from: a */
    public void mo45936a(@NotNull View view) {
        view.getClass();
        if (m45991J().getAlpha() == 1.0f) {
            i4g0.m138520r("e_intl_horoscope_match_pick_cards", "p_intl_horoscope_match_pick_cards");
            view.setVisibility(8);
            AnimatorSet animatorSet = new AnimatorSet();
            m46004Y(animatorSet);
            m45998R(animatorSet);
            m46003W(m46008r(), m45985D(), animatorSet);
            animatorSet.start();
        }
    }

    @Override // p153l.ya5
    public void close() {
        if (this.isCreated) {
            w1e.m204401e(m46009s());
        }
        pej0 pej0Var = this.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: n */
    public final void m46006n(View view) {
        yz5.m218009a(this, view);
    }

    @Override // p153l.nij0
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

    /* JADX INFO: renamed from: q */
    public final void m46007q() {
        int i = this.cardCount;
        for (int i2 = 0; i2 < i; i2++) {
            View viewInflate = p9r.m171370a(this.act).inflate(kec0.f126165z4, (ViewGroup) null);
            viewInflate.getClass();
            ConstellationCard constellationCard = (ConstellationCard) viewInflate;
            constellationCard.setListener(this);
            ConstellationData constellationData = this.zodiac;
            if (constellationData != null) {
                constellationCard.setBg(constellationData.cardBg);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.cardWidth, this.cardHeight);
            layoutParams.gravity = 1;
            layoutParams.topMargin = (this.cardHeight / 2) - qa00.m175859d(10.0f);
            layoutParams.bottomMargin = this.cardHeight / 2;
            constellationCard.setLayoutParams(layoutParams);
            m45992K().addView(constellationCard);
        }
        m45992K().setOnScrollListener(new b());
    }

    /* JADX INFO: renamed from: r */
    public final View m46008r() {
        this.isCreated = true;
        View viewInflate = p9r.m171370a(this.act).inflate(kec0.f126131x4, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, bnl0.m105588w0());
        layoutParams.gravity = 16;
        viewInflate.setVisibility(0);
        viewInflate.setAlpha(0.0f);
        m45990I().addView(viewInflate, layoutParams);
        m45990I().setOnClickListener(new View.OnClickListener() { // from class: l.mz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8472a.m45969c(this.f139478a, view);
            }
        });
        if (viewInflate instanceof ConstellationInfoView) {
            ConstellationInfoView constellationInfoView = (ConstellationInfoView) viewInflate;
            constellationInfoView.m45960h0(this.act, this.user);
            constellationInfoView.setListener(this);
            constellationInfoView.setTranslationListener(this);
        }
        w1e.m204402f(m46009s());
        return viewInflate;
    }

    /* JADX INFO: renamed from: s */
    public final l4g0 m46009s() {
        return (l4g0) this.cardPageHelp.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final float m46010t(float currentRotation) {
        double d2 = this.bigRadius;
        float f = (float) d2;
        float f2 = (float) (d2 - ((double) (this.cardHeight / 2.0f)));
        if (Math.abs(currentRotation) > this.maxDegree) {
            return f2;
        }
        return f - (((f - f2) / this.maxDegree) * Math.abs(currentRotation));
    }

    /* JADX INFO: renamed from: u */
    public final pej0 m46011u(Act act, View rootView) {
        pej0 pej0Var = new pej0(act, agc0.f71118d);
        pej0Var.setContentView(rootView);
        pej0Var.setCancelable(true);
        pej0Var.getBehavior().setState(3);
        pej0Var.getBehavior().addBottomSheetCallback(new c(pej0Var));
        return pej0Var;
    }

    /* JADX INFO: renamed from: v */
    public final float m46012v(float startAngle) {
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

    /* JADX INFO: renamed from: w */
    public final float m46013w(int i) {
        return (i - (this.cardCount / 2)) * this.maxDegree;
    }

    /* JADX INFO: renamed from: x */
    public final float m46014x() {
        double d2 = (float) (this.bigRadius - ((double) (this.cardHeight / 2.0f)));
        float f = (float) (((double) (this.mPreDistance * 360.0f)) / (6.283185307179586d * d2));
        float f2 = this.maxAngle;
        if (f > f2) {
            this.mPreDistance = (float) (((((double) (2.0f * f2)) * 3.141592653589793d) * d2) / 360.0d);
            return f2;
        }
        float f3 = this.minAngle;
        if (f >= f3) {
            return f;
        }
        this.mPreDistance = (float) (((((double) (2.0f * f3)) * 3.141592653589793d) * d2) / 360.0d);
        return f3;
    }

    /* JADX INFO: renamed from: y */
    public final l4g0 m46015y() {
        return (l4g0) this.pageHelp.getValue();
    }

    /* JADX INFO: renamed from: z */
    public final float m46016z(int i, float currentValue) {
        return (float) ((this.bigRadius - ((double) (this.cardHeight / 2))) * Math.sin(((((double) (i * this.maxDegree)) * 3.141592653589793d) / 180.0d) * ((double) currentValue)));
    }
}
