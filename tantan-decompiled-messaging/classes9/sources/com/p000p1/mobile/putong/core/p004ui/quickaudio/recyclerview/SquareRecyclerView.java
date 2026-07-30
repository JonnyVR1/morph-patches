package com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper;
import com.p1.mobile.putong.ui.square.BubbleRecyclerView;
import java.util.HashSet;
import l.e30;
import p006l.wrf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SquareRecyclerView extends BubbleRecyclerView<SquareDataWrapper, wrf0> {

    /* JADX INFO: renamed from: d */
    public e30<BaseBubbleItemView> f5191d;

    /* JADX INFO: renamed from: e */
    public HashSet<String> f5192e;

    public SquareRecyclerView(@NonNull Context context) {
        super(context);
        this.f5192e = new HashSet<>();
    }

    /* JADX INFO: renamed from: T */
    public void mo7900T(View view, SquareDataWrapper squareDataWrapper, int i, int i2) {
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public wrf0 m7899K() {
        return new wrf0(this, new e30() { // from class: l.yrf0
            public final void call(Object obj) {
                this.f28361a.m7902V((BaseBubbleItemView) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m7902V(BaseBubbleItemView baseBubbleItemView) {
        this.f5191d.call(baseBubbleItemView);
    }

    /* JADX INFO: renamed from: W */
    public void mo7903W(@NonNull RecyclerView.d0 d0Var) {
    }

    /* JADX INFO: renamed from: X */
    public void mo7904X(@NonNull RecyclerView.d0 d0Var) {
    }

    public void setClickListener(e30<BaseBubbleItemView> e30Var) {
        this.f5191d = e30Var;
    }

    public SquareRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5192e = new HashSet<>();
    }

    public SquareRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5192e = new HashSet<>();
    }
}
