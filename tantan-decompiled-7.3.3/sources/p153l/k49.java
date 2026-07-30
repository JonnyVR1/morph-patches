package p153l;

import android.app.PendingIntent;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.PushMessage;

/* JADX INFO: loaded from: classes10.dex */
public class k49 {

    /* JADX INFO: renamed from: l.k49$a */
    public class C18093a implements cmb0.InterfaceC16312g {
        public C18093a() {
        }

        @Override // p153l.cmb0.InterfaceC16312g
        /* JADX INFO: renamed from: a */
        public boolean mo103259a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return false;
        }

        @Override // p153l.cmb0.InterfaceC16312g
        /* JADX INFO: renamed from: b */
        public PendingIntent mo103260b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return CoreModule.f18274m.m207533e(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m148240a() {
        TantanApp.f17899c.m111140a0(new C18093a(), jyb.m147507f0(new String[0]));
    }
}
