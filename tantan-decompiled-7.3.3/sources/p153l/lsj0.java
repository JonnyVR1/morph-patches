package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.data.DislikedUsers;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserHeaderView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.undolike.UnDoLikedUserItemView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.undolike.UndoCoverAnimView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class lsj0 extends jic0<DislikedUsers> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<DislikedUsers> f133431c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ctj0 f133432d;

    /* JADX INFO: renamed from: e */
    public boolean f133433e;

    public lsj0(ctj0 ctj0Var) {
        this.f133432d = ctj0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m155704K() {
        if (this.f133433e) {
            return;
        }
        this.f133432d.m112510F0("p_navigation_disliked,card_button_pull");
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f133431c.isEmpty()) {
            return 0;
        }
        if (!this.f133433e && this.f133431c.size() > 50) {
            return 51;
        }
        if (this.f133431c.size() > 500) {
            return 501;
        }
        return this.f133431c.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        ctj0 ctj0Var = this.f133432d;
        return i == 0 ? ctj0Var.act().inflater().inflate(pec0.f151974c0, viewGroup, false) : ctj0Var.act().inflater().inflate(pec0.f151931O1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final DislikedUsers dislikedUsers, int i, int i2) {
        if (i == 1) {
            final UnDoLikedUserItemView unDoLikedUserItemView = (UnDoLikedUserItemView) view;
            unDoLikedUserItemView.m48022h(dislikedUsers, !this.f133433e && i2 > 10, new x20() { // from class: l.isj0
                @Override // p153l.x20
                public final void call() {
                    this.f116674a.m155707J(unDoLikedUserItemView, dislikedUsers);
                }
            }, new x20() { // from class: l.jsj0
                @Override // p153l.x20
                public final void call() {
                    this.f122468a.m155704K();
                }
            });
        } else if (i == 0) {
            ((LikedUserHeaderView) view).m47974c();
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public DislikedUsers getItem(int i) {
        if (i > 0) {
            return this.f133431c.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m155707J(UnDoLikedUserItemView unDoLikedUserItemView, DislikedUsers dislikedUsers) {
        i4g0.m138520r("e_undo_button", this.f133432d.f83705b.pageId());
        m155712P(unDoLikedUserItemView, dislikedUsers);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m155708L(View view, ViewGroup viewGroup, UndoCoverAnimView undoCoverAnimView, DislikedUsers dislikedUsers, Integer num) {
        if (!this.f133432d.m112512r0()) {
            if (num.intValue() == 0) {
                this.f133432d.m112510F0("p_navigation_disliked,card_button_pull");
                view.setVisibility(0);
                viewGroup.removeView(undoCoverAnimView);
                return;
            }
            return;
        }
        if (num.intValue() != 1) {
            view.setVisibility(0);
            viewGroup.removeView(undoCoverAnimView);
        } else if (this.f133432d.m112509E0(dislikedUsers)) {
            this.f133432d.m112508D0(dislikedUsers);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m155709M(boolean z) {
        if (this.f133433e != z) {
            this.f133433e = z;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: N */
    public boolean m155710N(DislikedUsers dislikedUsers) {
        int iIndexOf = this.f133431c.contains(dislikedUsers) ? this.f133431c.indexOf(dislikedUsers) + 1 : -1;
        if (iIndexOf == -1) {
            return false;
        }
        this.f133431c.remove(dislikedUsers);
        if (this.f133431c.size() > 0) {
            notifyItemRemoved(iIndexOf);
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public void m155711O(List<DislikedUsers> list, boolean z) {
        this.f133433e = z;
        this.f133431c.clear();
        if (!jyb.m147479J(list)) {
            this.f133431c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P */
    public final void m155712P(final View view, final DislikedUsers dislikedUsers) {
        final UndoCoverAnimView undoCoverAnimView = (UndoCoverAnimView) p9r.m171370a(this.f133432d.m99640Y()).inflate(pec0.f151928N1, (ViewGroup) null);
        final ViewGroup viewGroup = (ViewGroup) this.f133432d.f83704a.getWindow().getDecorView();
        viewGroup.addView(undoCoverAnimView, new ViewGroup.LayoutParams(-1, -1));
        undoCoverAnimView.setAnimCallback(new y20() { // from class: l.ksj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128577a.m155708L(view, viewGroup, undoCoverAnimView, dislikedUsers, (Integer) obj);
            }
        });
        undoCoverAnimView.m48033j(view, dislikedUsers);
    }

    /* JADX INFO: renamed from: Q */
    public int m155713Q() {
        if (jyb.m147479J(this.f133431c)) {
            return 0;
        }
        return this.f133431c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (this.f133431c.isEmpty() || i != this.f133431c.size() - 2 || this.f133432d.m112511q0() == null || TextUtils.isEmpty(this.f133432d.m112511q0().next)) {
            return;
        }
        if (this.f133433e || this.f133431c.size() < 50) {
            if (Network.isConnected(this.f133432d.f83704a)) {
                this.f133432d.m112507C0(true);
            } else {
                r1j0.m179419f(R$string.f21320F);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
