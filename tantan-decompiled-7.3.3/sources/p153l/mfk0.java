package p153l;

import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class mfk0 extends yr2 {
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    @Override // p153l.yr2
    /* JADX INFO: renamed from: b */
    public List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        long grade;
        BLiveUserLevel bLiveUserLevelM135170v;
        wrv wrvVar = zrv.f205799a;
        if (wrvVar != null) {
            wrvVar.m207631D0();
        }
        if (NullChecker.m82486a(hzc0Var)) {
            LongLinkChatMessage.LiveChatMessage liveChatMessage = hzc0Var.f112224d;
            if (liveChatMessage != null) {
                grade = liveChatMessage.getHierarchy().getGrade();
            } else {
                grade = hzc0Var.f112223c;
                if (grade <= 0) {
                    grade = 0;
                }
            }
        } else {
            grade = 0;
        }
        return (grade <= 0 || !zrv.m221195m() || (bLiveUserLevelM135170v = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(grade)) == null) ? jyb.m147507f0(new String[0]) : jyb.m147507f0(bLiveUserLevelM135170v.backendUrl);
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: f */
    public void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var) {
        LongLinkChatMessage.LiveChatMessage liveChatMessage = hzc0Var.f112224d;
        if (liveChatMessage != null && liveChatMessage.getHierarchy() != null) {
            if (kny.m150553a(liveChatMessage.getHierarchy().getGrade())) {
                bLiveTemplateItem.size = 16;
            } else {
                bLiveTemplateItem.size = 14;
            }
        }
        m217146d(suf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p153l.b7m
    public String getType() {
        return "hierarchy";
    }
}
