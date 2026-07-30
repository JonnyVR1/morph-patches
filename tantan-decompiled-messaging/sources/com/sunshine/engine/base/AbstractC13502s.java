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
import com.p046p1.mobile.putong.data.CreditScoreTaskType;
import com.sunshine.engine.base.AbstractC13484a;
import com.sunshine.engine.base.AbstractC13502s;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p149l.bp0;
import p149l.haj;
import p149l.m7r;
import p149l.wbr;
import p149l.xsi0;
import p149l.yy0;

/* JADX INFO: renamed from: com.sunshine.engine.base.s */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC13502s<T extends AbstractC13484a> extends wbr {

    /* JADX INFO: renamed from: g */
    public static final Handler f55682g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    protected View f55683c = null;

    /* JADX INFO: renamed from: d */
    protected yy0 f55684d = new yy0();

    /* JADX INFO: renamed from: e */
    public T f55685e = null;

    /* JADX INFO: renamed from: f */
    private List<String> f55686f = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m80967f(AbstractC13502s abstractC13502s, AbstractC13484a abstractC13484a) {
        if (abstractC13484a == null) {
            abstractC13502s.getClass();
        } else if (abstractC13484a.equals(abstractC13502s.f55685e)) {
            abstractC13502s.mo80972e();
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m80968m(View view, String str, String str2, String str3) {
        this.f55683c = view;
        if (this.f55685e != null) {
            return false;
        }
        m202581d(true);
        this.f55685e = (T) mo80974h(this, str, str2, str3);
        m80973g("buildEntity entity.hashCode()=" + this.f55685e.hashCode());
        m80969o();
        return true;
    }

    /* JADX INFO: renamed from: o */
    private void m80969o() {
        T t = this.f55685e;
        if (t != null) {
            yy0 yy0Var = t.f55661i;
            yy0 yy0Var2 = this.f55684d;
            yy0Var.f200689f = yy0Var2.f200689f;
            yy0Var.f200690g = yy0Var2.f200690g;
            yy0Var.f200685b = yy0Var2.f200685b;
            yy0Var.f200687d = yy0Var2.f200687d;
            m7r.m153385a(t);
        }
    }

    @Override // p149l.wbr
    /* JADX INFO: renamed from: a */
    public Activity mo80970a() {
        for (Context contextM80976j = m80976j(); contextM80976j instanceof ContextWrapper; contextM80976j = ((ContextWrapper) contextM80976j).getBaseContext()) {
            if (contextM80976j instanceof Activity) {
                return (Activity) contextM80976j;
            }
        }
        return null;
    }

    @Override // p149l.wbr
    /* JADX INFO: renamed from: b */
    public void mo80971b() {
        if (this.f55683c != null) {
            long jM210767h = xsi0.m210767h() - this.f185611b;
            View view = this.f55683c;
            if (jM210767h < 250) {
                view.postInvalidateDelayed(40L);
            } else {
                view.postInvalidate();
            }
        }
    }

    @Override // p149l.wbr
    /* JADX INFO: renamed from: e */
    public void mo80972e() {
        if (this.f55685e != null) {
            m80973g("stop entity.hashCode()=" + this.f55685e.hashCode());
            bp0.m103008f(this.f55685e);
            this.f55685e.m80950b();
            this.f55685e = null;
            mo80971b();
        }
        m202581d(false);
        this.f55683c = null;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC13502s m80973g(String str) {
        String str2;
        if (!xsi0.f194276a) {
            return this;
        }
        synchronized (this.f55686f) {
            try {
                if (this.f55686f.size() > 100) {
                    this.f55686f.clear();
                }
                List<String> list = this.f55686f;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    str2 = "";
                } else {
                    str2 = " in [" + Thread.currentThread().getName() + Constants.AES_SUFFIX;
                }
                sb.append(str2);
                xsi0.m210761b(list, sb.toString());
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public abstract T mo80974h(AbstractC13502s abstractC13502s, String str, String str2, String str3);

    /* JADX INFO: renamed from: i */
    public void m80975i(Canvas canvas) {
        if (this.f55685e == null || this.f55683c == null) {
            return;
        }
        DrawFilter drawFilter = canvas.getDrawFilter();
        C13501r.m80965e(canvas);
        if (this.f55685e.mo80952d(canvas, xsi0.m210767h()) && this.f185610a) {
            mo80971b();
        }
        canvas.setDrawFilter(drawFilter);
    }

    /* JADX INFO: renamed from: j */
    public Context m80976j() {
        View view = this.f55683c;
        if (view != null) {
            return view.getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m80977k() {
        if (xsi0.f194276a) {
            xsi0.m210760a(this.f55686f);
            m80978l(this.f55686f.toString());
            this.f55686f.clear();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m80978l(String str) {
    }

    /* JADX INFO: renamed from: n */
    public boolean m80979n(View view, String... strArr) {
        int length = strArr.length;
        if (length != 1) {
            if (length == 2) {
                return m80968m(view, strArr[0], strArr[1], null);
            }
            if (length != 3) {
                return false;
            }
            return m80968m(view, strArr[0], strArr[1], strArr[2]);
        }
        String str = strArr[0];
        if (str == null) {
            return false;
        }
        String str2 = File.separator;
        if (!str.endsWith(str2)) {
            str = str + str2;
        }
        return m80968m(view, str.concat("config.xml"), str.concat(CreditScoreTaskType.pic), null);
    }

    /* JADX INFO: renamed from: p */
    public void m80980p(int i, int i2, int i3, int i4) {
        yy0 yy0Var = this.f55684d;
        yy0Var.f200685b = i;
        yy0Var.f200687d = i2;
        yy0Var.f200689f = i3 - i;
        yy0Var.f200690g = i4 - i2;
        m80969o();
    }

    /* JADX INFO: renamed from: r */
    public void m80982r(final AbstractC13484a abstractC13484a) {
        f55682g.post(new Runnable() { // from class: l.bcl0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC13502s.m80967f(this.f74946a, abstractC13484a);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m80981q(haj<String> hajVar) {
    }
}
