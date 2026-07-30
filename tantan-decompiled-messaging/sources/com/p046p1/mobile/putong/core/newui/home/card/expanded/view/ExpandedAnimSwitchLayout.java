package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p149l.nfh0;
import p149l.ofh0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedAnimSwitchLayout extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public C7957c f22496a;

    /* JADX INFO: renamed from: b */
    public boolean f22497b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$a */
    public class C7955a extends RecyclerView.AbstractC0571i {
        public C7955a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onChanged() {
            super.onChanged();
            ExpandedAnimSwitchLayout.this.f22496a.notifyDataSetChanged();
            ExpandedAnimSwitchLayout.this.m38224G();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$b */
    public static class C7956b extends RecyclerView.AbstractC0577o {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public RecyclerView.C0578p generateDefaultLayoutParams() {
            return new RecyclerView.C0578p(-1, -2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
            super.onLayoutChildren(c0584v, c0588z);
            detachAndScrapAttachedViews(c0584v);
            if (getItemCount() > 0) {
                View viewM3466o = c0584v.m3466o(0);
                addView(viewM3466o);
                measureChildWithMargins(viewM3466o, 0, 0);
                getWidth();
                getDecoratedMeasuredWidth(viewM3466o);
                layoutDecoratedWithMargins(viewM3466o, 0, getHeight() - getDecoratedMeasuredHeight(viewM3466o), getDecoratedMeasuredWidth(viewM3466o), getHeight());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$c */
    public static class C7957c extends RecyclerView.Adapter<C7958d> {

        /* JADX INFO: renamed from: a */
        public RecyclerView f22499a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.Adapter<RecyclerView.AbstractC0566d0> f22500b;

        /* JADX INFO: renamed from: c */
        public int f22501c;

        public C7957c(RecyclerView.Adapter<RecyclerView.AbstractC0566d0> adapter) {
            this.f22500b = adapter;
        }

        /* JADX INFO: renamed from: A */
        public void m38225A(int i) {
            if (this.f22501c != i) {
                this.f22501c = i;
                RecyclerView recyclerView = this.f22499a;
                if (recyclerView == null || xdl0.m208349O0(recyclerView)) {
                    notifyItemChanged(0);
                } else {
                    notifyDataSetChanged();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return this.f22500b.getItemViewType(this.f22501c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            this.f22499a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
            super.onDetachedFromRecyclerView(recyclerView);
            this.f22499a = null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C7958d c7958d, int i) {
            int i2 = this.f22501c;
            c7958d.f22502a = i2;
            this.f22500b.onBindViewHolder(c7958d, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public C7958d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new C7958d(this.f22500b.onCreateViewHolder(viewGroup, i));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$d */
    public static class C7958d extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public int f22502a;

        public C7958d(RecyclerView.AbstractC0566d0 abstractC0566d0) {
            super(abstractC0566d0.itemView);
        }
    }

    public ExpandedAnimSwitchLayout(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        setLayoutManager(new C7956b());
        setItemAnimator(new ofh0());
    }

    /* JADX INFO: renamed from: G */
    public final void m38224G() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22497b) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f22497b) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRealAdapter(nfh0 nfh0Var) {
        C7957c c7957c = new C7957c(nfh0Var);
        this.f22496a = c7957c;
        setAdapter(c7957c);
        new C7955a();
        throw null;
    }

    public void setSelect(int i) {
        C7957c c7957c = this.f22496a;
        if (c7957c != null) {
            c7957c.m38225A(i);
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
