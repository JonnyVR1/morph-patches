package p003l;

import android.app.PendingIntent;
import com.p1.mobile.putong.api.push.PushTrackData;
import com.p1.mobile.putong.app.TantanApp;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.PushMessage;
import l.vwb;
import l.ydb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jr9 {

    /* JADX INFO: renamed from: l.jr9$a */
    public class C3355a implements ydb0.g {
        public C3355a() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m7455a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public PendingIntent m7456b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return CoreModule.m.e(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7454a() {
        TantanApp.c.a0(new C3355a(), vwb.f0(new String[0]));
    }
}
