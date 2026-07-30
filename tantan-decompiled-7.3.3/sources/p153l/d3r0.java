package p153l;

import android.content.Context;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class d3r0 {

    /* JADX INFO: renamed from: a */
    private Context f84937a;

    /* JADX INFO: renamed from: b */
    private HashMap<String, Long> f84938b;

    /* JADX INFO: renamed from: c */
    private int f84939c = 50;

    /* JADX INFO: renamed from: d */
    private int f84940d = 100;

    public d3r0(Context context) {
        this.f84938b = null;
        this.f84937a = context;
        this.f84938b = m113895e();
        m113894d();
    }

    /* JADX INFO: renamed from: b */
    private void m113893b(File file) {
        File fileM143588x = j5r0.m143588x(this.f84937a);
        file.renameTo(new File(fileM143588x, String.valueOf(System.currentTimeMillis())));
        String[] list = fileM143588x.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(fileM143588x, list[0]).delete();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m113894d() {
        this.f84939c = nrq0.m164504a(this.f84939c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f84940d = nrq0.m164504a(this.f84940d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    /* JADX INFO: renamed from: e */
    private HashMap<String, Long> m113895e() {
        File fileM143590z = j5r0.m143590z(this.f84937a);
        HashMap<String, Long> map = new HashMap<>();
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray jSONArrayM179695u = r3r0.m179695u(fileM143590z.getAbsolutePath());
            if (!t4r0.m189302f(jSONArrayM179695u)) {
                Long lDecode = Long.decode(jSONArrayM179695u.optString(0, null));
                if (System.currentTimeMillis() - lDecode.longValue() > 86400000) {
                    m113893b(fileM143590z);
                    return map;
                }
                map.put("time", lDecode);
                for (int i = 1; i < jSONArrayM179695u.length(); i++) {
                    String[] strArrSplit = jSONArrayM179695u.optString(i, "").split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0], Long.decode(strArrSplit[1]));
                    }
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public void m113896a() throws Throwable {
        HashMap<String, Long> map = this.f84938b;
        Long lRemove = map.remove("time");
        if (lRemove == null) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", new RuntimeException("err times, no time"));
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
            r3r0.m179684j(j5r0.m143590z(this.f84937a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m113897c(String str) {
        if (str == null) {
            str = "default";
        }
        return u5r0.m194618b(this.f84938b, str, 1L).longValue() < ((long) this.f84939c) && u5r0.m194618b(this.f84938b, "all", 1L).longValue() < ((long) this.f84940d);
    }
}
