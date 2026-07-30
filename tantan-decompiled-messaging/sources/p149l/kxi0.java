package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.main.TitleSwitcher;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.toppicks.C8919a;
import com.p046p1.mobile.putong.core.p053ui.toppicks.OffsetGridLayoutManager;
import com.p046p1.mobile.putong.core.p053ui.toppicks.TopPicksAct;
import com.p046p1.mobile.putong.core.p053ui.toppicks.TopPicksItemView;
import com.p046p1.mobile.putong.core.p053ui.toppicks.TopPicksTabFrag;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010\tJ\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u00072\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00072\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\tJ\u0015\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0007¢\u0006\u0004\b3\u0010\tJ\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020!¢\u0006\u0004\b5\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010L\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010<\u001a\u0004\bV\u0010>\"\u0004\bW\u0010@R\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010o\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010v\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010{\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010\u0019R\u0016\u0010}\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010|R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\u007f¨\u0006\u0081\u0001"}, m87232d2 = {"Ll/kxi0;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;)V", "", "w", "()V", "Lcom/p1/mobile/putong/core/newui/home/frag/base/HomeLayoutFrag;", "homeLayoutFrag", "", "color", "j", "(Lcom/p1/mobile/putong/core/newui/home/frag/base/HomeLayoutFrag;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/toppicks/a;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", BaseSei.f13931Y, "", "hidden", "A", "(Z)V", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "users", "B", "(Ll/q860;)V", "isLoading", "isEmpty", BaseSei.f13930X, "(ZZ)V", BaseSei.f13932Z, "", "from", "G", "(Ljava/lang/String;)V", b2s.C_ZONE, "show", "F", "a", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "k", "()Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "m", "()Lv/VDraweeView;", "set_bg_icon", "(Lv/VDraweeView;)V", "_bg_icon", "Lv/VFrame;", "c", "Lv/VFrame;", "get_root", "()Lv/VFrame;", "set_root", "(Lv/VFrame;)V", "_root", "u", "set_loading", "_loading", "Lv/VLinear;", "e", "Lv/VLinear;", "n", "()Lv/VLinear;", "set_empty", "(Lv/VLinear;)V", "_empty", "f", "p", "set_empty_image", "_empty_image", "Lv/VText;", "g", "Lv/VText;", "get_empty_desc", "()Lv/VText;", "set_empty_desc", "(Lv/VText;)V", "_empty_desc", "Lv/VProgressBar;", "h", "Lv/VProgressBar;", ResourceDirection.f38808v, "()Lv/VProgressBar;", "set_progress", "(Lv/VProgressBar;)V", "_progress", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Lv/VButton;", "Lv/VButton;", "q", "()Lv/VButton;", "set_get_privilege", "(Lv/VButton;)V", "_get_privilege", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/core/ui/toppicks/a;", "E", "picksPresenter", "I", "currentColor", "Lcom/p1/mobile/putong/core/newui/home/frag/base/HomeLayoutFrag;", "Z", "selfHidden", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class kxi0 implements s7m<C8919a> {

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
    public C8919a picksPresenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int currentColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public HomeLayoutFrag homeLayoutFrag;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean selfHidden;

    /* JADX INFO: renamed from: l.kxi0$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"l/kxi0$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18111a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OffsetGridLayoutManager f125135b;

        public C18111a(OffsetGridLayoutManager offsetGridLayoutManager) {
            this.f125135b = offsetGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int position) {
            if (kxi0.this.getFrag().m55938X4().getItemViewType(position) == 0) {
                return this.f125135b.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.kxi0$b */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, m87232d2 = {"l/kxi0$b", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isScrollingToBottom", "b", "pullUpDisable", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18112b extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ OffsetGridLayoutManager f125139d;

        public C18112b(OffsetGridLayoutManager offsetGridLayoutManager) {
            this.f125139d = offsetGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            TopPicksItemView topPicksItemView;
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindLastCompletelyVisibleItemPosition = this.f125139d.findLastCompletelyVisibleItemPosition();
                if (!this.isScrollingToBottom || this.pullUpDisable || this.f125139d.getChildCount() <= 0 || iFindLastCompletelyVisibleItemPosition != this.f125139d.getItemCount() - 1 || this.f125139d.getItemCount() < this.f125139d.getChildCount() || (topPicksItemView = (TopPicksItemView) recyclerView.getChildAt(this.f125139d.getChildCount() - 1)) == null) {
                    return;
                }
                kxi0 kxi0Var = kxi0.this;
                if (topPicksItemView.getBottom() > recyclerView.getBottom() || xma.m210047L3()) {
                    return;
                }
                this.pullUpDisable = true;
                kxi0Var.m147772G("p_intl_picks_main_page,e_intl_picks_purchase_button,click");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            boolean z = dy > 0;
            this.isScrollingToBottom = z;
            if (!z) {
                this.pullUpDisable = false;
            }
            float fComputeVerticalScrollOffset = kxi0.this.m147783s().computeVerticalScrollOffset() / t100.m186890d(80.0f);
            if (fComputeVerticalScrollOffset > 1.0f) {
                fComputeVerticalScrollOffset = 1.0f;
            }
            if (fComputeVerticalScrollOffset < 0.0f) {
                fComputeVerticalScrollOffset = 0.0f;
            }
            if (kxi0.this.getFrag().act() instanceof TopPicksAct) {
                return;
            }
            kxi0 kxi0Var = kxi0.this;
            kxi0Var.m147775j(kxi0Var.homeLayoutFrag, Color.argb((int) (fComputeVerticalScrollOffset * 255.0f), 255, 255, 255));
        }
    }

    public kxi0(@NotNull TopPicksTabFrag topPicksTabFrag) {
        topPicksTabFrag.getClass();
        this.frag = topPicksTabFrag;
    }

    /* JADX INFO: renamed from: H */
    public static final void m147761H(kxi0 kxi0Var) {
        CoreModule.f17545c.f19555C0.m210112u4();
        kxi0Var.m147777l().m55965u0();
    }

    /* JADX INFO: renamed from: b */
    public static void m147763b(kxi0 kxi0Var, View view) {
        nwi0.INSTANCE.m161875h();
        kxi0Var.m147772G("p_intl_picks_main_page,e_intl_picks_purchase_button,click");
    }

    /* JADX INFO: renamed from: c */
    public static void m147764c(final kxi0 kxi0Var, PurchaseType purchaseType) {
        e51.m114743H(kxi0Var.frag.act(), new Runnable() { // from class: l.jxi0
            @Override // java.lang.Runnable
            public final void run() {
                kxi0.m147761H(this.f120227a);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: A */
    public final void m147767A(boolean hidden) {
        this.selfHidden = hidden;
        if (hidden) {
            return;
        }
        m147775j(this.homeLayoutFrag, this.currentColor);
        m147777l().m55965u0();
    }

    /* JADX INFO: renamed from: B */
    public final void m147768B(@Nullable q860<User> users) {
        if (users == null) {
            m147787x(true, false);
            m147771F(false);
            rxi0 rxi0VarM55938X4 = this.frag.m55938X4();
            List<? extends User> list = Collections.EMPTY_LIST;
            list.getClass();
            rxi0VarM55938X4.m181609O(list);
        } else {
            rxi0 rxi0VarM55938X5 = this.frag.m55938X4();
            List<User> list2 = users.f153135a;
            list2.getClass();
            rxi0VarM55938X5.m181609O(list2);
            m147787x(false, users.f153135a.size() == 0);
            m147771F(!xma.m210047L3() && users.f153135a.size() > 0);
        }
        m147769C();
    }

    /* JADX INFO: renamed from: C */
    public final void m147769C() {
        m147781q().setOnClickListener(new View.OnClickListener() { // from class: l.hxi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kxi0.m147763b(this.f109873a, view);
            }
        });
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: E */
    public final void m147770E(@NotNull C8919a c8919a) {
        c8919a.getClass();
        this.picksPresenter = c8919a;
    }

    /* JADX INFO: renamed from: F */
    public final void m147771F(boolean show) {
        if (show) {
            nwi0.INSTANCE.m161876i();
        }
        xdl0.m208344M(m147781q(), show);
    }

    /* JADX INFO: renamed from: G */
    public final void m147772G(@NotNull String from) {
        from.getClass();
        C8764c.m53384D0(this.frag.act(), from, Privilege.picksMembership, null, new e30() { // from class: l.ixi0
            @Override // p149l.e30
            public final void call(Object obj) {
                kxi0.m147764c(this.f115371a, (PurchaseType) obj);
            }
        }, 0, null, null, null, null, false, false, 4072, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m147773d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM152066b = lxi0.m152066b(this, inflater, parent);
        viewM152066b.getClass();
        return viewM152066b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull C8919a presenter) {
        presenter.getClass();
        m147770E(presenter);
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m147773d(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public final void m147775j(HomeLayoutFrag homeLayoutFrag, int color) {
        Window window;
        TitleSwitcher titleSwitcherM38541D5;
        this.currentColor = color;
        if (this.selfHidden) {
            return;
        }
        if (homeLayoutFrag != null && (titleSwitcherM38541D5 = homeLayoutFrag.m38541D5()) != null) {
            titleSwitcherM38541D5.setBackgroundColor(color);
        }
        Act act = getAct();
        if (act != null) {
            act.act().setStatusBarColor(color);
            PutongAct.setLightStatusBar(act.act.getWindow(), 16);
            if (NullChecker.m81303a(act.act()) && (act.act() instanceof NewMainAct)) {
                Act act2 = act.act();
                act2.getClass();
                ((NewMainAct) act2).m39801Z5().m39966G(-1);
                Act act3 = act.act();
                act3.getClass();
                ((NewMainAct) act3).m39801Z5().m39968H(1.0f);
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
    public final C8919a m147777l() {
        C8919a c8919a = this.picksPresenter;
        if (c8919a != null) {
            return c8919a;
        }
        Intrinsics.m87502r("picksPresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VDraweeView m147778m() {
        VDraweeView vDraweeView = this._bg_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_bg_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VLinear m147779n() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m147780p() {
        VDraweeView vDraweeView = this._empty_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_empty_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VButton m147781q() {
        VButton vButton = this._get_privilege;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m147782r() {
        m147786w();
        m147788y();
        m147768B(q860.m173342b());
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VPullUpRecyclerView m147783s() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VFrame m147784u() {
        VFrame vFrame = this._loading;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VProgressBar m147785v() {
        VProgressBar vProgressBar = this._progress;
        if (vProgressBar != null) {
            return vProgressBar;
        }
        Intrinsics.m87502r("_progress");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final void m147786w() {
        qib0.f154691G.m102331L0(m147780p(), "https://auto.tancdn.com/v1/raw/60293c62-5c40-4d34-a587-27efffe7a9ed12.webp");
        qib0.f154691G.m102331L0(m147778m(), "https://auto.tancdn.com/v1/raw/c93f8321-6947-46b2-ae67-4eb609f2dacf12.webp");
    }

    /* JADX INFO: renamed from: x */
    public final void m147787x(boolean isLoading, boolean isEmpty) {
        if (isLoading) {
            m147784u().setVisibility(0);
            m147779n().setVisibility(4);
            m147785v().setVisibility(0);
            m147785v().m223156c();
            m147783s().setVisibility(0);
            return;
        }
        if (!isEmpty) {
            m147784u().setVisibility(4);
            m147779n().setVisibility(4);
            m147785v().setVisibility(4);
            m147783s().setVisibility(0);
            return;
        }
        CoreModule.f17545c.f19658k1.m184468H3();
        m147784u().setVisibility(0);
        m147779n().setVisibility(0);
        m147785v().setVisibility(4);
        m147783s().setVisibility(0);
        m147771F(false);
    }

    /* JADX INFO: renamed from: y */
    public final void m147788y() {
        if (getAct() != null) {
            Act act = getAct();
            act.getClass();
            Fragment fragmentM2557i0 = act.getSupportFragmentManager().m2557i0(TabName.Card.toString());
            if (fragmentM2557i0 instanceof HomeLayoutFrag) {
                this.homeLayoutFrag = (HomeLayoutFrag) fragmentM2557i0;
            }
        }
        if (this.frag.act() instanceof TopPicksAct) {
            xdl0.m208360X(m147783s(), xdl0.m208331F0() + t100.m186890d(10.0f));
        } else {
            xdl0.m208360X(m147783s(), xdl0.m208331F0() + t100.m186890d(44.0f));
        }
        RecyclerView recyclerViewM147783s = m147783s();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(this.frag.act(), 2, 1, false);
        offsetGridLayoutManager.m3326v(new C18111a(offsetGridLayoutManager));
        recyclerViewM147783s.addOnScrollListener(new C18112b(offsetGridLayoutManager));
        recyclerViewM147783s.setLayoutManager(offsetGridLayoutManager);
        recyclerViewM147783s.setAdapter(this.frag.m55938X4());
        if (IntlCountryCodeController.m28126v()) {
            return;
        }
        new C0605k(this.frag.m55939Y4()).m3750g(recyclerViewM147783s);
    }

    /* JADX INFO: renamed from: z */
    public final void m147789z() {
        this.frag.m55938X4().notifyDataSetChanged();
        m147771F(!xma.m210047L3());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
