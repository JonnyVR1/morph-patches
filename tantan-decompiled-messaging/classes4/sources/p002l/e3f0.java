package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleFinishView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleFurtherView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleSignView;
import com.p1.mobile.putong.live.base.data.BLiveSignInCycleTask;
import com.p1.mobile.putong.live.base.data.BLiveSignInTask;
import l.dac0;
import l.f3c;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e3f0 extends dac0<BLiveSignInTask> {

    /* JADX INFO: renamed from: c */
    public C0358a f9562c;

    /* JADX INFO: renamed from: d */
    public BLiveSignInCycleTask f9563d;

    /* JADX INFO: renamed from: C */
    public int m12159C() {
        if (vwb.J(this.f9563d.tasks)) {
            return 0;
        }
        return this.f9563d.tasks.size();
    }

    /* JADX INFO: renamed from: D */
    public View m12160D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return View.inflate(viewGroup.getContext(), t6c0.f20098z5, null);
        }
        if (i == 2) {
            return View.inflate(viewGroup.getContext(), t6c0.f19473B5, null);
        }
        if (i == 3) {
            return View.inflate(viewGroup.getContext(), t6c0.f19461A5, null);
        }
        f3c.a("Unknown view type: ", i);
        return null;
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m12158A(View view, BLiveSignInTask bLiveSignInTask, int i, int i2) {
        if (i == 1) {
            ((SignInCycleFinishView) view).m6732b(bLiveSignInTask);
            return;
        }
        if (i == 2) {
            ((SignInCycleSignView) view).m6737c(bLiveSignInTask, this.f9562c);
            this.f9562c.m6708w4(bLiveSignInTask.taskId);
        } else {
            if (i != 3) {
                return;
            }
            ((SignInCycleFurtherView) view).m6734b(bLiveSignInTask);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m12162F(C0358a c0358a) {
        this.f9562c = c0358a;
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveSignInTask getItem(int i) {
        return (BLiveSignInTask) this.f9563d.tasks.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m12164H(BLiveSignInCycleTask bLiveSignInCycleTask) {
        this.f9563d = bLiveSignInCycleTask;
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        if (((BLiveSignInTask) this.f9563d.tasks.get(i)).finished) {
            return 1;
        }
        if (i != 0 || this.f9563d.todaySignInStatus) {
            return (!((BLiveSignInTask) this.f9563d.tasks.get(i - 1)).finished || this.f9563d.todaySignInStatus) ? 3 : 2;
        }
        return 2;
    }
}
