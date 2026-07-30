package p153l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class e31 extends yr2 {
    @Override // p153l.yr2
    /* JADX INFO: renamed from: b */
    public List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        return templateData == null ? jyb.m147507f0("") : jyb.m147507f0(templateData.getFields(bLiveTemplateItem.index - 1));
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: f */
    public void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var) {
        String str = list.get(0);
        suf0Var.f170683c = e810.f92501b;
        suf0Var.f170681a.append((CharSequence) str);
        SpannableStringBuilder spannableStringBuilder = suf0Var.f170681a;
        a5s a5sVar = new a5s(bLiveTemplateItem.scene, null);
        int i = suf0Var.f170682b;
        spannableStringBuilder.setSpan(a5sVar, i, str.length() + i, 33);
        int color = Color.parseColor(bLiveTemplateItem.color);
        LongLinkChatMessage.LiveChatMessage liveChatMessage = hzc0Var.f112224d;
        if (liveChatMessage != null && liveChatMessage.getTypeValue() == 3 && zrv.f205799a.m207631D0().equals(hzc0Var.f112224d.getUserId())) {
            color = -1;
        }
        SpannableStringBuilder spannableStringBuilder2 = suf0Var.f170681a;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        int i2 = suf0Var.f170682b;
        spannableStringBuilder2.setSpan(foregroundColorSpan, i2, str.length() + i2, 33);
        suf0Var.f170682b += str.length();
    }

    @Override // p153l.b7m
    public String getType() {
        return "at";
    }
}
