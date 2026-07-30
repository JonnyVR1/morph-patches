package p153l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class ge2 extends gf2 {

    /* JADX INFO: renamed from: l */
    public VText f103762l;

    /* JADX INFO: renamed from: m */
    public VText f103763m;

    /* JADX INFO: renamed from: n */
    public final String f103764n;

    public ge2(Act act) {
        super(act);
        this.f103764n = "p_bar_activity_popup";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m129962J(View view) {
        dismiss();
        i4g0.m138520r("e_bar_activity_enter", "p_bar_activity_popup");
        xd2.m210443b(this.f103872j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m129963K(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: I */
    public View m129964I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return he2.m134619b(this, layoutInflater, viewGroup);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m129964I(getLayoutInflater(), null));
        setCanceledOnTouchOutside(false);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_bar_activity_popup", ge2.class.getName());
        Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            window.setBackgroundDrawableResource(dbc0.f86585T0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = qa00.m175858c().widthPixels - qa00.f156293F;
            attributes.width = i;
            attributes.height = (i * 1458) / 933;
            window.setAttributes(attributes);
        }
        bnl0.m105509E0(this.f103762l, new View.OnClickListener() { // from class: l.de2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87983a.m129962J(view);
            }
        });
        bnl0.m105509E0(this.f103763m, new View.OnClickListener() { // from class: l.ee2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93613a.m129963K(view);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fe2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
    }
}
