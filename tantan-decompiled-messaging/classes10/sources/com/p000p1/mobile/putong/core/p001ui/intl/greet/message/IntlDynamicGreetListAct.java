package com.p000p1.mobile.putong.core.p001ui.intl.greet.message;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.NotificationStatus;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.cno;
import p003l.ano;
import p003l.j2n;
import p003l.k2n;
import p003l.nmn;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlDynamicGreetListAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public k2n f2173c;

    /* JADX INFO: renamed from: d */
    public j2n f2174d;

    /* JADX INFO: renamed from: e */
    public Greeting f2175e;

    /* JADX INFO: renamed from: f */
    public String f2176f;

    /* JADX INFO: renamed from: V1 */
    public static Intent m3529V1(Context context, Greeting greeting) {
        return m3530X1(context, greeting, null);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m3530X1(Context context, Greeting greeting, String str) {
        Intent intent = new Intent(context, (Class<?>) IntlDynamicGreetListAct.class);
        intent.putExtra("rp_gt", greeting);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public j2n m3531Y1() {
        return this.f2174d;
    }

    /* JADX INFO: renamed from: Z1 */
    public k2n m3532Z1() {
        return this.f2173c;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f2173c.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f2176f = getIntent().getStringExtra("from");
        this.f2175e = (Greeting) getIntent().getSerializableExtra("rp_gt");
        this.f2173c = new cno(this);
        ano anoVar = new ano(this);
        this.f2174d = anoVar;
        anoVar.C(this.f2173c);
        if (NullChecker.a(this.f2175e)) {
            this.f2173c.f5416c = Boolean.TRUE;
            nmn.m8355l(this, this.f2175e, NotificationStatus.undefined);
            this.f2175e = null;
        }
    }

    public void initPageHelper() {
        super.initPageHelper();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f2174d.mo5464a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.a(this.f2175e)) {
            this.f2173c.f5416c = Boolean.TRUE;
            nmn.m8355l(this, this.f2175e, NotificationStatus.undefined);
            this.f2175e = null;
        }
    }

    public String pageId() {
        return "p_intl_message_hi_receive";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().m();
        }
    }
}
