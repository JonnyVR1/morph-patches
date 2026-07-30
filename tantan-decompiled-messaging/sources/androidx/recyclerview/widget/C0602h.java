package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import p149l.ig3;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h */
/* JADX INFO: loaded from: classes.dex */
public class C0602h extends RecyclerView.AbstractC0576n {

    /* JADX INFO: renamed from: d */
    public static final int[] f2787d = {R.attr.listDivider};

    /* JADX INFO: renamed from: a */
    public Drawable f2788a;

    /* JADX INFO: renamed from: b */
    public int f2789b;

    /* JADX INFO: renamed from: c */
    public final Rect f2790c = new Rect();

    @SuppressLint({"UnknownNullness"})
    public C0602h(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f2787d);
        this.f2788a = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        m3706i(i);
    }

    /* JADX INFO: renamed from: f */
    public final void m3703f(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f2790c);
            int iRound = this.f2790c.right + Math.round(childAt.getTranslationX());
            this.f2788a.setBounds(iRound - this.f2788a.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f2788a.draw(canvas);
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: g */
    public final void m3704g(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f2790c);
            int iRound = this.f2790c.bottom + Math.round(childAt.getTranslationY());
            this.f2788a.setBounds(paddingLeft, iRound - this.f2788a.getIntrinsicHeight(), width, iRound);
            this.f2788a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
        Drawable drawable = this.f2788a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f2789b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m3705h(@NonNull Drawable drawable) {
        if (drawable != null) {
            this.f2788a = drawable;
        } else {
            ig3.m135964a("Drawable cannot be null.");
        }
    }

    /* JADX INFO: renamed from: i */
    public void m3706i(int i) {
        if (i == 0 || i == 1) {
            this.f2789b = i;
        } else {
            ig3.m135964a("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
        if (recyclerView.getLayoutManager() == null || this.f2788a == null) {
            return;
        }
        if (this.f2789b == 1) {
            m3704g(canvas, recyclerView);
        } else {
            m3703f(canvas, recyclerView);
        }
    }
}
