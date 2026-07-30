package p153l;

import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class g3p0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public z20<BLiveVoiceSweetCpRecommendUser, Boolean> f102015j;

    /* JADX INFO: renamed from: e0 */
    private List<d3q<?>> m128753e0(List<BLiveVoiceSweetCpRecommendUser> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p2p0());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new e3p0(list.get(i), this.f102015j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m128754f0(List<BLiveVoiceSweetCpRecommendUser> list) {
        m68555a0(m128753e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m128755g0(z20<BLiveVoiceSweetCpRecommendUser, Boolean> z20Var) {
        this.f102015j = z20Var;
    }
}
