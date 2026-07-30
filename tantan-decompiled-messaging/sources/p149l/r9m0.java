package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p046p1.mobile.putong.core.p053ui.visitor.AbstractC9045a;
import com.p046p1.mobile.putong.core.p053ui.visitor.C9046b;
import com.p046p1.mobile.putong.core.p053ui.visitor.C9050f;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFilterBar;
import com.p046p1.mobile.putong.core.p053ui.visitor.visitorsme.VisitorsMeFrag;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VPullUpRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b&\u0010\u000fJ\u001d\u0010'\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\f¢\u0006\u0004\b-\u0010\u000fJ#\u00102\u001a\u00020\t2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00101\u001a\u00020\f¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010\u000fJ\u0017\u00107\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010\u000bJ\u0011\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010@R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010{\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010r\u001a\u0004\by\u0010t\"\u0004\bz\u0010vR\"\u0010\u007f\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u0010J\u001a\u0004\b}\u0010L\"\u0004\b~\u0010NR*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u009f\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010£\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010\u008a\u0001\u001a\u0006\b¡\u0001\u0010\u008c\u0001\"\u0006\b¢\u0001\u0010\u008e\u0001R)\u0010¦\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b \u0010\u008a\u0001\u001a\u0006\b¤\u0001\u0010\u008c\u0001\"\u0006\b¥\u0001\u0010\u008e\u0001R)\u0010\u00ad\u0001\u001a\u00030§\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b#\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R&\u0010±\u0001\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b®\u0001\u0010b\u001a\u0005\b¯\u0001\u0010d\"\u0005\b°\u0001\u0010fR(\u0010·\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0019\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R*\u0010¿\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R\u0017\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b-\u0010À\u0001R\u0019\u0010Ã\u0001\u001a\u00030Á\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b}\u0010Â\u0001R\u001c\u0010Æ\u0001\u001a\u0007\u0012\u0002\b\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010Å\u0001¨\u0006Ç\u0001"}, m87232d2 = {"Ll/r9m0;", "Ll/s7m;", "Ll/i9m0;", "Ll/df50;", "Ll/w7m;", "Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "visitorsMeFrag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;)V", "", BloodType.f38728O, "()V", "", "hideNavigation", "W", "(Z)V", "visitorPermission", "Y", "U", "(ZZ)V", "P", "show", j6f.GPS_MEASUREMENT_INTERRUPTED, j6f.GPS_DIRECTION_TRUE, "X", BLiveStormDanmakuGiftResourceType.f44446s, "c0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "p", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "q", "(Ll/i9m0;)V", "inflateView", "Q", "R", "Ll/hnc0;", "refreshLayout", "w2", "(Ll/hnc0;)V", "success", "u", "", "Ll/y5m0;", "visitorItems", "loading", j6f.LATITUDE_SOUTH, "(Ljava/util/List;Z)V", "b", "", "from", "Z", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "a", "()Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "Lv/navigationbar/VNavigationBar;", "Lv/navigationbar/VNavigationBar;", "F", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VLinear;", "c", "Lv/VLinear;", "N", "()Lv/VLinear;", "set_visitors_ll", "(Lv/VLinear;)V", "_visitors_ll", "Lv/VPullDownRefreshLayout;", Constants.INAPP_DATA_TAG, "Lv/VPullDownRefreshLayout;", "L", "()Lv/VPullDownRefreshLayout;", "set_swipe_refresh", "(Lv/VPullDownRefreshLayout;)V", "_swipe_refresh", "Lv/VPullUpRecyclerView;", "e", "Lv/VPullUpRecyclerView;", "M", "()Lv/VPullUpRecyclerView;", "set_visitors", "(Lv/VPullUpRecyclerView;)V", "_visitors", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "K", "()Landroid/widget/FrameLayout;", "set_privilege", "(Landroid/widget/FrameLayout;)V", "_privilege", "Landroid/widget/LinearLayout;", "g", "Landroid/widget/LinearLayout;", "B", "()Landroid/widget/LinearLayout;", "set_get_privilege", "(Landroid/widget/LinearLayout;)V", "_get_privilege", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", b2s.C_ZONE, "()Landroid/widget/TextView;", "set_get_privilege_button", "(Landroid/widget/TextView;)V", "_get_privilege_button", RXScreenCaptureService.KEY_INDEX, "E", "set_get_privilege_info", "_get_privilege_info", "j", ResourceDirection.f38808v, "set_empty", "_empty", "Lv/VDraweeView;", "k", "Lv/VDraweeView;", "w", "()Lv/VDraweeView;", "set_empty_empty_img", "(Lv/VDraweeView;)V", "_empty_empty_img", "Lv/VText;", BLiveStormDanmakuGiftResourceType.f44444l, "Lv/VText;", BaseSei.f13930X, "()Lv/VText;", "set_empty_empty_tv", "(Lv/VText;)V", "_empty_empty_tv", "Lv/VRelative;", "m", "Lv/VRelative;", "G", "()Lv/VRelative;", "set_no_permission", "(Lv/VRelative;)V", "_no_permission", "Lv/VImage;", "n", "Lv/VImage;", "get_permission_img", "()Lv/VImage;", "set_permission_img", "(Lv/VImage;)V", "_permission_img", "o", "I", "set_permission_subtitle", "_permission_subtitle", "J", "set_permission_tv", "_permission_tv", "Lv/VButton;", "Lv/VButton;", "H", "()Lv/VButton;", "set_permission_btn", "(Lv/VButton;)V", "_permission_btn", "r", "A", "set_filter_bar_root", "_filter_bar_root", "Landroid/view/View;", BaseSei.f13932Z, "()Landroid/view/View;", "set_filter_bar_foreground", "(Landroid/view/View;)V", "_filter_bar_foreground", "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;", Constants.KEY_T, "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;", BaseSei.f13931Y, "()Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;", "set_filter_bar", "(Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;)V", "_filter_bar", "Ll/i9m0;", "Lcom/p1/mobile/putong/core/ui/visitor/a;", "Lcom/p1/mobile/putong/core/ui/visitor/a;", "adapter", "Ll/l80;", "Ll/l80;", "visitorAdapterStatics", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class r9m0 implements s7m<i9m0>, df50, w7m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final VisitorsMeFrag visitorsMeFrag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VLinear _visitors_ll;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VPullDownRefreshLayout _swipe_refresh;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VPullUpRecyclerView _visitors;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public FrameLayout _privilege;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public LinearLayout _get_privilege;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _get_privilege_button;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView _get_privilege_info;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VDraweeView _empty_empty_img;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _empty_empty_tv;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VRelative _no_permission;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _permission_img;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _permission_subtitle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VText _permission_tv;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VButton _permission_btn;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public FrameLayout _filter_bar_root;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public View _filter_bar_foreground;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VisitorsFilterBar _filter_bar;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public i9m0 presenter;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public AbstractC9045a adapter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final l80<?> visitorAdapterStatics;

    /* JADX INFO: renamed from: l.r9m0$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"l/r9m0$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19657a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VPullUpRecyclerView f158419a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f158420b;

        public C19657a(VPullUpRecyclerView vPullUpRecyclerView, GridLayoutManager gridLayoutManager) {
            this.f158419a = vPullUpRecyclerView;
            this.f158420b = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int position) {
            RecyclerView.Adapter adapter = this.f158419a.getAdapter();
            adapter.getClass();
            int itemViewType = adapter.getItemViewType(position);
            if (itemViewType == 0 || itemViewType == 3) {
                return this.f158420b.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.r9m0$b */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"l/r9m0$b", "Ll/l80;", "Ll/y5m0;", Item.TYPE, "", FirebaseAnalytics.Param.INDEX, "", BLiveStormDanmakuGiftResourceType.f44446s, "(Ll/y5m0;I)V", "data", "", "time", Constants.KEY_T, "(Ll/y5m0;IJ)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19658b extends l80<y5m0> {
        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final void mo55695j(y5m0 item, int index) {
            item.getClass();
            if (item.m213003c()) {
                zvf0.m220368A("e_moment_visitor_detail", "p_my_visitor", j760.m140076a("moment_visitor_type", item.m213001a()), j760.m140076a("owner_id", item.f196455b.userId));
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void mo57958l(y5m0 data, int index, long time) {
            data.getClass();
        }
    }

    public r9m0(@NotNull VisitorsMeFrag visitorsMeFrag) {
        visitorsMeFrag.getClass();
        this.visitorsMeFrag = visitorsMeFrag;
        this.visitorAdapterStatics = new C19658b();
    }

    /* JADX INFO: renamed from: O */
    private final void m178411O() {
        if (CoreModule.m29935P().m94651a().mo33449Y9()) {
            m178423B().setBackgroundResource(b3c0.f72924O5);
            m178424C().setTextColor(Color.parseColor("#E8CB8C"));
            m178425E().setTextColor(Color.parseColor("#CCE8CB8C"));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m178412a0(r9m0 r9m0Var) {
        i9m0 i9m0Var = r9m0Var.presenter;
        if (i9m0Var == null) {
            Intrinsics.m87502r("presenter");
            i9m0Var = null;
        }
        i9m0Var.getData();
    }

    /* JADX INFO: renamed from: c */
    public static void m178413c(r9m0 r9m0Var) {
        if (xma.m210043F3()) {
            return;
        }
        RecyclerView.AbstractC0577o layoutManager = r9m0Var.m178433M().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() <= 0) {
            return;
        }
        r9m0Var.m178445Z("p_navigation_visit,button_pull");
    }

    /* JADX INFO: renamed from: d */
    public static void m178414d(r9m0 r9m0Var, View view) {
        o6j0.m162859c("e_visitor_unlock", "p_my_visitor", new o6j0.C18854a[0]);
        r9m0Var.m178445Z("p_navigation_visit,button_pull");
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m178415d0(r9m0 r9m0Var, boolean z) {
        i9m0 i9m0Var = r9m0Var.presenter;
        if (i9m0Var == null) {
            Intrinsics.m87502r("presenter");
            i9m0Var = null;
        }
        i9m0Var.m135076D0(z);
    }

    /* JADX INFO: renamed from: e */
    public static void m178416e(final r9m0 r9m0Var, PurchaseType purchaseType) {
        e51.m114743H(r9m0Var.getAct(), new Runnable() { // from class: l.o9m0
            @Override // java.lang.Runnable
            public final void run() {
                r9m0.m178412a0(this.f142725a);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: f */
    public static void m178417f(r9m0 r9m0Var, View view) {
        if (CoreModule.m29935P().m94651a().mo33449Y9()) {
            zvf0.m220396r("e_my_visitor_set", "p_my_visitor");
        } else {
            zvf0.m220396r("e_moment_visitor_set", "p_my_visitor");
        }
        r9m0Var.m178446c0();
    }

    /* JADX INFO: renamed from: l */
    public static void m178419l(r9m0 r9m0Var, View view) {
        zvf0.m220396r("e_moment_visitor_set_on", "p_moment_visitor_set");
        i9m0 i9m0Var = r9m0Var.presenter;
        if (i9m0Var == null) {
            Intrinsics.m87502r("presenter");
            i9m0Var = null;
        }
        i9m0Var.m135076D0(true);
    }

    /* JADX INFO: renamed from: n */
    public static void m178421n(r9m0 r9m0Var, View view) {
        r9m0Var.m178454y().m57800g();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final FrameLayout m178422A() {
        FrameLayout frameLayout = this._filter_bar_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_filter_bar_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LinearLayout m178423B() {
        LinearLayout linearLayout = this._get_privilege;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final TextView m178424C() {
        TextView textView = this._get_privilege_button;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_get_privilege_button");
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.visitorsMeFrag.getContext();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final TextView m178425E() {
        TextView textView = this._get_privilege_info;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_get_privilege_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VNavigationBar m178426F() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VRelative m178427G() {
        VRelative vRelative = this._no_permission;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m87502r("_no_permission");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VButton m178428H() {
        VButton vButton = this._permission_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_permission_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VText m178429I() {
        VText vText = this._permission_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_permission_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m178430J() {
        VText vText = this._permission_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_permission_tv");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final FrameLayout m178431K() {
        FrameLayout frameLayout = this._privilege;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VPullDownRefreshLayout m178432L() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._swipe_refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.m87502r("_swipe_refresh");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VPullUpRecyclerView m178433M() {
        VPullUpRecyclerView vPullUpRecyclerView = this._visitors;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_visitors");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VLinear m178434N() {
        VLinear vLinear = this._visitors_ll;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_visitors_ll");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m178435P(boolean hideNavigation) {
        if (hideNavigation) {
            xdl0.m208360X(m178434N(), 0);
        }
        m178432L().mo223159O(this);
        AbstractC9045a abstractC9045a = null;
        if (CoreModule.m29935P().m94651a().mo33449Y9()) {
            Act act = getAct();
            i9m0 i9m0Var = this.presenter;
            if (i9m0Var == null) {
                Intrinsics.m87502r("presenter");
                i9m0Var = null;
            }
            this.adapter = new C9050f(act, i9m0Var, this.visitorAdapterStatics);
            VPullUpRecyclerView vPullUpRecyclerViewM178433M = m178433M();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getAct(), 2);
            gridLayoutManager.m3326v(new C19657a(vPullUpRecyclerViewM178433M, gridLayoutManager));
            vPullUpRecyclerViewM178433M.setLayoutManager(gridLayoutManager);
            VPullUpRecyclerView vPullUpRecyclerViewM178433M2 = m178433M();
            int i = t100.f167256e;
            vPullUpRecyclerViewM178433M2.setPadding(i, i, i, 0);
        } else {
            Act act2 = getAct();
            i9m0 i9m0Var2 = this.presenter;
            if (i9m0Var2 == null) {
                Intrinsics.m87502r("presenter");
                i9m0Var2 = null;
            }
            this.adapter = new C9046b(act2, i9m0Var2, this.visitorAdapterStatics);
        }
        VPullUpRecyclerView vPullUpRecyclerViewM178433M3 = m178433M();
        AbstractC9045a abstractC9045a2 = this.adapter;
        if (abstractC9045a2 == null) {
            Intrinsics.m87502r("adapter");
        } else {
            abstractC9045a = abstractC9045a2;
        }
        vPullUpRecyclerViewM178433M3.setAdapter(abstractC9045a);
        m178433M().setOnPullUpListener(new d30() { // from class: l.k9m0
            @Override // p149l.d30
            public final void call() {
                r9m0.m178413c(this.f122050a);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m178436Q(boolean hideNavigation) {
        m178442W(hideNavigation);
        m178435P(hideNavigation);
        m178411O();
        boolean zM175435L3 = CoreModule.f17545c.f19668n2.m175435L3();
        m178444Y(zM175435L3);
        m178441V(zM175435L3);
        m178440U(hideNavigation, zM175435L3);
        m178443X(hideNavigation, zM175435L3);
    }

    /* JADX INFO: renamed from: R */
    public final void m178437R(boolean hideNavigation, boolean visitorPermission) {
        m178444Y(visitorPermission);
        m178441V(visitorPermission);
        m178440U(hideNavigation, visitorPermission);
        m178443X(hideNavigation, visitorPermission);
        if (!visitorPermission) {
            m178439T(false);
            return;
        }
        i9m0 i9m0Var = this.presenter;
        if (i9m0Var == null) {
            Intrinsics.m87502r("presenter");
            i9m0Var = null;
        }
        i9m0Var.m135075C0();
    }

    /* JADX INFO: renamed from: S */
    public final void m178438S(@NotNull List<? extends y5m0> visitorItems, boolean loading) {
        visitorItems.getClass();
        AbstractC9045a abstractC9045a = null;
        if (vwb.m200296J(visitorItems)) {
            if (!loading) {
                m178439T(true);
            }
            m178441V(false);
            AbstractC9045a abstractC9045a2 = this.adapter;
            if (abstractC9045a2 == null) {
                Intrinsics.m87502r("adapter");
            } else {
                abstractC9045a = abstractC9045a2;
            }
            abstractC9045a.mo57864E(visitorItems);
            xdl0.m208344M(m178434N(), false);
            return;
        }
        m178439T(false);
        xdl0.m208344M(m178434N(), true);
        m178441V(CoreModule.f17545c.f19668n2.m175435L3());
        m178449s();
        AbstractC9045a abstractC9045a3 = this.adapter;
        if (abstractC9045a3 == null) {
            Intrinsics.m87502r("adapter");
        } else {
            abstractC9045a = abstractC9045a3;
        }
        abstractC9045a.mo57864E(visitorItems);
    }

    /* JADX INFO: renamed from: T */
    public final void m178439T(boolean show) {
        if (!show) {
            xdl0.m208344M(m178451v(), false);
            return;
        }
        xdl0.m208344M(m178451v(), true);
        qib0.f154691G.m102354Y0(m178452w(), b3c0.f72917N5);
        m178453x().setText("没有符合条件的访客");
    }

    /* JADX INFO: renamed from: U */
    public final void m178440U(boolean hideNavigation, boolean visitorPermission) {
        int iM186890d = hideNavigation ? 0 : t100.m186890d(44.0f);
        if (!xma.m210043F3() || !visitorPermission) {
            xdl0.m208344M(m178422A(), false);
            ViewGroup.LayoutParams layoutParams = m178434N().getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.topMargin != iM186890d) {
                marginLayoutParams.topMargin = iM186890d;
                m178434N().setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        xdl0.m208344M(m178422A(), true);
        ViewGroup.LayoutParams layoutParams2 = m178422A().getLayoutParams();
        layoutParams2.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (marginLayoutParams2.topMargin != iM186890d) {
            marginLayoutParams2.topMargin = iM186890d;
            m178422A().setLayoutParams(marginLayoutParams2);
        }
        m178454y().m57801h(this);
        ViewGroup.LayoutParams layoutParams3 = m178434N().getLayoutParams();
        layoutParams3.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        int iM186890d2 = t100.m186890d(59.0f) + iM186890d;
        if (marginLayoutParams3.topMargin != iM186890d2) {
            marginLayoutParams3.topMargin = iM186890d2;
            m178434N().setLayoutParams(marginLayoutParams3);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m178441V(boolean show) {
        if (xma.m210043F3() || !show) {
            xdl0.m208344M(m178431K(), false);
            return;
        }
        xdl0.m208344M(m178431K(), true);
        o6j0.m162864h("e_visitor_unlock", "p_my_visitor", new o6j0.C18854a[0]);
        xdl0.m208329E0(m178423B(), new View.OnClickListener() { // from class: l.n9m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r9m0.m178414d(this.f137815a, view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final void m178442W(boolean hideNavigation) {
        if (hideNavigation) {
            xdl0.m208344M(m178426F(), false);
            return;
        }
        xdl0.m208344M(m178426F(), true);
        Act act = getAct();
        if (act != null) {
            m178426F().setLeftIconAsBack(act);
        }
        m178426F().setTitle("我的访客");
    }

    /* JADX INFO: renamed from: X */
    public final void m178443X(boolean hideNavigation, boolean visitorPermission) {
        if (visitorPermission) {
            xdl0.m208344M(m178427G(), false);
            xdl0.m208344M(m178434N(), true);
            return;
        }
        xdl0.m208360X(m178427G(), hideNavigation ? 0 : t100.m186890d(44.0f));
        AbstractC9045a abstractC9045a = null;
        m178429I().setTypeface(null, 1);
        m178429I().setText("开启后可查看谁看过我");
        m178430J().setText("·记录仅展示同样已开启的用户\n·你查看他人也会留下记录");
        m178428H().setTypeface(null, 1);
        m178428H().setText("开启访客");
        xdl0.m208329E0(m178428H(), new View.OnClickListener() { // from class: l.m9m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r9m0.m178419l(this.f132785a, view);
            }
        });
        xdl0.m208344M(m178427G(), true);
        xdl0.m208344M(m178434N(), false);
        AbstractC9045a abstractC9045a2 = this.adapter;
        if (abstractC9045a2 == null) {
            Intrinsics.m87502r("adapter");
        } else {
            abstractC9045a = abstractC9045a2;
        }
        abstractC9045a.mo57864E(CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: Y */
    public final void m178444Y(boolean visitorPermission) {
        if (!visitorPermission) {
            m178426F().m223584B();
            return;
        }
        ImageView imageView = new ImageView(getAct());
        imageView.setImageResource(b3c0.f72931P5);
        m178426F().setRightIconViews(imageView);
        if (!CoreModule.m29935P().m94651a().mo33449Y9()) {
            zvf0.m220402x("e_moment_visitor_set", "p_my_visitor");
        }
        xdl0.m208329E0(imageView, new View.OnClickListener() { // from class: l.j9m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r9m0.m178417f(this.f116939a, view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m178445Z(@Nullable String from) {
        CoreModule.m29935P().m94656g().mo35021Og(getAct(), from, new e30() { // from class: l.l9m0
            @Override // p149l.e30
            public final void call(Object obj) {
                r9m0.m178416e(this.f127131a, (PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
    }

    @Override // p149l.w7m
    @NotNull
    /* JADX INFO: renamed from: a */
    public VisitorFilterSettings mo57948a() {
        i9m0 i9m0Var = this.presenter;
        if (i9m0Var == null) {
            Intrinsics.m87502r("presenter");
            i9m0Var = null;
        }
        return i9m0Var.getCurrentVisitorFilterSettings();
    }

    @Override // p149l.w7m
    /* JADX INFO: renamed from: b */
    public void mo57949b(boolean show) {
        if (show) {
            m178455z().setOnClickListener(new View.OnClickListener() { // from class: l.q9m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r9m0.m178421n(this.f153448a, view);
                }
            });
            xdl0.m208345M0(m178455z(), true);
            return;
        }
        i9m0 i9m0Var = this.presenter;
        i9m0 i9m0Var2 = null;
        if (i9m0Var == null) {
            Intrinsics.m87502r("presenter");
            i9m0Var = null;
        }
        if (i9m0Var.m135084x0()) {
            m178433M().scrollToPosition(0);
            i9m0 i9m0Var3 = this.presenter;
            if (i9m0Var3 == null) {
                Intrinsics.m87502r("presenter");
                i9m0Var3 = null;
            }
            i9m0Var3.m135081I0();
            i9m0 i9m0Var4 = this.presenter;
            if (i9m0Var4 == null) {
                Intrinsics.m87502r("presenter");
            } else {
                i9m0Var2 = i9m0Var4;
            }
            i9m0Var2.m135075C0();
        }
        xdl0.m208345M0(m178455z(), false);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m178446c0() {
        Act act = getAct();
        if (act != null) {
            new g6m0(act, w7c0.f185042e, true).m124610t(new e30() { // from class: l.p9m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    r9m0.m178415d0(this.f147777a, ((Boolean) obj).booleanValue());
                }
            }).show();
        }
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m178447p(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final View m178447p(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM182736b = s9m0.m182736b(this, inflater, parent);
        viewM182736b.getClass();
        return viewM182736b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull i9m0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: s */
    public final void m178449s() {
        if (CoreModule.m29935P().m94651a().mo33449Y9()) {
            if (!xma.m210043F3()) {
                if (m178433M().getPaddingBottom() != 0) {
                    m178433M().setPadding(m178433M().getPaddingLeft(), m178433M().getPaddingTop(), m178433M().getPaddingRight(), 0);
                }
            } else {
                int paddingBottom = m178433M().getPaddingBottom();
                int i = t100.f167264m;
                if (paddingBottom != i) {
                    m178433M().setPadding(m178433M().getPaddingLeft(), m178433M().getPaddingTop(), m178433M().getPaddingRight(), i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m178450u(boolean success) {
        m178432L().m223778w(success);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VLinear m178451v() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VDraweeView m178452w() {
        VDraweeView vDraweeView = this._empty_empty_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_empty_empty_img");
        return null;
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NotNull hnc0 refreshLayout) {
        refreshLayout.getClass();
        i9m0 i9m0Var = this.presenter;
        if (i9m0Var == null) {
            Intrinsics.m87502r("presenter");
            i9m0Var = null;
        }
        i9m0Var.m135075C0();
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m178453x() {
        VText vText = this._empty_empty_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_empty_empty_tv");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VisitorsFilterBar m178454y() {
        VisitorsFilterBar visitorsFilterBar = this._filter_bar;
        if (visitorsFilterBar != null) {
            return visitorsFilterBar;
        }
        Intrinsics.m87502r("_filter_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final View m178455z() {
        View view = this._filter_bar_foreground;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_filter_bar_foreground");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
