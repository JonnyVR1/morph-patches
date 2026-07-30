package com.p046p1.mobile.putong.core.p053ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p147v.VSlider;
import p149l.jd40;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class NewUiHiddenNearByView extends HiddenNearByView {

    /* JADX INFO: renamed from: l */
    public FilterSwitchCell f36251l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f36252m;

    /* JADX INFO: renamed from: n */
    public TextView f36253n;

    /* JADX INFO: renamed from: o */
    public VSlider f36254o;

    public NewUiHiddenNearByView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView
    public int getHideAimHeight() {
        return t100.m186890d(52.0f) + t100.m186890d(30.0f) + t100.m186890d(2.0f);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView
    public int getShowAnimHeight() {
        return t100.m186890d(52.0f) + t100.m186890d(30.0f) + t100.m186890d(2.0f);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView
    /* JADX INFO: renamed from: k */
    public void mo55381k(Context context) {
        m55555t(LayoutInflater.from(context), this);
        this.f36070a = this.f36251l;
        this.f36071b = this.f36252m;
        this.f36072c = this.f36253n;
        this.f36073d = this.f36254o;
        setOrientation(1);
        m55382l();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: t */
    public View m55555t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jd40.m141013b(this, layoutInflater, viewGroup);
    }

    public NewUiHiddenNearByView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewUiHiddenNearByView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
