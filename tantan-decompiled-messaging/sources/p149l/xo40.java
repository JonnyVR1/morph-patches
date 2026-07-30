package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class xo40 extends sh2 {

    /* JADX INFO: renamed from: d */
    public boolean f193779d = false;

    /* JADX INFO: renamed from: e */
    public boolean f193780e;

    public xo40(boolean z) {
        this.f193780e = z;
    }

    @Override // p149l.sh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo134048e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var) {
        LiveMessage.ExtInfo extInfo;
        this.f193779d = false;
        int size = list.size();
        LiveMessage liveMessage2 = size != 0 ? list.get(size - 1) : null;
        if (liveMessage2 != null && !this.f193780e && (extInfo = liveMessage2.extInfo) != null && !extInfo.isImportantMsg) {
            int i = size - 1;
            liveMessage.setLayoutId(list.get(i).layoutId);
            list.set(i, liveMessage);
            this.f193779d = true;
        }
        return list;
    }

    @Override // p149l.sh2
    /* JADX INFO: renamed from: f */
    public boolean mo134049f() {
        return this.f193779d;
    }
}
