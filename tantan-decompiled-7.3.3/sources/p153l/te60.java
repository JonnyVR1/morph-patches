package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class te60 extends RecyclerView.AbstractC0578n {

    /* JADX INFO: renamed from: a */
    public int f173443a;

    /* JADX INFO: renamed from: b */
    public int f173444b;

    /* JADX INFO: renamed from: c */
    public int f173445c;

    public te60(int i, int i2, int i3) {
        this.f173443a = i;
        this.f173444b = i2;
        this.f173445c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            int i = this.f173443a;
            int i2 = this.f173444b;
            if (i == 1) {
                rect.top = i2;
            } else {
                rect.left = i2;
            }
        }
        if (childAdapterPosition == c0561a0.m3361c() - 1) {
            int i3 = this.f173443a;
            int i4 = this.f173445c;
            if (i3 == 1) {
                rect.bottom = i4;
            } else {
                rect.right = i4;
            }
        }
    }
}
