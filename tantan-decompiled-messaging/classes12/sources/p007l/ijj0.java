package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserHeaderView;
import com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.undolike.UnDoLikedUserItemView;
import com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.undolike.UndoCoverAnimView;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.data.DislikedUsers;
import com.p1.mobile.putong.core.member.R;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.dac0;
import l.e30;
import l.k6c0;
import l.o7r;
import l.osi0;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ijj0 extends dac0<DislikedUsers> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<DislikedUsers> f9042c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final zjj0 f9043d;

    /* JADX INFO: renamed from: e */
    public boolean f9044e;

    public ijj0(zjj0 zjj0Var) {
        this.f9043d = zjj0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m10944K() {
        if (this.f9044e) {
            return;
        }
        this.f9043d.m17492F0("p_navigation_disliked,card_button_pull");
    }

    /* JADX INFO: renamed from: C */
    public int m10946C() {
        if (this.f9042c.isEmpty()) {
            return 0;
        }
        if (!this.f9044e && this.f9042c.size() > 50) {
            return 51;
        }
        if (this.f9042c.size() > 500) {
            return 501;
        }
        return this.f9042c.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m10947D(ViewGroup viewGroup, int i) {
        zjj0 zjj0Var = this.f9043d;
        return i == 0 ? zjj0Var.act().inflater().inflate(k6c0.c0, viewGroup, false) : zjj0Var.act().inflater().inflate(k6c0.O1, viewGroup, false);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m10945A(View view, final DislikedUsers dislikedUsers, int i, int i2) {
        if (i == 1) {
            final UnDoLikedUserItemView unDoLikedUserItemView = (UnDoLikedUserItemView) view;
            unDoLikedUserItemView.m522h(dislikedUsers, !this.f9044e && i2 > 10, new d30() { // from class: l.fjj0
                public final void call() {
                    this.f8114a.m10950J(unDoLikedUserItemView, dislikedUsers);
                }
            }, new d30() { // from class: l.gjj0
                public final void call() {
                    this.f8467a.m10944K();
                }
            });
        } else if (i == 0) {
            ((LikedUserHeaderView) view).m466c();
        }
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public DislikedUsers getItem(int i) {
        if (i > 0) {
            return this.f9042c.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m10950J(UnDoLikedUserItemView unDoLikedUserItemView, DislikedUsers dislikedUsers) {
        zvf0.r("e_undo_button", this.f9043d.f15790b.pageId());
        m10955P(unDoLikedUserItemView, dislikedUsers);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10951L(View view, ViewGroup viewGroup, UndoCoverAnimView undoCoverAnimView, DislikedUsers dislikedUsers, Integer num) {
        if (!this.f9043d.m17496r0()) {
            if (num.intValue() == 0) {
                this.f9043d.m17492F0("p_navigation_disliked,card_button_pull");
                view.setVisibility(0);
                viewGroup.removeView(undoCoverAnimView);
                return;
            }
            return;
        }
        if (num.intValue() != 1) {
            view.setVisibility(0);
            viewGroup.removeView(undoCoverAnimView);
        } else if (this.f9043d.m17491E0(dislikedUsers)) {
            this.f9043d.m17490D0(dislikedUsers);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m10952M(boolean z) {
        if (this.f9044e != z) {
            this.f9044e = z;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: N */
    public boolean m10953N(DislikedUsers dislikedUsers) {
        int iIndexOf = this.f9042c.contains(dislikedUsers) ? this.f9042c.indexOf(dislikedUsers) + 1 : -1;
        if (iIndexOf == -1) {
            return false;
        }
        this.f9042c.remove(dislikedUsers);
        if (this.f9042c.size() > 0) {
            notifyItemRemoved(iIndexOf);
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public void m10954O(List<DislikedUsers> list, boolean z) {
        this.f9044e = z;
        this.f9042c.clear();
        if (!vwb.J(list)) {
            this.f9042c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P */
    public final void m10955P(final View view, final DislikedUsers dislikedUsers) {
        final UndoCoverAnimView undoCoverAnimView = (UndoCoverAnimView) o7r.a(this.f9043d.Y()).inflate(k6c0.N1, (ViewGroup) null);
        final ViewGroup viewGroup = (ViewGroup) this.f9043d.f15789a.getWindow().getDecorView();
        viewGroup.addView(undoCoverAnimView, new ViewGroup.LayoutParams(-1, -1));
        undoCoverAnimView.setAnimCallback(new e30() { // from class: l.hjj0
            public final void call(Object obj) {
                this.f8749a.m10951L(view, viewGroup, undoCoverAnimView, dislikedUsers, (Integer) obj);
            }
        });
        undoCoverAnimView.m533j(view, dislikedUsers);
    }

    /* JADX INFO: renamed from: Q */
    public int m10956Q() {
        if (vwb.J(this.f9042c)) {
            return 0;
        }
        return this.f9042c.size();
    }

    /* JADX INFO: renamed from: e */
    public void m10957e(int i) {
        if (this.f9042c.isEmpty() || i != this.f9042c.size() - 2 || this.f9043d.m17495q0() == null || TextUtils.isEmpty(this.f9043d.m17495q0().next)) {
            return;
        }
        if (this.f9044e || this.f9042c.size() < 50) {
            if (Network.isConnected(this.f9043d.f15789a)) {
                this.f9043d.m17489C0(true);
            } else {
                osi0.f(R.string.F);
            }
        }
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
