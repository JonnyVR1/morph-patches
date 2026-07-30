package com.p051p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import p151v.VLinear;
import p151v.VRecyclerView;
import p153l.acg;
import p153l.jig;
import p153l.ohg;
import p153l.qa00;
import p153l.yhg;

/* JADX INFO: loaded from: classes4.dex */
public class FansRecallSelectView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VRecyclerView f49862c;

    /* JADX INFO: renamed from: d */
    public ohg f49863d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansRecallSelectView$a */
    public class C12919a extends RecyclerView.AbstractC0578n {
        public C12919a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            rect.bottom = qa00.f156323j;
        }
    }

    public FansRecallSelectView(Context context) {
        super(context);
        this.f49863d = new ohg();
    }

    /* JADX INFO: renamed from: P */
    public final void m74041P(View view) {
        jig.m144979a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m74042Q(acg acgVar, yhg yhgVar, FansBottomSelectView fansBottomSelectView) {
        setVisibility(0);
        this.f49863d.m167700j0(acgVar, yhgVar);
        fansBottomSelectView.m74033X(this.f49863d, acgVar);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74041P(this);
        this.f49862c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f49862c.setNestedScrollingEnabled(true);
        this.f49862c.addItemDecoration(new C12919a());
        this.f49862c.setAdapter(this.f49863d);
    }

    public FansRecallSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49863d = new ohg();
    }

    public FansRecallSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49863d = new ohg();
    }
}
