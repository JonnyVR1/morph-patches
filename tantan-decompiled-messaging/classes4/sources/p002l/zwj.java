package p002l;

import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zwj extends ir2 {
    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        LongLinkChatMessage.LiveChatMessage liveChatMessage;
        return (crc0Var == null || (liveChatMessage = crc0Var.f8914d) == null) ? vwb.f0(new String[0]) : vwb.f0(new String[]{liveChatMessage.getGift().getUrl()});
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        m15310d(jmf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p002l.k4m
    public String getType() {
        return "gift";
    }
}
