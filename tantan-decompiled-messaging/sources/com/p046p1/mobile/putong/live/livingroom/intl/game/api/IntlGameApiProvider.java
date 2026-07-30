package com.p046p1.mobile.putong.live.livingroom.intl.game.api;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.cll;
import p149l.upv;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes4.dex */
public class IntlGameApiProvider {
    public static C22306c<String> getCode(String str) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/live/sub/login")).m107524p().m107537d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", str);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194928p(cllVarM107537d, "getCode" + jSONObject.toString(), jSONObject.toString()).map(new w9j() { // from class: l.ggn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.code;
            }
        });
    }

    public static C22306c<String> getRealOctopusGameUrl(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/live/octopus/fullUrl")).m107524p().m107536c("h5Url", str).m107537d(), "getRealOctopusGameUrl " + str).map(new w9j() { // from class: l.fgn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.octopusUrl;
            }
        });
    }
}
