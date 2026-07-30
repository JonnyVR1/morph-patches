package p002l;

import android.graphics.Color;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;
import l.jmr;
import l.kvc0;
import l.ool;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vqd extends ir2 {
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
        String strUnicodeWrap = list.get(0);
        if (BidiFormatter.getInstance().isRtl(strUnicodeWrap)) {
            strUnicodeWrap = BidiFormatter.getInstance(false).unicodeWrap(strUnicodeWrap, TextDirectionHeuristics.RTL);
        }
        jmf0Var.f13872a.append((CharSequence) strUnicodeWrap);
        if (jmf0Var.f13874c instanceof ool) {
            boolean zM11342b = crc0Var.m11342b();
            Object obj = jmf0Var.f13874c;
            if (zM11342b) {
                ((ool) obj).a(8);
            } else {
                ((ool) obj).a(4);
            }
        }
        jmf0Var.f13874c = uz00.f20887b;
        if (!vwb.J(bLiveTemplateItem.gradientColors) && bLiveTemplateItem.gradientColors.size() >= 2) {
            jmr jmrVar = new jmr(kvc0.h(((String) bLiveTemplateItem.gradientColors.get(0)).replace("x", "#"), -1), kvc0.h(((String) bLiveTemplateItem.gradientColors.get(1)).replace("x", "#"), -1));
            SpannableStringBuilder spannableStringBuilder = jmf0Var.f13872a;
            int i = jmf0Var.f13873b;
            spannableStringBuilder.setSpan(jmrVar, i, strUnicodeWrap.length() + i, 33);
        } else if (!TextUtils.isEmpty(bLiveTemplateItem.color)) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor(bLiveTemplateItem.color.replace("x", "#")));
            SpannableStringBuilder spannableStringBuilder2 = jmf0Var.f13872a;
            int i2 = jmf0Var.f13873b;
            spannableStringBuilder2.setSpan(foregroundColorSpan, i2, strUnicodeWrap.length() + i2, 33);
        }
        if (bLiveTemplateItem.size != 0) {
            SpannableStringBuilder spannableStringBuilder3 = jmf0Var.f13872a;
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(bLiveTemplateItem.size, true);
            int i3 = jmf0Var.f13873b;
            spannableStringBuilder3.setSpan(absoluteSizeSpan, i3, strUnicodeWrap.length() + i3, 33);
        }
        jmf0Var.f13873b += strUnicodeWrap.length();
    }

    @Override // p002l.k4m
    public String getType() {
        return "default";
    }
}
