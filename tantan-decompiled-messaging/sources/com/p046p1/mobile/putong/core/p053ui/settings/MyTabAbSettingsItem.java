package com.p046p1.mobile.putong.core.p053ui.settings;

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
import p147v.VSwitch;
import p147v.VText;
import p149l.e9c0;
import p149l.gx10;
import p149l.i0g0;
import p149l.o7r;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class MyTabAbSettingsItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public View f35824a;

    /* JADX INFO: renamed from: b */
    public ImageView f35825b;

    /* JADX INFO: renamed from: c */
    public VText f35826c;

    /* JADX INFO: renamed from: d */
    public VText f35827d;

    /* JADX INFO: renamed from: e */
    public VSwitch f35828e;

    /* JADX INFO: renamed from: f */
    public View f35829f;

    /* JADX INFO: renamed from: g */
    public ImageView f35830g;

    /* JADX INFO: renamed from: h */
    public View f35831h;

    /* JADX INFO: renamed from: i */
    public String f35832i;

    /* JADX INFO: renamed from: j */
    public String f35833j;

    /* JADX INFO: renamed from: k */
    @StringRes
    public int f35834k;

    /* JADX INFO: renamed from: l */
    @StringRes
    public int f35835l;

    /* JADX INFO: renamed from: m */
    @DrawableRes
    public int f35836m;

    /* JADX INFO: renamed from: n */
    public boolean f35837n;

    /* JADX INFO: renamed from: o */
    public boolean f35838o;

    public MyTabAbSettingsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.f89965I1, i, 0);
        this.f35832i = typedArrayObtainStyledAttributes.getString(e9c0.f89983O1);
        this.f35833j = typedArrayObtainStyledAttributes.getString(e9c0.f89974L1);
        this.f35834k = typedArrayObtainStyledAttributes.getResourceId(e9c0.f89986P1, 0);
        this.f35835l = typedArrayObtainStyledAttributes.getResourceId(e9c0.f89977M1, 0);
        this.f35836m = typedArrayObtainStyledAttributes.getResourceId(e9c0.f89971K1, 0);
        this.f35837n = typedArrayObtainStyledAttributes.getBoolean(e9c0.f89968J1, false);
        this.f35838o = typedArrayObtainStyledAttributes.getBoolean(e9c0.f89980N1, false);
        typedArrayObtainStyledAttributes.recycle();
        m55010b();
    }

    /* JADX INFO: renamed from: a */
    public View m55009a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gx10.m128529b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m55010b() {
        setBackgroundResource(x2c0.f190313ku);
        m55009a(o7r.m163037a(getContext()), this);
        if (this.f35836m != 0) {
            xdl0.m208344M(this.f35825b, true);
            this.f35825b.setImageResource(this.f35836m);
        }
        int i = this.f35834k;
        VText vText = this.f35826c;
        if (i != 0) {
            vText.setText(i);
        } else {
            vText.setText(this.f35832i);
        }
        int i2 = this.f35835l;
        if (i2 != 0) {
            this.f35827d.setText(i2);
            this.f35827d.setVisibility(0);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f35833j);
            VText vText2 = this.f35827d;
            if (zIsEmpty) {
                vText2.setVisibility(8);
            } else {
                vText2.setText(this.f35833j);
                this.f35827d.setVisibility(0);
            }
        }
        xdl0.m208344M(this.f35830g, this.f35837n);
        xdl0.m208344M(this.f35828e, this.f35838o);
    }

    public void setSubTitleText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        VText vText = this.f35827d;
        if (zIsEmpty) {
            vText.setText("");
            this.f35827d.setVisibility(8);
        } else {
            vText.setText(charSequence);
            this.f35827d.setVisibility(0);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f35827d.setTextColor(i);
    }

    public void setTitleIconRes(@DrawableRes int i) {
        i0g0.m133874n(this.f35826c, getContext().getResources().getDrawable(i));
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f35826c.setTextColor(i);
    }

    public MyTabAbSettingsItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyTabAbSettingsItem(Context context) {
        this(context, null, 0);
    }
}
