package com.p051p1.mobile.putong.api.api;

import com.momocv.ApiBase;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.ChatAppealCheckData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.SliderVerifyData;
import com.tantanapp.common.network.NetIgnoredException;
import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p153l.fo0;
import p153l.i5d0;
import p153l.pcj;
import p153l.psd0;
import p153l.qi20;
import p153l.qv5;
import p153l.ua5;
import p153l.uqb0;
import p153l.uxj0;
import p153l.x1d0;
import p153l.xi5;

/* JADX INFO: loaded from: classes9.dex */
public class OtherApi extends ApiBase {
    private static final String SHUMENG_UPLOAD_URL = qv5.f159701e + "/v2/sm/pco/upload/tantan";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ uxj0 lambda$tryMarkAsDAU$0() throws Exception {
        i5d0 i5d0VarExecute = null;
        try {
            try {
                i5d0VarExecute = uqb0.f180368D.mo181341a(debug_request_void()).execute();
            } catch (NetIgnoredException | Exception unused) {
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            return uxj0.f181467a;
        } finally {
            ua5.m195158b(i5d0VarExecute);
        }
    }

    public x1d0 debug_request_void() throws Exception {
        Network network = xi5.network;
        return network.maybeUpdateRequestBeforeCall(network.auth().m209043q(xi5.m211107i("/void")).m209032f().m209028b());
    }

    public void tryMarkAsDAU() {
        C22421c.fromCallable(new Callable() { // from class: l.z660
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f203124a.lambda$tryMarkAsDAU$0();
            }
        }).compose(psd0.m173592C()).subscribe();
    }

    public C22421c<Envelope> userAppealCheck(final ChatAppealCheckData chatAppealCheckData) {
        return uqb0.f180377I.now(qi20.m176658e(new pcj() { // from class: l.x660
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(xi5.m211118t("/me/appeal-check")).m209038l(z1d0.create(Network.JSON, chatAppealCheckData.toJson())).m209028b();
            }
        }).observeOn(fo0.m126432a()));
    }

    public C22421c<Envelope> verifyContent(final SliderVerifyData sliderVerifyData) {
        return uqb0.f180377I.now(qi20.m176658e(new pcj() { // from class: l.y660
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(xi5.m211107i("/antispam/capture/verify")).m209038l(z1d0.create(Network.JSON, sliderVerifyData.toJson())).m209028b();
            }
        }).observeOn(fo0.m126432a()));
    }
}
