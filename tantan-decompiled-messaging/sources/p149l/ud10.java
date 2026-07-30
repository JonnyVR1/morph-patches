package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkBoardUser;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardFootView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ud10 extends dac0<BLiveMultiPkBoardUser> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f175880c;

    /* JADX INFO: renamed from: d */
    public final Act f175881d;

    /* JADX INFO: renamed from: e */
    public List<BLiveMultiPkBoardUser> f175882e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public gm0 f175883f;

    public ud10(Act act, e30<String> e30Var) {
        this.f175881d = act;
        this.f175880c = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f175882e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f175881d.inflater().inflate(i == 1 ? t6c0.f168302c4 : t6c0.f168315d4, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveMultiPkBoardUser bLiveMultiPkBoardUser, int i, int i2) {
        if (i == 1) {
            ((MultiCallPkBoardFootView) view).m75871b(this.f175882e.size());
        } else {
            ((MultiCallPkBoardItemView) view).m75876l0(this.f175880c, bLiveMultiPkBoardUser, this.f175883f);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m193115F() {
        this.f175882e.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: G */
    public final BLiveMultiPkBoardUser m193116G() {
        BLiveMultiPkBoardUser bLiveMultiPkBoardUserNew_ = BLiveMultiPkBoardUser.new_();
        bLiveMultiPkBoardUserNew_.userId = User.ID_TEAM_ACCOUNT;
        return bLiveMultiPkBoardUserNew_;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveMultiPkBoardUser getItem(int i) {
        return this.f175882e.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m193118I(@NonNull List<BLiveMultiPkBoardUser> list, gm0 gm0Var, boolean z) {
        this.f175883f = gm0Var;
        this.f175882e.clear();
        this.f175882e.addAll(list);
        if (this.f175882e.size() >= 1 && z) {
            this.f175882e.add(m193116G());
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return User.ID_TEAM_ACCOUNT.equals(this.f175882e.get(i).userId) ? 1 : 0;
    }
}
