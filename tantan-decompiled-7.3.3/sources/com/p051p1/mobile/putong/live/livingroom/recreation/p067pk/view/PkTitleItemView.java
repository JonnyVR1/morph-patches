package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p153l.ta80;

/* JADX INFO: loaded from: classes5.dex */
public class PkTitleItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f52588a;

    public PkTitleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77406a(View view) {
        ta80.m189804a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m77407b(String str) {
        this.f52588a.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77406a(this);
    }

    public PkTitleItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkTitleItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
