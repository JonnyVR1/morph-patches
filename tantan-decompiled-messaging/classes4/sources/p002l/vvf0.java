package p002l;

import android.graphics.Color;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;
import l.ool;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vvf0 extends ir2 {
    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        return vwb.f0(new String[]{bLiveTemplateItem.text});
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        String strUnicodeWrap = list.get(0);
        if (BidiFormatter.getInstance().isRtl(strUnicodeWrap)) {
            strUnicodeWrap = BidiFormatter.getInstance(false).unicodeWrap(strUnicodeWrap, TextDirectionHeuristics.RTL);
        }
        jmf0Var.f13872a.append((CharSequence) strUnicodeWrap);
        Object obj = jmf0Var.f13874c;
        if (obj instanceof ool) {
            ((ool) obj).a(4);
        }
        jmf0Var.f13874c = uz00.f20887b;
        if (!TextUtils.isEmpty(bLiveTemplateItem.color)) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor(bLiveTemplateItem.color.replace("x", "#")));
            SpannableStringBuilder spannableStringBuilder = jmf0Var.f13872a;
            int i = jmf0Var.f13873b;
            spannableStringBuilder.setSpan(foregroundColorSpan, i, strUnicodeWrap.length() + i, 34);
        }
        if (bLiveTemplateItem.size != 0) {
            SpannableStringBuilder spannableStringBuilder2 = jmf0Var.f13872a;
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(bLiveTemplateItem.size, true);
            int i2 = jmf0Var.f13873b;
            spannableStringBuilder2.setSpan(absoluteSizeSpan, i2, strUnicodeWrap.length() + i2, 34);
        }
        jmf0Var.f13873b += strUnicodeWrap.length();
    }

    @Override // p002l.k4m
    public String getType() {
        return "static";
    }
}
