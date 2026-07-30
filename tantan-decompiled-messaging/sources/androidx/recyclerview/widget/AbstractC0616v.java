package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: androidx.recyclerview.widget.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0616v extends RecyclerView.AbstractC0574l {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateAdd(RecyclerView.AbstractC0566d0 abstractC0566d0);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public boolean animateAppearance(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, @Nullable RecyclerView.AbstractC0574l.c cVar, @NonNull RecyclerView.AbstractC0574l.c cVar2) {
        int i;
        int i2;
        return (cVar == null || ((i = cVar.f2580a) == (i2 = cVar2.f2580a) && cVar.f2581b == cVar2.f2581b)) ? animateAdd(abstractC0566d0) : animateMove(abstractC0566d0, i, cVar.f2581b, i2, cVar2.f2581b);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateChange(RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0566d0 abstractC0566d1, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public boolean animateChange(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d1, @NonNull RecyclerView.AbstractC0574l.c cVar, @NonNull RecyclerView.AbstractC0574l.c cVar2) {
        int i;
        int i2 = cVar.f2580a;
        int i3 = cVar.f2581b;
        if (abstractC0566d1.shouldIgnore()) {
            i = cVar.f2580a;
        } else {
            i = cVar2.f2580a;
            cVar = cVar2;
        }
        return animateChange(abstractC0566d0, abstractC0566d1, i2, i3, i, cVar.f2581b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public boolean animateDisappearance(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, @NonNull RecyclerView.AbstractC0574l.c cVar, @Nullable RecyclerView.AbstractC0574l.c cVar2) {
        int i = cVar.f2580a;
        int i2 = cVar.f2581b;
        View view = abstractC0566d0.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2580a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2581b;
        if (abstractC0566d0.isRemoved() || (i == left && i2 == top)) {
            return animateRemove(abstractC0566d0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(abstractC0566d0, i, i2, left, top);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateMove(RecyclerView.AbstractC0566d0 abstractC0566d0, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public boolean animatePersistence(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, @NonNull RecyclerView.AbstractC0574l.c cVar, @NonNull RecyclerView.AbstractC0574l.c cVar2) {
        int i = cVar.f2580a;
        int i2 = cVar2.f2580a;
        if (i != i2 || cVar.f2581b != cVar2.f2581b) {
            return animateMove(abstractC0566d0, i, cVar.f2581b, i2, cVar2.f2581b);
        }
        dispatchMoveFinished(abstractC0566d0);
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateRemove(RecyclerView.AbstractC0566d0 abstractC0566d0);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        return !this.mSupportsChangeAnimations || abstractC0566d0.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddFinished(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        onAddFinished(abstractC0566d0);
        dispatchAnimationFinished(abstractC0566d0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddStarting(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        onAddStarting(abstractC0566d0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeFinished(RecyclerView.AbstractC0566d0 abstractC0566d0, boolean z) {
        onChangeFinished(abstractC0566d0, z);
        dispatchAnimationFinished(abstractC0566d0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeStarting(RecyclerView.AbstractC0566d0 abstractC0566d0, boolean z) {
        onChangeStarting(abstractC0566d0, z);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveFinished(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        onMoveFinished(abstractC0566d0);
        dispatchAnimationFinished(abstractC0566d0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveStarting(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        onMoveStarting(abstractC0566d0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveFinished(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        onRemoveFinished(abstractC0566d0);
        dispatchAnimationFinished(abstractC0566d0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveStarting(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        onRemoveStarting(abstractC0566d0);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddFinished(RecyclerView.AbstractC0566d0 abstractC0566d0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddStarting(RecyclerView.AbstractC0566d0 abstractC0566d0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeFinished(RecyclerView.AbstractC0566d0 abstractC0566d0, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeStarting(RecyclerView.AbstractC0566d0 abstractC0566d0, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveFinished(RecyclerView.AbstractC0566d0 abstractC0566d0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveStarting(RecyclerView.AbstractC0566d0 abstractC0566d0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveFinished(RecyclerView.AbstractC0566d0 abstractC0566d0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveStarting(RecyclerView.AbstractC0566d0 abstractC0566d0) {
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }
}
