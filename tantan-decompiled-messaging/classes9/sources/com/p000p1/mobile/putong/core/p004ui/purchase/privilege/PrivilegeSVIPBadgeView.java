package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Media;
import l.d3c0;
import l.kb90;
import l.sab0;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeSVIPBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4881a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f4882b;

    /* JADX INFO: renamed from: c */
    public VImage f4883c;

    /* JADX INFO: renamed from: d */
    public VImage f4884d;

    public PrivilegeSVIPBadgeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7609a(View view) {
        kb90.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7610b(PurchaseType purchaseType) {
        this.f4882b.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
        boolean zO = sab0.o(purchaseType);
        VImage vImage = this.f4883c;
        if (zO) {
            vImage.setImageResource(d3c0.U8);
            this.f4881a.setBackgroundResource(d3c0.T8);
            this.f4884d.setImageResource(d3c0.Xa);
        } else {
            vImage.setImageResource(d3c0.W8);
            this.f4881a.setBackgroundResource(d3c0.V8);
            this.f4884d.setImageResource(d3c0.Ya);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7609a(this);
    }

    public PrivilegeSVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
