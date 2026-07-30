package p006l;

import android.app.PendingIntent;
import com.p000p1.mobile.putong.api.push.PushTrackData;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p1.mobile.putong.data.PushMessage;
import l.k6w;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class x97 {

    /* JADX INFO: renamed from: l.x97$a */
    public class C1431a implements ydb0.InterfaceC1476g {
        public C1431a() {
        }

        @Override // p006l.ydb0.InterfaceC1476g
        /* JADX INFO: renamed from: a */
        public boolean mo12244a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            if (qib0.f19804b0.f17706a.signedIn_()) {
                return x97.this.m27160b(pushMessage);
            }
            return false;
        }

        @Override // p006l.ydb0.InterfaceC1476g
        /* JADX INFO: renamed from: b */
        public PendingIntent mo12245b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return CoreModule.f1544m.e(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27159a(PushMessage pushMessage) {
        if (t49.m24450e()) {
            LoveBuzzPushData loveBuzzPushData = new LoveBuzzPushData();
            loveBuzzPushData.transDataFromPush(pushMessage);
            k6w.INSTANCE.f(loveBuzzPushData);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m27160b(PushMessage pushMessage) {
        if (!pushMessage.intent.equals("intl.lovebuzz.invite") && !pushMessage.intent.equals("intl.lovebuzz.match") && !pushMessage.intent.equals("intl.lovebuzz.like") && !pushMessage.intent.equals("intl.lovebuzz.prolong") && !pushMessage.intent.equals("intl.lovebuzz.report") && !pushMessage.intent.equals("intl.lovebuzz.warn") && !pushMessage.intent.equals("intl.lovebuzz.react")) {
            return false;
        }
        m27159a(pushMessage);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m27161c() {
        TantanApp.f1169c.m28209a0(new C1431a(), vwb.f0(new String[]{"intl.lovebuzz.invite", "intl.lovebuzz.match", "intl.lovebuzz.like", "intl.lovebuzz.prolong", "intl.lovebuzz.report", "intl.lovebuzz.warn", "intl.lovebuzz.react"}));
    }
}
