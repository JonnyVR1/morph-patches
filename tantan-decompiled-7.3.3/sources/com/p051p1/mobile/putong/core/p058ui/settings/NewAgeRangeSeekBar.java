package com.p051p1.mobile.putong.core.p058ui.settings;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p151v.VRangeSeekBar;
import p153l.dbc0;
import p153l.qa00;
import p153l.tu0;

/* JADX INFO: loaded from: classes12.dex */
public class NewAgeRangeSeekBar extends VRangeSeekBar<Integer> {
    public NewAgeRangeSeekBar(Context context) throws IllegalArgumentException {
        super(context);
    }

    @Override // p151v.VRangeSeekBar
    public Bitmap getThumbImage() {
        return m56194o();
    }

    @Override // p151v.VRangeSeekBar
    public Bitmap getThumbPressedImage() {
        return m56194o();
    }

    /* JADX INFO: renamed from: o */
    public final Bitmap m56194o() {
        int iM175859d = qa00.m175859d(20.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM175859d, iM175859d, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable drawableM192702b = tu0.m192702b(getContext(), dbc0.f86260Ir);
        drawableM192702b.setBounds(0, 0, iM175859d, iM175859d);
        drawableM192702b.draw(canvas);
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
