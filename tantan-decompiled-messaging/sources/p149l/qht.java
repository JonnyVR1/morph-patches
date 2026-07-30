package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class qht extends vp2<LongLinkLiveMessage.LiveSchemaChatMessage> {
    public qht(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.LiveSchemaChatMessage liveSchemaChatMessage, String str2) {
        if (liveSchemaChatMessage.getTemplateData() == null || liveSchemaChatMessage.getTemplateData().getId() == 0) {
            return super.mo94401x(str, liveSchemaChatMessage, str2);
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.scheme = liveSchemaChatMessage.getSchema();
        LiveMessage liveMessageM199210o = m199210o(str, liveSchemaChatMessage.getTemplateData().getId(), null, null, liveSchemaChatMessage.getTemplateData(), extInfo);
        liveMessageM199210o.actionType = 4;
        return liveMessageM199210o;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveSchemaChatMessage> mo94398b() {
        return LongLinkLiveMessage.LiveSchemaChatMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.schema.chat";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveSchemaChatMessage liveSchemaChatMessage, String str) {
        return !TextUtils.isEmpty(liveSchemaChatMessage.getSchema());
    }
}
