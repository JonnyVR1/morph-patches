package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class xtz extends jq2<ztz> {

    /* JADX INFO: renamed from: a */
    public String f194457a;

    /* JADX INFO: renamed from: b */
    public String f194458b;

    public xtz(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m211048h0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra("USER_ID");
        this.f194458b = stringExtra;
        this.f194457a = CoreModule.f17545c.f19639e0.m169561y7(stringExtra);
        if (ura.m195053e().m195057d().mo33875l()) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f194458b);
            if (y19.m212148H() && TextUtils.isEmpty(this.f194457a) && (!NullChecker.m81303a(userM169430Pa) || userM169430Pa.inactivated || userM169430Pa.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
                this.f194457a = "ta";
            } else if (NullChecker.m81303a(userM169430Pa) && TextUtils.isEmpty(this.f194457a)) {
                this.f194457a = userM169430Pa.name;
            }
            ((ztz) this.viewModel).m220160A3(this.f194457a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m211049i0(roj0 roj0Var) {
        act().progressDismiss();
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m211050j0(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code != 40399) {
            osi0.m165783g(CoreModule.f17544b.getString(R$string.f20906Y5));
        }
        act().progressDismiss();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.utz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178308a.m211048h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public void m211051k0(String str) {
        act().progress(R$string.f20775I2, true);
        duringCreated(CoreModule.f17545c.f19639e0.m169394Ga(this.f194458b, str)).subscribe(mkd0.m154956H(new e30() { // from class: l.vtz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183018a.m211049i0((roj0) obj);
            }
        }, new e30() { // from class: l.wtz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188069a.m211050j0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
