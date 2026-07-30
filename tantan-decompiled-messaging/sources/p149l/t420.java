package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.IdCard;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;

/* JADX INFO: loaded from: classes9.dex */
public class t420 extends jq2<yxl> {

    /* JADX INFO: renamed from: a */
    public boolean f167682a;

    /* JADX INFO: renamed from: b */
    public String f167683b;

    /* JADX INFO: renamed from: c */
    public boolean f167684c;

    public t420(mcr mcrVar) {
        super(mcrVar);
        this.f167684c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m187140l0(Bundle bundle) {
        ((yxl) this.viewModel).mo105269A3(this.f167683b);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        this.f167684c = act().getIntent().getBooleanExtra("new_process", false);
        creates(new e30() { // from class: l.q420
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152534a.m187140l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m187141h0() {
        Pair<String, String> pairMo105272l3 = ((yxl) this.viewModel).mo105272l3();
        String str = (String) pairMo105272l3.first;
        String str2 = (String) pairMo105272l3.second;
        if (!p420.m167355u(str2)) {
            ((yxl) this.viewModel).mo105271J2(act().getString(R$string.f18662k8));
            return;
        }
        if (!p420.m167350p(str2)) {
            ((yxl) this.viewModel).mo105271J2(act().getString(R$string.f18193Uq));
            o6j0.m162870n("e_id_verification_info_teenager_input", "p_id_verification_info_input_view", o6j0.C18854a.m162878h("idverifivation_teenager_user_id", qib0.f154714c0.userId()), o6j0.C18854a.m162878h("idverifivation_teenager_user_birthday", p420.m167351q(str2)));
            return;
        }
        IdCard idCardNew_ = IdCard.new_();
        idCardNew_.name = str;
        idCardNew_.number = str2;
        rc2.m178723e().m178732j(idCardNew_);
        m187142i0(act(), this.f167683b);
    }

    /* JADX INFO: renamed from: i0 */
    public void m187142i0(final Act act, final String str) {
        oyx.m166734h(act, new Runnable() { // from class: l.r420
            @Override // java.lang.Runnable
            public final void run() {
                this.f157630a.m187144k0(act, str);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m187143j0(Act act, String str) {
        Pair<String, String> pairMo105272l3 = ((yxl) this.viewModel).mo105272l3();
        String str2 = (String) pairMo105272l3.first;
        String str3 = (String) pairMo105272l3.second;
        if (!TextUtils.equals(str, "appeal") && !TextUtils.equals(str, "fromPicVerificationDlg") && !TextUtils.equals(str, "fromNameVerificationDlg")) {
            str = "verification_center";
        }
        tvf.m190729g(act, str, this.f167682a, str2, str3, 2, true, null, this.f167684c);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m187144k0(final Act act, final String str) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R$string.f17842J5);
        PermissionHelper.m79882c().m79900r("android.permission.CAMERA").m79905w(false).m79903u(true).m79897o(new d30() { // from class: l.s420
            @Override // p149l.d30
            public final void call() {
                this.f162261a.m187143j0(act, str);
            }
        }).m79891i(act);
    }

    /* JADX INFO: renamed from: m0 */
    public void m187145m0(String str) {
        this.f167683b = str;
    }

    /* JADX INFO: renamed from: n0 */
    public void m187146n0(boolean z) {
        this.f167682a = z;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
