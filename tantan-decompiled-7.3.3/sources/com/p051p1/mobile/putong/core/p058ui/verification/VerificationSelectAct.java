package com.p051p1.mobile.putong.core.p058ui.verification;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.util.verificationoptimization.VerificationAct;
import com.p051p1.mobile.putong.facertification.C10895a;
import com.p051p1.mobile.putong.oms.OmsBaseRender;
import com.tantanapp.common.utils.NullChecker;
import p153l.h4l0;
import p153l.k4l0;
import p153l.uk50;
import p153l.v3l0;

/* JADX INFO: loaded from: classes12.dex */
public class VerificationSelectAct extends PutongMvpAct<h4l0, k4l0> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m57203a2(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) VerificationSelectAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m57204d2() {
        OmsBaseRender omsBaseRenderM196480i = uk50.m196472f().m196480i();
        if (NullChecker.m82486a(omsBaseRenderM196480i)) {
            omsBaseRenderM196480i.m80440Q();
        }
        if (v3l0.m199281e().m199285f()) {
            return;
        }
        Act act = this.act;
        act.startActivity(VerificationAct.m60648n2(act, 4, ""));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public h4l0 mo29671X1() {
        return new h4l0(this, this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public k4l0 mo29672Y1() {
        return new k4l0(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (TextUtils.equals(((h4l0) this.f17891c).f107816b, "fromNameVerificationDlg") && C10895a.m61402e(intent)) {
            C10895a.m61403f(this, intent, new Runnable() { // from class: l.f4l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97114a.m57204d2();
                }
            }, null);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_authentication_method";
    }
}
