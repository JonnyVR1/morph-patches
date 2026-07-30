package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import p149l.r180;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkScorllItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f51727a;

    /* JADX INFO: renamed from: b */
    public ImageView f51728b;

    public PkScorllItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m76213a(View view) {
        r180.m177443a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m76214b(BLiveCommonViewConfig bLiveCommonViewConfig) {
        if (bLiveCommonViewConfig != null) {
            this.f51727a.setText(bLiveCommonViewConfig.text);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveCommonViewConfig.scheme);
            ImageView imageView = this.f51728b;
            if (zIsEmpty) {
                xdl0.m208344M(imageView, false);
            } else {
                xdl0.m208344M(imageView, true);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76213a(this);
    }

    public PkScorllItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkScorllItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
