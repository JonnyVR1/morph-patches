package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c5n0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    @NonNull
    public final p5n0 f79404j;

    /* JADX INFO: renamed from: k */
    public final boolean f79405k = ypv.m215672k().m195666K6();

    public c5n0(@NonNull p5n0 p5n0Var) {
        this.f79404j = p5n0Var;
    }

    /* JADX INFO: renamed from: g0 */
    public final List<d1q<?>> m105348g0(d5n0 d5n0Var) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < d5n0Var.m110065b().size(); i++) {
            mqv<y4n0> mqvVar = d5n0Var.m110065b().get(i);
            if (i == 0) {
                hfw.m130790a("FansBoardTAG-FansAdapter-buildModel，data=", mqvVar.f135304a.toString());
                final xon0 xon0Var = new xon0(mqvVar);
                xon0Var.m210437L(this.f79405k && d5n0Var.m110064a().equals(mqvVar.f135304a.f196307a));
                xon0Var.mo109662A(new View.OnClickListener() { // from class: l.a5n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f67714a.m105349h0(xon0Var, view);
                    }
                });
                arrayList.add(xon0Var);
            } else {
                final zon0 zon0Var = new zon0(mqvVar);
                zon0Var.mo109662A(new View.OnClickListener() { // from class: l.b5n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f73682a.m105350i0(zon0Var, view);
                    }
                });
                arrayList.add(zon0Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m105349h0(xon0 xon0Var, View view) {
        this.f79404j.m167511e4(xon0Var.f204136a.f135304a.f196307a);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m105350i0(zon0 zon0Var, View view) {
        this.f79404j.m167511e4(zon0Var.f204136a.f135304a.f196307a);
    }

    /* JADX INFO: renamed from: j0 */
    public void m105351j0() {
        m67371Z(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: k0 */
    public void m105352k0(d5n0 d5n0Var) {
        m67372a0(m105348g0(d5n0Var), true);
    }
}
