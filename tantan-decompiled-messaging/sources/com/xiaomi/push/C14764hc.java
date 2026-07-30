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

/* JADX INFO: renamed from: com.xiaomi.push.hc */
/* JADX INFO: loaded from: classes2.dex */
public class C14764hc implements InterfaceC14777hq<C14764hc, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public List<C14751gq> f62357a;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62356a = new tuq0("XmPushActionCustomConfig");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62355a = new guq0("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14764hc c14764hc) {
        int iM118196g;
        if (!getClass().equals(c14764hc.getClass())) {
            return getClass().getName().compareTo(c14764hc.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85934a()).compareTo(Boolean.valueOf(c14764hc.m85934a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m85934a() || (iM118196g = euq0.m118196g(this.f62357a, c14764hc.f62357a)) == 0) {
            return 0;
        }
        return iM118196g;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85933a();
        quq0Var.mo86237v(f62356a);
        if (this.f62357a != null) {
            quq0Var.mo86234s(f62355a);
            quq0Var.mo86235t(new huq0((byte) 12, this.f62357a.size()));
            Iterator<C14751gq> it = this.f62357a.iterator();
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
        if (obj != null && (obj instanceof C14764hc)) {
            return m85935a((C14764hc) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(customConfigs:");
        List<C14751gq> list = this.f62357a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m85934a() {
        return this.f62357a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85935a(C14764hc c14764hc) {
        if (c14764hc == null) {
            return false;
        }
        boolean zM85934a = m85934a();
        boolean zM85934a2 = c14764hc.m85934a();
        if (zM85934a || zM85934a2) {
            return zM85934a && zM85934a2 && this.f62357a.equals(c14764hc.f62357a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public List<C14751gq> m85932a() {
        return this.f62357a;
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
                m85933a();
                return;
            }
            if (guq0VarMo86222g.f104458c != 1) {
                ruq0.m181208a(quq0Var, b);
            } else if (b == 15) {
                huq0 huq0VarMo86223h = quq0Var.mo86223h();
                this.f62357a = new ArrayList(huq0VarMo86223h.f109582b);
                for (int i = 0; i < huq0VarMo86223h.f109582b; i++) {
                    C14751gq c14751gq = new C14751gq();
                    c14751gq.mo85534a(quq0Var);
                    this.f62357a.add(c14751gq);
                }
                quq0Var.mo86211G();
            } else {
                ruq0.m181208a(quq0Var, b);
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85933a() throws C14781ib {
        if (this.f62357a != null) {
            return;
        }
        throw new C14781ib("Required field 'customConfigs' was not present! Struct: " + toString());
    }
}
