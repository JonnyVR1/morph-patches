package p153l;

import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class xg50 implements ABManager.InterfaceC4829d {
    /* JADX INFO: renamed from: c */
    public static boolean m210877c() {
        try {
            return Long.parseLong(CoreModule.m30929H().userId()) % 17 != 0;
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public final void mo30391a() {
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public final void mo30392b() {
    }
}
