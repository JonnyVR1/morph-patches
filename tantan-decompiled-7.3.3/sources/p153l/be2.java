package p153l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BarLoverplaces;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class be2 extends gf2 {

    /* JADX INFO: renamed from: l */
    public VDraweeView f76325l;

    /* JADX INFO: renamed from: m */
    public VText f76326m;

    /* JADX INFO: renamed from: n */
    public VText f76327n;

    /* JADX INFO: renamed from: o */
    public VText f76328o;

    /* JADX INFO: renamed from: p */
    public VText f76329p;

    /* JADX INFO: renamed from: q */
    public final String f76330q;

    /* JADX INFO: renamed from: r */
    public final BarLoverplaces f76331r;

    /* JADX INFO: renamed from: s */
    public final Act f76332s;

    public be2(Act act, BarLoverplaces barLoverplaces) {
        super(act);
        this.f76330q = "p_near_bar_location_popup";
        this.f76331r = barLoverplaces;
        this.f76332s = act;
    }

    /* JADX INFO: renamed from: I */
    public View m103683I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ce2.m109342b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m103684J(View view) {
        CoreModule.f18264c.f20381e0.f89163X4.put(0);
        dismiss();
        i4g0.m138520r("e_bar_location_popup_enter", "p_near_bar_location_popup");
        xd2.m210443b(this.f76332s);
        xd2.m210442a(this.f76332s, this.f76331r.f21096id, "homepage_popup");
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m103685K(View view) {
        dismiss();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m103683I(getLayoutInflater(), null));
        setCanceledOnTouchOutside(false);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_near_bar_location_popup", be2.class.getName());
        Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            window.setBackgroundDrawableResource(dbc0.f86246Id);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = qa00.m175858c().widthPixels - qa00.f156293F;
            window.setAttributes(attributes);
        }
        this.f76326m.getPaint().setFakeBoldText(true);
        this.f76328o.getPaint().setFakeBoldText(true);
        this.f76329p.getPaint().setFakeBoldText(true);
        bnl0.m105509E0(this.f76328o, new View.OnClickListener() { // from class: l.yd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198568a.m103684J(view);
            }
        });
        bnl0.m105509E0(this.f76329p, new View.OnClickListener() { // from class: l.zd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203851a.m103685K(view);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ae2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
    }
}
