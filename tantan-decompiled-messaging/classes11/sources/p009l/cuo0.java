package p009l;

import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cuo0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public f30<BLiveVoiceSweetCpRecommendUser, Boolean> f10781j;

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m12849e0(List<BLiveVoiceSweetCpRecommendUser> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new lto0());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new auo0(list.get(i), this.f10781j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m12850f0(List<BLiveVoiceSweetCpRecommendUser> list) {
        a0(m12849e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m12851g0(f30<BLiveVoiceSweetCpRecommendUser, Boolean> f30Var) {
        this.f10781j = f30Var;
    }
}
