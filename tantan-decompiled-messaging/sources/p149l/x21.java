package p149l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class x21 extends ir2 {
    @Override // p149l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        return templateData == null ? vwb.m200324f0("") : vwb.m200324f0(templateData.getFields(bLiveTemplateItem.index - 1));
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: f */
    public void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        String str = list.get(0);
        jmf0Var.f118631c = uz00.f178935b;
        jmf0Var.f118629a.append((CharSequence) str);
        SpannableStringBuilder spannableStringBuilder = jmf0Var.f118629a;
        z2s z2sVar = new z2s(bLiveTemplateItem.scene, null);
        int i = jmf0Var.f118630b;
        spannableStringBuilder.setSpan(z2sVar, i, str.length() + i, 33);
        int color = Color.parseColor(bLiveTemplateItem.color);
        LongLinkChatMessage.LiveChatMessage liveChatMessage = crc0Var.f82200d;
        if (liveChatMessage != null && liveChatMessage.getTypeValue() == 3 && ypv.f199493a.m199309D0().equals(crc0Var.f82200d.getUserId())) {
            color = -1;
        }
        SpannableStringBuilder spannableStringBuilder2 = jmf0Var.f118629a;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        int i2 = jmf0Var.f118630b;
        spannableStringBuilder2.setSpan(foregroundColorSpan, i2, str.length() + i2, 33);
        jmf0Var.f118630b += str.length();
    }

    @Override // p149l.k4m
    public String getType() {
        return "at";
    }
}
