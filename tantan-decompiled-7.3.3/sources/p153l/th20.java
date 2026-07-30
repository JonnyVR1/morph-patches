package p153l;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.nearby.NearbyFrag;
import com.p051p1.mobile.putong.core.newui.nearby.NearbyPresenter;
import com.p051p1.mobile.putong.core.newui.view.RadarRipple;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame_Squared;
import p151v.VImage;
import p151v.VPullDownRefreshLayout;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\nJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\nJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\nJ\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J#\u0010)\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\nJ\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\nJ\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\b2\u0006\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020'H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\b2\u0006\u00101\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020'H\u0016¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020'¢\u0006\u0004\b8\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b!\u0010;R\"\u0010B\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010D\u001a\u0004\bs\u0010F\"\u0004\bt\u0010HR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R#\u0010\u0080\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010d\u001a\u0004\b~\u0010f\"\u0004\b\u007f\u0010hR%\u0010\u0083\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u0016\u0010l\u001a\u0005\b\u0081\u0001\u0010n\"\u0005\b\u0082\u0001\u0010pR)\u0010\u008a\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b+\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R)\u0010\u0091\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b6\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R)\u0010 \u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b!\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R(\u0010¥\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b¡\u0001\u0010£\u0001\"\u0005\b¤\u0001\u0010\u0017RQ\u0010\u00ad\u0001\u001a+\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010'0' §\u0001*\u0014\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010'0'\u0018\u00010¦\u00010¦\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\t\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010¯\u0001R\u001d\u0010¶\u0001\u001a\u00030±\u00018\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R&\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u009c\u0001\u0010·\u0001\u001a\u0005\b¸\u0001\u00107\"\u0005\b¹\u0001\u00105R'\u0010¼\u0001\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0095\u0001\u0010·\u0001\u001a\u0005\bº\u0001\u00107\"\u0005\b»\u0001\u00105¨\u0006½\u0001"}, m88121d2 = {"Ll/th20;", "Ll/iam;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "Ll/kg20$a;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;)V", "", "r", "()V", "J", "G", "L", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;)V", "inflateView", "K", p7f.GPS_DIRECTION_TRUE, "R", "U", p7f.LATITUDE_SOUTH, BloodType.f39576O, "P", "Lcom/p1/mobile/putong/data/Picture;", "p", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/putong/data/Picture;)V", "", "Lcom/p1/mobile/putong/data/User;", "list", "", "hasPrivilege", "Q", "(Ljava/util/List;Z)V", "m", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "clickedUser", "liked", "b", "(Lcom/p1/mobile/putong/data/User;Z)V", "c", "(Z)V", "n", "()Z", "N", "a", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "Lv/navigationbar/VNavigationBar;", "Lv/navigationbar/VNavigationBar;", "w", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "A", "()Landroid/widget/RelativeLayout;", "set_rl_loading", "(Landroid/widget/RelativeLayout;)V", "_rl_loading", "Lv/VFrame_Squared;", Constants.INAPP_DATA_TAG, "Lv/VFrame_Squared;", "get_rl_loading_radar", "()Lv/VFrame_Squared;", "set_rl_loading_radar", "(Lv/VFrame_Squared;)V", "_rl_loading_radar", "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "e", "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "E", "()Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "set_rl_loading_radar_ripple", "(Lcom/p1/mobile/putong/core/newui/view/RadarRipple;)V", "_rl_loading_radar_ripple", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", c4s.C_ZONE, "()Lv/VDraweeView;", "set_rl_loading_radar_image", "(Lv/VDraweeView;)V", "_rl_loading_radar_image", "Lv/VText;", "g", "Lv/VText;", "B", "()Lv/VText;", "set_rl_loading_describe", "(Lv/VText;)V", "_rl_loading_describe", "Lv/VButton;", "h", "Lv/VButton;", "F", "()Lv/VButton;", "set_rl_loading_setting", "(Lv/VButton;)V", "_rl_loading_setting", RXScreenCaptureService.KEY_INDEX, BaseSei.f14625Y, "set_rl_error_view", "_rl_error_view", "Lv/VImage;", "j", "Lv/VImage;", "get_rl_error_view_img_network_error", "()Lv/VImage;", "set_rl_error_view_img_network_error", "(Lv/VImage;)V", "_rl_error_view_img_network_error", "get_rl_error_view_tv_network_tips", "set_rl_error_view_tv_network_tips", "_rl_error_view_tv_network_tips", BaseSei.f14626Z, "set_rl_error_view_reload", "_rl_error_view_reload", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", BLiveStormDanmakuGiftResourceType.f45294s, "()Landroid/widget/FrameLayout;", "set_fl_content_layout", "(Landroid/widget/FrameLayout;)V", "_fl_content_layout", "Lv/VPullDownRefreshLayout;", "Lv/VPullDownRefreshLayout;", BaseSei.f14624X, "()Lv/VPullDownRefreshLayout;", "set_refresh", "(Lv/VPullDownRefreshLayout;)V", "_refresh", "Lv/VPullUpRecyclerView;", "o", "Lv/VPullUpRecyclerView;", ResourceDirection.f39656v, "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "u", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "q", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "X", "nearbyPresenter", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "Lrx/subjects/a;", "getShowingRadar", "()Lrx/subjects/a;", "setShowingRadar", "(Lrx/subjects/a;)V", "showingRadar", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "radarAnimator", "Lcom/p1/mobile/android/app/Act;", Constants.KEY_T, "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Z", "getHasPrivilege", "setHasPrivilege", "getHideNavigation", "W", "hideNavigation", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class th20 implements iam<NearbyPresenter>, kg20.InterfaceC18162a {

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
    public C22507a<Boolean> showingRadar;

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

    /* JADX INFO: renamed from: l.th20$a */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m88121d2 = {"l/th20$a", "Ll/pg20$b;", "Lcom/p1/mobile/putong/data/User;", "user", "", Constants.INAPP_POSITION, "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "b", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20313a implements pg20.InterfaceC19364b {
        public C20313a() {
        }

        /* JADX INFO: renamed from: c */
        public static void m191204c(User user, th20 th20Var) {
            CoreModule.f18264c.f20407m2.m123967s3(user);
            th20Var.getFrag().m43716Y4().m172208L(user);
            if (jyb.m147479J(th20Var.getFrag().m43716Y4().m172207K())) {
                th20Var.m191196q().m43762Q0();
            }
        }

        @Override // p153l.pg20.InterfaceC19364b
        /* JADX INFO: renamed from: a */
        public void mo172211a(User user, int pos) {
            user.getClass();
            th20.this.m191196q().m43763z0(user);
        }

        @Override // p153l.pg20.InterfaceC19364b
        /* JADX INFO: renamed from: b */
        public void mo172212b(final User user, int pos) {
            user.getClass();
            i4g0.m138520r("e_odiamond_sayhi", th20.this.getFrag().pageId());
            CoreBusinessService coreBusinessServiceM143405a = CoreModule.f18273l.m143405a();
            Act act = th20.this.getAct();
            String strM43761P0 = th20.this.m191196q().m43761P0();
            final th20 th20Var = th20.this;
            coreBusinessServiceM143405a.mo34308Dl(act, user, strM43761P0, new x20() { // from class: l.sh20
                @Override // p153l.x20
                public final void call() {
                    th20.C20313a.m191204c(user, th20Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.th20$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"l/th20$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20314b extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f174249b;

        public C20314b(GridLayoutManager gridLayoutManager) {
            this.f174249b = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            if (th20.this.getFrag().m43716Y4().getItemViewType(position) == 2) {
                return this.f174249b.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.th20$c */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, m88121d2 = {"l/th20$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isScrollingToBottom", "b", "pullUpDisable", "c", "hasScrollingToTop", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20315c extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean hasScrollingToTop = true;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f174253d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ th20 f174254e;

        public C20315c(GridLayoutManager gridLayoutManager, th20 th20Var) {
            this.f174253d = gridLayoutManager;
            this.f174254e = th20Var;
        }

        /* JADX INFO: renamed from: a */
        public static void m191205a(C20315c c20315c) {
            c20315c.pullUpDisable = true;
        }

        /* JADX INFO: renamed from: b */
        public static void m191206b(C20315c c20315c, RecyclerView recyclerView) {
            c20315c.pullUpDisable = true;
            c20315c.hasScrollingToTop = false;
            recyclerView.stopScroll();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
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
            int iFindLastVisibleItemPosition = this.f174253d.findLastVisibleItemPosition();
            int childCount = this.f174253d.getChildCount();
            if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f174253d.getItemCount() - 1 || this.f174253d.getItemCount() < childCount || !this.hasScrollingToTop || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1)) {
                return;
            }
            this.f174254e.m191196q().m43758J0(new x20() { // from class: l.uh20
                @Override // p153l.x20
                public final void call() {
                    th20.C20315c.m191205a(this.f178984a);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(final RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            boolean z = dy > 0;
            this.isScrollingToBottom = z;
            if (!z) {
                this.hasScrollingToTop = true;
            }
            if (z && this.f174253d.findLastCompletelyVisibleItemPosition() == 7 && !this.pullUpDisable && this.hasScrollingToTop) {
                this.f174254e.m191196q().m43758J0(new x20() { // from class: l.vh20
                    @Override // p153l.x20
                    public final void call() {
                        th20.C20315c.m191206b(this.f184074a, recyclerView);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.th20$d */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, m88121d2 = {"l/th20$d", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "a", "I", "SCROLL_ITEM_COUNT", "", "b", "Z", "isScrollingToBottom", "c", "pullUpDisable", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20316d extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int SCROLL_ITEM_COUNT = 10;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f174258d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ th20 f174259e;

        public C20316d(GridLayoutManager gridLayoutManager, th20 th20Var) {
            this.f174258d = gridLayoutManager;
            this.f174259e = th20Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindLastVisibleItemPosition = this.f174258d.findLastVisibleItemPosition();
                if (this.isScrollingToBottom && !this.pullUpDisable && iFindLastVisibleItemPosition == this.SCROLL_ITEM_COUNT - 1) {
                    if (joa.m146363O3()) {
                        return;
                    }
                    this.pullUpDisable = true;
                    this.f174259e.m191196q().m43755G0();
                    return;
                }
                int childCount = this.f174258d.getChildCount();
                if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f174258d.getItemCount() - 1 || this.f174258d.getItemCount() < childCount || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1) || joa.m146363O3()) {
                    return;
                }
                this.pullUpDisable = true;
                this.f174259e.m191196q().m43755G0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
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

    public th20(@NotNull NearbyFrag nearbyFrag) {
        nearbyFrag.getClass();
        this.frag = nearbyFrag;
        this.showingRadar = C22507a.m222759c(Boolean.TRUE);
        Act act = nearbyFrag.act();
        act.getClass();
        this.act = act;
        this.hideNavigation = true;
    }

    /* JADX INFO: renamed from: G */
    private final void m191162G() {
        bnl0.m105509E0(m191203z(), new View.OnClickListener() { // from class: l.nh20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                th20.m191173j(this.f141902a, view);
            }
        });
        bnl0.m105509E0(m191179F(), new View.OnClickListener() { // from class: l.oh20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                th20.m191170e(this.f147334a, view);
            }
        });
        bnl0.m105509E0(m191198u(), new View.OnClickListener() { // from class: l.ph20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                th20.m191168a(this.f152391a, view);
            }
        });
        this.frag.m43716Y4().m172210N(new C20313a());
    }

    /* JADX INFO: renamed from: H */
    public static final void m191163H(th20 th20Var, PurchaseType purchaseType) {
        th20Var.m191196q().m43762Q0();
    }

    /* JADX INFO: renamed from: I */
    public static final void m191164I(th20 th20Var, PurchaseType purchaseType) {
        th20Var.m191196q().m43762Q0();
    }

    /* JADX INFO: renamed from: J */
    private final void m191165J() {
        m191200w().setTitle("附近的人");
        m191200w().setLeftIconAsBack(this.act);
        m191200w().setLeftIconResource(gbc0.f103261b);
        m191200w().setRightIconClip(false);
        bnl0.m105524M(m191200w(), !this.hideNavigation);
    }

    /* JADX INFO: renamed from: L */
    private final void m191166L() {
        VPullDownRefreshLayout vPullDownRefreshLayoutM191201x = m191201x();
        vPullDownRefreshLayoutM191201x.m225003I(true);
        vPullDownRefreshLayoutM191201x.m225001G(false);
        vPullDownRefreshLayoutM191201x.mo224405O(new jn50() { // from class: l.mh20
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                th20.m191167M(this.f136817a, mvc0Var);
            }
        });
        RecyclerView recyclerViewM191199v = m191199v();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 2);
        gridLayoutManager.m3327v(new C20314b(gridLayoutManager));
        if (CoreModule.m30933P().m143410g().mo36020Ki()) {
            recyclerViewM191199v.addOnScrollListener(new C20315c(gridLayoutManager, this));
        } else {
            recyclerViewM191199v.addOnScrollListener(new C20316d(gridLayoutManager, this));
        }
        recyclerViewM191199v.setLayoutManager(gridLayoutManager);
        recyclerViewM191199v.setAdapter(this.frag.m43716Y4());
        new C0607k(new kg20(this)).m3751g(recyclerViewM191199v);
    }

    /* JADX INFO: renamed from: M */
    public static final void m191167M(th20 th20Var, mvc0 mvc0Var) {
        mvc0Var.getClass();
        th20Var.m191196q().m43757I0(null, true);
    }

    /* JADX INFO: renamed from: a */
    public static void m191168a(final th20 th20Var, View view) {
        i4g0.m138520r("e_supremepartner_apply", "p_suggest_nearby");
        if (CoreModule.m30933P().m143410g().mo36007D9()) {
            CoreModule.m30933P().m143405a().mo34575qm(th20Var.act, th20Var.m191196q().m43760O0(), Privilege.nearby_people, new y20() { // from class: l.qh20
                @Override // p153l.y20
                public final void call(Object obj) {
                    th20.m191163H(this.f157502a, (PurchaseType) obj);
                }
            });
        } else if (CoreModule.m30933P().m143410g().mo36053bg()) {
            CoreModule.m30933P().m143410g().mo36009Ds(th20Var.act, th20Var.m191196q().m43760O0(), Privilege.nearby_people, new y20() { // from class: l.rh20
                @Override // p153l.y20
                public final void call(Object obj) {
                    th20.m191164I(this.f163072a, (PurchaseType) obj);
                }
            }, null);
        } else {
            th20Var.m191196q().m43755G0();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m191170e(th20 th20Var, View view) {
        th20Var.m191196q().m43756H0();
    }

    /* JADX INFO: renamed from: j */
    public static void m191173j(th20 th20Var, View view) {
        th20Var.m191196q().m43762Q0();
    }

    /* JADX INFO: renamed from: r */
    private final void m191174r() {
        m191165J();
        m191180K();
        m191166L();
        m191162G();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final RelativeLayout m191175A() {
        RelativeLayout relativeLayout = this._rl_loading;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_rl_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VText m191176B() {
        VText vText = this._rl_loading_describe;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_rl_loading_describe");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VDraweeView m191177C() {
        VDraweeView vDraweeView = this._rl_loading_radar_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_rl_loading_radar_image");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final RadarRipple m191178E() {
        RadarRipple radarRipple = this._rl_loading_radar_ripple;
        if (radarRipple != null) {
            return radarRipple;
        }
        Intrinsics.m88391r("_rl_loading_radar_ripple");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VButton m191179F() {
        VButton vButton = this._rl_loading_setting;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_rl_loading_setting");
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m191180K() {
        m191178E().setRadarColor(App.f16088e.getResources().getColor(f9c0.f97859d));
        this.radarAnimator = lny.m155033b(m191178E(), m191177C());
        bnl0.m105524M(m191197s(), false);
        bnl0.m105524M(m191202y(), false);
        bnl0.m105524M(m191175A(), true);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m191181N() {
        return this._rl_loading != null;
    }

    /* JADX INFO: renamed from: O */
    public final void m191182O() {
        Animator animator;
        if (m191175A().getVisibility() == 0 && this.showingRadar.m222761e().booleanValue() && (animator = this.radarAnimator) != null) {
            animator.start();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m191183P() {
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m191184Q(@NotNull List<? extends User> list, boolean hasPrivilege) {
        list.getClass();
        this.hasPrivilege = hasPrivilege;
        if (hasPrivilege) {
            VPullUpRecyclerView vPullUpRecyclerViewM191199v = m191199v();
            int i = qa00.f156318e;
            vPullUpRecyclerViewM191199v.setPadding(i, i, i, qa00.f156330q);
        } else {
            VPullUpRecyclerView vPullUpRecyclerViewM191199v2 = m191199v();
            int i2 = qa00.f156318e;
            vPullUpRecyclerViewM191199v2.setPadding(i2, i2, i2, qa00.f156298K);
        }
        this.showingRadar.onNext(Boolean.FALSE);
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (CoreModule.m30933P().m143410g().mo36053bg()) {
            m191198u().setText("成为白金会员");
            m191198u().setTextColor(-1);
            m191198u().setBackgroundResource(gbc0.f103301g);
            bnl0.m105524M(m191198u(), !hasPrivilege);
        } else if (CoreModule.m30933P().m143410g().mo36007D9()) {
            m191198u().setText(this.frag.getText(R$string.f21308B));
            m191198u().setTextColor(-1);
            m191198u().setBackgroundResource(gbc0.f103077A5);
            bnl0.m105524M(m191198u(), !hasPrivilege);
        } else {
            bnl0.m105524M(m191198u(), !hasPrivilege);
            if (!hasPrivilege) {
                i4g0.m138526x("e_supremepartner_apply", "p_suggest_nearby");
            }
        }
        bnl0.m105524M(m191197s(), true);
        bnl0.m105524M(m191175A(), false);
        bnl0.m105524M(m191202y(), false);
        this.frag.m43716Y4().m172209M(list, hasPrivilege);
    }

    /* JADX INFO: renamed from: R */
    public final void m191185R() {
        bnl0.m105524M(m191175A(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m191182O();
        m191176B().setText("正在努力帮您寻找附近的人...");
        m191179F().setVisibility(4);
        bnl0.m105524M(m191202y(), false);
        bnl0.m105524M(m191197s(), false);
    }

    /* JADX INFO: renamed from: S */
    public final void m191186S() {
        this.showingRadar.onNext(Boolean.FALSE);
        bnl0.m105524M(m191175A(), false);
        bnl0.m105524M(m191202y(), true);
        bnl0.m105524M(m191197s(), false);
    }

    /* JADX INFO: renamed from: T */
    public final void m191187T() {
        this.showingRadar.onNext(Boolean.TRUE);
        bnl0.m105524M(m191197s(), false);
        bnl0.m105524M(m191202y(), false);
        bnl0.m105524M(m191175A(), true);
        m191182O();
        m191176B().setText("正在努力帮您寻找附近的人...");
        m191179F().setVisibility(4);
    }

    /* JADX INFO: renamed from: U */
    public final void m191188U() {
        bnl0.m105524M(m191175A(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m191176B().setText("当前无法获取您的位置信息， \n请在手机设置中打开");
        m191179F().setVisibility(0);
        bnl0.m105524M(m191202y(), false);
        bnl0.m105524M(m191197s(), false);
    }

    /* JADX INFO: renamed from: V */
    public final void m191189V(@NotNull Picture p) {
        p.getClass();
        uqb0.f180374G.m127096B0(m191177C(), p.profile480());
    }

    /* JADX INFO: renamed from: W */
    public final void m191190W(boolean z) {
        this.hideNavigation = z;
    }

    /* JADX INFO: renamed from: X */
    public final void m191191X(@NotNull NearbyPresenter nearbyPresenter) {
        nearbyPresenter.getClass();
        this.nearbyPresenter = nearbyPresenter;
    }

    @Override // p153l.kg20.InterfaceC18162a
    /* JADX INFO: renamed from: b */
    public void mo149732b(@NotNull User clickedUser, boolean liked) {
        clickedUser.getClass();
        m191196q().m43752E(clickedUser, liked, false);
    }

    @Override // p153l.kg20.InterfaceC18162a
    /* JADX INFO: renamed from: c */
    public void mo149733c(boolean liked) {
        NearbyPresenter.m43729L0(m191196q(), null, 1, null);
        this.frag.m43716Y4().notifyDataSetChanged();
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM191192k = m191192k(inflater, parent);
        m191174r();
        return viewM191192k;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m191192k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM206332b = wh20.m206332b(this, inflater, parent);
        viewM206332b.getClass();
        return viewM206332b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull NearbyPresenter presenter) {
        presenter.getClass();
        m191191X(presenter);
    }

    /* JADX INFO: renamed from: m */
    public final void m191194m() {
        m191201x().m225021t();
    }

    @Override // p153l.kg20.InterfaceC18162a
    /* JADX INFO: renamed from: n */
    public boolean mo149734n() {
        return !this.hasPrivilege;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final NearbyFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final NearbyPresenter m191196q() {
        NearbyPresenter nearbyPresenter = this.nearbyPresenter;
        if (nearbyPresenter != null) {
            return nearbyPresenter;
        }
        Intrinsics.m88391r("nearbyPresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final FrameLayout m191197s() {
        FrameLayout frameLayout = this._fl_content_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_fl_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final TextView m191198u() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VPullUpRecyclerView m191199v() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VNavigationBar m191200w() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VPullDownRefreshLayout m191201x() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.m88391r("_refresh");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final RelativeLayout m191202y() {
        RelativeLayout relativeLayout = this._rl_error_view;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_rl_error_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VButton m191203z() {
        VButton vButton = this._rl_error_view_reload;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_rl_error_view_reload");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
