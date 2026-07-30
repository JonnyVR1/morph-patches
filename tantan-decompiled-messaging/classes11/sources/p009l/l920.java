package p009l;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.newui.nearby.NearbyFrag;
import com.p000p1.mobile.putong.core.newui.nearby.NearbyPresenter;
import com.p000p1.mobile.putong.core.newui.view.RadarRipple;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.b3c0;
import l.d30;
import l.df50;
import l.e30;
import l.hnc0;
import l.o920;
import l.oey;
import l.qib0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xma;
import l.z0c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.subjects.a;
import v.VButton;
import v.VDraweeView;
import v.VFrame_Squared;
import v.VImage;
import v.VPullDownRefreshLayout;
import v.VPullUpRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\nJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\nJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\nJ\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J#\u0010)\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\nJ\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\nJ\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\b2\u0006\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020'H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\b2\u0006\u00101\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020'H\u0016¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020'¢\u0006\u0004\b8\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b!\u0010;R\"\u0010B\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010D\u001a\u0004\bs\u0010F\"\u0004\bt\u0010HR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R#\u0010\u0080\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010d\u001a\u0004\b~\u0010f\"\u0004\b\u007f\u0010hR%\u0010\u0083\u0001\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u0016\u0010l\u001a\u0005\b\u0081\u0001\u0010n\"\u0005\b\u0082\u0001\u0010pR)\u0010\u008a\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b+\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R)\u0010\u0091\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b6\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R)\u0010 \u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b!\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R(\u0010¥\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b¡\u0001\u0010£\u0001\"\u0005\b¤\u0001\u0010\u0017RQ\u0010\u00ad\u0001\u001a+\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010'0' §\u0001*\u0014\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010'0'\u0018\u00010¦\u00010¦\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\t\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010¯\u0001R\u001d\u0010¶\u0001\u001a\u00030±\u00018\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R&\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u009c\u0001\u0010·\u0001\u001a\u0005\b¸\u0001\u00107\"\u0005\b¹\u0001\u00105R'\u0010¼\u0001\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0095\u0001\u0010·\u0001\u001a\u0005\bº\u0001\u00107\"\u0005\b»\u0001\u00105¨\u0006½\u0001"}, d2 = {"Ll/l920;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "Ll/c820$a;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;)V", "", "r", "()V", "J", "G", "L", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "l", "(Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;)V", "inflateView", "K", "T", "R", "U", "S", "O", "P", "Lcom/p1/mobile/putong/data/Picture;", "p", "V", "(Lcom/p1/mobile/putong/data/Picture;)V", "", "Lcom/p1/mobile/putong/data/User;", "list", "", "hasPrivilege", "Q", "(Ljava/util/List;Z)V", "m", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "clickedUser", "liked", "b", "(Lcom/p1/mobile/putong/data/User;Z)V", "c", "(Z)V", "n", "()Z", "N", "a", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "Lv/navigationbar/VNavigationBar;", "Lv/navigationbar/VNavigationBar;", "w", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "A", "()Landroid/widget/RelativeLayout;", "set_rl_loading", "(Landroid/widget/RelativeLayout;)V", "_rl_loading", "Lv/VFrame_Squared;", "d", "Lv/VFrame_Squared;", "get_rl_loading_radar", "()Lv/VFrame_Squared;", "set_rl_loading_radar", "(Lv/VFrame_Squared;)V", "_rl_loading_radar", "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "e", "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "E", "()Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "set_rl_loading_radar_ripple", "(Lcom/p1/mobile/putong/core/newui/view/RadarRipple;)V", "_rl_loading_radar_ripple", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", "C", "()Lv/VDraweeView;", "set_rl_loading_radar_image", "(Lv/VDraweeView;)V", "_rl_loading_radar_image", "Lv/VText;", "g", "Lv/VText;", "B", "()Lv/VText;", "set_rl_loading_describe", "(Lv/VText;)V", "_rl_loading_describe", "Lv/VButton;", "h", "Lv/VButton;", "F", "()Lv/VButton;", "set_rl_loading_setting", "(Lv/VButton;)V", "_rl_loading_setting", "i", "y", "set_rl_error_view", "_rl_error_view", "Lv/VImage;", "j", "Lv/VImage;", "get_rl_error_view_img_network_error", "()Lv/VImage;", "set_rl_error_view_img_network_error", "(Lv/VImage;)V", "_rl_error_view_img_network_error", "get_rl_error_view_tv_network_tips", "set_rl_error_view_tv_network_tips", "_rl_error_view_tv_network_tips", "z", "set_rl_error_view_reload", "_rl_error_view_reload", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "s", "()Landroid/widget/FrameLayout;", "set_fl_content_layout", "(Landroid/widget/FrameLayout;)V", "_fl_content_layout", "Lv/VPullDownRefreshLayout;", "Lv/VPullDownRefreshLayout;", "x", "()Lv/VPullDownRefreshLayout;", "set_refresh", "(Lv/VPullDownRefreshLayout;)V", "_refresh", "Lv/VPullUpRecyclerView;", "o", "Lv/VPullUpRecyclerView;", "v", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "u", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "q", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "X", "nearbyPresenter", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "Lrx/subjects/a;", "getShowingRadar", "()Lrx/subjects/a;", "setShowingRadar", "(Lrx/subjects/a;)V", "showingRadar", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "radarAnimator", "Lcom/p1/mobile/android/app/Act;", "t", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "act", "Z", "getHasPrivilege", "setHasPrivilege", "getHideNavigation", "W", "hideNavigation", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l920 implements s7m<NearbyPresenter>, c820.InterfaceC0802a {

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
    public a<Boolean> showingRadar;

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
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"l/l920$a", "Ll/h820$b;", "Lcom/p1/mobile/putong/data/User;", "user", "", "pos", "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "b", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1004a implements h820.InterfaceC0929b {
        public C1004a() {
        }

        /* JADX INFO: renamed from: c */
        public static void m17775c(User user, l920 l920Var) {
            CoreModule.c.m2.s3(user);
            l920Var.getFrag().m6873Y4().m15426L(user);
            if (vwb.J(l920Var.getFrag().m6873Y4().m15425K())) {
                l920Var.m17767q().m6922Q0();
            }
        }

        @Override // p009l.h820.InterfaceC0929b
        /* JADX INFO: renamed from: a */
        public void mo15430a(User user, int pos) {
            user.getClass();
            l920.this.m17767q().m6924z0(user);
        }

        @Override // p009l.h820.InterfaceC0929b
        /* JADX INFO: renamed from: b */
        public void mo15431b(final User user, int pos) {
            user.getClass();
            zvf0.r("e_odiamond_sayhi", l920.this.getFrag().pageId());
            CoreBusinessService coreBusinessServiceA = CoreModule.l.a();
            Act act = l920.this.act();
            String strM6921P0 = l920.this.m17767q().m6921P0();
            final l920 l920Var = l920.this;
            coreBusinessServiceA.Dl(act, user, strM6921P0, new d30() { // from class: l.k920
                public final void call() {
                    l920.C1004a.m17775c(user, l920Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.l920$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"l/l920$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1005b extends GridLayoutManager.c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f16015b;

        public C1005b(GridLayoutManager gridLayoutManager) {
            this.f16015b = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m17776f(int position) {
            if (l920.this.getFrag().m6873Y4().getItemViewType(position) == 2) {
                return this.f16015b.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.l920$c */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"l/l920$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isScrollingToBottom", "b", "pullUpDisable", "c", "hasScrollingToTop", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1006c extends RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean hasScrollingToTop = true;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f16019d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ l920 f16020e;

        public C1006c(GridLayoutManager gridLayoutManager, l920 l920Var) {
            this.f16019d = gridLayoutManager;
            this.f16020e = l920Var;
        }

        /* JADX INFO: renamed from: a */
        public static void m17777a(C1006c c1006c) {
            c1006c.pullUpDisable = true;
        }

        /* JADX INFO: renamed from: b */
        public static void m17778b(C1006c c1006c, RecyclerView recyclerView) {
            c1006c.pullUpDisable = true;
            c1006c.hasScrollingToTop = false;
            recyclerView.stopScroll();
        }

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
            int iFindLastVisibleItemPosition = this.f16019d.findLastVisibleItemPosition();
            int childCount = this.f16019d.getChildCount();
            if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f16019d.getItemCount() - 1 || this.f16019d.getItemCount() < childCount || !this.hasScrollingToTop || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1)) {
                return;
            }
            this.f16020e.m17767q().m6918J0(new d30() { // from class: l.m920
                public final void call() {
                    l920.C1006c.m17777a(this.f16759a);
                }
            });
        }

        public void onScrolled(final RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            boolean z = dy > 0;
            this.isScrollingToBottom = z;
            if (!z) {
                this.hasScrollingToTop = true;
            }
            if (z && this.f16019d.findLastCompletelyVisibleItemPosition() == 7 && !this.pullUpDisable && this.hasScrollingToTop) {
                this.f16020e.m17767q().m6918J0(new d30() { // from class: l.n920
                    public final void call() {
                        l920.C1006c.m17778b(this.f17359a, recyclerView);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.l920$d */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"l/l920$d", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "a", "I", "SCROLL_ITEM_COUNT", "", "b", "Z", "isScrollingToBottom", "c", "pullUpDisable", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1007d extends RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int SCROLL_ITEM_COUNT = 10;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f16024d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ l920 f16025e;

        public C1007d(GridLayoutManager gridLayoutManager, l920 l920Var) {
            this.f16024d = gridLayoutManager;
            this.f16025e = l920Var;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindLastVisibleItemPosition = this.f16024d.findLastVisibleItemPosition();
                if (this.isScrollingToBottom && !this.pullUpDisable && iFindLastVisibleItemPosition == this.SCROLL_ITEM_COUNT - 1) {
                    if (xma.N3()) {
                        return;
                    }
                    this.pullUpDisable = true;
                    this.f16025e.m17767q().m6915G0();
                    return;
                }
                int childCount = this.f16024d.getChildCount();
                if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f16024d.getItemCount() - 1 || this.f16024d.getItemCount() < childCount || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1) || xma.N3()) {
                    return;
                }
                this.pullUpDisable = true;
                this.f16025e.m17767q().m6915G0();
            }
        }

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
        this.showingRadar = a.c(Boolean.TRUE);
        Act act = nearbyFrag.act();
        act.getClass();
        this.act = act;
        this.hideNavigation = true;
    }

    /* JADX INFO: renamed from: G */
    private final void m17731G() {
        xdl0.E0(m17774z(), new View.OnClickListener() { // from class: l.f920
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l920.m17742j(this.f12868a, view);
            }
        });
        xdl0.E0(m17749F(), new View.OnClickListener() { // from class: l.g920
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l920.m17739e(this.f13378a, view);
            }
        });
        xdl0.E0(m17769u(), new View.OnClickListener() { // from class: l.h920
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l920.m17737a(this.f13909a, view);
            }
        });
        this.frag.m6873Y4().m15428N(new C1004a());
    }

    /* JADX INFO: renamed from: H */
    public static final void m17732H(l920 l920Var, PurchaseType purchaseType) {
        l920Var.m17767q().m6922Q0();
    }

    /* JADX INFO: renamed from: I */
    public static final void m17733I(l920 l920Var, PurchaseType purchaseType) {
        l920Var.m17767q().m6922Q0();
    }

    /* JADX INFO: renamed from: J */
    private final void m17734J() {
        m17771w().setTitle("附近的人");
        m17771w().setLeftIconAsBack(this.act);
        m17771w().setLeftIconResource(b3c0.b);
        m17771w().setRightIconClip(false);
        xdl0.M(m17771w(), !this.hideNavigation);
    }

    /* JADX INFO: renamed from: L */
    private final void m17735L() {
        VPullDownRefreshLayout vPullDownRefreshLayoutM17772x = m17772x();
        vPullDownRefreshLayoutM17772x.I(true);
        vPullDownRefreshLayoutM17772x.G(false);
        vPullDownRefreshLayoutM17772x.O(new df50() { // from class: l.e920
            /* JADX INFO: renamed from: w2 */
            public final void m13794w2(hnc0 hnc0Var) {
                l920.m17736M(this.f12451a, hnc0Var);
            }
        });
        VPullUpRecyclerView vPullUpRecyclerViewM17770v = m17770v();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 2);
        gridLayoutManager.v(new C1005b(gridLayoutManager));
        if (CoreModule.P().g().Ki()) {
            vPullUpRecyclerViewM17770v.addOnScrollListener(new C1006c(gridLayoutManager, this));
        } else {
            vPullUpRecyclerViewM17770v.addOnScrollListener(new C1007d(gridLayoutManager, this));
        }
        vPullUpRecyclerViewM17770v.setLayoutManager(gridLayoutManager);
        vPullUpRecyclerViewM17770v.setAdapter(this.frag.m6873Y4());
        new k(new c820(this)).g(vPullUpRecyclerViewM17770v);
    }

    /* JADX INFO: renamed from: M */
    public static final void m17736M(l920 l920Var, hnc0 hnc0Var) {
        hnc0Var.getClass();
        l920Var.m17767q().m6917I0(null, true);
    }

    /* JADX INFO: renamed from: a */
    public static void m17737a(final l920 l920Var, View view) {
        zvf0.r("e_supremepartner_apply", "p_suggest_nearby");
        if (CoreModule.P().g().D9()) {
            CoreModule.P().a().qm(l920Var.act, l920Var.m17767q().m6920O0(), Privilege.nearby_people, new e30() { // from class: l.i920
                public final void call(Object obj) {
                    l920.m17732H(this.f14440a, (PurchaseType) obj);
                }
            });
        } else if (CoreModule.P().g().bg()) {
            CoreModule.P().g().Ds(l920Var.act, l920Var.m17767q().m6920O0(), Privilege.nearby_people, new e30() { // from class: l.j920
                public final void call(Object obj) {
                    l920.m17733I(this.f14990a, (PurchaseType) obj);
                }
            }, (d30) null);
        } else {
            l920Var.m17767q().m6915G0();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17739e(l920 l920Var, View view) {
        l920Var.m17767q().m6916H0();
    }

    /* JADX INFO: renamed from: j */
    public static void m17742j(l920 l920Var, View view) {
        l920Var.m17767q().m6922Q0();
    }

    /* JADX INFO: renamed from: r */
    private final void m17743r() {
        m17734J();
        m17750K();
        m17735L();
        m17731G();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final RelativeLayout m17744A() {
        RelativeLayout relativeLayout = this._rl_loading;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.r("_rl_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VText m17745B() {
        VText vText = this._rl_loading_describe;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_rl_loading_describe");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VDraweeView m17746C() {
        VDraweeView vDraweeView = this._rl_loading_radar_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_rl_loading_radar_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m17747C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final RadarRipple m17748E() {
        RadarRipple radarRipple = this._rl_loading_radar_ripple;
        if (radarRipple != null) {
            return radarRipple;
        }
        Intrinsics.r("_rl_loading_radar_ripple");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VButton m17749F() {
        VButton vButton = this._rl_loading_setting;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_rl_loading_setting");
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m17750K() {
        m17748E().setRadarColor(App.e.getResources().getColor(z0c0.d));
        this.radarAnimator = oey.b(m17748E(), m17746C());
        xdl0.M(m17768s(), false);
        xdl0.M(m17773y(), false);
        xdl0.M(m17744A(), true);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m17751N() {
        return this._rl_loading != null;
    }

    /* JADX INFO: renamed from: O */
    public final void m17752O() {
        Animator animator;
        if (m17744A().getVisibility() == 0 && ((Boolean) this.showingRadar.e()).booleanValue() && (animator = this.radarAnimator) != null) {
            animator.start();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m17753P() {
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m17754Q(@NotNull List<? extends User> list, boolean hasPrivilege) {
        list.getClass();
        this.hasPrivilege = hasPrivilege;
        if (hasPrivilege) {
            VPullUpRecyclerView vPullUpRecyclerViewM17770v = m17770v();
            int i = t100.e;
            vPullUpRecyclerViewM17770v.setPadding(i, i, i, t100.q);
        } else {
            VPullUpRecyclerView vPullUpRecyclerViewM17770v2 = m17770v();
            int i2 = t100.e;
            vPullUpRecyclerViewM17770v2.setPadding(i2, i2, i2, t100.K);
        }
        this.showingRadar.onNext(Boolean.FALSE);
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (CoreModule.P().g().bg()) {
            m17769u().setText("成为白金会员");
            m17769u().setTextColor(-1);
            m17769u().setBackgroundResource(b3c0.g);
            xdl0.M(m17769u(), !hasPrivilege);
        } else if (CoreModule.P().g().D9()) {
            m17769u().setText(this.frag.getText(R.string.B));
            m17769u().setTextColor(-1);
            m17769u().setBackgroundResource(b3c0.A5);
            xdl0.M(m17769u(), !hasPrivilege);
        } else {
            xdl0.M(m17769u(), !hasPrivilege);
            if (!hasPrivilege) {
                zvf0.x("e_supremepartner_apply", "p_suggest_nearby");
            }
        }
        xdl0.M(m17768s(), true);
        xdl0.M(m17744A(), false);
        xdl0.M(m17773y(), false);
        this.frag.m6873Y4().m15427M(list, hasPrivilege);
    }

    /* JADX INFO: renamed from: R */
    public final void m17755R() {
        xdl0.M(m17744A(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m17752O();
        m17745B().setText("正在努力帮您寻找附近的人...");
        m17749F().setVisibility(4);
        xdl0.M(m17773y(), false);
        xdl0.M(m17768s(), false);
    }

    /* JADX INFO: renamed from: S */
    public final void m17756S() {
        this.showingRadar.onNext(Boolean.FALSE);
        xdl0.M(m17744A(), false);
        xdl0.M(m17773y(), true);
        xdl0.M(m17768s(), false);
    }

    /* JADX INFO: renamed from: T */
    public final void m17757T() {
        this.showingRadar.onNext(Boolean.TRUE);
        xdl0.M(m17768s(), false);
        xdl0.M(m17773y(), false);
        xdl0.M(m17744A(), true);
        m17752O();
        m17745B().setText("正在努力帮您寻找附近的人...");
        m17749F().setVisibility(4);
    }

    /* JADX INFO: renamed from: U */
    public final void m17758U() {
        xdl0.M(m17744A(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m17745B().setText("当前无法获取您的位置信息， \n请在手机设置中打开");
        m17749F().setVisibility(0);
        xdl0.M(m17773y(), false);
        xdl0.M(m17768s(), false);
    }

    /* JADX INFO: renamed from: V */
    public final void m17759V(@NotNull Picture p) {
        p.getClass();
        qib0.G.B0(m17746C(), p.profile480());
    }

    /* JADX INFO: renamed from: W */
    public final void m17760W(boolean z) {
        this.hideNavigation = z;
    }

    /* JADX INFO: renamed from: X */
    public final void m17761X(@NotNull NearbyPresenter nearbyPresenter) {
        nearbyPresenter.getClass();
        this.nearbyPresenter = nearbyPresenter;
    }

    @Override // p009l.c820.InterfaceC0802a
    /* JADX INFO: renamed from: b */
    public void mo12415b(@NotNull User clickedUser, boolean liked) {
        clickedUser.getClass();
        m17767q().m6912E(clickedUser, liked, false);
    }

    @Override // p009l.c820.InterfaceC0802a
    /* JADX INFO: renamed from: c */
    public void mo12416c(boolean liked) {
        NearbyPresenter.m6889L0(m17767q(), null, 1, null);
        this.frag.m6873Y4().notifyDataSetChanged();
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM17763k = m17763k(inflater, parent);
        m17743r();
        return viewM17763k;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m17763k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = o920.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m17762i1(@NotNull NearbyPresenter presenter) {
        presenter.getClass();
        m17761X(presenter);
    }

    /* JADX INFO: renamed from: m */
    public final void m17765m() {
        m17772x().t();
    }

    @Override // p009l.c820.InterfaceC0802a
    /* JADX INFO: renamed from: n */
    public boolean mo12417n() {
        return !this.hasPrivilege;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final NearbyFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final NearbyPresenter m17767q() {
        NearbyPresenter nearbyPresenter = this.nearbyPresenter;
        if (nearbyPresenter != null) {
            return nearbyPresenter;
        }
        Intrinsics.r("nearbyPresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final FrameLayout m17768s() {
        FrameLayout frameLayout = this._fl_content_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_fl_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final TextView m17769u() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VPullUpRecyclerView m17770v() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VNavigationBar m17771w() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VPullDownRefreshLayout m17772x() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.r("_refresh");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final RelativeLayout m17773y() {
        RelativeLayout relativeLayout = this._rl_error_view;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.r("_rl_error_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VButton m17774z() {
        VButton vButton = this._rl_error_view_reload;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_rl_error_view_reload");
        return null;
    }

    public void destroy() {
    }
}
