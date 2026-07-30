package p149l;

import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RecyclerViewPoolType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class aht {

    /* JADX INFO: renamed from: a */
    public final Map<RecyclerViewPoolType, RecyclerView.C0583u> f69701a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final RecyclerView.C0583u m96682a(e30<RecyclerView.C0583u> e30Var) {
        RecyclerView.C0583u c0583u = new RecyclerView.C0583u();
        if (e30Var != null) {
            e30Var.call(c0583u);
        }
        return c0583u;
    }

    /* JADX INFO: renamed from: b */
    public void m96683b(RecyclerViewPoolType recyclerViewPoolType, RecyclerView recyclerView, e30<RecyclerView.C0583u> e30Var) {
        RecyclerView.C0583u c0583uM96682a = this.f69701a.get(recyclerViewPoolType);
        if (c0583uM96682a == null) {
            c0583uM96682a = m96682a(e30Var);
            this.f69701a.put(recyclerViewPoolType, c0583uM96682a);
        }
        recyclerView.setRecycledViewPool(c0583uM96682a);
    }
}
