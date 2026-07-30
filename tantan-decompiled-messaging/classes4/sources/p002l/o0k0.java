package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.view.UserCardMedalAndNameView;
import com.p1.mobile.putong.data.User;
import java.util.Locale;
import l.bwr;
import l.e30;
import l.ffw;
import l.fld0;
import l.idv;
import l.s7m;
import l.ypv;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o0k0<D extends ho2> extends wr2<m0k0<D>, D> {
    public o0k0(bsm<D> bsmVar, UserCardMedalAndNameView userCardMedalAndNameView) {
        super(bsmVar);
        C(new m0k0(userCardMedalAndNameView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m19185m4(User user) {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((m0k0) s7mVar).m17650j(((idv) ypv.l(fld0.b)).i(m25336f4().userId()));
        }
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        ((m0k0) ((bwr) this).viewModel).f15192a.m24276l();
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        ((m0k0) ((bwr) this).viewModel).f15192a.m24272C(this);
        if (m25547E2().m14536V0() || m25547E2().mo9893p()) {
            ((m0k0) ((bwr) this).viewModel).f15192a.m24274E(m25547E2().f12141B.m15692A());
        }
        ((m0k0) ((bwr) this).viewModel).m17651k(mo18414g4() == null ? null : mo18414g4().f16959c);
        m25707N3(((idv) ypv.l(fld0.b)).g()).subscribe(ffw.d(new e30() { // from class: l.n0k0
            public final void call(Object obj) {
                this.f15772a.m19185m4((User) obj);
            }
        }));
        if (mo18414g4() != null) {
            ((m0k0) ((bwr) this).viewModel).m17654n(mo18414g4());
        }
    }

    @Override // p002l.wr2
    /* JADX INFO: renamed from: X3 */
    public void mo19186X3(User user) {
        ((m0k0) ((bwr) this).viewModel).m17650j(user);
    }

    @Override // p002l.wr2
    /* JADX INFO: renamed from: Y3 */
    public void mo19187Y3() {
        ((m0k0) ((bwr) this).viewModel).f15192a.m24277m();
    }

    /* JADX INFO: renamed from: k4 */
    public String m19188k4(User user, String str, String str2, String str3) {
        if (user.isMe() || user.isHideLocationFromSVip()) {
            return String.format(Locale.getDefault(), "%s%s", str, ypv.e.getString(R$string.f3374k));
        }
        String string = ypv.e.getString(R$string.f3374k);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return String.format(Locale.getDefault(), "%s%s  ·  %s %s", str, string, str3, str2);
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m19189l4() {
        if (mo18414g4() == null || mo18414g4().m19973m() == null) {
            return false;
        }
        return mo18414g4().m19973m().isBeautifulNumber;
    }
}
