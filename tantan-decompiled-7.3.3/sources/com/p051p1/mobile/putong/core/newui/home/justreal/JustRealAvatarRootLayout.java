package com.p051p1.mobile.putong.core.newui.home.justreal;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.jyb;
import p153l.psd0;
import p153l.qa00;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealAvatarRootLayout extends ViewGroup implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public List<C8154a> f23809a;

    /* JADX INFO: renamed from: b */
    public int[] f23810b;

    /* JADX INFO: renamed from: c */
    public PathInterpolator f23811c;

    /* JADX INFO: renamed from: d */
    public y20<Integer> f23812d;

    /* JADX INFO: renamed from: e */
    public int f23813e;

    /* JADX INFO: renamed from: f */
    public y20<User> f23814f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealAvatarRootLayout$a */
    public static class C8154a {

        /* JADX INFO: renamed from: a */
        public JustRealAvatarItem f23815a;

        /* JADX INFO: renamed from: f */
        public int f23820f;

        /* JADX INFO: renamed from: g */
        public int f23821g;

        /* JADX INFO: renamed from: k */
        public long f23825k;

        /* JADX INFO: renamed from: l */
        public long f23826l;

        /* JADX INFO: renamed from: b */
        public float f23816b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f23817c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f23818d = 0.0f;

        /* JADX INFO: renamed from: e */
        public float f23819e = 0.0f;

        /* JADX INFO: renamed from: h */
        public float f23822h = 0.0f;

        /* JADX INFO: renamed from: i */
        public float f23823i = 0.0f;

        /* JADX INFO: renamed from: j */
        public float f23824j = 0.0f;

        public C8154a(Context context) {
            this.f23815a = new JustRealAvatarItem(context);
        }

        /* JADX INFO: renamed from: a */
        public void m39644a() {
            this.f23823i = this.f23822h;
            this.f23818d = this.f23816b;
        }

        /* JADX INFO: renamed from: b */
        public void m39645b() {
            this.f23822h = 1.0f;
            this.f23816b = 0.0f;
            this.f23817c = 0.0f;
        }

        /* JADX INFO: renamed from: c */
        public void m39646c() {
            this.f23824j = 1.0f;
            this.f23819e = this.f23821g * qa00.m175859d(16.0f);
            m39644a();
            long jElapsedRealtime = SystemClock.elapsedRealtime() + (((long) this.f23821g) * 20);
            this.f23825k = jElapsedRealtime;
            this.f23826l = jElapsedRealtime + 300;
        }

        /* JADX INFO: renamed from: d */
        public void m39647d(float f, float f2) {
            float f3 = this.f23823i;
            this.f23822h = Math.min(1.0f, Math.max(0.0f, f3 + ((this.f23824j - f3) * f2 * 1.5f)));
            float f4 = this.f23818d;
            float f5 = this.f23819e;
            this.f23816b = ((f5 - f4) * f) + f4;
            this.f23817c = f4 + ((f5 - f4) * f2);
        }
    }

    public JustRealAvatarRootLayout(@NonNull Context context) {
        super(context);
        this.f23810b = new int[]{-65536, -16711936, -16776961, -256};
        this.f23813e = qa00.m175859d(28.0f);
        m39639d();
    }

    /* JADX INFO: renamed from: c */
    public final void m39638c(User user, boolean z) {
        C8154a next;
        Iterator<C8154a> it = this.f23809a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.f23821g >= 0);
        if (next == null) {
            return;
        }
        next.f23821g = 0;
        next.m39645b();
        next.m39646c();
        next.f23820f = this.f23809a.size() - 1;
        next.f23815a.m39635b(user);
        if (NullChecker.m82486a(this.f23814f)) {
            this.f23814f.call(user);
        }
        for (C8154a c8154a : this.f23809a) {
            if (c8154a != next && c8154a.f23821g >= 0) {
                c8154a.f23820f = ((this.f23809a.size() + c8154a.f23820f) - 1) % this.f23809a.size();
                c8154a.f23821g++;
                c8154a.m39646c();
                if (c8154a.f23821g == this.f23809a.size() - 1) {
                    c8154a.f23824j = 0.0f;
                }
            }
        }
        if (!z) {
            next.m39647d(1.0f, 1.0f);
        } else {
            m39643h();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m39639d() {
        this.f23811c = new PathInterpolator(0.8f, 0.52f, 0.63f, 1.31f);
        this.f23809a = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C8154a c8154a = new C8154a(getContext());
            c8154a.f23820f = 3 - i;
            c8154a.f23821g = -1;
            c8154a.f23822h = 0.0f;
            this.f23809a.add(c8154a);
            JustRealAvatarItem justRealAvatarItem = c8154a.f23815a;
            int i2 = this.f23813e;
            addView(justRealAvatarItem, new ViewGroup.LayoutParams(i2, i2));
            c8154a.f23815a.setElevation(0.0f);
            c8154a.f23815a.setAlpha(1.0f);
        }
        setLayerType(0, null);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        for (C8154a c8154a : this.f23809a) {
            if (c8154a.f23821g >= 0 && jElapsedRealtime >= c8154a.f23825k) {
                long jMin = Math.min(c8154a.f23826l, jElapsedRealtime);
                long j2 = c8154a.f23825k;
                float f = (jMin - j2) / (c8154a.f23826l - j2);
                c8154a.m39647d(this.f23811c.getInterpolation(f), f);
                if (jElapsedRealtime < c8154a.f23826l) {
                    z = true;
                }
            }
        }
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        }
        for (C8154a c8154a2 : this.f23809a) {
            if (c8154a2.f23821g == this.f23809a.size() - 1 && jElapsedRealtime >= c8154a2.f23826l) {
                c8154a2.f23821g = -1;
                c8154a2.f23822h = 0.0f;
            }
        }
        m39643h();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m39640e(User user) {
        m39638c(user, true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m39641f(uxj0 uxj0Var) {
        if (jyb.m147479J(this.f23809a)) {
            return;
        }
        for (int i = 0; i < this.f23809a.size(); i++) {
            C8154a c8154a = this.f23809a.get(i);
            c8154a.f23820f = 3 - i;
            c8154a.f23821g = -1;
            c8154a.f23822h = 0.0f;
            c8154a.f23815a.setElevation(0.0f);
            c8154a.f23815a.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m39642g(Act act) {
        act.duringCreated(CoreModule.f18264c.f20446z2.m31256u3()).subscribe(psd0.m173596G(new y20() { // from class: l.zsq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205889a.m39640e((User) obj);
            }
        }));
        act.duringCreated(CoreModule.f18264c.f20446z2.f19957U).subscribe(psd0.m173596G(new y20() { // from class: l.atq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73374a.m39641f((uxj0) obj);
            }
        }));
        ArrayList arrayList = new ArrayList();
        List<CoreJustVerificationCardApi.C4869a> listM31247l3 = CoreModule.f18264c.f20446z2.m31247l3();
        if (jyb.m147479J(listM31247l3)) {
            return;
        }
        int iMin = Math.min(3, listM31247l3.size());
        for (int i = 0; i < iMin; i++) {
            arrayList.add(0, listM31247l3.get((listM31247l3.size() - 1) - i).f19973a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m39638c((User) it.next(), true);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f23809a.get(i2).f23820f;
        int i4 = 0;
        while (true) {
            int size = this.f23809a.size();
            List<C8154a> list = this.f23809a;
            if (i4 >= size) {
                return list.get(i2).f23820f;
            }
            if (list.get(i4).f23820f == i2) {
                return i4;
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m39643h() {
        float fMax = 0.0f;
        for (C8154a c8154a : this.f23809a) {
            int i = c8154a.f23821g;
            JustRealAvatarItem justRealAvatarItem = c8154a.f23815a;
            if (i >= 0) {
                justRealAvatarItem.setAlpha(c8154a.f23822h);
                c8154a.f23815a.setTranslationX(c8154a.f23816b);
                if (c8154a.f23821g < this.f23809a.size() - 1) {
                    fMax = Math.max(c8154a.f23817c, fMax);
                }
                if (c8154a.f23821g == this.f23809a.size() - 1) {
                    fMax = Math.max(c8154a.f23818d, fMax);
                }
            } else {
                justRealAvatarItem.setAlpha(0.0f);
            }
        }
        invalidate();
        requestLayout();
        if (NullChecker.m82486a(this.f23812d)) {
            this.f23812d.call(Integer.valueOf((int) fMax));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int size = this.f23809a.size();
        for (int i5 = 0; i5 < size; i5++) {
            JustRealAvatarItem justRealAvatarItem = this.f23809a.get(i5).f23815a;
            int i6 = this.f23813e;
            justRealAvatarItem.layout(0, 0, i6, i6);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = this.f23809a.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f23809a.get(i3).f23815a.measure(View.MeasureSpec.makeMeasureSpec(this.f23813e, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23813e, 1073741824));
        }
    }

    public void setRenderUserCall(y20<User> y20Var) {
        this.f23814f = y20Var;
    }

    public void setTitleTransCall(y20<Integer> y20Var) {
        this.f23812d = y20Var;
    }

    public JustRealAvatarRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23810b = new int[]{-65536, -16711936, -16776961, -256};
        this.f23813e = qa00.m175859d(28.0f);
        m39639d();
    }

    public JustRealAvatarRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23810b = new int[]{-65536, -16711936, -16776961, -256};
        this.f23813e = qa00.m175859d(28.0f);
        m39639d();
    }
}
