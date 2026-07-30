package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class k0f extends sh2 {
    @Override // p149l.sh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo134048e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var) {
        int size;
        if (!vwb.m200296J(list) && (size = list.size()) > 200) {
            list.subList(0, size - 180).clear();
        }
        return list;
    }

    @Override // p149l.sh2
    /* JADX INFO: renamed from: f */
    public boolean mo134049f() {
        return false;
    }
}
