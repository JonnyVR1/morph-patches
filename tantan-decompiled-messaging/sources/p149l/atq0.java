package p149l;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.push.C14786k;
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
public abstract class atq0 {

    /* JADX INFO: renamed from: k */
    protected static final String f71656k = Locale.getDefault().getLanguage().toLowerCase();

    /* JADX INFO: renamed from: l */
    private static String f71657l = null;

    /* JADX INFO: renamed from: m */
    public static final DateFormat f71658m;

    /* JADX INFO: renamed from: n */
    private static String f71659n;

    /* JADX INFO: renamed from: o */
    private static long f71660o;

    /* JADX INFO: renamed from: a */
    private String f71661a;

    /* JADX INFO: renamed from: b */
    private String f71662b;

    /* JADX INFO: renamed from: c */
    private String f71663c;

    /* JADX INFO: renamed from: d */
    private String f71664d;

    /* JADX INFO: renamed from: e */
    private String f71665e;

    /* JADX INFO: renamed from: f */
    private String f71666f;

    /* JADX INFO: renamed from: g */
    private List<ysq0> f71667g;

    /* JADX INFO: renamed from: h */
    private final Map<String, Object> f71668h;

    /* JADX INFO: renamed from: i */
    private C14786k f71669i;

    /* JADX INFO: renamed from: j */
    public long f71670j;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f71658m = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f71659n = htq0.m132932a(5) + "-";
        f71660o = 0L;
    }

    public atq0(Bundle bundle) {
        this.f71661a = f71657l;
        this.f71662b = null;
        this.f71663c = null;
        this.f71664d = null;
        this.f71665e = null;
        this.f71666f = null;
        this.f71667g = new CopyOnWriteArrayList();
        this.f71668h = new HashMap();
        this.f71669i = null;
        this.f71663c = bundle.getString("ext_to");
        this.f71664d = bundle.getString("ext_from");
        this.f71665e = bundle.getString("ext_chid");
        this.f71662b = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f71667g = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                ysq0 ysq0VarM215918e = ysq0.m215918e((Bundle) parcelable);
                if (ysq0VarM215918e != null) {
                    this.f71667g.add(ysq0VarM215918e);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f71669i = new C14786k(bundle2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static synchronized String m98856k() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(f71659n);
        long j = f71660o;
        f71660o = 1 + j;
        sb.append(Long.toString(j));
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public static String m98857x() {
        return f71656k;
    }

    /* JADX INFO: renamed from: a */
    public Bundle mo85577a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f71661a)) {
            bundle.putString("ext_ns", this.f71661a);
        }
        if (!TextUtils.isEmpty(this.f71664d)) {
            bundle.putString("ext_from", this.f71664d);
        }
        if (!TextUtils.isEmpty(this.f71663c)) {
            bundle.putString("ext_to", this.f71663c);
        }
        if (!TextUtils.isEmpty(this.f71662b)) {
            bundle.putString("ext_pkt_id", this.f71662b);
        }
        if (!TextUtils.isEmpty(this.f71665e)) {
            bundle.putString("ext_chid", this.f71665e);
        }
        C14786k c14786k = this.f71669i;
        if (c14786k != null) {
            bundle.putBundle("ext_ERROR", c14786k.m86260a());
        }
        List<ysq0> list = this.f71667g;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            Iterator<ysq0> it = this.f71667g.iterator();
            int i = 0;
            while (it.hasNext()) {
                Bundle bundleM215921a = it.next().m215921a();
                if (bundleM215921a != null) {
                    bundleArr[i] = bundleM215921a;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public C14786k m98858b() {
        return this.f71669i;
    }

    /* JADX INFO: renamed from: c */
    public synchronized Object m98859c(String str) {
        Map<String, Object> map = this.f71668h;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo85578d();

    /* JADX INFO: renamed from: e */
    public synchronized Collection<ysq0> m98860e() {
        if (this.f71667g == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(new ArrayList(this.f71667g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            atq0 atq0Var = (atq0) obj;
            C14786k c14786k = this.f71669i;
            C14786k c14786k2 = atq0Var.f71669i;
            if (c14786k == null ? c14786k2 != null : !c14786k.equals(c14786k2)) {
                return false;
            }
            String str = this.f71664d;
            String str2 = atq0Var.f71664d;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            if (!this.f71667g.equals(atq0Var.f71667g)) {
                return false;
            }
            String str3 = this.f71662b;
            String str4 = atq0Var.f71662b;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.f71665e;
            String str6 = atq0Var.f71665e;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            Map<String, Object> map = this.f71668h;
            Map<String, Object> map2 = atq0Var.f71668h;
            if (map == null ? map2 != null : !map.equals(map2)) {
                return false;
            }
            String str7 = this.f71663c;
            String str8 = atq0Var.f71663c;
            if (str7 == null ? str8 != null : !str7.equals(str8)) {
                return false;
            }
            String str9 = this.f71661a;
            String str10 = atq0Var.f71661a;
            if (str9 == null ? str10 == null : str9.equals(str10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public ysq0 m98861f(String str) {
        return m98862g(str, null);
    }

    /* JADX INFO: renamed from: g */
    public ysq0 m98862g(String str, String str2) {
        for (ysq0 ysq0Var : this.f71667g) {
            if (str2 == null || str2.equals(ysq0Var.m215927j())) {
                if (str.equals(ysq0Var.m215923c())) {
                    return ysq0Var;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m98863h(C14786k c14786k) {
        this.f71669i = c14786k;
    }

    public int hashCode() {
        String str = this.f71661a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f71662b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f71663c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f71664d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f71665e;
        int iHashCode5 = (((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f71667g.hashCode()) * 31) + this.f71668h.hashCode()) * 31;
        C14786k c14786k = this.f71669i;
        return iHashCode5 + (c14786k != null ? c14786k.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public void m98864i(ysq0 ysq0Var) {
        this.f71667g.add(ysq0Var);
    }

    /* JADX INFO: renamed from: j */
    public synchronized Collection<String> m98865j() {
        if (this.f71668h == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.unmodifiableSet(new HashSet(this.f71668h.keySet()));
    }

    /* JADX INFO: renamed from: l */
    public String m98866l() {
        if ("ID_NOT_AVAILABLE".equals(this.f71662b)) {
            return null;
        }
        if (this.f71662b == null) {
            this.f71662b = m98856k();
        }
        return this.f71662b;
    }

    /* JADX INFO: renamed from: m */
    public String m98867m() {
        return this.f71665e;
    }

    /* JADX INFO: renamed from: n */
    public void m98868n(String str) {
        this.f71662b = str;
    }

    /* JADX INFO: renamed from: o */
    public String m98869o() {
        return this.f71663c;
    }

    /* JADX INFO: renamed from: p */
    public void m98870p(String str) {
        this.f71665e = str;
    }

    /* JADX INFO: renamed from: q */
    public String m98871q() {
        return this.f71664d;
    }

    /* JADX INFO: renamed from: r */
    public void m98872r(String str) {
        this.f71663c = str;
    }

    /* JADX INFO: renamed from: s */
    public String m98873s() {
        return this.f71666f;
    }

    /* JADX INFO: renamed from: t */
    public void m98874t(String str) {
        this.f71664d = str;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public synchronized String m98875u() {
        StringBuilder sb;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        Exception e;
        try {
            sb = new StringBuilder();
            Iterator<ysq0> it = m98860e().iterator();
            while (it.hasNext()) {
                sb.append(it.next().mo103884d());
            }
            Map<String, Object> map = this.f71668h;
            if (map != null && !map.isEmpty()) {
                sb.append(jkq0.m141913g("PHByb3BlcnRpZXMgeG1sbnM9Imh0dHA6Ly93d3cuaml2ZXNvZnR3YXJlLmNvbS94bWxucy94bXBwL3Byb3BlcnRpZXMiPg=="));
                for (String str : m98865j()) {
                    Object objM98859c = m98859c(str);
                    sb.append("<property>");
                    sb.append("<name>");
                    sb.append(htq0.m132933b(str));
                    sb.append("</name>");
                    sb.append("<value type=\"");
                    if (objM98859c instanceof Integer) {
                        sb.append("integer\">");
                        sb.append(objM98859c);
                        sb.append("</value>");
                    } else if (objM98859c instanceof Long) {
                        sb.append("long\">");
                        sb.append(objM98859c);
                        sb.append("</value>");
                    } else if (objM98859c instanceof Float) {
                        sb.append("float\">");
                        sb.append(objM98859c);
                        sb.append("</value>");
                    } else if (objM98859c instanceof Double) {
                        sb.append("double\">");
                        sb.append(objM98859c);
                        sb.append("</value>");
                    } else if (objM98859c instanceof Boolean) {
                        sb.append("boolean\">");
                        sb.append(objM98859c);
                        sb.append("</value>");
                    } else if (objM98859c instanceof String) {
                        sb.append("string\">");
                        sb.append(htq0.m132933b((String) objM98859c));
                        sb.append("</value>");
                    } else {
                        ObjectOutputStream objectOutputStream2 = null;
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    try {
                                        objectOutputStream.writeObject(objM98859c);
                                        sb.append("java-object\">");
                                        sb.append(htq0.m132935d(byteArrayOutputStream.toByteArray()));
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
    public void m98876v(String str) {
        this.f71666f = str;
    }

    /* JADX INFO: renamed from: w */
    public String m98877w() {
        return this.f71661a;
    }

    public atq0() {
        this.f71661a = f71657l;
        this.f71662b = null;
        this.f71663c = null;
        this.f71664d = null;
        this.f71665e = null;
        this.f71666f = null;
        this.f71667g = new CopyOnWriteArrayList();
        this.f71668h = new HashMap();
        this.f71669i = null;
    }
}
