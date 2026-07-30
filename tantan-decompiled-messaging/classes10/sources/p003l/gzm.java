package p003l;

import android.content.DialogInterface;
import com.p000p1.mobile.putong.core.member.R$string;
import com.p1.mobile.android.app.Act;
import java.util.Objects;
import l.bii0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.i0e;
import l.j760;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gzm {
    /* JADX INFO: renamed from: b */
    public static void m6902b(Act act, d30 d30Var) {
        dd80.a aVarS = act.newDialog().y0(act.string(R$string.f304f)).t0(act.string(R$string.f301e)).S(b3c0.f3240q6);
        int i = R$string.f239E1;
        Objects.requireNonNull(d30Var);
        dd80 dd80VarO = aVarS.a0(i, new bii0(d30Var)).V(R$string.f276T0, new Object[0]).O();
        final cwf0 cwf0VarC = i0e.c("p_boost_confirm_use", dd80VarO.getClass().getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "passive")});
        i0e.f(cwf0VarC);
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fzm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        dd80VarO.show();
    }
}
