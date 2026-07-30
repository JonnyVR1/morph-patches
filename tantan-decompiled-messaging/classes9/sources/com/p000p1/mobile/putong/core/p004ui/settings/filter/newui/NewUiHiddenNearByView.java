package com.p000p1.mobile.putong.core.p004ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import l.jd40;
import l.t100;
import v.VSlider;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewUiHiddenNearByView extends HiddenNearByView {

    /* JADX INFO: renamed from: l */
    public FilterSwitchCell f6032l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f6033m;

    /* JADX INFO: renamed from: n */
    public TextView f6034n;

    /* JADX INFO: renamed from: o */
    public VSlider f6035o;

    public NewUiHiddenNearByView(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView
    public int getHideAimHeight() {
        return t100.d(52.0f) + t100.d(30.0f) + t100.d(2.0f);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView
    public int getShowAnimHeight() {
        return t100.d(52.0f) + t100.d(30.0f) + t100.d(2.0f);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView
    /* JADX INFO: renamed from: k */
    public void mo8754k(Context context) {
        m8948t(LayoutInflater.from(context), this);
        this.f5851a = this.f6032l;
        this.f5852b = this.f6033m;
        this.f5853c = this.f6034n;
        this.f5854d = this.f6035o;
        setOrientation(1);
        m8755l();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: t */
    public View m8948t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jd40.b(this, layoutInflater, viewGroup);
    }

    public NewUiHiddenNearByView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewUiHiddenNearByView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
