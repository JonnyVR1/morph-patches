package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes5.dex */
public class p4r {

    /* JADX INFO: renamed from: a */
    public static boolean f147202a = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: b */
    public static String m167403b(h4t h4tVar) {
        if (h4tVar.m206027E2().mo97490p()) {
            return "anchor";
        }
        return m167404c(h4tVar) ? "audience_voicechat" : "audience";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m167404c(h4t h4tVar) {
        if (!(h4tVar.m206027E2() instanceof nnn0)) {
            return false;
        }
        nnn0 nnn0Var = (nnn0) h4tVar.m206027E2();
        final String strM199309D0 = ypv.f199493a.m199309D0();
        BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) vwb.m200346r(nnn0Var.m160249P2().m102067p(), new w9j() { // from class: l.o4r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(strM199309D0.equals(((BLiveVoiceCall) obj).user));
            }
        });
        if (bLiveVoiceCall != null) {
            return alk0.m97309h(bLiveVoiceCall);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m167405d(int i, int i2, String str, h4t h4tVar) {
        zvf0.m220399u("e_audio_requset_song", "p_audio_karaoke", vwb.m200311Y("karaoke_tab_id", Integer.valueOf(i)), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2 + 1)), vwb.m200311Y("song_name", str), vwb.m200311Y("user_type", m167403b(h4tVar)));
    }

    /* JADX INFO: renamed from: e */
    public static void m167406e(int i, int i2, String str, h4t h4tVar) {
        if (f147202a) {
            zvf0.m220368A("e_audio_requset_song", "p_audio_karaoke", vwb.m200311Y("karaoke_tab_id", Integer.valueOf(i)), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2 + 1)), vwb.m200311Y("song_name", str), vwb.m200311Y("user_type", m167403b(h4tVar)));
        }
    }
}
