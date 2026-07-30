package p153l;

import android.text.TextUtils;
import android.util.Patterns;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.OMSThemeCountdownInfo;
import com.p051p1.mobile.putong.data.OMSThemeInfo;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class yti0 {

    /* JADX INFO: renamed from: b */
    public static volatile yti0 f201514b;

    /* JADX INFO: renamed from: a */
    public OMSThemeInfo f201515a;

    /* JADX INFO: renamed from: b */
    public static yti0 m217322b() {
        if (f201514b == null) {
            synchronized (yti0.class) {
                try {
                    if (f201514b == null) {
                        f201514b = new yti0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f201514b;
    }

    /* JADX INFO: renamed from: k */
    public static void m217323k() {
        f201514b = null;
    }

    /* JADX INFO: renamed from: n */
    public static String m217324n(String str, String str2) {
        return (TextUtils.isEmpty(str) || !Pattern.compile("^#([0-9a-fA-F]{6}|[0-9a-fA-F]{8})$").matcher(str).matches()) ? str2 : str;
    }

    /* JADX INFO: renamed from: a */
    public OMSThemeInfo m217325a() {
        return this.f201515a;
    }

    /* JADX INFO: renamed from: c */
    public String m217326c() {
        if (NullChecker.m82486a(this.f201515a) && !this.f201515a.questionnaireFinished && m217333j() && !TextUtils.isEmpty(this.f201515a.h5URL) && Patterns.WEB_URL.matcher(this.f201515a.h5URL).matches()) {
            return this.f201515a.h5URL;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m217327d() {
        List<OMSThemeInfo> listM172580m = pk50.m172568j().m172580m();
        if (jyb.m147479J(listM172580m)) {
            this.f201515a = null;
        } else {
            this.f201515a = listM172580m.get(0);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m217328e() {
        if (NullChecker.m82486a(this.f201515a)) {
            OMSThemeInfo oMSThemeInfo = this.f201515a;
            if (oMSThemeInfo.questionnaireFinished && oMSThemeInfo.suggestSwitch && m217333j() && CoreModule.f18264c.f20444z0.f178196X.get().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m217329f() {
        if (NullChecker.m82486a(this.f201515a)) {
            OMSThemeInfo oMSThemeInfo = this.f201515a;
            if (!oMSThemeInfo.questionnaireFinished && !oMSThemeInfo.suggestSwitch && m217333j() && CoreModule.f18264c.f20444z0.f178197Y.get().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m217330g() {
        if (NullChecker.m82486a(this.f201515a)) {
            return m217333j();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m217331h() {
        LaunchStep launchStep = LaunchStep.OmsManagerCache;
        uqi.m197339f(launchStep);
        List<OMSThemeInfo> listM172580m = pk50.m172568j().m172580m();
        uqi.m197337d(launchStep);
        if (!jyb.m147479J(listM172580m)) {
            OMSThemeInfo oMSThemeInfo = listM172580m.get(0);
            if (NullChecker.m82486a(oMSThemeInfo)) {
                if (NullChecker.m82486a(this.f201515a)) {
                    OMSThemeInfo oMSThemeInfo2 = this.f201515a;
                    if (oMSThemeInfo2.questionnaireFinished && !oMSThemeInfo.questionnaireFinished) {
                        return oMSThemeInfo2.suggestSwitch && m217333j();
                    }
                }
                if (oMSThemeInfo.questionnaireFinished && oMSThemeInfo.suggestSwitch && m217333j()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m217332i() {
        if (NullChecker.m82486a(this.f201515a) && m217333j()) {
            return this.f201515a.suggestSwitch;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m217333j() {
        if (NullChecker.m82486a(this.f201515a)) {
            OMSThemeCountdownInfo oMSThemeCountdownInfo = this.f201515a.countdownView;
            long jM174454o = pzi0.m174454o();
            if (jM174454o >= oMSThemeCountdownInfo.startMs && jM174454o < oMSThemeCountdownInfo.endMs) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void m217334l(boolean z) {
        if (NullChecker.m82486a(this.f201515a)) {
            OMSThemeInfo oMSThemeInfo = this.f201515a;
            oMSThemeInfo.suggestSwitch = z;
            CoreModule.f18264c.f20444z0.m195164d3(oMSThemeInfo.f39644id, z, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m217335m(OMSThemeInfo oMSThemeInfo) {
        this.f201515a = oMSThemeInfo;
    }
}
