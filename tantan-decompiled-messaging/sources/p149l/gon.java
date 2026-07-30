package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GameData;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.core.data.GameRole;
import com.p046p1.mobile.putong.core.data.HideAndSeekInfoData;
import com.p046p1.mobile.putong.core.data.HideAndSeekPushData;
import com.p046p1.mobile.putong.core.map.IntlHideAndSeekAct;
import com.p046p1.mobile.putong.core.p053ui.hideandseek.IntlHideAndSeekInfoView;
import com.p046p1.mobile.putong.core.p053ui.hideandseek.IntlHideAndSeekRoleView;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class gon implements s7m<snn> {

    /* JADX INFO: renamed from: a */
    public VFrame f103683a;

    /* JADX INFO: renamed from: b */
    public VButton f103684b;

    /* JADX INFO: renamed from: c */
    public VButton f103685c;

    /* JADX INFO: renamed from: d */
    public VButton f103686d;

    /* JADX INFO: renamed from: e */
    public IntlHideAndSeekInfoView f103687e;

    /* JADX INFO: renamed from: f */
    public IntlHideAndSeekRoleView f103688f;

    /* JADX INFO: renamed from: g */
    public IntlHideAndSeekAct f103689g;

    /* JADX INFO: renamed from: h */
    public snn f103690h;

    /* JADX INFO: renamed from: i */
    public pvl f103691i;

    /* JADX INFO: renamed from: j */
    public pvl.InterfaceC19348d f103692j;

    /* JADX INFO: renamed from: k */
    public pvl.InterfaceC19348d f103693k;

    /* JADX INFO: renamed from: l */
    public pvl.InterfaceC19348d f103694l;

    /* JADX INFO: renamed from: m */
    public pvl.InterfaceC19348d f103695m;

    /* JADX INFO: renamed from: n */
    public String f103696n;

    public gon(IntlHideAndSeekAct intlHideAndSeekAct) {
        this.f103689g = intlHideAndSeekAct;
    }

    /* JADX INFO: renamed from: q */
    private void m127258q() {
        xdl0.m208329E0(this.f103685c, new View.OnClickListener() { // from class: l.don
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87184a.m127272u(view);
            }
        });
        xdl0.m208329E0(this.f103684b, new View.OnClickListener() { // from class: l.eon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92474a.m127273v(view);
            }
        });
        xdl0.m208329E0(this.f103686d, new View.OnClickListener() { // from class: l.fon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98580a.m127259w(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m127259w(View view) {
        if (xdl0.m208349O0(this.f103688f)) {
            return;
        }
        this.f103688f.m46058B0();
    }

    /* JADX INFO: renamed from: A */
    public void m127260A() {
        if (xdl0.m208349O0(this.f103688f)) {
            this.f103688f.m46062r0();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f103689g;
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f103688f)) {
            this.f103688f.m46063u0();
        }
        if (NullChecker.m81303a(this.f103687e)) {
            this.f103687e.m46040s0();
        }
    }

    /* JADX INFO: renamed from: e */
    public View m127261e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hon.m132225b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IntlHideAndSeekAct getAct() {
        return this.f103689g;
    }

    /* JADX INFO: renamed from: i */
    public void m127263i(pvl.InterfaceC19345a interfaceC19345a) {
        this.f103691i.mo35936r1(interfaceC19345a);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m127261e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m127264j(HideAndSeekPushData hideAndSeekPushData) {
        if (hideAndSeekPushData == null) {
            return;
        }
        final String strUserId = CoreModule.m29931H().userId();
        vwb.m200354z(hideAndSeekPushData.players, new e30() { // from class: l.con
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81850a.m127271s(strUserId, (GameData) obj);
            }
        });
        if (NullChecker.m81303a(this.f103688f)) {
            this.f103688f.m46059D0(hideAndSeekPushData.mouseCount);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m127265k(Location location) {
        if (TextUtils.isEmpty(this.f103696n)) {
            return;
        }
        GameData gameData = new GameData();
        gameData.f20395la = Double.toString(location.m78831u());
        gameData.f20396lg = Double.toString(location.m78833x());
        gameData.uid = CoreModule.m29931H().userId();
        gameData.roleType = this.f103696n;
        m127266l(gameData, true);
    }

    /* JADX INFO: renamed from: l */
    public void m127266l(GameData gameData, boolean z) {
        pvl.InterfaceC19348d interfaceC19348d;
        if (z) {
            interfaceC19348d = TextUtils.equals(GameRole.cat, gameData.roleType) ? this.f103692j : this.f103693k;
        } else {
            interfaceC19348d = TextUtils.equals(GameRole.cat, gameData.roleType) ? this.f103694l : this.f103695m;
        }
        int i = Integer.parseInt(gameData.uid);
        pvl.InterfaceC19346b interfaceC19346bMo35925B0 = this.f103691i.mo35925B0(i);
        if (interfaceC19346bMo35925B0 != null) {
            interfaceC19346bMo35925B0.mo35937a(i);
        }
        this.f103691i.mo35931d3().mo35945g(false).mo35943e(Double.parseDouble(gameData.f20395la), Double.parseDouble(gameData.f20396lg)).mo35942d(interfaceC19348d).mo35941c(0.5f, 0.5f).mo35939a(i).mo35944f(z ? 1.0f : 0.0f).mo35940b();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(snn snnVar) {
        this.f103690h = snnVar;
    }

    /* JADX INFO: renamed from: n */
    public void m127268n() {
        snn snnVar = this.f103690h;
        if (snnVar != null) {
            snnVar.m185163z0();
        }
    }

    /* JADX INFO: renamed from: p */
    public pvl m127269p() {
        return this.f103691i;
    }

    /* JADX INFO: renamed from: r */
    public void m127270r() {
        pvl pvlVarM35917b2 = this.f103689g.m35917b2();
        this.f103691i = pvlVarM35917b2;
        this.f103692j = pvlVarM35917b2.mo35929X2(x2c0.f189323F9);
        this.f103693k = this.f103691i.mo35929X2(x2c0.f189355G9);
        this.f103694l = this.f103691i.mo35929X2(x2c0.f189195B9);
        this.f103695m = this.f103691i.mo35929X2(x2c0.f189227C9);
        m127258q();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m127271s(String str, GameData gameData) {
        if (TextUtils.equals(gameData.uid, str)) {
            return;
        }
        m127266l(gameData, false);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m127272u(View view) {
        Location locationM185162y0 = this.f103690h.m185162y0();
        if (locationM185162y0 != null) {
            this.f103691i.mo35927K1(locationM185162y0.m78831u(), locationM185162y0.m78833x(), 17.0f);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m127273v(View view) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: x */
    public void m127274x() {
        if (NullChecker.m81303a(this.f103692j)) {
            this.f103692j.recycle();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m127275y(boolean z, GameRole gameRole) {
        xdl0.m208344M(this.f103685c, z);
        xdl0.m208344M(this.f103686d, z);
        if (!z) {
            this.f103696n = null;
        } else {
            this.f103696n = gameRole.toString();
            this.f103686d.setBackgroundResource(TEnum.equals(gameRole, GameRole.mouse) ? x2c0.f189291E9 : x2c0.f189259D9);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m127276z(HideAndSeekInfoData hideAndSeekInfoData) {
        if (hideAndSeekInfoData == null) {
            return;
        }
        if (NullChecker.m81303a(hideAndSeekInfoData.gameInfo) && NullChecker.m81303a(hideAndSeekInfoData.gameRole) && TEnum.equals(hideAndSeekInfoData.gameInfo.gameIdentity, GameIdentity.player) && TEnum.equals(hideAndSeekInfoData.gameInfo.gameStage, "start")) {
            xdl0.m208344M(this.f103687e, false);
            this.f103688f.m46064v0(hideAndSeekInfoData.gameRole, this);
            this.f103690h.m185159O0(Long.valueOf(hideAndSeekInfoData.gameRole.endTime));
        } else {
            this.f103691i.mo35930b2();
            this.f103688f.m46062r0();
            this.f103687e.m46042v0(hideAndSeekInfoData.gameInfo);
            m127275y(false, null);
        }
    }
}
