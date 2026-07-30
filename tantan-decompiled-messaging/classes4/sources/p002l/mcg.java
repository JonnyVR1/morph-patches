package p002l;

import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummary;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasksProgress;
import com.p1.mobile.putong.live.base.data.BLiveAdvanceTask;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveTask;
import com.p1.mobile.putong.live.base.data.BLiveTaskSummary;
import java.util.ArrayList;
import java.util.List;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mcg {

    /* JADX INFO: renamed from: a */
    public final BLiveTaskSummary f15331a;

    /* JADX INFO: renamed from: b */
    public final BLiveCommonViewConfig f15332b;

    /* JADX INFO: renamed from: c */
    public final boolean f15333c;

    /* JADX INFO: renamed from: d */
    public final List<BLiveTask> f15334d;

    /* JADX INFO: renamed from: e */
    public final List<BLiveAdvanceTask> f15335e;

    /* JADX INFO: renamed from: f */
    public BLiveAccommpanyTaskSummary f15336f;

    /* JADX INFO: renamed from: g */
    public BLiveAccommpanyTasksProgress f15337g;

    /* JADX INFO: renamed from: h */
    public final List<BLiveAccommpanyTasks> f15338h;

    public mcg(BLiveEnvelope bLiveEnvelope) {
        ArrayList arrayList = new ArrayList();
        this.f15334d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f15335e = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f15338h = arrayList3;
        BLiveData bLiveData = bLiveEnvelope.data;
        this.f15331a = bLiveData.taskSummary;
        this.f15332b = bLiveData.scoreSummary;
        if (!vwb.J(bLiveData.tasks)) {
            arrayList.addAll(bLiveEnvelope.data.tasks);
        }
        if (!vwb.J(bLiveEnvelope.data.advancedTasks)) {
            arrayList2.addAll(bLiveEnvelope.data.advancedTasks);
        }
        BLiveData bLiveData2 = bLiveEnvelope.data;
        this.f15336f = bLiveData2.accompanyTaskSummary;
        if (!vwb.J(bLiveData2.accompanyTasks)) {
            arrayList3.addAll(bLiveEnvelope.data.accompanyTasks);
        }
        this.f15337g = bLiveEnvelope.data.accompanyTaskProgress;
        this.f15333c = false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m17818c() {
        return (this.f15334d.isEmpty() || vwb.r(this.f15334d, new w9j() { // from class: l.kcg
            public final Object call(Object obj) {
                BLiveTask bLiveTask = (BLiveTask) obj;
                return Boolean.valueOf("TaskTypeWatch".equals(bLiveTask.type) && !bLiveTask.done);
            }
        }) == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public List<BLiveTask> m17819d() {
        return vwb.n(this.f15334d, new w9j() { // from class: l.lcg
            public final Object call(Object obj) {
                BLiveTask bLiveTask = (BLiveTask) obj;
                return Boolean.valueOf("TaskTypeWatch".equals(bLiveTask.type) && !bLiveTask.done);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public boolean m17820e() {
        return this.f15333c;
    }
}
