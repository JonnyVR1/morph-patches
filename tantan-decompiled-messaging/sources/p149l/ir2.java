package p149l;

import android.text.SpannableStringBuilder;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ir2 implements k4m {
    @Override // p149l.k4m
    /* JADX INFO: renamed from: a */
    public void mo137816a(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        List<String> listMo103901b = mo103901b(bLiveTemplateItem, templateData, crc0Var);
        if (mo103902c(listMo103901b, bLiveTemplateItem, crc0Var)) {
            mo103903f(jmf0Var, bLiveTemplateItem, listMo103901b, crc0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var);

    /* JADX INFO: renamed from: c */
    public boolean mo103902c(List<String> list, BLiveTemplateItem bLiveTemplateItem, crc0 crc0Var) {
        return (vwb.m200296J(list) || list.get(0) == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public void m137817d(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, String str) {
        jmf0Var.f118631c = m137818e(jmf0Var.f118629a, str, jmf0Var.f118630b, bLiveTemplateItem.size, jmf0Var.f118631c);
        jmf0Var.f118630b += str.length();
    }

    /* JADX INFO: renamed from: e */
    public Object m137818e(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2, Object obj) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        z920 z920Var = new z920(ypv.f199497e, str, i2);
        if (obj != null) {
            z920Var.m163418g(4);
        }
        spannableStringBuilder.setSpan(z920Var, i, str.length() + i, 33);
        return z920Var;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var);
}
