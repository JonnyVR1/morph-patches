package p149l;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.act.C8969a;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.act.C8970b;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.act.PicksFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksItemView;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0017J\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010\u0017J\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0017J\r\u0010!\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\u0017J\u001d\u0010%\u001a\u00020\u00122\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u0017J\r\u00101\u001a\u00020\u0012¢\u0006\u0004\b1\u0010\u0017J\r\u00102\u001a\u00020\u0012¢\u0006\u0004\b2\u0010\u0017J\u0017\u00104\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0012¢\u0006\u0004\b6\u0010\u0017J\u0015\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u00020'¢\u0006\u0004\b8\u00109J\r\u0010;\u001a\u00020:¢\u0006\u0004\b;\u0010<J\r\u0010>\u001a\u00020=¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010W\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010N\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010s\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010j\u001a\u0004\bq\u0010l\"\u0004\br\u0010nR\"\u0010z\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010j\u001a\u0005\b\u0084\u0001\u0010l\"\u0005\b\u0085\u0001\u0010nR%\u0010\u0089\u0001\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u000f\u0010j\u001a\u0005\b\u0087\u0001\u0010l\"\u0005\b\u0088\u0001\u0010nR%\u0010\u008c\u0001\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u0013\u0010j\u001a\u0005\b\u008a\u0001\u0010l\"\u0005\b\u008b\u0001\u0010nR)\u0010\u0093\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bB\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R%\u0010\u009e\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b>\u0010u\u001a\u0005\b\u009c\u0001\u0010w\"\u0005\b\u009d\u0001\u0010yR*\u0010¦\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R'\u0010ª\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b\u001e\u0010§\u0001\u001a\u0006\b \u0001\u0010¨\u0001\"\u0005\b©\u0001\u0010\u0014R\u0019\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\u000e\n\u0005\b;\u0010«\u0001\u001a\u0005\b¬\u0001\u0010\u001dR,\u0010´\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001¨\u0006µ\u0001"}, m87232d2 = {"Ll/bh70;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;)V", "", "N", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "m", "(Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "r", "L", "J", j6f.LATITUDE_SOUTH, "Ll/q860;", "Lcom/p1/mobile/putong/core/data/PicksUser;", "users", BloodType.f38728O, "(Ll/q860;)V", "", "isLoading", "isEmpty", "K", "(ZZ)V", "", "num", "P", "(I)V", "W", "X", "M", "from", "U", "(Ljava/lang/String;)V", "Q", "show", j6f.GPS_DIRECTION_TRUE, "(Z)V", "Ll/qg70;", BLiveStormDanmakuGiftResourceType.f44446s, "()Ll/qg70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b;", "p", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/b;", "a", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "n", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "H", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VFrame;", "c", "Lv/VFrame;", "get_root", "()Lv/VFrame;", "set_root", "(Lv/VFrame;)V", "_root", Constants.INAPP_DATA_TAG, "G", "set_loading", "_loading", "Lv/VLinear;", "e", "Lv/VLinear;", "u", "()Lv/VLinear;", "set_empty", "(Lv/VLinear;)V", "_empty", "Lv/VImage;", "f", "Lv/VImage;", ResourceDirection.f38808v, "()Lv/VImage;", "set_empty_image", "(Lv/VImage;)V", "_empty_image", "Lv/VText;", "g", "Lv/VText;", b2s.C_ZONE, "()Lv/VText;", "set_empty_tip", "(Lv/VText;)V", "_empty_tip", "h", "B", "set_empty_time", "_empty_time", RXScreenCaptureService.KEY_INDEX, "Landroid/view/View;", "A", "()Landroid/view/View;", "set_empty_space", "(Landroid/view/View;)V", "_empty_space", "Landroid/widget/FrameLayout;", "j", "Landroid/widget/FrameLayout;", "w", "()Landroid/widget/FrameLayout;", "set_empty_info_layout", "(Landroid/widget/FrameLayout;)V", "_empty_info_layout", "k", BaseSei.f13931Y, "set_empty_info_title", "_empty_info_title", BaseSei.f13930X, "set_empty_info_subTitle", "_empty_info_subTitle", BaseSei.f13932Z, "set_empty_liked_user", "_empty_liked_user", "Lv/VProgressBar;", "Lv/VProgressBar;", "I", "()Lv/VProgressBar;", "set_progress", "(Lv/VProgressBar;)V", "_progress", "Lv/VPullUpRecyclerView;", "o", "Lv/VPullUpRecyclerView;", "F", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "get_list_foreground", "set_list_foreground", "_list_foreground", "Landroid/widget/TextView;", "q", "Landroid/widget/TextView;", "E", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "R", "picksPresenter", "Lcom/p1/mobile/android/app/Act;", "getAct", "Ll/c4g0;", Constants.KEY_T, "Ll/c4g0;", "getCountDown", "()Ll/c4g0;", "setCountDown", "(Ll/c4g0;)V", "countDown", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class bh70 implements s7m<C8969a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PicksFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VFrame _root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VFrame _loading;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _empty_image;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _empty_tip;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _empty_time;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View _empty_space;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public FrameLayout _empty_info_layout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _empty_info_title;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _empty_info_subTitle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _empty_liked_user;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VProgressBar _progress;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public View _list_foreground;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public TextView _get_privilege;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public C8969a picksPresenter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public c4g0 countDown;

    /* JADX INFO: renamed from: l.bh70$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"l/bh70$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C15860a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f75584b;

        public C15860a(GridLayoutManager gridLayoutManager) {
            this.f75584b = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int position) {
            if (bh70.this.m101804s().getItemViewType(position) == 0) {
                return this.f75584b.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.bh70$b */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, m87232d2 = {"l/bh70$b", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isScrollingToBottom", "b", "pullUpDisable", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C15861b extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GridLayoutManager f75587c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bh70 f75588d;

        public C15861b(GridLayoutManager gridLayoutManager, bh70 bh70Var) {
            this.f75587c = gridLayoutManager;
            this.f75588d = bh70Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            PicksItemView picksItemView;
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindLastVisibleItemPosition = this.f75587c.findLastVisibleItemPosition();
                if (!this.isScrollingToBottom || this.pullUpDisable || this.f75587c.getChildCount() <= 0 || iFindLastVisibleItemPosition < this.f75587c.getItemCount() - 1 || this.f75587c.getItemCount() < this.f75587c.getChildCount() || (picksItemView = (PicksItemView) recyclerView.getChildAt(this.f75587c.getChildCount() - 1)) == null) {
                    return;
                }
                bh70 bh70Var = this.f75588d;
                if (picksItemView.getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1) || !picksItemView.getWithMask()) {
                    return;
                }
                this.pullUpDisable = true;
                bh70Var.m101795U(bh70Var.getFrag().getIsSingleFrag() ? "picks_view_pull" : "p_picks_view_membership,unlock,click");
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

    public bh70(@NotNull PicksFrag picksFrag) {
        picksFrag.getClass();
        this.frag = picksFrag;
        Act act = picksFrag.act();
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: N */
    private final String m101766N() {
        return this.frag.pageId();
    }

    /* JADX INFO: renamed from: V */
    public static final void m101767V(bh70 bh70Var) {
        CoreModule.f17545c.f19555C0.m210112u4();
        bh70Var.m101802q().m56783G0();
    }

    /* JADX INFO: renamed from: a */
    public static void m101768a(bh70 bh70Var, View view) {
        zvf0.m220396r("e_picks_useup_check", bh70Var.m101766N());
        CoreModule.f17554l.m94651a().mo33395Qp(bh70Var.getAct());
    }

    /* JADX INFO: renamed from: b */
    public static Unit m101769b(bh70 bh70Var, Long l2) {
        if (l2.longValue() < 1000) {
            CoreModule.f17545c.f19658k1.m184472q3();
            bh70Var.m101797X();
        } else {
            List<String> listM155940k = mqi0.m155940k(l2.longValue());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            bh70Var.m101778B().setText(String.format("在 %s 后可用", Arrays.copyOf(new Object[]{String.format("%s:%s:%s", Arrays.copyOf(new Object[]{listM155940k.get(0), listM155940k.get(1), listM155940k.get(2)}, 3))}, 1)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Long m101770c(Long l2) {
        return Long.valueOf(mqi0.m155948s(12, 0, 1));
    }

    /* JADX INFO: renamed from: d */
    public static void m101771d(bh70 bh70Var, View view) {
        zvf0.m220396r("e_picks_unlock", bh70Var.m101766N());
        bh70Var.m101795U(bh70Var.frag.getIsSingleFrag() ? "bottom_picks" : "p_picks_view_membership,e_card,like_swipe");
    }

    /* JADX INFO: renamed from: e */
    public static Long m101772e(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public static void m101774i(final bh70 bh70Var, PurchaseType purchaseType) {
        e51.m114743H(bh70Var.act, new Runnable() { // from class: l.ug70
            @Override // java.lang.Runnable
            public final void run() {
                bh70.m101767V(this.f176360a);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: j */
    public static void m101775j(bh70 bh70Var) {
        bh70Var.m101802q().m56783G0();
    }

    /* JADX INFO: renamed from: k */
    public static void m101776k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final View m101777A() {
        View view = this._empty_space;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_empty_space");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VText m101778B() {
        VText vText = this._empty_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_empty_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m101779C() {
        VText vText = this._empty_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_empty_tip");
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
    public final TextView m101780E() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VPullUpRecyclerView m101781F() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VFrame m101782G() {
        VFrame vFrame = this._loading;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VNavigationBar m101783H() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VProgressBar m101784I() {
        VProgressBar vProgressBar = this._progress;
        if (vProgressBar != null) {
            return vProgressBar;
        }
        Intrinsics.m87502r("_progress");
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m101785J() {
        zvf0.m220402x("e_picks_useup_check", m101766N());
        m101810z().setOnClickListener(new View.OnClickListener() { // from class: l.sg70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bh70.m101768a(this.f164375a, view);
            }
        });
        m101779C().setTypeface(Typeface.DEFAULT_BOLD);
        if (zz6.m221004u0()) {
            m101806v().setImageResource(b3c0.f72906M1);
        } else {
            m101806v().setImageResource(b3c0.f72899L1);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m101786K(boolean isLoading, boolean isEmpty) {
        if (isLoading) {
            m101782G().setVisibility(0);
            m101805u().setVisibility(4);
            m101784I().setVisibility(0);
            m101781F().setVisibility(4);
            m101797X();
            return;
        }
        if (!isEmpty) {
            m101782G().setVisibility(4);
            m101805u().setVisibility(4);
            m101784I().setVisibility(4);
            m101781F().setVisibility(0);
            m101797X();
            return;
        }
        CoreModule.f17545c.f19658k1.m184468H3();
        m101782G().setVisibility(0);
        m101805u().setVisibility(0);
        m101784I().setVisibility(4);
        m101781F().setVisibility(4);
        m101796W();
        m101794T(false);
    }

    /* JADX INFO: renamed from: L */
    public final void m101787L() {
        RecyclerView recyclerViewM101781F = m101781F();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 2);
        gridLayoutManager.m3326v(new C15860a(gridLayoutManager));
        recyclerViewM101781F.addOnScrollListener(new C15861b(gridLayoutManager, this));
        recyclerViewM101781F.setLayoutManager(gridLayoutManager);
        recyclerViewM101781F.setAdapter(m101804s());
        new C0605k(m101801p()).m3750g(recyclerViewM101781F);
    }

    /* JADX INFO: renamed from: M */
    public final void m101788M() {
        m101804s().notifyDataSetChanged();
        m101794T(!xma.m210044G3());
    }

    /* JADX INFO: renamed from: O */
    public final void m101789O(@Nullable q860<PicksUser> users) {
        if (users == null) {
            m101786K(true, false);
            m101794T(false);
        } else {
            qg70 qg70VarM101804s = m101804s();
            List<PicksUser> list = users.f153135a;
            list.getClass();
            qg70VarM101804s.m174394O(list);
            m101786K(false, users.f153135a.size() == 0);
            m101794T(!xma.m210044G3() && users.f153135a.size() > 0);
        }
        m101791Q();
    }

    /* JADX INFO: renamed from: P */
    public final void m101790P(int num) {
        if (num == 0) {
            m101809y().setText("明天的推荐会更好");
            m101808x().setText("我更懂你啦，即将推荐更多你喜欢的人");
        } else {
            VText vTextM101809y = m101809y();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vTextM101809y.setText(String.format("Hi,今天你送出了%s个喜欢", Arrays.copyOf(new Object[]{Integer.valueOf(num)}, 1)));
            m101808x().setText(zz6.m221004u0() ? "我们将把你介绍给他们" : "我们将把你介绍给她们");
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m101791Q() {
        m101780E().setText("解锁每日心动");
        m101780E().setOnClickListener(new View.OnClickListener() { // from class: l.ah70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bh70.m101771d(this.f69570a, view);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m101792R(@NotNull C8969a c8969a) {
        c8969a.getClass();
        this.picksPresenter = c8969a;
    }

    /* JADX INFO: renamed from: S */
    public final void m101793S() {
        if (!this.frag.getIsSingleFrag()) {
            xdl0.m208344M(m101783H(), false);
            return;
        }
        m101783H().setLeftIconAsBack(this.act);
        m101783H().setLeftIconResource(b3c0.f73010b);
        m101783H().setTitle(new SpannableStringBuilder("每日心动  "));
    }

    /* JADX INFO: renamed from: T */
    public final void m101794T(boolean show) {
        if (m101802q().m56784J0()) {
            xdl0.m208344M(m101780E(), show);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m101795U(@Nullable String from) {
        CoreModule.f17554l.m94651a().mo33404Sc(this.act, from, new e30() { // from class: l.tg70
            @Override // p149l.e30
            public final void call(Object obj) {
                bh70.m101774i(this.f170062a, (PurchaseType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final void m101796W() {
        if (this.countDown == null) {
            C22306c c22306cOnBackpressureLatest = this.act.duringCreated(C22306c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest();
            final Function1 function1 = new Function1() { // from class: l.vg70
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return bh70.m101770c((Long) obj);
                }
            };
            C22306c c22306cObserveOn = c22306cOnBackpressureLatest.map(new w9j() { // from class: l.wg70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return bh70.m101772e(function1, obj);
                }
            }).doOnUnsubscribe(new d30() { // from class: l.xg70
                @Override // p149l.d30
                public final void call() {
                    bh70.m101775j(this.f192744a);
                }
            }).observeOn(jo0.m142408a());
            final Function1 function2 = new Function1() { // from class: l.yg70
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return bh70.m101769b(this.f198133a, (Long) obj);
                }
            };
            this.countDown = c22306cObserveOn.subscribe(new e30() { // from class: l.zg70
                @Override // p149l.e30
                public final void call(Object obj) {
                    bh70.m101776k(function2, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m101797X() {
        yij0.m214943U(this.countDown);
        this.countDown = null;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: act, reason: from getter */
    public Act getAct() {
        return this.act;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM101798l = m101798l(inflater, parent);
        m101803r();
        return viewM101798l;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final View m101798l(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM106856b = ch70.m106856b(this, inflater, parent);
        viewM106856b.getClass();
        return viewM106856b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull C8969a presenter) {
        presenter.getClass();
        m101792R(presenter);
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final PicksFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final C8970b m101801p() {
        return this.frag.m56748S4();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final C8969a m101802q() {
        C8969a c8969a = this.picksPresenter;
        if (c8969a != null) {
            return c8969a;
        }
        Intrinsics.m87502r("picksPresenter");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m101803r() {
        m101793S();
        m101785J();
        m101787L();
        xdl0.m208344M(m101807w(), m101802q().m56784J0());
        xdl0.m208344M(m101777A(), m101802q().m56784J0());
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final qg70 m101804s() {
        return this.frag.m56749T4();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VLinear m101805u() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VImage m101806v() {
        VImage vImage = this._empty_image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_empty_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final FrameLayout m101807w() {
        FrameLayout frameLayout = this._empty_info_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_empty_info_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m101808x() {
        VText vText = this._empty_info_subTitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_empty_info_subTitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VText m101809y() {
        VText vText = this._empty_info_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_empty_info_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VText m101810z() {
        VText vText = this._empty_liked_user;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_empty_liked_user");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
