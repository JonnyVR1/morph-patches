package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes8.dex */
public class wc2 extends jq2<yc2> {
    public wc2(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m202591f0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m202594k0(Bundle bundle) {
        ((yc2) this.viewModel).m214001d();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.sc2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163697a.m202594k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m202595i0(final boolean z) {
        CoreModule.f17545c.f19639e0.m169466Z9().take(1).flatMap(new w9j() { // from class: l.tc2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.f149148C0;
            }
        }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.uc2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175783a.m202596j0(z, (AppealInfo) obj);
            }
        }, new e30() { // from class: l.vc2
            @Override // p149l.e30
            public final void call(Object obj) {
                wc2.m202591f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m202596j0(boolean z, AppealInfo appealInfo) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        ura.m195053e().m195057d().mo33661Bm(appealInfo);
        if (appealInfo == null || !appealInfo.needAppeal) {
            if (z) {
                return;
            }
            lsi0.m151580j("已申诉成功，无需再次申诉");
        } else {
            if (z) {
                ((yc2) this.viewModel).m214003f();
                return;
            }
            if (!appealInfo.allowAppeal) {
                lsi0.m151578h(R$string.f27941v);
            } else if (TextUtils.equals(appealInfo.status, OMSSwipeMoment.before)) {
                act().startActivity(CoreModule.m29931H().buildBanReleaseVerifyIntent(act(), (NullChecker.m81303a(userM169527p9.settings) && NullChecker.m81304b(userM169527p9.settings.phoneNumber)) ? userM169527p9.settings.phoneNumber : null));
            } else if (TextUtils.equals(appealInfo.status, "inProgress")) {
                ura.m195053e().m195057d().mo33774Wb(act());
            }
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
