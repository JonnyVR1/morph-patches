package com.p046p1.mobile.putong.core.p053ui.result;

import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import p149l.d9b0;
import p149l.w8b0;

/* JADX INFO: loaded from: classes9.dex */
public class PurchaseResultFrag extends PutongMvpFrag<w8b0, d9b0> {
    /* JADX INFO: renamed from: O4 */
    public static PurchaseResultFrag m54735O4(String str, String str2, String str3, String str4, String str5) {
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

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public w8b0 mo29641M4() {
        return new w8b0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public d9b0 mo29642N4() {
        return new d9b0(act(), this);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        ((d9b0) this.f17174A).m110444v(getArguments());
    }

    /* JADX INFO: renamed from: o */
    public boolean m54738o() {
        return ((d9b0) this.f17174A).m110438o();
    }
}
