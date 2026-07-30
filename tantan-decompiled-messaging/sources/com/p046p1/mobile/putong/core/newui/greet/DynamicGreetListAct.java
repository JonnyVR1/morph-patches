package com.p046p1.mobile.putong.core.newui.greet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p149l.hhe;
import p149l.ihe;
import p149l.nj2;
import p149l.oj2;

/* JADX INFO: loaded from: classes11.dex */
public class DynamicGreetListAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public oj2 f21484c;

    /* JADX INFO: renamed from: d */
    public nj2 f21485d;

    /* JADX INFO: renamed from: e */
    public Greeting f21486e;

    /* JADX INFO: renamed from: f */
    public String f21487f;

    /* JADX INFO: renamed from: V1 */
    public static Intent m36454V1(Context context, Greeting greeting) {
        return m36455X1(context, greeting, null);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m36455X1(Context context, Greeting greeting, String str) {
        Intent intent = new Intent(context, (Class<?>) DynamicGreetListAct.class);
        intent.putExtra("rp_gt", greeting);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public boolean m36456Y1() {
        return TextUtils.equals(this.f21487f, "from_meet");
    }

    /* JADX INFO: renamed from: Z1 */
    public boolean m36457Z1() {
        if (TextUtils.equals(this.f21487f, "from_anonymous_greeting")) {
            return true;
        }
        if (this.f21486e == null) {
            this.f21486e = (Greeting) getIntent().getSerializableExtra("rp_gt");
        }
        return NullChecker.m81303a(this.f21486e) && TEnum.equals(this.f21486e.channel, "anonymous");
    }

    /* JADX INFO: renamed from: a2 */
    public boolean m36458a2() {
        return false;
    }

    /* JADX INFO: renamed from: b2 */
    public nj2 m36459b2() {
        return this.f21485d;
    }

    /* JADX INFO: renamed from: c2 */
    public oj2 m36460c2() {
        return this.f21484c;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f21484c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f21487f = getIntent().getStringExtra("from");
        this.f21486e = (Greeting) getIntent().getSerializableExtra("rp_gt");
        super.initDataOnCreate();
        this.f21484c = new ihe(this);
        hhe hheVar = new hhe(this);
        this.f21485d = hheVar;
        hheVar.mo51532C(this.f21484c);
        if (NullChecker.m81303a(this.f21486e)) {
            this.f21484c.f144223d = Boolean.TRUE;
            C8360d.m45900i(this, this.f21486e, NotificationStatus.undefined);
            this.f21486e = null;
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f21485d.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.m81303a(this.f21486e)) {
            this.f21484c.f144223d = Boolean.TRUE;
            C8360d.m45900i(this, this.f21486e, NotificationStatus.undefined);
            this.f21486e = null;
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return m36456Y1() ? "p_meet_message_box" : "p_kankan_stranger_message";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134126m();
        }
    }
}
