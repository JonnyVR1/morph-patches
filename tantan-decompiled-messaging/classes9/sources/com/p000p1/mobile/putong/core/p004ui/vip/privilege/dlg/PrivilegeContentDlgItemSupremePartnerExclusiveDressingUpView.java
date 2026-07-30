package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import l.cu80;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView f7546a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f7547b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f7548c;

    public PrivilegeContentDlgItemSupremePartnerExclusiveDressingUpView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10819a(View view) {
        cu80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m10820b() {
        this.f7547b.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
        this.f7548c.setImageUrl("https://static.tancdn.com/pe-webplatform/qrvgSO492hNKwFcYoNCb3ByD.webp");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10819a(this);
        m10820b();
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
