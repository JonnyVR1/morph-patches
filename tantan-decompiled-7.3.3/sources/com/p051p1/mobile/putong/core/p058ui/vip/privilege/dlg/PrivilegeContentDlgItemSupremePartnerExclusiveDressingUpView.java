package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.AutoVDraweeView;
import p153l.g290;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView f38613a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f38614b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f38615c;

    public PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58519a(View view) {
        g290.m128595a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m58520b() {
        this.f38614b.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
        this.f38615c.setImageUrl("https://static.tancdn.com/pe-webplatform/qrvgSO492hNKwFcYoNCb3ByD.webp");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58519a(this);
        m58520b();
    }

    public PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
