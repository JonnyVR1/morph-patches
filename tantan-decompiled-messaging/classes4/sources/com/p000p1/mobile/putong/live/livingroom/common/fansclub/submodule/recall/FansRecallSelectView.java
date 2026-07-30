package com.p000p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import l.t100;
import org.jetbrains.annotations.NotNull;
import p002l.agg;
import p002l.kgg;
import p002l.mag;
import p002l.vgg;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FansRecallSelectView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VRecyclerView f5056c;

    /* JADX INFO: renamed from: d */
    public agg f5057d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansRecallSelectView$a */
    public class C0345a extends RecyclerView.n {
        public C0345a() {
        }

        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            rect.bottom = t100.j;
        }
    }

    public FansRecallSelectView(Context context) {
        super(context);
        this.f5057d = new agg();
    }

    /* JADX INFO: renamed from: P */
    public final void m6377P(View view) {
        vgg.m23943a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public void m6378Q(mag magVar, kgg kggVar, FansBottomSelectView fansBottomSelectView) {
        setVisibility(0);
        this.f5057d.m9631j0(magVar, kggVar);
        fansBottomSelectView.m6369X(this.f5057d, magVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6377P(this);
        this.f5056c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f5056c.setNestedScrollingEnabled(true);
        this.f5056c.addItemDecoration(new C0345a());
        this.f5056c.setAdapter(this.f5057d);
    }

    public FansRecallSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5057d = new agg();
    }

    public FansRecallSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5057d = new agg();
    }
}
