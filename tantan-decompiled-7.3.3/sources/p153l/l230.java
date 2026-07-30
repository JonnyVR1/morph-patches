package p153l;

import android.text.SpannableStringBuilder;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class l230 extends yr2 {
    @Override // p153l.yr2
    /* JADX INFO: renamed from: b */
    public List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        return null;
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: c */
    public boolean mo152559c(List<String> list, BLiveTemplateItem bLiveTemplateItem, hzc0 hzc0Var) {
        return true;
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: f */
    public void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var) {
        if ("lineFeed".equals(bLiveTemplateItem.scene)) {
            suf0Var.f170681a.append((CharSequence) e810.f92502c);
            suf0Var.f170682b += e810.f92502c.length();
        } else {
            suf0Var.f170682b = 0;
            suf0Var.f170683c = null;
            suf0Var.f170681a = new SpannableStringBuilder();
        }
    }

    @Override // p153l.b7m
    public String getType() {
        return "newline";
    }
}
