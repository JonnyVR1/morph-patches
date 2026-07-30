package p153l;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class up0 {

    /* JADX INFO: renamed from: b */
    public static final ViewGroup.MarginLayoutParams f180198b;

    /* JADX INFO: renamed from: a */
    public LinearLayoutManager f180199a;

    /* JADX INFO: renamed from: l.up0$a */
    public class C20609a implements Comparator<int[]> {
        public C20609a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f180198b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public up0(@NonNull LinearLayoutManager linearLayoutManager) {
        this.f180199a = linearLayoutManager;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m197030c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m197030c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m197031a() {
        int top;
        int i;
        int bottom;
        int i2;
        int childCount = this.f180199a.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z = this.f180199a.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f180199a.getChildAt(i3);
            if (childAt == null) {
                wtq0.m207906a("null view contained in the view hierarchy");
                return false;
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f180198b;
            int[] iArr2 = iArr[i3];
            if (z) {
                top = childAt.getLeft();
                i = marginLayoutParams.leftMargin;
            } else {
                top = childAt.getTop();
                i = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i;
            int[] iArr3 = iArr[i3];
            if (z) {
                bottom = childAt.getRight();
                i2 = marginLayoutParams.rightMargin;
            } else {
                bottom = childAt.getBottom();
                i2 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i2;
        }
        Arrays.sort(iArr, new C20609a());
        for (int i4 = 1; i4 < childCount; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i5 = iArr4[1];
        int i6 = iArr4[0];
        return i6 <= 0 && iArr[childCount - 1][1] >= i5 - i6;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m197032b() {
        int childCount = this.f180199a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m197030c(this.f180199a.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m197033d() {
        return (!m197031a() || this.f180199a.getChildCount() <= 1) && m197032b();
    }
}
