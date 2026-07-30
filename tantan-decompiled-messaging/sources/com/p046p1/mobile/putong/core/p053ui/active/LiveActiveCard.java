package com.p046p1.mobile.putong.core.p053ui.active;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import p147v.VDraweeView;
import p149l.d30;
import p149l.eyl;
import p149l.qib0;
import p149l.zor;

/* JADX INFO: loaded from: classes9.dex */
public class LiveActiveCard extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f28329a;

    /* JADX INFO: renamed from: b */
    public Button f28330b;

    /* JADX INFO: renamed from: c */
    public eyl f28331c;

    /* JADX INFO: renamed from: d */
    public boolean f28332d;

    public LiveActiveCard(@NonNull Context context) {
        super(context);
        this.f28332d = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m44229b(View view) {
        zor.m219600a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m44230c(eyl eylVar, VirtualCardType virtualCardType, Active active, final d30 d30Var) {
        qib0.f154691G.m102331L0(this.f28329a, active.cardBackgroundUrl);
        this.f28330b.setOnClickListener(new View.OnClickListener() { // from class: l.wor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        this.f28331c = eylVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f28332d) {
            return;
        }
        this.f28331c.mo36739I();
        this.f28332d = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44229b(this);
    }

    public LiveActiveCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28332d = false;
    }

    public LiveActiveCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28332d = false;
    }
}
