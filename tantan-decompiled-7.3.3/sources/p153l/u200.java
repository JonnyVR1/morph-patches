package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class u200 extends ar2<w200> {

    /* JADX INFO: renamed from: a */
    public String f177164a;

    /* JADX INFO: renamed from: b */
    public String f177165b;

    public u200(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m194233h0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra("USER_ID");
        this.f177165b = stringExtra;
        this.f177164a = CoreModule.f18264c.f20381e0.m116634y7(stringExtra);
        if (gta.m132210e().m132214d().mo34878l()) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f177165b);
            if (h39.m133419H() && TextUtils.isEmpty(this.f177164a) && (!NullChecker.m82486a(userM116503Pa) || userM116503Pa.inactivated || userM116503Pa.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
                this.f177164a = "ta";
            } else if (NullChecker.m82486a(userM116503Pa) && TextUtils.isEmpty(this.f177164a)) {
                this.f177164a = userM116503Pa.name;
            }
            ((w200) this.viewModel).m204493A3(this.f177164a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m194234i0(uxj0 uxj0Var) {
        act().progressDismiss();
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m194235j0(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code != 40399) {
            r1j0.m179420g(CoreModule.f18263b.getString(R$string.f21648Y5));
        }
        act().progressDismiss();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.r200
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160870a.m194233h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public void m194236k0(String str) {
        act().progress(R$string.f21517I2, true);
        duringCreated(CoreModule.f18264c.f20381e0.m116467Ga(this.f177165b, str)).subscribe(psd0.m173597H(new y20() { // from class: l.s200
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165825a.m194234i0((uxj0) obj);
            }
        }, new y20() { // from class: l.t200
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171703a.m194235j0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
