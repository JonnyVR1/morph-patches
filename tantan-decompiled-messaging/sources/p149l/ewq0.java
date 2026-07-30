package p149l;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ewq0 {

    /* JADX INFO: renamed from: f */
    private static ewq0 f93525f;

    /* JADX INFO: renamed from: a */
    private File f93526a;

    /* JADX INFO: renamed from: b */
    private File f93527b;

    /* JADX INFO: renamed from: c */
    private File f93528c;

    /* JADX INFO: renamed from: d */
    private Context f93529d;

    /* JADX INFO: renamed from: e */
    private C16704b f93530e = null;

    /* JADX INFO: renamed from: l.ewq0$a */
    public class C16703a implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f93531a;

        public C16703a(String str) {
            this.f93531a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(this.f93531a) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches();
        }
    }

    private ewq0(Context context) {
        File fileM113924l = dwq0.m113924l(context);
        if (!fileM113924l.exists() || (!fileM113924l.isDirectory() && fileM113924l.delete())) {
            fileM113924l.mkdirs();
            ykq0.m215186i();
        }
        this.f93526a = fileM113924l;
        this.f93527b = new File(fileM113924l, "did");
        this.f93528c = new File(fileM113924l, "device_uuid");
        this.f93529d = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m118486a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (bnq0.m102843p(jSONObject)) {
            return 2;
        }
        if (bnq0.m102843p(jSONObject2)) {
            return 0;
        }
        return (String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code"))) && bnq0.m102844r(jSONObject)) ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public static ewq0 m118487c() {
        if (f93525f == null) {
            f93525f = new ewq0(hrq0.m132700i());
        }
        return f93525f;
    }

    /* JADX INFO: renamed from: e */
    private void m118488e(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f93526a, "" + j + "-" + j2 + ".ctx");
        File file2 = new File(this.f93526a, "" + j + "-" + j2 + ".allData");
        try {
            luq0.m151799m(file, jSONObject, false);
            luq0.m151798l(file2, jSONArray, false);
            this.f93530e = new C16704b(file, null);
        } catch (IOException e) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", e);
        }
    }

    /* JADX INFO: renamed from: j */
    private C16704b m118489j() {
        if (this.f93530e == null) {
            m118492n(".ctx");
        }
        return this.f93530e;
    }

    /* JADX INFO: renamed from: k */
    private void m118490k(long j) {
        try {
            ArrayList<C16704b> arrayListM118492n = m118492n("");
            if (arrayListM118492n.size() <= 6) {
                return;
            }
            for (C16704b c16704b : arrayListM118492n) {
                if (c16704b.m118509g(j)) {
                    c16704b.m118512j();
                }
            }
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
        }
    }

    /* JADX INFO: renamed from: m */
    private File m118491m(long j) {
        for (C16704b c16704b : m118492n(".ctx")) {
            if (j >= c16704b.f93533a && j <= c16704b.f93534b) {
                return c16704b.f93535c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private ArrayList<C16704b> m118492n(String str) {
        File[] fileArrListFiles = this.f93526a.listFiles(new C16703a(str));
        ArrayList<C16704b> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            kwq0.m147628a("foundRuntimeContextFiles " + fileArrListFiles.length);
            C16703a c16703a = null;
            C16704b c16704b = null;
            for (File file : fileArrListFiles) {
                try {
                    C16704b c16704b2 = new C16704b(file, c16703a);
                    arrayList.add(c16704b2);
                    if (this.f93530e == null && ".ctx".equals(str) && (c16704b == null || c16704b2.f93534b >= c16704b.f93534b)) {
                        c16704b = c16704b2;
                    }
                } catch (Throwable th) {
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", th);
                }
            }
            if (this.f93530e == null && c16704b != null) {
                this.f93530e = c16704b;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private File m118493o(long j) {
        for (C16704b c16704b : m118492n(".allData")) {
            if (j >= c16704b.f93533a && j <= c16704b.f93534b) {
                return c16704b.f93535c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    private File m118494p(long j) {
        C16704b c16704b = null;
        for (C16704b c16704b2 : m118492n(".ctx")) {
            if (c16704b == null || Math.abs(c16704b.f93534b - j) > Math.abs(c16704b2.f93534b - j)) {
                c16704b = c16704b2;
            }
        }
        if (c16704b == null) {
            return null;
        }
        return c16704b.f93535c;
    }

    /* JADX INFO: renamed from: q */
    private File m118495q(long j) {
        C16704b c16704b = null;
        for (C16704b c16704b2 : m118492n(".allData")) {
            if (c16704b == null || Math.abs(c16704b.f93534b - j) > Math.abs(c16704b2.f93534b - j)) {
                c16704b = c16704b2;
            }
        }
        if (c16704b == null) {
            return null;
        }
        return c16704b.f93535c;
    }

    /* JADX INFO: renamed from: b */
    public String m118496b(String str) {
        try {
            return luq0.m151812z(this.f93528c.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m118497d(long j) {
        boolean z;
        String strM151812z;
        File fileM118491m = m118491m(j);
        if (fileM118491m == null) {
            fileM118491m = m118494p(j);
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = null;
        if (fileM118491m != null) {
            try {
                strM151812z = luq0.m151812z(fileM118491m.getAbsolutePath());
                try {
                    jSONObject = new JSONObject(strM151812z);
                } catch (Throwable th) {
                    th = th;
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", new IOException("content :" + strM151812z, th));
                }
            } catch (Throwable th2) {
                th = th2;
                strM151812z = null;
            }
        }
        if (jSONObject != null && z) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public void m118498f(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject jSONObjectM102852d = bnq0.m102832a(this.f93529d).m102852d(map);
        if (bnq0.m102843p(jSONObjectM102852d)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C16704b c16704bM118489j = m118489j();
        if (c16704bM118489j == null) {
            m118488e(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectM102852d, jSONArray);
            return;
        }
        int iM118486a = m118486a(c16704bM118489j.m118508f(), jSONObjectM102852d);
        if (iM118486a == 1) {
            m118488e(c16704bM118489j.f93533a, jCurrentTimeMillis, jSONObjectM102852d, jSONArray);
            jCurrentTimeMillis = jCurrentTimeMillis;
            luq0.m151804r(c16704bM118489j.f93535c);
        } else if (iM118486a == 2) {
            m118488e(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectM102852d, jSONArray);
        } else if (iM118486a == 3) {
            c16704bM118489j.m118505c(jCurrentTimeMillis);
        }
        m118490k(jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: g */
    public String m118499g() {
        try {
            return luq0.m151812z(this.f93527b.getAbsolutePath());
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* JADX INFO: renamed from: h */
    public JSONArray m118500h(long j) {
        String strM151812z;
        File fileM118493o = m118493o(j);
        if (fileM118493o == null) {
            fileM118493o = m118495q(j);
        }
        if (fileM118493o != null) {
            try {
                strM151812z = luq0.m151812z(fileM118493o.getAbsolutePath());
                try {
                    return new JSONArray(strM151812z);
                } catch (Throwable th) {
                    th = th;
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", new IOException("content :" + strM151812z, th));
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                strM151812z = null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void m118501i(String str) {
        try {
            luq0.m151796j(this.f93527b, str, false);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    public void m118502l(String str) {
        try {
            luq0.m151796j(this.f93528c, str, false);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: l.ewq0$b */
    public static class C16704b {

        /* JADX INFO: renamed from: a */
        private long f93533a;

        /* JADX INFO: renamed from: b */
        private long f93534b;

        /* JADX INFO: renamed from: c */
        private File f93535c;

        /* JADX INFO: renamed from: d */
        private JSONObject f93536d;

        private C16704b(File file) {
            long j;
            this.f93536d = null;
            this.f93535c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f93533a = Long.parseLong(strArrSplit[0]);
                j = Long.parseLong(strArrSplit[1]);
            } else {
                String name = file.getName();
                if (TextUtils.isEmpty(name) || name.length() < 13) {
                    return;
                }
                String strSubstring = name.substring(0, 13);
                if (!TextUtils.isDigitsOnly(strSubstring)) {
                    return;
                }
                j = Long.parseLong(strSubstring);
                this.f93533a = j;
            }
            this.f93534b = j;
        }

        /* JADX INFO: renamed from: a */
        private String m118503a() {
            return this.f93533a + "-" + this.f93534b + ".ctx";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public void m118505c(long j) {
            this.f93534b = j;
            this.f93535c.renameTo(new File(this.f93535c.getParent(), m118503a()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public JSONObject m118508f() {
            if (this.f93536d == null) {
                try {
                    this.f93536d = new JSONObject(luq0.m151812z(this.f93535c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f93536d == null) {
                    this.f93536d = new JSONObject();
                }
            }
            return this.f93536d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public boolean m118509g(long j) {
            long j2 = this.f93533a;
            if (j2 > j && j2 - j > 604800000) {
                return true;
            }
            long j3 = this.f93534b;
            if (j3 >= j || j - j3 <= 604800000) {
                return this.f93535c.lastModified() < j && j - this.f93535c.lastModified() > 604800000;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public void m118512j() {
            this.f93535c.delete();
        }

        public /* synthetic */ C16704b(File file, C16703a c16703a) {
            this(file);
        }
    }
}
