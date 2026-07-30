package com.vivo.push.p118d;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.C14756e;
import com.vivo.push.util.C14784e;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14805z;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.d.t */
/* JADX INFO: loaded from: classes2.dex */
final class C14749t implements C14747r.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RunnableC14748s f61850a;

    public C14749t(RunnableC14748s runnableC14748s) {
        this.f61850a = runnableC14748s;
    }

    @Override // com.vivo.push.p118d.C14747r.a
    /* JADX INFO: renamed from: a */
    public final void mo86020a() {
        long jM86073l = C14756e.m86032a().m86073l();
        if (jM86073l < 1400 && jM86073l != 1340) {
            C14795p.m86186b("OnNotificationArrivedTask", "引擎版本太低，不支持正向展示功能，pushEngineSDKVersion：".concat(String.valueOf(jM86073l)));
            return;
        }
        HashMap map = new HashMap();
        map.put("srt", "1");
        map.put(Constants.MessagePayloadKeys.MSGID_SERVER, String.valueOf(this.f61850a.f61848b.m85951f()));
        String strM86232b = C14805z.m86232b(((AbstractRunnableC14764l) this.f61850a.f61849c).f61899a, ((AbstractRunnableC14764l) this.f61850a.f61849c).f61899a.getPackageName());
        if (!TextUtils.isEmpty(strM86232b)) {
            map.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, strM86232b);
        }
        map.put("type", "1");
        map.put("dtp", "1");
        C14784e.m86145a(6L, map);
    }

    @Override // com.vivo.push.p118d.C14747r.a
    /* JADX INFO: renamed from: b */
    public final void mo86021b() {
        HashMap map = new HashMap();
        map.put(Message.MESSAGE_ID, String.valueOf(this.f61850a.f61848b.m85951f()));
        String strM86232b = C14805z.m86232b(((AbstractRunnableC14764l) this.f61850a.f61849c).f61899a, ((AbstractRunnableC14764l) this.f61850a.f61849c).f61899a.getPackageName());
        if (!TextUtils.isEmpty(strM86232b)) {
            map.put("remoteAppId", strM86232b);
        }
        C14784e.m86145a(2122L, map);
    }
}
