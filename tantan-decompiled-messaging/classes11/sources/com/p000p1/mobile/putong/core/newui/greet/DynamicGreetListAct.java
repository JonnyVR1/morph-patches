package com.p000p1.mobile.putong.core.newui.greet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import p009l.hhe;
import p009l.ihe;
import p009l.nj2;
import p009l.oj2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DynamicGreetListAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public oj2 f262c;

    /* JADX INFO: renamed from: d */
    public nj2 f263d;

    /* JADX INFO: renamed from: e */
    public Greeting f264e;

    /* JADX INFO: renamed from: f */
    public String f265f;

    /* JADX INFO: renamed from: V1 */
    public static Intent m383V1(Context context, Greeting greeting) {
        return m384X1(context, greeting, null);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m384X1(Context context, Greeting greeting, String str) {
        Intent intent = new Intent(context, (Class<?>) DynamicGreetListAct.class);
        intent.putExtra("rp_gt", (Serializable) greeting);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public boolean m385Y1() {
        return TextUtils.equals(this.f265f, "from_meet");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z1 */
    public boolean m386Z1() {
        if (TextUtils.equals(this.f265f, "from_anonymous_greeting")) {
            return true;
        }
        if (this.f264e == null) {
            this.f264e = getIntent().getSerializableExtra("rp_gt");
        }
        return NullChecker.a(this.f264e) && TEnum.equals(this.f264e.channel, "anonymous");
    }

    /* JADX INFO: renamed from: a2 */
    public boolean m387a2() {
        return false;
    }

    /* JADX INFO: renamed from: b2 */
    public nj2 m388b2() {
        return this.f263d;
    }

    /* JADX INFO: renamed from: c2 */
    public oj2 m389c2() {
        return this.f262c;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f262c.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        this.f265f = getIntent().getStringExtra("from");
        this.f264e = getIntent().getSerializableExtra("rp_gt");
        super.initDataOnCreate();
        this.f262c = new ihe(this);
        hhe hheVar = new hhe(this);
        this.f263d = hheVar;
        hheVar.C(this.f262c);
        if (NullChecker.a(this.f264e)) {
            this.f262c.f18076d = Boolean.TRUE;
            d.i(this, this.f264e, "undefined");
            this.f264e = null;
        }
    }

    public void initPageHelper() {
        super.initPageHelper();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f263d.mo15712a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.a(this.f264e)) {
            this.f262c.f18076d = Boolean.TRUE;
            d.i(this, this.f264e, "undefined");
            this.f264e = null;
        }
    }

    public String pageId() {
        return m385Y1() ? "p_meet_message_box" : "p_kankan_stranger_message";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().m();
        }
    }
}
