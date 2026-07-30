package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import l.xdl0;
import p009l.nfh0;
import p009l.ofh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedAnimSwitchLayout extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public C0121c f1274a;

    /* JADX INFO: renamed from: b */
    public boolean f1275b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$a */
    public class C0119a extends RecyclerView.i {
        public C0119a() {
        }

        public void onChanged() {
            super.onChanged();
            ExpandedAnimSwitchLayout.this.f1274a.notifyDataSetChanged();
            ExpandedAnimSwitchLayout.this.m2202G();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$b */
    public static class C0120b extends RecyclerView.o {
        public RecyclerView.p generateDefaultLayoutParams() {
            return new RecyclerView.p(-1, -2);
        }

        public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
            super.onLayoutChildren(vVar, zVar);
            detachAndScrapAttachedViews(vVar);
            if (getItemCount() > 0) {
                View viewO = vVar.o(0);
                addView(viewO);
                measureChildWithMargins(viewO, 0, 0);
                getWidth();
                getDecoratedMeasuredWidth(viewO);
                layoutDecoratedWithMargins(viewO, 0, getHeight() - getDecoratedMeasuredHeight(viewO), getDecoratedMeasuredWidth(viewO), getHeight());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$c */
    public static class C0121c extends RecyclerView.Adapter<C0122d> {

        /* JADX INFO: renamed from: a */
        public RecyclerView f1277a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.Adapter<RecyclerView.d0> f1278b;

        /* JADX INFO: renamed from: c */
        public int f1279c;

        public C0121c(RecyclerView.Adapter<RecyclerView.d0> adapter) {
            this.f1278b = adapter;
        }

        /* JADX INFO: renamed from: A */
        public void m2203A(int i) {
            if (this.f1279c != i) {
                this.f1279c = i;
                RecyclerView recyclerView = this.f1277a;
                if (recyclerView == null || xdl0.O0(recyclerView)) {
                    notifyItemChanged(0);
                } else {
                    notifyDataSetChanged();
                }
            }
        }

        public int getItemCount() {
            return 1;
        }

        public int getItemViewType(int i) {
            return this.f1278b.getItemViewType(this.f1279c);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            this.f1277a = recyclerView;
        }

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
            super.onDetachedFromRecyclerView(recyclerView);
            this.f1277a = null;
        }

        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C0122d c0122d, int i) {
            int i2 = this.f1279c;
            c0122d.f1280a = i2;
            this.f1278b.onBindViewHolder(c0122d, i2);
        }

        @NonNull
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public C0122d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new C0122d(this.f1278b.onCreateViewHolder(viewGroup, i));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$d */
    public static class C0122d extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public int f1280a;

        public C0122d(RecyclerView.d0 d0Var) {
            super(d0Var.itemView);
        }
    }

    public ExpandedAnimSwitchLayout(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        setLayoutManager(new C0120b());
        setItemAnimator(new ofh0());
    }

    /* JADX INFO: renamed from: G */
    public final void m2202G() {
        throw null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1275b) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1275b) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRealAdapter(nfh0 nfh0Var) {
        C0121c c0121c = new C0121c(nfh0Var);
        this.f1274a = c0121c;
        setAdapter(c0121c);
        new C0119a();
        throw null;
    }

    public void setSelect(int i) {
        C0121c c0121c = this.f1274a;
        if (c0121c != null) {
            c0121c.m2203A(i);
        }
    }

    public ExpandedAnimSwitchLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ExpandedAnimSwitchLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
