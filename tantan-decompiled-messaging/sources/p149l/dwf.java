package p149l;

import android.content.DialogInterface;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes10.dex */
public class dwf {
    /* JADX INFO: renamed from: b */
    public static boolean m113867b() {
        CoreModule.f17545c.f19663m0.f19419i1.get().intValue();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m113868c(Act act) {
        CoreModule.f17545c.f19663m0.f19419i1.put(Integer.valueOf(CoreModule.f17545c.f19663m0.f19419i1.get().intValue() + 1));
        if (CoreModule.f17545c.f19663m0.f19422j1.get().longValue() == 0) {
            CoreModule.f17545c.f19663m0.f19422j1.put(Long.valueOf(mqi0.m155944o()));
        }
        gxf gxfVar = new gxf(act);
        gxfVar.m128575C(CoreModule.f17545c.f19639e0.m169464Z7(), false, "p_suggest_users_home_view");
        gxfVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cwf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zch0.m218024a().m218033j(false, "FakeAndGoodExperience");
            }
        });
        zch0.m218024a().m218033j(true, "FakeAndGoodExperience");
        gxfVar.show();
    }
}
