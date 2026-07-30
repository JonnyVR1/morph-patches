package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.data.DislikedUsers;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserHeaderView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.undolike.UnDoLikedUserItemView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.undolike.UndoCoverAnimView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ijj0 extends dac0<DislikedUsers> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<DislikedUsers> f113551c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final zjj0 f113552d;

    /* JADX INFO: renamed from: e */
    public boolean f113553e;

    public ijj0(zjj0 zjj0Var) {
        this.f113552d = zjj0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m136616K() {
        if (this.f113553e) {
            return;
        }
        this.f113552d.m219116F0("p_navigation_disliked,card_button_pull");
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f113551c.isEmpty()) {
            return 0;
        }
        if (!this.f113553e && this.f113551c.size() > 50) {
            return 51;
        }
        if (this.f113551c.size() > 500) {
            return 501;
        }
        return this.f113551c.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        zjj0 zjj0Var = this.f113552d;
        return i == 0 ? zjj0Var.act().inflater().inflate(k6c0.f121366c0, viewGroup, false) : zjj0Var.act().inflater().inflate(k6c0.f121323O1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final DislikedUsers dislikedUsers, int i, int i2) {
        if (i == 1) {
            final UnDoLikedUserItemView unDoLikedUserItemView = (UnDoLikedUserItemView) view;
            unDoLikedUserItemView.m46839h(dislikedUsers, !this.f113553e && i2 > 10, new d30() { // from class: l.fjj0
                @Override // p149l.d30
                public final void call() {
                    this.f97791a.m136619J(unDoLikedUserItemView, dislikedUsers);
                }
            }, new d30() { // from class: l.gjj0
                @Override // p149l.d30
                public final void call() {
                    this.f103085a.m136616K();
                }
            });
        } else if (i == 0) {
            ((LikedUserHeaderView) view).m46791c();
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public DislikedUsers getItem(int i) {
        if (i > 0) {
            return this.f113551c.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m136619J(UnDoLikedUserItemView unDoLikedUserItemView, DislikedUsers dislikedUsers) {
        zvf0.m220396r("e_undo_button", this.f113552d.f203420b.pageId());
        m136624P(unDoLikedUserItemView, dislikedUsers);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m136620L(View view, ViewGroup viewGroup, UndoCoverAnimView undoCoverAnimView, DislikedUsers dislikedUsers, Integer num) {
        if (!this.f113552d.m219118r0()) {
            if (num.intValue() == 0) {
                this.f113552d.m219116F0("p_navigation_disliked,card_button_pull");
                view.setVisibility(0);
                viewGroup.removeView(undoCoverAnimView);
                return;
            }
            return;
        }
        if (num.intValue() != 1) {
            view.setVisibility(0);
            viewGroup.removeView(undoCoverAnimView);
        } else if (this.f113552d.m219115E0(dislikedUsers)) {
            this.f113552d.m219114D0(dislikedUsers);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m136621M(boolean z) {
        if (this.f113553e != z) {
            this.f113553e = z;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: N */
    public boolean m136622N(DislikedUsers dislikedUsers) {
        int iIndexOf = this.f113551c.contains(dislikedUsers) ? this.f113551c.indexOf(dislikedUsers) + 1 : -1;
        if (iIndexOf == -1) {
            return false;
        }
        this.f113551c.remove(dislikedUsers);
        if (this.f113551c.size() > 0) {
            notifyItemRemoved(iIndexOf);
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public void m136623O(List<DislikedUsers> list, boolean z) {
        this.f113553e = z;
        this.f113551c.clear();
        if (!vwb.m200296J(list)) {
            this.f113551c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P */
    public final void m136624P(final View view, final DislikedUsers dislikedUsers) {
        final UndoCoverAnimView undoCoverAnimView = (UndoCoverAnimView) o7r.m163037a(this.f113552d.m142773Y()).inflate(k6c0.f121320N1, (ViewGroup) null);
        final ViewGroup viewGroup = (ViewGroup) this.f113552d.f203419a.getWindow().getDecorView();
        viewGroup.addView(undoCoverAnimView, new ViewGroup.LayoutParams(-1, -1));
        undoCoverAnimView.setAnimCallback(new e30() { // from class: l.hjj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108088a.m136620L(view, viewGroup, undoCoverAnimView, dislikedUsers, (Integer) obj);
            }
        });
        undoCoverAnimView.m46850j(view, dislikedUsers);
    }

    /* JADX INFO: renamed from: Q */
    public int m136625Q() {
        if (vwb.m200296J(this.f113551c)) {
            return 0;
        }
        return this.f113551c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (this.f113551c.isEmpty() || i != this.f113551c.size() - 2 || this.f113552d.m219117q0() == null || TextUtils.isEmpty(this.f113552d.m219117q0().next)) {
            return;
        }
        if (this.f113553e || this.f113551c.size() < 50) {
            if (Network.isConnected(this.f113552d.f203419a)) {
                this.f113552d.m219113C0(true);
            } else {
                osi0.m165782f(R$string.f20578F);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
