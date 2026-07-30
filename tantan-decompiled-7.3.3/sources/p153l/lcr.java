package p153l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C0610n;
import androidx.recyclerview.widget.C0615s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Ll/lcr;", "Landroidx/recyclerview/widget/s;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "b", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroidx/recyclerview/widget/RecyclerView$o;", "layoutManager", "Landroid/view/View;", "targetView", "", "c", "(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/view/View;)[I", "h", "(Landroidx/recyclerview/widget/RecyclerView$o;)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$z;", "e", "(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/RecyclerView$z;", "f", "Landroidx/recyclerview/widget/RecyclerView;", "attachedRecyclerView", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class lcr extends C0615s {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public RecyclerView attachedRecyclerView;

    /* JADX INFO: renamed from: l.lcr$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/lcr$a", "Landroidx/recyclerview/widget/n;", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "calculateSpeedPerPixel", "(Landroid/util/DisplayMetrics;)F", "", "dx", "calculateTimeForScrolling", "(I)I", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18376a extends C0610n {
        public C18376a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0610n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            displayMetrics.getClass();
            return 130.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0610n
        public int calculateTimeForScrolling(int dx) {
            return (int) (super.calculateTimeForScrolling(dx) * 0.85f);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0619w
    /* JADX INFO: renamed from: b */
    public void mo3858b(@Nullable RecyclerView recyclerView) {
        super.mo3858b(recyclerView);
        this.attachedRecyclerView = recyclerView;
    }

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
        if (position == linearLayoutManager.getItemCount() - 1) {
            iArr[0] = targetView.getRight() - (linearLayoutManager.getWidth() - linearLayoutManager.getPaddingRight());
            iArr[1] = 0;
            return iArr;
        }
        iArr[0] = targetView.getLeft() - linearLayoutManager.getPaddingLeft();
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.C0615s, androidx.recyclerview.widget.AbstractC0619w
    @Nullable
    /* JADX INFO: renamed from: e */
    public RecyclerView.AbstractC0590z mo3849e(@NotNull RecyclerView.AbstractC0579o layoutManager) {
        layoutManager.getClass();
        RecyclerView recyclerView = this.attachedRecyclerView;
        if (recyclerView == null) {
            return null;
        }
        return new C18376a(recyclerView.getContext());
    }

    @Override // androidx.recyclerview.widget.C0615s, androidx.recyclerview.widget.AbstractC0619w
    @Nullable
    /* JADX INFO: renamed from: h */
    public View mo3812h(@NotNull RecyclerView.AbstractC0579o layoutManager) {
        layoutManager.getClass();
        return super.mo3812h(layoutManager);
    }
}
