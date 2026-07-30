package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInCycleTask;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.TaskExpandOrFoldView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.TaskView;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zcf0 extends jic0<BLiveSignInDetail> {

    /* JADX INFO: renamed from: c */
    public C12932a f203750c;

    /* JADX INFO: renamed from: d */
    public List<BLiveSignInTask> f203751d;

    /* JADX INFO: renamed from: e */
    public List<BLiveSignInTask> f203752e;

    /* JADX INFO: renamed from: f */
    public BLiveSignInCycleTask f203753f;

    /* JADX INFO: renamed from: g */
    public String f203754g;

    /* JADX INFO: renamed from: h */
    public int f203755h;

    /* JADX INFO: renamed from: i */
    public int f203756i;

    /* JADX INFO: renamed from: j */
    public boolean f203757j;

    public zcf0(C12932a c12932a, BLiveSignInDetail bLiveSignInDetail) {
        this.f203750c = c12932a;
        List<BLiveSignInTask> list = bLiveSignInDetail.unFinishedTasks;
        this.f203751d = list;
        this.f203752e = bLiveSignInDetail.unReceivedTasks;
        this.f203753f = bLiveSignInDetail.cyclicTasks;
        this.f203754g = bLiveSignInDetail.signInPeriod;
        this.f203755h = bLiveSignInDetail.signInCount;
        this.f203756i = (jyb.m147479J(list) ? 0 : this.f203751d.size()) + (jyb.m147479J(this.f203752e) ? 0 : this.f203752e.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m219238H(View view) {
        this.f203757j = !this.f203757j;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int i = this.f203756i;
        if (i == 0) {
            return 2;
        }
        if (i != 1 && this.f203757j) {
            return i + 3;
        }
        return 4;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return View.inflate(viewGroup.getContext(), yec0.f198829L5, null);
        }
        if (i == 2) {
            TaskExpandOrFoldView taskExpandOrFoldView = (TaskExpandOrFoldView) View.inflate(viewGroup.getContext(), yec0.f198817K5, null);
            taskExpandOrFoldView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            taskExpandOrFoldView.f50167a.setOnClickListener(new View.OnClickListener() { // from class: l.ycf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f198503a.m219238H(view);
                }
            });
            return taskExpandOrFoldView;
        }
        if (i == 3) {
            SignInCycleView signInCycleView = new SignInCycleView(viewGroup.getContext());
            signInCycleView.m74394K(this.f203750c);
            return signInCycleView;
        }
        if (i != 4) {
            return null;
        }
        VText vText = new VText(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(qa00.f156322i);
        vText.setLayoutParams(marginLayoutParams);
        vText.setTextSize(10.0f);
        vText.setTextColor(-1275072059);
        int iM175859d = qa00.m175859d(11.0f);
        int i2 = qa00.f156318e;
        vText.setPadding(iM175859d, i2, qa00.m175859d(11.0f), i2);
        vText.setBackground(fc2.m124971a(869143383, qa00.m175859d(10.5f), false));
        return vText;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveSignInDetail bLiveSignInDetail, int i, int i2) {
        BLiveSignInTask bLiveSignInTask;
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                ((TaskExpandOrFoldView) view).m74409b(this.f203757j, !jyb.m147479J(this.f203752e) && this.f203752e.size() > 1, this.f203756i == 1);
                return;
            } else if (i == 3) {
                ((SignInCycleView) view).m74396M(this.f203753f);
                return;
            } else {
                if (i != 4) {
                    return;
                }
                ((VText) view).setText(this.f203754g);
                return;
            }
        }
        if (jyb.m147479J(this.f203752e) || i2 >= this.f203752e.size()) {
            BLiveSignInTask bLiveSignInTask2 = this.f203751d.get(i2 - (jyb.m147479J(this.f203752e) ? 0 : this.f203752e.size()));
            this.f203750c.m74336A4(bLiveSignInTask2.rewardId, bLiveSignInTask2.taskId);
            z = false;
            bLiveSignInTask = bLiveSignInTask2;
        } else {
            bLiveSignInTask = this.f203752e.get(i2);
        }
        ((TaskView) view).m74422k(bLiveSignInTask, this.f203755h, z, this.f203750c);
        this.f203750c.m74338C4(bLiveSignInTask.taskType, bLiveSignInTask.title, this.f203755h, z);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveSignInDetail getItem(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.f203756i;
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
        if (this.f203757j) {
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
