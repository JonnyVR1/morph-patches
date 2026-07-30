package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.coremedia.iso.boxes.PerformerBox;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ruq0 implements l2m {

    /* JADX INFO: renamed from: a */
    protected Context f164932a;

    /* JADX INFO: renamed from: b */
    private HashMap<String, HashMap<String, xrq0>> f164933b;

    public ruq0(Context context) {
        this.f164932a = context;
    }

    /* JADX INFO: renamed from: d */
    public static String m183210d(xrq0 xrq0Var) {
        return String.valueOf(xrq0Var.f195947a) + "#" + xrq0Var.f195948b;
    }

    /* JADX INFO: renamed from: g */
    private String m183211g(xrq0 xrq0Var) {
        String str;
        int i = xrq0Var.f195947a;
        String str2 = xrq0Var.f195948b;
        if (i <= 0 || TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = String.valueOf(i) + "#" + str2;
        }
        File file = new File(this.f164932a.getFilesDir(), PerformerBox.TYPE);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str).getAbsolutePath();
    }

    /* JADX INFO: renamed from: h */
    private String m183212h(xrq0 xrq0Var) {
        String strM183211g = m183211g(xrq0Var);
        if (TextUtils.isEmpty(strM183211g)) {
            return null;
        }
        for (int i = 0; i < 20; i++) {
            String str = strM183211g + i;
            if (lvq0.m156003d(this.f164932a, str)) {
                return str;
            }
        }
        return null;
    }

    @Override // p153l.uxq0
    /* JADX INFO: renamed from: a */
    public void mo183213a(xrq0 xrq0Var) {
        if ((xrq0Var instanceof gr60) && this.f164933b != null) {
            gr60 gr60Var = (gr60) xrq0Var;
            String strM183210d = m183210d(gr60Var);
            String strM156523a = m0r0.m156523a(gr60Var);
            HashMap<String, xrq0> map = this.f164933b.get(strM183210d);
            if (map == null) {
                map = new HashMap<>();
            }
            gr60 gr60Var2 = (gr60) map.get(strM156523a);
            if (gr60Var2 != null) {
                gr60Var.f106009i += gr60Var2.f106009i;
                gr60Var.f106010j += gr60Var2.f106010j;
            }
            map.put(strM156523a, gr60Var);
            this.f164933b.put(strM183210d, map);
        }
    }

    @Override // p153l.uxq0
    /* JADX INFO: renamed from: b */
    public void mo183214b() {
        HashMap<String, HashMap<String, xrq0>> map = this.f164933b;
        if (map == null) {
            return;
        }
        if (map.size() > 0) {
            Iterator<String> it = this.f164933b.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, xrq0> map2 = this.f164933b.get(it.next());
                if (map2 != null && map2.size() > 0) {
                    xrq0[] xrq0VarArr = new xrq0[map2.size()];
                    map2.values().toArray(xrq0VarArr);
                    m183216f(xrq0VarArr);
                }
            }
        }
        this.f164933b.clear();
    }

    @Override // p153l.l2m
    /* JADX INFO: renamed from: c */
    public void mo152628c(HashMap<String, HashMap<String, xrq0>> map) {
        this.f164933b = map;
    }

    /* JADX INFO: renamed from: e */
    public void mo183215e(List<String> list) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public void m183216f(xrq0[] xrq0VarArr) {
        String strM183212h = m183212h(xrq0VarArr[0]);
        if (TextUtils.isEmpty(strM183212h)) {
            return;
        }
        m0r0.m156529g(strM183212h, xrq0VarArr);
    }

    @Override // p153l.ewq0
    /* JADX INFO: renamed from: a */
    public void mo122959a() throws Throwable {
        lvq0.m156002c(this.f164932a, PerformerBox.TYPE, "perfUploading");
        File[] fileArrM156005f = lvq0.m156005f(this.f164932a, "perfUploading");
        if (fileArrM156005f == null || fileArrM156005f.length <= 0) {
            return;
        }
        for (File file : fileArrM156005f) {
            if (file != null) {
                List<String> listM156525c = m0r0.m156525c(this.f164932a, file.getAbsolutePath());
                file.delete();
                mo183215e(listM156525c);
            }
        }
    }
}
