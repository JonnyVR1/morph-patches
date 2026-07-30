package p006l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.toppicks.C0355a;
import com.p000p1.mobile.putong.core.p004ui.toppicks.OffsetGridLayoutManager;
import com.p000p1.mobile.putong.core.p004ui.toppicks.TopPicksAct;
import com.p000p1.mobile.putong.core.p004ui.toppicks.TopPicksItemView;
import com.p000p1.mobile.putong.core.p004ui.toppicks.TopPicksTabFrag;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.main.TitleSwitcher;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import l.e51;
import l.lxi0;
import l.q860;
import l.s7m;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VProgressBar;
import v.VPullUpRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010\tJ\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u00072\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00072\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\tJ\u0015\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0007¢\u0006\u0004\b3\u0010\tJ\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020!¢\u0006\u0004\b5\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010L\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010<\u001a\u0004\bV\u0010>\"\u0004\bW\u0010@R\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010o\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010v\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010{\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010\u0019R\u0016\u0010}\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010|R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\u007f¨\u0006\u0081\u0001"}, d2 = {"Ll/kxi0;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;)V", "", "w", "()V", "Lcom/p1/mobile/putong/core/newui/home/frag/base/HomeLayoutFrag;", "homeLayoutFrag", "", "color", "j", "(Lcom/p1/mobile/putong/core/newui/home/frag/base/HomeLayoutFrag;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "i", "(Lcom/p1/mobile/putong/core/ui/toppicks/a;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "y", "", "hidden", "A", "(Z)V", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "users", "B", "(Ll/q860;)V", "isLoading", "isEmpty", "x", "(ZZ)V", "z", "", "from", "G", "(Ljava/lang/String;)V", "C", "show", "F", "a", "Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "k", "()Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "m", "()Lv/VDraweeView;", "set_bg_icon", "(Lv/VDraweeView;)V", "_bg_icon", "Lv/VFrame;", "c", "Lv/VFrame;", "get_root", "()Lv/VFrame;", "set_root", "(Lv/VFrame;)V", "_root", "u", "set_loading", "_loading", "Lv/VLinear;", "e", "Lv/VLinear;", "n", "()Lv/VLinear;", "set_empty", "(Lv/VLinear;)V", "_empty", "f", "p", "set_empty_image", "_empty_image", "Lv/VText;", "g", "Lv/VText;", "get_empty_desc", "()Lv/VText;", "set_empty_desc", "(Lv/VText;)V", "_empty_desc", "Lv/VProgressBar;", "h", "Lv/VProgressBar;", "v", "()Lv/VProgressBar;", "set_progress", "(Lv/VProgressBar;)V", "_progress", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", "s", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Lv/VButton;", "Lv/VButton;", "q", "()Lv/VButton;", "set_get_privilege", "(Lv/VButton;)V", "_get_privilege", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "l", "()Lcom/p1/mobile/putong/core/ui/toppicks/a;", "E", "picksPresenter", "I", "currentColor", "Lcom/p1/mobile/putong/core/newui/home/frag/base/HomeLayoutFrag;", "Z", "selfHidden", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class kxi0 implements s7m<C0355a> {

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
    public C0355a picksPresenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int currentColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public HomeLayoutFrag homeLayoutFrag;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean selfHidden;

    /* JADX INFO: renamed from: l.kxi0$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"l/kxi0$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0948a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OffsetGridLayoutManager f16064b;

        public C0948a(OffsetGridLayoutManager offsetGridLayoutManager) {
            this.f16064b = offsetGridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m18350f(int position) {
            if (kxi0.this.getFrag().m9340X4().getItemViewType(position) == 0) {
                return this.f16064b.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.kxi0$b */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"l/kxi0$b", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "a", "Z", "isScrollingToBottom", "b", "pullUpDisable", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0949b extends RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isScrollingToBottom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean pullUpDisable;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ OffsetGridLayoutManager f16068d;

        public C0949b(OffsetGridLayoutManager offsetGridLayoutManager) {
            this.f16068d = offsetGridLayoutManager;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            TopPicksItemView topPicksItemView;
            recyclerView.getClass();
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                int iFindLastCompletelyVisibleItemPosition = this.f16068d.findLastCompletelyVisibleItemPosition();
                if (!this.isScrollingToBottom || this.pullUpDisable || this.f16068d.getChildCount() <= 0 || iFindLastCompletelyVisibleItemPosition != this.f16068d.getItemCount() - 1 || this.f16068d.getItemCount() < this.f16068d.getChildCount() || (topPicksItemView = (TopPicksItemView) recyclerView.getChildAt(this.f16068d.getChildCount() - 1)) == null) {
                    return;
                }
                kxi0 kxi0Var = kxi0.this;
                if (topPicksItemView.getBottom() > recyclerView.getBottom() || xma.m27355L3()) {
                    return;
                }
                this.pullUpDisable = true;
                kxi0Var.m18331G("p_intl_picks_main_page,e_intl_picks_purchase_button,click");
            }
        }

        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            boolean z = dy > 0;
            this.isScrollingToBottom = z;
            if (!z) {
                this.pullUpDisable = false;
            }
            float fComputeVerticalScrollOffset = kxi0.this.m18343s().computeVerticalScrollOffset() / t100.d(80.0f);
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
            kxi0Var.m18335j(kxi0Var.homeLayoutFrag, Color.argb((int) (fComputeVerticalScrollOffset * 255.0f), 255, 255, 255));
        }
    }

    public kxi0(@NotNull TopPicksTabFrag topPicksTabFrag) {
        topPicksTabFrag.getClass();
        this.frag = topPicksTabFrag;
    }

    /* JADX INFO: renamed from: H */
    public static final void m18319H(kxi0 kxi0Var) {
        CoreModule.f1534c.f3544C0.m27420u4();
        kxi0Var.m18337l().m9372u0();
    }

    /* JADX INFO: renamed from: b */
    public static void m18321b(kxi0 kxi0Var, View view) {
        nwi0.INSTANCE.m20253h();
        kxi0Var.m18331G("p_intl_picks_main_page,e_intl_picks_purchase_button,click");
    }

    /* JADX INFO: renamed from: c */
    public static void m18322c(final kxi0 kxi0Var, PurchaseType purchaseType) {
        e51.H(kxi0Var.frag.act(), new Runnable() { // from class: l.jxi0
            @Override // java.lang.Runnable
            public final void run() {
                kxi0.m18319H(this.f15485a);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: A */
    public final void m18325A(boolean hidden) {
        this.selfHidden = hidden;
        if (hidden) {
            return;
        }
        m18335j(this.homeLayoutFrag, this.currentColor);
        m18337l().m9372u0();
    }

    /* JADX INFO: renamed from: B */
    public final void m18326B(@Nullable q860<User> users) {
        if (users == null) {
            m18347x(true, false);
            m18330F(false);
            rxi0 rxi0VarM9340X4 = this.frag.m9340X4();
            List<? extends User> list = Collections.EMPTY_LIST;
            list.getClass();
            rxi0VarM9340X4.m23457O(list);
        } else {
            rxi0 rxi0VarM9340X5 = this.frag.m9340X4();
            List<? extends User> list2 = users.a;
            list2.getClass();
            rxi0VarM9340X5.m23457O(list2);
            m18347x(false, users.a.size() == 0);
            m18330F(!xma.m27355L3() && users.a.size() > 0);
        }
        m18327C();
    }

    /* JADX INFO: renamed from: C */
    public final void m18327C() {
        m18341q().setOnClickListener(new View.OnClickListener() { // from class: l.hxi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kxi0.m18321b(this.f14119a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m18328C0() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: E */
    public final void m18329E(@NotNull C0355a c0355a) {
        c0355a.getClass();
        this.picksPresenter = c0355a;
    }

    /* JADX INFO: renamed from: F */
    public final void m18330F(boolean show) {
        if (show) {
            nwi0.INSTANCE.m20254i();
        }
        xdl0.M(m18341q(), show);
    }

    /* JADX INFO: renamed from: G */
    public final void m18331G(@NotNull String from) {
        from.getClass();
        c.D0(this.frag.act(), from, Privilege.picksMembership, (PurchaseType) null, new e30() { // from class: l.ixi0
            public final void call(Object obj) {
                kxi0.m18322c(this.f14863a, (PurchaseType) obj);
            }
        }, 0, (d30) null, (d30) null, (String) null, (Object) null, false, false, 4072, (Object) null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m18332d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = lxi0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m18334i1(@NotNull C0355a presenter) {
        presenter.getClass();
        m18329E(presenter);
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m18332d(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public final void m18335j(HomeLayoutFrag homeLayoutFrag, int color) {
        Window window;
        TitleSwitcher titleSwitcherD5;
        this.currentColor = color;
        if (this.selfHidden) {
            return;
        }
        if (homeLayoutFrag != null && (titleSwitcherD5 = homeLayoutFrag.D5()) != null) {
            titleSwitcherD5.setBackgroundColor(color);
        }
        Act act = act();
        if (act != null) {
            act.act().setStatusBarColor(color);
            PutongAct.setLightStatusBar(act.act.getWindow(), 16);
            if (NullChecker.a(act.act()) && (act.act() instanceof NewMainAct)) {
                NewMainAct newMainActAct = act.act();
                newMainActAct.getClass();
                newMainActAct.Z5().G(-1);
                NewMainAct newMainActAct2 = act.act();
                newMainActAct2.getClass();
                newMainActAct2.Z5().H(1.0f);
                Act act2 = act.act();
                if (act2 == null || (window = act2.getWindow()) == null) {
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
    public final C0355a m18337l() {
        C0355a c0355a = this.picksPresenter;
        if (c0355a != null) {
            return c0355a;
        }
        Intrinsics.r("picksPresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VDraweeView m18338m() {
        VDraweeView vDraweeView = this._bg_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bg_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VLinear m18339n() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m18340p() {
        VDraweeView vDraweeView = this._empty_image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_empty_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VButton m18341q() {
        VButton vButton = this._get_privilege;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m18342r() {
        m18346w();
        m18348y();
        m18326B(q860.b());
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VPullUpRecyclerView m18343s() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VFrame m18344u() {
        VFrame vFrame = this._loading;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VProgressBar m18345v() {
        VProgressBar vProgressBar = this._progress;
        if (vProgressBar != null) {
            return vProgressBar;
        }
        Intrinsics.r("_progress");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final void m18346w() {
        qib0.f19782G.m12744L0(m18340p(), "https://auto.tancdn.com/v1/raw/60293c62-5c40-4d34-a587-27efffe7a9ed12.webp");
        qib0.f19782G.m12744L0(m18338m(), "https://auto.tancdn.com/v1/raw/c93f8321-6947-46b2-ae67-4eb609f2dacf12.webp");
    }

    /* JADX INFO: renamed from: x */
    public final void m18347x(boolean isLoading, boolean isEmpty) {
        if (isLoading) {
            m18344u().setVisibility(0);
            m18339n().setVisibility(4);
            m18345v().setVisibility(0);
            m18345v().c();
            m18343s().setVisibility(0);
            return;
        }
        if (!isEmpty) {
            m18344u().setVisibility(4);
            m18339n().setVisibility(4);
            m18345v().setVisibility(4);
            m18343s().setVisibility(0);
            return;
        }
        CoreModule.f1534c.f3647k1.m23848H3();
        m18344u().setVisibility(0);
        m18339n().setVisibility(0);
        m18345v().setVisibility(4);
        m18343s().setVisibility(0);
        m18330F(false);
    }

    /* JADX INFO: renamed from: y */
    public final void m18348y() {
        if (act() != null) {
            Act act = act();
            act.getClass();
            HomeLayoutFrag homeLayoutFragI0 = act.getSupportFragmentManager().i0(TabName.Card.toString());
            if (homeLayoutFragI0 instanceof HomeLayoutFrag) {
                this.homeLayoutFrag = homeLayoutFragI0;
            }
        }
        if (this.frag.act() instanceof TopPicksAct) {
            xdl0.X(m18343s(), xdl0.F0() + t100.d(10.0f));
        } else {
            xdl0.X(m18343s(), xdl0.F0() + t100.d(44.0f));
        }
        VPullUpRecyclerView vPullUpRecyclerViewM18343s = m18343s();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(this.frag.act(), 2, 1, false);
        offsetGridLayoutManager.v(new C0948a(offsetGridLayoutManager));
        vPullUpRecyclerViewM18343s.addOnScrollListener(new C0949b(offsetGridLayoutManager));
        vPullUpRecyclerViewM18343s.setLayoutManager(offsetGridLayoutManager);
        vPullUpRecyclerViewM18343s.setAdapter(this.frag.m9340X4());
        if (IntlCountryCodeController.m21v()) {
            return;
        }
        new k(this.frag.m9341Y4()).g(vPullUpRecyclerViewM18343s);
    }

    /* JADX INFO: renamed from: z */
    public final void m18349z() {
        this.frag.m9340X4().notifyDataSetChanged();
        m18330F(!xma.m27355L3());
    }

    public void destroy() {
    }
}
