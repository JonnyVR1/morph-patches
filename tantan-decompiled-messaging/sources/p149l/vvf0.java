package p149l;

import android.graphics.Color;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vvf0 extends ir2 {
    @Override // p149l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        return vwb.m200324f0(bLiveTemplateItem.text);
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: f */
    public void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        String strUnicodeWrap = list.get(0);
        if (BidiFormatter.getInstance().isRtl(strUnicodeWrap)) {
            strUnicodeWrap = BidiFormatter.getInstance(false).unicodeWrap(strUnicodeWrap, TextDirectionHeuristics.RTL);
        }
        jmf0Var.f118629a.append((CharSequence) strUnicodeWrap);
        Object obj = jmf0Var.f118631c;
        if (obj instanceof ool) {
            ((ool) obj).mo95709a(4);
        }
        jmf0Var.f118631c = uz00.f178935b;
        if (!TextUtils.isEmpty(bLiveTemplateItem.color)) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor(bLiveTemplateItem.color.replace(BaseSei.f13930X, "#")));
            SpannableStringBuilder spannableStringBuilder = jmf0Var.f118629a;
            int i = jmf0Var.f118630b;
            spannableStringBuilder.setSpan(foregroundColorSpan, i, strUnicodeWrap.length() + i, 34);
        }
        if (bLiveTemplateItem.size != 0) {
            SpannableStringBuilder spannableStringBuilder2 = jmf0Var.f118629a;
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(bLiveTemplateItem.size, true);
            int i2 = jmf0Var.f118630b;
            spannableStringBuilder2.setSpan(absoluteSizeSpan, i2, strUnicodeWrap.length() + i2, 34);
        }
        jmf0Var.f118630b += strUnicodeWrap.length();
    }

    @Override // p149l.k4m
    public String getType() {
        return LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_STATIC;
    }
}
