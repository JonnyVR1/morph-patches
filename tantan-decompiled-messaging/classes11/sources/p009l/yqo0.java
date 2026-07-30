package p009l;

import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yqo0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public e30<BLiveVoiceSweetLimitHouse> f23210j;

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m25505e0(List<BLiveVoiceSweetLimitHouse> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new fro0(list.get(i), this.f23210j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m25506f0(List<BLiveVoiceSweetLimitHouse> list) {
        a0(m25505e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m25507g0(e30<BLiveVoiceSweetLimitHouse> e30Var) {
        this.f23210j = e30Var;
    }
}
