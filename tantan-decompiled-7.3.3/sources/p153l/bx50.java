package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.onlinezone.OnlineZoneFrag;
import com.p051p1.mobile.putong.core.newui.onlinezone.OnlineZonePresenter;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\tJ\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\tJ\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\tJ\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\tJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\tJ\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\tJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J#\u0010'\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\tJ\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\tJ\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u00104\u001a\u0004\bc\u00106\"\u0004\bd\u00108R\"\u0010l\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010o\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010T\u001a\u0004\bm\u0010V\"\u0004\bn\u0010XR\"\u0010r\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010\\\u001a\u0004\bp\u0010^\"\u0004\bq\u0010`R\"\u0010y\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R)\u0010\u0088\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bu\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R)\u0010\u008f\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b\u001f\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010\u0093\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u001f\u0010\u0090\u0001\u001a\u0005\b{\u0010\u0091\u0001\"\u0005\b\u0092\u0001\u0010\u0015RR\u0010\u009b\u0001\u001a+\u0012\r\u0012\u000b \u0095\u0001*\u0004\u0018\u00010%0% \u0095\u0001*\u0014\u0012\r\u0012\u000b \u0095\u0001*\u0004\u0018\u00010%0%\u0018\u00010\u0094\u00010\u0094\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\b\u0010\u009d\u0001R\u001c\u0010£\u0001\u001a\u00030\u009f\u00018\u0006¢\u0006\u000f\n\u0005\b}\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R(\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001¨\u0006ª\u0001"}, m88121d2 = {"Ll/bx50;", "Ll/iam;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;)V", "", "r", "()V", "B", "G", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "j", "(Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;)V", "inflateView", "F", "N", "L", BloodType.f39576O, "M", "I", "J", "Lcom/p1/mobile/putong/data/Picture;", "p", "P", "(Lcom/p1/mobile/putong/data/Picture;)V", "", "Lcom/p1/mobile/putong/data/User;", "list", "", "hasPrivilege", "K", "(Ljava/util/List;Z)V", "k", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "a", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "Landroid/widget/RelativeLayout;", "b", "Landroid/widget/RelativeLayout;", "w", "()Landroid/widget/RelativeLayout;", "set_rl_loading", "(Landroid/widget/RelativeLayout;)V", "_rl_loading", "Lv/VFrame_Squared;", "c", "Lv/VFrame_Squared;", "get_rl_loading_radar", "()Lv/VFrame_Squared;", "set_rl_loading_radar", "(Lv/VFrame_Squared;)V", "_rl_loading_radar", "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", BaseSei.f14626Z, "()Lcom/p1/mobile/putong/core/newui/view/RadarRipple;", "set_rl_loading_radar_ripple", "(Lcom/p1/mobile/putong/core/newui/view/RadarRipple;)V", "_rl_loading_radar_ripple", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", BaseSei.f14625Y, "()Lv/VDraweeView;", "set_rl_loading_radar_image", "(Lv/VDraweeView;)V", "_rl_loading_radar_image", "Lv/VText;", "f", "Lv/VText;", BaseSei.f14624X, "()Lv/VText;", "set_rl_loading_describe", "(Lv/VText;)V", "_rl_loading_describe", "Lv/VButton;", "g", "Lv/VButton;", "A", "()Lv/VButton;", "set_rl_loading_setting", "(Lv/VButton;)V", "_rl_loading_setting", "h", "u", "set_rl_error_view", "_rl_error_view", "Lv/VImage;", "Lv/VImage;", "get_rl_error_view_img_network_error", "()Lv/VImage;", "set_rl_error_view_img_network_error", "(Lv/VImage;)V", "_rl_error_view_img_network_error", "get_rl_error_view_tv_network_tips", "set_rl_error_view_tv_network_tips", "_rl_error_view_tv_network_tips", ResourceDirection.f39656v, "set_rl_error_view_reload", "_rl_error_view_reload", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "n", "()Landroid/widget/FrameLayout;", "set_fl_content_layout", "(Landroid/widget/FrameLayout;)V", "_fl_content_layout", "Lv/VPullDownRefreshLayout;", "m", "Lv/VPullDownRefreshLayout;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lv/VPullDownRefreshLayout;", "set_refresh", "(Lv/VPullDownRefreshLayout;)V", "_refresh", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", "q", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Q", "onlinePresenter", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "Lrx/subjects/a;", "getShowingRadar", "()Lrx/subjects/a;", "setShowingRadar", "(Lrx/subjects/a;)V", "showingRadar", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "radarAnimator", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, Constants.KEY_T, "Z", "getHasPrivilege", "()Z", "setHasPrivilege", "(Z)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bx50 implements iam<OnlineZonePresenter> {

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
    public C22507a<Boolean> showingRadar;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Animator radarAnimator;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: l.bx50$a */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m88121d2 = {"l/bx50$a", "Ll/iq50$b;", "Lcom/p1/mobile/putong/data/User;", "user", "", Constants.INAPP_POSITION, "", "a", "(Lcom/p1/mobile/putong/data/User;I)V", "b", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16126a implements iq50.InterfaceC17773b {
        public C16126a() {
        }

        @Override // p153l.iq50.InterfaceC17773b
        /* JADX INFO: renamed from: a */
        public void mo106866a(User user, int pos) {
            user.getClass();
            bx50.this.m106855m().m44104E0();
        }

        @Override // p153l.iq50.InterfaceC17773b
        /* JADX INFO: renamed from: b */
        public void mo106867b(User user, int pos) {
            user.getClass();
            bx50.this.m106855m().m44105F0(user);
        }
    }

    /* JADX INFO: renamed from: l.bx50$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"l/bx50$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16127b extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f78834b;

        public C16127b(GridLayoutManager gridLayoutManager) {
            this.f78834b = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            if (bx50.this.getFrag().m44062R4().getItemViewType(position) == 2) {
                return this.f78834b.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.bx50$c */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, m88121d2 = {"l/bx50$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isScrollingToBottom", "b", "pullUpDisable", "c", "hasScrollingToTop", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16128c extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean hasScrollingToTop = true;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f78838d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ bx50 f78839e;

        public C16128c(GridLayoutManager gridLayoutManager, bx50 bx50Var) {
            this.f78838d = gridLayoutManager;
            this.f78839e = bx50Var;
        }

        /* JADX INFO: renamed from: a */
        public static void m106868a(C16128c c16128c, RecyclerView recyclerView) {
            c16128c.pullUpDisable = true;
            c16128c.hasScrollingToTop = false;
            recyclerView.stopScroll();
        }

        /* JADX INFO: renamed from: b */
        public static void m106869b(C16128c c16128c) {
            c16128c.pullUpDisable = true;
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
            int iFindLastVisibleItemPosition = this.f78838d.findLastVisibleItemPosition();
            int childCount = this.f78838d.getChildCount();
            if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f78838d.getItemCount() - 1 || this.f78838d.getItemCount() < childCount || !this.hasScrollingToTop || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1)) {
                return;
            }
            this.f78839e.m106855m().m44110V0(new x20() { // from class: l.dx50
                @Override // p153l.x20
                public final void call() {
                    bx50.C16128c.m106869b(this.f91066a);
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
            if (z && this.f78838d.findLastCompletelyVisibleItemPosition() == 7 && !this.pullUpDisable && this.hasScrollingToTop) {
                this.f78839e.m106855m().m44110V0(new x20() { // from class: l.cx50
                    @Override // p153l.x20
                    public final void call() {
                        bx50.C16128c.m106868a(this.f84175a, recyclerView);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.bx50$d */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, m88121d2 = {"l/bx50$d", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "a", "I", "SCROLL_ITEM_COUNT", "", "b", "Z", "isScrollingToBottom", "c", "pullUpDisable", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16129d extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int SCROLL_ITEM_COUNT = 10;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GridLayoutManager f78843d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ bx50 f78844e;

        public C16129d(GridLayoutManager gridLayoutManager, bx50 bx50Var) {
            this.f78843d = gridLayoutManager;
            this.f78844e = bx50Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindLastVisibleItemPosition = this.f78843d.findLastVisibleItemPosition();
                if (this.isScrollingToBottom && !this.pullUpDisable && iFindLastVisibleItemPosition == this.SCROLL_ITEM_COUNT - 1) {
                    if (joa.m146363O3()) {
                        return;
                    }
                    this.pullUpDisable = true;
                    this.f78844e.m106855m().m44107R0();
                    return;
                }
                int childCount = this.f78843d.getChildCount();
                if (!this.isScrollingToBottom || this.pullUpDisable || childCount <= 0 || iFindLastVisibleItemPosition < this.f78843d.getItemCount() - 1 || this.f78843d.getItemCount() < childCount || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1) || joa.m146363O3()) {
                    return;
                }
                this.pullUpDisable = true;
                this.f78844e.m106855m().m44107R0();
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

    public bx50(@NotNull OnlineZoneFrag onlineZoneFrag) {
        onlineZoneFrag.getClass();
        this.frag = onlineZoneFrag;
        this.showingRadar = C22507a.m222759c(Boolean.TRUE);
        Act act = onlineZoneFrag.act();
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: B */
    private final void m106828B() {
        bnl0.m105509E0(m106861v(), new View.OnClickListener() { // from class: l.ww50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bx50.m106836d(this.f191156a, view);
            }
        });
        bnl0.m105509E0(m106840A(), new View.OnClickListener() { // from class: l.xw50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bx50.m106834b(this.f196459a, view);
            }
        });
        bnl0.m105509E0(m106857p(), new View.OnClickListener() { // from class: l.yw50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bx50.m106838f(this.f201788a, view);
            }
        });
        this.frag.m44062R4().m141658N(new C16126a());
    }

    /* JADX INFO: renamed from: C */
    public static final void m106829C(bx50 bx50Var, PurchaseType purchaseType) {
        bx50Var.m106855m().m44112Y0();
    }

    /* JADX INFO: renamed from: E */
    public static final void m106830E(bx50 bx50Var, PurchaseType purchaseType) {
        bx50Var.m106855m().m44112Y0();
    }

    /* JADX INFO: renamed from: G */
    private final void m106831G() {
        VPullDownRefreshLayout vPullDownRefreshLayoutM106859s = m106859s();
        vPullDownRefreshLayoutM106859s.m225003I(true);
        vPullDownRefreshLayoutM106859s.m225001G(false);
        vPullDownRefreshLayoutM106859s.mo224405O(new jn50() { // from class: l.vw50
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                bx50.m106832H(this.f186065a, mvc0Var);
            }
        });
        VPullUpRecyclerView vPullUpRecyclerViewM106858q = m106858q();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 2);
        gridLayoutManager.m3327v(new C16127b(gridLayoutManager));
        if (CoreModule.m30933P().m143410g().mo36020Ki()) {
            vPullUpRecyclerViewM106858q.addOnScrollListener(new C16128c(gridLayoutManager, this));
        } else {
            vPullUpRecyclerViewM106858q.addOnScrollListener(new C16129d(gridLayoutManager, this));
        }
        vPullUpRecyclerViewM106858q.setLayoutManager(gridLayoutManager);
        vPullUpRecyclerViewM106858q.setAdapter(this.frag.m44062R4());
    }

    /* JADX INFO: renamed from: H */
    public static final void m106832H(bx50 bx50Var, mvc0 mvc0Var) {
        mvc0Var.getClass();
        bx50Var.m106855m().m44109U0(null, true);
    }

    /* JADX INFO: renamed from: b */
    public static void m106834b(bx50 bx50Var, View view) {
        bx50Var.m106855m().m44108S0();
    }

    /* JADX INFO: renamed from: d */
    public static void m106836d(bx50 bx50Var, View view) {
        bx50Var.m106855m().m44112Y0();
    }

    /* JADX INFO: renamed from: f */
    public static void m106838f(final bx50 bx50Var, View view) {
        if (CoreModule.m30933P().m143410g().mo36007D9()) {
            CoreModule.m30933P().m143405a().mo34575qm(bx50Var.act, "p_home_nearby,online", Privilege.nearby_people, new y20() { // from class: l.zw50
                @Override // p153l.y20
                public final void call(Object obj) {
                    bx50.m106829C(this.f206322a, (PurchaseType) obj);
                }
            });
        } else if (CoreModule.m30933P().m143410g().mo36053bg()) {
            CoreModule.m30933P().m143410g().mo36009Ds(bx50Var.act, "p_home_nearby,online", Privilege.nearby_people, new y20() { // from class: l.ax50
                @Override // p153l.y20
                public final void call(Object obj) {
                    bx50.m106830E(this.f73818a, (PurchaseType) obj);
                }
            }, null);
        } else {
            bx50Var.m106855m().m44107R0();
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m106839r() {
        m106841F();
        m106831G();
        m106828B();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VButton m106840A() {
        VButton vButton = this._rl_loading_setting;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_rl_loading_setting");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: F */
    public final void m106841F() {
        m106865z().setRadarColor(App.f16088e.getResources().getColor(f9c0.f97859d));
        this.radarAnimator = lny.m155033b(m106865z(), m106864y());
        bnl0.m105524M(m106856n(), false);
        bnl0.m105524M(m106860u(), false);
        bnl0.m105524M(m106862w(), true);
    }

    /* JADX INFO: renamed from: I */
    public final void m106842I() {
        Animator animator;
        if (m106862w().getVisibility() == 0 && this.showingRadar.m222761e().booleanValue() && (animator = this.radarAnimator) != null) {
            animator.start();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m106843J() {
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m106844K(@NotNull List<? extends User> list, boolean hasPrivilege) {
        list.getClass();
        this.hasPrivilege = hasPrivilege;
        if (hasPrivilege) {
            VPullUpRecyclerView vPullUpRecyclerViewM106858q = m106858q();
            int i = qa00.f156318e;
            vPullUpRecyclerViewM106858q.setPadding(i, i, i, qa00.f156330q);
        } else {
            VPullUpRecyclerView vPullUpRecyclerViewM106858q2 = m106858q();
            int i2 = qa00.f156318e;
            vPullUpRecyclerViewM106858q2.setPadding(i2, i2, i2, qa00.f156298K);
        }
        this.showingRadar.onNext(Boolean.FALSE);
        Animator animator = this.radarAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (CoreModule.m30933P().m143410g().mo36053bg()) {
            m106857p().setText("成为白金会员");
            m106857p().setTextColor(-1);
            m106857p().setBackgroundResource(gbc0.f103301g);
            bnl0.m105524M(m106857p(), !hasPrivilege);
        } else if (CoreModule.m30933P().m143410g().mo36007D9()) {
            m106857p().setText(this.frag.getText(R$string.f21308B));
            m106857p().setTextColor(-1);
            m106857p().setBackgroundResource(gbc0.f103077A5);
            bnl0.m105524M(m106857p(), !hasPrivilege);
        } else {
            bnl0.m105524M(m106857p(), !hasPrivilege);
        }
        bnl0.m105524M(m106856n(), true);
        bnl0.m105524M(m106862w(), false);
        bnl0.m105524M(m106860u(), false);
        this.frag.m44062R4().m141657M(list, hasPrivilege);
    }

    /* JADX INFO: renamed from: L */
    public final void m106845L() {
        bnl0.m105524M(m106862w(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m106842I();
        m106863x().setText("正在努力帮您寻找附近的人...");
        m106840A().setVisibility(4);
        bnl0.m105524M(m106860u(), false);
        bnl0.m105524M(m106856n(), false);
    }

    /* JADX INFO: renamed from: M */
    public final void m106846M() {
        this.showingRadar.onNext(Boolean.FALSE);
        bnl0.m105524M(m106862w(), false);
        bnl0.m105524M(m106860u(), true);
        bnl0.m105524M(m106856n(), false);
    }

    /* JADX INFO: renamed from: N */
    public final void m106847N() {
        this.showingRadar.onNext(Boolean.TRUE);
        bnl0.m105524M(m106856n(), false);
        bnl0.m105524M(m106860u(), false);
        bnl0.m105524M(m106862w(), true);
        m106842I();
        m106863x().setText("正在努力帮您寻找附近的人...");
        m106840A().setVisibility(4);
    }

    /* JADX INFO: renamed from: O */
    public final void m106848O() {
        bnl0.m105524M(m106862w(), true);
        this.showingRadar.onNext(Boolean.TRUE);
        m106863x().setText("当前无法获取您的位置信息， \n请在手机设置中打开");
        m106840A().setVisibility(0);
        bnl0.m105524M(m106860u(), false);
        bnl0.m105524M(m106856n(), false);
    }

    /* JADX INFO: renamed from: P */
    public final void m106849P(@NotNull Picture p) {
        p.getClass();
        uqb0.f180374G.m127096B0(m106864y(), p.profile480());
    }

    /* JADX INFO: renamed from: Q */
    public final void m106850Q(@NotNull OnlineZonePresenter onlineZonePresenter) {
        onlineZonePresenter.getClass();
        this.onlinePresenter = onlineZonePresenter;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m106851i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM123013b = ex50.m123013b(this, inflater, parent);
        viewM123013b.getClass();
        return viewM123013b;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM106851i = m106851i(inflater, parent);
        m106839r();
        return viewM106851i;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull OnlineZonePresenter presenter) {
        presenter.getClass();
        m106850Q(presenter);
    }

    /* JADX INFO: renamed from: k */
    public final void m106853k() {
        m106859s().m225021t();
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final OnlineZoneFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final OnlineZonePresenter m106855m() {
        OnlineZonePresenter onlineZonePresenter = this.onlinePresenter;
        if (onlineZonePresenter != null) {
            return onlineZonePresenter;
        }
        Intrinsics.m88391r("onlinePresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final FrameLayout m106856n() {
        FrameLayout frameLayout = this._fl_content_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_fl_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TextView m106857p() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VPullUpRecyclerView m106858q() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VPullDownRefreshLayout m106859s() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.m88391r("_refresh");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final RelativeLayout m106860u() {
        RelativeLayout relativeLayout = this._rl_error_view;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_rl_error_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VButton m106861v() {
        VButton vButton = this._rl_error_view_reload;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_rl_error_view_reload");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final RelativeLayout m106862w() {
        RelativeLayout relativeLayout = this._rl_loading;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_rl_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m106863x() {
        VText vText = this._rl_loading_describe;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_rl_loading_describe");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VDraweeView m106864y() {
        VDraweeView vDraweeView = this._rl_loading_radar_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_rl_loading_radar_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final RadarRipple m106865z() {
        RadarRipple radarRipple = this._rl_loading_radar_ripple;
        if (radarRipple != null) {
            return radarRipple;
        }
        Intrinsics.m88391r("_rl_loading_radar_ripple");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
