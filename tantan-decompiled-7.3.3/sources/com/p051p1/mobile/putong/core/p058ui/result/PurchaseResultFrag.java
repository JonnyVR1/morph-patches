package com.p051p1.mobile.putong.core.p058ui.result;

import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import p153l.ahb0;
import p153l.hhb0;

/* JADX INFO: loaded from: classes12.dex */
public class PurchaseResultFrag extends PutongMvpFrag<ahb0, hhb0> {
    /* JADX INFO: renamed from: O4 */
    public static PurchaseResultFrag m55918O4(String str, String str2, String str3, String str4, String str5) {
        PurchaseResultFrag purchaseResultFrag = new PurchaseResultFrag();
        Bundle bundle = new Bundle();
        bundle.putString("params_category", str);
        bundle.putString("params_order_id", str2);
        bundle.putString("params_currency_symbol", str3);
        bundle.putString("params_price", str4);
        bundle.putString("params_privileges", str5);
        purchaseResultFrag.setArguments(bundle);
        return purchaseResultFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public ahb0 mo30639M4() {
        return new ahb0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public hhb0 mo30640N4() {
        return new hhb0(act(), this);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        ((hhb0) this.f17893A).m135060v(getArguments());
    }

    /* JADX INFO: renamed from: o */
    public boolean m55921o() {
        return ((hhb0) this.f17893A).m135054o();
    }
}
