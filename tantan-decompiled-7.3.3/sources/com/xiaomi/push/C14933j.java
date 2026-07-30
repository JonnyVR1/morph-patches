package com.xiaomi.push;

import android.os.Bundle;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.HashMap;
import java.util.Map;
import p153l.g2r0;
import p153l.n2r0;

/* JADX INFO: renamed from: com.xiaomi.push.j */
/* JADX INFO: loaded from: classes2.dex */
public class C14933j extends g2r0 {

    /* JADX INFO: renamed from: p */
    private a f63530p;

    /* JADX INFO: renamed from: q */
    private final Map<String, String> f63531q;

    /* JADX INFO: renamed from: com.xiaomi.push.j$a */
    public static class a {

        /* JADX INFO: renamed from: b */
        public static final a f63532b = new a("get");

        /* JADX INFO: renamed from: c */
        public static final a f63533c = new a("set");

        /* JADX INFO: renamed from: d */
        public static final a f63534d = new a(LovePlanetStage.result);

        /* JADX INFO: renamed from: e */
        public static final a f63535e = new a("error");

        /* JADX INFO: renamed from: f */
        public static final a f63536f = new a(CommandMessage.COMMAND);

        /* JADX INFO: renamed from: a */
        private String f63537a;

        private a(String str) {
            this.f63537a = str;
        }

        /* JADX INFO: renamed from: a */
        public static a m87429a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            a aVar = f63532b;
            if (aVar.toString().equals(lowerCase)) {
                return aVar;
            }
            a aVar2 = f63533c;
            if (aVar2.toString().equals(lowerCase)) {
                return aVar2;
            }
            a aVar3 = f63535e;
            if (aVar3.toString().equals(lowerCase)) {
                return aVar3;
            }
            a aVar4 = f63534d;
            if (aVar4.toString().equals(lowerCase)) {
                return aVar4;
            }
            a aVar5 = f63536f;
            if (aVar5.toString().equals(lowerCase)) {
                return aVar5;
            }
            return null;
        }

        public String toString() {
            return this.f63537a;
        }
    }

    public C14933j(Bundle bundle) {
        super(bundle);
        this.f63530p = a.f63532b;
        this.f63531q = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.f63530p = a.m87429a(bundle.getString("ext_iq_type"));
        }
    }

    /* JADX INFO: renamed from: A */
    public synchronized void m87425A(Map<String, String> map) {
        this.f63531q.putAll(map);
    }

    /* JADX INFO: renamed from: B */
    public String mo87426B() {
        return null;
    }

    @Override // p153l.g2r0
    /* JADX INFO: renamed from: a */
    public Bundle mo86748a() {
        Bundle bundleMo86748a = super.mo86748a();
        a aVar = this.f63530p;
        if (aVar != null) {
            bundleMo86748a.putString("ext_iq_type", aVar.toString());
        }
        return bundleMo86748a;
    }

    @Override // p153l.g2r0
    /* JADX INFO: renamed from: d */
    public String mo86749d() {
        StringBuilder sb = new StringBuilder("<iq ");
        if (m128648l() != null) {
            sb.append("id=\"" + m128648l() + "\" ");
        }
        if (m128651o() != null) {
            sb.append("to=\"");
            sb.append(n2r0.m161249b(m128651o()));
            sb.append("\" ");
        }
        if (m128653q() != null) {
            sb.append("from=\"");
            sb.append(n2r0.m161249b(m128653q()));
            sb.append("\" ");
        }
        if (m128649m() != null) {
            sb.append("chid=\"");
            sb.append(n2r0.m161249b(m128649m()));
            sb.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.f63531q.entrySet()) {
            sb.append(n2r0.m161249b(entry.getKey()));
            sb.append("=\"");
            sb.append(n2r0.m161249b(entry.getValue()));
            sb.append("\" ");
        }
        if (this.f63530p == null) {
            sb.append("type=\"get\">");
        } else {
            sb.append("type=\"");
            sb.append(m87427y());
            sb.append("\">");
        }
        String strMo87426B = mo87426B();
        if (strMo87426B != null) {
            sb.append(strMo87426B);
        }
        sb.append(m128657u());
        C14934k c14934kM128640b = m128640b();
        if (c14934kM128640b != null) {
            sb.append(c14934kM128640b.m87432b());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public a m87427y() {
        return this.f63530p;
    }

    /* JADX INFO: renamed from: z */
    public void m87428z(a aVar) {
        if (aVar == null) {
            this.f63530p = a.f63532b;
        } else {
            this.f63530p = aVar;
        }
    }

    public C14933j() {
        this.f63530p = a.f63532b;
        this.f63531q = new HashMap();
    }
}
