package p149l;

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
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.newui.onlinezone.OnlineZoneFrag;
import com.p046p1.mobile.putong.core.newui.onlinezone.OnlineZonePresenter;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\tJ\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\tJ\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\tJ\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\tJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\tJ\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\tJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J#\u0010'\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\tJ\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\tJ\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u00104\u001a\u0004\bc\u00106\"\u0004\bd\u00108R\"\u0010l\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010o\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010T\u001a\u0004\bm\u0010V\"\u0004\bn\u0010XR\"\u0010r\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010\\\u001a\u0004\bp\u0010^\"\u0004\bq\u0010`R\"\u0010y\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R)\u0010\u0088\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bu\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R)\u0010\u008f\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b\u001f\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010\u0093\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u001f\u0010\u0090\u0001\u001a\u0005\b{\u0010\u0091\u0001\"\u0005\b\u0092\u0001\u0010\u0015RR\u0010\u009b\u0001\u001a+\u0012\r\u0012\u000b \u0095\u0001*\u0004\u0018\u00010%0% \u0095\u0001*\u0014\u0012\r\u0012\u000b \u0095\u0001*\u0004\u0018\u00010%0%\u0018\u00010\u0094\u00010\u0094\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\b\u0010\u009d\u0001R\u001c\u0010£\u0001\u001a\u00030\u009f\u00018\u0006¢\u0006\u000f\n\u0005\b}\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R(\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001¨\u0006ª\u0001"}, m87232d2 = {"Ll/vo50;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;)V", "", "r", "()V", "B", "G", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "j", "(Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;)V", "inflateView", "F", "N", "L", BloodType.f38728O, "M", "I", "J", "Lcom/p1/mobile/putong/data/Picture;", "p", "P", "(Lcom/p1/mobile/putong/data/Picture;)V", "", "Lcom/p1/mobile/putong/data/User;", "list", "", "hasPrivilege", "K", "(Ljava/util/List;Z)V", "k", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "a", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "Landroid/widget/RelativeLayout;", "b", "Landroid/widget/RelativeLayout;", "w", "()Landroid/widget/RelativeLayout;", "set_rl_loading", "(Landroid/widget/RelativeLayout;)V", "_rl_loading", "Lv/VFrame_Squared;", "c", "Lv/VFrame_Squared;", "get_rl_loading_radar", "()Lv/VFrame_Squared;", "set_rl_loading_radar", "(Lv/VFrame_Squared;)V", "_rl_loading_radar", "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", BaseSei.f13932Z, "()Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "set_rl_loading_radar_ripple", "(Lcom/p1/mobile/putong/core/newui/view/RadarRipple;)V", "_rl_loading_radar_ripple", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", BaseSei.f13931Y, "()Lv/VDraweeView;", "set_rl_loading_radar_image", "(Lv/VDraweeView;)V", "_rl_loading_radar_image", "Lv/VText;", "f", "Lv/VText;", BaseSei.f13930X, "()Lv/VText;", "set_rl_loading_describe", "(Lv/VText;)V", "_rl_loading_describe", "Lv/VButton;", "g", "Lv/VButton;", "A", "()Lv/VButton;", "set_rl_loading_setting", "(Lv/VButton;)V", "_rl_loading_setting", "h", "u", "set_rl_error_view", "_rl_error_view", "Lv/VImage;", "Lv/VImage;", "get_rl_error_view_img_network_error", "()Lv/VImage;", "set_rl_error_view_img_network_error", "(Lv/VImage;)V", "_rl_error_view_img_network_error", "get_rl_error_view_tv_network_tips", "set_rl_error_view_tv_network_tips", "_rl_error_view_tv_network_tips", ResourceDirection.f38808v, "set_rl_error_view_reload", "_rl_error_view_reload", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "n", "()Landroid/widget/FrameLayout;", "set_fl_content_layout", "(Landroid/widget/FrameLayout;)V", "_fl_content_layout", "Lv/VPullDownRefreshLayout;", "m", "Lv/VPullDownRefreshLayout;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lv/VPullDownRefreshLayout;", "set_refresh", "(Lv/VPullDownRefreshLayout;)V", "_refresh", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", "q", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Q", "onlinePresenter", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "Lrx/subjects/a;", "getShowingRadar", "()Lrx/subjects/a;", "setShowingRadar", "(Lrx/subjects/a;)V", "showingRadar", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "radarAnimator", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, Constants.KEY_T, "Z", "getHasPrivilege", "()Z", "setHasPrivilege", "(Z)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public C22392a<Boolean> showingRadar;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Animator radarAnimator;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: l.vo50$a */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m87232d2 = {"l/vo50$a", "Ll/ci50$b;", "Lcom/p1/mobile/putong/data/User;", "user", "", Constants.INAPP_POSITION, "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "b", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20673a implements ci50.InterfaceC16161b {
        public C20673a() {
        }

        @Override // p149l.ci50.InterfaceC16161b
        /* JADX INFO: renamed from: a */
        public void mo107049a(User user, int pos) {
            user.getClass();
            vo50.this.m199122m().m43093E0();
        }

        @Override // p149l.ci50.InterfaceC16161b
        /* JADX INFO: renamed from: b */
        public void mo107050b(User user, int pos) {
            user.getClass();
            vo50.this.m199122m().m43094F0(user);
        }
    }

    /* JADX INFO: renamed from: l.vo50$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"l/vo50$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20674b extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f182359b;

        public C20674b(GridLayoutManager gridLayoutManager) {
            this.f182359b = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int position) {
            if (vo50.this.getFrag().m43051R4().getItemViewType(position) == 2) {
                return this.f182359b.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.vo50$c */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, m87232d2 = {"l/vo50$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isScrollingToBottom", "b", "pullUpDisable", "c", "hasScrollingToTop", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20675c extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean hasScrollingToTop = true;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f182363d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vo50 f182364e;

        public C20675c(GridLayoutManager gridLayoutManager, vo50 vo50Var) {
            this.f182363d = gridLayoutManager;
            this.f182364e = vo50Var;
        }

        /* JADX INFO: renamed from: a */
        public static void m199133a(C20675c c20675c, RecyclerView recyclerView) {
            c20675c.pullUpDisable = true;
            c20675c.hasScrollingToTop = false;
            recyclerView.stopScroll();
        }

        /* JADX INFO: renamed from: b */
        public static void m199134b(C20675c c20675c) {
            c20675c.pullUpDisable = true;
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
            int iFindLastVisibleItemPosition = this.f182363d.findLastVisibleItemPosition();
            int childCount = this.f182363d.getChildCount();
            if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f182363d.getItemCount() - 1 || this.f182363d.getItemCount() < childCount || !this.hasScrollingToTop || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1)) {
                return;
            }
            this.f182364e.m199122m().m43099V0(new d30() { // from class: l.xo50
                @Override // p149l.d30
                public final void call() {
                    vo50.C20675c.m199134b(this.f193782a);
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
            if (z && this.f182363d.findLastCompletelyVisibleItemPosition() == 7 && !this.pullUpDisable && this.hasScrollingToTop) {
                this.f182364e.m199122m().m43099V0(new d30() { // from class: l.wo50
                    @Override // p149l.d30
                    public final void call() {
                        vo50.C20675c.m199133a(this.f187382a, recyclerView);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.vo50$d */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, m87232d2 = {"l/vo50$d", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "a", "I", "SCROLL_ITEM_COUNT", "", "b", "Z", "isScrollingToBottom", "c", "pullUpDisable", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20676d extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int SCROLL_ITEM_COUNT = 10;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f182368d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vo50 f182369e;

        public C20676d(GridLayoutManager gridLayoutManager, vo50 vo50Var) {
            this.f182368d = gridLayoutManager;
            this.f182369e = vo50Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindLastVisibleItemPosition = this.f182368d.findLastVisibleItemPosition();
                if (this.isScrollingToBottom && !this.pullUpDisable && iFindLastVisibleItemPosition == this.SCROLL_ITEM_COUNT - 1) {
                    if (xma.m210049N3()) {
                        return;
                    }
                    this.pullUpDisable = true;
                    this.f182369e.m199122m().m43096R0();
                    return;
                }
                int childCount = this.f182368d.getChildCount();
                if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f182368d.getItemCount() - 1 || this.f182368d.getItemCount() < childCount || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1) || xma.m210049N3()) {
                    return;
                }
                this.pullUpDisable = true;
                this.f182369e.m199122m().m43096R0();
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

    public vo50(@NotNull OnlineZoneFrag onlineZoneFrag) {
        onlineZoneFrag.getClass();
        this.frag = onlineZoneFrag;
        this.showingRadar = C22392a.m221513c(Boolean.TRUE);
        Act act = onlineZoneFrag.act();
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: B */
    private final void m199095B() {
        xdl0.m208329E0(m199128v(), new View.OnClickListener() { // from class: l.qo50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vo50.m199103d(this.f155539a, view);
            }
        });
        xdl0.m208329E0(m199107A(), new View.OnClickListener() { // from class: l.ro50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vo50.m199101b(this.f160355a, view);
            }
        });
        xdl0.m208329E0(m199124p(), new View.OnClickListener() { // from class: l.so50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vo50.m199105f(this.f165548a, view);
            }
        });
        this.frag.m43051R4().m107048N(new C20673a());
    }

    /* JADX INFO: renamed from: C */
    public static final void m199096C(vo50 vo50Var, PurchaseType purchaseType) {
        vo50Var.m199122m().m43101Y0();
    }

    /* JADX INFO: renamed from: E */
    public static final void m199097E(vo50 vo50Var, PurchaseType purchaseType) {
        vo50Var.m199122m().m43101Y0();
    }

    /* JADX INFO: renamed from: G */
    private final void m199098G() {
        VPullDownRefreshLayout vPullDownRefreshLayoutM199126s = m199126s();
        vPullDownRefreshLayoutM199126s.m223757I(true);
        vPullDownRefreshLayoutM199126s.m223755G(false);
        vPullDownRefreshLayoutM199126s.mo223159O(new df50() { // from class: l.po50
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                vo50.m199099H(this.f150452a, hnc0Var);
            }
        });
        VPullUpRecyclerView vPullUpRecyclerViewM199125q = m199125q();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 2);
        gridLayoutManager.m3326v(new C20674b(gridLayoutManager));
        if (CoreModule.m29935P().m94656g().mo35017Ki()) {
            vPullUpRecyclerViewM199125q.addOnScrollListener(new C20675c(gridLayoutManager, this));
        } else {
            vPullUpRecyclerViewM199125q.addOnScrollListener(new C20676d(gridLayoutManager, this));
        }
        vPullUpRecyclerViewM199125q.setLayoutManager(gridLayoutManager);
        vPullUpRecyclerViewM199125q.setAdapter(this.frag.m43051R4());
    }

    /* JADX INFO: renamed from: H */
    public static final void m199099H(vo50 vo50Var, hnc0 hnc0Var) {
        hnc0Var.getClass();
        vo50Var.m199122m().m43098U0(null, true);
    }

    /* JADX INFO: renamed from: b */
    public static void m199101b(vo50 vo50Var, View view) {
        vo50Var.m199122m().m43097S0();
    }

    /* JADX INFO: renamed from: d */
    public static void m199103d(vo50 vo50Var, View view) {
        vo50Var.m199122m().m43101Y0();
    }

    /* JADX INFO: renamed from: f */
    public static void m199105f(final vo50 vo50Var, View view) {
        if (CoreModule.m29935P().m94656g().mo35004D9()) {
            CoreModule.m29935P().m94651a().mo33572qm(vo50Var.act, "p_home_nearby,online", Privilege.nearby_people, new e30() { // from class: l.to50
                @Override // p149l.e30
                public final void call(Object obj) {
                    vo50.m199096C(this.f171319a, (PurchaseType) obj);
                }
            });
        } else if (CoreModule.m29935P().m94656g().mo35050bg()) {
            CoreModule.m29935P().m94656g().mo35006Ds(vo50Var.act, "p_home_nearby,online", Privilege.nearby_people, new e30() { // from class: l.uo50
                @Override // p149l.e30
                public final void call(Object obj) {
                    vo50.m199097E(this.f177494a, (PurchaseType) obj);
                }
            }, null);
        } else {
            vo50Var.m199122m().m43096R0();
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m199106r() {
        m199108F();
        m199098G();
        m199095B();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VButton m199107A() {
        VButton vButton = this._rl_loading_setting;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_rl_loading_setting");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: F */
    public final void m199108F() {
        m199132z().setRadarColor(App.f15369e.getResources().getColor(z0c0.f200976d));
        this.radarAnimator = oey.m164039b(m199132z(), m199131y());
        xdl0.m208344M(m199123n(), false);
        xdl0.m208344M(m199127u(), false);
        xdl0.m208344M(m199129w(), true);
    }

    /* JADX INFO: renamed from: I */
    public final void m199109I() {
        Animator animator;
        if (m199129w().getVisibility() == 0 && this.showingRadar.m221515e().booleanValue() && (animator = this.radarAnimator) != null) {
            animator.start();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m199110J() {
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m199111K(@NotNull List<? extends User> list, boolean hasPrivilege) {
        list.getClass();
        this.hasPrivilege = hasPrivilege;
        if (hasPrivilege) {
            VPullUpRecyclerView vPullUpRecyclerViewM199125q = m199125q();
            int i = t100.f167256e;
            vPullUpRecyclerViewM199125q.setPadding(i, i, i, t100.f167268q);
        } else {
            VPullUpRecyclerView vPullUpRecyclerViewM199125q2 = m199125q();
            int i2 = t100.f167256e;
            vPullUpRecyclerViewM199125q2.setPadding(i2, i2, i2, t100.f167236K);
        }
        this.showingRadar.onNext(Boolean.FALSE);
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (CoreModule.m29935P().m94656g().mo35050bg()) {
            m199124p().setText("成为白金会员");
            m199124p().setTextColor(-1);
            m199124p().setBackgroundResource(b3c0.f73050g);
            xdl0.m208344M(m199124p(), !hasPrivilege);
        } else if (CoreModule.m29935P().m94656g().mo35004D9()) {
            m199124p().setText(this.frag.getText(R$string.f20566B));
            m199124p().setTextColor(-1);
            m199124p().setBackgroundResource(b3c0.f72826A5);
            xdl0.m208344M(m199124p(), !hasPrivilege);
        } else {
            xdl0.m208344M(m199124p(), !hasPrivilege);
        }
        xdl0.m208344M(m199123n(), true);
        xdl0.m208344M(m199129w(), false);
        xdl0.m208344M(m199127u(), false);
        this.frag.m43051R4().m107047M(list, hasPrivilege);
    }

    /* JADX INFO: renamed from: L */
    public final void m199112L() {
        xdl0.m208344M(m199129w(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m199109I();
        m199130x().setText("正在努力帮您寻找附近的人...");
        m199107A().setVisibility(4);
        xdl0.m208344M(m199127u(), false);
        xdl0.m208344M(m199123n(), false);
    }

    /* JADX INFO: renamed from: M */
    public final void m199113M() {
        this.showingRadar.onNext(Boolean.FALSE);
        xdl0.m208344M(m199129w(), false);
        xdl0.m208344M(m199127u(), true);
        xdl0.m208344M(m199123n(), false);
    }

    /* JADX INFO: renamed from: N */
    public final void m199114N() {
        this.showingRadar.onNext(Boolean.TRUE);
        xdl0.m208344M(m199123n(), false);
        xdl0.m208344M(m199127u(), false);
        xdl0.m208344M(m199129w(), true);
        m199109I();
        m199130x().setText("正在努力帮您寻找附近的人...");
        m199107A().setVisibility(4);
    }

    /* JADX INFO: renamed from: O */
    public final void m199115O() {
        xdl0.m208344M(m199129w(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m199130x().setText("当前无法获取您的位置信息， \n请在手机设置中打开");
        m199107A().setVisibility(0);
        xdl0.m208344M(m199127u(), false);
        xdl0.m208344M(m199123n(), false);
    }

    /* JADX INFO: renamed from: P */
    public final void m199116P(@NotNull Picture p) {
        p.getClass();
        qib0.f154691G.m102312B0(m199131y(), p.profile480());
    }

    /* JADX INFO: renamed from: Q */
    public final void m199117Q(@NotNull OnlineZonePresenter onlineZonePresenter) {
        onlineZonePresenter.getClass();
        this.onlinePresenter = onlineZonePresenter;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m199118i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM215474b = yo50.m215474b(this, inflater, parent);
        viewM215474b.getClass();
        return viewM215474b;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM199118i = m199118i(inflater, parent);
        m199106r();
        return viewM199118i;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull OnlineZonePresenter presenter) {
        presenter.getClass();
        m199117Q(presenter);
    }

    /* JADX INFO: renamed from: k */
    public final void m199120k() {
        m199126s().m223775t();
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final OnlineZoneFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final OnlineZonePresenter m199122m() {
        OnlineZonePresenter onlineZonePresenter = this.onlinePresenter;
        if (onlineZonePresenter != null) {
            return onlineZonePresenter;
        }
        Intrinsics.m87502r("onlinePresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final FrameLayout m199123n() {
        FrameLayout frameLayout = this._fl_content_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_fl_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TextView m199124p() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VPullUpRecyclerView m199125q() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VPullDownRefreshLayout m199126s() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.m87502r("_refresh");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final RelativeLayout m199127u() {
        RelativeLayout relativeLayout = this._rl_error_view;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_rl_error_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VButton m199128v() {
        VButton vButton = this._rl_error_view_reload;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_rl_error_view_reload");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final RelativeLayout m199129w() {
        RelativeLayout relativeLayout = this._rl_loading;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_rl_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m199130x() {
        VText vText = this._rl_loading_describe;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_rl_loading_describe");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VDraweeView m199131y() {
        VDraweeView vDraweeView = this._rl_loading_radar_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_rl_loading_radar_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final RadarRipple m199132z() {
        RadarRipple radarRipple = this._rl_loading_radar_ripple;
        if (radarRipple != null) {
            return radarRipple;
        }
        Intrinsics.m87502r("_rl_loading_radar_ripple");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
