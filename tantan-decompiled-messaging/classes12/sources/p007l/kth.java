package p007l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedSelectTopicItem;
import l.e16;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kth extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public static final int f9793a = t100.d(1.0f);

    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
    }

    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
        super.onDrawOver(canvas, recyclerView, zVar);
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof FeedSelectTopicItem) {
                int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt);
                float top = childAt.getTop();
                float fD = t100.d(48.0f) + top;
                if (childLayoutPosition == 1) {
                    Drawable drawableE = e16.e(recyclerView.getContext(), f3c0.f7718U4);
                    drawableE.setBounds(t100.d(16.0f), (int) top, recyclerView.getWidth() - t100.d(16.0f), (int) fD);
                    drawableE.draw(canvas);
                } else if (recyclerView.getAdapter().getItemCount() - 1 == childLayoutPosition) {
                    Drawable drawableE2 = e16.e(recyclerView.getContext(), f3c0.f7704S4);
                    drawableE2.setBounds(t100.d(16.0f), ((int) top) - f9793a, recyclerView.getWidth() - t100.d(16.0f), (int) fD);
                    drawableE2.draw(canvas);
                } else {
                    Drawable drawableE3 = e16.e(recyclerView.getContext(), f3c0.f7711T4);
                    drawableE3.setBounds(t100.d(16.0f), ((int) top) - f9793a, recyclerView.getWidth() - t100.d(16.0f), (int) fD);
                    drawableE3.draw(canvas);
                }
            }
        }
    }
}
