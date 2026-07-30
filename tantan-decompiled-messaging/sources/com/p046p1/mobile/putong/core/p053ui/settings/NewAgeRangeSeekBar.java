package com.p046p1.mobile.putong.core.p053ui.settings;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p147v.VRangeSeekBar;
import p149l.nu0;
import p149l.t100;
import p149l.x2c0;

/* JADX INFO: loaded from: classes9.dex */
public class NewAgeRangeSeekBar extends VRangeSeekBar<Integer> {
    public NewAgeRangeSeekBar(Context context) throws IllegalArgumentException {
        super(context);
    }

    @Override // p147v.VRangeSeekBar
    public Bitmap getThumbImage() {
        return m55011o();
    }

    @Override // p147v.VRangeSeekBar
    public Bitmap getThumbPressedImage() {
        return m55011o();
    }

    /* JADX INFO: renamed from: o */
    public final Bitmap m55011o() {
        int iM186890d = t100.m186890d(20.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM186890d, iM186890d, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable drawableM161424b = nu0.m161424b(getContext(), x2c0.f189806Uq);
        drawableM161424b.setBounds(0, 0, iM186890d, iM186890d);
        drawableM161424b.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setLineHeight(2.0f);
    }

    public NewAgeRangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewAgeRangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
