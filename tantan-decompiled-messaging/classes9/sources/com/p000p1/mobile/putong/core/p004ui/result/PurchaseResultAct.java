package com.p000p1.mobile.putong.core.p004ui.result;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import java.util.List;
import l.e30;
import l.j760;
import l.m6c0;
import l.vwb;
import l.z4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PurchaseResultAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public String f5384c;

    /* JADX INFO: renamed from: d */
    public String f5385d;

    /* JADX INFO: renamed from: e */
    public String f5386e;

    /* JADX INFO: renamed from: f */
    public String f5387f;

    /* JADX INFO: renamed from: g */
    public String f5388g;

    /* JADX INFO: renamed from: X1 */
    public static Intent m8090X1(Context context, String str, String str2, String str3, String str4, String str5) {
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
        if (fragmentManager().h0(z4c0.G0) == null) {
            fragmentManager().m().s(z4c0.G0, PurchaseResultFrag.m8092O4(this.f5384c, this.f5385d, this.f5386e, this.f5387f, this.f5388g)).i();
        }
        fragmentManager().e0();
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m8091Y1() {
        String str;
        if ("tttVip".equals(this.f5384c)) {
            str = "vip";
        } else if ("tttSeeWhoLikedMe".equals(this.f5384c)) {
            str = "see";
        } else if ("quickchatMembership".equals(this.f5384c)) {
            str = "quickchat";
        } else {
            str = ("coin".equals(this.f5384c) || "noneLiveCoin".equals(this.f5384c) || "tttCoin".equals(this.f5384c) || "tttLiveCoin".equals(this.f5384c)) ? "coin" : "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.pageHelper.p(new j760[]{j760.a("pageproducttype", str)});
    }

    public void finish() {
        super.finish();
        CoreModule.f1534c.f3643j0.m2513G5("purchase_default", null);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(m6c0.K2, (ViewGroup) null);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.p8b0
            public final void call(Object obj) {
                this.f18632a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
        List listT0 = getSupportFragmentManager().t0();
        boolean zM8096o = false;
        if (!vwb.J(listT0) && (listT0.get(0) instanceof PurchaseResultFrag)) {
            zM8096o = ((PurchaseResultFrag) listT0.get(0)).m8096o();
        }
        if (zM8096o) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_pay_result";
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f5384c = act().getIntent().getStringExtra("params_category");
        this.f5385d = act().getIntent().getStringExtra("params_order_id");
        this.f5386e = act().getIntent().getStringExtra("params_currency_symbol");
        this.f5387f = act().getIntent().getStringExtra("params_price");
        this.f5388g = act().getIntent().getStringExtra("params_privileges");
        m8091Y1();
    }
}
