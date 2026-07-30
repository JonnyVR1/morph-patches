package p153l;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.push.C14934k;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g2r0 {

    /* JADX INFO: renamed from: k */
    protected static final String f101869k = Locale.getDefault().getLanguage().toLowerCase();

    /* JADX INFO: renamed from: l */
    private static String f101870l = null;

    /* JADX INFO: renamed from: m */
    public static final DateFormat f101871m;

    /* JADX INFO: renamed from: n */
    private static String f101872n;

    /* JADX INFO: renamed from: o */
    private static long f101873o;

    /* JADX INFO: renamed from: a */
    private String f101874a;

    /* JADX INFO: renamed from: b */
    private String f101875b;

    /* JADX INFO: renamed from: c */
    private String f101876c;

    /* JADX INFO: renamed from: d */
    private String f101877d;

    /* JADX INFO: renamed from: e */
    private String f101878e;

    /* JADX INFO: renamed from: f */
    private String f101879f;

    /* JADX INFO: renamed from: g */
    private List<e2r0> f101880g;

    /* JADX INFO: renamed from: h */
    private final Map<String, Object> f101881h;

    /* JADX INFO: renamed from: i */
    private C14934k f101882i;

    /* JADX INFO: renamed from: j */
    public long f101883j;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f101871m = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f101872n = n2r0.m161248a(5) + "-";
        f101873o = 0L;
    }

    public g2r0(Bundle bundle) {
        this.f101874a = f101870l;
        this.f101875b = null;
        this.f101876c = null;
        this.f101877d = null;
        this.f101878e = null;
        this.f101879f = null;
        this.f101880g = new CopyOnWriteArrayList();
        this.f101881h = new HashMap();
        this.f101882i = null;
        this.f101876c = bundle.getString("ext_to");
        this.f101877d = bundle.getString("ext_from");
        this.f101878e = bundle.getString("ext_chid");
        this.f101875b = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f101880g = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                e2r0 e2r0VarM119152e = e2r0.m119152e((Bundle) parcelable);
                if (e2r0VarM119152e != null) {
                    this.f101880g.add(e2r0VarM119152e);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f101882i = new C14934k(bundle2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static synchronized String m128638k() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(f101872n);
        long j = f101873o;
        f101873o = 1 + j;
        sb.append(Long.toString(j));
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public static String m128639x() {
        return f101869k;
    }

    /* JADX INFO: renamed from: a */
    public Bundle mo86748a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f101874a)) {
            bundle.putString("ext_ns", this.f101874a);
        }
        if (!TextUtils.isEmpty(this.f101877d)) {
            bundle.putString("ext_from", this.f101877d);
        }
        if (!TextUtils.isEmpty(this.f101876c)) {
            bundle.putString("ext_to", this.f101876c);
        }
        if (!TextUtils.isEmpty(this.f101875b)) {
            bundle.putString("ext_pkt_id", this.f101875b);
        }
        if (!TextUtils.isEmpty(this.f101878e)) {
            bundle.putString("ext_chid", this.f101878e);
        }
        C14934k c14934k = this.f101882i;
        if (c14934k != null) {
            bundle.putBundle("ext_ERROR", c14934k.m87431a());
        }
        List<e2r0> list = this.f101880g;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            Iterator<e2r0> it = this.f101880g.iterator();
            int i = 0;
            while (it.hasNext()) {
                Bundle bundleM119155a = it.next().m119155a();
                if (bundleM119155a != null) {
                    bundleArr[i] = bundleM119155a;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public C14934k m128640b() {
        return this.f101882i;
    }

    /* JADX INFO: renamed from: c */
    public synchronized Object m128641c(String str) {
        Map<String, Object> map = this.f101881h;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo86749d();

    /* JADX INFO: renamed from: e */
    public synchronized Collection<e2r0> m128642e() {
        if (this.f101880g == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(new ArrayList(this.f101880g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            g2r0 g2r0Var = (g2r0) obj;
            C14934k c14934k = this.f101882i;
            C14934k c14934k2 = g2r0Var.f101882i;
            if (c14934k == null ? c14934k2 != null : !c14934k.equals(c14934k2)) {
                return false;
            }
            String str = this.f101877d;
            String str2 = g2r0Var.f101877d;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            if (!this.f101880g.equals(g2r0Var.f101880g)) {
                return false;
            }
            String str3 = this.f101875b;
            String str4 = g2r0Var.f101875b;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.f101878e;
            String str6 = g2r0Var.f101878e;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            Map<String, Object> map = this.f101881h;
            Map<String, Object> map2 = g2r0Var.f101881h;
            if (map == null ? map2 != null : !map.equals(map2)) {
                return false;
            }
            String str7 = this.f101876c;
            String str8 = g2r0Var.f101876c;
            if (str7 == null ? str8 != null : !str7.equals(str8)) {
                return false;
            }
            String str9 = this.f101874a;
            String str10 = g2r0Var.f101874a;
            if (str9 == null ? str10 == null : str9.equals(str10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public e2r0 m128643f(String str) {
        return m128644g(str, null);
    }

    /* JADX INFO: renamed from: g */
    public e2r0 m128644g(String str, String str2) {
        for (e2r0 e2r0Var : this.f101880g) {
            if (str2 == null || str2.equals(e2r0Var.m119162j())) {
                if (str.equals(e2r0Var.m119157c())) {
                    return e2r0Var;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m128645h(C14934k c14934k) {
        this.f101882i = c14934k;
    }

    public int hashCode() {
        String str = this.f101874a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f101875b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f101876c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f101877d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f101878e;
        int iHashCode5 = (((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f101880g.hashCode()) * 31) + this.f101881h.hashCode()) * 31;
        C14934k c14934k = this.f101882i;
        return iHashCode5 + (c14934k != null ? c14934k.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public void m128646i(e2r0 e2r0Var) {
        this.f101880g.add(e2r0Var);
    }

    /* JADX INFO: renamed from: j */
    public synchronized Collection<String> m128647j() {
        if (this.f101881h == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.unmodifiableSet(new HashSet(this.f101881h.keySet()));
    }

    /* JADX INFO: renamed from: l */
    public String m128648l() {
        if ("ID_NOT_AVAILABLE".equals(this.f101875b)) {
            return null;
        }
        if (this.f101875b == null) {
            this.f101875b = m128638k();
        }
        return this.f101875b;
    }

    /* JADX INFO: renamed from: m */
    public String m128649m() {
        return this.f101878e;
    }

    /* JADX INFO: renamed from: n */
    public void m128650n(String str) {
        this.f101875b = str;
    }

    /* JADX INFO: renamed from: o */
    public String m128651o() {
        return this.f101876c;
    }

    /* JADX INFO: renamed from: p */
    public void m128652p(String str) {
        this.f101878e = str;
    }

    /* JADX INFO: renamed from: q */
    public String m128653q() {
        return this.f101877d;
    }

    /* JADX INFO: renamed from: r */
    public void m128654r(String str) {
        this.f101876c = str;
    }

    /* JADX INFO: renamed from: s */
    public String m128655s() {
        return this.f101879f;
    }

    /* JADX INFO: renamed from: t */
    public void m128656t(String str) {
        this.f101877d = str;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public synchronized String m128657u() {
        StringBuilder sb;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        Exception e;
        try {
            sb = new StringBuilder();
            Iterator<e2r0> it = m128642e().iterator();
            while (it.hasNext()) {
                sb.append(it.next().mo119158d());
            }
            Map<String, Object> map = this.f101881h;
            if (map != null && !map.isEmpty()) {
                sb.append(ptq0.m173779g("PHByb3BlcnRpZXMgeG1sbnM9Imh0dHA6Ly93d3cuaml2ZXNvZnR3YXJlLmNvbS94bWxucy94bXBwL3Byb3BlcnRpZXMiPg=="));
                for (String str : m128647j()) {
                    Object objM128641c = m128641c(str);
                    sb.append("<property>");
                    sb.append("<name>");
                    sb.append(n2r0.m161249b(str));
                    sb.append("</name>");
                    sb.append("<value type=\"");
                    if (objM128641c instanceof Integer) {
                        sb.append("integer\">");
                        sb.append(objM128641c);
                        sb.append("</value>");
                    } else if (objM128641c instanceof Long) {
                        sb.append("long\">");
                        sb.append(objM128641c);
                        sb.append("</value>");
                    } else if (objM128641c instanceof Float) {
                        sb.append("float\">");
                        sb.append(objM128641c);
                        sb.append("</value>");
                    } else if (objM128641c instanceof Double) {
                        sb.append("double\">");
                        sb.append(objM128641c);
                        sb.append("</value>");
                    } else if (objM128641c instanceof Boolean) {
                        sb.append("boolean\">");
                        sb.append(objM128641c);
                        sb.append("</value>");
                    } else if (objM128641c instanceof String) {
                        sb.append("string\">");
                        sb.append(n2r0.m161249b((String) objM128641c));
                        sb.append("</value>");
                    } else {
                        ObjectOutputStream objectOutputStream2 = null;
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    try {
                                        objectOutputStream.writeObject(objM128641c);
                                        sb.append("java-object\">");
                                        sb.append(n2r0.m161251d(byteArrayOutputStream.toByteArray()));
                                        sb.append("</value>");
                                        try {
                                            objectOutputStream.close();
                                        } catch (Exception unused) {
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        if (objectOutputStream != null) {
                                            try {
                                                objectOutputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        if (byteArrayOutputStream != null) {
                                        }
                                        sb.append("</property>");
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    objectOutputStream2 = objectOutputStream;
                                    if (objectOutputStream2 != null) {
                                        try {
                                            objectOutputStream2.close();
                                        } catch (Exception unused3) {
                                        }
                                    }
                                    if (byteArrayOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (Exception unused4) {
                                        throw th;
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                objectOutputStream = null;
                                e = e;
                                e.printStackTrace();
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                sb.append("</property>");
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            byteArrayOutputStream = null;
                            objectOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            byteArrayOutputStream = null;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                    sb.append("</property>");
                }
                sb.append("</properties>");
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public void m128658v(String str) {
        this.f101879f = str;
    }

    /* JADX INFO: renamed from: w */
    public String m128659w() {
        return this.f101874a;
    }

    public g2r0() {
        this.f101874a = f101870l;
        this.f101875b = null;
        this.f101876c = null;
        this.f101877d = null;
        this.f101878e = null;
        this.f101879f = null;
        this.f101880g = new CopyOnWriteArrayList();
        this.f101881h = new HashMap();
        this.f101882i = null;
    }
}
