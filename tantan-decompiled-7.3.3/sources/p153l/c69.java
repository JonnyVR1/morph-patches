package p153l;

import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class c69 implements ABManager.InterfaceC4829d {
    /* JADX INFO: renamed from: c */
    public static boolean m108117c() {
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        if (NullChecker.m82486a(loveBuzzDataM134315v0) && NullChecker.m82486a(loveBuzzDataM134315v0.enabledBuzz)) {
            return loveBuzzDataM134315v0.enabledBuzz.contains("voiceBuzz") || loveBuzzDataM134315v0.enabledBuzz.contains("videoBuzz") || loveBuzzDataM134315v0.enabledBuzz.contains("memojiBuzz");
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m108118d() {
        return !IntlCountryCodeController.m29114k();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m108119e() {
        return haw.INSTANCE.m134320a().m134313t0();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m108120f() {
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        if (NullChecker.m82486a(loveBuzzDataM134315v0) && NullChecker.m82486a(loveBuzzDataM134315v0.enabledBuzz)) {
            return loveBuzzDataM134315v0.enabledBuzz.contains("videoBuzz") || loveBuzzDataM134315v0.enabledBuzz.contains("memojiBuzz");
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m108121g() {
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        if (NullChecker.m82486a(loveBuzzDataM134315v0) && NullChecker.m82486a(loveBuzzDataM134315v0.enabledBuzz)) {
            return loveBuzzDataM134315v0.enabledBuzz.contains("voiceBuzz");
        }
        return false;
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
