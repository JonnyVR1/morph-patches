package com.p046p1.mobile.putong.core.p053ui.intl.greet.message;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.tantanapp.common.utils.NullChecker;
import p149l.ano;
import p149l.cno;
import p149l.j2n;
import p149l.k2n;
import p149l.nmn;

/* JADX INFO: loaded from: classes10.dex */
public class IntlDynamicGreetListAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public k2n f29779c;

    /* JADX INFO: renamed from: d */
    public j2n f29780d;

    /* JADX INFO: renamed from: e */
    public Greeting f29781e;

    /* JADX INFO: renamed from: f */
    public String f29782f;

    /* JADX INFO: renamed from: V1 */
    public static Intent m46161V1(Context context, Greeting greeting) {
        return m46162X1(context, greeting, null);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m46162X1(Context context, Greeting greeting, String str) {
        Intent intent = new Intent(context, (Class<?>) IntlDynamicGreetListAct.class);
        intent.putExtra("rp_gt", greeting);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public j2n m46163Y1() {
        return this.f29780d;
    }

    /* JADX INFO: renamed from: Z1 */
    public k2n m46164Z1() {
        return this.f29779c;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29779c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29782f = getIntent().getStringExtra("from");
        this.f29781e = (Greeting) getIntent().getSerializableExtra("rp_gt");
        this.f29779c = new cno(this);
        ano anoVar = new ano(this);
        this.f29780d = anoVar;
        anoVar.mo51532C(this.f29779c);
        if (NullChecker.m81303a(this.f29781e)) {
            this.f29779c.f120751c = Boolean.TRUE;
            nmn.m160126l(this, this.f29781e, NotificationStatus.undefined);
            this.f29781e = null;
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29780d.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.m81303a(this.f29781e)) {
            this.f29779c.f120751c = Boolean.TRUE;
            nmn.m160126l(this, this.f29781e, NotificationStatus.undefined);
            this.f29781e = null;
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_intl_message_hi_receive";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134126m();
        }
    }
}
