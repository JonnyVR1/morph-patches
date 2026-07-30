package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class guk0 {
    /* JADX INFO: renamed from: a */
    public static boolean m132322a(BLiveVoiceCall bLiveVoiceCall) {
        return bLiveVoiceCall != null;
    }

    /* JADX INFO: renamed from: b */
    public static int m132323b(BLiveVoiceCall bLiveVoiceCall, v24 v24Var, boolean z) {
        int i = R$string.f47596If;
        if (v24Var.m199116e()) {
            return m132329h(bLiveVoiceCall) ? R$string.f47596If : R$string.f47662Lf;
        }
        if (v24Var.m199117f()) {
            if (z) {
                return R$string.f48174jf;
            }
            return m132329h(bLiveVoiceCall) ? R$string.f48330qh : R$string.f47618Jf;
        }
        if (v24Var.m199118g()) {
            return m132329h(bLiveVoiceCall) ? R$string.f48309pi : R$string.f47604J1;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static String m132324c(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall == null) {
            return "";
        }
        return TextUtils.equals(bLiveVoiceCall.anchor, bLiveVoiceCall.user) ? "voiceLiveMain" : "voiceLiveVice";
    }

    /* JADX INFO: renamed from: d */
    public static boolean m132325d(BLiveVoiceCall bLiveVoiceCall) {
        return m132322a(bLiveVoiceCall) && "anchor-away".equals(bLiveVoiceCall.state);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m132326e(BLiveVoiceCall bLiveVoiceCall) {
        if (m132322a(bLiveVoiceCall)) {
            return m132329h(bLiveVoiceCall) || m132334m(bLiveVoiceCall) || m132333l(bLiveVoiceCall);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m132327f(BLiveVoiceCall bLiveVoiceCall) {
        return m132322a(bLiveVoiceCall) && "hung-up".equals(bLiveVoiceCall.state);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m132328g(BLiveVoiceCall bLiveVoiceCall) {
        if (NullChecker.m82486a(bLiveVoiceCall)) {
            return bLiveVoiceCall.mutedByUser || bLiveVoiceCall.mutedByAnchor;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m132329h(BLiveVoiceCall bLiveVoiceCall) {
        if (!m132322a(bLiveVoiceCall)) {
            return false;
        }
        if ("on-voice".equals(bLiveVoiceCall.state)) {
            return true;
        }
        return !wft.m206159b(3) && "anchor-away".equals(bLiveVoiceCall.state);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m132330i(String str) {
        return TextUtils.equals(str, zrv.f205799a.m207631D0());
    }

    /* JADX INFO: renamed from: j */
    public static boolean m132331j(BLiveVoiceCall bLiveVoiceCall) {
        return m132322a(bLiveVoiceCall) && m132330i(bLiveVoiceCall.user);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m132332k(BLiveVoiceCall bLiveVoiceCall) {
        return m132322a(bLiveVoiceCall) && bLiveVoiceCall.isAway;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m132333l(BLiveVoiceCall bLiveVoiceCall) {
        return m132322a(bLiveVoiceCall) && "approved".equals(bLiveVoiceCall.state);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m132334m(BLiveVoiceCall bLiveVoiceCall) {
        return m132322a(bLiveVoiceCall) && "created".equals(bLiveVoiceCall.state);
    }
}
