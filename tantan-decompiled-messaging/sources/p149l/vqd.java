package p149l;

import android.graphics.Color;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vqd extends ir2 {
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
        String strUnicodeWrap = list.get(0);
        if (BidiFormatter.getInstance().isRtl(strUnicodeWrap)) {
            strUnicodeWrap = BidiFormatter.getInstance(false).unicodeWrap(strUnicodeWrap, TextDirectionHeuristics.RTL);
        }
        jmf0Var.f118629a.append((CharSequence) strUnicodeWrap);
        if (jmf0Var.f118631c instanceof ool) {
            boolean zM108354b = crc0Var.m108354b();
            Object obj = jmf0Var.f118631c;
            if (zM108354b) {
                ((ool) obj).mo95709a(8);
            } else {
                ((ool) obj).mo95709a(4);
            }
        }
        jmf0Var.f118631c = uz00.f178935b;
        if (!vwb.m200296J(bLiveTemplateItem.gradientColors) && bLiveTemplateItem.gradientColors.size() >= 2) {
            jmr jmrVar = new jmr(kvc0.m147359h(bLiveTemplateItem.gradientColors.get(0).replace(BaseSei.f13930X, "#"), -1), kvc0.m147359h(bLiveTemplateItem.gradientColors.get(1).replace(BaseSei.f13930X, "#"), -1));
            SpannableStringBuilder spannableStringBuilder = jmf0Var.f118629a;
            int i = jmf0Var.f118630b;
            spannableStringBuilder.setSpan(jmrVar, i, strUnicodeWrap.length() + i, 33);
        } else if (!TextUtils.isEmpty(bLiveTemplateItem.color)) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor(bLiveTemplateItem.color.replace(BaseSei.f13930X, "#")));
            SpannableStringBuilder spannableStringBuilder2 = jmf0Var.f118629a;
            int i2 = jmf0Var.f118630b;
            spannableStringBuilder2.setSpan(foregroundColorSpan, i2, strUnicodeWrap.length() + i2, 33);
        }
        if (bLiveTemplateItem.size != 0) {
            SpannableStringBuilder spannableStringBuilder3 = jmf0Var.f118629a;
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(bLiveTemplateItem.size, true);
            int i3 = jmf0Var.f118630b;
            spannableStringBuilder3.setSpan(absoluteSizeSpan, i3, strUnicodeWrap.length() + i3, 33);
        }
        jmf0Var.f118630b += strUnicodeWrap.length();
    }

    @Override // p149l.k4m
    public String getType() {
        return "default";
    }
}
