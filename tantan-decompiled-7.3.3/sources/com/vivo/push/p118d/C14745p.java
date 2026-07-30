package com.vivo.push.p118d;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14756e;
import com.vivo.push.C14765m;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.p116b.C14690h;
import com.vivo.push.p116b.C14697o;
import com.vivo.push.p116b.C14706x;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14805z;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.d.p */
/* JADX INFO: loaded from: classes2.dex */
final class C14745p extends AbstractC14755z {
    public C14745p(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        C14697o c14697o = (C14697o) abstractC14769o;
        C14756e.m86032a().m86049a(new C14690h(String.valueOf(c14697o.m85951f())));
        if (!ClientConfigManagerImpl.getInstance(this.f61899a).isEnablePush()) {
            C14795p.m86192d("OnMessageTask", "command  " + abstractC14769o + " is ignore by disable push ");
            C14706x c14706x = new C14706x(1020L);
            HashMap<String, String> map = new HashMap<>();
            map.put(Message.MESSAGE_ID, String.valueOf(c14697o.m85951f()));
            Context context = this.f61899a;
            String strM86232b = C14805z.m86232b(context, context.getPackageName());
            if (!TextUtils.isEmpty(strM86232b)) {
                map.put("remoteAppId", strM86232b);
            }
            c14706x.m85955a(map);
            C14756e.m86032a().m86049a(c14706x);
            return;
        }
        if (C14756e.m86032a().m86068g() && !m86028a(C14805z.m86237c(this.f61899a), c14697o.m85938d(), c14697o.m85952i())) {
            C14706x c14706x2 = new C14706x(1021L);
            HashMap<String, String> map2 = new HashMap<>();
            map2.put(Message.MESSAGE_ID, String.valueOf(c14697o.m85951f()));
            Context context2 = this.f61899a;
            String strM86232b2 = C14805z.m86232b(context2, context2.getPackageName());
            if (!TextUtils.isEmpty(strM86232b2)) {
                map2.put("remoteAppId", strM86232b2);
            }
            c14706x2.m85955a(map2);
            C14756e.m86032a().m86049a(c14706x2);
            return;
        }
        UnvarnishedMessage unvarnishedMessageM85939e = c14697o.m85939e();
        if (unvarnishedMessageM85939e == null) {
            C14795p.m86179a("OnMessageTask", " message is null");
            return;
        }
        C14795p.m86192d("OnMessageTask", "tragetType is " + unvarnishedMessageM85939e.getTargetType() + " ; target is " + unvarnishedMessageM85939e.getTragetContent());
        C14765m.m86086b(new RunnableC14746q(this, unvarnishedMessageM85939e));
    }
}
