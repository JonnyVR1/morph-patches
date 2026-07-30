package com.p046p1.mobile.putong.core.newui.messages.anim.view;

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
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4756v;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConvCellList;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import com.p046p1.mobile.putong.core.newui.messages.OOFMkWebViewAct;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.state.CoreAutoScrollView;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8611c;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.view.DropDownBgView;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VText;
import p149l.ak50;
import p149l.b2s;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.hdb0;
import p149l.ife;
import p149l.j6f;
import p149l.j760;
import p149l.l9r;
import p149l.mkd0;
import p149l.o7r;
import p149l.ogl0;
import p149l.orb0;
import p149l.osb0;
import p149l.svq;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.w5j0;
import p149l.w9j;
import p149l.wjc0;
import p149l.x9j;
import p149l.xdl0;
import p149l.y9j;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002×\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0019\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\fJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\fJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\fJ\u000f\u0010\"\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\fJ\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010%J1\u0010+\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010\fJ\u000f\u0010.\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010\u0013J\u000f\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b/\u0010\u0013J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00109\u001a\u0002082\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b;\u0010\u0013J\u0017\u0010<\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010\fJ\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0006H\u0016¢\u0006\u0004\bE\u0010@J\u001f\u0010G\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0011H\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010\fJ\u0017\u0010K\u001a\u00020\u00112\u0006\u0010J\u001a\u000201H\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0011H\u0016¢\u0006\u0004\bM\u0010\u0013J\u000f\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010\fR\"\u0010U\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Z\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010 R\"\u0010]\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010V\u001a\u0004\b[\u0010X\"\u0004\b\\\u0010 R\"\u0010a\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010V\u001a\u0004\b_\u0010X\"\u0004\b`\u0010 R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010V\u001a\u0004\bs\u0010X\"\u0004\bt\u0010 R\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u0010\u0081\u0001\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010x\u001a\u0004\b\u007f\u0010z\"\u0005\b\u0080\u0001\u0010|R\u001e\u0010\u0085\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010@R\u0017\u0010\u0087\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0083\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0083\u0001R\u001e\u0010\u008c\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0083\u0001\u001a\u0005\b\u008b\u0001\u0010@R\u001e\u0010\u008f\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u0083\u0001\u001a\u0005\b\u008e\u0001\u0010@R\u001b\u0010\u0092\u0001\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u0083\u0001\u001a\u0005\b\u0091\u0001\u0010@R\u0017\u0010\u0094\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0083\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0083\u0001R\u001a\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0083\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0083\u0001R\u0019\u0010 \u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0083\u0001R\u0018\u0010¢\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¡\u0001\u0010\u001aR)\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0005\b§\u0001\u0010DR\u001a\u0010«\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010\u00ad\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u0099\u0001R*\u0010µ\u0001\u001a\u00030®\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R\u0018\u0010·\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010\u001aR\u0018\u0010¸\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u001aR\u0017\u0010¹\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\u001aR\u0018\u0010½\u0001\u001a\u00030º\u00018\u0002X\u0082D¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R+\u0010Ä\u0001\u001a\u0005\u0018\u00010¾\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b.\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R\u0017\u0010Å\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR+\u0010Ì\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R%\u0010Í\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b-\u0010\u001a\u001a\u0005\bÍ\u0001\u0010\u0013\"\u0005\bÎ\u0001\u0010%R&\u0010Ò\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b/\u00109\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0005\bÑ\u0001\u0010\u0018R\u001b\u0010Õ\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010Ô\u0001R\u0017\u0010Ö\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006Ø\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Q", "()V", j6f.GPS_DIRECTION_TRUE, "g0", "R", j6f.LATITUDE_SOUTH, "", "N", "()Z", "f0", "", "speedDuration", "setNormalState", "(J)V", "M", "Z", "c0", "b0", "Lcom/tantan/library/svga/SVGAnimationView;", OMSTemplateModeType.view, "d0", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "Y", "a0", "isClick", "e0", "(Z)V", "startValue", "endValue", "Ll/d30;", "endAction", "setDuration", "U", "(IILl/d30;J)V", BloodType.f38728O, "L", "P", "height", "", "h0", "(I)F", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "c", "(I)V", RXScreenCaptureService.KEY_INDEX, "j", "()I", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "f", "headViewHeight", "b", "(F)Z", "e", "h", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "get_background", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "set_background", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;)V", "_background", "Lcom/tantan/library/svga/SVGAnimationView;", "get_svga_loading", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_loading", "_svga_loading", "get_svga_hey_tips", "set_svga_hey_tips", "_svga_hey_tips", "k", "get_hey_pull", "set_hey_pull", "_hey_pull", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;", "get_scroll_view_state", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;", "set_scroll_view_state", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;)V", "_scroll_view_state", "Landroid/widget/FrameLayout;", "m", "Landroid/widget/FrameLayout;", "get_oof_layout", "()Landroid/widget/FrameLayout;", "set_oof_layout", "(Landroid/widget/FrameLayout;)V", "_oof_layout", "n", "get_oof_layout_icon", "set_oof_layout_icon", "_oof_layout_icon", "Lv/VText;", "o", "Lv/VText;", "get_oof_layout_txt", "()Lv/VText;", "set_oof_layout_txt", "(Lv/VText;)V", "_oof_layout_txt", "p", "get_bottom_pull_text", "set_bottom_pull_text", "_bottom_pull_text", "q", "I", "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", "r", "ALLOW_PULL_START", BLiveStormDanmakuGiftResourceType.f44446s, "DEFALUE_TIPS_HEIGH", Constants.KEY_T, "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", "u", "getLOADING_VIEW_HEIGHT", "LOADING_VIEW_HEIGHT", ResourceDirection.f38808v, "getOVER_SCROLL_HEIGHT", "OVER_SCROLL_HEIGHT", "w", "SHOW_PULL_HEY_SVGA_START", BaseSei.f13930X, "SHOW_PULL_TEXT_START", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$HeaderState;", BaseSei.f13931Y, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$HeaderState;", "headerState", BaseSei.f13932Z, "searchHeight", "A", "suggestConHeight", "B", "impressConHeight", b2s.C_ZONE, "isBottomPlayedVibrateAnim", "D", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "getConversationsList", "()Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "setConversationsList", "Ll/w5j0;", "E", "Ll/w5j0;", "trackForQuickChat5", "F", "scrollState", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;", "G", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;", "getQuickChatBubble", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;", "setQuickChatBubble", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;)V", "quickChatBubble", "H", "oofAnimIsRunning", "businessHide", "pushUserMsgFragShowBsChange", "", "K", "Ljava/lang/String;", "stateTimerKey", "Ll/c4g0;", "Ll/c4g0;", "getTimeSubscription", "()Ll/c4g0;", "setTimeSubscription", "(Ll/c4g0;)V", "timeSubscription", "isShowState", "Landroid/animation/ObjectAnimator;", "Landroid/animation/ObjectAnimator;", "getObjectAnimator", "()Landroid/animation/ObjectAnimator;", "setObjectAnimator", "(Landroid/animation/ObjectAnimator;)V", "objectAnimator", "isTouchDown", "setTouchDown", "getLastStartAct", "()J", "setLastStartAct", "lastStartAct", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "scrollAnim", "isShowingTips", "HeaderState", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public C8168b quickChatBubble;

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

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$HeaderState;", "", "<init>", "(Ljava/lang/String;I)V", "NormalState", "SearchState", "GetUserState", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8159a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25540a;

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
            f25540a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView$b */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$b", "Lcom/tantan/library/svga/data/request/RequestCallback;", "Lcom/tantan/library/svga/ResourceKey;", Constants.KEY_KEY, "Lcom/tantan/library/svga/exception/SVGAException;", "e", "", "onLoadFailed", "(Lcom/tantan/library/svga/ResourceKey;Lcom/tantan/library/svga/exception/SVGAException;)V", "Lcom/tantan/library/svga/data/cache/Resource;", "resource", "onResourceReady", "(Lcom/tantan/library/svga/ResourceKey;Lcom/tantan/library/svga/data/cache/Resource;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8160b implements RequestCallback {
        public C8160b() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(ResourceKey key, SVGAException e) {
            key.getClass();
            QuickChatAudioHeaderView.this.m42051S();
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(ResourceKey key, Resource<?> resource) {
            key.getClass();
            resource.getClass();
            QuickChatAudioHeaderView.this.m42051S();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8161c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f25542a;

        public C8161c(d30 d30Var) {
            this.f25542a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f25542a.call();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatAudioHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.MAX_PULL_VIEW_HEIGH = svq.m186103c(80);
        this.ALLOW_PULL_START = svq.m186103c(70);
        this.DEFALUE_TIPS_HEIGH = svq.m186103c(24);
        this.DEFALUE_NORMAL_HEIGH = svq.m186103c(0);
        this.LOADING_VIEW_HEIGHT = svq.m186103c(4);
        this.OVER_SCROLL_HEIGHT = svq.m186103c(50);
        this.SHOW_PULL_HEY_SVGA_START = svq.m186103c(24);
        this.SHOW_PULL_TEXT_START = svq.m186103c(60);
        HeaderState headerState = HeaderState.NormalState;
        this.headerState = headerState;
        this.searchHeight = svq.m186103c(217);
        this.suggestConHeight = svq.m186103c(178);
        this.impressConHeight = svq.m186103c(219);
        this.scrollState = headerState;
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m42046J(layoutInflaterM163037a, this);
        this.trackForQuickChat5 = new w5j0();
        m42050R();
        this.stateTimerKey = "feed_state_quick_timer_key";
    }

    /* JADX INFO: renamed from: A */
    public static Boolean m42014A(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public static Boolean m42015B(QuickChatAudioHeaderView quickChatAudioHeaderView, j760 j760Var) {
        if (!quickChatAudioHeaderView.pushUserMsgFragShowBsChange) {
            return Boolean.TRUE;
        }
        quickChatAudioHeaderView.pushUserMsgFragShowBsChange = false;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: C */
    public static void m42016C(QuickChatAudioHeaderView quickChatAudioHeaderView, List list) {
        if (!vwb.m200296J(list)) {
            quickChatAudioHeaderView.get_scroll_view_state().setBubbleInfoList(list);
            quickChatAudioHeaderView.get_scroll_view_state().m42224s();
        } else {
            BubbleInfo bubbleInfo = new BubbleInfo();
            bubbleInfo.value = "实时状态广场，发现更多有趣的人";
            quickChatAudioHeaderView.get_scroll_view_state().setBubbleInfo(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: D */
    public static Boolean m42017D(j760 j760Var) {
        j760Var.getClass();
        return Boolean.valueOf((j760Var == C4756v.f20124b0 || TextUtils.isEmpty(CoreModule.m29931H().userId())) ? false : true);
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m42018E(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static void m42019F(QuickChatAudioHeaderView quickChatAudioHeaderView) {
        if (quickChatAudioHeaderView.scrollState != HeaderState.SearchState) {
            return;
        }
        if (!quickChatAudioHeaderView.get_svga_loading().isAnimating()) {
            xdl0.m208344M(quickChatAudioHeaderView.get_svga_loading(), true);
            quickChatAudioHeaderView.get_svga_loading().startAnimation();
            quickChatAudioHeaderView.m42048M();
        }
        xdl0.m208344M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, null);
        quickChatAudioHeaderView.m42052T();
        xdl0.m208344M(quickChatAudioHeaderView.get_hey_pull(), false);
        xdl0.m208344M(quickChatAudioHeaderView.get_bottom_pull_text(), false);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static void m42020G(QuickChatAudioHeaderView quickChatAudioHeaderView, j760 j760Var) {
        j760Var.getClass();
        String str = (String) j760Var.f116564a;
        S s = j760Var.f116565b;
        quickChatAudioHeaderView.pushUserMsgFragShowBsChange = true;
        if (Intrinsics.m87488d(str, "notify_search")) {
            quickChatAudioHeaderView.m42055Z();
        } else if (Intrinsics.m87488d("match_success", str)) {
            C8611c.Companion companion = C8611c.INSTANCE;
            if (companion.m50302a().m50297h()) {
                OnlineMatchManager.m50143z().f32594I.onNext(C4756v.f20124b0);
                companion.m50302a().m50298i(0L);
                m42028W(quickChatAudioHeaderView, 0L, 1, null);
                return;
            } else {
                if (quickChatAudioHeaderView.headerState == HeaderState.GetUserState) {
                    OnlineMatchManager.m50143z().f32594I.onNext(C4756v.f20124b0);
                    return;
                }
                m42028W(quickChatAudioHeaderView, 0L, 1, null);
                C8168b c8168bM42197U = quickChatAudioHeaderView.getQuickChatBubble().m42198V(str).m42197U(quickChatAudioHeaderView.headerState);
                s.getClass();
                c8168bM42197U.m42199W((OnlineMatchMatchUser) s);
                quickChatAudioHeaderView.getQuickChatBubble().m96808x(CorePopLevel.QUICK_NOTIFY_MATCH_SUCCESS);
                hdb0.m130575c().m130582i(quickChatAudioHeaderView.getQuickChatBubble());
            }
        } else if (Intrinsics.m87488d("match_timeout", str)) {
            ak50.INSTANCE.m97144a().m97136H(quickChatAudioHeaderView.getAct(), "match_timeout");
            m42028W(quickChatAudioHeaderView, 0L, 1, null);
        } else if (Intrinsics.m87488d("tickets_broadcast", str)) {
            if (quickChatAudioHeaderView.headerState == HeaderState.GetUserState) {
                OnlineMatchManager.m50143z().f32594I.onNext(C4756v.f20124b0);
                return;
            }
            C8611c.Companion companion2 = C8611c.INSTANCE;
            if (companion2.m50302a().m50297h()) {
                OnlineMatchManager.m50143z().f32594I.onNext(C4756v.f20124b0);
                companion2.m50302a().m50298i(0L);
                m42028W(quickChatAudioHeaderView, 0L, 1, null);
                CoreModule.f17545c.f19558D0.m34836L4(null);
                return;
            }
            m42028W(quickChatAudioHeaderView, 0L, 1, null);
            if (!(s instanceof OnlineMatchPushUser)) {
                return;
            }
            quickChatAudioHeaderView.getQuickChatBubble().m42198V(str).m42197U(quickChatAudioHeaderView.headerState).m42201Y((OnlineMatchPushUser) s);
            quickChatAudioHeaderView.getQuickChatBubble().m96808x(CorePopLevel.QUICK_NOTIFY_BROADCAST);
            hdb0.m130575c().m130582i(quickChatAudioHeaderView.getQuickChatBubble());
        } else if (Intrinsics.m87488d("notify_normal_state", str)) {
            m42028W(quickChatAudioHeaderView, 0L, 1, null);
        }
        OnlineMatchManager.m50143z().f32594I.onNext(C4756v.f20124b0);
    }

    /* JADX INFO: renamed from: H */
    public static void m42021H(QuickChatAudioHeaderView quickChatAudioHeaderView) {
        HeaderState headerState = quickChatAudioHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        xdl0.m208344M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, null);
        quickChatAudioHeaderView.m42052T();
        xdl0.m208344M(quickChatAudioHeaderView.get_svga_loading(), false);
        xdl0.m208344M(quickChatAudioHeaderView.get_hey_pull(), false);
        xdl0.m208344M(quickChatAudioHeaderView.get_bottom_pull_text(), false);
        xdl0.m208344M(quickChatAudioHeaderView.get_background(), true);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_loading(), false, 1, null);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, null);
        quickChatAudioHeaderView.headerState = headerState2;
    }

    /* JADX INFO: renamed from: I */
    public static j760 m42022I(Triple triple) {
        triple.getClass();
        return (j760) triple.getFirst();
    }

    /* JADX INFO: renamed from: N */
    private final boolean m42024N() {
        ConvCellList convCellList;
        ConversationsList conversationsList;
        ConversationsListHeadView conversationsListHeadView;
        ConvCellList convCellList2;
        ConversationsList conversationsList2 = this.conversationsList;
        if (conversationsList2 != null && (convCellList2 = conversationsList2.f25105V) != null && convCellList2.getCount() == 0) {
            return true;
        }
        ConversationsList conversationsList3 = this.conversationsList;
        return (conversationsList3 == null || (convCellList = conversationsList3.f25105V) == null || convCellList.getFirstVisiblePosition() != 0 || (conversationsList = this.conversationsList) == null || (conversationsListHeadView = conversationsList.f25085E0) == null || conversationsListHeadView.getTop() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: P */
    private final boolean m42025P() {
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
    private final void m42026Q() {
        Act act = getAct();
        C22392a<j760<String, Object>> c22392a = OnlineMatchManager.m50143z().f32594I;
        Act act2 = getAct();
        act2.getClass();
        C22306c<TabName> c22306cM39819i7 = ((NewMainAct) act2).m39819i7();
        C22306c<C4319c> c22306cLifecycle = getAct().lifecycle();
        final Function3 function3 = new Function3() { // from class: l.srb0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return QuickChatAudioHeaderView.m42037r((j760) obj, (TabName) obj2, (C4319c) obj3);
            }
        };
        C22306c c22306cDuringCreated = act.duringCreated(mkd0.m154985s(c22392a, c22306cM39819i7, c22306cLifecycle, new y9j() { // from class: l.wrb0
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return QuickChatAudioHeaderView.m42035p(function3, obj, obj2, obj3);
            }
        }));
        final Function1 function1 = new Function1() { // from class: l.xrb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m42043x((Triple) obj);
            }
        };
        C22306c c22306cFilter = c22306cDuringCreated.filter(new w9j() { // from class: l.yrb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m42014A(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.zrb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m42022I((Triple) obj);
            }
        };
        C22306c map = c22306cFilter.map(new w9j() { // from class: l.bsb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m42030k(function2, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.csb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m42017D((j760) obj);
            }
        };
        map.filter(new w9j() { // from class: l.dsb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m42018E(function4, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.esb0
            @Override // p149l.e30
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m42020G(this.f93000a, (j760) obj);
            }
        }));
        Act act3 = getAct();
        Act act4 = getAct();
        act4.getClass();
        C22306c c22306cDistinctUntilChanged = act3.duringCreated(mkd0.m154984r(((NewMainAct) act4).m39819i7(), getAct().lifecycle(), new x9j() { // from class: l.fsb0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return QuickChatAudioHeaderView.m42041v((TabName) obj, (C4319c) obj2);
            }
        }), false).distinctUntilChanged();
        final Function1 function5 = new Function1() { // from class: l.trb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m42015B(this.f171801a, (j760) obj);
            }
        };
        c22306cDistinctUntilChanged.filter(new w9j() { // from class: l.urb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m42031l(function5, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.vrb0
            @Override // p149l.e30
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m42033n(this.f182714a, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public static final void m42027V(QuickChatAudioHeaderView quickChatAudioHeaderView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        quickChatAudioHeaderView.mo41984c(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m42028W(QuickChatAudioHeaderView quickChatAudioHeaderView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        quickChatAudioHeaderView.setNormalState(j);
    }

    /* JADX INFO: renamed from: X */
    public static final void m42029X(QuickChatAudioHeaderView quickChatAudioHeaderView, View view) {
        quickChatAudioHeaderView.m42060e0(true);
    }

    /* JADX INFO: renamed from: k */
    public static j760 m42030k(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static Boolean m42031l(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m42033n(QuickChatAudioHeaderView quickChatAudioHeaderView, j760 j760Var) {
        if ((j760Var != null ? (C4319c) j760Var.f116565b : null) == C4319c.f15548i) {
            if ((j760Var != null ? (TabName) j760Var.f116564a : null) == TabName.Msg) {
                int i = C8159a.f25540a[quickChatAudioHeaderView.headerState.ordinal()];
                if (i == 1) {
                    quickChatAudioHeaderView.getQuickChatBubble().m42204b0();
                } else if (i == 2) {
                    m42028W(quickChatAudioHeaderView, 0L, 1, null);
                } else {
                    if (i != 3) {
                        l9r.m149037a();
                        return;
                    }
                    quickChatAudioHeaderView.m42055Z();
                }
                if (ogl0.m164239R() && quickChatAudioHeaderView.getQuickChatBubble().m42195N() && C8611c.INSTANCE.m50302a().getCurrentTime() != 0) {
                    quickChatAudioHeaderView.getQuickChatBubble().m42204b0();
                    return;
                }
                return;
            }
        }
        quickChatAudioHeaderView.getQuickChatBubble().m42205c0();
        quickChatAudioHeaderView.m42062g0();
    }

    /* JADX INFO: renamed from: o */
    public static void m42034o(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static Triple m42035p(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: q */
    public static void m42036q(long j, QuickChatAudioHeaderView quickChatAudioHeaderView, long j2) {
        if (j2 == j - 1) {
            quickChatAudioHeaderView.isShowState = true;
            xdl0.m208344M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
            SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, null);
            xdl0.m208344M(quickChatAudioHeaderView.get_hey_pull(), false);
            SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, null);
            if (quickChatAudioHeaderView.get_background().m54587p()) {
                quickChatAudioHeaderView.m42058c0();
            } else {
                quickChatAudioHeaderView.m42057b0();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static Triple m42037r(j760 j760Var, TabName tabName, C4319c c4319c) {
        return new Triple(j760Var, tabName, c4319c);
    }

    private final void setNormalState(long speedDuration) {
        getQuickChatBubble().m42200X();
        if (!m42024N()) {
            this.scrollState = HeaderState.NormalState;
            m42053U(getLayoutParams().height, 0, new d30() { // from class: l.msb0
                @Override // p149l.d30
                public final void call() {
                    QuickChatAudioHeaderView.m42021H(this.f135461a);
                }
            }, speedDuration);
        } else {
            this.scrollState = HeaderState.NormalState;
            boolean zM42047L = m42047L();
            this.isShowingTips = zM42047L;
            m42053U(getLayoutParams().height, zM42047L ? this.DEFALUE_TIPS_HEIGH : getDEFALUE_NORMAL_HEIGH(), new d30() { // from class: l.lsb0
                @Override // p149l.d30
                public final void call() {
                    QuickChatAudioHeaderView.m42039t(this.f129842a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m42039t(final QuickChatAudioHeaderView quickChatAudioHeaderView) {
        HeaderState headerState = quickChatAudioHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        if (quickChatAudioHeaderView.isShowingTips) {
            quickChatAudioHeaderView.setOnClickListener(new View.OnClickListener() { // from class: l.ksb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickChatAudioHeaderView.m42029X(this.f124437a, view);
                }
            });
            if (!quickChatAudioHeaderView.get_svga_hey_tips().isAnimating()) {
                quickChatAudioHeaderView.m42059d0(quickChatAudioHeaderView.get_svga_hey_tips());
            }
        } else {
            quickChatAudioHeaderView.setOnClickListener(null);
            xdl0.m208344M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
            SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, null);
        }
        quickChatAudioHeaderView.m42052T();
        xdl0.m208344M(quickChatAudioHeaderView.get_svga_loading(), false);
        xdl0.m208344M(quickChatAudioHeaderView.get_hey_pull(), false);
        xdl0.m208344M(quickChatAudioHeaderView.get_bottom_pull_text(), false);
        xdl0.m208344M(quickChatAudioHeaderView.get_background(), true);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_loading(), false, 1, null);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, null);
        quickChatAudioHeaderView.headerState = headerState2;
    }

    /* JADX INFO: renamed from: u */
    public static void m42040u() {
    }

    /* JADX INFO: renamed from: v */
    public static j760 m42041v(TabName tabName, C4319c c4319c) {
        return vwb.m200311Y(tabName, c4319c);
    }

    /* JADX INFO: renamed from: w */
    public static void m42042w(QuickChatAudioHeaderView quickChatAudioHeaderView, Throwable th) {
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.value = "实时状态广场，发现更多有趣的人";
        quickChatAudioHeaderView.get_scroll_view_state().setBubbleInfo(bubbleInfo);
    }

    /* JADX INFO: renamed from: x */
    public static Boolean m42043x(Triple triple) {
        return Boolean.valueOf(triple.getSecond() == TabName.Msg && Intrinsics.m87488d(triple.getThird(), C4319c.f15548i));
    }

    /* JADX INFO: renamed from: y */
    public static void m42044y(QuickChatAudioHeaderView quickChatAudioHeaderView) {
        quickChatAudioHeaderView.isBottomPlayedVibrateAnim = false;
    }

    /* JADX INFO: renamed from: z */
    public static void m42045z(QuickChatAudioHeaderView quickChatAudioHeaderView, View view) {
        quickChatAudioHeaderView.m42060e0(true);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final View m42046J(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM165740b = osb0.m165740b(this, inflater, parent);
        viewM165740b.getClass();
        return viewM165740b;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m42047L() {
        boolean z = false;
        if (this.businessHide) {
            return false;
        }
        int iM203413b = wjc0.m203413b(CoreModule.f17545c.m31484o3(), CoreModule.f17545c.f19642f0.m32796Se(), Boolean.valueOf(ife.m135906o().m135908k(BannerLoc.get("conversation"))));
        if (OnlineMatchManager.m50143z().m50157N() || OnlineMatchManager.m50143z().m50156M()) {
            z = true;
        } else if (OnlineMatchManager.m50143z().m50182n0() && iM203413b <= OnlineMatchManager.m50143z().f32598b.get().intValue()) {
            OnlineMatchManager.m50143z().m50179k0();
            OnlineMatchManager.m50143z().m50176h0(true);
            z = true;
        }
        OnlineMatchManager.m50143z().f32598b.put(Integer.valueOf(iM203413b));
        return z;
    }

    /* JADX INFO: renamed from: M */
    public final void m42048M() {
        xdl0.m208344M(get_scroll_view_state(), false);
        if (vwb.m200296J(get_scroll_view_state().getBubbleInfoLists())) {
            return;
        }
        get_scroll_view_state().m42226u();
        get_scroll_view_state().m42216k();
    }

    /* JADX INFO: renamed from: O */
    public final void m42049O() {
        this.isShowingTips = false;
        if (OnlineMatchManager.m50143z().m50157N()) {
            OnlineMatchManager.m50143z().m50177i0();
        } else if (OnlineMatchManager.m50143z().m50156M()) {
            OnlineMatchManager.m50143z().m50176h0(false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m42050R() {
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getLayoutParams().height = 0;
        if (!get_background().m54587p() && !ogl0.m164246Y()) {
            ViewGroup.LayoutParams layoutParams = get_background().getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = xdl0.m208412y0();
            layoutParams2.height = xdl0.m208408w0();
            layoutParams2.topMargin = -t100.f167243R;
            get_background().setLayoutParams(layoutParams2);
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/d436ea17-bcbc-46b3-81bd-8d6d94a8537510.so").autoPlay(false).frameMode(SVGAnimationView.FrameMode.AFTER).loadCallback(new C8160b()).into(get_svga_hey_tips());
    }

    /* JADX INFO: renamed from: S */
    public final void m42051S() {
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/d436ea17-bcbc-46b3-81bd-8d6d94a8537510.so").autoPlay(false).into(get_hey_pull());
        Context context2 = getContext();
        context2.getClass();
        SVGALoader.with(context2).from("https://auto.tancdn.com/v1/raw/402a91d3-0864-48c6-a72d-133b03a6d8e610.so").autoPlay(false).into(get_svga_loading());
    }

    /* JADX INFO: renamed from: T */
    public final void m42052T() {
        if (get_scroll_view_state() != null && get_scroll_view_state().getVisibility() == 4) {
            xdl0.m208344M(get_scroll_view_state(), true);
            get_scroll_view_state().m42224s();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m42053U(int startValue, int endValue, d30 endAction, long setDuration) {
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
                    QuickChatAudioHeaderView.m42027V(this.f160736a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new C8161c(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m42054Y() {
        String str;
        if (get_background().m54587p()) {
            get_bottom_pull_text().setTextColor(Color.parseColor("#99FFFFFF"));
            str = "选择与描述特质最相符的他";
        } else {
            str = "下拉找到正在等你的人";
        }
        get_bottom_pull_text().setText(str);
    }

    /* JADX INFO: renamed from: Z */
    public final void m42055Z() {
        HeaderState headerState = HeaderState.SearchState;
        this.headerState = headerState;
        setOnClickListener(new View.OnClickListener() { // from class: l.nsb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatAudioHeaderView.m42045z(this.f140257a, view);
            }
        });
        getQuickChatBubble().m42200X();
        if (m42024N()) {
            this.scrollState = headerState;
            m42053U(getLayoutParams().height, getLOADING_VIEW_HEIGHT(), new d30() { // from class: l.qrb0
                @Override // p149l.d30
                public final void call() {
                    QuickChatAudioHeaderView.m42019F(this.f155978a);
                }
            }, 500L);
            return;
        }
        this.headerState = headerState;
        xdl0.m208344M(get_svga_hey_tips(), false);
        SVGAnimationView.stopAnimation$default(get_svga_hey_tips(), false, 1, null);
        m42052T();
        xdl0.m208344M(get_svga_loading(), false);
        xdl0.m208344M(get_hey_pull(), false);
        xdl0.m208344M(get_bottom_pull_text(), false);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
        SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo41982a() {
        HeaderState headerState = this.headerState;
        return headerState == HeaderState.NormalState || headerState == HeaderState.SearchState;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m42056a0() {
        float height = (((getHeight() - this.SHOW_PULL_HEY_SVGA_START) * 0.16f) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START)) + 1.0f;
        float height2 = 1.0f + (((getHeight() - this.SHOW_PULL_HEY_SVGA_START) * 0.16f) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START));
        if (get_background().m54587p()) {
            int iM186890d = (t100.m186890d(20.0f) * (getHeight() - this.SHOW_PULL_HEY_SVGA_START)) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START);
            get_oof_layout().setScaleX(height);
            get_oof_layout().setScaleY(height2);
            xdl0.m208360X(get_oof_layout(), iM186890d);
            return;
        }
        int iM186890d2 = t100.m186890d(4.0f) + ((t100.m186890d(16.0f) * (getHeight() - this.SHOW_PULL_HEY_SVGA_START)) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START));
        get_scroll_view_state().setScaleX(height);
        get_scroll_view_state().setScaleY(height2);
        xdl0.m208360X(get_scroll_view_state(), iM186890d2);
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: b */
    public boolean mo41983b(float headViewHeight) {
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m42057b0() {
        xdl0.m208344M(get_scroll_view_state(), true);
        xdl0.m208344M(get_oof_layout(), false);
        List<BubbleInfo> bubbleInfoLists = get_scroll_view_state().getBubbleInfoLists();
        bubbleInfoLists.getClass();
        if (vwb.m200296J(bubbleInfoLists)) {
            getAct().duringCreated(CoreModule.m29934N().mo60335Yr()).subscribe(mkd0.m154956H(new e30() { // from class: l.prb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    QuickChatAudioHeaderView.m42016C(this.f150866a, (List) obj);
                }
            }, new e30() { // from class: l.asb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    QuickChatAudioHeaderView.m42042w(this.f71408a, (Throwable) obj);
                }
            }));
        } else if (get_scroll_view_state().m42219n()) {
            get_scroll_view_state().m42224s();
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: c */
    public void mo41984c(int height) {
        int i = C8159a.f25540a[this.headerState.ordinal()];
        if (i == 1) {
            SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
            xdl0.m208344M(get_hey_pull(), false);
            xdl0.m208344M(get_bottom_pull_text(), false);
        } else if (i == 2) {
            if (height != this.DEFALUE_TIPS_HEIGH) {
                SVGAnimationView.stopAnimation$default(get_svga_hey_tips(), false, 1, null);
                xdl0.m208344M(get_svga_hey_tips(), false);
            }
            if (height > this.SHOW_PULL_HEY_SVGA_START) {
                if (!get_hey_pull().isAnimating()) {
                    m42059d0(get_hey_pull());
                }
                m42056a0();
            } else {
                SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
                xdl0.m208344M(get_hey_pull(), false);
            }
            if (height >= this.ALLOW_PULL_START && !this.isBottomPlayedVibrateAnim && this.isTouchDown) {
                this.isBottomPlayedVibrateAnim = true;
                Context context = getContext();
                context.getClass();
                Object systemService = ((Act) context).getSystemService("vibrator");
                systemService.getClass();
                Vibrator vibrator = (Vibrator) systemService;
                vibrator.vibrate(500L);
                vibrator.vibrate(new long[]{100, 100}, -1);
            }
            if (height >= this.SHOW_PULL_TEXT_START) {
                xdl0.m208344M(get_bottom_pull_text(), true);
                if (height >= getMAX_PULL_VIEW_HEIGH()) {
                    get_bottom_pull_text().setAlpha(1.0f);
                } else {
                    get_bottom_pull_text().setAlpha(m42063h0(height));
                }
                m42054Y();
            } else {
                xdl0.m208344M(get_bottom_pull_text(), false);
            }
        } else {
            if (i != 3) {
                l9r.m149037a();
                return;
            }
            if (height <= getLOADING_VIEW_HEIGHT()) {
                if (!get_svga_loading().isAnimating()) {
                    xdl0.m208344M(get_svga_loading(), true);
                    get_svga_loading().startAnimation();
                    m42048M();
                }
                SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
                xdl0.m208344M(get_hey_pull(), false);
                xdl0.m208344M(get_bottom_pull_text(), false);
            } else {
                SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
                xdl0.m208344M(get_svga_loading(), false);
                SVGAnimationView.stopAnimation$default(get_svga_hey_tips(), false, 1, null);
                xdl0.m208344M(get_svga_hey_tips(), false);
                if (height > this.SHOW_PULL_HEY_SVGA_START) {
                    if (!get_hey_pull().isAnimating()) {
                        m42059d0(get_hey_pull());
                    }
                    m42056a0();
                } else {
                    SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
                    xdl0.m208344M(get_hey_pull(), false);
                }
                if (height >= this.ALLOW_PULL_START && !this.isBottomPlayedVibrateAnim && this.isTouchDown) {
                    this.isBottomPlayedVibrateAnim = true;
                    Context context2 = getContext();
                    context2.getClass();
                    Object systemService2 = ((Act) context2).getSystemService("vibrator");
                    systemService2.getClass();
                    Vibrator vibrator2 = (Vibrator) systemService2;
                    vibrator2.vibrate(500L);
                    vibrator2.vibrate(new long[]{100, 100}, -1);
                }
                if (height >= this.SHOW_PULL_TEXT_START) {
                    xdl0.m208344M(get_bottom_pull_text(), true);
                    if (height >= getMAX_PULL_VIEW_HEIGH()) {
                        get_bottom_pull_text().setAlpha(1.0f);
                    } else {
                        get_bottom_pull_text().setAlpha(m42063h0(height));
                    }
                    m42054Y();
                } else {
                    xdl0.m208344M(get_bottom_pull_text(), false);
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
    public final void m42058c0() {
        xdl0.m208344M(get_scroll_view_state(), false);
        xdl0.m208344M(get_oof_layout(), true);
        get_oof_layout_txt().setText("极限四选一");
        if (!this.oofAnimIsRunning) {
            this.oofAnimIsRunning = true;
            Context context = getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/44491780-6504-4c7f-a828-576c7adcd7f612.svga").autoPlay(true).into(get_oof_layout_icon());
        }
        zvf0.m220402x("e_choose_entrance", OMSDialogPositon.p_messages_view);
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: d */
    public void mo41985d(@NotNull ConversationsList conversationsList) {
        conversationsList.getClass();
        this.conversationsList = conversationsList;
        setQuickChatBubble(new C8168b(getAct()));
        getQuickChatBubble().m42194M(getAct());
        m42026Q();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m42059d0(SVGAnimationView view) {
        boolean zM54587p = get_background().m54587p();
        boolean zM164246Y = ogl0.m164246Y();
        if (!zM54587p && !zM164246Y) {
            xdl0.m208344M(view, true);
            view.startAnimation();
            return;
        }
        xdl0.m208344M(get_scroll_view_state(), false);
        if (this.isShowState) {
            if (zM54587p) {
                m42058c0();
                return;
            } else {
                m42057b0();
                return;
            }
        }
        xdl0.m208344M(view, true);
        view.startAnimation();
        if (e51.m114737B(this.stateTimerKey)) {
            return;
        }
        m42061f0();
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: e */
    public boolean mo41986e() {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m42060e0(boolean isClick) {
        m42049O();
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList != null && SystemClock.uptimeMillis() - this.lastStartAct > 500) {
            this.lastStartAct = SystemClock.uptimeMillis();
            orb0 orb0Var = new orb0(conversationsList, this);
            if (get_background().m54587p()) {
                if (isClick) {
                    zvf0.m220396r("e_choose_entrance", OMSDialogPositon.p_messages_view);
                } else {
                    zvf0.m220371D("e_choose_entrance_drop", OMSDialogPositon.p_messages_view, new j760[0]);
                }
                getAct().startActivityWithCustomTransition(OOFMkWebViewAct.m41782m2(getAct()), orb0Var);
                return;
            }
            if (!ogl0.m164246Y()) {
                getAct().startActivityForResultWithCustomTransition(DropDownAct.INSTANCE.m54460a(getAct()), 18, orb0Var);
                return;
            }
            List<BubbleInfo> bubbleInfoLists = get_scroll_view_state().getBubbleInfoLists();
            bubbleInfoLists.getClass();
            BubbleInfo bubbleInfo = null;
            BubbleInfo bubbleInfo2 = vwb.m200296J(bubbleInfoLists) ? null : bubbleInfoLists.get(get_scroll_view_state().getCurrentIndex() % bubbleInfoLists.size());
            if (bubbleInfo2 != null && !TextUtils.equals(bubbleInfo2.value, "实时状态广场，发现更多有趣的人")) {
                bubbleInfo = bubbleInfo2;
            }
            getAct().startActivityWithCustomTransition(CoreModule.m29934N().mo60303P6(getAct(), true, bubbleInfo, OMSDialogPositon.p_messages_view), orb0Var);
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: f */
    public void mo41987f() {
        if (m42025P()) {
            int i = C8159a.f25540a[this.headerState.ordinal()];
            if (i == 2) {
                m42028W(this, 0L, 1, null);
            } else {
                if (i != 3) {
                    return;
                }
                m42055Z();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m42061f0() {
        final long jM79299A = RemoteConfig.m79298x().m79299A("second_floor_refresh_state_time");
        this.timeSubscription = getAct().duringCreated(e51.m114749N(this.stateTimerKey, (int) jM79299A)).subscribe(mkd0.m154957I(new e30() { // from class: l.gsb0
            @Override // p149l.e30
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m42036q(jM79299A, this, ((Long) obj).longValue());
            }
        }, new e30() { // from class: l.hsb0
            @Override // p149l.e30
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m42034o((Throwable) obj);
            }
        }, new d30() { // from class: l.isb0
            @Override // p149l.d30
            public final void call() {
                QuickChatAudioHeaderView.m42040u();
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: g */
    public void mo41988g(int height, boolean isAutoTopShow) {
        int defalue_normal_heigh;
        if (this.headerState == HeaderState.GetUserState) {
            return;
        }
        if (isAutoTopShow || m42025P()) {
            if (this.headerState != HeaderState.NormalState) {
                int iAbs = getLayoutParams().height + Math.abs(height);
                if (iAbs >= getLOADING_VIEW_HEIGHT()) {
                    iAbs = getLOADING_VIEW_HEIGHT();
                }
                if (isAutoTopShow) {
                    iAbs = getLOADING_VIEW_HEIGHT();
                }
                mo41984c(iAbs);
                xdl0.m208344M(get_svga_loading(), true);
                if (!get_svga_loading().isAnimating()) {
                    get_svga_loading().startAnimation();
                }
                m42048M();
                return;
            }
            int iAbs2 = getLayoutParams().height + Math.abs(height);
            boolean z = this.isShowingTips;
            if (!isAutoTopShow) {
                defalue_normal_heigh = z ? this.DEFALUE_TIPS_HEIGH : this.OVER_SCROLL_HEIGHT;
                if (iAbs2 >= defalue_normal_heigh) {
                }
                mo41984c(iAbs2);
                if (this.isShowingTips || get_svga_hey_tips().isAnimating()) {
                }
                m42059d0(get_svga_hey_tips());
                return;
            }
            defalue_normal_heigh = z ? this.DEFALUE_TIPS_HEIGH : getDEFALUE_NORMAL_HEIGH();
            iAbs2 = defalue_normal_heigh;
            mo41984c(iAbs2);
            if (this.isShowingTips) {
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m42062g0() {
        c4g0 c4g0Var = this.timeSubscription;
        if (c4g0Var != null) {
            c4g0Var.getClass();
            if (!c4g0Var.isUnsubscribed()) {
                c4g0 c4g0Var2 = this.timeSubscription;
                c4g0Var2.getClass();
                c4g0Var2.unsubscribe();
            }
        }
        if (e51.m114737B(this.stateTimerKey)) {
            e51.m114746K(this.stateTimerKey);
        }
        get_scroll_view_state().m42226u();
        SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
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
        int i = t100.f167260i;
        if (upa.m194632F0() || upa.m194741d3() || upa.m194752g()) {
            i = 0;
        }
        HeaderState headerState = this.headerState;
        if (headerState == HeaderState.NormalState || headerState == HeaderState.SearchState || headerState == HeaderState.GetUserState) {
            return i + getLayoutParams().height;
        }
        return 0;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getLOADING_VIEW_HEIGHT() {
        return this.LOADING_VIEW_HEIGHT;
    }

    public final long getLastStartAct() {
        return this.lastStartAct;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
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
    public final C8168b getQuickChatBubble() {
        C8168b c8168b = this.quickChatBubble;
        if (c8168b != null) {
            return c8168b;
        }
        Intrinsics.m87502r("quickChatBubble");
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
        Intrinsics.m87502r("_background");
        return null;
    }

    @NotNull
    public final VText get_bottom_pull_text() {
        VText vText = this._bottom_pull_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_bottom_pull_text");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_hey_pull() {
        SVGAnimationView sVGAnimationView = this._hey_pull;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_hey_pull");
        return null;
    }

    @NotNull
    public final FrameLayout get_oof_layout() {
        FrameLayout frameLayout = this._oof_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_oof_layout");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_oof_layout_icon() {
        SVGAnimationView sVGAnimationView = this._oof_layout_icon;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_oof_layout_icon");
        return null;
    }

    @NotNull
    public final VText get_oof_layout_txt() {
        VText vText = this._oof_layout_txt;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_oof_layout_txt");
        return null;
    }

    @NotNull
    public final CoreAutoScrollView get_scroll_view_state() {
        CoreAutoScrollView coreAutoScrollView = this._scroll_view_state;
        if (coreAutoScrollView != null) {
            return coreAutoScrollView;
        }
        Intrinsics.m87502r("_scroll_view_state");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_hey_tips() {
        SVGAnimationView sVGAnimationView = this._svga_hey_tips;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_hey_tips");
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

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: h */
    public void mo41989h() {
        int i = C8159a.f25540a[this.headerState.ordinal()];
        if (i == 2) {
            setNormalState(0L);
            m42062g0();
        } else {
            if (i != 3) {
                return;
            }
            m42055Z();
            m42062g0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final float m42063h0(int height) {
        return ((height - this.SHOW_PULL_TEXT_START) * 1.0f) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_TEXT_START);
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: i */
    public void mo41990i() {
        this.isTouchDown = true;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: j */
    public int mo41991j() {
        this.isTouchDown = false;
        postDelayed(new Runnable() { // from class: l.jsb0
            @Override // java.lang.Runnable
            public final void run() {
                QuickChatAudioHeaderView.m42044y(this.f119485a);
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
            m42060e0(false);
            return getDEFALUE_NORMAL_HEIGH();
        }
        if (this.headerState == headerState2) {
            m42055Z();
            return getLOADING_VIEW_HEIGHT();
        }
        m42028W(this, 0L, 1, null);
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

    public final void setQuickChatBubble(@NotNull C8168b c8168b) {
        c8168b.getClass();
        this.quickChatBubble = c8168b;
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
