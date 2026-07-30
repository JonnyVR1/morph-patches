package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.IdCard;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;

/* JADX INFO: loaded from: classes12.dex */
public class bd20 extends ar2<r0m> {

    /* JADX INFO: renamed from: a */
    public boolean f76222a;

    /* JADX INFO: renamed from: b */
    public String f76223b;

    /* JADX INFO: renamed from: c */
    public boolean f76224c;

    public bd20(ner nerVar) {
        super(nerVar);
        this.f76224c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m103584l0(Bundle bundle) {
        ((r0m) this.viewModel).mo149164A3(this.f76223b);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        this.f76224c = act().getIntent().getBooleanExtra("new_process", false);
        creates(new y20() { // from class: l.yc20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198387a.m103584l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m103585h0() {
        Pair<String, String> pairMo149167l3 = ((r0m) this.viewModel).mo149167l3();
        String str = (String) pairMo149167l3.first;
        String str2 = (String) pairMo149167l3.second;
        if (!xc20.m210109u(str2)) {
            ((r0m) this.viewModel).mo149166J2(act().getString(R$string.f19454m8));
            return;
        }
        if (!xc20.m210104p(str2)) {
            ((r0m) this.viewModel).mo149166J2(act().getString(R$string.f19566pr));
            sfj0.m185607n("e_id_verification_info_teenager_input", "p_id_verification_info_input_view", sfj0.C20032a.m185615h("idverifivation_teenager_user_id", uqb0.f180397c0.userId()), sfj0.C20032a.m185615h("idverifivation_teenager_user_birthday", xc20.m210105q(str2)));
            return;
        }
        IdCard idCardNew_ = IdCard.new_();
        idCardNew_.name = str;
        idCardNew_.number = str2;
        yc2.m215118e().m215127j(idCardNew_);
        m103586i0(act(), this.f76223b);
    }

    /* JADX INFO: renamed from: i0 */
    public void m103586i0(final Act act, final String str) {
        l7y.m153156h(act, new Runnable() { // from class: l.zc20
            @Override // java.lang.Runnable
            public final void run() {
                this.f203728a.m103588k0(act, str);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m103587j0(Act act, String str) {
        Pair<String, String> pairMo149167l3 = ((r0m) this.viewModel).mo149167l3();
        String str2 = (String) pairMo149167l3.first;
        String str3 = (String) pairMo149167l3.second;
        if (!TextUtils.equals(str, "appeal") && !TextUtils.equals(str, "fromPicVerificationDlg") && !TextUtils.equals(str, "fromNameVerificationDlg")) {
            str = "verification_center";
        }
        hxf.m137586g(act, str, this.f76222a, str2, str3, 2, true, null, this.f76224c);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m103588k0(final Act act, final String str) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R$string.f18632L5);
        PermissionHelper.m81065c().m81083r("android.permission.CAMERA").m81088w(false).m81086u(true).m81080o(new x20() { // from class: l.ad20
            @Override // p153l.x20
            public final void call() {
                this.f69780a.m103587j0(act, str);
            }
        }).m81074i(act);
    }

    /* JADX INFO: renamed from: m0 */
    public void m103589m0(String str) {
        this.f76223b = str;
    }

    /* JADX INFO: renamed from: n0 */
    public void m103590n0(boolean z) {
        this.f76222a = z;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
