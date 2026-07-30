package p009l;

import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hso0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public e30<String> f14241j;

    public hso0(e30<String> e30Var) {
        this.f14241j = e30Var;
    }

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m15946e0(List<BLiveSweetCpRankInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new iso0(i, list.get(i), this.f14241j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m15947f0(List<BLiveSweetCpRankInfo> list) {
        a0(m15946e0(list), false);
    }
}
