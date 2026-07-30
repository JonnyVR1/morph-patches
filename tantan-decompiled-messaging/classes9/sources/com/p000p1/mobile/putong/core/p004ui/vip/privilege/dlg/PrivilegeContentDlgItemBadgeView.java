package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import l.b3c0;
import l.sab0;
import l.wt80;
import v.AutoVDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeContentDlgItemBadgeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemBadgeView f7522a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f7523b;

    /* JADX INFO: renamed from: c */
    public VText f7524c;

    /* JADX INFO: renamed from: d */
    public VImage f7525d;

    public PrivilegeContentDlgItemBadgeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10806a(View view) {
        wt80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m10807b(Privilege privilege, PurchaseType purchaseType) {
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        this.f7523b.setImageUrl(((Media) userM21483na.fp()).url);
        this.f7524c.setText(userM21483na.name);
        if (sab0.o(purchaseType)) {
            this.f7525d.setImageResource(b3c0.X1);
            return;
        }
        Privilege privilege2 = Privilege.vip_badge;
        VImage vImage = this.f7525d;
        if (privilege == privilege2) {
            vImage.setImageResource(b3c0.Z1);
        } else {
            vImage.setImageResource(b3c0.Y1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10806a(this);
    }

    public PrivilegeContentDlgItemBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
