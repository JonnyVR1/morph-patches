package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class VRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f210243a;

    /* JADX INFO: renamed from: b */
    public View f210244b;

    public VRecyclerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: E */
    public void m224434E() {
    }

    /* JADX INFO: renamed from: F */
    public void m224435F(View view) {
        this.f210243a = -1;
        if (this.f210244b != view) {
            this.f210244b = null;
            setChildDrawingOrderCallback(null);
            this.f210244b = view;
        }
        m224434E();
        invalidate();
    }

    public VRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
