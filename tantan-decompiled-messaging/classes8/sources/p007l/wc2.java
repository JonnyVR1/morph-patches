package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.ura;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class wc2 extends jq2<yc2> {
    public wc2(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m11329f0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m11332k0(Bundle bundle) {
        ((yc2) this.viewModel).m11922d();
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.sc2
            public final void call(Object obj) {
                this.f4130a.m11332k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m11333i0(final boolean z) {
        CoreModule.c.e0.Z9().take(1).flatMap(new w9j() { // from class: l.tc2
            public final Object call(Object obj) {
                return CoreModule.c.e0.C0;
            }
        }).take(1).subscribe(mkd0.m9875H(new e30() { // from class: l.uc2
            public final void call(Object obj) {
                this.f4875a.m11334j0(z, (AppealInfo) obj);
            }
        }, new e30() { // from class: l.vc2
            public final void call(Object obj) {
                wc2.m11329f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m11334j0(boolean z, AppealInfo appealInfo) {
        User userP9 = CoreModule.c.e0.p9();
        ura.e().d().Bm(appealInfo);
        if (appealInfo == null || !appealInfo.needAppeal) {
            if (z) {
                return;
            }
            lsi0.m9836j("已申诉成功，无需再次申诉");
        } else {
            if (z) {
                ((yc2) this.viewModel).m11924f();
                return;
            }
            if (!appealInfo.allowAppeal) {
                lsi0.m9834h(R.string.v);
            } else if (TextUtils.equals(appealInfo.status, "before")) {
                act().startActivity(CoreModule.H().buildBanReleaseVerifyIntent(act(), (NullChecker.a(userP9.settings) && NullChecker.b(userP9.settings.phoneNumber)) ? userP9.settings.phoneNumber : null));
            } else if (TextUtils.equals(appealInfo.status, "inProgress")) {
                ura.e().d().Wb(act());
            }
        }
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
