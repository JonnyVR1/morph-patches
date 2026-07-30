package p149l;

import android.text.SpannableStringBuilder;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class pwz {

    /* JADX INFO: renamed from: a */
    public final HashMap<Integer, BLiveTemplate> f151612a;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, k4m> f151613b;

    public pwz(HashMap<Integer, BLiveTemplate> map) {
        HashMap<Integer, BLiveTemplate> map2 = new HashMap<>();
        this.f151612a = map2;
        this.f151613b = new HashMap<>();
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: c */
    public void m171770c(List<k4m> list) {
        vwb.m200354z(list, new e30() { // from class: l.nwz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140989a.m171775h((k4m) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public SpannableStringBuilder m171771d(Template.TemplateData templateData, List<BLiveTemplateItem> list, crc0 crc0Var) {
        List<SpannableStringBuilder> listM171772e = m171772e(templateData, list, crc0Var);
        return !vwb.m200296J(listM171772e) ? listM171772e.get(0) : new SpannableStringBuilder();
    }

    /* JADX INFO: renamed from: e */
    public List<SpannableStringBuilder> m171772e(final Template.TemplateData templateData, List<BLiveTemplateItem> list, final crc0 crc0Var) {
        final ArrayList arrayList = new ArrayList();
        final jmf0 jmf0VarM142178a = jmf0.m142178a();
        vwb.m200354z(list, new e30() { // from class: l.owz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146098a.m171776i(jmf0VarM142178a, templateData, crc0Var, arrayList, (BLiveTemplateItem) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public BLiveTemplate m171773f(int i) {
        return this.f151612a.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public HashMap<Integer, BLiveTemplate> m171774g() {
        return this.f151612a;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m171775h(k4m k4mVar) {
        this.f151613b.put(k4mVar.getType(), k4mVar);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m171776i(jmf0 jmf0Var, Template.TemplateData templateData, crc0 crc0Var, List list, BLiveTemplateItem bLiveTemplateItem) {
        SpannableStringBuilder spannableStringBuilder;
        k4m k4mVar = this.f151613b.get(bLiveTemplateItem.type);
        if (k4mVar != null) {
            k4mVar.mo137816a(jmf0Var, bLiveTemplateItem, templateData, crc0Var);
        }
        if (list.contains(jmf0Var.f118629a) || (spannableStringBuilder = jmf0Var.f118629a) == null) {
            return;
        }
        list.add(spannableStringBuilder);
    }
}
