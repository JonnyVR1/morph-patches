package com.p046p1.mobile.putong.live.livingroom.other.side;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p147v.VText;
import p149l.xvt;

/* JADX INFO: loaded from: classes4.dex */
public class LiveSiderLiveItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f51266a;

    /* JADX INFO: renamed from: b */
    public LiveSquareMediaView f51267b;

    /* JADX INFO: renamed from: c */
    public View f51268c;

    /* JADX INFO: renamed from: d */
    public VText f51269d;

    /* JADX INFO: renamed from: e */
    public VText f51270e;

    public LiveSiderLiveItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m75578a(View view) {
        xvt.m211306a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75578a(this);
    }

    public LiveSiderLiveItemView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSiderLiveItemView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
