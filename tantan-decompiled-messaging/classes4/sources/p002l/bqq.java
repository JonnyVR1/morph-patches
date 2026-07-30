package p002l;

import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import l.gdv;
import l.nnn0;
import l.r610;
import l.ve10;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bqq {
    /* JADX INFO: renamed from: a */
    public static String m10554a(h4t h4tVar, String str, String str2, int i) {
        String strD0 = ypv.a.D0();
        if (r610.N(h4tVar)) {
            return m10556c(r610.E(h4tVar, strD0));
        }
        if (h4tVar.m14184F3(new y24(i).m26304e(strD0)) == null || !strD0.equals(str2)) {
            return strD0.equals(str) ? "anchor" : "audience";
        }
        return "callUser";
    }

    /* JADX INFO: renamed from: b */
    public static String m10555b(h4t h4tVar, String str, String str2, int i) {
        BLiveVoiceCall bLiveVoiceCallL;
        String strD0 = ypv.a.D0();
        if (h4tVar.m25547E2() instanceof nnn0) {
            bLiveVoiceCallL = ((nnn0) h4tVar.m25547E2()).P2().l(str2);
        } else {
            gdv.a(h4tVar, str, str2, i);
            bLiveVoiceCallL = null;
        }
        if (strD0.equals(str)) {
            return "anchor";
        }
        return (bLiveVoiceCallL == null || !strD0.equals(str2)) ? "audience" : "callUser";
    }

    /* JADX INFO: renamed from: c */
    public static String m10556c(@Nullable BLiveMultiCall bLiveMultiCall) {
        if (ve10.b(bLiveMultiCall)) {
            return "multiCallAnchor";
        }
        if (ve10.j(bLiveMultiCall)) {
            return "multiCallOwner";
        }
        return ve10.f(bLiveMultiCall) ? "multiCallAudience" : "audience";
    }

    /* JADX INFO: renamed from: d */
    public static String m10557d(h4t h4tVar, String str, String str2, int i) {
        if (r610.N(h4tVar)) {
            return m10556c(r610.E(h4tVar, str2));
        }
        if (str2.equals(str)) {
            return "anchor";
        }
        return h4tVar.m14184F3(new y24(i).m26304e(str2)) != null ? "callUser" : "audience";
    }

    /* JADX INFO: renamed from: e */
    public static String m10558e(h4t h4tVar, String str, String str2, int i) {
        BLiveVoiceCall bLiveVoiceCallL;
        if (h4tVar.m25547E2() instanceof nnn0) {
            bLiveVoiceCallL = ((nnn0) h4tVar.m25547E2()).P2().l(str2);
        } else {
            gdv.a(h4tVar, str, str2, i);
            bLiveVoiceCallL = null;
        }
        if (str2.equals(str)) {
            return "anchor";
        }
        return bLiveVoiceCallL != null ? "callUser" : "audience";
    }
}
