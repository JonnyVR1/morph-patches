package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p153l.jbc0;
import p153l.oj90;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeSVIPBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35948a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35949b;

    /* JADX INFO: renamed from: c */
    public VImage f35950c;

    /* JADX INFO: renamed from: d */
    public VImage f35951d;

    public PrivilegeSVIPBadgeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55457a(View view) {
        oj90.m167845a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55458b(PurchaseType purchaseType) {
        this.f35949b.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
        boolean zM206571o = wib0.m206571o(purchaseType);
        VImage vImage = this.f35950c;
        if (zM206571o) {
            vImage.setImageResource(jbc0.f119427U8);
            this.f35948a.setBackgroundResource(jbc0.f119414T8);
            this.f35951d.setImageResource(jbc0.f119468Xa);
        } else {
            vImage.setImageResource(jbc0.f119453W8);
            this.f35948a.setBackgroundResource(jbc0.f119440V8);
            this.f35951d.setImageResource(jbc0.f119481Ya);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55457a(this);
    }

    public PrivilegeSVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
