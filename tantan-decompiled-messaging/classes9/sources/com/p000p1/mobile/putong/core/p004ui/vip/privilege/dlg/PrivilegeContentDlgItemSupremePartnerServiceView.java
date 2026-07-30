package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import l.du80;
import l.zz6;
import p006l.qib0;
import v.AutoVDraweeView;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeContentDlgItemSupremePartnerServiceView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSupremePartnerServiceView f7549a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f7550b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f7551c;

    public PrivilegeContentDlgItemSupremePartnerServiceView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10821a(View view) {
        du80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m10822b() {
        boolean zU0 = zz6.u0();
        AutoVDraweeView autoVDraweeView = this.f7550b;
        if (zU0) {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/_S6KOw5mFWZbVI6a7HdpdRPV.webp");
        } else {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/GICfseby9oF3340vymxA-sg8.webp");
        }
        qib0.f19782G.m12744L0(this.f7551c, CoreModule.f1534c.f3628e0.m21490p9().fp().profileSmall().formatted());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10821a(this);
        m10822b();
    }

    public PrivilegeContentDlgItemSupremePartnerServiceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemSupremePartnerServiceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PrivilegeContentDlgItemSupremePartnerServiceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
