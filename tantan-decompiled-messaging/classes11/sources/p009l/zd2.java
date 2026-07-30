package p009l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.ae2;
import l.cwf0;
import l.qd2;
import l.t100;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zd2 extends ze2 {

    /* JADX INFO: renamed from: l */
    public VText f23580l;

    /* JADX INFO: renamed from: m */
    public VText f23581m;

    /* JADX INFO: renamed from: n */
    public final String f23582n;

    public zd2(Act act) {
        super(act);
        this.f23582n = "p_bar_activity_popup";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m25700J(View view) {
        dismiss();
        zvf0.r("e_bar_activity_enter", "p_bar_activity_popup");
        qd2.b(this.f23621j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m25701K(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: I */
    public View m25702I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ae2.b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        setContentView(m25702I(getLayoutInflater(), null));
        setCanceledOnTouchOutside(false);
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_bar_activity_popup", zd2.class.getName());
        Window window = getWindow();
        if (NullChecker.a(window)) {
            window.setBackgroundDrawableResource(x2c0.S0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = t100.c().widthPixels - t100.F;
            attributes.width = i;
            attributes.height = (i * 1458) / 933;
            window.setAttributes(attributes);
        }
        xdl0.E0(this.f23580l, new View.OnClickListener() { // from class: l.wd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22016a.m25700J(view);
            }
        });
        xdl0.E0(this.f23581m, new View.OnClickListener() { // from class: l.xd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22514a.m25701K(view);
            }
        });
        i0e.m16065f(cwf0VarM16062c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yd2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        });
    }
}
