package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.act.C9132a;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.act.C9133b;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.act.PicksFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksItemView;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0017J\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010\u0017J\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0017J\r\u0010!\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\u0017J\u001d\u0010%\u001a\u00020\u00122\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u0017J\r\u00101\u001a\u00020\u0012¢\u0006\u0004\b1\u0010\u0017J\r\u00102\u001a\u00020\u0012¢\u0006\u0004\b2\u0010\u0017J\u0017\u00104\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0012¢\u0006\u0004\b6\u0010\u0017J\u0015\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u00020'¢\u0006\u0004\b8\u00109J\r\u0010;\u001a\u00020:¢\u0006\u0004\b;\u0010<J\r\u0010>\u001a\u00020=¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010W\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010N\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010s\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010j\u001a\u0004\bq\u0010l\"\u0004\br\u0010nR\"\u0010z\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010j\u001a\u0005\b\u0084\u0001\u0010l\"\u0005\b\u0085\u0001\u0010nR%\u0010\u0089\u0001\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u000f\u0010j\u001a\u0005\b\u0087\u0001\u0010l\"\u0005\b\u0088\u0001\u0010nR%\u0010\u008c\u0001\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u0013\u0010j\u001a\u0005\b\u008a\u0001\u0010l\"\u0005\b\u008b\u0001\u0010nR)\u0010\u0093\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bB\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R%\u0010\u009e\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b>\u0010u\u001a\u0005\b\u009c\u0001\u0010w\"\u0005\b\u009d\u0001\u0010yR*\u0010¦\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R'\u0010ª\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b\u001e\u0010§\u0001\u001a\u0006\b \u0001\u0010¨\u0001\"\u0005\b©\u0001\u0010\u0014R\u0019\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\u000e\n\u0005\b;\u0010«\u0001\u001a\u0005\b¬\u0001\u0010\u001dR,\u0010´\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001¨\u0006µ\u0001"}, m88121d2 = {"Ll/hp70;", "Ll/iam;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;)V", "", "N", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "m", "(Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "r", "L", "J", p7f.LATITUDE_SOUTH, "Ll/vg60;", "Lcom/p1/mobile/putong/core/data/PicksUser;", "users", BloodType.f39576O, "(Ll/vg60;)V", "", "isLoading", "isEmpty", "K", "(ZZ)V", "", "num", "P", "(I)V", "W", "X", "M", "from", "U", "(Ljava/lang/String;)V", "Q", "show", p7f.GPS_DIRECTION_TRUE, "(Z)V", "Ll/wo70;", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/wo70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b;", "p", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/b;", "a", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "n", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "H", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VFrame;", "c", "Lv/VFrame;", "get_root", "()Lv/VFrame;", "set_root", "(Lv/VFrame;)V", "_root", Constants.INAPP_DATA_TAG, "G", "set_loading", "_loading", "Lv/VLinear;", "e", "Lv/VLinear;", "u", "()Lv/VLinear;", "set_empty", "(Lv/VLinear;)V", "_empty", "Lv/VImage;", "f", "Lv/VImage;", ResourceDirection.f39656v, "()Lv/VImage;", "set_empty_image", "(Lv/VImage;)V", "_empty_image", "Lv/VText;", "g", "Lv/VText;", c4s.C_ZONE, "()Lv/VText;", "set_empty_tip", "(Lv/VText;)V", "_empty_tip", "h", "B", "set_empty_time", "_empty_time", RXScreenCaptureService.KEY_INDEX, "Landroid/view/View;", "A", "()Landroid/view/View;", "set_empty_space", "(Landroid/view/View;)V", "_empty_space", "Landroid/widget/FrameLayout;", "j", "Landroid/widget/FrameLayout;", "w", "()Landroid/widget/FrameLayout;", "set_empty_info_layout", "(Landroid/widget/FrameLayout;)V", "_empty_info_layout", "k", BaseSei.f14625Y, "set_empty_info_title", "_empty_info_title", BaseSei.f14624X, "set_empty_info_subTitle", "_empty_info_subTitle", BaseSei.f14626Z, "set_empty_liked_user", "_empty_liked_user", "Lv/VProgressBar;", "Lv/VProgressBar;", "I", "()Lv/VProgressBar;", "set_progress", "(Lv/VProgressBar;)V", "_progress", "Lv/VPullUpRecyclerView;", "o", "Lv/VPullUpRecyclerView;", "F", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "get_list_foreground", "set_list_foreground", "_list_foreground", "Landroid/widget/TextView;", "q", "Landroid/widget/TextView;", "E", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "R", "picksPresenter", "Lcom/p1/mobile/android/app/Act;", "getAct", "Ll/kcg0;", Constants.KEY_T, "Ll/kcg0;", "getCountDown", "()Ll/kcg0;", "setCountDown", "(Ll/kcg0;)V", "countDown", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class hp70 implements iam<C9132a> {

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
    public C9132a picksPresenter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public kcg0 countDown;

    /* JADX INFO: renamed from: l.hp70$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"l/hp70$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17530a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f111006b;

        public C17530a(GridLayoutManager gridLayoutManager) {
            this.f111006b = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            if (hp70.this.m136520s().getItemViewType(position) == 0) {
                return this.f111006b.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.hp70$b */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, m88121d2 = {"l/hp70$b", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isScrollingToBottom", "b", "pullUpDisable", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17531b extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GridLayoutManager f111009c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ hp70 f111010d;

        public C17531b(GridLayoutManager gridLayoutManager, hp70 hp70Var) {
            this.f111009c = gridLayoutManager;
            this.f111010d = hp70Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            PicksItemView picksItemView;
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindLastVisibleItemPosition = this.f111009c.findLastVisibleItemPosition();
                if (!this.isScrollingToBottom || this.pullUpDisable || this.f111009c.getChildCount() <= 0 || iFindLastVisibleItemPosition < this.f111009c.getItemCount() - 1 || this.f111009c.getItemCount() < this.f111009c.getChildCount() || (picksItemView = (PicksItemView) recyclerView.getChildAt(this.f111009c.getChildCount() - 1)) == null) {
                    return;
                }
                hp70 hp70Var = this.f111010d;
                if (picksItemView.getBottom() > recyclerView.getBottom() || recyclerView.canScrollVertically(1) || !picksItemView.getWithMask()) {
                    return;
                }
                this.pullUpDisable = true;
                hp70Var.m136511U(hp70Var.getFrag().getIsSingleFrag() ? "picks_view_pull" : "p_picks_view_membership,unlock,click");
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

    public hp70(@NotNull PicksFrag picksFrag) {
        picksFrag.getClass();
        this.frag = picksFrag;
        Act act = picksFrag.act();
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: N */
    private final String m136482N() {
        return this.frag.pageId();
    }

    /* JADX INFO: renamed from: V */
    public static final void m136483V(hp70 hp70Var) {
        CoreModule.f18264c.f20297C0.m146425v4();
        hp70Var.m136518q().m57966G0();
    }

    /* JADX INFO: renamed from: a */
    public static void m136484a(hp70 hp70Var, View view) {
        i4g0.m138520r("e_picks_useup_check", hp70Var.m136482N());
        CoreModule.f18273l.m143405a().mo34398Qp(hp70Var.getAct());
    }

    /* JADX INFO: renamed from: b */
    public static Unit m136485b(hp70 hp70Var, Long l2) {
        if (l2.longValue() < 1000) {
            CoreModule.f18264c.f20400k1.m121133q3();
            hp70Var.m136513X();
        } else {
            List<String> listM174450k = pzi0.m174450k(l2.longValue());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            hp70Var.m136494B().setText(String.format("在 %s 后可用", Arrays.copyOf(new Object[]{String.format("%s:%s:%s", Arrays.copyOf(new Object[]{listM174450k.get(0), listM174450k.get(1), listM174450k.get(2)}, 3))}, 1)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Long m136486c(Long l2) {
        return Long.valueOf(pzi0.m174458s(12, 0, 1));
    }

    /* JADX INFO: renamed from: d */
    public static void m136487d(hp70 hp70Var, View view) {
        i4g0.m138520r("e_picks_unlock", hp70Var.m136482N());
        hp70Var.m136511U(hp70Var.frag.getIsSingleFrag() ? "bottom_picks" : "p_picks_view_membership,e_card,like_swipe");
    }

    /* JADX INFO: renamed from: e */
    public static Long m136488e(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public static void m136490i(final hp70 hp70Var, PurchaseType purchaseType) {
        l51.m152888H(hp70Var.act, new Runnable() { // from class: l.ap70
            @Override // java.lang.Runnable
            public final void run() {
                hp70.m136483V(this.f72692a);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: j */
    public static void m136491j(hp70 hp70Var) {
        hp70Var.m136518q().m57966G0();
    }

    /* JADX INFO: renamed from: k */
    public static void m136492k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final View m136493A() {
        View view = this._empty_space;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_empty_space");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VText m136494B() {
        VText vText = this._empty_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_empty_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m136495C() {
        VText vText = this._empty_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_empty_tip");
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
    public final TextView m136496E() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VPullUpRecyclerView m136497F() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VFrame m136498G() {
        VFrame vFrame = this._loading;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VNavigationBar m136499H() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VProgressBar m136500I() {
        VProgressBar vProgressBar = this._progress;
        if (vProgressBar != null) {
            return vProgressBar;
        }
        Intrinsics.m88391r("_progress");
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m136501J() {
        i4g0.m138526x("e_picks_useup_check", m136482N());
        m136526z().setOnClickListener(new View.OnClickListener() { // from class: l.yo70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hp70.m136484a(this.f200960a, view);
            }
        });
        m136495C().setTypeface(Typeface.DEFAULT_BOLD);
        if (c17.m107528u0()) {
            m136522v().setImageResource(gbc0.f103157M1);
        } else {
            m136522v().setImageResource(gbc0.f103150L1);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m136502K(boolean isLoading, boolean isEmpty) {
        if (isLoading) {
            m136498G().setVisibility(0);
            m136521u().setVisibility(4);
            m136500I().setVisibility(0);
            m136497F().setVisibility(4);
            m136513X();
            return;
        }
        if (!isEmpty) {
            m136498G().setVisibility(4);
            m136521u().setVisibility(4);
            m136500I().setVisibility(4);
            m136497F().setVisibility(0);
            m136513X();
            return;
        }
        CoreModule.f18264c.f20400k1.m121129H3();
        m136498G().setVisibility(0);
        m136521u().setVisibility(0);
        m136500I().setVisibility(4);
        m136497F().setVisibility(4);
        m136512W();
        m136510T(false);
    }

    /* JADX INFO: renamed from: L */
    public final void m136503L() {
        RecyclerView recyclerViewM136497F = m136497F();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.act, 2);
        gridLayoutManager.m3327v(new C17530a(gridLayoutManager));
        recyclerViewM136497F.addOnScrollListener(new C17531b(gridLayoutManager, this));
        recyclerViewM136497F.setLayoutManager(gridLayoutManager);
        recyclerViewM136497F.setAdapter(m136520s());
        new C0607k(m136517p()).m3751g(recyclerViewM136497F);
    }

    /* JADX INFO: renamed from: M */
    public final void m136504M() {
        m136520s().notifyDataSetChanged();
        m136510T(!joa.m146358H3());
    }

    /* JADX INFO: renamed from: O */
    public final void m136505O(@Nullable vg60<PicksUser> users) {
        if (users == null) {
            m136502K(true, false);
            m136510T(false);
        } else {
            wo70 wo70VarM136520s = m136520s();
            List<PicksUser> list = users.f184001a;
            list.getClass();
            wo70VarM136520s.m207274O(list);
            m136502K(false, users.f184001a.size() == 0);
            m136510T(!joa.m146358H3() && users.f184001a.size() > 0);
        }
        m136507Q();
    }

    /* JADX INFO: renamed from: P */
    public final void m136506P(int num) {
        if (num == 0) {
            m136525y().setText("明天的推荐会更好");
            m136524x().setText("我更懂你啦，即将推荐更多你喜欢的人");
        } else {
            VText vTextM136525y = m136525y();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vTextM136525y.setText(String.format("Hi,今天你送出了%s个喜欢", Arrays.copyOf(new Object[]{Integer.valueOf(num)}, 1)));
            m136524x().setText(c17.m107528u0() ? "我们将把你介绍给他们" : "我们将把你介绍给她们");
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m136507Q() {
        m136496E().setText("解锁每日心动");
        m136496E().setOnClickListener(new View.OnClickListener() { // from class: l.gp70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hp70.m136487d(this.f105439a, view);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m136508R(@NotNull C9132a c9132a) {
        c9132a.getClass();
        this.picksPresenter = c9132a;
    }

    /* JADX INFO: renamed from: S */
    public final void m136509S() {
        if (!this.frag.getIsSingleFrag()) {
            bnl0.m105524M(m136499H(), false);
            return;
        }
        m136499H().setLeftIconAsBack(this.act);
        m136499H().setLeftIconResource(gbc0.f103261b);
        m136499H().setTitle(new SpannableStringBuilder("每日心动  "));
    }

    /* JADX INFO: renamed from: T */
    public final void m136510T(boolean show) {
        if (m136518q().m57967J0()) {
            bnl0.m105524M(m136496E(), show);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m136511U(@Nullable String from) {
        CoreModule.f18273l.m143405a().mo34407Sc(this.act, from, new y20() { // from class: l.zo70
            @Override // p153l.y20
            public final void call(Object obj) {
                hp70.m136490i(this.f205301a, (PurchaseType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final void m136512W() {
        if (this.countDown == null) {
            C22421c c22421cOnBackpressureLatest = this.act.duringCreated(C22421c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest();
            final Function1 function1 = new Function1() { // from class: l.bp70
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hp70.m136486c((Long) obj);
                }
            };
            C22421c c22421cObserveOn = c22421cOnBackpressureLatest.map(new qcj() { // from class: l.cp70
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return hp70.m136488e(function1, obj);
                }
            }).doOnUnsubscribe(new x20() { // from class: l.dp70
                @Override // p153l.x20
                public final void call() {
                    hp70.m136491j(this.f90030a);
                }
            }).observeOn(fo0.m126432a());
            final Function1 function2 = new Function1() { // from class: l.ep70
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hp70.m136485b(this.f95209a, (Long) obj);
                }
            };
            this.countDown = c22421cObserveOn.subscribe(new y20() { // from class: l.fp70
                @Override // p153l.y20
                public final void call(Object obj) {
                    hp70.m136492k(function2, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m136513X() {
        bsj0.m106263U(this.countDown);
        this.countDown = null;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: act, reason: from getter */
    public Act getAct() {
        return this.act;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM136514l = m136514l(inflater, parent);
        m136519r();
        return viewM136514l;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final View m136514l(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM141448b = ip70.m141448b(this, inflater, parent);
        viewM141448b.getClass();
        return viewM141448b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull C9132a presenter) {
        presenter.getClass();
        m136508R(presenter);
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final PicksFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final C9133b m136517p() {
        return this.frag.m57931S4();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final C9132a m136518q() {
        C9132a c9132a = this.picksPresenter;
        if (c9132a != null) {
            return c9132a;
        }
        Intrinsics.m88391r("picksPresenter");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m136519r() {
        m136509S();
        m136501J();
        m136503L();
        bnl0.m105524M(m136523w(), m136518q().m57967J0());
        bnl0.m105524M(m136493A(), m136518q().m57967J0());
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final wo70 m136520s() {
        return this.frag.m57932T4();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VLinear m136521u() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VImage m136522v() {
        VImage vImage = this._empty_image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_empty_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final FrameLayout m136523w() {
        FrameLayout frameLayout = this._empty_info_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_empty_info_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m136524x() {
        VText vText = this._empty_info_subTitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_empty_info_subTitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VText m136525y() {
        VText vText = this._empty_info_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_empty_info_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VText m136526z() {
        VText vText = this._empty_liked_user;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_empty_liked_user");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
