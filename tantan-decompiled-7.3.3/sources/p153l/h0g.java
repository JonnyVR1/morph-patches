package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersFrag;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersItem;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.IntlFakeLikersItem;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.IntlFakeTurboItem;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.IntlLikersAdmobItem;
import com.p051p1.mobile.putong.core.p058ui.view.LikersFilterItemView;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksHeaderView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class h0g extends jic0<User> {

    /* JADX INFO: renamed from: d */
    public InterfaceC17363a f107289d;

    /* JADX INFO: renamed from: e */
    public m1g f107290e;

    /* JADX INFO: renamed from: f */
    public FakeLikersFrag f107291f;

    /* JADX INFO: renamed from: i */
    public final long f107294i;

    /* JADX INFO: renamed from: j */
    public boolean f107295j;

    /* JADX INFO: renamed from: k */
    public View f107296k;

    /* JADX INFO: renamed from: l */
    public User f107297l;

    /* JADX INFO: renamed from: c */
    public List<User> f107288c = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f107292g = -1;

    /* JADX INFO: renamed from: h */
    public String f107293h = "";

    /* JADX INFO: renamed from: m */
    public int f107298m = 0;

    /* JADX INFO: renamed from: l.h0g$a */
    public interface InterfaceC17363a {
        /* JADX INFO: renamed from: a */
        void mo133168a(User user, int i);
    }

    public h0g(FakeLikersFrag fakeLikersFrag) {
        this.f107291f = fakeLikersFrag;
        m1g m1gVarM56145Q4 = fakeLikersFrag.m56145Q4();
        this.f107290e = m1gVarM56145Q4;
        this.f107294i = m1gVarM56145Q4.f134422i;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m133151F(User user, View view, View view2) {
        i4g0.m138523u("e_see_who_likes_me_like", "p_see_who_likes_me_view", jyb.m147494Y("see_card_source", CoreModule.f18264c.f20429u0.m31381C5(user) ? "instant_chat" : "see"));
        view.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m133155T() {
        this.f107290e.m156662J0();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int size = this.f107288c.size();
        if (!m133162P() && !CoreModule.m30933P().m143405a().mo34532k()) {
            if (jyb.m147479J(this.f107288c)) {
                return 0;
            }
            return size;
        }
        if (rs9.m182939h()) {
            this.f107298m = 2;
        } else {
            this.f107298m = 1;
        }
        return size + this.f107298m;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f107290e.act().inflater().inflate(pec0.f151975c1, viewGroup, false);
        }
        if (i == 3) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(pec0.f152013m, viewGroup, false);
        }
        if (i == 6) {
            return LayoutInflater.from(this.f107290e.act()).inflate(pec0.f151986f0, viewGroup, false);
        }
        if (i == 4) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(pec0.f152009l, viewGroup, false);
        }
        return i == 5 ? LayoutInflater.from(viewGroup.getContext()).inflate(pec0.f152025p, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(pec0.f151997i, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(final View view, final User user, int i, final int i2) {
        if (i == 2) {
            ((PicksHeaderView) view).m58006b((this.f107290e.f134415b == BusinessEntranceStyle.PICKS && PicksHelper.INSTANCE.m57923b().m57919n()) ? PicksHelper.HeaderType.EXPAND : PicksHelper.HeaderType.HIDE);
            return;
        }
        if (i == 5) {
            View view2 = this.f107296k;
            if (view2 == null) {
                return;
            }
            ((IntlLikersAdmobItem) view).m56164e(view2);
            return;
        }
        if (view instanceof FakeLikersItem) {
            FakeLikersItem fakeLikersItem = (FakeLikersItem) view;
            fakeLikersItem.m56152l(user);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.c0g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f79267a.m133163Q(user, i2, view3);
                }
            });
            bnl0.m105509E0(fakeLikersItem.f36635m, new View.OnClickListener() { // from class: l.d0g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    h0g.m133151F(user, view, view3);
                }
            });
            return;
        }
        if (view instanceof IntlFakeLikersItem) {
            ((IntlFakeLikersItem) view).m56154i(user);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.e0g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f91460a.m133164R(user, view3);
                }
            });
            return;
        }
        if (view instanceof IntlFakeTurboItem) {
            if (this.f107295j) {
                bnl0.m105524M(view, true);
            }
            ((IntlFakeTurboItem) view).m56160k0(i2);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.f0g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f96673a.m133165S(view, i2, view3);
                }
            });
            return;
        }
        if (view instanceof LikersFilterItemView) {
            LikersFilterItemView likersFilterItemView = (LikersFilterItemView) view;
            likersFilterItemView.m57316z(new x20() { // from class: l.g0g
                @Override // p153l.x20
                public final void call() {
                    this.f101654a.m133155T();
                }
            });
            likersFilterItemView.setSeeCount(this.f107290e.m156674x0());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m133157K(User user, int i, View view) {
        if (i >= this.f107288c.size()) {
            return;
        }
        this.f107296k = view;
        this.f107297l = user;
        this.f107288c.add(i, user);
        notifyItemInserted(i);
    }

    /* JADX INFO: renamed from: L */
    public void m133158L(boolean z) {
        if (this.f107296k != null) {
            this.f107288c.remove(this.f107297l);
            this.f107297l = null;
            this.f107296k = null;
            if (z) {
                notifyDataSetChanged();
            }
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        if (m133161O(i)) {
            return null;
        }
        if (!CoreModule.m30933P().m143405a().mo34532k()) {
            return this.f107288c.get(i);
        }
        int i2 = this.f107298m;
        if (i < i2) {
            return null;
        }
        return this.f107288c.get(i - i2);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m133160N(int i) {
        if (i >= this.f107288c.size()) {
            return false;
        }
        User user = this.f107288c.get(i);
        return NullChecker.m82486a(user) && TextUtils.equals(user.f56859id, "intlSeeListAd");
    }

    /* JADX INFO: renamed from: O */
    public final boolean m133161O(int i) {
        return m133162P() && i == this.f107288c.size();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m133162P() {
        return this.f107290e.m156666P0() && this.f107288c.size() < 4;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m133163Q(User user, int i, View view) {
        if (NullChecker.m82486a(this.f107289d)) {
            this.f107289d.mo133168a(user, i);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m133164R(User user, View view) {
        if (NullChecker.m82486a(this.f107289d)) {
            this.f107289d.mo133168a(user, -1);
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m133165S(View view, int i, View view2) {
        ((IntlFakeTurboItem) view).m56162n0(i, this.f107290e.act());
    }

    /* JADX INFO: renamed from: U */
    public void m133166U(InterfaceC17363a interfaceC17363a) {
        this.f107289d = interfaceC17363a;
    }

    /* JADX INFO: renamed from: V */
    public void m133167V(List<User> list) {
        this.f107288c = list;
        this.f107295j = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m133161O(i)) {
            return 4;
        }
        if (m133160N(i)) {
            return 5;
        }
        if (CoreModule.m30933P().m143405a().mo34532k() && i == 0) {
            return 2;
        }
        if (CoreModule.m30933P().m143405a().mo34532k() && rs9.m182939h() && i == 1) {
            return 6;
        }
        return this.f107290e.m156666P0() ? 3 : 1;
    }
}
