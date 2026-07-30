package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes4.dex */
public class csq {
    /* JADX INFO: renamed from: a */
    public static String m112227a(i6t i6tVar, String str, String str2, int i) {
        String strM207631D0 = zrv.f205799a.m207631D0();
        if (bf10.m103808N(i6tVar)) {
            return m112229c(bf10.m103799E(i6tVar, strM207631D0));
        }
        if (i6tVar.m138856F3(new x34(i).m209191e(strM207631D0)) == null || !strM207631D0.equals(str2)) {
            return strM207631D0.equals(str) ? "anchor" : "audience";
        }
        return "callUser";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static String m112228b(i6t i6tVar, String str, String str2, int i) {
        BLiveVoiceCall bLiveVoiceCallM136873l;
        String strM207631D0 = zrv.f205799a.m207631D0();
        if (i6tVar.m213810E2() instanceof rwn0) {
            bLiveVoiceCallM136873l = ((rwn0) i6tVar.m213810E2()).m183411P2().m136873l(str2);
        } else {
            hfv.m134841a(i6tVar, str, str2, i);
            bLiveVoiceCallM136873l = null;
        }
        if (strM207631D0.equals(str)) {
            return "anchor";
        }
        return (bLiveVoiceCallM136873l == null || !strM207631D0.equals(str2)) ? "audience" : "callUser";
    }

    /* JADX INFO: renamed from: c */
    public static String m112229c(@Nullable BLiveMultiCall bLiveMultiCall) {
        if (fn10.m126334b(bLiveMultiCall)) {
            return "multiCallAnchor";
        }
        if (fn10.m126342j(bLiveMultiCall)) {
            return "multiCallOwner";
        }
        return fn10.m126338f(bLiveMultiCall) ? "multiCallAudience" : "audience";
    }

    /* JADX INFO: renamed from: d */
    public static String m112230d(i6t i6tVar, String str, String str2, int i) {
        if (bf10.m103808N(i6tVar)) {
            return m112229c(bf10.m103799E(i6tVar, str2));
        }
        if (str2.equals(str)) {
            return "anchor";
        }
        return i6tVar.m138856F3(new x34(i).m209191e(str2)) != null ? "callUser" : "audience";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static String m112231e(i6t i6tVar, String str, String str2, int i) {
        BLiveVoiceCall bLiveVoiceCallM136873l;
        if (i6tVar.m213810E2() instanceof rwn0) {
            bLiveVoiceCallM136873l = ((rwn0) i6tVar.m213810E2()).m183411P2().m136873l(str2);
        } else {
            hfv.m134841a(i6tVar, str, str2, i);
            bLiveVoiceCallM136873l = null;
        }
        if (str2.equals(str)) {
            return "anchor";
        }
        return bLiveVoiceCallM136873l != null ? "callUser" : "audience";
    }
}
