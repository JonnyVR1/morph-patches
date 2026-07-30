package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p007l.gt6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CoordinatorRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public int f1734a;

    /* JADX INFO: renamed from: b */
    public boolean f1735b;

    /* JADX INFO: renamed from: c */
    public float f1736c;

    /* JADX INFO: renamed from: d */
    public gt6 f1737d;

    public CoordinatorRecyclerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m3185E(MotionEvent motionEvent) {
        GridLayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = layoutManager;
            if (gridLayoutManager.findFirstVisibleItemPosition() == 0 && gridLayoutManager.findViewByPosition(0).getTop() == gridLayoutManager.getTopDecorationHeight(gridLayoutManager.findViewByPosition(0))) {
                if (!this.f1735b) {
                    this.f1734a = (int) (this.f1736c - motionEvent.getRawY());
                    this.f1735b = true;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1737d == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        int rawY = (int) motionEvent.getRawY();
        int rawX = (int) motionEvent.getRawX();
        if (action == 0) {
            this.f1736c = motionEvent.getRawY();
        } else if (action == 1) {
            this.f1735b = false;
            if (this.f1737d.mo3178a()) {
                this.f1737d.mo3180c();
                return true;
            }
        } else if (action == 2) {
            int i = (int) (this.f1736c - rawY);
            boolean zM3185E = m3185E(motionEvent);
            gt6 gt6Var = this.f1737d;
            if (zM3185E ? gt6Var.mo3179b(rawX, rawY, 0, i + Math.abs(this.f1734a), true) : gt6Var.mo3179b(rawX, rawY, 0, i, m3185E(motionEvent))) {
                return true;
            }
        } else if (action == 3) {
            this.f1735b = false;
            if (this.f1737d.mo3178a()) {
                this.f1737d.mo3180c();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCoordinatorListener(gt6 gt6Var) {
        this.f1737d = gt6Var;
    }

    public CoordinatorRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoordinatorRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
