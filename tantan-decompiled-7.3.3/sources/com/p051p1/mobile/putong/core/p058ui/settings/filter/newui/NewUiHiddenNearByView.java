package com.p051p1.mobile.putong.core.p058ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p151v.VSlider;
import p153l.qa00;
import p153l.xl40;

/* JADX INFO: loaded from: classes12.dex */
public class NewUiHiddenNearByView extends HiddenNearByView {

    /* JADX INFO: renamed from: l */
    public FilterSwitchCell f37099l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f37100m;

    /* JADX INFO: renamed from: n */
    public TextView f37101n;

    /* JADX INFO: renamed from: o */
    public VSlider f37102o;

    public NewUiHiddenNearByView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView
    public int getHideAimHeight() {
        return qa00.m175859d(52.0f) + qa00.m175859d(30.0f) + qa00.m175859d(2.0f);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView
    public int getShowAnimHeight() {
        return qa00.m175859d(52.0f) + qa00.m175859d(30.0f) + qa00.m175859d(2.0f);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView
    /* JADX INFO: renamed from: k */
    public void mo56564k(Context context) {
        m56738t(LayoutInflater.from(context), this);
        this.f36918a = this.f37099l;
        this.f36919b = this.f37100m;
        this.f36920c = this.f37101n;
        this.f36921d = this.f37102o;
        setOrientation(1);
        m56565l();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: t */
    public View m56738t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xl40.m211493b(this, layoutInflater, viewGroup);
    }

    public NewUiHiddenNearByView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewUiHiddenNearByView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
