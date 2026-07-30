package com.sunshine.engine.base;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.CreditScoreTaskType;
import com.sunshine.engine.base.AbstractC13647a;
import com.sunshine.engine.base.AbstractC13665s;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p153l.a2j0;
import p153l.bdj;
import p153l.fz0;
import p153l.n9r;
import p153l.xo0;
import p153l.ydr;

/* JADX INFO: renamed from: com.sunshine.engine.base.s */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC13665s<T extends AbstractC13647a> extends ydr {

    /* JADX INFO: renamed from: g */
    public static final Handler f56530g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    protected View f56531c = null;

    /* JADX INFO: renamed from: d */
    protected fz0 f56532d = new fz0();

    /* JADX INFO: renamed from: e */
    public T f56533e = null;

    /* JADX INFO: renamed from: f */
    private List<String> f56534f = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m82150f(AbstractC13665s abstractC13665s, AbstractC13647a abstractC13647a) {
        if (abstractC13647a == null) {
            abstractC13665s.getClass();
        } else if (abstractC13647a.equals(abstractC13665s.f56533e)) {
            abstractC13665s.mo82155e();
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m82151m(View view, String str, String str2, String str3) {
        this.f56531c = view;
        if (this.f56533e != null) {
            return false;
        }
        m215277d(true);
        this.f56533e = (T) mo82157h(this, str, str2, str3);
        m82156g("buildEntity entity.hashCode()=" + this.f56533e.hashCode());
        m82152o();
        return true;
    }

    /* JADX INFO: renamed from: o */
    private void m82152o() {
        T t = this.f56533e;
        if (t != null) {
            fz0 fz0Var = t.f56509i;
            fz0 fz0Var2 = this.f56532d;
            fz0Var.f101435f = fz0Var2.f101435f;
            fz0Var.f101436g = fz0Var2.f101436g;
            fz0Var.f101431b = fz0Var2.f101431b;
            fz0Var.f101433d = fz0Var2.f101433d;
            n9r.m162003a(t);
        }
    }

    @Override // p153l.ydr
    /* JADX INFO: renamed from: a */
    public Activity mo82153a() {
        for (Context contextM82159j = m82159j(); contextM82159j instanceof ContextWrapper; contextM82159j = ((ContextWrapper) contextM82159j).getBaseContext()) {
            if (contextM82159j instanceof Activity) {
                return (Activity) contextM82159j;
            }
        }
        return null;
    }

    @Override // p153l.ydr
    /* JADX INFO: renamed from: b */
    public void mo82154b() {
        if (this.f56531c != null) {
            long jM95705h = a2j0.m95705h() - this.f198624b;
            View view = this.f56531c;
            if (jM95705h < 250) {
                view.postInvalidateDelayed(40L);
            } else {
                view.postInvalidate();
            }
        }
    }

    @Override // p153l.ydr
    /* JADX INFO: renamed from: e */
    public void mo82155e() {
        if (this.f56533e != null) {
            m82156g("stop entity.hashCode()=" + this.f56533e.hashCode());
            xo0.m212447f(this.f56533e);
            this.f56533e.m82133b();
            this.f56533e = null;
            mo82154b();
        }
        m215277d(false);
        this.f56531c = null;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC13665s m82156g(String str) {
        String str2;
        if (!a2j0.f68006a) {
            return this;
        }
        synchronized (this.f56534f) {
            try {
                if (this.f56534f.size() > 100) {
                    this.f56534f.clear();
                }
                List<String> list = this.f56534f;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    str2 = "";
                } else {
                    str2 = " in [" + Thread.currentThread().getName() + Constants.AES_SUFFIX;
                }
                sb.append(str2);
                a2j0.m95699b(list, sb.toString());
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public abstract T mo82157h(AbstractC13665s abstractC13665s, String str, String str2, String str3);

    /* JADX INFO: renamed from: i */
    public void m82158i(Canvas canvas) {
        if (this.f56533e == null || this.f56531c == null) {
            return;
        }
        DrawFilter drawFilter = canvas.getDrawFilter();
        C13664r.m82148e(canvas);
        if (this.f56533e.mo82135d(canvas, a2j0.m95705h()) && this.f198623a) {
            mo82154b();
        }
        canvas.setDrawFilter(drawFilter);
    }

    /* JADX INFO: renamed from: j */
    public Context m82159j() {
        View view = this.f56531c;
        if (view != null) {
            return view.getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m82160k() {
        if (a2j0.f68006a) {
            a2j0.m95698a(this.f56534f);
            m82161l(this.f56534f.toString());
            this.f56534f.clear();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m82161l(String str) {
    }

    /* JADX INFO: renamed from: n */
    public boolean m82162n(View view, String... strArr) {
        int length = strArr.length;
        if (length != 1) {
            if (length == 2) {
                return m82151m(view, strArr[0], strArr[1], null);
            }
            if (length != 3) {
                return false;
            }
            return m82151m(view, strArr[0], strArr[1], strArr[2]);
        }
        String str = strArr[0];
        if (str == null) {
            return false;
        }
        String str2 = File.separator;
        if (!str.endsWith(str2)) {
            str = str + str2;
        }
        return m82151m(view, str.concat("config.xml"), str.concat(CreditScoreTaskType.pic), null);
    }

    /* JADX INFO: renamed from: p */
    public void m82163p(int i, int i2, int i3, int i4) {
        fz0 fz0Var = this.f56532d;
        fz0Var.f101431b = i;
        fz0Var.f101433d = i2;
        fz0Var.f101435f = i3 - i;
        fz0Var.f101436g = i4 - i2;
        m82152o();
    }

    /* JADX INFO: renamed from: r */
    public void m82165r(final AbstractC13647a abstractC13647a) {
        f56530g.post(new Runnable() { // from class: l.fll0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC13665s.m82150f(this.f99673a, abstractC13647a);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m82164q(bdj<String> bdjVar) {
    }
}
