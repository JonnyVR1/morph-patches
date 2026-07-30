package p149l;

import android.view.Window;
import android.view.WindowManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;

/* JADX INFO: loaded from: classes9.dex */
public class f2f0 {

    /* JADX INFO: renamed from: a */
    public Dialog f94178a;

    public f2f0(Act act) {
        m119182a(act);
    }

    /* JADX INFO: renamed from: a */
    public void m119182a(Act act) {
        this.f94178a = act.dialog().m20517M(m6c0.f131561a).m20501D0(Dialog.Theme.DARK).m20567z();
    }

    /* JADX INFO: renamed from: b */
    public void m119183b() {
        this.f94178a.show();
        Window window = this.f94178a.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(17);
        attributes.width = t100.m186890d(262.0f);
        window.setBackgroundDrawableResource(d3c0.f83841a);
        window.setAttributes(attributes);
    }
}
