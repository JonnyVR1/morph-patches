package com.p051p1.mobile.putong.core.p058ui.verification.age;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.data.Media;
import java.util.List;
import p153l.pc0;
import p153l.zb0;

/* JADX INFO: loaded from: classes12.dex */
public class AgeVerificationAct extends PutongMvpAct<zb0, pc0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m57248Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) AgeVerificationAct.class);
        intent.putExtra("FROM", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public zb0 mo29671X1() {
        return new zb0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public pc0 mo29672Y1() {
        return new pc0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        ((pc0) this.f17892d).m171589O();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((pc0) this.f17892d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        ((zb0) this.f17891c).m219155m0(list);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onTakePictureResult(String str) {
        ((zb0) this.f17891c).m219156n0(str);
    }
}
