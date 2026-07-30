package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;

/* JADX INFO: loaded from: classes5.dex */
public class ten0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: l.ten0$a */
    public static class C20161a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            int iM3487c = c0588z.m3487c() - 1;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            rect.top = 0;
            rect.bottom = 0;
            if (childAdapterPosition == 0) {
                rect.left = t100.m186890d(10.0f);
                rect.right = 0;
            } else if (childAdapterPosition == iM3487c) {
                rect.left = 0;
                rect.right = t100.m186890d(10.0f);
            } else {
                rect.right = 0;
                rect.left = 0;
            }
        }
    }
}
