package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import l.bu80;
import l.zz6;
import v.AutoVDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeContentDlgItemSupremePartnerCityToppingView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSupremePartnerCityToppingView f7541a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f7542b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f7543c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f7544d;

    /* JADX INFO: renamed from: e */
    public VText f7545e;

    public PrivilegeContentDlgItemSupremePartnerCityToppingView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10817a(View view) {
        bu80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m10818b() {
        boolean zU0 = zz6.u0();
        AutoVDraweeView autoVDraweeView = this.f7542b;
        if (zU0) {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/462-cI2gUBvB63CVc5elmDJ1.webp");
        } else {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/Y4cmpGdRxBwFjgoEczeLm6G7.webp");
        }
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        this.f7545e.setText(userM21490p9.name);
        this.f7543c.setImageUrl(((Media) userM21490p9.fp()).url);
        this.f7544d.setImageUrl("https://static.tancdn.com/pe-webplatform/ST4GEUBBn7qSuJ-JeRglRJgR.webp");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10817a(this);
        m10818b();
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
