package com.p051p1.mobile.putong.core.p058ui.intl.greet.message;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.tantanapp.common.utils.NullChecker;
import p153l.apo;
import p153l.cpo;
import p153l.j4n;
import p153l.k4n;
import p153l.non;

/* JADX INFO: loaded from: classes3.dex */
public class IntlDynamicGreetListAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public k4n f30627c;

    /* JADX INFO: renamed from: d */
    public j4n f30628d;

    /* JADX INFO: renamed from: e */
    public Greeting f30629e;

    /* JADX INFO: renamed from: f */
    public String f30630f;

    /* JADX INFO: renamed from: X1 */
    public static Intent m47344X1(Context context, Greeting greeting) {
        return m47345Y1(context, greeting, null);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m47345Y1(Context context, Greeting greeting, String str) {
        Intent intent = new Intent(context, (Class<?>) IntlDynamicGreetListAct.class);
        intent.putExtra("rp_gt", greeting);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public j4n m47346Z1() {
        return this.f30628d;
    }

    /* JADX INFO: renamed from: a2 */
    public k4n m47347a2() {
        return this.f30627c;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30627c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f30630f = getIntent().getStringExtra("from");
        this.f30629e = (Greeting) getIntent().getSerializableExtra("rp_gt");
        this.f30627c = new cpo(this);
        apo apoVar = new apo(this);
        this.f30628d = apoVar;
        apoVar.mo52715C(this.f30627c);
        if (NullChecker.m82486a(this.f30629e)) {
            this.f30627c.f123903c = Boolean.TRUE;
            non.m164148l(this, this.f30629e, NotificationStatus.undefined);
            this.f30629e = null;
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f30628d.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.m82486a(this.f30629e)) {
            this.f30627c.f123903c = Boolean.TRUE;
            non.m164148l(this, this.f30629e, NotificationStatus.undefined);
            this.f30629e = null;
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_message_hi_receive";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102186m();
        }
    }
}
