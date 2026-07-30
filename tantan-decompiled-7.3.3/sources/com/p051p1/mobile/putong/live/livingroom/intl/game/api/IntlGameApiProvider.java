package com.p051p1.mobile.putong.live.livingroom.intl.game.api;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.qcj;
import p153l.rnl;
import p153l.vrv;
import p153l.zvr;

/* JADX INFO: loaded from: classes5.dex */
public class IntlGameApiProvider {
    public static C22421c<String> getCode(String str) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/live/sub/login")).m182288p().m182301d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", str);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202555p(rnlVarM182301d, "getCode" + jSONObject.toString(), jSONObject.toString()).map(new qcj() { // from class: l.gin
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.code;
            }
        });
    }

    public static C22421c<String> getRealOctopusGameUrl(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live/octopus/fullUrl")).m182288p().m182300c("h5Url", str).m182301d(), "getRealOctopusGameUrl " + str).map(new qcj() { // from class: l.fin
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.octopusUrl;
            }
        });
    }
}
