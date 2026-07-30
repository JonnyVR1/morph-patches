package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class rod0 extends ir2 {
    @Override // p149l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        if (TextUtils.equals(ypv.f199493a.m199309D0(), crc0Var.f82200d.getUserId())) {
            return vwb.m200324f0(new String[0]);
        }
        User userM135637i = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0());
        LongLinkChatMessage.LiveChatMessage liveChatMessage = crc0Var.f82200d;
        if (liveChatMessage != null && userM135637i != null) {
            if (TextUtils.equals(userM135637i.liveState.cityId, liveChatMessage.getExtInfo().getSenderCityID())) {
                return vwb.m200324f0(bLiveTemplateItem.url);
            }
        }
        return vwb.m200324f0(new String[0]);
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: f */
    public void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        m137817d(jmf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p149l.k4m
    public String getType() {
        return "sameCityLable";
    }
}
