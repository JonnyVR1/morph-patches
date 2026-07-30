package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.NullChecker;
import p153l.iam;
import p153l.oo2;

/* JADX INFO: loaded from: classes10.dex */
public class atm0<T extends iam, D extends oo2> extends y8s<D, T> {

    /* JADX INFO: renamed from: j */
    public UserCardBean f73370j;

    public atm0(dum<D> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m100204S3(vak0 vak0Var, uwl uwlVar) {
        if (uwlVar instanceof atm0) {
            ((atm0) uwlVar).mo100222j4(vak0Var);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m100205T3(User user, uwl uwlVar) {
        if (uwlVar instanceof atm0) {
            ((atm0) uwlVar).mo100210Y3(user);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m100206U3(User user, int i, uwl uwlVar) {
        if (uwlVar instanceof atm0) {
            ((atm0) uwlVar).mo100209X3(user, i);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m100207V3(uwl uwlVar) {
        if (uwlVar instanceof atm0) {
            ((atm0) uwlVar).mo100221i4();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m100208W3(uwl uwlVar) {
        if (uwlVar instanceof atm0) {
            ((atm0) uwlVar).m100211Z3();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void mo100209X3(final User user, final int i) {
        if (NullChecker.m82486a(this.f130285b)) {
            jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.wsm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    atm0.m100206U3(user, i, (uwl) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void mo100210Y3(final User user) {
        if (NullChecker.m82486a(this.f130285b)) {
            jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.zsm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    atm0.m100205T3(user, (uwl) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m100211Z3() {
        if (NullChecker.m82486a(this.f130285b)) {
            jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.xsm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    atm0.m100208W3((uwl) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final void m100212a4(User user) {
        vak0 vak0Var = this.f73370j.profileData;
        if (vak0Var == null) {
            return;
        }
        vak0Var.f183108c.f143542a = user;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m100213b4() {
        m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
    }

    /* JADX INFO: renamed from: c4 */
    public String mo100214c4() {
        return "liveRoom";
    }

    /* JADX INFO: renamed from: d4 */
    public final nsv<User> m100215d4() {
        if (mo100219h4() == null) {
            return null;
        }
        return mo100219h4().f183108c;
    }

    /* JADX INFO: renamed from: e4 */
    public atm0<T, D> m100216e4() {
        return (atm0) m153101w2();
    }

    /* JADX INFO: renamed from: f4 */
    public final User m100217f4() {
        if (m100215d4() == null) {
            return null;
        }
        return m100215d4().f143542a;
    }

    /* JADX INFO: renamed from: g4 */
    public UserCardData m100218g4() {
        return this.f73370j.userCardData;
    }

    @Nullable
    /* JADX INFO: renamed from: h4 */
    public vak0 mo100219h4() {
        return this.f73370j.profileData;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m100220i0(String str) {
        return !TextUtils.isEmpty(str) && str.equals(m213810E2().m168532l0().f56859id);
    }

    /* JADX INFO: renamed from: i4 */
    public void mo100221i4() {
        if (NullChecker.m82486a(this.f130285b)) {
            jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.ysm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    atm0.m100207V3((uwl) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void mo100222j4(@Nullable final vak0 vak0Var) {
        if (NullChecker.m82486a(this.f130285b)) {
            jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.vsm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    atm0.m100204S3(vak0Var, (uwl) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m100223k4(UserCardBean userCardBean) {
        this.f73370j = userCardBean;
    }
}
