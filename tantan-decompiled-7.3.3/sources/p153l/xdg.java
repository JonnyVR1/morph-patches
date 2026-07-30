package p153l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveAdvanceTask;
import com.p051p1.mobile.putong.live.base.data.BLiveTask;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class xdg extends LiveBaseAdapter {
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m210456f0(BLiveTask bLiveTask, tk2 tk2Var, View view) {
        if (bLiveTask.done) {
            return;
        }
        tk2Var.m191483c4(bLiveTask.scheme, true);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m210457g0(BLiveAdvanceTask bLiveAdvanceTask, tk2 tk2Var, View view) {
        if (bLiveAdvanceTask.status.equals("doing")) {
            tk2Var.m191483c4(bLiveAdvanceTask.scheme, true);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m210458h0() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(new tcs());
        }
        arrayList.add(new ees(null));
        arrayList.add(new scs());
        m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: i0 */
    public void m210459i0(@Nullable final aeg aegVar, final tk2 tk2Var) {
        ArrayList arrayList = new ArrayList();
        if (aegVar == null || aegVar.m97240e()) {
            m68554Z(arrayList);
            return;
        }
        if (aegVar.f70792b != null) {
            arrayList.add(new des(aegVar.f70792b));
        }
        for (final BLiveTask bLiveTask : aegVar.f70794d) {
            bes besVar = new bes(bLiveTask);
            besVar.mo113881A(new View.OnClickListener() { // from class: l.udg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xdg.m210456f0(bLiveTask, tk2Var, view);
                }
            });
            arrayList.add(besVar);
        }
        if (aegVar.f70791a != null) {
            ees eesVar = new ees(aegVar.f70791a);
            eesVar.mo113881A(new View.OnClickListener() { // from class: l.vdg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tk2Var.m191483c4(aegVar.f70791a.scheme, true);
                }
            });
            arrayList.add(eesVar);
        }
        for (final BLiveAdvanceTask bLiveAdvanceTask : aegVar.f70795e) {
            kcs kcsVar = new kcs(bLiveAdvanceTask);
            kcsVar.mo113881A(new View.OnClickListener() { // from class: l.wdg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xdg.m210457g0(bLiveAdvanceTask, tk2Var, view);
                }
            });
            arrayList.add(kcsVar);
        }
        m68554Z(arrayList);
    }
}
