package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserHeaderView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserItemView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class zer extends dac0<LikedUser> {

    /* JADX INFO: renamed from: c */
    public ArrayList<LikedUser> f202857c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public ehr f202858d;

    /* JADX INFO: renamed from: e */
    public boolean f202859e;

    public zer(ehr ehrVar) {
        this.f202858d = ehrVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int size;
        if (this.f202857c.isEmpty()) {
            return 0;
        }
        if (gr9.m127679d()) {
            size = this.f202857c.size();
        } else {
            if (!this.f202859e && this.f202857c.size() > 50) {
                return 51;
            }
            if (this.f202857c.size() > 500) {
                return 501;
            }
            size = this.f202857c.size();
        }
        return size + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        ehr ehrVar = this.f202858d;
        return i == 0 ? ehrVar.act().inflater().inflate(k6c0.f121366c0, viewGroup, false) : ehrVar.act().inflater().inflate(k6c0.f121362b0, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final LikedUser likedUser, int i, final int i2) {
        if (i == 1) {
            final LikedUserItemView likedUserItemView = (LikedUserItemView) view;
            final int i3 = 4;
            mo67374c(this.f202858d.f91372a, CoreModule.f17545c.f19639e0.m169410Ka(likedUser.f20432id)).subscribe(mkd0.m154955G(new e30() { // from class: l.uer
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f176069a.m218399Q(likedUser, likedUserItemView, i2, i3, (User) obj);
                }
            }));
        } else if (i == 0) {
            ((LikedUserHeaderView) view).m46790b();
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public LikedUser getItem(int i) {
        if (i > 0) {
            return this.f202857c.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final void m218394L(LikedUserItemView likedUserItemView) {
        xdl0.m208345M0(likedUserItemView.f29974b, false);
        xdl0.m208344M(likedUserItemView.f29983k, false);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m218395M(LikedUser likedUser) {
        this.f202858d.m116556e1(likedUser);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m218396N(LikedUserItemView likedUserItemView, Boolean bool) {
        if (bool.booleanValue()) {
            m218404V(likedUserItemView);
        } else {
            m218394L(likedUserItemView);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m218397O(User user, int i, int i2, final LikedUserItemView likedUserItemView, LikedUser likedUser) {
        if (this.f202858d.m116537D0() && !this.f202858d.m116539F0(user)) {
            zvf0.m220396r("e_iliked_photo", this.f202858d.f91372a.pageId());
            if (!this.f202859e && i > i2 && !gr9.m127679d()) {
                this.f202858d.m116557f1("p_navigation_ilike,card_button_pull");
                return;
            }
            ehr ehrVar = this.f202858d;
            ehrVar.f91375d = likedUser;
            ehrVar.f91374c = likedUserItemView;
            if (TEnum.equals(likedUser.status, "superliked") || TEnum.equals(likedUser.status, "lettered")) {
                CoreModule.f17545c.f19625Z0.m163931f4(likedUser.f20432id);
            }
            CoreModule.m29935P().m94651a().mo33585s7(this.f202858d.f91372a, likedUser.f20432id, likedUserItemView, new e30() { // from class: l.yer
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f197717a.m218396N(likedUserItemView, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m218398P(LikedUser likedUser, User user, Boolean bool) {
        this.f202858d.m116555d1(bool.booleanValue(), likedUser, user, true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m218399Q(final LikedUser likedUser, final LikedUserItemView likedUserItemView, final int i, final int i2, final User user) {
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            e51.m114742G(new Runnable() { // from class: l.ver
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181217a.m218395M(likedUser);
                }
            });
            return;
        }
        boolean z = false;
        if (!gr9.m127679d() && !this.f202859e && i > i2) {
            z = true;
        }
        likedUserItemView.m46799h(likedUser, user, z, new e30() { // from class: l.wer
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185963a.m218397O(user, i, i2, likedUserItemView, (LikedUser) obj);
            }
        }, new e30() { // from class: l.xer
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192616a.m218398P(likedUser, user, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m218400R(boolean z) {
        if (this.f202859e != z) {
            this.f202859e = z;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: S */
    public boolean m218401S(LikedUser likedUser) {
        int iIndexOf = this.f202857c.contains(likedUser) ? this.f202857c.indexOf(likedUser) + 1 : -1;
        if (iIndexOf == -1) {
            return false;
        }
        this.f202857c.remove(likedUser);
        if (this.f202857c.size() > 0) {
            notifyItemRemoved(iIndexOf);
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public void m218402T(List<LikedUser> list, boolean z) {
        this.f202859e = z;
        this.f202857c.clear();
        if (!vwb.m200296J(list)) {
            this.f202857c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: U */
    public int m218403U() {
        if (vwb.m200296J(this.f202857c)) {
            return 0;
        }
        return this.f202857c.size();
    }

    /* JADX INFO: renamed from: V */
    public final void m218404V(LikedUserItemView likedUserItemView) {
        xdl0.m208345M0(likedUserItemView.f29974b, true);
        if (TEnum.equals(likedUserItemView.f29987o.status, "superliked")) {
            xdl0.m208344M(likedUserItemView.f29983k, true);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (this.f202857c.isEmpty() || i != this.f202857c.size() - 2) {
            return;
        }
        ehr ehrVar = this.f202858d;
        if (ehrVar.f91378g) {
            if (Network.isConnected(ehrVar.f91372a)) {
                this.f202858d.m116550X0();
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
