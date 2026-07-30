package com.p051p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.d66;
import p153l.s56;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAddressBookAct extends PutongCoreMvpAct<s56, d66> {

    /* JADX INFO: renamed from: f */
    public final d66 f26047f = new d66(this);

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public s56 mo30949Y1() {
        return new s56(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public d66 mo30950Z1() {
        return this.f26047f;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f26047f.m114412k(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("currentIndex", this.f26047f.m114409f());
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_contacts";
    }
}
