package com.p000p1.mobile.putong.core.p004ui.wallet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinOtherAct;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.vwb;
import l.w9j;
import l.zvf0;
import p006l.wxh0;
import p006l.xh5;
import p006l.yxh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TanTanCoinOtherAct extends PutongMvpAct<wxh0, yxh0> {

    /* JADX INFO: renamed from: e */
    public String[] f8025e = {"en", "zh_TW", "zh_HK", "zh", "ko", "ja", "id_ID", "tr_TR"};

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ Boolean m11657Z1(String str) {
        String string = Locale.getDefault().toString();
        if ("in_ID".equals(string)) {
            string = "id_ID";
        }
        return Boolean.valueOf(string.contains(str));
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m11658a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) TanTanCoinOtherAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ boolean m11659d2(MenuItem menuItem) {
        String str = (String) vwb.s(this.f8025e, new w9j() { // from class: l.nxh0
            public final Object call(Object obj) {
                return TanTanCoinOtherAct.m11657Z1((String) obj);
            }
        });
        StringBuilder sb = new StringBuilder("?language=");
        if (!NullChecker.a(str)) {
            str = "en";
        }
        sb.append(str);
        String string = sb.toString();
        String str2 = IntlCountryCodeController.m21v() ? "&area=US" : "";
        act().startActivity(AccessTokenWebViewAct.Z1(act(), act().string(R.string.U7), xh5.m27256o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/" + string + str2)));
        zvf0.r("e_bill_button", "p_wallet");
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public wxh0 mo571V1() {
        return new wxh0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public yxh0 mo572X1() {
        return new yxh0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(act().actionItemPadding(act().getString(R.string.U7))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.mxh0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f17352a.m11659d2(menuItem);
            }
        }).setShowAsAction(2);
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_wallet_other";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        ((wxh0) this.f1161c).m26877t0(getIntent().getStringExtra("from"));
    }
}
