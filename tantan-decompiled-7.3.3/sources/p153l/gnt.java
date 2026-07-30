package p153l;

import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;

/* JADX INFO: loaded from: classes9.dex */
public final class gnt {
    /* JADX INFO: renamed from: a */
    public static kfd0 m130981a(BLiveAbsData bLiveAbsData, int i, String str) {
        return kfd0.m149385x().m149414w(str).m149393b(bLiveAbsData).m149403l(i).m149415x(bLiveAbsData).m149392a();
    }

    /* JADX INFO: renamed from: b */
    public static void m130982b() {
        i4g0.m138523u("e_live_search_clear_all_pop", "p_live_search", jyb.m147494Y("click_button", "0"));
    }

    /* JADX INFO: renamed from: c */
    public static void m130983c() {
        i4g0.m138526x("e_live_search_clear_all_pop", "p_live_search");
    }

    /* JADX INFO: renamed from: d */
    public static void m130984d() {
        i4g0.m138523u("e_live_search_clear_all_pop", "p_live_search", jyb.m147494Y("click_button", "1"));
    }

    /* JADX INFO: renamed from: e */
    public static void m130985e(String str, boolean z) {
        if (z) {
            i4g0.m138492A("e_live_profile_card_enter", "p_live_search", jyb.m147494Y("anchor_id", str));
        } else {
            i4g0.m138523u("e_live_profile_card_enter", "p_live_search", jyb.m147494Y("anchor_id", str));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m130986f(String str) {
        i4g0.m138520r("e_anchor_search", str);
    }

    /* JADX INFO: renamed from: g */
    public static void m130987g(String str) {
        i4g0.m138526x("e_anchor_search", str);
    }

    /* JADX INFO: renamed from: h */
    public static void m130988h(String str, BLiveAbsData bLiveAbsData, int i) {
        m130989i(str, bLiveAbsData, i, OMSTemplateModeType.page);
    }

    /* JADX INFO: renamed from: i */
    public static void m130989i(String str, BLiveAbsData bLiveAbsData, int i, String str2) {
        if (bLiveAbsData.isVoiceLive()) {
            i4g0.m138523u("e_live_audio_room_enter", str, new pf60("anchorId", bLiveAbsData.anchor.f45267id), new pf60("liveId", bLiveAbsData.f45171id));
        } else {
            bfu.m104071c(m130981a(bLiveAbsData, i, str2), str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m130990j(String str, BLiveAbsData bLiveAbsData, int i) {
        m130991k(str, bLiveAbsData, i, OMSTemplateModeType.page);
    }

    /* JADX INFO: renamed from: k */
    public static void m130991k(String str, BLiveAbsData bLiveAbsData, int i, String str2) {
        if (bLiveAbsData.isVoiceLive()) {
            i4g0.m138492A("e_live_audio_room_enter", str, new pf60("anchorId", bLiveAbsData.anchor.f45267id), new pf60("liveId", bLiveAbsData.f45171id));
        } else {
            bfu.m104075g(m130981a(bLiveAbsData, i, str2), str);
        }
    }
}
