package com.p000p1.mobile.putong.core.newui.messages.anim.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p000p1.mobile.putong.core.newui.messages.OOFMkWebViewAct;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.state.CoreAutoScrollView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.v;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.onlinematch.c;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.core.ui.quickaudio.DropDownAct;
import com.p1.mobile.putong.core.ui.quickaudio.view.DropDownBgView;
import com.p1.mobile.putong.data.BannerLoc;
import com.p1.mobile.putong.data.BubbleInfo;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.ak50;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.hdb0;
import l.ife;
import l.j760;
import l.l9r;
import l.mkd0;
import l.ogl0;
import l.osb0;
import l.svq;
import l.t100;
import l.upa;
import l.vwb;
import l.w9j;
import l.wjc0;
import l.x9j;
import l.xdl0;
import l.y9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.o7r;
import p009l.orb0;
import p009l.w5j0;
import rx.subjects.a;
import v.VLinear;
import v.VList;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002×\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0019\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\fJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\fJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\fJ\u000f\u0010\"\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\fJ\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010%J1\u0010+\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010\fJ\u000f\u0010.\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010\u0013J\u000f\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b/\u0010\u0013J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00109\u001a\u0002082\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b;\u0010\u0013J\u0017\u0010<\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010\fJ\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0006H\u0016¢\u0006\u0004\bE\u0010@J\u001f\u0010G\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0011H\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010\fJ\u0017\u0010K\u001a\u00020\u00112\u0006\u0010J\u001a\u000201H\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0011H\u0016¢\u0006\u0004\bM\u0010\u0013J\u000f\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010\fR\"\u0010U\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Z\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010 R\"\u0010]\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010V\u001a\u0004\b[\u0010X\"\u0004\b\\\u0010 R\"\u0010a\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010V\u001a\u0004\b_\u0010X\"\u0004\b`\u0010 R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010V\u001a\u0004\bs\u0010X\"\u0004\bt\u0010 R\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u0010\u0081\u0001\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010x\u001a\u0004\b\u007f\u0010z\"\u0005\b\u0080\u0001\u0010|R\u001e\u0010\u0085\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010@R\u0017\u0010\u0087\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0083\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0083\u0001R\u001e\u0010\u008c\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0083\u0001\u001a\u0005\b\u008b\u0001\u0010@R\u001e\u0010\u008f\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u0083\u0001\u001a\u0005\b\u008e\u0001\u0010@R\u001b\u0010\u0092\u0001\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u0083\u0001\u001a\u0005\b\u0091\u0001\u0010@R\u0017\u0010\u0094\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0083\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0083\u0001R\u001a\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0083\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0083\u0001R\u0019\u0010 \u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0083\u0001R\u0018\u0010¢\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¡\u0001\u0010\u001aR)\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0005\b§\u0001\u0010DR\u001a\u0010«\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010\u00ad\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u0099\u0001R*\u0010µ\u0001\u001a\u00030®\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R\u0018\u0010·\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010\u001aR\u0018\u0010¸\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u001aR\u0017\u0010¹\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\u001aR\u0018\u0010½\u0001\u001a\u00030º\u00018\u0002X\u0082D¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R+\u0010Ä\u0001\u001a\u0005\u0018\u00010¾\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b.\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R\u0017\u0010Å\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR+\u0010Ì\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R%\u0010Í\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b-\u0010\u001a\u001a\u0005\bÍ\u0001\u0010\u0013\"\u0005\bÎ\u0001\u0010%R&\u0010Ò\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b/\u00109\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0005\bÑ\u0001\u0010\u0018R\u001b\u0010Õ\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010Ô\u0001R\u0017\u0010Ö\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006Ø\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Q", "()V", "T", "g0", "R", "S", "", "N", "()Z", "f0", "", "speedDuration", "setNormalState", "(J)V", "M", "Z", "c0", "b0", "Lcom/tantan/library/svga/SVGAnimationView;", "view", "d0", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "Y", "a0", "isClick", "e0", "(Z)V", "startValue", "endValue", "Ll/d30;", "endAction", "setDuration", "U", "(IILl/d30;J)V", "O", "L", "P", "height", "", "h0", "(I)F", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "c", "(I)V", "i", "j", "()I", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", "d", "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "f", "headViewHeight", "b", "(F)Z", "e", "h", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "get_background", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "set_background", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;)V", "_background", "Lcom/tantan/library/svga/SVGAnimationView;", "get_svga_loading", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_loading", "_svga_loading", "get_svga_hey_tips", "set_svga_hey_tips", "_svga_hey_tips", "k", "get_hey_pull", "set_hey_pull", "_hey_pull", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;", "l", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;", "get_scroll_view_state", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;", "set_scroll_view_state", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;)V", "_scroll_view_state", "Landroid/widget/FrameLayout;", "m", "Landroid/widget/FrameLayout;", "get_oof_layout", "()Landroid/widget/FrameLayout;", "set_oof_layout", "(Landroid/widget/FrameLayout;)V", "_oof_layout", "n", "get_oof_layout_icon", "set_oof_layout_icon", "_oof_layout_icon", "Lv/VText;", "o", "Lv/VText;", "get_oof_layout_txt", "()Lv/VText;", "set_oof_layout_txt", "(Lv/VText;)V", "_oof_layout_txt", "p", "get_bottom_pull_text", "set_bottom_pull_text", "_bottom_pull_text", "q", "I", "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", "r", "ALLOW_PULL_START", "s", "DEFALUE_TIPS_HEIGH", "t", "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", "u", "getLOADING_VIEW_HEIGHT", "LOADING_VIEW_HEIGHT", "v", "getOVER_SCROLL_HEIGHT", "OVER_SCROLL_HEIGHT", "w", "SHOW_PULL_HEY_SVGA_START", "x", "SHOW_PULL_TEXT_START", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$HeaderState;", "y", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$HeaderState;", "headerState", "z", "searchHeight", "A", "suggestConHeight", "B", "impressConHeight", "C", "isBottomPlayedVibrateAnim", "D", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "getConversationsList", "()Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "setConversationsList", "Ll/w5j0;", "E", "Ll/w5j0;", "trackForQuickChat5", "F", "scrollState", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;", "G", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;", "getQuickChatBubble", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;", "setQuickChatBubble", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;)V", "quickChatBubble", "H", "oofAnimIsRunning", "businessHide", "pushUserMsgFragShowBsChange", "", "K", "Ljava/lang/String;", "stateTimerKey", "Ll/c4g0;", "Ll/c4g0;", "getTimeSubscription", "()Ll/c4g0;", "setTimeSubscription", "(Ll/c4g0;)V", "timeSubscription", "isShowState", "Landroid/animation/ObjectAnimator;", "Landroid/animation/ObjectAnimator;", "getObjectAnimator", "()Landroid/animation/ObjectAnimator;", "setObjectAnimator", "(Landroid/animation/ObjectAnimator;)V", "objectAnimator", "isTouchDown", "setTouchDown", "getLastStartAct", "()J", "setLastStartAct", "lastStartAct", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "scrollAnim", "isShowingTips", "HeaderState", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QuickChatAudioHeaderView extends QuickChatHeaderBaseView {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public int suggestConHeight;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public int impressConHeight;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean isBottomPlayedVibrateAnim;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public ConversationsList conversationsList;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public w5j0 trackForQuickChat5;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public HeaderState scrollState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public C0332b quickChatBubble;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean oofAnimIsRunning;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public boolean businessHide;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean pushUserMsgFragShowBsChange;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final String stateTimerKey;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public c4g0 timeSubscription;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public boolean isShowState;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    public ObjectAnimator objectAnimator;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean isTouchDown;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public long lastStartAct;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator scrollAnim;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean isShowingTips;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public DropDownBgView _background;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public SVGAnimationView _svga_loading;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public SVGAnimationView _svga_hey_tips;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public SVGAnimationView _hey_pull;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public CoreAutoScrollView _scroll_view_state;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public FrameLayout _oof_layout;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public SVGAnimationView _oof_layout_icon;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _oof_layout_txt;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VText _bottom_pull_text;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final int MAX_PULL_VIEW_HEIGH;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final int ALLOW_PULL_START;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final int DEFALUE_TIPS_HEIGH;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int DEFALUE_NORMAL_HEIGH;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final int LOADING_VIEW_HEIGHT;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final int OVER_SCROLL_HEIGHT;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final int SHOW_PULL_HEY_SVGA_START;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final int SHOW_PULL_TEXT_START;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public HeaderState headerState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int searchHeight;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$HeaderState;", "", "<init>", "(Ljava/lang/String;I)V", "NormalState", "SearchState", "GetUserState", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0323a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4318a;

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
            f4318a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView$b */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$b", "Lcom/tantan/library/svga/data/request/RequestCallback;", "Lcom/tantan/library/svga/ResourceKey;", "key", "Lcom/tantan/library/svga/exception/SVGAException;", "e", "", "onLoadFailed", "(Lcom/tantan/library/svga/ResourceKey;Lcom/tantan/library/svga/exception/SVGAException;)V", "Lcom/tantan/library/svga/data/cache/Resource;", "resource", "onResourceReady", "(Lcom/tantan/library/svga/ResourceKey;Lcom/tantan/library/svga/data/cache/Resource;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0324b implements RequestCallback {
        public C0324b() {
        }

        public void onLoadFailed(ResourceKey key, SVGAException e) {
            key.getClass();
            QuickChatAudioHeaderView.this.m6193S();
        }

        public void onResourceReady(ResourceKey key, Resource<?> resource) {
            key.getClass();
            resource.getClass();
            QuickChatAudioHeaderView.this.m6193S();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0325c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f4320a;

        public C0325c(d30 d30Var) {
            this.f4320a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f4320a.call();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatAudioHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.MAX_PULL_VIEW_HEIGH = svq.c(80);
        this.ALLOW_PULL_START = svq.c(70);
        this.DEFALUE_TIPS_HEIGH = svq.c(24);
        this.DEFALUE_NORMAL_HEIGH = svq.c(0);
        this.LOADING_VIEW_HEIGHT = svq.c(4);
        this.OVER_SCROLL_HEIGHT = svq.c(50);
        this.SHOW_PULL_HEY_SVGA_START = svq.c(24);
        this.SHOW_PULL_TEXT_START = svq.c(60);
        HeaderState headerState = HeaderState.NormalState;
        this.headerState = headerState;
        this.searchHeight = svq.c(217);
        this.suggestConHeight = svq.c(178);
        this.impressConHeight = svq.c(219);
        this.scrollState = headerState;
        LayoutInflater layoutInflaterM19649a = o7r.m19649a(getContext());
        layoutInflaterM19649a.getClass();
        m6188J(layoutInflaterM19649a, this);
        this.trackForQuickChat5 = new w5j0();
        m6192R();
        this.stateTimerKey = "feed_state_quick_timer_key";
    }

    /* JADX INFO: renamed from: A */
    public static Boolean m6156A(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public static Boolean m6157B(QuickChatAudioHeaderView quickChatAudioHeaderView, j760 j760Var) {
        if (!quickChatAudioHeaderView.pushUserMsgFragShowBsChange) {
            return Boolean.TRUE;
        }
        quickChatAudioHeaderView.pushUserMsgFragShowBsChange = false;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: C */
    public static void m6158C(QuickChatAudioHeaderView quickChatAudioHeaderView, List list) {
        if (!vwb.J(list)) {
            quickChatAudioHeaderView.get_scroll_view_state().setBubbleInfoList(list);
            quickChatAudioHeaderView.get_scroll_view_state().m6373s();
        } else {
            BubbleInfo bubbleInfo = new BubbleInfo();
            bubbleInfo.value = "实时状态广场，发现更多有趣的人";
            quickChatAudioHeaderView.get_scroll_view_state().setBubbleInfo(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: D */
    public static Boolean m6159D(j760 j760Var) {
        j760Var.getClass();
        return Boolean.valueOf((j760Var == v.b0 || TextUtils.isEmpty(CoreModule.H().userId())) ? false : true);
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m6160E(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static void m6161F(QuickChatAudioHeaderView quickChatAudioHeaderView) {
        if (quickChatAudioHeaderView.scrollState != HeaderState.SearchState) {
            return;
        }
        if (!quickChatAudioHeaderView.get_svga_loading().isAnimating()) {
            xdl0.M(quickChatAudioHeaderView.get_svga_loading(), true);
            quickChatAudioHeaderView.get_svga_loading().startAnimation();
            quickChatAudioHeaderView.m6190M();
        }
        xdl0.M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, (Object) null);
        quickChatAudioHeaderView.m6194T();
        xdl0.M(quickChatAudioHeaderView.get_hey_pull(), false);
        xdl0.M(quickChatAudioHeaderView.get_bottom_pull_text(), false);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, (Object) null);
    }

    /* JADX INFO: renamed from: G */
    public static void m6162G(QuickChatAudioHeaderView quickChatAudioHeaderView, j760 j760Var) {
        j760Var.getClass();
        String str = (String) j760Var.a;
        Object obj = j760Var.b;
        quickChatAudioHeaderView.pushUserMsgFragShowBsChange = true;
        if (Intrinsics.d(str, "notify_search")) {
            quickChatAudioHeaderView.m6197Z();
        } else if (Intrinsics.d("match_success", str)) {
            c.a aVar = c.Companion;
            if (aVar.a().h()) {
                OnlineMatchManager.z().I.onNext(v.b0);
                aVar.a().i(0L);
                m6170W(quickChatAudioHeaderView, 0L, 1, null);
                return;
            } else {
                if (quickChatAudioHeaderView.headerState == HeaderState.GetUserState) {
                    OnlineMatchManager.z().I.onNext(v.b0);
                    return;
                }
                m6170W(quickChatAudioHeaderView, 0L, 1, null);
                C0332b c0332bM6340U = quickChatAudioHeaderView.getQuickChatBubble().m6341V(str).m6340U(quickChatAudioHeaderView.headerState);
                obj.getClass();
                c0332bM6340U.m6342W((OnlineMatchMatchUser) obj);
                quickChatAudioHeaderView.getQuickChatBubble().x(CorePopLevel.QUICK_NOTIFY_MATCH_SUCCESS);
                hdb0.c().i(quickChatAudioHeaderView.getQuickChatBubble());
            }
        } else if (Intrinsics.d("match_timeout", str)) {
            ak50.Companion.a().H(quickChatAudioHeaderView.getAct(), "match_timeout");
            m6170W(quickChatAudioHeaderView, 0L, 1, null);
        } else if (Intrinsics.d("tickets_broadcast", str)) {
            if (quickChatAudioHeaderView.headerState == HeaderState.GetUserState) {
                OnlineMatchManager.z().I.onNext(v.b0);
                return;
            }
            c.a aVar2 = c.Companion;
            if (aVar2.a().h()) {
                OnlineMatchManager.z().I.onNext(v.b0);
                aVar2.a().i(0L);
                m6170W(quickChatAudioHeaderView, 0L, 1, null);
                CoreModule.c.D0.L4((OnlineMatchPushUser) null);
                return;
            }
            m6170W(quickChatAudioHeaderView, 0L, 1, null);
            if (!(obj instanceof OnlineMatchPushUser)) {
                return;
            }
            quickChatAudioHeaderView.getQuickChatBubble().m6341V(str).m6340U(quickChatAudioHeaderView.headerState).m6344Y((OnlineMatchPushUser) obj);
            quickChatAudioHeaderView.getQuickChatBubble().x(CorePopLevel.QUICK_NOTIFY_BROADCAST);
            hdb0.c().i(quickChatAudioHeaderView.getQuickChatBubble());
        } else if (Intrinsics.d("notify_normal_state", str)) {
            m6170W(quickChatAudioHeaderView, 0L, 1, null);
        }
        OnlineMatchManager.z().I.onNext(v.b0);
    }

    /* JADX INFO: renamed from: H */
    public static void m6163H(QuickChatAudioHeaderView quickChatAudioHeaderView) {
        HeaderState headerState = quickChatAudioHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        xdl0.M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, (Object) null);
        quickChatAudioHeaderView.m6194T();
        xdl0.M(quickChatAudioHeaderView.get_svga_loading(), false);
        xdl0.M(quickChatAudioHeaderView.get_hey_pull(), false);
        xdl0.M(quickChatAudioHeaderView.get_bottom_pull_text(), false);
        xdl0.M(quickChatAudioHeaderView.get_background(), true);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_loading(), false, 1, (Object) null);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, (Object) null);
        quickChatAudioHeaderView.headerState = headerState2;
    }

    /* JADX INFO: renamed from: I */
    public static j760 m6164I(Triple triple) {
        triple.getClass();
        return (j760) triple.getFirst();
    }

    /* JADX INFO: renamed from: N */
    private final boolean m6166N() {
        VList vList;
        ConversationsList conversationsList;
        VLinear vLinear;
        VList vList2;
        ConversationsList conversationsList2 = this.conversationsList;
        if (conversationsList2 != null && (vList2 = conversationsList2.f3883V) != null && vList2.getCount() == 0) {
            return true;
        }
        ConversationsList conversationsList3 = this.conversationsList;
        return (conversationsList3 == null || (vList = conversationsList3.f3883V) == null || vList.getFirstVisiblePosition() != 0 || (conversationsList = this.conversationsList) == null || (vLinear = conversationsList.f3863E0) == null || vLinear.getTop() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: P */
    private final boolean m6167P() {
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
    private final void m6168Q() {
        Act act = getAct();
        a aVar = OnlineMatchManager.z().I;
        NewMainAct act2 = getAct();
        act2.getClass();
        rx.c<TabName> cVarM3895i7 = act2.m3895i7();
        rx.c cVarLifecycle = getAct().lifecycle();
        final Function3 function3 = new Function3() { // from class: l.srb0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return QuickChatAudioHeaderView.m6179r((j760) obj, (TabName) obj2, (com.p1.mobile.android.app.c) obj3);
            }
        };
        rx.c cVarDuringCreated = act.duringCreated(mkd0.s(aVar, cVarM3895i7, cVarLifecycle, new y9j() { // from class: l.wrb0
            /* JADX INFO: renamed from: a */
            public final Object m24474a(Object obj, Object obj2, Object obj3) {
                return QuickChatAudioHeaderView.m6177p(function3, obj, obj2, obj3);
            }
        }));
        final Function1 function1 = new Function1() { // from class: l.xrb0
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m6185x((Triple) obj);
            }
        };
        rx.c cVarFilter = cVarDuringCreated.filter(new w9j() { // from class: l.yrb0
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m6156A(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.zrb0
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m6164I((Triple) obj);
            }
        };
        rx.c map = cVarFilter.map(new w9j() { // from class: l.bsb0
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m6172k(function2, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.csb0
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m6159D((j760) obj);
            }
        };
        map.filter(new w9j() { // from class: l.dsb0
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m6160E(function4, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.esb0
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m6162G(this.f12679a, (j760) obj);
            }
        }));
        Act act3 = getAct();
        NewMainAct act4 = getAct();
        act4.getClass();
        rx.c cVarDistinctUntilChanged = act3.duringCreated(mkd0.r(act4.m3895i7(), getAct().lifecycle(), new x9j() { // from class: l.fsb0
            public final Object call(Object obj, Object obj2) {
                return QuickChatAudioHeaderView.m6183v((TabName) obj, (com.p1.mobile.android.app.c) obj2);
            }
        }), false).distinctUntilChanged();
        final Function1 function5 = new Function1() { // from class: l.trb0
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m6157B(this.f20845a, (j760) obj);
            }
        };
        cVarDistinctUntilChanged.filter(new w9j() { // from class: l.urb0
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m6173l(function5, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.vrb0
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m6175n(this.f21753a, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public static final void m6169V(QuickChatAudioHeaderView quickChatAudioHeaderView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        quickChatAudioHeaderView.mo6126c(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m6170W(QuickChatAudioHeaderView quickChatAudioHeaderView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        quickChatAudioHeaderView.setNormalState(j);
    }

    /* JADX INFO: renamed from: X */
    public static final void m6171X(QuickChatAudioHeaderView quickChatAudioHeaderView, View view) {
        quickChatAudioHeaderView.m6202e0(true);
    }

    /* JADX INFO: renamed from: k */
    public static j760 m6172k(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static Boolean m6173l(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static void m6175n(QuickChatAudioHeaderView quickChatAudioHeaderView, j760 j760Var) {
        if ((j760Var != null ? (com.p1.mobile.android.app.c) j760Var.b : null) == com.p1.mobile.android.app.c.i) {
            if ((j760Var != null ? (TabName) j760Var.a : null) == TabName.Msg) {
                int i = C0323a.f4318a[quickChatAudioHeaderView.headerState.ordinal()];
                if (i == 1) {
                    quickChatAudioHeaderView.getQuickChatBubble().m6347b0();
                } else if (i == 2) {
                    m6170W(quickChatAudioHeaderView, 0L, 1, null);
                } else {
                    if (i != 3) {
                        l9r.a();
                        return;
                    }
                    quickChatAudioHeaderView.m6197Z();
                }
                if (ogl0.R() && quickChatAudioHeaderView.getQuickChatBubble().m6338N() && c.Companion.a().e() != 0) {
                    quickChatAudioHeaderView.getQuickChatBubble().m6347b0();
                    return;
                }
                return;
            }
        }
        quickChatAudioHeaderView.getQuickChatBubble().m6348c0();
        quickChatAudioHeaderView.m6204g0();
    }

    /* JADX INFO: renamed from: o */
    public static void m6176o(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static Triple m6177p(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: q */
    public static void m6178q(long j, QuickChatAudioHeaderView quickChatAudioHeaderView, long j2) {
        if (j2 == j - 1) {
            quickChatAudioHeaderView.isShowState = true;
            xdl0.M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
            SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, (Object) null);
            xdl0.M(quickChatAudioHeaderView.get_hey_pull(), false);
            SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, (Object) null);
            if (quickChatAudioHeaderView.get_background().p()) {
                quickChatAudioHeaderView.m6200c0();
            } else {
                quickChatAudioHeaderView.m6199b0();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static Triple m6179r(j760 j760Var, TabName tabName, com.p1.mobile.android.app.c cVar) {
        return new Triple(j760Var, tabName, cVar);
    }

    private final void setNormalState(long speedDuration) {
        getQuickChatBubble().m6343X();
        if (!m6166N()) {
            this.scrollState = HeaderState.NormalState;
            m6195U(getLayoutParams().height, 0, new d30() { // from class: l.msb0
                public final void call() {
                    QuickChatAudioHeaderView.m6163H(this.f17062a);
                }
            }, speedDuration);
        } else {
            this.scrollState = HeaderState.NormalState;
            boolean zM6189L = m6189L();
            this.isShowingTips = zM6189L;
            m6195U(getLayoutParams().height, zM6189L ? this.DEFALUE_TIPS_HEIGH : getDEFALUE_NORMAL_HEIGH(), new d30() { // from class: l.lsb0
                public final void call() {
                    QuickChatAudioHeaderView.m6181t(this.f16391a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m6181t(final QuickChatAudioHeaderView quickChatAudioHeaderView) {
        HeaderState headerState = quickChatAudioHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        if (quickChatAudioHeaderView.isShowingTips) {
            quickChatAudioHeaderView.setOnClickListener(new View.OnClickListener() { // from class: l.ksb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickChatAudioHeaderView.m6171X(this.f15833a, view);
                }
            });
            if (!quickChatAudioHeaderView.get_svga_hey_tips().isAnimating()) {
                quickChatAudioHeaderView.m6201d0(quickChatAudioHeaderView.get_svga_hey_tips());
            }
        } else {
            quickChatAudioHeaderView.setOnClickListener(null);
            xdl0.M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
            SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, (Object) null);
        }
        quickChatAudioHeaderView.m6194T();
        xdl0.M(quickChatAudioHeaderView.get_svga_loading(), false);
        xdl0.M(quickChatAudioHeaderView.get_hey_pull(), false);
        xdl0.M(quickChatAudioHeaderView.get_bottom_pull_text(), false);
        xdl0.M(quickChatAudioHeaderView.get_background(), true);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_loading(), false, 1, (Object) null);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, (Object) null);
        quickChatAudioHeaderView.headerState = headerState2;
    }

    /* JADX INFO: renamed from: u */
    public static void m6182u() {
    }

    /* JADX INFO: renamed from: v */
    public static j760 m6183v(TabName tabName, com.p1.mobile.android.app.c cVar) {
        return vwb.Y(tabName, cVar);
    }

    /* JADX INFO: renamed from: w */
    public static void m6184w(QuickChatAudioHeaderView quickChatAudioHeaderView, Throwable th) {
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.value = "实时状态广场，发现更多有趣的人";
        quickChatAudioHeaderView.get_scroll_view_state().setBubbleInfo(bubbleInfo);
    }

    /* JADX INFO: renamed from: x */
    public static Boolean m6185x(Triple triple) {
        return Boolean.valueOf(triple.getSecond() == TabName.Msg && Intrinsics.d(triple.getThird(), com.p1.mobile.android.app.c.i));
    }

    /* JADX INFO: renamed from: y */
    public static void m6186y(QuickChatAudioHeaderView quickChatAudioHeaderView) {
        quickChatAudioHeaderView.isBottomPlayedVibrateAnim = false;
    }

    /* JADX INFO: renamed from: z */
    public static void m6187z(QuickChatAudioHeaderView quickChatAudioHeaderView, View view) {
        quickChatAudioHeaderView.m6202e0(true);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final View m6188J(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = osb0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m6189L() {
        boolean z = false;
        if (this.businessHide) {
            return false;
        }
        int iB = wjc0.b(CoreModule.c.o3(), CoreModule.c.f0.Se(), Boolean.valueOf(ife.o().k(BannerLoc.get("conversation"))));
        if (OnlineMatchManager.z().N() || OnlineMatchManager.z().M()) {
            z = true;
        } else if (OnlineMatchManager.z().n0() && iB <= ((Number) OnlineMatchManager.z().b.get()).intValue()) {
            OnlineMatchManager.z().k0();
            OnlineMatchManager.z().h0(true);
            z = true;
        }
        OnlineMatchManager.z().b.put(Integer.valueOf(iB));
        return z;
    }

    /* JADX INFO: renamed from: M */
    public final void m6190M() {
        xdl0.M(get_scroll_view_state(), false);
        if (vwb.J(get_scroll_view_state().getBubbleInfoLists())) {
            return;
        }
        get_scroll_view_state().m6375u();
        get_scroll_view_state().m6365k();
    }

    /* JADX INFO: renamed from: O */
    public final void m6191O() {
        this.isShowingTips = false;
        if (OnlineMatchManager.z().N()) {
            OnlineMatchManager.z().i0();
        } else if (OnlineMatchManager.z().M()) {
            OnlineMatchManager.z().h0(false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m6192R() {
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getLayoutParams().height = 0;
        if (!get_background().p() && !ogl0.Y()) {
            ViewGroup.LayoutParams layoutParams = get_background().getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = xdl0.y0();
            layoutParams2.height = xdl0.w0();
            layoutParams2.topMargin = -t100.R;
            get_background().setLayoutParams(layoutParams2);
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/d436ea17-bcbc-46b3-81bd-8d6d94a8537510.so").autoPlay(false).frameMode(SVGAnimationView.FrameMode.AFTER).loadCallback(new C0324b()).into(get_svga_hey_tips());
    }

    /* JADX INFO: renamed from: S */
    public final void m6193S() {
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/d436ea17-bcbc-46b3-81bd-8d6d94a8537510.so").autoPlay(false).into(get_hey_pull());
        Context context2 = getContext();
        context2.getClass();
        SVGALoader.with(context2).from("https://auto.tancdn.com/v1/raw/402a91d3-0864-48c6-a72d-133b03a6d8e610.so").autoPlay(false).into(get_svga_loading());
    }

    /* JADX INFO: renamed from: T */
    public final void m6194T() {
        if (get_scroll_view_state() != null && get_scroll_view_state().getVisibility() == 4) {
            xdl0.M(get_scroll_view_state(), true);
            get_scroll_view_state().m6373s();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m6195U(int startValue, int endValue, d30 endAction, long setDuration) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.scrollAnim;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.scrollAnim) != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(startValue, endValue);
        this.scrollAnim = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(setDuration);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rrb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    QuickChatAudioHeaderView.m6169V(this.f19955a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new C0325c(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m6196Y() {
        String str;
        if (get_background().p()) {
            get_bottom_pull_text().setTextColor(Color.parseColor("#99FFFFFF"));
            str = "选择与描述特质最相符的他";
        } else {
            str = "下拉找到正在等你的人";
        }
        get_bottom_pull_text().setText(str);
    }

    /* JADX INFO: renamed from: Z */
    public final void m6197Z() {
        HeaderState headerState = HeaderState.SearchState;
        this.headerState = headerState;
        setOnClickListener(new View.OnClickListener() { // from class: l.nsb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatAudioHeaderView.m6187z(this.f17634a, view);
            }
        });
        getQuickChatBubble().m6343X();
        if (m6166N()) {
            this.scrollState = headerState;
            m6195U(getLayoutParams().height, getLOADING_VIEW_HEIGHT(), new d30() { // from class: l.qrb0
                public final void call() {
                    QuickChatAudioHeaderView.m6161F(this.f19471a);
                }
            }, 500L);
            return;
        }
        this.headerState = headerState;
        xdl0.M(get_svga_hey_tips(), false);
        SVGAnimationView.stopAnimation$default(get_svga_hey_tips(), false, 1, (Object) null);
        m6194T();
        xdl0.M(get_svga_loading(), false);
        xdl0.M(get_hey_pull(), false);
        xdl0.M(get_bottom_pull_text(), false);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, (Object) null);
        SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, (Object) null);
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo6124a() {
        HeaderState headerState = this.headerState;
        return headerState == HeaderState.NormalState || headerState == HeaderState.SearchState;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m6198a0() {
        float height = (((getHeight() - this.SHOW_PULL_HEY_SVGA_START) * 0.16f) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START)) + 1.0f;
        float height2 = 1.0f + (((getHeight() - this.SHOW_PULL_HEY_SVGA_START) * 0.16f) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START));
        if (get_background().p()) {
            int iD = (t100.d(20.0f) * (getHeight() - this.SHOW_PULL_HEY_SVGA_START)) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START);
            get_oof_layout().setScaleX(height);
            get_oof_layout().setScaleY(height2);
            xdl0.X(get_oof_layout(), iD);
            return;
        }
        int iD2 = t100.d(4.0f) + ((t100.d(16.0f) * (getHeight() - this.SHOW_PULL_HEY_SVGA_START)) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START));
        get_scroll_view_state().setScaleX(height);
        get_scroll_view_state().setScaleY(height2);
        xdl0.X(get_scroll_view_state(), iD2);
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: b */
    public boolean mo6125b(float headViewHeight) {
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m6199b0() {
        xdl0.M(get_scroll_view_state(), true);
        xdl0.M(get_oof_layout(), false);
        List<BubbleInfo> bubbleInfoLists = get_scroll_view_state().getBubbleInfoLists();
        bubbleInfoLists.getClass();
        if (vwb.J(bubbleInfoLists)) {
            getAct().duringCreated(CoreModule.N().Yr()).subscribe(mkd0.H(new e30() { // from class: l.prb0
                public final void call(Object obj) {
                    QuickChatAudioHeaderView.m6158C(this.f18870a, (List) obj);
                }
            }, new e30() { // from class: l.asb0
                public final void call(Object obj) {
                    QuickChatAudioHeaderView.m6184w(this.f9662a, (Throwable) obj);
                }
            }));
        } else if (get_scroll_view_state().m6368n()) {
            get_scroll_view_state().m6373s();
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: c */
    public void mo6126c(int height) {
        int i = C0323a.f4318a[this.headerState.ordinal()];
        if (i == 1) {
            SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, (Object) null);
            xdl0.M(get_hey_pull(), false);
            xdl0.M(get_bottom_pull_text(), false);
        } else if (i == 2) {
            if (height != this.DEFALUE_TIPS_HEIGH) {
                SVGAnimationView.stopAnimation$default(get_svga_hey_tips(), false, 1, (Object) null);
                xdl0.M(get_svga_hey_tips(), false);
            }
            if (height > this.SHOW_PULL_HEY_SVGA_START) {
                if (!get_hey_pull().isAnimating()) {
                    m6201d0(get_hey_pull());
                }
                m6198a0();
            } else {
                SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, (Object) null);
                xdl0.M(get_hey_pull(), false);
            }
            if (height >= this.ALLOW_PULL_START && !this.isBottomPlayedVibrateAnim && this.isTouchDown) {
                this.isBottomPlayedVibrateAnim = true;
                Act context = getContext();
                context.getClass();
                Object systemService = context.getSystemService("vibrator");
                systemService.getClass();
                Vibrator vibrator = (Vibrator) systemService;
                vibrator.vibrate(500L);
                vibrator.vibrate(new long[]{100, 100}, -1);
            }
            if (height >= this.SHOW_PULL_TEXT_START) {
                xdl0.M(get_bottom_pull_text(), true);
                if (height >= getMAX_PULL_VIEW_HEIGH()) {
                    get_bottom_pull_text().setAlpha(1.0f);
                } else {
                    get_bottom_pull_text().setAlpha(m6205h0(height));
                }
                m6196Y();
            } else {
                xdl0.M(get_bottom_pull_text(), false);
            }
        } else {
            if (i != 3) {
                l9r.a();
                return;
            }
            if (height <= getLOADING_VIEW_HEIGHT()) {
                if (!get_svga_loading().isAnimating()) {
                    xdl0.M(get_svga_loading(), true);
                    get_svga_loading().startAnimation();
                    m6190M();
                }
                SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, (Object) null);
                xdl0.M(get_hey_pull(), false);
                xdl0.M(get_bottom_pull_text(), false);
            } else {
                SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, (Object) null);
                xdl0.M(get_svga_loading(), false);
                SVGAnimationView.stopAnimation$default(get_svga_hey_tips(), false, 1, (Object) null);
                xdl0.M(get_svga_hey_tips(), false);
                if (height > this.SHOW_PULL_HEY_SVGA_START) {
                    if (!get_hey_pull().isAnimating()) {
                        m6201d0(get_hey_pull());
                    }
                    m6198a0();
                } else {
                    SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, (Object) null);
                    xdl0.M(get_hey_pull(), false);
                }
                if (height >= this.ALLOW_PULL_START && !this.isBottomPlayedVibrateAnim && this.isTouchDown) {
                    this.isBottomPlayedVibrateAnim = true;
                    Act context2 = getContext();
                    context2.getClass();
                    Object systemService2 = context2.getSystemService("vibrator");
                    systemService2.getClass();
                    Vibrator vibrator2 = (Vibrator) systemService2;
                    vibrator2.vibrate(500L);
                    vibrator2.vibrate(new long[]{100, 100}, -1);
                }
                if (height >= this.SHOW_PULL_TEXT_START) {
                    xdl0.M(get_bottom_pull_text(), true);
                    if (height >= getMAX_PULL_VIEW_HEIGH()) {
                        get_bottom_pull_text().setAlpha(1.0f);
                    } else {
                        get_bottom_pull_text().setAlpha(m6205h0(height));
                    }
                    m6196Y();
                } else {
                    xdl0.M(get_bottom_pull_text(), false);
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = height;
        setLayoutParams(layoutParams);
        e30<Integer> changeHeightListrener = getChangeHeightListrener();
        if (changeHeightListrener != null) {
            changeHeightListrener.call(Integer.valueOf(height));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m6200c0() {
        xdl0.M(get_scroll_view_state(), false);
        xdl0.M(get_oof_layout(), true);
        get_oof_layout_txt().setText("极限四选一");
        if (!this.oofAnimIsRunning) {
            this.oofAnimIsRunning = true;
            Context context = getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/44491780-6504-4c7f-a828-576c7adcd7f612.svga").autoPlay(true).into(get_oof_layout_icon());
        }
        zvf0.x("e_choose_entrance", "p_messages_view");
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: d */
    public void mo6127d(@NotNull ConversationsList conversationsList) {
        conversationsList.getClass();
        this.conversationsList = conversationsList;
        setQuickChatBubble(new C0332b(getAct()));
        getQuickChatBubble().m6337M(getAct());
        m6168Q();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m6201d0(SVGAnimationView view) {
        boolean zP = get_background().p();
        boolean zY = ogl0.Y();
        if (!zP && !zY) {
            xdl0.M(view, true);
            view.startAnimation();
            return;
        }
        xdl0.M(get_scroll_view_state(), false);
        if (this.isShowState) {
            if (zP) {
                m6200c0();
                return;
            } else {
                m6199b0();
                return;
            }
        }
        xdl0.M(view, true);
        view.startAnimation();
        if (e51.B(this.stateTimerKey)) {
            return;
        }
        m6203f0();
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: e */
    public boolean mo6128e() {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m6202e0(boolean isClick) {
        m6191O();
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList != null && SystemClock.uptimeMillis() - this.lastStartAct > 500) {
            this.lastStartAct = SystemClock.uptimeMillis();
            orb0 orb0Var = new orb0(conversationsList, this);
            if (get_background().p()) {
                if (isClick) {
                    zvf0.r("e_choose_entrance", "p_messages_view");
                } else {
                    zvf0.D("e_choose_entrance_drop", "p_messages_view", new j760[0]);
                }
                getAct().startActivityWithCustomTransition(OOFMkWebViewAct.m5906m2(getAct()), orb0Var);
                return;
            }
            if (!ogl0.Y()) {
                getAct().startActivityForResultWithCustomTransition(DropDownAct.Companion.a(getAct()), 18, orb0Var);
                return;
            }
            List<BubbleInfo> bubbleInfoLists = get_scroll_view_state().getBubbleInfoLists();
            bubbleInfoLists.getClass();
            BubbleInfo bubbleInfo = null;
            BubbleInfo bubbleInfo2 = vwb.J(bubbleInfoLists) ? null : bubbleInfoLists.get(get_scroll_view_state().getCurrentIndex() % bubbleInfoLists.size());
            if (bubbleInfo2 != null && !TextUtils.equals(bubbleInfo2.value, "实时状态广场，发现更多有趣的人")) {
                bubbleInfo = bubbleInfo2;
            }
            getAct().startActivityWithCustomTransition(CoreModule.N().P6(getAct(), true, bubbleInfo, "p_messages_view"), orb0Var);
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: f */
    public void mo6129f() {
        if (m6167P()) {
            int i = C0323a.f4318a[this.headerState.ordinal()];
            if (i == 2) {
                m6170W(this, 0L, 1, null);
            } else {
                if (i != 3) {
                    return;
                }
                m6197Z();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m6203f0() {
        final long jM9620A = RemoteConfig.m9619x().m9620A("second_floor_refresh_state_time");
        this.timeSubscription = getAct().duringCreated(e51.N(this.stateTimerKey, (int) jM9620A)).subscribe(mkd0.I(new e30() { // from class: l.gsb0
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m6178q(jM9620A, this, ((Long) obj).longValue());
            }
        }, new e30() { // from class: l.hsb0
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m6176o((Throwable) obj);
            }
        }, new d30() { // from class: l.isb0
            public final void call() {
                QuickChatAudioHeaderView.m6182u();
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: g */
    public void mo6130g(int height, boolean isAutoTopShow) {
        int defalue_normal_heigh;
        if (this.headerState == HeaderState.GetUserState) {
            return;
        }
        if (isAutoTopShow || m6167P()) {
            if (this.headerState != HeaderState.NormalState) {
                int iAbs = getLayoutParams().height + Math.abs(height);
                if (iAbs >= getLOADING_VIEW_HEIGHT()) {
                    iAbs = getLOADING_VIEW_HEIGHT();
                }
                if (isAutoTopShow) {
                    iAbs = getLOADING_VIEW_HEIGHT();
                }
                mo6126c(iAbs);
                xdl0.M(get_svga_loading(), true);
                if (!get_svga_loading().isAnimating()) {
                    get_svga_loading().startAnimation();
                }
                m6190M();
                return;
            }
            int iAbs2 = getLayoutParams().height + Math.abs(height);
            boolean z = this.isShowingTips;
            if (!isAutoTopShow) {
                defalue_normal_heigh = z ? this.DEFALUE_TIPS_HEIGH : this.OVER_SCROLL_HEIGHT;
                if (iAbs2 >= defalue_normal_heigh) {
                }
                mo6126c(iAbs2);
                if (this.isShowingTips || get_svga_hey_tips().isAnimating()) {
                }
                m6201d0(get_svga_hey_tips());
                return;
            }
            defalue_normal_heigh = z ? this.DEFALUE_TIPS_HEIGH : getDEFALUE_NORMAL_HEIGH();
            iAbs2 = defalue_normal_heigh;
            mo6126c(iAbs2);
            if (this.isShowingTips) {
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m6204g0() {
        c4g0 c4g0Var = this.timeSubscription;
        if (c4g0Var != null) {
            c4g0Var.getClass();
            if (!c4g0Var.isUnsubscribed()) {
                c4g0 c4g0Var2 = this.timeSubscription;
                c4g0Var2.getClass();
                c4g0Var2.unsubscribe();
            }
        }
        if (e51.B(this.stateTimerKey)) {
            e51.K(this.stateTimerKey);
        }
        get_scroll_view_state().m6375u();
        SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, (Object) null);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, (Object) null);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, (Object) null);
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
        int i = t100.i;
        if (upa.F0() || upa.d3() || upa.g()) {
            i = 0;
        }
        HeaderState headerState = this.headerState;
        if (headerState == HeaderState.NormalState || headerState == HeaderState.SearchState || headerState == HeaderState.GetUserState) {
            return i + getLayoutParams().height;
        }
        return 0;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getLOADING_VIEW_HEIGHT() {
        return this.LOADING_VIEW_HEIGHT;
    }

    public final long getLastStartAct() {
        return this.lastStartAct;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getMAX_PULL_VIEW_HEIGH() {
        return this.MAX_PULL_VIEW_HEIGH;
    }

    public final int getOVER_SCROLL_HEIGHT() {
        return this.OVER_SCROLL_HEIGHT;
    }

    @Nullable
    public final ObjectAnimator getObjectAnimator() {
        return this.objectAnimator;
    }

    @NotNull
    public final C0332b getQuickChatBubble() {
        C0332b c0332b = this.quickChatBubble;
        if (c0332b != null) {
            return c0332b;
        }
        Intrinsics.r("quickChatBubble");
        return null;
    }

    @Nullable
    public final c4g0 getTimeSubscription() {
        return this.timeSubscription;
    }

    @NotNull
    public final DropDownBgView get_background() {
        DropDownBgView dropDownBgView = this._background;
        if (dropDownBgView != null) {
            return dropDownBgView;
        }
        Intrinsics.r("_background");
        return null;
    }

    @NotNull
    public final VText get_bottom_pull_text() {
        VText vText = this._bottom_pull_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_bottom_pull_text");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_hey_pull() {
        SVGAnimationView sVGAnimationView = this._hey_pull;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_hey_pull");
        return null;
    }

    @NotNull
    public final FrameLayout get_oof_layout() {
        FrameLayout frameLayout = this._oof_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_oof_layout");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_oof_layout_icon() {
        SVGAnimationView sVGAnimationView = this._oof_layout_icon;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_oof_layout_icon");
        return null;
    }

    @NotNull
    public final VText get_oof_layout_txt() {
        VText vText = this._oof_layout_txt;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_oof_layout_txt");
        return null;
    }

    @NotNull
    public final CoreAutoScrollView get_scroll_view_state() {
        CoreAutoScrollView coreAutoScrollView = this._scroll_view_state;
        if (coreAutoScrollView != null) {
            return coreAutoScrollView;
        }
        Intrinsics.r("_scroll_view_state");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_hey_tips() {
        SVGAnimationView sVGAnimationView = this._svga_hey_tips;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_svga_hey_tips");
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

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: h */
    public void mo6131h() {
        int i = C0323a.f4318a[this.headerState.ordinal()];
        if (i == 2) {
            setNormalState(0L);
            m6204g0();
        } else {
            if (i != 3) {
                return;
            }
            m6197Z();
            m6204g0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final float m6205h0(int height) {
        return ((height - this.SHOW_PULL_TEXT_START) * 1.0f) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_TEXT_START);
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: i */
    public void mo6132i() {
        this.isTouchDown = true;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: j */
    public int mo6133j() {
        this.isTouchDown = false;
        postDelayed(new Runnable() { // from class: l.jsb0
            @Override // java.lang.Runnable
            public final void run() {
                QuickChatAudioHeaderView.m6186y(this.f15271a);
            }
        }, 500L);
        HeaderState headerState = this.headerState;
        HeaderState headerState2 = HeaderState.SearchState;
        if (headerState == headerState2 && getLayoutParams().height <= getLOADING_VIEW_HEIGHT()) {
            return getLayoutParams().height;
        }
        if (this.headerState == HeaderState.NormalState && getLayoutParams().height <= getDEFALUE_NORMAL_HEIGH()) {
            return getLayoutParams().height;
        }
        if (getLayoutParams().height >= this.ALLOW_PULL_START) {
            m6202e0(false);
            return getDEFALUE_NORMAL_HEIGH();
        }
        if (this.headerState == headerState2) {
            m6197Z();
            return getLOADING_VIEW_HEIGHT();
        }
        m6170W(this, 0L, 1, null);
        return getDEFALUE_NORMAL_HEIGH();
    }

    public final void setConversationsList(@Nullable ConversationsList conversationsList) {
        this.conversationsList = conversationsList;
    }

    public final void setLastStartAct(long j) {
        this.lastStartAct = j;
    }

    public final void setObjectAnimator(@Nullable ObjectAnimator objectAnimator) {
        this.objectAnimator = objectAnimator;
    }

    public final void setQuickChatBubble(@NotNull C0332b c0332b) {
        c0332b.getClass();
        this.quickChatBubble = c0332b;
    }

    public final void setTimeSubscription(@Nullable c4g0 c4g0Var) {
        this.timeSubscription = c4g0Var;
    }

    public final void setTouchDown(boolean z) {
        this.isTouchDown = z;
    }

    public final void set_background(@NotNull DropDownBgView dropDownBgView) {
        dropDownBgView.getClass();
        this._background = dropDownBgView;
    }

    public final void set_bottom_pull_text(@NotNull VText vText) {
        vText.getClass();
        this._bottom_pull_text = vText;
    }

    public final void set_hey_pull(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._hey_pull = sVGAnimationView;
    }

    public final void set_oof_layout(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._oof_layout = frameLayout;
    }

    public final void set_oof_layout_icon(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._oof_layout_icon = sVGAnimationView;
    }

    public final void set_oof_layout_txt(@NotNull VText vText) {
        vText.getClass();
        this._oof_layout_txt = vText;
    }

    public final void set_scroll_view_state(@NotNull CoreAutoScrollView coreAutoScrollView) {
        coreAutoScrollView.getClass();
        this._scroll_view_state = coreAutoScrollView;
    }

    public final void set_svga_hey_tips(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._svga_hey_tips = sVGAnimationView;
    }

    public final void set_svga_loading(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._svga_loading = sVGAnimationView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatAudioHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatAudioHeaderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ QuickChatAudioHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
