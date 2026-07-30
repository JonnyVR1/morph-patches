package p006l;

import android.text.TextUtils;
import com.google.protobuf.q;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.putong.data.IdBoxed;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import l.ki60;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class i0w<T extends q> extends o2w<T> {
    @Override // p006l.sul, p006l.rul
    /* JADX INFO: renamed from: a */
    public final boolean mo16452a(q qVar, ki60 ki60Var) {
        if (ki60Var == null) {
            return false;
        }
        if (qVar == null && ki60Var.a.hasPush() && !TextUtils.isEmpty(ki60Var.a.getPush().getIntent())) {
            PushMessage pushMessageNew_ = PushMessage.new_();
            pushMessageNew_.gid = ki60Var.a.getMsgId();
            pushMessageNew_.intent = mo11744c();
            m16454h(pushMessageNew_, ki60Var);
            mo16453g(pushMessageNew_);
            return true;
        }
        if (qVar == null || !m22959b().isAssignableFrom(qVar.getClass())) {
            return false;
        }
        PushMessage pushMessageNew_2 = PushMessage.new_();
        pushMessageNew_2.gid = ki60Var.a.getMsgId();
        pushMessageNew_2.intent = mo11744c();
        populatePushMessage(pushMessageNew_2, ki60Var, qVar);
        if (ki60Var.a.hasPush() && !TextUtils.isEmpty(ki60Var.a.getPush().getIntent())) {
            m16454h(pushMessageNew_2, ki60Var);
        }
        mo16453g(pushMessageNew_2);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void mo16453g(PushMessage pushMessage) {
        TantanApp.f1169c.m28218w(pushMessage.toJson(), false, "longlink");
    }

    /* JADX INFO: renamed from: h */
    public final void m16454h(PushMessage pushMessage, ki60 ki60Var) {
        LongLinkMessage.PushContent push = ki60Var.a.getPush();
        pushMessage.reqId = push.getReqId();
        pushMessage.link = push.getLink();
        Map messageCustomMap = push.getMessageCustomMap();
        if (messageCustomMap != null && messageCustomMap.size() > 0) {
            try {
                pushMessage.messageCustom = (PushMessageCustom) PushMessageCustom.JSON_ADAPTER.parse(new JSONObject(push.getMessageCustomMap()).toString());
            } catch (IOException e) {
                CrashHelper.c(e);
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
        pushMessageContent.id = push.getContent().getId();
        pushMessage.content.type = push.getContent().getType();
        pushMessage.content.parent = new IdBoxed(push.getContent().getParent().getId(), push.getContent().getParent().getType());
        pushMessage.intent = push.getIntent();
        pushMessage.createdTime = push.getCreateTime();
        pushMessage.priority = push.getPriority();
        pushMessage.primaryPicture = push.getPrimaryPicture();
    }

    public abstract void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, T t);
}
