package p153l;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class e2r0 implements h2r0 {

    /* JADX INFO: renamed from: a */
    private String f91833a;

    /* JADX INFO: renamed from: b */
    private String f91834b;

    /* JADX INFO: renamed from: c */
    private String[] f91835c;

    /* JADX INFO: renamed from: d */
    private String[] f91836d;

    /* JADX INFO: renamed from: e */
    private String f91837e;

    /* JADX INFO: renamed from: f */
    private List<e2r0> f91838f;

    public e2r0(String str, String str2, String[] strArr, String[] strArr2, String str3, List<e2r0> list) {
        this.f91833a = str;
        this.f91834b = str2;
        this.f91835c = strArr;
        this.f91836d = strArr2;
        this.f91837e = str3;
        this.f91838f = list;
    }

    /* JADX INFO: renamed from: e */
    public static e2r0 m119152e(Bundle bundle) {
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
                arrayList.add(m119152e((Bundle) parcelable));
            }
        } else {
            arrayList = null;
        }
        return new e2r0(string, string2, strArr, strArr2, string3, arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static Parcelable[] m119153h(List<e2r0> list) {
        return m119154i((e2r0[]) list.toArray(new e2r0[list.size()]));
    }

    /* JADX INFO: renamed from: i */
    public static Parcelable[] m119154i(e2r0[] e2r0VarArr) {
        if (e2r0VarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[e2r0VarArr.length];
        for (int i = 0; i < e2r0VarArr.length; i++) {
            parcelableArr[i] = e2r0VarArr[i].m119156b();
        }
        return parcelableArr;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m119155a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f91833a);
        bundle.putString("ext_ns", this.f91834b);
        bundle.putString("ext_text", this.f91837e);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f91835c;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f91835c;
                if (i >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i], this.f91836d[i]);
                i++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<e2r0> list = this.f91838f;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", m119153h(this.f91838f));
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public Parcelable m119156b() {
        return m119155a();
    }

    /* JADX INFO: renamed from: c */
    public String m119157c() {
        return this.f91833a;
    }

    @Override // p153l.h2r0
    /* JADX INFO: renamed from: d */
    public String mo119158d() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f91833a);
        if (!TextUtils.isEmpty(this.f91834b)) {
            sb.append(" xmlns=\"");
            sb.append(this.f91834b);
            sb.append("\"");
        }
        String[] strArr = this.f91835c;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < this.f91835c.length; i++) {
                if (!TextUtils.isEmpty(this.f91836d[i])) {
                    sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb.append(this.f91835c[i]);
                    sb.append("=\"");
                    sb.append(n2r0.m161249b(this.f91836d[i]));
                    sb.append("\"");
                }
            }
        }
        if (TextUtils.isEmpty(this.f91837e)) {
            List<e2r0> list = this.f91838f;
            if (list == null || list.size() <= 0) {
                sb.append("/>");
            } else {
                sb.append(">");
                Iterator<e2r0> it = this.f91838f.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().mo119158d());
                }
                sb.append("</");
                sb.append(this.f91833a);
                sb.append(">");
            }
        } else {
            sb.append(">");
            sb.append(this.f91837e);
            sb.append("</");
            sb.append(this.f91833a);
            sb.append(">");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public void m119160f(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f91837e = str;
        } else {
            this.f91837e = n2r0.m161249b(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m119161g(e2r0 e2r0Var) {
        if (this.f91838f == null) {
            this.f91838f = new ArrayList();
        }
        if (this.f91838f.contains(e2r0Var)) {
            return;
        }
        this.f91838f.add(e2r0Var);
    }

    /* JADX INFO: renamed from: j */
    public String m119162j() {
        return this.f91834b;
    }

    /* JADX INFO: renamed from: k */
    public String m119163k() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f91837e);
        String str = this.f91837e;
        return !zIsEmpty ? n2r0.m161252e(str) : str;
    }

    public String toString() {
        return mo119158d();
    }

    public e2r0(String str, String str2, String[] strArr, String[] strArr2) {
        this.f91838f = null;
        this.f91833a = str;
        this.f91834b = str2;
        this.f91835c = strArr;
        this.f91836d = strArr2;
    }

    /* JADX INFO: renamed from: d */
    public String m119159d(String str) {
        if (str != null) {
            if (this.f91835c != null) {
                int i = 0;
                while (true) {
                    String[] strArr = this.f91835c;
                    if (i >= strArr.length) {
                        break;
                    }
                    if (str.equals(strArr[i])) {
                        return this.f91836d[i];
                    }
                    i++;
                }
            }
            return null;
        }
        fig0.m125680a();
        return null;
    }
}
