package p006l;

import android.view.Window;
import android.view.WindowManager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import l.d3c0;
import l.m6c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class f2f0 {

    /* JADX INFO: renamed from: a */
    public Dialog f11573a;

    public f2f0(Act act) {
        m15007a(act);
    }

    /* JADX INFO: renamed from: a */
    public void m15007a(Act act) {
        this.f11573a = act.dialog().M(m6c0.a).D0(Dialog.Theme.DARK).z();
    }

    /* JADX INFO: renamed from: b */
    public void m15008b() {
        this.f11573a.show();
        Window window = this.f11573a.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(17);
        attributes.width = t100.d(262.0f);
        window.setBackgroundDrawableResource(d3c0.a);
        window.setAttributes(attributes);
    }
}
