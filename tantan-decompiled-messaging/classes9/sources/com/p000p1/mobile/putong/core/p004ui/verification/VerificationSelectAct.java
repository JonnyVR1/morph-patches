package com.p000p1.mobile.putong.core.p004ui.verification;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.util.verificationoptimization.VerificationAct;
import com.p1.mobile.putong.facertification.a;
import com.p1.mobile.putong.oms.OmsBaseRender;
import com.tantanapp.common.utils.NullChecker;
import l.nc50;
import l.puk0;
import p006l.bvk0;
import p006l.evk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerificationSelectAct extends PutongMvpAct<bvk0, evk0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m9443Z1(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) VerificationSelectAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m9444c2() {
        OmsBaseRender omsBaseRenderI = nc50.f().i();
        if (NullChecker.a(omsBaseRenderI)) {
            omsBaseRenderI.Q();
        }
        if (puk0.e().f()) {
            return;
        }
        Act act = ((Act) this).act;
        act.startActivity(VerificationAct.m2(act, 4, ""));
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bvk0 mo571V1() {
        return new bvk0(this, this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public evk0 mo572X1() {
        return new evk0(this);
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (TextUtils.equals(((bvk0) this.f1161c).f9110b, "fromNameVerificationDlg") && a.e(intent)) {
            a.f(this, intent, new Runnable() { // from class: l.zuk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28988a.m9444c2();
                }
            }, (Runnable) null);
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_authentication_method";
    }
}
