package p149l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedSelectTopicItem;

/* JADX INFO: loaded from: classes12.dex */
public class kth extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public static final int f124589a = t100.m186890d(1.0f);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        super.onDraw(canvas, recyclerView, c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        super.onDrawOver(canvas, recyclerView, c0588z);
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof FeedSelectTopicItem) {
                int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt);
                float top = childAt.getTop();
                float fM186890d = t100.m186890d(48.0f) + top;
                if (childLayoutPosition == 1) {
                    Drawable drawableM114377e = e16.m114377e(recyclerView.getContext(), f3c0.f94435U4);
                    drawableM114377e.setBounds(t100.m186890d(16.0f), (int) top, recyclerView.getWidth() - t100.m186890d(16.0f), (int) fM186890d);
                    drawableM114377e.draw(canvas);
                } else if (recyclerView.getAdapter().getItemCount() - 1 == childLayoutPosition) {
                    Drawable drawableM114377e2 = e16.m114377e(recyclerView.getContext(), f3c0.f94421S4);
                    drawableM114377e2.setBounds(t100.m186890d(16.0f), ((int) top) - f124589a, recyclerView.getWidth() - t100.m186890d(16.0f), (int) fM186890d);
                    drawableM114377e2.draw(canvas);
                } else {
                    Drawable drawableM114377e3 = e16.m114377e(recyclerView.getContext(), f3c0.f94428T4);
                    drawableM114377e3.setBounds(t100.m186890d(16.0f), ((int) top) - f124589a, recyclerView.getWidth() - t100.m186890d(16.0f), (int) fM186890d);
                    drawableM114377e3.draw(canvas);
                }
            }
        }
    }
}
