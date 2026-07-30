package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.view.UserCardMedalAndNameView;
import java.util.Locale;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class o0k0<D extends ho2> extends wr2<m0k0<D>, D> {
    public o0k0(bsm<D> bsmVar, UserCardMedalAndNameView userCardMedalAndNameView) {
        super(bsmVar);
        mo51532C(new m0k0(userCardMedalAndNameView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m162150m4(User user) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((m0k0) v2).m152515j(((idv) ypv.m215673l(fld0.f98147b)).m135637i(m205086f4().userId()));
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        ((m0k0) this.viewModel).f130742a.m200967l();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        ((m0k0) this.viewModel).f130742a.m200963C(this);
        if (m206027E2().mo132100V0() || m206027E2().mo97490p()) {
            ((m0k0) this.viewModel).f130742a.m200965E(m206027E2().f108741B.m140001A());
        }
        ((m0k0) this.viewModel).m152516k(mo157426g4() == null ? null : mo157426g4().f146688c);
        m207199N3(((idv) ypv.m215673l(fld0.f98147b)).m135635g()).subscribe(ffw.m121193d(new e30() { // from class: l.n0k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136564a.m162150m4((User) obj);
            }
        }));
        if (mo157426g4() != null) {
            ((m0k0) this.viewModel).m152519n(mo157426g4());
        }
    }

    @Override // p149l.wr2
    /* JADX INFO: renamed from: X3 */
    public void mo162151X3(User user) {
        ((m0k0) this.viewModel).m152515j(user);
    }

    @Override // p149l.wr2
    /* JADX INFO: renamed from: Y3 */
    public void mo162152Y3() {
        ((m0k0) this.viewModel).f130742a.m200968m();
    }

    /* JADX INFO: renamed from: k4 */
    public String m162153k4(User user, String str, String str2, String str3) {
        if (user.isMe() || user.isHideLocationFromSVip()) {
            return String.format(Locale.getDefault(), "%s%s", str, ypv.f199497e.getString(R$string.f47332k));
        }
        String string = ypv.f199497e.getString(R$string.f47332k);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return String.format(Locale.getDefault(), "%s%s  ·  %s %s", str, string, str3, str2);
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m162154l4() {
        if (mo157426g4() == null || mo157426g4().m167093m() == null) {
            return false;
        }
        return mo157426g4().m167093m().isBeautifulNumber;
    }
}
