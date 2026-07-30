package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.NullChecker;
import p149l.ho2;
import p149l.s7m;

/* JADX INFO: loaded from: classes4.dex */
public class wr2<T extends s7m, D extends ho2> extends x6s<D, T> {

    /* JADX INFO: renamed from: j */
    public UserCardBean f187753j;

    public wr2(bsm<D> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m205076S3(gul gulVar) {
        if (gulVar instanceof wr2) {
            ((wr2) gulVar).mo162152Y3();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m205077T3(User user, gul gulVar) {
        if (gulVar instanceof wr2) {
            ((wr2) gulVar).mo162151X3(user);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m205078U3(gul gulVar) {
        if (gulVar instanceof wr2) {
            ((wr2) gulVar).mo157428h4();
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m205079V3(User user, int i, gul gulVar) {
        if (gulVar instanceof wr2) {
            ((wr2) gulVar).mo143930W3(user, i);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void mo143930W3(final User user, final int i) {
        if (NullChecker.m81303a(this.f121122b)) {
            vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.ur2
                @Override // p149l.e30
                public final void call(Object obj) {
                    wr2.m205079V3(user, i, (gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void mo162151X3(final User user) {
        if (NullChecker.m81303a(this.f121122b)) {
            vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.vr2
                @Override // p149l.e30
                public final void call(Object obj) {
                    wr2.m205077T3(user, (gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void mo162152Y3() {
        if (NullChecker.m81303a(this.f121122b)) {
            vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.sr2
                @Override // p149l.e30
                public final void call(Object obj) {
                    wr2.m205076S3((gul) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m205080Z3(User user) {
        p1k0 p1k0Var = this.f187753j.profileData;
        if (p1k0Var == null) {
            return;
        }
        p1k0Var.f146688c.f135304a = user;
    }

    /* JADX INFO: renamed from: a4 */
    public final void m205081a4() {
        m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
    }

    /* JADX INFO: renamed from: b4 */
    public final String m205082b4() {
        return m205085e4() == null ? "" : m205085e4().f56011id;
    }

    /* JADX INFO: renamed from: c4 */
    public final mqv<User> m205083c4() {
        if (mo157426g4() == null) {
            return null;
        }
        return mo157426g4().f146688c;
    }

    /* JADX INFO: renamed from: d4 */
    public wr2<T, D> m205084d4() {
        return (wr2) m144510w2();
    }

    /* JADX INFO: renamed from: e4 */
    public final User m205085e4() {
        if (m205083c4() == null) {
            return null;
        }
        return m205083c4().f135304a;
    }

    /* JADX INFO: renamed from: f4 */
    public UserCardData m205086f4() {
        return this.f187753j.userCardData;
    }

    @Nullable
    /* JADX INFO: renamed from: g4 */
    public p1k0 mo157426g4() {
        return this.f187753j.profileData;
    }

    /* JADX INFO: renamed from: h4 */
    public void mo157428h4() {
        if (NullChecker.m81303a(this.f121122b)) {
            vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.tr2
                @Override // p149l.e30
                public final void call(Object obj) {
                    wr2.m205078U3((gul) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m205087i0(String str) {
        return !TextUtils.isEmpty(str) && str.equals(m206027E2().m132146l0().f56011id);
    }

    /* JADX INFO: renamed from: i4 */
    public void m205088i4(UserCardBean userCardBean) {
        this.f187753j = userCardBean;
    }
}
