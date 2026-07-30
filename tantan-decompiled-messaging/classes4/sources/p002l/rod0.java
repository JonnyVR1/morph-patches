package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;
import l.fld0;
import l.idv;
import l.vwb;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rod0 extends ir2 {
    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        if (TextUtils.equals(ypv.a.D0(), crc0Var.f8914d.getUserId())) {
            return vwb.f0(new String[0]);
        }
        User userI = ((idv) ypv.l(fld0.b)).i(ypv.a.D0());
        LongLinkChatMessage.LiveChatMessage liveChatMessage = crc0Var.f8914d;
        if (liveChatMessage != null && userI != null) {
            if (TextUtils.equals(userI.liveState.cityId, liveChatMessage.getExtInfo().getSenderCityID())) {
                return vwb.f0(new String[]{bLiveTemplateItem.url});
            }
        }
        return vwb.f0(new String[0]);
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        m15310d(jmf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p002l.k4m
    public String getType() {
        return "sameCityLable";
    }
}
