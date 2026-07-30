package p153l;

import android.text.TextUtils;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
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
@Deprecated
public abstract class q4w<T extends InterfaceC3442q> implements fxl<T> {
    /* JADX INFO: renamed from: g */
    private void m175262g(PushMessage pushMessage, pq60 pq60Var) {
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

    @Override // p153l.fxl, p153l.exl
    /* JADX INFO: renamed from: a */
    public final boolean mo123068a(InterfaceC3442q interfaceC3442q, pq60 pq60Var) {
        if (interfaceC3442q == null || pq60Var == null || !mo95510b().isAssignableFrom(interfaceC3442q.getClass())) {
            return false;
        }
        PushMessage pushMessageNew_ = PushMessage.new_();
        pushMessageNew_.gid = pq60Var.f153643a.getMsgId();
        pushMessageNew_.intent = mo96253c();
        populatePushMessage(pushMessageNew_, pq60Var, interfaceC3442q);
        if (pq60Var.f153643a.hasPush() && !TextUtils.isEmpty(pq60Var.f153643a.getPush().getIntent())) {
            m175262g(pushMessageNew_, pq60Var);
        }
        mo175263e(pushMessageNew_);
        return true;
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: d */
    public InterfaceC3442q mo127983d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException {
        return qq60.m177481b(mo95510b(), msg.getData());
    }

    /* JADX INFO: renamed from: e */
    public void mo175263e(PushMessage pushMessage) {
        TantanApp.f17899c.m111149w(pushMessage.toJson(), false, "longlink");
    }

    public abstract void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, T t);
}
