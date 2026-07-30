package com.p000p1.mobile.putong.live.livingroom.intl.game.api;

import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.utils.CrashHelper;
import l.cll;
import l.upv;
import l.w9j;
import l.ytr;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlGameApiProvider {
    public static c<String> getCode(String str) {
        cll cllVarD = cll.l(ytr.b("/live/sub/login")).p().d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SysnotifListener.KEY_USER_ID, str);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.p(cllVarD, "getCode" + jSONObject.toString(), jSONObject.toString()).map(new w9j() { // from class: l.ggn
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.code;
            }
        });
    }

    public static c<String> getRealOctopusGameUrl(String str) {
        return upv.h(cll.l(ytr.b("/live/octopus/fullUrl")).p().c("h5Url", str).d(), "getRealOctopusGameUrl " + str).map(new w9j() { // from class: l.fgn
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.octopusUrl;
            }
        });
    }
}
