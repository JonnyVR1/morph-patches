package com.p051p1.mobile.putong.live.livingroom.other.side;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p151v.VText;
import p153l.yxt;

/* JADX INFO: loaded from: classes5.dex */
public class LiveSiderLiveItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f52114a;

    /* JADX INFO: renamed from: b */
    public LiveSquareMediaView f52115b;

    /* JADX INFO: renamed from: c */
    public View f52116c;

    /* JADX INFO: renamed from: d */
    public VText f52117d;

    /* JADX INFO: renamed from: e */
    public VText f52118e;

    public LiveSiderLiveItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m76761a(View view) {
        yxt.m217738a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76761a(this);
    }

    public LiveSiderLiveItemView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSiderLiveItemView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
