package p002l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dxf0 extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public int f9471a;

    /* JADX INFO: renamed from: b */
    public int f9472b;

    /* JADX INFO: renamed from: c */
    public int f9473c;

    /* JADX INFO: renamed from: d */
    public int f9474d;

    /* JADX INFO: renamed from: e */
    public boolean f9475e;

    /* JADX INFO: renamed from: f */
    public final int f9476f = t100.d(100.0f);

    public dxf0(int i, int i2, int i3, int i4, boolean z) {
        this.f9471a = i;
        this.f9472b = i2;
        this.f9473c = i3;
        this.f9474d = i4;
        this.f9475e = z;
    }

    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
        int i;
        int i2;
        super.getItemOffsets(rect, view, recyclerView, zVar);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter().getItemCount();
        int i3 = this.f9471a;
        int i4 = itemCount % i3;
        int i5 = childAdapterPosition + 1;
        if (i5 % i3 == 0) {
            i = (this.f9474d * 2) / 3;
        } else {
            i = childAdapterPosition % i3 != 0 ? this.f9474d / 3 : 0;
        }
        int i6 = childAdapterPosition >= i3 ? this.f9473c : 0;
        if (childAdapterPosition % i3 == 0) {
            i2 = (this.f9474d * 2) / 3;
        } else {
            i2 = i5 % i3 != 0 ? this.f9474d / 3 : 0;
        }
        int i7 = childAdapterPosition + i4 >= itemCount ? this.f9472b : 0;
        if (this.f9475e && (childAdapterPosition == itemCount - 1 || (i4 != 1 && childAdapterPosition == itemCount - 2))) {
            i7 = this.f9476f;
        }
        rect.set(i, i6, i2, i7);
    }
}
