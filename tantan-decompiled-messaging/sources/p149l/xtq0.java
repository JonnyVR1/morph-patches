package p149l;

import android.content.Context;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class xtq0 {

    /* JADX INFO: renamed from: a */
    private Context f194429a;

    /* JADX INFO: renamed from: b */
    private HashMap<String, Long> f194430b;

    /* JADX INFO: renamed from: c */
    private int f194431c = 50;

    /* JADX INFO: renamed from: d */
    private int f194432d = 100;

    public xtq0(Context context) {
        this.f194430b = null;
        this.f194429a = context;
        this.f194430b = m211018e();
        m211017d();
    }

    /* JADX INFO: renamed from: b */
    private void m211016b(File file) {
        File fileM113936x = dwq0.m113936x(this.f194429a);
        file.renameTo(new File(fileM113936x, String.valueOf(System.currentTimeMillis())));
        String[] list = fileM113936x.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(fileM113936x, list[0]).delete();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m211017d() {
        this.f194431c = iiq0.m136426a(this.f194431c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f194432d = iiq0.m136426a(this.f194432d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    /* JADX INFO: renamed from: e */
    private HashMap<String, Long> m211018e() {
        File fileM113938z = dwq0.m113938z(this.f194429a);
        HashMap<String, Long> map = new HashMap<>();
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray jSONArrayM151807u = luq0.m151807u(fileM113938z.getAbsolutePath());
            if (!nvq0.m161753f(jSONArrayM151807u)) {
                Long lDecode = Long.decode(jSONArrayM151807u.optString(0, null));
                if (System.currentTimeMillis() - lDecode.longValue() > 86400000) {
                    m211016b(fileM113938z);
                    return map;
                }
                map.put("time", lDecode);
                for (int i = 1; i < jSONArrayM151807u.length(); i++) {
                    String[] strArrSplit = jSONArrayM151807u.optString(i, "").split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0], Long.decode(strArrSplit[1]));
                    }
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public void m211019a() throws Throwable {
        HashMap<String, Long> map = this.f194430b;
        Long lRemove = map.remove("time");
        if (lRemove == null) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lRemove);
        sb.append('\n');
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(' ');
            sb.append(entry.getValue());
            sb.append('\n');
        }
        try {
            luq0.m151796j(dwq0.m113938z(this.f194429a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m211020c(String str) {
        if (str == null) {
            str = "default";
        }
        return owq0.m166426b(this.f194430b, str, 1L).longValue() < ((long) this.f194431c) && owq0.m166426b(this.f194430b, "all", 1L).longValue() < ((long) this.f194432d);
    }
}
