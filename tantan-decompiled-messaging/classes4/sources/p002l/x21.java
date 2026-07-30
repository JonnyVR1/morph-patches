package p002l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;
import l.vwb;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x21 extends ir2 {
    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        return templateData == null ? vwb.f0(new String[]{""}) : vwb.f0(new String[]{templateData.getFields(bLiveTemplateItem.index - 1)});
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        String str = list.get(0);
        jmf0Var.f13874c = uz00.f20887b;
        jmf0Var.f13872a.append((CharSequence) str);
        SpannableStringBuilder spannableStringBuilder = jmf0Var.f13872a;
        z2s z2sVar = new z2s(bLiveTemplateItem.scene, null);
        int i = jmf0Var.f13873b;
        spannableStringBuilder.setSpan(z2sVar, i, str.length() + i, 33);
        int color = Color.parseColor(bLiveTemplateItem.color);
        LongLinkChatMessage.LiveChatMessage liveChatMessage = crc0Var.f8914d;
        if (liveChatMessage != null && liveChatMessage.getTypeValue() == 3 && ypv.a.D0().equals(crc0Var.f8914d.getUserId())) {
            color = -1;
        }
        SpannableStringBuilder spannableStringBuilder2 = jmf0Var.f13872a;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        int i2 = jmf0Var.f13873b;
        spannableStringBuilder2.setSpan(foregroundColorSpan, i2, str.length() + i2, 33);
        jmf0Var.f13873b += str.length();
    }

    @Override // p002l.k4m
    public String getType() {
        return "at";
    }
}
