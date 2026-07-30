package com.p051p1.mobile.putong.core.newui.greet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p153l.lie;
import p153l.mie;
import p153l.vj2;
import p153l.wj2;

/* JADX INFO: loaded from: classes11.dex */
public class DynamicGreetListAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public wj2 f22226c;

    /* JADX INFO: renamed from: d */
    public vj2 f22227d;

    /* JADX INFO: renamed from: e */
    public Greeting f22228e;

    /* JADX INFO: renamed from: f */
    public String f22229f;

    /* JADX INFO: renamed from: X1 */
    public static Intent m37457X1(Context context, Greeting greeting) {
        return m37458Y1(context, greeting, null);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m37458Y1(Context context, Greeting greeting, String str) {
        Intent intent = new Intent(context, (Class<?>) DynamicGreetListAct.class);
        intent.putExtra("rp_gt", greeting);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public boolean m37459Z1() {
        return TextUtils.equals(this.f22229f, "from_meet");
    }

    /* JADX INFO: renamed from: a2 */
    public boolean m37460a2() {
        if (TextUtils.equals(this.f22229f, "from_anonymous_greeting")) {
            return true;
        }
        if (this.f22228e == null) {
            this.f22228e = (Greeting) getIntent().getSerializableExtra("rp_gt");
        }
        return NullChecker.m82486a(this.f22228e) && TEnum.equals(this.f22228e.channel, "anonymous");
    }

    /* JADX INFO: renamed from: b2 */
    public boolean m37461b2() {
        return false;
    }

    /* JADX INFO: renamed from: c2 */
    public vj2 m37462c2() {
        return this.f22227d;
    }

    /* JADX INFO: renamed from: d2 */
    public wj2 m37463d2() {
        return this.f22226c;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f22226c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f22229f = getIntent().getStringExtra("from");
        this.f22228e = (Greeting) getIntent().getSerializableExtra("rp_gt");
        super.initDataOnCreate();
        this.f22226c = new mie(this);
        lie lieVar = new lie(this);
        this.f22227d = lieVar;
        lieVar.mo52715C(this.f22226c);
        if (NullChecker.m82486a(this.f22228e)) {
            this.f22226c.f189414d = Boolean.TRUE;
            C8523d.m47083i(this, this.f22228e, NotificationStatus.undefined);
            this.f22228e = null;
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f22227d.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.m82486a(this.f22228e)) {
            this.f22226c.f189414d = Boolean.TRUE;
            C8523d.m47083i(this, this.f22228e, NotificationStatus.undefined);
            this.f22228e = null;
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return m37459Z1() ? "p_meet_message_box" : "p_kankan_stranger_message";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102186m();
        }
    }
}
