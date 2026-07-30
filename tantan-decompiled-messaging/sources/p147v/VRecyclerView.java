package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class VRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f209321a;

    /* JADX INFO: renamed from: b */
    public View f209322b;

    public VRecyclerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: E */
    public void m223188E() {
    }

    /* JADX INFO: renamed from: F */
    public void m223189F(View view) {
        this.f209321a = -1;
        if (this.f209322b != view) {
            this.f209322b = null;
            setChildDrawingOrderCallback(null);
            this.f209322b = view;
        }
        m223188E();
        invalidate();
    }

    public VRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
