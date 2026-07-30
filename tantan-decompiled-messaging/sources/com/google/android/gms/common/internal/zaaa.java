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
import p149l.f3c;
import p149l.kbe;
import p149l.p1c0;
import p149l.v3c0;

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
        f3c.m119257a("Unknown color scheme: ", i);
        return 0;
    }

    public final void zaa(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = v3c0.f179763b;
        int i5 = v3c0.f179764c;
        int iZab = zab(i2, i4, i5, i5);
        int i6 = v3c0.f179765d;
        int i7 = v3c0.f179766e;
        int iZab2 = zab(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            iZab = iZab2;
        } else if (i != 2) {
            f3c.m119257a("Unknown button size: ", i);
            return;
        }
        Drawable drawableM145284r = kbe.m145284r(resources.getDrawable(iZab));
        kbe.m145281o(drawableM145284r, resources.getColorStateList(p1c0.f146669c));
        kbe.m145282p(drawableM145284r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableM145284r);
        int i8 = p1c0.f146667a;
        int i9 = p1c0.f146668b;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i2, i8, i9, i9))));
        if (i == 0) {
            setText(resources.getString(R$string.f9801p));
        } else if (i == 1) {
            setText(resources.getString(R$string.f9802q));
        } else {
            if (i != 2) {
                f3c.m119257a("Unknown button size: ", i);
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
