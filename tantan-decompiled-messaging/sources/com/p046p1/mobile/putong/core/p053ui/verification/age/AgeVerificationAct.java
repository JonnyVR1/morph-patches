package com.p046p1.mobile.putong.core.p053ui.verification.age;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.data.Media;
import java.util.List;
import p149l.dc0;
import p149l.tc0;

/* JADX INFO: loaded from: classes9.dex */
public class AgeVerificationAct extends PutongMvpAct<dc0, tc0> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m56065Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) AgeVerificationAct.class);
        intent.putExtra("FROM", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public dc0 mo28672V1() {
        return new dc0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public tc0 mo28673X1() {
        return new tc0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        ((tc0) this.f17173d).m187961O();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((tc0) this.f17173d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        ((dc0) this.f17172c).m110660m0(list);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onTakePictureResult(String str) {
        ((dc0) this.f17172c).m110661n0(str);
    }
}
