package com.vivo.push.p118d;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14756e;
import com.vivo.push.C14765m;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.p116b.C14690h;
import com.vivo.push.p116b.C14699q;
import com.vivo.push.p116b.C14706x;
import com.vivo.push.util.C14784e;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14799t;
import com.vivo.push.util.C14805z;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.d.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C14747r extends AbstractC14755z {

    /* JADX INFO: renamed from: com.vivo.push.d.r$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo86020a();

        /* JADX INFO: renamed from: b */
        void mo86021b();
    }

    public C14747r(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        if (abstractC14769o == null) {
            C14795p.m86179a("OnNotificationArrivedTask", "command is null");
            return;
        }
        boolean zIsEnablePush = ClientConfigManagerImpl.getInstance(this.f61899a).isEnablePush();
        C14699q c14699q = (C14699q) abstractC14769o;
        Context context = this.f61899a;
        if (!C14799t.m86208d(context, context.getPackageName())) {
            C14706x c14706x = new C14706x(2101L);
            HashMap<String, String> map = new HashMap<>();
            map.put(Message.MESSAGE_ID, String.valueOf(c14699q.m85951f()));
            Context context2 = this.f61899a;
            String strM86232b = C14805z.m86232b(context2, context2.getPackageName());
            if (!TextUtils.isEmpty(strM86232b)) {
                map.put("remoteAppId", strM86232b);
            }
            c14706x.m85955a(map);
            C14756e.m86032a().m86049a(c14706x);
            return;
        }
        C14756e.m86032a().m86049a(new C14690h(String.valueOf(c14699q.m85951f())));
        C14795p.m86192d("OnNotificationArrivedTask", "PushMessageReceiver " + this.f61899a.getPackageName() + " isEnablePush :" + zIsEnablePush);
        if (!zIsEnablePush) {
            C14706x c14706x2 = new C14706x(1020L);
            HashMap<String, String> map2 = new HashMap<>();
            map2.put(Message.MESSAGE_ID, String.valueOf(c14699q.m85951f()));
            Context context3 = this.f61899a;
            String strM86232b2 = C14805z.m86232b(context3, context3.getPackageName());
            if (!TextUtils.isEmpty(strM86232b2)) {
                map2.put("remoteAppId", strM86232b2);
            }
            c14706x2.m85955a(map2);
            C14756e.m86032a().m86049a(c14706x2);
            return;
        }
        if (C14756e.m86032a().m86068g() && !m86028a(C14805z.m86237c(this.f61899a), c14699q.m85944e(), c14699q.m85952i())) {
            C14706x c14706x3 = new C14706x(1021L);
            HashMap<String, String> map3 = new HashMap<>();
            map3.put(Message.MESSAGE_ID, String.valueOf(c14699q.m85951f()));
            Context context4 = this.f61899a;
            String strM86232b3 = C14805z.m86232b(context4, context4.getPackageName());
            if (!TextUtils.isEmpty(strM86232b3)) {
                map3.put("remoteAppId", strM86232b3);
            }
            c14706x3.m85955a(map3);
            C14756e.m86032a().m86049a(c14706x3);
            return;
        }
        InsideNotificationItem insideNotificationItemM85943d = c14699q.m85943d();
        if (insideNotificationItemM85943d == null) {
            C14795p.m86179a("OnNotificationArrivedTask", "notify is null");
            C14795p.m86191c(this.f61899a, "通知内容为空，" + c14699q.m85951f());
            C14784e.m86146a(this.f61899a, c14699q.m85951f(), 1027L);
            return;
        }
        C14795p.m86192d("OnNotificationArrivedTask", "tragetType is " + insideNotificationItemM85943d.getTargetType() + " ; target is " + insideNotificationItemM85943d.getTragetContent());
        C14765m.m86087c(new RunnableC14748s(this, insideNotificationItemM85943d, c14699q));
    }
}
