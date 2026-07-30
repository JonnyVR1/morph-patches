package p153l;

import android.graphics.Color;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class e4g0 extends yr2 {
    @Override // p153l.yr2
    /* JADX INFO: renamed from: b */
    public List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        return jyb.m147507f0(bLiveTemplateItem.text);
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: f */
    public void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var) {
        String strUnicodeWrap = list.get(0);
        if (BidiFormatter.getInstance().isRtl(strUnicodeWrap)) {
            strUnicodeWrap = BidiFormatter.getInstance(false).unicodeWrap(strUnicodeWrap, TextDirectionHeuristics.RTL);
        }
        suf0Var.f170681a.append((CharSequence) strUnicodeWrap);
        Object obj = suf0Var.f170683c;
        if (obj instanceof zql) {
            ((zql) obj).mo145148a(4);
        }
        suf0Var.f170683c = e810.f92501b;
        if (!TextUtils.isEmpty(bLiveTemplateItem.color)) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor(bLiveTemplateItem.color.replace(BaseSei.f14624X, "#")));
            SpannableStringBuilder spannableStringBuilder = suf0Var.f170681a;
            int i = suf0Var.f170682b;
            spannableStringBuilder.setSpan(foregroundColorSpan, i, strUnicodeWrap.length() + i, 34);
        }
        if (bLiveTemplateItem.size != 0) {
            SpannableStringBuilder spannableStringBuilder2 = suf0Var.f170681a;
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(bLiveTemplateItem.size, true);
            int i2 = suf0Var.f170682b;
            spannableStringBuilder2.setSpan(absoluteSizeSpan, i2, strUnicodeWrap.length() + i2, 34);
        }
        suf0Var.f170682b += strUnicodeWrap.length();
    }

    @Override // p153l.b7m
    public String getType() {
        return LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_STATIC;
    }
}
