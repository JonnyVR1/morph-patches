package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class rjt extends mq2<LongLinkLiveMessage.LiveSchemaChatMessage> {
    public rjt(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.LiveSchemaChatMessage liveSchemaChatMessage, String str2) {
        if (liveSchemaChatMessage.getTemplateData() == null || liveSchemaChatMessage.getTemplateData().getId() == 0) {
            return super.mo113619x(str, liveSchemaChatMessage, str2);
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.scheme = liveSchemaChatMessage.getSchema();
        LiveMessage liveMessageM159458o = m159458o(str, liveSchemaChatMessage.getTemplateData().getId(), null, null, liveSchemaChatMessage.getTemplateData(), extInfo);
        liveMessageM159458o.actionType = 4;
        return liveMessageM159458o;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveSchemaChatMessage> mo95510b() {
        return LongLinkLiveMessage.LiveSchemaChatMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.schema.chat";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveSchemaChatMessage liveSchemaChatMessage, String str) {
        return !TextUtils.isEmpty(liveSchemaChatMessage.getSchema());
    }
}
