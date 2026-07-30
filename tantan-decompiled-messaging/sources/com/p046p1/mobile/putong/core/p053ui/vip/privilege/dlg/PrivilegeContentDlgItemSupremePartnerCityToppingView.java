package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import p147v.AutoVDraweeView;
import p147v.VText;
import p149l.bu80;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeContentDlgItemSupremePartnerCityToppingView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSupremePartnerCityToppingView f37760a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f37761b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f37762c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f37763d;

    /* JADX INFO: renamed from: e */
    public VText f37764e;

    public PrivilegeContentDlgItemSupremePartnerCityToppingView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57334a(View view) {
        bu80.m103904a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57335b() {
        boolean zM221004u0 = zz6.m221004u0();
        AutoVDraweeView autoVDraweeView = this.f37761b;
        if (zM221004u0) {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/462-cI2gUBvB63CVc5elmDJ1.webp");
        } else {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/Y4cmpGdRxBwFjgoEczeLm6G7.webp");
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        this.f37764e.setText(userM169527p9.name);
        this.f37762c.setImageUrl(userM169527p9.m60124fp().url);
        this.f37763d.setImageUrl("https://static.tancdn.com/pe-webplatform/ST4GEUBBn7qSuJ-JeRglRJgR.webp");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57334a(this);
        m57335b();
    }

    public PrivilegeContentDlgItemSupremePartnerCityToppingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemSupremePartnerCityToppingView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PrivilegeContentDlgItemSupremePartnerCityToppingView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
