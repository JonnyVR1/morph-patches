package p149l;

import android.telephony.TelephonyManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes11.dex */
public class ssm0 {

    /* JADX INFO: renamed from: l.ssm0$a */
    public class C20020a implements z91 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v9j f166225a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f166226b;

        public C20020a(v9j v9jVar, d30 d30Var) {
            this.f166225a = v9jVar;
            this.f166226b = d30Var;
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            this.f166226b.call();
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.m165783g(audioBusinessType2.getBusinessMsg());
                this.f166226b.call();
            } else if (((Boolean) this.f166225a.call()).booleanValue()) {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
            } else {
                this.f166226b.call();
            }
        }

        @Override // p149l.z91
        public void success() {
            if (((Boolean) this.f166225a.call()).booleanValue()) {
                return;
            }
            this.f166226b.call();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m185757a(v9j<Boolean> v9jVar, d30 d30Var) {
        ib1.m135233b().mo135238f(tqm0.f171604h, AudioBusinessType.PHONE, new C20020a(v9jVar, d30Var));
    }

    /* JADX INFO: renamed from: b */
    public static String m185758b(long j) {
        String str;
        String str2;
        if (j <= 0) {
            return "00:00";
        }
        long j2 = j / 3600;
        long j3 = j2 <= 0 ? j / 60 : (j % 3600) / 60;
        long j4 = j % 60;
        if (j3 < 10) {
            str = "0" + j3;
        } else {
            str = "" + j3;
        }
        if (j4 < 10) {
            str2 = "0" + j4;
        } else {
            str2 = "" + j4;
        }
        if (j2 <= 0) {
            return str + ":" + str2;
        }
        return j2 + ":" + str + ":" + str2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m185759c() {
        return xhx.m208850C().m208882J();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m185760d() {
        return (Act.foreground_() == null || Act.foreground_().f15343a.get() == null) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m185761e() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) CoreModule.f17544b.getSystemService("phone");
            return (telephonyManager == null || telephonyManager.getCallState() == 0) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m185762f() {
        return xhx.m208850C().m208881I();
    }

    /* JADX INFO: renamed from: g */
    public static void m185763g(boolean z) {
        xhx.m208850C().m208902z(z);
    }

    /* JADX INFO: renamed from: h */
    public static void m185764h(boolean z) {
        xhx.m208850C().m208892U(z);
    }
}
