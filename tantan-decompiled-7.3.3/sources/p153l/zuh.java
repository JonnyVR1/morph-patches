package p153l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedSelectTopicItem;

/* JADX INFO: loaded from: classes13.dex */
public class zuh extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public static final int f206127a = qa00.m175859d(1.0f);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        super.onDraw(canvas, recyclerView, c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        super.onDrawOver(canvas, recyclerView, c0561a0);
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof FeedSelectTopicItem) {
                int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt);
                float top = childAt.getTop();
                float fM175859d = qa00.m175859d(48.0f) + top;
                if (childLayoutPosition == 1) {
                    Drawable drawableM143192e = j26.m143192e(recyclerView.getContext(), lbc0.f130953U4);
                    drawableM143192e.setBounds(qa00.m175859d(16.0f), (int) top, recyclerView.getWidth() - qa00.m175859d(16.0f), (int) fM175859d);
                    drawableM143192e.draw(canvas);
                } else if (recyclerView.getAdapter().getItemCount() - 1 == childLayoutPosition) {
                    Drawable drawableM143192e2 = j26.m143192e(recyclerView.getContext(), lbc0.f130939S4);
                    drawableM143192e2.setBounds(qa00.m175859d(16.0f), ((int) top) - f206127a, recyclerView.getWidth() - qa00.m175859d(16.0f), (int) fM175859d);
                    drawableM143192e2.draw(canvas);
                } else {
                    Drawable drawableM143192e3 = j26.m143192e(recyclerView.getContext(), lbc0.f130946T4);
                    drawableM143192e3.setBounds(qa00.m175859d(16.0f), ((int) top) - f206127a, recyclerView.getWidth() - qa00.m175859d(16.0f), (int) fM175859d);
                    drawableM143192e3.draw(canvas);
                }
            }
        }
    }
}
