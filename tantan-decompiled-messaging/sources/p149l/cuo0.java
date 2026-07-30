package p149l;

import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class cuo0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public f30<BLiveVoiceSweetCpRecommendUser, Boolean> f82589j;

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m108801e0(List<BLiveVoiceSweetCpRecommendUser> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new lto0());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new auo0(list.get(i), this.f82589j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m108802f0(List<BLiveVoiceSweetCpRecommendUser> list) {
        m67372a0(m108801e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m108803g0(f30<BLiveVoiceSweetCpRecommendUser, Boolean> f30Var) {
        this.f82589j = f30Var;
    }
}
