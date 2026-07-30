package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInCycleTask;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleFinishView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleFurtherView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleSignView;

/* JADX INFO: loaded from: classes4.dex */
public class lbf0 extends jic0<BLiveSignInTask> {

    /* JADX INFO: renamed from: c */
    public C12932a f131203c;

    /* JADX INFO: renamed from: d */
    public BLiveSignInCycleTask f131204d;

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (jyb.m147479J(this.f131204d.tasks)) {
            return 0;
        }
        return this.f131204d.tasks.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return View.inflate(viewGroup.getContext(), yec0.f199334z5, null);
        }
        if (i == 2) {
            return View.inflate(viewGroup.getContext(), yec0.f198709B5, null);
        }
        if (i == 3) {
            return View.inflate(viewGroup.getContext(), yec0.f198697A5, null);
        }
        o4c.m165980a("Unknown view type: ", i);
        return null;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveSignInTask bLiveSignInTask, int i, int i2) {
        if (i == 1) {
            ((SignInCycleFinishView) view).m74386b(bLiveSignInTask);
            return;
        }
        if (i == 2) {
            ((SignInCycleSignView) view).m74391c(bLiveSignInTask, this.f131203c);
            this.f131203c.m74362w4(bLiveSignInTask.taskId);
        } else {
            if (i != 3) {
                return;
            }
            ((SignInCycleFurtherView) view).m74388b(bLiveSignInTask);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m153577F(C12932a c12932a) {
        this.f131203c = c12932a;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveSignInTask getItem(int i) {
        return this.f131204d.tasks.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m153579H(BLiveSignInCycleTask bLiveSignInCycleTask) {
        this.f131204d = bLiveSignInCycleTask;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f131204d.tasks.get(i).finished) {
            return 1;
        }
        if (i != 0 || this.f131204d.todaySignInStatus) {
            return (!this.f131204d.tasks.get(i - 1).finished || this.f131204d.todaySignInStatus) ? 3 : 2;
        }
        return 2;
    }
}
