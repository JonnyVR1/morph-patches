package p006l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.FakeLikersFrag;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.FakeLikersItem;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.IntlFakeLikersItem;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.IntlFakeTurboItem;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.IntlLikersAdmobItem;
import com.p000p1.mobile.putong.core.p004ui.view.LikersFilterItemView;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.PicksHelper;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.header.PicksHeaderView;
import com.p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.dac0;
import l.j760;
import l.k6c0;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tyf extends dac0<User> {

    /* JADX INFO: renamed from: d */
    public InterfaceC1326a f22339d;

    /* JADX INFO: renamed from: e */
    public yzf f22340e;

    /* JADX INFO: renamed from: f */
    public FakeLikersFrag f22341f;

    /* JADX INFO: renamed from: i */
    public final long f22344i;

    /* JADX INFO: renamed from: j */
    public boolean f22345j;

    /* JADX INFO: renamed from: k */
    public View f22346k;

    /* JADX INFO: renamed from: l */
    public User f22347l;

    /* JADX INFO: renamed from: c */
    public List<User> f22338c = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f22342g = -1;

    /* JADX INFO: renamed from: h */
    public String f22343h = "";

    /* JADX INFO: renamed from: m */
    public int f22348m = 0;

    /* JADX INFO: renamed from: l.tyf$a */
    public interface InterfaceC1326a {
        /* JADX INFO: renamed from: a */
        void mo14325a(User user, int i);
    }

    public tyf(FakeLikersFrag fakeLikersFrag) {
        this.f22341f = fakeLikersFrag;
        yzf yzfVarM8326Q4 = fakeLikersFrag.m8326Q4();
        this.f22340e = yzfVarM8326Q4;
        this.f22344i = yzfVarM8326Q4.f28523i;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m24846F(User user, View view, View view2) {
        zvf0.u("e_see_who_likes_me_like", "p_see_who_likes_me_view", new j760[]{vwb.Y("see_card_source", CoreModule.f1534c.f3676u0.m2420y5(user) ? "instant_chat" : "see")});
        view.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m24850T() {
        this.f22340e.m28502J0();
    }

    /* JADX INFO: renamed from: C */
    public int m24852C() {
        int size = this.f22338c.size();
        if (!m24860P() && !CoreModule.m1854P().m11706a().m5466k()) {
            if (vwb.J(this.f22338c)) {
                return 0;
            }
            return size;
        }
        if (gr9.m15939h()) {
            this.f22348m = 2;
        } else {
            this.f22348m = 1;
        }
        return size + this.f22348m;
    }

    /* JADX INFO: renamed from: D */
    public View m24853D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f22340e.act().inflater().inflate(k6c0.c1, viewGroup, false);
        }
        if (i == 3) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(k6c0.m, viewGroup, false);
        }
        if (i == 6) {
            return LayoutInflater.from(this.f22340e.act()).inflate(k6c0.f0, viewGroup, false);
        }
        if (i == 4) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(k6c0.l, viewGroup, false);
        }
        return i == 5 ? LayoutInflater.from(viewGroup.getContext()).inflate(k6c0.p, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(k6c0.i, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m24851A(final View view, final User user, int i, final int i2) {
        if (i == 2) {
            ((PicksHeaderView) view).m10293b((this.f22340e.f28516b == BusinessEntranceStyle.PICKS && PicksHelper.INSTANCE.m10199b().m10195n()) ? PicksHelper.HeaderType.EXPAND : PicksHelper.HeaderType.HIDE);
            return;
        }
        if (i == 5) {
            View view2 = this.f22346k;
            if (view2 == null) {
                return;
            }
            ((IntlLikersAdmobItem) view).m8346e(view2);
            return;
        }
        if (view instanceof FakeLikersItem) {
            FakeLikersItem fakeLikersItem = (FakeLikersItem) view;
            fakeLikersItem.m8334l(user);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.oyf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f18493a.m24861Q(user, i2, view3);
                }
            });
            xdl0.E0(fakeLikersItem.f5568m, new View.OnClickListener() { // from class: l.pyf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    tyf.m24846F(user, view, view3);
                }
            });
            return;
        }
        if (view instanceof IntlFakeLikersItem) {
            ((IntlFakeLikersItem) view).m8336i(user);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.qyf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f20160a.m24862R(user, view3);
                }
            });
            return;
        }
        if (view instanceof IntlFakeTurboItem) {
            if (this.f22345j) {
                xdl0.M(view, true);
            }
            ((IntlFakeTurboItem) view).m8342k0(i2);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.ryf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f20916a.m24863S(view, i2, view3);
                }
            });
            return;
        }
        if (view instanceof LikersFilterItemView) {
            LikersFilterItemView likersFilterItemView = (LikersFilterItemView) view;
            likersFilterItemView.m9558z(new d30() { // from class: l.syf
                public final void call() {
                    this.f21765a.m24850T();
                }
            });
            likersFilterItemView.setSeeCount(this.f22340e.m28516x0());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m24855K(User user, int i, View view) {
        if (i >= this.f22338c.size()) {
            return;
        }
        this.f22346k = view;
        this.f22347l = user;
        this.f22338c.add(i, user);
        notifyItemInserted(i);
    }

    /* JADX INFO: renamed from: L */
    public void m24856L(boolean z) {
        if (this.f22346k != null) {
            this.f22338c.remove(this.f22347l);
            this.f22347l = null;
            this.f22346k = null;
            if (z) {
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        if (m24859O(i)) {
            return null;
        }
        if (!CoreModule.m1854P().m11706a().m5466k()) {
            return this.f22338c.get(i);
        }
        int i2 = this.f22348m;
        if (i < i2) {
            return null;
        }
        return this.f22338c.get(i - i2);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m24858N(int i) {
        if (i >= this.f22338c.size()) {
            return false;
        }
        User user = this.f22338c.get(i);
        return NullChecker.a(user) && TextUtils.equals(((DbObject) user).id, "intlSeeListAd");
    }

    /* JADX INFO: renamed from: O */
    public final boolean m24859O(int i) {
        return m24860P() && i == this.f22338c.size();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m24860P() {
        return this.f22340e.m28506P0() && this.f22338c.size() < 4;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m24861Q(User user, int i, View view) {
        if (NullChecker.a(this.f22339d)) {
            this.f22339d.mo14325a(user, i);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m24862R(User user, View view) {
        if (NullChecker.a(this.f22339d)) {
            this.f22339d.mo14325a(user, -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m24863S(View view, int i, View view2) {
        ((IntlFakeTurboItem) view).m8344n0(i, this.f22340e.act());
    }

    /* JADX INFO: renamed from: U */
    public void m24864U(InterfaceC1326a interfaceC1326a) {
        this.f22339d = interfaceC1326a;
    }

    /* JADX INFO: renamed from: V */
    public void m24865V(List<User> list) {
        this.f22338c = list;
        this.f22345j = true;
    }

    public int getItemViewType(int i) {
        if (m24859O(i)) {
            return 4;
        }
        if (m24858N(i)) {
            return 5;
        }
        if (CoreModule.m1854P().m11706a().m5466k() && i == 0) {
            return 2;
        }
        if (CoreModule.m1854P().m11706a().m5466k() && gr9.m15939h() && i == 1) {
            return 6;
        }
        return this.f22340e.m28506P0() ? 3 : 1;
    }
}
