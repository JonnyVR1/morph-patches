package p009l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.bsm;
import l.e30;
import l.gul;
import l.ho2;
import l.k4t;
import l.mqv;
import l.p1k0;
import l.s7m;
import l.vwb;
import l.x6s;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wjm0<T extends s7m, D extends ho2> extends x6s<D, T> {

    /* JADX INFO: renamed from: j */
    public UserCardBean f22168j;

    public wjm0(bsm<D> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m24292S3(p1k0 p1k0Var, gul gulVar) {
        if (gulVar instanceof wjm0) {
            ((wjm0) gulVar).mo14704j4(p1k0Var);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m24293T3(User user, gul gulVar) {
        if (gulVar instanceof wjm0) {
            ((wjm0) gulVar).mo11777Y3(user);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m24294U3(User user, int i, gul gulVar) {
        if (gulVar instanceof wjm0) {
            ((wjm0) gulVar).mo16786X3(user, i);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m24295V3(gul gulVar) {
        if (gulVar instanceof wjm0) {
            ((wjm0) gulVar).mo21934i4();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m24296W3(gul gulVar) {
        if (gulVar instanceof wjm0) {
            ((wjm0) gulVar).m24297Z3();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void mo16786X3(final User user, final int i) {
        if (NullChecker.a(((k4t) this).b)) {
            vwb.z(((k4t) this).b.values(), new e30() { // from class: l.sjm0
                public final void call(Object obj) {
                    wjm0.m24294U3(user, i, (gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void mo11777Y3(final User user) {
        if (NullChecker.a(((k4t) this).b)) {
            vwb.z(((k4t) this).b.values(), new e30() { // from class: l.vjm0
                public final void call(Object obj) {
                    wjm0.m24293T3(user, (gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m24297Z3() {
        if (NullChecker.a(((k4t) this).b)) {
            vwb.z(((k4t) this).b.values(), new e30() { // from class: l.tjm0
                public final void call(Object obj) {
                    wjm0.m24296W3((gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m24298a4(User user) {
        p1k0 p1k0Var = this.f22168j.profileData;
        if (p1k0Var == null) {
            return;
        }
        p1k0Var.c.a = user;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m24299b4() {
        F2().OpenUserCardDialogEvent.dismiss().p();
    }

    /* JADX INFO: renamed from: c4 */
    public String mo21932c4() {
        return "liveRoom";
    }

    /* JADX INFO: renamed from: d4 */
    public final mqv<User> m24300d4() {
        if (mo21933h4() == null) {
            return null;
        }
        return mo21933h4().c;
    }

    /* JADX INFO: renamed from: e4 */
    public wjm0<T, D> m24301e4() {
        return w2();
    }

    /* JADX INFO: renamed from: f4 */
    public final User m24302f4() {
        if (m24300d4() == null) {
            return null;
        }
        return (User) m24300d4().a;
    }

    /* JADX INFO: renamed from: g4 */
    public UserCardData m24303g4() {
        return this.f22168j.userCardData;
    }

    @Nullable
    /* JADX INFO: renamed from: h4 */
    public p1k0 mo21933h4() {
        return this.f22168j.profileData;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m24304i0(String str) {
        return !TextUtils.isEmpty(str) && str.equals(((DbObject) E2().l0()).id);
    }

    /* JADX INFO: renamed from: i4 */
    public void mo21934i4() {
        if (NullChecker.a(((k4t) this).b)) {
            vwb.z(((k4t) this).b.values(), new e30() { // from class: l.ujm0
                public final void call(Object obj) {
                    wjm0.m24295V3((gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void mo14704j4(@Nullable final p1k0 p1k0Var) {
        if (NullChecker.a(((k4t) this).b)) {
            vwb.z(((k4t) this).b.values(), new e30() { // from class: l.rjm0
                public final void call(Object obj) {
                    wjm0.m24292S3(p1k0Var, (gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m24305k4(UserCardBean userCardBean) {
        this.f22168j = userCardBean;
    }
}
