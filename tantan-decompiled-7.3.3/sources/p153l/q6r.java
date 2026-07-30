package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes5.dex */
public class q6r {

    /* JADX INFO: renamed from: a */
    public static boolean f155835a = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: b */
    public static String m175602b(i6t i6tVar) {
        if (i6tVar.m213810E2().mo118373p()) {
            return "anchor";
        }
        return m175603c(i6tVar) ? "audience_voicechat" : "audience";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m175603c(i6t i6tVar) {
        if (!(i6tVar.m213810E2() instanceof rwn0)) {
            return false;
        }
        rwn0 rwn0Var = (rwn0) i6tVar.m213810E2();
        final String strM207631D0 = zrv.f205799a.m207631D0();
        BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) jyb.m147529r(rwn0Var.m183411P2().m136877p(), new qcj() { // from class: l.p6r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(strM207631D0.equals(((BLiveVoiceCall) obj).user));
            }
        });
        if (bLiveVoiceCall != null) {
            return guk0.m132329h(bLiveVoiceCall);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m175604d(int i, int i2, String str, i6t i6tVar) {
        i4g0.m138523u("e_audio_requset_song", "p_audio_karaoke", jyb.m147494Y("karaoke_tab_id", Integer.valueOf(i)), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2 + 1)), jyb.m147494Y("song_name", str), jyb.m147494Y("user_type", m175602b(i6tVar)));
    }

    /* JADX INFO: renamed from: e */
    public static void m175605e(int i, int i2, String str, i6t i6tVar) {
        if (f155835a) {
            i4g0.m138492A("e_audio_requset_song", "p_audio_karaoke", jyb.m147494Y("karaoke_tab_id", Integer.valueOf(i)), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2 + 1)), jyb.m147494Y("song_name", str), jyb.m147494Y("user_type", m175602b(i6tVar)));
        }
    }
}
