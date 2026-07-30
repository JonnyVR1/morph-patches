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
import com.p000p1.mobile.putong.core.newui.onlinezone.OnlineZoneFrag;
import com.p000p1.mobile.putong.core.newui.onlinezone.OnlineZonePresenter;
import com.p000p1.mobile.putong.core.newui.view.RadarRipple;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
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
import l.oey;
import l.qib0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.xma;
import l.yo50;
import l.z0c0;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\tJ\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\tJ\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\tJ\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\tJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\tJ\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\tJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J#\u0010'\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\tJ\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\tJ\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u00104\u001a\u0004\bc\u00106\"\u0004\bd\u00108R\"\u0010l\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010o\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010T\u001a\u0004\bm\u0010V\"\u0004\bn\u0010XR\"\u0010r\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010\\\u001a\u0004\bp\u0010^\"\u0004\bq\u0010`R\"\u0010y\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R)\u0010\u0088\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bu\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R)\u0010\u008f\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b\u001f\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010\u0093\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u001f\u0010\u0090\u0001\u001a\u0005\b{\u0010\u0091\u0001\"\u0005\b\u0092\u0001\u0010\u0015RR\u0010\u009b\u0001\u001a+\u0012\r\u0012\u000b \u0095\u0001*\u0004\u0018\u00010%0% \u0095\u0001*\u0014\u0012\r\u0012\u000b \u0095\u0001*\u0004\u0018\u00010%0%\u0018\u00010\u0094\u00010\u0094\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\b\u0010\u009d\u0001R\u001c\u0010£\u0001\u001a\u00030\u009f\u00018\u0006¢\u0006\u000f\n\u0005\b}\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R(\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001¨\u0006ª\u0001"}, d2 = {"Ll/vo50;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;)V", "", "r", "()V", "B", "G", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "i", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "j", "(Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;)V", "inflateView", "F", "N", "L", "O", "M", "I", "J", "Lcom/p1/mobile/putong/data/Picture;", "p", "P", "(Lcom/p1/mobile/putong/data/Picture;)V", "", "Lcom/p1/mobile/putong/data/User;", "list", "", "hasPrivilege", "K", "(Ljava/util/List;Z)V", "k", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "a", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "l", "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "Landroid/widget/RelativeLayout;", "b", "Landroid/widget/RelativeLayout;", "w", "()Landroid/widget/RelativeLayout;", "set_rl_loading", "(Landroid/widget/RelativeLayout;)V", "_rl_loading", "Lv/VFrame_Squared;", "c", "Lv/VFrame_Squared;", "get_rl_loading_radar", "()Lv/VFrame_Squared;", "set_rl_loading_radar", "(Lv/VFrame_Squared;)V", "_rl_loading_radar", "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "d", "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "z", "()Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "set_rl_loading_radar_ripple", "(Lcom/p1/mobile/putong/core/newui/view/RadarRipple;)V", "_rl_loading_radar_ripple", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "y", "()Lv/VDraweeView;", "set_rl_loading_radar_image", "(Lv/VDraweeView;)V", "_rl_loading_radar_image", "Lv/VText;", "f", "Lv/VText;", "x", "()Lv/VText;", "set_rl_loading_describe", "(Lv/VText;)V", "_rl_loading_describe", "Lv/VButton;", "g", "Lv/VButton;", "A", "()Lv/VButton;", "set_rl_loading_setting", "(Lv/VButton;)V", "_rl_loading_setting", "h", "u", "set_rl_error_view", "_rl_error_view", "Lv/VImage;", "Lv/VImage;", "get_rl_error_view_img_network_error", "()Lv/VImage;", "set_rl_error_view_img_network_error", "(Lv/VImage;)V", "_rl_error_view_img_network_error", "get_rl_error_view_tv_network_tips", "set_rl_error_view_tv_network_tips", "_rl_error_view_tv_network_tips", "v", "set_rl_error_view_reload", "_rl_error_view_reload", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "n", "()Landroid/widget/FrameLayout;", "set_fl_content_layout", "(Landroid/widget/FrameLayout;)V", "_fl_content_layout", "Lv/VPullDownRefreshLayout;", "m", "Lv/VPullDownRefreshLayout;", "s", "()Lv/VPullDownRefreshLayout;", "set_refresh", "(Lv/VPullDownRefreshLayout;)V", "_refresh", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", "q", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Q", "onlinePresenter", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "Lrx/subjects/a;", "getShowingRadar", "()Lrx/subjects/a;", "setShowingRadar", "(Lrx/subjects/a;)V", "showingRadar", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "radarAnimator", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "act", "t", "Z", "getHasPrivilege", "()Z", "setHasPrivilege", "(Z)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class vo50 implements s7m<OnlineZonePresenter> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final OnlineZoneFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RelativeLayout _rl_loading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VFrame_Squared _rl_loading_radar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public RadarRipple _rl_loading_radar_ripple;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _rl_loading_radar_image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _rl_loading_describe;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VButton _rl_loading_setting;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public RelativeLayout _rl_error_view;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _rl_error_view_img_network_error;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _rl_error_view_tv_network_tips;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VButton _rl_error_view_reload;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public FrameLayout _fl_content_layout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VPullDownRefreshLayout _refresh;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView _get_privilege;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public OnlineZonePresenter onlinePresenter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public a<Boolean> showingRadar;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Animator radarAnimator;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: l.vo50$a */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"l/vo50$a", "Ll/ci50$b;", "Lcom/p1/mobile/putong/data/User;", "user", "", "pos", "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "b", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1237a implements ci50.InterfaceC0812b {
        public C1237a() {
        }

        @Override // p009l.ci50.InterfaceC0812b
        /* JADX INFO: renamed from: a */
        public void mo12595a(User user, int pos) {
            user.getClass();
            vo50.this.m23478m().m7298E0();
        }

        @Override // p009l.ci50.InterfaceC0812b
        /* JADX INFO: renamed from: b */
        public void mo12596b(User user, int pos) {
            user.getClass();
            vo50.this.m23478m().m7299F0(user);
        }
    }

    /* JADX INFO: renamed from: l.vo50$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"l/vo50$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1238b extends GridLayoutManager.c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f21694b;

        public C1238b(GridLayoutManager gridLayoutManager) {
            this.f21694b = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m23489f(int position) {
            if (vo50.this.getFrag().m7255R4().getItemViewType(position) == 2) {
                return this.f21694b.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.vo50$c */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"l/vo50$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isScrollingToBottom", "b", "pullUpDisable", "c", "hasScrollingToTop", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1239c extends RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean hasScrollingToTop = true;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f21698d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vo50 f21699e;

        public C1239c(GridLayoutManager gridLayoutManager, vo50 vo50Var) {
            this.f21698d = gridLayoutManager;
            this.f21699e = vo50Var;
        }

        /* JADX INFO: renamed from: a */
        public static void m23490a(C1239c c1239c, RecyclerView recyclerView) {
            c1239c.pullUpDisable = true;
            c1239c.hasScrollingToTop = false;
            recyclerView.stopScroll();
        }

        /* JADX INFO: renamed from: b */
        public static void m23491b(C1239c c1239c) {
            c1239c.pullUpDisable = true;
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
            int iFindLastVisibleItemPosition = this.f21698d.findLastVisibleItemPosition();
            int childCount = this.f21698d.getChildCount();
            if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f21698d.getItemCount() - 1 || this.f21698d.getItemCount() < childCount || !this.hasScrollingToTop || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1)) {
                return;
            }
            this.f21699e.m23478m().m7304V0(new d30() { // from class: l.xo50
                public final void call() {
                    vo50.C1239c.m23491b(this.f22677a);
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
            if (z && this.f21698d.findLastCompletelyVisibleItemPosition() == 7 && !this.pullUpDisable && this.hasScrollingToTop) {
                this.f21699e.m23478m().m7304V0(new d30() { // from class: l.wo50
                    public final void call() {
                        vo50.C1239c.m23490a(this.f22231a, recyclerView);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.vo50$d */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"l/vo50$d", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "a", "I", "SCROLL_ITEM_COUNT", "", "b", "Z", "isScrollingToBottom", "c", "pullUpDisable", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1240d extends RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int SCROLL_ITEM_COUNT = 10;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f21703d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vo50 f21704e;

        public C1240d(GridLayoutManager gridLayoutManager, vo50 vo50Var) {
            this.f21703d = gridLayoutManager;
            this.f21704e = vo50Var;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindLastVisibleItemPosition = this.f21703d.findLastVisibleItemPosition();
                if (this.isScrollingToBottom && !this.pullUpDisable && iFindLastVisibleItemPosition == this.SCROLL_ITEM_COUNT - 1) {
                    if (xma.N3()) {
                        return;
                    }
                    this.pullUpDisable = true;
                    this.f21704e.m23478m().m7301R0();
                    return;
                }
                int childCount = this.f21703d.getChildCount();
                if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f21703d.getItemCount() - 1 || this.f21703d.getItemCount() < childCount || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1) || xma.N3()) {
                    return;
                }
                this.pullUpDisable = true;
                this.f21704e.m23478m().m7301R0();
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

    public vo50(@NotNull OnlineZoneFrag onlineZoneFrag) {
        onlineZoneFrag.getClass();
        this.frag = onlineZoneFrag;
        this.showingRadar = a.c(Boolean.TRUE);
        Act act = onlineZoneFrag.act();
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: B */
    private final void m23449B() {
        xdl0.E0(m23484v(), new View.OnClickListener() { // from class: l.qo50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vo50.m23457d(this.f19407a, view);
            }
        });
        xdl0.E0(m23461A(), new View.OnClickListener() { // from class: l.ro50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vo50.m23455b(this.f19927a, view);
            }
        });
        xdl0.E0(m23480p(), new View.OnClickListener() { // from class: l.so50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vo50.m23459f(this.f20398a, view);
            }
        });
        this.frag.m7255R4().m12593N(new C1237a());
    }

    /* JADX INFO: renamed from: C */
    public static final void m23450C(vo50 vo50Var, PurchaseType purchaseType) {
        vo50Var.m23478m().m7306Y0();
    }

    /* JADX INFO: renamed from: E */
    public static final void m23451E(vo50 vo50Var, PurchaseType purchaseType) {
        vo50Var.m23478m().m7306Y0();
    }

    /* JADX INFO: renamed from: G */
    private final void m23452G() {
        VPullDownRefreshLayout vPullDownRefreshLayoutM23482s = m23482s();
        vPullDownRefreshLayoutM23482s.I(true);
        vPullDownRefreshLayoutM23482s.G(false);
        vPullDownRefreshLayoutM23482s.O(new df50() { // from class: l.po50
            /* JADX INFO: renamed from: w2 */
            public final void m20516w2(hnc0 hnc0Var) {
                vo50.m23453H(this.f18797a, hnc0Var);
            }
        });
        VPullUpRecyclerView vPullUpRecyclerViewM23481q = m23481q();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 2);
        gridLayoutManager.v(new C1238b(gridLayoutManager));
        if (CoreModule.P().g().Ki()) {
            vPullUpRecyclerViewM23481q.addOnScrollListener(new C1239c(gridLayoutManager, this));
        } else {
            vPullUpRecyclerViewM23481q.addOnScrollListener(new C1240d(gridLayoutManager, this));
        }
        vPullUpRecyclerViewM23481q.setLayoutManager(gridLayoutManager);
        vPullUpRecyclerViewM23481q.setAdapter(this.frag.m7255R4());
    }

    /* JADX INFO: renamed from: H */
    public static final void m23453H(vo50 vo50Var, hnc0 hnc0Var) {
        hnc0Var.getClass();
        vo50Var.m23478m().m7303U0(null, true);
    }

    /* JADX INFO: renamed from: b */
    public static void m23455b(vo50 vo50Var, View view) {
        vo50Var.m23478m().m7302S0();
    }

    /* JADX INFO: renamed from: d */
    public static void m23457d(vo50 vo50Var, View view) {
        vo50Var.m23478m().m7306Y0();
    }

    /* JADX INFO: renamed from: f */
    public static void m23459f(final vo50 vo50Var, View view) {
        if (CoreModule.P().g().D9()) {
            CoreModule.P().a().qm(vo50Var.act, "p_home_nearby,online", Privilege.nearby_people, new e30() { // from class: l.to50
                public final void call(Object obj) {
                    vo50.m23450C(this.f20787a, (PurchaseType) obj);
                }
            });
        } else if (CoreModule.P().g().bg()) {
            CoreModule.P().g().Ds(vo50Var.act, "p_home_nearby,online", Privilege.nearby_people, new e30() { // from class: l.uo50
                public final void call(Object obj) {
                    vo50.m23451E(this.f21276a, (PurchaseType) obj);
                }
            }, (d30) null);
        } else {
            vo50Var.m23478m().m7301R0();
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m23460r() {
        m23463F();
        m23452G();
        m23449B();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VButton m23461A() {
        VButton vButton = this._rl_loading_setting;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_rl_loading_setting");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m23462C0() {
        return this.act;
    }

    /* JADX INFO: renamed from: F */
    public final void m23463F() {
        m23488z().setRadarColor(App.e.getResources().getColor(z0c0.d));
        this.radarAnimator = oey.b(m23488z(), m23487y());
        xdl0.M(m23479n(), false);
        xdl0.M(m23483u(), false);
        xdl0.M(m23485w(), true);
    }

    /* JADX INFO: renamed from: I */
    public final void m23464I() {
        Animator animator;
        if (m23485w().getVisibility() == 0 && ((Boolean) this.showingRadar.e()).booleanValue() && (animator = this.radarAnimator) != null) {
            animator.start();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m23465J() {
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m23466K(@NotNull List<? extends User> list, boolean hasPrivilege) {
        list.getClass();
        this.hasPrivilege = hasPrivilege;
        if (hasPrivilege) {
            VPullUpRecyclerView vPullUpRecyclerViewM23481q = m23481q();
            int i = t100.e;
            vPullUpRecyclerViewM23481q.setPadding(i, i, i, t100.q);
        } else {
            VPullUpRecyclerView vPullUpRecyclerViewM23481q2 = m23481q();
            int i2 = t100.e;
            vPullUpRecyclerViewM23481q2.setPadding(i2, i2, i2, t100.K);
        }
        this.showingRadar.onNext(Boolean.FALSE);
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (CoreModule.P().g().bg()) {
            m23480p().setText("成为白金会员");
            m23480p().setTextColor(-1);
            m23480p().setBackgroundResource(b3c0.g);
            xdl0.M(m23480p(), !hasPrivilege);
        } else if (CoreModule.P().g().D9()) {
            m23480p().setText(this.frag.getText(R.string.B));
            m23480p().setTextColor(-1);
            m23480p().setBackgroundResource(b3c0.A5);
            xdl0.M(m23480p(), !hasPrivilege);
        } else {
            xdl0.M(m23480p(), !hasPrivilege);
        }
        xdl0.M(m23479n(), true);
        xdl0.M(m23485w(), false);
        xdl0.M(m23483u(), false);
        this.frag.m7255R4().m12592M(list, hasPrivilege);
    }

    /* JADX INFO: renamed from: L */
    public final void m23467L() {
        xdl0.M(m23485w(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m23464I();
        m23486x().setText("正在努力帮您寻找附近的人...");
        m23461A().setVisibility(4);
        xdl0.M(m23483u(), false);
        xdl0.M(m23479n(), false);
    }

    /* JADX INFO: renamed from: M */
    public final void m23468M() {
        this.showingRadar.onNext(Boolean.FALSE);
        xdl0.M(m23485w(), false);
        xdl0.M(m23483u(), true);
        xdl0.M(m23479n(), false);
    }

    /* JADX INFO: renamed from: N */
    public final void m23469N() {
        this.showingRadar.onNext(Boolean.TRUE);
        xdl0.M(m23479n(), false);
        xdl0.M(m23483u(), false);
        xdl0.M(m23485w(), true);
        m23464I();
        m23486x().setText("正在努力帮您寻找附近的人...");
        m23461A().setVisibility(4);
    }

    /* JADX INFO: renamed from: O */
    public final void m23470O() {
        xdl0.M(m23485w(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m23486x().setText("当前无法获取您的位置信息， \n请在手机设置中打开");
        m23461A().setVisibility(0);
        xdl0.M(m23483u(), false);
        xdl0.M(m23479n(), false);
    }

    /* JADX INFO: renamed from: P */
    public final void m23471P(@NotNull Picture p) {
        p.getClass();
        qib0.G.B0(m23487y(), p.profile480());
    }

    /* JADX INFO: renamed from: Q */
    public final void m23472Q(@NotNull OnlineZonePresenter onlineZonePresenter) {
        onlineZonePresenter.getClass();
        this.onlinePresenter = onlineZonePresenter;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m23473i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = yo50.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM23473i = m23473i(inflater, parent);
        m23460r();
        return viewM23473i;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m23474i1(@NotNull OnlineZonePresenter presenter) {
        presenter.getClass();
        m23472Q(presenter);
    }

    /* JADX INFO: renamed from: k */
    public final void m23476k() {
        m23482s().t();
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final OnlineZoneFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final OnlineZonePresenter m23478m() {
        OnlineZonePresenter onlineZonePresenter = this.onlinePresenter;
        if (onlineZonePresenter != null) {
            return onlineZonePresenter;
        }
        Intrinsics.r("onlinePresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final FrameLayout m23479n() {
        FrameLayout frameLayout = this._fl_content_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_fl_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TextView m23480p() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VPullUpRecyclerView m23481q() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VPullDownRefreshLayout m23482s() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.r("_refresh");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final RelativeLayout m23483u() {
        RelativeLayout relativeLayout = this._rl_error_view;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.r("_rl_error_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VButton m23484v() {
        VButton vButton = this._rl_error_view_reload;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_rl_error_view_reload");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final RelativeLayout m23485w() {
        RelativeLayout relativeLayout = this._rl_loading;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.r("_rl_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m23486x() {
        VText vText = this._rl_loading_describe;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_rl_loading_describe");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VDraweeView m23487y() {
        VDraweeView vDraweeView = this._rl_loading_radar_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_rl_loading_radar_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final RadarRipple m23488z() {
        RadarRipple radarRipple = this._rl_loading_radar_ripple;
        if (radarRipple != null) {
            return radarRipple;
        }
        Intrinsics.r("_rl_loading_radar_ripple");
        return null;
    }

    public void destroy() {
    }
}
