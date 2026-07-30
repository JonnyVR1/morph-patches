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
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import l.i0g0;
import l.o7r;
import l.t100;
import l.ure0;
import l.xdl0;
import p006l.e9c0;
import p006l.x2c0;
import v.VSwitch;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SettingsItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f5635a;

    /* JADX INFO: renamed from: b */
    public TextView f5636b;

    /* JADX INFO: renamed from: c */
    public TextView f5637c;

    /* JADX INFO: renamed from: d */
    public VSwitch f5638d;

    /* JADX INFO: renamed from: e */
    public View f5639e;

    /* JADX INFO: renamed from: f */
    public ImageView f5640f;

    /* JADX INFO: renamed from: g */
    public String f5641g;

    /* JADX INFO: renamed from: h */
    public String f5642h;

    /* JADX INFO: renamed from: i */
    @StringRes
    public int f5643i;

    /* JADX INFO: renamed from: j */
    @StringRes
    public int f5644j;

    /* JADX INFO: renamed from: k */
    @DrawableRes
    public int f5645k;

    /* JADX INFO: renamed from: l */
    public boolean f5646l;

    /* JADX INFO: renamed from: m */
    public boolean f5647m;

    public SettingsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.f10892I1, i, 0);
        this.f5641g = typedArrayObtainStyledAttributes.getString(e9c0.f10910O1);
        this.f5642h = typedArrayObtainStyledAttributes.getString(e9c0.f10901L1);
        this.f5643i = typedArrayObtainStyledAttributes.getResourceId(e9c0.f10913P1, 0);
        this.f5644j = typedArrayObtainStyledAttributes.getResourceId(e9c0.f10904M1, 0);
        this.f5645k = typedArrayObtainStyledAttributes.getResourceId(e9c0.f10898K1, 0);
        this.f5646l = typedArrayObtainStyledAttributes.getBoolean(e9c0.f10895J1, false);
        this.f5647m = typedArrayObtainStyledAttributes.getBoolean(e9c0.f10907N1, false);
        typedArrayObtainStyledAttributes.recycle();
        m8408b();
    }

    /* JADX INFO: renamed from: a */
    public View m8407a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ure0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m8408b() {
        setBackgroundResource(x2c0.f26849ku);
        int i = t100.m;
        setPadding(i, 0, i, 0);
        m8407a(o7r.a(getContext()), this);
        TextView textView = this.f5636b;
        int i2 = t100.o;
        xdl0.e0(textView, i2);
        xdl0.e0(this.f5637c, i2);
        if (this.f5645k != 0) {
            xdl0.M(this.f5635a, true);
            this.f5635a.setImageResource(this.f5645k);
        }
        int i3 = this.f5643i;
        TextView textView2 = this.f5636b;
        if (i3 != 0) {
            textView2.setText(i3);
        } else {
            textView2.setText(this.f5641g);
        }
        int i4 = this.f5644j;
        if (i4 != 0) {
            this.f5637c.setText(i4);
            this.f5637c.setVisibility(0);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f5642h);
            TextView textView3 = this.f5637c;
            if (zIsEmpty) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(this.f5642h);
                this.f5637c.setVisibility(0);
            }
        }
        xdl0.M(this.f5640f, this.f5646l);
        xdl0.M(this.f5638d, this.f5647m);
    }

    /* JADX INFO: renamed from: c */
    public void m8409c(boolean z) {
        xdl0.M(this.f5639e, z);
    }

    public void setSubTitleText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.f5637c;
        if (zIsEmpty) {
            textView.setText("");
            this.f5637c.setVisibility(8);
        } else {
            textView.setText(charSequence.toString());
            this.f5637c.setVisibility(0);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f5637c.setTextColor(i);
    }

    public void setTitleIconRes(@DrawableRes int i) {
        i0g0.n(this.f5636b, getContext().getResources().getDrawable(i));
    }

    public void setTitleText(String str) {
        this.f5636b.setText(str);
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f5636b.setTextColor(i);
    }

    public SettingsItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SettingsItem(Context context) {
        this(context, null, 0);
    }
}
