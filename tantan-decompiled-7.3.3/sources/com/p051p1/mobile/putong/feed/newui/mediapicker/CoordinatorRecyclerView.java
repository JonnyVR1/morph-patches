package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p153l.ju6;

/* JADX INFO: loaded from: classes13.dex */
public class CoordinatorRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f41121a;

    /* JADX INFO: renamed from: b */
    public boolean f41122b;

    /* JADX INFO: renamed from: c */
    public float f41123c;

    /* JADX INFO: renamed from: d */
    public ju6 f41124d;

    public CoordinatorRecyclerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m63386E(MotionEvent motionEvent) {
        RecyclerView.AbstractC0579o layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (gridLayoutManager.findFirstVisibleItemPosition() == 0 && gridLayoutManager.findViewByPosition(0).getTop() == gridLayoutManager.getTopDecorationHeight(gridLayoutManager.findViewByPosition(0))) {
                if (!this.f41122b) {
                    this.f41121a = (int) (this.f41123c - motionEvent.getRawY());
                    this.f41122b = true;
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
        if (this.f41124d == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        int rawY = (int) motionEvent.getRawY();
        int rawX = (int) motionEvent.getRawX();
        if (action == 0) {
            this.f41123c = motionEvent.getRawY();
        } else if (action == 1) {
            this.f41122b = false;
            if (this.f41124d.mo63379a()) {
                this.f41124d.mo63381c();
                return true;
            }
        } else if (action == 2) {
            int i = (int) (this.f41123c - rawY);
            boolean zM63386E = m63386E(motionEvent);
            ju6 ju6Var = this.f41124d;
            if (zM63386E ? ju6Var.mo63380b(rawX, rawY, 0, i + Math.abs(this.f41121a), true) : ju6Var.mo63380b(rawX, rawY, 0, i, m63386E(motionEvent))) {
                return true;
            }
        } else if (action == 3) {
            this.f41122b = false;
            if (this.f41124d.mo63379a()) {
                this.f41124d.mo63381c();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCoordinatorListener(ju6 ju6Var) {
        this.f41124d = ju6Var;
    }

    public CoordinatorRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoordinatorRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
