package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m87232d2 = {"Ll/amf0;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "mSpanCount", "mRowSpacing", "mColumnSpacing", "<init>", "(III)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "a", "I", "b", "c", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class amf0 extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int mSpanCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int mRowSpacing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int mColumnSpacing;

    public amf0(int i, int i2, int i3) {
        this.mSpanCount = i;
        this.mRowSpacing = i2;
        this.mColumnSpacing = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.C0588z state) {
        outRect.getClass();
        view.getClass();
        parent.getClass();
        state.getClass();
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i = this.mSpanCount;
        int i2 = childAdapterPosition % i;
        int i3 = this.mColumnSpacing;
        outRect.left = (i2 * i3) / i;
        outRect.right = i3 - (((i2 + 1) * i3) / i);
        if (childAdapterPosition >= i) {
            outRect.top = this.mRowSpacing;
        }
    }
}
