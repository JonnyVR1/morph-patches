package p153l;

import android.text.SpannableStringBuilder;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yr2 implements b7m {
    @Override // p153l.b7m
    /* JADX INFO: renamed from: a */
    public void mo102847a(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        List<String> listMo107422b = mo107422b(bLiveTemplateItem, templateData, hzc0Var);
        if (mo152559c(listMo107422b, bLiveTemplateItem, hzc0Var)) {
            mo107423f(suf0Var, bLiveTemplateItem, listMo107422b, hzc0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var);

    /* JADX INFO: renamed from: c */
    public boolean mo152559c(List<String> list, BLiveTemplateItem bLiveTemplateItem, hzc0 hzc0Var) {
        return (jyb.m147479J(list) || list.get(0) == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public void m217146d(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, String str) {
        suf0Var.f170683c = m217147e(suf0Var.f170681a, str, suf0Var.f170682b, bLiveTemplateItem.size, suf0Var.f170683c);
        suf0Var.f170682b += str.length();
    }

    /* JADX INFO: renamed from: e */
    public Object m217147e(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2, Object obj) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        hi20 hi20Var = new hi20(zrv.f205803e, str, i2);
        if (obj != null) {
            hi20Var.m185373g(4);
        }
        spannableStringBuilder.setSpan(hi20Var, i, str.length() + i, 33);
        return hi20Var;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var);
}
