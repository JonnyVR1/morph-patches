package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes4.dex */
public class bqq {
    /* JADX INFO: renamed from: a */
    public static String m103386a(h4t h4tVar, String str, String str2, int i) {
        String strM199309D0 = ypv.f199493a.m199309D0();
        if (r610.m177979N(h4tVar)) {
            return m103388c(r610.m177970E(h4tVar, strM199309D0));
        }
        if (h4tVar.m129297F3(new y24(i).m212356e(strM199309D0)) == null || !strM199309D0.equals(str2)) {
            return strM199309D0.equals(str) ? "anchor" : "audience";
        }
        return "callUser";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static String m103387b(h4t h4tVar, String str, String str2, int i) {
        BLiveVoiceCall bLiveVoiceCallM102063l;
        String strM199309D0 = ypv.f199493a.m199309D0();
        if (h4tVar.m206027E2() instanceof nnn0) {
            bLiveVoiceCallM102063l = ((nnn0) h4tVar.m206027E2()).m160249P2().m102063l(str2);
        } else {
            gdv.m125595a(h4tVar, str, str2, i);
            bLiveVoiceCallM102063l = null;
        }
        if (strM199309D0.equals(str)) {
            return "anchor";
        }
        return (bLiveVoiceCallM102063l == null || !strM199309D0.equals(str2)) ? "audience" : "callUser";
    }

    /* JADX INFO: renamed from: c */
    public static String m103388c(@Nullable BLiveMultiCall bLiveMultiCall) {
        if (ve10.m198128b(bLiveMultiCall)) {
            return "multiCallAnchor";
        }
        if (ve10.m198136j(bLiveMultiCall)) {
            return "multiCallOwner";
        }
        return ve10.m198132f(bLiveMultiCall) ? "multiCallAudience" : "audience";
    }

    /* JADX INFO: renamed from: d */
    public static String m103389d(h4t h4tVar, String str, String str2, int i) {
        if (r610.m177979N(h4tVar)) {
            return m103388c(r610.m177970E(h4tVar, str2));
        }
        if (str2.equals(str)) {
            return "anchor";
        }
        return h4tVar.m129297F3(new y24(i).m212356e(str2)) != null ? "callUser" : "audience";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static String m103390e(h4t h4tVar, String str, String str2, int i) {
        BLiveVoiceCall bLiveVoiceCallM102063l;
        if (h4tVar.m206027E2() instanceof nnn0) {
            bLiveVoiceCallM102063l = ((nnn0) h4tVar.m206027E2()).m160249P2().m102063l(str2);
        } else {
            gdv.m125595a(h4tVar, str, str2, i);
            bLiveVoiceCallM102063l = null;
        }
        if (str2.equals(str)) {
            return "anchor";
        }
        return bLiveVoiceCallM102063l != null ? "callUser" : "audience";
    }
}
