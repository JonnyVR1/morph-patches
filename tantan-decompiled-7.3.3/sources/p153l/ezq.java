package p153l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C0610n;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class ezq {

    /* JADX INFO: renamed from: l.ezq$a */
    public class C16871a extends C0610n {
        public C16871a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0610n
        public int calculateDxToMakeVisible(View view, int i) {
            return (super.calculateDxToMakeVisible(view, -1) + super.calculateDxToMakeVisible(view, 1)) / 2;
        }

        @Override // androidx.recyclerview.widget.C0610n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m123396a(int i, int i2, int i3) {
        if (i3 <= i) {
            return i;
        }
        return i3 >= i2 ? i2 : i3;
    }

    /* JADX INFO: renamed from: b */
    public static void m123397b(View view, float f) {
        view.setOutlineProvider(new qkh(qa00.m175859d(f)));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: c */
    public static void m123398c(RecyclerView recyclerView, int i) {
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (itemCount <= 0) {
            return;
        }
        int iM123396a = m123396a(0, itemCount - 1, i);
        RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
        C16871a c16871a = new C16871a(recyclerView.getContext());
        c16871a.setTargetPosition(iM123396a);
        layoutManager.startSmoothScroll(c16871a);
    }
}
