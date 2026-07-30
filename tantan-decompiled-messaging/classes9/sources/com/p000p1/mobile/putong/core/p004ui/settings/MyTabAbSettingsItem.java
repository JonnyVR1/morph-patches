package com.p000p1.mobile.putong.core.p004ui.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import l.gx10;
import l.i0g0;
import l.o7r;
import l.xdl0;
import p006l.e9c0;
import p006l.x2c0;
import v.VSwitch;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class MyTabAbSettingsItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public View f5605a;

    /* JADX INFO: renamed from: b */
    public ImageView f5606b;

    /* JADX INFO: renamed from: c */
    public VText f5607c;

    /* JADX INFO: renamed from: d */
    public VText f5608d;

    /* JADX INFO: renamed from: e */
    public VSwitch f5609e;

    /* JADX INFO: renamed from: f */
    public View f5610f;

    /* JADX INFO: renamed from: g */
    public ImageView f5611g;

    /* JADX INFO: renamed from: h */
    public View f5612h;

    /* JADX INFO: renamed from: i */
    public String f5613i;

    /* JADX INFO: renamed from: j */
    public String f5614j;

    /* JADX INFO: renamed from: k */
    @StringRes
    public int f5615k;

    /* JADX INFO: renamed from: l */
    @StringRes
    public int f5616l;

    /* JADX INFO: renamed from: m */
    @DrawableRes
    public int f5617m;

    /* JADX INFO: renamed from: n */
    public boolean f5618n;

    /* JADX INFO: renamed from: o */
    public boolean f5619o;

    public MyTabAbSettingsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.f10892I1, i, 0);
        this.f5613i = typedArrayObtainStyledAttributes.getString(e9c0.f10910O1);
        this.f5614j = typedArrayObtainStyledAttributes.getString(e9c0.f10901L1);
        this.f5615k = typedArrayObtainStyledAttributes.getResourceId(e9c0.f10913P1, 0);
        this.f5616l = typedArrayObtainStyledAttributes.getResourceId(e9c0.f10904M1, 0);
        this.f5617m = typedArrayObtainStyledAttributes.getResourceId(e9c0.f10898K1, 0);
        this.f5618n = typedArrayObtainStyledAttributes.getBoolean(e9c0.f10895J1, false);
        this.f5619o = typedArrayObtainStyledAttributes.getBoolean(e9c0.f10907N1, false);
        typedArrayObtainStyledAttributes.recycle();
        m8376b();
    }

    /* JADX INFO: renamed from: a */
    public View m8375a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gx10.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m8376b() {
        setBackgroundResource(x2c0.f26849ku);
        m8375a(o7r.a(getContext()), this);
        if (this.f5617m != 0) {
            xdl0.M(this.f5606b, true);
            this.f5606b.setImageResource(this.f5617m);
        }
        int i = this.f5615k;
        VText vText = this.f5607c;
        if (i != 0) {
            vText.setText(i);
        } else {
            vText.setText(this.f5613i);
        }
        int i2 = this.f5616l;
        if (i2 != 0) {
            this.f5608d.setText(i2);
            this.f5608d.setVisibility(0);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f5614j);
            VText vText2 = this.f5608d;
            if (zIsEmpty) {
                vText2.setVisibility(8);
            } else {
                vText2.setText(this.f5614j);
                this.f5608d.setVisibility(0);
            }
        }
        xdl0.M(this.f5611g, this.f5618n);
        xdl0.M(this.f5609e, this.f5619o);
    }

    public void setSubTitleText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        VText vText = this.f5608d;
        if (zIsEmpty) {
            vText.setText("");
            this.f5608d.setVisibility(8);
        } else {
            vText.setText(charSequence);
            this.f5608d.setVisibility(0);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f5608d.setTextColor(i);
    }

    public void setTitleIconRes(@DrawableRes int i) {
        i0g0.n(this.f5607c, getContext().getResources().getDrawable(i));
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f5607c.setTextColor(i);
    }

    public MyTabAbSettingsItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyTabAbSettingsItem(Context context) {
        this(context, null, 0);
    }
}
