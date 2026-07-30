package p149l;

import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class g6k0 extends ir2 {
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    @Override // p149l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        long grade;
        BLiveUserLevel bLiveUserLevelM126036v;
        vpv vpvVar = ypv.f199493a;
        if (vpvVar != null) {
            vpvVar.m199309D0();
        }
        if (NullChecker.m81303a(crc0Var)) {
            LongLinkChatMessage.LiveChatMessage liveChatMessage = crc0Var.f82200d;
            if (liveChatMessage != null) {
                grade = liveChatMessage.getHierarchy().getGrade();
            } else {
                grade = crc0Var.f82199c;
                if (grade <= 0) {
                    grade = 0;
                }
            }
        } else {
            grade = 0;
        }
        return (grade <= 0 || !ypv.m215674m() || (bLiveUserLevelM126036v = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(grade)) == null) ? vwb.m200324f0(new String[0]) : vwb.m200324f0(bLiveUserLevelM126036v.backendUrl);
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: f */
    public void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        LongLinkChatMessage.LiveChatMessage liveChatMessage = crc0Var.f82200d;
        if (liveChatMessage != null && liveChatMessage.getHierarchy() != null) {
            if (ney.m159134a(liveChatMessage.getHierarchy().getGrade())) {
                bLiveTemplateItem.size = 16;
            } else {
                bLiveTemplateItem.size = 14;
            }
        }
        m137817d(jmf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p149l.k4m
    public String getType() {
        return "hierarchy";
    }
}
