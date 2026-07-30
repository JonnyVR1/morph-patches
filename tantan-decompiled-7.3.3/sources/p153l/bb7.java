package p153l;

import android.app.PendingIntent;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p051p1.mobile.putong.data.PushMessage;

/* JADX INFO: loaded from: classes9.dex */
public class bb7 {

    /* JADX INFO: renamed from: l.bb7$a */
    public class C15961a implements cmb0.InterfaceC16312g {
        public C15961a() {
        }

        @Override // p153l.cmb0.InterfaceC16312g
        /* JADX INFO: renamed from: a */
        public boolean mo103259a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            if (uqb0.f180396b0.f170324a.signedIn_()) {
                return bb7.this.m103257b(pushMessage);
            }
            return false;
        }

        @Override // p153l.cmb0.InterfaceC16312g
        /* JADX INFO: renamed from: b */
        public PendingIntent mo103260b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return CoreModule.f18274m.m207533e(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m103256a(PushMessage pushMessage) {
        if (c69.m108119e()) {
            LoveBuzzPushData loveBuzzPushData = new LoveBuzzPushData();
            loveBuzzPushData.transDataFromPush(pushMessage);
            i8w.INSTANCE.m139034f(loveBuzzPushData);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m103257b(PushMessage pushMessage) {
        if (!pushMessage.intent.equals("intl.lovebuzz.invite") && !pushMessage.intent.equals("intl.lovebuzz.match") && !pushMessage.intent.equals("intl.lovebuzz.like") && !pushMessage.intent.equals("intl.lovebuzz.prolong") && !pushMessage.intent.equals("intl.lovebuzz.report") && !pushMessage.intent.equals("intl.lovebuzz.warn") && !pushMessage.intent.equals("intl.lovebuzz.react")) {
            return false;
        }
        m103256a(pushMessage);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m103258c() {
        TantanApp.f17899c.m111140a0(new C15961a(), jyb.m147507f0("intl.lovebuzz.invite", "intl.lovebuzz.match", "intl.lovebuzz.like", "intl.lovebuzz.prolong", "intl.lovebuzz.report", "intl.lovebuzz.warn", "intl.lovebuzz.react"));
    }
}
