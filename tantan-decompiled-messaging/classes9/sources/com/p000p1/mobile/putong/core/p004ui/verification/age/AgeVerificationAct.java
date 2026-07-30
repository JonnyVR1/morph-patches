package com.p000p1.mobile.putong.core.p004ui.verification.age;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.data.Media;
import java.util.List;
import p006l.dc0;
import p006l.tc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AgeVerificationAct extends PutongMvpAct<dc0, tc0> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m9490Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) AgeVerificationAct.class);
        intent.putExtra("FROM", str);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public dc0 mo571V1() {
        return new dc0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public tc0 mo572X1() {
        return new tc0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean disableAutoPV() {
        return true;
    }

    public void finish() {
        super.finish();
        ((tc0) this.f1162d).m24646O();
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((tc0) this.f1162d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        ((dc0) this.f1161c).m13897m0(list);
    }

    public void onTakePictureResult(String str) {
        ((dc0) this.f1161c).m13898n0(str);
    }
}
