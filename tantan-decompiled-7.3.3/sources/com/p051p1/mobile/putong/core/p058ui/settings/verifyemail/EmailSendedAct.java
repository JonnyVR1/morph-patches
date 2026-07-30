package com.p051p1.mobile.putong.core.p058ui.settings.verifyemail;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.qwe;
import p153l.rwe;

/* JADX INFO: loaded from: classes12.dex */
public class EmailSendedAct extends PutongMvpAct<qwe, rwe> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m56867Z1(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) EmailSendedAct.class);
        intent.putExtra("verify_email", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public qwe mo29671X1() {
        return new qwe(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public rwe mo29672Y1() {
        return new rwe(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((rwe) this.f17892d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_download_data_submit_success_view";
    }
}
