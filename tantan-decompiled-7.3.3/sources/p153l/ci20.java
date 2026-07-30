package p153l;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface ci20 extends ei20 {
    void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3);

    void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5);

    void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2);

    boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2);

    void onStopNestedScroll(@NonNull View view, int i);
}
