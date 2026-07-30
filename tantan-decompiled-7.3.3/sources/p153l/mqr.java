package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes9.dex */
public class mqr implements ABManager.InterfaceC4829d {
    /* JADX INFO: renamed from: c */
    public static boolean m159583c() {
        if (mbs.m157865m().mo192252i()) {
            return false;
        }
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia) || m159596p() || IntlCountryCodeController.m29122s() || mbs.m157865m().mo192248e();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m159584d() {
        return tbs.f172989b.m203613e7();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m159585e() {
        return vxr.m203879g().m203581a7();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m159586f() {
        if (mbs.m157865m().mo192252i()) {
            return false;
        }
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.philippines) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.japan) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.thailand) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.korea) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.taiwan) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m159587g() {
        if (mbs.m157865m().mo192252i()) {
            return false;
        }
        return IntlCountryCodeController.m29122s() || m159589i();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m159588h() {
        if (mbs.m157865m().mo192252i()) {
            return false;
        }
        return IntlCountryCodeController.m29122s() || mbs.m157865m().mo192248e() || m159587g() || TEnum.equals(uqb0.f180402h0, "vietnam");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m159589i() {
        if (mbs.m157865m().mo192252i()) {
            return false;
        }
        return mbs.m157865m().mo192248e() || TEnum.equals(uqb0.f180402h0, LiveRegionTag.japan) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.thailand) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.korea) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.taiwan) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m159590j() {
        return (!LiveAssertApi.isCanStartLive() || !m159587g() || IntlCountryCodeController.m29122s() || kl40.m150349g() || kl40.m150350h()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m159591k() {
        return (!LiveAssertApi.isCanStartLive() || !m159587g() || IntlCountryCodeController.m29122s() || kl40.m150349g() || kl40.m150350h()) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m159592l() {
        return m159588h();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m159593m() {
        return TextUtils.equals("_exp", ABManager.m30348i0("LiveAudio_room_cover"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m159594n() {
        return vxr.m203879g().m203685n7();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m159595o() {
        return m159583c() || vxr.m203879g().m203685n7();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m159596p() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.taiwan);
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public void mo30391a() {
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public void mo30392b() {
    }
}
