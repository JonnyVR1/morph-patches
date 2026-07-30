package com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.azk0;
import p153l.y20;
import p153l.yor;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.d */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC8744d implements Runnable, Handler.Callback {

    /* JADX INFO: renamed from: e */
    public static AbstractC8743c f33085e = new AbstractC8743c.a();

    /* JADX INFO: renamed from: f */
    public static AbstractC8743c f33086f = new AbstractC8743c.d();

    /* JADX INFO: renamed from: g */
    public static AbstractC8743c f33087g = new AbstractC8743c.e();

    /* JADX INFO: renamed from: a */
    public View f33088a;

    /* JADX INFO: renamed from: b */
    public AbstractC8743c f33089b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC8743c> f33090c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Handler f33091d = new Handler(this);

    /* JADX INFO: renamed from: d */
    public boolean m50898d(AbstractC8743c abstractC8743c, AbstractC8743c abstractC8743c2) {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m50899e() {
        this.f33088a.removeCallbacks(this);
        List<AbstractC8743c> list = this.f33090c;
        if (list == null || list.size() <= 0) {
            this.f33089b = null;
        } else {
            this.f33088a.post(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean mo50900g() {
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m50901h(AbstractC8743c abstractC8743c) {
        m50902i(abstractC8743c, null);
    }

    public boolean handleMessage(@NonNull Message message) {
        run();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m50902i(AbstractC8743c abstractC8743c, y20<List<AbstractC8743c>> y20Var) {
        int iM50903k = m50903k(abstractC8743c);
        this.f33090c.size();
        List<AbstractC8743c> list = this.f33090c;
        if (iM50903k == -1) {
            list.add(abstractC8743c);
        } else {
            list.set(iM50903k, abstractC8743c);
        }
        if (this.f33088a == null) {
            azk0.m101074a("you must call ");
            return;
        }
        if (y20Var != null) {
            y20Var.call(this.f33090c);
        }
        m50899e();
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo50862j(AbstractC8743c abstractC8743c);

    /* JADX INFO: renamed from: k */
    public final int m50903k(AbstractC8743c abstractC8743c) {
        List<AbstractC8743c> list = this.f33090c;
        if (list == null || list.size() <= 0) {
            return -1;
        }
        for (int i = 0; i < this.f33090c.size(); i++) {
            if (this.f33090c.get(i).getClass() == abstractC8743c.getClass()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public int m50904l() {
        return this.f33090c.size();
    }

    /* JADX INFO: renamed from: m */
    public void m50905m(AbstractC8743c abstractC8743c) {
        List<AbstractC8743c> list = this.f33090c;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<AbstractC8743c> it = this.f33090c.iterator();
        while (it.hasNext()) {
            if (it.next().getClass() == abstractC8743c.getClass()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo50863n(View view) {
        this.f33088a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (mo50900g()) {
            yor.m216992c("开始执行任务 ");
            List<AbstractC8743c> list = this.f33090c;
            if (list == null || list.size() <= 0) {
                return;
            }
            AbstractC8743c abstractC8743cRemove = this.f33090c.remove(0);
            abstractC8743cRemove.mo50896a();
            if (m50898d(this.f33089b, abstractC8743cRemove)) {
                this.f33089b = abstractC8743cRemove;
                yor.m216992c("开始执行 " + this.f33089b.mo50896a());
                mo50862j(this.f33089b);
            }
        }
    }
}
