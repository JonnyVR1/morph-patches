package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;

/* JADX INFO: loaded from: classes5.dex */
public class xnn0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: l.xnn0$a */
    public static class C21394a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            int iM3361c = c0561a0.m3361c() - 1;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            rect.top = 0;
            rect.bottom = 0;
            if (childAdapterPosition == 0) {
                rect.left = qa00.m175859d(10.0f);
                rect.right = 0;
            } else if (childAdapterPosition == iM3361c) {
                rect.left = 0;
                rect.right = qa00.m175859d(10.0f);
            } else {
                rect.right = 0;
                rect.left = 0;
            }
        }
    }
}
