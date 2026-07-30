package p009l;

import android.text.TextUtils;
import android.util.Patterns;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.OMSThemeCountdownInfo;
import com.p1.mobile.putong.data.OMSThemeInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.regex.Pattern;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yki0 {

    /* JADX INFO: renamed from: b */
    public static volatile yki0 f23128b;

    /* JADX INFO: renamed from: a */
    public OMSThemeInfo f23129a;

    /* JADX INFO: renamed from: b */
    public static yki0 m25445b() {
        if (f23128b == null) {
            synchronized (yki0.class) {
                try {
                    if (f23128b == null) {
                        f23128b = new yki0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23128b;
    }

    /* JADX INFO: renamed from: k */
    public static void m25446k() {
        f23128b = null;
    }

    /* JADX INFO: renamed from: n */
    public static String m25447n(String str, String str2) {
        return (TextUtils.isEmpty(str) || !Pattern.compile("^#([0-9a-fA-F]{6}|[0-9a-fA-F]{8})$").matcher(str).matches()) ? str2 : str;
    }

    /* JADX INFO: renamed from: a */
    public OMSThemeInfo m25448a() {
        return this.f23129a;
    }

    /* JADX INFO: renamed from: c */
    public String m25449c() {
        if (NullChecker.a(this.f23129a) && !this.f23129a.questionnaireFinished && m25456j() && !TextUtils.isEmpty(this.f23129a.h5URL) && Patterns.WEB_URL.matcher(this.f23129a.h5URL).matches()) {
            return this.f23129a.h5URL;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m25450d() {
        List<OMSThemeInfo> listM16328m = ic50.m16316j().m16328m();
        if (vwb.J(listM16328m)) {
            this.f23129a = null;
        } else {
            this.f23129a = listM16328m.get(0);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m25451e() {
        if (NullChecker.a(this.f23129a)) {
            OMSThemeInfo oMSThemeInfo = this.f23129a;
            if (oMSThemeInfo.questionnaireFinished && oMSThemeInfo.suggestSwitch && m25456j() && ((Boolean) CoreModule.c.z0.X.get()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m25452f() {
        if (NullChecker.a(this.f23129a)) {
            OMSThemeInfo oMSThemeInfo = this.f23129a;
            if (!oMSThemeInfo.questionnaireFinished && !oMSThemeInfo.suggestSwitch && m25456j() && ((Boolean) CoreModule.c.z0.Y.get()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m25453g() {
        if (NullChecker.a(this.f23129a)) {
            return m25456j();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m25454h() {
        LaunchStep launchStep = LaunchStep.OmsManagerCache;
        yni.m25474f(launchStep);
        List<OMSThemeInfo> listM16328m = ic50.m16316j().m16328m();
        yni.m25472d(launchStep);
        if (!vwb.J(listM16328m)) {
            OMSThemeInfo oMSThemeInfo = listM16328m.get(0);
            if (NullChecker.a(oMSThemeInfo)) {
                if (NullChecker.a(this.f23129a)) {
                    OMSThemeInfo oMSThemeInfo2 = this.f23129a;
                    if (oMSThemeInfo2.questionnaireFinished && !oMSThemeInfo.questionnaireFinished) {
                        return oMSThemeInfo2.suggestSwitch && m25456j();
                    }
                }
                if (oMSThemeInfo.questionnaireFinished && oMSThemeInfo.suggestSwitch && m25456j()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m25455i() {
        if (NullChecker.a(this.f23129a) && m25456j()) {
            return this.f23129a.suggestSwitch;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m25456j() {
        if (NullChecker.a(this.f23129a)) {
            OMSThemeCountdownInfo oMSThemeCountdownInfo = this.f23129a.countdownView;
            long jM18550o = mqi0.m18550o();
            if (jM18550o >= oMSThemeCountdownInfo.startMs && jM18550o < oMSThemeCountdownInfo.endMs) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void m25457l(boolean z) {
        if (NullChecker.a(this.f23129a)) {
            OMSThemeInfo oMSThemeInfo = this.f23129a;
            oMSThemeInfo.suggestSwitch = z;
            CoreModule.c.z0.d3(oMSThemeInfo.id, z, (String) null);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m25458m(OMSThemeInfo oMSThemeInfo) {
        this.f23129a = oMSThemeInfo;
    }
}
