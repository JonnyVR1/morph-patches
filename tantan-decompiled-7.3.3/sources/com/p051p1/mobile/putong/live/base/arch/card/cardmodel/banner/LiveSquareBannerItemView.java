package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.jdc0;

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
        this._drawee_view = (VDraweeView) findViewById(jdc0.f120138H);
        this._text = (VText) findViewById(jdc0.f120161S0);
        this._black_cover = findViewById(jdc0.f120228s);
        this._drawee_view.getHierarchy().m207042E(null);
    }

    public LiveSquareBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSquareBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
