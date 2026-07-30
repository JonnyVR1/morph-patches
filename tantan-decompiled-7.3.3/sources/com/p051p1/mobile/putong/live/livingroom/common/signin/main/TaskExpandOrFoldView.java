package com.p051p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.coi0;
import p153l.obc0;

/* JADX INFO: loaded from: classes4.dex */
public class TaskExpandOrFoldView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f50167a;

    /* JADX INFO: renamed from: b */
    public VText f50168b;

    /* JADX INFO: renamed from: c */
    public VImage f50169c;

    public TaskExpandOrFoldView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m74408a(View view) {
        coi0.m111658a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74409b(boolean z, boolean z2, boolean z3) {
        int i;
        if (z3) {
            bnl0.m105525M0(this, false);
            this.f50168b.setText(R$string.f47572Hd);
            return;
        }
        bnl0.m105524M(this, true);
        VText vText = this.f50168b;
        if (z) {
            vText.setText(R$string.f47572Hd);
            i = obc0.f146454p8;
        } else {
            vText.setText(z2 ? R$string.f47594Id : R$string.f47702Nd);
            i = obc0.f146430n8;
        }
        this.f50169c.setImageResource(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74408a(this);
    }
}
