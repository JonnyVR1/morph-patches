package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Explore;
import com.p051p1.mobile.putong.core.p058ui.marry.audit.MarryInfoAuditStatusAct;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class y5x {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m214333a(Act act, jl80 jl80Var, View view) {
        i4g0.m138520r("e_guide_mode_switching", "p_marriage_guide_pop");
        Intent intentM48584a2 = MarryInfoAuditStatusAct.m48584a2(act, Explore.TYPE);
        MarryInfoAuditStatusAct.m48585d2(intentM48584a2);
        act.startActivity(intentM48584a2);
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m214334b(jl80 jl80Var, View view) {
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m214336d(final Act act, String str) {
        View viewInflate = act.getLayoutInflater().inflate(kec0.f126171za, (ViewGroup) null);
        if (!TextUtils.isEmpty(str)) {
            ((VText) viewInflate.findViewById(adc0.f70239Zc)).setText(str);
        }
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146021P(true).m146020O();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_marriage_guide_pop", g6e.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        bnl0.m105509E0(viewInflate.findViewById(adc0.f70242a), new View.OnClickListener() { // from class: l.v5x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y5x.m214333a(act, jl80VarM146020O, view);
            }
        });
        bnl0.m105509E0(viewInflate.findViewById(adc0.f70077Q0), new View.OnClickListener() { // from class: l.w5x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y5x.m214334b(jl80VarM146020O, view);
            }
        });
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.x5x
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        CoreModule.f18264c.f20381e0.f89050I4.put(Boolean.TRUE);
        jl80VarM146020O.show();
    }
}
