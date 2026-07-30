package com.p046p1.mobile.putong.core.p053ui.wallet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinOtherAct;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p149l.vwb;
import p149l.w9j;
import p149l.wxh0;
import p149l.xh5;
import p149l.yxh0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class TanTanCoinOtherAct extends PutongMvpAct<wxh0, yxh0> {

    /* JADX INFO: renamed from: e */
    public String[] f38244e = {"en", "zh_TW", "zh_HK", "zh", "ko", "ja", "id_ID", "tr_TR"};

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ Boolean m58124Z1(String str) {
        String string = Locale.getDefault().toString();
        if ("in_ID".equals(string)) {
            string = "id_ID";
        }
        return Boolean.valueOf(string.contains(str));
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m58125a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) TanTanCoinOtherAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ boolean m58126d2(MenuItem menuItem) {
        String str = (String) vwb.m200347s(this.f38244e, new w9j() { // from class: l.nxh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return TanTanCoinOtherAct.m58124Z1((String) obj);
            }
        });
        StringBuilder sb = new StringBuilder("?language=");
        if (!NullChecker.m81303a(str)) {
            str = "en";
        }
        sb.append(str);
        String string = sb.toString();
        String str2 = IntlCountryCodeController.m28126v() ? "&area=US" : "";
        act().startActivity(AccessTokenWebViewAct.m80150Z1(act(), act().string(R$string.f27318U7), xh5.m208767o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/" + string + str2)));
        zvf0.m220396r("e_bill_button", OMSDialogPositon.p_wallet);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public wxh0 mo28672V1() {
        return new wxh0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public yxh0 mo28673X1() {
        return new yxh0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(act().actionItemPadding(act().getString(R$string.f27318U7))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.mxh0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f136174a.m58126d2(menuItem);
            }
        }).setShowAsAction(2);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_wallet_other";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        ((wxh0) this.f17172c).m206001t0(getIntent().getStringExtra("from"));
    }
}
