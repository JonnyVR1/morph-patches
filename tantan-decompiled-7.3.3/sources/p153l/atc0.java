package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class atc0 extends zh2 {

    /* JADX INFO: renamed from: d */
    public boolean f73220d = false;

    @Override // p153l.zh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo100025e(LiveMessage liveMessage, List<LiveMessage> list, pf60<Integer, Integer> pf60Var) {
        this.f73220d = false;
        return (liveMessage.isRedPacketFoldMessage() && !liveMessage.isUserOwnMessage()) ? m100027i(liveMessage, list, pf60Var) : list;
    }

    @Override // p153l.zh2
    /* JADX INFO: renamed from: f */
    public boolean mo100026f() {
        return this.f73220d;
    }

    /* JADX INFO: renamed from: i */
    public final List<LiveMessage> m100027i(LiveMessage liveMessage, List<LiveMessage> list, pf60<Integer, Integer> pf60Var) {
        LiveMessage liveMessage2;
        if (pf60Var != null && !jyb.m147479J(list)) {
            Integer num = pf60Var.f152156a;
            int iIntValue = num == null ? 0 : num.intValue();
            Integer num2 = pf60Var.f152157b;
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
                    if (NullChecker.m82486a(liveMessage2)) {
                        liveMessage.setLayoutId(list.get(iIntValue2).layoutId);
                        list.remove(iIntValue2);
                        list.add(iIntValue2, liveMessage);
                        this.f73220d = true;
                        return list;
                    }
                    int i = size - 1;
                    LiveMessage liveMessage3 = list.get(i);
                    if (liveMessage3.isMatchTargetMessageType(messageType) && !liveMessage3.isUserOwnMessage()) {
                        liveMessage.setLayoutId(list.get(i).layoutId);
                        list.remove(i);
                        list.add(i, liveMessage);
                        this.f73220d = true;
                    }
                }
            }
        }
        return list;
    }
}
