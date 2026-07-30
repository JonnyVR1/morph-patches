package p153l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class nqc0 extends lam {

    /* JADX INFO: renamed from: i */
    public mqc0 f143211i;

    /* JADX INFO: renamed from: j */
    public rqc0 f143212j;

    /* JADX INFO: renamed from: k */
    public tqc0 f143213k;

    /* JADX INFO: renamed from: l */
    public lqc0 f143214l;

    /* JADX INFO: renamed from: m */
    public List<kam> f143215m;

    /* JADX INFO: renamed from: n */
    public float f143216n;

    /* JADX INFO: renamed from: o */
    public float f143217o;

    /* JADX INFO: renamed from: p */
    public float f143218p;

    /* JADX INFO: renamed from: q */
    public float f143219q;

    /* JADX INFO: renamed from: r */
    public float f143220r;

    public nqc0(Context context) {
        super(context);
        m164304l();
    }

    /* JADX INFO: renamed from: l */
    private void m164304l() {
        this.f143211i = new mqc0(m153507b());
        this.f143212j = new rqc0(m153507b());
        this.f143213k = new tqc0(m153507b());
        this.f143214l = new lqc0(m153507b());
        ArrayList arrayList = new ArrayList();
        this.f143215m = arrayList;
        arrayList.add(this.f143211i);
        this.f143215m.add(this.f143212j);
        this.f143215m.add(this.f143213k);
        this.f143215m.add(this.f143214l);
        this.f143216n = m153506a(66);
        this.f143217o = m153506a(42);
        this.f143220r = m153506a(16);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: f */
    public void mo153511f(int i, int i2) {
        if (i == 0) {
            RectF rectF = this.f130717h;
            RectF rectF2 = this.f130716g;
            if (rectF != null) {
                rectF2.set(m153509d(rectF.left, this.f143216n, i2), m153509d(this.f130712c - this.f130717h.top, this.f143217o, i2), m153509d(this.f130717h.right, this.f143218p, i2), m153509d(this.f130712c - this.f130717h.bottom, this.f143219q, i2));
            } else {
                rectF2.set(this.f143216n, this.f143217o, this.f143218p, this.f143219q);
            }
        } else if (i == 1) {
            this.f130716g.set(this.f143216n + (((m153506a(42) * i2) * 0.4f) / 100.0f), this.f143217o, this.f143218p, this.f143219q);
        } else if (i == 2) {
            this.f130716g.set(m153509d(this.f143216n + (m153506a(42) * 0.4f), this.f130717h.left, i2), m153509d(this.f143217o, this.f130712c - this.f130717h.top, i2), m153509d(this.f143218p, this.f130717h.right, i2), m153509d(this.f143219q, this.f130712c - this.f130717h.bottom, i2));
        }
        m164305m();
        List<kam> list = this.f143215m;
        if (list != null) {
            Iterator<kam> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo153511f(i, i2);
            }
        }
        super.mo153511f(i, i2);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: g */
    public void mo153512g(Canvas canvas, int i, int i2) {
        int iSave = canvas.save();
        RectF rectF = this.f130716g;
        canvas.translate(rectF.left, rectF.top);
        List<kam> list = this.f143215m;
        if (list != null) {
            Iterator<kam> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo153512g(canvas, i, i2);
            }
        }
        canvas.restoreToCount(iSave);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: h */
    public void mo153513h(int i, int i2) {
        super.mo153513h(i, i2);
        this.f143218p = i - this.f143220r;
        this.f143219q = this.f143217o + m153506a(56);
        List<kam> list = this.f143215m;
        if (list != null) {
            Iterator<kam> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo153513h(i, i2);
            }
        }
        m164305m();
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: i */
    public void mo153514i() {
        super.mo153514i();
        List<kam> list = this.f143215m;
        if (list != null) {
            Iterator<kam> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo153514i();
            }
        }
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: j */
    public void mo153515j(RectF rectF) {
        super.mo153515j(rectF);
        List<kam> list = this.f143215m;
        if (list != null) {
            Iterator<kam> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo153515j(rectF);
            }
        }
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: k */
    public void mo153516k(n4m n4mVar) {
        super.mo153516k(n4mVar);
        List<kam> list = this.f143215m;
        if (list != null) {
            Iterator<kam> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo153516k(this.f130715f);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m164305m() {
        List<kam> list = this.f143215m;
        if (list != null) {
            for (kam kamVar : list) {
                RectF rectF = this.f130716g;
                kamVar.m148991m(0.0f, 0.0f, rectF.right - rectF.left, rectF.bottom - rectF.top);
            }
        }
    }
}
