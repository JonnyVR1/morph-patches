package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class alk0 {
    /* JADX INFO: renamed from: a */
    public static boolean m97302a(BLiveVoiceCall bLiveVoiceCall) {
        return bLiveVoiceCall != null;
    }

    /* JADX INFO: renamed from: b */
    public static int m97303b(BLiveVoiceCall bLiveVoiceCall, w14 w14Var, boolean z) {
        int i = R$string.f46748If;
        if (w14Var.m200913e()) {
            return m97309h(bLiveVoiceCall) ? R$string.f46748If : R$string.f46814Lf;
        }
        if (w14Var.m200914f()) {
            if (z) {
                return R$string.f47326jf;
            }
            return m97309h(bLiveVoiceCall) ? R$string.f47482qh : R$string.f46770Jf;
        }
        if (w14Var.m200915g()) {
            return m97309h(bLiveVoiceCall) ? R$string.f47461pi : R$string.f46756J1;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static String m97304c(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall == null) {
            return "";
        }
        return TextUtils.equals(bLiveVoiceCall.anchor, bLiveVoiceCall.user) ? "voiceLiveMain" : "voiceLiveVice";
    }

    /* JADX INFO: renamed from: d */
    public static boolean m97305d(BLiveVoiceCall bLiveVoiceCall) {
        return m97302a(bLiveVoiceCall) && "anchor-away".equals(bLiveVoiceCall.state);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m97306e(BLiveVoiceCall bLiveVoiceCall) {
        if (m97302a(bLiveVoiceCall)) {
            return m97309h(bLiveVoiceCall) || m97314m(bLiveVoiceCall) || m97313l(bLiveVoiceCall);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m97307f(BLiveVoiceCall bLiveVoiceCall) {
        return m97302a(bLiveVoiceCall) && "hung-up".equals(bLiveVoiceCall.state);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m97308g(BLiveVoiceCall bLiveVoiceCall) {
        if (NullChecker.m81303a(bLiveVoiceCall)) {
            return bLiveVoiceCall.mutedByUser || bLiveVoiceCall.mutedByAnchor;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m97309h(BLiveVoiceCall bLiveVoiceCall) {
        if (!m97302a(bLiveVoiceCall)) {
            return false;
        }
        if ("on-voice".equals(bLiveVoiceCall.state)) {
            return true;
        }
        return !vdt.m198092b(3) && "anchor-away".equals(bLiveVoiceCall.state);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m97310i(String str) {
        return TextUtils.equals(str, ypv.f199493a.m199309D0());
    }

    /* JADX INFO: renamed from: j */
    public static boolean m97311j(BLiveVoiceCall bLiveVoiceCall) {
        return m97302a(bLiveVoiceCall) && m97310i(bLiveVoiceCall.user);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m97312k(BLiveVoiceCall bLiveVoiceCall) {
        return m97302a(bLiveVoiceCall) && bLiveVoiceCall.isAway;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m97313l(BLiveVoiceCall bLiveVoiceCall) {
        return m97302a(bLiveVoiceCall) && "approved".equals(bLiveVoiceCall.state);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m97314m(BLiveVoiceCall bLiveVoiceCall) {
        return m97302a(bLiveVoiceCall) && "created".equals(bLiveVoiceCall.state);
    }
}
