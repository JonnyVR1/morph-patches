package com.p046p1.mobile.putong.api.api;

import com.momocv.ApiBase;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.ChatAppealCheckData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.SliderVerifyData;
import com.tantanapp.common.network.NetIgnoredException;
import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p149l.exc0;
import p149l.ia20;
import p149l.jo0;
import p149l.mkd0;
import p149l.mu5;
import p149l.qib0;
import p149l.roj0;
import p149l.stc0;
import p149l.t95;
import p149l.v9j;
import p149l.xh5;

/* JADX INFO: loaded from: classes9.dex */
public class OtherApi extends ApiBase {
    private static final String SHUMENG_UPLOAD_URL = mu5.f135737e + "/v2/sm/pco/upload/tantan";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ roj0 lambda$tryMarkAsDAU$0() throws Exception {
        exc0 exc0VarExecute = null;
        try {
            try {
                exc0VarExecute = qib0.f154685D.mo144849a(debug_request_void()).execute();
            } catch (NetIgnoredException | Exception unused) {
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            return roj0.f160388a;
        } finally {
            t95.m187604b(exc0VarExecute);
        }
    }

    public stc0 debug_request_void() throws Exception {
        Network network = xh5.network;
        return network.maybeUpdateRequestBeforeCall(network.auth().m185898q(xh5.m208761i("/void")).m185887f().m185883b());
    }

    public void tryMarkAsDAU() {
        C22306c.fromCallable(new Callable() { // from class: l.uy50
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f178828a.lambda$tryMarkAsDAU$0();
            }
        }).compose(mkd0.m154951C()).subscribe();
    }

    public C22306c<Envelope> userAppealCheck(final ChatAppealCheckData chatAppealCheckData) {
        return qib0.f154694I.now(ia20.m135121e(new v9j() { // from class: l.sy50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(xh5.m208772t("/me/appeal-check")).m185893l(utc0.create(Network.JSON, chatAppealCheckData.toJson())).m185883b();
            }
        }).observeOn(jo0.m142408a()));
    }

    public C22306c<Envelope> verifyContent(final SliderVerifyData sliderVerifyData) {
        return qib0.f154694I.now(ia20.m135121e(new v9j() { // from class: l.ty50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(xh5.m208761i("/antispam/capture/verify")).m185893l(utc0.create(Network.JSON, sliderVerifyData.toJson())).m185883b();
            }
        }).observeOn(jo0.m142408a()));
    }
}
