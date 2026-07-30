package p149l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveAdvanceTask;
import com.p046p1.mobile.putong.live.base.data.BLiveTask;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class jcg extends LiveBaseAdapter {
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m140916f0(BLiveTask bLiveTask, lk2 lk2Var, View view) {
        if (bLiveTask.done) {
            return;
        }
        lk2Var.m150135c4(bLiveTask.scheme, true);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m140917g0(BLiveAdvanceTask bLiveAdvanceTask, lk2 lk2Var, View view) {
        if (bLiveAdvanceTask.status.equals("doing")) {
            lk2Var.m150135c4(bLiveAdvanceTask.scheme, true);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m140918h0() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(new sas());
        }
        arrayList.add(new dcs(null));
        arrayList.add(new ras());
        m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: i0 */
    public void m140919i0(@Nullable final mcg mcgVar, final lk2 lk2Var) {
        ArrayList arrayList = new ArrayList();
        if (mcgVar == null || mcgVar.m153999e()) {
            m67371Z(arrayList);
            return;
        }
        if (mcgVar.f133104b != null) {
            arrayList.add(new ccs(mcgVar.f133104b));
        }
        for (final BLiveTask bLiveTask : mcgVar.f133106d) {
            acs acsVar = new acs(bLiveTask);
            acsVar.mo109662A(new View.OnClickListener() { // from class: l.gcg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jcg.m140916f0(bLiveTask, lk2Var, view);
                }
            });
            arrayList.add(acsVar);
        }
        if (mcgVar.f133103a != null) {
            dcs dcsVar = new dcs(mcgVar.f133103a);
            dcsVar.mo109662A(new View.OnClickListener() { // from class: l.hcg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lk2Var.m150135c4(mcgVar.f133103a.scheme, true);
                }
            });
            arrayList.add(dcsVar);
        }
        for (final BLiveAdvanceTask bLiveAdvanceTask : mcgVar.f133107e) {
            jas jasVar = new jas(bLiveAdvanceTask);
            jasVar.mo109662A(new View.OnClickListener() { // from class: l.icg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jcg.m140917g0(bLiveAdvanceTask, lk2Var, view);
                }
            });
            arrayList.add(jasVar);
        }
        m67371Z(arrayList);
    }
}
