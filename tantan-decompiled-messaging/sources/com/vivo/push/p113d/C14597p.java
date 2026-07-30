package com.vivo.push.p113d;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14608e;
import com.vivo.push.C14617m;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.p111b.C14542h;
import com.vivo.push.p111b.C14549o;
import com.vivo.push.p111b.C14558x;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14657z;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.d.p */
/* JADX INFO: loaded from: classes2.dex */
final class C14597p extends AbstractC14607z {
    public C14597p(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        C14549o c14549o = (C14549o) abstractC14621o;
        C14608e.m84861a().m84878a(new C14542h(String.valueOf(c14549o.m84780f())));
        if (!ClientConfigManagerImpl.getInstance(this.f61052a).isEnablePush()) {
            C14647p.m85021d("OnMessageTask", "command  " + abstractC14621o + " is ignore by disable push ");
            C14558x c14558x = new C14558x(1020L);
            HashMap<String, String> map = new HashMap<>();
            map.put(Message.MESSAGE_ID, String.valueOf(c14549o.m84780f()));
            Context context = this.f61052a;
            String strM85061b = C14657z.m85061b(context, context.getPackageName());
            if (!TextUtils.isEmpty(strM85061b)) {
                map.put("remoteAppId", strM85061b);
            }
            c14558x.m84784a(map);
            C14608e.m84861a().m84878a(c14558x);
            return;
        }
        if (C14608e.m84861a().m84897g() && !m84857a(C14657z.m85066c(this.f61052a), c14549o.m84767d(), c14549o.m84781i())) {
            C14558x c14558x2 = new C14558x(1021L);
            HashMap<String, String> map2 = new HashMap<>();
            map2.put(Message.MESSAGE_ID, String.valueOf(c14549o.m84780f()));
            Context context2 = this.f61052a;
            String strM85061b2 = C14657z.m85061b(context2, context2.getPackageName());
            if (!TextUtils.isEmpty(strM85061b2)) {
                map2.put("remoteAppId", strM85061b2);
            }
            c14558x2.m84784a(map2);
            C14608e.m84861a().m84878a(c14558x2);
            return;
        }
        UnvarnishedMessage unvarnishedMessageM84768e = c14549o.m84768e();
        if (unvarnishedMessageM84768e == null) {
            C14647p.m85008a("OnMessageTask", " message is null");
            return;
        }
        C14647p.m85021d("OnMessageTask", "tragetType is " + unvarnishedMessageM84768e.getTargetType() + " ; target is " + unvarnishedMessageM84768e.getTragetContent());
        C14617m.m84915b(new RunnableC14598q(this, unvarnishedMessageM84768e));
    }
}
