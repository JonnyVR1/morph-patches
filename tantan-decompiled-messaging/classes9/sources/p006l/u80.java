package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreBusinessModule;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Interest;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class u80 extends jq2<v80> {

    /* JADX INFO: renamed from: a */
    public boolean f23425a;

    public u80(mcr mcrVar) {
        super(mcrVar);
        this.f23425a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m25111i0(Bundle bundle) {
        ((v80) ((jq2) this).viewModel).m25768c(qib0.f19800X.m15798m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ boolean m25112j0(MenuItem menuItem) {
        if (!NullChecker.a(((v80) ((jq2) this).viewModel).f24212d)) {
            return true;
        }
        m25117n0(((v80) ((jq2) this).viewModel).f24212d.m28431J());
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m25113a0() {
        creates(new e30() { // from class: l.q80
            public final void call(Object obj) {
                this.f19660a.m25111i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m25114k0(roj0 roj0Var) {
        if (this.f23425a) {
            lsi0.h(R$string.f2284Y8);
        }
        act().progressDismiss();
        act().finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m25115l0(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.isCannotModify() && !TextUtils.isEmpty(tantanForbidden.message)) {
                return;
            }
        }
        yij0.D(th);
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m25116m0(Menu menu) {
        CoreBusinessModule.m1820m0().mo24810a(act());
        act().getMenuInflater().inflate(h7c0.f13731a, menu);
        menu.findItem(u4c0.f23060j8).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.r80
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f20399a.m25112j0(menuItem);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m25117n0(int i) {
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
        act().progress(act().getString(R$string.f1831J5), true);
        CoreModule.f1534c.f3628e0.m21510u9(user).subscribe(mkd0.H(new e30() { // from class: l.s80
            public final void call(Object obj) {
                this.f21134a.m25114k0((roj0) obj);
            }
        }, new e30() { // from class: l.t80
            public final void call(Object obj) {
                this.f21947a.m25115l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m25118o0(boolean z) {
        this.f23425a = z;
    }

    public void destroy() {
    }
}
