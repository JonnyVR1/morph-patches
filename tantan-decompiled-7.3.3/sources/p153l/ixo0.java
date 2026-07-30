package p153l;

import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ixo0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public y20<BLiveVoiceSweetLimitHouse> f117447j;

    /* JADX INFO: renamed from: e0 */
    private List<d3q<?>> m142586e0(List<BLiveVoiceSweetLimitHouse> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new kxo0(list.get(i), this.f117447j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m142587f0(List<BLiveVoiceSweetLimitHouse> list) {
        m68555a0(m142586e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m142588g0(y20<BLiveVoiceSweetLimitHouse> y20Var) {
        this.f117447j = y20Var;
    }
}
