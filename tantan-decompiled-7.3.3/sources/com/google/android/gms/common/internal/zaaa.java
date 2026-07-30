package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.util.DeviceProperties;
import p153l.bcc0;
import p153l.o4c;
import p153l.oce;
import p153l.v9c0;

/* JADX INFO: loaded from: classes6.dex */
public final class zaaa extends Button {
    public zaaa(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        o4c.m165980a("Unknown color scheme: ", i);
        return 0;
    }

    public final void zaa(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = bcc0.f76128b;
        int i5 = bcc0.f76129c;
        int iZab = zab(i2, i4, i5, i5);
        int i6 = bcc0.f76130d;
        int i7 = bcc0.f76131e;
        int iZab2 = zab(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            iZab = iZab2;
        } else if (i != 2) {
            o4c.m165980a("Unknown button size: ", i);
            return;
        }
        Drawable drawableM167178r = oce.m167178r(resources.getDrawable(iZab));
        oce.m167175o(drawableM167178r, resources.getColorStateList(v9c0.f182987c));
        oce.m167176p(drawableM167178r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableM167178r);
        int i8 = v9c0.f182985a;
        int i9 = v9c0.f182986b;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i2, i8, i9, i9))));
        if (i == 0) {
            setText(resources.getString(R$string.f9838p));
        } else if (i == 1) {
            setText(resources.getString(R$string.f9839q));
        } else {
            if (i != 2) {
                o4c.m165980a("Unknown button size: ", i);
                return;
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
