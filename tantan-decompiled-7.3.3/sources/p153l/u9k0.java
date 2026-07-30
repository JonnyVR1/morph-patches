package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.view.UserCardMedalAndNameView;
import java.util.Locale;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class u9k0<D extends oo2> extends ms2<s9k0<D>, D> {
    public u9k0(dum<D> dumVar, UserCardMedalAndNameView userCardMedalAndNameView) {
        super(dumVar);
        mo52715C(new s9k0(userCardMedalAndNameView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m195100m4(User user) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((s9k0) v2).m185197j(((jfv) zrv.m221194l(htd0.f111520b)).m144722i(m159732f4().userId()));
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        ((s9k0) this.viewModel).f166940a.m209279l();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        ((s9k0) this.viewModel).f166940a.m209275C(this);
        if (m213810E2().mo168486V0() || m213810E2().mo118373p()) {
            ((s9k0) this.viewModel).f166940a.m209277E(m213810E2().f148254B.m209606A());
        }
        ((s9k0) this.viewModel).m185198k(mo159733g4() == null ? null : mo159733g4().f183108c);
        m214779N3(((jfv) zrv.m221194l(htd0.f111520b)).m144720g()).subscribe(dhw.m115825d(new y20() { // from class: l.t9k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172647a.m195100m4((User) obj);
            }
        }));
        if (mo159733g4() != null) {
            ((s9k0) this.viewModel).m185201n(mo159733g4());
        }
    }

    @Override // p153l.ms2
    /* JADX INFO: renamed from: X3 */
    public void mo159724X3(User user) {
        ((s9k0) this.viewModel).m185197j(user);
    }

    @Override // p153l.ms2
    /* JADX INFO: renamed from: Y3 */
    public void mo159725Y3() {
        ((s9k0) this.viewModel).f166940a.m209280m();
    }

    /* JADX INFO: renamed from: k4 */
    public String m195101k4(User user, String str, String str2, String str3) {
        if (user.isMe() || user.isHideLocationFromSVip()) {
            return String.format(Locale.getDefault(), "%s%s", str, zrv.f205803e.getString(R$string.f48180k));
        }
        String string = zrv.f205803e.getString(R$string.f48180k);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return String.format(Locale.getDefault(), "%s%s  ·  %s %s", str, string, str3, str2);
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m195102l4() {
        if (mo159733g4() == null || mo159733g4().m200538m() == null) {
            return false;
        }
        return mo159733g4().m200538m().isBeautifulNumber;
    }
}
