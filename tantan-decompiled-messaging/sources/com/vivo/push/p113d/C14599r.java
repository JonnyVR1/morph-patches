package com.vivo.push.p113d;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14608e;
import com.vivo.push.C14617m;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.p111b.C14542h;
import com.vivo.push.p111b.C14551q;
import com.vivo.push.p111b.C14558x;
import com.vivo.push.util.C14636e;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14651t;
import com.vivo.push.util.C14657z;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.d.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C14599r extends AbstractC14607z {

    /* JADX INFO: renamed from: com.vivo.push.d.r$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo84849a();

        /* JADX INFO: renamed from: b */
        void mo84850b();
    }

    public C14599r(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        if (abstractC14621o == null) {
            C14647p.m85008a("OnNotificationArrivedTask", "command is null");
            return;
        }
        boolean zIsEnablePush = ClientConfigManagerImpl.getInstance(this.f61052a).isEnablePush();
        C14551q c14551q = (C14551q) abstractC14621o;
        Context context = this.f61052a;
        if (!C14651t.m85037d(context, context.getPackageName())) {
            C14558x c14558x = new C14558x(2101L);
            HashMap<String, String> map = new HashMap<>();
            map.put(Message.MESSAGE_ID, String.valueOf(c14551q.m84780f()));
            Context context2 = this.f61052a;
            String strM85061b = C14657z.m85061b(context2, context2.getPackageName());
            if (!TextUtils.isEmpty(strM85061b)) {
                map.put("remoteAppId", strM85061b);
            }
            c14558x.m84784a(map);
            C14608e.m84861a().m84878a(c14558x);
            return;
        }
        C14608e.m84861a().m84878a(new C14542h(String.valueOf(c14551q.m84780f())));
        C14647p.m85021d("OnNotificationArrivedTask", "PushMessageReceiver " + this.f61052a.getPackageName() + " isEnablePush :" + zIsEnablePush);
        if (!zIsEnablePush) {
            C14558x c14558x2 = new C14558x(1020L);
            HashMap<String, String> map2 = new HashMap<>();
            map2.put(Message.MESSAGE_ID, String.valueOf(c14551q.m84780f()));
            Context context3 = this.f61052a;
            String strM85061b2 = C14657z.m85061b(context3, context3.getPackageName());
            if (!TextUtils.isEmpty(strM85061b2)) {
                map2.put("remoteAppId", strM85061b2);
            }
            c14558x2.m84784a(map2);
            C14608e.m84861a().m84878a(c14558x2);
            return;
        }
        if (C14608e.m84861a().m84897g() && !m84857a(C14657z.m85066c(this.f61052a), c14551q.m84773e(), c14551q.m84781i())) {
            C14558x c14558x3 = new C14558x(1021L);
            HashMap<String, String> map3 = new HashMap<>();
            map3.put(Message.MESSAGE_ID, String.valueOf(c14551q.m84780f()));
            Context context4 = this.f61052a;
            String strM85061b3 = C14657z.m85061b(context4, context4.getPackageName());
            if (!TextUtils.isEmpty(strM85061b3)) {
                map3.put("remoteAppId", strM85061b3);
            }
            c14558x3.m84784a(map3);
            C14608e.m84861a().m84878a(c14558x3);
            return;
        }
        InsideNotificationItem insideNotificationItemM84772d = c14551q.m84772d();
        if (insideNotificationItemM84772d == null) {
            C14647p.m85008a("OnNotificationArrivedTask", "notify is null");
            C14647p.m85020c(this.f61052a, "通知内容为空，" + c14551q.m84780f());
            C14636e.m84975a(this.f61052a, c14551q.m84780f(), 1027L);
            return;
        }
        C14647p.m85021d("OnNotificationArrivedTask", "tragetType is " + insideNotificationItemM84772d.getTargetType() + " ; target is " + insideNotificationItemM84772d.getTragetContent());
        C14617m.m84916c(new RunnableC14600s(this, insideNotificationItemM84772d, c14551q));
    }
}
