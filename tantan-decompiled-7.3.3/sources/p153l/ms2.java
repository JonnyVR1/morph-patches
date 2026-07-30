package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.NullChecker;
import p153l.iam;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class ms2<T extends iam, D extends oo2> extends y8s<D, T> {

    /* JADX INFO: renamed from: j */
    public UserCardBean f138438j;

    public ms2(dum<D> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m159719S3(uwl uwlVar) {
        if (uwlVar instanceof ms2) {
            ((ms2) uwlVar).mo159725Y3();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m159720T3(User user, uwl uwlVar) {
        if (uwlVar instanceof ms2) {
            ((ms2) uwlVar).mo159724X3(user);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m159721U3(uwl uwlVar) {
        if (uwlVar instanceof ms2) {
            ((ms2) uwlVar).mo159734h4();
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m159722V3(User user, int i, uwl uwlVar) {
        if (uwlVar instanceof ms2) {
            ((ms2) uwlVar).mo159723W3(user, i);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void mo159723W3(final User user, final int i) {
        if (NullChecker.m82486a(this.f130285b)) {
            jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.ks2
                @Override // p153l.y20
                public final void call(Object obj) {
                    ms2.m159722V3(user, i, (uwl) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void mo159724X3(final User user) {
        if (NullChecker.m82486a(this.f130285b)) {
            jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.ls2
                @Override // p153l.y20
                public final void call(Object obj) {
                    ms2.m159720T3(user, (uwl) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void mo159725Y3() {
        if (NullChecker.m82486a(this.f130285b)) {
            jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.is2
                @Override // p153l.y20
                public final void call(Object obj) {
                    ms2.m159719S3((uwl) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m159726Z3(User user) {
        vak0 vak0Var = this.f138438j.profileData;
        if (vak0Var == null) {
            return;
        }
        vak0Var.f183108c.f143542a = user;
    }

    /* JADX INFO: renamed from: a4 */
    public final void m159727a4() {
        m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
    }

    /* JADX INFO: renamed from: b4 */
    public final String m159728b4() {
        return m159731e4() == null ? "" : m159731e4().f56859id;
    }

    /* JADX INFO: renamed from: c4 */
    public final nsv<User> m159729c4() {
        if (mo159733g4() == null) {
            return null;
        }
        return mo159733g4().f183108c;
    }

    /* JADX INFO: renamed from: d4 */
    public ms2<T, D> m159730d4() {
        return (ms2) m153101w2();
    }

    /* JADX INFO: renamed from: e4 */
    public final User m159731e4() {
        if (m159729c4() == null) {
            return null;
        }
        return m159729c4().f143542a;
    }

    /* JADX INFO: renamed from: f4 */
    public UserCardData m159732f4() {
        return this.f138438j.userCardData;
    }

    @Nullable
    /* JADX INFO: renamed from: g4 */
    public vak0 mo159733g4() {
        return this.f138438j.profileData;
    }

    /* JADX INFO: renamed from: h4 */
    public void mo159734h4() {
        if (NullChecker.m82486a(this.f130285b)) {
            jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.js2
                @Override // p153l.y20
                public final void call(Object obj) {
                    ms2.m159721U3((uwl) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m159735i0(String str) {
        return !TextUtils.isEmpty(str) && str.equals(m213810E2().m168532l0().f56859id);
    }

    /* JADX INFO: renamed from: i4 */
    public void m159736i4(UserCardBean userCardBean) {
        this.f138438j = userCardBean;
    }
}
