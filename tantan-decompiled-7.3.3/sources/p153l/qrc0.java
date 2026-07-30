package p153l;

import com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8743c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class qrc0 {

    /* JADX INFO: renamed from: b */
    public String f159088b;

    /* JADX INFO: renamed from: c */
    public int f159089c;

    /* JADX INFO: renamed from: d */
    public int f159090d;

    /* JADX INFO: renamed from: f */
    public String f159092f;

    /* JADX INFO: renamed from: g */
    public int f159093g;

    /* JADX INFO: renamed from: h */
    public int f159094h;

    /* JADX INFO: renamed from: i */
    public float f159095i;

    /* JADX INFO: renamed from: j */
    public String f159096j;

    /* JADX INFO: renamed from: k */
    public int f159097k;

    /* JADX INFO: renamed from: l */
    public int f159098l;

    /* JADX INFO: renamed from: n */
    public int f159100n;

    /* JADX INFO: renamed from: o */
    public int f159101o;

    /* JADX INFO: renamed from: p */
    public AbstractC8743c f159102p;

    /* JADX INFO: renamed from: a */
    public int f159087a = -1;

    /* JADX INFO: renamed from: e */
    public int f159091e = -1;

    /* JADX INFO: renamed from: m */
    public boolean f159099m = false;

    /* JADX INFO: renamed from: q */
    public List<wpi0> f159103q = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m177534a(wpi0 wpi0Var) {
        this.f159103q.add(wpi0Var);
    }

    /* JADX INFO: renamed from: b */
    public void m177535b() {
        this.f159087a = -1;
        this.f159091e = -1;
        this.f159097k = -1;
        this.f159102p = null;
        if (this.f159103q.isEmpty()) {
            return;
        }
        Iterator<wpi0> it = this.f159103q.iterator();
        while (it.hasNext()) {
            it.next().m207461b();
        }
        this.f159103q.clear();
    }
}
