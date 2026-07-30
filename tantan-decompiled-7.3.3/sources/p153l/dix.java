package p153l;

import android.view.View;
import androidx.recyclerview.widget.C0615s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/dix;", "Landroidx/recyclerview/widget/s;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView$o;", "layoutManager", "Landroid/view/View;", "targetView", "", "c", "(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/view/View;)[I", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dix extends C0615s {
    @Override // androidx.recyclerview.widget.C0615s, androidx.recyclerview.widget.AbstractC0619w
    @Nullable
    /* JADX INFO: renamed from: c */
    public int[] mo3811c(@NotNull RecyclerView.AbstractC0579o layoutManager, @NotNull View targetView) {
        layoutManager.getClass();
        targetView.getClass();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.mo3811c(layoutManager, targetView);
        }
        int[] iArr = new int[2];
        int position = layoutManager.getPosition(targetView);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int itemCount = linearLayoutManager.getItemCount();
        if (position != itemCount - 1 || itemCount <= 1) {
            iArr[0] = targetView.getLeft() - linearLayoutManager.getPaddingLeft();
        } else {
            iArr[0] = targetView.getRight() - (linearLayoutManager.getWidth() - linearLayoutManager.getPaddingRight());
        }
        iArr[1] = 0;
        return iArr;
    }
}
