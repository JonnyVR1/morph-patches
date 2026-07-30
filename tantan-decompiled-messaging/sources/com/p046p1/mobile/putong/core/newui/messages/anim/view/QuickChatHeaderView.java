package com.p046p1.mobile.putong.core.newui.messages.anim.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4756v;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConvCellList;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8611c;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ConversationCounter;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VImage;
import p147v.VText;
import p149l.ak50;
import p149l.b2s;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.f30;
import p149l.ife;
import p149l.j6f;
import p149l.j760;
import p149l.jo0;
import p149l.l9r;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o7r;
import p149l.rub0;
import p149l.snm;
import p149l.svq;
import p149l.upa;
import p149l.vwb;
import p149l.w5j0;
import p149l.w9j;
import p149l.wjc0;
import p149l.x9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.y9j;
import p149l.yij0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002Æ\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u0019\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010#J1\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J+\u00101\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010.\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u0010\fJ\u000f\u00104\u001a\u00020\u000fH\u0002¢\u0006\u0004\b4\u00105J\u001f\u0010;\u001a\u00020:2\u0006\u00107\u001a\u0002062\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u00105J\u0015\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020!¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0006H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0006H\u0016¢\u0006\u0004\bI\u0010DJ\u001f\u0010K\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020!H\u0016¢\u0006\u0004\bM\u0010@J\u000f\u0010N\u001a\u00020\u000fH\u0016¢\u0006\u0004\bN\u00105J\u000f\u0010O\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010\fR\"\u0010V\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\"\u0010]\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010Q\u001a\u0004\b[\u0010S\"\u0004\b\\\u0010UR\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010\u0089\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010DR\u001e\u0010\u008c\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a\u0005\b\u008b\u0001\u0010DR\u001e\u0010\u008f\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u0087\u0001\u001a\u0005\b\u008e\u0001\u0010DR\u0017\u0010\u0091\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0087\u0001R\u001a\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010\u0017R\u0017\u0010\u0099\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0087\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0087\u0001R\u0017\u0010\u009d\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0087\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0087\u0001R\u0019\u0010¡\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0087\u0001R\u0019\u0010£\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u0087\u0001R,\u0010«\u0001\u001a\u0005\u0018\u00010¤\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R)\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0005\b°\u0001\u0010HR\u001a\u0010´\u0001\u001a\u00030±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001a\u0010¶\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0094\u0001R,\u0010¾\u0001\u001a\u0005\u0018\u00010·\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\u001c\u0010Â\u0001\u001a\u0005\u0018\u00010¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001c\u0010Ä\u0001\u001a\u0005\u0018\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010¹\u0001R\u0018\u0010Å\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0017¨\u0006Ç\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Q", "()V", "", Constants.KEY_KEY, "", BloodType.f38728O, "(Ljava/lang/String;)Z", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "onlineMatchPushUser", "b0", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;)V", "c0", "Z", "d0", "R", "", "speedDuration", "setNormalState", "(J)V", "X", "a0", "height", "", "h0", "(I)F", "g0", "startValue", "endValue", "Ll/d30;", "endAction", "setDuration", j6f.GPS_DIRECTION_TRUE, "(IILl/d30;J)V", "Y", "(Ljava/lang/String;)V", "isMatch", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;", "user", "e0", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;ZLcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;)V", "N", "P", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "M", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "headViewHeight", j6f.LATITUDE_SOUTH, "(F)Z", "c", "(I)V", "j", "()I", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "b", "e", "h", "Lcom/tantan/library/svga/SVGAnimationView;", "Lcom/tantan/library/svga/SVGAnimationView;", "get_svga_id", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_id", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_id", RXScreenCaptureService.KEY_INDEX, "get_svga_love", "set_svga_love", "_svga_love", "get_svga_loading", "set_svga_loading", "_svga_loading", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;", "k", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;", "get_bg_border", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;", "set_bg_border", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;)V", "_bg_border", "Lv/VImage;", BLiveStormDanmakuGiftResourceType.f44444l, "Lv/VImage;", "get_love", "()Lv/VImage;", "set_love", "(Lv/VImage;)V", "_love", "Lv/VText;", "m", "Lv/VText;", "get_text", "()Lv/VText;", "set_text", "(Lv/VText;)V", "_text", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;", "n", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;", "get_getuser_layout", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;", "set_getuser_layout", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;)V", "_getuser_layout", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;", "o", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;", "get_impress_signal_layout", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;", "set_impress_signal_layout", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;)V", "_impress_signal_layout", "p", "I", "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", "q", "getLOADING_VIEW_HEIGHT", "LOADING_VIEW_HEIGHT", "r", "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", BLiveStormDanmakuGiftResourceType.f44446s, "maxViewHeightAllowSearch", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$HeaderState;", Constants.KEY_T, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$HeaderState;", "headerState", "u", "isBottomPlayedVibrateAnim", ResourceDirection.f38808v, "loveAnimStart", "w", "textShowStart", BaseSei.f13930X, "searchShowUser", BaseSei.f13931Y, "searchHeight", BaseSei.f13932Z, "suggestConHeight", "A", "impressConHeight", "Landroid/animation/ObjectAnimator;", "B", "Landroid/animation/ObjectAnimator;", "getAnimatorPullLove", "()Landroid/animation/ObjectAnimator;", "setAnimatorPullLove", "(Landroid/animation/ObjectAnimator;)V", "animatorPullLove", b2s.C_ZONE, "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "getConversationsList", "()Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "setConversationsList", "Ll/w5j0;", "D", "Ll/w5j0;", "trackForQuickChat5", "E", "scrollState", "Ll/c4g0;", "F", "Ll/c4g0;", "getSub", "()Ll/c4g0;", "setSub", "(Ll/c4g0;)V", AuthenticationTokenClaims.JSON_KEY_SUB, "Landroid/animation/ValueAnimator;", "G", "Landroid/animation/ValueAnimator;", "scrollAnim", "H", "subTipsAnim", "shouldShowTips", "HeaderState", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public w5j0 trackForQuickChat5;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public HeaderState scrollState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public c4g0 sub;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator scrollAnim;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public c4g0 subTipsAnim;

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

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$HeaderState;", "", "<init>", "(Ljava/lang/String;I)V", "NormalState", "SearchState", "GetUserState", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum HeaderState {
        NormalState,
        SearchState,
        GetUserState;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<HeaderState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8163a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25626a;

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
            f25626a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8164b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f25627a;

        public C8164b(d30 d30Var) {
            this.f25627a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f25627a.call();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8165c extends AnimatorListenerAdapter {
        public C8165c() {
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
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$d", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8166d extends AnimListener {
        public C8166d() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            xdl0.m208344M(QuickChatHeaderView.this.get_svga_love(), false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.DEFALUE_NORMAL_HEIGH = svq.m186103c(4);
        this.LOADING_VIEW_HEIGHT = svq.m186103c(24);
        this.MAX_PULL_VIEW_HEIGH = svq.m186103c(160);
        this.maxViewHeightAllowSearch = svq.m186103c(80);
        HeaderState headerState = HeaderState.NormalState;
        this.headerState = headerState;
        this.loveAnimStart = svq.m186103c(80);
        this.textShowStart = svq.m186103c(98);
        this.searchShowUser = svq.m186103c(80);
        this.searchHeight = svq.m186103c(102);
        this.suggestConHeight = svq.m186103c(178);
        this.impressConHeight = svq.m186103c(219);
        this.scrollState = headerState;
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m42130M(layoutInflaterM163037a, this);
        this.trackForQuickChat5 = new w5j0();
        m42105R();
    }

    /* JADX INFO: renamed from: A */
    public static void m42091A(QuickChatHeaderView quickChatHeaderView) {
        quickChatHeaderView.isBottomPlayedVibrateAnim = false;
    }

    /* JADX INFO: renamed from: C */
    public static j760 m42093C(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static xaj0 m42094D(Counter counter, ConversationCounter conversationCounter, boolean z) {
        counter.getClass();
        conversationCounter.getClass();
        return new xaj0(counter, conversationCounter, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: E */
    public static xaj0 m42095E(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (xaj0) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: F */
    public static void m42096F(QuickChatHeaderView quickChatHeaderView) {
        HeaderState headerState = quickChatHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        xdl0.m208344M(quickChatHeaderView.get_getuser_layout(), false);
        xdl0.m208344M(quickChatHeaderView.get_svga_loading(), false);
        SVGAnimationView.stopAnimation$default(quickChatHeaderView.get_svga_loading(), false, 1, null);
        quickChatHeaderView.headerState = headerState2;
        quickChatHeaderView.m42131N();
    }

    /* JADX INFO: renamed from: G */
    public static void m42097G(QuickChatHeaderView quickChatHeaderView) {
        HeaderState headerState = quickChatHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        xdl0.m208344M(quickChatHeaderView.get_svga_loading(), false);
        SVGAnimationView.stopAnimation$default(quickChatHeaderView.get_svga_loading(), false, 1, null);
        xdl0.m208344M(quickChatHeaderView.get_getuser_layout(), false);
        quickChatHeaderView.headerState = headerState2;
        quickChatHeaderView.m42131N();
    }

    /* JADX INFO: renamed from: H */
    public static void m42098H(final QuickChatHeaderView quickChatHeaderView, Boolean bool) {
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
        if ((conversationsList3 != null && (convCellList2 = conversationsList3.f25105V) != null && convCellList2.getCount() == 0) || ((conversationsList = quickChatHeaderView.conversationsList) != null && (convCellList = conversationsList.f25105V) != null && convCellList.getFirstVisiblePosition() == 0 && (conversationsList2 = quickChatHeaderView.conversationsList) != null && (conversationsListHeadView = conversationsList2.f25085E0) != null && conversationsListHeadView.getTop() == 0)) {
            quickChatHeaderView.scrollState = HeaderState.SearchState;
            quickChatHeaderView.m42106T(quickChatHeaderView.getLayoutParams().height, quickChatHeaderView.getLOADING_VIEW_HEIGHT(), new d30() { // from class: l.dub0
                @Override // p149l.d30
                public final void call() {
                    QuickChatHeaderView.setSearchState$lambda$0$0(this.f87968a);
                }
            }, 500L);
        } else {
            xdl0.m208344M(quickChatHeaderView.get_text(), false);
            xdl0.m208344M(quickChatHeaderView.get_love(), false);
            quickChatHeaderView.headerState = HeaderState.SearchState;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m42099I(QuickChatHeaderView quickChatHeaderView, OnlineMatchPushUser onlineMatchPushUser, Boolean bool) {
        m42109W(quickChatHeaderView, 0L, 1, null);
        if (bool.booleanValue()) {
            quickChatHeaderView.trackForQuickChat5.m201640f();
            return;
        }
        w5j0.m201634i(quickChatHeaderView.trackForQuickChat5, false, null, null, 6, null);
        CoreModule.f17545c.f19558D0.m34836L4(onlineMatchPushUser);
        quickChatHeaderView.get_getuser_layout().setBroadcastTextTimerValue(-1L);
        quickChatHeaderView.trackForQuickChat5.m201645m();
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m42100J(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static j760 m42101K(TabName tabName, C4319c c4319c) {
        return vwb.m200311Y(tabName, c4319c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public static void m42102L(QuickChatHeaderView quickChatHeaderView, xaj0 xaj0Var) {
        int iM203413b = wjc0.m203413b((Counter) xaj0Var.f191751a, (ConversationCounter) xaj0Var.f191752b, (Boolean) xaj0Var.f191753c);
        if (!OnlineMatchManager.m50143z().m50182n0() || iM203413b > OnlineMatchManager.m50143z().f32598b.get().intValue()) {
            quickChatHeaderView.shouldShowTips = false;
            quickChatHeaderView.get_bg_border().m42075b(quickChatHeaderView.shouldShowTips);
        } else {
            quickChatHeaderView.shouldShowTips = true;
            quickChatHeaderView.get_bg_border().m42075b(quickChatHeaderView.shouldShowTips);
            OnlineMatchManager.m50143z().m50179k0();
        }
        OnlineMatchManager.m50143z().f32598b.put(Integer.valueOf(iM203413b));
        yij0.m214943U(quickChatHeaderView.subTipsAnim);
    }

    /* JADX INFO: renamed from: P */
    private final boolean m42103P() {
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList == null) {
            return false;
        }
        if (conversationsList.f25105V.getCount() != 0) {
            return conversationsList.f25105V.getFirstVisiblePosition() == 0 && conversationsList.f25085E0.getTop() == 0 && conversationsList.f25085E0.f25177m.getLayoutParams().height == getInitHeight();
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    private final void m42104Q() {
        Act act = getAct();
        C22392a<j760<String, Object>> c22392a = OnlineMatchManager.m50143z().f32594I;
        Act act2 = getAct();
        act2.getClass();
        C22306c<TabName> c22306cM39819i7 = ((NewMainAct) act2).m39819i7();
        final Function2 function2 = new Function2() { // from class: l.qub0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return QuickChatHeaderView.m42122s((j760) obj, (TabName) obj2);
            }
        };
        C22306c c22306cDuringCreated = act.duringCreated(mkd0.m154984r(c22392a, c22306cM39819i7, new x9j() { // from class: l.rtb0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return QuickChatHeaderView.m42123t(function2, obj, obj2);
            }
        }));
        final Function1 function1 = new Function1() { // from class: l.stb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m42124u((j760) obj);
            }
        };
        C22306c c22306cFilter = c22306cDuringCreated.filter(new w9j() { // from class: l.ttb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return QuickChatHeaderView.m42128y(function1, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.utb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m42127x((j760) obj);
            }
        };
        C22306c map = c22306cFilter.map(new w9j() { // from class: l.vtb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return QuickChatHeaderView.m42093C(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.wtb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m42119p((j760) obj);
            }
        };
        map.filter(new w9j() { // from class: l.xtb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return QuickChatHeaderView.m42100J(function4, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ytb0
            @Override // p149l.e30
            public final void call(Object obj) {
                QuickChatHeaderView.m42126w(this.f199898a, (j760) obj);
            }
        }));
        Act act3 = getAct();
        Act act4 = getAct();
        act4.getClass();
        act3.duringCreated(mkd0.m154984r(((NewMainAct) act4).m39819i7(), getAct().lifecycle(), new x9j() { // from class: l.ztb0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return QuickChatHeaderView.m42101K((TabName) obj, (C4319c) obj2);
            }
        }), false).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.qtb0
            @Override // p149l.e30
            public final void call(Object obj) {
                QuickChatHeaderView.m42118o(this.f156316a, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    private final void m42105R() {
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getLayoutParams().height = getDEFALUE_NORMAL_HEIGH();
        get_bg_border().m42074a(getDEFALUE_NORMAL_HEIGH());
        ViewGroup.LayoutParams layoutParams = get_svga_id().getLayoutParams();
        this.searchHeight = svq.m186103c(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256);
        layoutParams.height = svq.m186103c(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256);
        get_getuser_layout().setLayoutParams(new RelativeLayout.LayoutParams(-1, this.searchHeight));
        get_svga_id().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: T */
    private final void m42106T(int startValue, int endValue, d30 endAction, long setDuration) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.scrollAnim;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.scrollAnim) != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(startValue, endValue);
        this.scrollAnim = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(setDuration);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bub0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    QuickChatHeaderView.m42108V(this.f77294a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new C8164b(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m42107U(QuickChatHeaderView quickChatHeaderView, int i, int i2, d30 d30Var, long j, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            j = 300;
        }
        quickChatHeaderView.m42106T(i, i2, d30Var, j);
    }

    /* JADX INFO: renamed from: V */
    public static final void m42108V(QuickChatHeaderView quickChatHeaderView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        quickChatHeaderView.mo41984c(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m42109W(QuickChatHeaderView quickChatHeaderView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        quickChatHeaderView.setNormalState(j);
    }

    /* JADX INFO: renamed from: X */
    private final void m42110X() {
        if (this.headerState != HeaderState.SearchState) {
            setOnClickListener(null);
            yij0.m214943U(this.sub);
            this.shouldShowTips = false;
            get_getuser_layout().m42089u0();
            C8611c.INSTANCE.m50302a().m50298i(0L);
            get_getuser_layout().setBroadcastTextTimerValue(-1L);
            OnlineMatchManager.m50143z().m50190u0(getAct(), new e30() { // from class: l.pub0
                @Override // p149l.e30
                public final void call(Object obj) {
                    QuickChatHeaderView.m42098H(this.f151264a, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m42111d0() {
        ObjectAnimator objectAnimator = this.animatorPullLove;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        get_svga_id().stopAnimation(false);
        SVGAnimationView.stopAnimation$default(get_svga_love(), false, 1, null);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m42112f0(QuickChatHeaderView quickChatHeaderView) {
        m42109W(quickChatHeaderView, 0L, 1, null);
    }

    /* JADX INFO: renamed from: h0 */
    private final float m42113h0(int height) {
        return (((((height - this.textShowStart) * 1.0f) / (getMAX_PULL_VIEW_HEIGH() - this.textShowStart)) * 70.0f) + 30.0f) / 100.0f;
    }

    /* JADX INFO: renamed from: k */
    public static Boolean m42114k(ife.C17538a c17538a) {
        return Boolean.valueOf(ife.m135906o().m135908k(BannerLoc.get("conversation")));
    }

    /* JADX INFO: renamed from: m */
    public static void m42116m(final QuickChatHeaderView quickChatHeaderView, OnlineMatchMatchUser onlineMatchMatchUser, OnlineMatchPushUser onlineMatchPushUser, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            w5j0.m201633b(quickChatHeaderView.trackForQuickChat5, !TextUtils.isEmpty(str), false, null, null, 12, null);
            OnlineMatchManager.m50143z().m50186r0(quickChatHeaderView.getAct(), onlineMatchPushUser, new d30() { // from class: l.iub0
                @Override // p149l.d30
                public final void call() {
                    QuickChatHeaderView.m42112f0(this.f115000a);
                }
            }, str);
        } else {
            m42109W(quickChatHeaderView, 0L, 1, null);
            quickChatHeaderView.trackForQuickChat5.m201639e(!TextUtils.isEmpty(str));
            quickChatHeaderView.getAct().startActivity(MessagesAct.m48949p2(quickChatHeaderView.getAct(), onlineMatchMatchUser != null ? onlineMatchMatchUser.userId : null, false, false, false, false, null, 7, str));
        }
    }

    /* JADX INFO: renamed from: n */
    public static Boolean m42117n(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static void m42118o(QuickChatHeaderView quickChatHeaderView, j760 j760Var) {
        if ((j760Var != null ? (C4319c) j760Var.f116565b : null) == C4319c.f15548i) {
            if ((j760Var != null ? (TabName) j760Var.f116564a : null) == TabName.Msg) {
                int i = C8163a.f25626a[quickChatHeaderView.headerState.ordinal()];
                if (i == 1) {
                    quickChatHeaderView.m42135Z();
                    quickChatHeaderView.m42137b0(C8611c.INSTANCE.m50302a().getPushUser());
                    if (quickChatHeaderView.get_getuser_layout().getBroadcastTextTimerValue() > 0) {
                        quickChatHeaderView.get_getuser_layout().m42088t0();
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    quickChatHeaderView.m42131N();
                    quickChatHeaderView.m42135Z();
                    return;
                } else if (i != 3) {
                    l9r.m149037a();
                    return;
                } else {
                    quickChatHeaderView.m42138c0();
                    quickChatHeaderView.m42135Z();
                    return;
                }
            }
        }
        yij0.m214943U(quickChatHeaderView.sub);
        quickChatHeaderView.get_getuser_layout().m42089u0();
        quickChatHeaderView.m42111d0();
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m42119p(j760 j760Var) {
        j760Var.getClass();
        return Boolean.valueOf((j760Var == C4756v.f20124b0 || TextUtils.isEmpty(CoreModule.m29931H().userId())) ? false : true);
    }

    /* JADX INFO: renamed from: q */
    public static void m42120q(QuickChatHeaderView quickChatHeaderView, OnlineMatchPushUser onlineMatchPushUser, long j) {
        C8611c.Companion companion = C8611c.INSTANCE;
        if (companion.m50302a().m50297h()) {
            yij0.m214943U(quickChatHeaderView.sub);
            m42109W(quickChatHeaderView, 0L, 1, null);
            boolean currentIsMatch = companion.m50302a().getCurrentIsMatch();
            w5j0 w5j0Var = quickChatHeaderView.trackForQuickChat5;
            if (currentIsMatch) {
                w5j0Var.m201640f();
                return;
            }
            w5j0Var.m201645m();
            quickChatHeaderView.get_getuser_layout().setBroadcastTextTimerValue(-1L);
            companion.m50302a().m50298i(0L);
            CoreModule.f17545c.f19558D0.m34836L4(onlineMatchPushUser);
        }
    }

    /* JADX INFO: renamed from: s */
    public static j760 m42122s(j760 j760Var, TabName tabName) {
        return new j760(j760Var, tabName);
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
        yij0.m214943U(this.sub);
        get_getuser_layout().m42089u0();
        C8611c.INSTANCE.m50302a().m50298i(0L);
        get_getuser_layout().setBroadcastTextTimerValue(-1L);
        ConversationsList conversationsList3 = this.conversationsList;
        if ((conversationsList3 == null || (convCellList2 = conversationsList3.f25105V) == null || convCellList2.getCount() != 0) && ((conversationsList = this.conversationsList) == null || (convCellList = conversationsList.f25105V) == null || convCellList.getFirstVisiblePosition() != 0 || (conversationsList2 = this.conversationsList) == null || (conversationsListHeadView = conversationsList2.f25085E0) == null || conversationsListHeadView.getTop() != 0)) {
            this.scrollState = headerState2;
            m42106T(getLayoutParams().height, 0, new d30() { // from class: l.oub0
                @Override // p149l.d30
                public final void call() {
                    QuickChatHeaderView.m42097G(this.f145681a);
                }
            }, speedDuration);
        } else {
            this.scrollState = headerState2;
            m42106T(getLayoutParams().height, getDEFALUE_NORMAL_HEIGH(), new d30() { // from class: l.nub0
                @Override // p149l.d30
                public final void call() {
                    QuickChatHeaderView.m42096F(this.f140613a);
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
        quickChatHeaderView.get_bg_border().m42075b(true);
        quickChatHeaderView.headerState = headerState2;
        xdl0.m208344M(quickChatHeaderView.get_svga_loading(), true);
        if (!quickChatHeaderView.get_svga_loading().isAnimating()) {
            Context context = quickChatHeaderView.getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/b1aecf5e-02b3-4bf4-bb0e-0e99a1be70e511.so").autoPlay(true).into(quickChatHeaderView.get_svga_loading());
        }
        xdl0.m208344M(quickChatHeaderView.get_text(), false);
        xdl0.m208344M(quickChatHeaderView.get_love(), false);
    }

    /* JADX INFO: renamed from: t */
    public static j760 m42123t(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: u */
    public static Boolean m42124u(j760 j760Var) {
        return Boolean.valueOf(j760Var.f116565b == TabName.Msg);
    }

    /* JADX INFO: renamed from: v */
    public static void m42125v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static void m42126w(QuickChatHeaderView quickChatHeaderView, j760 j760Var) {
        j760Var.getClass();
        String str = (String) j760Var.f116564a;
        S s = j760Var.f116565b;
        if (Intrinsics.m87488d(str, "notify_search")) {
            quickChatHeaderView.m42110X();
        } else if (Intrinsics.m87488d("match_success", str)) {
            C8611c.Companion companion = C8611c.INSTANCE;
            if (companion.m50302a().m50297h()) {
                OnlineMatchManager.m50143z().f32594I.onNext(C4756v.f20124b0);
                companion.m50302a().m50298i(0L);
                m42109W(quickChatHeaderView, 0L, 1, null);
                return;
            } else {
                if (quickChatHeaderView.headerState == HeaderState.GetUserState) {
                    OnlineMatchManager.m50143z().f32594I.onNext(C4756v.f20124b0);
                    return;
                }
                w5j0 w5j0Var = quickChatHeaderView.trackForQuickChat5;
                s.getClass();
                OnlineMatchMatchUser onlineMatchMatchUser = (OnlineMatchMatchUser) s;
                w5j0Var.m201641g(onlineMatchMatchUser);
                companion.m50302a().m50299j();
                quickChatHeaderView.m42137b0(null);
                quickChatHeaderView.m42139e0(null, true, onlineMatchMatchUser);
            }
        } else if (Intrinsics.m87488d("match_timeout", str)) {
            ak50.INSTANCE.m97144a().m97136H(quickChatHeaderView.getAct(), "match_timeout");
            m42109W(quickChatHeaderView, 0L, 1, null);
        } else if (Intrinsics.m87488d("tickets_broadcast", str)) {
            if (quickChatHeaderView.headerState == HeaderState.GetUserState) {
                return;
            }
            QuickChatHeaderUserView quickChatHeaderUserView = quickChatHeaderView.get_getuser_layout();
            s.getClass();
            OnlineMatchPushUser onlineMatchPushUser = (OnlineMatchPushUser) s;
            quickChatHeaderUserView.setReceiverUserIsFemale(onlineMatchPushUser.isFemale());
            quickChatHeaderView.get_getuser_layout().setBroadcastTextTimerValue(mqi0.m155944o());
            quickChatHeaderView.get_getuser_layout().m42088t0();
            C8611c.Companion companion2 = C8611c.INSTANCE;
            if (companion2.m50302a().m50297h()) {
                OnlineMatchManager.m50143z().f32594I.onNext(C4756v.f20124b0);
                companion2.m50302a().m50298i(0L);
                m42109W(quickChatHeaderView, 0L, 1, null);
                CoreModule.f17545c.f19558D0.m34836L4(null);
                return;
            }
            w5j0.m201635l(quickChatHeaderView.trackForQuickChat5, onlineMatchPushUser, null, null, 6, null);
            companion2.m50302a().m50301l(onlineMatchPushUser, false);
            quickChatHeaderView.m42137b0(onlineMatchPushUser);
            quickChatHeaderView.m42139e0(onlineMatchPushUser, false, null);
        } else if (Intrinsics.m87488d("notify_normal_state", str)) {
            m42109W(quickChatHeaderView, 0L, 1, null);
        }
        if (quickChatHeaderView.m42132O(str)) {
            return;
        }
        OnlineMatchManager.m50143z().f32594I.onNext(C4756v.f20124b0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static j760 m42127x(j760 j760Var) {
        j760Var.getClass();
        j760 j760Var2 = (j760) j760Var.f116564a;
        return j760Var2 == null ? C4756v.f20124b0 : j760Var2;
    }

    /* JADX INFO: renamed from: y */
    public static Boolean m42128y(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static void m42129z(QuickChatHeaderView quickChatHeaderView) {
        quickChatHeaderView.get_bg_border().m42075b(true);
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final View m42130M(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM180867b = rub0.m180867b(this, inflater, parent);
        viewM180867b.getClass();
        return viewM180867b;
    }

    /* JADX INFO: renamed from: N */
    public final void m42131N() {
        C22306c<Counter> c22306cM31483n3 = CoreModule.f17545c.m31483n3();
        C22306c<ConversationCounter> c22306cM32773Qe = CoreModule.f17545c.f19642f0.m32773Qe();
        C22392a<ife.C17538a> c22392a = ife.m135906o().f112985a;
        final Function1 function1 = new Function1() { // from class: l.aub0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m42114k((ife.C17538a) obj);
            }
        };
        C22306c c22306cDistinctUntilChanged = c22392a.map(new w9j() { // from class: l.jub0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return QuickChatHeaderView.m42117n(function1, obj);
            }
        }).distinctUntilChanged();
        final Function3 function3 = new Function3() { // from class: l.kub0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return QuickChatHeaderView.m42094D((Counter) obj, (ConversationCounter) obj2, ((Boolean) obj3).booleanValue());
            }
        };
        this.subTipsAnim = mkd0.m154985s(c22306cM31483n3, c22306cM32773Qe, c22306cDistinctUntilChanged, new y9j() { // from class: l.lub0
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return QuickChatHeaderView.m42095E(function3, obj, obj2, obj3);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.mub0
            @Override // p149l.e30
            public final void call(Object obj) {
                QuickChatHeaderView.m42102L(this.f135776a, (xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public final boolean m42132O(String key) {
        if (Intrinsics.m87488d("impress_conv_state", key)) {
            m42134Y(key);
            return true;
        }
        if (!Intrinsics.m87488d("impress_conv_state_default", key)) {
            return false;
        }
        j760<String, Object> j760Var = C4756v.f20124b0;
        if (Intrinsics.m87488d(j760Var, snm.f165463c) || Intrinsics.m87488d("notify_normal_state", snm.f165463c.f116564a)) {
            m42109W(this, 0L, 1, null);
            OnlineMatchManager.m50143z().f32594I.onNext(j760Var);
        } else {
            OnlineMatchManager.m50143z().f32594I.onNext(snm.f165463c);
            snm.f165463c = j760Var;
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m42133S(float headViewHeight) {
        return this.headerState == HeaderState.SearchState && headViewHeight >= ((float) getLOADING_VIEW_HEIGHT());
    }

    /* JADX INFO: renamed from: Y */
    public final void m42134Y(String key) {
        HeaderState headerState = HeaderState.GetUserState;
        this.headerState = headerState;
        this.scrollState = headerState;
        get_impress_signal_layout().m41951J();
        xdl0.m208344M(get_impress_signal_layout(), true);
        xdl0.m208344M(get_getuser_layout(), false);
        xdl0.m208344M(get_bg_border(), false);
        xdl0.m208344M(get_svga_id(), false);
        if (Intrinsics.m87488d(key, "impress_conv_state")) {
            get_impress_signal_layout().m41947D();
        }
        m42107U(this, getLayoutParams().height, this.impressConHeight + getDEFALUE_NORMAL_HEIGH(), new d30() { // from class: l.hub0
            @Override // p149l.d30
            public final void call() {
                QuickChatHeaderView.m42125v();
            }
        }, 0L, 8, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m42135Z() {
        if (get_svga_id().isAnimating()) {
            return;
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/f521473f-9607-407e-bc7a-a6799d48bfbb10.so").autoPlay(true).into(get_svga_id());
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo41982a() {
        HeaderState headerState = this.headerState;
        return headerState == HeaderState.NormalState || headerState == HeaderState.SearchState;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m42136a0() {
        ObjectAnimator objectAnimator = this.animatorPullLove;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_love(), "translationY", svq.m186103c(10), -svq.m186103c(22));
            objectAnimatorOfFloat.addListener(new C8165c());
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(2);
            objectAnimatorOfFloat.setDuration(250L);
            objectAnimatorOfFloat.start();
            this.animatorPullLove = objectAnimatorOfFloat;
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: b */
    public boolean mo41983b(float headViewHeight) {
        return m42133S(headViewHeight);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m42137b0(final OnlineMatchPushUser onlineMatchPushUser) {
        if (C8611c.INSTANCE.m50302a().getCurrentTime() == 0) {
            return;
        }
        yij0.m214943U(this.sub);
        this.sub = C22306c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.cub0
            @Override // p149l.e30
            public final void call(Object obj) {
                QuickChatHeaderView.m42120q(this.f82550a, onlineMatchPushUser, ((Long) obj).longValue());
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: c */
    public void mo41984c(int height) {
        HeaderState headerState = this.headerState;
        if (headerState == HeaderState.NormalState) {
            if (height > this.textShowStart) {
                xdl0.m208344M(get_text(), true);
                get_text().setAlpha(m42113h0(height));
            } else {
                xdl0.m208344M(get_text(), false);
            }
            if (this.scrollState != HeaderState.SearchState && height >= svq.m186103c(24)) {
                xdl0.m208344M(get_love(), true);
            } else {
                xdl0.m208344M(get_love(), false);
            }
            if (height > this.loveAnimStart) {
                m42136a0();
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
            xdl0.m208344M(get_svga_loading(), false);
            SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
        } else if (headerState == HeaderState.GetUserState) {
            xdl0.m208344M(get_text(), false);
            ObjectAnimator objectAnimator2 = this.animatorPullLove;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            xdl0.m208344M(get_love(), false);
            if (height > this.searchShowUser) {
                get_getuser_layout().setAlpha(m42140g0(height));
            } else {
                get_getuser_layout().setAlpha(0.0f);
            }
            xdl0.m208344M(get_svga_loading(), false);
            SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
        } else if (headerState == HeaderState.SearchState) {
            xdl0.m208344M(get_svga_loading(), true);
            if (!get_svga_loading().isAnimating()) {
                Context context2 = getContext();
                context2.getClass();
                SVGALoader.with(context2).from("https://auto.tancdn.com/v1/raw/b1aecf5e-02b3-4bf4-bb0e-0e99a1be70e511.so").autoPlay(true).into(get_svga_loading());
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = height;
        setLayoutParams(layoutParams);
        e30<Integer> changeHeightListrener = getChangeHeightListrener();
        if (changeHeightListrener != null) {
            changeHeightListrener.call(Integer.valueOf(height));
        }
        get_bg_border().m42074a(height);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m42138c0() {
        if (get_svga_loading().isAnimating()) {
            return;
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/b1aecf5e-02b3-4bf4-bb0e-0e99a1be70e511.so").autoPlay(true).into(get_svga_loading());
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: d */
    public void mo41985d(@NotNull ConversationsList conversationsList) {
        conversationsList.getClass();
        this.conversationsList = conversationsList;
        m42104Q();
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: e */
    public boolean mo41986e() {
        return xdl0.m208349O0(get_getuser_layout()) || xdl0.m208349O0(get_impress_signal_layout());
    }

    /* JADX INFO: renamed from: e0 */
    public final void m42139e0(final OnlineMatchPushUser onlineMatchPushUser, boolean isMatch, final OnlineMatchMatchUser user) {
        HeaderState headerState = HeaderState.GetUserState;
        this.headerState = headerState;
        this.shouldShowTips = false;
        xdl0.m208344M(get_getuser_layout(), true);
        this.scrollState = headerState;
        m42107U(this, getLayoutParams().height, this.searchHeight, new d30() { // from class: l.eub0
            @Override // p149l.d30
            public final void call() {
                QuickChatHeaderView.m42129z(this.f93225a);
            }
        }, 0L, 8, null);
        get_getuser_layout().m42090v0(onlineMatchPushUser, isMatch, user, new f30() { // from class: l.fub0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                QuickChatHeaderView.m42116m(this.f99331a, user, onlineMatchPushUser, (Boolean) obj, (String) obj2);
            }
        }, new e30() { // from class: l.gub0
            @Override // p149l.e30
            public final void call(Object obj) {
                QuickChatHeaderView.m42099I(this.f104387a, onlineMatchPushUser, (Boolean) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: g */
    public void mo41988g(int height, boolean isAutoTopShow) {
        if (this.headerState == HeaderState.GetUserState) {
            return;
        }
        if (isAutoTopShow || m42103P()) {
            if (this.headerState == HeaderState.NormalState) {
                int iAbs = getLayoutParams().height + Math.abs(height);
                if (iAbs >= getDEFALUE_NORMAL_HEIGH()) {
                    iAbs = getDEFALUE_NORMAL_HEIGH();
                }
                if (isAutoTopShow) {
                    iAbs = getDEFALUE_NORMAL_HEIGH();
                }
                mo41984c(iAbs);
                return;
            }
            int iAbs2 = getLayoutParams().height + Math.abs(height);
            if (iAbs2 >= getLOADING_VIEW_HEIGHT()) {
                iAbs2 = getLOADING_VIEW_HEIGHT();
            }
            if (isAutoTopShow) {
                iAbs2 = getLOADING_VIEW_HEIGHT();
            }
            mo41984c(iAbs2);
            xdl0.m208344M(get_svga_loading(), true);
            if (get_svga_loading().isAnimating()) {
                return;
            }
            Context context = getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/b1aecf5e-02b3-4bf4-bb0e-0e99a1be70e511.so").autoPlay(true).into(get_svga_loading());
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final float m42140g0(int height) {
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

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getDEFALUE_NORMAL_HEIGH() {
        return this.DEFALUE_NORMAL_HEIGH;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getInitHeight() {
        int new_match_top_margin = getNEW_MATCH_TOP_MARGIN();
        if (upa.m194632F0() || upa.m194741d3() || upa.m194752g()) {
            new_match_top_margin = 0;
        }
        HeaderState headerState = this.headerState;
        if (headerState == HeaderState.NormalState || headerState == HeaderState.SearchState || headerState == HeaderState.GetUserState) {
            return new_match_top_margin + getLayoutParams().height;
        }
        return 0;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getLOADING_VIEW_HEIGHT() {
        return this.LOADING_VIEW_HEIGHT;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getMAX_PULL_VIEW_HEIGH() {
        return this.MAX_PULL_VIEW_HEIGH;
    }

    @Nullable
    public final c4g0 getSub() {
        return this.sub;
    }

    @NotNull
    public final QuickChatBgTopView get_bg_border() {
        QuickChatBgTopView quickChatBgTopView = this._bg_border;
        if (quickChatBgTopView != null) {
            return quickChatBgTopView;
        }
        Intrinsics.m87502r("_bg_border");
        return null;
    }

    @NotNull
    public final QuickChatHeaderUserView get_getuser_layout() {
        QuickChatHeaderUserView quickChatHeaderUserView = this._getuser_layout;
        if (quickChatHeaderUserView != null) {
            return quickChatHeaderUserView;
        }
        Intrinsics.m87502r("_getuser_layout");
        return null;
    }

    @NotNull
    public final ImpressSignalConversationHeadView get_impress_signal_layout() {
        ImpressSignalConversationHeadView impressSignalConversationHeadView = this._impress_signal_layout;
        if (impressSignalConversationHeadView != null) {
            return impressSignalConversationHeadView;
        }
        Intrinsics.m87502r("_impress_signal_layout");
        return null;
    }

    @NotNull
    public final VImage get_love() {
        VImage vImage = this._love;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_love");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_id() {
        SVGAnimationView sVGAnimationView = this._svga_id;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_id");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_loading() {
        SVGAnimationView sVGAnimationView = this._svga_loading;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_loading");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_love() {
        SVGAnimationView sVGAnimationView = this._svga_love;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_love");
        return null;
    }

    @NotNull
    public final VText get_text() {
        VText vText = this._text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_text");
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: h */
    public void mo41989h() {
        int i = C8163a.f25626a[this.headerState.ordinal()];
        if (i == 2) {
            setNormalState(0L);
            m42111d0();
        } else {
            if (i != 3) {
                return;
            }
            m42110X();
            m42111d0();
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: j */
    public int mo41991j() {
        if (this.headerState == HeaderState.SearchState && getLayoutParams().height <= getLOADING_VIEW_HEIGHT()) {
            return getLayoutParams().height;
        }
        if (this.headerState == HeaderState.NormalState && getLayoutParams().height <= getDEFALUE_NORMAL_HEIGH()) {
            return getLayoutParams().height;
        }
        postDelayed(new Runnable() { // from class: l.ptb0
            @Override // java.lang.Runnable
            public final void run() {
                QuickChatHeaderView.m42091A(this.f151155a);
            }
        }, 500L);
        ObjectAnimator objectAnimator = this.animatorPullLove;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        xdl0.m208344M(get_love(), false);
        if (getLayoutParams().height < this.maxViewHeightAllowSearch) {
            m42109W(this, 0L, 1, null);
            return getDEFALUE_NORMAL_HEIGH();
        }
        xdl0.m208344M(get_svga_love(), true);
        if (!get_svga_love().isAnimating()) {
            Context context = getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/f0bb0c23-c1ff-42e6-bfc9-a8071e960fa911.so").autoPlay(true).repeatCount(1).animListener(new C8166d()).into(get_svga_love());
        }
        m42110X();
        return getLOADING_VIEW_HEIGHT();
    }

    public final void setAnimatorPullLove(@Nullable ObjectAnimator objectAnimator) {
        this.animatorPullLove = objectAnimator;
    }

    public final void setConversationsList(@Nullable ConversationsList conversationsList) {
        this.conversationsList = conversationsList;
    }

    public final void setSub(@Nullable c4g0 c4g0Var) {
        this.sub = c4g0Var;
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
