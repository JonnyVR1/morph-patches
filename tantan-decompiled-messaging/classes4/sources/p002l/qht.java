package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qht extends vp2<LongLinkLiveMessage.LiveSchemaChatMessage> {
    public qht(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.LiveSchemaChatMessage liveSchemaChatMessage, String str2) {
        if (liveSchemaChatMessage.getTemplateData() == null || liveSchemaChatMessage.getTemplateData().getId() == 0) {
            return super.mo9247x(str, liveSchemaChatMessage, str2);
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.scheme = liveSchemaChatMessage.getSchema();
        LiveMessage liveMessageM24093o = m24093o(str, liveSchemaChatMessage.getTemplateData().getId(), null, null, liveSchemaChatMessage.getTemplateData(), extInfo);
        liveMessageM24093o.actionType = 4;
        return liveMessageM24093o;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveSchemaChatMessage> mo9244b() {
        return LongLinkLiveMessage.LiveSchemaChatMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.schema.chat";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LiveSchemaChatMessage liveSchemaChatMessage, String str) {
        return !TextUtils.isEmpty(liveSchemaChatMessage.getSchema());
    }
}
