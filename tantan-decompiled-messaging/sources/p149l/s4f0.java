package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInCycleTask;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.TaskExpandOrFoldView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.TaskView;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class s4f0 extends dac0<BLiveSignInDetail> {

    /* JADX INFO: renamed from: c */
    public C12769a f162384c;

    /* JADX INFO: renamed from: d */
    public List<BLiveSignInTask> f162385d;

    /* JADX INFO: renamed from: e */
    public List<BLiveSignInTask> f162386e;

    /* JADX INFO: renamed from: f */
    public BLiveSignInCycleTask f162387f;

    /* JADX INFO: renamed from: g */
    public String f162388g;

    /* JADX INFO: renamed from: h */
    public int f162389h;

    /* JADX INFO: renamed from: i */
    public int f162390i;

    /* JADX INFO: renamed from: j */
    public boolean f162391j;

    public s4f0(C12769a c12769a, BLiveSignInDetail bLiveSignInDetail) {
        this.f162384c = c12769a;
        List<BLiveSignInTask> list = bLiveSignInDetail.unFinishedTasks;
        this.f162385d = list;
        this.f162386e = bLiveSignInDetail.unReceivedTasks;
        this.f162387f = bLiveSignInDetail.cyclicTasks;
        this.f162388g = bLiveSignInDetail.signInPeriod;
        this.f162389h = bLiveSignInDetail.signInCount;
        this.f162390i = (vwb.m200296J(list) ? 0 : this.f162385d.size()) + (vwb.m200296J(this.f162386e) ? 0 : this.f162386e.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m182220H(View view) {
        this.f162391j = !this.f162391j;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int i = this.f162390i;
        if (i == 0) {
            return 2;
        }
        if (i != 1 && this.f162391j) {
            return i + 3;
        }
        return 4;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return View.inflate(viewGroup.getContext(), t6c0.f168097L5, null);
        }
        if (i == 2) {
            TaskExpandOrFoldView taskExpandOrFoldView = (TaskExpandOrFoldView) View.inflate(viewGroup.getContext(), t6c0.f168085K5, null);
            taskExpandOrFoldView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            taskExpandOrFoldView.f49319a.setOnClickListener(new View.OnClickListener() { // from class: l.r4f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f157669a.m182220H(view);
                }
            });
            return taskExpandOrFoldView;
        }
        if (i == 3) {
            SignInCycleView signInCycleView = new SignInCycleView(viewGroup.getContext());
            signInCycleView.m73211K(this.f162384c);
            return signInCycleView;
        }
        if (i != 4) {
            return null;
        }
        VText vText = new VText(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(t100.f167260i);
        vText.setLayoutParams(marginLayoutParams);
        vText.setTextSize(10.0f);
        vText.setTextColor(-1275072059);
        int iM186890d = t100.m186890d(11.0f);
        int i2 = t100.f167256e;
        vText.setPadding(iM186890d, i2, t100.m186890d(11.0f), i2);
        vText.setBackground(yb2.m213876a(869143383, t100.m186890d(10.5f), false));
        return vText;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveSignInDetail bLiveSignInDetail, int i, int i2) {
        BLiveSignInTask bLiveSignInTask;
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                ((TaskExpandOrFoldView) view).m73226b(this.f162391j, !vwb.m200296J(this.f162386e) && this.f162386e.size() > 1, this.f162390i == 1);
                return;
            } else if (i == 3) {
                ((SignInCycleView) view).m73213M(this.f162387f);
                return;
            } else {
                if (i != 4) {
                    return;
                }
                ((VText) view).setText(this.f162388g);
                return;
            }
        }
        if (vwb.m200296J(this.f162386e) || i2 >= this.f162386e.size()) {
            BLiveSignInTask bLiveSignInTask2 = this.f162385d.get(i2 - (vwb.m200296J(this.f162386e) ? 0 : this.f162386e.size()));
            this.f162384c.m73153A4(bLiveSignInTask2.rewardId, bLiveSignInTask2.taskId);
            z = false;
            bLiveSignInTask = bLiveSignInTask2;
        } else {
            bLiveSignInTask = this.f162386e.get(i2);
        }
        ((TaskView) view).m73239k(bLiveSignInTask, this.f162389h, z, this.f162384c);
        this.f162384c.m73155C4(bLiveSignInTask.taskType, bLiveSignInTask.title, this.f162389h, z);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveSignInDetail getItem(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.f162390i;
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
        if (this.f162391j) {
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
