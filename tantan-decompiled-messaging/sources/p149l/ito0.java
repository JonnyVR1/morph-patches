package p149l;

import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ito0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public f30<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> f114903j;

    /* JADX INFO: renamed from: e0 */
    public final List<d1q<?>> m138230e0(List<BLiveVoiceSweetCpTask> list, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new gto0(list.get(i), bLiveVoiceCpHouseInfo, this.f114903j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m138231f0(List<BLiveVoiceSweetCpTask> list, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        m67372a0(m138230e0(list, bLiveVoiceCpHouseInfo), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m138232g0(f30<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> f30Var) {
        this.f114903j = f30Var;
    }
}
