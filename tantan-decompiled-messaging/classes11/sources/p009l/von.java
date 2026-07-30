package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p002ui.intllikedusers.IntlILikeUserItemView;
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
public class von extends dac0<LikeUser> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<LikeUser> f21711c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ntl f21712d;

    /* JADX INFO: renamed from: e */
    public final Context f21713e;

    public von(apn apnVar) {
        this.f21712d = apnVar;
        this.f21713e = apnVar.f9616c.act();
    }

    /* JADX INFO: renamed from: C */
    public int m23553C() {
        if (this.f21711c.isEmpty()) {
            return 0;
        }
        if (xma.e4() && this.f21711c.size() > 50) {
            return 50;
        }
        if (this.f21711c.size() > 500) {
            return 500;
        }
        return this.f21711c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m23554D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f21713e).inflate(k6c0.o, viewGroup, false);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m23552A(View view, final LikeUser likeUser, int i, int i2) {
        final IntlILikeUserItemView intlILikeUserItemView = (IntlILikeUserItemView) view;
        c(this.f21713e, CoreModule.c.e0.Ka(likeUser.userId)).subscribe(mkd0.G(new e30() { // from class: l.qon
            public final void call(Object obj) {
                this.f19409a.m23561P(likeUser, intlILikeUserItemView, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public LikeUser getItem(int i) {
        if (i < 0 || i >= this.f21711c.size()) {
            return null;
        }
        return this.f21711c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m23557L(LikeUser likeUser) {
        this.f21712d.mo19517K(likeUser);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m23558M(User user, IntlILikeUserItemView intlILikeUserItemView, LikeUser likeUser) {
        if (this.f21712d.mo19521o(user)) {
            return;
        }
        this.f21712d.mo19516G(likeUser, intlILikeUserItemView);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m23559N(LikeUser likeUser, User user, Boolean bool) {
        this.f21712d.mo19518N(likeUser, user);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m23560O(User user, Boolean bool) {
        this.f21712d.mo11585t(user);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m23561P(final LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView, final User user) {
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            e51.G(new Runnable() { // from class: l.ron
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19933a.m23557L(likeUser);
                }
            });
        } else {
            intlILikeUserItemView.m8324k(likeUser, user, new e30() { // from class: l.son
                public final void call(Object obj) {
                    this.f20402a.m23558M(user, intlILikeUserItemView, (LikeUser) obj);
                }
            }, new e30() { // from class: l.ton
                public final void call(Object obj) {
                    this.f20803a.m23559N(likeUser, user, (Boolean) obj);
                }
            }, new e30() { // from class: l.uon
                public final void call(Object obj) {
                    this.f21278a.m23560O(user, (Boolean) obj);
                }
            }, 2);
        }
    }

    /* JADX INFO: renamed from: Q */
    public boolean m23562Q(LikeUser likeUser) {
        int iIndexOf = this.f21711c.indexOf(likeUser);
        if (iIndexOf == -1) {
            return false;
        }
        this.f21711c.remove(iIndexOf);
        if (this.f21711c.isEmpty()) {
            notifyDataSetChanged();
            return true;
        }
        notifyItemRemoved(iIndexOf);
        return true;
    }

    /* JADX INFO: renamed from: R */
    public void m23563R(List<LikeUser> list) {
        this.f21711c.clear();
        if (!vwb.J(list)) {
            this.f21711c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: S */
    public int m23564S() {
        return this.f21711c.size();
    }

    /* JADX INFO: renamed from: e */
    public void m23565e(int i) {
        if (!this.f21711c.isEmpty() && i == this.f21711c.size() - 2 && this.f21712d.mo19520g()) {
            if (Network.isConnected(this.f21713e)) {
                this.f21712d.mo19519b();
            } else {
                lsi0.w(R.string.F);
            }
        }
    }

    public int getItemViewType(int i) {
        return 0;
    }
}
