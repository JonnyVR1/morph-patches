package com.p000p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import p009l.n46;
import p009l.y46;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationAddressBookAct extends PutongCoreMvpAct<n46, y46> {

    /* JADX INFO: renamed from: f */
    public final y46 f4083f = new y46(this);

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public n46 m5971X1() {
        return new n46(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public y46 m5972Y1() {
        return this.f4083f;
    }

    public boolean isAnonymousMode() {
        return false;
    }

    public boolean needBindBillingService() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        this.f4083f.m25195k(i, i2, intent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onSaveInstanceState(bundle);
        bundle.putInt("currentIndex", this.f4083f.m25191f());
    }

    public String pageId() {
        return "p_contacts";
    }
}
