package com.p046p1.mobile.putong.core.p053ui.wallet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinFrag;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p149l.e0i0;
import p149l.k7c0;
import p149l.ozh0;
import p149l.vwb;
import p149l.w9j;
import p149l.xh5;
import p149l.z4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class TanTanCoinFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public ozh0 f38227A;

    /* JADX INFO: renamed from: B */
    public e0i0 f38228B;

    /* JADX INFO: renamed from: C */
    public boolean f38229C;

    /* JADX INFO: renamed from: D */
    public String[] f38230D = {"en", "zh_TW", "zh_HK", "zh", "ko", "ja", "id_ID", "tr_TR", "th", "vi"};

    /* JADX INFO: renamed from: z */
    public boolean f38231z;

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ Boolean m58091M4(String str) {
        String string = Locale.getDefault().toString();
        if ("in_ID".equals(string)) {
            string = "id_ID";
        }
        return Boolean.valueOf(string.contains(str));
    }

    /* JADX INFO: renamed from: O4 */
    public static TanTanCoinFrag m58093O4(boolean z, boolean z2) {
        TanTanCoinFrag tanTanCoinFrag = new TanTanCoinFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("change_top_bg", z);
        bundle.putBoolean("show_recharge_dialog", z2);
        tanTanCoinFrag.setArguments(bundle);
        return tanTanCoinFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ boolean m58094P4(MenuItem menuItem) {
        String str = (String) vwb.m200347s(this.f38230D, new w9j() { // from class: l.wvh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return TanTanCoinFrag.m58091M4((String) obj);
            }
        });
        StringBuilder sb = new StringBuilder("?language=");
        if (!NullChecker.m81303a(str)) {
            str = "en";
        }
        sb.append(str);
        String string = sb.toString();
        String str2 = IntlCountryCodeController.m28126v() ? "&area=US" : "";
        act().startActivity(MkWebViewAct.m80236a2(act(), act().string(R$string.f27318U7), xh5.m208767o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/" + string + str2)));
        zvf0.m220396r("e_bill_button", OMSDialogPositon.p_wallet);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f38231z = getArguments().getBoolean("change_top_bg");
        this.f38229C = getArguments().getBoolean("show_recharge_dialog");
        this.f38227A = new ozh0(this, this);
        e0i0 e0i0Var = new e0i0(this);
        this.f38228B = e0i0Var;
        this.f38227A.mo51532C(e0i0Var);
        this.f38227A.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f38227A.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f38227A.m166823U0(this.f38231z);
        this.f38227A.m166821D1(this.f38229C);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f38228B.inflateView(layoutInflater, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        CoreModule.m29935P().m94651a().mo33280A4(act());
        menuInflater.inflate(k7c0.f121568a, menu);
        menu.findItem(z4c0.f201561r0).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.vvh0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f183229a.m58094P4(menuItem);
            }
        });
        act().pendChangeActionButtonTypeface();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return OMSDialogPositon.p_wallet;
    }
}
