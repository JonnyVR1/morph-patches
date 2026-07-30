package p149l;

import android.text.TextUtils;
import android.util.Patterns;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.OMSThemeCountdownInfo;
import com.p046p1.mobile.putong.data.OMSThemeInfo;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class yki0 {

    /* JADX INFO: renamed from: b */
    public static volatile yki0 f198759b;

    /* JADX INFO: renamed from: a */
    public OMSThemeInfo f198760a;

    /* JADX INFO: renamed from: b */
    public static yki0 m215127b() {
        if (f198759b == null) {
            synchronized (yki0.class) {
                try {
                    if (f198759b == null) {
                        f198759b = new yki0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f198759b;
    }

    /* JADX INFO: renamed from: k */
    public static void m215128k() {
        f198759b = null;
    }

    /* JADX INFO: renamed from: n */
    public static String m215129n(String str, String str2) {
        return (TextUtils.isEmpty(str) || !Pattern.compile("^#([0-9a-fA-F]{6}|[0-9a-fA-F]{8})$").matcher(str).matches()) ? str2 : str;
    }

    /* JADX INFO: renamed from: a */
    public OMSThemeInfo m215130a() {
        return this.f198760a;
    }

    /* JADX INFO: renamed from: c */
    public String m215131c() {
        if (NullChecker.m81303a(this.f198760a) && !this.f198760a.questionnaireFinished && m215138j() && !TextUtils.isEmpty(this.f198760a.h5URL) && Patterns.WEB_URL.matcher(this.f198760a.h5URL).matches()) {
            return this.f198760a.h5URL;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m215132d() {
        List<OMSThemeInfo> listM135339m = ic50.m135327j().m135339m();
        if (vwb.m200296J(listM135339m)) {
            this.f198760a = null;
        } else {
            this.f198760a = listM135339m.get(0);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m215133e() {
        if (NullChecker.m81303a(this.f198760a)) {
            OMSThemeInfo oMSThemeInfo = this.f198760a;
            if (oMSThemeInfo.questionnaireFinished && oMSThemeInfo.suggestSwitch && m215138j() && CoreModule.f17545c.f19702z0.f106531X.get().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m215134f() {
        if (NullChecker.m81303a(this.f198760a)) {
            OMSThemeInfo oMSThemeInfo = this.f198760a;
            if (!oMSThemeInfo.questionnaireFinished && !oMSThemeInfo.suggestSwitch && m215138j() && CoreModule.f17545c.f19702z0.f106532Y.get().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m215135g() {
        if (NullChecker.m81303a(this.f198760a)) {
            return m215138j();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m215136h() {
        LaunchStep launchStep = LaunchStep.OmsManagerCache;
        yni.m215417f(launchStep);
        List<OMSThemeInfo> listM135339m = ic50.m135327j().m135339m();
        yni.m215415d(launchStep);
        if (!vwb.m200296J(listM135339m)) {
            OMSThemeInfo oMSThemeInfo = listM135339m.get(0);
            if (NullChecker.m81303a(oMSThemeInfo)) {
                if (NullChecker.m81303a(this.f198760a)) {
                    OMSThemeInfo oMSThemeInfo2 = this.f198760a;
                    if (oMSThemeInfo2.questionnaireFinished && !oMSThemeInfo.questionnaireFinished) {
                        return oMSThemeInfo2.suggestSwitch && m215138j();
                    }
                }
                if (oMSThemeInfo.questionnaireFinished && oMSThemeInfo.suggestSwitch && m215138j()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m215137i() {
        if (NullChecker.m81303a(this.f198760a) && m215138j()) {
            return this.f198760a.suggestSwitch;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m215138j() {
        if (NullChecker.m81303a(this.f198760a)) {
            OMSThemeCountdownInfo oMSThemeCountdownInfo = this.f198760a.countdownView;
            long jM155944o = mqi0.m155944o();
            if (jM155944o >= oMSThemeCountdownInfo.startMs && jM155944o < oMSThemeCountdownInfo.endMs) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void m215139l(boolean z) {
        if (NullChecker.m81303a(this.f198760a)) {
            OMSThemeInfo oMSThemeInfo = this.f198760a;
            oMSThemeInfo.suggestSwitch = z;
            CoreModule.f17545c.f19702z0.m129990d3(oMSThemeInfo.f38796id, z, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m215140m(OMSThemeInfo oMSThemeInfo) {
        this.f198760a = oMSThemeInfo;
    }
}
