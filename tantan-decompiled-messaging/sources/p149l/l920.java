package p149l;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.newui.nearby.NearbyFrag;
import com.p046p1.mobile.putong.core.newui.nearby.NearbyPresenter;
import com.p046p1.mobile.putong.core.newui.view.RadarRipple;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame_Squared;
import p147v.VImage;
import p147v.VPullDownRefreshLayout;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\nJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\nJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\nJ\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J#\u0010)\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\nJ\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\nJ\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\b2\u0006\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020'H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\b2\u0006\u00101\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020'H\u0016¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020'¢\u0006\u0004\b8\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b!\u0010;R\"\u0010B\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010D\u001a\u0004\bs\u0010F\"\u0004\bt\u0010HR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R#\u0010\u0080\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010d\u001a\u0004\b~\u0010f\"\u0004\b\u007f\u0010hR%\u0010\u0083\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u0016\u0010l\u001a\u0005\b\u0081\u0001\u0010n\"\u0005\b\u0082\u0001\u0010pR)\u0010\u008a\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b+\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R)\u0010\u0091\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b6\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R)\u0010 \u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b!\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R(\u0010¥\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b¡\u0001\u0010£\u0001\"\u0005\b¤\u0001\u0010\u0017RQ\u0010\u00ad\u0001\u001a+\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010'0' §\u0001*\u0014\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010'0'\u0018\u00010¦\u00010¦\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\t\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010¯\u0001R\u001d\u0010¶\u0001\u001a\u00030±\u00018\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R&\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u009c\u0001\u0010·\u0001\u001a\u0005\b¸\u0001\u00107\"\u0005\b¹\u0001\u00105R'\u0010¼\u0001\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0095\u0001\u0010·\u0001\u001a\u0005\bº\u0001\u00107\"\u0005\b»\u0001\u00105¨\u0006½\u0001"}, m87232d2 = {"Ll/l920;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "Ll/c820$a;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;)V", "", "r", "()V", "J", "G", "L", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;)V", "inflateView", "K", j6f.GPS_DIRECTION_TRUE, "R", "U", j6f.LATITUDE_SOUTH, BloodType.f38728O, "P", "Lcom/p1/mobile/putong/data/Picture;", "p", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/putong/data/Picture;)V", "", "Lcom/p1/mobile/putong/data/User;", "list", "", "hasPrivilege", "Q", "(Ljava/util/List;Z)V", "m", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "clickedUser", "liked", "b", "(Lcom/p1/mobile/putong/data/User;Z)V", "c", "(Z)V", "n", "()Z", "N", "a", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "Lv/navigationbar/VNavigationBar;", "Lv/navigationbar/VNavigationBar;", "w", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "A", "()Landroid/widget/RelativeLayout;", "set_rl_loading", "(Landroid/widget/RelativeLayout;)V", "_rl_loading", "Lv/VFrame_Squared;", Constants.INAPP_DATA_TAG, "Lv/VFrame_Squared;", "get_rl_loading_radar", "()Lv/VFrame_Squared;", "set_rl_loading_radar", "(Lv/VFrame_Squared;)V", "_rl_loading_radar", "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "e", "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "E", "()Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "set_rl_loading_radar_ripple", "(Lcom/p1/mobile/putong/core/newui/view/RadarRipple;)V", "_rl_loading_radar_ripple", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", b2s.C_ZONE, "()Lv/VDraweeView;", "set_rl_loading_radar_image", "(Lv/VDraweeView;)V", "_rl_loading_radar_image", "Lv/VText;", "g", "Lv/VText;", "B", "()Lv/VText;", "set_rl_loading_describe", "(Lv/VText;)V", "_rl_loading_describe", "Lv/VButton;", "h", "Lv/VButton;", "F", "()Lv/VButton;", "set_rl_loading_setting", "(Lv/VButton;)V", "_rl_loading_setting", RXScreenCaptureService.KEY_INDEX, BaseSei.f13931Y, "set_rl_error_view", "_rl_error_view", "Lv/VImage;", "j", "Lv/VImage;", "get_rl_error_view_img_network_error", "()Lv/VImage;", "set_rl_error_view_img_network_error", "(Lv/VImage;)V", "_rl_error_view_img_network_error", "get_rl_error_view_tv_network_tips", "set_rl_error_view_tv_network_tips", "_rl_error_view_tv_network_tips", BaseSei.f13932Z, "set_rl_error_view_reload", "_rl_error_view_reload", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", BLiveStormDanmakuGiftResourceType.f44446s, "()Landroid/widget/FrameLayout;", "set_fl_content_layout", "(Landroid/widget/FrameLayout;)V", "_fl_content_layout", "Lv/VPullDownRefreshLayout;", "Lv/VPullDownRefreshLayout;", BaseSei.f13930X, "()Lv/VPullDownRefreshLayout;", "set_refresh", "(Lv/VPullDownRefreshLayout;)V", "_refresh", "Lv/VPullUpRecyclerView;", "o", "Lv/VPullUpRecyclerView;", ResourceDirection.f38808v, "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "u", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "q", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "X", "nearbyPresenter", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "Lrx/subjects/a;", "getShowingRadar", "()Lrx/subjects/a;", "setShowingRadar", "(Lrx/subjects/a;)V", "showingRadar", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "radarAnimator", "Lcom/p1/mobile/android/app/Act;", Constants.KEY_T, "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Z", "getHasPrivilege", "setHasPrivilege", "getHideNavigation", "W", "hideNavigation", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class l920 implements s7m<NearbyPresenter>, c820.InterfaceC16092a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NearbyFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RelativeLayout _rl_loading;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VFrame_Squared _rl_loading_radar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public RadarRipple _rl_loading_radar_ripple;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _rl_loading_radar_image;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _rl_loading_describe;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VButton _rl_loading_setting;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public RelativeLayout _rl_error_view;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VImage _rl_error_view_img_network_error;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _rl_error_view_tv_network_tips;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VButton _rl_error_view_reload;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public FrameLayout _fl_content_layout;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VPullDownRefreshLayout _refresh;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public TextView _get_privilege;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public NearbyPresenter nearbyPresenter;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public C22392a<Boolean> showingRadar;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public Animator radarAnimator;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean hideNavigation;

    /* JADX INFO: renamed from: l.l920$a */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m87232d2 = {"l/l920$a", "Ll/h820$b;", "Lcom/p1/mobile/putong/data/User;", "user", "", Constants.INAPP_POSITION, "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "b", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18171a implements h820.InterfaceC17246b {
        public C18171a() {
        }

        /* JADX INFO: renamed from: c */
        public static void m148996c(User user, l920 l920Var) {
            CoreModule.f17545c.f19665m2.m191476s3(user);
            l920Var.getFrag().m42705Y4().m129869L(user);
            if (vwb.m200296J(l920Var.getFrag().m42705Y4().m129868K())) {
                l920Var.m148988q().m42751Q0();
            }
        }

        @Override // p149l.h820.InterfaceC17246b
        /* JADX INFO: renamed from: a */
        public void mo129872a(User user, int pos) {
            user.getClass();
            l920.this.m148988q().m42752z0(user);
        }

        @Override // p149l.h820.InterfaceC17246b
        /* JADX INFO: renamed from: b */
        public void mo129873b(final User user, int pos) {
            user.getClass();
            zvf0.m220396r("e_odiamond_sayhi", l920.this.getFrag().pageId());
            CoreBusinessService coreBusinessServiceM94651a = CoreModule.f17554l.m94651a();
            Act act = l920.this.getAct();
            String strM42750P0 = l920.this.m148988q().m42750P0();
            final l920 l920Var = l920.this;
            coreBusinessServiceM94651a.mo33305Dl(act, user, strM42750P0, new d30() { // from class: l.k920
                @Override // p149l.d30
                public final void call() {
                    l920.C18171a.m148996c(user, l920Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.l920$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"l/l920$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18172b extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f126900b;

        public C18172b(GridLayoutManager gridLayoutManager) {
            this.f126900b = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int position) {
            if (l920.this.getFrag().m42705Y4().getItemViewType(position) == 2) {
                return this.f126900b.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.l920$c */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, m87232d2 = {"l/l920$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isScrollingToBottom", "b", "pullUpDisable", "c", "hasScrollingToTop", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18173c extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean hasScrollingToTop = true;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f126904d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ l920 f126905e;

        public C18173c(GridLayoutManager gridLayoutManager, l920 l920Var) {
            this.f126904d = gridLayoutManager;
            this.f126905e = l920Var;
        }

        /* JADX INFO: renamed from: a */
        public static void m148997a(C18173c c18173c) {
            c18173c.pullUpDisable = true;
        }

        /* JADX INFO: renamed from: b */
        public static void m148998b(C18173c c18173c, RecyclerView recyclerView) {
            c18173c.pullUpDisable = true;
            c18173c.hasScrollingToTop = false;
            recyclerView.stopScroll();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState != 0) {
                if (newState != 2) {
                    return;
                }
                this.pullUpDisable = false;
                return;
            }
            int iFindLastVisibleItemPosition = this.f126904d.findLastVisibleItemPosition();
            int childCount = this.f126904d.getChildCount();
            if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f126904d.getItemCount() - 1 || this.f126904d.getItemCount() < childCount || !this.hasScrollingToTop || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1)) {
                return;
            }
            this.f126905e.m148988q().m42747J0(new d30() { // from class: l.m920
                @Override // p149l.d30
                public final void call() {
                    l920.C18173c.m148997a(this.f132659a);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(final RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            boolean z = dy > 0;
            this.isScrollingToBottom = z;
            if (!z) {
                this.hasScrollingToTop = true;
            }
            if (z && this.f126904d.findLastCompletelyVisibleItemPosition() == 7 && !this.pullUpDisable && this.hasScrollingToTop) {
                this.f126905e.m148988q().m42747J0(new d30() { // from class: l.n920
                    @Override // p149l.d30
                    public final void call() {
                        l920.C18173c.m148998b(this.f137717a, recyclerView);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.l920$d */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, m87232d2 = {"l/l920$d", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "a", "I", "SCROLL_ITEM_COUNT", "", "b", "Z", "isScrollingToBottom", "c", "pullUpDisable", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18174d extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int SCROLL_ITEM_COUNT = 10;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f126909d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ l920 f126910e;

        public C18174d(GridLayoutManager gridLayoutManager, l920 l920Var) {
            this.f126909d = gridLayoutManager;
            this.f126910e = l920Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindLastVisibleItemPosition = this.f126909d.findLastVisibleItemPosition();
                if (this.isScrollingToBottom && !this.pullUpDisable && iFindLastVisibleItemPosition == this.SCROLL_ITEM_COUNT - 1) {
                    if (xma.m210049N3()) {
                        return;
                    }
                    this.pullUpDisable = true;
                    this.f126910e.m148988q().m42744G0();
                    return;
                }
                int childCount = this.f126909d.getChildCount();
                if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f126909d.getItemCount() - 1 || this.f126909d.getItemCount() < childCount || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1) || xma.m210049N3()) {
                    return;
                }
                this.pullUpDisable = true;
                this.f126910e.m148988q().m42744G0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            boolean z = dy > 0;
            this.isScrollingToBottom = z;
            if (z) {
                return;
            }
            this.pullUpDisable = false;
        }
    }

    public l920(@NotNull NearbyFrag nearbyFrag) {
        nearbyFrag.getClass();
        this.frag = nearbyFrag;
        this.showingRadar = C22392a.m221513c(Boolean.TRUE);
        Act act = nearbyFrag.act();
        act.getClass();
        this.act = act;
        this.hideNavigation = true;
    }

    /* JADX INFO: renamed from: G */
    private final void m148954G() {
        xdl0.m208329E0(m148995z(), new View.OnClickListener() { // from class: l.f920
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l920.m148965j(this.f96442a, view);
            }
        });
        xdl0.m208329E0(m148971F(), new View.OnClickListener() { // from class: l.g920
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l920.m148962e(this.f101540a, view);
            }
        });
        xdl0.m208329E0(m148990u(), new View.OnClickListener() { // from class: l.h920
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l920.m148960a(this.f106509a, view);
            }
        });
        this.frag.m42705Y4().m129871N(new C18171a());
    }

    /* JADX INFO: renamed from: H */
    public static final void m148955H(l920 l920Var, PurchaseType purchaseType) {
        l920Var.m148988q().m42751Q0();
    }

    /* JADX INFO: renamed from: I */
    public static final void m148956I(l920 l920Var, PurchaseType purchaseType) {
        l920Var.m148988q().m42751Q0();
    }

    /* JADX INFO: renamed from: J */
    private final void m148957J() {
        m148992w().setTitle("附近的人");
        m148992w().setLeftIconAsBack(this.act);
        m148992w().setLeftIconResource(b3c0.f73010b);
        m148992w().setRightIconClip(false);
        xdl0.m208344M(m148992w(), !this.hideNavigation);
    }

    /* JADX INFO: renamed from: L */
    private final void m148958L() {
        VPullDownRefreshLayout vPullDownRefreshLayoutM148993x = m148993x();
        vPullDownRefreshLayoutM148993x.m223757I(true);
        vPullDownRefreshLayoutM148993x.m223755G(false);
        vPullDownRefreshLayoutM148993x.mo223159O(new df50() { // from class: l.e920
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                l920.m148959M(this.f89917a, hnc0Var);
            }
        });
        RecyclerView recyclerViewM148991v = m148991v();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 2);
        gridLayoutManager.m3326v(new C18172b(gridLayoutManager));
        if (CoreModule.m29935P().m94656g().mo35017Ki()) {
            recyclerViewM148991v.addOnScrollListener(new C18173c(gridLayoutManager, this));
        } else {
            recyclerViewM148991v.addOnScrollListener(new C18174d(gridLayoutManager, this));
        }
        recyclerViewM148991v.setLayoutManager(gridLayoutManager);
        recyclerViewM148991v.setAdapter(this.frag.m42705Y4());
        new C0605k(new c820(this)).m3750g(recyclerViewM148991v);
    }

    /* JADX INFO: renamed from: M */
    public static final void m148959M(l920 l920Var, hnc0 hnc0Var) {
        hnc0Var.getClass();
        l920Var.m148988q().m42746I0(null, true);
    }

    /* JADX INFO: renamed from: a */
    public static void m148960a(final l920 l920Var, View view) {
        zvf0.m220396r("e_supremepartner_apply", "p_suggest_nearby");
        if (CoreModule.m29935P().m94656g().mo35004D9()) {
            CoreModule.m29935P().m94651a().mo33572qm(l920Var.act, l920Var.m148988q().m42749O0(), Privilege.nearby_people, new e30() { // from class: l.i920
                @Override // p149l.e30
                public final void call(Object obj) {
                    l920.m148955H(this.f112097a, (PurchaseType) obj);
                }
            });
        } else if (CoreModule.m29935P().m94656g().mo35050bg()) {
            CoreModule.m29935P().m94656g().mo35006Ds(l920Var.act, l920Var.m148988q().m42749O0(), Privilege.nearby_people, new e30() { // from class: l.j920
                @Override // p149l.e30
                public final void call(Object obj) {
                    l920.m148956I(this.f116838a, (PurchaseType) obj);
                }
            }, null);
        } else {
            l920Var.m148988q().m42744G0();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m148962e(l920 l920Var, View view) {
        l920Var.m148988q().m42745H0();
    }

    /* JADX INFO: renamed from: j */
    public static void m148965j(l920 l920Var, View view) {
        l920Var.m148988q().m42751Q0();
    }

    /* JADX INFO: renamed from: r */
    private final void m148966r() {
        m148957J();
        m148972K();
        m148958L();
        m148954G();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final RelativeLayout m148967A() {
        RelativeLayout relativeLayout = this._rl_loading;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_rl_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VText m148968B() {
        VText vText = this._rl_loading_describe;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_rl_loading_describe");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VDraweeView m148969C() {
        VDraweeView vDraweeView = this._rl_loading_radar_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_rl_loading_radar_image");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final RadarRipple m148970E() {
        RadarRipple radarRipple = this._rl_loading_radar_ripple;
        if (radarRipple != null) {
            return radarRipple;
        }
        Intrinsics.m87502r("_rl_loading_radar_ripple");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VButton m148971F() {
        VButton vButton = this._rl_loading_setting;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_rl_loading_setting");
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m148972K() {
        m148970E().setRadarColor(App.f15369e.getResources().getColor(z0c0.f200976d));
        this.radarAnimator = oey.m164039b(m148970E(), m148969C());
        xdl0.m208344M(m148989s(), false);
        xdl0.m208344M(m148994y(), false);
        xdl0.m208344M(m148967A(), true);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m148973N() {
        return this._rl_loading != null;
    }

    /* JADX INFO: renamed from: O */
    public final void m148974O() {
        Animator animator;
        if (m148967A().getVisibility() == 0 && this.showingRadar.m221515e().booleanValue() && (animator = this.radarAnimator) != null) {
            animator.start();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m148975P() {
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m148976Q(@NotNull List<? extends User> list, boolean hasPrivilege) {
        list.getClass();
        this.hasPrivilege = hasPrivilege;
        if (hasPrivilege) {
            VPullUpRecyclerView vPullUpRecyclerViewM148991v = m148991v();
            int i = t100.f167256e;
            vPullUpRecyclerViewM148991v.setPadding(i, i, i, t100.f167268q);
        } else {
            VPullUpRecyclerView vPullUpRecyclerViewM148991v2 = m148991v();
            int i2 = t100.f167256e;
            vPullUpRecyclerViewM148991v2.setPadding(i2, i2, i2, t100.f167236K);
        }
        this.showingRadar.onNext(Boolean.FALSE);
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (CoreModule.m29935P().m94656g().mo35050bg()) {
            m148990u().setText("成为白金会员");
            m148990u().setTextColor(-1);
            m148990u().setBackgroundResource(b3c0.f73050g);
            xdl0.m208344M(m148990u(), !hasPrivilege);
        } else if (CoreModule.m29935P().m94656g().mo35004D9()) {
            m148990u().setText(this.frag.getText(R$string.f20566B));
            m148990u().setTextColor(-1);
            m148990u().setBackgroundResource(b3c0.f72826A5);
            xdl0.m208344M(m148990u(), !hasPrivilege);
        } else {
            xdl0.m208344M(m148990u(), !hasPrivilege);
            if (!hasPrivilege) {
                zvf0.m220402x("e_supremepartner_apply", "p_suggest_nearby");
            }
        }
        xdl0.m208344M(m148989s(), true);
        xdl0.m208344M(m148967A(), false);
        xdl0.m208344M(m148994y(), false);
        this.frag.m42705Y4().m129870M(list, hasPrivilege);
    }

    /* JADX INFO: renamed from: R */
    public final void m148977R() {
        xdl0.m208344M(m148967A(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m148974O();
        m148968B().setText("正在努力帮您寻找附近的人...");
        m148971F().setVisibility(4);
        xdl0.m208344M(m148994y(), false);
        xdl0.m208344M(m148989s(), false);
    }

    /* JADX INFO: renamed from: S */
    public final void m148978S() {
        this.showingRadar.onNext(Boolean.FALSE);
        xdl0.m208344M(m148967A(), false);
        xdl0.m208344M(m148994y(), true);
        xdl0.m208344M(m148989s(), false);
    }

    /* JADX INFO: renamed from: T */
    public final void m148979T() {
        this.showingRadar.onNext(Boolean.TRUE);
        xdl0.m208344M(m148989s(), false);
        xdl0.m208344M(m148994y(), false);
        xdl0.m208344M(m148967A(), true);
        m148974O();
        m148968B().setText("正在努力帮您寻找附近的人...");
        m148971F().setVisibility(4);
    }

    /* JADX INFO: renamed from: U */
    public final void m148980U() {
        xdl0.m208344M(m148967A(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m148968B().setText("当前无法获取您的位置信息， \n请在手机设置中打开");
        m148971F().setVisibility(0);
        xdl0.m208344M(m148994y(), false);
        xdl0.m208344M(m148989s(), false);
    }

    /* JADX INFO: renamed from: V */
    public final void m148981V(@NotNull Picture p) {
        p.getClass();
        qib0.f154691G.m102312B0(m148969C(), p.profile480());
    }

    /* JADX INFO: renamed from: W */
    public final void m148982W(boolean z) {
        this.hideNavigation = z;
    }

    /* JADX INFO: renamed from: X */
    public final void m148983X(@NotNull NearbyPresenter nearbyPresenter) {
        nearbyPresenter.getClass();
        this.nearbyPresenter = nearbyPresenter;
    }

    @Override // p149l.c820.InterfaceC16092a
    /* JADX INFO: renamed from: b */
    public void mo105647b(@NotNull User clickedUser, boolean liked) {
        clickedUser.getClass();
        m148988q().m42741E(clickedUser, liked, false);
    }

    @Override // p149l.c820.InterfaceC16092a
    /* JADX INFO: renamed from: c */
    public void mo105648c(boolean liked) {
        NearbyPresenter.m42718L0(m148988q(), null, 1, null);
        this.frag.m42705Y4().notifyDataSetChanged();
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM148984k = m148984k(inflater, parent);
        m148966r();
        return viewM148984k;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m148984k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM163197b = o920.m163197b(this, inflater, parent);
        viewM163197b.getClass();
        return viewM163197b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull NearbyPresenter presenter) {
        presenter.getClass();
        m148983X(presenter);
    }

    /* JADX INFO: renamed from: m */
    public final void m148986m() {
        m148993x().m223775t();
    }

    @Override // p149l.c820.InterfaceC16092a
    /* JADX INFO: renamed from: n */
    public boolean mo105649n() {
        return !this.hasPrivilege;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final NearbyFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final NearbyPresenter m148988q() {
        NearbyPresenter nearbyPresenter = this.nearbyPresenter;
        if (nearbyPresenter != null) {
            return nearbyPresenter;
        }
        Intrinsics.m87502r("nearbyPresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final FrameLayout m148989s() {
        FrameLayout frameLayout = this._fl_content_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_fl_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final TextView m148990u() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VPullUpRecyclerView m148991v() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VNavigationBar m148992w() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VPullDownRefreshLayout m148993x() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.m87502r("_refresh");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final RelativeLayout m148994y() {
        RelativeLayout relativeLayout = this._rl_error_view;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_rl_error_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VButton m148995z() {
        VButton vButton = this._rl_error_view_reload;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_rl_error_view_reload");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
