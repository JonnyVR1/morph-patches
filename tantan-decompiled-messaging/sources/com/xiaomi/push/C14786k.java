package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p149l.ysq0;

/* JADX INFO: renamed from: com.xiaomi.push.k */
/* JADX INFO: loaded from: classes2.dex */
public class C14786k {

    /* JADX INFO: renamed from: a */
    private int f62691a;

    /* JADX INFO: renamed from: b */
    private String f62692b;

    /* JADX INFO: renamed from: c */
    private String f62693c;

    /* JADX INFO: renamed from: d */
    private String f62694d;

    /* JADX INFO: renamed from: e */
    private String f62695e;

    /* JADX INFO: renamed from: f */
    private List<ysq0> f62696f;

    /* JADX INFO: renamed from: com.xiaomi.push.k$a */
    public static class a {

        /* JADX INFO: renamed from: b */
        public static final a f62697b = new a("internal-server-error");

        /* JADX INFO: renamed from: c */
        public static final a f62698c = new a("forbidden");

        /* JADX INFO: renamed from: d */
        public static final a f62699d = new a("bad-request");

        /* JADX INFO: renamed from: e */
        public static final a f62700e = new a("conflict");

        /* JADX INFO: renamed from: f */
        public static final a f62701f = new a("feature-not-implemented");

        /* JADX INFO: renamed from: g */
        public static final a f62702g = new a("gone");

        /* JADX INFO: renamed from: h */
        public static final a f62703h = new a("item-not-found");

        /* JADX INFO: renamed from: i */
        public static final a f62704i = new a("jid-malformed");

        /* JADX INFO: renamed from: j */
        public static final a f62705j = new a("not-acceptable");

        /* JADX INFO: renamed from: k */
        public static final a f62706k = new a("not-allowed");

        /* JADX INFO: renamed from: l */
        public static final a f62707l = new a("not-authorized");

        /* JADX INFO: renamed from: m */
        public static final a f62708m = new a("payment-required");

        /* JADX INFO: renamed from: n */
        public static final a f62709n = new a("recipient-unavailable");

        /* JADX INFO: renamed from: o */
        public static final a f62710o = new a("redirect");

        /* JADX INFO: renamed from: p */
        public static final a f62711p = new a("registration-required");

        /* JADX INFO: renamed from: q */
        public static final a f62712q = new a("remote-server-error");

        /* JADX INFO: renamed from: r */
        public static final a f62713r = new a("remote-server-not-found");

        /* JADX INFO: renamed from: s */
        public static final a f62714s = new a("remote-server-timeout");

        /* JADX INFO: renamed from: t */
        public static final a f62715t = new a("resource-constraint");

        /* JADX INFO: renamed from: u */
        public static final a f62716u = new a("service-unavailable");

        /* JADX INFO: renamed from: v */
        public static final a f62717v = new a("subscription-required");

        /* JADX INFO: renamed from: w */
        public static final a f62718w = new a("undefined-condition");

        /* JADX INFO: renamed from: x */
        public static final a f62719x = new a("unexpected-request");

        /* JADX INFO: renamed from: y */
        public static final a f62720y = new a("request-timeout");

        /* JADX INFO: renamed from: a */
        private String f62721a;

        public a(String str) {
            this.f62721a = str;
        }

        public String toString() {
            return this.f62721a;
        }
    }

    public C14786k(Bundle bundle) {
        this.f62696f = null;
        this.f62691a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f62692b = bundle.getString("ext_err_type");
        }
        this.f62693c = bundle.getString("ext_err_cond");
        this.f62694d = bundle.getString("ext_err_reason");
        this.f62695e = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f62696f = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                ysq0 ysq0VarM215918e = ysq0.m215918e((Bundle) parcelable);
                if (ysq0VarM215918e != null) {
                    this.f62696f.add(ysq0VarM215918e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m86259d(a aVar) {
        this.f62693c = aVar.f62721a;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m86260a() {
        Bundle bundle = new Bundle();
        String str = this.f62692b;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.f62691a);
        String str2 = this.f62694d;
        if (str2 != null) {
            bundle.putString("ext_err_reason", str2);
        }
        String str3 = this.f62693c;
        if (str3 != null) {
            bundle.putString("ext_err_cond", str3);
        }
        String str4 = this.f62695e;
        if (str4 != null) {
            bundle.putString("ext_err_msg", str4);
        }
        List<ysq0> list = this.f62696f;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            Iterator<ysq0> it = this.f62696f.iterator();
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
    public String m86261b() {
        StringBuilder sb = new StringBuilder("<error code=\"");
        sb.append(this.f62691a);
        sb.append("\"");
        if (this.f62692b != null) {
            sb.append(" type=\"");
            sb.append(this.f62692b);
            sb.append("\"");
        }
        if (this.f62694d != null) {
            sb.append(" reason=\"");
            sb.append(this.f62694d);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f62693c != null) {
            sb.append("<");
            sb.append(this.f62693c);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.f62695e != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.f62695e);
            sb.append("</text>");
        }
        Iterator<ysq0> it = m86262c().iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo103884d());
        }
        sb.append("</error>");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public synchronized List<ysq0> m86262c() {
        List<ysq0> list = this.f62696f;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f62693c;
        if (str != null) {
            sb.append(str);
        }
        sb.append("(");
        sb.append(this.f62691a);
        sb.append(")");
        if (this.f62695e != null) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(this.f62695e);
        }
        return sb.toString();
    }

    public C14786k(int i, String str, String str2, String str3, String str4, List<ysq0> list) {
        this.f62691a = i;
        this.f62692b = str;
        this.f62694d = str2;
        this.f62693c = str3;
        this.f62695e = str4;
        this.f62696f = list;
    }

    public C14786k(a aVar) {
        this.f62696f = null;
        m86259d(aVar);
        this.f62695e = null;
    }
}
