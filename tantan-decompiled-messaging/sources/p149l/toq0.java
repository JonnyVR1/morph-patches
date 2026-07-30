package p149l;

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
public class toq0 {

    /* JADX INFO: renamed from: l.toq0$a */
    public static class C20224a extends C20226c {
        public C20224a(File file) {
            super(file);
            this.f171402b = "Total FD Count:";
            this.f171403c = ":";
            this.f171404d = -2;
        }
    }

    /* JADX INFO: renamed from: l.toq0$b */
    public static class C20225b extends C20226c {
        public C20225b(File file) {
            super(file);
            this.f171402b = "VmSize:";
            this.f171403c = "\\s+";
            this.f171404d = -1;
        }
    }

    /* JADX INFO: renamed from: l.toq0$c */
    public static class C20226c {

        /* JADX INFO: renamed from: a */
        protected File f171401a;

        /* JADX INFO: renamed from: b */
        protected String f171402b;

        /* JADX INFO: renamed from: c */
        protected String f171403c;

        /* JADX INFO: renamed from: d */
        protected int f171404d;

        public C20226c(File file) {
            this.f171401a = file;
        }

        /* JADX INFO: renamed from: a */
        public int m189923a() {
            int i = -1;
            if (!this.f171401a.exists() || !this.f171401a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f171401a));
                int iM189924b = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iM189924b = m189924b(line);
                    } catch (Throwable th) {
                        th = th;
                        i = iM189924b;
                        bufferedReader = bufferedReader2;
                        try {
                            jnq0.m142383a();
                            jnq0.m142384b("NPTH_CATCH", th);
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                gvq0.m128290a(bufferedReader);
                            }
                        }
                    }
                } while (iM189924b == -1);
                gvq0.m128290a(bufferedReader2);
                return iM189924b;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: renamed from: b */
        public int m189924b(String str) {
            int i = this.f171404d;
            if (!str.startsWith(this.f171402b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f171403c)[1].trim());
            } catch (NumberFormatException e) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: l.toq0$d */
    public static class C20227d extends C20226c {
        public C20227d(File file) {
            super(file);
        }

        /* JADX INFO: renamed from: c */
        public HashMap<String, List<String>> m189925c() {
            HashMap<String, List<String>> map = new HashMap<>();
            try {
                JSONArray jSONArrayM151807u = luq0.m151807u(this.f171401a.getAbsolutePath());
                if (jSONArrayM151807u != null) {
                    for (int i = 0; i < jSONArrayM151807u.length(); i++) {
                        String strOptString = jSONArrayM151807u.optString(i);
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
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: l.toq0$e */
    public static class C20228e extends C20226c {
        public C20228e(File file) {
            super(file);
        }

        /* JADX INFO: renamed from: c */
        public JSONArray m189926c(HashMap<String, List<String>> map) {
            int iIndexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (!map.isEmpty()) {
                try {
                    JSONArray jSONArrayM151807u = luq0.m151807u(this.f171401a.getAbsolutePath());
                    if (jSONArrayM151807u != null) {
                        for (int i = 0; i < jSONArrayM151807u.length(); i++) {
                            String strOptString = jSONArrayM151807u.optString(i);
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
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", th);
                }
            }
            return jSONArray;
        }
    }

    /* JADX INFO: renamed from: l.toq0$f */
    public static class C20229f extends C20226c {
        public C20229f(File file) {
            super(file);
            this.f171402b = "Total Threads Count:";
            this.f171403c = ":";
            this.f171404d = -2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m189919a(String str) {
        return new C20224a(dwq0.m113918f(str)).m189923a();
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m189920b(File file, File file2) {
        return new C20228e(file2).m189926c(new C20227d(file).m189925c());
    }

    /* JADX INFO: renamed from: c */
    public static int m189921c(String str) {
        return new C20229f(dwq0.m113922j(str)).m189923a();
    }

    /* JADX INFO: renamed from: d */
    public static int m189922d(String str) {
        return new C20225b(dwq0.m113926n(str)).m189923a();
    }
}
