package com.p046p1.mobile.putong.core.p053ui.verification;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p046p1.mobile.putong.facertification.C10732a;
import com.tantanapp.common.utils.NullChecker;
import p149l.jjb0;
import p149l.rol;
import p149l.tsi0;
import p149l.upa;

/* JADX INFO: loaded from: classes9.dex */
public class VerificationCenterAct extends PutongAct implements tsi0, rol {
    /* JADX INFO: renamed from: V1 */
    public static Intent m55990V1(Context context, String str, IdentifyView.TipType tipType) {
        Intent intent = new Intent(context, (Class<?>) VerificationCenterAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("from", str);
        }
        if (NullChecker.m81303a(tipType)) {
            intent.putExtra("tip_type", tipType.name());
        }
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m55991X1(Context context, boolean z) {
        return m55992Y1(context, z, null);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m55992Y1(Context context, boolean z, String str) {
        return m55993Z1(context, z, str, null);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m55993Z1(Context context, boolean z, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) VerificationCenterAct.class);
        if (z) {
            intent.addFlags(268435456);
            intent.addFlags(524288);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("from", str);
        }
        intent.putExtra("action", str2);
        return intent;
    }

    @Override // p149l.tsi0
    /* JADX INFO: renamed from: F */
    public boolean mo36583F() {
        return false;
    }

    /* JADX INFO: renamed from: a2 */
    public Fragment m55994a2() {
        return fragmentManager().m2554h0(R.id.content);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        if (upa.m194629E2()) {
            CoreModule.f17545c.f19552B0.m31619r4("question");
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (fragmentManager().m2554h0(R.id.content) != null) {
            return null;
        }
        fragmentManager().m2567m().m2811s(R.id.content, jjb0.m141784b() ? CertificationCenterFrag.m55985M4(act().getIntent().getStringExtra("from")) : new VerificationCenterFrag()).mo2707i();
        fragmentManager().m2545e0();
        return null;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (C10732a.m60218e(intent)) {
            C10732a.m60219f(this, intent, null, null);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onTakePictureResult(String str) {
        Fragment fragmentM55994a2 = m55994a2();
        if (fragmentM55994a2 instanceof VerificationCenterFrag) {
            ((VerificationCenterFrag) fragmentM55994a2).m55995M4(str);
        } else if (fragmentM55994a2 instanceof CertificationCenterFrag) {
            ((CertificationCenterFrag) fragmentM55994a2).m55986N4(str);
        } else if (fragmentM55994a2 instanceof CertCenterV2Frag) {
            ((CertCenterV2Frag) fragmentM55994a2).m55979M4(str);
        }
    }
}
