package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.IdCard;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import l.d30;
import l.e30;
import l.jq2;
import l.mcr;
import l.o6j0;
import l.oyx;
import l.rc2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class t420 extends jq2<yxl> {

    /* JADX INFO: renamed from: a */
    public boolean f21867a;

    /* JADX INFO: renamed from: b */
    public String f21868b;

    /* JADX INFO: renamed from: c */
    public boolean f21869c;

    public t420(mcr mcrVar) {
        super(mcrVar);
        this.f21869c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m24440l0(Bundle bundle) {
        ((yxl) ((jq2) this).viewModel).mo13167A3(this.f21868b);
    }

    /* JADX INFO: renamed from: a0 */
    public void m24441a0() {
        this.f21869c = act().getIntent().getBooleanExtra("new_process", false);
        creates(new e30() { // from class: l.q420
            public final void call(Object obj) {
                this.f19562a.m24440l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m24442h0() {
        Pair<String, String> pairMo13172l3 = ((yxl) ((jq2) this).viewModel).mo13172l3();
        String str = (String) pairMo13172l3.first;
        String str2 = (String) pairMo13172l3.second;
        if (!p420.m21037u(str2)) {
            ((yxl) ((jq2) this).viewModel).mo13170J2(act().getString(R$string.f2651k8));
            return;
        }
        if (!p420.m21032p(str2)) {
            ((yxl) ((jq2) this).viewModel).mo13170J2(act().getString(R$string.f2182Uq));
            o6j0.n("e_id_verification_info_teenager_input", "p_id_verification_info_input_view", new o6j0.a[]{o6j0.a.h("idverifivation_teenager_user_id", qib0.f19805c0.userId()), o6j0.a.h("idverifivation_teenager_user_birthday", p420.m21033q(str2))});
            return;
        }
        IdCard idCardNew_ = IdCard.new_();
        idCardNew_.name = str;
        idCardNew_.number = str2;
        rc2.e().j(idCardNew_);
        m24443i0(act(), this.f21868b);
    }

    /* JADX INFO: renamed from: i0 */
    public void m24443i0(final Act act, final String str) {
        oyx.h(act, new Runnable() { // from class: l.r420
            @Override // java.lang.Runnable
            public final void run() {
                this.f20285a.m24445k0(act, str);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m24444j0(Act act, String str) {
        Pair<String, String> pairMo13172l3 = ((yxl) ((jq2) this).viewModel).mo13172l3();
        String str2 = (String) pairMo13172l3.first;
        String str3 = (String) pairMo13172l3.second;
        if (!TextUtils.equals(str, "appeal") && !TextUtils.equals(str, "fromPicVerificationDlg") && !TextUtils.equals(str, "fromNameVerificationDlg")) {
            str = "verification_center";
        }
        tvf.m24828g(act, str, this.f21867a, str2, str3, 2, true, null, this.f21869c);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m24445k0(final Act act, final String str) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R$string.f1831J5);
        PermissionHelper.c().r(new String[]{"android.permission.CAMERA"}).w(false).u(true).o(new d30() { // from class: l.s420
            public final void call() {
                this.f21006a.m24444j0(act, str);
            }
        }).i(act);
    }

    /* JADX INFO: renamed from: m0 */
    public void m24446m0(String str) {
        this.f21868b = str;
    }

    /* JADX INFO: renamed from: n0 */
    public void m24447n0(boolean z) {
        this.f21867a = z;
    }

    public void destroy() {
    }
}
