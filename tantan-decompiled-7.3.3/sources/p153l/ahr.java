package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserHeaderView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserItemView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ahr extends jic0<LikedUser> {

    /* JADX INFO: renamed from: c */
    public ArrayList<LikedUser> f71392c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public fjr f71393d;

    /* JADX INFO: renamed from: e */
    public boolean f71394e;

    public ahr(fjr fjrVar) {
        this.f71393d = fjrVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int size;
        if (this.f71392c.isEmpty()) {
            return 0;
        }
        if (rs9.m182935d()) {
            size = this.f71392c.size();
        } else {
            if (!this.f71394e && this.f71392c.size() > 50) {
                return 51;
            }
            if (this.f71392c.size() > 500) {
                return 501;
            }
            size = this.f71392c.size();
        }
        return size + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        fjr fjrVar = this.f71393d;
        return i == 0 ? fjrVar.act().inflater().inflate(pec0.f151974c0, viewGroup, false) : fjrVar.act().inflater().inflate(pec0.f151970b0, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final LikedUser likedUser, int i, final int i2) {
        if (i == 1) {
            final LikedUserItemView likedUserItemView = (LikedUserItemView) view;
            final int i3 = 4;
            mo68557c(this.f71393d.f99413a, CoreModule.f18264c.f20381e0.m116483Ka(likedUser.f21174id)).subscribe(psd0.m173596G(new y20() { // from class: l.vgr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f184053a.m97898Q(likedUser, likedUserItemView, i2, i3, (User) obj);
                }
            }));
        } else if (i == 0) {
            ((LikedUserHeaderView) view).m47973b();
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public LikedUser getItem(int i) {
        if (i > 0) {
            return this.f71392c.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final void m97893L(LikedUserItemView likedUserItemView) {
        bnl0.m105525M0(likedUserItemView.f30822b, false);
        bnl0.m105524M(likedUserItemView.f30831k, false);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m97894M(LikedUser likedUser) {
        this.f71393d.m125911e1(likedUser);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m97895N(LikedUserItemView likedUserItemView, Boolean bool) {
        if (bool.booleanValue()) {
            m97903V(likedUserItemView);
        } else {
            m97893L(likedUserItemView);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m97896O(User user, int i, int i2, final LikedUserItemView likedUserItemView, LikedUser likedUser) {
        if (this.f71393d.m125892D0() && !this.f71393d.m125894F0(user)) {
            i4g0.m138520r("e_iliked_photo", this.f71393d.f99413a.pageId());
            if (!this.f71394e && i > i2 && !rs9.m182935d()) {
                this.f71393d.m125912f1("p_navigation_ilike,card_button_pull");
                return;
            }
            fjr fjrVar = this.f71393d;
            fjrVar.f99416d = likedUser;
            fjrVar.f99415c = likedUserItemView;
            if (TEnum.equals(likedUser.status, "superliked") || TEnum.equals(likedUser.status, "lettered")) {
                CoreModule.f18264c.f20367Z0.m210789f4(likedUser.f21174id);
            }
            CoreModule.m30933P().m143405a().mo34588s7(this.f71393d.f99413a, likedUser.f21174id, likedUserItemView, new y20() { // from class: l.zgr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f204332a.m97895N(likedUserItemView, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m97897P(LikedUser likedUser, User user, Boolean bool) {
        this.f71393d.m125910d1(bool.booleanValue(), likedUser, user, true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m97898Q(final LikedUser likedUser, final LikedUserItemView likedUserItemView, final int i, final int i2, final User user) {
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            l51.m152887G(new Runnable() { // from class: l.wgr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f189001a.m97894M(likedUser);
                }
            });
            return;
        }
        boolean z = false;
        if (!rs9.m182935d() && !this.f71394e && i > i2) {
            z = true;
        }
        likedUserItemView.m47982h(likedUser, user, z, new y20() { // from class: l.xgr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194219a.m97896O(user, i, i2, likedUserItemView, (LikedUser) obj);
            }
        }, new y20() { // from class: l.ygr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199869a.m97897P(likedUser, user, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m97899R(boolean z) {
        if (this.f71394e != z) {
            this.f71394e = z;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: S */
    public boolean m97900S(LikedUser likedUser) {
        int iIndexOf = this.f71392c.contains(likedUser) ? this.f71392c.indexOf(likedUser) + 1 : -1;
        if (iIndexOf == -1) {
            return false;
        }
        this.f71392c.remove(likedUser);
        if (this.f71392c.size() > 0) {
            notifyItemRemoved(iIndexOf);
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public void m97901T(List<LikedUser> list, boolean z) {
        this.f71394e = z;
        this.f71392c.clear();
        if (!jyb.m147479J(list)) {
            this.f71392c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: U */
    public int m97902U() {
        if (jyb.m147479J(this.f71392c)) {
            return 0;
        }
        return this.f71392c.size();
    }

    /* JADX INFO: renamed from: V */
    public final void m97903V(LikedUserItemView likedUserItemView) {
        bnl0.m105525M0(likedUserItemView.f30822b, true);
        if (TEnum.equals(likedUserItemView.f30835o.status, "superliked")) {
            bnl0.m105524M(likedUserItemView.f30831k, true);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (this.f71392c.isEmpty() || i != this.f71392c.size() - 2) {
            return;
        }
        fjr fjrVar = this.f71393d;
        if (fjrVar.f99419g) {
            if (Network.isConnected(fjrVar.f99413a)) {
                this.f71393d.m125905X0();
            } else {
                o1j0.m165649w(R$string.f21320F);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
