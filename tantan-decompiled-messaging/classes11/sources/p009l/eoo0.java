package p009l;

import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class eoo0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public e30<BLiveVoiceSweetLimitHouse> f12636j;

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m14011e0(List<BLiveVoiceSweetLimitHouse> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new goo0(list.get(i), this.f12636j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m14012f0(List<BLiveVoiceSweetLimitHouse> list) {
        a0(m14011e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m14013g0(e30<BLiveVoiceSweetLimitHouse> e30Var) {
        this.f12636j = e30Var;
    }
}
