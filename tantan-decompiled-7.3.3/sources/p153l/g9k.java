package p153l;

import android.text.SpannableStringBuilder;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class g9k extends yr2 {
    @Override // p153l.yr2
    /* JADX INFO: renamed from: b */
    public List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        LongLinkChatMessage.LiveChatMessage liveChatMessage;
        if (bLiveTemplateItem.index <= 0) {
            return jyb.m147507f0(new String[0]);
        }
        if (hzc0Var == null || (liveChatMessage = hzc0Var.f112224d) == null) {
            if (templateData != null) {
                int fieldsCount = templateData.getFieldsCount();
                int i = bLiveTemplateItem.index;
                if (fieldsCount > i - 1) {
                    return jyb.m147507f0(templateData.getFields(i - 1));
                }
            }
        } else if (liveChatMessage.getTemplate().getFieldsCount() > bLiveTemplateItem.index - 1) {
            return jyb.m147507f0(hzc0Var.f112224d.getTemplate().getFields(bLiveTemplateItem.index - 1));
        }
        return jyb.m147507f0(new String[0]);
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: f */
    public void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var) {
        String str = list.get(0);
        suf0Var.f170683c = e810.f92501b;
        suf0Var.f170681a.append((CharSequence) str);
        f9k f9kVar = new f9k();
        f9kVar.m124669b(bLiveTemplateItem.gradientColors);
        SpannableStringBuilder spannableStringBuilder = suf0Var.f170681a;
        int i = suf0Var.f170682b;
        spannableStringBuilder.setSpan(f9kVar, i, str.length() + i, 33);
        suf0Var.f170682b += str.length();
    }

    @Override // p153l.b7m
    public String getType() {
        return "gradientFlowText";
    }
}
