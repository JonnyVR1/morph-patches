package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.intllikedusers.IntlILikeUserItemView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vqn extends jic0<LikeUser> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<LikeUser> f185374c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final bwl f185375d;

    /* JADX INFO: renamed from: e */
    public final Context f185376e;

    public vqn(arn arnVar) {
        this.f185375d = arnVar;
        this.f185376e = arnVar.f72972c.act();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f185374c.isEmpty()) {
            return 0;
        }
        if (joa.m146386f4() && this.f185374c.size() > 50) {
            return 50;
        }
        if (this.f185374c.size() > 500) {
            return 500;
        }
        return this.f185374c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f185376e).inflate(pec0.f152021o, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final LikeUser likeUser, int i, int i2) {
        final IntlILikeUserItemView intlILikeUserItemView = (IntlILikeUserItemView) view;
        mo68557c((ner) this.f185376e, CoreModule.f18264c.f20381e0.m116483Ka(likeUser.userId)).subscribe(psd0.m173596G(new y20() { // from class: l.qqn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159019a.m202420P(likeUser, intlILikeUserItemView, (User) obj);
            }
        }));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public LikeUser getItem(int i) {
        if (i < 0 || i >= this.f185374c.size()) {
            return null;
        }
        return this.f185374c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m202416L(LikeUser likeUser) {
        this.f185375d.mo98903K(likeUser);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m202417M(User user, IntlILikeUserItemView intlILikeUserItemView, LikeUser likeUser) {
        if (this.f185375d.mo98917o(user)) {
            return;
        }
        this.f185375d.mo98898G(likeUser, intlILikeUserItemView);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m202418N(LikeUser likeUser, User user, Boolean bool) {
        this.f185375d.mo98905N(likeUser, user);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m202419O(User user, Boolean bool) {
        this.f185375d.mo99759t(user);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m202420P(final LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView, final User user) {
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            l51.m152887G(new Runnable() { // from class: l.rqn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164501a.m202416L(likeUser);
                }
            });
        } else {
            intlILikeUserItemView.m47421k(likeUser, user, new y20() { // from class: l.sqn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f170187a.m202417M(user, intlILikeUserItemView, (LikeUser) obj);
                }
            }, new y20() { // from class: l.tqn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f175759a.m202418N(likeUser, user, (Boolean) obj);
                }
            }, new y20() { // from class: l.uqn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180492a.m202419O(user, (Boolean) obj);
                }
            }, 2);
        }
    }

    /* JADX INFO: renamed from: Q */
    public boolean m202421Q(LikeUser likeUser) {
        int iIndexOf = this.f185374c.indexOf(likeUser);
        if (iIndexOf == -1) {
            return false;
        }
        this.f185374c.remove(iIndexOf);
        if (this.f185374c.isEmpty()) {
            notifyDataSetChanged();
            return true;
        }
        notifyItemRemoved(iIndexOf);
        return true;
    }

    /* JADX INFO: renamed from: R */
    public void m202422R(List<LikeUser> list) {
        this.f185374c.clear();
        if (!jyb.m147479J(list)) {
            this.f185374c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: S */
    public int m202423S() {
        return this.f185374c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (!this.f185374c.isEmpty() && i == this.f185374c.size() - 2 && this.f185375d.mo98916g()) {
            if (Network.isConnected(this.f185376e)) {
                this.f185375d.mo98915b();
            } else {
                o1j0.m165649w(R$string.f21320F);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }
}
