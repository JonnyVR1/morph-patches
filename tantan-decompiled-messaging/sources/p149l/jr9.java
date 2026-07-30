package p149l;

import android.app.PendingIntent;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.PushMessage;

/* JADX INFO: loaded from: classes10.dex */
public class jr9 {

    /* JADX INFO: renamed from: l.jr9$a */
    public class C17849a implements ydb0.InterfaceC21375g {
        public C17849a() {
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
    public void m142923a() {
        TantanApp.f17180c.m214262a0(new C17849a(), vwb.m200324f0(new String[0]));
    }
}
