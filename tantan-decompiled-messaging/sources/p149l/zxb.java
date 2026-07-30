package p149l;

import android.view.View;
import androidx.recyclerview.widget.C0609o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class zxb extends C0609o {
    @Override // androidx.recyclerview.widget.C0609o, androidx.recyclerview.widget.AbstractC0617w
    /* JADX INFO: renamed from: h */
    public View mo3811h(RecyclerView.AbstractC0577o abstractC0577o) {
        if (abstractC0577o instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC0577o;
            if (m220787s(linearLayoutManager)) {
                return linearLayoutManager.findViewByPosition(0);
            }
            if (m220788t(linearLayoutManager)) {
                return linearLayoutManager.findViewByPosition(linearLayoutManager.findLastCompletelyVisibleItemPosition());
            }
        }
        return super.mo3811h(abstractC0577o);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m220787s(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m220788t(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
    }
}
