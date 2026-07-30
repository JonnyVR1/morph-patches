package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d5c0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareBannerItemView extends FrameLayout {
    public View _black_cover;
    public VDraweeView _drawee_view;
    public VText _text;

    public LiveSquareBannerItemView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._drawee_view = (VDraweeView) findViewById(d5c0.f84420H);
        this._text = (VText) findViewById(d5c0.f84443S0);
        this._black_cover = findViewById(d5c0.f84510s);
        this._drawee_view.getHierarchy().m112050E(null);
    }

    public LiveSquareBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSquareBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
