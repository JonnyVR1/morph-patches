package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class twd0 extends yr2 {
    @Override // p153l.yr2
    /* JADX INFO: renamed from: b */
    public List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        if (TextUtils.equals(zrv.f205799a.m207631D0(), hzc0Var.f112224d.getUserId())) {
            return jyb.m147507f0(new String[0]);
        }
        User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0());
        LongLinkChatMessage.LiveChatMessage liveChatMessage = hzc0Var.f112224d;
        if (liveChatMessage != null && userM144722i != null) {
            if (TextUtils.equals(userM144722i.liveState.cityId, liveChatMessage.getExtInfo().getSenderCityID())) {
                return jyb.m147507f0(bLiveTemplateItem.url);
            }
        }
        return jyb.m147507f0(new String[0]);
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: f */
    public void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var) {
        m217146d(suf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p153l.b7m
    public String getType() {
        return "sameCityLable";
    }
}
