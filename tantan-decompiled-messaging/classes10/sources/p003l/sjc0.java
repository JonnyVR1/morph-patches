package p003l;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sjc0 {
    /* JADX INFO: renamed from: a */
    public static boolean m9355a(RecyclerView recyclerView) {
        return recyclerView.computeVerticalScrollExtent() < recyclerView.computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9356b(RecyclerView recyclerView) {
        return recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
    }
}
