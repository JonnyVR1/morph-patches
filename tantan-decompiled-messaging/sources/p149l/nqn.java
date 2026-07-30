package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.intllikedusers.IntlILikeUserItemView;
import com.p046p1.mobile.putong.core.p053ui.intllikedusers.IntlLikedUserHeaderView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nqn extends dac0<LikeUser> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<LikeUser> f140085c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ntl f140086d;

    /* JADX INFO: renamed from: e */
    public final Context f140087e;

    public nqn(zqn zqnVar) {
        this.f140086d = zqnVar;
        this.f140087e = zqnVar.f204403c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f140085c.isEmpty()) {
            return 0;
        }
        if (xma.m210071e4() && this.f140085c.size() > 50) {
            return 51;
        }
        if (this.f140085c.size() > 500) {
            return 501;
        }
        return this.f140085c.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        Context context = this.f140087e;
        return i == 0 ? LayoutInflater.from(context).inflate(k6c0.f121421q, viewGroup, false) : LayoutInflater.from(context).inflate(k6c0.f121413o, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, LikeUser likeUser, int i, int i2) {
        if (i == 1) {
            m160640K((IntlILikeUserItemView) view, likeUser);
        } else if (i == 0) {
            ((IntlLikedUserHeaderView) view).m46240b();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m160640K(final IntlILikeUserItemView intlILikeUserItemView, final LikeUser likeUser) {
        mo67374c((mcr) this.f140087e, CoreModule.f17545c.f19639e0.m169410Ka(likeUser.userId)).subscribe(mkd0.m154955G(new e30() { // from class: l.iqn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114529a.m160646Q(likeUser, intlILikeUserItemView, (User) obj);
            }
        }));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public LikeUser getItem(int i) {
        if (i <= 0 || i > this.f140085c.size()) {
            return null;
        }
        return this.f140085c.get(i - 1);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m160642M(LikeUser likeUser) {
        this.f140086d.mo161389K(likeUser);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m160643N(User user, IntlILikeUserItemView intlILikeUserItemView, LikeUser likeUser) {
        if (this.f140086d.mo161393o(user)) {
            return;
        }
        this.f140086d.mo161388G(likeUser, intlILikeUserItemView);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m160644O(LikeUser likeUser, User user, Boolean bool) {
        this.f140086d.mo161390N(likeUser, user);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m160645P(User user, Boolean bool) {
        this.f140086d.mo98160t(user);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m160646Q(final LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView, final User user) {
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            e51.m114742G(new Runnable() { // from class: l.jqn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f119305a.m160642M(likeUser);
                }
            });
        } else {
            intlILikeUserItemView.m46238k(likeUser, user, new e30() { // from class: l.kqn
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f124281a.m160643N(user, intlILikeUserItemView, (LikeUser) obj);
                }
            }, new e30() { // from class: l.lqn
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f129364a.m160644O(likeUser, user, (Boolean) obj);
                }
            }, new e30() { // from class: l.mqn
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f135280a.m160645P(user, (Boolean) obj);
                }
            }, 1);
        }
    }

    /* JADX INFO: renamed from: R */
    public boolean m160647R(LikeUser likeUser) {
        int iIndexOf = this.f140085c.indexOf(likeUser);
        if (iIndexOf == -1) {
            return false;
        }
        this.f140085c.remove(iIndexOf);
        if (this.f140085c.isEmpty()) {
            notifyDataSetChanged();
        } else {
            notifyItemRemoved(iIndexOf + 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public void m160648S(List<LikeUser> list) {
        this.f140085c.clear();
        if (!vwb.m200296J(list)) {
            this.f140085c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public int m160649T() {
        return this.f140085c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (!this.f140085c.isEmpty() && i == this.f140085c.size() - 2 && this.f140086d.mo161392g()) {
            if (Network.isConnected(this.f140087e)) {
                this.f140086d.mo161391b();
            } else {
                lsi0.m151593w(R$string.f20578F);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
