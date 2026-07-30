package p153l;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class zrc0 {
    /* JADX INFO: renamed from: a */
    public static boolean m221154a(RecyclerView recyclerView) {
        return recyclerView.computeVerticalScrollExtent() < recyclerView.computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m221155b(RecyclerView recyclerView) {
        return recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
    }
}
