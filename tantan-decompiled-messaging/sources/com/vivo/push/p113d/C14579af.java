package com.vivo.push.p113d;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14608e;
import com.vivo.push.p111b.C14555u;
import com.vivo.push.p111b.C14558x;
import com.vivo.push.util.C14636e;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14657z;
import com.vivo.push.util.NotifyAdapterUtil;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.d.af */
/* JADX INFO: loaded from: classes2.dex */
final class C14579af extends AbstractC14607z {
    public C14579af(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        C14555u c14555u = (C14555u) abstractC14621o;
        if (C14608e.m84861a().m84897g() && !m84857a(C14657z.m85066c(this.f61052a), c14555u.m84779e(), c14555u.m84781i())) {
            C14647p.m85021d("OnUndoMsgTask", " vertify msg is error ");
            C14558x c14558x = new C14558x(1021L);
            HashMap<String, String> map = new HashMap<>();
            map.put(Message.MESSAGE_ID, String.valueOf(c14555u.m84780f()));
            Context context = this.f61052a;
            String strM85061b = C14657z.m85061b(context, context.getPackageName());
            if (!TextUtils.isEmpty(strM85061b)) {
                map.put("remoteAppId", strM85061b);
            }
            c14558x.m84784a(map);
            C14608e.m84861a().m84878a(c14558x);
            return;
        }
        boolean zRepealNotifyById = NotifyAdapterUtil.repealNotifyById(this.f61052a, c14555u.m84778d());
        C14647p.m85021d("OnUndoMsgTask", "undo message " + c14555u.m84778d() + ", " + zRepealNotifyById);
        if (zRepealNotifyById) {
            C14647p.m85018b(this.f61052a, "回收client通知成功, 上报埋点 1031, messageId = " + c14555u.m84778d());
            C14636e.m84975a(this.f61052a, c14555u.m84778d(), 1031L);
            return;
        }
        C14647p.m85021d("OnUndoMsgTask", "undo message fail，messageId = " + c14555u.m84778d());
        C14647p.m85020c(this.f61052a, "回收client通知失败，messageId = " + c14555u.m84778d());
    }
}
