package com.p046p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import p147v.VLinear;
import p147v.VRecyclerView;
import p149l.agg;
import p149l.kgg;
import p149l.mag;
import p149l.t100;
import p149l.vgg;

/* JADX INFO: loaded from: classes4.dex */
public class FansRecallSelectView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VRecyclerView f49014c;

    /* JADX INFO: renamed from: d */
    public agg f49015d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansRecallSelectView$a */
    public class C12756a extends RecyclerView.AbstractC0576n {
        public C12756a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            rect.bottom = t100.f167261j;
        }
    }

    public FansRecallSelectView(Context context) {
        super(context);
        this.f49015d = new agg();
    }

    /* JADX INFO: renamed from: P */
    public final void m72858P(View view) {
        vgg.m198318a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m72859Q(mag magVar, kgg kggVar, FansBottomSelectView fansBottomSelectView) {
        setVisibility(0);
        this.f49015d.m96308j0(magVar, kggVar);
        fansBottomSelectView.m72850X(this.f49015d, magVar);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72858P(this);
        this.f49014c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f49014c.setNestedScrollingEnabled(true);
        this.f49014c.addItemDecoration(new C12756a());
        this.f49014c.setAdapter(this.f49015d);
    }

    public FansRecallSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49015d = new agg();
    }

    public FansRecallSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49015d = new agg();
    }
}
