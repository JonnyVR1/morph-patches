package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserHeaderView;
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserItemView;
import com.p000p1.mobile.putong.data.RelationshipStatus;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.member.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.e51;
import l.gr9;
import l.k6c0;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zer extends dac0<LikedUser> {

    /* JADX INFO: renamed from: c */
    public ArrayList<LikedUser> f15719c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public ehr f15720d;

    /* JADX INFO: renamed from: e */
    public boolean f15721e;

    public zer(ehr ehrVar) {
        this.f15720d = ehrVar;
    }

    /* JADX INFO: renamed from: C */
    public int m17377C() {
        int size;
        if (this.f15719c.isEmpty()) {
            return 0;
        }
        if (gr9.d()) {
            size = this.f15719c.size();
        } else {
            if (!this.f15721e && this.f15719c.size() > 50) {
                return 51;
            }
            if (this.f15719c.size() > 500) {
                return 501;
            }
            size = this.f15719c.size();
        }
        return size + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m17378D(ViewGroup viewGroup, int i) {
        ehr ehrVar = this.f15720d;
        return i == 0 ? ehrVar.act().inflater().inflate(k6c0.c0, viewGroup, false) : ehrVar.act().inflater().inflate(k6c0.b0, viewGroup, false);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m17376A(View view, final LikedUser likedUser, int i, final int i2) {
        if (i == 1) {
            final LikedUserItemView likedUserItemView = (LikedUserItemView) view;
            final int i3 = 4;
            c(this.f15720d.f7377a, CoreModule.c.e0.Ka(likedUser.id)).subscribe(mkd0.G(new e30() { // from class: l.uer
                public final void call(Object obj) {
                    this.f13819a.m17386Q(likedUser, likedUserItemView, i2, i3, (User) obj);
                }
            }));
        } else if (i == 0) {
            ((LikedUserHeaderView) view).m465b();
        }
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public LikedUser getItem(int i) {
        if (i > 0) {
            return this.f15719c.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final void m17381L(LikedUserItemView likedUserItemView) {
        xdl0.M0(likedUserItemView.f83b, false);
        xdl0.M(likedUserItemView.f92k, false);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m17382M(LikedUser likedUser) {
        this.f15720d.m9888e1(likedUser);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m17383N(LikedUserItemView likedUserItemView, Boolean bool) {
        if (bool.booleanValue()) {
            m17391V(likedUserItemView);
        } else {
            m17381L(likedUserItemView);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m17384O(User user, int i, int i2, final LikedUserItemView likedUserItemView, LikedUser likedUser) {
        if (this.f15720d.m9867D0() && !this.f15720d.m9869F0(user)) {
            zvf0.r("e_iliked_photo", this.f15720d.f7377a.pageId());
            if (!this.f15721e && i > i2 && !gr9.d()) {
                this.f15720d.m9889f1("p_navigation_ilike,card_button_pull");
                return;
            }
            ehr ehrVar = this.f15720d;
            ehrVar.f7380d = likedUser;
            ehrVar.f7379c = likedUserItemView;
            if (TEnum.equals(likedUser.status, RelationshipStatus.superliked) || TEnum.equals(likedUser.status, RelationshipStatus.lettered)) {
                CoreModule.c.Z0.f4(likedUser.id);
            }
            CoreModule.P().a().s7(this.f15720d.f7377a, likedUser.id, likedUserItemView, new e30() { // from class: l.yer
                public final void call(Object obj) {
                    this.f15411a.m17383N(likedUserItemView, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m17385P(LikedUser likedUser, User user, Boolean bool) {
        this.f15720d.m9887d1(bool.booleanValue(), likedUser, user, true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m17386Q(final LikedUser likedUser, final LikedUserItemView likedUserItemView, final int i, final int i2, final User user) {
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            e51.G(new Runnable() { // from class: l.ver
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14158a.m17382M(likedUser);
                }
            });
            return;
        }
        boolean z = false;
        if (!gr9.d() && !this.f15721e && i > i2) {
            z = true;
        }
        likedUserItemView.m474h(likedUser, user, z, new e30() { // from class: l.wer
            public final void call(Object obj) {
                this.f14518a.m17384O(user, i, i2, likedUserItemView, (LikedUser) obj);
            }
        }, new e30() { // from class: l.xer
            public final void call(Object obj) {
                this.f14878a.m17385P(likedUser, user, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m17387R(boolean z) {
        if (this.f15721e != z) {
            this.f15721e = z;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: S */
    public boolean m17388S(LikedUser likedUser) {
        int iIndexOf = this.f15719c.contains(likedUser) ? this.f15719c.indexOf(likedUser) + 1 : -1;
        if (iIndexOf == -1) {
            return false;
        }
        this.f15719c.remove(likedUser);
        if (this.f15719c.size() > 0) {
            notifyItemRemoved(iIndexOf);
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public void m17389T(List<LikedUser> list, boolean z) {
        this.f15721e = z;
        this.f15719c.clear();
        if (!vwb.J(list)) {
            this.f15719c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: U */
    public int m17390U() {
        if (vwb.J(this.f15719c)) {
            return 0;
        }
        return this.f15719c.size();
    }

    /* JADX INFO: renamed from: V */
    public final void m17391V(LikedUserItemView likedUserItemView) {
        xdl0.M0(likedUserItemView.f83b, true);
        if (TEnum.equals(likedUserItemView.f96o.status, RelationshipStatus.superliked)) {
            xdl0.M(likedUserItemView.f92k, true);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m17392e(int i) {
        if (this.f15719c.isEmpty() || i != this.f15719c.size() - 2) {
            return;
        }
        ehr ehrVar = this.f15720d;
        if (ehrVar.f7383g) {
            if (Network.isConnected(ehrVar.f7377a)) {
                this.f15720d.m9880X0();
            } else {
                lsi0.w(R.string.F);
            }
        }
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
