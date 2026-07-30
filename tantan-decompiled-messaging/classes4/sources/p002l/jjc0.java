package p002l;

import com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0005c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jjc0 {

    /* JADX INFO: renamed from: b */
    public String f13809b;

    /* JADX INFO: renamed from: c */
    public int f13810c;

    /* JADX INFO: renamed from: d */
    public int f13811d;

    /* JADX INFO: renamed from: f */
    public String f13813f;

    /* JADX INFO: renamed from: g */
    public int f13814g;

    /* JADX INFO: renamed from: h */
    public int f13815h;

    /* JADX INFO: renamed from: i */
    public float f13816i;

    /* JADX INFO: renamed from: j */
    public String f13817j;

    /* JADX INFO: renamed from: k */
    public int f13818k;

    /* JADX INFO: renamed from: l */
    public int f13819l;

    /* JADX INFO: renamed from: n */
    public int f13821n;

    /* JADX INFO: renamed from: o */
    public int f13822o;

    /* JADX INFO: renamed from: p */
    public AbstractC0005c f13823p;

    /* JADX INFO: renamed from: a */
    public int f13808a = -1;

    /* JADX INFO: renamed from: e */
    public int f13812e = -1;

    /* JADX INFO: renamed from: m */
    public boolean f13820m = false;

    /* JADX INFO: renamed from: q */
    public List<wgi0> f13824q = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m15971a(wgi0 wgi0Var) {
        this.f13824q.add(wgi0Var);
    }

    /* JADX INFO: renamed from: b */
    public void m15972b() {
        this.f13808a = -1;
        this.f13812e = -1;
        this.f13818k = -1;
        this.f13823p = null;
        if (this.f13824q.isEmpty()) {
            return;
        }
        Iterator<wgi0> it = this.f13824q.iterator();
        while (it.hasNext()) {
            it.next().m24598b();
        }
        this.f13824q.clear();
    }
}
