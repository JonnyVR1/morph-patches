package p149l;

import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class t49 implements ABManager.InterfaceC4678d {
    /* JADX INFO: renamed from: c */
    public static boolean m187149c() {
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        if (NullChecker.m81303a(loveBuzzDataM140468v0) && NullChecker.m81303a(loveBuzzDataM140468v0.enabledBuzz)) {
            return loveBuzzDataM140468v0.enabledBuzz.contains("voiceBuzz") || loveBuzzDataM140468v0.enabledBuzz.contains("videoBuzz") || loveBuzzDataM140468v0.enabledBuzz.contains("memojiBuzz");
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m187150d() {
        return !IntlCountryCodeController.m28115k();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m187151e() {
        return j8w.INSTANCE.m140473a().m140466t0();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m187152f() {
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        if (NullChecker.m81303a(loveBuzzDataM140468v0) && NullChecker.m81303a(loveBuzzDataM140468v0.enabledBuzz)) {
            return loveBuzzDataM140468v0.enabledBuzz.contains("videoBuzz") || loveBuzzDataM140468v0.enabledBuzz.contains("memojiBuzz");
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m187153g() {
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        if (NullChecker.m81303a(loveBuzzDataM140468v0) && NullChecker.m81303a(loveBuzzDataM140468v0.enabledBuzz)) {
            return loveBuzzDataM140468v0.enabledBuzz.contains("voiceBuzz");
        }
        return false;
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
