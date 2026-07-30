package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ezq0 extends e0r0 {

    /* JADX INFO: renamed from: a */
    private boolean f96613a;

    /* JADX INFO: renamed from: c */
    private boolean f96615c;

    /* JADX INFO: renamed from: e */
    private boolean f96617e;

    /* JADX INFO: renamed from: g */
    private boolean f96619g;

    /* JADX INFO: renamed from: b */
    private int f96614b = 0;

    /* JADX INFO: renamed from: d */
    private boolean f96616d = false;

    /* JADX INFO: renamed from: f */
    private int f96618f = 0;

    /* JADX INFO: renamed from: h */
    private boolean f96620h = false;

    /* JADX INFO: renamed from: i */
    private List<String> f96621i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: j */
    private int f96622j = -1;

    /* JADX INFO: renamed from: o */
    public static ezq0 m123399o(byte[] bArr) {
        return (ezq0) new ezq0().m118918c(bArr);
    }

    /* JADX INFO: renamed from: r */
    public static ezq0 m123400r(suq0 suq0Var) {
        return new ezq0().mo118917b(suq0Var);
    }

    /* JADX INFO: renamed from: A */
    public boolean m123401A() {
        return this.f96619g;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f96622j < 0) {
            mo118924i();
        }
        return this.f96622j;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m123407p()) {
            c14877c.m86666M(1, m123411u());
        }
        if (m123412v()) {
            c14877c.m86682y(2, m123410t());
        }
        if (m123414x()) {
            c14877c.m86677t(3, m123413w());
        }
        if (m123401A()) {
            c14877c.m86682y(4, m123416z());
        }
        Iterator<String> it = m123402j().iterator();
        while (it.hasNext()) {
            c14877c.m86679v(5, it.next());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86651j = 0;
        int iM86636H = m123407p() ? C14877c.m86636H(1, m123411u()) : 0;
        if (m123412v()) {
            iM86636H += C14877c.m86649h(2, m123410t());
        }
        if (m123414x()) {
            iM86636H += C14877c.m86644c(3, m123413w());
        }
        if (m123401A()) {
            iM86636H += C14877c.m86649h(4, m123416z());
        }
        Iterator<String> it = m123402j().iterator();
        while (it.hasNext()) {
            iM86651j += C14877c.m86651j(it.next());
        }
        int size = iM86636H + iM86651j + m123402j().size();
        this.f96622j = size;
        return size;
    }

    /* JADX INFO: renamed from: j */
    public List<String> m123402j() {
        return this.f96621i;
    }

    /* JADX INFO: renamed from: k */
    public ezq0 m123403k(int i) {
        this.f96613a = true;
        this.f96614b = i;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public ezq0 m123404l(String str) {
        str.getClass();
        if (this.f96621i.isEmpty()) {
            this.f96621i = new ArrayList();
        }
        this.f96621i.add(str);
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ezq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            if (iM188076b == 0) {
                break;
            }
            if (iM188076b == 8) {
                m123403k(suq0Var.m188091u());
            } else if (iM188076b == 16) {
                m123406n(suq0Var.m188084l());
            } else if (iM188076b == 24) {
                m123408q(suq0Var.m188087p());
            } else if (iM188076b == 32) {
                m123409s(suq0Var.m188084l());
            } else if (iM188076b == 42) {
                m123404l(suq0Var.m188079e());
            } else if (!m118922g(suq0Var, iM188076b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public ezq0 m123406n(boolean z) {
        this.f96615c = true;
        this.f96616d = z;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public boolean m123407p() {
        return this.f96613a;
    }

    /* JADX INFO: renamed from: q */
    public ezq0 m123408q(int i) {
        this.f96617e = true;
        this.f96618f = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public ezq0 m123409s(boolean z) {
        this.f96619g = true;
        this.f96620h = z;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public boolean m123410t() {
        return this.f96616d;
    }

    /* JADX INFO: renamed from: u */
    public int m123411u() {
        return this.f96614b;
    }

    /* JADX INFO: renamed from: v */
    public boolean m123412v() {
        return this.f96615c;
    }

    /* JADX INFO: renamed from: w */
    public int m123413w() {
        return this.f96618f;
    }

    /* JADX INFO: renamed from: x */
    public boolean m123414x() {
        return this.f96617e;
    }

    /* JADX INFO: renamed from: y */
    public int m123415y() {
        return this.f96621i.size();
    }

    /* JADX INFO: renamed from: z */
    public boolean m123416z() {
        return this.f96620h;
    }
}
