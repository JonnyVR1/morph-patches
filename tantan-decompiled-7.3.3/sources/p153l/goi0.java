package p153l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class goi0 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public final Drawable f105297a;

    public goi0(Drawable drawable) {
        this.f105297a = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.set(0, qa00.m175859d(8.0f), 0, 0);
        } else if (childAdapterPosition > 0) {
            rect.set(0, this.f105297a.getIntrinsicHeight(), 0, childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1 ? qa00.m175859d(34.0f) : 0);
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
            if (recyclerView.getChildAdapterPosition(childAt) != 0) {
                int top = childAt.getTop();
                this.f105297a.setBounds(paddingLeft, top - this.f105297a.getIntrinsicHeight(), width, top);
                this.f105297a.draw(canvas);
            }
        }
        canvas.restore();
    }
}
