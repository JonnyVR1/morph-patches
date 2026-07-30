package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.AutoVDraweeView;
import p149l.cu80;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView f37765a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f37766b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f37767c;

    public PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57336a(View view) {
        cu80.m108726a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57337b() {
        this.f37766b.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
        this.f37767c.setImageUrl("https://static.tancdn.com/pe-webplatform/qrvgSO492hNKwFcYoNCb3ByD.webp");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57336a(this);
        m57337b();
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
