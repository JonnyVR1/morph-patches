package p153l;

import android.text.TextUtils;
import com.google.protobuf.InterfaceC3442q;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.data.IdBoxed;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g2w<T extends InterfaceC3442q> extends m4w<T> {
    @Override // p153l.fxl, p153l.exl
    /* JADX INFO: renamed from: a */
    public final boolean mo123068a(InterfaceC3442q interfaceC3442q, pq60 pq60Var) {
        if (pq60Var == null) {
            return false;
        }
        if (interfaceC3442q == null && pq60Var.f153643a.hasPush() && !TextUtils.isEmpty(pq60Var.f153643a.getPush().getIntent())) {
            PushMessage pushMessageNew_ = PushMessage.new_();
            pushMessageNew_.gid = pq60Var.f153643a.getMsgId();
            pushMessageNew_.intent = mo96253c();
            m128667h(pushMessageNew_, pq60Var);
            mo128666g(pushMessageNew_);
            return true;
        }
        if (interfaceC3442q == null || !m123069b().isAssignableFrom(interfaceC3442q.getClass())) {
            return false;
        }
        PushMessage pushMessageNew_2 = PushMessage.new_();
        pushMessageNew_2.gid = pq60Var.f153643a.getMsgId();
        pushMessageNew_2.intent = mo96253c();
        populatePushMessage(pushMessageNew_2, pq60Var, interfaceC3442q);
        if (pq60Var.f153643a.hasPush() && !TextUtils.isEmpty(pq60Var.f153643a.getPush().getIntent())) {
            m128667h(pushMessageNew_2, pq60Var);
        }
        mo128666g(pushMessageNew_2);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void mo128666g(PushMessage pushMessage) {
        TantanApp.f17899c.m111149w(pushMessage.toJson(), false, "longlink");
    }

    /* JADX INFO: renamed from: h */
    public final void m128667h(PushMessage pushMessage, pq60 pq60Var) {
        LongLinkMessage.PushContent push = pq60Var.f153643a.getPush();
        pushMessage.reqId = push.getReqId();
        pushMessage.link = push.getLink();
        Map<String, String> messageCustomMap = push.getMessageCustomMap();
        if (messageCustomMap != null && messageCustomMap.size() > 0) {
            try {
                pushMessage.messageCustom = PushMessageCustom.JSON_ADAPTER.parse(new JSONObject(push.getMessageCustomMap()).toString());
            } catch (IOException e) {
                CrashHelper.m82479c(e);
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
        pushMessageContent.f39652id = push.getContent().getId();
        pushMessage.content.type = push.getContent().getType();
        pushMessage.content.parent = new IdBoxed(push.getContent().getParent().getId(), push.getContent().getParent().getType());
        pushMessage.intent = push.getIntent();
        pushMessage.createdTime = push.getCreateTime();
        pushMessage.priority = push.getPriority();
        pushMessage.primaryPicture = push.getPrimaryPicture();
    }

    public abstract void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, T t);
}
