package p149l;

import android.text.SpannableStringBuilder;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bu20 extends ir2 {
    @Override // p149l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        return null;
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: c */
    public boolean mo103902c(List<String> list, BLiveTemplateItem bLiveTemplateItem, crc0 crc0Var) {
        return true;
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: f */
    public void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        if ("lineFeed".equals(bLiveTemplateItem.scene)) {
            jmf0Var.f118629a.append((CharSequence) uz00.f178936c);
            jmf0Var.f118630b += uz00.f178936c.length();
        } else {
            jmf0Var.f118630b = 0;
            jmf0Var.f118631c = null;
            jmf0Var.f118629a = new SpannableStringBuilder();
        }
    }

    @Override // p149l.k4m
    public String getType() {
        return "newline";
    }
}
