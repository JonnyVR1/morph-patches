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

/* JADX INFO: renamed from: com.xiaomi.push.gy */
/* JADX INFO: loaded from: classes2.dex */
public class C14759gy implements InterfaceC14777hq<C14759gy, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public List<C14748gn> f62284a;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62283a = new tuq0("XmPushActionCollectData");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62282a = new guq0("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14759gy c14759gy) {
        int iM118196g;
        if (!getClass().equals(c14759gy.getClass())) {
            return getClass().getName().compareTo(c14759gy.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85847a()).compareTo(Boolean.valueOf(c14759gy.m85847a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m85847a() || (iM118196g = euq0.m118196g(this.f62284a, c14759gy.f62284a)) == 0) {
            return 0;
        }
        return iM118196g;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85846a();
        quq0Var.mo86237v(f62283a);
        if (this.f62284a != null) {
            quq0Var.mo86234s(f62282a);
            quq0Var.mo86235t(new huq0((byte) 12, this.f62284a.size()));
            Iterator<C14748gn> it = this.f62284a.iterator();
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
        if (obj != null && (obj instanceof C14759gy)) {
            return m85848a((C14759gy) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCollectData(dataCollectionItems:");
        List<C14748gn> list = this.f62284a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m85847a() {
        return this.f62284a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85848a(C14759gy c14759gy) {
        if (c14759gy == null) {
            return false;
        }
        boolean zM85847a = m85847a();
        boolean zM85847a2 = c14759gy.m85847a();
        if (zM85847a || zM85847a2) {
            return zM85847a && zM85847a2 && this.f62284a.equals(c14759gy.f62284a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public C14759gy m85845a(List<C14748gn> list) {
        this.f62284a = list;
        return this;
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
                m85846a();
                return;
            }
            if (guq0VarMo86222g.f104458c != 1) {
                ruq0.m181208a(quq0Var, b);
            } else if (b == 15) {
                huq0 huq0VarMo86223h = quq0Var.mo86223h();
                this.f62284a = new ArrayList(huq0VarMo86223h.f109582b);
                for (int i = 0; i < huq0VarMo86223h.f109582b; i++) {
                    C14748gn c14748gn = new C14748gn();
                    c14748gn.mo85534a(quq0Var);
                    this.f62284a.add(c14748gn);
                }
                quq0Var.mo86211G();
            } else {
                ruq0.m181208a(quq0Var, b);
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85846a() throws C14781ib {
        if (this.f62284a != null) {
            return;
        }
        throw new C14781ib("Required field 'dataCollectionItems' was not present! Struct: " + toString());
    }
}
