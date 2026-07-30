package com.xiaomi.push;

import android.os.Bundle;
import p149l.atq0;
import p149l.ctq0;
import p149l.htq0;
import p149l.jfd0;

/* JADX INFO: renamed from: com.xiaomi.push.fq */
/* JADX INFO: loaded from: classes2.dex */
public class C14738fq extends atq0 {

    /* JADX INFO: renamed from: p */
    private b f61770p;

    /* JADX INFO: renamed from: q */
    private String f61771q;

    /* JADX INFO: renamed from: r */
    private int f61772r;

    /* JADX INFO: renamed from: s */
    private a f61773s;

    /* JADX INFO: renamed from: com.xiaomi.push.fq$a */
    public enum a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    /* JADX INFO: renamed from: com.xiaomi.push.fq$b */
    public enum b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public C14738fq(Bundle bundle) {
        super(bundle);
        this.f61770p = b.available;
        this.f61771q = null;
        this.f61772r = Integer.MIN_VALUE;
        this.f61773s = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.f61770p = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.f61771q = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f61772r = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f61773s = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    /* JADX INFO: renamed from: A */
    public void m85575A(b bVar) {
        if (bVar != null) {
            this.f61770p = bVar;
        } else {
            jfd0.m141176a("Type cannot be null");
        }
    }

    /* JADX INFO: renamed from: B */
    public void m85576B(String str) {
        this.f61771q = str;
    }

    @Override // p149l.atq0
    /* JADX INFO: renamed from: a */
    public Bundle mo85577a() {
        Bundle bundleMo85577a = super.mo85577a();
        b bVar = this.f61770p;
        if (bVar != null) {
            bundleMo85577a.putString("ext_pres_type", bVar.toString());
        }
        String str = this.f61771q;
        if (str != null) {
            bundleMo85577a.putString("ext_pres_status", str);
        }
        int i = this.f61772r;
        if (i != Integer.MIN_VALUE) {
            bundleMo85577a.putInt("ext_pres_prio", i);
        }
        a aVar = this.f61773s;
        if (aVar != null && aVar != a.available) {
            bundleMo85577a.putString("ext_pres_mode", aVar.toString());
        }
        return bundleMo85577a;
    }

    @Override // p149l.atq0
    /* JADX INFO: renamed from: d */
    public String mo85578d() {
        StringBuilder sb = new StringBuilder("<presence");
        if (m98877w() != null) {
            sb.append(" xmlns=\"");
            sb.append(m98877w());
            sb.append("\"");
        }
        if (m98866l() != null) {
            sb.append(" id=\"");
            sb.append(m98866l());
            sb.append("\"");
        }
        if (m98869o() != null) {
            sb.append(" to=\"");
            sb.append(htq0.m132933b(m98869o()));
            sb.append("\"");
        }
        if (m98871q() != null) {
            sb.append(" from=\"");
            sb.append(htq0.m132933b(m98871q()));
            sb.append("\"");
        }
        if (m98867m() != null) {
            sb.append(" chid=\"");
            sb.append(htq0.m132933b(m98867m()));
            sb.append("\"");
        }
        if (this.f61770p != null) {
            sb.append(" type=\"");
            sb.append(this.f61770p);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f61771q != null) {
            sb.append("<status>");
            sb.append(htq0.m132933b(this.f61771q));
            sb.append("</status>");
        }
        if (this.f61772r != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.f61772r);
            sb.append("</priority>");
        }
        a aVar = this.f61773s;
        if (aVar != null && aVar != a.available) {
            sb.append("<show>");
            sb.append(this.f61773s);
            sb.append("</show>");
        }
        sb.append(m98875u());
        C14786k c14786kM98858b = m98858b();
        if (c14786kM98858b != null) {
            sb.append(c14786kM98858b.m86261b());
        }
        sb.append("</presence>");
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public void m85579y(int i) {
        if (i < -128 || i > 128) {
            ctq0.m108694a("Priority value ", i, " is not valid. Valid range is -128 through 128.");
        } else {
            this.f61772r = i;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m85580z(a aVar) {
        this.f61773s = aVar;
    }

    public C14738fq(b bVar) {
        this.f61770p = b.available;
        this.f61771q = null;
        this.f61772r = Integer.MIN_VALUE;
        this.f61773s = null;
        m85575A(bVar);
    }
}
