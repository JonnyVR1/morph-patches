package com.vivo.push.p113d;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.C14608e;
import com.vivo.push.util.C14636e;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14657z;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.d.t */
/* JADX INFO: loaded from: classes2.dex */
final class C14601t implements C14599r.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RunnableC14600s f61003a;

    public C14601t(RunnableC14600s runnableC14600s) {
        this.f61003a = runnableC14600s;
    }

    @Override // com.vivo.push.p113d.C14599r.a
    /* JADX INFO: renamed from: a */
    public final void mo84849a() {
        long jM84902l = C14608e.m84861a().m84902l();
        if (jM84902l < 1400 && jM84902l != 1340) {
            C14647p.m85015b("OnNotificationArrivedTask", "引擎版本太低，不支持正向展示功能，pushEngineSDKVersion：".concat(String.valueOf(jM84902l)));
            return;
        }
        HashMap map = new HashMap();
        map.put("srt", "1");
        map.put(Constants.MessagePayloadKeys.MSGID_SERVER, String.valueOf(this.f61003a.f61001b.m84780f()));
        String strM85061b = C14657z.m85061b(((AbstractRunnableC14616l) this.f61003a.f61002c).f61052a, ((AbstractRunnableC14616l) this.f61003a.f61002c).f61052a.getPackageName());
        if (!TextUtils.isEmpty(strM85061b)) {
            map.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, strM85061b);
        }
        map.put("type", "1");
        map.put("dtp", "1");
        C14636e.m84974a(6L, map);
    }

    @Override // com.vivo.push.p113d.C14599r.a
    /* JADX INFO: renamed from: b */
    public final void mo84850b() {
        HashMap map = new HashMap();
        map.put(Message.MESSAGE_ID, String.valueOf(this.f61003a.f61001b.m84780f()));
        String strM85061b = C14657z.m85061b(((AbstractRunnableC14616l) this.f61003a.f61002c).f61052a, ((AbstractRunnableC14616l) this.f61003a.f61002c).f61052a.getPackageName());
        if (!TextUtils.isEmpty(strM85061b)) {
            map.put("remoteAppId", strM85061b);
        }
        C14636e.m84974a(2122L, map);
    }
}
