package p149l;

import com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8580c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jjc0 {

    /* JADX INFO: renamed from: b */
    public String f118258b;

    /* JADX INFO: renamed from: c */
    public int f118259c;

    /* JADX INFO: renamed from: d */
    public int f118260d;

    /* JADX INFO: renamed from: f */
    public String f118262f;

    /* JADX INFO: renamed from: g */
    public int f118263g;

    /* JADX INFO: renamed from: h */
    public int f118264h;

    /* JADX INFO: renamed from: i */
    public float f118265i;

    /* JADX INFO: renamed from: j */
    public String f118266j;

    /* JADX INFO: renamed from: k */
    public int f118267k;

    /* JADX INFO: renamed from: l */
    public int f118268l;

    /* JADX INFO: renamed from: n */
    public int f118270n;

    /* JADX INFO: renamed from: o */
    public int f118271o;

    /* JADX INFO: renamed from: p */
    public AbstractC8580c f118272p;

    /* JADX INFO: renamed from: a */
    public int f118257a = -1;

    /* JADX INFO: renamed from: e */
    public int f118261e = -1;

    /* JADX INFO: renamed from: m */
    public boolean f118269m = false;

    /* JADX INFO: renamed from: q */
    public List<wgi0> f118273q = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m141788a(wgi0 wgi0Var) {
        this.f118273q.add(wgi0Var);
    }

    /* JADX INFO: renamed from: b */
    public void m141789b() {
        this.f118257a = -1;
        this.f118261e = -1;
        this.f118267k = -1;
        this.f118272p = null;
        if (this.f118273q.isEmpty()) {
            return;
        }
        Iterator<wgi0> it = this.f118273q.iterator();
        while (it.hasNext()) {
            it.next().m203056b();
        }
        this.f118273q.clear();
    }
}
