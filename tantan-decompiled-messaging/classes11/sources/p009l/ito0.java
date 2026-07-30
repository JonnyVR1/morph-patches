package p009l;

import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ito0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public f30<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> f14811j;

    /* JADX INFO: renamed from: e0 */
    public final List<d1q<?>> m16723e0(List<BLiveVoiceSweetCpTask> list, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new gto0(list.get(i), bLiveVoiceCpHouseInfo, this.f14811j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m16724f0(List<BLiveVoiceSweetCpTask> list, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        a0(m16723e0(list, bLiveVoiceCpHouseInfo), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m16725g0(f30<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> f30Var) {
        this.f14811j = f30Var;
    }
}
