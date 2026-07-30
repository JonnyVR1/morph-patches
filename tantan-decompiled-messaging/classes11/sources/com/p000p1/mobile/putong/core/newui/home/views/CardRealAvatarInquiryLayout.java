package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.VText_Medium;
import l.bm4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardRealAvatarInquiryLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText_Medium f2550a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f2551b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f2552c;

    public CardRealAvatarInquiryLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m3124a(View view) {
        bm4.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3124a(this);
    }

    public CardRealAvatarInquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardRealAvatarInquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
