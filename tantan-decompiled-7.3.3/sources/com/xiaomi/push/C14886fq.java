package com.xiaomi.push;

import android.os.Bundle;
import p153l.g2r0;
import p153l.i2r0;
import p153l.mnd0;
import p153l.n2r0;

/* JADX INFO: renamed from: com.xiaomi.push.fq */
/* JADX INFO: loaded from: classes2.dex */
public class C14886fq extends g2r0 {

    /* JADX INFO: renamed from: p */
    private b f62617p;

    /* JADX INFO: renamed from: q */
    private String f62618q;

    /* JADX INFO: renamed from: r */
    private int f62619r;

    /* JADX INFO: renamed from: s */
    private a f62620s;

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

    public C14886fq(Bundle bundle) {
        super(bundle);
        this.f62617p = b.available;
        this.f62618q = null;
        this.f62619r = Integer.MIN_VALUE;
        this.f62620s = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.f62617p = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.f62618q = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f62619r = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f62620s = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    /* JADX INFO: renamed from: A */
    public void m86746A(b bVar) {
        if (bVar != null) {
            this.f62617p = bVar;
        } else {
            mnd0.m159157a("Type cannot be null");
        }
    }

    /* JADX INFO: renamed from: B */
    public void m86747B(String str) {
        this.f62618q = str;
    }

    @Override // p153l.g2r0
    /* JADX INFO: renamed from: a */
    public Bundle mo86748a() {
        Bundle bundleMo86748a = super.mo86748a();
        b bVar = this.f62617p;
        if (bVar != null) {
            bundleMo86748a.putString("ext_pres_type", bVar.toString());
        }
        String str = this.f62618q;
        if (str != null) {
            bundleMo86748a.putString("ext_pres_status", str);
        }
        int i = this.f62619r;
        if (i != Integer.MIN_VALUE) {
            bundleMo86748a.putInt("ext_pres_prio", i);
        }
        a aVar = this.f62620s;
        if (aVar != null && aVar != a.available) {
            bundleMo86748a.putString("ext_pres_mode", aVar.toString());
        }
        return bundleMo86748a;
    }

    @Override // p153l.g2r0
    /* JADX INFO: renamed from: d */
    public String mo86749d() {
        StringBuilder sb = new StringBuilder("<presence");
        if (m128659w() != null) {
            sb.append(" xmlns=\"");
            sb.append(m128659w());
            sb.append("\"");
        }
        if (m128648l() != null) {
            sb.append(" id=\"");
            sb.append(m128648l());
            sb.append("\"");
        }
        if (m128651o() != null) {
            sb.append(" to=\"");
            sb.append(n2r0.m161249b(m128651o()));
            sb.append("\"");
        }
        if (m128653q() != null) {
            sb.append(" from=\"");
            sb.append(n2r0.m161249b(m128653q()));
            sb.append("\"");
        }
        if (m128649m() != null) {
            sb.append(" chid=\"");
            sb.append(n2r0.m161249b(m128649m()));
            sb.append("\"");
        }
        if (this.f62617p != null) {
            sb.append(" type=\"");
            sb.append(this.f62617p);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f62618q != null) {
            sb.append("<status>");
            sb.append(n2r0.m161249b(this.f62618q));
            sb.append("</status>");
        }
        if (this.f62619r != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.f62619r);
            sb.append("</priority>");
        }
        a aVar = this.f62620s;
        if (aVar != null && aVar != a.available) {
            sb.append("<show>");
            sb.append(this.f62620s);
            sb.append("</show>");
        }
        sb.append(m128657u());
        C14934k c14934kM128640b = m128640b();
        if (c14934kM128640b != null) {
            sb.append(c14934kM128640b.m87432b());
        }
        sb.append("</presence>");
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public void m86750y(int i) {
        if (i < -128 || i > 128) {
            i2r0.m138234a("Priority value ", i, " is not valid. Valid range is -128 through 128.");
        } else {
            this.f62619r = i;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m86751z(a aVar) {
        this.f62620s = aVar;
    }

    public C14886fq(b bVar) {
        this.f62617p = b.available;
        this.f62618q = null;
        this.f62619r = Integer.MIN_VALUE;
        this.f62620s = null;
        m86746A(bVar);
    }
}
