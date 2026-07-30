package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import com.p051p1.mobile.putong.live.external.view.widgets.VoiceSquareRightOperateView;
import com.p051p1.mobile.putong.live.external.voice.home.LiveSquareVoiceFragment;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.VoiceTabView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u001d\u0010\u0013\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\tJ\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010'J\u001f\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b3\u0010\tJ\u0011\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106J!\u00107\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b7\u0010/J\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0007¢\u0006\u0004\bB\u0010\tJ/\u0010D\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0010¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\u0007¢\u0006\u0004\bF\u0010\tJ\r\u0010G\u001a\u00020\u0007¢\u0006\u0004\bG\u0010\tJ\r\u0010H\u001a\u00020\u0007¢\u0006\u0004\bH\u0010\tJ\r\u0010I\u001a\u00020\u0007¢\u0006\u0004\bI\u0010\tJ\r\u0010J\u001a\u000208¢\u0006\u0004\bJ\u0010:J\u001d\u0010L\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010K\u001a\u000208¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u0007¢\u0006\u0004\bN\u0010\tJ\u0015\u0010P\u001a\u00020\u00072\u0006\u0010O\u001a\u000208¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\bR\u0010\u001eJ\u001d\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00152\u0006\u0010S\u001a\u00020;¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010j\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010Z\u001a\u0004\bh\u0010\\\"\u0004\bi\u0010^R\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010Z\u001a\u0005\b\u0084\u0001\u0010\\\"\u0005\b\u0085\u0001\u0010^R)\u0010\u008d\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b1\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R)\u0010\u0094\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b \u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R)\u0010\u009b\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bR\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010¢\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0019\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010ª\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R)\u0010\u00ad\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bT\u0010\u0096\u0001\u001a\u0006\b«\u0001\u0010\u0098\u0001\"\u0006\b¬\u0001\u0010\u009a\u0001R*\u0010±\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b®\u0001\u0010\u009d\u0001\u001a\u0006\b¯\u0001\u0010\u009f\u0001\"\u0006\b°\u0001\u0010¡\u0001R*\u0010µ\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b²\u0001\u0010¥\u0001\u001a\u0006\b³\u0001\u0010§\u0001\"\u0006\b´\u0001\u0010©\u0001R*\u0010½\u0001\u001a\u00030¶\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R)\u0010Ä\u0001\u001a\u00030¾\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\b\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R&\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b>\u0010Å\u0001\u001a\u0006\b·\u0001\u0010Æ\u0001\"\u0005\bÇ\u0001\u00102R9\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150È\u0001j\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0015`É\u00018\u0006¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\b²\u0001\u0010Ì\u0001R-\u0010Î\u0001\u001a\u0014\u0012\u0004\u0012\u00020-0È\u0001j\t\u0012\u0004\u0012\u00020-`É\u00018\u0006¢\u0006\u000f\n\u0005\b<\u0010Ë\u0001\u001a\u0006\bÍ\u0001\u0010Ì\u0001R-\u0010Ð\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00110È\u0001j\t\u0012\u0004\u0012\u00020\u0011`É\u00018\u0006¢\u0006\u000f\n\u0005\b@\u0010Ë\u0001\u001a\u0006\bÏ\u0001\u0010Ì\u0001R+\u0010×\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bh\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R*\u0010Ý\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010Ù\u0001\u001a\u0006\b¤\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001¨\u0006Þ\u0001"}, m88121d2 = {"Ll/zpn0;", "Ll/iam;", "Ll/tpn0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "r", "()V", "R", p7f.LATITUDE_SOUTH, p7f.GPS_DIRECTION_TRUE, "e0", "h0", "X", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "topics", "c0", "(Ljava/util/List;)V", "Ll/c8o;", "pagerList", "W", "voiceTab", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;)V", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", BloodType.f39576O, "(Lcom/google/android/material/tabs/TabLayout$Tab;Ljava/util/List;)V", "P", "j", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Z", "i0", "", "tabId", "j0", "(Ljava/lang/String;)V", "Q", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", RXScreenCaptureService.KEY_INDEX, "(Ll/tpn0;)V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "inflateView", "", "U", "()Z", "", "u", "()I", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/c8o;", ResourceDirection.f39656v, "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "n0", "pager", "b0", "(Ljava/util/List;Ljava/util/List;)V", "a0", "Y", "k0", "m0", p7f.GPS_MEASUREMENT_INTERRUPTED, "show", "g0", "(Ljava/lang/String;Z)V", "l0", "enable", "d0", "(Z)V", "k", "position", "n", "(I)Ll/c8o;", "a", "Lcom/p1/mobile/android/app/Act;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", "E", "()Landroid/widget/FrameLayout;", "set_root", "(Landroid/widget/FrameLayout;)V", "_root", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "c", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "F", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga_view", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga_view", "w", "set_container", "_container", "Lv/navigationbar/VNavigationBar;", "e", "Lv/navigationbar/VNavigationBar;", "B", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "H", "()Landroid/widget/LinearLayout;", "set_tabLayout_container", "(Landroid/widget/LinearLayout;)V", "_tabLayout_container", "Lcom/google/android/material/tabs/TabLayout;", "g", "Lcom/google/android/material/tabs/TabLayout;", "I", "()Lcom/google/android/material/tabs/TabLayout;", "set_topic_tab_layout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_topic_tab_layout", "h", c4s.C_ZONE, "set_red_dot_layout", "_red_dot_layout", "Lv/VPullDownRefreshLayout;", "Lv/VPullDownRefreshLayout;", "G", "()Lv/VPullDownRefreshLayout;", "set_swipe_refresh", "(Lv/VPullDownRefreshLayout;)V", "_swipe_refresh", "Lcom/p1/mobile/putong/live/external/view/widgets/NoSaveStateViewPager;", "Lcom/p1/mobile/putong/live/external/view/widgets/NoSaveStateViewPager;", "N", "()Lcom/p1/mobile/putong/live/external/view/widgets/NoSaveStateViewPager;", "set_view_pager", "(Lcom/p1/mobile/putong/live/external/view/widgets/NoSaveStateViewPager;)V", "_view_pager", "Lv/VLinear;", "Lv/VLinear;", "M", "()Lv/VLinear;", "set_view_group_network_error", "(Lv/VLinear;)V", "_view_group_network_error", "Lv/VImage;", "Lv/VImage;", "A", "()Lv/VImage;", "set_img_network_error", "(Lv/VImage;)V", "_img_network_error", "Lv/VText;", "m", "Lv/VText;", "K", "()Lv/VText;", "set_tv_network_error", "(Lv/VText;)V", "_tv_network_error", "L", "set_view_group_empty", "_view_group_empty", "o", BaseSei.f14626Z, "set_img_empty", "_img_empty", "p", "J", "set_tv_empty", "_tv_empty", "Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;", "q", "Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;", BaseSei.f14624X, "()Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;", "set_entry_view", "(Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;)V", "_entry_view", "Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;", "Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;", BaseSei.f14625Y, "()Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;", "set_game_entry_view", "(Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;)V", "_game_entry_view", "Ll/tpn0;", "()Ll/tpn0;", "f0", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.KEY_T, "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "getTabViewList", "tabViewList", "getTopicList", "topicList", "Ll/x20;", "Ll/x20;", "getMRedDotAction", "()Ll/x20;", "setMRedDotAction", "(Ll/x20;)V", "mRedDotAction", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView$t;", "()Landroidx/recyclerview/widget/RecyclerView$t;", "setOnScrollListener", "(Landroidx/recyclerview/widget/RecyclerView$t;)V", "onScrollListener", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class zpn0 implements iam<tpn0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public AnimEffectPlayer _svga_view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public FrameLayout _container;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LinearLayout _tabLayout_container;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TabLayout _topic_tab_layout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public FrameLayout _red_dot_layout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VPullDownRefreshLayout _swipe_refresh;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public NoSaveStateViewPager _view_pager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VLinear _view_group_network_error;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VImage _img_network_error;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _tv_network_error;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VLinear _view_group_empty;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VImage _img_empty;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VText _tv_empty;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public LiveVoiceEntryView _entry_view;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public IntlGameOperationView _game_entry_view;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public tpn0 presenter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<c8o<BLiveVoiceTab>> pagerList;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<View> tabViewList;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<BLiveVoiceTab> topicList;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public x20 mRedDotAction;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public RecyclerView.AbstractC0584t onScrollListener;

    /* JADX INFO: renamed from: l.zpn0$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"l/zpn0$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21859a extends RecyclerView.AbstractC0584t {
        public C21859a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            if (dy != 0) {
                zpn0.this.m220908q().m192175H3();
            }
        }
    }

    /* JADX INFO: renamed from: l.zpn0$c */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/zpn0$c", "Ll/wo0;", "", "g", "()V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21861c extends wo0 {
        public C21861c() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            bnl0.m105524M(zpn0.this.m220868F(), true);
        }
    }

    public zpn0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pagerList = new ArrayList<>();
        this.tabViewList = new ArrayList<>();
        this.topicList = new ArrayList<>();
        this.onScrollListener = new C21859a();
    }

    /* JADX INFO: renamed from: T */
    private final void m220855T() {
        VText vText = new VText(this.act);
        vText.setText(R$string.f45784x0);
        vText.setTextSize(jyn0.m147609f().mo108076j());
        vText.setTextColor(jyn0.m147609f().getTitleColor());
        vText.setTypeface(null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, qa00.f156316c, 0, 0);
        m220865B().setTitleView(vText);
        m220865B().setLeftIconAsBack(this.act);
        m220865B().setBackgroundResource(m9c0.f135374H);
        VImage vImage = new VImage(this.act);
        vImage.setImageResource(jyn0.m147609f().mo108073g());
        m220865B().setLeftIconView(vImage);
        m220865B().setLeftIconOnClick(new View.OnClickListener() { // from class: l.xpn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zpn0.m220858c(this.f195722a, view);
            }
        });
        m220893e0();
        Act act = this.act;
        act.setStatusBarColor(act.color(m9c0.f135378c));
        this.act.getWindow().setNavigationBarColor(this.act.color(m9c0.f135378c));
        m220861h0(this.act);
        m220900k0();
    }

    /* JADX INFO: renamed from: a */
    public static void m220856a(zpn0 zpn0Var, mvc0 mvc0Var) {
        mvc0Var.getClass();
        if (zpn0Var.m220882U()) {
            zpn0Var.m220908q().m192180M3();
            return;
        }
        c8o<BLiveVoiceTab> c8oVarM220909s = zpn0Var.m220909s();
        tpn0 tpn0VarM220908q = zpn0Var.m220908q();
        BLiveVoiceTab bLiveVoiceTabMo108374H = c8oVarM220909s.mo108374H();
        bLiveVoiceTabMo108374H.getClass();
        tpn0VarM220908q.m192177J3(bLiveVoiceTabMo108374H, zpn0Var.m220876N().getCurrentItem(), true);
    }

    /* JADX INFO: renamed from: b */
    public static void m220857b(zpn0 zpn0Var, String str, boolean z) {
        zpn0Var.m220895g0(str, z);
    }

    /* JADX INFO: renamed from: c */
    public static void m220858c(zpn0 zpn0Var, View view) {
        zpn0Var.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m220861h0(Act act) {
        if (act instanceof PutongAct) {
            ((PutongAct) act).setTransparentStatusBar();
            int i = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = bnl0.m105511F0();
            m220912w().setLayoutParams(layoutParams);
            m220868F().setLayoutParams(new FrameLayout.LayoutParams(bnl0.f77544e, qa00.m175859d(92.0f) + bnl0.m105511F0()));
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m220862j(TabLayout.Tab tab) {
        if (NullChecker.m82486a(tab.getCustomView())) {
            View customView = tab.getCustomView();
            customView.getClass();
            ((VoiceTabView) customView).m72322c(tab.isSelected(), null);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m220863r() {
        m220867E().setBackgroundColor(jyn0.m147610g(m220883V()).mo108071e());
        m220915z().setImageResource(jyn0.m147610g(m220883V()).mo108075i());
        m220872J().setTextColor(jyn0.m147610g(m220883V()).mo108072f());
        m220864A().setImageResource(jyn0.m147605b(m220883V()).mo187673c());
        m220873K().setTextColor(jyn0.m147605b(m220883V()).mo187676f());
        m220914y().f46401b.setImageResource(m220883V() ? nbc0.f141191q0 : nbc0.f141194r0);
        m220897i0();
        m220869G().m225003I(true);
        m220869G().m225001G(false);
        m220869G().mo224405O(new jn50() { // from class: l.wpn0
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                zpn0.m220856a(this.f190325a, mvc0Var);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VImage m220864A() {
        VImage vImage = this._img_network_error;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_img_network_error");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VNavigationBar m220865B() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final FrameLayout m220866C() {
        FrameLayout frameLayout = this._red_dot_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_red_dot_layout");
        return null;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m220908q().getAct();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final FrameLayout m220867E() {
        FrameLayout frameLayout = this._root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final AnimEffectPlayer m220868F() {
        AnimEffectPlayer animEffectPlayer = this._svga_view;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m88391r("_svga_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VPullDownRefreshLayout m220869G() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._swipe_refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.m88391r("_swipe_refresh");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LinearLayout m220870H() {
        LinearLayout linearLayout = this._tabLayout_container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_tabLayout_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final TabLayout m220871I() {
        TabLayout tabLayout = this._topic_tab_layout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_topic_tab_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m220872J() {
        VText vText = this._tv_empty;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VText m220873K() {
        VText vText = this._tv_network_error;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_network_error");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VLinear m220874L() {
        VLinear vLinear = this._view_group_empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_view_group_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VLinear m220875M() {
        VLinear vLinear = this._view_group_network_error;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_view_group_network_error");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final NoSaveStateViewPager m220876N() {
        NoSaveStateViewPager noSaveStateViewPager = this._view_pager;
        if (noSaveStateViewPager != null) {
            return noSaveStateViewPager;
        }
        Intrinsics.m88391r("_view_pager");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final void m220877O(TabLayout.Tab tab, List<? extends BLiveVoiceTab> topics) {
        m220902l0();
        if (tab.getPosition() < 0 || tab.getPosition() >= this.pagerList.size()) {
            return;
        }
        BLiveVoiceTab bLiveVoiceTab = topics.get(tab.getPosition());
        m220862j(tab);
        c8o<BLiveVoiceTab> c8oVar = this.pagerList.get(tab.getPosition());
        c8oVar.getClass();
        c8o<BLiveVoiceTab> c8oVar2 = c8oVar;
        if (c8oVar2.mo108375I().booleanValue()) {
            m220908q().m192170C3(bLiveVoiceTab, tab.getPosition());
        } else {
            m220908q().m192176I3(bLiveVoiceTab, tab.getPosition());
        }
        if (!tbs.f172989b.m203755v7() && TextUtils.equals(b5p0.f75080a, c8oVar2.mo108374H().f45361id)) {
            LiveVoiceApi.postVoiceActivitiesToZero();
        }
        if (TextUtils.equals(b5p0.f75082c, c8oVar2.mo108374H().f45361id)) {
            LiveVoiceApi.postVoiceActivitiesToZero();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m220878P(TabLayout.Tab tab, List<? extends BLiveVoiceTab> topics) {
        if (tab.getPosition() < 0 || tab.getPosition() >= topics.size()) {
            return;
        }
        BLiveVoiceTab bLiveVoiceTab = topics.get(tab.getPosition());
        m220862j(tab);
        tpn0 tpn0VarM220908q = m220908q();
        String str = bLiveVoiceTab.f45361id;
        str.getClass();
        tpn0VarM220908q.m192171D3(str);
    }

    /* JADX INFO: renamed from: Q */
    public final void m220879Q(String tabId) {
        int childCount = m220866C().getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            }
            if (m220866C().getChildAt(childCount) != null && m220866C().getChildAt(childCount).getTag() != null && (m220866C().getChildAt(childCount).getTag() instanceof String)) {
                Object tag = m220866C().getChildAt(childCount).getTag();
                tag.getClass();
                if (TextUtils.equals(tabId, (String) tag)) {
                    m220866C().removeView(m220866C().getChildAt(childCount));
                }
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m220880R() {
        m220913x().m72313s(m220883V());
        m220908q().m192183m3(m220913x());
    }

    /* JADX INFO: renamed from: S */
    public final void m220881S() {
        m220908q().m192184n3(m220914y());
    }

    /* JADX INFO: renamed from: U */
    public final boolean m220882U() {
        return m220871I().getTabCount() <= 0;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m220883V() {
        return m220908q().m160239H2().f143738b instanceof LiveSquareVoiceFragment;
    }

    /* JADX INFO: renamed from: W */
    public final void m220884W(List<? extends c8o<BLiveVoiceTab>> pagerList) {
        this.pagerList.clear();
        this.tabViewList.clear();
        m220871I().removeAllTabs();
        this.pagerList.addAll(pagerList);
    }

    /* JADX INFO: renamed from: X */
    public final void m220885X() {
        int tabCount = m220871I().getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = m220871I().getTabAt(i);
            if (tabAt != null) {
                View view = this.tabViewList.get(i);
                view.getClass();
                View view2 = view;
                tabAt.setCustomView(view2);
                if (view2.getParent() != null) {
                    Object parent = view2.getParent();
                    parent.getClass();
                    ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
                    view2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    layoutParams.width = view2.getMeasuredWidth();
                    Object parent2 = view2.getParent();
                    parent2.getClass();
                    ((View) parent2).setLayoutParams(layoutParams);
                }
                m220862j(tabAt);
                if (i == 0) {
                    bnl0.m105538V(tabAt.view, txq.m193530c(12));
                } else if (i == m220871I().getTabCount() - 1) {
                    bnl0.m105539W(tabAt.view, txq.m193530c(12));
                }
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m220886Y() {
        m220902l0();
        m220870H().setVisibility(8);
        m220875M().setVisibility(0);
        m220874L().setVisibility(8);
    }

    /* JADX INFO: renamed from: Z */
    public final void m220887Z() {
        m220902l0();
        m220870H().setVisibility(8);
        m220875M().setVisibility(8);
        m220874L().setVisibility(0);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m220888a0() {
        m220902l0();
        m220870H().setVisibility(0);
        m220875M().setVisibility(8);
        m220874L().setVisibility(8);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m220889b0(@NotNull List<? extends BLiveVoiceTab> topics, @NotNull List<? extends c8o<BLiveVoiceTab>> pager) {
        topics.getClass();
        pager.getClass();
        this.topicList.clear();
        this.topicList.addAll(topics);
        m220902l0();
        if (topics.isEmpty()) {
            m220887Z();
            return;
        }
        m220870H().setVisibility(0);
        m220884W(pager);
        Iterator<T> it = topics.iterator();
        while (it.hasNext()) {
            m220901l((BLiveVoiceTab) it.next());
        }
        if (topics.size() != this.pagerList.size()) {
            return;
        }
        m220876N().setAdapter(new s7o(topics, this.pagerList));
        m220871I().clearOnTabSelectedListeners();
        m220871I().setupWithViewPager(m220876N());
        m220871I().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C21860b(topics));
        m220885X();
        m220890c0(topics);
        x20 x20Var = this.mRedDotAction;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m220890c0(List<? extends BLiveVoiceTab> topics) {
        TabLayout.Tab tabAt;
        m220908q().m192188r3();
        m220876N().setCurrentItem(0);
        String strM203602d4 = tbs.f172989b.m203602d4();
        int size = this.pagerList.size();
        for (int i = 0; i < size; i++) {
            c8o<BLiveVoiceTab> c8oVar = this.pagerList.get(i);
            c8oVar.getClass();
            if (TextUtils.equals(strM203602d4, c8oVar.mo108374H().f45361id)) {
                m220876N().setCurrentItem(i);
                break;
            }
        }
        if (m220871I().getSelectedTabPosition() != 0 || (tabAt = m220871I().getTabAt(0)) == null) {
            return;
        }
        m220877O(tabAt, topics);
        m220899k(tabAt, topics);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m220891d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM99540b = aqn0.m99540b(this, inflater, parent);
        viewM99540b.getClass();
        return viewM99540b;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m220892d0(boolean enable) {
        if (m220883V()) {
            m220869G().m225003I(enable);
        } else {
            m220869G().m225003I(true);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m220893e0() {
        if (tbs.f172989b.m203755v7()) {
            View viewInflate = LayoutInflater.from(this.act).inflate(xec0.f193825U1, (ViewGroup) null, false);
            viewInflate.getClass();
            VoiceSquareRightOperateView voiceSquareRightOperateView = (VoiceSquareRightOperateView) viewInflate;
            voiceSquareRightOperateView.m72125g(this.act);
            m220865B().setRightIconViews(voiceSquareRightOperateView);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m220894f0(@NotNull tpn0 tpn0Var) {
        tpn0Var.getClass();
        this.presenter = tpn0Var;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m220895g0(@NotNull final String tabId, final boolean show) {
        tabId.getClass();
        if (jyb.m147479J(this.pagerList)) {
            this.mRedDotAction = new x20() { // from class: l.ypn0
                @Override // p153l.x20
                public final void call() {
                    zpn0.m220857b(this.f201074a, tabId, show);
                }
            };
            return;
        }
        this.mRedDotAction = null;
        if (show) {
            m220898j0(tabId);
        } else {
            m220879Q(tabId);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull tpn0 presenter) {
        presenter.getClass();
        m220894f0(presenter);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m220897i0() {
        if (m220883V()) {
            bnl0.m105524M(m220865B(), false);
            bnl0.m105540X(m220870H(), 0);
        } else {
            bnl0.m105524M(m220865B(), true);
            bnl0.m105540X(m220870H(), qa00.m175859d(44.0f));
            m220855T();
        }
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM220891d = m220891d(inflater, parent);
        m220863r();
        if (tbs.f172989b.m203549W6()) {
            bnl0.m105524M(m220913x(), false);
        } else {
            m220880R();
            bnl0.m105524M(m220913x(), true);
        }
        m220881S();
        return viewM220891d;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m220898j0(String tabId) {
        int size = this.tabViewList.size();
        int measuredWidth = 0;
        for (int i = 0; i < size; i++) {
            measuredWidth += this.tabViewList.get(i).getMeasuredWidth();
            if (measuredWidth > 0 && Intrinsics.m88377d(tabId, this.tabViewList.get(i).getTag())) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(m220883V() ? nbc0.f141191q0 : nbc0.f141194r0);
                int i2 = qa00.f156323j;
                m220866C().addView(imageView, new FrameLayout.LayoutParams(i2, i2));
                bnl0.m105538V(imageView, qa00.f156316c + measuredWidth);
                imageView.setTag(tabId);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m220899k(@NotNull TabLayout.Tab tab, @NotNull List<? extends BLiveVoiceTab> topics) {
        Object next;
        eyr eyrVarMo108376m;
        tab.getClass();
        topics.getClass();
        if (m220883V() && tab.getPosition() >= 0 && tab.getPosition() < this.pagerList.size()) {
            BLiveVoiceTab bLiveVoiceTab = topics.get(tab.getPosition());
            Iterator<T> it = this.pagerList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m88377d(((BLiveVoiceTab) ((c8o) next).mo108374H()).f45361id, bLiveVoiceTab.f45361id));
            c8o c8oVar = (c8o) next;
            m220892d0((c8oVar == null || (eyrVarMo108376m = c8oVar.mo108376m()) == null) ? false : eyrVarMo108376m.mo123230f0());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m220900k0() {
        if (i9n.m139127b() || m220868F().isAnimating()) {
            return;
        }
        m220868F().mo69685l("https://auto.tancdn.com/v1/raw/bd5067f0-fa5a-4faf-bd72-06636f0c4d5610.pdf", -1, new C21861c());
    }

    /* JADX INFO: renamed from: l */
    public final void m220901l(BLiveVoiceTab voiceTab) {
        View viewInflate = LayoutInflater.from(m220908q().getAct()).inflate(xec0.f193831W1, (ViewGroup) null);
        viewInflate.getClass();
        VoiceTabView voiceTabView = (VoiceTabView) viewInflate;
        voiceTabView.m72323d(voiceTab, m220883V());
        voiceTabView.setTag(voiceTab.f45361id);
        this.tabViewList.add(voiceTabView);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m220902l0() {
        Object obj;
        eyr eyrVarMo108376m;
        m220869G().m225021t();
        if (m220883V()) {
            Iterator<T> it = this.pagerList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str = ((BLiveVoiceTab) ((c8o) next).mo108374H()).f45361id;
                BLiveVoiceTab bLiveVoiceTabM220911v = m220911v();
                if (Intrinsics.m88377d(str, bLiveVoiceTabM220911v != null ? bLiveVoiceTabM220911v.f45361id : null)) {
                    obj = next;
                    break;
                }
            }
            c8o c8oVar = (c8o) obj;
            if (c8oVar == null || (eyrVarMo108376m = c8oVar.mo108376m()) == null) {
                return;
            }
            eyrVarMo108376m.mo123235k0();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final RecyclerView.AbstractC0584t getOnScrollListener() {
        return this.onScrollListener;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m220904m0() {
        m220868F().m69688o();
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final c8o<BLiveVoiceTab> m220905n(int position) {
        if (position < 0 || position >= this.pagerList.size()) {
            return null;
        }
        return this.pagerList.get(position);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m220906n0() {
        BLiveVoiceTab bLiveVoiceTabM220911v = m220911v();
        if (bLiveVoiceTabM220911v != null) {
            w6u.m205198c(bLiveVoiceTabM220911v.f45361id);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final ArrayList<c8o<BLiveVoiceTab>> m220907p() {
        return this.pagerList;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final tpn0 m220908q() {
        tpn0 tpn0Var = this.presenter;
        if (tpn0Var != null) {
            return tpn0Var;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final c8o<BLiveVoiceTab> m220909s() {
        c8o<BLiveVoiceTab> c8oVar = this.pagerList.get(m220876N().getCurrentItem());
        c8oVar.getClass();
        return c8oVar;
    }

    /* JADX INFO: renamed from: u */
    public final int m220910u() {
        return m220871I().getSelectedTabPosition();
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final BLiveVoiceTab m220911v() {
        if (jyb.m147479J(this.pagerList)) {
            return null;
        }
        return m220909s().mo108374H();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final FrameLayout m220912w() {
        FrameLayout frameLayout = this._container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final LiveVoiceEntryView m220913x() {
        LiveVoiceEntryView liveVoiceEntryView = this._entry_view;
        if (liveVoiceEntryView != null) {
            return liveVoiceEntryView;
        }
        Intrinsics.m88391r("_entry_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final IntlGameOperationView m220914y() {
        IntlGameOperationView intlGameOperationView = this._game_entry_view;
        if (intlGameOperationView != null) {
            return intlGameOperationView;
        }
        Intrinsics.m88391r("_game_entry_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VImage m220915z() {
        VImage vImage = this._img_empty;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_img_empty");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.zpn0$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m88121d2 = {"l/zpn0$b", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21860b implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<BLiveVoiceTab> f205512b;

        /* JADX WARN: Multi-variable type inference failed */
        public C21860b(List<? extends BLiveVoiceTab> list) {
            this.f205512b = list;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            zpn0.this.m220877O(tab, this.f205512b);
            zpn0.this.m220899k(tab, this.f205512b);
            if (tab.getCustomView() != null) {
                View customView = tab.getCustomView();
                customView.getClass();
                if (customView.getTag() != null) {
                    View customView2 = tab.getCustomView();
                    customView2.getClass();
                    w6u.m205198c(customView2.getTag().toString());
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
            zpn0.this.m220878P(tab, this.f205512b);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
