package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;
import l.j760;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k0f extends sh2 {
    @Override // p002l.sh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo14986e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var) {
        int size;
        if (!vwb.J(list) && (size = list.size()) > 200) {
            list.subList(0, size - 180).clear();
        }
        return list;
    }

    @Override // p002l.sh2
    /* JADX INFO: renamed from: f */
    public boolean mo14987f() {
        return false;
    }
}
