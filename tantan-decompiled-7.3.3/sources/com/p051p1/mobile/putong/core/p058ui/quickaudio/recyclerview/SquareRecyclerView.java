package com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.SquareDataWrapper;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p051p1.mobile.putong.p070ui.square.BubbleRecyclerView;
import java.util.HashSet;
import p153l.f0g0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class SquareRecyclerView extends BubbleRecyclerView<SquareDataWrapper, f0g0> {

    /* JADX INFO: renamed from: d */
    public y20<BaseBubbleItemView> f36258d;

    /* JADX INFO: renamed from: e */
    public HashSet<String> f36259e;

    public SquareRecyclerView(@NonNull Context context) {
        super(context);
        this.f36259e = new HashSet<>();
    }

    /* JADX INFO: renamed from: T */
    public void mo55740T(View view, SquareDataWrapper squareDataWrapper, int i, int i2) {
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.BubbleRecyclerView
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public f0g0 mo55739K() {
        return new f0g0(this, new y20() { // from class: l.h0g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107299a.m55742V((BaseBubbleItemView) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m55742V(BaseBubbleItemView baseBubbleItemView) {
        this.f36258d.call(baseBubbleItemView);
    }

    /* JADX INFO: renamed from: W */
    public void mo55743W(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
    }

    /* JADX INFO: renamed from: X */
    public void mo55744X(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
    }

    public void setClickListener(y20<BaseBubbleItemView> y20Var) {
        this.f36258d = y20Var;
    }

    public SquareRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36259e = new HashSet<>();
    }

    public SquareRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36259e = new HashSet<>();
    }
}
