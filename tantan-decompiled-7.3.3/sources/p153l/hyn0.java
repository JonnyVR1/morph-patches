package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.external.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class hyn0 {
    /* JADX INFO: renamed from: a */
    public static String m137759a(int i, String str, boolean z) {
        j6t j6tVar = tbs.f172993f;
        if (j6tVar == null) {
            return MomentAllowForwardState.allow;
        }
        boolean zM143712n = j6tVar.m143712n();
        boolean zM143715q = tbs.f172993f.m143715q();
        String strM143710l = tbs.f172993f.m143710l();
        if (!TextUtils.isEmpty(strM143710l) && strM143710l.equals(str) && 100001 == i) {
            if (!z) {
                tbs.f172993f.m143701c();
            }
            return MomentAllowForwardState.allow;
        }
        if (100011 == i) {
            if (!zM143712n) {
                return MomentAllowForwardState.allow;
            }
            if (wft.m206159b(3)) {
                o1j0.m165649w(R$string.f45766o0);
            } else {
                o1j0.m165649w(R$string.f45708A0);
            }
            return "intercept";
        }
        if (100014 == i) {
            return zM143712n ? BLiveButtonType.mute : MomentAllowForwardState.allow;
        }
        if (zM143712n) {
            if (zM143715q) {
                if (i != 100001) {
                    if (!z) {
                        if (wft.m206159b(3)) {
                            o1j0.m165649w(R$string.f45766o0);
                        } else {
                            o1j0.m165649w(R$string.f45708A0);
                        }
                    }
                } else if (!z) {
                    if (wft.m206159b(3)) {
                        o1j0.m165649w(R$string.f45764n0);
                    } else {
                        o1j0.m165649w(R$string.f45788z0);
                    }
                }
                return "intercept";
            }
            if (!z) {
                tbs.f172993f.m143702d();
            }
        }
        return MomentAllowForwardState.allow;
    }

    /* JADX INFO: renamed from: b */
    public static String m137760b(int i) {
        return m137762d(i, false);
    }

    /* JADX INFO: renamed from: c */
    public static String m137761c(int i, String str, boolean z) {
        String strM137759a = m137759a(i, str, z);
        fhw.m125605a("VoiceLiveFloatWindowProcessor", "handleSceneAction:action:" + i + ",status:" + strM137759a);
        return strM137759a;
    }

    /* JADX INFO: renamed from: d */
    public static String m137762d(int i, boolean z) {
        String strM137759a = m137759a(i, "", z);
        fhw.m125605a("VoiceLiveFloatWindowProcessor", "handleSceneAction:action:" + i + ",status:" + strM137759a);
        return strM137759a;
    }
}
