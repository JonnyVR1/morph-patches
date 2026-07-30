package p153l;

import android.view.Window;
import android.view.WindowManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;

/* JADX INFO: loaded from: classes12.dex */
public class maf0 {

    /* JADX INFO: renamed from: a */
    public Dialog f135514a;

    public maf0(Act act) {
        m157641a(act);
    }

    /* JADX INFO: renamed from: a */
    public void m157641a(Act act) {
        this.f135514a = act.dialog().m21516M(rec0.f162521a).m21500D0(Dialog.Theme.DARK).m21566z();
    }

    /* JADX INFO: renamed from: b */
    public void m157642b() {
        this.f135514a.show();
        Window window = this.f135514a.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(17);
        attributes.width = qa00.m175859d(262.0f);
        window.setBackgroundDrawableResource(jbc0.f119496a);
        window.setAttributes(attributes);
    }
}
