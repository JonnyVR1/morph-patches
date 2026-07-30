package com.p046p1.mobile.putong.core.newui.messages.anim.view;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.ImpressSignalConversationHeadView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageHalfPageComposerAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.CreditScoreTaskType;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.b2s;
import p149l.bt0;
import p149l.c4g0;
import p149l.e30;
import p149l.j760;
import p149l.jjb0;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o7r;
import p149l.osi0;
import p149l.pmm;
import p149l.qib0;
import p149l.roj0;
import p149l.rzb0;
import p149l.snm;
import p149l.upa;
import p149l.w29;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.yij0;
import p149l.zub;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0014¢\u0006\u0004\b'\u0010\u0014J\u000f\u0010(\u001a\u00020\fH\u0014¢\u0006\u0004\b(\u0010\u0014J\r\u0010)\u001a\u00020\f¢\u0006\u0004\b)\u0010\u0014J\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u0014J%\u00101\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\f2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u0014J\r\u00108\u001a\u00020\f¢\u0006\u0004\b8\u0010\u0014J\r\u00109\u001a\u00020\u001a¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\f¢\u0006\u0004\b;\u0010\u0014J\r\u0010<\u001a\u00020\f¢\u0006\u0004\b<\u0010\u0014J\u001d\u0010>\u001a\u00020\f2\u0006\u0010=\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b>\u0010?R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010_\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010J\u001a\u0004\b]\u0010L\"\u0004\b^\u0010NR\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010k\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010J\u001a\u0004\bi\u0010L\"\u0004\bj\u0010NR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010w\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010J\u001a\u0004\bu\u0010L\"\u0004\bv\u0010NR\"\u0010{\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010J\u001a\u0004\by\u0010L\"\u0004\bz\u0010NR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0087\u0001\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010V\u001a\u0005\b\u0085\u0001\u0010X\"\u0005\b\u0086\u0001\u0010ZR&\u0010\u008b\u0001\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010V\u001a\u0005\b\u0089\u0001\u0010X\"\u0005\b\u008a\u0001\u0010ZR&\u0010\u008f\u0001\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010V\u001a\u0005\b\u008d\u0001\u0010X\"\u0005\b\u008e\u0001\u0010ZR*\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R%\u0010\u009a\u0001\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\r\u0010n\u001a\u0005\b\u0098\u0001\u0010p\"\u0005\b\u0099\u0001\u0010rR'\u0010\u009d\u0001\u001a\u00020|8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b%\u0010~\u001a\u0006\b\u009b\u0001\u0010\u0080\u0001\"\u0006\b\u009c\u0001\u0010\u0082\u0001R%\u0010 \u0001\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u0018\u0010n\u001a\u0005\b\u009e\u0001\u0010p\"\u0005\b\u009f\u0001\u0010rR%\u0010£\u0001\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b7\u0010J\u001a\u0005\b¡\u0001\u0010L\"\u0005\b¢\u0001\u0010NR)\u0010¦\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b8\u0010\u0092\u0001\u001a\u0006\b¤\u0001\u0010\u0094\u0001\"\u0006\b¥\u0001\u0010\u0096\u0001R\u001e\u0010ª\u0001\u001a\u00020\u00068\u0006X\u0086D¢\u0006\u000f\n\u0005\b\u001d\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R\u001b\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001b\u0010°\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010¯\u0001R\u001c\u0010´\u0001\u001a\u0005\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R(\u0010º\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0005\b¹\u0001\u0010\u0012R)\u0010¾\u0001\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0013\u0010¬\u0001\u001a\u0005\b»\u0001\u0010:\"\u0006\b¼\u0001\u0010½\u0001R(\u0010Ä\u0001\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b¿\u0001\u0010;\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R(\u0010Ê\u0001\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b*\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R\u001b\u0010Ë\u0001\u001a\u0005\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010³\u0001¨\u0006Ì\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "p", "(Landroid/view/View;)V", "", "isHeartShow", b2s.C_ZONE, "(Z)V", BaseSei.f13932Z, "()V", "ignoreCoinGuide", "Ll/e30;", "successCall", "r", "(ZLl/e30;)V", "", "input", "gotoChat", "u", "(ZLjava/lang/String;Z)V", "w", "(Ljava/lang/String;Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "q", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "onFinishInflate", "onDetachedFromWindow", "D", "B", "Lcom/p1/mobile/putong/data/PushMessageCustom;", "pushMessage", "", StudentVerRejectedReason.startTime, "Lcom/p1/mobile/putong/newui/main/base/TabName;", "tabName", "E", "(Lcom/p1/mobile/putong/data/PushMessageCustom;JLcom/p1/mobile/putong/newui/main/base/TabName;)V", "Lcom/p1/mobile/putong/data/User;", "user", "F", "(Lcom/p1/mobile/putong/data/User;)V", BLiveStormDanmakuGiftResourceType.f44446s, Constants.KEY_T, "getRenderPageId", "()Ljava/lang/String;", "J", "K", "broadcastTimer", "G", "(JLcom/p1/mobile/putong/newui/main/base/TabName;)V", "Lv/VFrame;", "a", "Lv/VFrame;", "get_main_container", "()Lv/VFrame;", "set_main_container", "(Lv/VFrame;)V", "_main_container", "Lv/VText;", "b", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "c", "get_avatar_layout", "set_avatar_layout", "_avatar_layout", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_profile_user", "()Lv/VDraweeView;", "set_profile_user", "(Lv/VDraweeView;)V", "_profile_user", "e", "get_green", "set_green", "_green", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "get_text_layout", "()Landroid/widget/LinearLayout;", "set_text_layout", "(Landroid/widget/LinearLayout;)V", "_text_layout", "g", "get_name", "set_name", "_name", "Lv/VImage;", "h", "Lv/VImage;", "get_avatar_icon", "()Lv/VImage;", "set_avatar_icon", "(Lv/VImage;)V", "_avatar_icon", RXScreenCaptureService.KEY_INDEX, "get_age", "set_age", "_age", "j", "get_say_hi", "set_say_hi", "_say_hi", "Lv/VLinear;", "k", "Lv/VLinear;", "get_image_layout", "()Lv/VLinear;", "set_image_layout", "(Lv/VLinear;)V", "_image_layout", BLiveStormDanmakuGiftResourceType.f44444l, "get_image_layout_image1", "set_image_layout_image1", "_image_layout_image1", "m", "get_image_layout_image2", "set_image_layout_image2", "_image_layout_image2", "n", "get_image_layout_image3", "set_image_layout_image3", "_image_layout_image3", "Lcom/tantan/library/svga/SVGAnimationView;", "o", "Lcom/tantan/library/svga/SVGAnimationView;", "get_svga_view", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_view", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_view", "get_close", "set_close", "_close", "get_tag_layout", "set_tag_layout", "_tag_layout", "get_iv_hi", "set_iv_hi", "_iv_hi", "get_gotochat", "set_gotochat", "_gotochat", "get_svga_view_bg", "set_svga_view_bg", "_svga_view_bg", "I", "getMessageRequestCode", "()I", "MessageRequestCode", ResourceDirection.f38808v, "Ljava/lang/String;", "userId", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "animator", "Ll/c4g0;", BaseSei.f13930X, "Ll/c4g0;", "animatorTextTimerSub", BaseSei.f13931Y, "Z", "getNeedAccept", "()Z", "setNeedAccept", "needAccept", "getSignContent", "setSignContent", "(Ljava/lang/String;)V", "signContent", "A", "getShowTime", "()J", "setShowTime", "(J)V", "showTime", "Lcom/p1/mobile/putong/newui/main/base/TabName;", "getRenderTab", "()Lcom/p1/mobile/putong/newui/main/base/TabName;", "setRenderTab", "(Lcom/p1/mobile/putong/newui/main/base/TabName;)V", "renderTab", "tagUpdateSub", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ImpressSignalConversationHeadView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public long showTime;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public TabName renderTab;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public c4g0 tagUpdateSub;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VFrame _main_container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VFrame _avatar_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _profile_user;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _green;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LinearLayout _text_layout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _avatar_icon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _age;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _say_hi;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VLinear _image_layout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VDraweeView _image_layout_image1;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VDraweeView _image_layout_image2;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VDraweeView _image_layout_image3;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public SVGAnimationView _svga_view;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VLinear _tag_layout;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VImage _iv_hi;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText _gotochat;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public SVGAnimationView _svga_view_bg;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final int MessageRequestCode;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public String userId;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public Animator animator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public c4g0 animatorTextTimerSub;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean needAccept;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public String signContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImpressSignalConversationHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.MessageRequestCode = CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA;
        this.needAccept = true;
        this.renderTab = TabName.Msg;
    }

    /* JADX INFO: renamed from: A */
    public static final void m41924A(ImpressSignalConversationHeadView impressSignalConversationHeadView, boolean z) {
        if (z) {
            impressSignalConversationHeadView.m41957t();
        } else {
            impressSignalConversationHeadView.m41956s();
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m41925H(ImpressSignalConversationHeadView impressSignalConversationHeadView, Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (!NullChecker.m81303a(coreData) || !NullChecker.m81303a(coreData.heartbeatMatch) || !coreData.heartbeatMatch.matched) {
            osi0.m165783g("对方信号波动，暂时无法接收");
            return;
        }
        Context context = impressSignalConversationHeadView.getContext();
        context.getClass();
        ((Act) context).duringCreated(CoreModule.f17545c.f19642f0.m32902ap(impressSignalConversationHeadView.userId));
    }

    /* JADX INFO: renamed from: I */
    public static final void m41926I(Throwable th) {
        osi0.m165783g("网络异常！");
    }

    /* JADX INFO: renamed from: a */
    public static void m41927a(ImpressSignalConversationHeadView impressSignalConversationHeadView, User user, String str) {
        if (!TextUtils.isEmpty(str)) {
            impressSignalConversationHeadView.get_say_hi().setText(str);
        }
        impressSignalConversationHeadView.signContent = str;
        zvf0.m220368A("e_love_signal_notice", impressSignalConversationHeadView.getRenderPageId(), new j760("love_sign_content", TextUtils.isEmpty(impressSignalConversationHeadView.signContent) ? "" : impressSignalConversationHeadView.signContent), new j760("receiver_user_id", user.f56011id), new j760("love_sign_click_area", 0), new j760("remainingtimes", Integer.valueOf(C8609a.m50246b0())), new j760("signal_resource", Integer.valueOf(snm.m185086Q())), new j760("accept_duration", String.valueOf(mqi0.m155944o() - impressSignalConversationHeadView.showTime)), new j760("is_show", CoreModule.f17545c.f19571H1.m201043B3()));
    }

    /* JADX INFO: renamed from: b */
    public static void m41928b(Throwable th) {
        osi0.m165783g("网络异常！");
    }

    /* JADX INFO: renamed from: c */
    public static void m41929c(final ImpressSignalConversationHeadView impressSignalConversationHeadView, final boolean z, final String str, Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m81303a(coreData) && NullChecker.m81303a(coreData.heartbeatMatch) && coreData.heartbeatMatch.matched) {
            Context context = impressSignalConversationHeadView.getContext();
            context.getClass();
            ((Act) context).duringCreated(CoreModule.f17545c.f19642f0.m32902ap(impressSignalConversationHeadView.userId)).subscribe(mkd0.m154956H(new e30() { // from class: l.omm
                @Override // p149l.e30
                public final void call(Object obj) {
                    ImpressSignalConversationHeadView.m41943x(z, impressSignalConversationHeadView, str, (roj0) obj);
                }
            }, new e30() { // from class: l.bmm
                @Override // p149l.e30
                public final void call(Object obj) {
                    ImpressSignalConversationHeadView.m41944y((Throwable) obj);
                }
            }));
        } else {
            impressSignalConversationHeadView.m41952K();
            snm.m185078I(impressSignalConversationHeadView.renderTab);
            osi0.m165783g("对方信号波动，暂时无法接收");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m41930d(final ImpressSignalConversationHeadView impressSignalConversationHeadView, View view) {
        if (TextUtils.isEmpty(impressSignalConversationHeadView.userId)) {
            return;
        }
        zvf0.m220399u("e_love_signal_notice", impressSignalConversationHeadView.getRenderPageId(), new j760("love_sign_content", TextUtils.isEmpty(impressSignalConversationHeadView.signContent) ? "" : impressSignalConversationHeadView.signContent), new j760("receiver_user_id", impressSignalConversationHeadView.userId), new j760("love_sign_click_area", 3), new j760("remainingtimes", Integer.valueOf(C8609a.m50246b0())), new j760("signal_resource", Integer.valueOf(snm.m185086Q())), new j760("accept_duration", String.valueOf(mqi0.m155944o() - impressSignalConversationHeadView.showTime)));
        TabName tabName = impressSignalConversationHeadView.renderTab;
        if (tabName == TabName.Me || tabName == TabName.Moment) {
            m41942v(impressSignalConversationHeadView, false, null, false, 6, null);
            return;
        }
        Context context = impressSignalConversationHeadView.getContext();
        context.getClass();
        if (snm.m185074E((Act) context)) {
            impressSignalConversationHeadView.m41955r(false, new e30() { // from class: l.kmm
                @Override // p149l.e30
                public final void call(Object obj) {
                    ImpressSignalConversationHeadView.m41924A(this.f123811a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m41931e(ImpressSignalConversationHeadView impressSignalConversationHeadView, View view) {
        zvf0.m220399u("e_love_signal_notice", impressSignalConversationHeadView.getRenderPageId(), new j760("love_sign_content", TextUtils.isEmpty(impressSignalConversationHeadView.signContent) ? "" : impressSignalConversationHeadView.signContent), new j760("receiver_user_id", impressSignalConversationHeadView.userId), new j760("love_sign_click_area", 1), new j760("signal_resource", Integer.valueOf(snm.m185086Q())), new j760("remainingtimes", Integer.valueOf(C8609a.m50246b0())), new j760("accept_duration", String.valueOf(mqi0.m155944o() - impressSignalConversationHeadView.showTime)));
        impressSignalConversationHeadView.getContext().startActivity(ProfileAct.m50736n2(impressSignalConversationHeadView.getContext(), impressSignalConversationHeadView.userId, "impress_signal", false));
    }

    /* JADX INFO: renamed from: f */
    public static void m41932f(ImpressSignalConversationHeadView impressSignalConversationHeadView, View view) {
        if (TextUtils.isEmpty(impressSignalConversationHeadView.userId)) {
            return;
        }
        zvf0.m220399u("e_love_signal_notice", impressSignalConversationHeadView.getRenderPageId(), new j760("love_sign_content", TextUtils.isEmpty(impressSignalConversationHeadView.signContent) ? "" : impressSignalConversationHeadView.signContent), new j760("receiver_user_id", impressSignalConversationHeadView.userId), new j760("love_sign_click_area", 2), new j760("signal_resource", Integer.valueOf(snm.m185086Q())), new j760("remainingtimes", Integer.valueOf(C8609a.m50246b0())), new j760("accept_duration", String.valueOf(mqi0.m155944o() - impressSignalConversationHeadView.showTime)));
        m41942v(impressSignalConversationHeadView, false, null, false, 6, null);
    }

    /* JADX INFO: renamed from: g */
    public static void m41933g(ImpressSignalConversationHeadView impressSignalConversationHeadView, String str, boolean z, boolean z2) {
        if (z2) {
            impressSignalConversationHeadView.m41959w(str, z);
        } else {
            impressSignalConversationHeadView.m41956s();
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m41936j(ImpressSignalConversationHeadView impressSignalConversationHeadView, int i, int i2, Intent intent) {
        if (i != impressSignalConversationHeadView.MessageRequestCode || impressSignalConversationHeadView.renderTab != TabName.Msg) {
            return false;
        }
        if (i2 == 100) {
            m41942v(impressSignalConversationHeadView, true, intent.getStringExtra("input"), false, 4, null);
            return true;
        }
        impressSignalConversationHeadView.m41958u(true, null, false);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m41938l(ImpressSignalConversationHeadView impressSignalConversationHeadView, View view) {
        impressSignalConversationHeadView.m41956s();
    }

    /* JADX INFO: renamed from: n */
    public static void m41940n(long j, TabName tabName, final ImpressSignalConversationHeadView impressSignalConversationHeadView, Long l2) {
        if ((mqi0.m155944o() - j) / 1000 >= snm.m185082M(tabName)) {
            impressSignalConversationHeadView.m41952K();
            if (NullChecker.m81303a(snm.m185084O()) && NullChecker.m81303a(snm.m185084O().pushMessage)) {
                if (TextUtils.isEmpty(impressSignalConversationHeadView.userId)) {
                    return;
                }
                Context context = impressSignalConversationHeadView.getContext();
                context.getClass();
                if (!snm.m185074E((Act) context)) {
                    return;
                }
                if (NullChecker.m81303a(snm.m185084O().pushMessage) && (impressSignalConversationHeadView.getContext() instanceof Act)) {
                    Context context2 = impressSignalConversationHeadView.getContext();
                    context2.getClass();
                    w29 w29Var = CoreModule.f17545c.f19571H1;
                    PushMessageCustom pushMessageCustom = snm.m185084O().pushMessage;
                    pushMessageCustom.getClass();
                    ((Act) context2).duringCreated(w29Var.m201076v3(pushMessageCustom.tracker).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.emm
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            ImpressSignalConversationHeadView.m41925H(this.f92227a, (Envelope) obj);
                        }
                    }, new e30() { // from class: l.fmm
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            ImpressSignalConversationHeadView.m41926I((Throwable) obj);
                        }
                    }));
                }
            }
            snm.m185078I(impressSignalConversationHeadView.renderTab);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m41942v(ImpressSignalConversationHeadView impressSignalConversationHeadView, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        impressSignalConversationHeadView.m41958u(z, str, z2);
    }

    /* JADX INFO: renamed from: x */
    public static final void m41943x(boolean z, ImpressSignalConversationHeadView impressSignalConversationHeadView, String str, roj0 roj0Var) {
        if (z) {
            impressSignalConversationHeadView.getContext().startActivity(MessagesAct.m48949p2(impressSignalConversationHeadView.getContext(), impressSignalConversationHeadView.userId, false, false, false, false, null, 8, str));
        }
        impressSignalConversationHeadView.m41952K();
        snm.m185078I(impressSignalConversationHeadView.renderTab);
    }

    /* JADX INFO: renamed from: y */
    public static final void m41944y(Throwable th) {
    }

    /* JADX INFO: renamed from: B */
    public final void m41945B() {
        get_title().getPaint().setFakeBoldText(true);
        get_title().setText("心动信号");
    }

    /* JADX INFO: renamed from: C */
    public final void m41946C(boolean isHeartShow) {
        if (isHeartShow) {
            CoreModule.f17545c.f19571H1.m201069b4(true);
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/4c5c00eb-a044-40e7-9e1a-35c5dbbf610411.svga").repeatCount(1).into(get_svga_view());
        get_svga_view().startAnimation();
        bt0.m103739l(get_avatar_layout(), bt0.f77162i, 100L, 600L, new AccelerateDecelerateInterpolator(), 1.0f, 0.96f, 1.0f).start();
    }

    /* JADX INFO: renamed from: D */
    public final void m41947D() {
        xaj0<String, PushMessageCustom, Long> xaj0VarM221515e = CoreModule.f17545c.f19642f0.f19940h0.m221515e();
        if (xaj0VarM221515e != null) {
            if (NullChecker.m81303a(xaj0VarM221515e.f191752b) && TextUtils.isEmpty(xaj0VarM221515e.f191752b.userId)) {
                return;
            }
            PushMessageCustom pushMessageCustom = xaj0VarM221515e.f191752b;
            pushMessageCustom.getClass();
            Long l2 = xaj0VarM221515e.f191753c;
            l2.getClass();
            m41948E(pushMessageCustom, l2.longValue(), TabName.Msg);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m41948E(@NotNull PushMessageCustom pushMessage, long startTime, @NotNull TabName tabName) {
        pushMessage.getClass();
        tabName.getClass();
        m41945B();
        this.showTime = mqi0.m155944o();
        this.renderTab = tabName;
        if (NullChecker.m81303a(pushMessage)) {
            boolean z = pushMessage.popupsDisplay;
        }
        m41946C(false);
        String str = pushMessage.userId;
        this.userId = str;
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        xdl0.m208335H0(get_gotochat(), userM169430Pa.isFemale() ? getContext().getString(R$string.f17633C6) : getContext().getString(R$string.f17663D6));
        qib0.f154691G.m102327J0(get_profile_user(), zub.m220207f(userM169430Pa.picture(0)), false);
        xdl0.m208335H0(get_name(), userM169430Pa.name);
        get_green().setTypeface(Typeface.DEFAULT_BOLD);
        if (jjb0.m141784b()) {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            qib0.f154713b0.f139231b.showUserVerificationLogo(getContext(), userM169430Pa, get_avatar_icon());
        } else if (userM169430Pa.isIdAndPicBothVerified()) {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189805Up, 0);
        } else if (userM169430Pa.isPicVerificationVerified()) {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189654Pt, 0);
        } else {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        snm.m185101c0(userM169430Pa, get_age());
        m41949F(userM169430Pa);
        m41950G(startTime, tabName);
    }

    /* JADX INFO: renamed from: F */
    public final void m41949F(@NotNull final User user) {
        user.getClass();
        if (!snm.m185105e0(user)) {
            xdl0.m208344M(get_image_layout(), false);
            xdl0.m208344M(get_say_hi(), true);
            Context context = getContext();
            context.getClass();
            snm.m185097a0(user, (Act) context, false, new e30() { // from class: l.cmm
                @Override // p149l.e30
                public final void call(Object obj) {
                    ImpressSignalConversationHeadView.m41927a(this.f81585a, user, (String) obj);
                }
            });
            return;
        }
        xdl0.m208344M(get_image_layout(), true);
        xdl0.m208344M(get_say_hi(), false);
        if (user.pictures.size() <= 1 || !NullChecker.m81303a(user.picture(1))) {
            xdl0.m208344M(get_image_layout_image1(), false);
        } else {
            qib0.f154691G.m102341Q0(get_image_layout_image1(), user.picture(1).profile128());
            xdl0.m208344M(get_image_layout_image1(), true);
        }
        if (user.pictures.size() <= 2 || !NullChecker.m81303a(user.picture(2))) {
            xdl0.m208344M(get_image_layout_image2(), false);
        } else {
            qib0.f154691G.m102341Q0(get_image_layout_image2(), user.picture(2).profile128());
            xdl0.m208344M(get_image_layout_image2(), true);
        }
        if (user.pictures.size() <= 3 || !NullChecker.m81303a(user.picture(3))) {
            xdl0.m208344M(get_image_layout_image3(), false);
        } else {
            qib0.f154691G.m102341Q0(get_image_layout_image3(), user.picture(3).profile128());
            xdl0.m208344M(get_image_layout_image3(), true);
        }
        this.signContent = CreditScoreTaskType.pic;
        zvf0.m220368A("e_love_signal_notice", getRenderPageId(), new j760("love_sign_content", this.signContent), new j760("receiver_user_id", user.f56011id), new j760("remainingtimes", Integer.valueOf(C8609a.m50246b0())), new j760("signal_resource", Integer.valueOf(snm.m185086Q())), new j760("love_sign_click_area", 0), new j760("is_show", CoreModule.f17545c.f19571H1.m201043B3()));
    }

    /* JADX INFO: renamed from: G */
    public final void m41950G(final long broadcastTimer, @NotNull final TabName tabName) {
        tabName.getClass();
        snm.m185095Z(false);
        yij0.m214943U(this.animatorTextTimerSub);
        this.animatorTextTimerSub = C22306c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.dmm
            @Override // p149l.e30
            public final void call(Object obj) {
                ImpressSignalConversationHeadView.m41940n(broadcastTimer, tabName, this, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public final void m41951J() {
        Animator animator;
        Animator animator2 = this.animator;
        if (animator2 != null) {
            animator2.getClass();
            if (animator2.isRunning() && (animator = this.animator) != null) {
                animator.cancel();
            }
        }
        setVisibility(0);
        setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: K */
    public final void m41952K() {
        yij0.m214943U(this.animatorTextTimerSub);
    }

    public final int getMessageRequestCode() {
        return this.MessageRequestCode;
    }

    public final boolean getNeedAccept() {
        return this.needAccept;
    }

    @NotNull
    public final String getRenderPageId() {
        TabName tabName = this.renderTab;
        if (tabName == TabName.Me) {
            return OMSDialogPositon.p_navigation_view;
        }
        return tabName == TabName.Moment ? OMSDialogPositon.p_nearby : OMSDialogPositon.p_messages_view;
    }

    @NotNull
    public final TabName getRenderTab() {
        return this.renderTab;
    }

    public final long getShowTime() {
        return this.showTime;
    }

    @Nullable
    public final String getSignContent() {
        return this.signContent;
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
    public final VImage get_avatar_icon() {
        VImage vImage = this._avatar_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_avatar_icon");
        return null;
    }

    @NotNull
    public final VFrame get_avatar_layout() {
        VFrame vFrame = this._avatar_layout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_avatar_layout");
        return null;
    }

    @NotNull
    public final VImage get_close() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    public final VText get_gotochat() {
        VText vText = this._gotochat;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_gotochat");
        return null;
    }

    @NotNull
    public final VText get_green() {
        VText vText = this._green;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_green");
        return null;
    }

    @NotNull
    public final VLinear get_image_layout() {
        VLinear vLinear = this._image_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_image_layout");
        return null;
    }

    @NotNull
    public final VDraweeView get_image_layout_image1() {
        VDraweeView vDraweeView = this._image_layout_image1;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_image_layout_image1");
        return null;
    }

    @NotNull
    public final VDraweeView get_image_layout_image2() {
        VDraweeView vDraweeView = this._image_layout_image2;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_image_layout_image2");
        return null;
    }

    @NotNull
    public final VDraweeView get_image_layout_image3() {
        VDraweeView vDraweeView = this._image_layout_image3;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_image_layout_image3");
        return null;
    }

    @NotNull
    public final VImage get_iv_hi() {
        VImage vImage = this._iv_hi;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_iv_hi");
        return null;
    }

    @NotNull
    public final VFrame get_main_container() {
        VFrame vFrame = this._main_container;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_main_container");
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
    public final VDraweeView get_profile_user() {
        VDraweeView vDraweeView = this._profile_user;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_profile_user");
        return null;
    }

    @NotNull
    public final VText get_say_hi() {
        VText vText = this._say_hi;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_say_hi");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_view() {
        SVGAnimationView sVGAnimationView = this._svga_view;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_view");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_view_bg() {
        SVGAnimationView sVGAnimationView = this._svga_view_bg;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_view_bg");
        return null;
    }

    @NotNull
    public final VLinear get_tag_layout() {
        VLinear vLinear = this._tag_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_tag_layout");
        return null;
    }

    @NotNull
    public final LinearLayout get_text_layout() {
        LinearLayout linearLayout = this._text_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_text_layout");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m41952K();
        yij0.m214943U(this.tagUpdateSub);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m41954q(layoutInflaterM163037a, this);
        m41953p(this);
        m41960z();
        get_name().getPaint().setFakeBoldText(true);
        get_title().getPaint().setFakeBoldText(true);
        get_age().getPaint().setFakeBoldText(true);
        get_gotochat().getPaint().setFakeBoldText(true);
    }

    /* JADX INFO: renamed from: p */
    public final void m41953p(View view) {
        pmm.m170341a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final View m41954q(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM170342b = pmm.m170342b(this, inflater, parent);
        viewM170342b.getClass();
        return viewM170342b;
    }

    /* JADX INFO: renamed from: r */
    public final void m41955r(boolean ignoreCoinGuide, e30<Boolean> successCall) {
        successCall.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s */
    public final void m41956s() {
        if (!TextUtils.isEmpty(this.userId)) {
            zvf0.m220399u("e_love_signal_notice", getRenderPageId(), new j760("love_sign_content", TextUtils.isEmpty(this.signContent) ? "" : this.signContent), new j760("receiver_user_id", this.userId), new j760("love_sign_click_area", 4), new j760("signal_resource", Integer.valueOf(snm.m185086Q())), new j760("remainingtimes", Integer.valueOf(C8609a.m50246b0())), new j760("accept_duration", String.valueOf(mqi0.m155944o() - this.showTime)));
        }
        if (NullChecker.m81303a(snm.m185084O())) {
            upa.m194663L1();
            w29 w29Var = CoreModule.f17545c.f19571H1;
            PushMessageCustom pushMessageCustom = snm.m185084O().pushMessage;
            pushMessageCustom.getClass();
            w29Var.m201066Y3(pushMessageCustom.tracker);
        }
        m41952K();
        snm.m185078I(this.renderTab);
    }

    public final void setNeedAccept(boolean z) {
        this.needAccept = z;
    }

    public final void setRenderTab(@NotNull TabName tabName) {
        tabName.getClass();
        this.renderTab = tabName;
    }

    public final void setShowTime(long j) {
        this.showTime = j;
    }

    public final void setSignContent(@Nullable String str) {
        this.signContent = str;
    }

    public final void set_age(@NotNull VText vText) {
        vText.getClass();
        this._age = vText;
    }

    public final void set_avatar_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._avatar_icon = vImage;
    }

    public final void set_avatar_layout(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._avatar_layout = vFrame;
    }

    public final void set_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._close = vImage;
    }

    public final void set_gotochat(@NotNull VText vText) {
        vText.getClass();
        this._gotochat = vText;
    }

    public final void set_green(@NotNull VText vText) {
        vText.getClass();
        this._green = vText;
    }

    public final void set_image_layout(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._image_layout = vLinear;
    }

    public final void set_image_layout_image1(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image_layout_image1 = vDraweeView;
    }

    public final void set_image_layout_image2(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image_layout_image2 = vDraweeView;
    }

    public final void set_image_layout_image3(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image_layout_image3 = vDraweeView;
    }

    public final void set_iv_hi(@NotNull VImage vImage) {
        vImage.getClass();
        this._iv_hi = vImage;
    }

    public final void set_main_container(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._main_container = vFrame;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_profile_user(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._profile_user = vDraweeView;
    }

    public final void set_say_hi(@NotNull VText vText) {
        vText.getClass();
        this._say_hi = vText;
    }

    public final void set_svga_view(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._svga_view = sVGAnimationView;
    }

    public final void set_svga_view_bg(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._svga_view_bg = sVGAnimationView;
    }

    public final void set_tag_layout(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._tag_layout = vLinear;
    }

    public final void set_text_layout(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._text_layout = linearLayout;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX INFO: renamed from: t */
    public final void m41957t() {
        Context context = getContext();
        context.getClass();
        if (snm.m185074E((Act) context)) {
            Context context2 = getContext();
            context2.getClass();
            Act act = (Act) context2;
            act.startActivityForResult(MessageHalfPageComposerAct.m48886l2(act, this.userId, MessageHalfPageComposerAct.f31605p), this.MessageRequestCode);
            int i = rzb0.f161633e;
            act.overridePendingTransition(i, i);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m41958u(boolean ignoreCoinGuide, final String input, final boolean gotoChat) {
        if (TextUtils.isEmpty(this.userId)) {
            return;
        }
        Context context = getContext();
        context.getClass();
        if (snm.m185074E((Act) context) && NullChecker.m81303a(snm.m185084O()) && NullChecker.m81303a(snm.m185084O().pushMessage)) {
            m41955r(ignoreCoinGuide, new e30() { // from class: l.lmm
                @Override // p149l.e30
                public final void call(Object obj) {
                    ImpressSignalConversationHeadView.m41933g(this.f128806a, input, gotoChat, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m41959w(final String input, final boolean gotoChat) {
        Context context = getContext();
        context.getClass();
        if (snm.m185074E((Act) context) && (getContext() instanceof Act)) {
            upa.m194663L1();
            Context context2 = getContext();
            context2.getClass();
            w29 w29Var = CoreModule.f17545c.f19571H1;
            PushMessageCustom pushMessageCustom = snm.m185084O().pushMessage;
            pushMessageCustom.getClass();
            ((Act) context2).duringCreated(w29Var.m201076v3(pushMessageCustom.tracker).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.mmm
                @Override // p149l.e30
                public final void call(Object obj) {
                    ImpressSignalConversationHeadView.m41929c(this.f134678a, gotoChat, input, (Envelope) obj);
                }
            }, new e30() { // from class: l.nmm
                @Override // p149l.e30
                public final void call(Object obj) {
                    ImpressSignalConversationHeadView.m41928b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m41960z() {
        if (getContext() instanceof Act) {
            Context context = getContext();
            context.getClass();
            ((Act) context).registerOnActivityResultListener(new C4317a.a() { // from class: l.amm
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i, int i2, Intent intent) {
                    return ImpressSignalConversationHeadView.m41936j(this.f70631a, i, i2, intent);
                }
            });
        }
        xdl0.m208329E0(get_profile_user(), new View.OnClickListener() { // from class: l.gmm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImpressSignalConversationHeadView.m41931e(this.f103491a, view);
            }
        });
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.hmm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImpressSignalConversationHeadView.m41932f(this.f108445a, view);
            }
        });
        xdl0.m208329E0(get_gotochat(), new View.OnClickListener() { // from class: l.imm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImpressSignalConversationHeadView.m41930d(this.f113944a, view);
            }
        });
        xdl0.m208329E0(get_close(), new View.OnClickListener() { // from class: l.jmm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImpressSignalConversationHeadView.m41938l(this.f118691a, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImpressSignalConversationHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImpressSignalConversationHeadView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ImpressSignalConversationHeadView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
