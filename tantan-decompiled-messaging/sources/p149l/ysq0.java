package p149l;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ysq0 implements btq0 {

    /* JADX INFO: renamed from: a */
    private String f199801a;

    /* JADX INFO: renamed from: b */
    private String f199802b;

    /* JADX INFO: renamed from: c */
    private String[] f199803c;

    /* JADX INFO: renamed from: d */
    private String[] f199804d;

    /* JADX INFO: renamed from: e */
    private String f199805e;

    /* JADX INFO: renamed from: f */
    private List<ysq0> f199806f;

    public ysq0(String str, String str2, String[] strArr, String[] strArr2, String str3, List<ysq0> list) {
        this.f199801a = str;
        this.f199802b = str2;
        this.f199803c = strArr;
        this.f199804d = strArr2;
        this.f199805e = str3;
        this.f199806f = list;
    }

    /* JADX INFO: renamed from: e */
    public static ysq0 m215918e(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> setKeySet = bundle2.keySet();
        String[] strArr = new String[setKeySet.size()];
        String[] strArr2 = new String[setKeySet.size()];
        int i = 0;
        for (String str : setKeySet) {
            strArr[i] = str;
            strArr2[i] = bundle2.getString(str);
            i++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add(m215918e((Bundle) parcelable));
            }
        } else {
            arrayList = null;
        }
        return new ysq0(string, string2, strArr, strArr2, string3, arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static Parcelable[] m215919h(List<ysq0> list) {
        return m215920i((ysq0[]) list.toArray(new ysq0[list.size()]));
    }

    /* JADX INFO: renamed from: i */
    public static Parcelable[] m215920i(ysq0[] ysq0VarArr) {
        if (ysq0VarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[ysq0VarArr.length];
        for (int i = 0; i < ysq0VarArr.length; i++) {
            parcelableArr[i] = ysq0VarArr[i].m215922b();
        }
        return parcelableArr;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m215921a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f199801a);
        bundle.putString("ext_ns", this.f199802b);
        bundle.putString("ext_text", this.f199805e);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f199803c;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f199803c;
                if (i >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i], this.f199804d[i]);
                i++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<ysq0> list = this.f199806f;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", m215919h(this.f199806f));
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public Parcelable m215922b() {
        return m215921a();
    }

    /* JADX INFO: renamed from: c */
    public String m215923c() {
        return this.f199801a;
    }

    @Override // p149l.btq0
    /* JADX INFO: renamed from: d */
    public String mo103884d() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f199801a);
        if (!TextUtils.isEmpty(this.f199802b)) {
            sb.append(" xmlns=\"");
            sb.append(this.f199802b);
            sb.append("\"");
        }
        String[] strArr = this.f199803c;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < this.f199803c.length; i++) {
                if (!TextUtils.isEmpty(this.f199804d[i])) {
                    sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb.append(this.f199803c[i]);
                    sb.append("=\"");
                    sb.append(htq0.m132933b(this.f199804d[i]));
                    sb.append("\"");
                }
            }
        }
        if (TextUtils.isEmpty(this.f199805e)) {
            List<ysq0> list = this.f199806f;
            if (list == null || list.size() <= 0) {
                sb.append("/>");
            } else {
                sb.append(">");
                Iterator<ysq0> it = this.f199806f.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().mo103884d());
                }
                sb.append("</");
                sb.append(this.f199801a);
                sb.append(">");
            }
        } else {
            sb.append(">");
            sb.append(this.f199805e);
            sb.append("</");
            sb.append(this.f199801a);
            sb.append(">");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public void m215925f(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f199805e = str;
        } else {
            this.f199805e = htq0.m132933b(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m215926g(ysq0 ysq0Var) {
        if (this.f199806f == null) {
            this.f199806f = new ArrayList();
        }
        if (this.f199806f.contains(ysq0Var)) {
            return;
        }
        this.f199806f.add(ysq0Var);
    }

    /* JADX INFO: renamed from: j */
    public String m215927j() {
        return this.f199802b;
    }

    /* JADX INFO: renamed from: k */
    public String m215928k() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f199805e);
        String str = this.f199805e;
        return !zIsEmpty ? htq0.m132936e(str) : str;
    }

    public String toString() {
        return mo103884d();
    }

    public ysq0(String str, String str2, String[] strArr, String[] strArr2) {
        this.f199806f = null;
        this.f199801a = str;
        this.f199802b = str2;
        this.f199803c = strArr;
        this.f199804d = strArr2;
    }

    /* JADX INFO: renamed from: d */
    public String m215924d(String str) {
        if (str != null) {
            if (this.f199803c != null) {
                int i = 0;
                while (true) {
                    String[] strArr = this.f199803c;
                    if (i >= strArr.length) {
                        break;
                    }
                    if (str.equals(strArr[i])) {
                        return this.f199804d[i];
                    }
                    i++;
                }
            }
            return null;
        }
        x9g0.m207497a();
        return null;
    }
}
