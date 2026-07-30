package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class c6g extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    @NonNull
    public final nhg f79956j;

    /* JADX INFO: renamed from: k */
    public final boolean f79957k = zrv.m221193k().m203453K6();

    public c6g(@NonNull nhg nhgVar) {
        this.f79956j = nhgVar;
    }

    /* JADX INFO: renamed from: g0 */
    public final List<d3q<?>> m108130g0(dhg dhgVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dhgVar.m115797b().size(); i++) {
            nsv<w5g> nsvVar = dhgVar.m115797b().get(i);
            if (i == 0) {
                fhw.m125605a("FansBoardTAG-FansAdapter-buildModel，data=", nsvVar.f143542a.toString());
                final fes fesVar = new fes(nsvVar);
                fesVar.m125329L(this.f79957k && dhgVar.m115796a().equals(nsvVar.f143542a.f187506a));
                fesVar.mo113881A(new View.OnClickListener() { // from class: l.a6g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f68726a.m108131h0(fesVar, view);
                    }
                });
                arrayList.add(fesVar);
            } else {
                final hes hesVar = new hes(nsvVar);
                hesVar.mo113881A(new View.OnClickListener() { // from class: l.b6g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f75188a.m108132i0(hesVar, view);
                    }
                });
                arrayList.add(hesVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m108131h0(fes fesVar, View view) {
        this.f79956j.m163091c4(fesVar.f109184a.f143542a.f187506a);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m108132i0(hes hesVar, View view) {
        this.f79956j.m163091c4(hesVar.f109184a.f143542a.f187506a);
    }

    /* JADX INFO: renamed from: j0 */
    public void m108133j0() {
        m68554Z(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: k0 */
    public void m108134k0(dhg dhgVar) {
        m68555a0(m108130g0(dhgVar), true);
    }
}
