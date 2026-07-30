package p002l;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.momo.xeengine.script.ScriptBridge;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.C0421a;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.network.ApiExcep;
import l.bwr;
import l.e30;
import l.exc0;
import l.ffw;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ees extends h4t<ho2, GameEffectView> {
    public ees(bsm<? extends ho2> bsmVar, GameEffectView gameEffectView) {
        super(bsmVar);
        C(gameEffectView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m12437S3(c cVar) {
        s7m s7mVar;
        if (cVar != c.j || (s7mVar = ((bwr) this).viewModel) == null) {
            return;
        }
        ((GameEffectView) s7mVar).m7130u();
    }

    /* JADX INFO: renamed from: N3 */
    public final String m12438N3(Throwable th) {
        iij.m15193o("report game data to server fail. error is " + th.getMessage());
        JsonObject jsonObject = new JsonObject();
        if (th instanceof ApiExcep) {
            exc0 exc0Var = ((ApiExcep) th).response;
            if (exc0Var != null) {
                jsonObject.addProperty("ec", Integer.valueOf(exc0Var.q()));
                jsonObject.addProperty("em", exc0Var.J());
            }
        } else {
            jsonObject.addProperty("ec", -1);
            jsonObject.addProperty("em", "Network failed. " + th.getMessage());
        }
        return jsonObject.toString();
    }

    /* JADX INFO: renamed from: O3 */
    public final String m12439O3(BLiveEnvelope bLiveEnvelope) {
        iij.m15193o("report game data to server success.");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ec", 0);
        jsonObject.addProperty("em", bLiveEnvelope.meta.message);
        if (!TextUtils.isEmpty(bLiveEnvelope.data.gameInfoResponse)) {
            jsonObject.addProperty("data", bLiveEnvelope.data.gameInfoResponse);
        }
        return jsonObject.toString();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m12440P3(ScriptBridge.Callback callback, BLiveEnvelope bLiveEnvelope) {
        callback.call(m12439O3(bLiveEnvelope));
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m12441R3(ScriptBridge.Callback callback, Throwable th) {
        callback.call(m12438N3(th));
    }

    /* JADX INFO: renamed from: T */
    public void m12442T() {
        super.T();
        m14189f3(m25548F2().GiftTraysEvent.playGameEffect()).m14209b(new e30() { // from class: l.aes
            public final void call(Object obj) {
                this.f7524a.m12443T3((C0421a.b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final void m12443T3(C0421a.b bVar) {
        BLiveEffect bLiveEffect = bVar.f6205a;
        GiftTrayData giftTrayData = bVar.f6206b;
        iij.m15191m();
        if (TextUtils.isEmpty(giftTrayData.f6155s)) {
            iij.m15193o("startEngine fail. Because gameInfo from server is null.");
            return;
        }
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((GameEffectView) s7mVar).m7133z(bLiveEffect, giftTrayData, m25552L2());
            return;
        }
        iij.m15193o("startEngine fail. Because mPresenter has not a gameEffectView. mPresenter is " + this);
    }

    /* JADX INFO: renamed from: U3 */
    public void m12444U3(String str) {
        iij.m15180b(str);
        m25548F2().TraysViewEvent.dismissTrayView().j(str);
    }

    /* JADX INFO: renamed from: V3 */
    public void m12445V3(GiftTrayData giftTrayData, String str, final ScriptBridge.Callback callback) {
        duringCreated(new ges().m13771b(giftTrayData, str)).subscribe(ffw.e(new e30() { // from class: l.ces
            public final void call(Object obj) {
                this.f8618a.m12440P3(callback, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.des
            public final void call(Object obj) {
                this.f9187a.m12441R3(callback, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m12446t() {
        super.t();
        lifecycle().subscribe(ffw.d(new e30() { // from class: l.bes
            public final void call(Object obj) {
                this.f8097a.m12437S3((c) obj);
            }
        }));
    }
}
