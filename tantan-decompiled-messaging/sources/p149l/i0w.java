package p149l;

import android.text.TextUtils;
import com.google.protobuf.InterfaceC3419q;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class i0w<T extends InterfaceC3419q> extends o2w<T> {
    @Override // p149l.sul, p149l.rul
    /* JADX INFO: renamed from: a */
    public final boolean mo133933a(InterfaceC3419q interfaceC3419q, ki60 ki60Var) {
        if (ki60Var == null) {
            return false;
        }
        if (interfaceC3419q == null && ki60Var.f123271a.hasPush() && !TextUtils.isEmpty(ki60Var.f123271a.getPush().getIntent())) {
            PushMessage pushMessageNew_ = PushMessage.new_();
            pushMessageNew_.gid = ki60Var.f123271a.getMsgId();
            pushMessageNew_.intent = mo94754c();
            m133935h(pushMessageNew_, ki60Var);
            mo133934g(pushMessageNew_);
            return true;
        }
        if (interfaceC3419q == null || !m180880b().isAssignableFrom(interfaceC3419q.getClass())) {
            return false;
        }
        PushMessage pushMessageNew_2 = PushMessage.new_();
        pushMessageNew_2.gid = ki60Var.f123271a.getMsgId();
        pushMessageNew_2.intent = mo94754c();
        populatePushMessage(pushMessageNew_2, ki60Var, interfaceC3419q);
        if (ki60Var.f123271a.hasPush() && !TextUtils.isEmpty(ki60Var.f123271a.getPush().getIntent())) {
            m133935h(pushMessageNew_2, ki60Var);
        }
        mo133934g(pushMessageNew_2);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void mo133934g(PushMessage pushMessage) {
        TantanApp.f17180c.m214271w(pushMessage.toJson(), false, "longlink");
    }

    /* JADX INFO: renamed from: h */
    public final void m133935h(PushMessage pushMessage, ki60 ki60Var) {
        LongLinkMessage.PushContent push = ki60Var.f123271a.getPush();
        pushMessage.reqId = push.getReqId();
        pushMessage.link = push.getLink();
        Map<String, String> messageCustomMap = push.getMessageCustomMap();
        if (messageCustomMap != null && messageCustomMap.size() > 0) {
            try {
                pushMessage.messageCustom = PushMessageCustom.JSON_ADAPTER.parse(new JSONObject(push.getMessageCustomMap()).toString());
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
        }
        pushMessage.messageCustomMap = messageCustomMap != null ? new HashMap(messageCustomMap) : new HashMap();
        pushMessage.title = push.getTitle().getValue();
        pushMessage.value = push.getValue().getValue();
        pushMessage.ticker = push.getTicker().getValue();
        pushMessage.silent = push.getSilent();
        pushMessage.silentAggregation = push.getSilentAggregation();
        pushMessage.stackId = push.getStackId();
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.f38804id = push.getContent().getId();
        pushMessage.content.type = push.getContent().getType();
        pushMessage.content.parent = new IdBoxed(push.getContent().getParent().getId(), push.getContent().getParent().getType());
        pushMessage.intent = push.getIntent();
        pushMessage.createdTime = push.getCreateTime();
        pushMessage.priority = push.getPriority();
        pushMessage.primaryPicture = push.getPrimaryPicture();
    }

    public abstract void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, T t);
}
