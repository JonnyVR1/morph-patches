package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import p153l.dsx;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class MediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public dsx f9688a;

    /* JADX INFO: renamed from: b */
    public ImageView.ScaleType f9689b;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f9689b = scaleType;
    }

    public void setMediaContent(@NonNull dsx dsxVar) {
        this.f9688a = dsxVar;
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
