package com.p000p1.mobile.putong.core.p004ui.active;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.VirtualCardType;
import l.d30;
import l.eyl;
import l.zor;
import p006l.qib0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LiveActiveCard extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4396a;

    /* JADX INFO: renamed from: b */
    public Button f4397b;

    /* JADX INFO: renamed from: c */
    public eyl f4398c;

    /* JADX INFO: renamed from: d */
    public boolean f4399d;

    public LiveActiveCard(@NonNull Context context) {
        super(context);
        this.f4399d = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m7177b(View view) {
        zor.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m7178c(eyl eylVar, VirtualCardType virtualCardType, Active active, final d30 d30Var) {
        qib0.f19782G.m12744L0(this.f4396a, active.cardBackgroundUrl);
        this.f4397b.setOnClickListener(new View.OnClickListener() { // from class: l.wor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        this.f4398c = eylVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4399d) {
            return;
        }
        this.f4398c.I();
        this.f4399d = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7177b(this);
    }

    public LiveActiveCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4399d = false;
    }

    public LiveActiveCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4399d = false;
    }
}
