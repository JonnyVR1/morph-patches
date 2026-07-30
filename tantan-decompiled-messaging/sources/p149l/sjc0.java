package p149l;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class sjc0 {
    /* JADX INFO: renamed from: a */
    public static boolean m184481a(RecyclerView recyclerView) {
        return recyclerView.computeVerticalScrollExtent() < recyclerView.computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m184482b(RecyclerView recyclerView) {
        return recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
    }
}
