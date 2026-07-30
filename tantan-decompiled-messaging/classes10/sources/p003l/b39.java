package p003l;

import android.app.PendingIntent;
import com.p1.mobile.putong.api.push.PushTrackData;
import com.p1.mobile.putong.app.TantanApp;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.PushMessage;
import l.vwb;
import l.ydb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b39 {

    /* JADX INFO: renamed from: l.b39$a */
    public class C3300a implements ydb0.g {
        public C3300a() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m5681a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public PendingIntent m5682b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return CoreModule.m.e(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5680a() {
        TantanApp.c.a0(new C3300a(), vwb.f0(new String[0]));
    }
}
