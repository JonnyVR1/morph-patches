package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xo40 extends sh2 {

    /* JADX INFO: renamed from: d */
    public boolean f22382d = false;

    /* JADX INFO: renamed from: e */
    public boolean f22383e;

    public xo40(boolean z) {
        this.f22383e = z;
    }

    @Override // p002l.sh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo14986e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var) {
        LiveMessage.ExtInfo extInfo;
        this.f22382d = false;
        int size = list.size();
        LiveMessage liveMessage2 = size != 0 ? list.get(size - 1) : null;
        if (liveMessage2 != null && !this.f22383e && (extInfo = liveMessage2.extInfo) != null && !extInfo.isImportantMsg) {
            int i = size - 1;
            liveMessage.setLayoutId(list.get(i).layoutId);
            list.set(i, liveMessage);
            this.f22382d = true;
        }
        return list;
    }

    @Override // p002l.sh2
    /* JADX INFO: renamed from: f */
    public boolean mo14987f() {
        return this.f22382d;
    }
}
