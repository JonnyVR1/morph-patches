package com.p000p1.mobile.putong.live.livingroom.other.side;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p002l.xvt;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveSiderLiveItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f7308a;

    /* JADX INFO: renamed from: b */
    public LiveSquareMediaView f7309b;

    /* JADX INFO: renamed from: c */
    public View f7310c;

    /* JADX INFO: renamed from: d */
    public VText f7311d;

    /* JADX INFO: renamed from: e */
    public VText f7312e;

    public LiveSiderLiveItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9217a(View view) {
        xvt.m26151a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9217a(this);
    }

    public LiveSiderLiveItemView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSiderLiveItemView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
