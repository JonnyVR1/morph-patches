package p002l;

import android.text.SpannableStringBuilder;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pwz {

    /* JADX INFO: renamed from: a */
    public final HashMap<Integer, BLiveTemplate> f17710a;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, k4m> f17711b;

    public pwz(HashMap<Integer, BLiveTemplate> map) {
        HashMap<Integer, BLiveTemplate> map2 = new HashMap<>();
        this.f17710a = map2;
        this.f17711b = new HashMap<>();
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: c */
    public void m20736c(List<k4m> list) {
        vwb.z(list, new e30() { // from class: l.nwz
            public final void call(Object obj) {
                this.f16286a.m20741h((k4m) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public SpannableStringBuilder m20737d(Template.TemplateData templateData, List<BLiveTemplateItem> list, crc0 crc0Var) {
        List<SpannableStringBuilder> listM20738e = m20738e(templateData, list, crc0Var);
        return !vwb.J(listM20738e) ? listM20738e.get(0) : new SpannableStringBuilder();
    }

    /* JADX INFO: renamed from: e */
    public List<SpannableStringBuilder> m20738e(final Template.TemplateData templateData, List<BLiveTemplateItem> list, final crc0 crc0Var) {
        final ArrayList arrayList = new ArrayList();
        final jmf0 jmf0VarM16039a = jmf0.m16039a();
        vwb.z(list, new e30() { // from class: l.owz
            public final void call(Object obj) {
                this.f16816a.m20742i(jmf0VarM16039a, templateData, crc0Var, arrayList, (BLiveTemplateItem) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public BLiveTemplate m20739f(int i) {
        return this.f17710a.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public HashMap<Integer, BLiveTemplate> m20740g() {
        return this.f17710a;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m20741h(k4m k4mVar) {
        this.f17711b.put(k4mVar.getType(), k4mVar);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m20742i(jmf0 jmf0Var, Template.TemplateData templateData, crc0 crc0Var, List list, BLiveTemplateItem bLiveTemplateItem) {
        SpannableStringBuilder spannableStringBuilder;
        k4m k4mVar = this.f17711b.get(bLiveTemplateItem.type);
        if (k4mVar != null) {
            k4mVar.mo15309a(jmf0Var, bLiveTemplateItem, templateData, crc0Var);
        }
        if (list.contains(jmf0Var.f13872a) || (spannableStringBuilder = jmf0Var.f13872a) == null) {
            return;
        }
        list.add(spannableStringBuilder);
    }
}
