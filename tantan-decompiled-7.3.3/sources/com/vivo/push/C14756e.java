package com.vivo.push;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.vivo.push.p116b.C14683a;
import com.vivo.push.p116b.C14684b;
import com.vivo.push.p116b.C14685c;
import com.vivo.push.p116b.C14689g;
import com.vivo.push.p116b.C14696n;
import com.vivo.push.p116b.C14708z;
import com.vivo.push.p118d.AbstractC14755z;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.C14781b;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14799t;
import com.vivo.push.util.C14802w;
import com.vivo.push.util.C14805z;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.vivo.push.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C14756e {

    /* JADX INFO: renamed from: a */
    private static volatile C14756e f61859a;

    /* JADX INFO: renamed from: h */
    private Context f61866h;

    /* JADX INFO: renamed from: j */
    private C14781b f61868j;

    /* JADX INFO: renamed from: k */
    private String f61869k;

    /* JADX INFO: renamed from: l */
    private String f61870l;

    /* JADX INFO: renamed from: o */
    private Boolean f61873o;

    /* JADX INFO: renamed from: p */
    private Long f61874p;

    /* JADX INFO: renamed from: q */
    private boolean f61875q;

    /* JADX INFO: renamed from: s */
    private int f61877s;

    /* JADX INFO: renamed from: b */
    private long f61860b = -1;

    /* JADX INFO: renamed from: c */
    private long f61861c = -1;

    /* JADX INFO: renamed from: d */
    private long f61862d = -1;

    /* JADX INFO: renamed from: e */
    private long f61863e = -1;

    /* JADX INFO: renamed from: f */
    private long f61864f = -1;

    /* JADX INFO: renamed from: g */
    private long f61865g = -1;

    /* JADX INFO: renamed from: i */
    private boolean f61867i = true;

    /* JADX INFO: renamed from: m */
    private SparseArray<a> f61871m = new SparseArray<>();

    /* JADX INFO: renamed from: n */
    private int f61872n = 0;

    /* JADX INFO: renamed from: r */
    private IPushClientFactory f61876r = new C14720d();

    private C14756e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m86043e(String str) {
        C14765m.m86085a(new RunnableC14763k(this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m86044m() {
        this.f61870l = null;
        this.f61868j.m86140b("APP_ALIAS");
    }

    /* JADX INFO: renamed from: n */
    private boolean m86045n() {
        if (this.f61873o == null) {
            this.f61873o = Boolean.valueOf(m86073l() >= 1230 && C14805z.m86239d(this.f61866h));
        }
        return this.f61873o.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m86054a(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        Context context = this.f61866h;
        if (context == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        C14708z c14708z = new C14708z(true, context.getPackageName(), arrayList);
        c14708z.m85919a(500);
        if (!this.f61875q) {
            m86049a(c14708z);
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!m86045n()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(101);
                return;
            }
            return;
        }
        if (!m86035a(this.f61864f)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f61864f = SystemClock.elapsedRealtime();
        String strM86033a = m86033a(new a(c14708z, iPushActionListener));
        c14708z.m85920b(strM86033a);
        if (TextUtils.isEmpty(this.f61869k)) {
            m86051a(strM86033a, 20001);
            return;
        }
        if (arrayList.size() < 0) {
            m86051a(strM86033a, 20002);
            return;
        }
        if (arrayList.size() + m86063c().size() > 500) {
            m86051a(strM86033a, 20004);
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().length() > 70) {
                m86051a(strM86033a, 20003);
                return;
            }
        }
        m86049a(c14708z);
        m86043e(strM86033a);
    }

    /* JADX INFO: renamed from: b */
    public final void m86061b(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        Context context = this.f61866h;
        if (context == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        C14708z c14708z = new C14708z(false, context.getPackageName(), arrayList);
        c14708z.m85919a(500);
        if (!this.f61875q) {
            m86049a(c14708z);
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!m86045n()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(101);
                return;
            }
            return;
        }
        if (!m86035a(this.f61865g)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f61865g = SystemClock.elapsedRealtime();
        String strM86033a = m86033a(new a(c14708z, iPushActionListener));
        c14708z.m85920b(strM86033a);
        if (TextUtils.isEmpty(this.f61869k)) {
            m86051a(strM86033a, 20001);
            return;
        }
        if (arrayList.size() < 0) {
            m86051a(strM86033a, 20002);
            return;
        }
        if (arrayList.size() > 500) {
            m86051a(strM86033a, 20004);
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().length() > 70) {
                m86051a(strM86033a, 20003);
                return;
            }
        }
        m86049a(c14708z);
        m86043e(strM86033a);
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m86063c() {
        String strM86139b = this.f61868j.m86139b("APP_TAGS", (String) null);
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(strM86139b)) {
                Iterator<String> itKeys = new JSONObject(strM86139b).keys();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            this.f61868j.m86140b("APP_TAGS");
            arrayList.clear();
            C14795p.m86192d("PushClientManager", "getTags error");
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m86065d() {
        if (this.f61866h == null) {
            C14795p.m86192d("PushClientManager", "support:context is null");
            return false;
        }
        Boolean boolValueOf = Boolean.valueOf(m86045n());
        this.f61873o = boolValueOf;
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final String m86067f() {
        if (!TextUtils.isEmpty(this.f61869k)) {
            return this.f61869k;
        }
        C14781b c14781b = this.f61868j;
        String strM86139b = c14781b != null ? c14781b.m86139b("APP_TOKEN", (String) null) : "";
        m86040c(strM86139b);
        return strM86139b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m86068g() {
        return this.f61867i;
    }

    /* JADX INFO: renamed from: h */
    public final Context m86069h() {
        return this.f61866h;
    }

    /* JADX INFO: renamed from: i */
    public final void m86070i() {
        this.f61868j.m86133a();
    }

    /* JADX INFO: renamed from: j */
    public final String m86071j() {
        return this.f61870l;
    }

    /* JADX INFO: renamed from: k */
    public final int m86072k() {
        return this.f61877s;
    }

    /* JADX INFO: renamed from: l */
    public final long m86073l() {
        Context context = this.f61866h;
        if (context == null) {
            return -1L;
        }
        if (this.f61874p == null) {
            this.f61874p = Long.valueOf(C14805z.m86224a(context));
        }
        return this.f61874p.longValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m86066e() {
        return this.f61875q;
    }

    /* JADX INFO: renamed from: com.vivo.push.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private IPushActionListener f61878a;

        /* JADX INFO: renamed from: b */
        private C14685c f61879b;

        /* JADX INFO: renamed from: c */
        private IPushActionListener f61880c;

        /* JADX INFO: renamed from: d */
        private Runnable f61881d;

        /* JADX INFO: renamed from: e */
        private Object[] f61882e;

        public a(C14685c c14685c, IPushActionListener iPushActionListener) {
            this.f61879b = c14685c;
            this.f61878a = iPushActionListener;
        }

        /* JADX INFO: renamed from: a */
        public final void m86075a(int i, Object... objArr) {
            this.f61882e = objArr;
            IPushActionListener iPushActionListener = this.f61880c;
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(i);
            }
            IPushActionListener iPushActionListener2 = this.f61878a;
            if (iPushActionListener2 != null) {
                iPushActionListener2.onStateChanged(i);
            }
        }

        /* JADX INFO: renamed from: b */
        public final Object[] m86078b() {
            return this.f61882e;
        }

        /* JADX INFO: renamed from: a */
        public final void m86077a(Runnable runnable) {
            this.f61881d = runnable;
        }

        /* JADX INFO: renamed from: a */
        public final void m86074a() {
            Runnable runnable = this.f61881d;
            if (runnable == null) {
                C14795p.m86179a("PushClientManager", "task is null");
            } else {
                runnable.run();
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m86076a(IPushActionListener iPushActionListener) {
            this.f61880c = iPushActionListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public synchronized a m86041d(String str) {
        if (str != null) {
            try {
                int i = Integer.parseInt(str);
                a aVar = this.f61871m.get(i);
                this.f61871m.delete(i);
                return aVar;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m86064c(List<String> list) {
        if (list.contains(this.f61870l)) {
            m86044m();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m86040c(String str) {
        C14765m.m86087c(new RunnableC14758f(this, str));
    }

    /* JADX INFO: renamed from: b */
    public final void m86057b() throws VivoPushException {
        Context context = this.f61866h;
        if (context != null) {
            C14805z.m86234b(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m86062b(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() <= 0) {
                return;
            }
            String strM86139b = this.f61868j.m86139b("APP_TAGS", (String) null);
            if (TextUtils.isEmpty(strM86139b)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(strM86139b);
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONObject.remove(it.next());
            }
            String string = jSONObject.toString();
            boolean zIsEmpty = TextUtils.isEmpty(string);
            C14781b c14781b = this.f61868j;
            if (zIsEmpty) {
                c14781b.m86140b("APP_TAGS");
            } else {
                c14781b.m86137a("APP_TAGS", string);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            this.f61868j.m86140b("APP_TAGS");
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14756e m86032a() {
        try {
            if (f61859a == null) {
                f61859a = new C14756e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61859a;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m86046a(Context context) {
        if (this.f61866h == null) {
            this.f61866h = ContextDelegate.getContext(context);
            this.f61875q = C14799t.m86206c(context, context.getPackageName());
            C14802w.m86216b().m86218a(this.f61866h);
            m86049a(new C14689g());
            C14781b c14781b = new C14781b();
            this.f61868j = c14781b;
            c14781b.m86134a(this.f61866h, "com.vivo.push_preferences.appconfig_v1");
            this.f61869k = m86067f();
            this.f61870l = this.f61868j.m86139b("APP_ALIAS", (String) null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m86058b(IPushActionListener iPushActionListener) {
        if (this.f61866h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if ("".equals(this.f61869k)) {
            iPushActionListener.onStateChanged(0);
            return;
        }
        if (!m86035a(this.f61861c)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f61861c = SystemClock.elapsedRealtime();
        String packageName = this.f61866h.getPackageName();
        a aVarM86031a = null;
        if (this.f61866h != null) {
            C14684b c14684b = new C14684b(false, packageName);
            c14684b.m85916d();
            c14684b.m85917e();
            c14684b.m85922g();
            c14684b.m85919a(100);
            if (this.f61875q) {
                if (m86045n()) {
                    aVarM86031a = new a(c14684b, iPushActionListener);
                    String strM86033a = m86033a(aVarM86031a);
                    c14684b.m85920b(strM86033a);
                    aVarM86031a.m86077a(new RunnableC14762j(this, c14684b, strM86033a));
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (c14684b.m85918a(this.f61866h) == 2) {
                aVarM86031a = m86031a(c14684b, iPushActionListener);
            } else {
                m86049a(c14684b);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(102);
        }
        if (aVarM86031a == null) {
            return;
        }
        aVarM86031a.m86076a(new C14761i(this));
        aVarM86031a.m86074a();
    }

    /* JADX INFO: renamed from: a */
    public final void m86055a(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() <= 0) {
                return;
            }
            String strM86139b = this.f61868j.m86139b("APP_TAGS", (String) null);
            if (TextUtils.isEmpty(strM86139b)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(strM86139b);
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONObject.put(it.next(), System.currentTimeMillis());
            }
            String string = jSONObject.toString();
            boolean zIsEmpty = TextUtils.isEmpty(string);
            C14781b c14781b = this.f61868j;
            if (zIsEmpty) {
                c14781b.m86140b("APP_TAGS");
            } else {
                c14781b.m86137a("APP_TAGS", string);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            this.f61868j.m86140b("APP_TAGS");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m86050a(String str) {
        this.f61869k = str;
        this.f61868j.m86137a("APP_TOKEN", str);
    }

    /* JADX INFO: renamed from: a */
    public final void m86056a(boolean z) {
        this.f61867i = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m86048a(IPushActionListener iPushActionListener) {
        if (this.f61866h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        String strM86067f = m86067f();
        this.f61869k = strM86067f;
        if (!TextUtils.isEmpty(strM86067f)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!m86035a(this.f61860b)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f61860b = SystemClock.elapsedRealtime();
        String packageName = this.f61866h.getPackageName();
        a aVarM86031a = null;
        if (this.f61866h != null) {
            C14684b c14684b = new C14684b(true, packageName);
            c14684b.m85922g();
            c14684b.m85916d();
            c14684b.m85917e();
            c14684b.m85919a(100);
            if (this.f61875q) {
                if (m86045n()) {
                    aVarM86031a = m86031a(c14684b, iPushActionListener);
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (c14684b.m85918a(this.f61866h) == 2) {
                aVarM86031a = m86031a(c14684b, iPushActionListener);
            } else {
                m86049a(c14684b);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(102);
        }
        if (aVarM86031a == null) {
            return;
        }
        aVarM86031a.m86076a(new C14759g(this, aVarM86031a));
        aVarM86031a.m86074a();
    }

    /* JADX INFO: renamed from: b */
    public final void m86060b(String str, IPushActionListener iPushActionListener) {
        if (this.f61866h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.f61870l)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C14683a c14683a = new C14683a(false, this.f61866h.getPackageName(), arrayList);
        c14683a.m85919a(100);
        if (this.f61875q) {
            if (!m86045n()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                    return;
                }
                return;
            }
            if (!m86035a(this.f61863e)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(1002);
                    return;
                }
                return;
            }
            this.f61863e = SystemClock.elapsedRealtime();
            String strM86033a = m86033a(new a(c14683a, iPushActionListener));
            c14683a.m85920b(strM86033a);
            if (TextUtils.isEmpty(this.f61869k)) {
                m86051a(strM86033a, 30001);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                m86051a(strM86033a, ijkStreamerUtil.FFS_PROP_INT64_AACPROFILE);
                return;
            } else if (str.length() > 70) {
                m86051a(strM86033a, 30003);
                return;
            } else {
                m86049a(c14683a);
                m86043e(strM86033a);
                return;
            }
        }
        m86049a(c14683a);
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private a m86031a(C14684b c14684b, IPushActionListener iPushActionListener) {
        a aVar = new a(c14684b, iPushActionListener);
        String strM86033a = m86033a(aVar);
        c14684b.m85920b(strM86033a);
        aVar.m86077a(new RunnableC14760h(this, c14684b, strM86033a));
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m86059b(String str) {
        this.f61870l = str;
        this.f61868j.m86137a("APP_ALIAS", str);
    }

    /* JADX INFO: renamed from: a */
    public final void m86052a(String str, int i, Object... objArr) {
        a aVarM86041d = m86041d(str);
        if (aVarM86041d != null) {
            aVarM86041d.m86075a(i, objArr);
        } else {
            C14795p.m86192d("PushClientManager", "notifyApp token is null");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m86053a(String str, IPushActionListener iPushActionListener) {
        if (this.f61866h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(this.f61870l) && this.f61870l.equals(str)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C14683a c14683a = new C14683a(true, this.f61866h.getPackageName(), arrayList);
        c14683a.m85919a(100);
        if (this.f61875q) {
            if (!m86045n()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                    return;
                }
                return;
            }
            if (!m86035a(this.f61862d)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(1002);
                    return;
                }
                return;
            }
            this.f61862d = SystemClock.elapsedRealtime();
            String strM86033a = m86033a(new a(c14683a, iPushActionListener));
            c14683a.m85920b(strM86033a);
            if (TextUtils.isEmpty(this.f61869k)) {
                m86051a(strM86033a, 30001);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                m86051a(strM86033a, ijkStreamerUtil.FFS_PROP_INT64_AACPROFILE);
                return;
            } else if (str.length() > 70) {
                m86051a(strM86033a, 30003);
                return;
            } else {
                m86049a(c14683a);
                m86043e(strM86033a);
                return;
            }
        }
        m86049a(c14683a);
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86035a(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return j == -1 || jElapsedRealtime <= j || jElapsedRealtime >= j + 2000;
    }

    /* JADX INFO: renamed from: a */
    public final void m86051a(String str, int i) {
        a aVarM86041d = m86041d(str);
        if (aVarM86041d != null) {
            aVarM86041d.m86075a(i, new Object[0]);
        } else {
            C14795p.m86192d("PushClientManager", "notifyStatusChanged token is null");
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized String m86033a(a aVar) {
        int i;
        this.f61871m.put(this.f61872n, aVar);
        i = this.f61872n;
        this.f61872n = i + 1;
        return Integer.toString(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m86047a(Intent intent, PushMessageCallback pushMessageCallback) {
        AbstractC14769o abstractC14769oCreateReceiverCommand = this.f61876r.createReceiverCommand(intent);
        Context context = m86032a().f61866h;
        if (abstractC14769oCreateReceiverCommand == null) {
            C14795p.m86179a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                C14795p.m86191c(context, "[执行指令失败]指令空！");
                return;
            }
            return;
        }
        AbstractC14755z abstractC14755zCreateReceiveTask = this.f61876r.createReceiveTask(abstractC14769oCreateReceiverCommand);
        if (abstractC14755zCreateReceiveTask == null) {
            C14795p.m86179a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(abstractC14769oCreateReceiverCommand)));
            if (context != null) {
                C14795p.m86191c(context, "[执行指令失败]指令" + abstractC14769oCreateReceiverCommand + "任务空！");
                return;
            }
            return;
        }
        if (context != null && !(abstractC14769oCreateReceiverCommand instanceof C14696n)) {
            C14795p.m86183a(context, "[接收指令]".concat(String.valueOf(abstractC14769oCreateReceiverCommand)));
        }
        abstractC14755zCreateReceiveTask.m86027a(pushMessageCallback);
        C14765m.m86084a((AbstractRunnableC14764l) abstractC14755zCreateReceiveTask);
    }

    /* JADX INFO: renamed from: a */
    public final void m86049a(AbstractC14769o abstractC14769o) {
        Context context = m86032a().f61866h;
        if (abstractC14769o == null) {
            C14795p.m86179a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                C14795p.m86191c(context, "[执行指令失败]指令空！");
                return;
            }
            return;
        }
        AbstractRunnableC14764l abstractRunnableC14764lCreateTask = this.f61876r.createTask(abstractC14769o);
        if (abstractRunnableC14764lCreateTask == null) {
            C14795p.m86179a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(abstractC14769o)));
            if (context != null) {
                C14795p.m86191c(context, "[执行指令失败]指令" + abstractC14769o + "任务空！");
                return;
            }
            return;
        }
        C14795p.m86192d("PushClientManager", "client--sendCommand, command = ".concat(String.valueOf(abstractC14769o)));
        C14765m.m86084a(abstractRunnableC14764lCreateTask);
    }
}
