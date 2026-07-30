package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import l.bsm;
import l.e30;
import l.ffw;
import l.ho2;
import l.lsi0;
import l.sgj;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lxo0<D extends ho2> extends ixo0<D> {
    public lxo0(bsm<D> bsmVar, VText vText) {
        super(bsmVar, vText);
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m18072q4(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.w(R.string.C);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m18074s4(User user, Followship followship) {
        user.localFollowship = followship;
        m24301e4().mo11777Y3(user);
        if (TextUtils.equals(((DbObject) user).id, ((DbObject) E2().l0()).id)) {
            E2().U(followship);
        }
        if (ypv.f23196a.m23625H()) {
            sgj.d();
        }
        if (user.matchedOrFollowed()) {
            lsi0.w(R.string.L4);
        }
    }

    @Override // p009l.ixo0
    /* JADX INFO: renamed from: m4 */
    public void mo14117m4(final User user, boolean z, boolean z2, String str, String str2) {
        vpv vpvVar = ypv.f23196a;
        duringCreated(vpvVar.m23650d(vpvVar.m23619D0(), user, z, str2, E2().k(), E2().o(), R2(), str)).subscribe(ffw.e(new e30() { // from class: l.jxo0
            public final void call(Object obj) {
                this.f15357a.m18074s4(user, (Followship) obj);
            }
        }, new e30() { // from class: l.kxo0
            public final void call(Object obj) {
                lxo0.m18072q4((Throwable) obj);
            }
        }));
    }
}
