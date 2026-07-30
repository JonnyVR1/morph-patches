package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class huf0 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public int f111639a;

    /* JADX INFO: renamed from: b */
    public int f111640b;

    /* JADX INFO: renamed from: c */
    public int f111641c;

    /* JADX INFO: renamed from: d */
    public int f111642d;

    public huf0(int i, int i2, int i3, int i4) {
        this.f111639a = i;
        this.f111640b = i2;
        this.f111641c = i3;
        this.f111642d = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        if (adapterPosition == 0) {
            rect.top = this.f111640b;
            int i = this.f111639a;
            rect.left = i;
            rect.right = i;
            return;
        }
        if (adapterPosition != recyclerView.getAdapter().getItemCount() - 1) {
            int i2 = this.f111639a;
            rect.left = i2;
            rect.right = i2;
            rect.top = this.f111641c;
            return;
        }
        rect.top = this.f111641c;
        int i3 = this.f111639a;
        rect.right = i3;
        rect.left = i3;
        rect.bottom = this.f111642d;
    }
}
