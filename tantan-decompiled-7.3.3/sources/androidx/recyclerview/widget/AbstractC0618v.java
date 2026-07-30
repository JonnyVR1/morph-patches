package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: androidx.recyclerview.widget.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0618v extends RecyclerView.AbstractC0576l {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateAdd(RecyclerView.AbstractC0569e0 abstractC0569e0);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public boolean animateAppearance(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, @Nullable RecyclerView.AbstractC0576l.c cVar, @NonNull RecyclerView.AbstractC0576l.c cVar2) {
        int i;
        int i2;
        return (cVar == null || ((i = cVar.f2597a) == (i2 = cVar2.f2597a) && cVar.f2598b == cVar2.f2598b)) ? animateAdd(abstractC0569e0) : animateMove(abstractC0569e0, i, cVar.f2598b, i2, cVar2.f2598b);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateChange(RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public boolean animateChange(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, @NonNull RecyclerView.AbstractC0569e0 abstractC0569e1, @NonNull RecyclerView.AbstractC0576l.c cVar, @NonNull RecyclerView.AbstractC0576l.c cVar2) {
        int i;
        int i2 = cVar.f2597a;
        int i3 = cVar.f2598b;
        if (abstractC0569e1.shouldIgnore()) {
            i = cVar.f2597a;
        } else {
            i = cVar2.f2597a;
            cVar = cVar2;
        }
        return animateChange(abstractC0569e0, abstractC0569e1, i2, i3, i, cVar.f2598b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public boolean animateDisappearance(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, @NonNull RecyclerView.AbstractC0576l.c cVar, @Nullable RecyclerView.AbstractC0576l.c cVar2) {
        int i = cVar.f2597a;
        int i2 = cVar.f2598b;
        View view = abstractC0569e0.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2597a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2598b;
        if (abstractC0569e0.isRemoved() || (i == left && i2 == top)) {
            return animateRemove(abstractC0569e0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(abstractC0569e0, i, i2, left, top);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateMove(RecyclerView.AbstractC0569e0 abstractC0569e0, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public boolean animatePersistence(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, @NonNull RecyclerView.AbstractC0576l.c cVar, @NonNull RecyclerView.AbstractC0576l.c cVar2) {
        int i = cVar.f2597a;
        int i2 = cVar2.f2597a;
        if (i != i2 || cVar.f2598b != cVar2.f2598b) {
            return animateMove(abstractC0569e0, i, cVar.f2598b, i2, cVar2.f2598b);
        }
        dispatchMoveFinished(abstractC0569e0);
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateRemove(RecyclerView.AbstractC0569e0 abstractC0569e0);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        return !this.mSupportsChangeAnimations || abstractC0569e0.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddFinished(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        onAddFinished(abstractC0569e0);
        dispatchAnimationFinished(abstractC0569e0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddStarting(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        onAddStarting(abstractC0569e0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeFinished(RecyclerView.AbstractC0569e0 abstractC0569e0, boolean z) {
        onChangeFinished(abstractC0569e0, z);
        dispatchAnimationFinished(abstractC0569e0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeStarting(RecyclerView.AbstractC0569e0 abstractC0569e0, boolean z) {
        onChangeStarting(abstractC0569e0, z);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveFinished(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        onMoveFinished(abstractC0569e0);
        dispatchAnimationFinished(abstractC0569e0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveStarting(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        onMoveStarting(abstractC0569e0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveFinished(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        onRemoveFinished(abstractC0569e0);
        dispatchAnimationFinished(abstractC0569e0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveStarting(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        onRemoveStarting(abstractC0569e0);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddFinished(RecyclerView.AbstractC0569e0 abstractC0569e0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddStarting(RecyclerView.AbstractC0569e0 abstractC0569e0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeFinished(RecyclerView.AbstractC0569e0 abstractC0569e0, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeStarting(RecyclerView.AbstractC0569e0 abstractC0569e0, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveFinished(RecyclerView.AbstractC0569e0 abstractC0569e0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveStarting(RecyclerView.AbstractC0569e0 abstractC0569e0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveFinished(RecyclerView.AbstractC0569e0 abstractC0569e0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveStarting(RecyclerView.AbstractC0569e0 abstractC0569e0) {
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }
}
