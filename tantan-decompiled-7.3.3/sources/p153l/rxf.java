package p153l;

import android.content.DialogInterface;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes3.dex */
public class rxf {
    /* JADX INFO: renamed from: b */
    public static boolean m183540b() {
        CoreModule.f18264c.f20405m0.f20161i1.get().intValue();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m183541c(Act act) {
        CoreModule.f18264c.f20405m0.f20161i1.put(Integer.valueOf(CoreModule.f18264c.f20405m0.f20161i1.get().intValue() + 1));
        if (CoreModule.f18264c.f20405m0.f20164j1.get().longValue() == 0) {
            CoreModule.f18264c.f20405m0.f20164j1.put(Long.valueOf(pzi0.m174454o()));
        }
        uyf uyfVar = new uyf(act);
        uyfVar.m198611C(CoreModule.f18264c.f20381e0.m116537Z7(), false, "p_suggest_users_home_view");
        uyfVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qxf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hlh0.m135741a().m135750j(false, "FakeAndGoodExperience");
            }
        });
        hlh0.m135741a().m135750j(true, "FakeAndGoodExperience");
        uyfVar.show();
    }
}
