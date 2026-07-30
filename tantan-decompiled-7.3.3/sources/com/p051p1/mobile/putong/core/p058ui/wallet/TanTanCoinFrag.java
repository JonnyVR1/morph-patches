package com.p051p1.mobile.putong.core.p058ui.wallet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinFrag;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p153l.fdc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.m8i0;
import p153l.ofc0;
import p153l.qcj;
import p153l.w7i0;
import p153l.xi5;

/* JADX INFO: loaded from: classes12.dex */
public class TanTanCoinFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public w7i0 f39075A;

    /* JADX INFO: renamed from: B */
    public m8i0 f39076B;

    /* JADX INFO: renamed from: C */
    public boolean f39077C;

    /* JADX INFO: renamed from: D */
    public String[] f39078D = {"en", "zh_TW", "zh_HK", "zh", "ko", "ja", "id_ID", "tr_TR", "th", "vi"};

    /* JADX INFO: renamed from: z */
    public boolean f39079z;

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ Boolean m59274M4(String str) {
        String string = Locale.getDefault().toString();
        if ("in_ID".equals(string)) {
            string = "id_ID";
        }
        return Boolean.valueOf(string.contains(str));
    }

    /* JADX INFO: renamed from: O4 */
    public static TanTanCoinFrag m59276O4(boolean z, boolean z2) {
        TanTanCoinFrag tanTanCoinFrag = new TanTanCoinFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("change_top_bg", z);
        bundle.putBoolean("show_recharge_dialog", z2);
        tanTanCoinFrag.setArguments(bundle);
        return tanTanCoinFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ boolean m59277P4(MenuItem menuItem) {
        String str = (String) jyb.m147530s(this.f39078D, new qcj() { // from class: l.e4i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return TanTanCoinFrag.m59274M4((String) obj);
            }
        });
        StringBuilder sb = new StringBuilder("?language=");
        if (!NullChecker.m82486a(str)) {
            str = "en";
        }
        sb.append(str);
        String string = sb.toString();
        String str2 = IntlCountryCodeController.m29125v() ? "&area=US" : "";
        act().startActivity(MkWebViewAct.m81419b2(act(), act().string(R$string.f28166U7), xi5.m211113o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/" + string + str2)));
        i4g0.m138520r("e_bill_button", OMSDialogPositon.p_wallet);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f39079z = getArguments().getBoolean("change_top_bg");
        this.f39077C = getArguments().getBoolean("show_recharge_dialog");
        this.f39075A = new w7i0(this, this);
        m8i0 m8i0Var = new m8i0(this);
        this.f39076B = m8i0Var;
        this.f39075A.mo52715C(m8i0Var);
        this.f39075A.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f39075A.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f39075A.m205330U0(this.f39079z);
        this.f39075A.m205328D1(this.f39077C);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f39076B.inflateView(layoutInflater, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        CoreModule.m30933P().m143405a().mo34283A4(act());
        menuInflater.inflate(ofc0.f147065a, menu);
        menu.findItem(fdc0.f98437r0).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.d4i0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f85051a.m59277P4(menuItem);
            }
        });
        act().pendChangeActionButtonTypeface();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return OMSDialogPositon.p_wallet;
    }
}
