package p153l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class eby extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public final Drawable f92994a;

    public eby(Drawable drawable) {
        this.f92994a = drawable;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m120288f(int i) {
        return i == 9 || i == 7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0 && m120288f(recyclerView.getAdapter().getItemViewType(0))) {
            rect.set(0, qa00.m175859d(12.0f), 0, 0);
            return;
        }
        if (childAdapterPosition > 0 && m120288f(recyclerView.getAdapter().getItemViewType(childAdapterPosition - 1)) && m120288f(recyclerView.getAdapter().getItemViewType(childAdapterPosition))) {
            rect.set(0, qa00.m175859d(25.0f), 0, 0);
        } else if (childAdapterPosition > 0) {
            rect.set(0, this.f92994a.getIntrinsicHeight(), 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
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
            if (childAdapterPosition != 0 && !m120288f(recyclerView.getAdapter().getItemViewType(childAdapterPosition)) && !m120288f(recyclerView.getAdapter().getItemViewType(childAdapterPosition - 1))) {
                int top = childAt.getTop();
                this.f92994a.setBounds(paddingLeft, top - this.f92994a.getIntrinsicHeight(), width, top);
                this.f92994a.draw(canvas);
            }
        }
        canvas.restore();
    }
}
