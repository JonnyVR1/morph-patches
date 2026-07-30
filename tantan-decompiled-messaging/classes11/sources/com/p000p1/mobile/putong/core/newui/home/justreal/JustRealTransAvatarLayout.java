package com.p000p1.mobile.putong.core.newui.home.justreal;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.djj;
import l.e30;
import l.ejj;
import l.mkd0;
import l.qib0;
import l.t100;
import l.xaj0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class JustRealTransAvatarLayout extends FrameLayout implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public List<C0189a> f1997a;

    /* JADX INFO: renamed from: b */
    public Context f1998b;

    /* JADX INFO: renamed from: c */
    public PathInterpolator f1999c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealTransAvatarLayout$a */
    public static class C0189a {

        /* JADX INFO: renamed from: a */
        public User f2000a;

        /* JADX INFO: renamed from: b */
        public SimpleDraweeView f2001b;

        /* JADX INFO: renamed from: d */
        public int f2003d;

        /* JADX INFO: renamed from: e */
        public int f2004e;

        /* JADX INFO: renamed from: f */
        public int f2005f;

        /* JADX INFO: renamed from: g */
        public int f2006g;

        /* JADX INFO: renamed from: h */
        public long f2007h;

        /* JADX INFO: renamed from: i */
        public long f2008i;

        /* JADX INFO: renamed from: c */
        public int f2002c = 0;

        /* JADX INFO: renamed from: j */
        public float f2009j = 0.43333f;

        public C0189a(Context context) {
            this.f2001b = new SimpleDraweeView(context);
            ejj ejjVar = new ejj(context.getResources());
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.s(t100.d(14.0f));
            roundingParams.v(true);
            djj djjVarA = ejjVar.K(roundingParams).a();
            djjVarA.y(0);
            this.f2001b.setHierarchy(djjVarA);
        }

        /* JADX INFO: renamed from: c */
        public void m2717c(User user) {
            this.f2000a = user;
            qib0.G.L0(this.f2001b, user.fp().profileSmall().formatted());
        }

        /* JADX INFO: renamed from: d */
        public void m2718d(int i, int i2, int i3, int i4, long j, long j2) {
            this.f2007h = j;
            this.f2008i = j2;
            this.f2003d = i;
            this.f2005f = i2;
            this.f2004e = i3;
            this.f2006g = i4;
        }
    }

    public JustRealTransAvatarLayout(@NonNull Context context) {
        super(context);
        this.f1997a = new ArrayList();
        this.f1999c = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
    }

    /* JADX INFO: renamed from: c */
    public final C0189a m2709c() {
        for (C0189a c0189a : this.f1997a) {
            if (c0189a.f2002c == 0) {
                return c0189a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m2710d(xaj0 xaj0Var) {
        m2714h(xaj0Var, true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        for (C0189a c0189a : this.f1997a) {
            if (c0189a.f2002c == 1) {
                z = true;
            } else {
                xdl0.M(c0189a.f2001b, false);
            }
        }
        for (C0189a c0189a2 : this.f1997a) {
            if (c0189a2.f2002c == 1) {
                long j2 = c0189a2.f2007h;
                long j3 = c0189a2.f2008i;
                float f = (jElapsedRealtime - j2) / (j3 - j2);
                if (jElapsedRealtime > j3) {
                    c0189a2.f2002c = 0;
                    CoreModule.c.z2.D3(c0189a2.f2000a);
                }
                float fMin = Math.min(1.0f, this.f1999c.getInterpolation(f));
                SimpleDraweeView simpleDraweeView = c0189a2.f2001b;
                int i = c0189a2.f2003d;
                simpleDraweeView.setTranslationX(i + ((c0189a2.f2004e - i) * fMin));
                SimpleDraweeView simpleDraweeView2 = c0189a2.f2001b;
                int i2 = c0189a2.f2005f;
                simpleDraweeView2.setTranslationY(i2 + ((c0189a2.f2006g - i2) * fMin));
                c0189a2.f2001b.setScaleX(1.0f - ((1.0f - c0189a2.f2009j) * fMin));
                c0189a2.f2001b.setScaleY(1.0f - ((1.0f - c0189a2.f2009j) * fMin));
            }
        }
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m2711e(xaj0 xaj0Var) {
        m2714h(xaj0Var, false);
    }

    /* JADX INFO: renamed from: f */
    public void m2712f(Act act) {
        this.f1998b = act;
        act.duringCreated(CoreModule.c.z2.Y).subscribe(mkd0.G(new e30() { // from class: l.atq
            public final void call(Object obj) {
                this.f9690a.m2710d((xaj0) obj);
            }
        }));
        act.duringCreated(CoreModule.c.z2.Z).subscribe(mkd0.G(new e30() { // from class: l.btq
            public final void call(Object obj) {
                this.f10306a.m2711e((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m2713g() {
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m2714h(xaj0<User, Integer, Integer> xaj0Var, boolean z) {
        C0189a c0189aM2709c = m2709c();
        if (c0189aM2709c == null) {
            c0189aM2709c = new C0189a(this.f1998b);
            addView((View) c0189aM2709c.f2001b, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(t100.d(60.0f), t100.d(60.0f)));
            this.f1997a.add(c0189aM2709c);
        }
        C0189a c0189a = c0189aM2709c;
        SimpleDraweeView simpleDraweeView = c0189a.f2001b;
        if (z) {
            xdl0.M(simpleDraweeView, true);
        } else {
            simpleDraweeView.setVisibility(4);
        }
        c0189a.f2001b.setScaleX(1.0f);
        c0189a.f2001b.setScaleY(1.0f);
        c0189a.m2717c((User) xaj0Var.a);
        if (z) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c0189a.m2718d(((Integer) xaj0Var.b).intValue(), ((Integer) xaj0Var.c).intValue(), t100.d(8.0f), t100.d(49.0f), jElapsedRealtime, jElapsedRealtime + 400);
            c0189a.f2002c = 1;
            m2713g();
        }
    }

    public JustRealTransAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1997a = new ArrayList();
        this.f1999c = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
    }

    public JustRealTransAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1997a = new ArrayList();
        this.f1999c = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
    }
}
