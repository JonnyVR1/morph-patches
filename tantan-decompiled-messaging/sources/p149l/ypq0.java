package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ypq0 extends yqq0 {

    /* JADX INFO: renamed from: a */
    private boolean f199476a;

    /* JADX INFO: renamed from: c */
    private boolean f199478c;

    /* JADX INFO: renamed from: e */
    private boolean f199480e;

    /* JADX INFO: renamed from: g */
    private boolean f199482g;

    /* JADX INFO: renamed from: b */
    private int f199477b = 0;

    /* JADX INFO: renamed from: d */
    private boolean f199479d = false;

    /* JADX INFO: renamed from: f */
    private int f199481f = 0;

    /* JADX INFO: renamed from: h */
    private boolean f199483h = false;

    /* JADX INFO: renamed from: i */
    private List<String> f199484i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: j */
    private int f199485j = -1;

    /* JADX INFO: renamed from: o */
    public static ypq0 m215649o(byte[] bArr) {
        return (ypq0) new ypq0().m215757c(bArr);
    }

    /* JADX INFO: renamed from: r */
    public static ypq0 m215650r(mlq0 mlq0Var) {
        return new ypq0().mo98327b(mlq0Var);
    }

    /* JADX INFO: renamed from: A */
    public boolean m215651A() {
        return this.f199482g;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f199485j < 0) {
            mo98329i();
        }
        return this.f199485j;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m215657p()) {
            c14729c.m85495M(1, m215661u());
        }
        if (m215662v()) {
            c14729c.m85511y(2, m215660t());
        }
        if (m215664x()) {
            c14729c.m85506t(3, m215663w());
        }
        if (m215651A()) {
            c14729c.m85511y(4, m215666z());
        }
        Iterator<String> it = m215652j().iterator();
        while (it.hasNext()) {
            c14729c.m85508v(5, it.next());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85480j = 0;
        int iM85465H = m215657p() ? C14729c.m85465H(1, m215661u()) : 0;
        if (m215662v()) {
            iM85465H += C14729c.m85478h(2, m215660t());
        }
        if (m215664x()) {
            iM85465H += C14729c.m85473c(3, m215663w());
        }
        if (m215651A()) {
            iM85465H += C14729c.m85478h(4, m215666z());
        }
        Iterator<String> it = m215652j().iterator();
        while (it.hasNext()) {
            iM85480j += C14729c.m85480j(it.next());
        }
        int size = iM85465H + iM85480j + m215652j().size();
        this.f199485j = size;
        return size;
    }

    /* JADX INFO: renamed from: j */
    public List<String> m215652j() {
        return this.f199484i;
    }

    /* JADX INFO: renamed from: k */
    public ypq0 m215653k(int i) {
        this.f199476a = true;
        this.f199477b = i;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public ypq0 m215654l(String str) {
        str.getClass();
        if (this.f199484i.isEmpty()) {
            this.f199484i = new ArrayList();
        }
        this.f199484i.add(str);
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ypq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            if (iM155175b == 0) {
                break;
            }
            if (iM155175b == 8) {
                m215653k(mlq0Var.m155190u());
            } else if (iM155175b == 16) {
                m215656n(mlq0Var.m155183l());
            } else if (iM155175b == 24) {
                m215658q(mlq0Var.m155186p());
            } else if (iM155175b == 32) {
                m215659s(mlq0Var.m155183l());
            } else if (iM155175b == 42) {
                m215654l(mlq0Var.m155178e());
            } else if (!m215760g(mlq0Var, iM155175b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public ypq0 m215656n(boolean z) {
        this.f199478c = true;
        this.f199479d = z;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public boolean m215657p() {
        return this.f199476a;
    }

    /* JADX INFO: renamed from: q */
    public ypq0 m215658q(int i) {
        this.f199480e = true;
        this.f199481f = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public ypq0 m215659s(boolean z) {
        this.f199482g = true;
        this.f199483h = z;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public boolean m215660t() {
        return this.f199479d;
    }

    /* JADX INFO: renamed from: u */
    public int m215661u() {
        return this.f199477b;
    }

    /* JADX INFO: renamed from: v */
    public boolean m215662v() {
        return this.f199478c;
    }

    /* JADX INFO: renamed from: w */
    public int m215663w() {
        return this.f199481f;
    }

    /* JADX INFO: renamed from: x */
    public boolean m215664x() {
        return this.f199480e;
    }

    /* JADX INFO: renamed from: y */
    public int m215665y() {
        return this.f199484i.size();
    }

    /* JADX INFO: renamed from: z */
    public boolean m215666z() {
        return this.f199483h;
    }
}
