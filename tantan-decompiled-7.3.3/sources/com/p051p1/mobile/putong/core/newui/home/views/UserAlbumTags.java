package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.kec0;
import p153l.p9r;

/* JADX INFO: loaded from: classes11.dex */
public class UserAlbumTags extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f24802a;

    /* JADX INFO: renamed from: b */
    public View f24803b;

    /* JADX INFO: renamed from: c */
    public VText f24804c;

    /* JADX INFO: renamed from: d */
    public View f24805d;

    /* JADX INFO: renamed from: e */
    public VText f24806e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f24807f;

    /* JADX INFO: renamed from: g */
    public int f24808g;

    public UserAlbumTags(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        p9r.m171370a(getContext()).inflate(kec0.f125799db, (ViewGroup) this, true);
        this.f24807f = (LinearLayout) findViewById(adc0.f70176Ve);
        this.f24802a = findViewById(adc0.f70557s9);
        this.f24804c = (VText) findViewById(adc0.f70540r9);
        this.f24803b = findViewById(adc0.f70573t8);
        this.f24805d = findViewById(adc0.f70189Wa);
        this.f24806e = (VText) findViewById(adc0.f70172Va);
        setLayerType(1, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0 || this.f24808g < size || this.f24802a.getVisibility() != 0) {
            return;
        }
        this.f24802a.setVisibility(8);
        bnl0.m105564k0(this.f24807f);
    }

    public UserAlbumTags(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserAlbumTags(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
