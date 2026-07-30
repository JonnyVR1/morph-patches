package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p149l.bm4;

/* JADX INFO: loaded from: classes11.dex */
public class CardRealAvatarInquiryLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText_Medium f23772a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f23773b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f23774c;

    public CardRealAvatarInquiryLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m39109a(View view) {
        bm4.m102572a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39109a(this);
    }

    public CardRealAvatarInquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardRealAvatarInquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
