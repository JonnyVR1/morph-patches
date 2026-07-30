package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f12946a;

    /* JADX INFO: renamed from: b */
    public View f12947b;

    public VRecyclerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: E */
    public void m11671E() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public void m11672F(View view) {
        this.f12946a = -1;
        if (this.f12947b != view) {
            this.f12947b = null;
            setChildDrawingOrderCallback((RecyclerView.j) null);
            this.f12947b = view;
        }
        m11671E();
        invalidate();
    }

    public VRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
