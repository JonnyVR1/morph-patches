package com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import p153l.bnl0;
import p153l.p44;

/* JADX INFO: loaded from: classes5.dex */
public class CallManageItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f52314a;

    /* JADX INFO: renamed from: b */
    public TextView f52315b;

    /* JADX INFO: renamed from: c */
    public TextView f52316c;

    /* JADX INFO: renamed from: d */
    public ImageView f52317d;

    public CallManageItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77082a(View view) {
        p44.m170542a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public CallManageItemView m77083b(@DrawableRes int i) {
        this.f52314a.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public CallManageItemView m77084c(float f) {
        this.f52314a.setAlpha(f);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public CallManageItemView m77085d(String str) {
        this.f52316c.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public CallManageItemView m77086e(int i) {
        this.f52316c.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public CallManageItemView m77087f(boolean z) {
        bnl0.m105524M(this.f52316c, z);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public CallManageItemView m77088g(@StringRes int i) {
        this.f52315b.setText(i);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public CallManageItemView m77089h(String str) {
        this.f52315b.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: i */
    public CallManageItemView m77090i(int i) {
        this.f52315b.setTextColor(i);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77082a(this);
    }

    public CallManageItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CallManageItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
