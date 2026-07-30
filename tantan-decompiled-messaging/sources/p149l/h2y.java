package p149l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class h2y extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public final Drawable f105569a;

    public h2y(Drawable drawable) {
        this.f105569a = drawable;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m129148f(int i) {
        return i == 9 || i == 7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0 && m129148f(recyclerView.getAdapter().getItemViewType(0))) {
            rect.set(0, t100.m186890d(12.0f), 0, 0);
            return;
        }
        if (childAdapterPosition > 0 && m129148f(recyclerView.getAdapter().getItemViewType(childAdapterPosition - 1)) && m129148f(recyclerView.getAdapter().getItemViewType(childAdapterPosition))) {
            rect.set(0, t100.m186890d(25.0f), 0, 0);
        } else if (childAdapterPosition > 0) {
            rect.set(0, this.f105569a.getIntrinsicHeight(), 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != 0 && !m129148f(recyclerView.getAdapter().getItemViewType(childAdapterPosition)) && !m129148f(recyclerView.getAdapter().getItemViewType(childAdapterPosition - 1))) {
                int top = childAt.getTop();
                this.f105569a.setBounds(paddingLeft, top - this.f105569a.getIntrinsicHeight(), width, top);
                this.f105569a.draw(canvas);
            }
        }
        canvas.restore();
    }
}
