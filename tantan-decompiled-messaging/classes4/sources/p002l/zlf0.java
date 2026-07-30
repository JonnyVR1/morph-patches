package p002l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zlf0 extends RecyclerView.n {

    /* JADX INFO: renamed from: a */
    public int f23496a;

    /* JADX INFO: renamed from: b */
    public int f23497b;

    /* JADX INFO: renamed from: c */
    public int f23498c;

    /* JADX INFO: renamed from: d */
    public int f23499d;

    public zlf0(int i, int i2, int i3, int i4) {
        this.f23496a = i;
        this.f23497b = i2;
        this.f23498c = i3;
        this.f23499d = i4;
    }

    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
        int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
        if (adapterPosition == 0) {
            rect.top = this.f23497b;
            int i = this.f23496a;
            rect.left = i;
            rect.right = i;
            return;
        }
        if (adapterPosition != recyclerView.getAdapter().getItemCount() - 1) {
            int i2 = this.f23496a;
            rect.left = i2;
            rect.right = i2;
            rect.top = this.f23498c;
            return;
        }
        rect.top = this.f23498c;
        int i3 = this.f23496a;
        rect.right = i3;
        rect.left = i3;
        rect.bottom = this.f23499d;
    }
}
