package com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.SquareDataWrapper;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p046p1.mobile.putong.p065ui.square.BubbleRecyclerView;
import java.util.HashSet;
import p149l.e30;
import p149l.wrf0;

/* JADX INFO: loaded from: classes9.dex */
public class SquareRecyclerView extends BubbleRecyclerView<SquareDataWrapper, wrf0> {

    /* JADX INFO: renamed from: d */
    public e30<BaseBubbleItemView> f35410d;

    /* JADX INFO: renamed from: e */
    public HashSet<String> f35411e;

    public SquareRecyclerView(@NonNull Context context) {
        super(context);
        this.f35411e = new HashSet<>();
    }

    /* JADX INFO: renamed from: T */
    public void mo54557T(View view, SquareDataWrapper squareDataWrapper, int i, int i2) {
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.BubbleRecyclerView
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public wrf0 mo54556K() {
        return new wrf0(this, new e30() { // from class: l.yrf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199667a.m54559V((BaseBubbleItemView) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m54559V(BaseBubbleItemView baseBubbleItemView) {
        this.f35410d.call(baseBubbleItemView);
    }

    /* JADX INFO: renamed from: W */
    public void mo54560W(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
    }

    /* JADX INFO: renamed from: X */
    public void mo54561X(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
    }

    public void setClickListener(e30<BaseBubbleItemView> e30Var) {
        this.f35410d = e30Var;
    }

    public SquareRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35411e = new HashSet<>();
    }

    public SquareRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35411e = new HashSet<>();
    }
}
