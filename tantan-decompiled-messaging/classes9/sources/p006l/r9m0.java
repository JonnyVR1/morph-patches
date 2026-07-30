package p006l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
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
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.AbstractC0481a;
import com.p000p1.mobile.putong.core.p004ui.visitor.C0482b;
import com.p000p1.mobile.putong.core.p004ui.visitor.C0486f;
import com.p000p1.mobile.putong.core.p004ui.visitor.VisitorsFilterBar;
import com.p000p1.mobile.putong.core.p004ui.visitor.visitorsme.VisitorsMeFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.VisitorFilterSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.b3c0;
import l.d30;
import l.df50;
import l.e30;
import l.e51;
import l.hnc0;
import l.j760;
import l.l80;
import l.o6j0;
import l.s7m;
import l.s9m0;
import l.t100;
import l.vwb;
import l.w7c0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VPullDownRefreshLayout;
import v.VPullUpRecyclerView;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b&\u0010\u000fJ\u001d\u0010'\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\f¢\u0006\u0004\b-\u0010\u000fJ#\u00102\u001a\u00020\t2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00101\u001a\u00020\f¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010\u000fJ\u0017\u00107\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010\u000bJ\u0011\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010@R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010{\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010r\u001a\u0004\by\u0010t\"\u0004\bz\u0010vR\"\u0010\u007f\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u0010J\u001a\u0004\b}\u0010L\"\u0004\b~\u0010NR*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u009f\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010£\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010\u008a\u0001\u001a\u0006\b¡\u0001\u0010\u008c\u0001\"\u0006\b¢\u0001\u0010\u008e\u0001R)\u0010¦\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b \u0010\u008a\u0001\u001a\u0006\b¤\u0001\u0010\u008c\u0001\"\u0006\b¥\u0001\u0010\u008e\u0001R)\u0010\u00ad\u0001\u001a\u00030§\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b#\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R&\u0010±\u0001\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b®\u0001\u0010b\u001a\u0005\b¯\u0001\u0010d\"\u0005\b°\u0001\u0010fR(\u0010·\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0019\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R*\u0010¿\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R\u0017\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b-\u0010À\u0001R\u0019\u0010Ã\u0001\u001a\u00030Á\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b}\u0010Â\u0001R\u001c\u0010Æ\u0001\u001a\u0007\u0012\u0002\b\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010Å\u0001¨\u0006Ç\u0001"}, d2 = {"Ll/r9m0;", "Ll/s7m;", "Ll/i9m0;", "Ll/df50;", "Ll/w7m;", "Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "visitorsMeFrag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;)V", "", "O", "()V", "", "hideNavigation", "W", "(Z)V", "visitorPermission", "Y", "U", "(ZZ)V", "P", "show", "V", "T", "X", "s", "c0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "p", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "q", "(Ll/i9m0;)V", "inflateView", "Q", "R", "Ll/hnc0;", "refreshLayout", "w2", "(Ll/hnc0;)V", "success", "u", "", "Ll/y5m0;", "visitorItems", "loading", "S", "(Ljava/util/List;Z)V", "b", "", "from", "Z", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "a", "()Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "Lv/navigationbar/VNavigationBar;", "Lv/navigationbar/VNavigationBar;", "F", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VLinear;", "c", "Lv/VLinear;", "N", "()Lv/VLinear;", "set_visitors_ll", "(Lv/VLinear;)V", "_visitors_ll", "Lv/VPullDownRefreshLayout;", "d", "Lv/VPullDownRefreshLayout;", "L", "()Lv/VPullDownRefreshLayout;", "set_swipe_refresh", "(Lv/VPullDownRefreshLayout;)V", "_swipe_refresh", "Lv/VPullUpRecyclerView;", "e", "Lv/VPullUpRecyclerView;", "M", "()Lv/VPullUpRecyclerView;", "set_visitors", "(Lv/VPullUpRecyclerView;)V", "_visitors", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "K", "()Landroid/widget/FrameLayout;", "set_privilege", "(Landroid/widget/FrameLayout;)V", "_privilege", "Landroid/widget/LinearLayout;", "g", "Landroid/widget/LinearLayout;", "B", "()Landroid/widget/LinearLayout;", "set_get_privilege", "(Landroid/widget/LinearLayout;)V", "_get_privilege", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "C", "()Landroid/widget/TextView;", "set_get_privilege_button", "(Landroid/widget/TextView;)V", "_get_privilege_button", "i", "E", "set_get_privilege_info", "_get_privilege_info", "j", "v", "set_empty", "_empty", "Lv/VDraweeView;", "k", "Lv/VDraweeView;", "w", "()Lv/VDraweeView;", "set_empty_empty_img", "(Lv/VDraweeView;)V", "_empty_empty_img", "Lv/VText;", "l", "Lv/VText;", "x", "()Lv/VText;", "set_empty_empty_tv", "(Lv/VText;)V", "_empty_empty_tv", "Lv/VRelative;", "m", "Lv/VRelative;", "G", "()Lv/VRelative;", "set_no_permission", "(Lv/VRelative;)V", "_no_permission", "Lv/VImage;", "n", "Lv/VImage;", "get_permission_img", "()Lv/VImage;", "set_permission_img", "(Lv/VImage;)V", "_permission_img", "o", "I", "set_permission_subtitle", "_permission_subtitle", "J", "set_permission_tv", "_permission_tv", "Lv/VButton;", "Lv/VButton;", "H", "()Lv/VButton;", "set_permission_btn", "(Lv/VButton;)V", "_permission_btn", "r", "A", "set_filter_bar_root", "_filter_bar_root", "Landroid/view/View;", "z", "()Landroid/view/View;", "set_filter_bar_foreground", "(Landroid/view/View;)V", "_filter_bar_foreground", "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;", "t", "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;", "y", "()Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;", "set_filter_bar", "(Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;)V", "_filter_bar", "Ll/i9m0;", "Lcom/p1/mobile/putong/core/ui/visitor/a;", "Lcom/p1/mobile/putong/core/ui/visitor/a;", "adapter", "Ll/l80;", "Ll/l80;", "visitorAdapterStatics", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public AbstractC0481a adapter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final l80<?> visitorAdapterStatics;

    /* JADX INFO: renamed from: l.r9m0$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"l/r9m0$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1212a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VPullUpRecyclerView f20448a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f20449b;

        public C1212a(VPullUpRecyclerView vPullUpRecyclerView, GridLayoutManager gridLayoutManager) {
            this.f20448a = vPullUpRecyclerView;
            this.f20449b = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m22781f(int position) {
            RecyclerView.Adapter adapter = this.f20448a.getAdapter();
            adapter.getClass();
            int itemViewType = adapter.getItemViewType(position);
            if (itemViewType == 0 || itemViewType == 3) {
                return this.f20449b.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.r9m0$b */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"l/r9m0$b", "Ll/l80;", "Ll/y5m0;", "item", "", "index", "", "s", "(Ll/y5m0;I)V", "data", "", "time", "t", "(Ll/y5m0;IJ)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1213b extends l80<y5m0> {
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final void m22782j(y5m0 item, int index) {
            item.getClass();
            if (item.m28088c()) {
                zvf0.A("e_moment_visitor_detail", "p_my_visitor", new j760[]{j760.a("moment_visitor_type", item.m28086a()), j760.a("owner_id", item.f28034b.userId)});
            }
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void m22783l(y5m0 data, int index, long time) {
            data.getClass();
        }
    }

    public r9m0(@NotNull VisitorsMeFrag visitorsMeFrag) {
        visitorsMeFrag.getClass();
        this.visitorsMeFrag = visitorsMeFrag;
        this.visitorAdapterStatics = new C1213b();
    }

    /* JADX INFO: renamed from: O */
    private final void m22733O() {
        if (CoreModule.m1854P().m11706a().m5386Y9()) {
            m22745B().setBackgroundResource(b3c0.O5);
            m22746C().setTextColor(Color.parseColor("#E8CB8C"));
            m22748E().setTextColor(Color.parseColor("#CCE8CB8C"));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m22734a0(r9m0 r9m0Var) {
        i9m0 i9m0Var = r9m0Var.presenter;
        if (i9m0Var == null) {
            Intrinsics.r("presenter");
            i9m0Var = null;
        }
        i9m0Var.getData();
    }

    /* JADX INFO: renamed from: c */
    public static void m22735c(r9m0 r9m0Var) {
        if (xma.m27351F3()) {
            return;
        }
        LinearLayoutManager layoutManager = r9m0Var.m22756M().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || layoutManager.findFirstCompletelyVisibleItemPosition() <= 0) {
            return;
        }
        r9m0Var.m22768Z("p_navigation_visit,button_pull");
    }

    /* JADX INFO: renamed from: d */
    public static void m22736d(r9m0 r9m0Var, View view) {
        o6j0.c("e_visitor_unlock", "p_my_visitor", new o6j0.a[0]);
        r9m0Var.m22768Z("p_navigation_visit,button_pull");
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m22737d0(r9m0 r9m0Var, boolean z) {
        i9m0 i9m0Var = r9m0Var.presenter;
        if (i9m0Var == null) {
            Intrinsics.r("presenter");
            i9m0Var = null;
        }
        i9m0Var.m16554D0(z);
    }

    /* JADX INFO: renamed from: e */
    public static void m22738e(final r9m0 r9m0Var, PurchaseType purchaseType) {
        e51.H(r9m0Var.act(), new Runnable() { // from class: l.o9m0
            @Override // java.lang.Runnable
            public final void run() {
                r9m0.m22734a0(this.f18085a);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: f */
    public static void m22739f(r9m0 r9m0Var, View view) {
        if (CoreModule.m1854P().m11706a().m5386Y9()) {
            zvf0.r("e_my_visitor_set", "p_my_visitor");
        } else {
            zvf0.r("e_moment_visitor_set", "p_my_visitor");
        }
        r9m0Var.m22769c0();
    }

    /* JADX INFO: renamed from: l */
    public static void m22741l(r9m0 r9m0Var, View view) {
        zvf0.r("e_moment_visitor_set_on", "p_moment_visitor_set");
        i9m0 i9m0Var = r9m0Var.presenter;
        if (i9m0Var == null) {
            Intrinsics.r("presenter");
            i9m0Var = null;
        }
        i9m0Var.m16554D0(true);
    }

    /* JADX INFO: renamed from: n */
    public static void m22743n(r9m0 r9m0Var, View view) {
        r9m0Var.m22779y().m11301g();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final FrameLayout m22744A() {
        FrameLayout frameLayout = this._filter_bar_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_filter_bar_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LinearLayout m22745B() {
        LinearLayout linearLayout = this._get_privilege;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final TextView m22746C() {
        TextView textView = this._get_privilege_button;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_get_privilege_button");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22747C0() {
        return this.visitorsMeFrag.getContext();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final TextView m22748E() {
        TextView textView = this._get_privilege_info;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_get_privilege_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VNavigationBar m22749F() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VRelative m22750G() {
        VRelative vRelative = this._no_permission;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.r("_no_permission");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VButton m22751H() {
        VButton vButton = this._permission_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_permission_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VText m22752I() {
        VText vText = this._permission_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_permission_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m22753J() {
        VText vText = this._permission_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_permission_tv");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final FrameLayout m22754K() {
        FrameLayout frameLayout = this._privilege;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VPullDownRefreshLayout m22755L() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._swipe_refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.r("_swipe_refresh");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VPullUpRecyclerView m22756M() {
        VPullUpRecyclerView vPullUpRecyclerView = this._visitors;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.r("_visitors");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VLinear m22757N() {
        VLinear vLinear = this._visitors_ll;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_visitors_ll");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m22758P(boolean hideNavigation) {
        if (hideNavigation) {
            xdl0.X(m22757N(), 0);
        }
        m22755L().O(this);
        RecyclerView.Adapter adapter = null;
        if (CoreModule.m1854P().m11706a().m5386Y9()) {
            Act act = act();
            i9m0 i9m0Var = this.presenter;
            if (i9m0Var == null) {
                Intrinsics.r("presenter");
                i9m0Var = null;
            }
            this.adapter = new C0486f(act, i9m0Var, this.visitorAdapterStatics);
            VPullUpRecyclerView vPullUpRecyclerViewM22756M = m22756M();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 2);
            gridLayoutManager.v(new C1212a(vPullUpRecyclerViewM22756M, gridLayoutManager));
            vPullUpRecyclerViewM22756M.setLayoutManager(gridLayoutManager);
            VPullUpRecyclerView vPullUpRecyclerViewM22756M2 = m22756M();
            int i = t100.e;
            vPullUpRecyclerViewM22756M2.setPadding(i, i, i, 0);
        } else {
            Act act2 = act();
            i9m0 i9m0Var2 = this.presenter;
            if (i9m0Var2 == null) {
                Intrinsics.r("presenter");
                i9m0Var2 = null;
            }
            this.adapter = new C0482b(act2, i9m0Var2, this.visitorAdapterStatics);
        }
        VPullUpRecyclerView vPullUpRecyclerViewM22756M3 = m22756M();
        RecyclerView.Adapter adapter2 = this.adapter;
        if (adapter2 == null) {
            Intrinsics.r("adapter");
        } else {
            adapter = adapter2;
        }
        vPullUpRecyclerViewM22756M3.setAdapter(adapter);
        m22756M().setOnPullUpListener(new d30() { // from class: l.k9m0
            public final void call() {
                r9m0.m22735c(this.f15672a);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m22759Q(boolean hideNavigation) {
        m22765W(hideNavigation);
        m22758P(hideNavigation);
        m22733O();
        boolean zM22251L3 = CoreModule.f1534c.f3657n2.m22251L3();
        m22767Y(zM22251L3);
        m22764V(zM22251L3);
        m22763U(hideNavigation, zM22251L3);
        m22766X(hideNavigation, zM22251L3);
    }

    /* JADX INFO: renamed from: R */
    public final void m22760R(boolean hideNavigation, boolean visitorPermission) {
        m22767Y(visitorPermission);
        m22764V(visitorPermission);
        m22763U(hideNavigation, visitorPermission);
        m22766X(hideNavigation, visitorPermission);
        if (!visitorPermission) {
            m22762T(false);
            return;
        }
        i9m0 i9m0Var = this.presenter;
        if (i9m0Var == null) {
            Intrinsics.r("presenter");
            i9m0Var = null;
        }
        i9m0Var.m16553C0();
    }

    /* JADX INFO: renamed from: S */
    public final void m22761S(@NotNull List<? extends y5m0> visitorItems, boolean loading) {
        visitorItems.getClass();
        AbstractC0481a abstractC0481a = null;
        if (vwb.J(visitorItems)) {
            if (!loading) {
                m22762T(true);
            }
            m22764V(false);
            AbstractC0481a abstractC0481a2 = this.adapter;
            if (abstractC0481a2 == null) {
                Intrinsics.r("adapter");
            } else {
                abstractC0481a = abstractC0481a2;
            }
            abstractC0481a.mo11373E(visitorItems);
            xdl0.M(m22757N(), false);
            return;
        }
        m22762T(false);
        xdl0.M(m22757N(), true);
        m22764V(CoreModule.f1534c.f3657n2.m22251L3());
        m22773s();
        AbstractC0481a abstractC0481a3 = this.adapter;
        if (abstractC0481a3 == null) {
            Intrinsics.r("adapter");
        } else {
            abstractC0481a = abstractC0481a3;
        }
        abstractC0481a.mo11373E(visitorItems);
    }

    /* JADX INFO: renamed from: T */
    public final void m22762T(boolean show) {
        if (!show) {
            xdl0.M(m22775v(), false);
            return;
        }
        xdl0.M(m22775v(), true);
        qib0.f19782G.m12767Y0(m22776w(), b3c0.N5);
        m22778x().setText("没有符合条件的访客");
    }

    /* JADX INFO: renamed from: U */
    public final void m22763U(boolean hideNavigation, boolean visitorPermission) {
        int iD = hideNavigation ? 0 : t100.d(44.0f);
        if (!xma.m27351F3() || !visitorPermission) {
            xdl0.M(m22744A(), false);
            ViewGroup.LayoutParams layoutParams = m22757N().getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.topMargin != iD) {
                marginLayoutParams.topMargin = iD;
                m22757N().setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        xdl0.M(m22744A(), true);
        ViewGroup.LayoutParams layoutParams2 = m22744A().getLayoutParams();
        layoutParams2.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (marginLayoutParams2.topMargin != iD) {
            marginLayoutParams2.topMargin = iD;
            m22744A().setLayoutParams(marginLayoutParams2);
        }
        m22779y().m11302h(this);
        ViewGroup.LayoutParams layoutParams3 = m22757N().getLayoutParams();
        layoutParams3.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        int iD2 = t100.d(59.0f) + iD;
        if (marginLayoutParams3.topMargin != iD2) {
            marginLayoutParams3.topMargin = iD2;
            m22757N().setLayoutParams(marginLayoutParams3);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m22764V(boolean show) {
        if (xma.m27351F3() || !show) {
            xdl0.M(m22754K(), false);
            return;
        }
        xdl0.M(m22754K(), true);
        o6j0.h("e_visitor_unlock", "p_my_visitor", new o6j0.a[0]);
        xdl0.E0(m22745B(), new View.OnClickListener() { // from class: l.n9m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r9m0.m22736d(this.f17548a, view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final void m22765W(boolean hideNavigation) {
        if (hideNavigation) {
            xdl0.M(m22749F(), false);
            return;
        }
        xdl0.M(m22749F(), true);
        Act act = act();
        if (act != null) {
            m22749F().setLeftIconAsBack(act);
        }
        m22749F().setTitle("我的访客");
    }

    /* JADX INFO: renamed from: X */
    public final void m22766X(boolean hideNavigation, boolean visitorPermission) {
        if (visitorPermission) {
            xdl0.M(m22750G(), false);
            xdl0.M(m22757N(), true);
            return;
        }
        xdl0.X(m22750G(), hideNavigation ? 0 : t100.d(44.0f));
        AbstractC0481a abstractC0481a = null;
        m22752I().setTypeface((Typeface) null, 1);
        m22752I().setText("开启后可查看谁看过我");
        m22753J().setText("·记录仅展示同样已开启的用户\n·你查看他人也会留下记录");
        m22751H().setTypeface(null, 1);
        m22751H().setText("开启访客");
        xdl0.E0(m22751H(), new View.OnClickListener() { // from class: l.m9m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r9m0.m22741l(this.f16875a, view);
            }
        });
        xdl0.M(m22750G(), true);
        xdl0.M(m22757N(), false);
        AbstractC0481a abstractC0481a2 = this.adapter;
        if (abstractC0481a2 == null) {
            Intrinsics.r("adapter");
        } else {
            abstractC0481a = abstractC0481a2;
        }
        abstractC0481a.mo11373E(CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: Y */
    public final void m22767Y(boolean visitorPermission) {
        if (!visitorPermission) {
            m22749F().B();
            return;
        }
        ImageView imageView = new ImageView(act());
        imageView.setImageResource(b3c0.P5);
        m22749F().setRightIconViews(new View[]{imageView});
        if (!CoreModule.m1854P().m11706a().m5386Y9()) {
            zvf0.x("e_moment_visitor_set", "p_my_visitor");
        }
        xdl0.E0(imageView, new View.OnClickListener() { // from class: l.j9m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r9m0.m22739f(this.f15080a, view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m22768Z(@Nullable String from) {
        CoreModule.m1854P().m11711g().m6958Og(act(), from, new e30() { // from class: l.l9m0
            public final void call(Object obj) {
                r9m0.m22738e(this.f16293a, (PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
    }

    @Override // p006l.w7m
    @NotNull
    /* JADX INFO: renamed from: a */
    public VisitorFilterSettings mo11463a() {
        i9m0 i9m0Var = this.presenter;
        if (i9m0Var == null) {
            Intrinsics.r("presenter");
            i9m0Var = null;
        }
        return i9m0Var.getCurrentVisitorFilterSettings();
    }

    @Override // p006l.w7m
    /* JADX INFO: renamed from: b */
    public void mo11464b(boolean show) {
        if (show) {
            m22780z().setOnClickListener(new View.OnClickListener() { // from class: l.q9m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r9m0.m22743n(this.f19687a, view);
                }
            });
            xdl0.M0(m22780z(), true);
            return;
        }
        i9m0 i9m0Var = this.presenter;
        i9m0 i9m0Var2 = null;
        if (i9m0Var == null) {
            Intrinsics.r("presenter");
            i9m0Var = null;
        }
        if (i9m0Var.m16564x0()) {
            m22756M().scrollToPosition(0);
            i9m0 i9m0Var3 = this.presenter;
            if (i9m0Var3 == null) {
                Intrinsics.r("presenter");
                i9m0Var3 = null;
            }
            i9m0Var3.m16559I0();
            i9m0 i9m0Var4 = this.presenter;
            if (i9m0Var4 == null) {
                Intrinsics.r("presenter");
            } else {
                i9m0Var2 = i9m0Var4;
            }
            i9m0Var2.m16553C0();
        }
        xdl0.M0(m22780z(), false);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m22769c0() {
        Act act = act();
        if (act != null) {
            new g6m0(act, w7c0.e, true).m15620t(new e30() { // from class: l.p9m0
                public final void call(Object obj) {
                    r9m0.m22737d0(this.f18642a, ((Boolean) obj).booleanValue());
                }
            }).show();
        }
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m22771p(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final View m22771p(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = s9m0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m22770i1(@NotNull i9m0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: s */
    public final void m22773s() {
        if (CoreModule.m1854P().m11706a().m5386Y9()) {
            if (!xma.m27351F3()) {
                if (m22756M().getPaddingBottom() != 0) {
                    m22756M().setPadding(m22756M().getPaddingLeft(), m22756M().getPaddingTop(), m22756M().getPaddingRight(), 0);
                }
            } else {
                int paddingBottom = m22756M().getPaddingBottom();
                int i = t100.m;
                if (paddingBottom != i) {
                    m22756M().setPadding(m22756M().getPaddingLeft(), m22756M().getPaddingTop(), m22756M().getPaddingRight(), i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m22774u(boolean success) {
        m22755L().w(success);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VLinear m22775v() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VDraweeView m22776w() {
        VDraweeView vDraweeView = this._empty_empty_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_empty_empty_img");
        return null;
    }

    /* JADX INFO: renamed from: w2 */
    public void m22777w2(@NotNull hnc0 refreshLayout) {
        refreshLayout.getClass();
        i9m0 i9m0Var = this.presenter;
        if (i9m0Var == null) {
            Intrinsics.r("presenter");
            i9m0Var = null;
        }
        i9m0Var.m16553C0();
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m22778x() {
        VText vText = this._empty_empty_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_empty_empty_tv");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VisitorsFilterBar m22779y() {
        VisitorsFilterBar visitorsFilterBar = this._filter_bar;
        if (visitorsFilterBar != null) {
            return visitorsFilterBar;
        }
        Intrinsics.r("_filter_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final View m22780z() {
        View view = this._filter_bar_foreground;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_filter_bar_foreground");
        return null;
    }

    public void destroy() {
    }
}
