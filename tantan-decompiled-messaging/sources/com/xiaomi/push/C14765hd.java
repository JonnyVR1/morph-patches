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

/* JADX INFO: renamed from: com.xiaomi.push.hd */
/* JADX INFO: loaded from: classes2.dex */
public class C14765hd implements InterfaceC14777hq<C14765hd, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public List<C14749go> f62360a;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62359a = new tuq0("XmPushActionNormalConfig");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62358a = new guq0("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14765hd c14765hd) {
        int iM118196g;
        if (!getClass().equals(c14765hd.getClass())) {
            return getClass().getName().compareTo(c14765hd.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85939a()).compareTo(Boolean.valueOf(c14765hd.m85939a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m85939a() || (iM118196g = euq0.m118196g(this.f62360a, c14765hd.f62360a)) == 0) {
            return 0;
        }
        return iM118196g;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85938a();
        quq0Var.mo86237v(f62359a);
        if (this.f62360a != null) {
            quq0Var.mo86234s(f62358a);
            quq0Var.mo86235t(new huq0((byte) 12, this.f62360a.size()));
            Iterator<C14749go> it = this.f62360a.iterator();
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
        if (obj != null && (obj instanceof C14765hd)) {
            return m85940a((C14765hd) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(normalConfigs:");
        List<C14749go> list = this.f62360a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m85939a() {
        return this.f62360a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85940a(C14765hd c14765hd) {
        if (c14765hd == null) {
            return false;
        }
        boolean zM85939a = m85939a();
        boolean zM85939a2 = c14765hd.m85939a();
        if (zM85939a || zM85939a2) {
            return zM85939a && zM85939a2 && this.f62360a.equals(c14765hd.f62360a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public List<C14749go> m85937a() {
        return this.f62360a;
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
                m85938a();
                return;
            }
            if (guq0VarMo86222g.f104458c != 1) {
                ruq0.m181208a(quq0Var, b);
            } else if (b == 15) {
                huq0 huq0VarMo86223h = quq0Var.mo86223h();
                this.f62360a = new ArrayList(huq0VarMo86223h.f109582b);
                for (int i = 0; i < huq0VarMo86223h.f109582b; i++) {
                    C14749go c14749go = new C14749go();
                    c14749go.mo85534a(quq0Var);
                    this.f62360a.add(c14749go);
                }
                quq0Var.mo86211G();
            } else {
                ruq0.m181208a(quq0Var, b);
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85938a() throws C14781ib {
        if (this.f62360a != null) {
            return;
        }
        throw new C14781ib("Required field 'normalConfigs' was not present! Struct: " + toString());
    }
}
