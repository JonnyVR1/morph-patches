package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p149l.C19693rg;
import p149l.u0c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBeautyMenuItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f16733a;

    /* JADX INFO: renamed from: b */
    public View f16734b;

    public AccountBeautyMenuItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m28905a(View view) {
        C19693rg.m179153a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28905a(this);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.f16734b.setVisibility(z ? 0 : 8);
        this.f16733a.setTextColor(z ? getResources().getColor(u0c0.f172889j) : RoundedDrawable.DEFAULT_BORDER_COLOR);
    }

    public void setText(String str) {
        this.f16733a.setText(str);
    }

    public AccountBeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
