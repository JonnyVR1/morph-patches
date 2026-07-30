package com.p000p1.mobile.putong.core.p004ui.settings;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import l.nu0;
import l.t100;
import p006l.x2c0;
import v.VRangeSeekBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewAgeRangeSeekBar extends VRangeSeekBar<Integer> {
    public NewAgeRangeSeekBar(Context context) throws IllegalArgumentException {
        super(context);
    }

    public Bitmap getThumbImage() {
        return m8377o();
    }

    public Bitmap getThumbPressedImage() {
        return m8377o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final Bitmap m8377o() {
        int iD = t100.d(20.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iD, iD, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable drawableB = nu0.b(getContext(), x2c0.f26342Uq);
        drawableB.setBounds(0, 0, iD, iD);
        drawableB.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setLineHeight(2.0f);
    }

    public NewAgeRangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewAgeRangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
