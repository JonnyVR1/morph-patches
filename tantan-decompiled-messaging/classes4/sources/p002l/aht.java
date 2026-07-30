package p002l;

import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RecyclerViewPoolType;
import java.util.HashMap;
import java.util.Map;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class aht {

    /* JADX INFO: renamed from: a */
    public final Map<RecyclerViewPoolType, RecyclerView.u> f7638a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final RecyclerView.u m9780a(e30<RecyclerView.u> e30Var) {
        RecyclerView.u uVar = new RecyclerView.u();
        if (e30Var != null) {
            e30Var.call(uVar);
        }
        return uVar;
    }

    /* JADX INFO: renamed from: b */
    public void m9781b(RecyclerViewPoolType recyclerViewPoolType, RecyclerView recyclerView, e30<RecyclerView.u> e30Var) {
        RecyclerView.u uVarM9780a = this.f7638a.get(recyclerViewPoolType);
        if (uVarM9780a == null) {
            uVarM9780a = m9780a(e30Var);
            this.f7638a.put(recyclerViewPoolType, uVarM9780a);
        }
        recyclerView.setRecycledViewPool(uVarM9780a);
    }
}
