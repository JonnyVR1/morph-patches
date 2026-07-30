package p153l;

import android.graphics.Color;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ksd extends yr2 {
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
        String strUnicodeWrap = list.get(0);
        if (BidiFormatter.getInstance().isRtl(strUnicodeWrap)) {
            strUnicodeWrap = BidiFormatter.getInstance(false).unicodeWrap(strUnicodeWrap, TextDirectionHeuristics.RTL);
        }
        suf0Var.f170681a.append((CharSequence) strUnicodeWrap);
        if (suf0Var.f170683c instanceof zql) {
            boolean zM137884b = hzc0Var.m137884b();
            Object obj = suf0Var.f170683c;
            if (zM137884b) {
                ((zql) obj).mo145148a(8);
            } else {
                ((zql) obj).mo145148a(4);
            }
        }
        suf0Var.f170683c = e810.f92501b;
        if (!jyb.m147479J(bLiveTemplateItem.gradientColors) && bLiveTemplateItem.gradientColors.size() >= 2) {
            kor korVar = new kor(n3d0.m161284h(bLiveTemplateItem.gradientColors.get(0).replace(BaseSei.f14624X, "#"), -1), n3d0.m161284h(bLiveTemplateItem.gradientColors.get(1).replace(BaseSei.f14624X, "#"), -1));
            SpannableStringBuilder spannableStringBuilder = suf0Var.f170681a;
            int i = suf0Var.f170682b;
            spannableStringBuilder.setSpan(korVar, i, strUnicodeWrap.length() + i, 33);
        } else if (!TextUtils.isEmpty(bLiveTemplateItem.color)) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor(bLiveTemplateItem.color.replace(BaseSei.f14624X, "#")));
            SpannableStringBuilder spannableStringBuilder2 = suf0Var.f170681a;
            int i2 = suf0Var.f170682b;
            spannableStringBuilder2.setSpan(foregroundColorSpan, i2, strUnicodeWrap.length() + i2, 33);
        }
        if (bLiveTemplateItem.size != 0) {
            SpannableStringBuilder spannableStringBuilder3 = suf0Var.f170681a;
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(bLiveTemplateItem.size, true);
            int i3 = suf0Var.f170682b;
            spannableStringBuilder3.setSpan(absoluteSizeSpan, i3, strUnicodeWrap.length() + i3, 33);
        }
        suf0Var.f170682b += strUnicodeWrap.length();
    }

    @Override // p153l.b7m
    public String getType() {
        return "default";
    }
}
