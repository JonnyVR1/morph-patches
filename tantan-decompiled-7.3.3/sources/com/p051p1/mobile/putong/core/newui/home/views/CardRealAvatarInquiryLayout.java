package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p153l.an4;

/* JADX INFO: loaded from: classes11.dex */
public class CardRealAvatarInquiryLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText_Medium f24514a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f24515b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f24516c;

    public CardRealAvatarInquiryLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m40112a(View view) {
        an4.m98934a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40112a(this);
    }

    public CardRealAvatarInquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardRealAvatarInquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
