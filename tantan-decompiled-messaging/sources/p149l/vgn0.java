package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import com.p046p1.mobile.putong.live.external.view.widgets.VoiceSquareRightOperateView;
import com.p046p1.mobile.putong.live.external.voice.home.LiveSquareVoiceFragment;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.VoiceTabView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u001d\u0010\u0013\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\tJ\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010'J\u001f\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b3\u0010\tJ\u0011\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106J!\u00107\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b7\u0010/J\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0007¢\u0006\u0004\bB\u0010\tJ/\u0010D\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0010¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\u0007¢\u0006\u0004\bF\u0010\tJ\r\u0010G\u001a\u00020\u0007¢\u0006\u0004\bG\u0010\tJ\r\u0010H\u001a\u00020\u0007¢\u0006\u0004\bH\u0010\tJ\r\u0010I\u001a\u00020\u0007¢\u0006\u0004\bI\u0010\tJ\r\u0010J\u001a\u000208¢\u0006\u0004\bJ\u0010:J\u001d\u0010L\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010K\u001a\u000208¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u0007¢\u0006\u0004\bN\u0010\tJ\u0015\u0010P\u001a\u00020\u00072\u0006\u0010O\u001a\u000208¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\bR\u0010\u001eJ\u001d\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00152\u0006\u0010S\u001a\u00020;¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010j\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010Z\u001a\u0004\bh\u0010\\\"\u0004\bi\u0010^R\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010Z\u001a\u0005\b\u0084\u0001\u0010\\\"\u0005\b\u0085\u0001\u0010^R)\u0010\u008d\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b1\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R)\u0010\u0094\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b \u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R)\u0010\u009b\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bR\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010¢\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0019\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010ª\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R)\u0010\u00ad\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bT\u0010\u0096\u0001\u001a\u0006\b«\u0001\u0010\u0098\u0001\"\u0006\b¬\u0001\u0010\u009a\u0001R*\u0010±\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b®\u0001\u0010\u009d\u0001\u001a\u0006\b¯\u0001\u0010\u009f\u0001\"\u0006\b°\u0001\u0010¡\u0001R*\u0010µ\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b²\u0001\u0010¥\u0001\u001a\u0006\b³\u0001\u0010§\u0001\"\u0006\b´\u0001\u0010©\u0001R*\u0010½\u0001\u001a\u00030¶\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R)\u0010Ä\u0001\u001a\u00030¾\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\b\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R&\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b>\u0010Å\u0001\u001a\u0006\b·\u0001\u0010Æ\u0001\"\u0005\bÇ\u0001\u00102R9\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150È\u0001j\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0015`É\u00018\u0006¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\b²\u0001\u0010Ì\u0001R-\u0010Î\u0001\u001a\u0014\u0012\u0004\u0012\u00020-0È\u0001j\t\u0012\u0004\u0012\u00020-`É\u00018\u0006¢\u0006\u000f\n\u0005\b<\u0010Ë\u0001\u001a\u0006\bÍ\u0001\u0010Ì\u0001R-\u0010Ð\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00110È\u0001j\t\u0012\u0004\u0012\u00020\u0011`É\u00018\u0006¢\u0006\u000f\n\u0005\b@\u0010Ë\u0001\u001a\u0006\bÏ\u0001\u0010Ì\u0001R+\u0010×\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bh\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R*\u0010Ý\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010Ù\u0001\u001a\u0006\b¤\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001¨\u0006Þ\u0001"}, m87232d2 = {"Ll/vgn0;", "Ll/s7m;", "Ll/pgn0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "r", "()V", "R", j6f.LATITUDE_SOUTH, j6f.GPS_DIRECTION_TRUE, "e0", "h0", "X", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "topics", "c0", "(Ljava/util/List;)V", "Ll/c6o;", "pagerList", "W", "voiceTab", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;)V", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", BloodType.f38728O, "(Lcom/google/android/material/tabs/TabLayout$Tab;Ljava/util/List;)V", "P", "j", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Z", "i0", "", "tabId", "j0", "(Ljava/lang/String;)V", "Q", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", RXScreenCaptureService.KEY_INDEX, "(Ll/pgn0;)V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "inflateView", "", "U", "()Z", "", "u", "()I", BLiveStormDanmakuGiftResourceType.f44446s, "()Ll/c6o;", ResourceDirection.f38808v, "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "n0", "pager", "b0", "(Ljava/util/List;Ljava/util/List;)V", "a0", "Y", "k0", "m0", j6f.GPS_MEASUREMENT_INTERRUPTED, "show", "g0", "(Ljava/lang/String;Z)V", "l0", "enable", "d0", "(Z)V", "k", "position", "n", "(I)Ll/c6o;", "a", "Lcom/p1/mobile/android/app/Act;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", "E", "()Landroid/widget/FrameLayout;", "set_root", "(Landroid/widget/FrameLayout;)V", "_root", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "c", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "F", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga_view", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga_view", "w", "set_container", "_container", "Lv/navigationbar/VNavigationBar;", "e", "Lv/navigationbar/VNavigationBar;", "B", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "H", "()Landroid/widget/LinearLayout;", "set_tabLayout_container", "(Landroid/widget/LinearLayout;)V", "_tabLayout_container", "Lcom/google/android/material/tabs/TabLayout;", "g", "Lcom/google/android/material/tabs/TabLayout;", "I", "()Lcom/google/android/material/tabs/TabLayout;", "set_topic_tab_layout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_topic_tab_layout", "h", b2s.C_ZONE, "set_red_dot_layout", "_red_dot_layout", "Lv/VPullDownRefreshLayout;", "Lv/VPullDownRefreshLayout;", "G", "()Lv/VPullDownRefreshLayout;", "set_swipe_refresh", "(Lv/VPullDownRefreshLayout;)V", "_swipe_refresh", "Lcom/p1/mobile/putong/live/external/view/widgets/NoSaveStateViewPager;", "Lcom/p1/mobile/putong/live/external/view/widgets/NoSaveStateViewPager;", "N", "()Lcom/p1/mobile/putong/live/external/view/widgets/NoSaveStateViewPager;", "set_view_pager", "(Lcom/p1/mobile/putong/live/external/view/widgets/NoSaveStateViewPager;)V", "_view_pager", "Lv/VLinear;", "Lv/VLinear;", "M", "()Lv/VLinear;", "set_view_group_network_error", "(Lv/VLinear;)V", "_view_group_network_error", "Lv/VImage;", "Lv/VImage;", "A", "()Lv/VImage;", "set_img_network_error", "(Lv/VImage;)V", "_img_network_error", "Lv/VText;", "m", "Lv/VText;", "K", "()Lv/VText;", "set_tv_network_error", "(Lv/VText;)V", "_tv_network_error", "L", "set_view_group_empty", "_view_group_empty", "o", BaseSei.f13932Z, "set_img_empty", "_img_empty", "p", "J", "set_tv_empty", "_tv_empty", "Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;", "q", "Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;", BaseSei.f13930X, "()Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;", "set_entry_view", "(Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;)V", "_entry_view", "Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;", "Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;", BaseSei.f13931Y, "()Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;", "set_game_entry_view", "(Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;)V", "_game_entry_view", "Ll/pgn0;", "()Ll/pgn0;", "f0", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.KEY_T, "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "getTabViewList", "tabViewList", "getTopicList", "topicList", "Ll/d30;", "Ll/d30;", "getMRedDotAction", "()Ll/d30;", "setMRedDotAction", "(Ll/d30;)V", "mRedDotAction", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView$t;", "()Landroidx/recyclerview/widget/RecyclerView$t;", "setOnScrollListener", "(Landroidx/recyclerview/widget/RecyclerView$t;)V", "onScrollListener", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class vgn0 implements s7m<pgn0> {

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
    public pgn0 presenter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<c6o<BLiveVoiceTab>> pagerList;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<View> tabViewList;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<BLiveVoiceTab> topicList;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public d30 mRedDotAction;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public RecyclerView.AbstractC0582t onScrollListener;

    /* JADX INFO: renamed from: l.vgn0$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"l/vgn0$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20631a extends RecyclerView.AbstractC0582t {
        public C20631a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            if (dy != 0) {
                vgn0.this.m198374q().m168798H3();
            }
        }
    }

    /* JADX INFO: renamed from: l.vgn0$c */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/vgn0$c", "Ll/ap0;", "", "g", "()V", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20633c extends ap0 {
        public C20633c() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            xdl0.m208344M(vgn0.this.m198334F(), true);
        }
    }

    public vgn0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pagerList = new ArrayList<>();
        this.tabViewList = new ArrayList<>();
        this.topicList = new ArrayList<>();
        this.onScrollListener = new C20631a();
    }

    /* JADX INFO: renamed from: T */
    private final void m198321T() {
        VText vText = new VText(this.act);
        vText.setText(R$string.f44936x0);
        vText.setTextSize(fpn0.m122616f().mo117891j());
        vText.setTextColor(fpn0.m122616f().getTitleColor());
        vText.setTypeface(null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, t100.f167254c, 0, 0);
        m198331B().setTitleView(vText);
        m198331B().setLeftIconAsBack(this.act);
        m198331B().setBackgroundResource(g1c0.f100144H);
        VImage vImage = new VImage(this.act);
        vImage.setImageResource(fpn0.m122616f().mo117888g());
        m198331B().setLeftIconView(vImage);
        m198331B().setLeftIconOnClick(new View.OnClickListener() { // from class: l.tgn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vgn0.m198324c(this.f170108a, view);
            }
        });
        m198359e0();
        Act act = this.act;
        act.setStatusBarColor(act.color(g1c0.f100148c));
        this.act.getWindow().setNavigationBarColor(this.act.color(g1c0.f100148c));
        m198327h0(this.act);
        m198366k0();
    }

    /* JADX INFO: renamed from: a */
    public static void m198322a(vgn0 vgn0Var, hnc0 hnc0Var) {
        hnc0Var.getClass();
        if (vgn0Var.m198348U()) {
            vgn0Var.m198374q().m168803M3();
            return;
        }
        c6o<BLiveVoiceTab> c6oVarM198375s = vgn0Var.m198375s();
        pgn0 pgn0VarM198374q = vgn0Var.m198374q();
        BLiveVoiceTab bLiveVoiceTabMo105487H = c6oVarM198375s.mo105487H();
        bLiveVoiceTabMo105487H.getClass();
        pgn0VarM198374q.m168800J3(bLiveVoiceTabMo105487H, vgn0Var.m198342N().getCurrentItem(), true);
    }

    /* JADX INFO: renamed from: b */
    public static void m198323b(vgn0 vgn0Var, String str, boolean z) {
        vgn0Var.m198361g0(str, z);
    }

    /* JADX INFO: renamed from: c */
    public static void m198324c(vgn0 vgn0Var, View view) {
        vgn0Var.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m198327h0(Act act) {
        if (act instanceof PutongAct) {
            ((PutongAct) act).setTransparentStatusBar();
            int i = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = xdl0.m208331F0();
            m198378w().setLayoutParams(layoutParams);
            m198334F().setLayoutParams(new FrameLayout.LayoutParams(xdl0.f192403e, t100.m186890d(92.0f) + xdl0.m208331F0()));
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m198328j(TabLayout.Tab tab) {
        if (NullChecker.m81303a(tab.getCustomView())) {
            View customView = tab.getCustomView();
            customView.getClass();
            ((VoiceTabView) customView).m71139c(tab.isSelected(), null);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m198329r() {
        m198333E().setBackgroundColor(fpn0.m122617g(m198349V()).mo117886e());
        m198381z().setImageResource(fpn0.m122617g(m198349V()).mo117890i());
        m198338J().setTextColor(fpn0.m122617g(m198349V()).mo117887f());
        m198330A().setImageResource(fpn0.m122612b(m198349V()).mo108463c());
        m198339K().setTextColor(fpn0.m122612b(m198349V()).mo108466f());
        m198380y().f45553b.setImageResource(m198349V() ? h3c0.f105700q0 : h3c0.f105703r0);
        m198363i0();
        m198335G().m223757I(true);
        m198335G().m223755G(false);
        m198335G().mo223159O(new df50() { // from class: l.sgn0
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                vgn0.m198322a(this.f164454a, hnc0Var);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VImage m198330A() {
        VImage vImage = this._img_network_error;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_img_network_error");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VNavigationBar m198331B() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final FrameLayout m198332C() {
        FrameLayout frameLayout = this._red_dot_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_red_dot_layout");
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m198374q().getAct();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final FrameLayout m198333E() {
        FrameLayout frameLayout = this._root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final AnimEffectPlayer m198334F() {
        AnimEffectPlayer animEffectPlayer = this._svga_view;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m87502r("_svga_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VPullDownRefreshLayout m198335G() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._swipe_refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.m87502r("_swipe_refresh");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LinearLayout m198336H() {
        LinearLayout linearLayout = this._tabLayout_container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_tabLayout_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final TabLayout m198337I() {
        TabLayout tabLayout = this._topic_tab_layout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m87502r("_topic_tab_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m198338J() {
        VText vText = this._tv_empty;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VText m198339K() {
        VText vText = this._tv_network_error;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_network_error");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VLinear m198340L() {
        VLinear vLinear = this._view_group_empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_view_group_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VLinear m198341M() {
        VLinear vLinear = this._view_group_network_error;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_view_group_network_error");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final NoSaveStateViewPager m198342N() {
        NoSaveStateViewPager noSaveStateViewPager = this._view_pager;
        if (noSaveStateViewPager != null) {
            return noSaveStateViewPager;
        }
        Intrinsics.m87502r("_view_pager");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final void m198343O(TabLayout.Tab tab, List<? extends BLiveVoiceTab> topics) {
        m198368l0();
        if (tab.getPosition() < 0 || tab.getPosition() >= this.pagerList.size()) {
            return;
        }
        BLiveVoiceTab bLiveVoiceTab = topics.get(tab.getPosition());
        m198328j(tab);
        c6o<BLiveVoiceTab> c6oVar = this.pagerList.get(tab.getPosition());
        c6oVar.getClass();
        c6o<BLiveVoiceTab> c6oVar2 = c6oVar;
        if (c6oVar2.mo105488I().booleanValue()) {
            m198374q().m168793C3(bLiveVoiceTab, tab.getPosition());
        } else {
            m198374q().m168799I3(bLiveVoiceTab, tab.getPosition());
        }
        if (!s9s.f163228b.m195968v7() && TextUtils.equals(xvo0.f194657a, c6oVar2.mo105487H().f44513id)) {
            LiveVoiceApi.postVoiceActivitiesToZero();
        }
        if (TextUtils.equals(xvo0.f194659c, c6oVar2.mo105487H().f44513id)) {
            LiveVoiceApi.postVoiceActivitiesToZero();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m198344P(TabLayout.Tab tab, List<? extends BLiveVoiceTab> topics) {
        if (tab.getPosition() < 0 || tab.getPosition() >= topics.size()) {
            return;
        }
        BLiveVoiceTab bLiveVoiceTab = topics.get(tab.getPosition());
        m198328j(tab);
        pgn0 pgn0VarM198374q = m198374q();
        String str = bLiveVoiceTab.f44513id;
        str.getClass();
        pgn0VarM198374q.m168794D3(str);
    }

    /* JADX INFO: renamed from: Q */
    public final void m198345Q(String tabId) {
        int childCount = m198332C().getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            }
            if (m198332C().getChildAt(childCount) != null && m198332C().getChildAt(childCount).getTag() != null && (m198332C().getChildAt(childCount).getTag() instanceof String)) {
                Object tag = m198332C().getChildAt(childCount).getTag();
                tag.getClass();
                if (TextUtils.equals(tabId, (String) tag)) {
                    m198332C().removeView(m198332C().getChildAt(childCount));
                }
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m198346R() {
        m198379x().m71130s(m198349V());
        m198374q().m168806m3(m198379x());
    }

    /* JADX INFO: renamed from: S */
    public final void m198347S() {
        m198374q().m168807n3(m198380y());
    }

    /* JADX INFO: renamed from: U */
    public final boolean m198348U() {
        return m198337I().getTabCount() <= 0;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m198349V() {
        return m198374q().m151643H2().f135531b instanceof LiveSquareVoiceFragment;
    }

    /* JADX INFO: renamed from: W */
    public final void m198350W(List<? extends c6o<BLiveVoiceTab>> pagerList) {
        this.pagerList.clear();
        this.tabViewList.clear();
        m198337I().removeAllTabs();
        this.pagerList.addAll(pagerList);
    }

    /* JADX INFO: renamed from: X */
    public final void m198351X() {
        int tabCount = m198337I().getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = m198337I().getTabAt(i);
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
                m198328j(tabAt);
                if (i == 0) {
                    xdl0.m208358V(tabAt.view, svq.m186103c(12));
                } else if (i == m198337I().getTabCount() - 1) {
                    xdl0.m208359W(tabAt.view, svq.m186103c(12));
                }
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m198352Y() {
        m198368l0();
        m198336H().setVisibility(8);
        m198341M().setVisibility(0);
        m198340L().setVisibility(8);
    }

    /* JADX INFO: renamed from: Z */
    public final void m198353Z() {
        m198368l0();
        m198336H().setVisibility(8);
        m198341M().setVisibility(8);
        m198340L().setVisibility(0);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m198354a0() {
        m198368l0();
        m198336H().setVisibility(0);
        m198341M().setVisibility(8);
        m198340L().setVisibility(8);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m198355b0(@NotNull List<? extends BLiveVoiceTab> topics, @NotNull List<? extends c6o<BLiveVoiceTab>> pager) {
        topics.getClass();
        pager.getClass();
        this.topicList.clear();
        this.topicList.addAll(topics);
        m198368l0();
        if (topics.isEmpty()) {
            m198353Z();
            return;
        }
        m198336H().setVisibility(0);
        m198350W(pager);
        Iterator<T> it = topics.iterator();
        while (it.hasNext()) {
            m198367l((BLiveVoiceTab) it.next());
        }
        if (topics.size() != this.pagerList.size()) {
            return;
        }
        m198342N().setAdapter(new s5o(topics, this.pagerList));
        m198337I().clearOnTabSelectedListeners();
        m198337I().setupWithViewPager(m198342N());
        m198337I().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20632b(topics));
        m198351X();
        m198356c0(topics);
        d30 d30Var = this.mRedDotAction;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m198356c0(List<? extends BLiveVoiceTab> topics) {
        TabLayout.Tab tabAt;
        m198374q().m168811r3();
        m198342N().setCurrentItem(0);
        String strM195815d4 = s9s.f163228b.m195815d4();
        int size = this.pagerList.size();
        for (int i = 0; i < size; i++) {
            c6o<BLiveVoiceTab> c6oVar = this.pagerList.get(i);
            c6oVar.getClass();
            if (TextUtils.equals(strM195815d4, c6oVar.mo105487H().f44513id)) {
                m198342N().setCurrentItem(i);
                break;
            }
        }
        if (m198337I().getSelectedTabPosition() != 0 || (tabAt = m198337I().getTabAt(0)) == null) {
            return;
        }
        m198343O(tabAt, topics);
        m198365k(tabAt, topics);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m198357d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM203076b = wgn0.m203076b(this, inflater, parent);
        viewM203076b.getClass();
        return viewM203076b;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m198358d0(boolean enable) {
        if (m198349V()) {
            m198335G().m223757I(enable);
        } else {
            m198335G().m223757I(true);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m198359e0() {
        if (s9s.f163228b.m195968v7()) {
            View viewInflate = LayoutInflater.from(this.act).inflate(s6c0.f162711U1, (ViewGroup) null, false);
            viewInflate.getClass();
            VoiceSquareRightOperateView voiceSquareRightOperateView = (VoiceSquareRightOperateView) viewInflate;
            voiceSquareRightOperateView.m70942g(this.act);
            m198331B().setRightIconViews(voiceSquareRightOperateView);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m198360f0(@NotNull pgn0 pgn0Var) {
        pgn0Var.getClass();
        this.presenter = pgn0Var;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m198361g0(@NotNull final String tabId, final boolean show) {
        tabId.getClass();
        if (vwb.m200296J(this.pagerList)) {
            this.mRedDotAction = new d30() { // from class: l.ugn0
                @Override // p149l.d30
                public final void call() {
                    vgn0.m198323b(this.f176405a, tabId, show);
                }
            };
            return;
        }
        this.mRedDotAction = null;
        if (show) {
            m198364j0(tabId);
        } else {
            m198345Q(tabId);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull pgn0 presenter) {
        presenter.getClass();
        m198360f0(presenter);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m198363i0() {
        if (m198349V()) {
            xdl0.m208344M(m198331B(), false);
            xdl0.m208360X(m198336H(), 0);
        } else {
            xdl0.m208344M(m198331B(), true);
            xdl0.m208360X(m198336H(), t100.m186890d(44.0f));
            m198321T();
        }
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM198357d = m198357d(inflater, parent);
        m198329r();
        if (s9s.f163228b.m195762W6()) {
            xdl0.m208344M(m198379x(), false);
        } else {
            m198346R();
            xdl0.m208344M(m198379x(), true);
        }
        m198347S();
        return viewM198357d;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m198364j0(String tabId) {
        int size = this.tabViewList.size();
        int measuredWidth = 0;
        for (int i = 0; i < size; i++) {
            measuredWidth += this.tabViewList.get(i).getMeasuredWidth();
            if (measuredWidth > 0 && Intrinsics.m87488d(tabId, this.tabViewList.get(i).getTag())) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(m198349V() ? h3c0.f105700q0 : h3c0.f105703r0);
                int i2 = t100.f167261j;
                m198332C().addView(imageView, new FrameLayout.LayoutParams(i2, i2));
                xdl0.m208358V(imageView, t100.f167254c + measuredWidth);
                imageView.setTag(tabId);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m198365k(@NotNull TabLayout.Tab tab, @NotNull List<? extends BLiveVoiceTab> topics) {
        Object next;
        dwr dwrVarMo105489m;
        tab.getClass();
        topics.getClass();
        if (m198349V() && tab.getPosition() >= 0 && tab.getPosition() < this.pagerList.size()) {
            BLiveVoiceTab bLiveVoiceTab = topics.get(tab.getPosition());
            Iterator<T> it = this.pagerList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m87488d(((BLiveVoiceTab) ((c6o) next).mo105487H()).f44513id, bLiveVoiceTab.f44513id));
            c6o c6oVar = (c6o) next;
            m198358d0((c6oVar == null || (dwrVarMo105489m = c6oVar.mo105489m()) == null) ? false : dwrVarMo105489m.mo111899f0());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m198366k0() {
        if (i7n.m134916b() || m198334F().isAnimating()) {
            return;
        }
        m198334F().mo68502l("https://auto.tancdn.com/v1/raw/bd5067f0-fa5a-4faf-bd72-06636f0c4d5610.pdf", -1, new C20633c());
    }

    /* JADX INFO: renamed from: l */
    public final void m198367l(BLiveVoiceTab voiceTab) {
        View viewInflate = LayoutInflater.from(m198374q().getAct()).inflate(s6c0.f162717W1, (ViewGroup) null);
        viewInflate.getClass();
        VoiceTabView voiceTabView = (VoiceTabView) viewInflate;
        voiceTabView.m71140d(voiceTab, m198349V());
        voiceTabView.setTag(voiceTab.f44513id);
        this.tabViewList.add(voiceTabView);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m198368l0() {
        Object obj;
        dwr dwrVarMo105489m;
        m198335G().m223775t();
        if (m198349V()) {
            Iterator<T> it = this.pagerList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str = ((BLiveVoiceTab) ((c6o) next).mo105487H()).f44513id;
                BLiveVoiceTab bLiveVoiceTabM198377v = m198377v();
                if (Intrinsics.m87488d(str, bLiveVoiceTabM198377v != null ? bLiveVoiceTabM198377v.f44513id : null)) {
                    obj = next;
                    break;
                }
            }
            c6o c6oVar = (c6o) obj;
            if (c6oVar == null || (dwrVarMo105489m = c6oVar.mo105489m()) == null) {
                return;
            }
            dwrVarMo105489m.mo111902k0();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final RecyclerView.AbstractC0582t getOnScrollListener() {
        return this.onScrollListener;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m198370m0() {
        m198334F().m68505o();
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final c6o<BLiveVoiceTab> m198371n(int position) {
        if (position < 0 || position >= this.pagerList.size()) {
            return null;
        }
        return this.pagerList.get(position);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m198372n0() {
        BLiveVoiceTab bLiveVoiceTabM198377v = m198377v();
        if (bLiveVoiceTabM198377v != null) {
            v4u.m197064c(bLiveVoiceTabM198377v.f44513id);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final ArrayList<c6o<BLiveVoiceTab>> m198373p() {
        return this.pagerList;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final pgn0 m198374q() {
        pgn0 pgn0Var = this.presenter;
        if (pgn0Var != null) {
            return pgn0Var;
        }
        Intrinsics.m87502r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final c6o<BLiveVoiceTab> m198375s() {
        c6o<BLiveVoiceTab> c6oVar = this.pagerList.get(m198342N().getCurrentItem());
        c6oVar.getClass();
        return c6oVar;
    }

    /* JADX INFO: renamed from: u */
    public final int m198376u() {
        return m198337I().getSelectedTabPosition();
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final BLiveVoiceTab m198377v() {
        if (vwb.m200296J(this.pagerList)) {
            return null;
        }
        return m198375s().mo105487H();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final FrameLayout m198378w() {
        FrameLayout frameLayout = this._container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final LiveVoiceEntryView m198379x() {
        LiveVoiceEntryView liveVoiceEntryView = this._entry_view;
        if (liveVoiceEntryView != null) {
            return liveVoiceEntryView;
        }
        Intrinsics.m87502r("_entry_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final IntlGameOperationView m198380y() {
        IntlGameOperationView intlGameOperationView = this._game_entry_view;
        if (intlGameOperationView != null) {
            return intlGameOperationView;
        }
        Intrinsics.m87502r("_game_entry_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VImage m198381z() {
        VImage vImage = this._img_empty;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_img_empty");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.vgn0$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m87232d2 = {"l/vgn0$b", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20632b implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<BLiveVoiceTab> f181412b;

        /* JADX WARN: Multi-variable type inference failed */
        public C20632b(List<? extends BLiveVoiceTab> list) {
            this.f181412b = list;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            vgn0.this.m198343O(tab, this.f181412b);
            vgn0.this.m198365k(tab, this.f181412b);
            if (tab.getCustomView() != null) {
                View customView = tab.getCustomView();
                customView.getClass();
                if (customView.getTag() != null) {
                    View customView2 = tab.getCustomView();
                    customView2.getClass();
                    v4u.m197064c(customView2.getTag().toString());
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
            vgn0.this.m198344P(tab, this.f181412b);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
