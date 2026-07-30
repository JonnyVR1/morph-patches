package com.p051p1.mobile.putong.core.p058ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.tpl0;

/* JADX INFO: loaded from: classes12.dex */
public class VipConvItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f37829a;

    /* JADX INFO: renamed from: b */
    public VImage f37830b;

    /* JADX INFO: renamed from: c */
    public VText f37831c;

    /* JADX INFO: renamed from: d */
    public VText f37832d;

    /* JADX INFO: renamed from: e */
    public VText f37833e;

    public VipConvItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57428a(View view) {
        tpl0.m192145a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57428a(this);
        this.f37833e.setSingleLine(false);
        this.f37833e.setMaxLines(2);
    }

    public VipConvItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipConvItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
