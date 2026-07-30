package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Interest;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class q80 extends ar2<r80> {

    /* JADX INFO: renamed from: a */
    public boolean f156013a;

    public q80(ner nerVar) {
        super(nerVar);
        this.f156013a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m175719i0(Bundle bundle) {
        ((r80) this.viewModel).m180171c(uqb0.f180392X.m135324m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ boolean m175720j0(MenuItem menuItem) {
        if (!NullChecker.m82486a(((r80) this.viewModel).f161658d)) {
            return true;
        }
        m175724n0(((r80) this.viewModel).f161658d.m113148J());
        return true;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.m80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135141a.m175719i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m175721k0(uxj0 uxj0Var) {
        if (this.f156013a) {
            o1j0.m165634h(R$string.f19086a9);
        }
        act().progressDismiss();
        act().m68056e2();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m175722l0(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify() && !TextUtils.isEmpty(tantanForbidden.message)) {
                return;
            }
        }
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m175723m0(Menu menu) {
        CoreBusinessModule.m30906m0().mo122541a(act());
        act().getMenuInflater().inflate(lfc0.f131838a, menu);
        menu.findItem(adc0.f70437l8).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.n80
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f140642a.m175720j0(menuItem);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m175724n0(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 0) {
            arrayList.add(String.valueOf(i));
        }
        User user = new User();
        Profile profile = new Profile();
        user.profile = profile;
        profile.extensions = new Extensions();
        user.profile.extensions.interest = new Interest();
        user.profile.extensions.interest.emoji = arrayList;
        act().progress(act().getString(R$string.f18632L5), true);
        CoreModule.f18264c.f20381e0.m116620u9(user).subscribe(psd0.m173597H(new y20() { // from class: l.o80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145343a.m175721k0((uxj0) obj);
            }
        }, new y20() { // from class: l.p80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150981a.m175722l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m175725o0(boolean z) {
        this.f156013a = z;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
