package p149l;

import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class q850 implements ABManager.InterfaceC4678d {
    /* JADX INFO: renamed from: c */
    public static boolean m173340c() {
        try {
            return Long.parseLong(CoreModule.m29931H().userId()) % 17 != 0;
        } catch (NumberFormatException e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public final void mo29393a() {
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public final void mo29394b() {
    }
}
