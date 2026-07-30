package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p153l.c17;
import p153l.h290;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeContentDlgItemSupremePartnerServiceView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSupremePartnerServiceView f38616a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f38617b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f38618c;

    public PrivilegeContentDlgItemSupremePartnerServiceView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58521a(View view) {
        h290.m133371a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m58522b() {
        boolean zM107528u0 = c17.m107528u0();
        AutoVDraweeView autoVDraweeView = this.f38617b;
        if (zM107528u0) {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/_S6KOw5mFWZbVI6a7HdpdRPV.webp");
        } else {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/GICfseby9oF3340vymxA-sg8.webp");
        }
        uqb0.f180374G.m127115L0(this.f38618c, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58521a(this);
        m58522b();
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
