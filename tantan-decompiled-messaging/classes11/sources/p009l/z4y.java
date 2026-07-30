package p009l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.newui.meet.likers.MeetLikersFrag;
import com.p000p1.mobile.putong.core.newui.meet.likers.items.MeetLikersUserView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.a5y;
import l.b3c0;
import l.s7m;
import l.svq;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010R\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010X¨\u0006Y"}, d2 = {"Ll/z4y;", "Ll/s7m;", "Ll/l4y;", "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "f", "(Ll/l4y;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "seeLastReadTime", "p", "(J)V", "", "Ll/mwl;", "users", "s", "(Ljava/util/List;)V", "Ll/x2y;", "i", "()Ll/x2y;", "", "hasSeePrivilege", "u", "(Z)V", "q", "a", "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "n", "()Landroidx/recyclerview/widget/RecyclerView;", "set_recycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_recycler", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "j", "()Landroid/widget/LinearLayout;", "set_empty", "(Landroid/widget/LinearLayout;)V", "_empty", "Lv/VImage;", "d", "Lv/VImage;", "k", "()Lv/VImage;", "set_empty_image", "(Lv/VImage;)V", "_empty_image", "Lv/VText;", "e", "Lv/VText;", "l", "()Lv/VText;", "set_empty_tip", "(Lv/VText;)V", "_empty_tip", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "m", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "g", "Ll/l4y;", "h", "Ll/x2y;", "meetLikersAdapter", "Z", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class z4y implements s7m<l4y> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MeetLikersFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RecyclerView _recycler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public LinearLayout _empty;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _empty_image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _empty_tip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _get_privilege;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public l4y presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public x2y meetLikersAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean hasSeePrivilege;

    /* JADX INFO: renamed from: l.z4y$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"l/z4y$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1342a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager f23474b;

        public C1342a(GridLayoutManager gridLayoutManager) {
            this.f23474b = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m25607f(int position) {
            x2y x2yVar = z4y.this.meetLikersAdapter;
            if (x2yVar == null) {
                Intrinsics.r("meetLikersAdapter");
                x2yVar = null;
            }
            int itemViewType = x2yVar.getItemViewType(position);
            x2y.Companion c1295a = x2y.INSTANCE;
            if (itemViewType == c1295a.m24694a() || itemViewType == c1295a.m24695b()) {
                return this.f23474b.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.z4y$b */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"l/z4y$b", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1343b extends RecyclerView.n {
        /* JADX WARN: Multi-variable type inference failed */
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (view instanceof MeetLikersUserView) {
                int iC = svq.c(4);
                MeetLikersUserView meetLikersUserView = (MeetLikersUserView) view;
                outRect.left = meetLikersUserView.m4617j() ? iC * 2 : iC;
                outRect.right = meetLikersUserView.m4617j() ? iC : iC * 2;
                outRect.bottom = iC * 2;
            }
        }
    }

    /* JADX INFO: renamed from: l.z4y$c */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"l/z4y$c", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "a", "(Landroidx/recyclerview/widget/RecyclerView;)Z", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1344c extends RecyclerView.t {
        public C1344c() {
        }

        /* JADX INFO: renamed from: a */
        private final boolean m25608a(RecyclerView recyclerView) {
            return recyclerView != null && recyclerView.computeVerticalScrollRange() > xdl0.w0() && recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
        }

        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            if (CoreModule.P().g().Fs() || !m25608a(recyclerView)) {
                return;
            }
            CoreModule.P().a().wr(z4y.this.act(), "p_meet_see,card_button_pull", Privilege.see_who_likes_me);
        }
    }

    /* JADX INFO: renamed from: l.z4y$d */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"l/z4y$d", "Ll/o4y$a;", "Lcom/p1/mobile/putong/data/User;", "clickedUser", "", "liked", "superLike", "fromButton", "", "p", "(Lcom/p1/mobile/putong/data/User;ZZZ)V", "o", "(Z)V", "n", "()Z", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1345d implements o4y.InterfaceC1066a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecyclerView f23477b;

        public C1345d(RecyclerView recyclerView) {
            this.f23477b = recyclerView;
        }

        @Override // p009l.o4y.InterfaceC1066a
        /* JADX INFO: renamed from: n */
        public boolean mo19628n() {
            return !z4y.this.hasSeePrivilege;
        }

        @Override // p009l.o4y.InterfaceC1066a
        /* JADX INFO: renamed from: o */
        public void mo19629o(boolean liked) {
            RecyclerView.Adapter adapter = this.f23477b.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }

        @Override // p009l.o4y.InterfaceC1066a
        /* JADX INFO: renamed from: p */
        public void mo19630p(User clickedUser, boolean liked, boolean superLike, boolean fromButton) {
            clickedUser.getClass();
            l4y l4yVar = z4y.this.presenter;
            if (l4yVar != null) {
                l4yVar.m17684E(clickedUser, liked, fromButton);
            }
        }
    }

    public z4y(@NotNull MeetLikersFrag meetLikersFrag) {
        meetLikersFrag.getClass();
        this.frag = meetLikersFrag;
        this.hasSeePrivilege = !CoreModule.l.a().e2();
    }

    /* JADX INFO: renamed from: a */
    public static void m25589a(z4y z4yVar, View view) {
        CoreModule.P().a().wr(z4yVar.act(), "p_meet_see,card_button_pull", Privilege.see_who_likes_me);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25593C0() {
        return this.frag.act();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m25594b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = a5y.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m25597i1(@Nullable l4y presenter) {
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final x2y m25596i() {
        x2y x2yVar = this.meetLikersAdapter;
        if (x2yVar != null) {
            return x2yVar;
        }
        Intrinsics.r("meetLikersAdapter");
        return null;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m25594b(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final LinearLayout m25598j() {
        LinearLayout linearLayout = this._empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VImage m25599k() {
        VImage vImage = this._empty_image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_empty_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m25600l() {
        VText vText = this._empty_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_empty_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final TextView m25601m() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final RecyclerView m25602n() {
        RecyclerView recyclerView = this._recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("_recycler");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m25603p(long seeLastReadTime) {
        RecyclerView recyclerViewM25602n = m25602n();
        this.meetLikersAdapter = new x2y(this.presenter, seeLastReadTime);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.frag.act(), 2);
        gridLayoutManager.v(new C1342a(gridLayoutManager));
        recyclerViewM25602n.setLayoutManager(gridLayoutManager);
        recyclerViewM25602n.addItemDecoration(new C1343b());
        RecyclerView.Adapter adapter = this.meetLikersAdapter;
        if (adapter == null) {
            Intrinsics.r("meetLikersAdapter");
            adapter = null;
        }
        recyclerViewM25602n.setAdapter(adapter);
        new k(new o4y(new C1345d(recyclerViewM25602n))).g(recyclerViewM25602n);
        recyclerViewM25602n.addOnScrollListener(new C1344c());
        m25601m().setText("解锁所有喜欢我的人");
        xdl0.E0(m25601m(), new View.OnClickListener() { // from class: l.y4y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z4y.m25589a(this.f22895a, view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m25604q() {
        m25599k().setImageResource(b3c0.g6);
        m25600l().setTextSize(14.0f);
        m25600l().setTextColor(Color.parseColor("#42000000"));
        VText vTextM25600l = m25600l();
        Act act = act();
        vTextM25600l.setText(act != null ? act.string(R.string.e1) : null);
    }

    /* JADX INFO: renamed from: s */
    public final void m25605s(@NotNull List<? extends mwl> users) {
        users.getClass();
        if (users.isEmpty()) {
            xdl0.M(m25602n(), false);
            xdl0.M(m25598j(), true);
            m25604q();
            return;
        }
        xdl0.M(m25602n(), true);
        xdl0.M(m25598j(), false);
        x2y x2yVar = this.meetLikersAdapter;
        if (x2yVar == null) {
            Intrinsics.r("meetLikersAdapter");
            x2yVar = null;
        }
        x2yVar.m24692M(users);
    }

    /* JADX INFO: renamed from: u */
    public final void m25606u(boolean hasSeePrivilege) {
        this.hasSeePrivilege = hasSeePrivilege;
        xdl0.M(m25601m(), !hasSeePrivilege);
    }

    public void destroy() {
    }
}
