package p002l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.gul;
import l.k4t;
import l.mqv;
import l.s7m;
import l.vwb;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wr2<T extends s7m, D extends ho2> extends x6s<D, T> {

    /* JADX INFO: renamed from: j */
    public UserCardBean f21944j;

    public wr2(bsm<D> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m25326S3(gul gulVar) {
        if (gulVar instanceof wr2) {
            ((wr2) gulVar).mo19187Y3();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m25327T3(User user, gul gulVar) {
        if (gulVar instanceof wr2) {
            ((wr2) gulVar).mo19186X3(user);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m25328U3(gul gulVar) {
        if (gulVar instanceof wr2) {
            ((wr2) gulVar).mo18416h4();
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m25329V3(User user, int i, gul gulVar) {
        if (gulVar instanceof wr2) {
            ((wr2) gulVar).mo16455W3(user, i);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void mo16455W3(final User user, final int i) {
        if (NullChecker.a(((k4t) this).b)) {
            vwb.z(((k4t) this).b.values(), new e30() { // from class: l.ur2
                public final void call(Object obj) {
                    wr2.m25329V3(user, i, (gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void mo19186X3(final User user) {
        if (NullChecker.a(((k4t) this).b)) {
            vwb.z(((k4t) this).b.values(), new e30() { // from class: l.vr2
                public final void call(Object obj) {
                    wr2.m25327T3(user, (gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void mo19187Y3() {
        if (NullChecker.a(((k4t) this).b)) {
            vwb.z(((k4t) this).b.values(), new e30() { // from class: l.sr2
                public final void call(Object obj) {
                    wr2.m25326S3((gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m25330Z3(User user) {
        p1k0 p1k0Var = this.f21944j.profileData;
        if (p1k0Var == null) {
            return;
        }
        p1k0Var.f16959c.a = user;
    }

    /* JADX INFO: renamed from: a4 */
    public final void m25331a4() {
        m25548F2().OpenUserCardDialogEvent.dismiss().p();
    }

    /* JADX INFO: renamed from: b4 */
    public final String m25332b4() {
        return m25335e4() == null ? "" : ((DbObject) m25335e4()).id;
    }

    /* JADX INFO: renamed from: c4 */
    public final mqv<User> m25333c4() {
        if (mo18414g4() == null) {
            return null;
        }
        return mo18414g4().f16959c;
    }

    /* JADX INFO: renamed from: d4 */
    public wr2<T, D> m25334d4() {
        return (wr2) w2();
    }

    /* JADX INFO: renamed from: e4 */
    public final User m25335e4() {
        if (m25333c4() == null) {
            return null;
        }
        return (User) m25333c4().a;
    }

    /* JADX INFO: renamed from: f4 */
    public UserCardData m25336f4() {
        return this.f21944j.userCardData;
    }

    @Nullable
    /* JADX INFO: renamed from: g4 */
    public p1k0 mo18414g4() {
        return this.f21944j.profileData;
    }

    /* JADX INFO: renamed from: h4 */
    public void mo18416h4() {
        if (NullChecker.a(((k4t) this).b)) {
            vwb.z(((k4t) this).b.values(), new e30() { // from class: l.tr2
                public final void call(Object obj) {
                    wr2.m25328U3((gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m25337i0(String str) {
        return !TextUtils.isEmpty(str) && str.equals(((DbObject) m25547E2().m14582l0()).id);
    }

    /* JADX INFO: renamed from: i4 */
    public void m25338i4(UserCardBean userCardBean) {
        this.f21944j = userCardBean;
    }
}
