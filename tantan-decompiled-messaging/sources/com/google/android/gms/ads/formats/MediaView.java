package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import p149l.gjx;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class MediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public gjx f9651a;

    /* JADX INFO: renamed from: b */
    public ImageView.ScaleType f9652b;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f9652b = scaleType;
    }

    public void setMediaContent(@NonNull gjx gjxVar) {
        this.f9651a = gjxVar;
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
