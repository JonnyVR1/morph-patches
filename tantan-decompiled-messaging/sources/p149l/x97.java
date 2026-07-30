package p149l;

import android.app.PendingIntent;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p046p1.mobile.putong.data.PushMessage;

/* JADX INFO: loaded from: classes9.dex */
public class x97 {

    /* JADX INFO: renamed from: l.x97$a */
    public class C21046a implements ydb0.InterfaceC21375g {
        public C21046a() {
        }

        @Override // p149l.ydb0.InterfaceC21375g
        /* JADX INFO: renamed from: a */
        public boolean mo98941a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            if (qib0.f154713b0.f139230a.signedIn_()) {
                return x97.this.m207486b(pushMessage);
            }
            return false;
        }

        @Override // p149l.ydb0.InterfaceC21375g
        /* JADX INFO: renamed from: b */
        public PendingIntent mo98942b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return CoreModule.f17555m.m127652e(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m207485a(PushMessage pushMessage) {
        if (t49.m187151e()) {
            LoveBuzzPushData loveBuzzPushData = new LoveBuzzPushData();
            loveBuzzPushData.transDataFromPush(pushMessage);
            k6w.INSTANCE.m144637f(loveBuzzPushData);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m207486b(PushMessage pushMessage) {
        if (!pushMessage.intent.equals("intl.lovebuzz.invite") && !pushMessage.intent.equals("intl.lovebuzz.match") && !pushMessage.intent.equals("intl.lovebuzz.like") && !pushMessage.intent.equals("intl.lovebuzz.prolong") && !pushMessage.intent.equals("intl.lovebuzz.report") && !pushMessage.intent.equals("intl.lovebuzz.warn") && !pushMessage.intent.equals("intl.lovebuzz.react")) {
            return false;
        }
        m207485a(pushMessage);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m207487c() {
        TantanApp.f17180c.m214262a0(new C21046a(), vwb.m200324f0("intl.lovebuzz.invite", "intl.lovebuzz.match", "intl.lovebuzz.like", "intl.lovebuzz.prolong", "intl.lovebuzz.report", "intl.lovebuzz.warn", "intl.lovebuzz.react"));
    }
}
