package p002l;

import android.text.SpannableStringBuilder;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o6k extends ir2 {
    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        LongLinkChatMessage.LiveChatMessage liveChatMessage;
        if (bLiveTemplateItem.index <= 0) {
            return vwb.f0(new String[0]);
        }
        if (crc0Var == null || (liveChatMessage = crc0Var.f8914d) == null) {
            if (templateData != null) {
                int fieldsCount = templateData.getFieldsCount();
                int i = bLiveTemplateItem.index;
                if (fieldsCount > i - 1) {
                    return vwb.f0(new String[]{templateData.getFields(i - 1)});
                }
            }
        } else if (liveChatMessage.getTemplate().getFieldsCount() > bLiveTemplateItem.index - 1) {
            return vwb.f0(new String[]{crc0Var.f8914d.getTemplate().getFields(bLiveTemplateItem.index - 1)});
        }
        return vwb.f0(new String[0]);
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        String str = list.get(0);
        jmf0Var.f13874c = uz00.f20887b;
        jmf0Var.f13872a.append((CharSequence) str);
        n6k n6kVar = new n6k();
        n6kVar.m18511b(bLiveTemplateItem.gradientColors);
        SpannableStringBuilder spannableStringBuilder = jmf0Var.f13872a;
        int i = jmf0Var.f13873b;
        spannableStringBuilder.setSpan(n6kVar, i, str.length() + i, 33);
        jmf0Var.f13873b += str.length();
    }

    @Override // p002l.k4m
    public String getType() {
        return "gradientFlowText";
    }
}
