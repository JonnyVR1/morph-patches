package p149l;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.momo.xeengine.script.ScriptBridge;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.C12832a;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.common.network.ApiExcep;

/* JADX INFO: loaded from: classes4.dex */
public class ees extends h4t<ho2, GameEffectView> {
    public ees(bsm<? extends ho2> bsmVar, GameEffectView gameEffectView) {
        super(bsmVar);
        mo51532C(gameEffectView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m115994S3(C4319c c4319c) {
        V v2;
        if (c4319c != C4319c.f15549j || (v2 = this.viewModel) == 0) {
            return;
        }
        ((GameEffectView) v2).m73584u();
    }

    /* JADX INFO: renamed from: N3 */
    public final String m115995N3(Throwable th) {
        iij.m136421o("report game data to server fail. error is " + th.getMessage());
        JsonObject jsonObject = new JsonObject();
        if (th instanceof ApiExcep) {
            exc0 exc0Var = ((ApiExcep) th).response;
            if (exc0Var != null) {
                jsonObject.addProperty("ec", Integer.valueOf(exc0Var.m118609q()));
                jsonObject.addProperty("em", exc0Var.m118598J());
            }
        } else {
            jsonObject.addProperty("ec", (Number) (-1));
            jsonObject.addProperty("em", "Network failed. " + th.getMessage());
        }
        return jsonObject.toString();
    }

    /* JADX INFO: renamed from: O3 */
    public final String m115996O3(BLiveEnvelope bLiveEnvelope) {
        iij.m136421o("report game data to server success.");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ec", (Number) 0);
        jsonObject.addProperty("em", bLiveEnvelope.meta.message);
        if (!TextUtils.isEmpty(bLiveEnvelope.data.gameInfoResponse)) {
            jsonObject.addProperty("data", bLiveEnvelope.data.gameInfoResponse);
        }
        return jsonObject.toString();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m115997P3(ScriptBridge.Callback callback, BLiveEnvelope bLiveEnvelope) {
        callback.call(m115996O3(bLiveEnvelope));
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m115998R3(ScriptBridge.Callback callback, Throwable th) {
        callback.call(m115995N3(th));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129302f3(m206028F2().GiftTraysEvent.playGameEffect()).m129322b(new e30() { // from class: l.aes
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69077a.m115999T3((C12832a.b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final void m115999T3(C12832a.b bVar) {
        BLiveEffect bLiveEffect = bVar.f50163a;
        GiftTrayData giftTrayData = bVar.f50164b;
        iij.m136419m();
        if (TextUtils.isEmpty(giftTrayData.f50113s)) {
            iij.m136421o("startEngine fail. Because gameInfo from server is null.");
            return;
        }
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((GameEffectView) v2).m73587z(bLiveEffect, giftTrayData, m206032L2());
            return;
        }
        iij.m136421o("startEngine fail. Because mPresenter has not a gameEffectView. mPresenter is " + this);
    }

    /* JADX INFO: renamed from: U3 */
    public void m116000U3(String str) {
        iij.m136408b(str);
        m206028F2().TraysViewEvent.dismissTrayView().mo172463j(str);
    }

    /* JADX INFO: renamed from: V3 */
    public void m116001V3(GiftTrayData giftTrayData, String str, final ScriptBridge.Callback callback) {
        duringCreated(new ges().m125850b(giftTrayData, str)).subscribe(ffw.m121194e(new e30() { // from class: l.ces
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80490a.m115997P3(callback, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.des
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85852a.m115998R3(callback, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.bes
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75236a.m115994S3((C4319c) obj);
            }
        }));
    }
}
