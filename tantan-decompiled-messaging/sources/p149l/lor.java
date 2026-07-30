package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes13.dex */
public class lor implements ABManager.InterfaceC4678d {
    /* JADX INFO: renamed from: c */
    public static boolean m150798c() {
        if (l9s.m149088m().mo165309i()) {
            return false;
        }
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia) || m150811p() || IntlCountryCodeController.m28123s() || l9s.m149088m().mo165305e();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m150799d() {
        return s9s.f163228b.m195826e7();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m150800e() {
        return uvr.m196090g().m195794a7();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m150801f() {
        if (l9s.m149088m().mo165309i()) {
            return false;
        }
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.philippines) || TEnum.equals(qib0.f154719h0, LiveRegionTag.japan) || TEnum.equals(qib0.f154719h0, LiveRegionTag.thailand) || TEnum.equals(qib0.f154719h0, LiveRegionTag.korea) || TEnum.equals(qib0.f154719h0, LiveRegionTag.taiwan) || TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m150802g() {
        if (l9s.m149088m().mo165309i()) {
            return false;
        }
        return IntlCountryCodeController.m28123s() || m150804i();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m150803h() {
        if (l9s.m149088m().mo165309i()) {
            return false;
        }
        return IntlCountryCodeController.m28123s() || l9s.m149088m().mo165305e() || m150802g() || TEnum.equals(qib0.f154719h0, "vietnam");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m150804i() {
        if (l9s.m149088m().mo165309i()) {
            return false;
        }
        return l9s.m149088m().mo165305e() || TEnum.equals(qib0.f154719h0, LiveRegionTag.japan) || TEnum.equals(qib0.f154719h0, LiveRegionTag.thailand) || TEnum.equals(qib0.f154719h0, LiveRegionTag.korea) || TEnum.equals(qib0.f154719h0, LiveRegionTag.taiwan) || TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m150805j() {
        return (!LiveAssertApi.isCanStartLive() || !m150802g() || IntlCountryCodeController.m28123s() || wc40.m202630g() || wc40.m202631h()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m150806k() {
        return (!LiveAssertApi.isCanStartLive() || !m150802g() || IntlCountryCodeController.m28123s() || wc40.m202630g() || wc40.m202631h()) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m150807l() {
        return m150803h();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m150808m() {
        return TextUtils.equals("_exp", ABManager.m29350i0("LiveAudio_room_cover"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m150809n() {
        return uvr.m196090g().m195898n7();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m150810o() {
        return m150798c() || uvr.m196090g().m195898n7();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m150811p() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.taiwan);
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public void mo29393a() {
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public void mo29394b() {
    }
}
