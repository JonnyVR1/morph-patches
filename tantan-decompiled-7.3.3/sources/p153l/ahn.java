package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveFrame;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class ahn {

    /* JADX INFO: renamed from: a */
    public final Map<String, BLiveFrame> f71381a;

    /* JADX INFO: renamed from: b */
    public boolean f71382b;

    /* JADX INFO: renamed from: l.ahn$a */
    public static class C15710a {

        /* JADX INFO: renamed from: a */
        public static ahn f71383a = new ahn();
    }

    public ahn() {
        this.f71381a = new ConcurrentHashMap();
        this.f71382b = false;
    }

    /* JADX INFO: renamed from: a */
    public static ahn m97854a() {
        return C15710a.f71383a;
    }

    /* JADX INFO: renamed from: b */
    public BLiveFrame m97855b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BLiveFrame bLiveFrame = this.f71381a.get(str);
        if (bLiveFrame != null && "live".equals(bLiveFrame.liveType)) {
            return bLiveFrame;
        }
        if (!this.f71382b) {
            m97858e();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public BLiveFrame m97856c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            return null;
        }
        BLiveFrame bLiveFrame = this.f71381a.get(str);
        if (bLiveFrame != null && BLiveType.voiceLive.equals(bLiveFrame.liveType)) {
            return bLiveFrame;
        }
        if (!this.f71382b) {
            m97858e();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m97857d(List<BLiveFrame> list) {
        this.f71381a.clear();
        for (BLiveFrame bLiveFrame : list) {
            if (bLiveFrame != null && !TextUtils.isEmpty(bLiveFrame.f45219id)) {
                this.f71381a.put(bLiveFrame.f45219id, bLiveFrame);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m97858e() {
        x5o.m209414j();
    }
}
