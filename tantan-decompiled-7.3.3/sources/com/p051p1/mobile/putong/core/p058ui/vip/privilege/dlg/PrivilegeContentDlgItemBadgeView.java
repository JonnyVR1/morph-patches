package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.User;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.a290;
import p153l.gbc0;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeContentDlgItemBadgeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemBadgeView f38589a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f38590b;

    /* JADX INFO: renamed from: c */
    public VText f38591c;

    /* JADX INFO: renamed from: d */
    public VImage f38592d;

    public PrivilegeContentDlgItemBadgeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58506a(View view) {
        a290.m95618a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m58507b(Privilege privilege, PurchaseType purchaseType) {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        this.f38590b.setImageUrl(userM116593na.m61308fp().url);
        this.f38591c.setText(userM116593na.name);
        if (wib0.m206571o(purchaseType)) {
            this.f38592d.setImageResource(gbc0.f103234X1);
            return;
        }
        Privilege privilege2 = Privilege.vip_badge;
        VImage vImage = this.f38592d;
        if (privilege == privilege2) {
            vImage.setImageResource(gbc0.f103248Z1);
        } else {
            vImage.setImageResource(gbc0.f103241Y1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58506a(this);
    }

    public PrivilegeContentDlgItemBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
