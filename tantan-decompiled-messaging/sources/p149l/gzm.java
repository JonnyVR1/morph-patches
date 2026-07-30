package p149l;

import android.content.DialogInterface;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.member.R$string;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class gzm {
    /* JADX INFO: renamed from: b */
    public static void m128875b(Act act, d30 d30Var) {
        dd80.C16336a c16336aM110964S = act.newDialog().m110996y0(act.string(R$string.f20642f)).m110991t0(act.string(R$string.f20639e)).m110964S(b3c0.f73137q6);
        int i = R$string.f20577E1;
        Objects.requireNonNull(d30Var);
        dd80 dd80VarM110960O = c16336aM110964S.m110972a0(i, new bii0(d30Var)).m110967V(R$string.f20614T0, new Object[0]).m110960O();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_boost_confirm_use", dd80VarM110960O.getClass().getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", "passive"));
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fzm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        dd80VarM110960O.show();
    }
}
