package p149l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C0608n;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class exq {

    /* JADX INFO: renamed from: l.exq$a */
    public class C16718a extends C0608n {
        public C16718a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0608n
        public int calculateDxToMakeVisible(View view, int i) {
            return (super.calculateDxToMakeVisible(view, -1) + super.calculateDxToMakeVisible(view, 1)) / 2;
        }

        @Override // androidx.recyclerview.widget.C0608n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m118692a(int i, int i2, int i3) {
        if (i3 <= i) {
            return i;
        }
        return i3 >= i2 ? i2 : i3;
    }

    /* JADX INFO: renamed from: b */
    public static void m118693b(View view, float f) {
        view.setOutlineProvider(new bjh(t100.m186890d(f)));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: c */
    public static void m118694c(RecyclerView recyclerView, int i) {
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (itemCount <= 0) {
            return;
        }
        int iM118692a = m118692a(0, itemCount - 1, i);
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        C16718a c16718a = new C16718a(recyclerView.getContext());
        c16718a.setTargetPosition(iM118692a);
        layoutManager.startSmoothScroll(c16718a);
    }
}
