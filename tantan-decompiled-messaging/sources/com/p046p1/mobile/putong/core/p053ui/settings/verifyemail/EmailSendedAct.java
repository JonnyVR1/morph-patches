package com.p046p1.mobile.putong.core.p053ui.settings.verifyemail;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.mve;
import p149l.nve;

/* JADX INFO: loaded from: classes9.dex */
public class EmailSendedAct extends PutongMvpAct<mve, nve> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m55684Y1(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) EmailSendedAct.class);
        intent.putExtra("verify_email", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public mve mo28672V1() {
        return new mve(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public nve mo28673X1() {
        return new nve(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((nve) this.f17173d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_download_data_submit_success_view";
    }
}
