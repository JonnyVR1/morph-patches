package p153l;

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
public class k5r0 {

    /* JADX INFO: renamed from: f */
    private static k5r0 f124112f;

    /* JADX INFO: renamed from: a */
    private File f124113a;

    /* JADX INFO: renamed from: b */
    private File f124114b;

    /* JADX INFO: renamed from: c */
    private File f124115c;

    /* JADX INFO: renamed from: d */
    private Context f124116d;

    /* JADX INFO: renamed from: e */
    private C18107b f124117e = null;

    /* JADX INFO: renamed from: l.k5r0$a */
    public class C18106a implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f124118a;

        public C18106a(String str) {
            this.f124118a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(this.f124118a) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches();
        }
    }

    private k5r0(Context context) {
        File fileM143576l = j5r0.m143576l(context);
        if (!fileM143576l.exists() || (!fileM143576l.isDirectory() && fileM143576l.delete())) {
            fileM143576l.mkdirs();
            euq0.m122713i();
        }
        this.f124113a = fileM143576l;
        this.f124114b = new File(fileM143576l, "did");
        this.f124115c = new File(fileM143576l, "device_uuid");
        this.f124116d = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m148476a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (hwq0.m137487p(jSONObject)) {
            return 2;
        }
        if (hwq0.m137487p(jSONObject2)) {
            return 0;
        }
        return (String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code"))) && hwq0.m137488r(jSONObject)) ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public static k5r0 m148477c() {
        if (f124112f == null) {
            f124112f = new k5r0(n0r0.m161022i());
        }
        return f124112f;
    }

    /* JADX INFO: renamed from: e */
    private void m148478e(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f124113a, "" + j + "-" + j2 + ".ctx");
        File file2 = new File(this.f124113a, "" + j + "-" + j2 + ".allData");
        try {
            r3r0.m179687m(file, jSONObject, false);
            r3r0.m179686l(file2, jSONArray, false);
            this.f124117e = new C18107b(file, null);
        } catch (IOException e) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", e);
        }
    }

    /* JADX INFO: renamed from: j */
    private C18107b m148479j() {
        if (this.f124117e == null) {
            m148482n(".ctx");
        }
        return this.f124117e;
    }

    /* JADX INFO: renamed from: k */
    private void m148480k(long j) {
        try {
            ArrayList<C18107b> arrayListM148482n = m148482n("");
            if (arrayListM148482n.size() <= 6) {
                return;
            }
            for (C18107b c18107b : arrayListM148482n) {
                if (c18107b.m148499g(j)) {
                    c18107b.m148502j();
                }
            }
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
        }
    }

    /* JADX INFO: renamed from: m */
    private File m148481m(long j) {
        for (C18107b c18107b : m148482n(".ctx")) {
            if (j >= c18107b.f124120a && j <= c18107b.f124121b) {
                return c18107b.f124122c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private ArrayList<C18107b> m148482n(String str) {
        File[] fileArrListFiles = this.f124113a.listFiles(new C18106a(str));
        ArrayList<C18107b> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            q5r0.m175511a("foundRuntimeContextFiles " + fileArrListFiles.length);
            C18106a c18106a = null;
            C18107b c18107b = null;
            for (File file : fileArrListFiles) {
                try {
                    C18107b c18107b2 = new C18107b(file, c18106a);
                    arrayList.add(c18107b2);
                    if (this.f124117e == null && ".ctx".equals(str) && (c18107b == null || c18107b2.f124121b >= c18107b.f124121b)) {
                        c18107b = c18107b2;
                    }
                } catch (Throwable th) {
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", th);
                }
            }
            if (this.f124117e == null && c18107b != null) {
                this.f124117e = c18107b;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private File m148483o(long j) {
        for (C18107b c18107b : m148482n(".allData")) {
            if (j >= c18107b.f124120a && j <= c18107b.f124121b) {
                return c18107b.f124122c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    private File m148484p(long j) {
        C18107b c18107b = null;
        for (C18107b c18107b2 : m148482n(".ctx")) {
            if (c18107b == null || Math.abs(c18107b.f124121b - j) > Math.abs(c18107b2.f124121b - j)) {
                c18107b = c18107b2;
            }
        }
        if (c18107b == null) {
            return null;
        }
        return c18107b.f124122c;
    }

    /* JADX INFO: renamed from: q */
    private File m148485q(long j) {
        C18107b c18107b = null;
        for (C18107b c18107b2 : m148482n(".allData")) {
            if (c18107b == null || Math.abs(c18107b.f124121b - j) > Math.abs(c18107b2.f124121b - j)) {
                c18107b = c18107b2;
            }
        }
        if (c18107b == null) {
            return null;
        }
        return c18107b.f124122c;
    }

    /* JADX INFO: renamed from: b */
    public String m148486b(String str) {
        try {
            return r3r0.m179700z(this.f124115c.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m148487d(long j) {
        boolean z;
        String strM179700z;
        File fileM148481m = m148481m(j);
        if (fileM148481m == null) {
            fileM148481m = m148484p(j);
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = null;
        if (fileM148481m != null) {
            try {
                strM179700z = r3r0.m179700z(fileM148481m.getAbsolutePath());
                try {
                    jSONObject = new JSONObject(strM179700z);
                } catch (Throwable th) {
                    th = th;
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", new IOException("content :" + strM179700z, th));
                }
            } catch (Throwable th2) {
                th = th2;
                strM179700z = null;
            }
        }
        if (jSONObject != null && z) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public void m148488f(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject jSONObjectM137496d = hwq0.m137476a(this.f124116d).m137496d(map);
        if (hwq0.m137487p(jSONObjectM137496d)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C18107b c18107bM148479j = m148479j();
        if (c18107bM148479j == null) {
            m148478e(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectM137496d, jSONArray);
            return;
        }
        int iM148476a = m148476a(c18107bM148479j.m148498f(), jSONObjectM137496d);
        if (iM148476a == 1) {
            m148478e(c18107bM148479j.f124120a, jCurrentTimeMillis, jSONObjectM137496d, jSONArray);
            jCurrentTimeMillis = jCurrentTimeMillis;
            r3r0.m179692r(c18107bM148479j.f124122c);
        } else if (iM148476a == 2) {
            m148478e(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectM137496d, jSONArray);
        } else if (iM148476a == 3) {
            c18107bM148479j.m148495c(jCurrentTimeMillis);
        }
        m148480k(jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: g */
    public String m148489g() {
        try {
            return r3r0.m179700z(this.f124114b.getAbsolutePath());
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* JADX INFO: renamed from: h */
    public JSONArray m148490h(long j) {
        String strM179700z;
        File fileM148483o = m148483o(j);
        if (fileM148483o == null) {
            fileM148483o = m148485q(j);
        }
        if (fileM148483o != null) {
            try {
                strM179700z = r3r0.m179700z(fileM148483o.getAbsolutePath());
                try {
                    return new JSONArray(strM179700z);
                } catch (Throwable th) {
                    th = th;
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", new IOException("content :" + strM179700z, th));
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                strM179700z = null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void m148491i(String str) {
        try {
            r3r0.m179684j(this.f124114b, str, false);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    public void m148492l(String str) {
        try {
            r3r0.m179684j(this.f124115c, str, false);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: l.k5r0$b */
    public static class C18107b {

        /* JADX INFO: renamed from: a */
        private long f124120a;

        /* JADX INFO: renamed from: b */
        private long f124121b;

        /* JADX INFO: renamed from: c */
        private File f124122c;

        /* JADX INFO: renamed from: d */
        private JSONObject f124123d;

        private C18107b(File file) {
            long j;
            this.f124123d = null;
            this.f124122c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f124120a = Long.parseLong(strArrSplit[0]);
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
                this.f124120a = j;
            }
            this.f124121b = j;
        }

        /* JADX INFO: renamed from: a */
        private String m148493a() {
            return this.f124120a + "-" + this.f124121b + ".ctx";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public void m148495c(long j) {
            this.f124121b = j;
            this.f124122c.renameTo(new File(this.f124122c.getParent(), m148493a()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public JSONObject m148498f() {
            if (this.f124123d == null) {
                try {
                    this.f124123d = new JSONObject(r3r0.m179700z(this.f124122c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f124123d == null) {
                    this.f124123d = new JSONObject();
                }
            }
            return this.f124123d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public boolean m148499g(long j) {
            long j2 = this.f124120a;
            if (j2 > j && j2 - j > 604800000) {
                return true;
            }
            long j3 = this.f124121b;
            if (j3 >= j || j - j3 <= 604800000) {
                return this.f124122c.lastModified() < j && j - this.f124122c.lastModified() > 604800000;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public void m148502j() {
            this.f124122c.delete();
        }

        public /* synthetic */ C18107b(File file, C18106a c18106a) {
            this(file);
        }
    }
}
