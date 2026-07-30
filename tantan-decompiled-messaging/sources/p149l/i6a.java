package p149l;

import android.app.PendingIntent;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.PushMessage;

/* JADX INFO: loaded from: classes11.dex */
public class i6a {

    /* JADX INFO: renamed from: l.i6a$a */
    public class C17492a implements ydb0.InterfaceC21375g {
        public C17492a() {
        }

        @Override // p149l.ydb0.InterfaceC21375g
        /* JADX INFO: renamed from: a */
        public boolean mo98941a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return false;
        }

        @Override // p149l.ydb0.InterfaceC21375g
        /* JADX INFO: renamed from: b */
        public PendingIntent mo98942b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return CoreModule.f17555m.m127652e(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m134600a() {
        TantanApp.f17180c.m214262a0(new C17492a(), vwb.m200324f0(new String[0]));
    }
}
