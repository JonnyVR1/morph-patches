package p003l;

import android.content.DialogInterface;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import l.mqi0;
import l.zch0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dwf {
    /* JADX INFO: renamed from: b */
    public static boolean m6217b() {
        ((Integer) CoreModule.c.m0.i1.get()).intValue();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m6218c(Act act) {
        CoreModule.c.m0.i1.put(Integer.valueOf(((Integer) CoreModule.c.m0.i1.get()).intValue() + 1));
        if (((Long) CoreModule.c.m0.j1.get()).longValue() == 0) {
            CoreModule.c.m0.j1.put(Long.valueOf(mqi0.o()));
        }
        gxf gxfVar = new gxf(act);
        gxfVar.m6854C(CoreModule.c.e0.Z7(), false, "p_suggest_users_home_view");
        gxfVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cwf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zch0.a().j(false, "FakeAndGoodExperience");
            }
        });
        zch0.a().j(true, "FakeAndGoodExperience");
        gxfVar.show();
    }
}
