package p153l;

import android.telephony.TelephonyManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes11.dex */
public class w1n0 {

    /* JADX INFO: renamed from: l.w1n0$a */
    public class C20995a implements ga1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pcj f186825a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f186826b;

        public C20995a(pcj pcjVar, x20 x20Var) {
            this.f186825a = pcjVar;
            this.f186826b = x20Var;
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            this.f186826b.call();
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                r1j0.m179420g(audioBusinessType2.getBusinessMsg());
                this.f186826b.call();
            } else if (((Boolean) this.f186825a.call()).booleanValue()) {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
            } else {
                this.f186826b.call();
            }
        }

        @Override // p153l.ga1
        public void success() {
            if (((Boolean) this.f186825a.call()).booleanValue()) {
                return;
            }
            this.f186826b.call();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m204454a(pcj<Boolean> pcjVar, x20 x20Var) {
        pb1.m171472b().mo171477f(xzm0.f196892h, AudioBusinessType.PHONE, new C20995a(pcjVar, x20Var));
    }

    /* JADX INFO: renamed from: b */
    public static String m204455b(long j) {
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
    public static boolean m204456c() {
        return uqx.m197379C().m197411J();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m204457d() {
        return (Act.foreground_() == null || Act.foreground_().f16062a.get() == null) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m204458e() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) CoreModule.f18263b.getSystemService("phone");
            return (telephonyManager == null || telephonyManager.getCallState() == 0) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m204459f() {
        return uqx.m197379C().m197410I();
    }

    /* JADX INFO: renamed from: g */
    public static void m204460g(boolean z) {
        uqx.m197379C().m197431z(z);
    }

    /* JADX INFO: renamed from: h */
    public static void m204461h(boolean z) {
        uqx.m197379C().m197421U(z);
    }
}
