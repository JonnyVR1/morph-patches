package com.p051p1.mobile.putong.core.p058ui.result;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import java.util.List;
import p153l.fdc0;
import p153l.jyb;
import p153l.pf60;
import p153l.rec0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PurchaseResultAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public String f36451c;

    /* JADX INFO: renamed from: d */
    public String f36452d;

    /* JADX INFO: renamed from: e */
    public String f36453e;

    /* JADX INFO: renamed from: f */
    public String f36454f;

    /* JADX INFO: renamed from: g */
    public String f36455g;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m55916Y1(Context context, String str, String str2, String str3, String str4, String str5) {
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
        if (fragmentManager().m2555h0(fdc0.f98347G0) == null) {
            fragmentManager().m2568m().m2812s(fdc0.f98347G0, PurchaseResultFrag.m55918O4(this.f36451c, this.f36452d, this.f36453e, this.f36454f, this.f36455g)).mo2708i();
        }
        fragmentManager().m2546e0();
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m55917Z1() {
        String str;
        if (ProductCategory.tttVip.equals(this.f36451c)) {
            str = "vip";
        } else if (ProductCategory.tttSeeWhoLikedMe.equals(this.f36451c)) {
            str = "see";
        } else if ("quickchatMembership".equals(this.f36451c)) {
            str = "quickchat";
        } else {
            str = ("coin".equals(this.f36451c) || ProductCategory.noneLiveCoin.equals(this.f36451c) || ProductCategory.tttCoin.equals(this.f36451c) || ProductCategory.tttLiveCoin.equals(this.f36451c)) ? "coin" : "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.pageHelper.m152781p(pf60.m172085a("pageproducttype", str));
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        CoreModule.f18264c.f20396j0.m31588G5("purchase_default", null);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(rec0.f162460K2, (ViewGroup) null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.tgb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174054a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List<Fragment> listM2590t0 = getSupportFragmentManager().m2590t0();
        boolean zM55921o = false;
        if (!jyb.m147479J(listM2590t0) && (listM2590t0.get(0) instanceof PurchaseResultFrag)) {
            zM55921o = ((PurchaseResultFrag) listM2590t0.get(0)).m55921o();
        }
        if (zM55921o) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_pay_result";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f36451c = act().getIntent().getStringExtra("params_category");
        this.f36452d = act().getIntent().getStringExtra("params_order_id");
        this.f36453e = act().getIntent().getStringExtra("params_currency_symbol");
        this.f36454f = act().getIntent().getStringExtra("params_price");
        this.f36455g = act().getIntent().getStringExtra("params_privileges");
        m55917Z1();
    }
}
