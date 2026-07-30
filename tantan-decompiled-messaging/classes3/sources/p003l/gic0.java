package p003l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gic0 extends v7m {

    /* JADX INFO: renamed from: i */
    public fic0 f3885i;

    /* JADX INFO: renamed from: j */
    public kic0 f3886j;

    /* JADX INFO: renamed from: k */
    public mic0 f3887k;

    /* JADX INFO: renamed from: l */
    public eic0 f3888l;

    /* JADX INFO: renamed from: m */
    public List<u7m> f3889m;

    /* JADX INFO: renamed from: n */
    public float f3890n;

    /* JADX INFO: renamed from: o */
    public float f3891o;

    /* JADX INFO: renamed from: p */
    public float f3892p;

    /* JADX INFO: renamed from: q */
    public float f3893q;

    /* JADX INFO: renamed from: r */
    public float f3894r;

    public gic0(Context context) {
        super(context);
        m4544l();
    }

    /* JADX INFO: renamed from: l */
    private void m4544l() {
        this.f3885i = new fic0(m8300b());
        this.f3886j = new kic0(m8300b());
        this.f3887k = new mic0(m8300b());
        this.f3888l = new eic0(m8300b());
        ArrayList arrayList = new ArrayList();
        this.f3889m = arrayList;
        arrayList.add(this.f3885i);
        this.f3889m.add(this.f3886j);
        this.f3889m.add(this.f3887k);
        this.f3889m.add(this.f3888l);
        this.f3890n = m8299a(66);
        this.f3891o = m8299a(42);
        this.f3894r = m8299a(16);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: f */
    public void mo3836f(int i, int i2) {
        if (i == 0) {
            RectF rectF = this.f8231h;
            RectF rectF2 = this.f8230g;
            if (rectF != null) {
                rectF2.set(m8302d(rectF.left, this.f3890n, i2), m8302d(this.f8226c - this.f8231h.top, this.f3891o, i2), m8302d(this.f8231h.right, this.f3892p, i2), m8302d(this.f8226c - this.f8231h.bottom, this.f3893q, i2));
            } else {
                rectF2.set(this.f3890n, this.f3891o, this.f3892p, this.f3893q);
            }
        } else if (i == 1) {
            this.f8230g.set(this.f3890n + (((m8299a(42) * i2) * 0.4f) / 100.0f), this.f3891o, this.f3892p, this.f3893q);
        } else if (i == 2) {
            this.f8230g.set(m8302d(this.f3890n + (m8299a(42) * 0.4f), this.f8231h.left, i2), m8302d(this.f3891o, this.f8226c - this.f8231h.top, i2), m8302d(this.f3892p, this.f8231h.right, i2), m8302d(this.f3893q, this.f8226c - this.f8231h.bottom, i2));
        }
        m4548m();
        List<u7m> list = this.f3889m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo3836f(i, i2);
            }
        }
        super.mo3836f(i, i2);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: g */
    public void mo3837g(Canvas canvas, int i, int i2) {
        int iSave = canvas.save();
        RectF rectF = this.f8230g;
        canvas.translate(rectF.left, rectF.top);
        List<u7m> list = this.f3889m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo3837g(canvas, i, i2);
            }
        }
        canvas.restoreToCount(iSave);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: h */
    public void mo3838h(int i, int i2) {
        super.mo3838h(i, i2);
        this.f3892p = i - this.f3894r;
        this.f3893q = this.f3891o + m8299a(56);
        List<u7m> list = this.f3889m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo3838h(i, i2);
            }
        }
        m4548m();
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: i */
    public void mo4545i() {
        super.mo4545i();
        List<u7m> list = this.f3889m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo4545i();
            }
        }
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: j */
    public void mo4546j(RectF rectF) {
        super.mo4546j(rectF);
        List<u7m> list = this.f3889m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo4546j(rectF);
            }
        }
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: k */
    public void mo4547k(u1m u1mVar) {
        super.mo4547k(u1mVar);
        List<u7m> list = this.f3889m;
        if (list != null) {
            Iterator<u7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo4547k(this.f8229f);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4548m() {
        List<u7m> list = this.f3889m;
        if (list != null) {
            for (u7m u7mVar : list) {
                RectF rectF = this.f8230g;
                u7mVar.m8102m(0.0f, 0.0f, rectF.right - rectF.left, rectF.bottom - rectF.top);
            }
        }
    }
}
