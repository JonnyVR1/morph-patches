package com.p000p1.mobile.putong.core.p004ui.settings.verifyemail;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.android.app.Act;
import p006l.mve;
import p006l.nve;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class EmailSendedAct extends PutongMvpAct<mve, nve> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m9081Y1(Act act, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) EmailSendedAct.class);
        intent.putExtra("verify_email", str);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public mve mo571V1() {
        return new mve(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public nve mo572X1() {
        return new nve(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((nve) this.f1162d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_download_data_submit_success_view";
    }
}
