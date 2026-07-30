package com.p000p1.mobile.putong.core.p004ui.wallet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinFrag;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.k7c0;
import l.vwb;
import l.w9j;
import l.z4c0;
import l.zvf0;
import p006l.e0i0;
import p006l.ozh0;
import p006l.xh5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TanTanCoinFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public ozh0 f8008A;

    /* JADX INFO: renamed from: B */
    public e0i0 f8009B;

    /* JADX INFO: renamed from: C */
    public boolean f8010C;

    /* JADX INFO: renamed from: D */
    public String[] f8011D = {"en", "zh_TW", "zh_HK", "zh", "ko", "ja", "id_ID", "tr_TR", "th", "vi"};

    /* JADX INFO: renamed from: z */
    public boolean f8012z;

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ Boolean m11623M4(String str) {
        String string = Locale.getDefault().toString();
        if ("in_ID".equals(string)) {
            string = "id_ID";
        }
        return Boolean.valueOf(string.contains(str));
    }

    /* JADX INFO: renamed from: O4 */
    public static TanTanCoinFrag m11625O4(boolean z, boolean z2) {
        TanTanCoinFrag tanTanCoinFrag = new TanTanCoinFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("change_top_bg", z);
        bundle.putBoolean("show_recharge_dialog", z2);
        tanTanCoinFrag.setArguments(bundle);
        return tanTanCoinFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ boolean m11626P4(MenuItem menuItem) {
        String str = (String) vwb.s(this.f8011D, new w9j() { // from class: l.wvh0
            public final Object call(Object obj) {
                return TanTanCoinFrag.m11623M4((String) obj);
            }
        });
        StringBuilder sb = new StringBuilder("?language=");
        if (!NullChecker.a(str)) {
            str = "en";
        }
        sb.append(str);
        String string = sb.toString();
        String str2 = IntlCountryCodeController.m21v() ? "&area=US" : "";
        act().startActivity(MkWebViewAct.a2(act(), act().string(R.string.U7), xh5.m27256o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/" + string + str2)));
        zvf0.r("e_bill_button", "p_wallet");
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        this.f8012z = getArguments().getBoolean("change_top_bg");
        this.f8010C = getArguments().getBoolean("show_recharge_dialog");
        this.f8008A = new ozh0(this, this);
        e0i0 e0i0Var = new e0i0(this);
        this.f8009B = e0i0Var;
        this.f8008A.C(e0i0Var);
        this.f8008A.m20975Z();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        this.f8008A.m20976a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m11627g4(Bundle bundle) {
        super.g4(bundle);
        this.f8008A.m20970U0(this.f8012z);
        this.f8008A.m20968D1(this.f8010C);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f8009B.inflateView(layoutInflater, viewGroup);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        CoreModule.m1854P().m11706a().m5217A4(act());
        menuInflater.inflate(k7c0.a, menu);
        menu.findItem(z4c0.r0).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.vvh0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f24485a.m11626P4(menuItem);
            }
        });
        act().pendChangeActionButtonTypeface();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return "p_wallet";
    }
}
