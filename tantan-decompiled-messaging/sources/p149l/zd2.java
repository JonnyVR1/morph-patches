package p149l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class zd2 extends ze2 {

    /* JADX INFO: renamed from: l */
    public VText f202614l;

    /* JADX INFO: renamed from: m */
    public VText f202615m;

    /* JADX INFO: renamed from: n */
    public final String f202616n;

    public zd2(Act act) {
        super(act);
        this.f202616n = "p_bar_activity_popup";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m218126J(View view) {
        dismiss();
        zvf0.m220396r("e_bar_activity_enter", "p_bar_activity_popup");
        qd2.m173940b(this.f202766j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m218127K(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: I */
    public View m218128I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ae2.m96018b(this, layoutInflater, viewGroup);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m218128I(getLayoutInflater(), null));
        setCanceledOnTouchOutside(false);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_bar_activity_popup", zd2.class.getName());
        Window window = getWindow();
        if (NullChecker.m81303a(window)) {
            window.setBackgroundDrawableResource(x2c0.f189718S0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = t100.m186889c().widthPixels - t100.f167231F;
            attributes.width = i;
            attributes.height = (i * 1458) / 933;
            window.setAttributes(attributes);
        }
        xdl0.m208329E0(this.f202614l, new View.OnClickListener() { // from class: l.wd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185753a.m218126J(view);
            }
        });
        xdl0.m208329E0(this.f202615m, new View.OnClickListener() { // from class: l.xd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192291a.m218127K(view);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yd2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
    }
}
