package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.FakeLikersFrag;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.FakeLikersItem;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.IntlFakeLikersItem;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.IntlFakeTurboItem;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.IntlLikersAdmobItem;
import com.p046p1.mobile.putong.core.p053ui.view.LikersFilterItemView;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksHeaderView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class tyf extends dac0<User> {

    /* JADX INFO: renamed from: d */
    public InterfaceC20312a f172587d;

    /* JADX INFO: renamed from: e */
    public yzf f172588e;

    /* JADX INFO: renamed from: f */
    public FakeLikersFrag f172589f;

    /* JADX INFO: renamed from: i */
    public final long f172592i;

    /* JADX INFO: renamed from: j */
    public boolean f172593j;

    /* JADX INFO: renamed from: k */
    public View f172594k;

    /* JADX INFO: renamed from: l */
    public User f172595l;

    /* JADX INFO: renamed from: c */
    public List<User> f172586c = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f172590g = -1;

    /* JADX INFO: renamed from: h */
    public String f172591h = "";

    /* JADX INFO: renamed from: m */
    public int f172596m = 0;

    /* JADX INFO: renamed from: l.tyf$a */
    public interface InterfaceC20312a {
        /* JADX INFO: renamed from: a */
        void mo114179a(User user, int i);
    }

    public tyf(FakeLikersFrag fakeLikersFrag) {
        this.f172589f = fakeLikersFrag;
        yzf yzfVarM54962Q4 = fakeLikersFrag.m54962Q4();
        this.f172588e = yzfVarM54962Q4;
        this.f172592i = yzfVarM54962Q4.f200877i;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m191022F(User user, View view, View view2) {
        zvf0.m220399u("e_see_who_likes_me_like", "p_see_who_likes_me_view", vwb.m200311Y("see_card_source", CoreModule.f17545c.f19687u0.m30492y5(user) ? "instant_chat" : "see"));
        view.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m191026T() {
        this.f172588e.m216666J0();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int size = this.f172586c.size();
        if (!m191033P() && !CoreModule.m29935P().m94651a().mo33529k()) {
            if (vwb.m200296J(this.f172586c)) {
                return 0;
            }
            return size;
        }
        if (gr9.m127683h()) {
            this.f172596m = 2;
        } else {
            this.f172596m = 1;
        }
        return size + this.f172596m;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f172588e.act().inflater().inflate(k6c0.f121367c1, viewGroup, false);
        }
        if (i == 3) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(k6c0.f121405m, viewGroup, false);
        }
        if (i == 6) {
            return LayoutInflater.from(this.f172588e.act()).inflate(k6c0.f121378f0, viewGroup, false);
        }
        if (i == 4) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(k6c0.f121401l, viewGroup, false);
        }
        return i == 5 ? LayoutInflater.from(viewGroup.getContext()).inflate(k6c0.f121417p, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(k6c0.f121389i, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(final View view, final User user, int i, final int i2) {
        if (i == 2) {
            ((PicksHeaderView) view).m56823b((this.f172588e.f200870b == BusinessEntranceStyle.PICKS && PicksHelper.INSTANCE.m56740b().m56736n()) ? PicksHelper.HeaderType.EXPAND : PicksHelper.HeaderType.HIDE);
            return;
        }
        if (i == 5) {
            View view2 = this.f172594k;
            if (view2 == null) {
                return;
            }
            ((IntlLikersAdmobItem) view).m54981e(view2);
            return;
        }
        if (view instanceof FakeLikersItem) {
            FakeLikersItem fakeLikersItem = (FakeLikersItem) view;
            fakeLikersItem.m54969l(user);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.oyf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f146318a.m191034Q(user, i2, view3);
                }
            });
            xdl0.m208329E0(fakeLikersItem.f35787m, new View.OnClickListener() { // from class: l.pyf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    tyf.m191022F(user, view, view3);
                }
            });
            return;
        }
        if (view instanceof IntlFakeLikersItem) {
            ((IntlFakeLikersItem) view).m54971i(user);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.qyf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f156922a.m191035R(user, view3);
                }
            });
            return;
        }
        if (view instanceof IntlFakeTurboItem) {
            if (this.f172593j) {
                xdl0.m208344M(view, true);
            }
            ((IntlFakeTurboItem) view).m54977k0(i2);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.ryf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f161555a.m191036S(view, i2, view3);
                }
            });
            return;
        }
        if (view instanceof LikersFilterItemView) {
            LikersFilterItemView likersFilterItemView = (LikersFilterItemView) view;
            likersFilterItemView.m56133z(new d30() { // from class: l.syf
                @Override // p149l.d30
                public final void call() {
                    this.f166958a.m191026T();
                }
            });
            likersFilterItemView.setSeeCount(this.f172588e.m216678x0());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m191028K(User user, int i, View view) {
        if (i >= this.f172586c.size()) {
            return;
        }
        this.f172594k = view;
        this.f172595l = user;
        this.f172586c.add(i, user);
        notifyItemInserted(i);
    }

    /* JADX INFO: renamed from: L */
    public void m191029L(boolean z) {
        if (this.f172594k != null) {
            this.f172586c.remove(this.f172595l);
            this.f172595l = null;
            this.f172594k = null;
            if (z) {
                notifyDataSetChanged();
            }
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        if (m191032O(i)) {
            return null;
        }
        if (!CoreModule.m29935P().m94651a().mo33529k()) {
            return this.f172586c.get(i);
        }
        int i2 = this.f172596m;
        if (i < i2) {
            return null;
        }
        return this.f172586c.get(i - i2);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m191031N(int i) {
        if (i >= this.f172586c.size()) {
            return false;
        }
        User user = this.f172586c.get(i);
        return NullChecker.m81303a(user) && TextUtils.equals(user.f56011id, "intlSeeListAd");
    }

    /* JADX INFO: renamed from: O */
    public final boolean m191032O(int i) {
        return m191033P() && i == this.f172586c.size();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m191033P() {
        return this.f172588e.m216670P0() && this.f172586c.size() < 4;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m191034Q(User user, int i, View view) {
        if (NullChecker.m81303a(this.f172587d)) {
            this.f172587d.mo114179a(user, i);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m191035R(User user, View view) {
        if (NullChecker.m81303a(this.f172587d)) {
            this.f172587d.mo114179a(user, -1);
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m191036S(View view, int i, View view2) {
        ((IntlFakeTurboItem) view).m54979n0(i, this.f172588e.act());
    }

    /* JADX INFO: renamed from: U */
    public void m191037U(InterfaceC20312a interfaceC20312a) {
        this.f172587d = interfaceC20312a;
    }

    /* JADX INFO: renamed from: V */
    public void m191038V(List<User> list) {
        this.f172586c = list;
        this.f172593j = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m191032O(i)) {
            return 4;
        }
        if (m191031N(i)) {
            return 5;
        }
        if (CoreModule.m29935P().m94651a().mo33529k() && i == 0) {
            return 2;
        }
        if (CoreModule.m29935P().m94651a().mo33529k() && gr9.m127683h() && i == 1) {
            return 6;
        }
        return this.f172588e.m216670P0() ? 3 : 1;
    }
}
