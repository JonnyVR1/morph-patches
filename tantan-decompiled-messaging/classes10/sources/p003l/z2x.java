package p003l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.Explore;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.marry.audit.MarryInfoAuditStatusAct;
import l.cwf0;
import l.dd80;
import l.f6c0;
import l.i0e;
import l.u4c0;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z2x {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11324a(Act act, dd80 dd80Var, View view) {
        zvf0.r("e_guide_mode_switching", "p_marriage_guide_pop");
        Intent intentZ1 = MarryInfoAuditStatusAct.Z1(act, Explore.TYPE);
        MarryInfoAuditStatusAct.c2(intentZ1);
        act.startActivity(intentZ1);
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11325b(dd80 dd80Var, View view) {
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m11327d(final Act act, String str) {
        View viewInflate = act.getLayoutInflater().inflate(f6c0.sa, (ViewGroup) null);
        if (!TextUtils.isEmpty(str)) {
            viewInflate.findViewById(u4c0.Xc).setText(str);
        }
        final dd80 dd80VarO = new dd80.a(act).R(viewInflate).P(true).O();
        final cwf0 cwf0VarC = i0e.c("p_marriage_guide_pop", s4e.class.getName());
        i0e.f(cwf0VarC);
        xdl0.E0(viewInflate.findViewById(u4c0.a), new View.OnClickListener() { // from class: l.w2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z2x.m11324a(act, dd80VarO, view);
            }
        });
        xdl0.E0(viewInflate.findViewById(u4c0.Q0), new View.OnClickListener() { // from class: l.x2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z2x.m11325b(dd80VarO, view);
            }
        });
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.y2x
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        CoreModule.c.e0.I4.put(Boolean.TRUE);
        dd80VarO.show();
    }
}
