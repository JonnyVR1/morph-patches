package com.xiaomi.push;

import android.os.Bundle;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.HashMap;
import java.util.Map;
import p149l.atq0;
import p149l.htq0;

/* JADX INFO: renamed from: com.xiaomi.push.j */
/* JADX INFO: loaded from: classes2.dex */
public class C14785j extends atq0 {

    /* JADX INFO: renamed from: p */
    private a f62683p;

    /* JADX INFO: renamed from: q */
    private final Map<String, String> f62684q;

    /* JADX INFO: renamed from: com.xiaomi.push.j$a */
    public static class a {

        /* JADX INFO: renamed from: b */
        public static final a f62685b = new a("get");

        /* JADX INFO: renamed from: c */
        public static final a f62686c = new a("set");

        /* JADX INFO: renamed from: d */
        public static final a f62687d = new a(LovePlanetStage.result);

        /* JADX INFO: renamed from: e */
        public static final a f62688e = new a("error");

        /* JADX INFO: renamed from: f */
        public static final a f62689f = new a(CommandMessage.COMMAND);

        /* JADX INFO: renamed from: a */
        private String f62690a;

        private a(String str) {
            this.f62690a = str;
        }

        /* JADX INFO: renamed from: a */
        public static a m86258a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            a aVar = f62685b;
            if (aVar.toString().equals(lowerCase)) {
                return aVar;
            }
            a aVar2 = f62686c;
            if (aVar2.toString().equals(lowerCase)) {
                return aVar2;
            }
            a aVar3 = f62688e;
            if (aVar3.toString().equals(lowerCase)) {
                return aVar3;
            }
            a aVar4 = f62687d;
            if (aVar4.toString().equals(lowerCase)) {
                return aVar4;
            }
            a aVar5 = f62689f;
            if (aVar5.toString().equals(lowerCase)) {
                return aVar5;
            }
            return null;
        }

        public String toString() {
            return this.f62690a;
        }
    }

    public C14785j(Bundle bundle) {
        super(bundle);
        this.f62683p = a.f62685b;
        this.f62684q = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.f62683p = a.m86258a(bundle.getString("ext_iq_type"));
        }
    }

    /* JADX INFO: renamed from: A */
    public synchronized void m86254A(Map<String, String> map) {
        this.f62684q.putAll(map);
    }

    /* JADX INFO: renamed from: B */
    public String mo86255B() {
        return null;
    }

    @Override // p149l.atq0
    /* JADX INFO: renamed from: a */
    public Bundle mo85577a() {
        Bundle bundleMo85577a = super.mo85577a();
        a aVar = this.f62683p;
        if (aVar != null) {
            bundleMo85577a.putString("ext_iq_type", aVar.toString());
        }
        return bundleMo85577a;
    }

    @Override // p149l.atq0
    /* JADX INFO: renamed from: d */
    public String mo85578d() {
        StringBuilder sb = new StringBuilder("<iq ");
        if (m98866l() != null) {
            sb.append("id=\"" + m98866l() + "\" ");
        }
        if (m98869o() != null) {
            sb.append("to=\"");
            sb.append(htq0.m132933b(m98869o()));
            sb.append("\" ");
        }
        if (m98871q() != null) {
            sb.append("from=\"");
            sb.append(htq0.m132933b(m98871q()));
            sb.append("\" ");
        }
        if (m98867m() != null) {
            sb.append("chid=\"");
            sb.append(htq0.m132933b(m98867m()));
            sb.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.f62684q.entrySet()) {
            sb.append(htq0.m132933b(entry.getKey()));
            sb.append("=\"");
            sb.append(htq0.m132933b(entry.getValue()));
            sb.append("\" ");
        }
        if (this.f62683p == null) {
            sb.append("type=\"get\">");
        } else {
            sb.append("type=\"");
            sb.append(m86256y());
            sb.append("\">");
        }
        String strMo86255B = mo86255B();
        if (strMo86255B != null) {
            sb.append(strMo86255B);
        }
        sb.append(m98875u());
        C14786k c14786kM98858b = m98858b();
        if (c14786kM98858b != null) {
            sb.append(c14786kM98858b.m86261b());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public a m86256y() {
        return this.f62683p;
    }

    /* JADX INFO: renamed from: z */
    public void m86257z(a aVar) {
        if (aVar == null) {
            this.f62683p = a.f62685b;
        } else {
            this.f62683p = aVar;
        }
    }

    public C14785j() {
        this.f62683p = a.f62685b;
        this.f62684q = new HashMap();
    }
}
