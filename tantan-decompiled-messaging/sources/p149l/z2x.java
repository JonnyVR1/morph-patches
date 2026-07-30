package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Explore;
import com.p046p1.mobile.putong.core.p053ui.marry.audit.MarryInfoAuditStatusAct;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z2x {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m216998a(Act act, dd80 dd80Var, View view) {
        zvf0.m220396r("e_guide_mode_switching", "p_marriage_guide_pop");
        Intent intentM47401Z1 = MarryInfoAuditStatusAct.m47401Z1(act, Explore.TYPE);
        MarryInfoAuditStatusAct.m47402c2(intentM47401Z1);
        act.startActivity(intentM47401Z1);
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m216999b(dd80 dd80Var, View view) {
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m217001d(final Act act, String str) {
        View viewInflate = act.getLayoutInflater().inflate(f6c0.f95998sa, (ViewGroup) null);
        if (!TextUtils.isEmpty(str)) {
            ((VText) viewInflate.findViewById(u4c0.f174116Xc)).setText(str);
        }
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110961P(true).m110960O();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_marriage_guide_pop", s4e.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        xdl0.m208329E0(viewInflate.findViewById(u4c0.f174151a), new View.OnClickListener() { // from class: l.w2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z2x.m216998a(act, dd80VarM110960O, view);
            }
        });
        xdl0.m208329E0(viewInflate.findViewById(u4c0.f173989Q0), new View.OnClickListener() { // from class: l.x2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z2x.m216999b(dd80VarM110960O, view);
            }
        });
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.y2x
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        CoreModule.f17545c.f19639e0.f149193I4.put(Boolean.TRUE);
        dd80VarM110960O.show();
    }
}
