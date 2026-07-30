package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class lx40 extends zh2 {

    /* JADX INFO: renamed from: d */
    public boolean f133901d = false;

    /* JADX INFO: renamed from: e */
    public boolean f133902e;

    public lx40(boolean z) {
        this.f133902e = z;
    }

    @Override // p153l.zh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo100025e(LiveMessage liveMessage, List<LiveMessage> list, pf60<Integer, Integer> pf60Var) {
        LiveMessage.ExtInfo extInfo;
        this.f133901d = false;
        int size = list.size();
        LiveMessage liveMessage2 = size != 0 ? list.get(size - 1) : null;
        if (liveMessage2 != null && !this.f133902e && (extInfo = liveMessage2.extInfo) != null && !extInfo.isImportantMsg) {
            int i = size - 1;
            liveMessage.setLayoutId(list.get(i).layoutId);
            list.set(i, liveMessage);
            this.f133901d = true;
        }
        return list;
    }

    @Override // p153l.zh2
    /* JADX INFO: renamed from: f */
    public boolean mo100026f() {
        return this.f133901d;
    }
}
