package com.p000p1.mobile.putong.core.p004ui.vip.privilege;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.eb2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class PrivilegeBaseCard extends ConstraintLayout {
    public PrivilegeBaseCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public abstract void mo10307h0(eb2 eb2Var, PutongFrag putongFrag, PurchaseType purchaseType);

    /* JADX INFO: renamed from: i0 */
    public abstract void mo10308i0();

    /* JADX INFO: renamed from: j0 */
    public abstract void mo10309j0();

    public PrivilegeBaseCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeBaseCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
