package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class tkc0 extends sh2 {

    /* JADX INFO: renamed from: d */
    public boolean f170852d = false;

    @Override // p149l.sh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo134048e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var) {
        this.f170852d = false;
        return (liveMessage.isRedPacketFoldMessage() && !liveMessage.isUserOwnMessage()) ? m189470i(liveMessage, list, j760Var) : list;
    }

    @Override // p149l.sh2
    /* JADX INFO: renamed from: f */
    public boolean mo134049f() {
        return this.f170852d;
    }

    /* JADX INFO: renamed from: i */
    public final List<LiveMessage> m189470i(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var) {
        LiveMessage liveMessage2;
        if (j760Var != null && !vwb.m200296J(list)) {
            Integer num = j760Var.f116564a;
            int iIntValue = num == null ? 0 : num.intValue();
            Integer num2 = j760Var.f116565b;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
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
                    if (NullChecker.m81303a(liveMessage2)) {
                        liveMessage.setLayoutId(list.get(iIntValue2).layoutId);
                        list.remove(iIntValue2);
                        list.add(iIntValue2, liveMessage);
                        this.f170852d = true;
                        return list;
                    }
                    int i = size - 1;
                    LiveMessage liveMessage3 = list.get(i);
                    if (liveMessage3.isMatchTargetMessageType(messageType) && !liveMessage3.isUserOwnMessage()) {
                        liveMessage.setLayoutId(list.get(i).layoutId);
                        list.remove(i);
                        list.add(i, liveMessage);
                        this.f170852d = true;
                    }
                }
            }
        }
        return list;
    }
}
