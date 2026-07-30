package p009l;

import android.app.PendingIntent;
import com.p1.mobile.putong.api.push.PushTrackData;
import com.p1.mobile.putong.app.TantanApp;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.PushMessage;
import l.vwb;
import l.ydb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class i6a {

    /* JADX INFO: renamed from: l.i6a$a */
    public class C0949a implements ydb0.g {
        public C0949a() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m16184a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public PendingIntent m16185b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return CoreModule.m.e(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16183a() {
        TantanApp.c.a0(new C0949a(), vwb.f0(new String[0]));
    }
}
