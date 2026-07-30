package p153l;

import android.text.SpannableStringBuilder;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class m500 {

    /* JADX INFO: renamed from: a */
    public final HashMap<Integer, BLiveTemplate> f134848a;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, b7m> f134849b;

    public m500(HashMap<Integer, BLiveTemplate> map) {
        HashMap<Integer, BLiveTemplate> map2 = new HashMap<>();
        this.f134848a = map2;
        this.f134849b = new HashMap<>();
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: c */
    public void m157076c(List<b7m> list) {
        jyb.m147537z(list, new y20() { // from class: l.k500
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123963a.m157081h((b7m) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public SpannableStringBuilder m157077d(Template.TemplateData templateData, List<BLiveTemplateItem> list, hzc0 hzc0Var) {
        List<SpannableStringBuilder> listM157078e = m157078e(templateData, list, hzc0Var);
        return !jyb.m147479J(listM157078e) ? listM157078e.get(0) : new SpannableStringBuilder();
    }

    /* JADX INFO: renamed from: e */
    public List<SpannableStringBuilder> m157078e(final Template.TemplateData templateData, List<BLiveTemplateItem> list, final hzc0 hzc0Var) {
        final ArrayList arrayList = new ArrayList();
        final suf0 suf0VarM188024a = suf0.m188024a();
        jyb.m147537z(list, new y20() { // from class: l.l500
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130051a.m157082i(suf0VarM188024a, templateData, hzc0Var, arrayList, (BLiveTemplateItem) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public BLiveTemplate m157079f(int i) {
        return this.f134848a.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public HashMap<Integer, BLiveTemplate> m157080g() {
        return this.f134848a;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m157081h(b7m b7mVar) {
        this.f134849b.put(b7mVar.getType(), b7mVar);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m157082i(suf0 suf0Var, Template.TemplateData templateData, hzc0 hzc0Var, List list, BLiveTemplateItem bLiveTemplateItem) {
        SpannableStringBuilder spannableStringBuilder;
        b7m b7mVar = this.f134849b.get(bLiveTemplateItem.type);
        if (b7mVar != null) {
            b7mVar.mo102847a(suf0Var, bLiveTemplateItem, templateData, hzc0Var);
        }
        if (list.contains(suf0Var.f170681a) || (spannableStringBuilder = suf0Var.f170681a) == null) {
            return;
        }
        list.add(spannableStringBuilder);
    }
}
