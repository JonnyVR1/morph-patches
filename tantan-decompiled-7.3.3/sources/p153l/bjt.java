package p153l;

import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RecyclerViewPoolType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class bjt {

    /* JADX INFO: renamed from: a */
    public final Map<RecyclerViewPoolType, RecyclerView.C0585u> f77022a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final RecyclerView.C0585u m104769a(y20<RecyclerView.C0585u> y20Var) {
        RecyclerView.C0585u c0585u = new RecyclerView.C0585u();
        if (y20Var != null) {
            y20Var.call(c0585u);
        }
        return c0585u;
    }

    /* JADX INFO: renamed from: b */
    public void m104770b(RecyclerViewPoolType recyclerViewPoolType, RecyclerView recyclerView, y20<RecyclerView.C0585u> y20Var) {
        RecyclerView.C0585u c0585uM104769a = this.f77022a.get(recyclerViewPoolType);
        if (c0585uM104769a == null) {
            c0585uM104769a = m104769a(y20Var);
            this.f77022a.put(recyclerViewPoolType, c0585uM104769a);
        }
        recyclerView.setRecycledViewPool(c0585uM104769a);
    }
}
