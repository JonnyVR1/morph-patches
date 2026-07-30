package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.coremedia.iso.boxes.PerformerBox;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class llq0 implements rzl {

    /* JADX INFO: renamed from: a */
    protected Context f128742a;

    /* JADX INFO: renamed from: b */
    private HashMap<String, HashMap<String, siq0>> f128743b;

    public llq0(Context context) {
        this.f128742a = context;
    }

    /* JADX INFO: renamed from: d */
    public static String m150538d(siq0 siq0Var) {
        return String.valueOf(siq0Var.f164730a) + "#" + siq0Var.f164731b;
    }

    /* JADX INFO: renamed from: g */
    private String m150539g(siq0 siq0Var) {
        String str;
        int i = siq0Var.f164730a;
        String str2 = siq0Var.f164731b;
        if (i <= 0 || TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = String.valueOf(i) + "#" + str2;
        }
        File file = new File(this.f128742a.getFilesDir(), PerformerBox.TYPE);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str).getAbsolutePath();
    }

    /* JADX INFO: renamed from: h */
    private String m150540h(siq0 siq0Var) {
        String strM150539g = m150539g(siq0Var);
        if (TextUtils.isEmpty(strM150539g)) {
            return null;
        }
        for (int i = 0; i < 20; i++) {
            String str = strM150539g + i;
            if (fmq0.m122194d(this.f128742a, str)) {
                return str;
            }
        }
        return null;
    }

    @Override // p149l.ooq0
    /* JADX INFO: renamed from: a */
    public void mo150542a(siq0 siq0Var) {
        if ((siq0Var instanceof bj60) && this.f128743b != null) {
            bj60 bj60Var = (bj60) siq0Var;
            String strM150538d = m150538d(bj60Var);
            String strM127753a = grq0.m127753a(bj60Var);
            HashMap<String, siq0> map = this.f128743b.get(strM150538d);
            if (map == null) {
                map = new HashMap<>();
            }
            bj60 bj60Var2 = (bj60) map.get(strM127753a);
            if (bj60Var2 != null) {
                bj60Var.f75886i += bj60Var2.f75886i;
                bj60Var.f75887j += bj60Var2.f75887j;
            }
            map.put(strM127753a, bj60Var);
            this.f128743b.put(strM150538d, map);
        }
    }

    @Override // p149l.ooq0
    /* JADX INFO: renamed from: b */
    public void mo150543b() {
        HashMap<String, HashMap<String, siq0>> map = this.f128743b;
        if (map == null) {
            return;
        }
        if (map.size() > 0) {
            Iterator<String> it = this.f128743b.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, siq0> map2 = this.f128743b.get(it.next());
                if (map2 != null && map2.size() > 0) {
                    siq0[] siq0VarArr = new siq0[map2.size()];
                    map2.values().toArray(siq0VarArr);
                    m150546f(siq0VarArr);
                }
            }
        }
        this.f128743b.clear();
    }

    @Override // p149l.rzl
    /* JADX INFO: renamed from: c */
    public void mo150544c(HashMap<String, HashMap<String, siq0>> map) {
        this.f128743b = map;
    }

    /* JADX INFO: renamed from: e */
    public void mo150545e(List<String> list) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public void m150546f(siq0[] siq0VarArr) {
        String strM150540h = m150540h(siq0VarArr[0]);
        if (TextUtils.isEmpty(strM150540h)) {
            return;
        }
        grq0.m127759g(strM150540h, siq0VarArr);
    }

    @Override // p149l.ymq0
    /* JADX INFO: renamed from: a */
    public void mo150541a() throws Throwable {
        fmq0.m122193c(this.f128742a, PerformerBox.TYPE, "perfUploading");
        File[] fileArrM122196f = fmq0.m122196f(this.f128742a, "perfUploading");
        if (fileArrM122196f == null || fileArrM122196f.length <= 0) {
            return;
        }
        for (File file : fileArrM122196f) {
            if (file != null) {
                List<String> listM127755c = grq0.m127755c(this.f128742a, file.getAbsolutePath());
                file.delete();
                mo150545e(listM127755c);
            }
        }
    }
}
