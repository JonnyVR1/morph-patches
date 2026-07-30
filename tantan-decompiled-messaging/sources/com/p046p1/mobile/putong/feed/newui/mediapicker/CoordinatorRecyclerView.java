package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p149l.gt6;

/* JADX INFO: loaded from: classes12.dex */
public class CoordinatorRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f40273a;

    /* JADX INFO: renamed from: b */
    public boolean f40274b;

    /* JADX INFO: renamed from: c */
    public float f40275c;

    /* JADX INFO: renamed from: d */
    public gt6 f40276d;

    public CoordinatorRecyclerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m62203E(MotionEvent motionEvent) {
        RecyclerView.AbstractC0577o layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (gridLayoutManager.findFirstVisibleItemPosition() == 0 && gridLayoutManager.findViewByPosition(0).getTop() == gridLayoutManager.getTopDecorationHeight(gridLayoutManager.findViewByPosition(0))) {
                if (!this.f40274b) {
                    this.f40273a = (int) (this.f40275c - motionEvent.getRawY());
                    this.f40274b = true;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f40276d == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        int rawY = (int) motionEvent.getRawY();
        int rawX = (int) motionEvent.getRawX();
        if (action == 0) {
            this.f40275c = motionEvent.getRawY();
        } else if (action == 1) {
            this.f40274b = false;
            if (this.f40276d.mo62196a()) {
                this.f40276d.mo62198c();
                return true;
            }
        } else if (action == 2) {
            int i = (int) (this.f40275c - rawY);
            boolean zM62203E = m62203E(motionEvent);
            gt6 gt6Var = this.f40276d;
            if (zM62203E ? gt6Var.mo62197b(rawX, rawY, 0, i + Math.abs(this.f40273a), true) : gt6Var.mo62197b(rawX, rawY, 0, i, m62203E(motionEvent))) {
                return true;
            }
        } else if (action == 3) {
            this.f40274b = false;
            if (this.f40276d.mo62196a()) {
                this.f40276d.mo62198c();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCoordinatorListener(gt6 gt6Var) {
        this.f40276d = gt6Var;
    }

    public CoordinatorRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoordinatorRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
