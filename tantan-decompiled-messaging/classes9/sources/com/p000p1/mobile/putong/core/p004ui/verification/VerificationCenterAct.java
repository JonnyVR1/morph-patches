package com.p000p1.mobile.putong.core.p004ui.verification;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p1.mobile.putong.facertification.a;
import com.tantanapp.common.utils.NullChecker;
import l.tsi0;
import p006l.jjb0;
import p006l.rol;
import p006l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerificationCenterAct extends PutongAct implements tsi0, rol {
    /* JADX INFO: renamed from: V1 */
    public static Intent m9410V1(Context context, String str, IdentifyView.TipType tipType) {
        Intent intent = new Intent(context, (Class<?>) VerificationCenterAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("from", str);
        }
        if (NullChecker.a(tipType)) {
            intent.putExtra("tip_type", tipType.name());
        }
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m9411X1(Context context, boolean z) {
        return m9412Y1(context, z, null);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m9412Y1(Context context, boolean z, String str) {
        return m9413Z1(context, z, str, null);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m9413Z1(Context context, boolean z, String str, String str2) {
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

    /* JADX INFO: renamed from: F */
    public boolean m9414F() {
        return false;
    }

    /* JADX INFO: renamed from: a2 */
    public Fragment m9415a2() {
        return fragmentManager().h0(R.id.content);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean disableAutoPV() {
        return true;
    }

    public void finish() {
        super.finish();
        if (upa.m25327E2()) {
            CoreModule.f1534c.f3541B0.m3549r4("question");
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (fragmentManager().h0(R.id.content) != null) {
            return null;
        }
        fragmentManager().m().s(R.id.content, jjb0.m17487b() ? CertificationCenterFrag.m9403M4(act().getIntent().getStringExtra("from")) : new VerificationCenterFrag()).i();
        fragmentManager().e0();
        return null;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (a.e(intent)) {
            a.f(this, intent, (Runnable) null, (Runnable) null);
        }
    }

    public void onTakePictureResult(String str) {
        Fragment fragmentM9415a2 = m9415a2();
        if (fragmentM9415a2 instanceof VerificationCenterFrag) {
            ((VerificationCenterFrag) fragmentM9415a2).m9416M4(str);
        } else if (fragmentM9415a2 instanceof CertificationCenterFrag) {
            ((CertificationCenterFrag) fragmentM9415a2).m9404N4(str);
        } else if (fragmentM9415a2 instanceof CertCenterV2Frag) {
            ((CertCenterV2Frag) fragmentM9415a2).m9395M4(str);
        }
    }
}
