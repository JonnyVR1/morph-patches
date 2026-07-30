package com.p051p1.mobile.putong.core.newui.messages.anim.view;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4907v;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConvCellList;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import com.p051p1.mobile.putong.core.newui.messages.OOFMkWebViewAct;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.state.CoreAutoScrollView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8774c;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.view.DropDownBgView;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VText;
import p153l.afj0;
import p153l.bnl0;
import p153l.c4s;
import p153l.dsc0;
import p153l.gra;
import p153l.gs50;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.l51;
import p153l.llb0;
import p153l.mge;
import p153l.nbr;
import p153l.p7f;
import p153l.p9r;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.rcj;
import p153l.s0c0;
import p153l.scj;
import p153l.spl0;
import p153l.szb0;
import p153l.txq;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002×\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0019\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\fJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\fJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\fJ\u000f\u0010\"\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\fJ\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010%J1\u0010+\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010\fJ\u000f\u0010.\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010\u0013J\u000f\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b/\u0010\u0013J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00109\u001a\u0002082\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b;\u0010\u0013J\u0017\u0010<\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010\fJ\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0006H\u0016¢\u0006\u0004\bE\u0010@J\u001f\u0010G\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0011H\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010\fJ\u0017\u0010K\u001a\u00020\u00112\u0006\u0010J\u001a\u000201H\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0011H\u0016¢\u0006\u0004\bM\u0010\u0013J\u000f\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010\fR\"\u0010U\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Z\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010 R\"\u0010]\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010V\u001a\u0004\b[\u0010X\"\u0004\b\\\u0010 R\"\u0010a\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010V\u001a\u0004\b_\u0010X\"\u0004\b`\u0010 R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010V\u001a\u0004\bs\u0010X\"\u0004\bt\u0010 R\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u0010\u0081\u0001\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010x\u001a\u0004\b\u007f\u0010z\"\u0005\b\u0080\u0001\u0010|R\u001e\u0010\u0085\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010@R\u0017\u0010\u0087\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0083\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0083\u0001R\u001e\u0010\u008c\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0083\u0001\u001a\u0005\b\u008b\u0001\u0010@R\u001e\u0010\u008f\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u0083\u0001\u001a\u0005\b\u008e\u0001\u0010@R\u001b\u0010\u0092\u0001\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u0083\u0001\u001a\u0005\b\u0091\u0001\u0010@R\u0017\u0010\u0094\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0083\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0083\u0001R\u001a\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0083\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0083\u0001R\u0019\u0010 \u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0083\u0001R\u0018\u0010¢\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¡\u0001\u0010\u001aR)\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0005\b§\u0001\u0010DR\u001a\u0010«\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010\u00ad\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u0099\u0001R*\u0010µ\u0001\u001a\u00030®\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R\u0018\u0010·\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010\u001aR\u0018\u0010¸\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u001aR\u0017\u0010¹\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\u001aR\u0018\u0010½\u0001\u001a\u00030º\u00018\u0002X\u0082D¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R+\u0010Ä\u0001\u001a\u0005\u0018\u00010¾\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b.\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R\u0017\u0010Å\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR+\u0010Ì\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R%\u0010Í\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b-\u0010\u001a\u001a\u0005\bÍ\u0001\u0010\u0013\"\u0005\bÎ\u0001\u0010%R&\u0010Ò\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b/\u00109\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0005\bÑ\u0001\u0010\u0018R\u001b\u0010Õ\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010Ô\u0001R\u0017\u0010Ö\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006Ø\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Q", "()V", p7f.GPS_DIRECTION_TRUE, "g0", "R", p7f.LATITUDE_SOUTH, "", "N", "()Z", "f0", "", "speedDuration", "setNormalState", "(J)V", "M", "Z", "c0", "b0", "Lcom/tantan/library/svga/SVGAnimationView;", OMSTemplateModeType.view, "d0", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "Y", "a0", "isClick", "e0", "(Z)V", "startValue", "endValue", "Ll/x20;", "endAction", "setDuration", "U", "(IILl/x20;J)V", BloodType.f39576O, "L", "P", "height", "", "h0", "(I)F", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "c", "(I)V", RXScreenCaptureService.KEY_INDEX, "j", "()I", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "f", "headViewHeight", "b", "(F)Z", "e", "h", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "get_background", "()Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "set_background", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;)V", "_background", "Lcom/tantan/library/svga/SVGAnimationView;", "get_svga_loading", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_loading", "_svga_loading", "get_svga_hey_tips", "set_svga_hey_tips", "_svga_hey_tips", "k", "get_hey_pull", "set_hey_pull", "_hey_pull", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;", "get_scroll_view_state", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;", "set_scroll_view_state", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/state/CoreAutoScrollView;)V", "_scroll_view_state", "Landroid/widget/FrameLayout;", "m", "Landroid/widget/FrameLayout;", "get_oof_layout", "()Landroid/widget/FrameLayout;", "set_oof_layout", "(Landroid/widget/FrameLayout;)V", "_oof_layout", "n", "get_oof_layout_icon", "set_oof_layout_icon", "_oof_layout_icon", "Lv/VText;", "o", "Lv/VText;", "get_oof_layout_txt", "()Lv/VText;", "set_oof_layout_txt", "(Lv/VText;)V", "_oof_layout_txt", "p", "get_bottom_pull_text", "set_bottom_pull_text", "_bottom_pull_text", "q", "I", "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", "r", "ALLOW_PULL_START", BLiveStormDanmakuGiftResourceType.f45294s, "DEFALUE_TIPS_HEIGH", Constants.KEY_T, "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", "u", "getLOADING_VIEW_HEIGHT", "LOADING_VIEW_HEIGHT", ResourceDirection.f39656v, "getOVER_SCROLL_HEIGHT", "OVER_SCROLL_HEIGHT", "w", "SHOW_PULL_HEY_SVGA_START", BaseSei.f14624X, "SHOW_PULL_TEXT_START", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$HeaderState;", BaseSei.f14625Y, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$HeaderState;", "headerState", BaseSei.f14626Z, "searchHeight", "A", "suggestConHeight", "B", "impressConHeight", c4s.C_ZONE, "isBottomPlayedVibrateAnim", "D", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "getConversationsList", "()Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "setConversationsList", "Ll/afj0;", "E", "Ll/afj0;", "trackForQuickChat5", "F", "scrollState", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;", "G", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;", "getQuickChatBubble", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;", "setQuickChatBubble", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/b;)V", "quickChatBubble", "H", "oofAnimIsRunning", "businessHide", "pushUserMsgFragShowBsChange", "", "K", "Ljava/lang/String;", "stateTimerKey", "Ll/kcg0;", "Ll/kcg0;", "getTimeSubscription", "()Ll/kcg0;", "setTimeSubscription", "(Ll/kcg0;)V", "timeSubscription", "isShowState", "Landroid/animation/ObjectAnimator;", "Landroid/animation/ObjectAnimator;", "getObjectAnimator", "()Landroid/animation/ObjectAnimator;", "setObjectAnimator", "(Landroid/animation/ObjectAnimator;)V", "objectAnimator", "isTouchDown", "setTouchDown", "getLastStartAct", "()J", "setLastStartAct", "lastStartAct", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "scrollAnim", "isShowingTips", "HeaderState", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public afj0 trackForQuickChat5;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public HeaderState scrollState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public C8319b quickChatBubble;

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
    public kcg0 timeSubscription;

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

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$HeaderState;", "", "<init>", "(Ljava/lang/String;I)V", "NormalState", "SearchState", "GetUserState", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8310a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26282a;

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
            f26282a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView$b */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$b", "Lcom/tantan/library/svga/data/request/RequestCallback;", "Lcom/tantan/library/svga/ResourceKey;", Constants.KEY_KEY, "Lcom/tantan/library/svga/exception/SVGAException;", "e", "", "onLoadFailed", "(Lcom/tantan/library/svga/ResourceKey;Lcom/tantan/library/svga/exception/SVGAException;)V", "Lcom/tantan/library/svga/data/cache/Resource;", "resource", "onResourceReady", "(Lcom/tantan/library/svga/ResourceKey;Lcom/tantan/library/svga/data/cache/Resource;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8311b implements RequestCallback {
        public C8311b() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(ResourceKey key, SVGAException e) {
            key.getClass();
            QuickChatAudioHeaderView.this.m43062S();
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(ResourceKey key, Resource<?> resource) {
            key.getClass();
            resource.getClass();
            QuickChatAudioHeaderView.this.m43062S();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioHeaderView$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8312c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f26284a;

        public C8312c(x20 x20Var) {
            this.f26284a = x20Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f26284a.call();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatAudioHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.MAX_PULL_VIEW_HEIGH = txq.m193530c(80);
        this.ALLOW_PULL_START = txq.m193530c(70);
        this.DEFALUE_TIPS_HEIGH = txq.m193530c(24);
        this.DEFALUE_NORMAL_HEIGH = txq.m193530c(0);
        this.LOADING_VIEW_HEIGHT = txq.m193530c(4);
        this.OVER_SCROLL_HEIGHT = txq.m193530c(50);
        this.SHOW_PULL_HEY_SVGA_START = txq.m193530c(24);
        this.SHOW_PULL_TEXT_START = txq.m193530c(60);
        HeaderState headerState = HeaderState.NormalState;
        this.headerState = headerState;
        this.searchHeight = txq.m193530c(217);
        this.suggestConHeight = txq.m193530c(178);
        this.impressConHeight = txq.m193530c(219);
        this.scrollState = headerState;
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m43057J(layoutInflaterM171370a, this);
        this.trackForQuickChat5 = new afj0();
        m43061R();
        this.stateTimerKey = "feed_state_quick_timer_key";
    }

    /* JADX INFO: renamed from: A */
    public static Boolean m43025A(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public static Boolean m43026B(QuickChatAudioHeaderView quickChatAudioHeaderView, pf60 pf60Var) {
        if (!quickChatAudioHeaderView.pushUserMsgFragShowBsChange) {
            return Boolean.TRUE;
        }
        quickChatAudioHeaderView.pushUserMsgFragShowBsChange = false;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: C */
    public static void m43027C(QuickChatAudioHeaderView quickChatAudioHeaderView, List list) {
        if (!jyb.m147479J(list)) {
            quickChatAudioHeaderView.get_scroll_view_state().setBubbleInfoList(list);
            quickChatAudioHeaderView.get_scroll_view_state().m43235s();
        } else {
            BubbleInfo bubbleInfo = new BubbleInfo();
            bubbleInfo.value = "实时状态广场，发现更多有趣的人";
            quickChatAudioHeaderView.get_scroll_view_state().setBubbleInfo(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: D */
    public static Boolean m43028D(pf60 pf60Var) {
        pf60Var.getClass();
        return Boolean.valueOf((pf60Var == C4907v.f20866b0 || TextUtils.isEmpty(CoreModule.m30929H().userId())) ? false : true);
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m43029E(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static void m43030F(QuickChatAudioHeaderView quickChatAudioHeaderView) {
        if (quickChatAudioHeaderView.scrollState != HeaderState.SearchState) {
            return;
        }
        if (!quickChatAudioHeaderView.get_svga_loading().isAnimating()) {
            bnl0.m105524M(quickChatAudioHeaderView.get_svga_loading(), true);
            quickChatAudioHeaderView.get_svga_loading().startAnimation();
            quickChatAudioHeaderView.m43059M();
        }
        bnl0.m105524M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, null);
        quickChatAudioHeaderView.m43063T();
        bnl0.m105524M(quickChatAudioHeaderView.get_hey_pull(), false);
        bnl0.m105524M(quickChatAudioHeaderView.get_bottom_pull_text(), false);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static void m43031G(QuickChatAudioHeaderView quickChatAudioHeaderView, pf60 pf60Var) {
        pf60Var.getClass();
        String str = (String) pf60Var.f152156a;
        S s = pf60Var.f152157b;
        quickChatAudioHeaderView.pushUserMsgFragShowBsChange = true;
        if (Intrinsics.m88377d(str, "notify_search")) {
            quickChatAudioHeaderView.m43066Z();
        } else if (Intrinsics.m88377d("match_success", str)) {
            C8774c.Companion companion = C8774c.INSTANCE;
            if (companion.m51485a().m51480h()) {
                OnlineMatchManager.m51326z().f33442I.onNext(C4907v.f20866b0);
                companion.m51485a().m51481i(0L);
                m43039W(quickChatAudioHeaderView, 0L, 1, null);
                return;
            } else {
                if (quickChatAudioHeaderView.headerState == HeaderState.GetUserState) {
                    OnlineMatchManager.m51326z().f33442I.onNext(C4907v.f20866b0);
                    return;
                }
                m43039W(quickChatAudioHeaderView, 0L, 1, null);
                C8319b c8319bM43208U = quickChatAudioHeaderView.getQuickChatBubble().m43209V(str).m43208U(quickChatAudioHeaderView.headerState);
                s.getClass();
                c8319bM43208U.m43210W((OnlineMatchMatchUser) s);
                quickChatAudioHeaderView.getQuickChatBubble().m126745x(CorePopLevel.QUICK_NOTIFY_MATCH_SUCCESS);
                llb0.m154703c().m154710i(quickChatAudioHeaderView.getQuickChatBubble());
            }
        } else if (Intrinsics.m88377d("match_timeout", str)) {
            gs50.INSTANCE.m132001a().m131993H(quickChatAudioHeaderView.getAct(), "match_timeout");
            m43039W(quickChatAudioHeaderView, 0L, 1, null);
        } else if (Intrinsics.m88377d("tickets_broadcast", str)) {
            if (quickChatAudioHeaderView.headerState == HeaderState.GetUserState) {
                OnlineMatchManager.m51326z().f33442I.onNext(C4907v.f20866b0);
                return;
            }
            C8774c.Companion companion2 = C8774c.INSTANCE;
            if (companion2.m51485a().m51480h()) {
                OnlineMatchManager.m51326z().f33442I.onNext(C4907v.f20866b0);
                companion2.m51485a().m51481i(0L);
                m43039W(quickChatAudioHeaderView, 0L, 1, null);
                CoreModule.f18264c.f20300D0.m35839L4(null);
                return;
            }
            m43039W(quickChatAudioHeaderView, 0L, 1, null);
            if (!(s instanceof OnlineMatchPushUser)) {
                return;
            }
            quickChatAudioHeaderView.getQuickChatBubble().m43209V(str).m43208U(quickChatAudioHeaderView.headerState).m43212Y((OnlineMatchPushUser) s);
            quickChatAudioHeaderView.getQuickChatBubble().m126745x(CorePopLevel.QUICK_NOTIFY_BROADCAST);
            llb0.m154703c().m154710i(quickChatAudioHeaderView.getQuickChatBubble());
        } else if (Intrinsics.m88377d("notify_normal_state", str)) {
            m43039W(quickChatAudioHeaderView, 0L, 1, null);
        }
        OnlineMatchManager.m51326z().f33442I.onNext(C4907v.f20866b0);
    }

    /* JADX INFO: renamed from: H */
    public static void m43032H(QuickChatAudioHeaderView quickChatAudioHeaderView) {
        HeaderState headerState = quickChatAudioHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        bnl0.m105524M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, null);
        quickChatAudioHeaderView.m43063T();
        bnl0.m105524M(quickChatAudioHeaderView.get_svga_loading(), false);
        bnl0.m105524M(quickChatAudioHeaderView.get_hey_pull(), false);
        bnl0.m105524M(quickChatAudioHeaderView.get_bottom_pull_text(), false);
        bnl0.m105524M(quickChatAudioHeaderView.get_background(), true);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_loading(), false, 1, null);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, null);
        quickChatAudioHeaderView.headerState = headerState2;
    }

    /* JADX INFO: renamed from: I */
    public static pf60 m43033I(Triple triple) {
        triple.getClass();
        return (pf60) triple.getFirst();
    }

    /* JADX INFO: renamed from: N */
    private final boolean m43035N() {
        ConvCellList convCellList;
        ConversationsList conversationsList;
        ConversationsListHeadView conversationsListHeadView;
        ConvCellList convCellList2;
        ConversationsList conversationsList2 = this.conversationsList;
        if (conversationsList2 != null && (convCellList2 = conversationsList2.f25847V) != null && convCellList2.getCount() == 0) {
            return true;
        }
        ConversationsList conversationsList3 = this.conversationsList;
        return (conversationsList3 == null || (convCellList = conversationsList3.f25847V) == null || convCellList.getFirstVisiblePosition() != 0 || (conversationsList = this.conversationsList) == null || (conversationsListHeadView = conversationsList.f25827E0) == null || conversationsListHeadView.getTop() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: P */
    private final boolean m43036P() {
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
    private final void m43037Q() {
        Act act = getAct();
        C22507a<pf60<String, Object>> c22507a = OnlineMatchManager.m51326z().f33442I;
        Act act2 = getAct();
        act2.getClass();
        C22421c<TabName> c22421cM40829o7 = ((NewMainAct) act2).m40829o7();
        C22421c<C4470c> c22421cLifecycle = getAct().lifecycle();
        final Function3 function3 = new Function3() { // from class: l.wzb0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return QuickChatAudioHeaderView.m43048r((pf60) obj, (TabName) obj2, (C4470c) obj3);
            }
        };
        C22421c c22421cDuringCreated = act.duringCreated(psd0.m173626s(c22507a, c22421cM40829o7, c22421cLifecycle, new scj() { // from class: l.a0c0
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return QuickChatAudioHeaderView.m43046p(function3, obj, obj2, obj3);
            }
        }));
        final Function1 function1 = new Function1() { // from class: l.b0c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m43054x((Triple) obj);
            }
        };
        C22421c c22421cFilter = c22421cDuringCreated.filter(new qcj() { // from class: l.c0c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m43025A(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.d0c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m43033I((Triple) obj);
            }
        };
        C22421c map = c22421cFilter.map(new qcj() { // from class: l.f0c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m43041k(function2, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.g0c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m43028D((pf60) obj);
            }
        };
        map.filter(new qcj() { // from class: l.h0c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m43029E(function4, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.i0c0
            @Override // p153l.y20
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m43031G(this.f112346a, (pf60) obj);
            }
        }));
        Act act3 = getAct();
        Act act4 = getAct();
        act4.getClass();
        C22421c c22421cDistinctUntilChanged = act3.duringCreated(psd0.m173625r(((NewMainAct) act4).m40829o7(), getAct().lifecycle(), new rcj() { // from class: l.j0c0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return QuickChatAudioHeaderView.m43052v((TabName) obj, (C4470c) obj2);
            }
        }), false).distinctUntilChanged();
        final Function1 function5 = new Function1() { // from class: l.xzb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuickChatAudioHeaderView.m43026B(this.f196845a, (pf60) obj);
            }
        };
        c22421cDistinctUntilChanged.filter(new qcj() { // from class: l.yzb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return QuickChatAudioHeaderView.m43042l(function5, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.zzb0
            @Override // p153l.y20
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m43044n(this.f206691a, (pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public static final void m43038V(QuickChatAudioHeaderView quickChatAudioHeaderView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        quickChatAudioHeaderView.mo42995c(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m43039W(QuickChatAudioHeaderView quickChatAudioHeaderView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        quickChatAudioHeaderView.setNormalState(j);
    }

    /* JADX INFO: renamed from: X */
    public static final void m43040X(QuickChatAudioHeaderView quickChatAudioHeaderView, View view) {
        quickChatAudioHeaderView.m43071e0(true);
    }

    /* JADX INFO: renamed from: k */
    public static pf60 m43041k(Function1 function1, Object obj) {
        return (pf60) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static Boolean m43042l(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m43044n(QuickChatAudioHeaderView quickChatAudioHeaderView, pf60 pf60Var) {
        if ((pf60Var != null ? (C4470c) pf60Var.f152157b : null) == C4470c.f16267i) {
            if ((pf60Var != null ? (TabName) pf60Var.f152156a : null) == TabName.Msg) {
                int i = C8310a.f26282a[quickChatAudioHeaderView.headerState.ordinal()];
                if (i == 1) {
                    quickChatAudioHeaderView.getQuickChatBubble().m43215b0();
                } else if (i == 2) {
                    m43039W(quickChatAudioHeaderView, 0L, 1, null);
                } else {
                    if (i != 3) {
                        nbr.m162172a();
                        return;
                    }
                    quickChatAudioHeaderView.m43066Z();
                }
                if (spl0.m187366R() && quickChatAudioHeaderView.getQuickChatBubble().m43206N() && C8774c.INSTANCE.m51485a().getCurrentTime() != 0) {
                    quickChatAudioHeaderView.getQuickChatBubble().m43215b0();
                    return;
                }
                return;
            }
        }
        quickChatAudioHeaderView.getQuickChatBubble().m43216c0();
        quickChatAudioHeaderView.m43073g0();
    }

    /* JADX INFO: renamed from: o */
    public static void m43045o(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static Triple m43046p(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: q */
    public static void m43047q(long j, QuickChatAudioHeaderView quickChatAudioHeaderView, long j2) {
        if (j2 == j - 1) {
            quickChatAudioHeaderView.isShowState = true;
            bnl0.m105524M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
            SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, null);
            bnl0.m105524M(quickChatAudioHeaderView.get_hey_pull(), false);
            SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, null);
            if (quickChatAudioHeaderView.get_background().m55770p()) {
                quickChatAudioHeaderView.m43069c0();
            } else {
                quickChatAudioHeaderView.m43068b0();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static Triple m43048r(pf60 pf60Var, TabName tabName, C4470c c4470c) {
        return new Triple(pf60Var, tabName, c4470c);
    }

    private final void setNormalState(long speedDuration) {
        getQuickChatBubble().m43211X();
        if (!m43035N()) {
            this.scrollState = HeaderState.NormalState;
            m43064U(getLayoutParams().height, 0, new x20() { // from class: l.q0c0
                @Override // p153l.x20
                public final void call() {
                    QuickChatAudioHeaderView.m43032H(this.f155040a);
                }
            }, speedDuration);
        } else {
            this.scrollState = HeaderState.NormalState;
            boolean zM43058L = m43058L();
            this.isShowingTips = zM43058L;
            m43064U(getLayoutParams().height, zM43058L ? this.DEFALUE_TIPS_HEIGH : getDEFALUE_NORMAL_HEIGH(), new x20() { // from class: l.p0c0
                @Override // p153l.x20
                public final void call() {
                    QuickChatAudioHeaderView.m43050t(this.f150039a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m43050t(final QuickChatAudioHeaderView quickChatAudioHeaderView) {
        HeaderState headerState = quickChatAudioHeaderView.scrollState;
        HeaderState headerState2 = HeaderState.NormalState;
        if (headerState != headerState2) {
            return;
        }
        if (quickChatAudioHeaderView.isShowingTips) {
            quickChatAudioHeaderView.setOnClickListener(new View.OnClickListener() { // from class: l.o0c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickChatAudioHeaderView.m43040X(this.f144513a, view);
                }
            });
            if (!quickChatAudioHeaderView.get_svga_hey_tips().isAnimating()) {
                quickChatAudioHeaderView.m43070d0(quickChatAudioHeaderView.get_svga_hey_tips());
            }
        } else {
            quickChatAudioHeaderView.setOnClickListener(null);
            bnl0.m105524M(quickChatAudioHeaderView.get_svga_hey_tips(), false);
            SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_hey_tips(), false, 1, null);
        }
        quickChatAudioHeaderView.m43063T();
        bnl0.m105524M(quickChatAudioHeaderView.get_svga_loading(), false);
        bnl0.m105524M(quickChatAudioHeaderView.get_hey_pull(), false);
        bnl0.m105524M(quickChatAudioHeaderView.get_bottom_pull_text(), false);
        bnl0.m105524M(quickChatAudioHeaderView.get_background(), true);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_svga_loading(), false, 1, null);
        SVGAnimationView.stopAnimation$default(quickChatAudioHeaderView.get_hey_pull(), false, 1, null);
        quickChatAudioHeaderView.headerState = headerState2;
    }

    /* JADX INFO: renamed from: u */
    public static void m43051u() {
    }

    /* JADX INFO: renamed from: v */
    public static pf60 m43052v(TabName tabName, C4470c c4470c) {
        return jyb.m147494Y(tabName, c4470c);
    }

    /* JADX INFO: renamed from: w */
    public static void m43053w(QuickChatAudioHeaderView quickChatAudioHeaderView, Throwable th) {
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.value = "实时状态广场，发现更多有趣的人";
        quickChatAudioHeaderView.get_scroll_view_state().setBubbleInfo(bubbleInfo);
    }

    /* JADX INFO: renamed from: x */
    public static Boolean m43054x(Triple triple) {
        return Boolean.valueOf(triple.getSecond() == TabName.Msg && Intrinsics.m88377d(triple.getThird(), C4470c.f16267i));
    }

    /* JADX INFO: renamed from: y */
    public static void m43055y(QuickChatAudioHeaderView quickChatAudioHeaderView) {
        quickChatAudioHeaderView.isBottomPlayedVibrateAnim = false;
    }

    /* JADX INFO: renamed from: z */
    public static void m43056z(QuickChatAudioHeaderView quickChatAudioHeaderView, View view) {
        quickChatAudioHeaderView.m43071e0(true);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final View m43057J(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM183917b = s0c0.m183917b(this, inflater, parent);
        viewM183917b.getClass();
        return viewM183917b;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m43058L() {
        boolean z = false;
        if (this.businessHide) {
            return false;
        }
        int iM117723b = dsc0.m117723b(CoreModule.f18264c.m32487o3(), CoreModule.f18264c.f20384f0.m33799Se(), Boolean.valueOf(mge.m158199o().m158201k(BannerLoc.get("conversation"))));
        if (OnlineMatchManager.m51326z().m51340N() || OnlineMatchManager.m51326z().m51339M()) {
            z = true;
        } else if (OnlineMatchManager.m51326z().m51365n0() && iM117723b <= OnlineMatchManager.m51326z().f33446b.get().intValue()) {
            OnlineMatchManager.m51326z().m51362k0();
            OnlineMatchManager.m51326z().m51359h0(true);
            z = true;
        }
        OnlineMatchManager.m51326z().f33446b.put(Integer.valueOf(iM117723b));
        return z;
    }

    /* JADX INFO: renamed from: M */
    public final void m43059M() {
        bnl0.m105524M(get_scroll_view_state(), false);
        if (jyb.m147479J(get_scroll_view_state().getBubbleInfoLists())) {
            return;
        }
        get_scroll_view_state().m43237u();
        get_scroll_view_state().m43227k();
    }

    /* JADX INFO: renamed from: O */
    public final void m43060O() {
        this.isShowingTips = false;
        if (OnlineMatchManager.m51326z().m51340N()) {
            OnlineMatchManager.m51326z().m51360i0();
        } else if (OnlineMatchManager.m51326z().m51339M()) {
            OnlineMatchManager.m51326z().m51359h0(false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m43061R() {
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getLayoutParams().height = 0;
        if (!get_background().m55770p() && !spl0.m187373Y()) {
            ViewGroup.LayoutParams layoutParams = get_background().getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = bnl0.m105592y0();
            layoutParams2.height = bnl0.m105588w0();
            layoutParams2.topMargin = -qa00.f156305R;
            get_background().setLayoutParams(layoutParams2);
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/d436ea17-bcbc-46b3-81bd-8d6d94a8537510.so").autoPlay(false).frameMode(SVGAnimationView.FrameMode.AFTER).loadCallback(new C8311b()).into(get_svga_hey_tips());
    }

    /* JADX INFO: renamed from: S */
    public final void m43062S() {
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/d436ea17-bcbc-46b3-81bd-8d6d94a8537510.so").autoPlay(false).into(get_hey_pull());
        Context context2 = getContext();
        context2.getClass();
        SVGALoader.with(context2).from("https://auto.tancdn.com/v1/raw/402a91d3-0864-48c6-a72d-133b03a6d8e610.so").autoPlay(false).into(get_svga_loading());
    }

    /* JADX INFO: renamed from: T */
    public final void m43063T() {
        if (get_scroll_view_state() != null && get_scroll_view_state().getVisibility() == 4) {
            bnl0.m105524M(get_scroll_view_state(), true);
            get_scroll_view_state().m43235s();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m43064U(int startValue, int endValue, x20 endAction, long setDuration) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.scrollAnim;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.scrollAnim) != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(startValue, endValue);
        this.scrollAnim = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(setDuration);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vzb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    QuickChatAudioHeaderView.m43038V(this.f186470a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new C8312c(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m43065Y() {
        String str;
        if (get_background().m55770p()) {
            get_bottom_pull_text().setTextColor(Color.parseColor("#99FFFFFF"));
            str = "选择与描述特质最相符的他";
        } else {
            str = "下拉找到正在等你的人";
        }
        get_bottom_pull_text().setText(str);
    }

    /* JADX INFO: renamed from: Z */
    public final void m43066Z() {
        HeaderState headerState = HeaderState.SearchState;
        this.headerState = headerState;
        setOnClickListener(new View.OnClickListener() { // from class: l.r0c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatAudioHeaderView.m43056z(this.f160607a, view);
            }
        });
        getQuickChatBubble().m43211X();
        if (m43035N()) {
            this.scrollState = headerState;
            m43064U(getLayoutParams().height, getLOADING_VIEW_HEIGHT(), new x20() { // from class: l.uzb0
                @Override // p153l.x20
                public final void call() {
                    QuickChatAudioHeaderView.m43030F(this.f181740a);
                }
            }, 500L);
            return;
        }
        this.headerState = headerState;
        bnl0.m105524M(get_svga_hey_tips(), false);
        SVGAnimationView.stopAnimation$default(get_svga_hey_tips(), false, 1, null);
        m43063T();
        bnl0.m105524M(get_svga_loading(), false);
        bnl0.m105524M(get_hey_pull(), false);
        bnl0.m105524M(get_bottom_pull_text(), false);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
        SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo42993a() {
        HeaderState headerState = this.headerState;
        return headerState == HeaderState.NormalState || headerState == HeaderState.SearchState;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m43067a0() {
        float height = (((getHeight() - this.SHOW_PULL_HEY_SVGA_START) * 0.16f) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START)) + 1.0f;
        float height2 = 1.0f + (((getHeight() - this.SHOW_PULL_HEY_SVGA_START) * 0.16f) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START));
        if (get_background().m55770p()) {
            int iM175859d = (qa00.m175859d(20.0f) * (getHeight() - this.SHOW_PULL_HEY_SVGA_START)) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START);
            get_oof_layout().setScaleX(height);
            get_oof_layout().setScaleY(height2);
            bnl0.m105540X(get_oof_layout(), iM175859d);
            return;
        }
        int iM175859d2 = qa00.m175859d(4.0f) + ((qa00.m175859d(16.0f) * (getHeight() - this.SHOW_PULL_HEY_SVGA_START)) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_HEY_SVGA_START));
        get_scroll_view_state().setScaleX(height);
        get_scroll_view_state().setScaleY(height2);
        bnl0.m105540X(get_scroll_view_state(), iM175859d2);
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: b */
    public boolean mo42994b(float headViewHeight) {
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m43068b0() {
        bnl0.m105524M(get_scroll_view_state(), true);
        bnl0.m105524M(get_oof_layout(), false);
        List<BubbleInfo> bubbleInfoLists = get_scroll_view_state().getBubbleInfoLists();
        bubbleInfoLists.getClass();
        if (jyb.m147479J(bubbleInfoLists)) {
            getAct().duringCreated(CoreModule.m30932N().mo61519Yr()).subscribe(psd0.m173597H(new y20() { // from class: l.tzb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    QuickChatAudioHeaderView.m43027C(this.f176751a, (List) obj);
                }
            }, new y20() { // from class: l.e0c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    QuickChatAudioHeaderView.m43053w(this.f91430a, (Throwable) obj);
                }
            }));
        } else if (get_scroll_view_state().m43230n()) {
            get_scroll_view_state().m43235s();
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: c */
    public void mo42995c(int height) {
        int i = C8310a.f26282a[this.headerState.ordinal()];
        if (i == 1) {
            SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
            bnl0.m105524M(get_hey_pull(), false);
            bnl0.m105524M(get_bottom_pull_text(), false);
        } else if (i == 2) {
            if (height != this.DEFALUE_TIPS_HEIGH) {
                SVGAnimationView.stopAnimation$default(get_svga_hey_tips(), false, 1, null);
                bnl0.m105524M(get_svga_hey_tips(), false);
            }
            if (height > this.SHOW_PULL_HEY_SVGA_START) {
                if (!get_hey_pull().isAnimating()) {
                    m43070d0(get_hey_pull());
                }
                m43067a0();
            } else {
                SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
                bnl0.m105524M(get_hey_pull(), false);
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
                bnl0.m105524M(get_bottom_pull_text(), true);
                if (height >= getMAX_PULL_VIEW_HEIGH()) {
                    get_bottom_pull_text().setAlpha(1.0f);
                } else {
                    get_bottom_pull_text().setAlpha(m43074h0(height));
                }
                m43065Y();
            } else {
                bnl0.m105524M(get_bottom_pull_text(), false);
            }
        } else {
            if (i != 3) {
                nbr.m162172a();
                return;
            }
            if (height <= getLOADING_VIEW_HEIGHT()) {
                if (!get_svga_loading().isAnimating()) {
                    bnl0.m105524M(get_svga_loading(), true);
                    get_svga_loading().startAnimation();
                    m43059M();
                }
                SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
                bnl0.m105524M(get_hey_pull(), false);
                bnl0.m105524M(get_bottom_pull_text(), false);
            } else {
                SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
                bnl0.m105524M(get_svga_loading(), false);
                SVGAnimationView.stopAnimation$default(get_svga_hey_tips(), false, 1, null);
                bnl0.m105524M(get_svga_hey_tips(), false);
                if (height > this.SHOW_PULL_HEY_SVGA_START) {
                    if (!get_hey_pull().isAnimating()) {
                        m43070d0(get_hey_pull());
                    }
                    m43067a0();
                } else {
                    SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
                    bnl0.m105524M(get_hey_pull(), false);
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
                    bnl0.m105524M(get_bottom_pull_text(), true);
                    if (height >= getMAX_PULL_VIEW_HEIGH()) {
                        get_bottom_pull_text().setAlpha(1.0f);
                    } else {
                        get_bottom_pull_text().setAlpha(m43074h0(height));
                    }
                    m43065Y();
                } else {
                    bnl0.m105524M(get_bottom_pull_text(), false);
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = height;
        setLayoutParams(layoutParams);
        y20<Integer> changeHeightListrener = getChangeHeightListrener();
        if (changeHeightListrener != null) {
            changeHeightListrener.call(Integer.valueOf(height));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m43069c0() {
        bnl0.m105524M(get_scroll_view_state(), false);
        bnl0.m105524M(get_oof_layout(), true);
        get_oof_layout_txt().setText("极限四选一");
        if (!this.oofAnimIsRunning) {
            this.oofAnimIsRunning = true;
            Context context = getContext();
            context.getClass();
            SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/44491780-6504-4c7f-a828-576c7adcd7f612.svga").autoPlay(true).into(get_oof_layout_icon());
        }
        i4g0.m138526x("e_choose_entrance", OMSDialogPositon.p_messages_view);
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: d */
    public void mo42996d(@NotNull ConversationsList conversationsList) {
        conversationsList.getClass();
        this.conversationsList = conversationsList;
        setQuickChatBubble(new C8319b(getAct()));
        getQuickChatBubble().m43205M(getAct());
        m43037Q();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m43070d0(SVGAnimationView view) {
        boolean zM55770p = get_background().m55770p();
        boolean zM187373Y = spl0.m187373Y();
        if (!zM55770p && !zM187373Y) {
            bnl0.m105524M(view, true);
            view.startAnimation();
            return;
        }
        bnl0.m105524M(get_scroll_view_state(), false);
        if (this.isShowState) {
            if (zM55770p) {
                m43069c0();
                return;
            } else {
                m43068b0();
                return;
            }
        }
        bnl0.m105524M(view, true);
        view.startAnimation();
        if (l51.m152882B(this.stateTimerKey)) {
            return;
        }
        m43072f0();
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: e */
    public boolean mo42997e() {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m43071e0(boolean isClick) {
        m43060O();
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList != null && SystemClock.uptimeMillis() - this.lastStartAct > 500) {
            this.lastStartAct = SystemClock.uptimeMillis();
            szb0 szb0Var = new szb0(conversationsList, this);
            if (get_background().m55770p()) {
                if (isClick) {
                    i4g0.m138520r("e_choose_entrance", OMSDialogPositon.p_messages_view);
                } else {
                    i4g0.m138495D("e_choose_entrance_drop", OMSDialogPositon.p_messages_view, new pf60[0]);
                }
                getAct().startActivityWithCustomTransition(OOFMkWebViewAct.m42793n2(getAct()), szb0Var);
                return;
            }
            if (!spl0.m187373Y()) {
                getAct().startActivityForResultWithCustomTransition(DropDownAct.INSTANCE.m55643a(getAct()), 18, szb0Var);
                return;
            }
            List<BubbleInfo> bubbleInfoLists = get_scroll_view_state().getBubbleInfoLists();
            bubbleInfoLists.getClass();
            BubbleInfo bubbleInfo = null;
            BubbleInfo bubbleInfo2 = jyb.m147479J(bubbleInfoLists) ? null : bubbleInfoLists.get(get_scroll_view_state().getCurrentIndex() % bubbleInfoLists.size());
            if (bubbleInfo2 != null && !TextUtils.equals(bubbleInfo2.value, "实时状态广场，发现更多有趣的人")) {
                bubbleInfo = bubbleInfo2;
            }
            getAct().startActivityWithCustomTransition(CoreModule.m30932N().mo61487P6(getAct(), true, bubbleInfo, OMSDialogPositon.p_messages_view), szb0Var);
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: f */
    public void mo42998f() {
        if (m43036P()) {
            int i = C8310a.f26282a[this.headerState.ordinal()];
            if (i == 2) {
                m43039W(this, 0L, 1, null);
            } else {
                if (i != 3) {
                    return;
                }
                m43066Z();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m43072f0() {
        final long jM80482A = RemoteConfig.m80481x().m80482A("second_floor_refresh_state_time");
        this.timeSubscription = getAct().duringCreated(l51.m152894N(this.stateTimerKey, (int) jM80482A)).subscribe(psd0.m173598I(new y20() { // from class: l.k0c0
            @Override // p153l.y20
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m43047q(jM80482A, this, ((Long) obj).longValue());
            }
        }, new y20() { // from class: l.l0c0
            @Override // p153l.y20
            public final void call(Object obj) {
                QuickChatAudioHeaderView.m43045o((Throwable) obj);
            }
        }, new x20() { // from class: l.m0c0
            @Override // p153l.x20
            public final void call() {
                QuickChatAudioHeaderView.m43051u();
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: g */
    public void mo42999g(int height, boolean isAutoTopShow) {
        int defalue_normal_heigh;
        if (this.headerState == HeaderState.GetUserState) {
            return;
        }
        if (isAutoTopShow || m43036P()) {
            if (this.headerState != HeaderState.NormalState) {
                int iAbs = getLayoutParams().height + Math.abs(height);
                if (iAbs >= getLOADING_VIEW_HEIGHT()) {
                    iAbs = getLOADING_VIEW_HEIGHT();
                }
                if (isAutoTopShow) {
                    iAbs = getLOADING_VIEW_HEIGHT();
                }
                mo42995c(iAbs);
                bnl0.m105524M(get_svga_loading(), true);
                if (!get_svga_loading().isAnimating()) {
                    get_svga_loading().startAnimation();
                }
                m43059M();
                return;
            }
            int iAbs2 = getLayoutParams().height + Math.abs(height);
            boolean z = this.isShowingTips;
            if (!isAutoTopShow) {
                defalue_normal_heigh = z ? this.DEFALUE_TIPS_HEIGH : this.OVER_SCROLL_HEIGHT;
                if (iAbs2 >= defalue_normal_heigh) {
                }
                mo42995c(iAbs2);
                if (this.isShowingTips || get_svga_hey_tips().isAnimating()) {
                }
                m43070d0(get_svga_hey_tips());
                return;
            }
            defalue_normal_heigh = z ? this.DEFALUE_TIPS_HEIGH : getDEFALUE_NORMAL_HEIGH();
            iAbs2 = defalue_normal_heigh;
            mo42995c(iAbs2);
            if (this.isShowingTips) {
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m43073g0() {
        kcg0 kcg0Var = this.timeSubscription;
        if (kcg0Var != null) {
            kcg0Var.getClass();
            if (!kcg0Var.isUnsubscribed()) {
                kcg0 kcg0Var2 = this.timeSubscription;
                kcg0Var2.getClass();
                kcg0Var2.unsubscribe();
            }
        }
        if (l51.m152882B(this.stateTimerKey)) {
            l51.m152891K(this.stateTimerKey);
        }
        get_scroll_view_state().m43237u();
        SVGAnimationView.stopAnimation$default(get_hey_pull(), false, 1, null);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
        SVGAnimationView.stopAnimation$default(get_svga_loading(), false, 1, null);
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
        int i = qa00.f156322i;
        if (gra.m131563F0() || gra.m131672d3() || gra.m131683g()) {
            i = 0;
        }
        HeaderState headerState = this.headerState;
        if (headerState == HeaderState.NormalState || headerState == HeaderState.SearchState || headerState == HeaderState.GetUserState) {
            return i + getLayoutParams().height;
        }
        return 0;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getLOADING_VIEW_HEIGHT() {
        return this.LOADING_VIEW_HEIGHT;
    }

    public final long getLastStartAct() {
        return this.lastStartAct;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
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
    public final C8319b getQuickChatBubble() {
        C8319b c8319b = this.quickChatBubble;
        if (c8319b != null) {
            return c8319b;
        }
        Intrinsics.m88391r("quickChatBubble");
        return null;
    }

    @Nullable
    public final kcg0 getTimeSubscription() {
        return this.timeSubscription;
    }

    @NotNull
    public final DropDownBgView get_background() {
        DropDownBgView dropDownBgView = this._background;
        if (dropDownBgView != null) {
            return dropDownBgView;
        }
        Intrinsics.m88391r("_background");
        return null;
    }

    @NotNull
    public final VText get_bottom_pull_text() {
        VText vText = this._bottom_pull_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_bottom_pull_text");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_hey_pull() {
        SVGAnimationView sVGAnimationView = this._hey_pull;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_hey_pull");
        return null;
    }

    @NotNull
    public final FrameLayout get_oof_layout() {
        FrameLayout frameLayout = this._oof_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_oof_layout");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_oof_layout_icon() {
        SVGAnimationView sVGAnimationView = this._oof_layout_icon;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_oof_layout_icon");
        return null;
    }

    @NotNull
    public final VText get_oof_layout_txt() {
        VText vText = this._oof_layout_txt;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_oof_layout_txt");
        return null;
    }

    @NotNull
    public final CoreAutoScrollView get_scroll_view_state() {
        CoreAutoScrollView coreAutoScrollView = this._scroll_view_state;
        if (coreAutoScrollView != null) {
            return coreAutoScrollView;
        }
        Intrinsics.m88391r("_scroll_view_state");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svga_hey_tips() {
        SVGAnimationView sVGAnimationView = this._svga_hey_tips;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga_hey_tips");
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

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: h */
    public void mo43000h() {
        int i = C8310a.f26282a[this.headerState.ordinal()];
        if (i == 2) {
            setNormalState(0L);
            m43073g0();
        } else {
            if (i != 3) {
                return;
            }
            m43066Z();
            m43073g0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final float m43074h0(int height) {
        return ((height - this.SHOW_PULL_TEXT_START) * 1.0f) / (getMAX_PULL_VIEW_HEIGH() - this.SHOW_PULL_TEXT_START);
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: i */
    public void mo43001i() {
        this.isTouchDown = true;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: j */
    public int mo43002j() {
        this.isTouchDown = false;
        postDelayed(new Runnable() { // from class: l.n0c0
            @Override // java.lang.Runnable
            public final void run() {
                QuickChatAudioHeaderView.m43055y(this.f139605a);
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
            m43071e0(false);
            return getDEFALUE_NORMAL_HEIGH();
        }
        if (this.headerState == headerState2) {
            m43066Z();
            return getLOADING_VIEW_HEIGHT();
        }
        m43039W(this, 0L, 1, null);
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

    public final void setQuickChatBubble(@NotNull C8319b c8319b) {
        c8319b.getClass();
        this.quickChatBubble = c8319b;
    }

    public final void setTimeSubscription(@Nullable kcg0 kcg0Var) {
        this.timeSubscription = kcg0Var;
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
