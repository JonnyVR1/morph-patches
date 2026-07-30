package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p153l.e2r0;

/* JADX INFO: renamed from: com.xiaomi.push.k */
/* JADX INFO: loaded from: classes2.dex */
public class C14934k {

    /* JADX INFO: renamed from: a */
    private int f63538a;

    /* JADX INFO: renamed from: b */
    private String f63539b;

    /* JADX INFO: renamed from: c */
    private String f63540c;

    /* JADX INFO: renamed from: d */
    private String f63541d;

    /* JADX INFO: renamed from: e */
    private String f63542e;

    /* JADX INFO: renamed from: f */
    private List<e2r0> f63543f;

    /* JADX INFO: renamed from: com.xiaomi.push.k$a */
    public static class a {

        /* JADX INFO: renamed from: b */
        public static final a f63544b = new a("internal-server-error");

        /* JADX INFO: renamed from: c */
        public static final a f63545c = new a("forbidden");

        /* JADX INFO: renamed from: d */
        public static final a f63546d = new a("bad-request");

        /* JADX INFO: renamed from: e */
        public static final a f63547e = new a("conflict");

        /* JADX INFO: renamed from: f */
        public static final a f63548f = new a("feature-not-implemented");

        /* JADX INFO: renamed from: g */
        public static final a f63549g = new a("gone");

        /* JADX INFO: renamed from: h */
        public static final a f63550h = new a("item-not-found");

        /* JADX INFO: renamed from: i */
        public static final a f63551i = new a("jid-malformed");

        /* JADX INFO: renamed from: j */
        public static final a f63552j = new a("not-acceptable");

        /* JADX INFO: renamed from: k */
        public static final a f63553k = new a("not-allowed");

        /* JADX INFO: renamed from: l */
        public static final a f63554l = new a("not-authorized");

        /* JADX INFO: renamed from: m */
        public static final a f63555m = new a("payment-required");

        /* JADX INFO: renamed from: n */
        public static final a f63556n = new a("recipient-unavailable");

        /* JADX INFO: renamed from: o */
        public static final a f63557o = new a("redirect");

        /* JADX INFO: renamed from: p */
        public static final a f63558p = new a("registration-required");

        /* JADX INFO: renamed from: q */
        public static final a f63559q = new a("remote-server-error");

        /* JADX INFO: renamed from: r */
        public static final a f63560r = new a("remote-server-not-found");

        /* JADX INFO: renamed from: s */
        public static final a f63561s = new a("remote-server-timeout");

        /* JADX INFO: renamed from: t */
        public static final a f63562t = new a("resource-constraint");

        /* JADX INFO: renamed from: u */
        public static final a f63563u = new a("service-unavailable");

        /* JADX INFO: renamed from: v */
        public static final a f63564v = new a("subscription-required");

        /* JADX INFO: renamed from: w */
        public static final a f63565w = new a("undefined-condition");

        /* JADX INFO: renamed from: x */
        public static final a f63566x = new a("unexpected-request");

        /* JADX INFO: renamed from: y */
        public static final a f63567y = new a("request-timeout");

        /* JADX INFO: renamed from: a */
        private String f63568a;

        public a(String str) {
            this.f63568a = str;
        }

        public String toString() {
            return this.f63568a;
        }
    }

    public C14934k(Bundle bundle) {
        this.f63543f = null;
        this.f63538a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f63539b = bundle.getString("ext_err_type");
        }
        this.f63540c = bundle.getString("ext_err_cond");
        this.f63541d = bundle.getString("ext_err_reason");
        this.f63542e = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f63543f = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                e2r0 e2r0VarM119152e = e2r0.m119152e((Bundle) parcelable);
                if (e2r0VarM119152e != null) {
                    this.f63543f.add(e2r0VarM119152e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m87430d(a aVar) {
        this.f63540c = aVar.f63568a;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m87431a() {
        Bundle bundle = new Bundle();
        String str = this.f63539b;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.f63538a);
        String str2 = this.f63541d;
        if (str2 != null) {
            bundle.putString("ext_err_reason", str2);
        }
        String str3 = this.f63540c;
        if (str3 != null) {
            bundle.putString("ext_err_cond", str3);
        }
        String str4 = this.f63542e;
        if (str4 != null) {
            bundle.putString("ext_err_msg", str4);
        }
        List<e2r0> list = this.f63543f;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            Iterator<e2r0> it = this.f63543f.iterator();
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
    public String m87432b() {
        StringBuilder sb = new StringBuilder("<error code=\"");
        sb.append(this.f63538a);
        sb.append("\"");
        if (this.f63539b != null) {
            sb.append(" type=\"");
            sb.append(this.f63539b);
            sb.append("\"");
        }
        if (this.f63541d != null) {
            sb.append(" reason=\"");
            sb.append(this.f63541d);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f63540c != null) {
            sb.append("<");
            sb.append(this.f63540c);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.f63542e != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.f63542e);
            sb.append("</text>");
        }
        Iterator<e2r0> it = m87433c().iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo119158d());
        }
        sb.append("</error>");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public synchronized List<e2r0> m87433c() {
        List<e2r0> list = this.f63543f;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f63540c;
        if (str != null) {
            sb.append(str);
        }
        sb.append("(");
        sb.append(this.f63538a);
        sb.append(")");
        if (this.f63542e != null) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(this.f63542e);
        }
        return sb.toString();
    }

    public C14934k(int i, String str, String str2, String str3, String str4, List<e2r0> list) {
        this.f63538a = i;
        this.f63539b = str;
        this.f63541d = str2;
        this.f63540c = str3;
        this.f63542e = str4;
        this.f63543f = list;
    }

    public C14934k(a aVar) {
        this.f63543f = null;
        m87430d(aVar);
        this.f63542e = null;
    }
}
