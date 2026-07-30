package com.p051p1.mobile.putong.core.newui.messages.anim.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4907v;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConvCellList;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8774c;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ConversationCounter;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VImage;
import p151v.VText;
import p153l.afj0;
import p153l.bkj0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.c4s;
import p153l.dsc0;
import p153l.fo0;
import p153l.gra;
import p153l.gs50;
import p153l.jyb;
import p153l.kcg0;
import p153l.mge;
import p153l.nbr;
import p153l.p7f;
import p153l.p9r;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.rcj;
import p153l.scj;
import p153l.txq;
import p153l.upm;
import p153l.v2c0;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002Æ\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u0019\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010#J1\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J+\u00101\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010.\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u0010\fJ\u000f\u00104\u001a\u00020\u000fH\u0002¢\u0006\u0004\b4\u00105J\u001f\u0010;\u001a\u00020:2\u0006\u00107\u001a\u0002062\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u00105J\u0015\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020!¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0006H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0006H\u0016¢\u0006\u0004\bI\u0010DJ\u001f\u0010K\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020!H\u0016¢\u0006\u0004\bM\u0010@J\u000f\u0010N\u001a\u00020\u000fH\u0016¢\u0006\u0004\bN\u00105J\u000f\u0010O\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010\fR\"\u0010V\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\"\u0010]\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010Q\u001a\u0004\b[\u0010S\"\u0004\b\\\u0010UR\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010\u0089\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010DR\u001e\u0010\u008c\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a\u0005\b\u008b\u0001\u0010DR\u001e\u0010\u008f\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u0087\u0001\u001a\u0005\b\u008e\u0001\u0010DR\u0017\u0010\u0091\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0087\u0001R\u001a\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010\u0017R\u0017\u0010\u0099\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0087\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0087\u0001R\u0017\u0010\u009d\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0087\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0087\u0001R\u0019\u0010¡\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0087\u0001R\u0019\u0010£\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u0087\u0001R,\u0010«\u0001\u001a\u0005\u0018\u00010¤\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R)\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0005\b°\u0001\u0010HR\u001a\u0010´\u0001\u001a\u00030±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001a\u0010¶\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0094\u0001R,\u0010¾\u0001\u001a\u0005\u0018\u00010·\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\u001c\u0010Â\u0001\u001a\u0005\u0018\u00010¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001c\u0010Ä\u0001\u001a\u0005\u0018\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010¹\u0001R\u0018\u0010Å\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0017¨\u0006Ç\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Q", "()V", "", Constants.KEY_KEY, "", BloodType.f39576O, "(Ljava/lang/String;)Z", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "onlineMatchPushUser", "b0", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;)V", "c0", "Z", "d0", "R", "", "speedDuration", "setNormalState", "(J)V", "X", "a0", "height", "", "h0", "(I)F", "g0", "startValue", "endValue", "Ll/x20;", "endAction", "setDuration", p7f.GPS_DIRECTION_TRUE, "(IILl/x20;J)V", "Y", "(Ljava/lang/String;)V", "isMatch", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;", "user", "e0", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;ZLcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;)V", "N", "P", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "M", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "headViewHeight", p7f.LATITUDE_SOUTH, "(F)Z", "c", "(I)V", "j", "()I", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "b", "e", "h", "Lcom/tantan/library/svga/SVGAnimationView;", "Lcom/tantan/library/svga/SVGAnimationView;", "get_svga_id", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_id", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_id", RXScreenCaptureService.KEY_INDEX, "get_svga_love", "set_svga_love", "_svga_love", "get_svga_loading", "set_svga_loading", "_svga_loading", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;", "k", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;", "get_bg_border", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;", "set_bg_border", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;)V", "_bg_border", "Lv/VImage;", BLiveStormDanmakuGiftResourceType.f45292l, "Lv/VImage;", "get_love", "()Lv/VImage;", "set_love", "(Lv/VImage;)V", "_love", "Lv/VText;", "m", "Lv/VText;", "get_text", "()Lv/VText;", "set_text", "(Lv/VText;)V", "_text", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;", "n", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;", "get_getuser_layout", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;", "set_getuser_layout", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;)V", "_getuser_layout", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;", "o", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;", "get_impress_signal_layout", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;", "set_impress_signal_layout", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;)V", "_impress_signal_layout", "p", "I", "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", "q", "getLOADING_VIEW_HEIGHT", "LOADING_VIEW_HEIGHT", "r", "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", BLiveStormDanmakuGiftResourceType.f45294s, "maxViewHeightAllowSearch", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$HeaderState;", Constants.KEY_T, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$HeaderState;", "headerState", "u", "isBottomPlayedVibrateAnim", ResourceDirection.f39656v, "loveAnimStart", "w", "textShowStart", BaseSei.f14624X, "searchShowUser", BaseSei.f14625Y, "searchHeight", BaseSei.f14626Z, "suggestConHeight", "A", "impressConHeight", "Landroid/animation/ObjectAnimator;", "B", "Landroid/animation/ObjectAnimator;", "getAnimatorPullLove", "()Landroid/animation/ObjectAnimator;", "setAnimatorPullLove", "(Landroid/animation/ObjectAnimator;)V", "animatorPullLove", c4s.C_ZONE, "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "getConversationsList", "()Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "setConversationsList", "Ll/afj0;", "D", "Ll/afj0;", "trackForQuickChat5", "E", "scrollState", "Ll/kcg0;", "F", "Ll/kcg0;", "getSub", "()Ll/kcg0;", "setSub", "(Ll/kcg0;)V", AuthenticationTokenClaims.JSON_KEY_SUB, "Landroid/animation/ValueAnimator;", "G", "Landroid/animation/ValueAnimator;", "scrollAnim", "H", "subTipsAnim", "shouldShowTips", "HeaderState", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class QuickChatHeaderView extends QuickChatHeaderBaseView {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public int impressConHeight;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public ObjectAnimator animatorPullLove;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public ConversationsList conversationsList;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public afj0 trackForQuickChat5;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public HeaderState scrollState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public kcg0 sub;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator scrollAnim;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public kcg0 subTipsAnim;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public boolean shouldShowTips;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public SVGAnimationView _svga_id;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public SVGAnimationView _svga_love;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public SVGAnimationView _svga_loading;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public QuickChatBgTopView _bg_border;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VImage _love;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _text;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public QuickChatHeaderUserView _getuser_layout;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public ImpressSignalConversationHeadView _impress_signal_layout;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int DEFALUE_NORMAL_HEIGH;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final int LOADING_VIEW_HEIGHT;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final int MAX_PULL_VIEW_HEIGH;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final int maxViewHeightAllowSearch;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public HeaderState headerState;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean isBottomPlayedVibrateAnim;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final int loveAnimStart;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final int textShowStart;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final int searchShowUser;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public int searchHeight;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int suggestConHeight;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$HeaderState;", "", "<init>", "(Ljava/lang/String;I)V", "NormalState", "SearchState", "GetUserState", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum HeaderState {
        NormalState,
        SearchState,
        GetUserState;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<HeaderState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8314a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26368a;

        static {
            int[] iArr = new int[HeaderState.values().length];
            try {
                iArr[HeaderState.GetUserState.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HeaderState.NormalState.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HeaderState.SearchState.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26368a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8315b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f26369a;

        public C8315b(x20 x20Var) {
            this.f26369a = x20Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f26369a.call();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8316c extends AnimatorListenerAdapter {
        public C8316c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            ViewGroup.LayoutParams layoutParams = QuickChatHeaderView.this.get_love().getLayoutParams();
            layoutParams.getClass();
            ((RelativeLayout.LayoutParams) layoutParams).removeRule(12);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            ViewGroup.LayoutParams layoutParams = QuickChatHeaderView.this.get_love().getLayoutParams();
            layoutParams.getClass();
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView$d */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$d", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8317d extends AnimListener {
        public C8317d() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            bnl0.m105524M(QuickChatHeaderView.this.get_svga_love(), false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.DEFALUE_NORMAL_HEIGH = txq.m193530c(4);
        this.LOADING_VIEW_HEIGHT = txq.m193530c(24);
        this.MAX_PULL_VIEW_HEIGH = txq.m193530c(160);
        this.maxViewHeightAllowSearch = txq.m193530c(80);
        HeaderState headerState = HeaderState.NormalState;
        this.headerState = headerState;
        this.loveAnimStart = txq.m193530c(80);
        this.textShowStart = txq.m193530c(98);
        this.searchShowUser = txq.m193530c(80);
        this.searchHeight = txq.m193530c(102);
        this.suggestConHeight = txq.m193530c(178);
        this.impressConHeight = txq.m193530c(219);
        this.scrollState = headerState;
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m43141M(layoutInflaterM171370a, this);
        this.trackForQuickChat5 = new afj0();
        m43116R();
    }

    /* JADX INFO: renamed from: A */
    public static void m43102A(QuickChatHeaderView quickChatHeaderView) {
        quickChatHeaderView.isBottomPlayedVibrateAnim = false;
    }

    /* JADX INFO: renamed from: C */
    public static pf60 m43104C(Function1 function1, Object obj) {
        return (pf60) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static bkj0 m43105D(Counter counter, ConversationCounter conversationCounter, boolean z) {
        counter.getClass();
        conversationCounter.getClass();
        return new bkj0(counter, conversationCounter, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: E */
    public static bkj0 m43106E(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (bkj0) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: F */
    public static void m43107F(QuickChatHeaderView quickChatHeaderView) {
        HeaderState headerState = quickChatHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        bnl0.m105524M(quickChatHeaderView.get_getuser_layout(), false);
        bnl0.m105524M(quickChatHeaderView.get_svga_loading(), false);
        SVGAnimationView.stopAnimation$default(quickChatHeaderView.get_svga_loading(), false, 1, null);
        quickChatHeaderView.headerState = headerState2;
        quickChatHeaderView.m43142N();
    }

    /* JADX INFO: renamed from: G */
    public static void m43108G(QuickChatHeaderView quickChatHeaderView) {
        HeaderState headerState = quickChatHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        bnl0.m105524M(quickChatHeaderView.get_svga_loading(), false);
        SVGAnimationView.stopAnimation$default(quickChatHeaderView.get_svga_loading(), false, 1, null);
        bnl0.m105524M(quickChatHeaderView.get_getuser_layout(), false);
        quickChatHeaderView.headerState = headerState2;
        quickChatHeaderView.m43142N();
    }

    /* JADX INFO: renamed from: H */
    public static void m43109H(final QuickChatHeaderView quickChatHeaderView, Boolean bool) {
        ConversationsList conversationsList;
        ConvCellList convCellList;
        ConversationsList conversationsList2;
        ConversationsListHeadView conversationsListHeadView;
        ConvCellList convCellList2;
        if (!bool.booleanValue()) {
            quickChatHeaderView.setNormalState(500L);
            return;
        }
        ConversationsList conversationsList3 = quickChatHeaderView.conversationsList;
        if ((conversationsList3 != null && (convCellList2 = conversationsList3.f25847V) != null && convCellList2.getCount() == 0) || ((conversationsList = quickChatHeaderView.conversationsList) != null && (convCellList = conversationsList.f25847V) != null && convCellList.getFirstVisiblePosition() == 0 && (conversationsList2 = quickChatHeaderView.conversationsList) != null && (conversationsListHeadView = conversationsList2.f25827E0) != null && conversationsListHeadView.getTop() == 0)) {
            quickChatHeaderView.scrollState = HeaderState.SearchState;
            quickChatHeaderView.m43117T(quickChatHeaderView.getLayoutParams().height, quickChatHeaderView.getLOADING_VIEW_HEIGHT(), new x20() { // from class: l.h2c0
                @Override // p153l.x20
                public final void call() {
                    QuickChatHeaderView.setSearchState$lambda$0$0(this.f107534a);
                }
            }, 500L);
        } else {
            bnl0.m105524M(quickChatHeaderView.get_text(), false);
            bnl0.m105524M(quickChatHeaderView.get_love(), false);
            quickChatHeaderView.headerState = HeaderState.SearchState;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m43110I(QuickChatHeaderView quickChatHeaderView, OnlineMatchPushUser onlineMatchPushUser, Boolean bool) {
        m43120W(quickChatHeaderView, 0L, 1, null);
        if (bool.booleanValue()) {
            quickChatHeaderView.trackForQuickChat5.m97348f();
            return;
        }
        afj0.m97342i(quickChatHeaderView.trackForQuickChat5, false, null, null, 6, null);
        CoreModule.f18264c.f20300D0.m35839L4(onlineMatchPushUser);
        quickChatHeaderView.get_getuser_layout().setBroadcastTextTimerValue(-1L);
        quickChatHeaderView.trackForQuickChat5.m97353m();
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m43111J(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static pf60 m43112K(TabName tabName, C4470c c4470c) {
        return jyb.m147494Y(tabName, c4470c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public static void m43113L(QuickChatHeaderView quickChatHeaderView, bkj0 bkj0Var) {
        int iM117723b = dsc0.m117723b((Counter) bkj0Var.f77081a, (ConversationCounter) bkj0Var.f77082b, (Boolean) bkj0Var.f77083c);
        if (!OnlineMatchManager.m51326z().m51365n0() || iM117723b > OnlineMatchManager.m51326z().f33446b.get().intValue()) {
            quickChatHeaderView.shouldShowTips = false;
            quickChatHeaderView.get_bg_border().m43086b(quickChatHeaderView.shouldShowTips);
        } else {
            quickChatHeaderView.shouldShowTips = true;
            quickChatHeaderView.get_bg_border().m43086b(quickChatHeaderView.shouldShowTips);
            OnlineMatchManager.m51326z().m51362k0();
        }
        OnlineMatchManager.m51326z().f33446b.put(Integer.valueOf(iM117723b));
        bsj0.m106263U(quickChatHeaderView.subTipsAnim);
    }

    /* JADX INFO: renamed from: P */
    private final boolean m43114P() {
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList == null) {
            return false;
        }
        if (conversationsList.f25847V.getCount() != 0) {
            return conversationsList.f25847V.getFirstVisiblePosition() == 0 && conversationsList.f25827E0.getTop() == 0 && conversationsList.f25827E0.f25919m.getLayoutParams().height == getInitHeight();
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    private final void m43115Q() {
        Act act = getAct();
        C22507a<pf60<String, Object>> c22507a = OnlineMatchManager.m51326z().f33442I;
        Act act2 = getAct();
        act2.getClass();
        C22421c<TabName> c22421cM40829o7 = ((NewMainAct) act2).m40829o7();
        final Function2 function2 = new Function2() { // from class: l.u2c0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return QuickChatHeaderView.m43133s((pf60) obj, (TabName) obj2);
            }
        };
        C22421c c22421cDuringCreated = act.duringCreated(psd0.m173625r(c22507a, c22421cM40829o7, new rcj() { // from class: l.v1c0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return QuickChatHeaderView.m43134t(function2, obj, obj2);
            }
        }));
        final Function1 function1 = new Function1() { // from class: l.w1c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m43135u((pf60) obj);
            }
        };
        C22421c c22421cFilter = c22421cDuringCreated.filter(new qcj() { // from class: l.x1c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return QuickChatHeaderView.m43139y(function1, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.y1c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m43138x((pf60) obj);
            }
        };
        C22421c map = c22421cFilter.map(new qcj() { // from class: l.z1c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return QuickChatHeaderView.m43104C(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.a2c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m43130p((pf60) obj);
            }
        };
        map.filter(new qcj() { // from class: l.b2c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return QuickChatHeaderView.m43111J(function4, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.c2c0
            @Override // p153l.y20
            public final void call(Object obj) {
                QuickChatHeaderView.m43137w(this.f79466a, (pf60) obj);
            }
        }));
        Act act3 = getAct();
        Act act4 = getAct();
        act4.getClass();
        act3.duringCreated(psd0.m173625r(((NewMainAct) act4).m40829o7(), getAct().lifecycle(), new rcj() { // from class: l.d2c0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return QuickChatHeaderView.m43112K((TabName) obj, (C4470c) obj2);
            }
        }), false).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.u1c0
            @Override // p153l.y20
            public final void call(Object obj) {
                QuickChatHeaderView.m43129o(this.f176984a, (pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    private final void m43116R() {
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getLayoutParams().height = getDEFALUE_NORMAL_HEIGH();
        get_bg_border().m43085a(getDEFALUE_NORMAL_HEIGH());
        ViewGroup.LayoutParams layoutParams = get_svga_id().getLayoutParams();
        this.searchHeight = txq.m193530c(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256);
        layoutParams.height = txq.m193530c(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256);
        get_getuser_layout().setLayoutParams(new RelativeLayout.LayoutParams(-1, this.searchHeight));
        get_svga_id().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: T */
    private final void m43117T(int startValue, int endValue, x20 endAction, long setDuration) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.scrollAnim;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.scrollAnim) != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(startValue, endValue);
        this.scrollAnim = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(setDuration);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.f2c0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    QuickChatHeaderView.m43119V(this.f96866a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new C8315b(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m43118U(QuickChatHeaderView quickChatHeaderView, int i, int i2, x20 x20Var, long j, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            j = 300;
        }
        quickChatHeaderView.m43117T(i, i2, x20Var, j);
    }

    /* JADX INFO: renamed from: V */
    public static final void m43119V(QuickChatHeaderView quickChatHeaderView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        quickChatHeaderView.mo42995c(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m43120W(QuickChatHeaderView quickChatHeaderView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        quickChatHeaderView.setNormalState(j);
    }

    /* JADX INFO: renamed from: X */
    private final void m43121X() {
        if (this.headerState != HeaderState.SearchState) {
            setOnClickListener(null);
            bsj0.m106263U(this.sub);
            this.shouldShowTips = false;
            get_getuser_layout().m43100u0();
            C8774c.INSTANCE.m51485a().m51481i(0L);
            get_getuser_layout().setBroadcastTextTimerValue(-1L);
            OnlineMatchManager.m51326z().m51373u0(getAct(), new y20() { // from class: l.t2c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    QuickChatHeaderView.m43109H(this.f171734a, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m43122d0() {
        ObjectAnimator objectAnimator = this.animatorPullLove;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        get_svga_id().stopAnimation(false);
        SVGAnimationView.stopAnimation$default(get_svga_love(), false, 1, null);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m43123f0(QuickChatHeaderView quickChatHeaderView) {
        m43120W(quickChatHeaderView, 0L, 1, null);
    }

    /* JADX INFO: renamed from: h0 */
    private final float m43124h0(int height) {
        return (((((height - this.textShowStart) * 1.0f) / (getMAX_PULL_VIEW_HEIGH() - this.textShowStart)) * 70.0f) + 30.0f) / 100.0f;
    }

    /* JADX INFO: renamed from: k */
    public static Boolean m43125k(mge.C18609a c18609a) {
        return Boolean.valueOf(mge.m158199o().m158201k(BannerLoc.get("conversation")));
    }

    /* JADX INFO: renamed from: m */
    public static void m43127m(final QuickChatHeaderView quickChatHeaderView, OnlineMatchMatchUser onlineMatchMatchUser, OnlineMatchPushUser onlineMatchPushUser, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            afj0.m97341b(quickChatHeaderView.trackForQuickChat5, !TextUtils.isEmpty(str), false, null, null, 12, null);
            OnlineMatchManager.m51326z().m51369r0(quickChatHeaderView.getAct(), onlineMatchPushUser, new x20() { // from class: l.m2c0
                @Override // p153l.x20
                public final void call() {
                    QuickChatHeaderView.m43123f0(this.f134547a);
                }
            }, str);
        } else {
            m43120W(quickChatHeaderView, 0L, 1, null);
            quickChatHeaderView.trackForQuickChat5.m97347e(!TextUtils.isEmpty(str));
            quickChatHeaderView.getAct().startActivity(MessagesAct.m50132q2(quickChatHeaderView.getAct(), onlineMatchMatchUser != null ? onlineMatchMatchUser.userId : null, false, false, false, false, null, 7, str));
        }
    }

    /* JADX INFO: renamed from: n */
    public static Boolean m43128n(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static void m43129o(QuickChatHeaderView quickChatHeaderView, pf60 pf60Var) {
        if ((pf60Var != null ? (C4470c) pf60Var.f152157b : null) == C4470c.f16267i) {
            if ((pf60Var != null ? (TabName) pf60Var.f152156a : null) == TabName.Msg) {
                int i = C8314a.f26368a[quickChatHeaderView.headerState.ordinal()];
                if (i == 1) {
                    quickChatHeaderView.m43146Z();
                    quickChatHeaderView.m43148b0(C8774c.INSTANCE.m51485a().getPushUser());
                    if (quickChatHeaderView.get_getuser_layout().getBroadcastTextTimerValue() > 0) {
                        quickChatHeaderView.get_getuser_layout().m43099t0();
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    quickChatHeaderView.m43142N();
                    quickChatHeaderView.m43146Z();
                    return;
                } else if (i != 3) {
                    nbr.m162172a();
                    return;
                } else {
                    quickChatHeaderView.m43149c0();
                    quickChatHeaderView.m43146Z();
                    return;
                }
            }
        }
        bsj0.m106263U(quickChatHeaderView.sub);
        quickChatHeaderView.get_getuser_layout().m43100u0();
        quickChatHeaderView.m43122d0();
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m43130p(pf60 pf60Var) {
        pf60Var.getClass();
        return Boolean.valueOf((pf60Var == C4907v.f20866b0 || TextUtils.isEmpty(CoreModule.m30929H().userId())) ? false : true);
    }

    /* JADX INFO: renamed from: q */
    public static void m43131q(QuickChatHeaderView quickChatHeaderView, OnlineMatchPushUser onlineMatchPushUser, long j) {
        C8774c.Companion companion = C8774c.INSTANCE;
        if (companion.m51485a().m51480h()) {
            bsj0.m106263U(quickChatHeaderView.sub);
            m43120W(quickChatHeaderView, 0L, 1, null);
            boolean currentIsMatch = companion.m51485a().getCurrentIsMatch();
            afj0 afj0Var = quickChatHeaderView.trackForQuickChat5;
            if (currentIsMatch) {
                afj0Var.m97348f();
                return;
            }
            afj0Var.m97353m();
            quickChatHeaderView.get_getuser_layout().setBroadcastTextTimerValue(-1L);
            companion.m51485a().m51481i(0L);
            CoreModule.f18264c.f20300D0.m35839L4(onlineMatchPushUser);
        }
    }

    /* JADX INFO: renamed from: s */
    public static pf60 m43133s(pf60 pf60Var, TabName tabName) {
        return new pf60(pf60Var, tabName);
    }

    private final void setNormalState(long speedDuration) {
        ConversationsList conversationsList;
        ConvCellList convCellList;
        ConversationsList conversationsList2;
        ConversationsListHeadView conversationsListHeadView;
        ConvCellList convCellList2;
        HeaderState headerState = this.headerState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState == headerState2 && getLayoutParams().height == getDEFALUE_NORMAL_HEIGH() && getLayoutParams().height == 0) {
            return;
        }
        setOnClickListener(null);
        bsj0.m106263U(this.sub);
        get_getuser_layout().m43100u0();
        C8774c.INSTANCE.m51485a().m51481i(0L);
        get_getuser_layout().setBroadcastTextTimerValue(-1L);
        ConversationsList conversationsList3 = this.conversationsList;
        if ((conversationsList3 == null || (convCellList2 = conversationsList3.f25847V) == null || convCellList2.getCount() != 0) && ((conversationsList = this.conversationsList) == null || (convCellList = conversationsList.f25847V) == null || convCellList.getFirstVisiblePosition() != 0 || (conversationsList2 = this.conversationsList) == null || (conversationsListHeadView = conversationsList2.f25827E0) == null || conversationsListHeadView.getTop() != 0)) {
            this.scrollState = headerState2;
            m43117T(getLayoutParams().height, 0, new x20() { // from class: l.s2c0
                @Override // p153l.x20
                public final void call() {
                    QuickChatHeaderView.m43108G(this.f165876a);
                }
            }, speedDuration);
        } else {
            this.scrollState = headerState2;
            m43117T(getLayoutParams().height, getDEFALUE_NORMAL_HEIGH(), new x20() { // from class: l.r2c0
                @Override // p153l.x20
                public final void call() {
                    QuickChatHeaderView.m43107F(this.f160930a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSearchState$lambda$0$0(QuickChatHeaderView quickChatHeaderView) {
        HeaderState headerState = quickChatHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.SearchState;
        if (headerState != headerState2) {
            return;
        }
        quickChatHeaderView.get_bg_border().m43086b(true);
        quickChatHeaderView.headerState = headerState2;
        bnl0.m105524M(quickChatHeaderView.get_svga_loading(), true);
        if (!quickChatHeaderView.get_svga_loading().isAnimating()) {
            Context context = quickChatHeaderView.getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/b1aecf5e-02b3-4bf4-bb0e-0e99a1be70e511.so").autoPlay(true).into(quickChatHeaderView.get_svga_loading());
        }
        bnl0.m105524M(quickChatHeaderView.get_text(), false);
        bnl0.m105524M(quickChatHeaderView.get_love(), false);
    }

    /* JADX INFO: renamed from: t */
    public static pf60 m43134t(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: u */
    public static Boolean m43135u(pf60 pf60Var) {
        return Boolean.valueOf(pf60Var.f152157b == TabName.Msg);
    }

    /* JADX INFO: renamed from: v */
    public static void m43136v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static void m43137w(QuickChatHeaderView quickChatHeaderView, pf60 pf60Var) {
        pf60Var.getClass();
        String str = (String) pf60Var.f152156a;
        S s = pf60Var.f152157b;
        if (Intrinsics.m88377d(str, "notify_search")) {
            quickChatHeaderView.m43121X();
        } else if (Intrinsics.m88377d("match_success", str)) {
            C8774c.Companion companion = C8774c.INSTANCE;
            if (companion.m51485a().m51480h()) {
                OnlineMatchManager.m51326z().f33442I.onNext(C4907v.f20866b0);
                companion.m51485a().m51481i(0L);
                m43120W(quickChatHeaderView, 0L, 1, null);
                return;
            } else {
                if (quickChatHeaderView.headerState == HeaderState.GetUserState) {
                    OnlineMatchManager.m51326z().f33442I.onNext(C4907v.f20866b0);
                    return;
                }
                afj0 afj0Var = quickChatHeaderView.trackForQuickChat5;
                s.getClass();
                OnlineMatchMatchUser onlineMatchMatchUser = (OnlineMatchMatchUser) s;
                afj0Var.m97349g(onlineMatchMatchUser);
                companion.m51485a().m51482j();
                quickChatHeaderView.m43148b0(null);
                quickChatHeaderView.m43150e0(null, true, onlineMatchMatchUser);
            }
        } else if (Intrinsics.m88377d("match_timeout", str)) {
            gs50.INSTANCE.m132001a().m131993H(quickChatHeaderView.getAct(), "match_timeout");
            m43120W(quickChatHeaderView, 0L, 1, null);
        } else if (Intrinsics.m88377d("tickets_broadcast", str)) {
            if (quickChatHeaderView.headerState == HeaderState.GetUserState) {
                return;
            }
            QuickChatHeaderUserView quickChatHeaderUserView = quickChatHeaderView.get_getuser_layout();
            s.getClass();
            OnlineMatchPushUser onlineMatchPushUser = (OnlineMatchPushUser) s;
            quickChatHeaderUserView.setReceiverUserIsFemale(onlineMatchPushUser.isFemale());
            quickChatHeaderView.get_getuser_layout().setBroadcastTextTimerValue(pzi0.m174454o());
            quickChatHeaderView.get_getuser_layout().m43099t0();
            C8774c.Companion companion2 = C8774c.INSTANCE;
            if (companion2.m51485a().m51480h()) {
                OnlineMatchManager.m51326z().f33442I.onNext(C4907v.f20866b0);
                companion2.m51485a().m51481i(0L);
                m43120W(quickChatHeaderView, 0L, 1, null);
                CoreModule.f18264c.f20300D0.m35839L4(null);
                return;
            }
            afj0.m97343l(quickChatHeaderView.trackForQuickChat5, onlineMatchPushUser, null, null, 6, null);
            companion2.m51485a().m51484l(onlineMatchPushUser, false);
            quickChatHeaderView.m43148b0(onlineMatchPushUser);
            quickChatHeaderView.m43150e0(onlineMatchPushUser, false, null);
        } else if (Intrinsics.m88377d("notify_normal_state", str)) {
            m43120W(quickChatHeaderView, 0L, 1, null);
        }
        if (quickChatHeaderView.m43143O(str)) {
            return;
        }
        OnlineMatchManager.m51326z().f33442I.onNext(C4907v.f20866b0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static pf60 m43138x(pf60 pf60Var) {
        pf60Var.getClass();
        pf60 pf60Var2 = (pf60) pf60Var.f152156a;
        return pf60Var2 == null ? C4907v.f20866b0 : pf60Var2;
    }

    /* JADX INFO: renamed from: y */
    public static Boolean m43139y(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static void m43140z(QuickChatHeaderView quickChatHeaderView) {
        quickChatHeaderView.get_bg_border().m43086b(true);
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final View m43141M(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM199129b = v2c0.m199129b(this, inflater, parent);
        viewM199129b.getClass();
        return viewM199129b;
    }

    /* JADX INFO: renamed from: N */
    public final void m43142N() {
        C22421c<Counter> c22421cM32486n3 = CoreModule.f18264c.m32486n3();
        C22421c<ConversationCounter> c22421cM33776Qe = CoreModule.f18264c.f20384f0.m33776Qe();
        C22507a<mge.C18609a> c22507a = mge.m158199o().f136705a;
        final Function1 function1 = new Function1() { // from class: l.e2c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m43125k((mge.C18609a) obj);
            }
        };
        C22421c c22421cDistinctUntilChanged = c22507a.map(new qcj() { // from class: l.n2c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return QuickChatHeaderView.m43128n(function1, obj);
            }
        }).distinctUntilChanged();
        final Function3 function3 = new Function3() { // from class: l.o2c0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return QuickChatHeaderView.m43105D((Counter) obj, (ConversationCounter) obj2, ((Boolean) obj3).booleanValue());
            }
        };
        this.subTipsAnim = psd0.m173626s(c22421cM32486n3, c22421cM33776Qe, c22421cDistinctUntilChanged, new scj() { // from class: l.p2c0
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return QuickChatHeaderView.m43106E(function3, obj, obj2, obj3);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.q2c0
            @Override // p153l.y20
            public final void call(Object obj) {
                QuickChatHeaderView.m43113L(this.f155319a, (bkj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public final boolean m43143O(String key) {
        if (Intrinsics.m88377d("impress_conv_state", key)) {
            m43145Y(key);
            return true;
        }
        if (!Intrinsics.m88377d("impress_conv_state_default", key)) {
            return false;
        }
        pf60<String, Object> pf60Var = C4907v.f20866b0;
        if (Intrinsics.m88377d(pf60Var, upm.f180286c) || Intrinsics.m88377d("notify_normal_state", upm.f180286c.f152156a)) {
            m43120W(this, 0L, 1, null);
            OnlineMatchManager.m51326z().f33442I.onNext(pf60Var);
        } else {
            OnlineMatchManager.m51326z().f33442I.onNext(upm.f180286c);
            upm.f180286c = pf60Var;
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m43144S(float headViewHeight) {
        return this.headerState == HeaderState.SearchState && headViewHeight >= ((float) getLOADING_VIEW_HEIGHT());
    }

    /* JADX INFO: renamed from: Y */
    public final void m43145Y(String key) {
        HeaderState headerState = HeaderState.GetUserState;
        this.headerState = headerState;
        this.scrollState = headerState;
        get_impress_signal_layout().m42962J();
        bnl0.m105524M(get_impress_signal_layout(), true);
        bnl0.m105524M(get_getuser_layout(), false);
        bnl0.m105524M(get_bg_border(), false);
        bnl0.m105524M(get_svga_id(), false);
        if (Intrinsics.m88377d(key, "impress_conv_state")) {
            get_impress_signal_layout().m42958D();
        }
        m43118U(this, getLayoutParams().height, this.impressConHeight + getDEFALUE_NORMAL_HEIGH(), new x20() { // from class: l.l2c0
            @Override // p153l.x20
            public final void call() {
                QuickChatHeaderView.m43136v();
            }
        }, 0L, 8, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m43146Z() {
        if (get_svga_id().isAnimating()) {
            return;
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/f521473f-9607-407e-bc7a-a6799d48bfbb10.so").autoPlay(true).into(get_svga_id());
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo42993a() {
        HeaderState headerState = this.headerState;
        return headerState == HeaderState.NormalState || headerState == HeaderState.SearchState;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m43147a0() {
        ObjectAnimator objectAnimator = this.animatorPullLove;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_love(), "translationY", txq.m193530c(10), -txq.m193530c(22));
            objectAnimatorOfFloat.addListener(new C8316c());
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(2);
            objectAnimatorOfFloat.setDuration(250L);
            objectAnimatorOfFloat.start();
            this.animatorPullLove = objectAnimatorOfFloat;
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: b */
    public boolean mo42994b(float headViewHeight) {
        return m43144S(headViewHeight);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m43148b0(final OnlineMatchPushUser onlineMatchPushUser) {
        if (C8774c.INSTANCE.m51485a().getCurrentTime() == 0) {
            return;
        }
        bsj0.m106263U(this.sub);
        this.sub = C22421c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.g2c0
            @Override // p153l.y20
            public final void call(Object obj) {
                QuickChatHeaderView.m43131q(this.f101824a, onlineMatchPushUser, ((Long) obj).longValue());
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: c */
    public void mo42995c(int height) {
        HeaderState headerState = this.headerState;
        if (headerState == HeaderState.NormalState) {
            if (height > this.textShowStart) {
                bnl0.m105524M(get_text(), true);
                get_text().setAlpha(m43124h0(height));
            } else {
                bnl0.m105524M(get_text(), false);
            }
            if (this.scrollState != HeaderState.SearchState && height >= txq.m193530c(24)) {
                bnl0.m105524M(get_love(), true);
            } else {
                bnl0.m105524M(get_love(), false);
            }
            if (height > this.loveAnimStart) {
                m43147a0();
            } else {
                get_love().setTranslationY(0.0f);
                ObjectAnimator objectAnimator = this.animatorPullLove;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
            }
            if (height >= this.maxViewHeightAllowSearch && !this.isBottomPlayedVibrateAnim) {
                this.isBottomPlayedVibrateAnim = true;
                Context context = getContext();
                context.getClass();
                Object systemService = ((Act) context).getSystemService("vibrator");
                systemService.getClass();
                Vibrator vibrator = (Vibrator) systemService;
                vibrator.vibrate(500L);
                vibrator.vibrate(new long[]{100, 100}, -1);
            }
            bnl0.m105524M(get_svga_loading(), false);
            SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
        } else if (headerState == HeaderState.GetUserState) {
            bnl0.m105524M(get_text(), false);
            ObjectAnimator objectAnimator2 = this.animatorPullLove;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            bnl0.m105524M(get_love(), false);
            if (height > this.searchShowUser) {
                get_getuser_layout().setAlpha(m43151g0(height));
            } else {
                get_getuser_layout().setAlpha(0.0f);
            }
            bnl0.m105524M(get_svga_loading(), false);
            SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
        } else if (headerState == HeaderState.SearchState) {
            bnl0.m105524M(get_svga_loading(), true);
            if (!get_svga_loading().isAnimating()) {
                Context context2 = getContext();
                context2.getClass();
                SVGALoader.with(context2).from("https://auto.tancdn.com/v1/raw/b1aecf5e-02b3-4bf4-bb0e-0e99a1be70e511.so").autoPlay(true).into(get_svga_loading());
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = height;
        setLayoutParams(layoutParams);
        y20<Integer> changeHeightListrener = getChangeHeightListrener();
        if (changeHeightListrener != null) {
            changeHeightListrener.call(Integer.valueOf(height));
        }
        get_bg_border().m43085a(height);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m43149c0() {
        if (get_svga_loading().isAnimating()) {
            return;
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/b1aecf5e-02b3-4bf4-bb0e-0e99a1be70e511.so").autoPlay(true).into(get_svga_loading());
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: d */
    public void mo42996d(@NotNull ConversationsList conversationsList) {
        conversationsList.getClass();
        this.conversationsList = conversationsList;
        m43115Q();
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: e */
    public boolean mo42997e() {
        return bnl0.m105529O0(get_getuser_layout()) || bnl0.m105529O0(get_impress_signal_layout());
    }

    /* JADX INFO: renamed from: e0 */
    public final void m43150e0(final OnlineMatchPushUser onlineMatchPushUser, boolean isMatch, final OnlineMatchMatchUser user) {
        HeaderState headerState = HeaderState.GetUserState;
        this.headerState = headerState;
        this.shouldShowTips = false;
        bnl0.m105524M(get_getuser_layout(), true);
        this.scrollState = headerState;
        m43118U(this, getLayoutParams().height, this.searchHeight, new x20() { // from class: l.i2c0
            @Override // p153l.x20
            public final void call() {
                QuickChatHeaderView.m43140z(this.f112605a);
            }
        }, 0L, 8, null);
        get_getuser_layout().m43101v0(onlineMatchPushUser, isMatch, user, new z20() { // from class: l.j2c0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                QuickChatHeaderView.m43127m(this.f118045a, user, onlineMatchPushUser, (Boolean) obj, (String) obj2);
            }
        }, new y20() { // from class: l.k2c0
            @Override // p153l.y20
            public final void call(Object obj) {
                QuickChatHeaderView.m43110I(this.f123592a, onlineMatchPushUser, (Boolean) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: g */
    public void mo42999g(int height, boolean isAutoTopShow) {
        if (this.headerState == HeaderState.GetUserState) {
            return;
        }
        if (isAutoTopShow || m43114P()) {
            if (this.headerState == HeaderState.NormalState) {
                int iAbs = getLayoutParams().height + Math.abs(height);
                if (iAbs >= getDEFALUE_NORMAL_HEIGH()) {
                    iAbs = getDEFALUE_NORMAL_HEIGH();
                }
                if (isAutoTopShow) {
                    iAbs = getDEFALUE_NORMAL_HEIGH();
                }
                mo42995c(iAbs);
                return;
            }
            int iAbs2 = getLayoutParams().height + Math.abs(height);
            if (iAbs2 >= getLOADING_VIEW_HEIGHT()) {
                iAbs2 = getLOADING_VIEW_HEIGHT();
            }
            if (isAutoTopShow) {
                iAbs2 = getLOADING_VIEW_HEIGHT();
            }
            mo42995c(iAbs2);
            bnl0.m105524M(get_svga_loading(), true);
            if (get_svga_loading().isAnimating()) {
                return;
            }
            Context context = getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/b1aecf5e-02b3-4bf4-bb0e-0e99a1be70e511.so").autoPlay(true).into(get_svga_loading());
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final float m43151g0(int height) {
        int i = this.searchShowUser;
        return (((((height - i) * 1.0f) / (this.searchHeight - i)) * 70.0f) + 30.0f) / 100.0f;
    }

    @Nullable
    public final ObjectAnimator getAnimatorPullLove() {
        return this.animatorPullLove;
    }

    @Nullable
    public final ConversationsList getConversationsList() {
        return this.conversationsList;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getDEFALUE_NORMAL_HEIGH() {
        return this.DEFALUE_NORMAL_HEIGH;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getInitHeight() {
        int new_match_top_margin = getNEW_MATCH_TOP_MARGIN();
        if (gra.m131563F0() || gra.m131672d3() || gra.m131683g()) {
            new_match_top_margin = 0;
        }
        HeaderState headerState = this.headerState;
        if (headerState == HeaderState.NormalState || headerState == HeaderState.SearchState || headerState == HeaderState.GetUserState) {
            return new_match_top_margin + getLayoutParams().height;
        }
        return 0;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getLOADING_VIEW_HEIGHT() {
        return this.LOADING_VIEW_HEIGHT;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getMAX_PULL_VIEW_HEIGH() {
        return this.MAX_PULL_VIEW_HEIGH;
    }

    @Nullable
    public final kcg0 getSub() {
        return this.sub;
    }

    @NotNull
    public final QuickChatBgTopView get_bg_border() {
        QuickChatBgTopView quickChatBgTopView = this._bg_border;
        if (quickChatBgTopView != null) {
            return quickChatBgTopView;
        }
        Intrinsics.m88391r("_bg_border");
        return null;
    }

    @NotNull
    public final QuickChatHeaderUserView get_getuser_layout() {
        QuickChatHeaderUserView quickChatHeaderUserView = this._getuser_layout;
        if (quickChatHeaderUserView != null) {
            return quickChatHeaderUserView;
        }
        Intrinsics.m88391r("_getuser_layout");
        return null;
    }

    @NotNull
    public final ImpressSignalConversationHeadView get_impress_signal_layout() {
        ImpressSignalConversationHeadView impressSignalConversationHeadView = this._impress_signal_layout;
        if (impressSignalConversationHeadView != null) {
            return impressSignalConversationHeadView;
        }
        Intrinsics.m88391r("_impress_signal_layout");
        return null;
    }

    @NotNull
    public final VImage get_love() {
        VImage vImage = this._love;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_love");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_id() {
        SVGAnimationView sVGAnimationView = this._svga_id;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga_id");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_loading() {
        SVGAnimationView sVGAnimationView = this._svga_loading;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga_loading");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_love() {
        SVGAnimationView sVGAnimationView = this._svga_love;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga_love");
        return null;
    }

    @NotNull
    public final VText get_text() {
        VText vText = this._text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_text");
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: h */
    public void mo43000h() {
        int i = C8314a.f26368a[this.headerState.ordinal()];
        if (i == 2) {
            setNormalState(0L);
            m43122d0();
        } else {
            if (i != 3) {
                return;
            }
            m43121X();
            m43122d0();
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: j */
    public int mo43002j() {
        if (this.headerState == HeaderState.SearchState && getLayoutParams().height <= getLOADING_VIEW_HEIGHT()) {
            return getLayoutParams().height;
        }
        if (this.headerState == HeaderState.NormalState && getLayoutParams().height <= getDEFALUE_NORMAL_HEIGH()) {
            return getLayoutParams().height;
        }
        postDelayed(new Runnable() { // from class: l.t1c0
            @Override // java.lang.Runnable
            public final void run() {
                QuickChatHeaderView.m43102A(this.f171642a);
            }
        }, 500L);
        ObjectAnimator objectAnimator = this.animatorPullLove;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        bnl0.m105524M(get_love(), false);
        if (getLayoutParams().height < this.maxViewHeightAllowSearch) {
            m43120W(this, 0L, 1, null);
            return getDEFALUE_NORMAL_HEIGH();
        }
        bnl0.m105524M(get_svga_love(), true);
        if (!get_svga_love().isAnimating()) {
            Context context = getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/f0bb0c23-c1ff-42e6-bfc9-a8071e960fa911.so").autoPlay(true).repeatCount(1).animListener(new C8317d()).into(get_svga_love());
        }
        m43121X();
        return getLOADING_VIEW_HEIGHT();
    }

    public final void setAnimatorPullLove(@Nullable ObjectAnimator objectAnimator) {
        this.animatorPullLove = objectAnimator;
    }

    public final void setConversationsList(@Nullable ConversationsList conversationsList) {
        this.conversationsList = conversationsList;
    }

    public final void setSub(@Nullable kcg0 kcg0Var) {
        this.sub = kcg0Var;
    }

    public final void set_bg_border(@NotNull QuickChatBgTopView quickChatBgTopView) {
        quickChatBgTopView.getClass();
        this._bg_border = quickChatBgTopView;
    }

    public final void set_getuser_layout(@NotNull QuickChatHeaderUserView quickChatHeaderUserView) {
        quickChatHeaderUserView.getClass();
        this._getuser_layout = quickChatHeaderUserView;
    }

    public final void set_impress_signal_layout(@NotNull ImpressSignalConversationHeadView impressSignalConversationHeadView) {
        impressSignalConversationHeadView.getClass();
        this._impress_signal_layout = impressSignalConversationHeadView;
    }

    public final void set_love(@NotNull VImage vImage) {
        vImage.getClass();
        this._love = vImage;
    }

    public final void set_svga_id(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._svga_id = sVGAnimationView;
    }

    public final void set_svga_loading(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._svga_loading = sVGAnimationView;
    }

    public final void set_svga_love(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._svga_love = sVGAnimationView;
    }

    public final void set_text(@NotNull VText vText) {
        vText.getClass();
        this._text = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatHeaderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ QuickChatHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
