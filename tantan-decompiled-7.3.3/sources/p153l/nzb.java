package p153l;

import android.view.View;
import androidx.recyclerview.widget.C0611o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class nzb extends C0611o {
    @Override // androidx.recyclerview.widget.C0611o, androidx.recyclerview.widget.AbstractC0619w
    /* JADX INFO: renamed from: h */
    public View mo3812h(RecyclerView.AbstractC0579o abstractC0579o) {
        if (abstractC0579o instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC0579o;
            if (m165370s(linearLayoutManager)) {
                return linearLayoutManager.findViewByPosition(0);
            }
            if (m165371t(linearLayoutManager)) {
                return linearLayoutManager.findViewByPosition(linearLayoutManager.findLastCompletelyVisibleItemPosition());
            }
        }
        return super.mo3812h(abstractC0579o);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m165370s(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m165371t(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
    }
}
