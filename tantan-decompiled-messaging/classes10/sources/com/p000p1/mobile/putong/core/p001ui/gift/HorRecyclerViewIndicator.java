package com.p000p1.mobile.putong.core.p001ui.gift;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.core.CoreModule;
import l.t100;
import org.jetbrains.annotations.NotNull;
import p003l.c3c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class HorRecyclerViewIndicator extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f1577a;

    /* JADX INFO: renamed from: b */
    public int f1578b;

    /* JADX INFO: renamed from: c */
    public int f1579c;

    /* JADX INFO: renamed from: d */
    public RecyclerView.t f1580d;

    /* JADX INFO: renamed from: e */
    public int f1581e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.HorRecyclerViewIndicator$a */
    public class C3110a extends RecyclerView.t {
        public C3110a() {
        }

        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            HorRecyclerViewIndicator.this.m2746c(recyclerView);
        }
    }

    private HorRecyclerViewIndicator(@NonNull Context context) {
        super(context);
        this.f1580d = new C3110a();
    }

    /* JADX INFO: renamed from: b */
    public void m2745b(final RecyclerView recyclerView) {
        post(new Runnable() { // from class: l.jel
            @Override // java.lang.Runnable
            public final void run() {
                this.f5316a.m2748e(recyclerView);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m2746c(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollExtent();
        if (iComputeHorizontalScrollRange <= 0) {
            return;
        }
        this.f1577a.setX((iComputeHorizontalScrollOffset / iComputeHorizontalScrollRange) * (getWidth() - this.f1579c));
    }

    /* JADX INFO: renamed from: d */
    public void m2747d() {
        if (this.f1577a == null) {
            View view = new View(getContext());
            this.f1577a = view;
            view.setBackgroundResource(this.f1578b);
            if (this.f1581e != 0) {
                GradientDrawable gradientDrawable = (GradientDrawable) this.f1577a.getBackground();
                gradientDrawable.setColor(this.f1581e);
                this.f1577a.setBackground(gradientDrawable);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m2748e(RecyclerView recyclerView) {
        removeAllViews();
        m2747d();
        if (!CoreModule.P().i().h2(recyclerView)) {
            addView(this.f1577a, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        recyclerView.removeOnScrollListener(this.f1580d);
        addView(this.f1577a, new FrameLayout.LayoutParams(this.f1579c, -1));
        recyclerView.addOnScrollListener(this.f1580d);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1579c = t100.d(23.0f);
        this.f1578b = c3c0.f3757d0;
    }

    public void setBarColor(int i) {
        this.f1581e = i;
    }

    public HorRecyclerViewIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1580d = new C3110a();
    }

    public HorRecyclerViewIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1580d = new C3110a();
    }
}
