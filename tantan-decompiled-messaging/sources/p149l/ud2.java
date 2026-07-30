package p149l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BarLoverplaces;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class ud2 extends ze2 {

    /* JADX INFO: renamed from: l */
    public VDraweeView f175884l;

    /* JADX INFO: renamed from: m */
    public VText f175885m;

    /* JADX INFO: renamed from: n */
    public VText f175886n;

    /* JADX INFO: renamed from: o */
    public VText f175887o;

    /* JADX INFO: renamed from: p */
    public VText f175888p;

    /* JADX INFO: renamed from: q */
    public final String f175889q;

    /* JADX INFO: renamed from: r */
    public final BarLoverplaces f175890r;

    /* JADX INFO: renamed from: s */
    public final Act f175891s;

    public ud2(Act act, BarLoverplaces barLoverplaces) {
        super(act);
        this.f175889q = "p_near_bar_location_popup";
        this.f175890r = barLoverplaces;
        this.f175891s = act;
    }

    /* JADX INFO: renamed from: I */
    public View m193122I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vd2.m197917b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m193123J(View view) {
        CoreModule.f17545c.f19639e0.f149306X4.put(0);
        dismiss();
        zvf0.m220396r("e_bar_location_popup_enter", "p_near_bar_location_popup");
        qd2.m173940b(this.f175891s);
        qd2.m173939a(this.f175891s, this.f175890r.f20354id, "homepage_popup");
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m193124K(View view) {
        dismiss();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m193122I(getLayoutInflater(), null));
        setCanceledOnTouchOutside(false);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_near_bar_location_popup", ud2.class.getName());
        Window window = getWindow();
        if (NullChecker.m81303a(window)) {
            window.setBackgroundDrawableResource(x2c0.f189390Hd);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = t100.m186889c().widthPixels - t100.f167231F;
            window.setAttributes(attributes);
        }
        this.f175885m.getPaint().setFakeBoldText(true);
        this.f175887o.getPaint().setFakeBoldText(true);
        this.f175888p.getPaint().setFakeBoldText(true);
        xdl0.m208329E0(this.f175887o, new View.OnClickListener() { // from class: l.rd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158856a.m193123J(view);
            }
        });
        xdl0.m208329E0(this.f175888p, new View.OnClickListener() { // from class: l.sd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163799a.m193124K(view);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.td2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
    }
}
