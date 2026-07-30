package com.vivo.push.p118d;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14756e;
import com.vivo.push.p116b.C14703u;
import com.vivo.push.p116b.C14706x;
import com.vivo.push.util.C14784e;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14805z;
import com.vivo.push.util.NotifyAdapterUtil;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.d.af */
/* JADX INFO: loaded from: classes2.dex */
final class C14727af extends AbstractC14755z {
    public C14727af(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        C14703u c14703u = (C14703u) abstractC14769o;
        if (C14756e.m86032a().m86068g() && !m86028a(C14805z.m86237c(this.f61899a), c14703u.m85950e(), c14703u.m85952i())) {
            C14795p.m86192d("OnUndoMsgTask", " vertify msg is error ");
            C14706x c14706x = new C14706x(1021L);
            HashMap<String, String> map = new HashMap<>();
            map.put(Message.MESSAGE_ID, String.valueOf(c14703u.m85951f()));
            Context context = this.f61899a;
            String strM86232b = C14805z.m86232b(context, context.getPackageName());
            if (!TextUtils.isEmpty(strM86232b)) {
                map.put("remoteAppId", strM86232b);
            }
            c14706x.m85955a(map);
            C14756e.m86032a().m86049a(c14706x);
            return;
        }
        boolean zRepealNotifyById = NotifyAdapterUtil.repealNotifyById(this.f61899a, c14703u.m85949d());
        C14795p.m86192d("OnUndoMsgTask", "undo message " + c14703u.m85949d() + ", " + zRepealNotifyById);
        if (zRepealNotifyById) {
            C14795p.m86189b(this.f61899a, "回收client通知成功, 上报埋点 1031, messageId = " + c14703u.m85949d());
            C14784e.m86146a(this.f61899a, c14703u.m85949d(), 1031L);
            return;
        }
        C14795p.m86192d("OnUndoMsgTask", "undo message fail，messageId = " + c14703u.m85949d());
        C14795p.m86191c(this.f61899a, "回收client通知失败，messageId = " + c14703u.m85949d());
    }
}
