package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class ylf0 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a */
    public int f198880a;

    /* JADX INFO: renamed from: b */
    public int f198881b;

    /* JADX INFO: renamed from: c */
    public int f198882c;

    /* JADX INFO: renamed from: d */
    public int f198883d;

    public ylf0(int i, int i2, int i3, int i4) {
        this.f198880a = i;
        this.f198881b = i2;
        this.f198882c = i3;
        this.f198883d = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        if (adapterPosition == 0) {
            rect.top = this.f198881b;
            int i = this.f198880a;
            rect.left = i;
            rect.right = i;
            return;
        }
        if (adapterPosition != recyclerView.getAdapter().getItemCount() - 1) {
            int i2 = this.f198880a;
            rect.left = i2;
            rect.right = i2;
            rect.top = this.f198882c;
            return;
        }
        rect.top = this.f198882c;
        int i3 = this.f198880a;
        rect.right = i3;
        rect.left = i3;
        rect.bottom = this.f198883d;
    }
}
