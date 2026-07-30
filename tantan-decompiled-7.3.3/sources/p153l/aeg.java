package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasksProgress;
import com.p051p1.mobile.putong.live.base.data.BLiveAdvanceTask;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveTask;
import com.p051p1.mobile.putong.live.base.data.BLiveTaskSummary;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class aeg {

    /* JADX INFO: renamed from: a */
    public final BLiveTaskSummary f70791a;

    /* JADX INFO: renamed from: b */
    public final BLiveCommonViewConfig f70792b;

    /* JADX INFO: renamed from: c */
    public final boolean f70793c;

    /* JADX INFO: renamed from: d */
    public final List<BLiveTask> f70794d;

    /* JADX INFO: renamed from: e */
    public final List<BLiveAdvanceTask> f70795e;

    /* JADX INFO: renamed from: f */
    public BLiveAccommpanyTaskSummary f70796f;

    /* JADX INFO: renamed from: g */
    public BLiveAccommpanyTasksProgress f70797g;

    /* JADX INFO: renamed from: h */
    public final List<BLiveAccommpanyTasks> f70798h;

    public aeg(BLiveEnvelope bLiveEnvelope) {
        ArrayList arrayList = new ArrayList();
        this.f70794d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f70795e = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f70798h = arrayList3;
        BLiveData bLiveData = bLiveEnvelope.data;
        this.f70791a = bLiveData.taskSummary;
        this.f70792b = bLiveData.scoreSummary;
        if (!jyb.m147479J(bLiveData.tasks)) {
            arrayList.addAll(bLiveEnvelope.data.tasks);
        }
        if (!jyb.m147479J(bLiveEnvelope.data.advancedTasks)) {
            arrayList2.addAll(bLiveEnvelope.data.advancedTasks);
        }
        BLiveData bLiveData2 = bLiveEnvelope.data;
        this.f70796f = bLiveData2.accompanyTaskSummary;
        if (!jyb.m147479J(bLiveData2.accompanyTasks)) {
            arrayList3.addAll(bLiveEnvelope.data.accompanyTasks);
        }
        this.f70797g = bLiveEnvelope.data.accompanyTaskProgress;
        this.f70793c = false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m97238c() {
        return (this.f70794d.isEmpty() || jyb.m147529r(this.f70794d, new qcj() { // from class: l.ydg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveTask bLiveTask = (BLiveTask) obj;
                return Boolean.valueOf("TaskTypeWatch".equals(bLiveTask.type) && !bLiveTask.done);
            }
        }) == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public List<BLiveTask> m97239d() {
        return jyb.m147522n(this.f70794d, new qcj() { // from class: l.zdg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveTask bLiveTask = (BLiveTask) obj;
                return Boolean.valueOf("TaskTypeWatch".equals(bLiveTask.type) && !bLiveTask.done);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public boolean m97240e() {
        return this.f70793c;
    }
}
