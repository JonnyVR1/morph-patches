package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.User;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.b3c0;
import p149l.sab0;
import p149l.wt80;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeContentDlgItemBadgeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemBadgeView f37741a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f37742b;

    /* JADX INFO: renamed from: c */
    public VText f37743c;

    /* JADX INFO: renamed from: d */
    public VImage f37744d;

    public PrivilegeContentDlgItemBadgeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57323a(View view) {
        wt80.m205534a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57324b(Privilege privilege, PurchaseType purchaseType) {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        this.f37742b.setImageUrl(userM169520na.m60124fp().url);
        this.f37743c.setText(userM169520na.name);
        if (sab0.m182897o(purchaseType)) {
            this.f37744d.setImageResource(b3c0.f72983X1);
            return;
        }
        Privilege privilege2 = Privilege.vip_badge;
        VImage vImage = this.f37744d;
        if (privilege == privilege2) {
            vImage.setImageResource(b3c0.f72997Z1);
        } else {
            vImage.setImageResource(b3c0.f72990Y1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57323a(this);
    }

    public PrivilegeContentDlgItemBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
