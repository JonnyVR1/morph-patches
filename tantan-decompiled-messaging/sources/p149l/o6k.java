package p149l;

import android.text.SpannableStringBuilder;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class o6k extends ir2 {
    @Override // p149l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        LongLinkChatMessage.LiveChatMessage liveChatMessage;
        if (bLiveTemplateItem.index <= 0) {
            return vwb.m200324f0(new String[0]);
        }
        if (crc0Var == null || (liveChatMessage = crc0Var.f82200d) == null) {
            if (templateData != null) {
                int fieldsCount = templateData.getFieldsCount();
                int i = bLiveTemplateItem.index;
                if (fieldsCount > i - 1) {
                    return vwb.m200324f0(templateData.getFields(i - 1));
                }
            }
        } else if (liveChatMessage.getTemplate().getFieldsCount() > bLiveTemplateItem.index - 1) {
            return vwb.m200324f0(crc0Var.f82200d.getTemplate().getFields(bLiveTemplateItem.index - 1));
        }
        return vwb.m200324f0(new String[0]);
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: f */
    public void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        String str = list.get(0);
        jmf0Var.f118631c = uz00.f178935b;
        jmf0Var.f118629a.append((CharSequence) str);
        n6k n6kVar = new n6k();
        n6kVar.m158061b(bLiveTemplateItem.gradientColors);
        SpannableStringBuilder spannableStringBuilder = jmf0Var.f118629a;
        int i = jmf0Var.f118630b;
        spannableStringBuilder.setSpan(n6kVar, i, str.length() + i, 33);
        jmf0Var.f118630b += str.length();
    }

    @Override // p149l.k4m
    public String getType() {
        return "gradientFlowText";
    }
}
