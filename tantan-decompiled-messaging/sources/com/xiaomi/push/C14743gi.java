package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.euq0;
import p149l.guq0;
import p149l.huq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.gi */
/* JADX INFO: loaded from: classes2.dex */
public class C14743gi implements InterfaceC14777hq<C14743gi, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public List<C14744gj> f61865a;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f61864a = new tuq0("ClientUploadData");

    /* JADX INFO: renamed from: a */
    private static final guq0 f61863a = new guq0("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14743gi c14743gi) {
        int iM118196g;
        if (!getClass().equals(c14743gi.getClass())) {
            return getClass().getName().compareTo(c14743gi.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85608a()).compareTo(Boolean.valueOf(c14743gi.m85608a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m85608a() || (iM118196g = euq0.m118196g(this.f61865a, c14743gi.f61865a)) == 0) {
            return 0;
        }
        return iM118196g;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85606a();
        quq0Var.mo86237v(f61864a);
        if (this.f61865a != null) {
            quq0Var.mo86234s(f61863a);
            quq0Var.mo86235t(new huq0((byte) 12, this.f61865a.size()));
            Iterator<C14744gj> it = this.f61865a.iterator();
            while (it.hasNext()) {
                it.next().mo85540b(quq0Var);
            }
            quq0Var.mo86207C();
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14743gi)) {
            return m85609a((C14743gi) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(uploadDataItems:");
        List<C14744gj> list = this.f61865a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m85607a(C14744gj c14744gj) {
        if (this.f61865a == null) {
            this.f61865a = new ArrayList();
        }
        this.f61865a.add(c14744gj);
    }

    /* JADX INFO: renamed from: a */
    public boolean m85608a() {
        return this.f61865a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85609a(C14743gi c14743gi) {
        if (c14743gi == null) {
            return false;
        }
        boolean zM85608a = m85608a();
        boolean zM85608a2 = c14743gi.m85608a();
        if (zM85608a || zM85608a2) {
            return zM85608a && zM85608a2 && this.f61865a.equals(c14743gi.f61865a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m85604a() {
        List<C14744gj> list = this.f61865a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: a */
    public void mo85534a(quq0 quq0Var) throws C14781ib {
        quq0Var.mo86226k();
        while (true) {
            guq0 guq0VarMo86222g = quq0Var.mo86222g();
            byte b = guq0VarMo86222g.f104457b;
            if (b == 0) {
                quq0Var.mo86208D();
                m85606a();
                return;
            }
            if (guq0VarMo86222g.f104458c != 1) {
                ruq0.m181208a(quq0Var, b);
            } else if (b == 15) {
                huq0 huq0VarMo86223h = quq0Var.mo86223h();
                this.f61865a = new ArrayList(huq0VarMo86223h.f109582b);
                for (int i = 0; i < huq0VarMo86223h.f109582b; i++) {
                    C14744gj c14744gj = new C14744gj();
                    c14744gj.mo85534a(quq0Var);
                    this.f61865a.add(c14744gj);
                }
                quq0Var.mo86211G();
            } else {
                ruq0.m181208a(quq0Var, b);
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85606a() throws C14781ib {
        if (this.f61865a != null) {
            return;
        }
        throw new C14781ib("Required field 'uploadDataItems' was not present! Struct: " + toString());
    }
}
