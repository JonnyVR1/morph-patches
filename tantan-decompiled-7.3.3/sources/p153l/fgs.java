package p153l;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.momo.xeengine.script.ScriptBridge;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.C12995a;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.common.network.ApiExcep;

/* JADX INFO: loaded from: classes4.dex */
public class fgs extends i6t<oo2, GameEffectView> {
    public fgs(dum<? extends oo2> dumVar, GameEffectView gameEffectView) {
        super(dumVar);
        mo52715C(gameEffectView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m125520S3(C4470c c4470c) {
        V v2;
        if (c4470c != C4470c.f16268j || (v2 = this.viewModel) == 0) {
            return;
        }
        ((GameEffectView) v2).m74767u();
    }

    /* JADX INFO: renamed from: N3 */
    public final String m125521N3(Throwable th) {
        clj.m110636o("report game data to server fail. error is " + th.getMessage());
        JsonObject jsonObject = new JsonObject();
        if (th instanceof ApiExcep) {
            i5d0 i5d0Var = ((ApiExcep) th).response;
            if (i5d0Var != null) {
                jsonObject.addProperty("ec", Integer.valueOf(i5d0Var.m138673q()));
                jsonObject.addProperty("em", i5d0Var.m138662J());
            }
        } else {
            jsonObject.addProperty("ec", (Number) (-1));
            jsonObject.addProperty("em", "Network failed. " + th.getMessage());
        }
        return jsonObject.toString();
    }

    /* JADX INFO: renamed from: O3 */
    public final String m125522O3(BLiveEnvelope bLiveEnvelope) {
        clj.m110636o("report game data to server success.");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ec", (Number) 0);
        jsonObject.addProperty("em", bLiveEnvelope.meta.message);
        if (!TextUtils.isEmpty(bLiveEnvelope.data.gameInfoResponse)) {
            jsonObject.addProperty("data", bLiveEnvelope.data.gameInfoResponse);
        }
        return jsonObject.toString();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m125523P3(ScriptBridge.Callback callback, BLiveEnvelope bLiveEnvelope) {
        callback.call(m125522O3(bLiveEnvelope));
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m125524R3(ScriptBridge.Callback callback, Throwable th) {
        callback.call(m125521N3(th));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138861f3(m213811F2().GiftTraysEvent.playGameEffect()).m138881b(new y20() { // from class: l.bgs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76679a.m125525T3((C12995a.b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final void m125525T3(C12995a.b bVar) {
        BLiveEffect bLiveEffect = bVar.f51011a;
        GiftTrayData giftTrayData = bVar.f51012b;
        clj.m110634m();
        if (TextUtils.isEmpty(giftTrayData.f50961s)) {
            clj.m110636o("startEngine fail. Because gameInfo from server is null.");
            return;
        }
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((GameEffectView) v2).m74770z(bLiveEffect, giftTrayData, m213815L2());
            return;
        }
        clj.m110636o("startEngine fail. Because mPresenter has not a gameEffectView. mPresenter is " + this);
    }

    /* JADX INFO: renamed from: U3 */
    public void m125526U3(String str) {
        clj.m110623b(str);
        m213811F2().TraysViewEvent.dismissTrayView().mo199273j(str);
    }

    /* JADX INFO: renamed from: V3 */
    public void m125527V3(GiftTrayData giftTrayData, String str, final ScriptBridge.Callback callback) {
        duringCreated(new hgs().m134971b(giftTrayData, str)).subscribe(dhw.m115826e(new y20() { // from class: l.dgs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88371a.m125523P3(callback, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.egs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93969a.m125524R3(callback, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.cgs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81728a.m125520S3((C4470c) obj);
            }
        }));
    }
}
