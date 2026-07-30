package p002l;

import android.text.SpannableStringBuilder;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bu20 extends ir2 {
    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        return null;
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: c */
    public boolean mo10623c(List<String> list, BLiveTemplateItem bLiveTemplateItem, crc0 crc0Var) {
        return true;
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        if ("lineFeed".equals(bLiveTemplateItem.scene)) {
            jmf0Var.f13872a.append((CharSequence) uz00.f20888c);
            jmf0Var.f13873b += uz00.f20888c.length();
        } else {
            jmf0Var.f13873b = 0;
            jmf0Var.f13874c = null;
            jmf0Var.f13872a = new SpannableStringBuilder();
        }
    }

    @Override // p002l.k4m
    public String getType() {
        return "newline";
    }
}
