package com.p046p1.mobile.putong.core.p053ui.vip.privilege;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import p149l.eb2;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PrivilegeBaseCard extends ConstraintLayout {
    public PrivilegeBaseCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public abstract void mo56836h0(eb2 eb2Var, PutongFrag putongFrag, PurchaseType purchaseType);

    /* JADX INFO: renamed from: i0 */
    public abstract void mo56837i0();

    /* JADX INFO: renamed from: j0 */
    public abstract void mo56838j0();

    public PrivilegeBaseCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeBaseCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
