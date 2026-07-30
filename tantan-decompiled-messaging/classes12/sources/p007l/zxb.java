package p007l;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zxb extends o {
    /* JADX INFO: renamed from: h */
    public View m17540h(RecyclerView.o oVar) {
        if (oVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar;
            if (m17541s(linearLayoutManager)) {
                return linearLayoutManager.findViewByPosition(0);
            }
            if (m17542t(linearLayoutManager)) {
                return linearLayoutManager.findViewByPosition(linearLayoutManager.findLastCompletelyVisibleItemPosition());
            }
        }
        return super.h(oVar);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m17541s(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m17542t(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
    }
}
