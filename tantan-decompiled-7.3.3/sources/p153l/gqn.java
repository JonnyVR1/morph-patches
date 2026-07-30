package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GameData;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.core.data.GameRole;
import com.p051p1.mobile.putong.core.data.HideAndSeekInfoData;
import com.p051p1.mobile.putong.core.data.HideAndSeekPushData;
import com.p051p1.mobile.putong.core.map.IntlHideAndSeekAct;
import com.p051p1.mobile.putong.core.p058ui.hideandseek.IntlHideAndSeekInfoView;
import com.p051p1.mobile.putong.core.p058ui.hideandseek.IntlHideAndSeekRoleView;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VFrame;

/* JADX INFO: loaded from: classes3.dex */
public class gqn implements iam<spn> {

    /* JADX INFO: renamed from: a */
    public VFrame f105692a;

    /* JADX INFO: renamed from: b */
    public VButton f105693b;

    /* JADX INFO: renamed from: c */
    public VButton f105694c;

    /* JADX INFO: renamed from: d */
    public VButton f105695d;

    /* JADX INFO: renamed from: e */
    public IntlHideAndSeekInfoView f105696e;

    /* JADX INFO: renamed from: f */
    public IntlHideAndSeekRoleView f105697f;

    /* JADX INFO: renamed from: g */
    public IntlHideAndSeekAct f105698g;

    /* JADX INFO: renamed from: h */
    public spn f105699h;

    /* JADX INFO: renamed from: i */
    public hyl f105700i;

    /* JADX INFO: renamed from: j */
    public hyl.InterfaceC17602d f105701j;

    /* JADX INFO: renamed from: k */
    public hyl.InterfaceC17602d f105702k;

    /* JADX INFO: renamed from: l */
    public hyl.InterfaceC17602d f105703l;

    /* JADX INFO: renamed from: m */
    public hyl.InterfaceC17602d f105704m;

    /* JADX INFO: renamed from: n */
    public String f105705n;

    public gqn(IntlHideAndSeekAct intlHideAndSeekAct) {
        this.f105698g = intlHideAndSeekAct;
    }

    /* JADX INFO: renamed from: q */
    private void m131382q() {
        bnl0.m105509E0(this.f105694c, new View.OnClickListener() { // from class: l.dqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90267a.m131396u(view);
            }
        });
        bnl0.m105509E0(this.f105693b, new View.OnClickListener() { // from class: l.eqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95353a.m131397v(view);
            }
        });
        bnl0.m105509E0(this.f105695d, new View.OnClickListener() { // from class: l.fqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100316a.m131383w(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m131383w(View view) {
        if (bnl0.m105529O0(this.f105697f)) {
            return;
        }
        this.f105697f.m47241B0();
    }

    /* JADX INFO: renamed from: A */
    public void m131384A() {
        if (bnl0.m105529O0(this.f105697f)) {
            this.f105697f.m47245r0();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f105698g;
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f105697f)) {
            this.f105697f.m47246u0();
        }
        if (NullChecker.m82486a(this.f105696e)) {
            this.f105696e.m47223s0();
        }
    }

    /* JADX INFO: renamed from: e */
    public View m131385e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hqn.m136686b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IntlHideAndSeekAct getAct() {
        return this.f105698g;
    }

    /* JADX INFO: renamed from: i */
    public void m131387i(hyl.InterfaceC17599a interfaceC17599a) {
        this.f105700i.mo36939r1(interfaceC17599a);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m131385e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m131388j(HideAndSeekPushData hideAndSeekPushData) {
        if (hideAndSeekPushData == null) {
            return;
        }
        final String strUserId = CoreModule.m30929H().userId();
        jyb.m147537z(hideAndSeekPushData.players, new y20() { // from class: l.cqn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83105a.m131395s(strUserId, (GameData) obj);
            }
        });
        if (NullChecker.m82486a(this.f105697f)) {
            this.f105697f.m47242D0(hideAndSeekPushData.mouseCount);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m131389k(Location location) {
        if (TextUtils.isEmpty(this.f105705n)) {
            return;
        }
        GameData gameData = new GameData();
        gameData.f21137la = Double.toString(location.m80014u());
        gameData.f21138lg = Double.toString(location.m80016x());
        gameData.uid = CoreModule.m30929H().userId();
        gameData.roleType = this.f105705n;
        m131390l(gameData, true);
    }

    /* JADX INFO: renamed from: l */
    public void m131390l(GameData gameData, boolean z) {
        hyl.InterfaceC17602d interfaceC17602d;
        if (z) {
            interfaceC17602d = TextUtils.equals(GameRole.cat, gameData.roleType) ? this.f105701j : this.f105702k;
        } else {
            interfaceC17602d = TextUtils.equals(GameRole.cat, gameData.roleType) ? this.f105703l : this.f105704m;
        }
        int i = Integer.parseInt(gameData.uid);
        hyl.InterfaceC17600b interfaceC17600bMo36928B0 = this.f105700i.mo36928B0(i);
        if (interfaceC17600bMo36928B0 != null) {
            interfaceC17600bMo36928B0.mo36940a(i);
        }
        this.f105700i.mo36934d3().mo36948g(false).mo36946e(Double.parseDouble(gameData.f21137la), Double.parseDouble(gameData.f21138lg)).mo36945d(interfaceC17602d).mo36944c(0.5f, 0.5f).mo36942a(i).mo36947f(z ? 1.0f : 0.0f).mo36943b();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(spn spnVar) {
        this.f105699h = spnVar;
    }

    /* JADX INFO: renamed from: n */
    public void m131392n() {
        spn spnVar = this.f105699h;
        if (spnVar != null) {
            spnVar.m187432z0();
        }
    }

    /* JADX INFO: renamed from: p */
    public hyl m131393p() {
        return this.f105700i;
    }

    /* JADX INFO: renamed from: r */
    public void m131394r() {
        hyl hylVarM36920c2 = this.f105698g.m36920c2();
        this.f105700i = hylVarM36920c2;
        this.f105701j = hylVarM36920c2.mo36932X2(dbc0.f86178G9);
        this.f105702k = this.f105700i.mo36932X2(dbc0.f86210H9);
        this.f105703l = this.f105700i.mo36932X2(dbc0.f86050C9);
        this.f105704m = this.f105700i.mo36932X2(dbc0.f86082D9);
        m131382q();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m131395s(String str, GameData gameData) {
        if (TextUtils.equals(gameData.uid, str)) {
            return;
        }
        m131390l(gameData, false);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m131396u(View view) {
        Location locationM187431y0 = this.f105699h.m187431y0();
        if (locationM187431y0 != null) {
            this.f105700i.mo36930K1(locationM187431y0.m80014u(), locationM187431y0.m80016x(), 17.0f);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m131397v(View view) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: x */
    public void m131398x() {
        if (NullChecker.m82486a(this.f105701j)) {
            this.f105701j.recycle();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m131399y(boolean z, GameRole gameRole) {
        bnl0.m105524M(this.f105694c, z);
        bnl0.m105524M(this.f105695d, z);
        if (!z) {
            this.f105705n = null;
        } else {
            this.f105705n = gameRole.toString();
            this.f105695d.setBackgroundResource(TEnum.equals(gameRole, GameRole.mouse) ? dbc0.f86146F9 : dbc0.f86114E9);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m131400z(HideAndSeekInfoData hideAndSeekInfoData) {
        if (hideAndSeekInfoData == null) {
            return;
        }
        if (NullChecker.m82486a(hideAndSeekInfoData.gameInfo) && NullChecker.m82486a(hideAndSeekInfoData.gameRole) && TEnum.equals(hideAndSeekInfoData.gameInfo.gameIdentity, GameIdentity.player) && TEnum.equals(hideAndSeekInfoData.gameInfo.gameStage, "start")) {
            bnl0.m105524M(this.f105696e, false);
            this.f105697f.m47247v0(hideAndSeekInfoData.gameRole, this);
            this.f105699h.m187428O0(Long.valueOf(hideAndSeekInfoData.gameRole.endTime));
        } else {
            this.f105700i.mo36933b2();
            this.f105697f.m47245r0();
            this.f105696e.m47225v0(hideAndSeekInfoData.gameInfo);
            m131399y(false, null);
        }
    }
}
