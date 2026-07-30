package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes5.dex */
public class u54 {
    /* JADX INFO: renamed from: a */
    public static boolean m194521a(BLiveCall bLiveCall) {
        return bLiveCall != null;
    }

    /* JADX INFO: renamed from: b */
    public static int m194522b(BLiveCall bLiveCall, v24 v24Var) {
        if (v24Var.m199119h()) {
            if (m194525e(bLiveCall)) {
                return R$string.f47773R0;
            }
            if (m194536p(bLiveCall)) {
                return R$string.f47648L1;
            }
            return 0;
        }
        if (v24Var.m199117f()) {
            if (m194525e(bLiveCall)) {
                return R$string.f47752Q0;
            }
            if (m194536p(bLiveCall)) {
                return R$string.f47626K1;
            }
            return 0;
        }
        if (!v24Var.m199118g()) {
            return 0;
        }
        if (m194525e(bLiveCall)) {
            return R$string.f47731P0;
        }
        if (m194536p(bLiveCall)) {
            return R$string.f47604J1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m194523c(BLiveCall bLiveCall) {
        if (bLiveCall.state.equals("on-voice")) {
            return "callVoiceVice";
        }
        return bLiveCall.state.equals("on-video") ? "callVideoVice" : "";
    }

    /* JADX INFO: renamed from: d */
    public static boolean m194524d(BLiveCall bLiveCall) {
        if (m194521a(bLiveCall)) {
            return m194529i(bLiveCall) || m194528h(bLiveCall) || m194536p(bLiveCall);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m194525e(BLiveCall bLiveCall) {
        return m194529i(bLiveCall) || m194528h(bLiveCall);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m194526f(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && "hung-up".equals(bLiveCall.state);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m194527g(BLiveCall bLiveCall) {
        return bLiveCall == null || TextUtils.isEmpty(bLiveCall.f45190id);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m194528h(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && "on-video".equals(bLiveCall.state);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m194529i(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && "on-voice".equals(bLiveCall.state);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m194530j(BLiveCall bLiveCall, BLiveCall bLiveCall2) {
        if (m194521a(bLiveCall) && m194521a(bLiveCall2)) {
            return TextUtils.equals(bLiveCall.f45190id, bLiveCall2.f45190id);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m194531k(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && TextUtils.equals(bLiveCall.user, zrv.f205799a.m207631D0());
    }

    /* JADX INFO: renamed from: l */
    public static boolean m194532l(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && bLiveCall.isAway;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m194533m(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && "video-accepted".equals(bLiveCall.opState);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m194534n(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && "video-invited".equals(bLiveCall.opState);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m194535o(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && "video-ready".equals(bLiveCall.opState);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m194536p(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && "voice-applied".equals(bLiveCall.opState);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m194537q(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && "voice-approved".equals(bLiveCall.opState);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m194538r(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && "created".equals(bLiveCall.state);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m194539s(BLiveCall bLiveCall) {
        return m194521a(bLiveCall) && "voice-canceled".equals(bLiveCall.opState);
    }
}
