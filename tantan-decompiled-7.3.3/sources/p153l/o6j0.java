package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.main.TitleSwitcher;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.toppicks.C9082a;
import com.p051p1.mobile.putong.core.p058ui.toppicks.OffsetGridLayoutManager;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksAct;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksItemView;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksTabFrag;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010\tJ\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u00072\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00072\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\tJ\u0015\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0007¢\u0006\u0004\b3\u0010\tJ\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020!¢\u0006\u0004\b5\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010L\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010<\u001a\u0004\bV\u0010>\"\u0004\bW\u0010@R\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010o\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010v\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010{\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010\u0019R\u0016\u0010}\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010|R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\u007f¨\u0006\u0081\u0001"}, m88121d2 = {"Ll/o6j0;", "Ll/iam;", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;)V", "", "w", "()V", "Lcom/p1/mobile/putong/core/newui/home/frag/base/HomeLayoutFrag;", "homeLayoutFrag", "", "color", "j", "(Lcom/p1/mobile/putong/core/newui/home/frag/base/HomeLayoutFrag;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/toppicks/a;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", BaseSei.f14625Y, "", "hidden", "A", "(Z)V", "Ll/vg60;", "Lcom/p1/mobile/putong/data/User;", "users", "B", "(Ll/vg60;)V", "isLoading", "isEmpty", BaseSei.f14624X, "(ZZ)V", BaseSei.f14626Z, "", "from", "G", "(Ljava/lang/String;)V", c4s.C_ZONE, "show", "F", "a", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "k", "()Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "m", "()Lv/VDraweeView;", "set_bg_icon", "(Lv/VDraweeView;)V", "_bg_icon", "Lv/VFrame;", "c", "Lv/VFrame;", "get_root", "()Lv/VFrame;", "set_root", "(Lv/VFrame;)V", "_root", "u", "set_loading", "_loading", "Lv/VLinear;", "e", "Lv/VLinear;", "n", "()Lv/VLinear;", "set_empty", "(Lv/VLinear;)V", "_empty", "f", "p", "set_empty_image", "_empty_image", "Lv/VText;", "g", "Lv/VText;", "get_empty_desc", "()Lv/VText;", "set_empty_desc", "(Lv/VText;)V", "_empty_desc", "Lv/VProgressBar;", "h", "Lv/VProgressBar;", ResourceDirection.f39656v, "()Lv/VProgressBar;", "set_progress", "(Lv/VProgressBar;)V", "_progress", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Lv/VButton;", "Lv/VButton;", "q", "()Lv/VButton;", "set_get_privilege", "(Lv/VButton;)V", "_get_privilege", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/core/ui/toppicks/a;", "E", "picksPresenter", "I", "currentColor", "Lcom/p1/mobile/putong/core/newui/home/frag/base/HomeLayoutFrag;", "Z", "selfHidden", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class o6j0 implements iam<C9082a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TopPicksTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _bg_icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VFrame _root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VFrame _loading;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _empty_image;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _empty_desc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VProgressBar _progress;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VButton _get_privilege;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public C9082a picksPresenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int currentColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public HomeLayoutFrag homeLayoutFrag;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean selfHidden;

    /* JADX INFO: renamed from: l.o6j0$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"l/o6j0$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19040a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OffsetGridLayoutManager f145185b;

        public C19040a(OffsetGridLayoutManager offsetGridLayoutManager) {
            this.f145185b = offsetGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            if (o6j0.this.getFrag().m57121X4().getItemViewType(position) == 0) {
                return this.f145185b.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.o6j0$b */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, m88121d2 = {"l/o6j0$b", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isScrollingToBottom", "b", "pullUpDisable", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19041b extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ OffsetGridLayoutManager f145189d;

        public C19041b(OffsetGridLayoutManager offsetGridLayoutManager) {
            this.f145189d = offsetGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            TopPicksItemView topPicksItemView;
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindLastCompletelyVisibleItemPosition = this.f145189d.findLastCompletelyVisibleItemPosition();
                if (!this.isScrollingToBottom || this.pullUpDisable || this.f145189d.getChildCount() <= 0 || iFindLastCompletelyVisibleItemPosition != this.f145189d.getItemCount() - 1 || this.f145189d.getItemCount() < this.f145189d.getChildCount() || (topPicksItemView = (TopPicksItemView) recyclerView.getChildAt(this.f145189d.getChildCount() - 1)) == null) {
                    return;
                }
                o6j0 o6j0Var = o6j0.this;
                if (topPicksItemView.getBottom() > recyclerView.getBottom() || joa.m146361M3()) {
                    return;
                }
                this.pullUpDisable = true;
                o6j0Var.m166242G("p_intl_picks_main_page,e_intl_picks_purchase_button,click");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            boolean z = dy > 0;
            this.isScrollingToBottom = z;
            if (!z) {
                this.pullUpDisable = false;
            }
            float fComputeVerticalScrollOffset = o6j0.this.m166253s().computeVerticalScrollOffset() / qa00.m175859d(80.0f);
            if (fComputeVerticalScrollOffset > 1.0f) {
                fComputeVerticalScrollOffset = 1.0f;
            }
            if (fComputeVerticalScrollOffset < 0.0f) {
                fComputeVerticalScrollOffset = 0.0f;
            }
            if (o6j0.this.getFrag().act() instanceof TopPicksAct) {
                return;
            }
            o6j0 o6j0Var = o6j0.this;
            o6j0Var.m166245j(o6j0Var.homeLayoutFrag, Color.argb((int) (fComputeVerticalScrollOffset * 255.0f), 255, 255, 255));
        }
    }

    public o6j0(@NotNull TopPicksTabFrag topPicksTabFrag) {
        topPicksTabFrag.getClass();
        this.frag = topPicksTabFrag;
    }

    /* JADX INFO: renamed from: H */
    public static final void m166231H(o6j0 o6j0Var) {
        CoreModule.f18264c.f20297C0.m146425v4();
        o6j0Var.m166247l().m57148u0();
    }

    /* JADX INFO: renamed from: b */
    public static void m166233b(o6j0 o6j0Var, View view) {
        r5j0.INSTANCE.m179871h();
        o6j0Var.m166242G("p_intl_picks_main_page,e_intl_picks_purchase_button,click");
    }

    /* JADX INFO: renamed from: c */
    public static void m166234c(final o6j0 o6j0Var, PurchaseType purchaseType) {
        l51.m152888H(o6j0Var.frag.act(), new Runnable() { // from class: l.n6j0
            @Override // java.lang.Runnable
            public final void run() {
                o6j0.m166231H(this.f140472a);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: A */
    public final void m166237A(boolean hidden) {
        this.selfHidden = hidden;
        if (hidden) {
            return;
        }
        m166245j(this.homeLayoutFrag, this.currentColor);
        m166247l().m57148u0();
    }

    /* JADX INFO: renamed from: B */
    public final void m166238B(@Nullable vg60<User> users) {
        if (users == null) {
            m166257x(true, false);
            m166241F(false);
            v6j0 v6j0VarM57121X4 = this.frag.m57121X4();
            List<? extends User> list = Collections.EMPTY_LIST;
            list.getClass();
            v6j0VarM57121X4.m200074O(list);
        } else {
            v6j0 v6j0VarM57121X5 = this.frag.m57121X4();
            List<User> list2 = users.f184001a;
            list2.getClass();
            v6j0VarM57121X5.m200074O(list2);
            m166257x(false, users.f184001a.size() == 0);
            m166241F(!joa.m146361M3() && users.f184001a.size() > 0);
        }
        m166239C();
    }

    /* JADX INFO: renamed from: C */
    public final void m166239C() {
        m166251q().setOnClickListener(new View.OnClickListener() { // from class: l.l6j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o6j0.m166233b(this.f130264a, view);
            }
        });
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: E */
    public final void m166240E(@NotNull C9082a c9082a) {
        c9082a.getClass();
        this.picksPresenter = c9082a;
    }

    /* JADX INFO: renamed from: F */
    public final void m166241F(boolean show) {
        if (show) {
            r5j0.INSTANCE.m179872i();
        }
        bnl0.m105524M(m166251q(), show);
    }

    /* JADX INFO: renamed from: G */
    public final void m166242G(@NotNull String from) {
        from.getClass();
        C8927c.m54567D0(this.frag.act(), from, Privilege.picksMembership, null, new y20() { // from class: l.m6j0
            @Override // p153l.y20
            public final void call(Object obj) {
                o6j0.m166234c(this.f135012a, (PurchaseType) obj);
            }
        }, 0, null, null, null, null, false, false, 4072, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m166243d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM170913b = p6j0.m170913b(this, inflater, parent);
        viewM170913b.getClass();
        return viewM170913b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull C9082a presenter) {
        presenter.getClass();
        m166240E(presenter);
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m166243d(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public final void m166245j(HomeLayoutFrag homeLayoutFrag, int color) {
        Window window;
        TitleSwitcher titleSwitcherM39544D5;
        this.currentColor = color;
        if (this.selfHidden) {
            return;
        }
        if (homeLayoutFrag != null && (titleSwitcherM39544D5 = homeLayoutFrag.m39544D5()) != null) {
            titleSwitcherM39544D5.setBackgroundColor(color);
        }
        Act act = getAct();
        if (act != null) {
            act.act().setStatusBarColor(color);
            PutongAct.setLightStatusBar(act.act.getWindow(), 16);
            if (NullChecker.m82486a(act.act()) && (act.act() instanceof NewMainAct)) {
                Act act2 = act.act();
                act2.getClass();
                ((NewMainAct) act2).m40810d6().m40973G(-1);
                Act act3 = act.act();
                act3.getClass();
                ((NewMainAct) act3).m40810d6().m40975H(1.0f);
                Act act4 = act.act();
                if (act4 == null || (window = act4.getWindow()) == null) {
                    return;
                }
                window.setNavigationBarColor(-1);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final TopPicksTabFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final C9082a m166247l() {
        C9082a c9082a = this.picksPresenter;
        if (c9082a != null) {
            return c9082a;
        }
        Intrinsics.m88391r("picksPresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VDraweeView m166248m() {
        VDraweeView vDraweeView = this._bg_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bg_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VLinear m166249n() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m166250p() {
        VDraweeView vDraweeView = this._empty_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_empty_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VButton m166251q() {
        VButton vButton = this._get_privilege;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m166252r() {
        m166256w();
        m166258y();
        m166238B(vg60.m201220b());
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VPullUpRecyclerView m166253s() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VFrame m166254u() {
        VFrame vFrame = this._loading;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VProgressBar m166255v() {
        VProgressBar vProgressBar = this._progress;
        if (vProgressBar != null) {
            return vProgressBar;
        }
        Intrinsics.m88391r("_progress");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final void m166256w() {
        uqb0.f180374G.m127115L0(m166250p(), "https://auto.tancdn.com/v1/raw/60293c62-5c40-4d34-a587-27efffe7a9ed12.webp");
        uqb0.f180374G.m127115L0(m166248m(), "https://auto.tancdn.com/v1/raw/c93f8321-6947-46b2-ae67-4eb609f2dacf12.webp");
    }

    /* JADX INFO: renamed from: x */
    public final void m166257x(boolean isLoading, boolean isEmpty) {
        if (isLoading) {
            m166254u().setVisibility(0);
            m166249n().setVisibility(4);
            m166255v().setVisibility(0);
            m166255v().m224402c();
            m166253s().setVisibility(0);
            return;
        }
        if (!isEmpty) {
            m166254u().setVisibility(4);
            m166249n().setVisibility(4);
            m166255v().setVisibility(4);
            m166253s().setVisibility(0);
            return;
        }
        CoreModule.f18264c.f20400k1.m121129H3();
        m166254u().setVisibility(0);
        m166249n().setVisibility(0);
        m166255v().setVisibility(4);
        m166253s().setVisibility(0);
        m166241F(false);
    }

    /* JADX INFO: renamed from: y */
    public final void m166258y() {
        if (getAct() != null) {
            Act act = getAct();
            act.getClass();
            Fragment fragmentM2558i0 = act.getSupportFragmentManager().m2558i0(TabName.Card.toString());
            if (fragmentM2558i0 instanceof HomeLayoutFrag) {
                this.homeLayoutFrag = (HomeLayoutFrag) fragmentM2558i0;
            }
        }
        if (this.frag.act() instanceof TopPicksAct) {
            bnl0.m105540X(m166253s(), bnl0.m105511F0() + qa00.m175859d(10.0f));
        } else {
            bnl0.m105540X(m166253s(), bnl0.m105511F0() + qa00.m175859d(44.0f));
        }
        RecyclerView recyclerViewM166253s = m166253s();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(this.frag.act(), 2, 1, false);
        offsetGridLayoutManager.m3327v(new C19040a(offsetGridLayoutManager));
        recyclerViewM166253s.addOnScrollListener(new C19041b(offsetGridLayoutManager));
        recyclerViewM166253s.setLayoutManager(offsetGridLayoutManager);
        recyclerViewM166253s.setAdapter(this.frag.m57121X4());
        if (IntlCountryCodeController.m29125v()) {
            return;
        }
        new C0607k(this.frag.m57122Y4()).m3751g(recyclerViewM166253s);
    }

    /* JADX INFO: renamed from: z */
    public final void m166259z() {
        this.frag.m57121X4().notifyDataSetChanged();
        m166241F(!joa.m146361M3());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
