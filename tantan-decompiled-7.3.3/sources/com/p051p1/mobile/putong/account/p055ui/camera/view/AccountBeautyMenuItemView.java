package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p153l.C18608mg;
import p153l.a9c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBeautyMenuItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f17452a;

    /* JADX INFO: renamed from: b */
    public View f17453b;

    public AccountBeautyMenuItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m29904a(View view) {
        C18608mg.m158183a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29904a(this);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.f17453b.setVisibility(z ? 0 : 8);
        this.f17452a.setTextColor(z ? getResources().getColor(a9c0.f69025j) : RoundedDrawable.DEFAULT_BORDER_COLOR);
    }

    public void setText(String str) {
        this.f17452a.setText(str);
    }

    public AccountBeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
