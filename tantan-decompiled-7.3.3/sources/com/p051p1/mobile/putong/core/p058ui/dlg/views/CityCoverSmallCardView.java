package com.p051p1.mobile.putong.core.p058ui.dlg.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.lyh0;
import p153l.r55;
import p153l.uqb0;

/* JADX INFO: loaded from: classes2.dex */
public class CityCoverSmallCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverSmallCardView f29873a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f29874b;

    /* JADX INFO: renamed from: c */
    public VText f29875c;

    /* JADX INFO: renamed from: d */
    public VImage f29876d;

    /* JADX INFO: renamed from: e */
    public VText f29877e;

    /* JADX INFO: renamed from: f */
    public VText f29878f;

    public CityCoverSmallCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m46402a(View view) {
        r55.m179847a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m46403b(String str, String str2, String str3) {
        this.f29877e.setTypeface(lyh0.m156283c(3), 1);
        this.f29875c.setTypeface(lyh0.m156283c(3), 1);
        if (!TextUtils.isEmpty(str)) {
            uqb0.f180374G.m127115L0(this.f29874b, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f29877e.setText(str2);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.f29878f.setText(str3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46402a(this);
    }

    public CityCoverSmallCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CityCoverSmallCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
