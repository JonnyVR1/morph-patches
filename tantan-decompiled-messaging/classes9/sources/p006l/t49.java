package p006l;

import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.LoveBuzzData;
import com.tantanapp.common.utils.NullChecker;
import l.j8w;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class t49 implements ABManager.InterfaceC0104d {
    /* JADX INFO: renamed from: c */
    public static boolean m24448c() {
        LoveBuzzData loveBuzzDataV0 = j8w.Companion.a().v0();
        if (NullChecker.a(loveBuzzDataV0) && NullChecker.a(loveBuzzDataV0.enabledBuzz)) {
            return loveBuzzDataV0.enabledBuzz.contains("voiceBuzz") || loveBuzzDataV0.enabledBuzz.contains("videoBuzz") || loveBuzzDataV0.enabledBuzz.contains("memojiBuzz");
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m24449d() {
        return !IntlCountryCodeController.m10k();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m24450e() {
        return j8w.Companion.a().t0();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m24451f() {
        LoveBuzzData loveBuzzDataV0 = j8w.Companion.a().v0();
        if (NullChecker.a(loveBuzzDataV0) && NullChecker.a(loveBuzzDataV0.enabledBuzz)) {
            return loveBuzzDataV0.enabledBuzz.contains("videoBuzz") || loveBuzzDataV0.enabledBuzz.contains("memojiBuzz");
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m24452g() {
        LoveBuzzData loveBuzzDataV0 = j8w.Companion.a().v0();
        if (NullChecker.a(loveBuzzDataV0) && NullChecker.a(loveBuzzDataV0.enabledBuzz)) {
            return loveBuzzDataV0.enabledBuzz.contains("voiceBuzz");
        }
        return false;
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: a */
    public void mo1299a() {
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: b */
    public void mo1300b() {
    }
}
