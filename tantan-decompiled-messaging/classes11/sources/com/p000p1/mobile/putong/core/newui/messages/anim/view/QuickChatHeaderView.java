package com.p000p1.mobile.putong.core.newui.messages.anim.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.v;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.data.BannerLoc;
import com.p1.mobile.putong.data.ConversationCounter;
import com.p1.mobile.putong.data.Counter;
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
import l.ak50;
import l.c4g0;
import l.d30;
import l.e30;
import l.f30;
import l.ife;
import l.j760;
import l.jo0;
import l.l9r;
import l.mkd0;
import l.rub0;
import l.snm;
import l.svq;
import l.upa;
import l.vwb;
import l.w9j;
import l.wjc0;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.y9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.mqi0;
import p009l.o7r;
import p009l.w5j0;
import p009l.yij0;
import rx.subjects.a;
import v.VImage;
import v.VLinear;
import v.VList;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002Æ\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u0019\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010#J1\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J+\u00101\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010.\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u0010\fJ\u000f\u00104\u001a\u00020\u000fH\u0002¢\u0006\u0004\b4\u00105J\u001f\u0010;\u001a\u00020:2\u0006\u00107\u001a\u0002062\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u00105J\u0015\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020!¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0006H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0006H\u0016¢\u0006\u0004\bI\u0010DJ\u001f\u0010K\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020!H\u0016¢\u0006\u0004\bM\u0010@J\u000f\u0010N\u001a\u00020\u000fH\u0016¢\u0006\u0004\bN\u00105J\u000f\u0010O\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010\fR\"\u0010V\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\"\u0010]\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010Q\u001a\u0004\b[\u0010S\"\u0004\b\\\u0010UR\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010\u0089\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010DR\u001e\u0010\u008c\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a\u0005\b\u008b\u0001\u0010DR\u001e\u0010\u008f\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u0087\u0001\u001a\u0005\b\u008e\u0001\u0010DR\u0017\u0010\u0091\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0087\u0001R\u001a\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010\u0017R\u0017\u0010\u0099\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0087\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0087\u0001R\u0017\u0010\u009d\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0087\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0087\u0001R\u0019\u0010¡\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0087\u0001R\u0019\u0010£\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u0087\u0001R,\u0010«\u0001\u001a\u0005\u0018\u00010¤\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R)\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0005\b°\u0001\u0010HR\u001a\u0010´\u0001\u001a\u00030±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001a\u0010¶\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0094\u0001R,\u0010¾\u0001\u001a\u0005\u0018\u00010·\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\u001c\u0010Â\u0001\u001a\u0005\u0018\u00010¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001c\u0010Ä\u0001\u001a\u0005\u0018\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010¹\u0001R\u0018\u0010Å\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0017¨\u0006Ç\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Q", "()V", "", "key", "", "O", "(Ljava/lang/String;)Z", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "onlineMatchPushUser", "b0", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;)V", "c0", "Z", "d0", "R", "", "speedDuration", "setNormalState", "(J)V", "X", "a0", "height", "", "h0", "(I)F", "g0", "startValue", "endValue", "Ll/d30;", "endAction", "setDuration", "T", "(IILl/d30;J)V", "Y", "(Ljava/lang/String;)V", "isMatch", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;", "user", "e0", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;ZLcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;)V", "N", "P", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "M", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "headViewHeight", "S", "(F)Z", "c", "(I)V", "j", "()I", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", "d", "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "b", "e", "h", "Lcom/tantan/library/svga/SVGAnimationView;", "Lcom/tantan/library/svga/SVGAnimationView;", "get_svga_id", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_id", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_id", "i", "get_svga_love", "set_svga_love", "_svga_love", "get_svga_loading", "set_svga_loading", "_svga_loading", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;", "k", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;", "get_bg_border", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;", "set_bg_border", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;)V", "_bg_border", "Lv/VImage;", "l", "Lv/VImage;", "get_love", "()Lv/VImage;", "set_love", "(Lv/VImage;)V", "_love", "Lv/VText;", "m", "Lv/VText;", "get_text", "()Lv/VText;", "set_text", "(Lv/VText;)V", "_text", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;", "n", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;", "get_getuser_layout", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;", "set_getuser_layout", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderUserView;)V", "_getuser_layout", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;", "o", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;", "get_impress_signal_layout", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;", "set_impress_signal_layout", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/ImpressSignalConversationHeadView;)V", "_impress_signal_layout", "p", "I", "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", "q", "getLOADING_VIEW_HEIGHT", "LOADING_VIEW_HEIGHT", "r", "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", "s", "maxViewHeightAllowSearch", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$HeaderState;", "t", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$HeaderState;", "headerState", "u", "isBottomPlayedVibrateAnim", "v", "loveAnimStart", "w", "textShowStart", "x", "searchShowUser", "y", "searchHeight", "z", "suggestConHeight", "A", "impressConHeight", "Landroid/animation/ObjectAnimator;", "B", "Landroid/animation/ObjectAnimator;", "getAnimatorPullLove", "()Landroid/animation/ObjectAnimator;", "setAnimatorPullLove", "(Landroid/animation/ObjectAnimator;)V", "animatorPullLove", "C", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "getConversationsList", "()Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "setConversationsList", "Ll/w5j0;", "D", "Ll/w5j0;", "trackForQuickChat5", "E", "scrollState", "Ll/c4g0;", "F", "Ll/c4g0;", "getSub", "()Ll/c4g0;", "setSub", "(Ll/c4g0;)V", "sub", "Landroid/animation/ValueAnimator;", "G", "Landroid/animation/ValueAnimator;", "scrollAnim", "H", "subTipsAnim", "shouldShowTips", "HeaderState", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$HeaderState;", "", "<init>", "(Ljava/lang/String;I)V", "NormalState", "SearchState", "GetUserState", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum HeaderState {
        NormalState,
        SearchState,
        GetUserState;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        @NotNull
        public static EnumEntries<HeaderState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0327a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4404a;

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
            f4404a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0328b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f4405a;

        public C0328b(d30 d30Var) {
            this.f4405a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f4405a.call();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0329c extends AnimatorListenerAdapter {
        public C0329c() {
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
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderView$d", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0330d extends AnimListener {
        public C0330d() {
        }

        public void onFinished() {
            xdl0.M(QuickChatHeaderView.this.get_svga_love(), false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.DEFALUE_NORMAL_HEIGH = svq.c(4);
        this.LOADING_VIEW_HEIGHT = svq.c(24);
        this.MAX_PULL_VIEW_HEIGH = svq.c(160);
        this.maxViewHeightAllowSearch = svq.c(80);
        HeaderState headerState = HeaderState.NormalState;
        this.headerState = headerState;
        this.loveAnimStart = svq.c(80);
        this.textShowStart = svq.c(98);
        this.searchShowUser = svq.c(80);
        this.searchHeight = svq.c(102);
        this.suggestConHeight = svq.c(178);
        this.impressConHeight = svq.c(219);
        this.scrollState = headerState;
        LayoutInflater layoutInflaterM19649a = o7r.m19649a(getContext());
        layoutInflaterM19649a.getClass();
        m6272M(layoutInflaterM19649a, this);
        this.trackForQuickChat5 = new w5j0();
        m6247R();
    }

    /* JADX INFO: renamed from: A */
    public static void m6233A(QuickChatHeaderView quickChatHeaderView) {
        quickChatHeaderView.isBottomPlayedVibrateAnim = false;
    }

    /* JADX INFO: renamed from: C */
    public static j760 m6235C(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static xaj0 m6236D(Counter counter, ConversationCounter conversationCounter, boolean z) {
        counter.getClass();
        conversationCounter.getClass();
        return new xaj0(counter, conversationCounter, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: E */
    public static xaj0 m6237E(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (xaj0) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: F */
    public static void m6238F(QuickChatHeaderView quickChatHeaderView) {
        HeaderState headerState = quickChatHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        xdl0.M(quickChatHeaderView.get_getuser_layout(), false);
        xdl0.M(quickChatHeaderView.get_svga_loading(), false);
        SVGAnimationView.stopAnimation$default(quickChatHeaderView.get_svga_loading(), false, 1, (Object) null);
        quickChatHeaderView.headerState = headerState2;
        quickChatHeaderView.m6273N();
    }

    /* JADX INFO: renamed from: G */
    public static void m6239G(QuickChatHeaderView quickChatHeaderView) {
        HeaderState headerState = quickChatHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        xdl0.M(quickChatHeaderView.get_svga_loading(), false);
        SVGAnimationView.stopAnimation$default(quickChatHeaderView.get_svga_loading(), false, 1, (Object) null);
        xdl0.M(quickChatHeaderView.get_getuser_layout(), false);
        quickChatHeaderView.headerState = headerState2;
        quickChatHeaderView.m6273N();
    }

    /* JADX INFO: renamed from: H */
    public static void m6240H(final QuickChatHeaderView quickChatHeaderView, Boolean bool) {
        ConversationsList conversationsList;
        VList vList;
        ConversationsList conversationsList2;
        VLinear vLinear;
        VList vList2;
        if (!bool.booleanValue()) {
            quickChatHeaderView.setNormalState(500L);
            return;
        }
        ConversationsList conversationsList3 = quickChatHeaderView.conversationsList;
        if ((conversationsList3 != null && (vList2 = conversationsList3.f3883V) != null && vList2.getCount() == 0) || ((conversationsList = quickChatHeaderView.conversationsList) != null && (vList = conversationsList.f3883V) != null && vList.getFirstVisiblePosition() == 0 && (conversationsList2 = quickChatHeaderView.conversationsList) != null && (vLinear = conversationsList2.f3863E0) != null && vLinear.getTop() == 0)) {
            quickChatHeaderView.scrollState = HeaderState.SearchState;
            quickChatHeaderView.m6248T(quickChatHeaderView.getLayoutParams().height, quickChatHeaderView.getLOADING_VIEW_HEIGHT(), new d30() { // from class: l.dub0
                public final void call() {
                    QuickChatHeaderView.setSearchState$lambda$0$0(this.f12000a);
                }
            }, 500L);
        } else {
            xdl0.M(quickChatHeaderView.get_text(), false);
            xdl0.M(quickChatHeaderView.get_love(), false);
            quickChatHeaderView.headerState = HeaderState.SearchState;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m6241I(QuickChatHeaderView quickChatHeaderView, OnlineMatchPushUser onlineMatchPushUser, Boolean bool) {
        m6251W(quickChatHeaderView, 0L, 1, null);
        if (bool.booleanValue()) {
            quickChatHeaderView.trackForQuickChat5.m23908f();
            return;
        }
        w5j0.m23902i(quickChatHeaderView.trackForQuickChat5, false, null, null, 6, null);
        CoreModule.c.D0.L4(onlineMatchPushUser);
        quickChatHeaderView.get_getuser_layout().setBroadcastTextTimerValue(-1L);
        quickChatHeaderView.trackForQuickChat5.m23913m();
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m6242J(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static j760 m6243K(TabName tabName, c cVar) {
        return vwb.Y(tabName, cVar);
    }

    /* JADX INFO: renamed from: L */
    public static void m6244L(QuickChatHeaderView quickChatHeaderView, xaj0 xaj0Var) {
        int iB = wjc0.b((Counter) xaj0Var.a, (ConversationCounter) xaj0Var.b, (Boolean) xaj0Var.c);
        if (!OnlineMatchManager.z().n0() || iB > ((Number) OnlineMatchManager.z().b.get()).intValue()) {
            quickChatHeaderView.shouldShowTips = false;
            quickChatHeaderView.get_bg_border().m6217b(quickChatHeaderView.shouldShowTips);
        } else {
            quickChatHeaderView.shouldShowTips = true;
            quickChatHeaderView.get_bg_border().m6217b(quickChatHeaderView.shouldShowTips);
            OnlineMatchManager.z().k0();
        }
        OnlineMatchManager.z().b.put(Integer.valueOf(iB));
        yij0.m25399U(quickChatHeaderView.subTipsAnim);
    }

    /* JADX INFO: renamed from: P */
    private final boolean m6245P() {
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList == null) {
            return false;
        }
        if (conversationsList.f3883V.getCount() != 0) {
            return conversationsList.f3883V.getFirstVisiblePosition() == 0 && conversationsList.f3863E0.getTop() == 0 && conversationsList.f3863E0.f3955m.getLayoutParams().height == getInitHeight();
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    private final void m6246Q() {
        Act act = getAct();
        a aVar = OnlineMatchManager.z().I;
        NewMainAct act2 = getAct();
        act2.getClass();
        rx.c<TabName> cVarM3895i7 = act2.m3895i7();
        final Function2 function2 = new Function2() { // from class: l.qub0
            public final Object invoke(Object obj, Object obj2) {
                return QuickChatHeaderView.m6264s((j760) obj, (TabName) obj2);
            }
        };
        rx.c cVarDuringCreated = act.duringCreated(mkd0.r(aVar, cVarM3895i7, new x9j() { // from class: l.rtb0
            public final Object call(Object obj, Object obj2) {
                return QuickChatHeaderView.m6265t(function2, obj, obj2);
            }
        }));
        final Function1 function1 = new Function1() { // from class: l.stb0
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m6266u((j760) obj);
            }
        };
        rx.c cVarFilter = cVarDuringCreated.filter(new w9j() { // from class: l.ttb0
            public final Object call(Object obj) {
                return QuickChatHeaderView.m6270y(function1, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.utb0
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m6269x((j760) obj);
            }
        };
        rx.c map = cVarFilter.map(new w9j() { // from class: l.vtb0
            public final Object call(Object obj) {
                return QuickChatHeaderView.m6235C(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.wtb0
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m6261p((j760) obj);
            }
        };
        map.filter(new w9j() { // from class: l.xtb0
            public final Object call(Object obj) {
                return QuickChatHeaderView.m6242J(function4, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ytb0
            public final void call(Object obj) {
                QuickChatHeaderView.m6268w(this.f23226a, (j760) obj);
            }
        }));
        Act act3 = getAct();
        NewMainAct act4 = getAct();
        act4.getClass();
        act3.duringCreated(mkd0.r(act4.m3895i7(), getAct().lifecycle(), new x9j() { // from class: l.ztb0
            public final Object call(Object obj, Object obj2) {
                return QuickChatHeaderView.m6243K((TabName) obj, (c) obj2);
            }
        }), false).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.qtb0
            public final void call(Object obj) {
                QuickChatHeaderView.m6260o(this.f19523a, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    private final void m6247R() {
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getLayoutParams().height = getDEFALUE_NORMAL_HEIGH();
        get_bg_border().m6216a(getDEFALUE_NORMAL_HEIGH());
        ViewGroup.LayoutParams layoutParams = get_svga_id().getLayoutParams();
        this.searchHeight = svq.c(164);
        layoutParams.height = svq.c(164);
        get_getuser_layout().setLayoutParams(new RelativeLayout.LayoutParams(-1, this.searchHeight));
        get_svga_id().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: T */
    private final void m6248T(int startValue, int endValue, d30 endAction, long setDuration) {
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
                    QuickChatHeaderView.m6250V(this.f10314a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new C0328b(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m6249U(QuickChatHeaderView quickChatHeaderView, int i, int i2, d30 d30Var, long j, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            j = 300;
        }
        quickChatHeaderView.m6248T(i, i2, d30Var, j);
    }

    /* JADX INFO: renamed from: V */
    public static final void m6250V(QuickChatHeaderView quickChatHeaderView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        quickChatHeaderView.mo6126c(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m6251W(QuickChatHeaderView quickChatHeaderView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        quickChatHeaderView.setNormalState(j);
    }

    /* JADX INFO: renamed from: X */
    private final void m6252X() {
        if (this.headerState != HeaderState.SearchState) {
            setOnClickListener(null);
            yij0.m25399U(this.sub);
            this.shouldShowTips = false;
            get_getuser_layout().m6231u0();
            com.p1.mobile.putong.core.ui.onlinematch.c.Companion.a().i(0L);
            get_getuser_layout().setBroadcastTextTimerValue(-1L);
            OnlineMatchManager.z().u0(getAct(), new e30() { // from class: l.pub0
                public final void call(Object obj) {
                    QuickChatHeaderView.m6240H(this.f18921a, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m6253d0() {
        ObjectAnimator objectAnimator = this.animatorPullLove;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        get_svga_id().stopAnimation(false);
        SVGAnimationView.stopAnimation$default(get_svga_love(), false, 1, (Object) null);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, (Object) null);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m6254f0(QuickChatHeaderView quickChatHeaderView) {
        m6251W(quickChatHeaderView, 0L, 1, null);
    }

    /* JADX INFO: renamed from: h0 */
    private final float m6255h0(int height) {
        return (((((height - this.textShowStart) * 1.0f) / (getMAX_PULL_VIEW_HEIGH() - this.textShowStart)) * 70.0f) + 30.0f) / 100.0f;
    }

    /* JADX INFO: renamed from: k */
    public static Boolean m6256k(ife.a aVar) {
        return Boolean.valueOf(ife.o().k(BannerLoc.get("conversation")));
    }

    /* JADX INFO: renamed from: m */
    public static void m6258m(final QuickChatHeaderView quickChatHeaderView, OnlineMatchMatchUser onlineMatchMatchUser, OnlineMatchPushUser onlineMatchPushUser, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            w5j0.m23901b(quickChatHeaderView.trackForQuickChat5, !TextUtils.isEmpty(str), false, null, null, 12, null);
            OnlineMatchManager.z().r0(quickChatHeaderView.getAct(), onlineMatchPushUser, new d30() { // from class: l.iub0
                public final void call() {
                    QuickChatHeaderView.m6254f0(this.f14814a);
                }
            }, str);
        } else {
            m6251W(quickChatHeaderView, 0L, 1, null);
            quickChatHeaderView.trackForQuickChat5.m23907e(!TextUtils.isEmpty(str));
            quickChatHeaderView.getAct().startActivity(MessagesAct.p2(quickChatHeaderView.getAct(), onlineMatchMatchUser != null ? onlineMatchMatchUser.userId : null, false, false, false, false, (Intent) null, 7, str));
        }
    }

    /* JADX INFO: renamed from: n */
    public static Boolean m6259n(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static void m6260o(QuickChatHeaderView quickChatHeaderView, j760 j760Var) {
        if ((j760Var != null ? (c) j760Var.b : null) == c.i) {
            if ((j760Var != null ? (TabName) j760Var.a : null) == TabName.Msg) {
                int i = C0327a.f4404a[quickChatHeaderView.headerState.ordinal()];
                if (i == 1) {
                    quickChatHeaderView.m6277Z();
                    quickChatHeaderView.m6279b0(com.p1.mobile.putong.core.ui.onlinematch.c.Companion.a().g());
                    if (quickChatHeaderView.get_getuser_layout().getBroadcastTextTimerValue() > 0) {
                        quickChatHeaderView.get_getuser_layout().m6230t0();
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    quickChatHeaderView.m6273N();
                    quickChatHeaderView.m6277Z();
                    return;
                } else if (i != 3) {
                    l9r.a();
                    return;
                } else {
                    quickChatHeaderView.m6280c0();
                    quickChatHeaderView.m6277Z();
                    return;
                }
            }
        }
        yij0.m25399U(quickChatHeaderView.sub);
        quickChatHeaderView.get_getuser_layout().m6231u0();
        quickChatHeaderView.m6253d0();
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m6261p(j760 j760Var) {
        j760Var.getClass();
        return Boolean.valueOf((j760Var == v.b0 || TextUtils.isEmpty(CoreModule.H().userId())) ? false : true);
    }

    /* JADX INFO: renamed from: q */
    public static void m6262q(QuickChatHeaderView quickChatHeaderView, OnlineMatchPushUser onlineMatchPushUser, long j) {
        com.p1.mobile.putong.core.ui.onlinematch.c.a aVar = com.p1.mobile.putong.core.ui.onlinematch.c.Companion;
        if (aVar.a().h()) {
            yij0.m25399U(quickChatHeaderView.sub);
            m6251W(quickChatHeaderView, 0L, 1, null);
            boolean zD = aVar.a().d();
            w5j0 w5j0Var = quickChatHeaderView.trackForQuickChat5;
            if (zD) {
                w5j0Var.m23908f();
                return;
            }
            w5j0Var.m23913m();
            quickChatHeaderView.get_getuser_layout().setBroadcastTextTimerValue(-1L);
            aVar.a().i(0L);
            CoreModule.c.D0.L4(onlineMatchPushUser);
        }
    }

    /* JADX INFO: renamed from: s */
    public static j760 m6264s(j760 j760Var, TabName tabName) {
        return new j760(j760Var, tabName);
    }

    private final void setNormalState(long speedDuration) {
        ConversationsList conversationsList;
        VList vList;
        ConversationsList conversationsList2;
        VLinear vLinear;
        VList vList2;
        HeaderState headerState = this.headerState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState == headerState2 && getLayoutParams().height == getDEFALUE_NORMAL_HEIGH() && getLayoutParams().height == 0) {
            return;
        }
        setOnClickListener(null);
        yij0.m25399U(this.sub);
        get_getuser_layout().m6231u0();
        com.p1.mobile.putong.core.ui.onlinematch.c.Companion.a().i(0L);
        get_getuser_layout().setBroadcastTextTimerValue(-1L);
        ConversationsList conversationsList3 = this.conversationsList;
        if ((conversationsList3 == null || (vList2 = conversationsList3.f3883V) == null || vList2.getCount() != 0) && ((conversationsList = this.conversationsList) == null || (vList = conversationsList.f3883V) == null || vList.getFirstVisiblePosition() != 0 || (conversationsList2 = this.conversationsList) == null || (vLinear = conversationsList2.f3863E0) == null || vLinear.getTop() != 0)) {
            this.scrollState = headerState2;
            m6248T(getLayoutParams().height, 0, new d30() { // from class: l.oub0
                public final void call() {
                    QuickChatHeaderView.m6239G(this.f18253a);
                }
            }, speedDuration);
        } else {
            this.scrollState = headerState2;
            m6248T(getLayoutParams().height, getDEFALUE_NORMAL_HEIGH(), new d30() { // from class: l.nub0
                public final void call() {
                    QuickChatHeaderView.m6238F(this.f17743a);
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
        quickChatHeaderView.get_bg_border().m6217b(true);
        quickChatHeaderView.headerState = headerState2;
        xdl0.M(quickChatHeaderView.get_svga_loading(), true);
        if (!quickChatHeaderView.get_svga_loading().isAnimating()) {
            Context context = quickChatHeaderView.getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/b1aecf5e-02b3-4bf4-bb0e-0e99a1be70e511.so").autoPlay(true).into(quickChatHeaderView.get_svga_loading());
        }
        xdl0.M(quickChatHeaderView.get_text(), false);
        xdl0.M(quickChatHeaderView.get_love(), false);
    }

    /* JADX INFO: renamed from: t */
    public static j760 m6265t(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: u */
    public static Boolean m6266u(j760 j760Var) {
        return Boolean.valueOf(j760Var.b == TabName.Msg);
    }

    /* JADX INFO: renamed from: v */
    public static void m6267v() {
    }

    /* JADX INFO: renamed from: w */
    public static void m6268w(QuickChatHeaderView quickChatHeaderView, j760 j760Var) {
        j760Var.getClass();
        String str = (String) j760Var.a;
        Object obj = j760Var.b;
        if (Intrinsics.d(str, "notify_search")) {
            quickChatHeaderView.m6252X();
        } else if (Intrinsics.d("match_success", str)) {
            com.p1.mobile.putong.core.ui.onlinematch.c.a aVar = com.p1.mobile.putong.core.ui.onlinematch.c.Companion;
            if (aVar.a().h()) {
                OnlineMatchManager.z().I.onNext(v.b0);
                aVar.a().i(0L);
                m6251W(quickChatHeaderView, 0L, 1, null);
                return;
            } else {
                if (quickChatHeaderView.headerState == HeaderState.GetUserState) {
                    OnlineMatchManager.z().I.onNext(v.b0);
                    return;
                }
                w5j0 w5j0Var = quickChatHeaderView.trackForQuickChat5;
                obj.getClass();
                OnlineMatchMatchUser onlineMatchMatchUser = (OnlineMatchMatchUser) obj;
                w5j0Var.m23909g(onlineMatchMatchUser);
                aVar.a().j();
                quickChatHeaderView.m6279b0(null);
                quickChatHeaderView.m6281e0(null, true, onlineMatchMatchUser);
            }
        } else if (Intrinsics.d("match_timeout", str)) {
            ak50.Companion.a().H(quickChatHeaderView.getAct(), "match_timeout");
            m6251W(quickChatHeaderView, 0L, 1, null);
        } else if (Intrinsics.d("tickets_broadcast", str)) {
            if (quickChatHeaderView.headerState == HeaderState.GetUserState) {
                return;
            }
            QuickChatHeaderUserView quickChatHeaderUserView = quickChatHeaderView.get_getuser_layout();
            obj.getClass();
            OnlineMatchPushUser onlineMatchPushUser = (OnlineMatchPushUser) obj;
            quickChatHeaderUserView.setReceiverUserIsFemale(onlineMatchPushUser.isFemale());
            quickChatHeaderView.get_getuser_layout().setBroadcastTextTimerValue(mqi0.m18550o());
            quickChatHeaderView.get_getuser_layout().m6230t0();
            com.p1.mobile.putong.core.ui.onlinematch.c.a aVar2 = com.p1.mobile.putong.core.ui.onlinematch.c.Companion;
            if (aVar2.a().h()) {
                OnlineMatchManager.z().I.onNext(v.b0);
                aVar2.a().i(0L);
                m6251W(quickChatHeaderView, 0L, 1, null);
                CoreModule.c.D0.L4((OnlineMatchPushUser) null);
                return;
            }
            w5j0.m23903l(quickChatHeaderView.trackForQuickChat5, onlineMatchPushUser, null, null, 6, null);
            aVar2.a().l(onlineMatchPushUser, false);
            quickChatHeaderView.m6279b0(onlineMatchPushUser);
            quickChatHeaderView.m6281e0(onlineMatchPushUser, false, null);
        } else if (Intrinsics.d("notify_normal_state", str)) {
            m6251W(quickChatHeaderView, 0L, 1, null);
        }
        if (quickChatHeaderView.m6274O(str)) {
            return;
        }
        OnlineMatchManager.z().I.onNext(v.b0);
    }

    /* JADX INFO: renamed from: x */
    public static j760 m6269x(j760 j760Var) {
        j760Var.getClass();
        j760 j760Var2 = (j760) j760Var.a;
        return j760Var2 == null ? v.b0 : j760Var2;
    }

    /* JADX INFO: renamed from: y */
    public static Boolean m6270y(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static void m6271z(QuickChatHeaderView quickChatHeaderView) {
        quickChatHeaderView.get_bg_border().m6217b(true);
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final View m6272M(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = rub0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: N */
    public final void m6273N() {
        rx.c cVarN3 = CoreModule.c.n3();
        rx.c cVarQe = CoreModule.c.f0.Qe();
        a aVar = ife.o().a;
        final Function1 function1 = new Function1() { // from class: l.aub0
            public final Object invoke(Object obj) {
                return QuickChatHeaderView.m6256k((ife.a) obj);
            }
        };
        rx.c cVarDistinctUntilChanged = aVar.map(new w9j() { // from class: l.jub0
            public final Object call(Object obj) {
                return QuickChatHeaderView.m6259n(function1, obj);
            }
        }).distinctUntilChanged();
        final Function3 function3 = new Function3() { // from class: l.kub0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return QuickChatHeaderView.m6236D((Counter) obj, (ConversationCounter) obj2, ((Boolean) obj3).booleanValue());
            }
        };
        this.subTipsAnim = mkd0.s(cVarN3, cVarQe, cVarDistinctUntilChanged, new y9j() { // from class: l.lub0
            /* JADX INFO: renamed from: a */
            public final Object m18058a(Object obj, Object obj2, Object obj3) {
                return QuickChatHeaderView.m6237E(function3, obj, obj2, obj3);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.mub0
            public final void call(Object obj) {
                QuickChatHeaderView.m6244L(this.f17112a, (xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public final boolean m6274O(String key) {
        if (Intrinsics.d("impress_conv_state", key)) {
            m6276Y(key);
            return true;
        }
        if (!Intrinsics.d("impress_conv_state_default", key)) {
            return false;
        }
        j760 j760Var = v.b0;
        if (Intrinsics.d(j760Var, snm.c) || Intrinsics.d("notify_normal_state", (String) snm.c.a)) {
            m6251W(this, 0L, 1, null);
            OnlineMatchManager.z().I.onNext(j760Var);
        } else {
            OnlineMatchManager.z().I.onNext(snm.c);
            snm.c = j760Var;
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m6275S(float headViewHeight) {
        return this.headerState == HeaderState.SearchState && headViewHeight >= ((float) getLOADING_VIEW_HEIGHT());
    }

    /* JADX INFO: renamed from: Y */
    public final void m6276Y(String key) {
        HeaderState headerState = HeaderState.GetUserState;
        this.headerState = headerState;
        this.scrollState = headerState;
        get_impress_signal_layout().m6093J();
        xdl0.M(get_impress_signal_layout(), true);
        xdl0.M(get_getuser_layout(), false);
        xdl0.M(get_bg_border(), false);
        xdl0.M(get_svga_id(), false);
        if (Intrinsics.d(key, "impress_conv_state")) {
            get_impress_signal_layout().m6089D();
        }
        m6249U(this, getLayoutParams().height, this.impressConHeight + getDEFALUE_NORMAL_HEIGH(), new d30() { // from class: l.hub0
            public final void call() {
                QuickChatHeaderView.m6267v();
            }
        }, 0L, 8, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m6277Z() {
        if (get_svga_id().isAnimating()) {
            return;
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/f521473f-9607-407e-bc7a-a6799d48bfbb10.so").autoPlay(true).into(get_svga_id());
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo6124a() {
        HeaderState headerState = this.headerState;
        return headerState == HeaderState.NormalState || headerState == HeaderState.SearchState;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m6278a0() {
        ObjectAnimator objectAnimator = this.animatorPullLove;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(get_love(), "translationY", svq.c(10), -svq.c(22));
            objectAnimatorOfFloat.addListener(new C0329c());
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(2);
            objectAnimatorOfFloat.setDuration(250L);
            objectAnimatorOfFloat.start();
            this.animatorPullLove = objectAnimatorOfFloat;
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: b */
    public boolean mo6125b(float headViewHeight) {
        return m6275S(headViewHeight);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m6279b0(final OnlineMatchPushUser onlineMatchPushUser) {
        if (com.p1.mobile.putong.core.ui.onlinematch.c.Companion.a().e() == 0) {
            return;
        }
        yij0.m25399U(this.sub);
        this.sub = rx.c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.cub0
            public final void call(Object obj) {
                QuickChatHeaderView.m6262q(this.f10770a, onlineMatchPushUser, ((Long) obj).longValue());
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: c */
    public void mo6126c(int height) {
        HeaderState headerState = this.headerState;
        if (headerState == HeaderState.NormalState) {
            if (height > this.textShowStart) {
                xdl0.M(get_text(), true);
                get_text().setAlpha(m6255h0(height));
            } else {
                xdl0.M(get_text(), false);
            }
            if (this.scrollState != HeaderState.SearchState && height >= svq.c(24)) {
                xdl0.M(get_love(), true);
            } else {
                xdl0.M(get_love(), false);
            }
            if (height > this.loveAnimStart) {
                m6278a0();
            } else {
                get_love().setTranslationY(0.0f);
                ObjectAnimator objectAnimator = this.animatorPullLove;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
            }
            if (height >= this.maxViewHeightAllowSearch && !this.isBottomPlayedVibrateAnim) {
                this.isBottomPlayedVibrateAnim = true;
                Act context = getContext();
                context.getClass();
                Object systemService = context.getSystemService("vibrator");
                systemService.getClass();
                Vibrator vibrator = (Vibrator) systemService;
                vibrator.vibrate(500L);
                vibrator.vibrate(new long[]{100, 100}, -1);
            }
            xdl0.M(get_svga_loading(), false);
            SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, (Object) null);
        } else if (headerState == HeaderState.GetUserState) {
            xdl0.M(get_text(), false);
            ObjectAnimator objectAnimator2 = this.animatorPullLove;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            xdl0.M(get_love(), false);
            if (height > this.searchShowUser) {
                get_getuser_layout().setAlpha(m6282g0(height));
            } else {
                get_getuser_layout().setAlpha(0.0f);
            }
            xdl0.M(get_svga_loading(), false);
            SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, (Object) null);
        } else if (headerState == HeaderState.SearchState) {
            xdl0.M(get_svga_loading(), true);
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
        get_bg_border().m6216a(height);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m6280c0() {
        if (get_svga_loading().isAnimating()) {
            return;
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/b1aecf5e-02b3-4bf4-bb0e-0e99a1be70e511.so").autoPlay(true).into(get_svga_loading());
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: d */
    public void mo6127d(@NotNull ConversationsList conversationsList) {
        conversationsList.getClass();
        this.conversationsList = conversationsList;
        m6246Q();
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: e */
    public boolean mo6128e() {
        return xdl0.O0(get_getuser_layout()) || xdl0.O0(get_impress_signal_layout());
    }

    /* JADX INFO: renamed from: e0 */
    public final void m6281e0(final OnlineMatchPushUser onlineMatchPushUser, boolean isMatch, final OnlineMatchMatchUser user) {
        HeaderState headerState = HeaderState.GetUserState;
        this.headerState = headerState;
        this.shouldShowTips = false;
        xdl0.M(get_getuser_layout(), true);
        this.scrollState = headerState;
        m6249U(this, getLayoutParams().height, this.searchHeight, new d30() { // from class: l.eub0
            public final void call() {
                QuickChatHeaderView.m6271z(this.f12689a);
            }
        }, 0L, 8, null);
        get_getuser_layout().m6232v0(onlineMatchPushUser, isMatch, user, new f30() { // from class: l.fub0
            public final void call(Object obj, Object obj2) {
                QuickChatHeaderView.m6258m(this.f13168a, user, onlineMatchPushUser, (Boolean) obj, (String) obj2);
            }
        }, new e30() { // from class: l.gub0
            public final void call(Object obj) {
                QuickChatHeaderView.m6241I(this.f13754a, onlineMatchPushUser, (Boolean) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: g */
    public void mo6130g(int height, boolean isAutoTopShow) {
        if (this.headerState == HeaderState.GetUserState) {
            return;
        }
        if (isAutoTopShow || m6245P()) {
            if (this.headerState == HeaderState.NormalState) {
                int iAbs = getLayoutParams().height + Math.abs(height);
                if (iAbs >= getDEFALUE_NORMAL_HEIGH()) {
                    iAbs = getDEFALUE_NORMAL_HEIGH();
                }
                if (isAutoTopShow) {
                    iAbs = getDEFALUE_NORMAL_HEIGH();
                }
                mo6126c(iAbs);
                return;
            }
            int iAbs2 = getLayoutParams().height + Math.abs(height);
            if (iAbs2 >= getLOADING_VIEW_HEIGHT()) {
                iAbs2 = getLOADING_VIEW_HEIGHT();
            }
            if (isAutoTopShow) {
                iAbs2 = getLOADING_VIEW_HEIGHT();
            }
            mo6126c(iAbs2);
            xdl0.M(get_svga_loading(), true);
            if (get_svga_loading().isAnimating()) {
                return;
            }
            Context context = getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/b1aecf5e-02b3-4bf4-bb0e-0e99a1be70e511.so").autoPlay(true).into(get_svga_loading());
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final float m6282g0(int height) {
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

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getDEFALUE_NORMAL_HEIGH() {
        return this.DEFALUE_NORMAL_HEIGH;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getInitHeight() {
        int new_match_top_margin = getNEW_MATCH_TOP_MARGIN();
        if (upa.F0() || upa.d3() || upa.g()) {
            new_match_top_margin = 0;
        }
        HeaderState headerState = this.headerState;
        if (headerState == HeaderState.NormalState || headerState == HeaderState.SearchState || headerState == HeaderState.GetUserState) {
            return new_match_top_margin + getLayoutParams().height;
        }
        return 0;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getLOADING_VIEW_HEIGHT() {
        return this.LOADING_VIEW_HEIGHT;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
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
        Intrinsics.r("_bg_border");
        return null;
    }

    @NotNull
    public final QuickChatHeaderUserView get_getuser_layout() {
        QuickChatHeaderUserView quickChatHeaderUserView = this._getuser_layout;
        if (quickChatHeaderUserView != null) {
            return quickChatHeaderUserView;
        }
        Intrinsics.r("_getuser_layout");
        return null;
    }

    @NotNull
    public final ImpressSignalConversationHeadView get_impress_signal_layout() {
        ImpressSignalConversationHeadView impressSignalConversationHeadView = this._impress_signal_layout;
        if (impressSignalConversationHeadView != null) {
            return impressSignalConversationHeadView;
        }
        Intrinsics.r("_impress_signal_layout");
        return null;
    }

    @NotNull
    public final VImage get_love() {
        VImage vImage = this._love;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_love");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_id() {
        SVGAnimationView sVGAnimationView = this._svga_id;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_svga_id");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_loading() {
        SVGAnimationView sVGAnimationView = this._svga_loading;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_svga_loading");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_love() {
        SVGAnimationView sVGAnimationView = this._svga_love;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_svga_love");
        return null;
    }

    @NotNull
    public final VText get_text() {
        VText vText = this._text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_text");
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: h */
    public void mo6131h() {
        int i = C0327a.f4404a[this.headerState.ordinal()];
        if (i == 2) {
            setNormalState(0L);
            m6253d0();
        } else {
            if (i != 3) {
                return;
            }
            m6252X();
            m6253d0();
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: j */
    public int mo6133j() {
        if (this.headerState == HeaderState.SearchState && getLayoutParams().height <= getLOADING_VIEW_HEIGHT()) {
            return getLayoutParams().height;
        }
        if (this.headerState == HeaderState.NormalState && getLayoutParams().height <= getDEFALUE_NORMAL_HEIGH()) {
            return getLayoutParams().height;
        }
        postDelayed(new Runnable() { // from class: l.ptb0
            @Override // java.lang.Runnable
            public final void run() {
                QuickChatHeaderView.m6233A(this.f18900a);
            }
        }, 500L);
        ObjectAnimator objectAnimator = this.animatorPullLove;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        xdl0.M(get_love(), false);
        if (getLayoutParams().height < this.maxViewHeightAllowSearch) {
            m6251W(this, 0L, 1, null);
            return getDEFALUE_NORMAL_HEIGH();
        }
        xdl0.M(get_svga_love(), true);
        if (!get_svga_love().isAnimating()) {
            Context context = getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/f0bb0c23-c1ff-42e6-bfc9-a8071e960fa911.so").autoPlay(true).repeatCount(1).animListener(new C0330d()).into(get_svga_love());
        }
        m6252X();
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
