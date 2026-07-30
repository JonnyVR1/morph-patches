package com.p046p1.mobile.putong.core.newui.home.justreal;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p149l.djj;
import p149l.e30;
import p149l.ejj;
import p149l.mkd0;
import p149l.qib0;
import p149l.t100;
import p149l.xaj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealTransAvatarLayout extends FrameLayout implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public List<C8025a> f23219a;

    /* JADX INFO: renamed from: b */
    public Context f23220b;

    /* JADX INFO: renamed from: c */
    public PathInterpolator f23221c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealTransAvatarLayout$a */
    public static class C8025a {

        /* JADX INFO: renamed from: a */
        public User f23222a;

        /* JADX INFO: renamed from: b */
        public SimpleDraweeView f23223b;

        /* JADX INFO: renamed from: d */
        public int f23225d;

        /* JADX INFO: renamed from: e */
        public int f23226e;

        /* JADX INFO: renamed from: f */
        public int f23227f;

        /* JADX INFO: renamed from: g */
        public int f23228g;

        /* JADX INFO: renamed from: h */
        public long f23229h;

        /* JADX INFO: renamed from: i */
        public long f23230i;

        /* JADX INFO: renamed from: c */
        public int f23224c = 0;

        /* JADX INFO: renamed from: j */
        public float f23231j = 0.43333f;

        public C8025a(Context context) {
            this.f23223b = new SimpleDraweeView(context);
            ejj ejjVar = new ejj(context.getResources());
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8265s(t100.m186890d(14.0f));
            roundingParams.m8268v(true);
            djj djjVarM116872a = ejjVar.m116870K(roundingParams).m116872a();
            djjVarM116872a.m112078y(0);
            this.f23223b.setHierarchy(djjVarM116872a);
        }

        /* JADX INFO: renamed from: c */
        public void m38731c(User user) {
            this.f23222a = user;
            qib0.f154691G.m102331L0(this.f23223b, user.m60124fp().profileSmall().formatted());
        }

        /* JADX INFO: renamed from: d */
        public void m38732d(int i, int i2, int i3, int i4, long j, long j2) {
            this.f23229h = j;
            this.f23230i = j2;
            this.f23225d = i;
            this.f23227f = i2;
            this.f23226e = i3;
            this.f23228g = i4;
        }
    }

    public JustRealTransAvatarLayout(@NonNull Context context) {
        super(context);
        this.f23219a = new ArrayList();
        this.f23221c = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
    }

    /* JADX INFO: renamed from: c */
    public final C8025a m38723c() {
        for (C8025a c8025a : this.f23219a) {
            if (c8025a.f23224c == 0) {
                return c8025a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m38724d(xaj0 xaj0Var) {
        m38728h(xaj0Var, true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        for (C8025a c8025a : this.f23219a) {
            if (c8025a.f23224c == 1) {
                z = true;
            } else {
                xdl0.m208344M(c8025a.f23223b, false);
            }
        }
        for (C8025a c8025a2 : this.f23219a) {
            if (c8025a2.f23224c == 1) {
                long j2 = c8025a2.f23229h;
                long j3 = c8025a2.f23230i;
                float f = (jElapsedRealtime - j2) / (j3 - j2);
                if (jElapsedRealtime > j3) {
                    c8025a2.f23224c = 0;
                    CoreModule.f17545c.f19704z2.m30237D3(c8025a2.f23222a);
                }
                float fMin = Math.min(1.0f, this.f23221c.getInterpolation(f));
                SimpleDraweeView simpleDraweeView = c8025a2.f23223b;
                int i = c8025a2.f23225d;
                simpleDraweeView.setTranslationX(i + ((c8025a2.f23226e - i) * fMin));
                SimpleDraweeView simpleDraweeView2 = c8025a2.f23223b;
                int i2 = c8025a2.f23227f;
                simpleDraweeView2.setTranslationY(i2 + ((c8025a2.f23228g - i2) * fMin));
                c8025a2.f23223b.setScaleX(1.0f - ((1.0f - c8025a2.f23231j) * fMin));
                c8025a2.f23223b.setScaleY(1.0f - ((1.0f - c8025a2.f23231j) * fMin));
            }
        }
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m38725e(xaj0 xaj0Var) {
        m38728h(xaj0Var, false);
    }

    /* JADX INFO: renamed from: f */
    public void m38726f(Act act) {
        this.f23220b = act;
        act.duringCreated(CoreModule.f17545c.f19704z2.f19220Y).subscribe(mkd0.m154955G(new e30() { // from class: l.atq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71655a.m38724d((xaj0) obj);
            }
        }));
        act.duringCreated(CoreModule.f17545c.f19704z2.f19221Z).subscribe(mkd0.m154955G(new e30() { // from class: l.btq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77255a.m38725e((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m38727g() {
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m38728h(xaj0<User, Integer, Integer> xaj0Var, boolean z) {
        C8025a c8025aM38723c = m38723c();
        if (c8025aM38723c == null) {
            c8025aM38723c = new C8025a(this.f23220b);
            addView(c8025aM38723c.f23223b, new FrameLayout.LayoutParams(t100.m186890d(60.0f), t100.m186890d(60.0f)));
            this.f23219a.add(c8025aM38723c);
        }
        C8025a c8025a = c8025aM38723c;
        SimpleDraweeView simpleDraweeView = c8025a.f23223b;
        if (z) {
            xdl0.m208344M(simpleDraweeView, true);
        } else {
            simpleDraweeView.setVisibility(4);
        }
        c8025a.f23223b.setScaleX(1.0f);
        c8025a.f23223b.setScaleY(1.0f);
        c8025a.m38731c(xaj0Var.f191751a);
        if (z) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c8025a.m38732d(xaj0Var.f191752b.intValue(), xaj0Var.f191753c.intValue(), t100.m186890d(8.0f), t100.m186890d(49.0f), jElapsedRealtime, jElapsedRealtime + 400);
            c8025a.f23224c = 1;
            m38727g();
        }
    }

    public JustRealTransAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23219a = new ArrayList();
        this.f23221c = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
    }

    public JustRealTransAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23219a = new ArrayList();
        this.f23221c = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
    }
}
