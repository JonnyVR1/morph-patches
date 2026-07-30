package com.p051p1.mobile.putong.core.p058ui.wallet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinOtherAct;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p153l.e6i0;
import p153l.g6i0;
import p153l.i4g0;
import p153l.jyb;
import p153l.qcj;
import p153l.xi5;

/* JADX INFO: loaded from: classes12.dex */
public class TanTanCoinOtherAct extends PutongMvpAct<e6i0, g6i0> {

    /* JADX INFO: renamed from: e */
    public String[] f39092e = {"en", "zh_TW", "zh_HK", "zh", "ko", "ja", "id_ID", "tr_TR"};

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ Boolean m59307a2(String str) {
        String string = Locale.getDefault().toString();
        if ("in_ID".equals(string)) {
            string = "id_ID";
        }
        return Boolean.valueOf(string.contains(str));
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m59308b2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) TanTanCoinOtherAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ boolean m59309e2(MenuItem menuItem) {
        String str = (String) jyb.m147530s(this.f39092e, new qcj() { // from class: l.v5i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return TanTanCoinOtherAct.m59307a2((String) obj);
            }
        });
        StringBuilder sb = new StringBuilder("?language=");
        if (!NullChecker.m82486a(str)) {
            str = "en";
        }
        sb.append(str);
        String string = sb.toString();
        String str2 = IntlCountryCodeController.m29125v() ? "&area=US" : "";
        act().startActivity(AccessTokenWebViewAct.m81333a2(act(), act().string(R$string.f28166U7), xi5.m211113o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/" + string + str2)));
        i4g0.m138520r("e_bill_button", OMSDialogPositon.p_wallet);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public e6i0 mo29671X1() {
        return new e6i0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public g6i0 mo29672Y1() {
        return new g6i0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(act().actionItemPadding(act().getString(R$string.f28166U7))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.u5i0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f177638a.m59309e2(menuItem);
            }
        }).setShowAsAction(2);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_wallet_other";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        ((e6i0) this.f17891c).m119597t0(getIntent().getStringExtra("from"));
    }
}
