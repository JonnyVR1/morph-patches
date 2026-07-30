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
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import p147v.VSwitch;
import p149l.e9c0;
import p149l.i0g0;
import p149l.o7r;
import p149l.t100;
import p149l.ure0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class SettingsItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f35854a;

    /* JADX INFO: renamed from: b */
    public TextView f35855b;

    /* JADX INFO: renamed from: c */
    public TextView f35856c;

    /* JADX INFO: renamed from: d */
    public VSwitch f35857d;

    /* JADX INFO: renamed from: e */
    public View f35858e;

    /* JADX INFO: renamed from: f */
    public ImageView f35859f;

    /* JADX INFO: renamed from: g */
    public String f35860g;

    /* JADX INFO: renamed from: h */
    public String f35861h;

    /* JADX INFO: renamed from: i */
    @StringRes
    public int f35862i;

    /* JADX INFO: renamed from: j */
    @StringRes
    public int f35863j;

    /* JADX INFO: renamed from: k */
    @DrawableRes
    public int f35864k;

    /* JADX INFO: renamed from: l */
    public boolean f35865l;

    /* JADX INFO: renamed from: m */
    public boolean f35866m;

    public SettingsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.f89965I1, i, 0);
        this.f35860g = typedArrayObtainStyledAttributes.getString(e9c0.f89983O1);
        this.f35861h = typedArrayObtainStyledAttributes.getString(e9c0.f89974L1);
        this.f35862i = typedArrayObtainStyledAttributes.getResourceId(e9c0.f89986P1, 0);
        this.f35863j = typedArrayObtainStyledAttributes.getResourceId(e9c0.f89977M1, 0);
        this.f35864k = typedArrayObtainStyledAttributes.getResourceId(e9c0.f89971K1, 0);
        this.f35865l = typedArrayObtainStyledAttributes.getBoolean(e9c0.f89968J1, false);
        this.f35866m = typedArrayObtainStyledAttributes.getBoolean(e9c0.f89980N1, false);
        typedArrayObtainStyledAttributes.recycle();
        m55041b();
    }

    /* JADX INFO: renamed from: a */
    public View m55040a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ure0.m195074b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m55041b() {
        setBackgroundResource(x2c0.f190313ku);
        int i = t100.f167264m;
        setPadding(i, 0, i, 0);
        m55040a(o7r.m163037a(getContext()), this);
        TextView textView = this.f35855b;
        int i2 = t100.f167266o;
        xdl0.m208372e0(textView, i2);
        xdl0.m208372e0(this.f35856c, i2);
        if (this.f35864k != 0) {
            xdl0.m208344M(this.f35854a, true);
            this.f35854a.setImageResource(this.f35864k);
        }
        int i3 = this.f35862i;
        TextView textView2 = this.f35855b;
        if (i3 != 0) {
            textView2.setText(i3);
        } else {
            textView2.setText(this.f35860g);
        }
        int i4 = this.f35863j;
        if (i4 != 0) {
            this.f35856c.setText(i4);
            this.f35856c.setVisibility(0);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f35861h);
            TextView textView3 = this.f35856c;
            if (zIsEmpty) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(this.f35861h);
                this.f35856c.setVisibility(0);
            }
        }
        xdl0.m208344M(this.f35859f, this.f35865l);
        xdl0.m208344M(this.f35857d, this.f35866m);
    }

    /* JADX INFO: renamed from: c */
    public void m55042c(boolean z) {
        xdl0.m208344M(this.f35858e, z);
    }

    public void setSubTitleText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.f35856c;
        if (zIsEmpty) {
            textView.setText("");
            this.f35856c.setVisibility(8);
        } else {
            textView.setText(charSequence.toString());
            this.f35856c.setVisibility(0);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f35856c.setTextColor(i);
    }

    public void setTitleIconRes(@DrawableRes int i) {
        i0g0.m133874n(this.f35855b, getContext().getResources().getDrawable(i));
    }

    public void setTitleText(String str) {
        this.f35855b.setText(str);
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f35855b.setTextColor(i);
    }

    public SettingsItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SettingsItem(Context context) {
        this(context, null, 0);
    }
}
