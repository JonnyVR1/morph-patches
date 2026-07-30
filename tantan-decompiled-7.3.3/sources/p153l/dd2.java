package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class dd2 extends ar2<fd2> {
    public dd2(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m115320f0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m115323k0(Bundle bundle) {
        ((fd2) this.viewModel).m125079d();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.zc2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203727a.m115323k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m115324i0(final boolean z) {
        CoreModule.f18264c.f20381e0.m116539Z9().take(1).flatMap(new qcj() { // from class: l.ad2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.f89005C0;
            }
        }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.bd2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76220a.m115325j0(z, (AppealInfo) obj);
            }
        }, new y20() { // from class: l.cd2
            @Override // p153l.y20
            public final void call(Object obj) {
                dd2.m115320f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m115325j0(boolean z, AppealInfo appealInfo) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        gta.m132210e().m132214d().mo34664Bm(appealInfo);
        if (appealInfo == null || !appealInfo.needAppeal) {
            if (z) {
                return;
            }
            o1j0.m165636j("已申诉成功，无需再次申诉");
        } else {
            if (z) {
                ((fd2) this.viewModel).m125081f();
                return;
            }
            if (!appealInfo.allowAppeal) {
                o1j0.m165634h(R$string.f28789v);
            } else if (TextUtils.equals(appealInfo.status, OMSSwipeMoment.before)) {
                act().startActivity(CoreModule.m30929H().buildBanReleaseVerifyIntent(act(), (NullChecker.m82486a(userM116600p9.settings) && NullChecker.m82487b(userM116600p9.settings.phoneNumber)) ? userM116600p9.settings.phoneNumber : null));
            } else if (TextUtils.equals(appealInfo.status, "inProgress")) {
                gta.m132210e().m132214d().mo34777Wb(act());
            }
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
