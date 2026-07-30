package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j1f extends sh2 {
    @Override // p002l.sh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo14986e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var) {
        if (TextUtils.isEmpty(liveMessage.layoutId)) {
            liveMessage.setLayoutId(String.valueOf(liveMessage.hashCode()));
        }
        return list;
    }

    @Override // p002l.sh2
    /* JADX INFO: renamed from: f */
    public boolean mo14987f() {
        return false;
    }
}
