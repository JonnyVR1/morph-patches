package com.vivo.push;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.vivo.push.p111b.C14535a;
import com.vivo.push.p111b.C14536b;
import com.vivo.push.p111b.C14537c;
import com.vivo.push.p111b.C14541g;
import com.vivo.push.p111b.C14548n;
import com.vivo.push.p111b.C14560z;
import com.vivo.push.p113d.AbstractC14607z;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.C14633b;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14651t;
import com.vivo.push.util.C14654w;
import com.vivo.push.util.C14657z;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.vivo.push.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C14608e {

    /* JADX INFO: renamed from: a */
    private static volatile C14608e f61012a;

    /* JADX INFO: renamed from: h */
    private Context f61019h;

    /* JADX INFO: renamed from: j */
    private C14633b f61021j;

    /* JADX INFO: renamed from: k */
    private String f61022k;

    /* JADX INFO: renamed from: l */
    private String f61023l;

    /* JADX INFO: renamed from: o */
    private Boolean f61026o;

    /* JADX INFO: renamed from: p */
    private Long f61027p;

    /* JADX INFO: renamed from: q */
    private boolean f61028q;

    /* JADX INFO: renamed from: s */
    private int f61030s;

    /* JADX INFO: renamed from: b */
    private long f61013b = -1;

    /* JADX INFO: renamed from: c */
    private long f61014c = -1;

    /* JADX INFO: renamed from: d */
    private long f61015d = -1;

    /* JADX INFO: renamed from: e */
    private long f61016e = -1;

    /* JADX INFO: renamed from: f */
    private long f61017f = -1;

    /* JADX INFO: renamed from: g */
    private long f61018g = -1;

    /* JADX INFO: renamed from: i */
    private boolean f61020i = true;

    /* JADX INFO: renamed from: m */
    private SparseArray<a> f61024m = new SparseArray<>();

    /* JADX INFO: renamed from: n */
    private int f61025n = 0;

    /* JADX INFO: renamed from: r */
    private IPushClientFactory f61029r = new C14572d();

    private C14608e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m84872e(String str) {
        C14617m.m84914a(new RunnableC14615k(this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m84873m() {
        this.f61023l = null;
        this.f61021j.m84969b("APP_ALIAS");
    }

    /* JADX INFO: renamed from: n */
    private boolean m84874n() {
        if (this.f61026o == null) {
            this.f61026o = Boolean.valueOf(m84902l() >= 1230 && C14657z.m85068d(this.f61019h));
        }
        return this.f61026o.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m84883a(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        Context context = this.f61019h;
        if (context == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        C14560z c14560z = new C14560z(true, context.getPackageName(), arrayList);
        c14560z.m84748a(500);
        if (!this.f61028q) {
            m84878a(c14560z);
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!m84874n()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(101);
                return;
            }
            return;
        }
        if (!m84864a(this.f61017f)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f61017f = SystemClock.elapsedRealtime();
        String strM84862a = m84862a(new a(c14560z, iPushActionListener));
        c14560z.m84749b(strM84862a);
        if (TextUtils.isEmpty(this.f61022k)) {
            m84880a(strM84862a, 20001);
            return;
        }
        if (arrayList.size() < 0) {
            m84880a(strM84862a, 20002);
            return;
        }
        if (arrayList.size() + m84892c().size() > 500) {
            m84880a(strM84862a, 20004);
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().length() > 70) {
                m84880a(strM84862a, 20003);
                return;
            }
        }
        m84878a(c14560z);
        m84872e(strM84862a);
    }

    /* JADX INFO: renamed from: b */
    public final void m84890b(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        Context context = this.f61019h;
        if (context == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        C14560z c14560z = new C14560z(false, context.getPackageName(), arrayList);
        c14560z.m84748a(500);
        if (!this.f61028q) {
            m84878a(c14560z);
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!m84874n()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(101);
                return;
            }
            return;
        }
        if (!m84864a(this.f61018g)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f61018g = SystemClock.elapsedRealtime();
        String strM84862a = m84862a(new a(c14560z, iPushActionListener));
        c14560z.m84749b(strM84862a);
        if (TextUtils.isEmpty(this.f61022k)) {
            m84880a(strM84862a, 20001);
            return;
        }
        if (arrayList.size() < 0) {
            m84880a(strM84862a, 20002);
            return;
        }
        if (arrayList.size() > 500) {
            m84880a(strM84862a, 20004);
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().length() > 70) {
                m84880a(strM84862a, 20003);
                return;
            }
        }
        m84878a(c14560z);
        m84872e(strM84862a);
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m84892c() {
        String strM84968b = this.f61021j.m84968b("APP_TAGS", (String) null);
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(strM84968b)) {
                Iterator<String> itKeys = new JSONObject(strM84968b).keys();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            this.f61021j.m84969b("APP_TAGS");
            arrayList.clear();
            C14647p.m85021d("PushClientManager", "getTags error");
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m84894d() {
        if (this.f61019h == null) {
            C14647p.m85021d("PushClientManager", "support:context is null");
            return false;
        }
        Boolean boolValueOf = Boolean.valueOf(m84874n());
        this.f61026o = boolValueOf;
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final String m84896f() {
        if (!TextUtils.isEmpty(this.f61022k)) {
            return this.f61022k;
        }
        C14633b c14633b = this.f61021j;
        String strM84968b = c14633b != null ? c14633b.m84968b("APP_TOKEN", (String) null) : "";
        m84869c(strM84968b);
        return strM84968b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m84897g() {
        return this.f61020i;
    }

    /* JADX INFO: renamed from: h */
    public final Context m84898h() {
        return this.f61019h;
    }

    /* JADX INFO: renamed from: i */
    public final void m84899i() {
        this.f61021j.m84962a();
    }

    /* JADX INFO: renamed from: j */
    public final String m84900j() {
        return this.f61023l;
    }

    /* JADX INFO: renamed from: k */
    public final int m84901k() {
        return this.f61030s;
    }

    /* JADX INFO: renamed from: l */
    public final long m84902l() {
        Context context = this.f61019h;
        if (context == null) {
            return -1L;
        }
        if (this.f61027p == null) {
            this.f61027p = Long.valueOf(C14657z.m85053a(context));
        }
        return this.f61027p.longValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m84895e() {
        return this.f61028q;
    }

    /* JADX INFO: renamed from: com.vivo.push.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private IPushActionListener f61031a;

        /* JADX INFO: renamed from: b */
        private C14537c f61032b;

        /* JADX INFO: renamed from: c */
        private IPushActionListener f61033c;

        /* JADX INFO: renamed from: d */
        private Runnable f61034d;

        /* JADX INFO: renamed from: e */
        private Object[] f61035e;

        public a(C14537c c14537c, IPushActionListener iPushActionListener) {
            this.f61032b = c14537c;
            this.f61031a = iPushActionListener;
        }

        /* JADX INFO: renamed from: a */
        public final void m84904a(int i, Object... objArr) {
            this.f61035e = objArr;
            IPushActionListener iPushActionListener = this.f61033c;
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(i);
            }
            IPushActionListener iPushActionListener2 = this.f61031a;
            if (iPushActionListener2 != null) {
                iPushActionListener2.onStateChanged(i);
            }
        }

        /* JADX INFO: renamed from: b */
        public final Object[] m84907b() {
            return this.f61035e;
        }

        /* JADX INFO: renamed from: a */
        public final void m84906a(Runnable runnable) {
            this.f61034d = runnable;
        }

        /* JADX INFO: renamed from: a */
        public final void m84903a() {
            Runnable runnable = this.f61034d;
            if (runnable == null) {
                C14647p.m85008a("PushClientManager", "task is null");
            } else {
                runnable.run();
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m84905a(IPushActionListener iPushActionListener) {
            this.f61033c = iPushActionListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public synchronized a m84870d(String str) {
        if (str != null) {
            try {
                int i = Integer.parseInt(str);
                a aVar = this.f61024m.get(i);
                this.f61024m.delete(i);
                return aVar;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m84893c(List<String> list) {
        if (list.contains(this.f61023l)) {
            m84873m();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m84869c(String str) {
        C14617m.m84916c(new RunnableC14610f(this, str));
    }

    /* JADX INFO: renamed from: b */
    public final void m84886b() throws VivoPushException {
        Context context = this.f61019h;
        if (context != null) {
            C14657z.m85063b(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m84891b(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() <= 0) {
                return;
            }
            String strM84968b = this.f61021j.m84968b("APP_TAGS", (String) null);
            if (TextUtils.isEmpty(strM84968b)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(strM84968b);
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONObject.remove(it.next());
            }
            String string = jSONObject.toString();
            boolean zIsEmpty = TextUtils.isEmpty(string);
            C14633b c14633b = this.f61021j;
            if (zIsEmpty) {
                c14633b.m84969b("APP_TAGS");
            } else {
                c14633b.m84966a("APP_TAGS", string);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            this.f61021j.m84969b("APP_TAGS");
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14608e m84861a() {
        try {
            if (f61012a == null) {
                f61012a = new C14608e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61012a;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m84875a(Context context) {
        if (this.f61019h == null) {
            this.f61019h = ContextDelegate.getContext(context);
            this.f61028q = C14651t.m85035c(context, context.getPackageName());
            C14654w.m85045b().m85047a(this.f61019h);
            m84878a(new C14541g());
            C14633b c14633b = new C14633b();
            this.f61021j = c14633b;
            c14633b.m84963a(this.f61019h, "com.vivo.push_preferences.appconfig_v1");
            this.f61022k = m84896f();
            this.f61023l = this.f61021j.m84968b("APP_ALIAS", (String) null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m84887b(IPushActionListener iPushActionListener) {
        if (this.f61019h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if ("".equals(this.f61022k)) {
            iPushActionListener.onStateChanged(0);
            return;
        }
        if (!m84864a(this.f61014c)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f61014c = SystemClock.elapsedRealtime();
        String packageName = this.f61019h.getPackageName();
        a aVarM84860a = null;
        if (this.f61019h != null) {
            C14536b c14536b = new C14536b(false, packageName);
            c14536b.m84745d();
            c14536b.m84746e();
            c14536b.m84751g();
            c14536b.m84748a(100);
            if (this.f61028q) {
                if (m84874n()) {
                    aVarM84860a = new a(c14536b, iPushActionListener);
                    String strM84862a = m84862a(aVarM84860a);
                    c14536b.m84749b(strM84862a);
                    aVarM84860a.m84906a(new RunnableC14614j(this, c14536b, strM84862a));
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (c14536b.m84747a(this.f61019h) == 2) {
                aVarM84860a = m84860a(c14536b, iPushActionListener);
            } else {
                m84878a(c14536b);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(102);
        }
        if (aVarM84860a == null) {
            return;
        }
        aVarM84860a.m84905a(new C14613i(this));
        aVarM84860a.m84903a();
    }

    /* JADX INFO: renamed from: a */
    public final void m84884a(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() <= 0) {
                return;
            }
            String strM84968b = this.f61021j.m84968b("APP_TAGS", (String) null);
            if (TextUtils.isEmpty(strM84968b)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(strM84968b);
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONObject.put(it.next(), System.currentTimeMillis());
            }
            String string = jSONObject.toString();
            boolean zIsEmpty = TextUtils.isEmpty(string);
            C14633b c14633b = this.f61021j;
            if (zIsEmpty) {
                c14633b.m84969b("APP_TAGS");
            } else {
                c14633b.m84966a("APP_TAGS", string);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            this.f61021j.m84969b("APP_TAGS");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84879a(String str) {
        this.f61022k = str;
        this.f61021j.m84966a("APP_TOKEN", str);
    }

    /* JADX INFO: renamed from: a */
    public final void m84885a(boolean z) {
        this.f61020i = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m84877a(IPushActionListener iPushActionListener) {
        if (this.f61019h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        String strM84896f = m84896f();
        this.f61022k = strM84896f;
        if (!TextUtils.isEmpty(strM84896f)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        if (!m84864a(this.f61013b)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
                return;
            }
            return;
        }
        this.f61013b = SystemClock.elapsedRealtime();
        String packageName = this.f61019h.getPackageName();
        a aVarM84860a = null;
        if (this.f61019h != null) {
            C14536b c14536b = new C14536b(true, packageName);
            c14536b.m84751g();
            c14536b.m84745d();
            c14536b.m84746e();
            c14536b.m84748a(100);
            if (this.f61028q) {
                if (m84874n()) {
                    aVarM84860a = m84860a(c14536b, iPushActionListener);
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (c14536b.m84747a(this.f61019h) == 2) {
                aVarM84860a = m84860a(c14536b, iPushActionListener);
            } else {
                m84878a(c14536b);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(102);
        }
        if (aVarM84860a == null) {
            return;
        }
        aVarM84860a.m84905a(new C14611g(this, aVarM84860a));
        aVarM84860a.m84903a();
    }

    /* JADX INFO: renamed from: b */
    public final void m84889b(String str, IPushActionListener iPushActionListener) {
        if (this.f61019h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.f61023l)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C14535a c14535a = new C14535a(false, this.f61019h.getPackageName(), arrayList);
        c14535a.m84748a(100);
        if (this.f61028q) {
            if (!m84874n()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                    return;
                }
                return;
            }
            if (!m84864a(this.f61016e)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(1002);
                    return;
                }
                return;
            }
            this.f61016e = SystemClock.elapsedRealtime();
            String strM84862a = m84862a(new a(c14535a, iPushActionListener));
            c14535a.m84749b(strM84862a);
            if (TextUtils.isEmpty(this.f61022k)) {
                m84880a(strM84862a, 30001);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                m84880a(strM84862a, ijkStreamerUtil.FFS_PROP_INT64_AACPROFILE);
                return;
            } else if (str.length() > 70) {
                m84880a(strM84862a, 30003);
                return;
            } else {
                m84878a(c14535a);
                m84872e(strM84862a);
                return;
            }
        }
        m84878a(c14535a);
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private a m84860a(C14536b c14536b, IPushActionListener iPushActionListener) {
        a aVar = new a(c14536b, iPushActionListener);
        String strM84862a = m84862a(aVar);
        c14536b.m84749b(strM84862a);
        aVar.m84906a(new RunnableC14612h(this, c14536b, strM84862a));
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m84888b(String str) {
        this.f61023l = str;
        this.f61021j.m84966a("APP_ALIAS", str);
    }

    /* JADX INFO: renamed from: a */
    public final void m84881a(String str, int i, Object... objArr) {
        a aVarM84870d = m84870d(str);
        if (aVarM84870d != null) {
            aVarM84870d.m84904a(i, objArr);
        } else {
            C14647p.m85021d("PushClientManager", "notifyApp token is null");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84882a(String str, IPushActionListener iPushActionListener) {
        if (this.f61019h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(this.f61023l) && this.f61023l.equals(str)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C14535a c14535a = new C14535a(true, this.f61019h.getPackageName(), arrayList);
        c14535a.m84748a(100);
        if (this.f61028q) {
            if (!m84874n()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                    return;
                }
                return;
            }
            if (!m84864a(this.f61015d)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(1002);
                    return;
                }
                return;
            }
            this.f61015d = SystemClock.elapsedRealtime();
            String strM84862a = m84862a(new a(c14535a, iPushActionListener));
            c14535a.m84749b(strM84862a);
            if (TextUtils.isEmpty(this.f61022k)) {
                m84880a(strM84862a, 30001);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                m84880a(strM84862a, ijkStreamerUtil.FFS_PROP_INT64_AACPROFILE);
                return;
            } else if (str.length() > 70) {
                m84880a(strM84862a, 30003);
                return;
            } else {
                m84878a(c14535a);
                m84872e(strM84862a);
                return;
            }
        }
        m84878a(c14535a);
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m84864a(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return j == -1 || jElapsedRealtime <= j || jElapsedRealtime >= j + 2000;
    }

    /* JADX INFO: renamed from: a */
    public final void m84880a(String str, int i) {
        a aVarM84870d = m84870d(str);
        if (aVarM84870d != null) {
            aVarM84870d.m84904a(i, new Object[0]);
        } else {
            C14647p.m85021d("PushClientManager", "notifyStatusChanged token is null");
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized String m84862a(a aVar) {
        int i;
        this.f61024m.put(this.f61025n, aVar);
        i = this.f61025n;
        this.f61025n = i + 1;
        return Integer.toString(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m84876a(Intent intent, PushMessageCallback pushMessageCallback) {
        AbstractC14621o abstractC14621oCreateReceiverCommand = this.f61029r.createReceiverCommand(intent);
        Context context = m84861a().f61019h;
        if (abstractC14621oCreateReceiverCommand == null) {
            C14647p.m85008a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                C14647p.m85020c(context, "[执行指令失败]指令空！");
                return;
            }
            return;
        }
        AbstractC14607z abstractC14607zCreateReceiveTask = this.f61029r.createReceiveTask(abstractC14621oCreateReceiverCommand);
        if (abstractC14607zCreateReceiveTask == null) {
            C14647p.m85008a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(abstractC14621oCreateReceiverCommand)));
            if (context != null) {
                C14647p.m85020c(context, "[执行指令失败]指令" + abstractC14621oCreateReceiverCommand + "任务空！");
                return;
            }
            return;
        }
        if (context != null && !(abstractC14621oCreateReceiverCommand instanceof C14548n)) {
            C14647p.m85012a(context, "[接收指令]".concat(String.valueOf(abstractC14621oCreateReceiverCommand)));
        }
        abstractC14607zCreateReceiveTask.m84856a(pushMessageCallback);
        C14617m.m84913a((AbstractRunnableC14616l) abstractC14607zCreateReceiveTask);
    }

    /* JADX INFO: renamed from: a */
    public final void m84878a(AbstractC14621o abstractC14621o) {
        Context context = m84861a().f61019h;
        if (abstractC14621o == null) {
            C14647p.m85008a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                C14647p.m85020c(context, "[执行指令失败]指令空！");
                return;
            }
            return;
        }
        AbstractRunnableC14616l abstractRunnableC14616lCreateTask = this.f61029r.createTask(abstractC14621o);
        if (abstractRunnableC14616lCreateTask == null) {
            C14647p.m85008a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(abstractC14621o)));
            if (context != null) {
                C14647p.m85020c(context, "[执行指令失败]指令" + abstractC14621o + "任务空！");
                return;
            }
            return;
        }
        C14647p.m85021d("PushClientManager", "client--sendCommand, command = ".concat(String.valueOf(abstractC14621o)));
        C14617m.m84913a(abstractRunnableC14616lCreateTask);
    }
}
