package p009l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gfi0 extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public final Drawable f13507a;

    public gfi0(Drawable drawable) {
        this.f13507a = drawable;
    }

    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.set(0, t100.d(8.0f), 0, 0);
        } else if (childAdapterPosition > 0) {
            rect.set(0, this.f13507a.getIntrinsicHeight(), 0, childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1 ? t100.d(34.0f) : 0);
        }
    }

    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
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
                this.f13507a.setBounds(paddingLeft, top - this.f13507a.getIntrinsicHeight(), width, top);
                this.f13507a.draw(canvas);
            }
        }
        canvas.restore();
    }
}
