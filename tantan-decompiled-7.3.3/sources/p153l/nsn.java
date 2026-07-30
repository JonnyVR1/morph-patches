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
import com.p051p1.mobile.putong.core.p058ui.intllikedusers.IntlLikedUserHeaderView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class nsn extends jic0<LikeUser> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<LikeUser> f143517c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final bwl f143518d;

    /* JADX INFO: renamed from: e */
    public final Context f143519e;

    public nsn(zsn zsnVar) {
        this.f143518d = zsnVar;
        this.f143519e = zsnVar.f205884c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f143517c.isEmpty()) {
            return 0;
        }
        if (joa.m146386f4() && this.f143517c.size() > 50) {
            return 51;
        }
        if (this.f143517c.size() > 500) {
            return 501;
        }
        return this.f143517c.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        Context context = this.f143519e;
        return i == 0 ? LayoutInflater.from(context).inflate(pec0.f152029q, viewGroup, false) : LayoutInflater.from(context).inflate(pec0.f152021o, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, LikeUser likeUser, int i, int i2) {
        if (i == 1) {
            m164617K((IntlILikeUserItemView) view, likeUser);
        } else if (i == 0) {
            ((IntlLikedUserHeaderView) view).m47423b();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m164617K(final IntlILikeUserItemView intlILikeUserItemView, final LikeUser likeUser) {
        mo68557c((ner) this.f143519e, CoreModule.f18264c.f20381e0.m116483Ka(likeUser.userId)).subscribe(psd0.m173596G(new y20() { // from class: l.isn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116685a.m164623Q(likeUser, intlILikeUserItemView, (User) obj);
            }
        }));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public LikeUser getItem(int i) {
        if (i <= 0 || i > this.f143517c.size()) {
            return null;
        }
        return this.f143517c.get(i - 1);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m164619M(LikeUser likeUser) {
        this.f143518d.mo98903K(likeUser);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m164620N(User user, IntlILikeUserItemView intlILikeUserItemView, LikeUser likeUser) {
        if (this.f143518d.mo98917o(user)) {
            return;
        }
        this.f143518d.mo98898G(likeUser, intlILikeUserItemView);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m164621O(LikeUser likeUser, User user, Boolean bool) {
        this.f143518d.mo98905N(likeUser, user);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m164622P(User user, Boolean bool) {
        this.f143518d.mo99759t(user);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m164623Q(final LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView, final User user) {
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            l51.m152887G(new Runnable() { // from class: l.jsn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f122479a.m164619M(likeUser);
                }
            });
        } else {
            intlILikeUserItemView.m47421k(likeUser, user, new y20() { // from class: l.ksn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f128593a.m164620N(user, intlILikeUserItemView, (LikeUser) obj);
                }
            }, new y20() { // from class: l.lsn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133436a.m164621O(likeUser, user, (Boolean) obj);
                }
            }, new y20() { // from class: l.msn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f138500a.m164622P(user, (Boolean) obj);
                }
            }, 1);
        }
    }

    /* JADX INFO: renamed from: R */
    public boolean m164624R(LikeUser likeUser) {
        int iIndexOf = this.f143517c.indexOf(likeUser);
        if (iIndexOf == -1) {
            return false;
        }
        this.f143517c.remove(iIndexOf);
        if (this.f143517c.isEmpty()) {
            notifyDataSetChanged();
        } else {
            notifyItemRemoved(iIndexOf + 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public void m164625S(List<LikeUser> list) {
        this.f143517c.clear();
        if (!jyb.m147479J(list)) {
            this.f143517c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public int m164626T() {
        return this.f143517c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (!this.f143517c.isEmpty() && i == this.f143517c.size() - 2 && this.f143518d.mo98916g()) {
            if (Network.isConnected(this.f143519e)) {
                this.f143518d.mo98915b();
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
