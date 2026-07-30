package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.TaskExpandOrFoldView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.TaskView;
import com.p1.mobile.putong.live.base.data.BLiveSignInCycleTask;
import com.p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p1.mobile.putong.live.base.data.BLiveSignInTask;
import java.util.List;
import l.dac0;
import l.t100;
import l.vwb;
import l.yb2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s4f0 extends dac0<BLiveSignInDetail> {

    /* JADX INFO: renamed from: c */
    public C0358a f18787c;

    /* JADX INFO: renamed from: d */
    public List<BLiveSignInTask> f18788d;

    /* JADX INFO: renamed from: e */
    public List<BLiveSignInTask> f18789e;

    /* JADX INFO: renamed from: f */
    public BLiveSignInCycleTask f18790f;

    /* JADX INFO: renamed from: g */
    public String f18791g;

    /* JADX INFO: renamed from: h */
    public int f18792h;

    /* JADX INFO: renamed from: i */
    public int f18793i;

    /* JADX INFO: renamed from: j */
    public boolean f18794j;

    public s4f0(C0358a c0358a, BLiveSignInDetail bLiveSignInDetail) {
        this.f18787c = c0358a;
        List<BLiveSignInTask> list = bLiveSignInDetail.unFinishedTasks;
        this.f18788d = list;
        this.f18789e = bLiveSignInDetail.unReceivedTasks;
        this.f18790f = bLiveSignInDetail.cyclicTasks;
        this.f18791g = bLiveSignInDetail.signInPeriod;
        this.f18792h = bLiveSignInDetail.signInCount;
        this.f18793i = (vwb.J(list) ? 0 : this.f18788d.size()) + (vwb.J(this.f18789e) ? 0 : this.f18789e.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m22200H(View view) {
        this.f18794j = !this.f18794j;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: C */
    public int m22202C() {
        int i = this.f18793i;
        if (i == 0) {
            return 2;
        }
        if (i != 1 && this.f18794j) {
            return i + 3;
        }
        return 4;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View, com.p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleView] */
    /* JADX INFO: renamed from: D */
    public View m22203D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return View.inflate(viewGroup.getContext(), t6c0.f19593L5, null);
        }
        if (i == 2) {
            TaskExpandOrFoldView taskExpandOrFoldView = (TaskExpandOrFoldView) View.inflate(viewGroup.getContext(), t6c0.f19581K5, null);
            taskExpandOrFoldView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            taskExpandOrFoldView.f5361a.setOnClickListener(new View.OnClickListener() { // from class: l.r4f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18362a.m22200H(view);
                }
            });
            return taskExpandOrFoldView;
        }
        if (i == 3) {
            ?? signInCycleView = new SignInCycleView(viewGroup.getContext());
            signInCycleView.m6740K(this.f18787c);
            return signInCycleView;
        }
        if (i != 4) {
            return null;
        }
        VText vText = new VText(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(t100.i);
        vText.setLayoutParams(marginLayoutParams);
        vText.setTextSize(10.0f);
        vText.setTextColor(-1275072059);
        int iD = t100.d(11.0f);
        int i2 = t100.e;
        vText.setPadding(iD, i2, t100.d(11.0f), i2);
        vText.setBackground(yb2.a(869143383, t100.d(10.5f), false));
        return vText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m22201A(View view, BLiveSignInDetail bLiveSignInDetail, int i, int i2) {
        BLiveSignInTask bLiveSignInTask;
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                ((TaskExpandOrFoldView) view).m6756b(this.f18794j, !vwb.J(this.f18789e) && this.f18789e.size() > 1, this.f18793i == 1);
                return;
            } else if (i == 3) {
                ((SignInCycleView) view).m6742M(this.f18790f);
                return;
            } else {
                if (i != 4) {
                    return;
                }
                ((VText) view).setText(this.f18791g);
                return;
            }
        }
        if (vwb.J(this.f18789e) || i2 >= this.f18789e.size()) {
            BLiveSignInTask bLiveSignInTask2 = this.f18788d.get(i2 - (vwb.J(this.f18789e) ? 0 : this.f18789e.size()));
            this.f18787c.m6681A4(bLiveSignInTask2.rewardId, bLiveSignInTask2.taskId);
            z = false;
            bLiveSignInTask = bLiveSignInTask2;
        } else {
            bLiveSignInTask = this.f18789e.get(i2);
        }
        ((TaskView) view).m6769k(bLiveSignInTask, this.f18792h, z, this.f18787c);
        this.f18787c.m6683C4(bLiveSignInTask.taskType, bLiveSignInTask.title, this.f18792h, z);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveSignInDetail getItem(int i) {
        return null;
    }

    public int getItemViewType(int i) {
        int i2 = this.f18793i;
        if (i2 == 0) {
            if (i == 0) {
                return 3;
            }
            return i == 1 ? 4 : -1;
        }
        if (i2 == 1) {
            if (i == 0) {
                return 1;
            }
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i == 3 ? 4 : -1;
        }
        if (this.f18794j) {
            if (i < i2) {
                return 1;
            }
            if (i == i2) {
                return 2;
            }
            if (i == i2 + 1) {
                return 3;
            }
            return i == i2 + 2 ? 4 : -1;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        return i == 3 ? 4 : -1;
    }
}
