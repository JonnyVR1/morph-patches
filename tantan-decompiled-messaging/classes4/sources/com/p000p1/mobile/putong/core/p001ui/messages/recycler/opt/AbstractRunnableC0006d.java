package com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.upk0;
import p002l.xmr;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class AbstractRunnableC0006d implements Runnable, Handler.Callback {

    /* JADX INFO: renamed from: e */
    public static AbstractC0005c f59e = new AbstractC0005c.a();

    /* JADX INFO: renamed from: f */
    public static AbstractC0005c f60f = new AbstractC0005c.d();

    /* JADX INFO: renamed from: g */
    public static AbstractC0005c f61g = new AbstractC0005c.e();

    /* JADX INFO: renamed from: a */
    public View f62a;

    /* JADX INFO: renamed from: b */
    public AbstractC0005c f63b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC0005c> f64c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Handler f65d = new Handler(this);

    /* JADX INFO: renamed from: d */
    public boolean m129d(AbstractC0005c abstractC0005c, AbstractC0005c abstractC0005c2) {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m130e() {
        this.f62a.removeCallbacks(this);
        List<AbstractC0005c> list = this.f64c;
        if (list == null || list.size() <= 0) {
            this.f63b = null;
        } else {
            this.f62a.post(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean mo131g() {
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m132h(AbstractC0005c abstractC0005c) {
        m133i(abstractC0005c, null);
    }

    public boolean handleMessage(@NonNull Message message) {
        run();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m133i(AbstractC0005c abstractC0005c, e30<List<AbstractC0005c>> e30Var) {
        int iM134k = m134k(abstractC0005c);
        this.f64c.size();
        List<AbstractC0005c> list = this.f64c;
        if (iM134k == -1) {
            list.add(abstractC0005c);
        } else {
            list.set(iM134k, abstractC0005c);
        }
        if (this.f62a == null) {
            upk0.a("you must call ");
            return;
        }
        if (e30Var != null) {
            e30Var.call(this.f64c);
        }
        m130e();
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo93j(AbstractC0005c abstractC0005c);

    /* JADX INFO: renamed from: k */
    public final int m134k(AbstractC0005c abstractC0005c) {
        List<AbstractC0005c> list = this.f64c;
        if (list == null || list.size() <= 0) {
            return -1;
        }
        for (int i = 0; i < this.f64c.size(); i++) {
            if (this.f64c.get(i).getClass() == abstractC0005c.getClass()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public int m135l() {
        return this.f64c.size();
    }

    /* JADX INFO: renamed from: m */
    public void m136m(AbstractC0005c abstractC0005c) {
        List<AbstractC0005c> list = this.f64c;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<AbstractC0005c> it = this.f64c.iterator();
        while (it.hasNext()) {
            if (it.next().getClass() == abstractC0005c.getClass()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo94n(View view) {
        this.f62a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (mo131g()) {
            xmr.m26036c("开始执行任务 ");
            List<AbstractC0005c> list = this.f64c;
            if (list == null || list.size() <= 0) {
                return;
            }
            AbstractC0005c abstractC0005cRemove = this.f64c.remove(0);
            abstractC0005cRemove.mo127a();
            if (m129d(this.f63b, abstractC0005cRemove)) {
                this.f63b = abstractC0005cRemove;
                xmr.m26036c("开始执行 " + this.f63b.mo127a());
                mo93j(this.f63b);
            }
        }
    }
}
