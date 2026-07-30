package p153l;

import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class l1p0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public y20<String> f129707j;

    public l1p0(y20<String> y20Var) {
        this.f129707j = y20Var;
    }

    /* JADX INFO: renamed from: e0 */
    private List<d3q<?>> m152509e0(List<BLiveSweetCpRankInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new m1p0(i, list.get(i), this.f129707j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m152510f0(List<BLiveSweetCpRankInfo> list) {
        m68555a0(m152509e0(list), false);
    }
}
