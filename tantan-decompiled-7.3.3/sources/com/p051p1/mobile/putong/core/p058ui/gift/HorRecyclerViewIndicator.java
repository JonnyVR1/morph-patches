package com.p051p1.mobile.putong.core.p058ui.gift;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import org.jetbrains.annotations.NotNull;
import p153l.ibc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class HorRecyclerViewIndicator extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f30031a;

    /* JADX INFO: renamed from: b */
    public int f30032b;

    /* JADX INFO: renamed from: c */
    public int f30033c;

    /* JADX INFO: renamed from: d */
    public RecyclerView.AbstractC0584t f30034d;

    /* JADX INFO: renamed from: e */
    public int f30035e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.HorRecyclerViewIndicator$a */
    public class C8498a extends RecyclerView.AbstractC0584t {
        public C8498a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            HorRecyclerViewIndicator.this.m46602c(recyclerView);
        }
    }

    private HorRecyclerViewIndicator(@NonNull Context context) {
        super(context);
        this.f30034d = new C8498a();
    }

    /* JADX INFO: renamed from: b */
    public void m46601b(final RecyclerView recyclerView) {
        post(new Runnable() { // from class: l.zgl
            @Override // java.lang.Runnable
            public final void run() {
                this.f204319a.m46604e(recyclerView);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m46602c(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollExtent();
        if (iComputeHorizontalScrollRange <= 0) {
            return;
        }
        this.f30031a.setX((iComputeHorizontalScrollOffset / iComputeHorizontalScrollRange) * (getWidth() - this.f30033c));
    }

    /* JADX INFO: renamed from: d */
    public void m46603d() {
        if (this.f30031a == null) {
            View view = new View(getContext());
            this.f30031a = view;
            view.setBackgroundResource(this.f30032b);
            if (this.f30035e != 0) {
                GradientDrawable gradientDrawable = (GradientDrawable) this.f30031a.getBackground();
                gradientDrawable.setColor(this.f30035e);
                this.f30031a.setBackground(gradientDrawable);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m46604e(RecyclerView recyclerView) {
        removeAllViews();
        m46603d();
        if (!CoreModule.m30933P().m143412i().mo180478h2(recyclerView)) {
            addView(this.f30031a, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        recyclerView.removeOnScrollListener(this.f30034d);
        addView(this.f30031a, new FrameLayout.LayoutParams(this.f30033c, -1));
        recyclerView.addOnScrollListener(this.f30034d);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30033c = qa00.m175859d(23.0f);
        this.f30032b = ibc0.f113995d0;
    }

    public void setBarColor(int i) {
        this.f30035e = i;
    }

    public HorRecyclerViewIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30034d = new C8498a();
    }

    public HorRecyclerViewIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30034d = new C8498a();
    }
}
