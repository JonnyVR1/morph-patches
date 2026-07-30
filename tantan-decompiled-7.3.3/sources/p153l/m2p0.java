package p153l;

import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class m2p0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public z20<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> f134601j;

    /* JADX INFO: renamed from: e0 */
    public final List<d3q<?>> m156879e0(List<BLiveVoiceSweetCpTask> list, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new k2p0(list.get(i), bLiveVoiceCpHouseInfo, this.f134601j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m156880f0(List<BLiveVoiceSweetCpTask> list, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        m68555a0(m156879e0(list, bLiveVoiceCpHouseInfo), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m156881g0(z20<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> z20Var) {
        this.f134601j = z20Var;
    }
}
