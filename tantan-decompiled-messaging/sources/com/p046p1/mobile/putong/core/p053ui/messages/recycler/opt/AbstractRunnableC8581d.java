package com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.e30;
import p149l.upk0;
import p149l.xmr;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.d */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC8581d implements Runnable, Handler.Callback {

    /* JADX INFO: renamed from: e */
    public static AbstractC8580c f32237e = new AbstractC8580c.a();

    /* JADX INFO: renamed from: f */
    public static AbstractC8580c f32238f = new AbstractC8580c.d();

    /* JADX INFO: renamed from: g */
    public static AbstractC8580c f32239g = new AbstractC8580c.e();

    /* JADX INFO: renamed from: a */
    public View f32240a;

    /* JADX INFO: renamed from: b */
    public AbstractC8580c f32241b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC8580c> f32242c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Handler f32243d = new Handler(this);

    /* JADX INFO: renamed from: d */
    public boolean m49715d(AbstractC8580c abstractC8580c, AbstractC8580c abstractC8580c2) {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m49716e() {
        this.f32240a.removeCallbacks(this);
        List<AbstractC8580c> list = this.f32242c;
        if (list == null || list.size() <= 0) {
            this.f32241b = null;
        } else {
            this.f32240a.post(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean mo49717g() {
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m49718h(AbstractC8580c abstractC8580c) {
        m49719i(abstractC8580c, null);
    }

    public boolean handleMessage(@NonNull Message message) {
        run();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m49719i(AbstractC8580c abstractC8580c, e30<List<AbstractC8580c>> e30Var) {
        int iM49720k = m49720k(abstractC8580c);
        this.f32242c.size();
        List<AbstractC8580c> list = this.f32242c;
        if (iM49720k == -1) {
            list.add(abstractC8580c);
        } else {
            list.set(iM49720k, abstractC8580c);
        }
        if (this.f32240a == null) {
            upk0.m194883a("you must call ");
            return;
        }
        if (e30Var != null) {
            e30Var.call(this.f32242c);
        }
        m49716e();
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo49679j(AbstractC8580c abstractC8580c);

    /* JADX INFO: renamed from: k */
    public final int m49720k(AbstractC8580c abstractC8580c) {
        List<AbstractC8580c> list = this.f32242c;
        if (list == null || list.size() <= 0) {
            return -1;
        }
        for (int i = 0; i < this.f32242c.size(); i++) {
            if (this.f32242c.get(i).getClass() == abstractC8580c.getClass()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public int m49721l() {
        return this.f32242c.size();
    }

    /* JADX INFO: renamed from: m */
    public void m49722m(AbstractC8580c abstractC8580c) {
        List<AbstractC8580c> list = this.f32242c;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<AbstractC8580c> it = this.f32242c.iterator();
        while (it.hasNext()) {
            if (it.next().getClass() == abstractC8580c.getClass()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo49680n(View view) {
        this.f32240a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (mo49717g()) {
            xmr.m210147c("开始执行任务 ");
            List<AbstractC8580c> list = this.f32242c;
            if (list == null || list.size() <= 0) {
                return;
            }
            AbstractC8580c abstractC8580cRemove = this.f32242c.remove(0);
            abstractC8580cRemove.mo49713a();
            if (m49715d(this.f32241b, abstractC8580cRemove)) {
                this.f32241b = abstractC8580cRemove;
                xmr.m210147c("开始执行 " + this.f32241b.mo49713a());
                mo49679j(this.f32241b);
            }
        }
    }
}
