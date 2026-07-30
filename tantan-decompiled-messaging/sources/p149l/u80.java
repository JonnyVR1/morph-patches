package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Interest;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class u80 extends jq2<v80> {

    /* JADX INFO: renamed from: a */
    public boolean f175087a;

    public u80(mcr mcrVar) {
        super(mcrVar);
        this.f175087a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m192173i0(Bundle bundle) {
        ((v80) this.viewModel).m197390c(qib0.f154709X.m126253m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ boolean m192174j0(MenuItem menuItem) {
        if (!NullChecker.m81303a(((v80) this.viewModel).f180439d)) {
            return true;
        }
        m192178n0(((v80) this.viewModel).f180439d.m216375J());
        return true;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.q80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153106a.m192173i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m192175k0(roj0 roj0Var) {
        if (this.f175087a) {
            lsi0.m151578h(R$string.f18295Y8);
        }
        act().progressDismiss();
        act().m66873d2();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m192176l0(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify() && !TextUtils.isEmpty(tantanForbidden.message)) {
                return;
            }
        }
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m192177m0(Menu menu) {
        CoreBusinessModule.m29908m0().mo190514a(act());
        act().getMenuInflater().inflate(h7c0.f106219a, menu);
        menu.findItem(u4c0.f174312j8).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.r80
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f158112a.m192174j0(menuItem);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m192178n0(int i) {
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
        act().progress(act().getString(R$string.f17842J5), true);
        CoreModule.f17545c.f19639e0.m169547u9(user).subscribe(mkd0.m154956H(new e30() { // from class: l.s80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162977a.m192175k0((roj0) obj);
            }
        }, new e30() { // from class: l.t80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168795a.m192176l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m192179o0(boolean z) {
        this.f175087a = z;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
