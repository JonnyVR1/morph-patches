package p009l;

import android.telephony.TelephonyManager;
import com.p000p1.mobile.putong.util.audio.AudioBusinessType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import l.d30;
import l.osi0;
import l.v9j;
import l.xhx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ssm0 {

    /* JADX INFO: renamed from: l.ssm0$a */
    public class C1194a implements z91 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v9j f20449a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f20450b;

        public C1194a(v9j v9jVar, d30 d30Var) {
            this.f20449a = v9jVar;
            this.f20450b = d30Var;
        }

        @Override // p009l.z91
        /* JADX INFO: renamed from: b */
        public void mo3116b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            this.f20450b.call();
        }

        @Override // p009l.z91
        /* JADX INFO: renamed from: d */
        public void mo3117d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.g(audioBusinessType2.getBusinessMsg());
                this.f20450b.call();
            } else if (((Boolean) this.f20449a.call()).booleanValue()) {
                ib1.m16307b().mo16313g(str, audioBusinessType, z91Var);
            } else {
                this.f20450b.call();
            }
        }

        @Override // p009l.z91
        public void success() {
            if (((Boolean) this.f20449a.call()).booleanValue()) {
                return;
            }
            this.f20450b.call();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m22365a(v9j<Boolean> v9jVar, d30 d30Var) {
        ib1.m16307b().mo16312f(tqm0.f20833h, AudioBusinessType.PHONE, new C1194a(v9jVar, d30Var));
    }

    /* JADX INFO: renamed from: b */
    public static String m22366b(long j) {
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
    public static boolean m22367c() {
        return xhx.C().J();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m22368d() {
        return (Act.foreground_() == null || Act.foreground_().a.get() == null) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m22369e() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) CoreModule.b.getSystemService("phone");
            return (telephonyManager == null || telephonyManager.getCallState() == 0) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m22370f() {
        return xhx.C().I();
    }

    /* JADX INFO: renamed from: g */
    public static void m22371g(boolean z) {
        xhx.C().z(z);
    }

    /* JADX INFO: renamed from: h */
    public static void m22372h(boolean z) {
        xhx.C().U(z);
    }
}
