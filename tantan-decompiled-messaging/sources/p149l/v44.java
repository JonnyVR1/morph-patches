package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes5.dex */
public class v44 {
    /* JADX INFO: renamed from: a */
    public static boolean m196933a(BLiveCall bLiveCall) {
        return bLiveCall != null;
    }

    /* JADX INFO: renamed from: b */
    public static int m196934b(BLiveCall bLiveCall, w14 w14Var) {
        if (w14Var.m200916h()) {
            if (m196937e(bLiveCall)) {
                return R$string.f46925R0;
            }
            if (m196948p(bLiveCall)) {
                return R$string.f46800L1;
            }
            return 0;
        }
        if (w14Var.m200914f()) {
            if (m196937e(bLiveCall)) {
                return R$string.f46904Q0;
            }
            if (m196948p(bLiveCall)) {
                return R$string.f46778K1;
            }
            return 0;
        }
        if (!w14Var.m200915g()) {
            return 0;
        }
        if (m196937e(bLiveCall)) {
            return R$string.f46883P0;
        }
        if (m196948p(bLiveCall)) {
            return R$string.f46756J1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m196935c(BLiveCall bLiveCall) {
        if (bLiveCall.state.equals("on-voice")) {
            return "callVoiceVice";
        }
        return bLiveCall.state.equals("on-video") ? "callVideoVice" : "";
    }

    /* JADX INFO: renamed from: d */
    public static boolean m196936d(BLiveCall bLiveCall) {
        if (m196933a(bLiveCall)) {
            return m196941i(bLiveCall) || m196940h(bLiveCall) || m196948p(bLiveCall);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m196937e(BLiveCall bLiveCall) {
        return m196941i(bLiveCall) || m196940h(bLiveCall);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m196938f(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && "hung-up".equals(bLiveCall.state);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m196939g(BLiveCall bLiveCall) {
        return bLiveCall == null || TextUtils.isEmpty(bLiveCall.f44342id);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m196940h(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && "on-video".equals(bLiveCall.state);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m196941i(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && "on-voice".equals(bLiveCall.state);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m196942j(BLiveCall bLiveCall, BLiveCall bLiveCall2) {
        if (m196933a(bLiveCall) && m196933a(bLiveCall2)) {
            return TextUtils.equals(bLiveCall.f44342id, bLiveCall2.f44342id);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m196943k(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && TextUtils.equals(bLiveCall.user, ypv.f199493a.m199309D0());
    }

    /* JADX INFO: renamed from: l */
    public static boolean m196944l(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && bLiveCall.isAway;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m196945m(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && "video-accepted".equals(bLiveCall.opState);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m196946n(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && "video-invited".equals(bLiveCall.opState);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m196947o(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && "video-ready".equals(bLiveCall.opState);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m196948p(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && "voice-applied".equals(bLiveCall.opState);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m196949q(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && "voice-approved".equals(bLiveCall.opState);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m196950r(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && "created".equals(bLiveCall.state);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m196951s(BLiveCall bLiveCall) {
        return m196933a(bLiveCall) && "voice-canceled".equals(bLiveCall.opState);
    }
}
