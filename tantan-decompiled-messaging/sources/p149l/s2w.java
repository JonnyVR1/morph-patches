package p149l;

import android.text.TextUtils;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
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
@Deprecated
public abstract class s2w<T extends InterfaceC3419q> implements sul<T> {
    /* JADX INFO: renamed from: g */
    private void m182088g(PushMessage pushMessage, ki60 ki60Var) {
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

    @Override // p149l.sul, p149l.rul
    /* JADX INFO: renamed from: a */
    public final boolean mo133933a(InterfaceC3419q interfaceC3419q, ki60 ki60Var) {
        if (interfaceC3419q == null || ki60Var == null || !mo94398b().isAssignableFrom(interfaceC3419q.getClass())) {
            return false;
        }
        PushMessage pushMessageNew_ = PushMessage.new_();
        pushMessageNew_.gid = ki60Var.f123271a.getMsgId();
        pushMessageNew_.intent = mo94754c();
        populatePushMessage(pushMessageNew_, ki60Var, interfaceC3419q);
        if (ki60Var.f123271a.hasPush() && !TextUtils.isEmpty(ki60Var.f123271a.getPush().getIntent())) {
            m182088g(pushMessageNew_, ki60Var);
        }
        mo94755e(pushMessageNew_);
        return true;
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: d */
    public InterfaceC3419q mo157683d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException {
        return li60.m149879b(mo94398b(), msg.getData());
    }

    /* JADX INFO: renamed from: e */
    public void mo94755e(PushMessage pushMessage) {
        TantanApp.f17180c.m214271w(pushMessage.toJson(), false, "longlink");
    }

    public abstract void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, T t);
}
