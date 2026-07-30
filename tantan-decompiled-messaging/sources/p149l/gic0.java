package p149l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class gic0 extends v7m {

    /* JADX INFO: renamed from: i */
    public fic0 f102872i;

    /* JADX INFO: renamed from: j */
    public kic0 f102873j;

    /* JADX INFO: renamed from: k */
    public mic0 f102874k;

    /* JADX INFO: renamed from: l */
    public eic0 f102875l;

    /* JADX INFO: renamed from: m */
    public List<u7m> f102876m;

    /* JADX INFO: renamed from: n */
    public float f102877n;

    /* JADX INFO: renamed from: o */
    public float f102878o;

    /* JADX INFO: renamed from: p */
    public float f102879p;

    /* JADX INFO: renamed from: q */
    public float f102880q;

    /* JADX INFO: renamed from: r */
    public float f102881r;

    public gic0(Context context) {
        super(context);
        m126276l();
    }

    /* JADX INFO: renamed from: l */
    private void m126276l() {
        this.f102872i = new fic0(m197378b());
        this.f102873j = new kic0(m197378b());
        this.f102874k = new mic0(m197378b());
        this.f102875l = new eic0(m197378b());
        ArrayList arrayList = new ArrayList();
        this.f102876m = arrayList;
        arrayList.add(this.f102872i);
        this.f102876m.add(this.f102873j);
        this.f102876m.add(this.f102874k);
        this.f102876m.add(this.f102875l);
        this.f102877n = m197377a(66);
        this.f102878o = m197377a(42);
        this.f102881r = m197377a(16);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: f */
    public void mo116668f(int i, int i2) {
        if (i == 0) {
            RectF rectF = this.f180404h;
            RectF rectF2 = this.f180403g;
            if (rectF != null) {
                rectF2.set(m197380d(rectF.left, this.f102877n, i2), m197380d(this.f180399c - this.f180404h.top, this.f102878o, i2), m197380d(this.f180404h.right, this.f102879p, i2), m197380d(this.f180399c - this.f180404h.bottom, this.f102880q, i2));
            } else {
                rectF2.set(this.f102877n, this.f102878o, this.f102879p, this.f102880q);
            }
        } else if (i == 1) {
            this.f180403g.set(this.f102877n + (((m197377a(42) * i2) * 0.4f) / 100.0f), this.f102878o, this.f102879p, this.f102880q);
        } else if (i == 2) {
            this.f180403g.set(m197380d(this.f102877n + (m197377a(42) * 0.4f), this.f180404h.left, i2), m197380d(this.f102878o, this.f180399c - this.f180404h.top, i2), m197380d(this.f102879p, this.f180404h.right, i2), m197380d(this.f102880q, this.f180399c - this.f180404h.bottom, i2));
        }
        m126280m();
        List<u7m> list = this.f102876m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo116668f(i, i2);
            }
        }
        super.mo116668f(i, i2);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: g */
    public void mo116669g(Canvas canvas, int i, int i2) {
        int iSave = canvas.save();
        RectF rectF = this.f180403g;
        canvas.translate(rectF.left, rectF.top);
        List<u7m> list = this.f102876m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo116669g(canvas, i, i2);
            }
        }
        canvas.restoreToCount(iSave);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: h */
    public void mo116670h(int i, int i2) {
        super.mo116670h(i, i2);
        this.f102879p = i - this.f102881r;
        this.f102880q = this.f102878o + m197377a(56);
        List<u7m> list = this.f102876m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo116670h(i, i2);
            }
        }
        m126280m();
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: i */
    public void mo126277i() {
        super.mo126277i();
        List<u7m> list = this.f102876m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo126277i();
            }
        }
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: j */
    public void mo126278j(RectF rectF) {
        super.mo126278j(rectF);
        List<u7m> list = this.f102876m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo126278j(rectF);
            }
        }
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: k */
    public void mo126279k(u1m u1mVar) {
        super.mo126279k(u1mVar);
        List<u7m> list = this.f102876m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo126279k(this.f180402f);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m126280m() {
        List<u7m> list = this.f102876m;
        if (list != null) {
            for (u7m u7mVar : list) {
                RectF rectF = this.f180403g;
                u7mVar.m192144m(0.0f, 0.0f, rectF.right - rectF.left, rectF.bottom - rectF.top);
            }
        }
    }
}
