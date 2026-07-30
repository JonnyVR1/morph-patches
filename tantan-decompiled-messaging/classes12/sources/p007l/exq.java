package p007l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class exq {

    /* JADX INFO: renamed from: l.exq$a */
    public class C2380a extends n {
        public C2380a(Context context) {
            super(context);
        }

        public int calculateDxToMakeVisible(View view, int i) {
            return (super.calculateDxToMakeVisible(view, -1) + super.calculateDxToMakeVisible(view, 1)) / 2;
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m9961a(int i, int i2, int i3) {
        if (i3 <= i) {
            return i;
        }
        return i3 >= i2 ? i2 : i3;
    }

    /* JADX INFO: renamed from: b */
    public static void m9962b(View view, float f) {
        view.setOutlineProvider(new bjh(t100.d(f)));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: c */
    public static void m9963c(RecyclerView recyclerView, int i) {
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (itemCount <= 0) {
            return;
        }
        int iM9961a = m9961a(0, itemCount - 1, i);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        C2380a c2380a = new C2380a(recyclerView.getContext());
        c2380a.setTargetPosition(iM9961a);
        layoutManager.startSmoothScroll(c2380a);
    }
}
