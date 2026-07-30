package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import p151v.AutoVDraweeView;
import p153l.gbb0;
import p153l.jbc0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class PurchaseDlgItemVisitorHideFootPrint extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35980a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35981b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f35982c;

    public PurchaseDlgItemVisitorHideFootPrint(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55475a(View view) {
        gbb0.m129775a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55476b() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.isFemale()) {
            uqb0.f180374G.m127138Y0(this.f35980a, jbc0.f119536cb);
            uqb0.f180374G.m127138Y0(this.f35981b, jbc0.f119550db);
        } else {
            uqb0.f180374G.m127138Y0(this.f35980a, jbc0.f119564eb);
            uqb0.f180374G.m127138Y0(this.f35981b, jbc0.f119578fb);
        }
        uqb0.f180374G.m127120O(this.f35982c, userM116600p9.m61308fp().profile180().formatted(), 2, 8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55475a(this);
    }

    public PurchaseDlgItemVisitorHideFootPrint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchaseDlgItemVisitorHideFootPrint(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PurchaseDlgItemVisitorHideFootPrint(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
