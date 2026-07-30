package com.p051p1.mobile.putong.core.newui.home.justreal;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p153l.bkj0;
import p153l.bnl0;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import p153l.wlj;
import p153l.xlj;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealTransAvatarLayout extends FrameLayout implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public List<C8176a> f23961a;

    /* JADX INFO: renamed from: b */
    public Context f23962b;

    /* JADX INFO: renamed from: c */
    public PathInterpolator f23963c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealTransAvatarLayout$a */
    public static class C8176a {

        /* JADX INFO: renamed from: a */
        public User f23964a;

        /* JADX INFO: renamed from: b */
        public SimpleDraweeView f23965b;

        /* JADX INFO: renamed from: d */
        public int f23967d;

        /* JADX INFO: renamed from: e */
        public int f23968e;

        /* JADX INFO: renamed from: f */
        public int f23969f;

        /* JADX INFO: renamed from: g */
        public int f23970g;

        /* JADX INFO: renamed from: h */
        public long f23971h;

        /* JADX INFO: renamed from: i */
        public long f23972i;

        /* JADX INFO: renamed from: c */
        public int f23966c = 0;

        /* JADX INFO: renamed from: j */
        public float f23973j = 0.43333f;

        public C8176a(Context context) {
            this.f23965b = new SimpleDraweeView(context);
            xlj xljVar = new xlj(context.getResources());
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8319s(qa00.m175859d(14.0f));
            roundingParams.m8322v(true);
            wlj wljVarM211638a = xljVar.m211636K(roundingParams).m211638a();
            wljVarM211638a.m207064y(0);
            this.f23965b.setHierarchy(wljVarM211638a);
        }

        /* JADX INFO: renamed from: c */
        public void m39734c(User user) {
            this.f23964a = user;
            uqb0.f180374G.m127115L0(this.f23965b, user.m61308fp().profileSmall().formatted());
        }

        /* JADX INFO: renamed from: d */
        public void m39735d(int i, int i2, int i3, int i4, long j, long j2) {
            this.f23971h = j;
            this.f23972i = j2;
            this.f23967d = i;
            this.f23969f = i2;
            this.f23968e = i3;
            this.f23970g = i4;
        }
    }

    public JustRealTransAvatarLayout(@NonNull Context context) {
        super(context);
        this.f23961a = new ArrayList();
        this.f23963c = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
    }

    /* JADX INFO: renamed from: c */
    public final C8176a m39726c() {
        for (C8176a c8176a : this.f23961a) {
            if (c8176a.f23966c == 0) {
                return c8176a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m39727d(bkj0 bkj0Var) {
        m39731h(bkj0Var, true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        for (C8176a c8176a : this.f23961a) {
            if (c8176a.f23966c == 1) {
                z = true;
            } else {
                bnl0.m105524M(c8176a.f23965b, false);
            }
        }
        for (C8176a c8176a2 : this.f23961a) {
            if (c8176a2.f23966c == 1) {
                long j2 = c8176a2.f23971h;
                long j3 = c8176a2.f23972i;
                float f = (jElapsedRealtime - j2) / (j3 - j2);
                if (jElapsedRealtime > j3) {
                    c8176a2.f23966c = 0;
                    CoreModule.f18264c.f20446z2.m31235D3(c8176a2.f23964a);
                }
                float fMin = Math.min(1.0f, this.f23963c.getInterpolation(f));
                SimpleDraweeView simpleDraweeView = c8176a2.f23965b;
                int i = c8176a2.f23967d;
                simpleDraweeView.setTranslationX(i + ((c8176a2.f23968e - i) * fMin));
                SimpleDraweeView simpleDraweeView2 = c8176a2.f23965b;
                int i2 = c8176a2.f23969f;
                simpleDraweeView2.setTranslationY(i2 + ((c8176a2.f23970g - i2) * fMin));
                c8176a2.f23965b.setScaleX(1.0f - ((1.0f - c8176a2.f23973j) * fMin));
                c8176a2.f23965b.setScaleY(1.0f - ((1.0f - c8176a2.f23973j) * fMin));
            }
        }
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m39728e(bkj0 bkj0Var) {
        m39731h(bkj0Var, false);
    }

    /* JADX INFO: renamed from: f */
    public void m39729f(Act act) {
        this.f23962b = act;
        act.duringCreated(CoreModule.f18264c.f20446z2.f19961Y).subscribe(psd0.m173596G(new y20() { // from class: l.bvq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78619a.m39727d((bkj0) obj);
            }
        }));
        act.duringCreated(CoreModule.f18264c.f20446z2.f19962Z).subscribe(psd0.m173596G(new y20() { // from class: l.cvq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84047a.m39728e((bkj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m39730g() {
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m39731h(bkj0<User, Integer, Integer> bkj0Var, boolean z) {
        C8176a c8176aM39726c = m39726c();
        if (c8176aM39726c == null) {
            c8176aM39726c = new C8176a(this.f23962b);
            addView(c8176aM39726c.f23965b, new FrameLayout.LayoutParams(qa00.m175859d(60.0f), qa00.m175859d(60.0f)));
            this.f23961a.add(c8176aM39726c);
        }
        C8176a c8176a = c8176aM39726c;
        SimpleDraweeView simpleDraweeView = c8176a.f23965b;
        if (z) {
            bnl0.m105524M(simpleDraweeView, true);
        } else {
            simpleDraweeView.setVisibility(4);
        }
        c8176a.f23965b.setScaleX(1.0f);
        c8176a.f23965b.setScaleY(1.0f);
        c8176a.m39734c(bkj0Var.f77081a);
        if (z) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c8176a.m39735d(bkj0Var.f77082b.intValue(), bkj0Var.f77083c.intValue(), qa00.m175859d(8.0f), qa00.m175859d(49.0f), jElapsedRealtime, jElapsedRealtime + 400);
            c8176a.f23966c = 1;
            m39730g();
        }
    }

    public JustRealTransAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23961a = new ArrayList();
        this.f23963c = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
    }

    public JustRealTransAvatarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23961a = new ArrayList();
        this.f23963c = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
    }
}
