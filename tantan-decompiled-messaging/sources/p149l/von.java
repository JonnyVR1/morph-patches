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
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class von extends dac0<LikeUser> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<LikeUser> f182406c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ntl f182407d;

    /* JADX INFO: renamed from: e */
    public final Context f182408e;

    public von(apn apnVar) {
        this.f182407d = apnVar;
        this.f182408e = apnVar.f71064c.act();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f182406c.isEmpty()) {
            return 0;
        }
        if (xma.m210071e4() && this.f182406c.size() > 50) {
            return 50;
        }
        if (this.f182406c.size() > 500) {
            return 500;
        }
        return this.f182406c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f182408e).inflate(k6c0.f121413o, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final LikeUser likeUser, int i, int i2) {
        final IntlILikeUserItemView intlILikeUserItemView = (IntlILikeUserItemView) view;
        mo67374c((mcr) this.f182408e, CoreModule.f17545c.f19639e0.m169410Ka(likeUser.userId)).subscribe(mkd0.m154955G(new e30() { // from class: l.qon
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155606a.m199186P(likeUser, intlILikeUserItemView, (User) obj);
            }
        }));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public LikeUser getItem(int i) {
        if (i < 0 || i >= this.f182406c.size()) {
            return null;
        }
        return this.f182406c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m199182L(LikeUser likeUser) {
        this.f182407d.mo161389K(likeUser);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m199183M(User user, IntlILikeUserItemView intlILikeUserItemView, LikeUser likeUser) {
        if (this.f182407d.mo161393o(user)) {
            return;
        }
        this.f182407d.mo161388G(likeUser, intlILikeUserItemView);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m199184N(LikeUser likeUser, User user, Boolean bool) {
        this.f182407d.mo161390N(likeUser, user);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m199185O(User user, Boolean bool) {
        this.f182407d.mo98160t(user);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m199186P(final LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView, final User user) {
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            e51.m114742G(new Runnable() { // from class: l.ron
                @Override // java.lang.Runnable
                public final void run() {
                    this.f160398a.m199182L(likeUser);
                }
            });
        } else {
            intlILikeUserItemView.m46238k(likeUser, user, new e30() { // from class: l.son
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f165707a.m199183M(user, intlILikeUserItemView, (LikeUser) obj);
                }
            }, new e30() { // from class: l.ton
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171392a.m199184N(likeUser, user, (Boolean) obj);
                }
            }, new e30() { // from class: l.uon
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177519a.m199185O(user, (Boolean) obj);
                }
            }, 2);
        }
    }

    /* JADX INFO: renamed from: Q */
    public boolean m199187Q(LikeUser likeUser) {
        int iIndexOf = this.f182406c.indexOf(likeUser);
        if (iIndexOf == -1) {
            return false;
        }
        this.f182406c.remove(iIndexOf);
        if (this.f182406c.isEmpty()) {
            notifyDataSetChanged();
            return true;
        }
        notifyItemRemoved(iIndexOf);
        return true;
    }

    /* JADX INFO: renamed from: R */
    public void m199188R(List<LikeUser> list) {
        this.f182406c.clear();
        if (!vwb.m200296J(list)) {
            this.f182406c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: S */
    public int m199189S() {
        return this.f182406c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (!this.f182406c.isEmpty() && i == this.f182406c.size() - 2 && this.f182407d.mo161392g()) {
            if (Network.isConnected(this.f182408e)) {
                this.f182407d.mo161391b();
            } else {
                lsi0.m151593w(R$string.f20578F);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }
}
