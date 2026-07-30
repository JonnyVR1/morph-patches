package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import p151v.AutoVDraweeView;
import p151v.VText;
import p153l.c17;
import p153l.f290;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeContentDlgItemSupremePartnerCityToppingView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSupremePartnerCityToppingView f38608a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f38609b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f38610c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f38611d;

    /* JADX INFO: renamed from: e */
    public VText f38612e;

    public PrivilegeContentDlgItemSupremePartnerCityToppingView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58517a(View view) {
        f290.m123604a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m58518b() {
        boolean zM107528u0 = c17.m107528u0();
        AutoVDraweeView autoVDraweeView = this.f38609b;
        if (zM107528u0) {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/462-cI2gUBvB63CVc5elmDJ1.webp");
        } else {
            autoVDraweeView.setImageUrl("https://static.tancdn.com/pe-webplatform/Y4cmpGdRxBwFjgoEczeLm6G7.webp");
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        this.f38612e.setText(userM116600p9.name);
        this.f38610c.setImageUrl(userM116600p9.m61308fp().url);
        this.f38611d.setImageUrl("https://static.tancdn.com/pe-webplatform/ST4GEUBBn7qSuJ-JeRglRJgR.webp");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58517a(this);
        m58518b();
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
