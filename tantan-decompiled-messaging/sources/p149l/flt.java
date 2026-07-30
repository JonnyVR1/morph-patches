package p149l;

import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;

/* JADX INFO: loaded from: classes13.dex */
public final class flt {
    /* JADX INFO: renamed from: a */
    public static h7d0 m122090a(BLiveAbsData bLiveAbsData, int i, String str) {
        return h7d0.m129655x().m129684w(str).m129663b(bLiveAbsData).m129673l(i).m129685x(bLiveAbsData).m129662a();
    }

    /* JADX INFO: renamed from: b */
    public static void m122091b() {
        zvf0.m220399u("e_live_search_clear_all_pop", "p_live_search", vwb.m200311Y("click_button", "0"));
    }

    /* JADX INFO: renamed from: c */
    public static void m122092c() {
        zvf0.m220402x("e_live_search_clear_all_pop", "p_live_search");
    }

    /* JADX INFO: renamed from: d */
    public static void m122093d() {
        zvf0.m220399u("e_live_search_clear_all_pop", "p_live_search", vwb.m200311Y("click_button", "1"));
    }

    /* JADX INFO: renamed from: e */
    public static void m122094e(String str, boolean z) {
        if (z) {
            zvf0.m220368A("e_live_profile_card_enter", "p_live_search", vwb.m200311Y("anchor_id", str));
        } else {
            zvf0.m220399u("e_live_profile_card_enter", "p_live_search", vwb.m200311Y("anchor_id", str));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m122095f(String str) {
        zvf0.m220396r("e_anchor_search", str);
    }

    /* JADX INFO: renamed from: g */
    public static void m122096g(String str) {
        zvf0.m220402x("e_anchor_search", str);
    }

    /* JADX INFO: renamed from: h */
    public static void m122097h(String str, BLiveAbsData bLiveAbsData, int i) {
        m122098i(str, bLiveAbsData, i, OMSTemplateModeType.page);
    }

    /* JADX INFO: renamed from: i */
    public static void m122098i(String str, BLiveAbsData bLiveAbsData, int i, String str2) {
        if (bLiveAbsData.isVoiceLive()) {
            zvf0.m220399u("e_live_audio_room_enter", str, new j760("anchorId", bLiveAbsData.anchor.f44419id), new j760("liveId", bLiveAbsData.f44323id));
        } else {
            adu.m96007c(m122090a(bLiveAbsData, i, str2), str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m122099j(String str, BLiveAbsData bLiveAbsData, int i) {
        m122100k(str, bLiveAbsData, i, OMSTemplateModeType.page);
    }

    /* JADX INFO: renamed from: k */
    public static void m122100k(String str, BLiveAbsData bLiveAbsData, int i, String str2) {
        if (bLiveAbsData.isVoiceLive()) {
            zvf0.m220368A("e_live_audio_room_enter", str, new j760("anchorId", bLiveAbsData.anchor.f44419id), new j760("liveId", bLiveAbsData.f44323id));
        } else {
            adu.m96011g(m122090a(bLiveAbsData, i, str2), str);
        }
    }
}
