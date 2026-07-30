package p002l;

import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.fld0;
import l.ggv;
import l.vpv;
import l.vwb;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g6k0 extends ir2 {
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        long grade;
        BLiveUserLevel bLiveUserLevelV;
        vpv vpvVar = ypv.a;
        if (vpvVar != null) {
            vpvVar.D0();
        }
        if (NullChecker.a(crc0Var)) {
            LongLinkChatMessage.LiveChatMessage liveChatMessage = crc0Var.f8914d;
            if (liveChatMessage != null) {
                grade = liveChatMessage.getHierarchy().getGrade();
            } else {
                grade = crc0Var.f8913c;
                if (grade <= 0) {
                    grade = 0;
                }
            }
        } else {
            grade = 0;
        }
        return (grade <= 0 || !ypv.m() || (bLiveUserLevelV = ((ggv) ypv.l(fld0.c)).v(grade)) == null) ? vwb.f0(new String[0]) : vwb.f0(new String[]{bLiveUserLevelV.backendUrl});
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        LongLinkChatMessage.LiveChatMessage liveChatMessage = crc0Var.f8914d;
        if (liveChatMessage != null && liveChatMessage.getHierarchy() != null) {
            if (ney.m18698a(liveChatMessage.getHierarchy().getGrade())) {
                bLiveTemplateItem.size = 16;
            } else {
                bLiveTemplateItem.size = 14;
            }
        }
        m15310d(jmf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p002l.k4m
    public String getType() {
        return "hierarchy";
    }
}
