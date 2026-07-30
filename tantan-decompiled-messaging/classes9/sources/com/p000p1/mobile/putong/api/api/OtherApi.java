package com.p000p1.mobile.putong.api.api;

import com.momocv.ApiBase;
import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.data.ChatAppealCheckData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.SliderVerifyData;
import com.tantanapp.common.network.NetIgnoredException;
import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.Callable;
import l.exc0;
import l.jo0;
import l.mkd0;
import l.roj0;
import l.stc0;
import l.t95;
import l.utc0;
import l.v9j;
import p006l.ia20;
import p006l.mu5;
import p006l.qib0;
import p006l.xh5;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class OtherApi extends ApiBase {
    private static final String SHUMENG_UPLOAD_URL = mu5.f17256e + "/v2/sm/pco/upload/tantan";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ roj0 lambda$tryMarkAsDAU$0() throws Exception {
        exc0 exc0VarExecute = null;
        try {
            try {
                exc0VarExecute = qib0.f19776D.a(debug_request_void()).execute();
            } catch (Exception e) {
                CrashHelper.c(e);
            } catch (NetIgnoredException | Exception unused) {
            }
            return roj0.a;
        } finally {
            t95.b(exc0VarExecute);
        }
    }

    public stc0 debug_request_void() throws Exception {
        Network network = xh5.network;
        return network.maybeUpdateRequestBeforeCall(network.auth().q(xh5.m27250i("/void")).f().b());
    }

    public void tryMarkAsDAU() {
        c.fromCallable(new Callable() { // from class: l.uy50
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23800a.lambda$tryMarkAsDAU$0();
            }
        }).compose(mkd0.C()).subscribe();
    }

    public c<Envelope> userAppealCheck(final ChatAppealCheckData chatAppealCheckData) {
        return qib0.f19785I.now(ia20.m16571e(new v9j() { // from class: l.sy50
            public final Object call() {
                return xh5.network.auth().q(xh5.m27261t("/me/appeal-check")).l(utc0.create(Network.JSON, chatAppealCheckData.toJson())).b();
            }
        }).observeOn(jo0.a()));
    }

    public c<Envelope> verifyContent(final SliderVerifyData sliderVerifyData) {
        return qib0.f19785I.now(ia20.m16571e(new v9j() { // from class: l.ty50
            public final Object call() {
                return xh5.network.auth().q(xh5.m27250i("/antispam/capture/verify")).l(utc0.create(Network.JSON, sliderVerifyData.toJson())).b();
            }
        }).observeOn(jo0.a()));
    }
}
