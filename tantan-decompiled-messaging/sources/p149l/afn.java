package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveFrame;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class afn {

    /* JADX INFO: renamed from: a */
    public final Map<String, BLiveFrame> f69197a;

    /* JADX INFO: renamed from: b */
    public boolean f69198b;

    /* JADX INFO: renamed from: l.afn$a */
    public static class C15599a {

        /* JADX INFO: renamed from: a */
        public static afn f69199a = new afn();
    }

    public afn() {
        this.f69197a = new ConcurrentHashMap();
        this.f69198b = false;
    }

    /* JADX INFO: renamed from: a */
    public static afn m96259a() {
        return C15599a.f69199a;
    }

    /* JADX INFO: renamed from: b */
    public BLiveFrame m96260b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BLiveFrame bLiveFrame = this.f69197a.get(str);
        if (bLiveFrame != null && "live".equals(bLiveFrame.liveType)) {
            return bLiveFrame;
        }
        if (!this.f69198b) {
            m96263e();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public BLiveFrame m96261c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            return null;
        }
        BLiveFrame bLiveFrame = this.f69197a.get(str);
        if (bLiveFrame != null && BLiveType.voiceLive.equals(bLiveFrame.liveType)) {
            return bLiveFrame;
        }
        if (!this.f69198b) {
            m96263e();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m96262d(List<BLiveFrame> list) {
        this.f69197a.clear();
        for (BLiveFrame bLiveFrame : list) {
            if (bLiveFrame != null && !TextUtils.isEmpty(bLiveFrame.f44371id)) {
                this.f69197a.put(bLiveFrame.f44371id, bLiveFrame);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m96263e() {
        x3o.m206944j();
    }
}
