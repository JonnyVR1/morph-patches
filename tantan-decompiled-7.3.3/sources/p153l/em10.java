package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkBoardUser;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardFootView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class em10 extends jic0<BLiveMultiPkBoardUser> {

    /* JADX INFO: renamed from: c */
    public final y20<String> f94607c;

    /* JADX INFO: renamed from: d */
    public final Act f94608d;

    /* JADX INFO: renamed from: e */
    public List<BLiveMultiPkBoardUser> f94609e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public cm0 f94610f;

    public em10(Act act, y20<String> y20Var) {
        this.f94608d = act;
        this.f94607c = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f94609e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f94608d.inflater().inflate(i == 1 ? yec0.f199034c4 : yec0.f199047d4, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveMultiPkBoardUser bLiveMultiPkBoardUser, int i, int i2) {
        if (i == 1) {
            ((MultiCallPkBoardFootView) view).m77054b(this.f94609e.size());
        } else {
            ((MultiCallPkBoardItemView) view).m77059l0(this.f94607c, bLiveMultiPkBoardUser, this.f94610f);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m121312F() {
        this.f94609e.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: G */
    public final BLiveMultiPkBoardUser m121313G() {
        BLiveMultiPkBoardUser bLiveMultiPkBoardUserNew_ = BLiveMultiPkBoardUser.new_();
        bLiveMultiPkBoardUserNew_.userId = User.ID_TEAM_ACCOUNT;
        return bLiveMultiPkBoardUserNew_;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveMultiPkBoardUser getItem(int i) {
        return this.f94609e.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m121315I(@NonNull List<BLiveMultiPkBoardUser> list, cm0 cm0Var, boolean z) {
        this.f94610f = cm0Var;
        this.f94609e.clear();
        this.f94609e.addAll(list);
        if (this.f94609e.size() >= 1 && z) {
            this.f94609e.add(m121313G());
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return User.ID_TEAM_ACCOUNT.equals(this.f94609e.get(i).userId) ? 1 : 0;
    }
}
