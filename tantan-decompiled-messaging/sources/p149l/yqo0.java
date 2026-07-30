package p149l;

import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class yqo0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public e30<BLiveVoiceSweetLimitHouse> f199608j;

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m215754e0(List<BLiveVoiceSweetLimitHouse> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new fro0(list.get(i), this.f199608j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m215755f0(List<BLiveVoiceSweetLimitHouse> list) {
        m67372a0(m215754e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m215756g0(e30<BLiveVoiceSweetLimitHouse> e30Var) {
        this.f199608j = e30Var;
    }
}
