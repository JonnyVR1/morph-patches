package p149l;

import fi.iki.elonen.NanoHTTPD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class yii implements jrl {

    /* JADX INFO: renamed from: c */
    private ArrayList<jrl> f198501c;

    /* JADX INFO: renamed from: d */
    private jrl f198502d;

    public yii(jrl... jrlVarArr) {
        if (jrlVarArr != null) {
            m214920c(Arrays.asList(jrlVarArr));
        }
    }

    @Override // p149l.w0m
    /* JADX INFO: renamed from: a */
    public boolean mo97152a(Map<String, String> map, String str, String str2) {
        ArrayList<jrl> arrayList = this.f198501c;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f198502d = null;
            int size = this.f198501c.size();
            for (int i = 0; i < size; i++) {
                jrl jrlVar = this.f198501c.get(i);
                if (jrlVar != null && jrlVar.mo97152a(map, str, str2)) {
                    this.f198502d = jrlVar;
                    break;
                }
            }
            if (this.f198502d != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.w0m
    /* JADX INFO: renamed from: b */
    public NanoHTTPD.Response mo97153b(Map<String, String> map, String str, String str2) {
        jrl jrlVar = this.f198502d;
        if (jrlVar != null) {
            return jrlVar.mo97153b(map, str, str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m214920c(Collection<jrl> collection) {
        if (this.f198501c == null) {
            this.f198501c = new ArrayList<>();
        }
        this.f198501c.addAll(collection);
    }
}
