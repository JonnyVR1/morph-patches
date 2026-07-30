package p002l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.d1q;
import l.hfw;
import l.mqv;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o4g extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    @NonNull
    public final zfg f16363j;

    /* JADX INFO: renamed from: k */
    public final boolean f16364k = ypv.k().K6();

    public o4g(@NonNull zfg zfgVar) {
        this.f16363j = zfgVar;
    }

    /* JADX INFO: renamed from: g0 */
    public final List<d1q<?>> m19213g0(pfg pfgVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < pfgVar.m20227b().size(); i++) {
            mqv<i4g> mqvVar = pfgVar.m20227b().get(i);
            if (i == 0) {
                hfw.a("FansBoardTAG-FansAdapter-buildModel，data=", ((i4g) mqvVar.a).toString());
                final ecs ecsVar = new ecs(mqvVar);
                ecsVar.m12311L(this.f16364k && pfgVar.m20226a().equals(((i4g) mqvVar.a).f13039a));
                ecsVar.A(new View.OnClickListener() { // from class: l.m4g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f15235a.m19214h0(ecsVar, view);
                    }
                });
                arrayList.add(ecsVar);
            } else {
                final gcs gcsVar = new gcs(mqvVar);
                gcsVar.A(new View.OnClickListener() { // from class: l.n4g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f15825a.m19215i0(gcsVar, view);
                    }
                });
                arrayList.add(gcsVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m19214h0(ecs ecsVar, View view) {
        this.f16363j.m27194c4(((i4g) ecsVar.f11367a.a).f13039a);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m19215i0(gcs gcsVar, View view) {
        this.f16363j.m27194c4(((i4g) gcsVar.f11367a.a).f13039a);
    }

    /* JADX INFO: renamed from: j0 */
    public void m19216j0() {
        Z(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: k0 */
    public void m19217k0(pfg pfgVar) {
        a0(m19213g0(pfgVar), true);
    }
}
