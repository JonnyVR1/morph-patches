package p149l;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class r0l0 {
    /* JADX INFO: renamed from: a */
    public static View m177400a(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0) {
            return null;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (m177404e(recyclerView, childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int m177401b(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (m177404e(recyclerView, childAt)) {
                    return recyclerView.getChildAdapterPosition(childAt);
                }
            }
        }
        return childCount;
    }

    /* JADX INFO: renamed from: c */
    public static View m177402c(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0) {
            return null;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (m177405f(recyclerView, childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m177403d(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (m177405f(recyclerView, childAt)) {
                    return recyclerView.getChildAdapterPosition(childAt);
                }
            }
        }
        return childCount;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m177404e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        recyclerView.getLocationOnScreen(iArr);
        int width = iArr[0] + (recyclerView.getWidth() / 2);
        if (childCount > 0) {
            view.getLocationOnScreen(iArr2);
            int translationX = (int) (iArr2[0] - view.getTranslationX());
            iArr2[0] = translationX;
            if (translationX <= width && translationX + (view.getWidth() * view.getScaleX()) >= width) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m177405f(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        recyclerView.getLocationOnScreen(iArr);
        int height = iArr[1] + (recyclerView.getHeight() / 2);
        if (childCount <= 0) {
            return false;
        }
        view.getLocationOnScreen(iArr2);
        int translationY = (int) (iArr2[1] - view.getTranslationY());
        iArr2[1] = translationY;
        return translationY <= height && ((float) translationY) + (((float) view.getHeight()) * view.getScaleY()) >= ((float) height);
    }
}
