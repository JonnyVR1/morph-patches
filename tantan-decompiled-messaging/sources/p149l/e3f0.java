package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInCycleTask;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleFinishView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleFurtherView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleSignView;

/* JADX INFO: loaded from: classes4.dex */
public class e3f0 extends dac0<BLiveSignInTask> {

    /* JADX INFO: renamed from: c */
    public C12769a f89175c;

    /* JADX INFO: renamed from: d */
    public BLiveSignInCycleTask f89176d;

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (vwb.m200296J(this.f89176d.tasks)) {
            return 0;
        }
        return this.f89176d.tasks.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return View.inflate(viewGroup.getContext(), t6c0.f168602z5, null);
        }
        if (i == 2) {
            return View.inflate(viewGroup.getContext(), t6c0.f167977B5, null);
        }
        if (i == 3) {
            return View.inflate(viewGroup.getContext(), t6c0.f167965A5, null);
        }
        f3c.m119257a("Unknown view type: ", i);
        return null;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveSignInTask bLiveSignInTask, int i, int i2) {
        if (i == 1) {
            ((SignInCycleFinishView) view).m73203b(bLiveSignInTask);
            return;
        }
        if (i == 2) {
            ((SignInCycleSignView) view).m73208c(bLiveSignInTask, this.f89175c);
            this.f89175c.m73179w4(bLiveSignInTask.taskId);
        } else {
            if (i != 3) {
                return;
            }
            ((SignInCycleFurtherView) view).m73205b(bLiveSignInTask);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m114588F(C12769a c12769a) {
        this.f89175c = c12769a;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveSignInTask getItem(int i) {
        return this.f89176d.tasks.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m114590H(BLiveSignInCycleTask bLiveSignInCycleTask) {
        this.f89176d = bLiveSignInCycleTask;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f89176d.tasks.get(i).finished) {
            return 1;
        }
        if (i != 0 || this.f89176d.todaySignInStatus) {
            return (!this.f89176d.tasks.get(i - 1).finished || this.f89176d.todaySignInStatus) ? 3 : 2;
        }
        return 2;
    }
}
