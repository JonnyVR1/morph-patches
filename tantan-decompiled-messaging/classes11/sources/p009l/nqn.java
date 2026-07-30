package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p002ui.intllikedusers.IntlILikeUserItemView;
import com.p000p1.mobile.putong.core.p002ui.intllikedusers.IntlLikedUserHeaderView;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikeUser;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.e51;
import l.k6c0;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nqn extends dac0<LikeUser> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<LikeUser> f17615c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ntl f17616d;

    /* JADX INFO: renamed from: e */
    public final Context f17617e;

    public nqn(zqn zqnVar) {
        this.f17616d = zqnVar;
        this.f17617e = zqnVar.f23835c;
    }

    /* JADX INFO: renamed from: C */
    public int m19017C() {
        if (this.f17615c.isEmpty()) {
            return 0;
        }
        if (xma.e4() && this.f17615c.size() > 50) {
            return 51;
        }
        if (this.f17615c.size() > 500) {
            return 501;
        }
        return this.f17615c.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m19018D(ViewGroup viewGroup, int i) {
        Context context = this.f17617e;
        return i == 0 ? LayoutInflater.from(context).inflate(k6c0.q, viewGroup, false) : LayoutInflater.from(context).inflate(k6c0.o, viewGroup, false);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m19016A(View view, LikeUser likeUser, int i, int i2) {
        if (i == 1) {
            m19020K((IntlILikeUserItemView) view, likeUser);
        } else if (i == 0) {
            ((IntlLikedUserHeaderView) view).m8326b();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m19020K(final IntlILikeUserItemView intlILikeUserItemView, final LikeUser likeUser) {
        c(this.f17617e, CoreModule.c.e0.Ka(likeUser.userId)).subscribe(mkd0.G(new e30() { // from class: l.iqn
            public final void call(Object obj) {
                this.f14769a.m19026Q(likeUser, intlILikeUserItemView, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public LikeUser getItem(int i) {
        if (i <= 0 || i > this.f17615c.size()) {
            return null;
        }
        return this.f17615c.get(i - 1);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m19022M(LikeUser likeUser) {
        this.f17616d.mo19517K(likeUser);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m19023N(User user, IntlILikeUserItemView intlILikeUserItemView, LikeUser likeUser) {
        if (this.f17616d.mo19521o(user)) {
            return;
        }
        this.f17616d.mo19516G(likeUser, intlILikeUserItemView);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m19024O(LikeUser likeUser, User user, Boolean bool) {
        this.f17616d.mo19518N(likeUser, user);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m19025P(User user, Boolean bool) {
        this.f17616d.mo11585t(user);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m19026Q(final LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView, final User user) {
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            e51.G(new Runnable() { // from class: l.jqn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15260a.m19022M(likeUser);
                }
            });
        } else {
            intlILikeUserItemView.m8324k(likeUser, user, new e30() { // from class: l.kqn
                public final void call(Object obj) {
                    this.f15815a.m19023N(user, intlILikeUserItemView, (LikeUser) obj);
                }
            }, new e30() { // from class: l.lqn
                public final void call(Object obj) {
                    this.f16304a.m19024O(likeUser, user, (Boolean) obj);
                }
            }, new e30() { // from class: l.mqn
                public final void call(Object obj) {
                    this.f17051a.m19025P(user, (Boolean) obj);
                }
            }, 1);
        }
    }

    /* JADX INFO: renamed from: R */
    public boolean m19027R(LikeUser likeUser) {
        int iIndexOf = this.f17615c.indexOf(likeUser);
        if (iIndexOf == -1) {
            return false;
        }
        this.f17615c.remove(iIndexOf);
        if (this.f17615c.isEmpty()) {
            notifyDataSetChanged();
        } else {
            notifyItemRemoved(iIndexOf + 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public void m19028S(List<LikeUser> list) {
        this.f17615c.clear();
        if (!vwb.J(list)) {
            this.f17615c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public int m19029T() {
        return this.f17615c.size();
    }

    /* JADX INFO: renamed from: e */
    public void m19030e(int i) {
        if (!this.f17615c.isEmpty() && i == this.f17615c.size() - 2 && this.f17616d.mo19520g()) {
            if (Network.isConnected(this.f17617e)) {
                this.f17616d.mo19519b();
            } else {
                lsi0.w(R.string.F);
            }
        }
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
