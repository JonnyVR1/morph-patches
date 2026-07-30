package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p149l.du80;
import p149l.qib0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeContentDlgItemSupremePartnerServiceView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSupremePartnerServiceView f37768a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f37769b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f37770c;

    public PrivilegeContentDlgItemSupremePartnerServiceView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57338a(View view) {
        du80.m113675a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57339b() {
        boolean zM221004u0 = zz6.m221004u0();
        AutoVDraweeView autoVDraweeView = this.f37769b;
        if (zM221004u0) {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/_S6KOw5mFWZbVI6a7HdpdRPV.webp");
        } else {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/GICfseby9oF3340vymxA-sg8.webp");
        }
        qib0.f154691G.m102331L0(this.f37770c, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57338a(this);
        m57339b();
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
