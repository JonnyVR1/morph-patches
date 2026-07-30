package com.p046p1.mobile.putong.core.p053ui.gift;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import org.jetbrains.annotations.NotNull;
import p149l.c3c0;
import p149l.t100;

/* JADX INFO: loaded from: classes10.dex */
public class HorRecyclerViewIndicator extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f29183a;

    /* JADX INFO: renamed from: b */
    public int f29184b;

    /* JADX INFO: renamed from: c */
    public int f29185c;

    /* JADX INFO: renamed from: d */
    public RecyclerView.AbstractC0582t f29186d;

    /* JADX INFO: renamed from: e */
    public int f29187e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.HorRecyclerViewIndicator$a */
    public class C8335a extends RecyclerView.AbstractC0582t {
        public C8335a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            HorRecyclerViewIndicator.this.m45419c(recyclerView);
        }
    }

    private HorRecyclerViewIndicator(@NonNull Context context) {
        super(context);
        this.f29186d = new C8335a();
    }

    /* JADX INFO: renamed from: b */
    public void m45418b(final RecyclerView recyclerView) {
        post(new Runnable() { // from class: l.jel
            @Override // java.lang.Runnable
            public final void run() {
                this.f117583a.m45421e(recyclerView);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m45419c(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollExtent();
        if (iComputeHorizontalScrollRange <= 0) {
            return;
        }
        this.f29183a.setX((iComputeHorizontalScrollOffset / iComputeHorizontalScrollRange) * (getWidth() - this.f29185c));
    }

    /* JADX INFO: renamed from: d */
    public void m45420d() {
        if (this.f29183a == null) {
            View view = new View(getContext());
            this.f29183a = view;
            view.setBackgroundResource(this.f29184b);
            if (this.f29187e != 0) {
                GradientDrawable gradientDrawable = (GradientDrawable) this.f29183a.getBackground();
                gradientDrawable.setColor(this.f29187e);
                this.f29183a.setBackground(gradientDrawable);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m45421e(RecyclerView recyclerView) {
        removeAllViews();
        m45420d();
        if (!CoreModule.m29935P().m94658i().mo158386h2(recyclerView)) {
            addView(this.f29183a, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        recyclerView.removeOnScrollListener(this.f29186d);
        addView(this.f29183a, new FrameLayout.LayoutParams(this.f29185c, -1));
        recyclerView.addOnScrollListener(this.f29186d);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f29185c = t100.m186890d(23.0f);
        this.f29184b = c3c0.f78720d0;
    }

    public void setBarColor(int i) {
        this.f29187e = i;
    }

    public HorRecyclerViewIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29186d = new C8335a();
    }

    public HorRecyclerViewIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29186d = new C8335a();
    }
}
