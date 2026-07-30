package p153l;

import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class c0p0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public y20<BLiveVoiceSweetLimitHouse> f79289j;

    /* JADX INFO: renamed from: e0 */
    private List<d3q<?>> m107469e0(List<BLiveVoiceSweetLimitHouse> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new j0p0(list.get(i), this.f79289j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m107470f0(List<BLiveVoiceSweetLimitHouse> list) {
        m68555a0(m107469e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m107471g0(y20<BLiveVoiceSweetLimitHouse> y20Var) {
        this.f79289j = y20Var;
    }
}
