package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasksProgress;
import com.p046p1.mobile.putong.live.base.data.BLiveAdvanceTask;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveTask;
import com.p046p1.mobile.putong.live.base.data.BLiveTaskSummary;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class mcg {

    /* JADX INFO: renamed from: a */
    public final BLiveTaskSummary f133103a;

    /* JADX INFO: renamed from: b */
    public final BLiveCommonViewConfig f133104b;

    /* JADX INFO: renamed from: c */
    public final boolean f133105c;

    /* JADX INFO: renamed from: d */
    public final List<BLiveTask> f133106d;

    /* JADX INFO: renamed from: e */
    public final List<BLiveAdvanceTask> f133107e;

    /* JADX INFO: renamed from: f */
    public BLiveAccommpanyTaskSummary f133108f;

    /* JADX INFO: renamed from: g */
    public BLiveAccommpanyTasksProgress f133109g;

    /* JADX INFO: renamed from: h */
    public final List<BLiveAccommpanyTasks> f133110h;

    public mcg(BLiveEnvelope bLiveEnvelope) {
        ArrayList arrayList = new ArrayList();
        this.f133106d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f133107e = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f133110h = arrayList3;
        BLiveData bLiveData = bLiveEnvelope.data;
        this.f133103a = bLiveData.taskSummary;
        this.f133104b = bLiveData.scoreSummary;
        if (!vwb.m200296J(bLiveData.tasks)) {
            arrayList.addAll(bLiveEnvelope.data.tasks);
        }
        if (!vwb.m200296J(bLiveEnvelope.data.advancedTasks)) {
            arrayList2.addAll(bLiveEnvelope.data.advancedTasks);
        }
        BLiveData bLiveData2 = bLiveEnvelope.data;
        this.f133108f = bLiveData2.accompanyTaskSummary;
        if (!vwb.m200296J(bLiveData2.accompanyTasks)) {
            arrayList3.addAll(bLiveEnvelope.data.accompanyTasks);
        }
        this.f133109g = bLiveEnvelope.data.accompanyTaskProgress;
        this.f133105c = false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m153997c() {
        return (this.f133106d.isEmpty() || vwb.m200346r(this.f133106d, new w9j() { // from class: l.kcg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveTask bLiveTask = (BLiveTask) obj;
                return Boolean.valueOf("TaskTypeWatch".equals(bLiveTask.type) && !bLiveTask.done);
            }
        }) == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public List<BLiveTask> m153998d() {
        return vwb.m200339n(this.f133106d, new w9j() { // from class: l.lcg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveTask bLiveTask = (BLiveTask) obj;
                return Boolean.valueOf("TaskTypeWatch".equals(bLiveTask.type) && !bLiveTask.done);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public boolean m153999e() {
        return this.f133105c;
    }
}
