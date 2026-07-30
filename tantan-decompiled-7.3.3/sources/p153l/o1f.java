package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class o1f extends zh2 {
    @Override // p153l.zh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo100025e(LiveMessage liveMessage, List<LiveMessage> list, pf60<Integer, Integer> pf60Var) {
        int size;
        if (!jyb.m147479J(list) && (size = list.size()) > 200) {
            list.subList(0, size - 180).clear();
        }
        return list;
    }

    @Override // p153l.zh2
    /* JADX INFO: renamed from: f */
    public boolean mo100026f() {
        return false;
    }
}
