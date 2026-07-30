package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.j760;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uwe0 extends sh2 {

    /* JADX INFO: renamed from: d */
    public boolean f20855d = false;

    @Override // p002l.sh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo14986e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var) {
        LiveMessage liveMessage2;
        this.f20855d = false;
        if (liveMessage.isShootGameFoldMessage() && !liveMessage.isUserOwnMessage() && j760Var != null && !vwb.J(list)) {
            Object obj = j760Var.a;
            int iIntValue = obj == null ? 0 : ((Integer) obj).intValue();
            Object obj2 = j760Var.b;
            int iIntValue2 = obj2 != null ? ((Integer) obj2).intValue() : 0;
            if ((iIntValue > 0 || iIntValue2 > 0) && iIntValue >= 0 && iIntValue2 >= 0) {
                String messageType = liveMessage.getMessageType();
                int size = list.size();
                if (size > iIntValue2 && size > iIntValue) {
                    while (true) {
                        if (iIntValue2 < iIntValue) {
                            iIntValue2 = -1;
                            liveMessage2 = null;
                            break;
                        }
                        liveMessage2 = list.get(iIntValue2);
                        if (liveMessage2.isMatchTargetMessageType(messageType) && !liveMessage2.isUserOwnMessage()) {
                            break;
                        }
                        iIntValue2--;
                    }
                    if (NullChecker.a(liveMessage2)) {
                        liveMessage.setLayoutId(list.get(iIntValue2).layoutId);
                        list.remove(iIntValue2);
                        list.add(iIntValue2, liveMessage);
                        this.f20855d = true;
                        return list;
                    }
                    int i = size - 1;
                    LiveMessage liveMessage3 = list.get(i);
                    if (liveMessage3.isMatchTargetMessageType(messageType) && !liveMessage3.isUserOwnMessage()) {
                        liveMessage.setLayoutId(list.get(i).layoutId);
                        list.remove(i);
                        list.add(i, liveMessage);
                        this.f20855d = true;
                    }
                }
            }
        }
        return list;
    }

    @Override // p002l.sh2
    /* JADX INFO: renamed from: f */
    public boolean mo14987f() {
        return this.f20855d;
    }
}
