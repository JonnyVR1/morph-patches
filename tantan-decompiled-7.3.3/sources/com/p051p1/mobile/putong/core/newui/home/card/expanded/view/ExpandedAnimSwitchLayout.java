package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p153l.bnl0;
import p153l.vnh0;
import p153l.wnh0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedAnimSwitchLayout extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public C8108c f23238a;

    /* JADX INFO: renamed from: b */
    public boolean f23239b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$a */
    public class C8106a extends RecyclerView.AbstractC0573i {
        public C8106a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onChanged() {
            super.onChanged();
            ExpandedAnimSwitchLayout.this.f23238a.notifyDataSetChanged();
            ExpandedAnimSwitchLayout.this.m39227G();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$b */
    public static class C8107b extends RecyclerView.AbstractC0579o {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public RecyclerView.C0580p generateDefaultLayoutParams() {
            return new RecyclerView.C0580p(-1, -2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public void onLayoutChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
            super.onLayoutChildren(c0586v, c0561a0);
            detachAndScrapAttachedViews(c0586v);
            if (getItemCount() > 0) {
                View viewM3475o = c0586v.m3475o(0);
                addView(viewM3475o);
                measureChildWithMargins(viewM3475o, 0, 0);
                getWidth();
                getDecoratedMeasuredWidth(viewM3475o);
                layoutDecoratedWithMargins(viewM3475o, 0, getHeight() - getDecoratedMeasuredHeight(viewM3475o), getDecoratedMeasuredWidth(viewM3475o), getHeight());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$c */
    public static class C8108c extends RecyclerView.Adapter<C8109d> {

        /* JADX INFO: renamed from: a */
        public RecyclerView f23241a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.Adapter<RecyclerView.AbstractC0569e0> f23242b;

        /* JADX INFO: renamed from: c */
        public int f23243c;

        public C8108c(RecyclerView.Adapter<RecyclerView.AbstractC0569e0> adapter) {
            this.f23242b = adapter;
        }

        /* JADX INFO: renamed from: A */
        public void m39228A(int i) {
            if (this.f23243c != i) {
                this.f23243c = i;
                RecyclerView recyclerView = this.f23241a;
                if (recyclerView == null || bnl0.m105529O0(recyclerView)) {
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
            return this.f23242b.getItemViewType(this.f23243c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            this.f23241a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
            super.onDetachedFromRecyclerView(recyclerView);
            this.f23241a = null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C8109d c8109d, int i) {
            int i2 = this.f23243c;
            c8109d.f23244a = i2;
            this.f23242b.onBindViewHolder(c8109d, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public C8109d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new C8109d(this.f23242b.onCreateViewHolder(viewGroup, i));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout$d */
    public static class C8109d extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public int f23244a;

        public C8109d(RecyclerView.AbstractC0569e0 abstractC0569e0) {
            super(abstractC0569e0.itemView);
        }
    }

    public ExpandedAnimSwitchLayout(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        setLayoutManager(new C8107b());
        setItemAnimator(new wnh0());
    }

    /* JADX INFO: renamed from: G */
    public final void m39227G() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f23239b) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23239b) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRealAdapter(vnh0 vnh0Var) {
        C8108c c8108c = new C8108c(vnh0Var);
        this.f23238a = c8108c;
        setAdapter(c8108c);
        new C8106a();
        throw null;
    }

    public void setSelect(int i) {
        C8108c c8108c = this.f23238a;
        if (c8108c != null) {
            c8108c.m39228A(i);
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
