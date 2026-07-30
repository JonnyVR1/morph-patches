package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class j1f extends sh2 {
    @Override // p149l.sh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo134048e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var) {
        if (TextUtils.isEmpty(liveMessage.layoutId)) {
            liveMessage.setLayoutId(String.valueOf(liveMessage.hashCode()));
        }
        return list;
    }

    @Override // p149l.sh2
    /* JADX INFO: renamed from: f */
    public boolean mo134049f() {
        return false;
    }
}
