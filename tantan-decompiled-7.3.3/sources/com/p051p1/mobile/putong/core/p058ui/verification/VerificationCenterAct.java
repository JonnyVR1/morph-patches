package com.p051p1.mobile.putong.core.p058ui.verification;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p051p1.mobile.putong.facertification.C10895a;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import p153l.crl;
import p153l.gra;
import p153l.nrb0;
import p153l.w1j0;

/* JADX INFO: loaded from: classes12.dex */
public class VerificationCenterAct extends PutongAct implements w1j0, crl {
    /* JADX INFO: renamed from: X1 */
    public static Intent m57173X1(Context context, String str, IdentifyView.TipType tipType) {
        Intent intent = new Intent(context, (Class<?>) VerificationCenterAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("from", str);
        }
        if (NullChecker.m82486a(tipType)) {
            intent.putExtra("tip_type", tipType.name());
        }
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m57174Y1(Context context, boolean z) {
        return m57175Z1(context, z, null);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m57175Z1(Context context, boolean z, String str) {
        return m57176a2(context, z, str, null);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m57176a2(Context context, boolean z, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) VerificationCenterAct.class);
        if (z) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.addFlags(524288);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("from", str);
        }
        intent.putExtra("action", str2);
        return intent;
    }

    @Override // p153l.w1j0
    /* JADX INFO: renamed from: G */
    public boolean mo37586G() {
        return false;
    }

    /* JADX INFO: renamed from: b2 */
    public Fragment m57177b2() {
        return fragmentManager().m2555h0(R.id.content);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        if (gra.m131560E2()) {
            CoreModule.f18264c.f20294B0.m32622r4("question");
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (fragmentManager().m2555h0(R.id.content) != null) {
            return null;
        }
        fragmentManager().m2568m().m2812s(R.id.content, nrb0.m164466b() ? CertificationCenterFrag.m57168M4(act().getIntent().getStringExtra("from")) : new VerificationCenterFrag()).mo2708i();
        fragmentManager().m2546e0();
        return null;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (C10895a.m61402e(intent)) {
            C10895a.m61403f(this, intent, null, null);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onTakePictureResult(String str) {
        Fragment fragmentM57177b2 = m57177b2();
        if (fragmentM57177b2 instanceof VerificationCenterFrag) {
            ((VerificationCenterFrag) fragmentM57177b2).m57178M4(str);
        } else if (fragmentM57177b2 instanceof CertificationCenterFrag) {
            ((CertificationCenterFrag) fragmentM57177b2).m57169N4(str);
        } else if (fragmentM57177b2 instanceof CertCenterV2Frag) {
            ((CertCenterV2Frag) fragmentM57177b2).m57162M4(str);
        }
    }
}
