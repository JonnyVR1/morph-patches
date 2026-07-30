package p002l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveAdvanceTask;
import com.p1.mobile.putong.live.base.data.BLiveTask;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jcg extends LiveBaseAdapter {
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m15849f0(BLiveTask bLiveTask, lk2 lk2Var, View view) {
        if (bLiveTask.done) {
            return;
        }
        lk2Var.m17289c4(bLiveTask.scheme, true);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m15850g0(BLiveAdvanceTask bLiveAdvanceTask, lk2 lk2Var, View view) {
        if (bLiveAdvanceTask.status.equals("doing")) {
            lk2Var.m17289c4(bLiveAdvanceTask.scheme, true);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m15851h0() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(new sas());
        }
        arrayList.add(new dcs(null));
        arrayList.add(new ras());
        Z(arrayList);
    }

    /* JADX INFO: renamed from: i0 */
    public void m15852i0(@Nullable final mcg mcgVar, final lk2 lk2Var) {
        ArrayList arrayList = new ArrayList();
        if (mcgVar == null || mcgVar.m17820e()) {
            Z(arrayList);
            return;
        }
        if (mcgVar.f15332b != null) {
            arrayList.add(new ccs(mcgVar.f15332b));
        }
        for (final BLiveTask bLiveTask : mcgVar.f15334d) {
            acs acsVar = new acs(bLiveTask);
            acsVar.A(new View.OnClickListener() { // from class: l.gcg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jcg.m15849f0(bLiveTask, lk2Var, view);
                }
            });
            arrayList.add(acsVar);
        }
        if (mcgVar.f15331a != null) {
            dcs dcsVar = new dcs(mcgVar.f15331a);
            dcsVar.A(new View.OnClickListener() { // from class: l.hcg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lk2Var.m17289c4(mcgVar.f15331a.scheme, true);
                }
            });
            arrayList.add(dcsVar);
        }
        for (final BLiveAdvanceTask bLiveAdvanceTask : mcgVar.f15335e) {
            jas jasVar = new jas(bLiveAdvanceTask);
            jasVar.A(new View.OnClickListener() { // from class: l.icg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jcg.m15850g0(bLiveAdvanceTask, lk2Var, view);
                }
            });
            arrayList.add(jasVar);
        }
        Z(arrayList);
    }
}
