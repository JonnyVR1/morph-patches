package com.p046p1.mobile.putong.core.p053ui.result;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import java.util.List;
import p149l.e30;
import p149l.j760;
import p149l.m6c0;
import p149l.vwb;
import p149l.z4c0;

/* JADX INFO: loaded from: classes9.dex */
public class PurchaseResultAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public String f35603c;

    /* JADX INFO: renamed from: d */
    public String f35604d;

    /* JADX INFO: renamed from: e */
    public String f35605e;

    /* JADX INFO: renamed from: f */
    public String f35606f;

    /* JADX INFO: renamed from: g */
    public String f35607g;

    /* JADX INFO: renamed from: X1 */
    public static Intent m54733X1(Context context, String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent(context, (Class<?>) PurchaseResultAct.class);
        intent.putExtra("params_category", str);
        intent.putExtra("params_order_id", str2);
        intent.putExtra("params_currency_symbol", str3);
        intent.putExtra("params_price", str4);
        intent.putExtra("params_privileges", str5);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().m2554h0(z4c0.f201471G0) == null) {
            fragmentManager().m2567m().m2811s(z4c0.f201471G0, PurchaseResultFrag.m54735O4(this.f35603c, this.f35604d, this.f35605e, this.f35606f, this.f35607g)).mo2707i();
        }
        fragmentManager().m2545e0();
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m54734Y1() {
        String str;
        if (ProductCategory.tttVip.equals(this.f35603c)) {
            str = "vip";
        } else if (ProductCategory.tttSeeWhoLikedMe.equals(this.f35603c)) {
            str = "see";
        } else if ("quickchatMembership".equals(this.f35603c)) {
            str = "quickchat";
        } else {
            str = ("coin".equals(this.f35603c) || ProductCategory.noneLiveCoin.equals(this.f35603c) || ProductCategory.tttCoin.equals(this.f35603c) || ProductCategory.tttLiveCoin.equals(this.f35603c)) ? "coin" : "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.pageHelper.m109040p(j760.m140076a("pageproducttype", str));
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        CoreModule.f17545c.f19654j0.m30585G5("purchase_default", null);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(m6c0.f131500K2, (ViewGroup) null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.p8b0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147581a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List<Fragment> listM2589t0 = getSupportFragmentManager().m2589t0();
        boolean zM54738o = false;
        if (!vwb.m200296J(listM2589t0) && (listM2589t0.get(0) instanceof PurchaseResultFrag)) {
            zM54738o = ((PurchaseResultFrag) listM2589t0.get(0)).m54738o();
        }
        if (zM54738o) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_pay_result";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f35603c = act().getIntent().getStringExtra("params_category");
        this.f35604d = act().getIntent().getStringExtra("params_order_id");
        this.f35605e = act().getIntent().getStringExtra("params_currency_symbol");
        this.f35606f = act().getIntent().getStringExtra("params_price");
        this.f35607g = act().getIntent().getStringExtra("params_privileges");
        m54734Y1();
    }
}
