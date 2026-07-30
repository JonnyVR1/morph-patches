package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class o4g extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    @NonNull
    public final zfg f141773j;

    /* JADX INFO: renamed from: k */
    public final boolean f141774k = ypv.m215672k().m195666K6();

    public o4g(@NonNull zfg zfgVar) {
        this.f141773j = zfgVar;
    }

    /* JADX INFO: renamed from: g0 */
    public final List<d1q<?>> m162569g0(pfg pfgVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < pfgVar.m168639b().size(); i++) {
            mqv<i4g> mqvVar = pfgVar.m168639b().get(i);
            if (i == 0) {
                hfw.m130790a("FansBoardTAG-FansAdapter-buildModel，data=", mqvVar.f135304a.toString());
                final ecs ecsVar = new ecs(mqvVar);
                ecsVar.m115751L(this.f141774k && pfgVar.m168638a().equals(mqvVar.f135304a.f111441a));
                ecsVar.mo109662A(new View.OnClickListener() { // from class: l.m4g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f131294a.m162570h0(ecsVar, view);
                    }
                });
                arrayList.add(ecsVar);
            } else {
                final gcs gcsVar = new gcs(mqvVar);
                gcsVar.mo109662A(new View.OnClickListener() { // from class: l.n4g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f137096a.m162571i0(gcsVar, view);
                    }
                });
                arrayList.add(gcsVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m162570h0(ecs ecsVar, View view) {
        this.f141773j.m218471c4(ecsVar.f102048a.f135304a.f111441a);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m162571i0(gcs gcsVar, View view) {
        this.f141773j.m218471c4(gcsVar.f102048a.f135304a.f111441a);
    }

    /* JADX INFO: renamed from: j0 */
    public void m162572j0() {
        m67371Z(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: k0 */
    public void m162573k0(pfg pfgVar) {
        m67372a0(m162569g0(pfgVar), true);
    }
}
