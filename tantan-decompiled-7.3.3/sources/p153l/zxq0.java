package p153l;

import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class zxq0 {

    /* JADX INFO: renamed from: l.zxq0$a */
    public static class C21919a extends C21921c {
        public C21919a(File file) {
            super(file);
            this.f206511b = "Total FD Count:";
            this.f206512c = ":";
            this.f206513d = -2;
        }
    }

    /* JADX INFO: renamed from: l.zxq0$b */
    public static class C21920b extends C21921c {
        public C21920b(File file) {
            super(file);
            this.f206511b = "VmSize:";
            this.f206512c = "\\s+";
            this.f206513d = -1;
        }
    }

    /* JADX INFO: renamed from: l.zxq0$c */
    public static class C21921c {

        /* JADX INFO: renamed from: a */
        protected File f206510a;

        /* JADX INFO: renamed from: b */
        protected String f206511b;

        /* JADX INFO: renamed from: c */
        protected String f206512c;

        /* JADX INFO: renamed from: d */
        protected int f206513d;

        public C21921c(File file) {
            this.f206510a = file;
        }

        /* JADX INFO: renamed from: a */
        public int m222068a() {
            int i = -1;
            if (!this.f206510a.exists() || !this.f206510a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f206510a));
                int iM222069b = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iM222069b = m222069b(line);
                    } catch (Throwable th) {
                        th = th;
                        i = iM222069b;
                        bufferedReader = bufferedReader2;
                        try {
                            pwq0.m174074a();
                            pwq0.m174075b("NPTH_CATCH", th);
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                m4r0.m157051a(bufferedReader);
                            }
                        }
                    }
                } while (iM222069b == -1);
                m4r0.m157051a(bufferedReader2);
                return iM222069b;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: renamed from: b */
        public int m222069b(String str) {
            int i = this.f206513d;
            if (!str.startsWith(this.f206511b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f206512c)[1].trim());
            } catch (NumberFormatException e) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: l.zxq0$d */
    public static class C21922d extends C21921c {
        public C21922d(File file) {
            super(file);
        }

        /* JADX INFO: renamed from: c */
        public HashMap<String, List<String>> m222070c() {
            HashMap<String, List<String>> map = new HashMap<>();
            try {
                JSONArray jSONArrayM179695u = r3r0.m179695u(this.f206510a.getAbsolutePath());
                if (jSONArrayM179695u != null) {
                    for (int i = 0; i < jSONArrayM179695u.length(); i++) {
                        String strOptString = jSONArrayM179695u.optString(i);
                        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith("[tid:0") && strOptString.endsWith("sigstack:0x0]")) {
                            int iIndexOf = strOptString.indexOf("[routine:0x");
                            int i2 = iIndexOf + 11;
                            String strSubstring = iIndexOf > 0 ? strOptString.substring(i2, strOptString.indexOf(93, i2)) : "unknown addr";
                            List<String> arrayList = map.get(strSubstring);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                                map.put(strSubstring, arrayList);
                            }
                            arrayList.add(strOptString);
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
    }

    /* JADX INFO: renamed from: l.zxq0$e */
    public static class C21923e extends C21921c {
        public C21923e(File file) {
            super(file);
        }

        /* JADX INFO: renamed from: c */
        public JSONArray m222071c(HashMap<String, List<String>> map) {
            int iIndexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (!map.isEmpty()) {
                try {
                    JSONArray jSONArrayM179695u = r3r0.m179695u(this.f206510a.getAbsolutePath());
                    if (jSONArrayM179695u != null) {
                        for (int i = 0; i < jSONArrayM179695u.length(); i++) {
                            String strOptString = jSONArrayM179695u.optString(i);
                            if (!TextUtils.isEmpty(strOptString) && (iIndexOf = strOptString.indexOf(":")) > 2) {
                                String strSubstring = strOptString.substring(2, iIndexOf);
                                if (map.containsKey(strSubstring) && (list = map.get(strSubstring)) != null) {
                                    Iterator<String> it = list.iterator();
                                    while (it.hasNext()) {
                                        jSONArray.put(it.next() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strOptString);
                                    }
                                    map.remove(strSubstring);
                                }
                            }
                        }
                        Iterator<List<String>> it2 = map.values().iterator();
                        while (it2.hasNext()) {
                            Iterator<String> it3 = it2.next().iterator();
                            while (it3.hasNext()) {
                                jSONArray.put(it3.next() + "  0x000000:unknown");
                            }
                        }
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", th);
                }
            }
            return jSONArray;
        }
    }

    /* JADX INFO: renamed from: l.zxq0$f */
    public static class C21924f extends C21921c {
        public C21924f(File file) {
            super(file);
            this.f206511b = "Total Threads Count:";
            this.f206512c = ":";
            this.f206513d = -2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m222064a(String str) {
        return new C21919a(j5r0.m143570f(str)).m222068a();
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m222065b(File file, File file2) {
        return new C21923e(file2).m222071c(new C21922d(file).m222070c());
    }

    /* JADX INFO: renamed from: c */
    public static int m222066c(String str) {
        return new C21924f(j5r0.m143574j(str)).m222068a();
    }

    /* JADX INFO: renamed from: d */
    public static int m222067d(String str) {
        return new C21920b(j5r0.m143578n(str)).m222068a();
    }
}
