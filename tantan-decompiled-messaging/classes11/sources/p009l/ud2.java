package p009l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.BarLoverplaces;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.qd2;
import l.t100;
import l.vd2;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ud2 extends ze2 {

    /* JADX INFO: renamed from: l */
    public VDraweeView f21074l;

    /* JADX INFO: renamed from: m */
    public VText f21075m;

    /* JADX INFO: renamed from: n */
    public VText f21076n;

    /* JADX INFO: renamed from: o */
    public VText f21077o;

    /* JADX INFO: renamed from: p */
    public VText f21078p;

    /* JADX INFO: renamed from: q */
    public final String f21079q;

    /* JADX INFO: renamed from: r */
    public final BarLoverplaces f21080r;

    /* JADX INFO: renamed from: s */
    public final Act f21081s;

    public ud2(Act act, BarLoverplaces barLoverplaces) {
        super(act);
        this.f21079q = "p_near_bar_location_popup";
        this.f21080r = barLoverplaces;
        this.f21081s = act;
    }

    /* JADX INFO: renamed from: I */
    public View m22800I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vd2.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m22801J(View view) {
        CoreModule.c.e0.X4.put(0);
        dismiss();
        zvf0.r("e_bar_location_popup_enter", "p_near_bar_location_popup");
        qd2.b(this.f21081s);
        qd2.a(this.f21081s, this.f21080r.id, "homepage_popup");
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m22802K(View view) {
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        setContentView(m22800I(getLayoutInflater(), null));
        setCanceledOnTouchOutside(false);
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_near_bar_location_popup", ud2.class.getName());
        Window window = getWindow();
        if (NullChecker.a(window)) {
            window.setBackgroundDrawableResource(x2c0.Hd);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = t100.c().widthPixels - t100.F;
            window.setAttributes(attributes);
        }
        this.f21075m.getPaint().setFakeBoldText(true);
        this.f21077o.getPaint().setFakeBoldText(true);
        this.f21078p.getPaint().setFakeBoldText(true);
        xdl0.E0(this.f21077o, new View.OnClickListener() { // from class: l.rd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19741a.m22801J(view);
            }
        });
        xdl0.E0(this.f21078p, new View.OnClickListener() { // from class: l.sd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20175a.m22802K(view);
            }
        });
        i0e.m16065f(cwf0VarM16062c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.td2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        });
    }
}
