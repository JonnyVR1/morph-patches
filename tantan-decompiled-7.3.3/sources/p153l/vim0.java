package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p051p1.mobile.putong.core.p058ui.visitor.AbstractC9208a;
import com.p051p1.mobile.putong.core.p058ui.visitor.C9209b;
import com.p051p1.mobile.putong.core.p058ui.visitor.C9213f;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsFilterBar;
import com.p051p1.mobile.putong.core.p058ui.visitor.visitorsme.VisitorsMeFrag;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VPullUpRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b&\u0010\u000fJ\u001d\u0010'\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\f¢\u0006\u0004\b-\u0010\u000fJ#\u00102\u001a\u00020\t2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00101\u001a\u00020\f¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010\u000fJ\u0017\u00107\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010\u000bJ\u0011\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010@R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010{\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010r\u001a\u0004\by\u0010t\"\u0004\bz\u0010vR\"\u0010\u007f\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u0010J\u001a\u0004\b}\u0010L\"\u0004\b~\u0010NR*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u009f\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010£\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010\u008a\u0001\u001a\u0006\b¡\u0001\u0010\u008c\u0001\"\u0006\b¢\u0001\u0010\u008e\u0001R)\u0010¦\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b \u0010\u008a\u0001\u001a\u0006\b¤\u0001\u0010\u008c\u0001\"\u0006\b¥\u0001\u0010\u008e\u0001R)\u0010\u00ad\u0001\u001a\u00030§\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b#\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R&\u0010±\u0001\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b®\u0001\u0010b\u001a\u0005\b¯\u0001\u0010d\"\u0005\b°\u0001\u0010fR(\u0010·\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0019\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R*\u0010¿\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R\u0017\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b-\u0010À\u0001R\u0019\u0010Ã\u0001\u001a\u00030Á\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b}\u0010Â\u0001R\u001c\u0010Æ\u0001\u001a\u0007\u0012\u0002\b\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010Å\u0001¨\u0006Ç\u0001"}, m88121d2 = {"Ll/vim0;", "Ll/iam;", "Ll/mim0;", "Ll/jn50;", "Ll/mam;", "Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "visitorsMeFrag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;)V", "", BloodType.f39576O, "()V", "", "hideNavigation", "W", "(Z)V", "visitorPermission", "Y", "U", "(ZZ)V", "P", "show", p7f.GPS_MEASUREMENT_INTERRUPTED, p7f.GPS_DIRECTION_TRUE, "X", BLiveStormDanmakuGiftResourceType.f45294s, "c0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "p", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "q", "(Ll/mim0;)V", "inflateView", "Q", "R", "Ll/mvc0;", "refreshLayout", "w2", "(Ll/mvc0;)V", "success", "u", "", "Ll/cfm0;", "visitorItems", "loading", p7f.LATITUDE_SOUTH, "(Ljava/util/List;Z)V", "b", "", "from", "Z", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "a", "()Lcom/p1/mobile/putong/core/data/VisitorFilterSettings;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "Lv/navigationbar/VNavigationBar;", "Lv/navigationbar/VNavigationBar;", "F", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VLinear;", "c", "Lv/VLinear;", "N", "()Lv/VLinear;", "set_visitors_ll", "(Lv/VLinear;)V", "_visitors_ll", "Lv/VPullDownRefreshLayout;", Constants.INAPP_DATA_TAG, "Lv/VPullDownRefreshLayout;", "L", "()Lv/VPullDownRefreshLayout;", "set_swipe_refresh", "(Lv/VPullDownRefreshLayout;)V", "_swipe_refresh", "Lv/VPullUpRecyclerView;", "e", "Lv/VPullUpRecyclerView;", "M", "()Lv/VPullUpRecyclerView;", "set_visitors", "(Lv/VPullUpRecyclerView;)V", "_visitors", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "K", "()Landroid/widget/FrameLayout;", "set_privilege", "(Landroid/widget/FrameLayout;)V", "_privilege", "Landroid/widget/LinearLayout;", "g", "Landroid/widget/LinearLayout;", "B", "()Landroid/widget/LinearLayout;", "set_get_privilege", "(Landroid/widget/LinearLayout;)V", "_get_privilege", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", c4s.C_ZONE, "()Landroid/widget/TextView;", "set_get_privilege_button", "(Landroid/widget/TextView;)V", "_get_privilege_button", RXScreenCaptureService.KEY_INDEX, "E", "set_get_privilege_info", "_get_privilege_info", "j", ResourceDirection.f39656v, "set_empty", "_empty", "Lv/VDraweeView;", "k", "Lv/VDraweeView;", "w", "()Lv/VDraweeView;", "set_empty_empty_img", "(Lv/VDraweeView;)V", "_empty_empty_img", "Lv/VText;", BLiveStormDanmakuGiftResourceType.f45292l, "Lv/VText;", BaseSei.f14624X, "()Lv/VText;", "set_empty_empty_tv", "(Lv/VText;)V", "_empty_empty_tv", "Lv/VRelative;", "m", "Lv/VRelative;", "G", "()Lv/VRelative;", "set_no_permission", "(Lv/VRelative;)V", "_no_permission", "Lv/VImage;", "n", "Lv/VImage;", "get_permission_img", "()Lv/VImage;", "set_permission_img", "(Lv/VImage;)V", "_permission_img", "o", "I", "set_permission_subtitle", "_permission_subtitle", "J", "set_permission_tv", "_permission_tv", "Lv/VButton;", "Lv/VButton;", "H", "()Lv/VButton;", "set_permission_btn", "(Lv/VButton;)V", "_permission_btn", "r", "A", "set_filter_bar_root", "_filter_bar_root", "Landroid/view/View;", BaseSei.f14626Z, "()Landroid/view/View;", "set_filter_bar_foreground", "(Landroid/view/View;)V", "_filter_bar_foreground", "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;", Constants.KEY_T, "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;", BaseSei.f14625Y, "()Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;", "set_filter_bar", "(Lcom/p1/mobile/putong/core/ui/visitor/VisitorsFilterBar;)V", "_filter_bar", "Ll/mim0;", "Lcom/p1/mobile/putong/core/ui/visitor/a;", "Lcom/p1/mobile/putong/core/ui/visitor/a;", "adapter", "Ll/h80;", "Ll/h80;", "visitorAdapterStatics", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class vim0 implements iam<mim0>, jn50, mam {

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
    public mim0 presenter;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public AbstractC9208a adapter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final h80<?> visitorAdapterStatics;

    /* JADX INFO: renamed from: l.vim0$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"l/vim0$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20842a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VPullUpRecyclerView f184281a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f184282b;

        public C20842a(VPullUpRecyclerView vPullUpRecyclerView, GridLayoutManager gridLayoutManager) {
            this.f184281a = vPullUpRecyclerView;
            this.f184282b = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            RecyclerView.Adapter adapter = this.f184281a.getAdapter();
            adapter.getClass();
            int itemViewType = adapter.getItemViewType(position);
            if (itemViewType == 0 || itemViewType == 3) {
                return this.f184282b.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.vim0$b */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"l/vim0$b", "Ll/h80;", "Ll/cfm0;", Item.TYPE, "", FirebaseAnalytics.Param.INDEX, "", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/cfm0;I)V", "data", "", "time", Constants.KEY_T, "(Ll/cfm0;IJ)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20843b extends h80<cfm0> {
        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final void mo56878j(cfm0 item, int index) {
            item.getClass();
            if (item.m109547c()) {
                i4g0.m138492A("e_moment_visitor_detail", "p_my_visitor", pf60.m172085a("moment_visitor_type", item.m109545a()), pf60.m172085a("owner_id", item.f81524b.userId));
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void mo59141l(cfm0 data, int index, long time) {
            data.getClass();
        }
    }

    public vim0(@NotNull VisitorsMeFrag visitorsMeFrag) {
        visitorsMeFrag.getClass();
        this.visitorsMeFrag = visitorsMeFrag;
        this.visitorAdapterStatics = new C20843b();
    }

    /* JADX INFO: renamed from: O */
    private final void m201357O() {
        if (CoreModule.m30933P().m143405a().mo34452Y9()) {
            m201369B().setBackgroundResource(gbc0.f103175O5);
            m201370C().setTextColor(Color.parseColor("#E8CB8C"));
            m201371E().setTextColor(Color.parseColor("#CCE8CB8C"));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m201358a0(vim0 vim0Var) {
        mim0 mim0Var = vim0Var.presenter;
        if (mim0Var == null) {
            Intrinsics.m88391r("presenter");
            mim0Var = null;
        }
        mim0Var.getData();
    }

    /* JADX INFO: renamed from: c */
    public static void m201359c(vim0 vim0Var) {
        if (joa.m146357G3()) {
            return;
        }
        RecyclerView.AbstractC0579o layoutManager = vim0Var.m201379M().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() <= 0) {
            return;
        }
        vim0Var.m201391Z("p_navigation_visit,button_pull");
    }

    /* JADX INFO: renamed from: d */
    public static void m201360d(vim0 vim0Var, View view) {
        sfj0.m185596c("e_visitor_unlock", "p_my_visitor", new sfj0.C20032a[0]);
        vim0Var.m201391Z("p_navigation_visit,button_pull");
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m201361d0(vim0 vim0Var, boolean z) {
        mim0 mim0Var = vim0Var.presenter;
        if (mim0Var == null) {
            Intrinsics.m88391r("presenter");
            mim0Var = null;
        }
        mim0Var.m158541D0(z);
    }

    /* JADX INFO: renamed from: e */
    public static void m201362e(final vim0 vim0Var, PurchaseType purchaseType) {
        l51.m152888H(vim0Var.getAct(), new Runnable() { // from class: l.sim0
            @Override // java.lang.Runnable
            public final void run() {
                vim0.m201358a0(this.f168853a);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: f */
    public static void m201363f(vim0 vim0Var, View view) {
        if (CoreModule.m30933P().m143405a().mo34452Y9()) {
            i4g0.m138520r("e_my_visitor_set", "p_my_visitor");
        } else {
            i4g0.m138520r("e_moment_visitor_set", "p_my_visitor");
        }
        vim0Var.m201392c0();
    }

    /* JADX INFO: renamed from: l */
    public static void m201365l(vim0 vim0Var, View view) {
        i4g0.m138520r("e_moment_visitor_set_on", "p_moment_visitor_set");
        mim0 mim0Var = vim0Var.presenter;
        if (mim0Var == null) {
            Intrinsics.m88391r("presenter");
            mim0Var = null;
        }
        mim0Var.m158541D0(true);
    }

    /* JADX INFO: renamed from: n */
    public static void m201367n(vim0 vim0Var, View view) {
        vim0Var.m201400y().m58983g();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final FrameLayout m201368A() {
        FrameLayout frameLayout = this._filter_bar_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_filter_bar_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LinearLayout m201369B() {
        LinearLayout linearLayout = this._get_privilege;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final TextView m201370C() {
        TextView textView = this._get_privilege_button;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_get_privilege_button");
        return null;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.visitorsMeFrag.getContext();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final TextView m201371E() {
        TextView textView = this._get_privilege_info;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_get_privilege_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VNavigationBar m201372F() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VRelative m201373G() {
        VRelative vRelative = this._no_permission;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m88391r("_no_permission");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VButton m201374H() {
        VButton vButton = this._permission_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_permission_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VText m201375I() {
        VText vText = this._permission_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_permission_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m201376J() {
        VText vText = this._permission_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_permission_tv");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final FrameLayout m201377K() {
        FrameLayout frameLayout = this._privilege;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VPullDownRefreshLayout m201378L() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._swipe_refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.m88391r("_swipe_refresh");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VPullUpRecyclerView m201379M() {
        VPullUpRecyclerView vPullUpRecyclerView = this._visitors;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m88391r("_visitors");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VLinear m201380N() {
        VLinear vLinear = this._visitors_ll;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_visitors_ll");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m201381P(boolean hideNavigation) {
        if (hideNavigation) {
            bnl0.m105540X(m201380N(), 0);
        }
        m201378L().mo224405O(this);
        AbstractC9208a abstractC9208a = null;
        if (CoreModule.m30933P().m143405a().mo34452Y9()) {
            Act act = getAct();
            mim0 mim0Var = this.presenter;
            if (mim0Var == null) {
                Intrinsics.m88391r("presenter");
                mim0Var = null;
            }
            this.adapter = new C9213f(act, mim0Var, this.visitorAdapterStatics);
            VPullUpRecyclerView vPullUpRecyclerViewM201379M = m201379M();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getAct(), 2);
            gridLayoutManager.m3327v(new C20842a(vPullUpRecyclerViewM201379M, gridLayoutManager));
            vPullUpRecyclerViewM201379M.setLayoutManager(gridLayoutManager);
            VPullUpRecyclerView vPullUpRecyclerViewM201379M2 = m201379M();
            int i = qa00.f156318e;
            vPullUpRecyclerViewM201379M2.setPadding(i, i, i, 0);
        } else {
            Act act2 = getAct();
            mim0 mim0Var2 = this.presenter;
            if (mim0Var2 == null) {
                Intrinsics.m88391r("presenter");
                mim0Var2 = null;
            }
            this.adapter = new C9209b(act2, mim0Var2, this.visitorAdapterStatics);
        }
        VPullUpRecyclerView vPullUpRecyclerViewM201379M3 = m201379M();
        AbstractC9208a abstractC9208a2 = this.adapter;
        if (abstractC9208a2 == null) {
            Intrinsics.m88391r("adapter");
        } else {
            abstractC9208a = abstractC9208a2;
        }
        vPullUpRecyclerViewM201379M3.setAdapter(abstractC9208a);
        m201379M().setOnPullUpListener(new x20() { // from class: l.oim0
            @Override // p153l.x20
            public final void call() {
                vim0.m201359c(this.f147556a);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m201382Q(boolean hideNavigation) {
        m201388W(hideNavigation);
        m201381P(hideNavigation);
        m201357O();
        boolean zM121466L3 = CoreModule.f18264c.f20410n2.m121466L3();
        m201390Y(zM121466L3);
        m201387V(zM121466L3);
        m201386U(hideNavigation, zM121466L3);
        m201389X(hideNavigation, zM121466L3);
    }

    /* JADX INFO: renamed from: R */
    public final void m201383R(boolean hideNavigation, boolean visitorPermission) {
        m201390Y(visitorPermission);
        m201387V(visitorPermission);
        m201386U(hideNavigation, visitorPermission);
        m201389X(hideNavigation, visitorPermission);
        if (!visitorPermission) {
            m201385T(false);
            return;
        }
        mim0 mim0Var = this.presenter;
        if (mim0Var == null) {
            Intrinsics.m88391r("presenter");
            mim0Var = null;
        }
        mim0Var.m158540C0();
    }

    /* JADX INFO: renamed from: S */
    public final void m201384S(@NotNull List<? extends cfm0> visitorItems, boolean loading) {
        visitorItems.getClass();
        AbstractC9208a abstractC9208a = null;
        if (jyb.m147479J(visitorItems)) {
            if (!loading) {
                m201385T(true);
            }
            m201387V(false);
            AbstractC9208a abstractC9208a2 = this.adapter;
            if (abstractC9208a2 == null) {
                Intrinsics.m88391r("adapter");
            } else {
                abstractC9208a = abstractC9208a2;
            }
            abstractC9208a.mo59047E(visitorItems);
            bnl0.m105524M(m201380N(), false);
            return;
        }
        m201385T(false);
        bnl0.m105524M(m201380N(), true);
        m201387V(CoreModule.f18264c.f20410n2.m121466L3());
        m201395s();
        AbstractC9208a abstractC9208a3 = this.adapter;
        if (abstractC9208a3 == null) {
            Intrinsics.m88391r("adapter");
        } else {
            abstractC9208a = abstractC9208a3;
        }
        abstractC9208a.mo59047E(visitorItems);
    }

    /* JADX INFO: renamed from: T */
    public final void m201385T(boolean show) {
        if (!show) {
            bnl0.m105524M(m201397v(), false);
            return;
        }
        bnl0.m105524M(m201397v(), true);
        uqb0.f180374G.m127138Y0(m201398w(), gbc0.f103168N5);
        m201399x().setText("没有符合条件的访客");
    }

    /* JADX INFO: renamed from: U */
    public final void m201386U(boolean hideNavigation, boolean visitorPermission) {
        int iM175859d = hideNavigation ? 0 : qa00.m175859d(44.0f);
        if (!joa.m146357G3() || !visitorPermission) {
            bnl0.m105524M(m201368A(), false);
            ViewGroup.LayoutParams layoutParams = m201380N().getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.topMargin != iM175859d) {
                marginLayoutParams.topMargin = iM175859d;
                m201380N().setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        bnl0.m105524M(m201368A(), true);
        ViewGroup.LayoutParams layoutParams2 = m201368A().getLayoutParams();
        layoutParams2.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (marginLayoutParams2.topMargin != iM175859d) {
            marginLayoutParams2.topMargin = iM175859d;
            m201368A().setLayoutParams(marginLayoutParams2);
        }
        m201400y().m58984h(this);
        ViewGroup.LayoutParams layoutParams3 = m201380N().getLayoutParams();
        layoutParams3.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        int iM175859d2 = qa00.m175859d(59.0f) + iM175859d;
        if (marginLayoutParams3.topMargin != iM175859d2) {
            marginLayoutParams3.topMargin = iM175859d2;
            m201380N().setLayoutParams(marginLayoutParams3);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m201387V(boolean show) {
        if (joa.m146357G3() || !show) {
            bnl0.m105524M(m201377K(), false);
            return;
        }
        bnl0.m105524M(m201377K(), true);
        sfj0.m185601h("e_visitor_unlock", "p_my_visitor", new sfj0.C20032a[0]);
        bnl0.m105509E0(m201369B(), new View.OnClickListener() { // from class: l.rim0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vim0.m201360d(this.f163379a, view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final void m201388W(boolean hideNavigation) {
        if (hideNavigation) {
            bnl0.m105524M(m201372F(), false);
            return;
        }
        bnl0.m105524M(m201372F(), true);
        Act act = getAct();
        if (act != null) {
            m201372F().setLeftIconAsBack(act);
        }
        m201372F().setTitle("我的访客");
    }

    /* JADX INFO: renamed from: X */
    public final void m201389X(boolean hideNavigation, boolean visitorPermission) {
        if (visitorPermission) {
            bnl0.m105524M(m201373G(), false);
            bnl0.m105524M(m201380N(), true);
            return;
        }
        bnl0.m105540X(m201373G(), hideNavigation ? 0 : qa00.m175859d(44.0f));
        AbstractC9208a abstractC9208a = null;
        m201375I().setTypeface(null, 1);
        m201375I().setText("开启后可查看谁看过我");
        m201376J().setText("·记录仅展示同样已开启的用户\n·你查看他人也会留下记录");
        m201374H().setTypeface(null, 1);
        m201374H().setText("开启访客");
        bnl0.m105509E0(m201374H(), new View.OnClickListener() { // from class: l.qim0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vim0.m201365l(this.f157851a, view);
            }
        });
        bnl0.m105524M(m201373G(), true);
        bnl0.m105524M(m201380N(), false);
        AbstractC9208a abstractC9208a2 = this.adapter;
        if (abstractC9208a2 == null) {
            Intrinsics.m88391r("adapter");
        } else {
            abstractC9208a = abstractC9208a2;
        }
        abstractC9208a.mo59047E(CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: Y */
    public final void m201390Y(boolean visitorPermission) {
        if (!visitorPermission) {
            m201372F().m224830B();
            return;
        }
        ImageView imageView = new ImageView(getAct());
        imageView.setImageResource(gbc0.f103182P5);
        m201372F().setRightIconViews(imageView);
        if (!CoreModule.m30933P().m143405a().mo34452Y9()) {
            i4g0.m138526x("e_moment_visitor_set", "p_my_visitor");
        }
        bnl0.m105509E0(imageView, new View.OnClickListener() { // from class: l.nim0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vim0.m201363f(this.f142140a, view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m201391Z(@Nullable String from) {
        CoreModule.m30933P().m143410g().mo36024Og(getAct(), from, new y20() { // from class: l.pim0
            @Override // p153l.y20
            public final void call(Object obj) {
                vim0.m201362e(this.f152546a, (PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
    }

    @Override // p153l.mam
    @NotNull
    /* JADX INFO: renamed from: a */
    public VisitorFilterSettings mo59131a() {
        mim0 mim0Var = this.presenter;
        if (mim0Var == null) {
            Intrinsics.m88391r("presenter");
            mim0Var = null;
        }
        return mim0Var.getCurrentVisitorFilterSettings();
    }

    @Override // p153l.mam
    /* JADX INFO: renamed from: b */
    public void mo59132b(boolean show) {
        if (show) {
            m201401z().setOnClickListener(new View.OnClickListener() { // from class: l.uim0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vim0.m201367n(this.f179134a, view);
                }
            });
            bnl0.m105525M0(m201401z(), true);
            return;
        }
        mim0 mim0Var = this.presenter;
        mim0 mim0Var2 = null;
        if (mim0Var == null) {
            Intrinsics.m88391r("presenter");
            mim0Var = null;
        }
        if (mim0Var.m158549x0()) {
            m201379M().scrollToPosition(0);
            mim0 mim0Var3 = this.presenter;
            if (mim0Var3 == null) {
                Intrinsics.m88391r("presenter");
                mim0Var3 = null;
            }
            mim0Var3.m158546I0();
            mim0 mim0Var4 = this.presenter;
            if (mim0Var4 == null) {
                Intrinsics.m88391r("presenter");
            } else {
                mim0Var2 = mim0Var4;
            }
            mim0Var2.m158540C0();
        }
        bnl0.m105525M0(m201401z(), false);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m201392c0() {
        Act act = getAct();
        if (act != null) {
            new kfm0(act, bgc0.f76584e, true).m149572t(new y20() { // from class: l.tim0
                @Override // p153l.y20
                public final void call(Object obj) {
                    vim0.m201361d0(this.f174484a, ((Boolean) obj).booleanValue());
                }
            }).show();
        }
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m201393p(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final View m201393p(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM206595b = wim0.m206595b(this, inflater, parent);
        viewM206595b.getClass();
        return viewM206595b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull mim0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: s */
    public final void m201395s() {
        if (CoreModule.m30933P().m143405a().mo34452Y9()) {
            if (!joa.m146357G3()) {
                if (m201379M().getPaddingBottom() != 0) {
                    m201379M().setPadding(m201379M().getPaddingLeft(), m201379M().getPaddingTop(), m201379M().getPaddingRight(), 0);
                }
            } else {
                int paddingBottom = m201379M().getPaddingBottom();
                int i = qa00.f156326m;
                if (paddingBottom != i) {
                    m201379M().setPadding(m201379M().getPaddingLeft(), m201379M().getPaddingTop(), m201379M().getPaddingRight(), i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m201396u(boolean success) {
        m201378L().m225024w(success);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VLinear m201397v() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VDraweeView m201398w() {
        VDraweeView vDraweeView = this._empty_empty_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_empty_empty_img");
        return null;
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NotNull mvc0 refreshLayout) {
        refreshLayout.getClass();
        mim0 mim0Var = this.presenter;
        if (mim0Var == null) {
            Intrinsics.m88391r("presenter");
            mim0Var = null;
        }
        mim0Var.m158540C0();
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m201399x() {
        VText vText = this._empty_empty_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_empty_empty_tv");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VisitorsFilterBar m201400y() {
        VisitorsFilterBar visitorsFilterBar = this._filter_bar;
        if (visitorsFilterBar != null) {
            return visitorsFilterBar;
        }
        Intrinsics.m88391r("_filter_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final View m201401z() {
        View view = this._filter_bar_foreground;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_filter_bar_foreground");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
