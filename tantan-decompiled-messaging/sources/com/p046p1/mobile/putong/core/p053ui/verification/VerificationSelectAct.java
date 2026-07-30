package com.p046p1.mobile.putong.core.p053ui.verification;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.util.verificationoptimization.VerificationAct;
import com.p046p1.mobile.putong.facertification.C10732a;
import com.p046p1.mobile.putong.oms.OmsBaseRender;
import com.tantanapp.common.utils.NullChecker;
import p149l.bvk0;
import p149l.evk0;
import p149l.nc50;
import p149l.puk0;

/* JADX INFO: loaded from: classes9.dex */
public class VerificationSelectAct extends PutongMvpAct<bvk0, evk0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m56020Z1(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) VerificationSelectAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m56021c2() {
        OmsBaseRender omsBaseRenderM158920i = nc50.m158912f().m158920i();
        if (NullChecker.m81303a(omsBaseRenderM158920i)) {
            omsBaseRenderM158920i.m79257Q();
        }
        if (puk0.m171431e().m171435f()) {
            return;
        }
        Act act = this.act;
        act.startActivity(VerificationAct.m59464m2(act, 4, ""));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bvk0 mo28672V1() {
        return new bvk0(this, this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public evk0 mo28673X1() {
        return new evk0(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (TextUtils.equals(((bvk0) this.f17172c).f77470b, "fromNameVerificationDlg") && C10732a.m60218e(intent)) {
            C10732a.m60219f(this, intent, new Runnable() { // from class: l.zuk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204861a.m56021c2();
                }
            }, null);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_authentication_method";
    }
}
