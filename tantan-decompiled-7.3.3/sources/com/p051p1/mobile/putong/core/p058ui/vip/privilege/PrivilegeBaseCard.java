package com.p051p1.mobile.putong.core.p058ui.vip.privilege;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import p153l.lb2;

/* JADX INFO: loaded from: classes12.dex */
public abstract class PrivilegeBaseCard extends ConstraintLayout {
    public PrivilegeBaseCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public abstract void mo58019h0(lb2 lb2Var, PutongFrag putongFrag, PurchaseType purchaseType);

    /* JADX INFO: renamed from: i0 */
    public abstract void mo58020i0();

    /* JADX INFO: renamed from: j0 */
    public abstract void mo58021j0();

    public PrivilegeBaseCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeBaseCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
