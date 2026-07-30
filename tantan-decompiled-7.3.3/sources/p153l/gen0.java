package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class gen0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ten0 f103845j;

    /* JADX INFO: renamed from: k */
    public final boolean f103846k = zrv.m221193k().m203453K6();

    public gen0(@NonNull ten0 ten0Var) {
        this.f103845j = ten0Var;
    }

    /* JADX INFO: renamed from: g0 */
    public final List<d3q<?>> m130023g0(hen0 hen0Var) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < hen0Var.m134668b().size(); i++) {
            nsv<cen0> nsvVar = hen0Var.m134668b().get(i);
            if (i == 0) {
                fhw.m125605a("FansBoardTAG-FansAdapter-buildModel，data=", nsvVar.f143542a.toString());
                final byn0 byn0Var = new byn0(nsvVar);
                byn0Var.m107029L(this.f103846k && hen0Var.m134667a().equals(nsvVar.f143542a.f81391a));
                byn0Var.mo113881A(new View.OnClickListener() { // from class: l.een0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f93653a.m130024h0(byn0Var, view);
                    }
                });
                arrayList.add(byn0Var);
            } else {
                final dyn0 dyn0Var = new dyn0(nsvVar);
                dyn0Var.mo113881A(new View.OnClickListener() { // from class: l.fen0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f98694a.m130025i0(dyn0Var, view);
                    }
                });
                arrayList.add(dyn0Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m130024h0(byn0 byn0Var, View view) {
        this.f103845j.m190864e4(byn0Var.f91265a.f143542a.f81391a);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m130025i0(dyn0 dyn0Var, View view) {
        this.f103845j.m190864e4(dyn0Var.f91265a.f143542a.f81391a);
    }

    /* JADX INFO: renamed from: j0 */
    public void m130026j0() {
        m68554Z(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: k0 */
    public void m130027k0(hen0 hen0Var) {
        m68555a0(m130023g0(hen0Var), true);
    }
}
