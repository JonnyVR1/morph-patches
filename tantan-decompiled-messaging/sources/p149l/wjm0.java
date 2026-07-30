package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.NullChecker;
import p149l.ho2;
import p149l.s7m;

/* JADX INFO: loaded from: classes11.dex */
public class wjm0<T extends s7m, D extends ho2> extends x6s<D, T> {

    /* JADX INFO: renamed from: j */
    public UserCardBean f186665j;

    public wjm0(bsm<D> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m203465S3(p1k0 p1k0Var, gul gulVar) {
        if (gulVar instanceof wjm0) {
            ((wjm0) gulVar).mo123913j4(p1k0Var);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m203466T3(User user, gul gulVar) {
        if (gulVar instanceof wjm0) {
            ((wjm0) gulVar).mo99577Y3(user);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m203467U3(User user, int i, gul gulVar) {
        if (gulVar instanceof wjm0) {
            ((wjm0) gulVar).mo138880X3(user, i);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m203468V3(gul gulVar) {
        if (gulVar instanceof wjm0) {
            ((wjm0) gulVar).mo181708i4();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m203469W3(gul gulVar) {
        if (gulVar instanceof wjm0) {
            ((wjm0) gulVar).m203470Z3();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void mo138880X3(final User user, final int i) {
        if (NullChecker.m81303a(this.f121122b)) {
            vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.sjm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    wjm0.m203467U3(user, i, (gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void mo99577Y3(final User user) {
        if (NullChecker.m81303a(this.f121122b)) {
            vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.vjm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    wjm0.m203466T3(user, (gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m203470Z3() {
        if (NullChecker.m81303a(this.f121122b)) {
            vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.tjm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    wjm0.m203469W3((gul) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final void m203471a4(User user) {
        p1k0 p1k0Var = this.f186665j.profileData;
        if (p1k0Var == null) {
            return;
        }
        p1k0Var.f146688c.f135304a = user;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m203472b4() {
        m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
    }

    /* JADX INFO: renamed from: c4 */
    public String mo181706c4() {
        return "liveRoom";
    }

    /* JADX INFO: renamed from: d4 */
    public final mqv<User> m203473d4() {
        if (mo181707h4() == null) {
            return null;
        }
        return mo181707h4().f146688c;
    }

    /* JADX INFO: renamed from: e4 */
    public wjm0<T, D> m203474e4() {
        return (wjm0) m144510w2();
    }

    /* JADX INFO: renamed from: f4 */
    public final User m203475f4() {
        if (m203473d4() == null) {
            return null;
        }
        return m203473d4().f135304a;
    }

    /* JADX INFO: renamed from: g4 */
    public UserCardData m203476g4() {
        return this.f186665j.userCardData;
    }

    @Nullable
    /* JADX INFO: renamed from: h4 */
    public p1k0 mo181707h4() {
        return this.f186665j.profileData;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m203477i0(String str) {
        return !TextUtils.isEmpty(str) && str.equals(m206027E2().m132146l0().f56011id);
    }

    /* JADX INFO: renamed from: i4 */
    public void mo181708i4() {
        if (NullChecker.m81303a(this.f121122b)) {
            vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.ujm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    wjm0.m203468V3((gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void mo123913j4(@Nullable final p1k0 p1k0Var) {
        if (NullChecker.m81303a(this.f121122b)) {
            vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.rjm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    wjm0.m203465S3(p1k0Var, (gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m203478k4(UserCardBean userCardBean) {
        this.f186665j = userCardBean;
    }
}
