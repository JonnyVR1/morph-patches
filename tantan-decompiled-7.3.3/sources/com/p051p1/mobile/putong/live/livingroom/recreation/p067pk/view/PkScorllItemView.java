package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import p153l.bnl0;
import p153l.x980;

/* JADX INFO: loaded from: classes5.dex */
public class PkScorllItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f52575a;

    /* JADX INFO: renamed from: b */
    public ImageView f52576b;

    public PkScorllItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m77396a(View view) {
        x980.m209797a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m77397b(BLiveCommonViewConfig bLiveCommonViewConfig) {
        if (bLiveCommonViewConfig != null) {
            this.f52575a.setText(bLiveCommonViewConfig.text);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveCommonViewConfig.scheme);
            ImageView imageView = this.f52576b;
            if (zIsEmpty) {
                bnl0.m105524M(imageView, false);
            } else {
                bnl0.m105524M(imageView, true);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77396a(this);
    }

    public PkScorllItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkScorllItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
