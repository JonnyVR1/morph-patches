package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.external.R$string;

/* JADX INFO: loaded from: classes13.dex */
public class dpn0 {
    /* JADX INFO: renamed from: a */
    public static String m112918a(int i, String str, boolean z) {
        i4t i4tVar = s9s.f163232f;
        if (i4tVar == null) {
            return MomentAllowForwardState.allow;
        }
        boolean zM134381n = i4tVar.m134381n();
        boolean zM134384q = s9s.f163232f.m134384q();
        String strM134379l = s9s.f163232f.m134379l();
        if (!TextUtils.isEmpty(strM134379l) && strM134379l.equals(str) && 100001 == i) {
            if (!z) {
                s9s.f163232f.m134370c();
            }
            return MomentAllowForwardState.allow;
        }
        if (100011 == i) {
            if (!zM134381n) {
                return MomentAllowForwardState.allow;
            }
            if (vdt.m198092b(3)) {
                lsi0.m151593w(R$string.f44918o0);
            } else {
                lsi0.m151593w(R$string.f44860A0);
            }
            return "intercept";
        }
        if (100014 == i) {
            return zM134381n ? BLiveButtonType.mute : MomentAllowForwardState.allow;
        }
        if (zM134381n) {
            if (zM134384q) {
                if (i != 100001) {
                    if (!z) {
                        if (vdt.m198092b(3)) {
                            lsi0.m151593w(R$string.f44918o0);
                        } else {
                            lsi0.m151593w(R$string.f44860A0);
                        }
                    }
                } else if (!z) {
                    if (vdt.m198092b(3)) {
                        lsi0.m151593w(R$string.f44916n0);
                    } else {
                        lsi0.m151593w(R$string.f44940z0);
                    }
                }
                return "intercept";
            }
            if (!z) {
                s9s.f163232f.m134371d();
            }
        }
        return MomentAllowForwardState.allow;
    }

    /* JADX INFO: renamed from: b */
    public static String m112919b(int i) {
        return m112921d(i, false);
    }

    /* JADX INFO: renamed from: c */
    public static String m112920c(int i, String str, boolean z) {
        String strM112918a = m112918a(i, str, z);
        hfw.m130790a("VoiceLiveFloatWindowProcessor", "handleSceneAction:action:" + i + ",status:" + strM112918a);
        return strM112918a;
    }

    /* JADX INFO: renamed from: d */
    public static String m112921d(int i, boolean z) {
        String strM112918a = m112918a(i, "", z);
        hfw.m130790a("VoiceLiveFloatWindowProcessor", "handleSceneAction:action:" + i + ",status:" + strM112918a);
        return strM112918a;
    }
}
