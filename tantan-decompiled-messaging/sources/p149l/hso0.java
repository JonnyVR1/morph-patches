package p149l;

import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class hso0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public e30<String> f109338j;

    public hso0(e30<String> e30Var) {
        this.f109338j = e30Var;
    }

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m132785e0(List<BLiveSweetCpRankInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new iso0(i, list.get(i), this.f109338j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m132786f0(List<BLiveSweetCpRankInfo> list) {
        m67372a0(m132785e0(list), false);
    }
}
