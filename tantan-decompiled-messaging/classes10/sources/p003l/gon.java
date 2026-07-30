package p003l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.GameData;
import com.p000p1.mobile.putong.core.data.GameIdentity;
import com.p000p1.mobile.putong.core.data.GameRole;
import com.p000p1.mobile.putong.core.data.GameStage;
import com.p000p1.mobile.putong.core.data.HideAndSeekInfoData;
import com.p000p1.mobile.putong.core.data.HideAndSeekPushData;
import com.p000p1.mobile.putong.core.map.IntlHideAndSeekAct;
import com.p000p1.mobile.putong.core.p001ui.hideandseek.IntlHideAndSeekInfoView;
import com.p000p1.mobile.putong.core.p001ui.hideandseek.IntlHideAndSeekRoleView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.pvl;
import l.s7m;
import l.vwb;
import l.x2c0;
import l.xdl0;
import v.VButton;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gon implements s7m<snn> {

    /* JADX INFO: renamed from: a */
    public VFrame f4692a;

    /* JADX INFO: renamed from: b */
    public VButton f4693b;

    /* JADX INFO: renamed from: c */
    public VButton f4694c;

    /* JADX INFO: renamed from: d */
    public VButton f4695d;

    /* JADX INFO: renamed from: e */
    public IntlHideAndSeekInfoView f4696e;

    /* JADX INFO: renamed from: f */
    public IntlHideAndSeekRoleView f4697f;

    /* JADX INFO: renamed from: g */
    public IntlHideAndSeekAct f4698g;

    /* JADX INFO: renamed from: h */
    public snn f4699h;

    /* JADX INFO: renamed from: i */
    public pvl f4700i;

    /* JADX INFO: renamed from: j */
    public pvl.d f4701j;

    /* JADX INFO: renamed from: k */
    public pvl.d f4702k;

    /* JADX INFO: renamed from: l */
    public pvl.d f4703l;

    /* JADX INFO: renamed from: m */
    public pvl.d f4704m;

    /* JADX INFO: renamed from: n */
    public String f4705n;

    public gon(IntlHideAndSeekAct intlHideAndSeekAct) {
        this.f4698g = intlHideAndSeekAct;
    }

    /* JADX INFO: renamed from: q */
    private void m6784q() {
        xdl0.E0(this.f4694c, new View.OnClickListener() { // from class: l.don
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4208a.m6800u(view);
            }
        });
        xdl0.E0(this.f4693b, new View.OnClickListener() { // from class: l.eon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4328a.m6801v(view);
            }
        });
        xdl0.E0(this.f4695d, new View.OnClickListener() { // from class: l.fon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4482a.m6785w(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m6785w(View view) {
        if (xdl0.O0(this.f4697f)) {
            return;
        }
        this.f4697f.m3418B0();
    }

    /* JADX INFO: renamed from: A */
    public void m6786A() {
        if (xdl0.O0(this.f4697f)) {
            this.f4697f.m3422r0();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6787C0() {
        return this.f4698g;
    }

    public void destroy() {
        if (NullChecker.a(this.f4697f)) {
            this.f4697f.m3424u0();
        }
        if (NullChecker.a(this.f4696e)) {
            this.f4696e.m3400s0();
        }
    }

    /* JADX INFO: renamed from: e */
    public View m6788e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hon.m7047b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IntlHideAndSeekAct act() {
        return this.f4698g;
    }

    /* JADX INFO: renamed from: i */
    public void m6790i(pvl.a aVar) {
        this.f4700i.r1(aVar);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m6788e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m6792j(HideAndSeekPushData hideAndSeekPushData) {
        if (hideAndSeekPushData == null) {
            return;
        }
        final String strUserId = CoreModule.H().userId();
        vwb.z(hideAndSeekPushData.players, new e30() { // from class: l.con
            public final void call(Object obj) {
                this.f4060a.m6799s(strUserId, (GameData) obj);
            }
        });
        if (NullChecker.a(this.f4697f)) {
            this.f4697f.m3419D0(hideAndSeekPushData.mouseCount);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m6793k(Location location) {
        if (TextUtils.isEmpty(this.f4705n)) {
            return;
        }
        GameData gameData = new GameData();
        gameData.f57la = Double.toString(location.u());
        gameData.f58lg = Double.toString(location.x());
        gameData.uid = CoreModule.H().userId();
        gameData.roleType = this.f4705n;
        m6794l(gameData, true);
    }

    /* JADX INFO: renamed from: l */
    public void m6794l(GameData gameData, boolean z) {
        pvl.d dVar;
        if (z) {
            dVar = TextUtils.equals(GameRole.cat, gameData.roleType) ? this.f4701j : this.f4702k;
        } else {
            dVar = TextUtils.equals(GameRole.cat, gameData.roleType) ? this.f4703l : this.f4704m;
        }
        int i = Integer.parseInt(gameData.uid);
        pvl.b bVarB0 = this.f4700i.B0(i);
        if (bVarB0 != null) {
            bVarB0.a(i);
        }
        this.f4700i.d3().g(false).e(Double.parseDouble(gameData.f57la), Double.parseDouble(gameData.f58lg)).d(dVar).c(0.5f, 0.5f).a(i).f(z ? 1.0f : 0.0f).b();
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m6791i1(snn snnVar) {
        this.f4699h = snnVar;
    }

    /* JADX INFO: renamed from: n */
    public void m6796n() {
        snn snnVar = this.f4699h;
        if (snnVar != null) {
            snnVar.m9467z0();
        }
    }

    /* JADX INFO: renamed from: p */
    public pvl m6797p() {
        return this.f4700i;
    }

    /* JADX INFO: renamed from: r */
    public void m6798r() {
        pvl pvlVarM727b2 = this.f4698g.m727b2();
        this.f4700i = pvlVarM727b2;
        this.f4701j = pvlVarM727b2.X2(x2c0.F9);
        this.f4702k = this.f4700i.X2(x2c0.G9);
        this.f4703l = this.f4700i.X2(x2c0.B9);
        this.f4704m = this.f4700i.X2(x2c0.C9);
        m6784q();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m6799s(String str, GameData gameData) {
        if (TextUtils.equals(gameData.uid, str)) {
            return;
        }
        m6794l(gameData, false);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m6800u(View view) {
        Location locationM9466y0 = this.f4699h.m9466y0();
        if (locationM9466y0 != null) {
            this.f4700i.K1(locationM9466y0.u(), locationM9466y0.x(), 17.0f);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m6801v(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: x */
    public void m6802x() {
        if (NullChecker.a(this.f4701j)) {
            this.f4701j.recycle();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m6803y(boolean z, GameRole gameRole) {
        xdl0.M(this.f4694c, z);
        xdl0.M(this.f4695d, z);
        if (!z) {
            this.f4705n = null;
        } else {
            this.f4705n = gameRole.toString();
            this.f4695d.setBackgroundResource(TEnum.equals(gameRole, GameRole.mouse) ? x2c0.E9 : x2c0.D9);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m6804z(HideAndSeekInfoData hideAndSeekInfoData) {
        if (hideAndSeekInfoData == null) {
            return;
        }
        if (NullChecker.a(hideAndSeekInfoData.gameInfo) && NullChecker.a(hideAndSeekInfoData.gameRole) && TEnum.equals(hideAndSeekInfoData.gameInfo.gameIdentity, GameIdentity.player) && TEnum.equals(hideAndSeekInfoData.gameInfo.gameStage, GameStage.start)) {
            xdl0.M(this.f4696e, false);
            this.f4697f.m3425v0(hideAndSeekInfoData.gameRole, this);
            this.f4699h.m9461O0(Long.valueOf(hideAndSeekInfoData.gameRole.endTime));
        } else {
            this.f4700i.b2();
            this.f4697f.m3422r0();
            this.f4696e.m3402v0(hideAndSeekInfoData.gameInfo);
            m6803y(false, null);
        }
    }
}
