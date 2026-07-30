package p002l;

import android.text.SpannableStringBuilder;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;
import l.vwb;
import l.ypv;
import l.z920;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class ir2 implements k4m {
    @Override // p002l.k4m
    /* JADX INFO: renamed from: a */
    public void mo15309a(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        List<String> listMo10622b = mo10622b(bLiveTemplateItem, templateData, crc0Var);
        if (mo10623c(listMo10622b, bLiveTemplateItem, crc0Var)) {
            mo10624f(jmf0Var, bLiveTemplateItem, listMo10622b, crc0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var);

    /* JADX INFO: renamed from: c */
    public boolean mo10623c(List<String> list, BLiveTemplateItem bLiveTemplateItem, crc0 crc0Var) {
        return (vwb.J(list) || list.get(0) == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public void m15310d(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, String str) {
        jmf0Var.f13874c = m15311e(jmf0Var.f13872a, str, jmf0Var.f13873b, bLiveTemplateItem.size, jmf0Var.f13874c);
        jmf0Var.f13873b += str.length();
    }

    /* JADX INFO: renamed from: e */
    public Object m15311e(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2, Object obj) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        z920 z920Var = new z920(ypv.e, str, i2);
        if (obj != null) {
            z920Var.g(4);
        }
        spannableStringBuilder.setSpan(z920Var, i, str.length() + i, 33);
        return z920Var;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var);
}
