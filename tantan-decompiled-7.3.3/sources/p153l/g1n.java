package p153l;

import android.content.DialogInterface;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.member.R$string;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class g1n {
    /* JADX INFO: renamed from: b */
    public static void m128514b(Act act, x20 x20Var) {
        jl80.C17971a c17971aM146024S = act.newDialog().m146056y0(act.string(R$string.f21384f)).m146051t0(act.string(R$string.f21381e)).m146024S(gbc0.f103388q6);
        int i = R$string.f21319E1;
        Objects.requireNonNull(x20Var);
        jl80 jl80VarM146020O = c17971aM146024S.m146032a0(i, new bri0(x20Var)).m146027V(R$string.f21356T0, new Object[0]).m146020O();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_boost_confirm_use", jl80VarM146020O.getClass().getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", "passive"));
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f1n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        jl80VarM146020O.show();
    }
}
